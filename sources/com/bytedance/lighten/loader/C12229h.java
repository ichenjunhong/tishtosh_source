package com.bytedance.lighten.loader;

import com.facebook.common.p920d.C13691k;
import com.facebook.imagepipeline.p964d.C13987q;

/* renamed from: com.bytedance.lighten.loader.h */
public final class C12229h implements C13691k<C13987q> {

    /* renamed from: a */
    private int f32323a;

    public C12229h() {
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo23157b() {
        int i;
        if (this.f32323a > 0) {
            i = this.f32323a;
        } else {
            int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min < 16777216) {
                i = 1048576;
            } else if (min < 33554432) {
                i = 2097152;
            } else {
                i = 4194304;
            }
        }
        C13987q qVar = new C13987q(i, Integer.MAX_VALUE, i, Integer.MAX_VALUE, i / 8);
        return qVar;
    }

    public C12229h(int i) {
        this.f32323a = i;
    }
}
