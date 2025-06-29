package com.example;

public class NotificationService {
    private Notifier notifier;

    public NotificationService(Notifier notifier) {
        this.notifier = notifier;
    }

    public String notifyUser(String message) {
        return notifier.send(message);
    }
}
