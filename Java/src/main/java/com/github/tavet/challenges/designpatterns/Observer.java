package com.github.tavet.challenges.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    interface Subscriber {
        void update(Object o);
    }

    // Observable
    static class StorePublisher {
        private String message;
        private List<Subscriber> subscribers = new ArrayList<>();

        public void subscribe(Subscriber s) {
            subscribers.add(s);
        }

        public void unsubscribe(Subscriber s) {
            subscribers.remove(s);
        }

        public void notifySubscribers(String message) {
            this.message = message;
            subscribers.forEach(s -> s.update(this.message));
        }
    }

    // Observer
    static class StoreSubscriber implements Subscriber {
        private String message;

        @Override
        public void update(Object o) {
            this.message = (String) o;
        }

        public String getMessage() {
            return this.message;
        }
    }
}
