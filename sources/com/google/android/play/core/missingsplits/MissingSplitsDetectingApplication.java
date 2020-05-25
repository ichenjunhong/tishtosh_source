package com.google.android.play.core.missingsplits;

import android.app.Application;

public class MissingSplitsDetectingApplication extends Application {

    /* renamed from: a */
    private boolean f48898a;

    public final void onCreate() {
        if (!this.f48898a) {
            this.f48898a = true;
            if (!new C17382d(this, Runtime.getRuntime(), new C17381c(this, getPackageManager()), C17380b.f48899a).mo33678a()) {
                super.onCreate();
                return;
            }
            return;
        }
        throw new IllegalStateException("The onCreate method must be invoked at most once.");
    }
}
