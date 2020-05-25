package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26448c.C26449a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.C26460e;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.miniapp.utils.C36917d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.ImageAdCardAction */
public class ImageAdCardAction extends AbsAdCardAction {
    /* renamed from: e */
    public final void mo54521e() {
        super.mo54521e();
        mo54514a(new C26449a().mo54168a("click").mo54171b("card").mo54167a(this.f70314c).mo54170a());
        if (!C26540w.m64211a(this.f70313b, this.f70314c) && !C36917d.m83053a(this.f70313b, this.f70314c) && !C26540w.m64233b(this.f70313b, this.f70314c, 33)) {
            if (!C26512f.m64057a(this.f70314c) || TextUtils.isEmpty(C26512f.m64105G(this.f70314c)) || C26512f.m64133aa(this.f70314c)) {
                C26540w.m64232b(this.f70313b, this.f70314c);
            } else {
                C26460e.m63976a(this.f70313b, "click_ad_card");
            }
        }
    }

    public ImageAdCardAction(Context context, Aweme aweme, C26718p pVar) {
        super(context, aweme, pVar);
        this.f70309a = R.drawable.ain;
        this.f70317f = true;
    }
}
