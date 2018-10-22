package com.pflb.weekend1;

public interface Sendable<T> {
    String getFrom();
    String getTo();
    T getContent();
}
