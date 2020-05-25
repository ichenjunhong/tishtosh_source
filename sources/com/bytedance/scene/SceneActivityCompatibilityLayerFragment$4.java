package com.bytedance.scene;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import com.bytedance.scene.navigation.C12940b;

class SceneActivityCompatibilityLayerFragment$4 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ C0184k f33600a;

    /* renamed from: b */
    final /* synthetic */ C12940b f33601b;

    /* renamed from: c */
    final /* synthetic */ C12929j f33602c;

    /* access modifiers changed from: 0000 */
    @C0200t(mo345a = C0177a.ON_DESTROY)
    public void onDestroy() {
        this.f33600a.getLifecycle().mo325b(this);
        this.f33602c.f33858c.remove(this.f33601b);
    }
}
