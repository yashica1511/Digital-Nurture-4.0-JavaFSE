package com.example;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class NotificationTest {

    @Test
    public void testNotificationSent() {
        Notifier mockNotifier = mock(Notifier.class);

        when(mockNotifier.send("Hello!")).thenReturn("Message sent");

        NotificationService service = new NotificationService(mockNotifier);

        String result = service.notifyUser("Hello!");

        assert result.equals("Message sent");

        verify(mockNotifier).send("Hello!");
    }
}
