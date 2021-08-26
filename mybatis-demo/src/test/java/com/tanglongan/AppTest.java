package com.tanglongan;

import org.h2.tools.RunScript;
import org.junit.Test;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class AppTest {

    private Connection conn = null;

    @Test
    public void initData() throws Exception {
        Class.forName("org.h2.Driver");
        conn = DriverManager.getConnection("jdbc:h2:mem:happy;DB_CLOSE_DELAY=-1", "shit", "");
        String file = Objects.requireNonNull(this.getClass().getClassLoader().getResource("init-data.sql")).getPath();

        RunScript.execute(conn, new FileReader(file));
        System.out.println("init done");
    }
}
