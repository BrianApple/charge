package com.hzzh.charge.model;

import java.util.List;

/**
 * Created by lilaifeng on 2016/9/26.
 */
public class LoginInfo {

    private Person person;
    private List<Menu> menus;

    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }


}
