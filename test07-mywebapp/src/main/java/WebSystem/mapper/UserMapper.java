package WebSystem.mapper;

import WebSystem.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * @projectName: mybatis
 * @package: WebSystem.mapper
 * @className: UserMapper
 * @author: 丁海斌
 * @description: TODO
 * @date: 2023/7/9 18:41
 * @version: 1.0
 */
public interface UserMapper {
    User selectlogin(@Param("username") String username, @Param("password") String password);
}
