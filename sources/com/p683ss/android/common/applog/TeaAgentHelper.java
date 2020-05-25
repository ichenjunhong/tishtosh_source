package com.p683ss.android.common.applog;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C9399e;
import com.bytedance.common.utility.C9423k;
import com.p683ss.android.common.applog.AppLog.ILogEncryptConfig;
import com.p683ss.android.common.applog.AppLog.LogRequestTraceCallback;
import com.p683ss.android.common.applog.NetUtil.IExtraParams;
import com.p683ss.android.common.applog.p1142a.C18869a;
import com.p683ss.android.common.applog.p1142a.C18872c;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.deviceregister.C19034d.C19035a;

/* renamed from: com.ss.android.common.applog.TeaAgentHelper */
public class TeaAgentHelper {
    public static void addOnDeviceConfigUpdateListener(C19035a aVar) {
        C19034d.m46317a(aVar);
    }

    public static void setExtraParams(IExtraParams iExtraParams) {
        NetUtil.setExtraparams(iExtraParams);
    }

    private static void initInternationalConfig(InternationalConfig internationalConfig) {
        if (internationalConfig != null) {
            String googleId = internationalConfig.getGoogleId();
            if (!TextUtils.isEmpty(googleId)) {
                AppLog.setGoogleAId(googleId);
            }
            AppLog.setAppLanguageAndRegion(internationalConfig.getLanguage(), internationalConfig.getRegion());
        }
    }

    static void init(TeaConfig teaConfig) {
        boolean z;
        TeaUtils.ensureNonNull(teaConfig, "config");
        if (!(C9423k.m18637a() instanceof C9399e)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AppLog.setAppContext(teaConfig.getAppContext());
            initStorageConfig(teaConfig.getStorageConfig(), teaConfig.getContext());
            initInternationalConfig(teaConfig.getInternationalConfig());
            String releaseBuild = teaConfig.getReleaseBuild();
            if (!TextUtils.isEmpty(releaseBuild)) {
                AppLog.setReleaseBuild(releaseBuild);
            }
            Bundle customerHeader = teaConfig.getCustomerHeader();
            if (customerHeader != null) {
                AppLog.setCustomerHeader(customerHeader);
            }
            ILogEncryptConfig encryptConfig = teaConfig.getEncryptConfig();
            if (encryptConfig != null) {
                AppLog.setLogEncryptConfig(encryptConfig);
            }
            AppLog.setReportCrash(teaConfig.isReportCrash());
            String c = teaConfig.getAppContext().mo20029c();
            if (!TextUtils.isEmpty(c)) {
                AppLog.setChannel(c);
                if (TextUtils.isEmpty(teaConfig.getContext().getPackageName())) {
                    throw new IllegalArgumentException("packageName from context can not be empty");
                } else if (!TextUtils.isEmpty(teaConfig.getAppContext().mo20035i())) {
                    AppLog.setNeedAntiCheating(teaConfig.isNeedAntiCheating());
                    LogRequestTraceCallback logRequestTraceCallback = teaConfig.getLogRequestTraceCallback();
                    if (logRequestTraceCallback != null) {
                        AppLog.registerLogRequestCallback(logRequestTraceCallback);
                    }
                    AppLog.setAnonymous(teaConfig.isAnonymous());
                    C18869a taskCallback = teaConfig.getTaskCallback();
                    if (taskCallback != null) {
                        C18872c.f52052k = taskCallback;
                    }
                    TeaThread.getInst();
                    C18872c.m45962a(teaConfig.getContext());
                    AppLog.init(teaConfig.getContext(), teaConfig.isAutoActiveUser(), teaConfig.getUrlConfig());
                } else {
                    throw new IllegalArgumentException("getVersion from appContext can not be empty");
                }
            } else {
                throw new IllegalArgumentException("channel in appContext can not be empty");
            }
        } else {
            throw new IllegalArgumentException("net work client is not set");
        }
    }

    public static void addNetCommonParams(StringBuilder sb, boolean z) {
        NetUtil.appendCommonParams(sb, z);
    }

    public static String addNetCommonParams(String str, boolean z) {
        return NetUtil.addCommonParams(str, z);
    }

    private static void initStorageConfig(TeaStorageConfig teaStorageConfig, Context context) {
        if (teaStorageConfig != null) {
            String spName = teaStorageConfig.getSpName();
            if (!TextUtils.isEmpty(spName)) {
                AppLog.setSPName(spName);
            }
            String dbName = teaStorageConfig.getDbName();
            if (!TextUtils.isEmpty(dbName)) {
                AppLog.setDBNamme(dbName);
            }
            Account account = teaStorageConfig.getAccount();
            if (account != null) {
                AppLog.setAccount(context, account);
            }
            String encryptCountSPName = teaStorageConfig.getEncryptCountSPName();
            if (!TextUtils.isEmpty(encryptCountSPName)) {
                AppLog.setEncryptCountSPName(encryptCountSPName);
            }
        }
    }
}
