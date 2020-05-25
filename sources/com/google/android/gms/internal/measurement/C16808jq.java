package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C15096j;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.jq */
public final class C16808jq extends C15096j<C16808jq> {

    /* renamed from: a */
    public String f47209a;

    /* renamed from: b */
    public String f47210b;

    /* renamed from: c */
    public String f47211c;

    /* renamed from: d */
    public String f47212d;

    /* renamed from: a */
    public final void mo27841a(C16808jq jqVar) {
        if (!TextUtils.isEmpty(this.f47209a)) {
            jqVar.f47209a = this.f47209a;
        }
        if (!TextUtils.isEmpty(this.f47210b)) {
            jqVar.f47210b = this.f47210b;
        }
        if (!TextUtils.isEmpty(this.f47211c)) {
            jqVar.f47211c = this.f47211c;
        }
        if (!TextUtils.isEmpty(this.f47212d)) {
            jqVar.f47212d = this.f47212d;
        }
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.f47209a);
        hashMap.put("appVersion", this.f47210b);
        hashMap.put("appId", this.f47211c);
        hashMap.put("appInstallerId", this.f47212d);
        return m31258a((Object) hashMap);
    }
}
