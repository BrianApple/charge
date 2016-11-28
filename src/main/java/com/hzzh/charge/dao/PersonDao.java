package com.hzzh.charge.dao;
import com.hzzh.charge.model.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface PersonDao {
    public List<Person> getAll() throws Exception;
    public Person getLogin(@Param("loginId") String loginId,@Param("pwd") String pwd) throws Exception;
    public int editPhone(Person person) throws Exception;
    public int editPass(@Param("guid") String guid,@Param("oldPass") String oldPass,@Param("newPass") String newPass) throws Exception;
    public int editPassword(@Param("guid") String guid,@Param("password") String password) throws Exception;
    public List<Person> getByCompanyIDAndRoleID(@Param("companyId") String companyId,@Param("roleId") String roleId) throws Exception;
    public List<Person> getByCompanyIDWithoutAdmin(@Param("companyId") String companyId) throws Exception;

    public int addPerson(Person person) throws Exception;
    public int editPerson(Person person) throws Exception;
    public int deletePerson(@Param("guid") String guid) throws Exception;
}
