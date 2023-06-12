package com.challenge.pruebas;

import java.sql.Connection;
import java.sql.SQLException;

import com.challenge.factory.ConnectionFactory;

public class PruebaConnection {

	public static void main(String[] args) throws SQLException {
		System.out.println("Abriendo conexión");
		Connection con = new ConnectionFactory().recuperaConexion();
		
		System.out.println("Cerrando conexion");
		con.close();
	}
}
