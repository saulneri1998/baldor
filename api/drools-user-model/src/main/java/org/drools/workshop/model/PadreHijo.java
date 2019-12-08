package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

public class PadreHijo {
    String padre;
    String hijo;

    public String getHijo() {
	return hijo;
    }
    
    public String getPadre() {
	return padre;
    }

    public void setHijo(String hijo) {
	this.hijo = hijo;
    }

    public void setPadre(String padre) {
	this.padre = padre;
    }

    @Override
    public String toString() {
        return "PadreHijo{" + "padre=" + padre + ", hijo=" + hijo + '}';
    }

    public PadreHijo() {
    }
}
