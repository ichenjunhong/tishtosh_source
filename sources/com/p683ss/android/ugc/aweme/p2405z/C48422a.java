package com.p683ss.android.ugc.aweme.p2405z;

import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.EPlatformSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.z.a */
public final class C48422a {

    /* renamed from: a */
    public static final C48422a f121784a = new C48422a();

    private C48422a() {
    }

    /* renamed from: b */
    public static final String m104774b() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            EPlatformSettings ePlatformSettings = b.getEPlatformSettings();
            C52711k.m112236a((Object) ePlatformSettings, "SettingsReader.get().ePlatformSettings");
            return ePlatformSettings.getBlockHint();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static final String m104775c() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            EPlatformSettings ePlatformSettings = b.getEPlatformSettings();
            C52711k.m112236a((Object) ePlatformSettings, "SettingsReader.get().ePlatformSettings");
            return ePlatformSettings.getJumpRedirectUrl();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static final List<String> m104773a() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            EPlatformSettings ePlatformSettings = b.getEPlatformSettings();
            C52711k.m112236a((Object) ePlatformSettings, "SettingsReader.get().ePlatformSettings");
            List<String> jumpBlockList = ePlatformSettings.getJumpBlockList();
            C52711k.m112236a((Object) jumpBlockList, "SettingsReader.get().ePl…ormSettings.jumpBlockList");
            return jumpBlockList;
        } catch (Exception unused) {
            return C52575l.m112097a();
        }
    }

    /* renamed from: d */
    public static final int m104776d() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            EPlatformSettings ePlatformSettings = b.getEPlatformSettings();
            C52711k.m112236a((Object) ePlatformSettings, "SettingsReader.get().ePlatformSettings");
            Integer blockMode = ePlatformSettings.getBlockMode();
            C52711k.m112236a((Object) blockMode, "SettingsReader.get().ePlatformSettings.blockMode");
            return blockMode.intValue();
        } catch (Exception unused) {
            return 1;
        }
    }
}
