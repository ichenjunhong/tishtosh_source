package com.p683ss.android.ugc.aweme.base.activity;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.base.activity.LatestCrashBean */
public class LatestCrashBean {
    private Data data;
    private boolean success;

    /* renamed from: com.ss.android.ugc.aweme.base.activity.LatestCrashBean$Data */
    public static class Data {
        @C17952c(mo34828a = "issue_url")
        private String issueUrl;
        private String status;

        public String getIssueUrl() {
            return this.issueUrl;
        }

        public String getStatus() {
            return this.status;
        }

        public void setIssueUrl(String str) {
            this.issueUrl = str;
        }

        public void setStatus(String str) {
            this.status = str;
        }
    }

    public Data getData() {
        return this.data;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public void setData(Data data2) {
        this.data = data2;
    }

    public void setSuccess(boolean z) {
        this.success = z;
    }
}
