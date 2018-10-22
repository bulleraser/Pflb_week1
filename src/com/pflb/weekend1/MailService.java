package com.pflb.weekend1;

import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    private Map<String, List<T>> mailBox = new HashMap<String, List<T>>() {
        @Override
        public List<T> get(Object key) {
            return super.getOrDefault(key, new LinkedList<>());
        }
    };

    @Override
    public void accept(Sendable<T> message) {
        mailBox.put(message.getTo(), Arrays.asList(message.getContent()));
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }
}
