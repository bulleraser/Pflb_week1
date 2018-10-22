package com.pflb.weekend1;

public class MailMessage implements Sendable<String> {
    private String from;
    private String to;
    private String content;

    public MailMessage(String from, String to, String message) {
        this.from = from;
        this.to = to;
        this.content = message;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getContent() {
        return content;
    }
}
