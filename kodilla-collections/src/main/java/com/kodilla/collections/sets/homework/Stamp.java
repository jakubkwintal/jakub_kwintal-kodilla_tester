package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String stampSize;
    private boolean stamped;

    public Stamp(String stampName, String stampSize, boolean stamped) {
        this.stampName = stampName;
        this.stampSize = stampSize;
        this.stamped = stamped;
    }

    public String getStampName() {
        return stampName;
    }

    public String getStampSize() {
        return stampSize;
    }

    public boolean getStamped() {
        return stamped;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(stampSize, stamp.stampSize) &&
                Objects.equals(stamped, stamp.stamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampSize, stamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampSize='" + stampSize + '\'' +
                ", stamped='" + stamped + '\'' +
                '}';
    }
}
