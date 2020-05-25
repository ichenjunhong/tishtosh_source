package com.bytedance.liko.memoryexplorer.report;

import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultLeakNode;

public class LeakReporter extends BaseReporter {
    public int getResultType() {
        return 2;
    }

    public LeakReporter(ExplorerAnalysisResult explorerAnalysisResult) {
        super(explorerAnalysisResult);
    }

    public void onReport(LeakInfo leakInfo) {
        if (leakInfo.leakTrace.getLeakedElement() != null) {
            ResultLeakNode resultLeakNode = new ResultLeakNode();
            resultLeakNode.retained_heap_size = getHeapSize(leakInfo.leakTrace.getLeakedElement().retainedHeapSize);
            resultLeakNode.object_class = leakInfo.leakTrace.getLeakedElement().className;
            resultLeakNode.object_trace = leakInfo.leakTrace.format(false);
            getResultList().add(resultLeakNode);
        }
    }
}
