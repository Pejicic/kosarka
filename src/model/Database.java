package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
	public static Connection con ;
	public static Statement st;
	public static ResultSet rs;

	public static int count = 50;
}
