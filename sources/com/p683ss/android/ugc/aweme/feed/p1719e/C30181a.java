package com.p683ss.android.ugc.aweme.feed.p1719e;

import android.app.Activity;
import android.content.Context;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.uikit.base.C11079a;

/* renamed from: com.ss.android.ugc.aweme.feed.e.a */
public class C30181a {

    /* renamed from: c */
    protected Activity f78758c;

    /* renamed from: d */
    protected Fragment f78759d;

    /* renamed from: e */
    public String f78760e;

    /* renamed from: f */
    public int f78761f;

    /* renamed from: g */
    protected String f78762g;

    /* renamed from: h */
    public String f78763h = "click";

    /* renamed from: i */
    public boolean f78764i;

    /* renamed from: b */
    public void mo60468b() {
        this.f78758c = null;
    }

    /* renamed from: c */
    public Activity mo60470c() {
        return this.f78758c;
    }

    /* renamed from: d */
    public Context mo60471d() {
        return this.f78758c;
    }

    /* renamed from: e */
    public Fragment mo60472e() {
        return this.f78759d;
    }

    /* renamed from: f */
    public String mo60473f() {
        return this.f78762g;
    }

    /* renamed from: k */
    public String mo60476k() {
        return this.f78760e;
    }

    /* renamed from: i */
    public final boolean mo60474i() {
        C11079a aVar = (C11079a) mo60472e();
        if (aVar != null) {
            return aVar.isViewValid();
        }
        if (this.f78758c == null || this.f78758c.isFinishing()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C0654k mo60475j() {
        C11079a aVar = (C11079a) mo60472e();
        if (aVar == null && (this.f78758c instanceof FragmentActivity)) {
            return ((FragmentActivity) this.f78758c).getSupportFragmentManager();
        }
        if (aVar == null) {
            return null;
        }
        return aVar.getChildFragmentManager();
    }

    /* renamed from: b_ */
    public void mo60469b_(String str) {
        this.f78762g = str;
    }

    /* renamed from: a */
    public void mo52903a(Activity activity, Fragment fragment) {
        this.f78758c = activity;
        this.f78759d = fragment;
    }

    public C30181a(String str, int i) {
        this.f78760e = str;
        this.f78761f = i;
    }
}
