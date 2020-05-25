package com.google.android.play.core.missingsplits;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.play.core.splitcompat.C17384b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.play.core.missingsplits.c */
final class C17381c {

    /* renamed from: a */
    static final C17384b f48900a = new C17384b("MissingSplitsAppComponentsHelper");

    /* renamed from: b */
    private final Context f48901b;

    /* renamed from: c */
    private final PackageManager f48902c;

    C17381c(Context context, PackageManager packageManager) {
        this.f48901b = context;
        this.f48902c = packageManager;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33679a(List<ComponentInfo> list, int i) {
        for (ComponentInfo componentInfo : list) {
            this.f48902c.setComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name), i, 1);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo33680a() {
        for (ComponentInfo componentInfo : mo33682c()) {
            if (this.f48902c.getComponentEnabledSetting(new ComponentName(componentInfo.packageName, componentInfo.name)) != 2) {
                f48900a.mo33687b("Not all non-activity components are disabled", new Object[0]);
                return false;
            }
        }
        f48900a.mo33687b("All non-activity components are disabled", new Object[0]);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo33681b() {
        f48900a.mo33685a("Resetting enabled state of all non-activity components", new Object[0]);
        mo33679a(mo33682c(), 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final List<ComponentInfo> mo33682c() {
        try {
            ArrayList arrayList = new ArrayList();
            PackageInfo packageInfo = this.f48902c.getPackageInfo(this.f48901b.getPackageName(), 526);
            if (packageInfo.providers != null) {
                Collections.addAll(arrayList, packageInfo.providers);
            }
            if (packageInfo.receivers != null) {
                Collections.addAll(arrayList, packageInfo.receivers);
            }
            if (packageInfo.services != null) {
                Collections.addAll(arrayList, packageInfo.services);
            }
            return arrayList;
        } catch (NameNotFoundException e) {
            f48900a.mo33688c("Failed to resolve own package : %s", e);
            return Collections.emptyList();
        }
    }
}
