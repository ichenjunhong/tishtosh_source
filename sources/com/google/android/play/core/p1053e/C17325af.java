package com.google.android.play.core.p1053e;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.p1051c.C17254ad;
import com.google.android.play.core.p1051c.C17283be;
import com.google.android.play.core.p1051c.C17295h;
import com.google.android.play.core.splitcompat.C17384b;

/* renamed from: com.google.android.play.core.e.af */
final class C17325af {
    /* access modifiers changed from: 0000 */

    /* renamed from: a */
    public static final C17384b f48805a = new C17384b("SplitInstallService");

    /* renamed from: c */
    private static final Intent f48806c = new Intent("com.google.android.play.core.splitinstall.BIND_SPLIT_INSTALL_SERVICE").setPackage("com.android.vending");

    /* renamed from: b */
    final C17283be<C17254ad> f48807b;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f48808d;

    public C17325af(Context context) {
        this(context, context.getPackageName());
    }

    private C17325af(Context context, String str) {
        this.f48808d = str;
        C17283be beVar = new C17283be(C17295h.m42356a(context), f48805a, "SplitInstallService", f48806c, C17324ae.f48804a);
        this.f48807b = beVar;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Collection, code=java.util.Collection<java.lang.String>, for r4v0, types: [java.util.Collection, java.util.Collection<java.lang.String>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.util.ArrayList m42420a(java.util.Collection<java.lang.String> r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x000d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "language"
            r2.putString(r3, r1)
            r0.add(r2)
            goto L_0x000d
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.p1053e.C17325af.m42420a(java.util.Collection):java.util.ArrayList");
    }

    /* renamed from: a */
    static /* synthetic */ Bundle m42418a() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 10604);
        return bundle;
    }
}
