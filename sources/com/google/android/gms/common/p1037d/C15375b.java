package com.google.android.gms.common.p1037d;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C15524o;

/* renamed from: com.google.android.gms.common.d.b */
public final class C15375b {

    /* renamed from: a */
    public final Context f39657a;

    public C15375b(Context context) {
        this.f39657a = context;
    }

    /* renamed from: a */
    public final ApplicationInfo mo28318a(String str, int i) throws NameNotFoundException {
        return C15376c.m31950a(this.f39657a.getPackageManager(), str, i);
    }

    /* renamed from: b */
    public final PackageInfo mo28321b(String str, int i) throws NameNotFoundException {
        return this.f39657a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: a */
    public final boolean mo28320a(int i, String str) {
        if (C15524o.m32297e()) {
            try {
                ((AppOpsManager) this.f39657a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f39657a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final int mo28316a(String str) {
        return this.f39657a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public final int mo28317a(String str, String str2) {
        return this.f39657a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: b */
    public final CharSequence mo28322b(String str) throws NameNotFoundException {
        return this.f39657a.getPackageManager().getApplicationLabel(C15376c.m31950a(this.f39657a.getPackageManager(), str, 0));
    }

    /* renamed from: a */
    public final boolean mo28319a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return C15374a.m31942a(this.f39657a);
        }
        if (C15524o.m32301i()) {
            String nameForUid = this.f39657a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f39657a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }
}
