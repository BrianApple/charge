package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.PersonDao;
import com.hzzh.charge.model.Person;
import com.hzzh.charge.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@Service("PersonService")
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonDao personDao;
    @Override
    public List<Person> getAll() throws Exception {
        return personDao.getAll();
    }

    @Override
    public Person getLogin(String loginId, String pwd) throws Exception {
        return personDao.getLogin(loginId,pwd);
    }
    @Override
    public int editPhone(Person person) throws Exception{
        return personDao.editPhone(person);
    }
    @Override
    public int editPass(String guid,String oldPass,String newPass) throws Exception{
        return personDao.editPass(guid,oldPass,newPass);
    }
    @Override
    public int editPassword(String guid,String password) throws Exception{
        return personDao.editPassword(guid,password);
    }
    @Override
    public List<Person> getByCompanyIDAndRoleID(String companyId,String roleId) throws Exception{
        return personDao.getByCompanyIDAndRoleID(companyId,roleId);
    }
    @Override
    public List<Person> getByCompanyIDWithoutAdmin(String companyId) throws Exception{
        return personDao.getByCompanyIDWithoutAdmin(companyId);
    }
    @Override
    public int addPerson(Person person) throws Exception{
        return personDao.addPerson(person);
    }
    @Override
    public int editPerson(Person person) throws Exception{
        return personDao.editPerson(person);
    }
    @Override
    public int deletePerson(String guid) throws Exception{
        return personDao.deletePerson(guid);
    }
}