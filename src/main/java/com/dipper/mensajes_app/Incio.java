package com.dipper.mensajes_app;

import java.sql.Connection;

public class Incio {
    public static void main(String[] args) {
        Conexion con = new Conexion();
        try {
            Connection connection = con.getConnection();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

