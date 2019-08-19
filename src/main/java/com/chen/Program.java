package com.chen;

import java.io.File;

public class Program {
    private static void execute() {
        ConvertToPDF converter = new ConvertToPDF(ConvertToPDF.HIDDEN);
        try {
            converter.openDoc(new File("files", "demo.docx").getAbsolutePath());
            converter.publishAsPDF(new File("files", "demo.pdf").getAbsolutePath());
        } finally {
            converter.closeDoc();
            converter.quit();
        }
    }

    public static void main(String args[]) {
        // Stopwatch stopWatch = Stopwatch.createUnstarted();
        // stopWatch.start();
        // execute();
        // stopWatch.stop();
        // System.out.println("Total time: " + stopWatch.elapsed().getSeconds());

        execute();
    }
}