package com.bytedance.liko.memoryexplorer.report;

import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult;
import com.bytedance.liko.memoryexplorer.report.model.ExplorerAnalysisResult.ResultLeakNode;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

public abstract class BaseReporter implements IReporter {
    protected ExplorerAnalysisResult mAnalysisResult;

    public static class ResultType {
    }

    /* access modifiers changed from: protected */
    public List<ResultLeakNode> getResultList() {
        switch (getResultType()) {
            case 1:
                return this.mAnalysisResult.object_node;
            case 2:
                return this.mAnalysisResult.activity_node;
            case 3:
                return this.mAnalysisResult.bitmap_node;
            case 4:
                return this.mAnalysisResult.instance_count_node;
            default:
                return Collections.emptyList();
        }
    }

    public BaseReporter(ExplorerAnalysisResult explorerAnalysisResult) {
        this.mAnalysisResult = explorerAnalysisResult;
    }

    /* access modifiers changed from: protected */
    public double getHeapSize(long j) {
        return new BigDecimal(j).divide(new BigDecimal(PreloadTask.BYTE_UNIT_NUMBER), 2, 4).doubleValue();
    }
}
