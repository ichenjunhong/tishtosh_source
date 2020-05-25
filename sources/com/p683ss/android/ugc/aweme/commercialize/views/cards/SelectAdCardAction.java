package com.p683ss.android.ugc.aweme.commercialize.views.cards;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26448c.C26449a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48299a.C48300a;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardAction */
public final class SelectAdCardAction extends AbsAdCardAction {

    /* renamed from: i */
    private C48300a f70324i;

    /* renamed from: d */
    public final void mo54520d() {
        mo54519c("show");
        C26449a d = new C26449a().mo54168a("othershow").mo54171b("card").mo54173d("choose");
        Aweme aweme = this.f70314c;
        C52711k.m112236a((Object) aweme, "mAweme");
        mo54514a(d.mo54167a(aweme).mo54169a(C26512f.m64134ab(this.f70314c)).mo54170a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54522f() {
        /*
            r4 = this;
            java.lang.String r0 = "close"
            r4.mo54519c(r0)
            com.ss.android.ugc.aweme.commercialize.utils.c$a r0 = new com.ss.android.ugc.aweme.commercialize.utils.c$a
            r0.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.f70314c
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.commercialize.utils.c$a r0 = r0.mo54167a(r1)
            java.lang.String r1 = "close"
            com.ss.android.ugc.aweme.commercialize.utils.c$a r0 = r0.mo54168a(r1)
            java.lang.String r1 = "card"
            com.ss.android.ugc.aweme.commercialize.utils.c$a r0 = r0.mo54171b(r1)
            com.ss.android.ugc.aweme.web.jsbridge.a$a r1 = r4.f70324i
            if (r1 == 0) goto L_0x0033
            org.json.JSONObject r1 = r1.f121536a
            if (r1 == 0) goto L_0x0033
            java.lang.String r2 = "card_type"
            java.lang.String r3 = "choose"
            java.lang.String r1 = r1.optString(r2, r3)
            if (r1 != 0) goto L_0x0035
        L_0x0033:
            java.lang.String r1 = "choose"
        L_0x0035:
            com.ss.android.ugc.aweme.commercialize.utils.c$a r0 = r0.mo54173d(r1)
            com.ss.android.ugc.aweme.commercialize.utils.c r0 = r0.mo54170a()
            r4.mo54514a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardAction.mo54522f():void");
    }

    @C53771m
    public final void userChooseEvent(C48300a aVar) {
        C52711k.m112240b(aVar, "chooseLogAdExtraData");
        this.f70324i = aVar;
    }

    /* renamed from: a */
    public final void mo54515a(String str) {
        StringBuilder sb = new StringBuilder("show fail: ");
        sb.append(str);
        mo54519c(sb.toString());
        C26449a d = new C26449a().mo54168a("othershow_fail").mo54171b("card").mo54172c(String.valueOf(str)).mo54173d("choose");
        Aweme aweme = this.f70314c;
        C52711k.m112236a((Object) aweme, "mAweme");
        mo54514a(d.mo54167a(aweme).mo54169a(C26512f.m64134ab(this.f70314c)).mo54170a());
    }

    public SelectAdCardAction(Context context, Aweme aweme, C26718p pVar) {
        C52711k.m112240b(pVar, "adHalfWebPage");
        super(context, aweme, pVar);
        this.f70309a = R.drawable.aim;
    }
}
