package com.p683ss.android.ugc.aweme.shortvideo;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.LiveData;
import android.support.p030v4.p038f.C0777a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel */
public class ShortVideoContextViewModel extends C0209x {

    /* renamed from: a */
    public ShortVideoContext f107134a;

    /* renamed from: b */
    public C0198r<Boolean> f107135b;

    /* renamed from: c */
    public C0198r<Boolean> f107136c;

    /* renamed from: d */
    public C0198r<Double> f107137d;

    /* renamed from: e */
    public C0198r<Boolean> f107138e;

    /* renamed from: f */
    private C0777a<String, Object> f107139f = new C0777a<>();

    /* renamed from: g */
    private C0198r<Boolean> f107140g;

    /* renamed from: h */
    private C0198r<Boolean> f107141h;

    /* renamed from: i */
    private C0198r<Void> f107142i;

    /* renamed from: g */
    public final LiveData<Boolean> mo86398g() {
        if (this.f107141h == null) {
            this.f107141h = new C0198r<>();
        }
        return this.f107141h;
    }

    /* renamed from: h */
    public final LiveData<Boolean> mo86399h() {
        if (this.f107138e == null) {
            this.f107138e = new C0198r<>();
        }
        return this.f107138e;
    }

    /* renamed from: b */
    public final boolean mo86389b() {
        Boolean bool = (Boolean) mo86382a("photo_mode");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo86391c() {
        Boolean bool = (Boolean) mo86382a("has_stopped");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* renamed from: d */
    public final double mo86392d() {
        Double d = (Double) mo86382a("record_speed");
        if (d != null) {
            return d.doubleValue();
        }
        return 1.0d;
    }

    /* renamed from: e */
    public final C0198r<Boolean> mo86394e() {
        if (this.f107140g == null) {
            this.f107140g = new C0198r<>();
            this.f107140g.setValue(Boolean.valueOf(true));
        }
        return this.f107140g;
    }

    /* renamed from: f */
    public final C0198r<Void> mo86396f() {
        if (this.f107142i == null) {
            this.f107142i = new C0198r<>();
            this.f107142i.setValue(null);
        }
        return this.f107142i;
    }

    /* renamed from: a */
    public final boolean mo86387a() {
        Boolean bool = (Boolean) mo86382a("auto_count_down");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public final Object mo86382a(String str) {
        return this.f107139f.get(str);
    }

    /* renamed from: a */
    public final void mo86383a(int i) {
        mo86385a("shoot_mode", Integer.valueOf(i));
    }

    /* renamed from: b */
    public final void mo86388b(boolean z) {
        mo86385a("photo_mode", Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo86390c(boolean z) {
        mo86385a("native_inited", Boolean.valueOf(z));
    }

    /* renamed from: e */
    public final void mo86395e(boolean z) {
        mo86385a("has_go_next", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo86384a(long j) {
        mo86385a("auto_stop_time", Long.valueOf(j));
    }

    /* renamed from: d */
    public final void mo86393d(boolean z) {
        mo86394e().setValue(Boolean.valueOf(z));
        mo86385a("has_stopped", Boolean.valueOf(z));
    }

    /* renamed from: f */
    public final void mo86397f(boolean z) {
        if (this.f107141h == null) {
            this.f107141h = new C0198r<>();
        }
        this.f107141h.setValue(Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo86386a(boolean z) {
        mo86385a("auto_count_down", Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo86385a(String str, Object obj) {
        this.f107139f.put(str, obj);
    }
}
