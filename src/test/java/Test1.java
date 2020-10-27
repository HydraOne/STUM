import cn.pzhu.geny.mapper.UserMapper;
import cn.pzhu.geny.pojo.User;
import cn.pzhu.geny.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class Test1 {
    @Test
    public void test(){
        SqlSession sqlSession= MybatisUtils.getSession();
        UserMapper mapper=sqlSession.getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
