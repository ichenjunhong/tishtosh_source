package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.p */
public final class C17131p extends C17029bv {

    /* renamed from: a */
    private static final AtomicReference<String[]> f48441a = new AtomicReference<>();

    /* renamed from: b */
    private static final AtomicReference<String[]> f48442b = new AtomicReference<>();

    /* renamed from: c */
    private static final AtomicReference<String[]> f48443c = new AtomicReference<>();

    C17131p(C17005ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32871d() {
        return false;
    }

    /* renamed from: f */
    private final boolean m41971f() {
        return this.f48052r.mo32929h() && this.f48052r.mo32854q().mo33374a(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33369a(String str) {
        if (str == null) {
            return null;
        }
        if (!m41971f()) {
            return str;
        }
        return m41970a(str, C17031bx.f48055b, C17031bx.f48054a, f48441a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo33370b(String str) {
        if (str == null) {
            return null;
        }
        if (!m41971f()) {
            return str;
        }
        return m41970a(str, C17032by.f48057b, C17032by.f48056a, f48442b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo33371c(String str) {
        if (str == null) {
            return null;
        }
        if (!m41971f()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m41970a(str, C17033bz.f48059b, C17033bz.f48058a, f48443c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m41970a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C15464q.m32123a(strArr);
        C15464q.m32123a(strArr2);
        C15464q.m32123a(atomicReference);
        C15464q.m32133b(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C17102em.m41671c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr2[i]);
                        sb.append("(");
                        sb.append(strArr[i]);
                        sb.append(")");
                        strArr3[i] = sb.toString();
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33368a(zzag zzag) {
        if (zzag == null) {
            return null;
        }
        if (!m41971f()) {
            return zzag.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzag.f48477c);
        sb.append(",name=");
        sb.append(mo33369a(zzag.f48475a));
        sb.append(",params=");
        sb.append(m41969a(zzag.f48476b));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33367a(C17034c cVar) {
        if (cVar == null) {
            return null;
        }
        if (!m41971f()) {
            return cVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Event{appId='");
        sb.append(cVar.f48060a);
        sb.append("', name='");
        sb.append(mo33369a(cVar.f48061b));
        sb.append("', params=");
        sb.append(m41969a(cVar.f48064e));
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private final String m41969a(zzad zzad) {
        if (zzad == null) {
            return null;
        }
        if (!m41971f()) {
            return zzad.toString();
        }
        return mo33366a(zzad.mo33384b());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo33366a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m41971f()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        for (String str : bundle.keySet()) {
            if (sb.length() != 0) {
                sb.append(", ");
            } else {
                sb.append("Bundle[{");
            }
            sb.append(mo33370b(str));
            sb.append("=");
            sb.append(bundle.get(str));
        }
        sb.append("}]");
        return sb.toString();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo32834a() {
        super.mo32834a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo32838b() {
        super.mo32838b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo32840c() {
        super.mo32840c();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C17007b mo32848k() {
        return super.mo32848k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15514e mo32849l() {
        return super.mo32849l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo32850m() {
        return super.mo32850m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C17131p mo32851n() {
        return super.mo32851n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C17102em mo32852o() {
        return super.mo32852o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C17000at mo32853p() {
        return super.mo32853p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C17133r mo32854q() {
        return super.mo32854q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16986af mo32855r() {
        return super.mo32855r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C17110eu mo32856s() {
        return super.mo32856s();
    }
}
