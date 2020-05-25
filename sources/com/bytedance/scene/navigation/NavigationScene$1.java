package com.bytedance.scene.navigation;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;

public class NavigationScene$1 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C0184k f33873a;

    /* renamed from: b */
    final /* synthetic */ C12941c f33874b;

    /* renamed from: c */
    final /* synthetic */ C12942d f33875c;

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f33873a.getLifecycle().mo325b(this);
        this.f33875c.f33894p.remove(this.f33874b);
    }

    public NavigationScene$1(C12942d dVar, C0184k kVar, C12941c cVar) {
        this.f33875c = dVar;
        this.f33873a = kVar;
        this.f33874b = cVar;
    }
}
