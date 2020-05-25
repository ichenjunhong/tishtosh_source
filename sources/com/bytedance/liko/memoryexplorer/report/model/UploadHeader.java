package com.bytedance.liko.memoryexplorer.report.model;

public class UploadHeader {
    public int aid = 4444;
    public String app_version = "102";
    public String channel = "localtest";
    public String config_time;
    public String current_update_version_code;
    public int debug_fetch;
    public String device_brand;
    public String device_id = "48144545262";
    public String device_manufacturer;
    public String device_model;
    public String device_platform = "android";
    public String monitor_version = "5.0.0-rc.3-alpha.90-SNAPSHOT";

    /* renamed from: os */
    public String f32449os = "Android";
    public int os_api;
    public String os_version;
    public String process_name;
    public String region = "CN";
    public long sid = System.currentTimeMillis();
    public int uid;
    public String update_version_code = "10212";
    public int version_code = 1;
    public String version_name = "1.0";

    public UploadHeader() {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        this.config_time = sb.toString();
        this.current_update_version_code = "10212";
        this.debug_fetch = 0;
        this.uid = 123;
    }
}
