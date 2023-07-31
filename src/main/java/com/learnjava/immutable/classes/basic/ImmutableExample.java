/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.learnjava.immutable.classes.basic;

/**
 *
 * @author sanal.s
 */
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class ImmutableExample {
    private final String stringValue;
    private final Date dateValue;
    private final Map<String, String> mapValue;

    public ImmutableExample(String stringValue, Date dateValue, Map<String, String> mapValue) {
        this.stringValue = stringValue;
        this.dateValue = new Date(dateValue.getTime());
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : mapValue.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.mapValue = tempMap;
    }

    public String getStringValue() {
        return stringValue;
    }

    public Date getDateValue() {
        return new Date(dateValue.getTime());
    }

    public Map<String, String> getMapValue() {
        Map<String, String> tempMap = new HashMap<>();
        for (Map.Entry<String, String> entry : mapValue.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}

