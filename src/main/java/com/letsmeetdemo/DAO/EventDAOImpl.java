package com.letsmeetdemo.DAO;

import com.letsmeetdemo.Entity.Event;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EventDAOImpl implements EventDAO {

    // need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Event> getEvents() {

        // get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create the query
        Query<Event> theQuery = currentSession.createQuery("from Event", Event.class);

        // get a list of events from query
        List<Event> events = theQuery.getResultList();

        // return the results
        return events;
    }

    public void saveEvent(Event theEvent) {

        Session currentSession = sessionFactory.getCurrentSession();

        currentSession.save(theEvent);

    }
}
