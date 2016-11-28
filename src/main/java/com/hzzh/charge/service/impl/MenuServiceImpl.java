package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.MenuDao;
import com.hzzh.charge.model.Menu;
import com.hzzh.charge.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
@Service("MenuService")
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Menu> getMenus(String personId)  throws Exception {
        return menuDao.getMenus(personId);
    }
    @Override
    public List<Menu> getMenusByCompanyID(String companyId) throws Exception{
        return menuDao.getMenusByCompanyID(companyId);
    }
    @Override
    public int addMenuGroup(Menu menu) throws Exception{
        return menuDao.addMenuGroup(menu);
    }
    @Override
    public int addMenuItem(Menu menu) throws Exception{
        return menuDao.addMenuItem(menu);
    }
    @Override
    public Menu getMaxOrderByCompanyID(String companyId,String parentId) throws Exception{
        return menuDao.getMaxOrderByCompanyID(companyId,parentId);
    }
    @Override
    public int editMenu(Menu menu) throws Exception{
        return menuDao.editMenu(menu);
    }
    @Override
    public int editMenuOrder(Menu menu) throws Exception{
        return menuDao.editMenuOrder(menu);
    }
    @Override
    public int deleteMenu(String menuId) throws Exception{
        return menuDao.deleteMenu(menuId);
    }
}