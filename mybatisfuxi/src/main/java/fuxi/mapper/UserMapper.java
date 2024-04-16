package fuxi.mapper;

import fuxi.bean.User;

import java.util.List;

/**
 * @projectName: mybatis
 * @package: fuxi.mapper
 * @className: UserMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/22 11:57
 * @version: 1.0
 */
public interface UserMapper {
    int insertUser(User user);
    int deleteUser(Integer id);
    int updateUser(User user);
    User selectByid(Integer id);
    List<User> selectByall();

}
