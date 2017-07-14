package com.acme.listener;

@FunctionalInterface
public interface OnClickListener {
	void handle(ActionEvent event);
}
