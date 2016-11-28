package com.hzzh.charge.service;

import com.hzzh.charge.model.Menu;



import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface MenuService {
    List<Menu> getMenus(String personId) throws Exception;
    List<Menu> getMenusByCompanyID(String companyId) throws Exception;
    int addMenuGroup(Menu menu) throws Exception;
    int addMenuItem(Menu menu) throws Exception;
    Menu getMaxOrderByCompanyID(String companyId,String parentId) throws Exception;
    int editMenu(Menu menu) throws Exception;
    int editMenuOrder(Menu menu) throws Exception;
    int deleteMenu(String menuId) throws Exception;
}
