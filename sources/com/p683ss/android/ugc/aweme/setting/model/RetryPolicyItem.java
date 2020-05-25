package com.p683ss.android.ugc.aweme.setting.model;

import com.p683ss.android.ugc.aweme.setting.C41556av.C41557a;

/* renamed from: com.ss.android.ugc.aweme.setting.model.RetryPolicyItem */
public class RetryPolicyItem {
    public boolean isLoadSuccess;
    public long lastResponseTime;
    public int retryCount;
    public C41557a retryListener;

    public RetryPolicyItem(boolean z, long j, C41557a aVar) {
        this.isLoadSuccess = z;
        this.lastResponseTime = j;
        this.retryListener = aVar;
    }
}
