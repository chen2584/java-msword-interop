package com.chen;

import com.google.common.base.Stopwatch;
import com.jacob.com.ComThread;

import java.io.File;

public class Program {
    private static void execute() {
        ConvertToPDF converter = new ConvertToPDF(ConvertToPDF.HIDDEN);
        ComThread.InitMTA();
        try {
            converter.openDoc(new File("files", "demo22.docx").getAbsolutePath());
            converter.publishAsPDF(new File("files", "demo.pdf").getAbsolutePath());
        } finally {
            converter.closeDoc();
            converter.quit();
        }
        ComThread.Release();
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