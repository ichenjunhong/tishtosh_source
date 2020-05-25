package com.bytedance.scene.navigation;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;

class NavigationScene$2 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C0184k f33876a;

    /* renamed from: b */
    final /* synthetic */ C12961g f33877b;

    /* renamed from: c */
    final /* synthetic */ C12942d f33878c;

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f33876a.getLifecycle().mo325b(this);
        this.f33878c.f33889k.mo24538a(this.f33877b);
    }

    NavigationScene$2(C12942d dVar, C0184k kVar, C12961g gVar) {
        this.f33878c = dVar;
        this.f33876a = kVar;
        this.f33877b = gVar;
    }
}
