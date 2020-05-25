package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.C15098l;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15514e;

/* renamed from: com.google.android.gms.internal.measurement.q */
public class C16859q {

    /* renamed from: b */
    public final C16862t f47329b;

    protected C16859q(C16862t tVar) {
        C15464q.m32123a(tVar);
        this.f47329b = tVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C15514e mo32504f() {
        return this.f47329b.f47336c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final Context mo32506g() {
        return this.f47329b.f47334a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C16568bl mo32507h() {
        return this.f47329b.mo32518a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C16550au mo32508i() {
        return this.f47329b.f47337d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C15098l mo32509j() {
        return this.f47329b.mo32519b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C16849l mo32510k() {
        return this.f47329b.mo32520c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C16555az mo32511l() {
        C16862t tVar = this.f47329b;
        C16862t.m40964a((C16860r) tVar.f47339f);
        return tVar.f47339f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final C16586cc mo32512m() {
        return this.f47329b.mo32522e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final C16574br mo32513n() {
        C16862t tVar = this.f47329b;
        C16862t.m40964a((C16860r) tVar.f47340g);
        return tVar.f47340g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final C16542am mo32514o() {
        return this.f47329b.mo32523f();
    }

    /* renamed from: b */
    public final void mo32493b(String str) {
        mo32489a(2, str, null, null, null);
    }

    /* renamed from: a */
    public final void mo32490a(String str, Object obj) {
        mo32489a(2, str, obj, null, null);
    }

    /* renamed from: a */
    public final void mo32491a(String str, Object obj, Object obj2) {
        mo32489a(2, str, obj, obj2, null);
    }

    /* renamed from: c */
    public final void mo32497c(String str) {
        mo32489a(3, str, null, null, null);
    }

    /* renamed from: b */
    public final void mo32494b(String str, Object obj) {
        mo32489a(3, str, obj, null, null);
    }

    /* renamed from: b */
    public final void mo32495b(String str, Object obj, Object obj2) {
        mo32489a(3, str, obj, obj2, null);
    }

    /* renamed from: a */
    public final void mo32492a(String str, Object obj, Object obj2, Object obj3) {
        mo32489a(3, str, obj, obj2, obj3);
    }

    /* renamed from: d */
    public final void mo32500d(String str) {
        mo32489a(4, str, null, null, null);
    }

    /* renamed from: e */
    public final void mo32503e(String str) {
        mo32489a(5, str, null, null, null);
    }

    /* renamed from: c */
    public final void mo32498c(String str, Object obj) {
        mo32489a(5, str, obj, null, null);
    }

    /* renamed from: c */
    public final void mo32499c(String str, Object obj, Object obj2) {
        mo32489a(5, str, obj, obj2, null);
    }

    /* renamed from: b */
    public final void mo32496b(String str, Object obj, Object obj2, Object obj3) {
        mo32489a(5, str, obj, obj2, obj3);
    }

    /* renamed from: f */
    public final void mo32505f(String str) {
        mo32489a(6, str, null, null, null);
    }

    /* renamed from: d */
    public final void mo32501d(String str, Object obj) {
        mo32489a(6, str, obj, null, null);
    }

    /* renamed from: d */
    public final void mo32502d(String str, Object obj, Object obj2) {
        mo32489a(6, str, obj, obj2, null);
    }

    /* renamed from: p */
    public static boolean m40932p() {
        return Log.isLoggable((String) C16559bc.f46522b.f46547a, 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo32489a(int i, String str, Object obj, Object obj2, Object obj3) {
        C16568bl blVar = this.f47329b != null ? this.f47329b.f47338e : null;
        if (blVar != null) {
            if (Log.isLoggable((String) C16559bc.f46522b.f46547a, i)) {
                C16568bl.m40931c(str, obj, obj2, obj3);
            }
            if (i >= 5) {
                blVar.mo31828b(i, str, obj, obj2, obj3);
            }
            return;
        }
        if (Log.isLoggable((String) C16559bc.f46522b.f46547a, i)) {
            m40931c(str, obj, obj2, obj3);
        }
    }

    /* renamed from: c */
    protected static String m40931c(String str, Object obj, Object obj2, Object obj3) {
        if (str == null) {
            str = "";
        }
        String a = m40930a(obj);
        String a2 = m40930a(obj2);
        String a3 = m40930a(obj3);
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
    private static String m40930a(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            return obj == Boolean.TRUE ? "true" : "false";
        }
        if (obj instanceof Throwable) {
            return ((Throwable) obj).toString();
        }
        return obj.toString();
    }
}
