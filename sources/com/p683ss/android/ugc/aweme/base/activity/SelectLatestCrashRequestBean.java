package com.p683ss.android.ugc.aweme.base.activity;

/* renamed from: com.ss.android.ugc.aweme.base.activity.SelectLatestCrashRequestBean */
public class SelectLatestCrashRequestBean {
    private int aid;
    private String did;
    private long duration;
    private long time;

    public SelectLatestCrashRequestBean(String str, long j, long j2, int i) {
        this.did = str;
        this.time = j;
        this.duration = j2;
        this.aid = i;
    }
}
