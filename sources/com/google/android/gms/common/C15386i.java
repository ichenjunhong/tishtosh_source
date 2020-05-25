package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.internal.C15464q;
import com.google.android.gms.common.p1037d.C15377d;

/* renamed from: com.google.android.gms.common.i */
public class C15386i {

    /* renamed from: b */
    private static C15386i f39689b;

    /* renamed from: a */
    public final Context f39690a;

    private C15386i(Context context) {
        this.f39690a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C15386i m31967a(Context context) {
        C15464q.m32123a(context);
        synchronized (C15386i.class) {
            if (f39689b == null) {
                C15481n.m32204a(context);
                f39689b = new C15386i(context);
            }
        }
        return f39689b;
    }

    /* renamed from: a */
    public final boolean mo28332a(int i) {
        C15535w wVar;
        String[] packagesForUid = C15377d.m31951a(this.f39690a).f39657a.getPackageManager().getPackagesForUid(i);
        if (packagesForUid != null && packagesForUid.length != 0) {
            wVar = null;
            for (String a : packagesForUid) {
                wVar = m31969a(a, i);
                if (wVar.f40013b) {
                    break;
                }
            }
        } else {
            wVar = C15535w.m32328a("no pkgs");
        }
        if (!wVar.f40013b && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th = wVar.f40014c;
        }
        return wVar.f40013b;
    }

    /* renamed from: a */
    public static boolean m31970a(PackageInfo packageInfo, boolean z) {
        C15483p pVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                pVar = m31968a(packageInfo, C15486s.f39899a);
            } else {
                pVar = m31968a(packageInfo, C15486s.f39899a[0]);
            }
            if (pVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private final C15535w m31969a(String str, int i) {
        try {
            PackageInfo packageInfo = C15377d.m31951a(this.f39690a).f39657a.getPackageManager().getPackageInfo(str, 64);
            boolean a = C15384g.m31958a(this.f39690a);
            if (packageInfo == null) {
                return C15535w.m32328a("null pkg");
            }
            if (packageInfo.signatures.length != 1) {
                return C15535w.m32328a("single cert required");
            }
            C15484q qVar = new C15484q(packageInfo.signatures[0].toByteArray());
            String str2 = packageInfo.packageName;
            C15535w a2 = C15481n.m32203a(str2, qVar, a);
            if (!a2.f40013b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || (a && !C15481n.m32203a(str2, qVar, false).f40013b)) {
                return a2;
            }
            return C15535w.m32328a("debuggable release cert app rejected");
        } catch (NameNotFoundException unused) {
            String str3 = "no pkg ";
            String valueOf = String.valueOf(str);
            return C15535w.m32328a(valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
    }

    /* renamed from: a */
    private static C15483p m31968a(PackageInfo packageInfo, C15483p... pVarArr) {
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return null;
        }
        C15484q qVar = new C15484q(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < pVarArr.length; i++) {
            if (pVarArr[i].equals(qVar)) {
                return pVarArr[i];
            }
        }
        return null;
    }
}
