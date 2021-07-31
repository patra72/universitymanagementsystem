package com.universitymangementsystem;
import java.sql.*;
public class connectivity {
    Connection c;
    Statement s;
    public connectivity(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c =DriverManager.getConnection("jdbc:mysql:///ums","root","");
            s =c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

