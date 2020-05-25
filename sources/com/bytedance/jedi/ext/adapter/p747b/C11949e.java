package com.bytedance.jedi.ext.adapter.p747b;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.jedi.ext.adapter.b.e */
public abstract class C11949e<ITEM> extends C1352v {

    /* renamed from: h */
    static final /* synthetic */ C52767h[] f31640h = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C11949e.class), "itemViewMap", "getItemViewMap$ext_adapter_release()Landroid/util/SparseArray;"))};

    /* renamed from: a */
    private final C52668f f31641a = C52732g.m112285a(C11951a.f31645a);

    /* renamed from: b */
    private ITEM f31642b;

    /* renamed from: i */
    public int f31643i;

    /* renamed from: com.bytedance.jedi.ext.adapter.b.e$a */
    static final class C11951a extends C52712l implements C52670a<SparseArray<View>> {

        /* renamed from: a */
        public static final C11951a f31645a = new C11951a();

        C11951a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new SparseArray();
        }
    }

    /* renamed from: a */
    public abstract void mo22665a(ITEM item, int i);

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo22672h() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo22673i() {
    }

    /* renamed from: o */
    public final ITEM mo22689o() {
        ITEM item = this.f31642b;
        if (item == null) {
            C52711k.m112234a();
        }
        return item;
    }

    public C11949e(View view) {
        C52711k.m112240b(view, "view");
        super(view);
        this.itemView.addOnAttachStateChangeListener(new OnAttachStateChangeListener(this) {

            /* renamed from: a */
            final /* synthetic */ C11949e f31644a;

            {
                this.f31644a = r1;
            }

            public final void onViewAttachedToWindow(View view) {
                this.f31644a.mo22672h();
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f31644a.mo22673i();
            }
        });
    }

    /* renamed from: b */
    public void mo22667b(ITEM item, int i, List<Object> list) {
        this.f31643i = i;
        this.f31642b = item;
        mo22665a(item, i);
    }
}
