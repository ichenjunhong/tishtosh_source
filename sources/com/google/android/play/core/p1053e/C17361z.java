package com.google.android.play.core.p1053e;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.android.play.core.splitcompat.C17384b;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.play.core.e.z */
public final class C17361z {

    /* renamed from: a */
    private static final C17384b f48873a = new C17384b("SplitInstallInfoProvider");

    /* renamed from: b */
    private final Context f48874b;

    /* renamed from: c */
    private final String f48875c;

    public C17361z(Context context, String str) {
        this.f48874b = context;
        this.f48875c = str;
    }

    /* renamed from: a */
    public static boolean m42518a(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    /* renamed from: d */
    private final Set<String> m42519d() {
        HashSet hashSet = new HashSet();
        Bundle f = m42521f();
        if (f != null) {
            String string = f.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f48873a.mo33687b("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
            }
        }
        if (VERSION.SDK_INT < 21) {
            return hashSet;
        }
        String[] e = m42520e();
        if (e != null) {
            f48873a.mo33687b("Adding splits from package manager: %s", Arrays.toString(e));
            Collections.addAll(hashSet, e);
        } else {
            f48873a.mo33687b("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        C17360y a = C17358w.m42515a();
        if (a != null) {
            hashSet.addAll(a.mo33652a());
        }
        return hashSet;
    }

    /* renamed from: e */
    private final String[] m42520e() {
        try {
            PackageInfo packageInfo = this.f48874b.getPackageManager().getPackageInfo(this.f48875c, 0);
            if (packageInfo != null) {
                return packageInfo.splitNames;
            }
            return null;
        } catch (NameNotFoundException unused) {
            f48873a.mo33688c("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final Set<String> mo33653a() {
        HashSet hashSet = new HashSet();
        for (String str : m42519d()) {
            if (!m42518a(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Set<String> mo33654b() {
        C17355t c = mo33655c();
        if (c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set d = m42519d();
        d.add("");
        Set a = mo33653a();
        a.add("");
        for (Entry entry : c.mo33650a(a).entrySet()) {
            if (d.containsAll((Collection) entry.getValue())) {
                hashSet.add((String) entry.getKey());
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public final C17355t mo33655c() {
        C17384b bVar;
        String str;
        Bundle f = m42521f();
        if (f == null) {
            return null;
        }
        int i = f.getInt("com.android.vending.splits");
        if (i == 0) {
            bVar = f48873a;
            str = "No metadata found in AndroidManifest.";
        } else {
            try {
                C17355t a = new C17350o(this.f48874b.getResources().getXml(i)).mo33645a();
                if (a == null) {
                    f48873a.mo33688c("Can't parse languages metadata.", new Object[0]);
                }
                return a;
            } catch (NotFoundException unused) {
                bVar = f48873a;
                str = "Resource with languages metadata doesn't exist.";
            }
        }
        bVar.mo33688c(str, new Object[0]);
        return null;
    }

    /* renamed from: f */
    private final Bundle m42521f() {
        ApplicationInfo applicationInfo;
        try {
            PackageManager packageManager = this.f48874b.getPackageManager();
            String str = this.f48875c;
            if (TextUtils.equals(str, C11010c.m22280a().getPackageName())) {
                if (C18970b.f52271a == null) {
                    C18970b.f52271a = packageManager.getApplicationInfo(str, 128);
                }
                applicationInfo = C18970b.f52271a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(str, 128);
            }
            if (applicationInfo != null && applicationInfo.metaData != null) {
                return applicationInfo.metaData;
            }
            f48873a.mo33687b("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (NameNotFoundException unused) {
            f48873a.mo33688c("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }
}
