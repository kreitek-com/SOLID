package com.kreitek.dip.mal.one.processor;

import com.kreitek.dip.mal.one.utils.StringReader;
import com.kreitek.dip.mal.one.utils.StringWriter;

public class StringProcessor {

    private final StringReader stringReader;
    private final StringWriter stringWriter;

    public StringProcessor(StringReader stringReader, StringWriter stringWriter) {
        this.stringReader = stringReader;
        this.stringWriter = stringWriter;
    }

    public void printString() {
        stringWriter.write(stringReader.getValue());
    }

}
