package com.zkf.umfrage.client.ui.ergebniss;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class ergebniss extends Composite {

	private static ergebnissUiBinder uiBinder = GWT
			.create(ergebnissUiBinder.class);

	interface ergebnissUiBinder extends UiBinder<Widget, ergebniss> {
	}

	@UiField
	Button button;

	public ergebniss(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
		button.setText(firstName);
	}

	@UiHandler("button")
	void onClick(ClickEvent e) {
		Window.alert("Hello!");
	}

}
