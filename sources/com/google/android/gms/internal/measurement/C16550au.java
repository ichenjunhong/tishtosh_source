package com.google.android.gms.internal.measurement;

import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.util.C15526q;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.measurement.au */
public final class C16550au {

    /* renamed from: a */
    private final C16862t f46488a;

    /* renamed from: b */
    private volatile Boolean f46489b;

    /* renamed from: c */
    private String f46490c;

    /* renamed from: d */
    private Set<Integer> f46491d;

    protected C16550au(C16862t tVar) {
        C15464q.m32123a(tVar);
        this.f46488a = tVar;
    }

    /* renamed from: a */
    public final boolean mo31809a() {
        if (this.f46489b == null) {
            synchronized (this) {
                if (this.f46489b == null) {
                    ApplicationInfo applicationInfo = this.f46488a.f47334a.getApplicationInfo();
                    String a = C15526q.m32305a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.f46489b = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if ((this.f46489b == null || !this.f46489b.booleanValue()) && "com.google.android.gms.analytics".equals(a)) {
                        this.f46489b = Boolean.TRUE;
                    }
                    if (this.f46489b == null) {
                        this.f46489b = Boolean.TRUE;
                        this.f46488a.mo32518a().mo32505f("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.f46489b.booleanValue();
    }

    /* renamed from: b */
    public static boolean m39480b() {
        return ((Boolean) C16559bc.f46521a.f46547a).booleanValue();
    }

    /* renamed from: c */
    public static int m39481c() {
        return ((Integer) C16559bc.f46538r.f46547a).intValue();
    }

    /* renamed from: d */
    public static long m39482d() {
        return ((Long) C16559bc.f46526f.f46547a).longValue();
    }

    /* renamed from: e */
    public static long m39483e() {
        return ((Long) C16559bc.f46527g.f46547a).longValue();
    }

    /* renamed from: f */
    public static int m39484f() {
        return ((Integer) C16559bc.f46529i.f46547a).intValue();
    }

    /* renamed from: g */
    public static int m39485g() {
        return ((Integer) C16559bc.f46530j.f46547a).intValue();
    }

    /* renamed from: h */
    public static String m39486h() {
        return (String) C16559bc.f46532l.f46547a;
    }

    /* renamed from: i */
    public static String m39487i() {
        return (String) C16559bc.f46531k.f46547a;
    }

    /* renamed from: j */
    public static String m39488j() {
        return (String) C16559bc.f46533m.f46547a;
    }

    /* renamed from: k */
    public final Set<Integer> mo31810k() {
        String str = (String) C16559bc.f46541u.f46547a;
        if (this.f46491d == null || this.f46490c == null || !this.f46490c.equals(str)) {
            String[] split = TextUtils.split(str, ",");
            HashSet hashSet = new HashSet();
            for (String parseInt : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(parseInt)));
                } catch (NumberFormatException unused) {
                }
            }
            this.f46490c = str;
            this.f46491d = hashSet;
        }
        return this.f46491d;
    }

    /* renamed from: l */
    public static long m39489l() {
        return ((Long) C16559bc.f46545y.f46547a).longValue();
    }
}
