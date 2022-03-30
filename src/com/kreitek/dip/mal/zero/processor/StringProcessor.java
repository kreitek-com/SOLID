package com.kreitek.dip.mal.zero.processor;

import com.kreitek.dip.mal.zero.utils.StringReader;
import com.kreitek.dip.mal.zero.utils.StringWriter;

public class StringProcessor {

    private final StringReader stringReader;
    private final StringWriter stringWriter;

    public StringProcessor() {
        stringReader = new StringReader();
        stringWriter = new StringWriter();
    }

    public void printString() {
        stringWriter.write(stringReader.getValue());
    }

}
