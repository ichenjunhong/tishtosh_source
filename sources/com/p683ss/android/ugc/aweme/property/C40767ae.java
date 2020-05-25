package com.p683ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0198r;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.property.ae */
public final class C40767ae implements C40815t {

    /* renamed from: a */
    private final C0198r<C40829x> f103859a;

    /* renamed from: b */
    private final C0198r<C40803n> f103860b;

    /* renamed from: c */
    private final C40803n f103861c;

    /* renamed from: d */
    private final C0198r<Integer> f103862d;

    /* renamed from: e */
    private final C0198r<String> f103863e;

    /* renamed from: f */
    private final String f103864f = "Setting";

    /* renamed from: a */
    public final C0198r<C40829x> mo83082a() {
        return this.f103859a;
    }

    /* renamed from: b */
    public final C0198r<C40803n> mo83083b() {
        return this.f103860b;
    }

    /* renamed from: c */
    public final C40803n mo83084c() {
        return this.f103861c;
    }

    /* renamed from: d */
    public final C0198r<Integer> mo83085d() {
        return this.f103862d;
    }

    /* renamed from: e */
    public final C0198r<String> mo83086e() {
        return this.f103863e;
    }

    /* renamed from: f */
    public final String mo83087f() {
        return this.f103864f;
    }

    public C40767ae(ABAndSettingViewModel aBAndSettingViewModel) {
        C52711k.m112240b(aBAndSettingViewModel, "vm");
        this.f103859a = aBAndSettingViewModel.f103793b;
        this.f103860b = aBAndSettingViewModel.f103801j;
        this.f103861c = aBAndSettingViewModel.mo83029b();
        this.f103862d = aBAndSettingViewModel.f103795d;
        this.f103863e = aBAndSettingViewModel.f103804m;
    }
}
