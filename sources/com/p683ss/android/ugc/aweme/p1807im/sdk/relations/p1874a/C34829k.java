package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.k */
public final class C34829k extends C34854a<IMContact> {
    public C34829k(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfd, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…em_search, parent, false)");
        super(inflate);
        this.f89784d.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C34829k f89734a;

            {
                this.f89734a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C52686q<? super Integer, ? super Integer, ? super View, C52860x> qVar = this.f89734a.f89782b;
                if (qVar != null) {
                    Integer valueOf = Integer.valueOf(1);
                    Integer valueOf2 = Integer.valueOf(this.f89734a.getAdapterPosition());
                    C52711k.m112236a((Object) view, "it");
                    qVar.invoke(valueOf, valueOf2, view);
                }
            }
        });
    }

    /* renamed from: a */
    public final /* synthetic */ void mo72219a(Object obj, Object obj2, int i) {
        IMContact iMContact = (IMContact) obj;
        IMContact iMContact2 = (IMContact) obj2;
        C52711k.m112240b(iMContact, "item");
        C23515d.m57669a((RemoteImageView) this.f89784d, iMContact.getDisplayAvatar());
    }
}
