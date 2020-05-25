package com.bytedance.android.livesdkapi;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Intent;
import android.support.p030v4.app.FragmentActivity;

public class LiveActivityProxy implements C0183j {

    /* renamed from: d */
    public FragmentActivity f23571d;

    /* renamed from: a */
    public void mo10029a(int i, int i2, Intent intent) {
    }

    /* access modifiers changed from: protected */
    @C0200t(mo345a = C0177a.ON_CREATE)
    public void onCreate() {
    }

    /* access modifiers changed from: protected */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
    }

    /* access modifiers changed from: protected */
    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPause() {
    }

    /* access modifiers changed from: protected */
    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onResume() {
    }

    /* access modifiers changed from: protected */
    @C0200t(mo345a = C0177a.ON_START)
    public void onStart() {
    }

    /* access modifiers changed from: protected */
    @C0200t(mo345a = C0177a.ON_STOP)
    public void onStop() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final Intent mo15092b() {
        if (this.f23571d != null) {
            return this.f23571d.getIntent();
        }
        return null;
    }

    public LiveActivityProxy(FragmentActivity fragmentActivity) {
        this.f23571d = fragmentActivity;
        this.f23571d.getLifecycle().mo324a(this);
    }
}
