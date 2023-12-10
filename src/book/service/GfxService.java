package book.service;

import book.dao.UserDao;
import book.entity.JavaBean.User;
import book.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class GfxService {
    @Qualifier("UserDao")
    @Autowired
    private UserDao userMapper;

    public Result<User> LoginStatus(User user) {
        if (userMapper.UserLoginStatus(user.getUsername(),user.getPassword()) == null) {
            return new Result<>(false,"信息不符");
        } else  {
            return new Result<>(true,user);
        }
    }
}
