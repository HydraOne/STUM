package cn.pzhu.geny.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class MybatisUtils {
    private static ThreadLocal<SqlSession> threadLocal=new ThreadLocal<SqlSession>();
    private static SqlSessionFactory factory;

    static {
        try{
            InputStream is = Resources.getResourceAsStream("mybatis.xml");
            factory = new SqlSessionFactoryBuilder().build(is);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(){
        SqlSession session=threadLocal.get();
        if(session==null){
            session = factory.openSession();
            threadLocal.set(session);
        }
        return threadLocal.get();
    }

    public static void closeSession(){
        SqlSession session=threadLocal.get();
        if(session!=null){
            session.close();
        }
        threadLocal.set(null);
    }
}
