package com.bytedance.liko.memoryexplorer.analyse;

import org.eclipse.mat.snapshot.ISnapshot;
import org.eclipse.mat.util.IProgressListener;

public interface HprofAnalyser {
    void analysis(ISnapshot iSnapshot, IProgressListener iProgressListener);
}
