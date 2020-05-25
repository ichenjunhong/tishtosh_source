package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.c */
public final class C17034c {

    /* renamed from: a */
    final String f48060a;

    /* renamed from: b */
    final String f48061b;

    /* renamed from: c */
    final long f48062c;

    /* renamed from: d */
    final long f48063d;

    /* renamed from: e */
    final zzad f48064e;

    /* renamed from: f */
    private final String f48065f;

    private C17034c(C17005ay ayVar, String str, String str2, String str3, long j, long j2, zzad zzad) {
        C15464q.m32125a(str2);
        C15464q.m32125a(str3);
        C15464q.m32123a(zzad);
        this.f48060a = str2;
        this.f48061b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f48065f = str;
        this.f48062c = j;
        this.f48063d = j2;
        if (this.f48063d != 0 && this.f48063d > this.f48062c) {
            ayVar.mo32854q().f48448e.mo33378a("Event created with reverse previous/current timestamps. appId, name", C17133r.m41997a(str2), C17133r.m41997a(str3));
        }
        this.f48064e = zzad;
    }

    C17034c(C17005ay ayVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzad zzad;
        C15464q.m32125a(str2);
        C15464q.m32125a(str3);
        this.f48060a = str2;
        this.f48061b = str3;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f48065f = str;
        this.f48062c = j;
        this.f48063d = j2;
        if (this.f48063d != 0 && this.f48063d > this.f48062c) {
            ayVar.mo32854q().f48448e.mo33377a("Event created with reverse previous/current timestamps. appId", C17133r.m41997a(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzad = new zzad(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (str4 == null) {
                    ayVar.mo32854q().f48445b.mo33376a("Param name can't be null");
                    it.remove();
                } else {
                    ayVar.mo32926e();
                    Object a = C17102em.m41657a(str4, bundle2.get(str4));
                    if (a == null) {
                        ayVar.mo32854q().f48448e.mo33377a("Param value can't be null", ayVar.mo32927f().mo33370b(str4));
                        it.remove();
                    } else {
                        ayVar.mo32926e().mo33143a(bundle2, str4, a);
                    }
                }
            }
            zzad = new zzad(bundle2);
        }
        this.f48064e = zzad;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17034c mo32983a(C17005ay ayVar, long j) {
        C17034c cVar = new C17034c(ayVar, this.f48065f, this.f48060a, this.f48061b, this.f48062c, j, this.f48064e);
        return cVar;
    }

    public final String toString() {
        String str = this.f48060a;
        String str2 = this.f48061b;
        String valueOf = String.valueOf(this.f48064e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("Event{appId='");
        sb.append(str);
        sb.append("', name='");
        sb.append(str2);
        sb.append("', params=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
