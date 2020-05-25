package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.arch.p1810a.C33254b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34860b;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b */
public abstract class C34799b<T> extends C33254b<C34854a<T>, T> {

    /* renamed from: d */
    public static final C34800a f89661d = new C34800a(null);

    /* renamed from: a */
    private final int f89662a = ((int) C9432q.m18687b(C11010c.m22280a(), 40.0f));

    /* renamed from: b */
    private C52686q<? super Integer, ? super Integer, ? super View, C52860x> f89663b;

    /* renamed from: c */
    private View f89664c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b$a */
    public static final class C34800a {
        private C34800a() {
        }

        public /* synthetic */ C34800a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public abstract C34854a<T> mo72198b(ViewGroup viewGroup, int i);

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public C52686q<Integer, Integer, View, C52860x> mo72199l() {
        return this.f89663b;
    }

    /* renamed from: j */
    public final int mo70605j() {
        if (this.f89664c == null) {
            return 0;
        }
        return 1;
    }

    /* renamed from: n */
    public final void mo72933n() {
        if (this.f89664c != null) {
            this.f89664c = null;
            notifyItemRemoved(0);
        }
    }

    /* renamed from: a */
    public int mo48641a(int i) {
        if (i < mo70605j()) {
            return Integer.MAX_VALUE;
        }
        return super.mo48641a(i);
    }

    public C34799b(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        super(null, 1, null);
    }

    /* renamed from: c */
    public final void mo72932c(View view) {
        C52711k.m112240b(view, "headerView");
        if (this.f89664c == null) {
            this.f89664c = view;
            notifyItemInserted(0);
            return;
        }
        if (!C52711k.m112239a((Object) this.f89664c, (Object) view)) {
            this.f89664c = view;
            notifyItemChanged(0);
        }
    }

    /* renamed from: a */
    public final C1352v mo48221a(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (i != Integer.MAX_VALUE) {
            return mo72198b(viewGroup, i);
        }
        View view = this.f89664c;
        if (view == null) {
            C52711k.m112234a();
        }
        return new C34860b(view);
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        if (i >= mo70605j()) {
            C34854a aVar = (C34854a) vVar;
            mo72931a(aVar, i);
            Object b = mo70602b(i);
            if (b != null) {
                aVar.mo72219a(b, mo70602b(i - 1), i);
                aVar.f89782b = mo72199l();
            }
        }
    }

    /* renamed from: a */
    public void mo72931a(C34854a<T> aVar, int i) {
        C52711k.m112240b(aVar, "holder");
        View view = aVar.itemView;
        C52711k.m112236a((Object) view, "holder.itemView");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            if (i == getItemCount() - 1) {
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, this.f89662a);
            } else {
                layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, 0);
            }
        } else {
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
        }
    }
}
