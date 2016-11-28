package com.hzzh.charge.controller;
import com.hzzh.charge.model.LoginInfo;
import com.hzzh.charge.model.Menu;
import com.hzzh.charge.model.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Map;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private com.hzzh.charge.service.PersonService personService;
    @Autowired
    private com.hzzh.charge.service.MenuService menuService;
    @RequestMapping(value = "/all",method=RequestMethod.POST)
    @ResponseBody
    public List<com.hzzh.charge.model.Person> findAll() throws Exception {
        List<com.hzzh.charge.model.Person> list = personService.getAll();
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list;
    }

    @RequestMapping(value = "/login",method=RequestMethod.POST)
    @ResponseBody
    public LoginInfo getLogin(@RequestBody com.hzzh.charge.model.Person person) throws Exception {
        LoginInfo info = new com.hzzh.charge.model.LoginInfo();
        String loginId = person.getLoginId();
        String pwd = person.getPasswd();
        person = personService.getLogin(loginId,pwd);
        info.setPerson(person);
        if(person!=null){
            List<Menu> menus = menuService.getMenus(person.getGuid());
            info.setMenus(menus);
        }
        return info;
    }
    @RequestMapping(value = "/editPhone",method=RequestMethod.POST)
    @ResponseBody
    public int editPhone(@RequestBody Person person) throws Exception {
        return personService.editPhone(person);
    }

    @RequestMapping(value = "/editPass",method=RequestMethod.POST)
    @ResponseBody
    public int editPass(@RequestBody Map<String,Object> parms) throws Exception {
        return personService.editPass(parms.get("guid").toString(),parms.get("oldPass").toString(),parms.get("newPass").toString());
    }
    @RequestMapping(value = "/editPassword",method=RequestMethod.POST)
    @ResponseBody
    public int editPassword(@RequestBody Map<String,Object> parms) throws Exception {
        return personService.editPassword(parms.get("guid").toString(),parms.get("password").toString());
    }
    @RequestMapping(value = "/getByCompanyIDAndRoleID",method=RequestMethod.POST)
    @ResponseBody
    public List<Person> getByCompanyIDAndRoleID(@RequestBody Map<String,Object> parms) throws Exception {
        List<Person> list = personService.getByCompanyIDAndRoleID(parms.get("companyId").toString(),parms.get("roleId").toString());
        return list;
    }
    @RequestMapping(value = "/getByCompanyIDWithoutAdmin",method=RequestMethod.POST)
    @ResponseBody
    public List<Person> getByCompanyIDWithoutAdmin(@RequestBody Map<String,Object> parms) throws Exception {
        List<Person> list = personService.getByCompanyIDWithoutAdmin(parms.get("companyId").toString());
        return list;
    }
    @RequestMapping(value = "/add",method=RequestMethod.POST)
    @ResponseBody
    public int addPerson(@RequestBody Person person) throws Exception {
        return personService.addPerson(person);
    }
    @RequestMapping(value = "/edit",method=RequestMethod.POST)
    @ResponseBody
    public int editPerson(@RequestBody Person person) throws Exception {
        return personService.editPerson(person);
    }
    @RequestMapping(value = "/delete",method=RequestMethod.POST)
    @ResponseBody
    public int deletePerson(@RequestBody Map<String,Object> parms) throws Exception {
        return personService.deletePerson(parms.get("guid").toString());
    }

}
