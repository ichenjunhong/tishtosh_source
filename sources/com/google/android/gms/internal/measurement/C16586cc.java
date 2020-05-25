package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.p1151a.C18970b;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.cc */
public final class C16586cc extends C16860r {

    /* renamed from: a */
    protected boolean f46605a;

    /* renamed from: c */
    protected int f46606c;

    /* renamed from: d */
    private String f46607d;

    /* renamed from: e */
    private String f46608e;

    /* renamed from: f */
    private int f46609f;

    /* renamed from: g */
    private boolean f46610g;

    /* renamed from: h */
    private boolean f46611h;

    public C16586cc(C16862t tVar) {
        super(tVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo31765a() {
        ApplicationInfo applicationInfo;
        Context g = mo32506g();
        try {
            PackageManager packageManager = g.getPackageManager();
            String packageName = g.getPackageName();
            if (TextUtils.equals(packageName, C11010c.m22280a().getPackageName())) {
                if (C18970b.f52271a == null) {
                    C18970b.f52271a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = C18970b.f52271a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
        } catch (NameNotFoundException e) {
            mo32498c("PackageManager doesn't know about the app package", e);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            mo32503e("Couldn't get ApplicationInfo to load global config");
            return;
        }
        Bundle bundle = applicationInfo.metaData;
        if (bundle != null) {
            int i = bundle.getInt("com.google.android.gms.analytics.globalConfigResource");
            if (i > 0) {
                C16563bg bgVar = (C16563bg) new C16561be(this.f47329b).mo31804a(i);
                if (bgVar != null) {
                    mo32493b("Loading global XML config values");
                    boolean z = false;
                    if (bgVar.f46551a != null) {
                        String str = bgVar.f46551a;
                        this.f46608e = str;
                        mo32494b("XML config - app name", str);
                    }
                    if (bgVar.f46552b != null) {
                        String str2 = bgVar.f46552b;
                        this.f46607d = str2;
                        mo32494b("XML config - app version", str2);
                    }
                    if (bgVar.f46553c != null) {
                        String lowerCase = bgVar.f46553c.toLowerCase(Locale.US);
                        int i2 = "verbose".equals(lowerCase) ? 0 : "info".equals(lowerCase) ? 1 : "warning".equals(lowerCase) ? 2 : "error".equals(lowerCase) ? 3 : -1;
                        if (i2 >= 0) {
                            this.f46609f = i2;
                            mo32490a("XML config - log level", Integer.valueOf(i2));
                        }
                    }
                    if (bgVar.f46554d >= 0) {
                        int i3 = bgVar.f46554d;
                        this.f46606c = i3;
                        this.f46605a = true;
                        mo32494b("XML config - dispatch period (sec)", Integer.valueOf(i3));
                    }
                    if (bgVar.f46555e != -1) {
                        if (bgVar.f46555e == 1) {
                            z = true;
                        }
                        this.f46611h = z;
                        this.f46610g = true;
                        mo32494b("XML config - dry run", Boolean.valueOf(z));
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final String mo31860b() {
        mo32516r();
        return this.f46607d;
    }

    /* renamed from: c */
    public final String mo31861c() {
        mo32516r();
        return this.f46608e;
    }

    /* renamed from: d */
    public final boolean mo31862d() {
        mo32516r();
        return false;
    }

    /* renamed from: e */
    public final boolean mo31863e() {
        mo32516r();
        return this.f46610g;
    }

    /* renamed from: t */
    public final boolean mo31864t() {
        mo32516r();
        return this.f46611h;
    }
}
