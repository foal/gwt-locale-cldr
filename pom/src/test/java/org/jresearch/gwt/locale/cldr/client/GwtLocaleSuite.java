package org.jresearch.gwt.locale.cldr.client;

import org.jresearch.gwt.locale.cldr.client.locale.TestCldrLocales;

import com.google.gwt.junit.tools.GWTTestSuite;

import junit.framework.Test;

public class GwtLocaleSuite {

	public static Test suite() {
		GWTTestSuite suite = new GWTTestSuite("Locale browser independent tests");

		// $JUnit-BEGIN$
		suite.addTestSuite(TestCldrLocales.class);
		// $JUnit-END$

		return suite;
	}
}
