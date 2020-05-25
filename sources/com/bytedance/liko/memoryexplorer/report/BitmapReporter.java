package com.bytedance.liko.memoryexplorer.report;

import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultBitmapNode;

public class BitmapReporter extends BaseReporter {
    public int getResultType() {
        return 3;
    }

    public BitmapReporter(ExplorerAnalysisResult explorerAnalysisResult) {
        super(explorerAnalysisResult);
    }

    public void onReport(LeakInfo leakInfo) {
        if (leakInfo != null) {
            ResultBitmapNode resultBitmapNode = new ResultBitmapNode();
            if (!(leakInfo.leakTrace == null || leakInfo.leakTrace.getLeakedElement() == null)) {
                resultBitmapNode.retained_heap_size = getHeapSize(leakInfo.leakTrace.getLeakedElement().retainedHeapSize);
                resultBitmapNode.object_class = leakInfo.leakTrace.getLeakedElement().className;
                resultBitmapNode.object_trace = leakInfo.leakTrace.format(false);
            }
            if (leakInfo.bitmapNode != null) {
                resultBitmapNode.height = leakInfo.bitmapNode.height;
                resultBitmapNode.width = leakInfo.bitmapNode.width;
            }
            getResultList().add(resultBitmapNode);
        }
    }
}
