package org.jresearch.gwt.locale.cldr.client;

import java.util.Locale;

import org.jresearch.gwt.time.apt.data.client.LocaleInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gwt.core.client.EntryPoint;

public class CldrEntryPoint implements EntryPoint {

	private static final Logger LOGGER = LoggerFactory.getLogger(CldrEntryPoint.class);

	@Override
	public void onModuleLoad() {
		LOGGER.debug("Execute GWT locale CLDR onModuleLoad");
		Locale af = LocaleInfo.AF;
		LOGGER.debug("CLDR locales loaded");
	}

}
