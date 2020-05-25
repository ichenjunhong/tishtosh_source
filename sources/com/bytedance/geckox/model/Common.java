package com.bytedance.geckox.model;

import android.os.Build;
import android.os.Build.VERSION;
import com.google.gson.p1076a.C17952c;

public class Common {
    @C17952c(mo34828a = "ac")

    /* renamed from: ac */
    private String f27431ac;
    @C17952c(mo34828a = "aid")
    private long aid;
    @C17952c(mo34828a = "app_name")
    private String appName;
    @C17952c(mo34828a = "app_version")
    private String appVersion;
    @C17952c(mo34828a = "device_id")
    private String deviceId;
    @C17952c(mo34828a = "device_model")
    private String deviceModel = Build.MODEL;
    @C17952c(mo34828a = "device_platform")
    private String devicePlatform = "android";
    @C17952c(mo34828a = "os")

    /* renamed from: os */
    private int f27432os;
    @C17952c(mo34828a = "os_version")
    private String osVersion;
    @C17952c(mo34828a = "region")
    private String region;
    @C17952c(mo34828a = "sdk_version")
    private String sdkVersion = "2.0.1-rc.8";
    @C17952c(mo34828a = "uid")
    private String uid;

    public Common(long j, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(VERSION.SDK_INT);
        this.osVersion = sb.toString();
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f27431ac = str4;
    }

    public Common(long j, String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb = new StringBuilder();
        sb.append(VERSION.SDK_INT);
        this.osVersion = sb.toString();
        this.aid = j;
        this.appVersion = str;
        this.deviceId = str2;
        this.appName = str3;
        this.f27431ac = str4;
        this.uid = str5;
        this.region = str6;
    }
}
