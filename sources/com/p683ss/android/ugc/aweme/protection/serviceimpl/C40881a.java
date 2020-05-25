package com.p683ss.android.ugc.aweme.protection.serviceimpl;

import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40853f;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.TiktokAntiAddictionPopupTextSetting;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.protection.serviceimpl.a */
public final class C40881a extends C40882b {
    /* renamed from: d */
    public final boolean mo83193d() {
        return C40853f.m90345a();
    }

    /* renamed from: f */
    public final String mo83195f() {
        String str = C40853f.f104016a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: e */
    public final String mo83194e() {
        String a = C10193n.m20607a().mo18203a(TiktokAntiAddictionPopupTextSetting.class, "anti_addiction_pop_up_text", C10181b.m20511a().mo18175c().getAntiAddictionPopUpText(), "");
        C52711k.m112236a((Object) a, "SettingsManager.getInsta…pTextSetting::class.java)");
        return a;
    }
}
