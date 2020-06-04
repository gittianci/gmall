package com.tianci.gmall.user.service;

import com.tianci.gmall.user.bean.UmsMember;
import com.tianci.gmall.user.bean.UmsMemberReceiveAddress;
import com.tianci.gmall.user.bean.UserMember;

import java.util.List;

public interface UserService {


    List<UserMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);

    List<UmsMember> getAllUmsMember(String memberLevelId);


}
