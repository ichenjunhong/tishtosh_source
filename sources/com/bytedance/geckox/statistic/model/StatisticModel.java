package com.bytedance.geckox.statistic.model;

import com.bytedance.geckox.model.Common;
import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import java.util.List;

public class StatisticModel {
    @C17952c(mo34828a = "common")
    public Common common;
    @C17952c(mo34828a = "packages")
    public List<PackageStatisticModel> packages = new ArrayList();

    public static class PackageStatisticModel {
        @C17952c(mo34828a = "ac")

        /* renamed from: ac */
        public String f27454ac;
        @C17952c(mo34828a = "access_key")
        public String accessKey;
        @C17952c(mo34828a = "active_check_duration")
        public Long activeCheckDuration;
        @C17952c(mo34828a = "apply_duration")
        public Long applyDuration;
        @C17952c(mo34828a = "channel")
        public String channel;
        @C17952c(mo34828a = "clean_duration")
        public Long cleanDuration;
        @C17952c(mo34828a = "clean_strategy")
        public Integer cleanStrategy;
        @C17952c(mo34828a = "clean_type")
        public Integer cleanType;
        @C17952c(mo34828a = "download_duration")
        public Long downloadDuration;
        @C17952c(mo34828a = "download_fail_records")
        public List<DownloadFailRecords> downloadFailRecords;
        @C17952c(mo34828a = "download_retry_times")
        public Integer downloadRetryTimes;
        @C17952c(mo34828a = "download_url")
        public String downloadUrl;
        @C17952c(mo34828a = "err_code")
        public String errCode;
        @C17952c(mo34828a = "err_msg")
        public String errMsg;
        @C17952c(mo34828a = "group_name")
        public String groupName;
        @C17952c(mo34828a = "id")

        /* renamed from: id */
        public Long f27455id;
        @C17952c(mo34828a = "log_id")
        public String logId;
        @C17952c(mo34828a = "patch_id")
        public Long patchId;
        @C17952c(mo34828a = "stats_type")
        public Integer statsType;

        public static class DownloadFailRecords {
            @C17952c(mo34828a = "domain")
            public String domain;
            @C17952c(mo34828a = "reason")
            public String reason;

            public DownloadFailRecords(String str, String str2) {
                this.domain = str;
                this.reason = str2;
            }
        }
    }
}
