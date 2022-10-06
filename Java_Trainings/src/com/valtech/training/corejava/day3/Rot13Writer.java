package com.valtech.training.corejava.day3;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Writer;

import org.junit.Test;

public class Rot13Writer extends Writer {

	private Writer sink;

	public Rot13Writer(Writer sink) {
		this.sink = sink;
	}

	@Override
	public void write(char[] cbuf, int off, int len) throws IOException {
		char[] buffer = new char[cbuf.length];
		for (int i = 0; i < len; i++) {
			buffer[i] = (char) Rot13Utility.rotate(cbuf[i]);
		}
		sink.write(buffer, off, len);
	}

	@Override
	public void flush() throws IOException {
		// TODO Auto-generated method stub

	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

}