package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.fetch.model.C34979a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.c.c */
public final class C34861c extends C34854a<IMContact> {

    /* renamed from: a */
    private final DmtTextView f89796a = ((DmtTextView) this.itemView.findViewById(R.id.dcu));

    public C34861c(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bfa, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(pare…on_notice, parent, false)");
        super(inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo72219a(Object obj, Object obj2, int i) {
        IMContact iMContact = (IMContact) obj;
        IMContact iMContact2 = (IMContact) obj2;
        C52711k.m112240b(iMContact, "item");
        if (!(iMContact instanceof C34979a)) {
            iMContact = null;
        }
        C34979a aVar = (C34979a) iMContact;
        if (aVar != null) {
            DmtTextView dmtTextView = this.f89796a;
            C52711k.m112236a((Object) dmtTextView, "tvNotice");
            dmtTextView.setText(aVar.getNotice());
        }
    }
}
