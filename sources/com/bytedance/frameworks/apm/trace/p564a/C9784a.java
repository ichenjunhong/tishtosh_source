package com.bytedance.frameworks.apm.trace.p564a;

import android.app.Activity;
import com.bytedance.apm.p476c.C8977a;

/* renamed from: com.bytedance.frameworks.apm.trace.a.a */
public abstract class C9784a extends C8977a implements C9788c {

    /* renamed from: b */
    private volatile boolean f26630b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo17626a() {
    }

    /* renamed from: a */
    public final void mo16218a(Activity activity) {
    }

    /* renamed from: b */
    public final void mo16221b(Activity activity) {
    }

    /* renamed from: c */
    public final void mo16273c(Activity activity) {
    }

    /* renamed from: d */
    public final void mo16274d(Activity activity) {
    }

    /* renamed from: b */
    public final synchronized void mo17627b() {
        if (!this.f26630b) {
            this.f26630b = true;
            mo17626a();
        }
    }
}
