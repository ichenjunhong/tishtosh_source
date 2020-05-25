package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.j */
public final class C34827j extends C34799b<IMContact> {

    /* renamed from: a */
    public final Context f89729a;

    /* renamed from: b */
    private final int f89730b = ((int) C9432q.m18687b(this.f89729a, 16.0f));

    /* renamed from: c */
    private C52686q<? super Integer, ? super Integer, ? super View, C52860x> f89731c;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.j$a */
    static final class C34828a extends C52712l implements C52686q<Integer, Integer, View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34827j f89732a;

        /* renamed from: b */
        final /* synthetic */ C52671b f89733b;

        C34828a(C34827j jVar, C52671b bVar) {
            this.f89732a = jVar;
            this.f89733b = bVar;
            super(3);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int intValue = ((Number) obj).intValue();
            int intValue2 = ((Number) obj2).intValue();
            C52711k.m112240b((View) obj3, "view");
            if (intValue == 1) {
                IMContact iMContact = (IMContact) this.f89732a.mo70602b(intValue2);
                if (iMContact != null) {
                    C52671b bVar = this.f89733b;
                    if (bVar != null) {
                        bVar.invoke(iMContact);
                    }
                }
            }
            return C52860x.f131107a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final C52686q<Integer, Integer, View, C52860x> mo72199l() {
        return this.f89731c;
    }

    /* renamed from: b */
    public final C34854a<IMContact> mo72198b(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return new C34829k<>(viewGroup);
    }

    public C34827j(C0184k kVar, C52671b<? super IMContact, C52860x> bVar) {
        C52711k.m112240b(kVar, "owner");
        super(kVar);
        this.f89729a = (Context) kVar;
        this.f89731c = new C34828a(this, bVar);
    }

    /* renamed from: a */
    public final void mo72931a(C34854a<IMContact> aVar, int i) {
        C52711k.m112240b(aVar, "holder");
        View view = aVar.itemView;
        C52711k.m112236a((Object) view, "holder.itemView");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            if (i == getItemCount() - 1) {
                layoutParams2.setMargins(this.f89730b, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams2.setMarginStart(this.f89730b);
                    return;
                }
            } else {
                layoutParams2.setMargins(0, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams2.setMarginStart(0);
                }
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
    }
}
