package com.imcst.service;

import com.imcst.domain.Role;
import com.imcst.domain.UserInfo;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface IUserService extends UserDetailsService{
    List<UserInfo> findAll() throws Exception;

    void save(UserInfo user) throws Exception;

    UserInfo findById(String id) throws Exception;

    List<Role> findOtherRoles(String userId) throws Exception;

    void addRoleToUser(String userId, String[] roleIds) throws Exception;

    void deleteUser(String id) throws Exception;
}
