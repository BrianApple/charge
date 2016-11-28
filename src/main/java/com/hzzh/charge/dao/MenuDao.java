package com.hzzh.charge.dao;
import com.hzzh.charge.model.Menu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by lilaifeng on 2016/9/22.
 */
public interface MenuDao {
    public List<Menu> getMenus(@Param("personId") String personId) throws Exception;
    public List<Menu> getMenusByCompanyID(@Param("companyId") String companyId) throws Exception;
    public int addMenuGroup(Menu menu) throws Exception;
    public int addMenuItem(Menu menu) throws Exception;
    public Menu getMaxOrderByCompanyID(@Param("companyId") String companyId,@Param("parentId") String parentId) throws Exception;
    public int editMenu(Menu menu) throws Exception;
    public int editMenuOrder(Menu menu) throws Exception;
    public int deleteMenu(@Param("menuId") String menuId) throws Exception;

}
