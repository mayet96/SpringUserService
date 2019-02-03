package ru.id61890868.SpringUserService.service;

import ru.id61890868.SpringUserService.mapper.MapperFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.id61890868.SpringUserService.dao.PersonDao;
import ru.id61890868.SpringUserService.model.Person;
import ru.id61890868.SpringUserService.view.person.PersonView;
import ru.id61890868.SpringUserService.view.response.DataView;
import ru.id61890868.SpringUserService.view.response.ResultView;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PersoneServiceImpl implements PersonService {

    private MapperFacade mapper;
    private PersonDao dao;

    @Autowired
    public PersoneServiceImpl(MapperFacade mapper, PersonDao dao) {
        this.mapper = mapper;
        this.dao = dao;
    }

    public PersoneServiceImpl() {
    }

    @Transactional
    @Override
    public ResultView add(PersonView o) throws Exception {
        dao.add(mapper.map(o, Person.class));
        return new ResultView("Ok");
    }

    @Transactional
    @Override
    public ResultView delete(Integer id) throws Exception {
        dao.delete(id);
        return new ResultView("Ok");
    }

    @Transactional
    @Override
    public DataView<List<PersonView>> getByEmail(String email) throws Exception {
        return new DataView<List<PersonView>>(mapper.mapAsList(dao.getByEmail(email), PersonView.class));
    }

    @Transactional
    @Override
    public DataView<PersonView> getById(Integer id) throws Exception {
        return new DataView<>(mapper.map(dao.getById(id), PersonView.class));
    }
}
