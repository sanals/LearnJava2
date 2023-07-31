/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.immutable.classes.failed;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sanal.s
 */
public final class ImmutableExample {

    private final String stringValue;
    private final Date dateValue;
    private final Map<String, Student> mapValue;

    public ImmutableExample(String stringValue, Date dateValue, Map<String, Student> mapValue) {
        this.stringValue = stringValue;
        this.dateValue = new Date(dateValue.getTime());
        Map<String, Student> tempMap = new HashMap<>();
        for (Map.Entry<String, Student> entry : mapValue.entrySet()) {
            Student student = entry.getValue();
            tempMap.put(entry.getKey(), new Student(student.getName(), student.getAge(), student.getSubject()));
        }
        this.mapValue = tempMap;
    }

    public String getStringValue() {
        return stringValue;
    }

    public Date getDateValue() {
        return new Date(dateValue.getTime());
    }

    public Map<String, Student> getMapValue() {
        Map<String, Student> tempMap = new HashMap<>();
        for (Map.Entry<String, Student> entry : mapValue.entrySet()) {
            Student student = entry.getValue();
            tempMap.put(entry.getKey(), new Student(student.getName(), student.getAge(), student.getSubject()));
        }
        return tempMap;
    }
}