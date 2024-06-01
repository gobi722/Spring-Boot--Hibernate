package com.example.adminservice.Config;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Condition {
    public String column;
    public String operator;
    public Object value;  // Changed to Object to handle both String and Subquery
    
    public Condition() {
        // Default constructor
    }

    public Condition(String column, Object value) {
        this.column = column;
        this.value = value;
    }

    public String getField() {
        return column;
    }

    public void setField(String field) {
        this.column = field;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "Condition{" +
                "column='" + column + '\'' +
                ", operator='" + operator + '\'' +
                ", value=" + value +
                '}';
    }
}
