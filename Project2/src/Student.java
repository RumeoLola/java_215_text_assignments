// Tayo Omolola
// 04/08/2025

public class Student {
    public String name;
    public int credit;
    public int points;
    private static double gpaThreshold;

    // initializing constructor for variables name, credit and points
    public Student(String name, int credit, int points) {
        this.name = name;
        this.credit = credit;
        this.points = points;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    // gpa quotient of points and credit hours
    public double gpa()   {
        if (credit == 0)
            return 0.0;
        else
            return (double) points /credit;

    }

    public boolean eligibleForHonorSociety()    {
        return gpa() > gpaThreshold;
    }

    public String toString()    {
        return "Name: " + name + ", GPA " + String.format("%.2f", gpa());
    }

    public static void setGpaThreshold(double threshold) {
        gpaThreshold = threshold;
    }

    public static double getGpaThreshold() {
        return gpaThreshold;
    }
}

class Undergraduate extends Student {
    public String year;

    public Undergraduate(String name, int credit, int points, String year)    {
        super(name, credit, points);
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public boolean eligibleForHonorSociety()   {
        return super.eligibleForHonorSociety() && (year.equals("junior") || year.equals("senior"));
    }

    @Override
    public String toString()    {
        return super.toString() + " year " + year;
    }
}

class Graduate extends Student  {
    public String degree;
    public Graduate(String name, int credit, int points, String degree)   {
        super(name, credit, points);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    @Override
    public boolean eligibleForHonorSociety()    {
        return super.eligibleForHonorSociety() && degree.equalsIgnoreCase("Masters");
    }

    @Override
    public String toString()    {
        return super.toString() + " " + degree.toUpperCase();
    }
}
