package com.src.service;
import java.sql.Connection;
public interface DBConnection {

	public Connection getConnection() throws ClassNotFoundException;
}
