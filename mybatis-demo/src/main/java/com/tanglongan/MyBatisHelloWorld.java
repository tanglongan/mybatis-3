package com.tanglongan;


import com.alibaba.fastjson.JSON;
import com.tanglongan.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class MyBatisHelloWorld {

    public static void main(String[] args) {

        try (Reader reader = Resources.getResourceAsReader("Configuration.xml")) {
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

            try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
                Employee employee = sqlSession.selectOne("com.tanglongan.dao.EmployeeMapper.getUserByNo", 10001);
                System.out.println(JSON.toJSONString(employee, true));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
