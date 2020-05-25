package com.p683ss.android.ugc.aweme.mix;

import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDoubleRowListViewHolder */
public final class MixDoubleRowListViewHolder extends CommonLogicViewHolder {

    /* renamed from: m */
    public final View f94515m = mo76295a((int) R.id.iz);

    /* renamed from: n */
    public final DmtTextView f94516n = ((DmtTextView) mo76295a((int) R.id.elc));

    /* renamed from: o */
    private final C37090u f94517o;

    /* renamed from: b */
    public final void mo76298b(DmtTextView dmtTextView) {
        C52711k.m112240b(dmtTextView, "descView");
    }

    /* renamed from: p */
    public final void mo76300p() {
        super.mo76300p();
        this.f94516n.setVisibility(0);
        this.f94515m.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo76296a(DmtTextView dmtTextView) {
        C52711k.m112240b(dmtTextView, "descView");
        dmtTextView.setTextColor(this.f94470j);
    }

    /* renamed from: a */
    public final void mo76297a(Aweme aweme) {
        if (C52711k.m112239a((Object) (Aweme) mo22689o(), (Object) aweme)) {
            this.f94516n.setVisibility(0);
            this.f94515m.setVisibility(0);
            return;
        }
        this.f94516n.setVisibility(8);
        this.f94515m.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo22662a(Aweme aweme) {
        C52711k.m112240b(aweme, "item");
        super.mo22662a(aweme);
        if (C52711k.m112239a((Object) aweme, (Object) this.f94517o.f94734d)) {
            this.f94516n.setVisibility(0);
        } else {
            this.f94516n.setVisibility(8);
        }
    }

    public MixDoubleRowListViewHolder(View view, C24579d dVar, C37090u uVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(dVar, "onItemClickListener");
        C52711k.m112240b(uVar, "mAdapter");
        super(view, dVar);
        this.f94517o = uVar;
    }
}
