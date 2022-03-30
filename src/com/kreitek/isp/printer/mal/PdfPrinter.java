package com.kreitek.isp.printer.mal;

public class PdfPrinter implements Printer {
    @Override
    public void print() {
        // Imprimer en PDF
    }

    @Override
    public void scan() {
        throw new RuntimeException("No implementado");
    }

    @Override
    public void fax() {
        throw new RuntimeException("No implementado");
    }
}
