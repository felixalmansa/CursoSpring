package com.openwebinars.beans.props;

import java.util.Properties;

public class ConexionBaseDatos {	
	
	private Properties properties;

	public ConexionBaseDatos() { }

	public ConexionBaseDatos(Properties properties) {
		this.properties = properties;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "ConexionBaseDatos [properties=" + properties + "]";
	}
	
}
