package mapper;
import pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    int addUser(User user);
    int deleteUser(int id);
    int updateUser(User user);
    User getUserByID(int id);
}
