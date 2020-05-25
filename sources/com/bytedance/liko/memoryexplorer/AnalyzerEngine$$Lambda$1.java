package com.bytedance.liko.memoryexplorer;

import java.io.File;
import java.io.FileFilter;

final /* synthetic */ class AnalyzerEngine$$Lambda$1 implements FileFilter {
    static final FileFilter $instance = new AnalyzerEngine$$Lambda$1();

    private AnalyzerEngine$$Lambda$1() {
    }

    public final boolean accept(File file) {
        return file.getName().endsWith(".index");
    }
}
