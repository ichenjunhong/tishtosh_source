package com.p683ss.android.ugc.aweme.base.activity;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.base.activity.CrashCreateChatRequestBean */
public class CrashCreateChatRequestBean {
    public int aid;
    @C17952c(mo34828a = "build_type")
    public String buildType;
    public String channel;
    public String commit;
    public String did;
    @C17952c(mo34828a = "jenkins_build_result")
    public String jenkinsBuildResult;
    @C17952c(mo34828a = "stark_trace")
    public String starkTrace;
    @C17952c(mo34828a = "user_email")
    public String userEmail;

    public CrashCreateChatRequestBean(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7) {
        this.starkTrace = str;
        this.userEmail = str2;
        this.aid = i;
        this.channel = str3;
        this.jenkinsBuildResult = str4;
        this.buildType = str5;
        this.commit = str6;
        this.did = str7;
    }
}
