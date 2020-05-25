package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.measurement.fk */
final /* synthetic */ class C16683fk implements OnSharedPreferenceChangeListener {

    /* renamed from: a */
    private final C16682fj f46927a;

    C16683fk(C16682fj fjVar) {
        this.f46927a = fjVar;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        C16682fj fjVar = this.f46927a;
        synchronized (fjVar.f46922b) {
            fjVar.f46923c = null;
            C16675fc.m39833a();
        }
        synchronized (fjVar) {
            Iterator it = fjVar.f46924d.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
