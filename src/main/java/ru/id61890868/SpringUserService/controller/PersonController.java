package ru.id61890868.SpringUserService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.id61890868.SpringUserService.service.PersonService;
import ru.id61890868.SpringUserService.view.person.PersonView;
import ru.id61890868.SpringUserService.view.response.DataView;
import ru.id61890868.SpringUserService.view.response.ResultView;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/api/person", produces = APPLICATION_JSON_VALUE)
public class PersonController {

    private PersonService service;

    @Autowired
    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping("/save")
    public ResultView save(@RequestBody PersonView o) throws Exception{
        return service.add(o);
    }

    @DeleteMapping("/id{id:[\\d]+}")
    public ResultView delete(@PathVariable("id") Integer id) throws Exception{
        return service.delete(id);
    }

    @GetMapping("/{email:.+}")
    public DataView<List<PersonView>> getByEmail(@PathVariable("email")String email) throws Exception{
        return service.getByEmail(email);
    }

    @GetMapping("/id{id:[\\d]+}")
    DataView<PersonView> getById(@PathVariable("id") Integer id) throws Exception{
        return service.getById(id);
    }
}
