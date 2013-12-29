package com.akjava.gwt.jszip.client;

import com.google.gwt.core.client.JavaScriptObject;

public class JSFile extends JavaScriptObject{
	protected JSFile(){}
	
	public final native String getName()/*-{
	return this.name;
	}-*/;
	
	public final native JSFileOptions getOptions()/*-{
	return this.options;
	}-*/;
	
	public final native String asText()/*-{
	return this.asText();
	}-*/;
	
	public final native String asBinary()/*-{
	return this.asBinary();
	}-*/;
	
	public final native JavaScriptObject asArrayBuffer()/*-{
	return this.asArrayBuffer();
	}-*/;
	public final native JavaScriptObject asUint8Array()/*-{
	return this.asUint8Array();
	}-*/;
	public final native JavaScriptObject asNodeBuffer()/*-{
	return this.asNodeBuffer();
	}-*/;
}
