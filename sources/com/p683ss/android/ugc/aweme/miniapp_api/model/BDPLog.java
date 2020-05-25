package com.p683ss.android.ugc.aweme.miniapp_api.model;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.BDPLog */
public class BDPLog {
    @C17952c(mo34828a = "biz_location")
    public String bizLocation;
    @C17952c(mo34828a = "group_id")
    public String groupId;
    @C17952c(mo34828a = "launch_from")
    public String launchFrom;
    @C17952c(mo34828a = "location")
    public String location;
    @C17952c(mo34828a = "ttid")
    public String ttid;

    public BDPLog() {
    }

    public BDPLog(String str, String str2, String str3) {
        this.launchFrom = str;
        this.location = str2;
        this.groupId = str3;
    }
}
