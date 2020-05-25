package com.p683ss.android.ugc.aweme.commercialize.splash.livesplash;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26880f;
import com.p683ss.android.ugc.aweme.feed.adapter.C30013ad;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai;
import com.p683ss.android.ugc.aweme.feed.panel.C30648q;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32496e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.k */
public final class C26244k {

    /* renamed from: a */
    public static final C26244k f69296a = new C26244k();

    private C26244k() {
    }

    /* renamed from: a */
    public static final boolean m63591a(C30753ai aiVar) {
        if (aiVar == null) {
            return false;
        }
        C26237e b = C26237e.m63579b();
        C52711k.m112236a((Object) b, "LiveAwesomeSplashManager.getInstance()");
        Aweme aweme = b.f69278e;
        C26237e.m63579b().mo53890c();
        if (aweme == null || !C26235d.m63570a(aweme)) {
            return false;
        }
        C30648q qVar = aiVar.f80590m;
        if (qVar == null || qVar.mo60500V() == null) {
            return false;
        }
        C30013ad V = qVar.mo60500V();
        C52711k.m112236a((Object) V, "panel.adapter");
        int count = V.getCount() - 1;
        while (count >= 0) {
            Aweme c = qVar.mo60500V().mo60285c(count);
            if (c != aweme) {
                C52711k.m112236a((Object) c, "item");
                if (!TextUtils.equals(c.getAid(), aweme.getAid())) {
                    count--;
                }
            }
            return false;
        }
        LiveAwesomeSplashInfo f = C26235d.m63575f(aweme);
        if (f != null) {
            f.setHasShown(false);
        }
        C23324d.m57378a().updateAweme(aweme);
        C32496e.m75245b(true);
        int al = qVar.mo60520al();
        try {
            qVar.mo62859b(aweme, al);
        } catch (C26880f e) {
            C32458a.m75143a((Exception) e);
        }
        qVar.mo62814a(al, false);
        C32496e.m75245b(false);
        return true;
    }
}
