package com.example.demo1project4;

public class Interval<T extends Comparable<T>> {
    private final T first;
    private final T second;

    // Constructor
    public Interval(T start, T second) {
        if (start.compareTo(second) > 0) {
            throw new IllegalArgumentException("Start must not be after end.");
        }
        this.first = start;
        this.second = second;
    }

    // Returns true if value is within the interval (inclusive)
    public boolean within(T value) {
        return value.compareTo(first) >= 0 && value.compareTo(second) <= 0;
    }

    // Returns true if the given interval is completely within this interval
    public boolean crossOver(Interval<T> other) {
        return this.first.compareTo(other.first) <= 0 && this.second.compareTo(other.second) >= 0;
    }

    // Returns true if the intervals overlap at all
    public boolean overlaps(Interval<T> other) {
        return this.first.compareTo(other.second) <= 0 && this.second.compareTo(other.first) >= 0;
    }

    // Optional: Getters if needed for display/debug
    public T getStart() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "[" + first + " to " + second + "]";
    }
}
