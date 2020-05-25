package com.p683ss.ttvideoengine.metrics;

import com.p683ss.ttvideoengine.log.VideoEvent;
import com.p683ss.ttvideoengine.log.VideoEventOnePlay;

/* renamed from: com.ss.ttvideoengine.metrics.MetricsFactory */
public final class MetricsFactory {
    private MetricsFactory() {
    }

    public static IMediaMetrics createMetrics(int i, VideoEvent videoEvent) {
        IMediaMetrics iMediaMetrics;
        if (i != 0) {
            iMediaMetrics = null;
        } else {
            iMediaMetrics = new FirstFrameMetrics(i);
        }
        if (iMediaMetrics != null) {
            iMediaMetrics.logMetric(videoEvent);
        }
        return iMediaMetrics;
    }

    public static IMediaMetrics createMetrics(int i, VideoEventOnePlay videoEventOnePlay) {
        IMediaMetrics iMediaMetrics;
        if (i != 0) {
            iMediaMetrics = null;
        } else {
            iMediaMetrics = new FirstFrameMetrics(i);
        }
        if (iMediaMetrics != null) {
            iMediaMetrics.logMetric(videoEventOnePlay);
        }
        return iMediaMetrics;
    }
}
