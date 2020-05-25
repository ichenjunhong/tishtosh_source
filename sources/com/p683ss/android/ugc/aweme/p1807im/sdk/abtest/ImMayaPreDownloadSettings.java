package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.p620a.C10179b;
import com.bytedance.ies.abmock.settings.SettingsKey;
import p2628d.p2639f.p2641b.C52711k;

@SettingsKey
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImMayaPreDownloadSettings */
public final class ImMayaPreDownloadSettings {
    public static final ImMayaPreDownloadSettings INSTANCE = new ImMayaPreDownloadSettings();
    @C10179b
    private static final XDownloadConfig config = null;

    private ImMayaPreDownloadSettings() {
    }

    public final XDownloadConfig getConfig() {
        return config;
    }

    public final XDownloadConfig getXDownloadConfig() {
        try {
            Object a = C10193n.m20607a().mo18202a(ImMayaPreDownloadSettings.class, "im_x_download", C10181b.m20511a().mo18175c().getImXDownload(), "com.ss.android.ugc.aweme.im.sdk.abtest.XDownloadConfig", XDownloadConfig.class);
            C52711k.m112236a(a, "SettingsManager.getInsta…loadSettings::class.java)");
            return (XDownloadConfig) a;
        } catch (Throwable unused) {
            return new XDownloadConfig(5, true);
        }
    }
}
