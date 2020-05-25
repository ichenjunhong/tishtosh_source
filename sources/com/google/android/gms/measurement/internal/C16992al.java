package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.google.android.gms.common.p1037d.C15375b;
import com.google.android.gms.common.p1037d.C15377d;
import com.google.android.gms.common.stats.C15497a;
import com.google.android.gms.internal.measurement.C16719go;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.al */
public final class C16992al {

    /* renamed from: a */
    final C17005ay f47912a;

    C16992al(C17005ay ayVar) {
        this.f47912a = ayVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo32888a(String str) {
        if (str == null || str.isEmpty()) {
            this.f47912a.mo32854q().f48451h.mo33376a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.f47912a.mo32853p().mo32840c();
        if (!m41189a()) {
            this.f47912a.mo32854q().f48451h.mo33376a("Install Referrer Reporter is not available");
            return;
        }
        this.f47912a.mo32854q().f48451h.mo33376a("Install Referrer Reporter is initializing");
        C16993am amVar = new C16993am(this, str);
        this.f47912a.mo32853p().mo32840c();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.f47912a.mo32850m().getPackageManager();
        if (packageManager == null) {
            this.f47912a.mo32854q().f48448e.mo33376a("Failed to obtain Package Manager to verify binding conditions");
            return;
        }
        List queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.f47912a.mo32854q().f48451h.mo33376a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) queryIntentServices.get(0);
        if (resolveInfo.serviceInfo != null) {
            String str2 = resolveInfo.serviceInfo.packageName;
            if (resolveInfo.serviceInfo.name == null || !"com.android.vending".equals(str2) || !m41189a()) {
                this.f47912a.mo32854q().f48451h.mo33376a("Play Store missing or incompatible. Version 8.3.73 or later required");
            } else {
                try {
                    this.f47912a.mo32854q().f48451h.mo33377a("Install Referrer Service is", C15497a.m32246a().mo28515a(this.f47912a.mo32850m(), new Intent(intent), amVar, 1) ? "available" : "not available");
                } catch (Exception e) {
                    this.f47912a.mo32854q().f48445b.mo33377a("Exception occurred while binding to Install Referrer Service", e.getMessage());
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m41189a() {
        boolean z = false;
        try {
            C15375b a = C15377d.m31951a(this.f47912a.mo32850m());
            if (a == null) {
                this.f47912a.mo32854q().f48451h.mo33376a("Failed to retrieve Package Manager to check Play Store compatibility");
                return false;
            }
            if (a.mo28321b("com.android.vending", 128).versionCode >= 80837300) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            this.f47912a.mo32854q().f48451h.mo33377a("Failed to retrieve Play Store version", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo32887a(String str, C16719go goVar) {
        this.f47912a.mo32853p().mo32840c();
        if (goVar == null) {
            this.f47912a.mo32854q().f48448e.mo33376a("Attempting to use Install Referrer Service while it is not initialized");
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        try {
            Bundle a = goVar.mo32189a(bundle);
            if (a != null) {
                return a;
            }
            this.f47912a.mo32854q().f48445b.mo33376a("Install Referrer Service returned a null response");
            return null;
        } catch (Exception e) {
            this.f47912a.mo32854q().f48445b.mo33377a("Exception occurred while retrieving the Install Referrer", e.getMessage());
            return null;
        }
    }
}
