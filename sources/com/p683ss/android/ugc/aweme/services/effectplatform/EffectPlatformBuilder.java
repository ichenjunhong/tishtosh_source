package com.p683ss.android.ugc.aweme.services.effectplatform;

import android.content.Context;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48640a;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.effect.p2442a.C48693a;
import com.p683ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutorService;
import okhttp3.C53682y;

/* renamed from: com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder */
public class EffectPlatformBuilder {
    private String accessKey;
    private String appID;
    private String appLanguage;
    private String appVersion;
    private File cacheDir;
    private String channel;
    private String cityCode;
    private Context context;
    private C48693a effectFetcher;
    private C48640a effectNetWorker;
    private ExecutorService executorService;
    private List<Host> hosts;
    private C48641b jsonConverter;
    private String latitude;
    private String longitude;
    private C53682y okHttpClient;
    private String region;
    private Integer requestStrategy;
    private Integer retryCount;
    private String sdkVersion;
    private String systemLanguage;

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getAppID() {
        return this.appID;
    }

    public String getAppLanguage() {
        return this.appLanguage;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public File getCacheDir() {
        return this.cacheDir;
    }

    public String getChannel() {
        return this.channel;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public Context getContext() {
        return this.context;
    }

    public C48693a getEffectFetcher() {
        return this.effectFetcher;
    }

    public C48640a getEffectNetWorker() {
        return this.effectNetWorker;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public List<Host> getHosts() {
        return this.hosts;
    }

    public C48641b getJsonConverter() {
        return this.jsonConverter;
    }

    public String getLatitude() {
        return this.latitude;
    }

    public String getLongitude() {
        return this.longitude;
    }

    public C53682y getOkHttpClient() {
        return this.okHttpClient;
    }

    public String getRegion() {
        return this.region;
    }

    public Integer getRequestStrategy() {
        return this.requestStrategy;
    }

    public Integer getRetryCount() {
        return this.retryCount;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSystemLanguage() {
        return this.systemLanguage;
    }

    public EffectPlatformBuilder setAccessKey(String str) {
        this.accessKey = str;
        return this;
    }

    public EffectPlatformBuilder setAppID(String str) {
        this.appID = str;
        return this;
    }

    public EffectPlatformBuilder setAppLanguage(String str) {
        this.appLanguage = str;
        return this;
    }

    public EffectPlatformBuilder setAppVersion(String str) {
        this.appVersion = str;
        return this;
    }

    public EffectPlatformBuilder setCacheDir(File file) {
        this.cacheDir = file;
        return this;
    }

    public EffectPlatformBuilder setChannel(String str) {
        this.channel = str;
        return this;
    }

    public EffectPlatformBuilder setCityCode(String str) {
        this.cityCode = str;
        return this;
    }

    public EffectPlatformBuilder setContext(Context context2) {
        this.context = context2;
        return this;
    }

    public EffectPlatformBuilder setEffectFetcher(C48693a aVar) {
        this.effectFetcher = aVar;
        return this;
    }

    public EffectPlatformBuilder setEffectNetWorker(C48640a aVar) {
        this.effectNetWorker = aVar;
        return this;
    }

    public EffectPlatformBuilder setExecutorService(ExecutorService executorService2) {
        this.executorService = executorService2;
        return this;
    }

    public EffectPlatformBuilder setHosts(List<Host> list) {
        this.hosts = list;
        return this;
    }

    public EffectPlatformBuilder setJsonConverter(C48641b bVar) {
        this.jsonConverter = bVar;
        return this;
    }

    public EffectPlatformBuilder setLatitude(String str) {
        this.latitude = str;
        return this;
    }

    public EffectPlatformBuilder setLongitude(String str) {
        this.longitude = str;
        return this;
    }

    public EffectPlatformBuilder setOkHttpClient(C53682y yVar) {
        this.okHttpClient = yVar;
        return this;
    }

    public EffectPlatformBuilder setRegion(String str) {
        this.region = str;
        return this;
    }

    public EffectPlatformBuilder setRequestStrategy(Integer num) {
        this.requestStrategy = num;
        return this;
    }

    public EffectPlatformBuilder setRetryCount(Integer num) {
        this.retryCount = num;
        return this;
    }

    public EffectPlatformBuilder setSdkVersion(String str) {
        this.sdkVersion = str;
        return this;
    }

    public EffectPlatformBuilder setSystemLanguage(String str) {
        this.systemLanguage = str;
        return this;
    }
}
