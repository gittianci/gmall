package com.tianci.gmall.user.mapper;


import com.tianci.gmall.user.bean.UserMember;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface UserMapper {
    List<UserMember> getAllUser();
}
