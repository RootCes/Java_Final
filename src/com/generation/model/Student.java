package com.generation.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student
    extends Person
    implements Evaluation
{
    private double average;

    private final List<Course> courses = new ArrayList<>();

    private final Map<String, Course> approvedCourses = new HashMap<>();

    public Student( String id, String name, String email, Date birthDate )
    {
        super( id, name, email, birthDate );
    }

    public void enrollToCourse( Course course )
    {
           courses.add(course); //simply adding the course to the course array.
        //TODO implement this method
    }

    public void registerApprovedCourse( Course course )
    {
        approvedCourses.put( course.getCode(), course );
    }

    // returns true if this student is attending the course specified by the argument courseCode
    // boolean isAttendingCourse = new Boolean;  // original attempt
    public boolean isAttendingCourse( String courseCode )

    {
        //TODO implement this method
        for (Course c : courses){
            if (c.getCode().equals(courseCode)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getAverage()
    {
        return average;
    }

    @Override
    public String toString()
    {
        return "Student {" + super.toString() + "}";
    }
}


// I can understand all of this I just get so lost as soon as it comes time to actually code it. I need more time.