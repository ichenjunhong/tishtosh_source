package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25064a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30339h;
import com.p683ss.android.ugc.aweme.longvideo.p1933a.C36349a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.at */
public final class C26053at implements C38871j {

    /* renamed from: b */
    public static long f68803b;

    /* renamed from: c */
    public static boolean f68804c;

    /* renamed from: d */
    public static final C26054a f68805d = new C26054a(null);

    /* renamed from: a */
    public final Aweme f68806a;

    /* renamed from: e */
    private long f68807e;

    /* renamed from: f */
    private boolean f68808f = true;

    /* renamed from: g */
    private boolean f68809g;

    /* renamed from: h */
    private boolean f68810h;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.log.at$a */
    public static final class C26054a {
        private C26054a() {
        }

        /* renamed from: a */
        public final void mo53540a() {
            m63122a(0);
            m63123a(false);
        }

        /* renamed from: a */
        private static void m63123a(boolean z) {
            C26053at.f68804c = false;
        }

        public /* synthetic */ C26054a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static void m63122a(long j) {
            C26053at.f68803b = 0;
        }

        /* renamed from: a */
        public static boolean m63124a(Aweme aweme) {
            if (aweme != null) {
                return aweme.isAd();
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo53541b(Aweme aweme) {
            if (!C36353b.f93061a.mo75269b(aweme) || !m63124a(aweme)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static final boolean m63105a(Aweme aweme) {
        return f68805d.mo53541b(aweme);
    }

    /* renamed from: b */
    public static final long m63106b() {
        return f68803b;
    }

    /* renamed from: c */
    public static final void m63107c() {
        f68805d.mo53540a();
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
    }

    /* renamed from: a */
    public final void mo53522a() {
        if (!this.f68810h) {
            this.f68810h = true;
            if (!this.f68809g) {
                Context a = C11010c.m22280a();
                Aweme aweme = this.f68806a;
                C26088l.m63322b(a, "break_complete", aweme, C26088l.m63373m(a, aweme, "long video raw ad break"));
            }
            C47718bf.m103291d(this);
        }
    }

    public C26053at(Aweme aweme) {
        this.f68806a = aweme;
    }

    @C53771m
    public final void onDestroyBreakEvent(C30339h hVar) {
        C52711k.m112240b(hVar, "event");
        mo53522a();
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        if (!this.f68808f) {
            f68803b += SystemClock.elapsedRealtime() - this.f68807e;
            this.f68808f = true;
        }
    }

    @C53771m
    public final void onCommentEvent(C25064a aVar) {
        C52711k.m112240b(aVar, "event");
        if (aVar.f66393a == 3) {
            Context a = C11010c.m22280a();
            Aweme aweme = this.f68806a;
            C26088l.m63322b(a, "comment_complete", aweme, C26088l.m63373m(a, aweme, "long video raw ad comment"));
        }
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        f68803b += SystemClock.elapsedRealtime() - this.f68807e;
        Context a = C11010c.m22280a();
        Aweme aweme = this.f68806a;
        C26088l.m63322b(a, "over_complete", aweme, C26088l.m63373m(a, aweme, "long video raw ad over"));
        this.f68809g = true;
        this.f68808f = true;
        f68804c = true;
    }

    @C53771m
    public final void onOperateEvent(C36349a aVar) {
        C52711k.m112240b(aVar, "event");
        if (aVar.f93058a) {
            if (!this.f68808f) {
                f68803b += SystemClock.elapsedRealtime() - this.f68807e;
            }
        } else if (aVar.f93059b) {
            if (!this.f68808f) {
                this.f68807e = SystemClock.elapsedRealtime();
            }
            Context a = C11010c.m22280a();
            Aweme aweme = this.f68806a;
            C26088l.m63322b(a, "progress_complete", aweme, C26088l.m63373m(a, aweme, "long video raw ad seek complete"));
        }
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        this.f68807e = SystemClock.elapsedRealtime();
        this.f68809g = false;
        this.f68808f = false;
        Context a = C11010c.m22280a();
        Aweme aweme = this.f68806a;
        C26088l.m63322b(a, "play_complete", aweme, C26088l.m63373m(a, aweme, "long video raw ad play"));
    }

    @C53771m
    public final void onVideoEvent(C30332aw awVar) {
        String str;
        C52711k.m112240b(awVar, "event");
        if (awVar.f79228a == 13 && (awVar.f79229b instanceof String)) {
            Object obj = awVar.f79229b;
            if (obj != null) {
                String str2 = (String) obj;
                Aweme aweme = this.f68806a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                boolean z = true;
                if (!(!C52711k.m112239a((Object) str2, (Object) str))) {
                    Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(str2);
                    if (rawAdAwemeById != null) {
                        if (rawAdAwemeById.getUserDigg() == 0) {
                            z = false;
                        }
                        if (z) {
                            Context a = C11010c.m22280a();
                            Aweme aweme2 = this.f68806a;
                            C26088l.m63322b(a, "like_complete", aweme2, C26088l.m63373m(a, aweme2, "long video raw ad like"));
                            return;
                        }
                        Context a2 = C11010c.m22280a();
                        Aweme aweme3 = this.f68806a;
                        C26088l.m63322b(a2, "like_cancel_complete", aweme3, C26088l.m63373m(a2, aweme3, "long video raw ad cancel like"));
                    }
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.String");
            }
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        this.f68807e = SystemClock.elapsedRealtime();
        if (this.f68809g) {
            Context a = C11010c.m22280a();
            Aweme aweme = this.f68806a;
            C26088l.m63322b(a, "replay_complete", aweme, C26088l.m63373m(a, aweme, "long video raw ad replay"));
        }
        this.f68809g = false;
        this.f68808f = false;
    }
}
