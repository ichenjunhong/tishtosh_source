package com.p683ss.android.ugc.aweme.profile.service;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.profile.C26184e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26532p;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.views.popupwebpage.C26780c.C26781a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30317ai;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2091a.C40203a;
import com.p683ss.android.ugc.aweme.profile.util.C40568s;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.service.b */
public final class C40009b implements C40016i {
    /* renamed from: b */
    public final C40568s mo82013b() {
        return C26532p.f69867a;
    }

    /* renamed from: a */
    public final C40203a mo82008a() {
        return new C26184e();
    }

    /* renamed from: c */
    public final boolean mo82018c() {
        return C26512f.m64139b();
    }

    /* renamed from: d */
    public final boolean mo82019d() {
        return C26512f.m64130a();
    }

    /* renamed from: b */
    public final boolean mo82016b(Aweme aweme) {
        return C26512f.m64133aa(aweme);
    }

    /* renamed from: a */
    public final boolean mo82012a(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || !C26512f.m64057a(aweme) || TextUtils.isEmpty(C26512f.m64105G(aweme))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo82010a(Context context, Aweme aweme) {
        C26088l.m63359g(context, aweme);
    }

    /* renamed from: b */
    public final void mo82014b(Context context, Aweme aweme) {
        C26088l.m63363h(context, aweme);
    }

    /* renamed from: a */
    public final JSONObject mo82009a(Context context, Aweme aweme, String str) {
        return C26088l.m63373m(context, aweme, str);
    }

    /* renamed from: a */
    public final boolean mo82011a(Context context, AwemeRawAd awemeRawAd, String str) {
        C26781a a = new C26781a().mo54668a(context).mo54669a(awemeRawAd);
        a.f70553c = 3;
        return C26540w.m64237b(a.mo54670a(str));
    }

    /* renamed from: b */
    public final void mo82015b(Context context, Aweme aweme, String str) {
        if (context != null) {
            C47718bf.m103288a(new C30317ai(context.hashCode(), 2, aweme, str));
        }
    }

    /* renamed from: c */
    public final void mo82017c(Context context, Aweme aweme, String str) {
        if (context != null) {
            C47718bf.m103288a(new C30317ai(context.hashCode(), 1, aweme, str));
        }
    }
}
