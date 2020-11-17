package com.xst.service;

import com.github.pagehelper.PageInfo;
import com.xst.domain.User;
import com.xst.domain.other.KeyValue;
import com.xst.viewmodel.admin.user.UserPageRequestVM;

import java.util.List;

/**
 * @author GUO
 * @Classname UserService
 * @Description TODO
 * @Date 2020/11/16 20:42
 */
public interface UserService extends BaseService<User> {

    /**
     * getUsers
     *
     * @return List<User>
     */
    List<User> getUsers();

    /**
     * getUserById
     *
     * @param id id
     * @return User
     */
    User getUserById(Integer id);

    /**
     * getUserByUserName
     *
     * @param username username
     * @return User
     */
    User getUserByUserName(String username);

    /**
     * getUserByUserName
     *
     * @param username username
     * @param pwd      pwd
     * @return User
     */
    User getUserByUserNamePwd(String username, String pwd);

    /**
     * getUserByUuid
     *
     * @param uuid uuid
     * @return User
     */
    User getUserByUuid(String uuid);

    /**
     * userPageList
     *
     * @param name      name
     * @param pageIndex pageIndex
     * @param pageSize  pageSize
     * @return List<User>
     */
    List<User> userPageList(String name, Integer pageIndex, Integer pageSize);


    /**
     * userPageCount
     *
     * @param name name
     * @return Integer
     */
    Integer userPageCount(String name);


    /**
     * @param requestVM requestVM
     * @return PageInfo<User>
     */
    PageInfo<User> userPage(UserPageRequestVM requestVM);


    /**
     * insertUser
     *
     * @param user user
     */
    void insertUser(User user);

    /**
     * insertUsers
     *
     * @param users users
     */
    void insertUsers(List<User> users);

    /**
     * updateUser
     *
     * @param user user
     */
    void updateUser(User user);

    /**
     * updateUsersAge
     *
     * @param age
     * @param ids
     */
    void updateUsersAge(Integer age, List<Integer> ids);

    /**
     * deleteUserByIds
     *
     * @param ids
     */
    void deleteUserByIds(List<Integer> ids);


    Integer selectAllCount();


    List<KeyValue> selectByUserName(String userName);


    List<User> selectByIds(List<Integer> ids);

    User selectByWxOpenId(String wxOpenId);
    void changePicture(User user, String imagePath);
}