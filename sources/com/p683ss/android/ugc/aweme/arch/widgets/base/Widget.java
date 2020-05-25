package com.p683ss.android.ugc.aweme.arch.widgets.base;

import android.app.Activity;
import android.arch.lifecycle.C0159aa;
import android.arch.lifecycle.C0160ab;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.Widget */
public abstract class Widget implements C0160ab, C0183j {

    /* renamed from: a */
    private boolean f62234a;

    /* renamed from: b */
    public Context f62235b;

    /* renamed from: c */
    protected View f62236c;

    /* renamed from: d */
    public View f62237d;

    /* renamed from: e */
    public DataCenter f62238e;

    /* renamed from: f */
    public C23273a f62239f;

    /* renamed from: g */
    boolean f62240g;

    /* renamed from: h */
    private C0159aa f62241h;

    /* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.Widget$a */
    protected interface C23273a {
        /* renamed from: a */
        Activity mo48244a();

        /* renamed from: a */
        void mo48245a(Intent intent, int i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo48238a() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo48239a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo48241a(View view) {
    }

    /* access modifiers changed from: protected */
    public boolean ci_() {
        return this.f62234a;
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
    }

    @C0200t(mo345a = C0177a.ON_START)
    public void onStart() {
    }

    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Activity mo48242c() {
        return this.f62239f.mo48244a();
    }

    public C0159aa getViewModelStore() {
        if (this.f62241h == null) {
            this.f62241h = new C0159aa();
        }
        return this.f62241h;
    }

    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
        this.f62234a = true;
        this.f62240g = false;
        mo48241a(this.f62237d);
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f62234a = false;
        this.f62240g = true;
        if (this.f62241h != null) {
            this.f62241h.mo301a();
        }
    }

    /* renamed from: a */
    public final void mo48240a(Intent intent, int i) {
        this.f62239f.mo48245a(intent, i);
    }
}
