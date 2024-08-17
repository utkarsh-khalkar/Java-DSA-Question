package com.jdbc;

import java.sql.*;

public class JDBCConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/p_data","root","12345");

        Statement statement=connection.createStatement();

        String str="Select * from student ";
        String s=" insert into student values (105,'Pooja','Dindori','90','23') ";


        //ResultSet resultSet=statement.executeQuery(str);
        int resultSet=statement.executeUpdate(s);
        if(resultSet >0)
        {
            System.out.println(" Data is Inserted Successfully..");
        }else {
            System.out.println(" Something went Wrong..");
        }

//        System.out.println("SID \t SName \t SAddress \t SMarks \t SAge");
//        while (resultSet.next())
//        {
//            int sid=resultSet.getInt(1);
//            String sname=resultSet.getString(2);
//            String sadd=resultSet.getString(3);
//            String smarks=resultSet.getString(4);
//            String sage=resultSet.getString(5);
//            System.out.println(sid+"\t \t"+sname+"\t \t"+sadd+ "\t \t"+smarks+"\t \t"+sage);
//        }
    }
}
