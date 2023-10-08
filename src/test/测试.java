package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class 测试 {
    public static void main(String[] args) {
        /*int j=0;
        for (int i = 0; i < 30; i++) {
            j=j++;
            System.out.println(j);
        }
        System.out.println("The square Root of \u03C0 ="+sqrt(PI));*/
        /*String greeting="hello!";
        System.out.println((int) 'h');
        int n=greeting.codePointAt(0);
        System.out.println(n);
        System.out.println(greeting.codePointCount(0,greeting.length())+" "+greeting.length());*/
// 设置连接数据库的各个参数.
        String url = "jdbc :sqlserver://127.0.0.1:1433;dat abaseName=xujia;user=sa;password=gxu";//以sa身份
//声明JDBC对象
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
//建立数据库连接.
            System.out.println("尝试建立数据库连接.");
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection(url);
            System.out.println("数据库连接成功!");
//创建SQL语删除student表中学号为' 200215126'的学生记录
            String SQL = "DELETE FROM student WHERE Sno = ' 200215126' ";
            stmt = con.createStatement();
            stmt.executeUpdate(SQL);
//创建SQL语句向student表中插入一条学 号为' 200215126 '的学生记录
            SQL = "INSERT INTO student (Sno, Sname, Ssex, Sage, Sdept) VALUES( ' 200215126','陈冬','男', 21, 'MA' )";
            stmt.executeUpdate(SQL);
//创建SQL语句查询student表中的所有记录并返回查询结果至结果集类型的变量rs中
            SQL = "SELECT * FROM student";
            rs = stmt.executeQuery(SQL);
//遍历和打印查询结果集rs中的查询结果

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}