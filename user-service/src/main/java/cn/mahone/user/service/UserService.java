package cn.mahone.user.service;


import cn.mahone.user.mapper.UserMapper;
import cn.mahone.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * describe:
 *
 * @author: Mahone
 * @creattime: 2018/10/30 18:23
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){

        return userMapper.selectByPrimaryKey(id);
    }


}
