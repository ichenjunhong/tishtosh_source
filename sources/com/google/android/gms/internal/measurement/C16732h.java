package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.analytics.C15096j;
import com.google.android.gms.common.internal.C15464q;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: com.google.android.gms.internal.measurement.h */
public final class C16732h extends C15096j<C16732h> {

    /* renamed from: a */
    public String f47073a;

    /* renamed from: b */
    public int f47074b;

    /* renamed from: c */
    public String f47075c;

    /* renamed from: d */
    private int f47076d;

    /* renamed from: e */
    private String f47077e;

    /* renamed from: f */
    private boolean f47078f;

    /* renamed from: g */
    private boolean f47079g;

    public C16732h() {
        this(false);
    }

    private C16732h(boolean z) {
        UUID randomUUID = UUID.randomUUID();
        int leastSignificantBits = (int) (randomUUID.getLeastSignificantBits() & 2147483647L);
        if (leastSignificantBits == 0) {
            leastSignificantBits = (int) (randomUUID.getMostSignificantBits() & 2147483647L);
            if (leastSignificantBits == 0) {
                leastSignificantBits = Integer.MAX_VALUE;
            }
        }
        this(false, leastSignificantBits);
    }

    private C16732h(boolean z, int i) {
        C15464q.m32122a(i);
        this.f47074b = i;
        this.f47079g = false;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", this.f47073a);
        hashMap.put("interstitial", Boolean.valueOf(this.f47078f));
        hashMap.put("automatic", Boolean.valueOf(this.f47079g));
        hashMap.put("screenId", Integer.valueOf(this.f47074b));
        hashMap.put("referrerScreenId", Integer.valueOf(this.f47076d));
        hashMap.put("referrerScreenName", this.f47077e);
        hashMap.put("referrerUri", this.f47075c);
        return m31258a((Object) hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27841a(C15096j jVar) {
        C16732h hVar = (C16732h) jVar;
        if (!TextUtils.isEmpty(this.f47073a)) {
            hVar.f47073a = this.f47073a;
        }
        if (this.f47074b != 0) {
            hVar.f47074b = this.f47074b;
        }
        if (this.f47076d != 0) {
            hVar.f47076d = this.f47076d;
        }
        if (!TextUtils.isEmpty(this.f47077e)) {
            hVar.f47077e = this.f47077e;
        }
        if (!TextUtils.isEmpty(this.f47075c)) {
            String str = this.f47075c;
            if (TextUtils.isEmpty(str)) {
                hVar.f47075c = null;
            } else {
                hVar.f47075c = str;
            }
        }
        if (this.f47078f) {
            hVar.f47078f = this.f47078f;
        }
        if (this.f47079g) {
            hVar.f47079g = this.f47079g;
        }
    }
}
