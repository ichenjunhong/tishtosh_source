package com.google.android.play.core.p1048a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.google.android.play.core.p1051c.C17275ax;
import com.google.android.play.core.p1051c.C17283be;
import com.google.android.play.core.p1051c.C17295h;
import com.google.android.play.core.splitcompat.C17384b;

/* renamed from: com.google.android.play.core.a.f */
final class C17236f {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public static final C17384b f48688a = new C17384b("AppUpdateService");

    /* renamed from: c */
    private static final Intent f48689c = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: b */
    final C17283be<C17275ax> f48690b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f48691d;

    /* renamed from: e */
    private final Context f48692e;

    public C17236f(Context context) {
        this.f48691d = context.getPackageName();
        this.f48692e = context;
        C17283be beVar = new C17283be(C17295h.m42356a(context), f48688a, "AppUpdateService", f48689c, C17239i.f48697a);
        this.f48690b = beVar;
    }

    /* renamed from: a */
    static Bundle m42217a() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10604);
        return bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Integer mo33507b() {
        try {
            return Integer.valueOf(this.f48692e.getPackageManager().getPackageInfo(this.f48692e.getPackageName(), 0).versionCode);
        } catch (NameNotFoundException unused) {
            f48688a.mo33689d("The current version of the app could not be retrieved", new Object[0]);
            return null;
        }
    }
}
