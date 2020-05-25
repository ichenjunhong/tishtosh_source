package com.p683ss.android.ugc.aweme.miniapp.card;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1568b.C25887a;
import com.p683ss.android.ugc.aweme.framework.p1783d.C32464b;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp.card.a */
public final class C36867a implements C25887a {

    /* renamed from: a */
    MicroAppVideoCardView f94230a;

    /* renamed from: b */
    View f94231b;

    /* renamed from: c */
    private Context f94232c;

    /* renamed from: d */
    private String f94233d;

    /* renamed from: b */
    public final void mo53209b() {
        this.f94231b.setVisibility(0);
        MicroAppVideoCardView microAppVideoCardView = this.f94230a;
        microAppVideoCardView.setAlpha(0.0f);
        microAppVideoCardView.setVisibility(8);
        microAppVideoCardView.setTranslationX(0.0f);
        microAppVideoCardView.setTranslationY(0.0f);
    }

    /* renamed from: a */
    public final void mo53208a() {
        int i;
        if (this.f94230a != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f94230a.getLayoutParams();
            if (C22453b.m55505a().f60473k) {
                i = C22453b.m55505a().mo46745b();
            } else {
                i = 0;
            }
            int a = C32464b.m75163a(this.f94232c, 58.0f) - i;
            if (C22453b.m55510c()) {
                a += C22453b.f60461a;
            }
            marginLayoutParams.bottomMargin = a;
            this.f94230a.setLayoutParams(marginLayoutParams);
        }
    }

    public C36867a(View view, String str) {
        this.f94232c = view.getContext();
        this.f94231b = view.findViewById(R.id.id);
        this.f94230a = (MicroAppVideoCardView) view.findViewById(R.id.blt);
        this.f94233d = str;
    }
}
