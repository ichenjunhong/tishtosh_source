package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

@C16299uq
final class aln {

    /* renamed from: a */
    final ArrayList<bsw> f40858a = new ArrayList<>();

    /* renamed from: b */
    private long f40859b;

    aln() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo29112a() {
        Iterator it = this.f40858a.iterator();
        while (it.hasNext()) {
            bsw bsw = (bsw) it.next();
            Map headerFields = bsw.f43806a == null ? null : bsw.f43806a.getHeaderFields();
            if (headerFields != null) {
                for (Entry entry : headerFields.entrySet()) {
                    try {
                        if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                            this.f40859b = Math.max(this.f40859b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                        }
                    } catch (RuntimeException unused) {
                    }
                }
                it.remove();
            }
        }
        return this.f40859b;
    }
}
