package com.bytedance.ies.geckoclient.model;

import com.google.gson.p1076a.C17952c;

public class CommonParamsModel {
    @C17952c(mo34828a = "app_version")
    private String app_version;
    @C17952c(mo34828a = "device_id")
    private String device_id;
    @C17952c(mo34828a = "device_model")
    private String device_model;
    @C17952c(mo34828a = "os")

    /* renamed from: os */
    private int f29359os;
    @C17952c(mo34828a = "region")
    private String region;
    @C17952c(mo34828a = "sdk_version")
    private String sdk_version;

    public CommonParamsModel() {
    }

    public String getApp_version() {
        return this.app_version;
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public String getDevice_model() {
        return this.device_model;
    }

    public int getOs() {
        return this.f29359os;
    }

    public String getRegion() {
        return this.region;
    }

    public String getSdk_version() {
        return this.sdk_version;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommonParamsModel{device_id='");
        sb.append(this.device_id);
        sb.append('\'');
        sb.append(", os=");
        sb.append(this.f29359os);
        sb.append(", region='");
        sb.append(this.region);
        sb.append('\'');
        sb.append(", app_version='");
        sb.append(this.app_version);
        sb.append('\'');
        sb.append(", sdk_version='");
        sb.append(this.sdk_version);
        sb.append('\'');
        sb.append(", device_model='");
        sb.append(this.device_model);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setApp_version(String str) {
        this.app_version = str;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setDevice_model(String str) {
        this.device_model = str;
    }

    public void setOs(int i) {
        this.f29359os = i;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setSdk_version(String str) {
        this.sdk_version = str;
    }

    public CommonParamsModel(String str, int i, String str2, String str3, String str4, String str5) {
        this.device_id = str;
        this.f29359os = i;
        this.region = str2;
        this.app_version = str3;
        this.sdk_version = str4;
        this.device_model = str5;
    }
}
