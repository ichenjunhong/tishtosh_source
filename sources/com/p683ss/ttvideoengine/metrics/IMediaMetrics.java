package com.p683ss.ttvideoengine.metrics;

import android.os.Bundle;
import com.p683ss.ttvideoengine.log.VideoEvent;
import com.p683ss.ttvideoengine.log.VideoEventOnePlay;

/* renamed from: com.ss.ttvideoengine.metrics.IMediaMetrics */
public interface IMediaMetrics {
    int getType();

    void logMetric(VideoEvent videoEvent);

    void logMetric(VideoEventOnePlay videoEventOnePlay);

    void logMetric(String str, float f);

    void logMetric(String str, int i);

    void logMetric(String str, String str2);

    void logMetric(String str, boolean z);

    boolean popMetricBoolean(String str);

    float popMetricFloat(String str);

    int popMetricInt(String str);

    long popMetricLong(String str);

    Bundle popMetrics();

    String printf();
}
