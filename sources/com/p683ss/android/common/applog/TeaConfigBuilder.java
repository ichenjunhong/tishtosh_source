package com.p683ss.android.common.applog;

import android.content.Context;
import android.os.Bundle;
import com.p683ss.android.common.C18846a;
import com.p683ss.android.common.applog.AppLog.ILogEncryptConfig;
import com.p683ss.android.common.applog.AppLog.LogRequestTraceCallback;
import com.p683ss.android.common.applog.p1142a.C18869a;

/* renamed from: com.ss.android.common.applog.TeaConfigBuilder */
public class TeaConfigBuilder {
    private boolean anonymous;
    private C18846a appContext;
    private boolean autoActiveUser;
    private Context context;
    private Bundle customerHeader;
    private ILogEncryptConfig encryptConfig;
    private InternationalConfig internationalConfig;
    private LogRequestTraceCallback mLogTraceCallback;
    private boolean needAntiCheating;
    private String releaseBuild;
    private boolean reportCrash = true;
    private TeaStorageConfig storageConfig;
    private C18869a taskCallback;
    private UrlConfig urlConfig;

    private TeaConfigBuilder() {
    }

    public TeaConfig build() {
        TeaUtils.ensureNonNull(this.context, "context");
        TeaUtils.ensureNonNull(this.urlConfig, "urlConfig");
        TeaUtils.ensureNonNull(this.appContext, "appContext");
        TeaConfig teaConfig = new TeaConfig(this.appContext, this.storageConfig, this.releaseBuild, this.customerHeader, this.encryptConfig, this.reportCrash, this.needAntiCheating, this.context, this.autoActiveUser, this.urlConfig, this.internationalConfig, this.mLogTraceCallback, this.taskCallback, this.anonymous);
        return teaConfig;
    }

    public TeaConfigBuilder setAnonymous(boolean z) {
        this.anonymous = z;
        return this;
    }

    public TeaConfigBuilder setCustomerHeader(Bundle bundle) {
        this.customerHeader = bundle;
        return this;
    }

    public TeaConfigBuilder setEncryptConfig(ILogEncryptConfig iLogEncryptConfig) {
        this.encryptConfig = iLogEncryptConfig;
        return this;
    }

    public TeaConfigBuilder setInternationalConfig(InternationalConfig internationalConfig2) {
        this.internationalConfig = internationalConfig2;
        return this;
    }

    public TeaConfigBuilder setLogRequestTraceCallback(LogRequestTraceCallback logRequestTraceCallback) {
        this.mLogTraceCallback = logRequestTraceCallback;
        return this;
    }

    public TeaConfigBuilder setNeedAntiCheating(boolean z) {
        this.needAntiCheating = z;
        return this;
    }

    public TeaConfigBuilder setReleaseBuild(String str) {
        this.releaseBuild = str;
        return this;
    }

    public TeaConfigBuilder setReportCrash(boolean z) {
        this.reportCrash = z;
        return this;
    }

    public TeaConfigBuilder setStorageConfig(TeaStorageConfig teaStorageConfig) {
        this.storageConfig = teaStorageConfig;
        return this;
    }

    public TeaConfigBuilder setTaskCallback(C18869a aVar) {
        this.taskCallback = aVar;
        return this;
    }

    public static TeaConfigBuilder create(Context context2, boolean z, UrlConfig urlConfig2, C18846a aVar) {
        TeaConfigBuilder teaConfigBuilder = new TeaConfigBuilder();
        teaConfigBuilder.context = context2;
        teaConfigBuilder.urlConfig = urlConfig2;
        teaConfigBuilder.autoActiveUser = z;
        teaConfigBuilder.appContext = aVar;
        return teaConfigBuilder;
    }
}
