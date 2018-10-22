package com.pflb.weekend1;

public class Salary implements Sendable<Integer> {
    private String from;
    private String to;
    private Integer content;

    public Salary(String from, String to, Integer salary) {
        this.from = from;
        this.to = to;
        this.content = salary;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public Integer getContent() {
        return content;
    }
}
