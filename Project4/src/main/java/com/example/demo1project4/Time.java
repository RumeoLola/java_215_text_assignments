package com.example.demo1project4;

/**
 * Author: Tayo Omolola
 * Project: Project4 - Time Interval Comparison
 * Description: Immutable Time class that supports comparison and formatted string parsing.
 */

public class Time implements Comparable<Time> {
    private final int hour;
    private final int minute;
    private final String meridian;

    // Constructor with integers
    public Time(int hour, int minute, String meridian) throws InvalidTime {
        if (hour < 1 || hour > 12)
            throw new InvalidTime("Hour must be between 1 and 12.");
        if (minute < 0 || minute > 59)
            throw new InvalidTime("Minute must be between 0 and 59.");
        if (!meridian.equals("AM") && !meridian.equals("PM"))
            throw new InvalidTime("Meridian must be either AM or PM.");

        this.hour = hour;
        this.minute = minute;
        this.meridian = meridian;
    }

    // Constructor with string (e.g., "02:30 PM")
    public Time(String timeStr) throws InvalidTime {
        if (timeStr == null || !timeStr.matches("\\d{1,2}:\\d{2} (AM|PM)")) {
            throw new InvalidTime("Time format must be HH:MM AM or PM.");
        }

        String[] parts = timeStr.split(" ");
        String[] timeParts = parts[0].split(":");

        try {
            int h = Integer.parseInt(timeParts[0]);
            int m = Integer.parseInt(timeParts[1]);
            String mer = parts[1];
            if (!mer.equals("AM") && !mer.equals("PM")) {
                throw new InvalidTime("Invalid meridian: must be AM or PM.");
            }
            // Reuse the other constructor for validation
            this.hour = h;
            this.minute = m;
            this.meridian = mer;
        } catch (NumberFormatException e) {
            throw new InvalidTime("Hour and minute must be numeric.");
        }
    }

    public int compareTo(Time other) {
        int firstTotal = CheckHour(this.hour, this.minute, this.meridian);
        int secondTotal = CheckHour(other.hour, other.minute, other.meridian);
        return Integer.compare(firstTotal, secondTotal);
    }

    private int CheckHour(int h, int m, String mer) {
        if (mer.equals("AM")) {
            if (h == 12) h = 0;
        } else { // PM
            if (h != 12) h += 12;
        }
        return h * 60 + m;
    }

    // toString in HH:MM AM format
    @Override
    public String toString() {
        return String.format("%02d:%02d %s", hour, minute, meridian);
    }

    // Optionally, add getters if needed (read-only)
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getMeridian() {
        return meridian;
    }
}
