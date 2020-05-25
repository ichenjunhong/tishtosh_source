package com.bytedance.liko.memoryexplorer;

import com.bytedance.liko.memoryexplorer.analyse.trace.AndroidExcludeRefs;
import com.bytedance.liko.memoryexplorer.analyse.trace.ExcludedRefs;
import com.bytedance.liko.memoryexplorer.analyse.trace.ExcludedRefs.Builder;
import com.bytedance.liko.memoryexplorer.android.AndroidOS;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.mat.json.JSONArray;
import org.eclipse.mat.json.JSONException;
import org.eclipse.mat.json.JSONObject;

public class MemoryConfig {
    private static MemoryConfig sConfig = null;
    private static JSONObject sJsonConfig = new JSONObject();
    public String SERVERURL;
    public String SERVERURL_PREFIX_NORMAL = "https://i.snssdk.com/";
    public String SERVERURL_PREFIX_OVERSEA = "https://api2.musical.ly/";
    public String SERVERURL_SUFFIX = "monitor/collect/c/exception";
    public final String adbPath;
    public int aid;
    public final String app_version;
    public final boolean bigObjectFilterSystem;
    public final int bigObjectLatitude;
    public final long bitmapLatitude;
    public final int bitmapMinSize;
    public final String channel;
    public final boolean deleteDumpFile;
    public final List<String> detectedClasses = new LinkedList();
    public final String device_brand;
    public final String device_id;
    public final String device_manufacturer;
    public final String device_model;
    public final String dumpFilePath;
    final int dumpHprofWaitTime;
    final boolean dumpSelf;
    final boolean enableMonkey;
    public ExcludedRefs excludedRefs = null;
    public final String mainActivity;
    public final String mappingFilePath;
    public final String monkeyCommand;
    public final boolean objectInstanceFilterSystem;
    public final int objectInstanceLatitude;
    public final int os_api;
    public final String os_version;
    public boolean oversea;
    public final String packageName;
    final int pullHprofWaitTime;
    public final String region;
    public int strategy;
    public final boolean supportBigObjectAnalysis;
    public final boolean supportBitmapAnalysis;
    public final boolean supportObjectInstanceAnalysis;
    public final String update_versioncode;
    public final boolean uploadToSlardar;
    public final String versionName;
    public int versioncode;

    public JSONObject getJsonConfig() {
        return sJsonConfig;
    }

    public static MemoryConfig getMemoryConfig() {
        if (sConfig == null) {
            sConfig = new MemoryConfig(sJsonConfig);
        }
        return sConfig;
    }

    /* access modifiers changed from: 0000 */
    public boolean canRunMonkey() {
        if (this.monkeyCommand == null || this.monkeyCommand.length() <= 0) {
            return false;
        }
        return true;
    }

    public static MemoryConfig changeMemoryConfig(JSONObject jSONObject) {
        if (jSONObject != null) {
            sJsonConfig = jSONObject;
            sConfig = new MemoryConfig(sJsonConfig);
        }
        return sConfig;
    }

    public static void initJsonConfig(String str) {
        try {
            sJsonConfig = new JSONObject(str);
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void buildExcludeRefs(JSONArray jSONArray) {
        Builder builder = new Builder();
        builder.thread("FinalizerWatchdogDaemon");
        builder.thread("main");
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                parseExcludeRef(builder, jSONArray.optJSONObject(i));
            }
        }
        AndroidExcludeRefs.buildSystemExcludeRefs(builder);
        this.excludedRefs = builder.build();
    }

    private MemoryConfig(JSONObject jSONObject) {
        this.oversea = jSONObject.optBoolean("oversea", false);
        if (this.oversea) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.SERVERURL_PREFIX_OVERSEA);
            sb.append(this.SERVERURL_SUFFIX);
            this.SERVERURL = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.SERVERURL_PREFIX_NORMAL);
            sb2.append(this.SERVERURL_SUFFIX);
            this.SERVERURL = sb2.toString();
        }
        this.adbPath = jSONObject.optString("adbPath");
        this.mappingFilePath = jSONObject.optString("mappingFilePath", "");
        this.strategy = jSONObject.optInt("strategy", 0);
        this.aid = jSONObject.optInt("aid", C23018b.f61359a);
        this.channel = jSONObject.optString("channel", "local_test");
        this.device_id = jSONObject.optString("device_id", "");
        this.app_version = jSONObject.optString("app_version", "");
        this.update_versioncode = jSONObject.optString("update_version_code", "");
        this.packageName = jSONObject.optString("process_name", "com.ss.android.ugc.trill");
        this.versionName = jSONObject.optString("version_name", "9.8");
        this.versioncode = jSONObject.optInt("version_code", 9700);
        this.region = jSONObject.optString("region", "feizhou");
        this.mainActivity = jSONObject.optString("mainActivity");
        this.monkeyCommand = jSONObject.optString("monkeyCommand");
        this.dumpSelf = jSONObject.optBoolean("dumpSelf", false);
        this.uploadToSlardar = jSONObject.optBoolean("uploadToSlardar", true);
        this.dumpHprofWaitTime = jSONObject.optInt("dump_hprof_wait_time", 20);
        this.pullHprofWaitTime = jSONObject.optInt("pull_hprof_wait_time", 60);
        this.enableMonkey = jSONObject.optBoolean("enableMonkey", false);
        this.dumpFilePath = jSONObject.optString("dumpFilePath", "");
        this.deleteDumpFile = jSONObject.optBoolean("delete_dump_file", false);
        this.os_version = jSONObject.optString("os_version", AndroidOS.RELEASE);
        this.os_api = jSONObject.optInt("os_api", AndroidOS.SDK_INT);
        this.device_model = jSONObject.optString("device_model", AndroidOS.MODEL);
        this.device_brand = jSONObject.optString("device_brand", AndroidOS.MANUFACTURER);
        this.device_manufacturer = jSONObject.optString("device_manufacturer", AndroidOS.MANUFACTURER);
        this.supportBigObjectAnalysis = jSONObject.optBoolean("supportBigObjectAnalysis", true);
        this.bigObjectFilterSystem = jSONObject.optBoolean("bigObjectFilterSystem", true);
        this.bigObjectLatitude = jSONObject.optInt("bigObjectLatitude", 3);
        this.supportObjectInstanceAnalysis = jSONObject.optBoolean("supportObjectInstanceAnalysis", true);
        this.objectInstanceFilterSystem = jSONObject.optBoolean("objectInstanceFilterSystem", true);
        this.objectInstanceLatitude = jSONObject.optInt("objectInstanceLatitude", 10);
        this.supportBitmapAnalysis = jSONObject.optBoolean("supportBitmapAnalysis", true);
        this.bitmapLatitude = jSONObject.optLong("bitmapLatitude", 204800);
        JSONArray optJSONArray = jSONObject.optJSONArray("detect_leak_classes");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                this.detectedClasses.add(optJSONArray.optString(i));
            }
        } else {
            this.detectedClasses.add("android.app.Activity");
            this.detectedClasses.add("android.app.Fragment");
            this.detectedClasses.add("android.support.v4.app.Fragment");
        }
        this.bitmapMinSize = jSONObject.optInt("bitmapMinSize", 500);
        buildExcludeRefs(jSONObject.optJSONArray("excludedRefs"));
    }

    private static void parseExcludeRef(Builder builder, JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("class");
            String optString2 = jSONObject.optString("type");
            JSONArray optJSONArray = jSONObject.optJSONArray("fields");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString3 = optJSONArray.optString(i);
                    if ("static".equalsIgnoreCase(optString2)) {
                        builder.staticField(optString, optString3);
                    } else {
                        builder.instanceField(optString, optString3);
                    }
                }
            }
        }
    }
}
