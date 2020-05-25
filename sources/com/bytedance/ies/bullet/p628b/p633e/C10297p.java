package com.bytedance.ies.bullet.p628b.p633e;

import android.net.Uri;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.bullet.b.e.p */
public final class C10297p extends Exception {
    public C10297p(C10290i iVar, Uri uri, Throwable th) {
        C52711k.m112240b(iVar, "instance");
        C52711k.m112240b(uri, "uri");
        StringBuilder sb = new StringBuilder();
        sb.append(iVar.getClass().getSimpleName());
        sb.append(" force rejected when processing: ");
        sb.append(uri);
        super(sb.toString(), th);
    }

    public /* synthetic */ C10297p(C10290i iVar, Uri uri, Throwable th, int i, C52707g gVar) {
        if ((i & 4) != 0) {
            th = null;
        }
        this(iVar, uri, th);
    }
}
