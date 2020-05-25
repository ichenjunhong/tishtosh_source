package com.bytedance.ies.geckoclient.model;

import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.List;

public class PackageStatisticModel {
    @C17952c(mo34828a = "ac")

    /* renamed from: ac */
    private String f29360ac;
    @C17952c(mo34828a = "access_key")
    private String accessKey;
    @C17952c(mo34828a = "active_check_duration")
    private Long activeCheckDuration;
    @C17952c(mo34828a = "apply_duration")
    private Long applyDuration;
    @C17952c(mo34828a = "channel")
    private String channel;
    @C17952c(mo34828a = "clean_duration")
    private Long cleanDuration;
    @C17952c(mo34828a = "clean_strategy")
    private Integer cleanStrategy;
    @C17952c(mo34828a = "clean_type")
    private Integer cleanType;
    @C17952c(mo34828a = "download_duration")
    private Long downloadDuration;
    @C17952c(mo34828a = "download_fail_records")
    private List<C10946a> downloadFailRecords;
    @C17952c(mo34828a = "download_retry_times")
    private Integer downloadRetryTimes;
    @C17952c(mo34828a = "download_url")
    private String downloadUrl;
    @C17952c(mo34828a = "err_code")
    private String errCode;
    @C17952c(mo34828a = "err_msg")
    private String errMsg;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private Integer f29361id;
    @C17952c(mo34828a = "log_id")
    private String logId;
    @C17952c(mo34828a = "patch_id")
    private Integer patchId;
    @C17952c(mo34828a = "stats_type")
    private Integer statsType;

    /* renamed from: com.bytedance.ies.geckoclient.model.PackageStatisticModel$a */
    public static class C10946a {
        @C17952c(mo34828a = "domain")

        /* renamed from: a */
        public String f29362a;
        @C17952c(mo34828a = "reason")

        /* renamed from: b */
        public String f29363b;

        public C10946a(String str, String str2) {
            this.f29362a = str;
            this.f29363b = str2;
        }
    }

    public String getChannel() {
        return this.channel;
    }

    public Integer getId() {
        return this.f29361id;
    }

    public List<C10946a> getDownloadFailRecords() {
        if (this.downloadFailRecords == null) {
            this.downloadFailRecords = new ArrayList();
        }
        return this.downloadFailRecords;
    }

    public void setAc(String str) {
        this.f29360ac = str;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setActiveCheckDuration(Long l) {
        this.activeCheckDuration = l;
    }

    public void setApplyDuration(Long l) {
        this.applyDuration = l;
    }

    public void setChannel(String str) {
        this.channel = str;
    }

    public void setCleanDuration(Long l) {
        this.cleanDuration = l;
    }

    public void setCleanStrategy(Integer num) {
        this.cleanStrategy = num;
    }

    public void setCleanType(Integer num) {
        this.cleanType = num;
    }

    public void setDownloadDuration(Long l) {
        this.downloadDuration = l;
    }

    public void setDownloadFailRecords(List<C10946a> list) {
        this.downloadFailRecords = list;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setErrCode(String str) {
        this.errCode = str;
    }

    public void setErrMsg(String str) {
        this.errMsg = str;
    }

    public void setId(Integer num) {
        this.f29361id = num;
    }

    public void setLogId(String str) {
        this.logId = str;
    }

    public void setPatchId(Integer num) {
        this.patchId = num;
    }

    public void setStatsType(Integer num) {
        this.statsType = num;
    }

    public void setDownloadRetryTimes(int i) {
        this.downloadRetryTimes = Integer.valueOf(i);
    }
}
