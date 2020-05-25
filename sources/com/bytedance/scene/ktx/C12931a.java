package com.bytedance.scene.ktx;

import com.bytedance.scene.C12924i;
import com.bytedance.scene.group.C12896b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.scene.ktx.a */
public final class C12931a {
    /* renamed from: b */
    public static final void m25974b(C12896b bVar, String str) {
        C52711k.m112240b(bVar, "$this$hide");
        C52711k.m112240b(str, "tag");
        C12924i a = bVar.mo24388a(str);
        if (a != null) {
            bVar.mo24404c(a);
        }
    }

    /* renamed from: a */
    public static final void m25973a(C12896b bVar, String str) {
        C52711k.m112240b(bVar, "$this$show");
        C52711k.m112240b(str, "tag");
        C12924i a = bVar.mo24388a(str);
        if (a != null) {
            bVar.mo24409d(a);
        }
    }

    /* renamed from: a */
    public static final void m25972a(C12896b bVar, int i, C12924i iVar, String str) {
        C52711k.m112240b(bVar, "$this$addAndHide");
        C52711k.m112240b(iVar, "scene");
        C52711k.m112240b(str, "tag");
        bVar.mo24384F();
        bVar.mo24389a(i, iVar, str);
        bVar.mo24404c(iVar);
        bVar.mo24385G();
    }
}
