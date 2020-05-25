package com.bytedance.liko.memoryexplorer.report;

import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;

public class BigObjectReporter extends BaseReporter {
    public int getResultType() {
        return 1;
    }

    public BigObjectReporter(ExplorerAnalysisResult explorerAnalysisResult) {
        super(explorerAnalysisResult);
    }

    public void onReport(LeakInfo leakInfo) {
        if (leakInfo != null && leakInfo.bigObjectNode != null && leakInfo.leakTrace != null && leakInfo.leakTrace.getLeakedElement() != null) {
            leakInfo.bigObjectNode.retained_heap_size = getHeapSize(leakInfo.leakTrace.getLeakedElement().retainedHeapSize);
            leakInfo.bigObjectNode.object_class = leakInfo.leakTrace.getLeakedElement().className;
            leakInfo.bigObjectNode.object_trace = leakInfo.leakTrace.format(false);
            getResultList().add(leakInfo.bigObjectNode);
        }
    }
}
