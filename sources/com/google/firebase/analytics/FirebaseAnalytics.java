package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.measurement.internal.C17005ay;
import com.google.android.gms.measurement.internal.C17038cd;
import com.google.android.gms.measurement.internal.C17050cp;
import com.google.android.gms.measurement.internal.C17051cq;
import com.google.android.gms.measurement.internal.C17102em;
import com.google.android.gms.measurement.internal.C17108es;
import com.google.android.gms.measurement.internal.C17128m;
import com.google.firebase.iid.FirebaseInstanceId;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;

public final class FirebaseAnalytics {

    /* renamed from: a */
    private static volatile FirebaseAnalytics f49609a;

    /* renamed from: b */
    private final C17005ay f49610b;

    /* renamed from: c */
    private final Object f49611c = new Object();

    public static FirebaseAnalytics getInstance(Context context) {
        if (f49609a == null) {
            synchronized (FirebaseAnalytics.class) {
                if (f49609a == null) {
                    f49609a = new FirebaseAnalytics(C17005ay.m41256a(context, (C17128m) null));
                }
            }
        }
        return f49609a;
    }

    /* renamed from: a */
    public final void mo34671a(String str, Bundle bundle) {
        C17038cd d = this.f49610b.f47969h.f47848a.mo32925d();
        d.mo32992a("app", str, bundle, false, true, d.mo32849l().mo28523a());
    }

    public final void setCurrentScreen(Activity activity, String str, String str2) {
        if (!C17108es.m41769a()) {
            this.f49610b.mo32854q().f48448e.mo33376a("setCurrentScreen must be called from the main thread");
            return;
        }
        C17051cq i = this.f49610b.mo32930i();
        if (i.f48120b == null) {
            i.mo32854q().f48448e.mo33376a("setCurrentScreen cannot be called while no activity active");
        } else if (i.f48122d.get(activity) == null) {
            i.mo32854q().f48448e.mo33376a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = C17051cq.m41393a(activity.getClass().getCanonicalName());
            }
            boolean equals = i.f48120b.f48116b.equals(str2);
            boolean c = C17102em.m41671c(i.f48120b.f48115a, str);
            if (equals && c) {
                i.mo32854q().f48450g.mo33376a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                i.mo32854q().f48448e.mo33377a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 == null || (str2.length() > 0 && str2.length() <= 100)) {
                i.mo32854q().f48453j.mo33378a("Setting current screen to name, class", str == null ? TEVideoRecorder.FACE_BEAUTY_NULL : str, str2);
                C17050cp cpVar = new C17050cp(str, str2, i.mo32852o().mo33153f());
                i.f48122d.put(activity, cpVar);
                i.mo33019a(activity, cpVar, true);
            } else {
                i.mo32854q().f48448e.mo33377a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            }
        }
    }

    /* renamed from: a */
    public final void mo34670a(String str) {
        this.f49610b.f47969h.mo32790a("app", "_id", str);
    }

    private FirebaseAnalytics(C17005ay ayVar) {
        C15464q.m32123a(ayVar);
        this.f49610b = ayVar;
    }

    public final String getFirebaseInstanceId() {
        FirebaseInstanceId.m43841a().mo34719b();
        return FirebaseInstanceId.m43845d();
    }
}
