package com.it.ssm.service;

import com.it.ssm.domain.Role;
import com.it.ssm.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService {

    /**
     * 查询用户详细信息
     * @return
     * @throws Exception
     */
    UserInfo findById(String id)throws Exception;

    /**
     * 查询所有用户
     * @return
     * @throws Exception
     */
    List<UserInfo> findAll() throws Exception;

    /**
     * 增加用户
     * @param userInfo
     * @throws Exception
     */
    void save(UserInfo userInfo)throws Exception;

    List<Role> findOtherRoles(String userId)throws Exception;

    void addRoleToUser(String userId, String[] roleIds)throws Exception;
}
