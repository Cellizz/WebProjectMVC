package com.github.cellizz.webprojectmvc.controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cellix
 */


import com.github.cellizz.webprojectmvc.model.Person;
import com.github.cellizz.webprojectmvc.model.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @Autowired
    PersonRepository personRepository;
    @RequestMapping("/personslist")
    public ModelAndView getPersons() {
        Iterable<Person> findAll = personRepository.findAll();
        return new ModelAndView("personlist", "persons", findAll);
    }

}



/*

import com.github.cellizz.webprojectmvc.model.Person;
import com.github.cellizz.webprojectmvc.model.PersonRepository;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class PersonController {

    private static final String SEARCH_VIEW_KEY = "redirect:search.html";
    private static final String SEARCH_MODEL_KEY = "persons";

    private final PersonRepository repository;
//    @Autowired
//    PersonRepository repository;
    @Autowired
    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    /**
     * For every request for this controller, this will 
     * create a person instance for the form.
     *//*
    @ModelAttribute
    public Person newRequest(@RequestParam(required=false) Integer id) {
        return (id != null ? repository.findOne(id) : new Person());
    }

    /**
     * <p>Person form request.</p>
     * 
     * <p>Expected HTTP GET and request '/person/form'.</p>
     *//*
    @RequestMapping(value="/person/form", method=RequestMethod.GET)
    public void form() {}
    
    /**
     * <p>Saves a person.</p>
     * 
     * <p>Expected HTTP POST and request '/person/form'.</p>
     *//*
    @RequestMapping(value="/person/form", method=RequestMethod.POST)
    public Person form(Person person, Model model) {
        if (person.getName() == null) {
            person.setName("New Name");
        }

        Person result = repository.save(person);
        
        model.addAttribute("statusMessageKey", "person.form.msg.success");
        
        return result;
    }

    /**
     * <p>Deletes a person.</p>
     * 
     * <p>Expected HTTP POST and request '/person/delete'.</p>
     *//*
    @RequestMapping(value="/person/delete", method=RequestMethod.POST)
    public String delete(Person person) {
        repository.delete(person);

        return SEARCH_VIEW_KEY;
    }

    /**
     * <p>Searches for all persons and returns them in a 
     * <code>Collection</code>.</p>
     * 
     * <p>Expected HTTP GET and request '/person/search'.</p>
     *//*
    @RequestMapping(value="/person/search", method=RequestMethod.GET)
    public @ModelAttribute(SEARCH_MODEL_KEY) Iterable<Person> search() {
        return repository.findAll();
    }

} -----------------------------------------------------------------------JSP */