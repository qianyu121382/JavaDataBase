package book.dao;

import book.entity.JavaBean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;



import javax.annotation.Resource;

@Repository("UserDao")
@Mapper
public interface UserDao
{
    User UserLoginStatus(@Param("username") String username, @Param("password") String password);
}
