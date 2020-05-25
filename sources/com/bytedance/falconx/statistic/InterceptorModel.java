package com.bytedance.falconx.statistic;

import android.os.SystemClock;
import com.google.gson.p1076a.C17952c;

public class InterceptorModel {
    @C17952c(mo34828a = "ac")

    /* renamed from: ac */
    public String f26585ac;
    @C17952c(mo34828a = "access_key")
    public String accessKey;
    @C17952c(mo34828a = "channel")
    public String channel;
    @C17952c(mo34828a = "err_code")
    public String errCode;
    @C17952c(mo34828a = "err_msg")
    public String errMsg;
    @C17952c(mo34828a = "log_id")
    public String logId;
    @C17952c(mo34828a = "mime_type")
    public String mimeType;
    @C17952c(mo34828a = "offline_duration")
    public Long offlineDuration;
    @C17952c(mo34828a = "offline_rule")
    public String offlineRule;
    @C17952c(mo34828a = "offline_status")
    public Integer offlineStatus;
    @C17952c(mo34828a = "online_duration")
    public Long onlineDuration;
    @C17952c(mo34828a = "page_url")
    public String pageUrl;
    @C17952c(mo34828a = "pkg_version")
    public Long pkgVersion;
    @C17952c(mo34828a = "res_root_dir")
    public String resRootDir;
    public Long startTime = Long.valueOf(SystemClock.uptimeMillis());
    @C17952c(mo34828a = "resource_url")
    public String url;

    public void setErrorCode(String str) {
        this.errCode = str;
    }

    public void setErrorMsg(String str) {
        this.errMsg = str;
    }

    public void setResRootDir(String str) {
        this.resRootDir = str;
    }

    public void loadFinish(boolean z) {
        if (z) {
            this.offlineDuration = Long.valueOf(SystemClock.uptimeMillis() - this.startTime.longValue());
            this.offlineStatus = Integer.valueOf(1);
            return;
        }
        this.offlineStatus = Integer.valueOf(0);
    }
}
