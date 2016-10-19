package com.hzzh.charge.service.impl;

import com.hzzh.charge.dao.UserDao;
import com.hzzh.charge.exception.MyException;
import com.hzzh.charge.model.User;
import com.hzzh.charge.model.UserExample;
import com.hzzh.charge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类名称：user表的ServiceImpl接口类UserServiceImpl
 * 内容摘要：扩展ServiceImpl
 *
 * @author TR
 * @version 1.0 2016年09月24日
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() throws MyException {
        UserExample userExample = new UserExample();
        List<User> list = userDao.selectByExample(userExample);
        if(list==null || list.size()<=0){
            return null;
        }
        return list;
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    @Transactional
    public Integer insert(User user) throws Exception {

        Integer count = userDao.insert(user);
        if (count == null || count == 0) {
            return null;
        }
        return count;
    }

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     * @throws Exception
     */
    @Override
    public User findUserById(Integer id) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("id", id);
        if (id != null) {
            User find = userDao.selectByPrimaryKey(map);
            return find;
        }
        return null;

    }

    /**
     * 根据id更新用户
     *
     * @param user
     * @return
     * @throws Exception
     */
    @Override
    public Integer update(User user) throws Exception {
        user.setId(40);
        user.setUsername("冷胡冲");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAddress("华山");
        Integer update = userDao.updateByPrimaryKeySelective(user);
        return update;
    }
}