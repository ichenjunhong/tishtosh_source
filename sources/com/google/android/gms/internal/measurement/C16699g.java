package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C15096j;
import com.google.android.gms.common.internal.C15464q;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.g */
public final class C16699g extends C15096j<C16699g> {

    /* renamed from: a */
    public String f46942a;

    /* renamed from: b */
    public String f46943b;

    /* renamed from: c */
    public String f46944c;

    /* renamed from: d */
    public String f46945d;

    /* renamed from: e */
    public boolean f46946e;

    /* renamed from: f */
    public String f46947f;

    /* renamed from: g */
    public boolean f46948g;

    /* renamed from: h */
    public double f46949h;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("hitType", this.f46942a);
        hashMap.put("clientId", this.f46943b);
        hashMap.put("userId", this.f46944c);
        hashMap.put("androidAdId", this.f46945d);
        hashMap.put("AdTargetingEnabled", Boolean.valueOf(this.f46946e));
        hashMap.put("sessionControl", this.f46947f);
        hashMap.put("nonInteraction", Boolean.valueOf(this.f46948g));
        hashMap.put("sampleRate", Double.valueOf(this.f46949h));
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final void mo32034a(boolean z) {
        this.f46948g = true;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        C16699g gVar = (C16699g) jVar;
        if (!TextUtils.isEmpty(this.f46942a)) {
            gVar.f46942a = this.f46942a;
        }
        if (!TextUtils.isEmpty(this.f46943b)) {
            gVar.f46943b = this.f46943b;
        }
        if (!TextUtils.isEmpty(this.f46944c)) {
            gVar.f46944c = this.f46944c;
        }
        if (!TextUtils.isEmpty(this.f46945d)) {
            gVar.f46945d = this.f46945d;
        }
        boolean z = true;
        if (this.f46946e) {
            gVar.f46946e = true;
        }
        if (!TextUtils.isEmpty(this.f46947f)) {
            gVar.f46947f = this.f46947f;
        }
        if (this.f46948g) {
            gVar.f46948g = this.f46948g;
        }
        if (this.f46949h != ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            double d = this.f46949h;
            if (d < ProfileUiInitOptimizeEnterThreshold.DEFAULT || d > 100.0d) {
                z = false;
            }
            C15464q.m32134b(z, "Sample rate must be between 0% and 100%");
            gVar.f46949h = d;
        }
    }
}
