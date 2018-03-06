package com.letsmeetdemo.Controller;

import com.letsmeetdemo.DAO.EventDAO;
import com.letsmeetdemo.Entity.Event;
import com.letsmeetdemo.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/event")
public class EventController {

    // need to inject the event DAO
    @Autowired
    private EventService eventService;

    @RequestMapping("/list")
    public String listEvents(Model theModel) {

        // get the event from dao
        List<Event> theEvents = eventService.getEvents();

        // add the event to the model
        theModel.addAttribute("events", theEvents);

        return "list-events";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        Event theEvent = new Event();

        theModel.addAttribute("event", theEvent);

        return "event-form";

    }

    @PostMapping("/saveEvent")
    public String saveEvent(@ModelAttribute("event") Event theEvent) {

        eventService.saveEvent(theEvent);

        return "redirect:/event/list";
    }
}
