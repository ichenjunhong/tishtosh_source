package com.bytedance.liko.memoryexplorer;

import java.io.File;

class AnalyzerArgs {
    File hprofFile;
    File jsonConfigFile;
    File projectDir;

    AnalyzerArgs() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AnalyzerArgs{jsonConfigFile=");
        sb.append(this.jsonConfigFile);
        sb.append(", hprofFile=");
        sb.append(this.hprofFile);
        sb.append('}');
        return sb.toString();
    }

    AnalyzerArgs(File file, File file2, File file3) {
        this.hprofFile = file;
        this.jsonConfigFile = file2;
        this.projectDir = file3;
    }
}
