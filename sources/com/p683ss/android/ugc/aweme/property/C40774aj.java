package com.p683ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0198r;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.property.aj */
public final class C40774aj implements C40815t {

    /* renamed from: a */
    private final C0198r<C40829x> f103877a;

    /* renamed from: b */
    private final C0198r<C40803n> f103878b;

    /* renamed from: c */
    private final C40803n f103879c;

    /* renamed from: d */
    private final C0198r<Integer> f103880d;

    /* renamed from: e */
    private final C0198r<String> f103881e;

    /* renamed from: f */
    private final String f103882f = "VESDK";

    /* renamed from: a */
    public final C0198r<C40829x> mo83082a() {
        return this.f103877a;
    }

    /* renamed from: b */
    public final C0198r<C40803n> mo83083b() {
        return this.f103878b;
    }

    /* renamed from: c */
    public final C40803n mo83084c() {
        return this.f103879c;
    }

    /* renamed from: d */
    public final C0198r<Integer> mo83085d() {
        return this.f103880d;
    }

    /* renamed from: e */
    public final C0198r<String> mo83086e() {
        return this.f103881e;
    }

    /* renamed from: f */
    public final String mo83087f() {
        return this.f103882f;
    }

    public C40774aj(ABAndSettingViewModel aBAndSettingViewModel) {
        C52711k.m112240b(aBAndSettingViewModel, "vm");
        this.f103877a = aBAndSettingViewModel.f103793b;
        this.f103878b = aBAndSettingViewModel.f103802k;
        this.f103879c = aBAndSettingViewModel.mo83030c();
        this.f103880d = aBAndSettingViewModel.f103796e;
        this.f103881e = aBAndSettingViewModel.f103805n;
    }
}
