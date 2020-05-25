package com.bytedance.opensdk.core.p811c.p812a;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.opensdk.core.c.a.d */
public final class C12517d {
    @C17952c(mo34828a = "app_id")

    /* renamed from: a */
    public final String f32860a;
    @C17952c(mo34828a = "app_name")

    /* renamed from: b */
    public final String f32861b;
    @C17952c(mo34828a = "app_icon")

    /* renamed from: c */
    public final String f32862c;
    @C17952c(mo34828a = "code")

    /* renamed from: d */
    public final String f32863d;
    @C17952c(mo34828a = "platform_app_id")

    /* renamed from: e */
    public final String f32864e;
    @C17952c(mo34828a = "platform")

    /* renamed from: f */
    public final String f32865f;
    @C17952c(mo34828a = "sync_history")

    /* renamed from: g */
    public final boolean f32866g;

    public C12517d() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public C12517d(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        C52711k.m112240b(str, "appId");
        C52711k.m112240b(str2, "appName");
        C52711k.m112240b(str3, "appIcon");
        C52711k.m112240b(str4, "code");
        C52711k.m112240b(str5, "platformAppId");
        C52711k.m112240b(str6, "platform");
        this.f32860a = str;
        this.f32861b = str2;
        this.f32862c = str3;
        this.f32863d = str4;
        this.f32864e = str5;
        this.f32865f = str6;
        this.f32866g = z;
    }

    private /* synthetic */ C12517d(String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, C52707g gVar) {
        this("", "", "", "", "", "", false);
    }
}
