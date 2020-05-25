package com.bytedance.widget.ext.list;

import android.arch.lifecycle.C0172f;
import com.bytedance.widget.Widget;
import java.lang.Object;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;

public abstract class ItemWidget<ITEM, VH extends Object<ITEM>> extends Widget {

    /* renamed from: g */
    private final C52668f<C0172f> f34891g = C52732g.m112285a(C13382a.f34892a);

    /* renamed from: com.bytedance.widget.ext.list.ItemWidget$a */
    static final class C13382a extends C52712l implements C52670a<C0172f> {

        /* renamed from: a */
        public static final C13382a f34892a = new C13382a();

        C13382a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0172f();
        }
    }

    /* renamed from: m */
    public final void mo25061m() {
        super.mo25061m();
        if (this.f34891g.isInitialized()) {
            ((C0172f) this.f34891g.getValue()).mo318a();
        }
    }
}
