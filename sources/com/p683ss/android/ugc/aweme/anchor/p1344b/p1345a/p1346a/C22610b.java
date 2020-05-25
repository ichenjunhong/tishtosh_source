package com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.p1346a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.anchor.C22678i;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorCell;
import com.p683ss.android.ugc.aweme.anchor.api.model.AnchorIcon;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a;
import com.p683ss.android.ugc.aweme.anchor.p1344b.p1345a.C22601a.C22602a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteRoundImageView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a.b */
public final class C22610b extends C22601a<AnchorCell, C22611a> {

    /* renamed from: com.ss.android.ugc.aweme.anchor.b.a.a.b$a */
    public final class C22611a extends C22602a {

        /* renamed from: b */
        public final RemoteRoundImageView f60766b;

        /* renamed from: c */
        final /* synthetic */ C22610b f60767c;

        public C22611a(C22610b bVar, View view) {
            C52711k.m112240b(view, "itemView");
            this.f60767c = bVar;
            super(bVar, view);
            this.f60766b = (RemoteRoundImageView) view.findViewById(R.id.ebd);
        }
    }

    public C22610b(C22678i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.bhd, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…tion_icon, parent, false)");
        return new C22611a(this, inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        String str;
        C22611a aVar = (C22611a) vVar;
        AnchorCell anchorCell = (AnchorCell) obj;
        C52711k.m112240b(aVar, "holder");
        C52711k.m112240b(anchorCell, "cell");
        RemoteImageView remoteImageView = aVar.f60766b;
        AnchorIcon anchorIcon = anchorCell.f60739b;
        if (anchorIcon != null) {
            str = anchorIcon.f60745a;
        } else {
            str = null;
        }
        C23515d.m57677a(remoteImageView, str);
    }
}
