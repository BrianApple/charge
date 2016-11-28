package com.hzzh.charge.service;

import com.hzzh.charge.model.Person;


import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface PersonService {
    List<Person> getAll() throws Exception;
    Person getLogin(String loginId,  String pwd) throws Exception;
    int editPhone(Person person) throws Exception;
    int editPass(String guid,String oldPass,String newPass) throws Exception;
    List<Person> getByCompanyIDAndRoleID(String companyId,String roleId) throws Exception;
    List<Person> getByCompanyIDWithoutAdmin(String companyId) throws Exception;
    int addPerson(Person person) throws Exception;
    int editPerson(Person person) throws Exception;
    int editPassword(String guid,String password) throws Exception;
    int deletePerson(String guid) throws Exception;
}
