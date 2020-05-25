package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.AbsAdCardAction.C26685a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.DownloadAdCardAction */
public class DownloadAdCardAction extends AbsAdCardAction {

    /* renamed from: i */
    private boolean f70320i;

    /* renamed from: f */
    public final void mo54522f() {
        if (this.f70320i) {
            super.mo54522f();
        }
    }

    @C53771m
    public void onEvent(C26685a aVar) {
        if (this.f70314c.getAwemeRawAd() != null && !this.f70314c.getAwemeRawAd().isCardOnceClick()) {
            this.f70320i = false;
            this.f70314c.getAwemeRawAd().setCardOnceClick(true);
            this.f70316e.mo48228a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
        }
    }

    public DownloadAdCardAction(Context context, Aweme aweme, C26718p pVar) {
        super(context, aweme, pVar);
        this.f70320i = true;
        this.f70309a = R.drawable.aio;
    }
}
