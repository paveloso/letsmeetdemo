package com.letsmeetdemo.Service;

import com.letsmeetdemo.Entity.Event;

import java.util.List;

public interface EventService {

    public List<Event> getEvents();

    public void saveEvent(Event theEvent);
}
