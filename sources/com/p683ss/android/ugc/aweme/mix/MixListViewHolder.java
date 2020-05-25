package com.p683ss.android.ugc.aweme.mix;

import android.graphics.Color;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.MixListViewHolder */
public final class MixListViewHolder extends CommonLogicViewHolder {

    /* renamed from: m */
    private final C37090u f94518m;

    /* renamed from: b */
    public final void mo76298b(DmtTextView dmtTextView) {
        C52711k.m112240b(dmtTextView, "descView");
    }

    /* renamed from: p */
    public final void mo76300p() {
        super.mo76300p();
        this.f94471k.setBackgroundColor(Color.parseColor("#0FFFFFFF"));
    }

    /* renamed from: a */
    public final void mo76296a(DmtTextView dmtTextView) {
        C52711k.m112240b(dmtTextView, "descView");
        dmtTextView.setTextColor(this.f94470j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo22662a(Aweme aweme) {
        C52711k.m112240b(aweme, "item");
        super.mo22662a(aweme);
        m83227a(this.f94471k, C52711k.m112239a((Object) aweme, (Object) this.f94518m.f94734d));
    }

    /* renamed from: a */
    public final void mo76297a(Aweme aweme) {
        m83227a(this.f94471k, C52711k.m112239a((Object) (Aweme) mo22689o(), (Object) aweme));
    }

    /* renamed from: a */
    private static void m83227a(View view, boolean z) {
        C52711k.m112240b(view, "view");
        if (z) {
            view.setBackgroundColor(Color.parseColor("#0FFFFFFF"));
        } else {
            view.setBackgroundColor(0);
        }
    }

    public MixListViewHolder(View view, C24579d dVar, C37090u uVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(dVar, "onItemClickListener");
        C52711k.m112240b(uVar, "mAdapter");
        super(view, dVar);
        this.f94518m = uVar;
    }
}
