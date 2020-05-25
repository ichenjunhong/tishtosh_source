package com.p683ss.video.rtc.interact.statistic;

/* renamed from: com.ss.video.rtc.interact.statistic.RenderVideoFpsStatistics */
public class RenderVideoFpsStatistics {
    private String mInteractId;
    private long mRenderFrame;
    private long mStartTimestamp;

    /* renamed from: com.ss.video.rtc.interact.statistic.RenderVideoFpsStatistics$RenderVideoFpsStatisticsReport */
    public class RenderVideoFpsStatisticsReport {
        private int mFps;
        private String mInteractId;
        private long mSamplingTime;

        public int getFps() {
            return this.mFps;
        }

        public String getInteractId() {
            return this.mInteractId;
        }

        public long getSamplingTime() {
            return this.mSamplingTime;
        }

        RenderVideoFpsStatisticsReport(String str, int i, long j) {
            this.mInteractId = str;
            this.mFps = i;
            this.mSamplingTime = j;
        }
    }

    public void rendVideoFrame() {
        if (this.mStartTimestamp == 0) {
            this.mStartTimestamp = System.currentTimeMillis();
        }
        this.mRenderFrame++;
    }

    public RenderVideoFpsStatisticsReport getAvgRenderFps() {
        long currentTimeMillis = System.currentTimeMillis() - this.mStartTimestamp;
        this.mStartTimestamp = System.currentTimeMillis();
        int i = (int) ((this.mRenderFrame * 1000) / currentTimeMillis);
        this.mRenderFrame = 0;
        RenderVideoFpsStatisticsReport renderVideoFpsStatisticsReport = new RenderVideoFpsStatisticsReport(this.mInteractId, i, currentTimeMillis);
        return renderVideoFpsStatisticsReport;
    }

    public RenderVideoFpsStatistics(String str) {
        this.mInteractId = str;
    }
}
