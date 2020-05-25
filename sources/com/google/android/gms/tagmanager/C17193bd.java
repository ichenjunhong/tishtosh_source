package com.google.android.gms.tagmanager;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: com.google.android.gms.tagmanager.bd */
final class C17193bd implements ComponentCallbacks2 {

    /* renamed from: a */
    private final /* synthetic */ C17207d f48613a;

    C17193bd(C17207d dVar) {
        this.f48613a = dVar;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20) {
            this.f48613a.f48646b.mo33439a();
        }
    }
}
