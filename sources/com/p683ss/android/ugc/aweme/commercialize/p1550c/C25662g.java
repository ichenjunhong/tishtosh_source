package com.p683ss.android.ugc.aweme.commercialize.p1550c;

import android.content.Context;
import com.p683ss.android.ugc.aweme.commercialize.log.C26057av;
import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26081f;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1585a.C26820a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.c.g */
public final class C25662g implements C26820a {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.c.g$a */
    static final class C25663a implements C26057av {

        /* renamed from: a */
        final /* synthetic */ Aweme f67881a;

        C25663a(Aweme aweme) {
            this.f67881a = aweme;
        }

        /* renamed from: a */
        public final void mo52818a(String str, String str2, long j) {
            C26077e.m63191a(str, str2, j).mo53593b("track_url").mo53582a("track_ad").mo53603h("click").mo53590b(this.f67881a).mo53597c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.c.g$b */
    static final class C25664b implements C26057av {

        /* renamed from: a */
        final /* synthetic */ Aweme f67882a;

        C25664b(Aweme aweme) {
            this.f67882a = aweme;
        }

        /* renamed from: a */
        public final void mo52818a(String str, String str2, long j) {
            C26077e.m63191a(str, str2, j).mo53593b("track_url").mo53582a("track_ad").mo53603h("show").mo53590b(this.f67882a).mo53597c();
        }
    }

    /* renamed from: b */
    public final void mo52815b(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        C26072c.m63175b(aweme);
    }

    /* renamed from: a */
    public final void mo52812a(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        C26072c.m63170a(aweme);
    }

    /* renamed from: a */
    public final void mo52810a(Context context, Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        if (context != null) {
            C26540w.m64249f(context, aweme);
        }
    }

    /* renamed from: b */
    public final void mo52816b(Aweme aweme, boolean z) {
        C52711k.m112240b(aweme, "aweme");
        C26081f.m63236a((C26057av) new C25663a(aweme), aweme.getActivityPendant().getClickTrackUrlList(), true);
    }

    /* renamed from: b */
    public final boolean mo52817b(Context context, Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        return C26540w.m64246e(context, aweme);
    }

    /* renamed from: a */
    public final void mo52813a(Aweme aweme, int i) {
        C52711k.m112240b(aweme, "aweme");
        C26072c.m63179c(aweme, i);
    }

    /* renamed from: a */
    public final void mo52814a(Aweme aweme, boolean z) {
        C52711k.m112240b(aweme, "aweme");
        C26081f.m63236a((C26057av) new C25664b(aweme), aweme.getActivityPendant().getTrackUrlList(), true);
    }

    /* renamed from: a */
    public final void mo52811a(Context context, Aweme aweme, String str, String str2) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "label");
        C52711k.m112240b(str2, "refer");
        C26088l.m63283a(context, aweme, str, str2);
    }
}
