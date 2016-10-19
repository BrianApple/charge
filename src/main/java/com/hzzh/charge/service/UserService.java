package com.hzzh.charge.service;

import com.hzzh.charge.exception.MyException;
import com.hzzh.charge.model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

/**
 * 类名称：user表的Service接口类UserService
 * 内容摘要：扩展Service
 *
 * @author TR
 * @version 1.0 2016年09月24日
 * @CacheConfig(cacheNames = "user"):配置了该数据访问对象中返回的内容将存储于名为
 * user的缓存对象中。
 * cacheNames:用于指定缓存储存的集合名。
 * @Cacheable:将方法加入缓存，并且优先从缓存中查找。
 * @CacheEvict：清空缓存
 */
//@CacheConfig(cacheNames = "user")
public interface UserService {

    /**
     * 查询所有数据
     *
     * @return
     * @throws Exception
     */
    @Cacheable(cacheNames = "user", key = "1000")
    List<User> findAll()throws MyException;

    /**
     * 添加用户
     *
     * @param user
     * @return
     * @throws Exception
     */
    @CacheEvict(cacheNames = "user", key = "1000")
    Integer insert(User user) throws Exception;

    /**
     * 根据id查询用户
     *
     * @param id
     * @return
     * @throws Exception
     */
    User findUserById(Integer id) throws Exception;

    /**
     * 根据id更新用户
     *
     * @param user
     * @return
     * @throws Exception
     */
    Integer update(User user) throws Exception;

}