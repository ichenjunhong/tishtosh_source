package com.p683ss.android.ugc.aweme.commercialize.splash.livesplash;

import com.p683ss.android.common.applog.GlobalContext;
import com.p683ss.android.p1103ad.splash.p1111c.C18559a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.livesplash.h */
final /* synthetic */ class C26241h implements Callable {

    /* renamed from: a */
    private final C18559a f69292a;

    C26241h(C18559a aVar) {
        this.f69292a = aVar;
    }

    public final Object call() {
        C18559a aVar = this.f69292a;
        if (aVar.mo37856B() == 1) {
            String C = aVar.mo37857C();
            C26217c.m63502a();
            Aweme c = C26217c.m63503c(C);
            C26088l.m63319b(GlobalContext.getContext(), c, C26217c.m63502a().mo53857a("11", (String) null));
            StringBuilder sb = new StringBuilder("awesome show failed cid: ");
            sb.append(C);
            sb.append(" isAd: ");
            sb.append(c == null ? "false" : Boolean.valueOf(c.isAd()));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("ad_show_fail_type", "11");
            C26077e.m63190a().mo53582a("splash_ad").mo53593b("show_failed").mo53580a(Long.valueOf(aVar.mo37863p())).mo53604i(aVar.mo37864r()).mo53581a((Object) hashMap).mo53597c();
        }
        return null;
    }
}
