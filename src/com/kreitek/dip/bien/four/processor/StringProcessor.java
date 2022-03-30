package com.kreitek.dip.bien.four.processor;

import com.kreitek.dip.bien.four.interfaces.StringReader;
import com.kreitek.dip.bien.four.interfaces.StringWriter;
import com.kreitek.dip.bien.four.utils.StringWriterImpl;

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
