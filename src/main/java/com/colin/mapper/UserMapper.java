package com.colin.mapper;

import com.colin.bean.User;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: DengLong
 * Date: 2020-07-16
 * Time: 19:08
 */
@Repository
public interface UserMapper {
    void insertUser(User user);
}
