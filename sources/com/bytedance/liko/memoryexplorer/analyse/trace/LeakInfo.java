package com.bytedance.liko.memoryexplorer.analyse.trace;

import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultBigObjectNode;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultBitmapNode;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultClassNode;

public class LeakInfo {
    public ResultBigObjectNode bigObjectNode;
    public ResultBitmapNode bitmapNode;
    public ResultClassNode classNode;
    public LeakTrace leakTrace;

    public LeakInfo(LeakTrace leakTrace2) {
        this.leakTrace = leakTrace2;
    }

    public LeakInfo(ResultClassNode resultClassNode) {
        this.classNode = resultClassNode;
    }

    public LeakInfo(LeakTrace leakTrace2, ResultBigObjectNode resultBigObjectNode) {
        this.leakTrace = leakTrace2;
        this.bigObjectNode = resultBigObjectNode;
    }

    public LeakInfo(LeakTrace leakTrace2, ResultBitmapNode resultBitmapNode) {
        this.leakTrace = leakTrace2;
        this.bitmapNode = resultBitmapNode;
    }
}
