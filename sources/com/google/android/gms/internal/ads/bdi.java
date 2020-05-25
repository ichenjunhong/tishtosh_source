package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.support.customtabs.C0367b;
import android.support.customtabs.C0376d;
import java.lang.ref.WeakReference;

public final class bdi extends C0376d {

    /* renamed from: a */
    private WeakReference<bdj> f41938a;

    public bdi(bdj bdj) {
        this.f41938a = new WeakReference<>(bdj);
    }

    /* renamed from: a */
    public final void mo866a(ComponentName componentName, C0367b bVar) {
        bdj bdj = (bdj) this.f41938a.get();
        if (bdj != null) {
            bdj.mo30063a(bVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        bdj bdj = (bdj) this.f41938a.get();
        if (bdj != null) {
            bdj.mo30062a();
        }
    }
}
