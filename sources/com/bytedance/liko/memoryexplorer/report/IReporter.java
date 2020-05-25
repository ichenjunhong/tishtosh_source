package com.bytedance.liko.memoryexplorer.report;

import com.bytedance.liko.memoryexplorer.analyse.trace.LeakInfo;

public interface IReporter {
    int getResultType();

    void onReport(LeakInfo leakInfo);
}
