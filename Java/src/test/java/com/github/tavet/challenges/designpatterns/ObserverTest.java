package com.github.tavet.challenges.designpatterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
https://www.baeldung.com/java-observer-pattern
 */
public class ObserverTest {
    Observer observer;

    @BeforeEach
    void setUp() {
        observer = new Observer();
    }

    @Test
    void testCase1() {
        Observer.StorePublisher publisher = new Observer.StorePublisher();
        Observer.StoreSubscriber subscriber1 = new Observer.StoreSubscriber();
        Observer.StoreSubscriber subscriber2 = new Observer.StoreSubscriber();

        // Subscribe 1 and 2
        publisher.subscribe(subscriber1);
        publisher.subscribe(subscriber2);

        // Assert messages are null
        assertNull(subscriber1.getMessage());
        assertNull(subscriber2.getMessage());

        // Unsubscribe 1 and Notify subscribers
        publisher.unsubscribe(subscriber1);
        publisher.notifySubscribers("Dxon Avenue, Antioquia");

        // Assert Subscribers were notified
        assertEquals("Dxon Avenue, Antioquia", subscriber2.getMessage());
        assertNull(subscriber1.getMessage());

    }
}
