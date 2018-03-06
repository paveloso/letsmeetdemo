package com.letsmeetdemo.Service;

import com.letsmeetdemo.DAO.EventDAO;
import com.letsmeetdemo.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventDAO eventDAO;

    @Transactional
    public List<Event> getEvents() {
        return eventDAO.getEvents();
    }

    @Transactional
    public void saveEvent(Event theEvent) {

        eventDAO.saveEvent(theEvent);

    }
}
