package com.leapfrog.jdbcandui;

import com.leapfrog.jdbcandui.dao.StudentDAO;
import com.leapfrog.jdbcandui.dbutil.DbConnection;
import com.leapfrog.jdbcandui.entity.Student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program {

    public static void main(String[] args) throws SQLException {
        try {
        StudentDAO sDAO = new com.leapfrog.jdbcandui.dao.impl.StudentDAOImpl();
        Student s = sDAO.getById("BCT/2070/501");
           
            
            

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

}
