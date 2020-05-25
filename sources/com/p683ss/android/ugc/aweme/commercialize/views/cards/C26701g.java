package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.text.TextUtils;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.commercialize.model.C26105a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26524k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26525l;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.g */
final /* synthetic */ class C26701g implements Runnable {

    /* renamed from: a */
    private final C26691e f70373a;

    /* renamed from: b */
    private final C26105a f70374b;

    C26701g(C26691e eVar, C26105a aVar) {
        this.f70373a = eVar;
        this.f70374b = aVar;
    }

    public final void run() {
        C26691e eVar = this.f70373a;
        C26105a aVar = this.f70374b;
        if (!eVar.f70354o) {
            String str = aVar.f68910b;
            boolean z = false;
            if (!C26512f.m64083z(eVar.f70341b)) {
                eVar.mo54537a("not satisfied");
            } else if (C30367g.m71282a().f79378g) {
                eVar.mo54537a("has shown once");
            } else {
                boolean b = C18920g.m46052b(eVar.f70340a, C26512f.m64107I(eVar.f70341b));
                if (C26512f.m64082y(eVar.f70341b) && b) {
                    eVar.mo54537a("already download started or installed");
                } else if (eVar.f70342c.mo54260a() || eVar.f70356q) {
                    eVar.mo54537a("already shown once");
                } else {
                    if (eVar.f70347h != null && eVar.f70347h.f70318g) {
                        eVar.mo54537a("top page is showing");
                    } else {
                        String b2 = eVar.mo54538b(false);
                        if (TextUtils.isEmpty(b2) || !TextUtils.equals(str, "passive_show") || !C30367g.m71282a().f79379h) {
                            if (b2 == null) {
                                b2 = eVar.f70355p;
                            }
                            if (!TextUtils.isEmpty(b2)) {
                                eVar.f70349j.mo48228a("ON_AD_HALF_WEB_PAGE_SHOW_FAIL", (Object) b2);
                                C26072c.m63176b(eVar.f70341b, 1);
                                C26524k.m64165a(eVar.f70341b, b2);
                            } else {
                                z = true;
                            }
                        } else {
                            eVar.mo54537a("search: just enter");
                        }
                    }
                }
            }
            if (z) {
                eVar.f70349j.mo48228a("AD_ACTION_MOVE_OUT_DESC", (Object) Boolean.valueOf(C26525l.m64177f(eVar.f70341b)));
                eVar.f70350k.postDelayed(new C26706l(eVar), C26525l.m64178g(eVar.f70341b));
            }
        }
    }
}
