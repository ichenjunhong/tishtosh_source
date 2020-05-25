package com.p683ss.android.ugc.aweme.protection.antiaddiction;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.f */
public final class C40853f {

    /* renamed from: a */
    public static String f104016a;

    /* renamed from: b */
    public static final C40853f f104017b = new C40853f();

    private C40853f() {
    }

    /* renamed from: a */
    public static final boolean m90345a() {
        IESSettingsProxy b = C32816h.m75716b();
        C52711k.m112236a((Object) b, "SettingsReader.get()");
        Integer antiAddictionDayTime = b.getAntiAddictionDayTime();
        IESSettingsProxy b2 = C32816h.m75716b();
        C52711k.m112236a((Object) b2, "SettingsReader.get()");
        Integer antiAddictionNightTime = b2.getAntiAddictionNightTime();
        String a = C10193n.m20607a().mo18203a(TiktokAntiAddictionPopupTextSetting.class, "anti_addiction_pop_up_text", C10181b.m20511a().mo18175c().getAntiAddictionPopUpText(), "");
        C52711k.m112236a((Object) a, "SettingsManager.getInsta…pTextSetting::class.java)");
        if (antiAddictionDayTime == null || antiAddictionNightTime == null || C52711k.m112230a(antiAddictionDayTime.intValue(), 0) <= 0 || C52711k.m112230a(antiAddictionNightTime.intValue(), 0) <= 0 || TextUtils.isEmpty(a)) {
            return false;
        }
        return true;
    }
}
