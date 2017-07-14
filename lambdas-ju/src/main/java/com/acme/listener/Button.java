package com.acme.listener;

public class Button {
	private OnClickListener onClick;

	public void setOnClick(OnClickListener onClick) {
		this.onClick = onClick;
	}

	public void click() {
		if (onClick != null) {
			onClick.handle(new ActionEvent("click"));
		}
	}
}
