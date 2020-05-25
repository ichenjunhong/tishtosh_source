package com.p683ss.android.ugc.aweme.dmt_integration;

import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.effect.C29206k;
import com.p683ss.android.ugc.aweme.effect.p1679f.C29200c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.port.internal.C39654d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.j */
public final class C29018j implements C39654d {
    /* renamed from: b */
    public final String mo58631b() {
        String g = C39618d.m88218g();
        C52711k.m112236a((Object) g, "AVEnv.getEffectSDKVersion()");
        return g;
    }

    /* renamed from: a */
    public final String mo58630a() {
        String str = "142710f02c3a11e8b42429f14557854a";
        if (str.equals("142710f02c3a11e8b42429f14557854a")) {
            str = "142710f02c3a11e8b42429f14557854a";
        }
        C52711k.m112236a((Object) str, "AVEnv.getEffectPlatformAccessKey()");
        return str;
    }

    /* renamed from: c */
    public final int mo58632c() {
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        Integer editEffectAutoDownloadSize = b.getEditEffectAutoDownloadSize();
        C52711k.m112236a((Object) editEffectAutoDownloadSize, "SettingsReader.get().editEffectAutoDownloadSize");
        return editEffectAutoDownloadSize.intValue();
    }

    /* renamed from: d */
    public final List<String> mo58633d() {
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        List<String> filterColors = b.getFilterColors();
        C52711k.m112236a((Object) filterColors, "SettingsReader.get().filterColors");
        return filterColors;
    }

    /* renamed from: a */
    public final C29200c mo58629a(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        return new C29206k(fragmentActivity);
    }
}
