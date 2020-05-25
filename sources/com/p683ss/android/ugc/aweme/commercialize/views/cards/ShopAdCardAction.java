package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26448c.C26449a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.miniapp.utils.C36917d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ShopAdCardAction */
public class ShopAdCardAction extends AbsAdCardAction {

    /* renamed from: i */
    private int f70325i;

    /* renamed from: e */
    public final void mo54521e() {
        super.mo54521e();
        if (this.f70325i == 0) {
            mo54514a(new C26449a().mo54168a("click").mo54171b("card").mo54167a(this.f70314c).mo54170a());
            if (!C26540w.m64211a(this.f70313b, this.f70314c) && !C36917d.m83053a(this.f70313b, this.f70314c) && !C26540w.m64233b(this.f70313b, this.f70314c, 2)) {
                C26540w.m64232b(this.f70313b, this.f70314c);
            }
        }
    }

    public ShopAdCardAction(Context context, Aweme aweme, C26718p pVar) {
        boolean z;
        super(context, aweme, pVar);
        if (C26512f.m64076s(aweme) != null) {
            this.f70325i = C26512f.m64076s(aweme).getCardStyle();
        }
        if (this.f70325i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f70317f = z;
        this.f70309a = R.drawable.aio;
    }
}
