package ru.id61890868.SpringUserService.service;

import ru.id61890868.SpringUserService.view.person.PersonView;
import ru.id61890868.SpringUserService.view.response.DataView;
import ru.id61890868.SpringUserService.view.response.ResultView;

import java.util.List;

public interface PersonService {


    ResultView add(PersonView o) throws Exception;

    ResultView delete(Integer id) throws Exception;

    DataView<List<PersonView>> getByEmail(String email) throws Exception;

    DataView<PersonView> getById(Integer id) throws Exception;
}
