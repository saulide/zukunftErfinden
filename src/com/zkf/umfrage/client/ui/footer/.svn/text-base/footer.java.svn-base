package com.zkf.umfrage.client.ui.footer;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class footer extends Composite {

	private static footerUiBinder uiBinder = GWT.create(footerUiBinder.class);

	interface footerUiBinder extends UiBinder<Widget, footer> {
	}

	@UiField
	Button weiter;
	@UiField
	Button zurueck;

	public footer(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("weiter")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

}
