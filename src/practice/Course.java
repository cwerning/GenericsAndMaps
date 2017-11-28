/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Objects;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 *
 * @author cwerning
 */
public class Course implements Comparable<Course> {

    private int courseNumber;
    private String courseName;
    private double credits;

    public Course(int courseNumber, String courseName, double credits) {
        this.courseNumber = courseNumber;
        this.courseName = courseName;
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Course{" + "courseNumber=" + courseNumber + ", courseName=" + courseName + ", credits=" + credits + '}';
    }
    
    @Override
    public int compareTo(Course target) {
        return new CompareToBuilder()
                .append(this.courseNumber, target.courseNumber)
                .toComparison();
    }
    
//    @Override
//    public int compareTo(Course target) {
//        return this.getCourseNumber().compareTo(target.getCourseNumber());
//    }
    

//    @Override
//    public int compareTo(Course target) {
//        final int LESSTHAN = -1;
//        final int GREATERTHAN = 1;
//        final int EQUAL = 0;
//
//        int result = EQUAL; // sentinel value
//
//        if (this.getCourseNumber() < target.getCourseNumber()) {
//            result = LESSTHAN;
//        } else if (this.getCourseNumber() < target.getCourseNumber()) {
//            result = GREATERTHAN;
//        } else {
//            result = EQUAL;
//        }
//        return result;
//    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + Objects.hashCode(this.courseName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Course other = (Course) obj;
        if (!Objects.equals(this.courseName, other.courseName)) {
            return false;
        }
        return true;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

}
