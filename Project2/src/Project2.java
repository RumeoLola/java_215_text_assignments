// Tayo Omolola
// 04/08/2025

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        double totalGPA = 0.0;

        try {
            File myFileObject = new File("students.txt");
            Scanner scanner = new Scanner(myFileObject);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) continue; // skip empty lines

                String[] divider = line.split(" ");
                if (divider.length < 4) continue; // skip bad lines

                String name = divider[0];
                int credit = Integer.parseInt(divider[1]);
                int points = Integer.parseInt(divider[2]);
                String level = divider[3]; // degree or year

                Student student;

                if (level.equalsIgnoreCase("Freshman") ||
                        level.equalsIgnoreCase("Sophomore") ||
                        level.equalsIgnoreCase("Junior") ||
                        level.equalsIgnoreCase("Senior")) {
                    student = new Undergraduate(name, credit, points, level);
                } else {
                    student = new Graduate(name, credit, points, level);
                }

                students.add(student);
                totalGPA += student.gpa();
            }
            scanner.close();

            double gpaThreshold = ((totalGPA / students.size()) + 4.0) / 2.0;
            Student.setGpaThreshold(gpaThreshold);

            System.out.printf("GPA threshold for membership is %.2f\n", gpaThreshold);
            for (Student student : students) {
                if (student.eligibleForHonorSociety()) {
                    System.out.println(student);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: students.txt");
        }
    }
}
