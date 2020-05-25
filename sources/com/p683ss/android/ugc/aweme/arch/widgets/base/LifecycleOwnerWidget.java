package com.p683ss.android.ugc.aweme.arch.widgets.base;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.base.LifecycleOwnerWidget */
public class LifecycleOwnerWidget extends Widget implements C0184k {

    /* renamed from: a */
    C0185l f62233a = new C0185l(this);

    public C0176h getLifecycle() {
        return this.f62233a;
    }

    public void onCreate() {
        super.onCreate();
        this.f62233a.mo332a(C0177a.ON_CREATE);
    }

    public void onDestroy() {
        this.f62233a.mo332a(C0177a.ON_DESTROY);
        super.onDestroy();
    }

    public void onPause() {
        this.f62233a.mo332a(C0177a.ON_PAUSE);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.f62233a.mo332a(C0177a.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        this.f62233a.mo332a(C0177a.ON_START);
    }

    public void onStop() {
        this.f62233a.mo332a(C0177a.ON_STOP);
        super.onStop();
    }
}
