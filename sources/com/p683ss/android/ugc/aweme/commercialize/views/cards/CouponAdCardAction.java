package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25717g;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26448c.C26449a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.CouponAdCardAction */
public class CouponAdCardAction extends AbsAdCardAction {
    /* renamed from: d */
    public final void mo54520d() {
        super.mo54520d();
        CardStruct s = C26503d.m64076s(this.f70314c);
        if (s != null && s.getCardStyle() != 2 && this.f70315d.mo54564f() != null) {
            this.f70315d.mo54564f().setBackgroundResource(R.drawable.gn);
        }
    }

    /* renamed from: e */
    public final void mo54521e() {
        super.mo54521e();
        mo54514a(new C26449a().mo54168a("click").mo54171b("card").mo54167a(this.f70314c).mo54170a());
        C47718bf.m103288a(new C25717g(this.f70314c, 17));
    }

    public CouponAdCardAction(Context context, Aweme aweme, C26718p pVar) {
        super(context, aweme, pVar);
        this.f70309a = R.drawable.aio;
        this.f70317f = true;
    }
}
