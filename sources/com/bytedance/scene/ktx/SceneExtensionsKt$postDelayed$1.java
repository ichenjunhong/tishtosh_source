package com.bytedance.scene.ktx;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;

public final class SceneExtensionsKt$postDelayed$1 implements C0183j {

    /* renamed from: a */
    final /* synthetic */ Runnable f33861a;

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onDestroy() {
        C12932b.m25975a().removeCallbacks(this.f33861a);
    }

    SceneExtensionsKt$postDelayed$1(Runnable runnable) {
        this.f33861a = runnable;
    }
}
