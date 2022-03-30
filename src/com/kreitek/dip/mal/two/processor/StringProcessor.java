package com.kreitek.dip.mal.two.processor;

import com.kreitek.dip.mal.two.utils.StringReader;
import com.kreitek.dip.mal.two.utils.StringWriter;
import com.kreitek.dip.mal.two.utils.StringWriterImpl;

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
