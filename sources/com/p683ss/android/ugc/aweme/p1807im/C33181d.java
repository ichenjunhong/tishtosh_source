package com.p683ss.android.ugc.aweme.p1807im;

import android.view.Surface;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.newfollow.util.C37938f;
import com.p683ss.android.ugc.aweme.p1382aq.C23217av;
import com.p683ss.android.ugc.aweme.p1382aq.C23219ax;
import com.p683ss.android.ugc.aweme.p1382aq.C23221az;
import com.p683ss.android.ugc.aweme.p1807im.service.C35461k;
import com.p683ss.android.ugc.aweme.p1807im.service.C35474o;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;

/* renamed from: com.ss.android.ugc.aweme.im.d */
public final class C33181d implements C35461k {

    /* renamed from: a */
    private C48021h f86144a;

    /* renamed from: b */
    private C38871j f86145b;

    /* renamed from: a */
    public final Object mo70347a() {
        return this.f86144a;
    }

    /* renamed from: b */
    public final boolean mo70354b() {
        if (this.f86144a == null || !this.f86144a.mo95257o()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final long mo70355c() {
        if (this.f86144a != null) {
            return this.f86144a.mo95256n();
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo70356d() {
        if (this.f86144a != null) {
            this.f86144a.mo95293z();
        }
    }

    /* renamed from: e */
    public final void mo70357e() {
        if (this.f86144a != null) {
            this.f86144a.mo95291x();
        }
    }

    /* renamed from: f */
    public final void mo70358f() {
        if (this.f86144a != null) {
            this.f86144a.mo95292y();
        }
    }

    /* renamed from: g */
    public final void mo70359g() {
        if (this.f86144a != null) {
            this.f86144a.mo95264A();
            this.f86144a = null;
        }
        this.f86145b = null;
    }

    /* renamed from: a */
    public final void mo70351a(Video video) {
        if (this.f86144a != null) {
            this.f86144a.mo95274a(video, true);
        }
    }

    /* renamed from: a */
    public final void mo70352a(boolean z) {
        if (this.f86144a != null) {
            if (z) {
                this.f86144a.mo95265B();
                return;
            }
            this.f86144a.mo95266C();
        }
    }

    /* renamed from: a */
    public final void mo70349a(Aweme aweme, int i) {
        new C23217av().mo48026c(aweme, 7000).mo48025b("chat").mo48076e();
    }

    /* renamed from: b */
    public final void mo70353b(Aweme aweme, int i) {
        new C23219ax().mo48039a("chat").mo48042c(aweme, 7000).mo48076e();
    }

    /* renamed from: a */
    public final void mo70348a(Surface surface, final C35474o oVar) {
        if (this.f86144a == null) {
            this.f86144a = C37938f.m84829a().mo77414b();
        }
        this.f86145b = new C38871j() {
            /* renamed from: a */
            public final void mo53523a(float f) {
            }

            /* renamed from: a */
            public final void mo53525a(C50117f fVar) {
            }

            /* renamed from: a */
            public final void mo53527a(String str) {
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
            public final void mo53531b(String str) {
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
            public final void mo53526a(C50118g gVar) {
                if (oVar != null) {
                    oVar.mo70460a();
                }
            }

            /* renamed from: c */
            public final void mo53533c(String str) {
                if (oVar != null) {
                    oVar.mo70462b();
                }
            }

            /* renamed from: a */
            public final void mo53524a(C50112d dVar) {
                if (oVar != null) {
                    C35474o oVar = oVar;
                    StringBuilder sb = new StringBuilder("play failed : errorCode is ");
                    sb.append(dVar.f125526d);
                    oVar.mo70461a(sb.toString());
                }
            }
        };
        this.f86144a.mo95281a(surface);
        this.f86144a.mo95284a(this.f86145b);
    }

    /* renamed from: a */
    public final void mo70350a(Aweme aweme, long j) {
        new C23221az().mo47954f(aweme).mo48052a("chat").mo48049a(j).mo48076e();
    }
}
