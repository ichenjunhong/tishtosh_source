package com.bytedance.scene.group;

import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;

/* renamed from: com.bytedance.scene.group.h */
final class C12920h implements C0184k {

    /* renamed from: a */
    private C0185l f33821a;

    C12920h() {
    }

    public final C0176h getLifecycle() {
        m25901a();
        return this.f33821a;
    }

    /* renamed from: a */
    private void m25901a() {
        if (this.f33821a == null) {
            this.f33821a = new C0185l(this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24449a(C0177a aVar) {
        m25901a();
        this.f33821a.mo332a(aVar);
    }
}
