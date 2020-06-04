package com.tianci.gmall.user.service.impl;

import com.tianci.gmall.user.bean.UmsMember;
import com.tianci.gmall.user.bean.UmsMemberReceiveAddress;
import com.tianci.gmall.user.bean.UserMember;
import com.tianci.gmall.user.mapper.UmsMemberMapper;
import com.tianci.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.tianci.gmall.user.mapper.UserMapper;
import com.tianci.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UserMember> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        // 封装的参数对象
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddresses;
    }

    @Override
    public List<UmsMember> getAllUmsMember(String memberLevelId) {
        UmsMember umsMember = new UmsMember();
        umsMember.setMemberLevelId(memberLevelId);
        List<UmsMember> umsMemberses = umsMemberMapper.select(umsMember);

        return umsMemberses;
    }


}
