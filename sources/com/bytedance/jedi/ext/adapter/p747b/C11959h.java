package com.bytedance.jedi.ext.adapter.p747b;

import android.support.p043v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.p747b.C11949e;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.bytedance.jedi.ext.adapter.b.h */
public interface C11959h<VH extends C11949e<?>> {

    /* renamed from: com.bytedance.jedi.ext.adapter.b.h$a */
    public static final class C11960a {

        /* renamed from: com.bytedance.jedi.ext.adapter.b.h$a$a */
        static final class C11961a extends C52712l implements C52671b<Integer, Boolean> {

            /* renamed from: a */
            public static final C11961a f31658a = new C11961a();

            C11961a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return Boolean.valueOf(true);
            }
        }

        /* renamed from: a */
        public static /* synthetic */ C11959h m24344a(C11959h hVar, C52671b bVar, C52682m mVar, C52671b bVar2, int i, Object obj) {
            if ((i & 1) != 0) {
                bVar = C11961a.f31658a;
            }
            return hVar.mo22698a(bVar, null, bVar2);
        }
    }

    /* renamed from: a */
    C11959h<VH> mo22697a(int i, C52682m<? super Integer, ? super RecyclerView, C52860x> mVar, C52671b<? super ViewGroup, ? extends VH> bVar);

    /* renamed from: a */
    C11959h<VH> mo22698a(C52671b<? super Integer, Boolean> bVar, C52682m<? super Integer, ? super RecyclerView, C52860x> mVar, C52671b<? super ViewGroup, ? extends VH> bVar2);
}
