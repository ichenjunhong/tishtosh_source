package com.bytedance.liko.memoryexplorer.report;

import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;

public class ObjectInstanceReporter extends BaseReporter {
    public int getResultType() {
        return 4;
    }

    public ObjectInstanceReporter(ExplorerAnalysisResult explorerAnalysisResult) {
        super(explorerAnalysisResult);
    }

    public void onReport(LeakInfo leakInfo) {
        if (leakInfo != null && leakInfo.classNode != null) {
            getResultList().add(leakInfo.classNode);
        }
    }
}
