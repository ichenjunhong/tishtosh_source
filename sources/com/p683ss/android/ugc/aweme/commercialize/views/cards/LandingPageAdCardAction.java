package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26448c.C26449a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.miniapp.utils.C36917d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.LandingPageAdCardAction */
public class LandingPageAdCardAction extends AbsHalfWebPageAction {

    /* renamed from: a */
    public static final String f70322a = "LandingPageAdCardAction";

    /* renamed from: d */
    public final void mo54520d() {
        super.mo54520d();
        if (this.f70314c.getAwemeRawAd() != null && !this.f70314c.getAwemeRawAd().getDisableAutoTrackClick()) {
            mo54514a(new C26449a().mo54168a("click").mo54171b("card").mo54167a(this.f70314c).mo54169a(C26512f.m64134ab(this.f70314c)).mo54170a());
        }
    }

    /* renamed from: e */
    public final void mo54521e() {
        super.mo54521e();
        mo54514a(new C26449a().mo54168a("otherclick").mo54171b("card").mo54167a(this.f70314c).mo54170a());
        if (!C26540w.m64211a(this.f70313b, this.f70314c) && !C36917d.m83053a(this.f70313b, this.f70314c)) {
            if (!C26540w.m64233b(this.f70313b, this.f70314c, 33)) {
                C26540w.m64232b(this.f70313b, this.f70314c);
            } else {
                return;
            }
        }
        if (this.f70314c.getAwemeRawAd() != null && this.f70314c.getAwemeRawAd().getDisableAutoTrackClick()) {
            mo54514a(new C26449a().mo54168a("click").mo54171b("card").mo54167a(this.f70314c).mo54170a());
        }
    }

    public LandingPageAdCardAction(Context context, Aweme aweme, C26718p pVar) {
        super(context, aweme, pVar);
        this.f70317f = true;
    }
}
