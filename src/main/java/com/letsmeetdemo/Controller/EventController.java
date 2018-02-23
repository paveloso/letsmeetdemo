package com.letsmeetdemo.Controller;

import com.letsmeetdemo.DAO.EventDAO;
import com.letsmeetdemo.Entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/event")
public class EventController {

    // need to inject the event DAO
    @Autowired
    private EventDAO eventDAO;

    @RequestMapping("/list")
    public String listEvents(Model theModel) {

        // get the event from dao
        List<Event> theEvents = eventDAO.getEvents();

        // add the event to the model
        theModel.addAttribute("events", theEvents);

        return "list-events";
    }
}
