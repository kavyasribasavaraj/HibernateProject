package com.src.service;
import java.sql.Connection;

//import org.springframework.stereotype.Component;

public interface DBConnection {

	public Connection getConnection() throws ClassNotFoundException;
}
