package com.bytedance.ies.bullet.p628b.p631c;

import android.net.Uri;
import android.net.Uri.Builder;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.c.c */
public final class C10249c {
    /* renamed from: a */
    public static final Uri m20728a(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        Uri build = new Builder().scheme("local_file").authority("relative").path(str).build();
        C52711k.m112236a((Object) build, "Uri.Builder()\n    .schem…ATIVE).path(path).build()");
        return build;
    }

    /* renamed from: b */
    public static final Uri m20729b(String str) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
        Uri build = new Builder().scheme("local_file").authority("absolute").path(str).build();
        C52711k.m112236a((Object) build, "Uri.Builder()\n    .schem…OLUTE).path(path).build()");
        return build;
    }
}
