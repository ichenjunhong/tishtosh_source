package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;
import com.google.android.gms.measurement.AppMeasurement;

/* renamed from: com.google.android.gms.measurement.internal.r */
public final class C17133r extends C17029bv {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public long f48444a = -1;

    /* renamed from: b */
    public final C17135t f48445b = new C17135t(this, 6, false, false);

    /* renamed from: c */
    public final C17135t f48446c = new C17135t(this, 6, true, false);

    /* renamed from: d */
    public final C17135t f48447d = new C17135t(this, 6, false, true);

    /* renamed from: e */
    public final C17135t f48448e = new C17135t(this, 5, false, false);

    /* renamed from: f */
    public final C17135t f48449f = new C17135t(this, 5, true, false);

    /* renamed from: g */
    public final C17135t f48450g = new C17135t(this, 5, false, true);

    /* renamed from: h */
    public final C17135t f48451h = new C17135t(this, 4, false, false);

    /* renamed from: i */
    public final C17135t f48452i = new C17135t(this, 3, false, false);

    /* renamed from: j */
    public final C17135t f48453j = new C17135t(this, 2, false, false);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public char f48454k;

    /* renamed from: l */
    private String f48455l;

    C17133r(C17005ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo32871d() {
        return false;
    }

    /* renamed from: a */
    protected static Object m41997a(String str) {
        if (str == null) {
            return null;
        }
        return new C17136u(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33373a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && mo33374a(i)) {
            m41999a(false, str, obj, obj2, obj3);
        }
        if (!z2 && i >= 5) {
            C15464q.m32123a(str);
            C17000at atVar = this.f48052r.f47968g;
            if (atVar != null && atVar.mo32979v()) {
                if (i < 0) {
                    i = 0;
                }
                C17134s sVar = new C17134s(this, i >= 9 ? 8 : i, str, obj, obj2, obj3);
                atVar.mo32912a((Runnable) sVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo33374a(int i) {
        return Log.isLoggable(m42002f(), i);
    }

    /* renamed from: f */
    private final String m42002f() {
        String str;
        synchronized (this) {
            if (this.f48455l == null) {
                if (this.f48052r.f47964c != null) {
                    this.f48455l = this.f48052r.f47964c;
                } else {
                    this.f48455l = C17110eu.m41770d();
                }
            }
            str = this.f48455l;
        }
        return str;
    }

    /* renamed from: a */
    static String m41999a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String a = m41998a(z, obj);
        String a2 = m41998a(z, obj2);
        String a3 = m41998a(z, obj3);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str2);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m41998a(boolean z, Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 43 + String.valueOf(str).length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b = m42001b(AppMeasurement.class.getCanonicalName());
                String b2 = m42001b(C17005ay.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i];
                    if (!stackTraceElement.isNativeMethod()) {
                        String className = stackTraceElement.getClassName();
                        if (className != null) {
                            String b3 = m42001b(className);
                            if (b3.equals(b) || b3.equals(b2)) {
                                sb2.append(": ");
                                sb2.append(stackTraceElement);
                            }
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                return sb2.toString();
            } else if (obj instanceof C17136u) {
                return ((C17136u) obj).f48466a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }

    /* renamed from: b */
    private static String m42001b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: Q_ */
    public final String mo33372Q_() {
        long j;
        Pair<String, Long> pair;
        C16990aj ajVar = mo32855r().f47874c;
        ajVar.f47905d.mo32840c();
        ajVar.f47905d.mo32840c();
        long b = ajVar.mo32885b();
        if (b == 0) {
            ajVar.mo32884a();
            j = 0;
        } else {
            j = Math.abs(b - ajVar.f47905d.mo32849l().mo28523a());
        }
        if (j >= ajVar.f47904c) {
            if (j > (ajVar.f47904c << 1)) {
                ajVar.mo32884a();
            } else {
                String string = ajVar.f47905d.mo32873f().getString(ajVar.f47903b, null);
                long j2 = ajVar.f47905d.mo32873f().getLong(ajVar.f47902a, 0);
                ajVar.mo32884a();
                if (string == null || j2 <= 0) {
                    pair = C16986af.f47872a;
                } else {
                    pair = new Pair<>(string, Long.valueOf(j2));
                }
                if (pair != null || pair == C16986af.f47872a) {
                    return null;
                }
                String valueOf = String.valueOf(pair.second);
                String str = (String) pair.first;
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
                sb.append(valueOf);
                sb.append(":");
                sb.append(str);
                return sb.toString();
            }
        }
        pair = null;
        if (pair != null) {
        }
        return null;
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
