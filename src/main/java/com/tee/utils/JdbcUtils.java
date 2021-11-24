package com.tee.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtils {
    // 连接数据库
    public static Connection getConnection(){
        String url="jdbc:mysql://localhost:3306/sale";
        String user="root";
        String pwd="root";
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, user,pwd);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    // 关闭数据库
    public static void colse(Connection conn){
        try{
            if(conn!=null){
                conn.close();
            }
        }catch (Exception e){}
    }
}
