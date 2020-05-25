package com.facebook.imagepipeline.p964d;

import com.facebook.common.p920d.C13691k;

/* renamed from: com.facebook.imagepipeline.d.k */
public final class C13979k implements C13691k<C13987q> {
    /* renamed from: b */
    public final /* synthetic */ Object mo23157b() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            i = 1048576;
        } else if (min < 33554432) {
            i = 2097152;
        } else {
            i = 4194304;
        }
        C13987q qVar = new C13987q(i, Integer.MAX_VALUE, i, Integer.MAX_VALUE, i / 8);
        return qVar;
    }
}
