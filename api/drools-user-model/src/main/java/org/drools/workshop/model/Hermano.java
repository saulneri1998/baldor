package org.drools.workshop.model;

import javax.xml.bind.annotation.XmlRootElement;

public class Hermano {
    private String h1;
    private String h2;

    public Hermano() {};

    public Hermano(String h1, String h2) {
	this.h1 = h1;
	this.h2 = h2;
    }

    public String getHermano1() {
	return h1;
    }

    public String getHermano2() {
	return h2;
    }

    public void setHermano1(String h1) {
	this.h1 = h1;
    }

    public void setHermano2(String h2) {
	this.h2 = h2;
    }

    @Override
    public String toString() {
        return "Hermano{" + "hermano1=" + h1 + ", hermano2=" + h2 + '}';
    }
}
