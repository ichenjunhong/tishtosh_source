package com.bytedance.ies.bullet.p628b.p633e;

import android.net.Uri;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.s */
public final class C10306s extends Exception {
    public C10306s(C10284d<?, ?, ?, ?> dVar, Uri uri, Throwable th) {
        C52711k.m112240b(dVar, "kitApi");
        C52711k.m112240b(uri, "uri");
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.getClass().getSimpleName());
        sb.append(" won't match uri: ");
        sb.append(uri);
        super(sb.toString(), th);
    }

    public /* synthetic */ C10306s(C10284d dVar, Uri uri, Throwable th, int i, C52707g gVar) {
        if ((i & 4) != 0) {
            th = null;
        }
        this(dVar, uri, th);
    }
}
