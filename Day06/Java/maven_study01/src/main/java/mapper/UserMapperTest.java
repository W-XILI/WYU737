package mapper;
import mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import pojo.User;
import utils.MyBatisUtils;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test() {
        //获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();

        //执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void addUser() {
        //获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(4, "温立希", "111111"));
        //提交事务
        sqlSession.commit();
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void deleteUser() {
        //获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);
        //提交事务
        sqlSession.commit();
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void updateUser() {
        //获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(3, "小蓝", "222222"));
        //提交事务
        sqlSession.commit();
        //关闭sqlSession
        sqlSession.close();
    }
    @Test
    public void getUserByID() {
        //获取sqlSession对象
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        //执行SQL
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByID(2);
        System.out.println(user);
        //关闭sqlSession
        sqlSession.close();
    }

}
