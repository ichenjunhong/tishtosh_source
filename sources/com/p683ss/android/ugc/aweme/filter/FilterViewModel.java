package com.p683ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.filter.FilterViewModel */
public class FilterViewModel extends C0209x {

    /* renamed from: a */
    private C0198r<Object> f82207a;

    /* renamed from: b */
    private C0198r<C52847n<C31459g, String>> f82208b;

    /* renamed from: c */
    private C0198r<C31459g> f82209c;

    /* renamed from: d */
    private C0198r<Boolean> f82210d;

    /* renamed from: a */
    public final C0198r<Object> mo64286a() {
        if (this.f82207a == null) {
            this.f82207a = new C0198r<>();
        }
        return this.f82207a;
    }

    /* renamed from: b */
    public final C0198r<C52847n<C31459g, String>> mo64287b() {
        if (this.f82208b == null) {
            this.f82208b = new C0198r<>();
        }
        return this.f82208b;
    }

    /* renamed from: c */
    public final C0198r<C31459g> mo64288c() {
        if (this.f82209c == null) {
            this.f82209c = new C0198r<>();
        }
        return this.f82209c;
    }

    /* renamed from: d */
    private C0198r<Boolean> m73164d() {
        if (this.f82210d == null) {
            this.f82210d = new C0198r<>();
            this.f82210d.setValue(Boolean.valueOf(C39629l.m88232a().mo58574e().mo83117a(C40796a.DisableFilter)));
        }
        return this.f82210d;
    }

    /* renamed from: a */
    public static void m73161a(AppCompatActivity appCompatActivity, C31459g gVar) {
        m73162a(appCompatActivity, gVar, null);
    }

    /* renamed from: a */
    public static void m73163a(AppCompatActivity appCompatActivity, Boolean bool) {
        ((FilterViewModel) C0214z.m440a((FragmentActivity) appCompatActivity).mo359a(FilterViewModel.class)).m73164d().setValue(bool);
    }

    /* renamed from: a */
    private static void m73162a(AppCompatActivity appCompatActivity, C31459g gVar, String str) {
        ((FilterViewModel) C0214z.m440a((FragmentActivity) appCompatActivity).mo359a(FilterViewModel.class)).mo64287b().setValue(new C52847n(gVar, null));
    }
}
