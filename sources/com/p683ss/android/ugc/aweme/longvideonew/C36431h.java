package com.p683ss.android.ugc.aweme.longvideonew;

import android.os.SystemClock;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36363g;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36363g.C36364a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23217av;
import com.p683ss.android.ugc.aweme.p1382aq.C23219ax;
import com.p683ss.android.ugc.aweme.p1382aq.C23221az;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.video.C48069o;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.p2394c.C48005c;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.h */
public final class C36431h implements C38871j {

    /* renamed from: e */
    public static final C36432a f93311e = new C36432a(null);

    /* renamed from: a */
    public final Aweme f93312a;

    /* renamed from: b */
    public final String f93313b;

    /* renamed from: c */
    public final int f93314c;

    /* renamed from: d */
    public final C48121w f93315d;

    /* renamed from: f */
    private long f93316f = -1;

    /* renamed from: g */
    private long f93317g;

    /* renamed from: h */
    private int f93318h = 1;

    /* renamed from: i */
    private boolean f93319i;

    /* renamed from: j */
    private long f93320j = -1;

    /* renamed from: k */
    private boolean f93321k;

    /* renamed from: l */
    private int f93322l;

    /* renamed from: m */
    private long f93323m = -1;

    /* renamed from: n */
    private long f93324n = -1;

    /* renamed from: o */
    private long f93325o;

    /* renamed from: p */
    private long f93326p;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.h$a */
    public static final class C36432a {
        private C36432a() {
        }

        public /* synthetic */ C36432a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
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

    /* renamed from: d */
    public final void mo53534d(String str) {
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        this.f93317g = SystemClock.elapsedRealtime();
        this.f93316f = SystemClock.elapsedRealtime();
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        Video video;
        Aweme aweme = this.f93312a;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        C36364a.m82054a(dVar, video, "aweme_long_video_error_rate", 1, "aweme_long_video_play_error_log", "play_error");
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        Video video;
        this.f93323m = SystemClock.elapsedRealtime();
        if (this.f93316f != -1) {
            C36364a.m82051a(SystemClock.elapsedRealtime() - this.f93316f, "long_video_first_frame_time");
            this.f93316f = -1;
        }
        Aweme aweme = this.f93312a;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        C36364a.m82052a(video, "aweme_long_video_error_rate");
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        new C23219ax().mo48039a(this.f93313b).mo48041b(this.f93313b).mo48042c(this.f93312a, this.f93314c).mo48037a(this.f93318h).mo48076e();
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        this.f93321k = true;
        new C23217av().mo48025b(this.f93313b).mo48029d(this.f93313b).mo48026c(this.f93312a, this.f93314c).mo48032f(C48069o.m104089K().name()).mo48024b(this.f93318h).mo48076e();
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        String str;
        Video video;
        boolean z2 = z;
        if (this.f93321k) {
            this.f93319i = z2;
            if (z2) {
                this.f93322l++;
                if (this.f93320j == -1) {
                    this.f93320j = SystemClock.elapsedRealtime();
                }
            } else if (this.f93320j != -1) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.f93320j;
                this.f93326p += elapsedRealtime;
                this.f93320j = -1;
                IRequestIdService a = C23325e.m57379a();
                Aweme aweme = this.f93312a;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                String str2 = a.getRequestIdAndIndex(C52711k.m112231a(str, (Object) Integer.valueOf(this.f93314c))).f62324a;
                C36364a aVar = C36363g.f93076a;
                Aweme aweme2 = this.f93312a;
                if (aweme2 != null) {
                    video = aweme2.getVideo();
                } else {
                    video = null;
                }
                String m = C23198ae.m56877m(this.f93312a);
                C52711k.m112236a((Object) m, "MobUtils.getAid(mAweme)");
                aVar.mo75275a(video, m, elapsedRealtime, "resume", str2, "type_long_video_log_block_report", this.f93315d);
            }
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        this.f93317g = SystemClock.elapsedRealtime();
        if (this.f93324n != -1) {
            this.f93325o += SystemClock.elapsedRealtime() - this.f93324n;
            this.f93324n = -1;
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        Object obj;
        float f;
        this.f93324n = SystemClock.elapsedRealtime();
        C23221az a = new C23221az().mo48052a(this.f93313b).mo47954f(this.f93312a).mo48049a(SystemClock.elapsedRealtime() - this.f93317g);
        C48121w wVar = this.f93315d;
        Video video = null;
        if (wVar != null) {
            obj = wVar.mo95242a();
        } else {
            obj = null;
        }
        C23221az d = a.mo48056c(String.valueOf(obj)).mo48057d(C23198ae.m56847a(this.f93312a, this.f93314c));
        C48121w wVar2 = this.f93315d;
        if (wVar2 != null) {
            f = wVar2.mo95249g();
        } else {
            f = -1.0f;
        }
        d.mo48047a(f).mo48048a(this.f93318h).mo48076e();
        int i = 0;
        if (this.f93319i) {
            mo53532b(false);
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() - this.f93323m) - this.f93325o;
        if (elapsedRealtime > 0) {
            String str2 = "long_video_block";
            C23088c a2 = C48005c.m103855a(C23088c.m56631a().mo47821a("count_rate", Float.valueOf((((float) this.f93322l) * 1000.0f) / ((float) elapsedRealtime))).mo47823a("duration_rate", Long.valueOf(this.f93326p / elapsedRealtime)).mo47822a("block_count", Integer.valueOf(this.f93322l)).mo47823a("block_duration", Long.valueOf(this.f93326p))).mo47823a("duration", Long.valueOf(elapsedRealtime));
            String str3 = "video_duration";
            Aweme aweme = this.f93312a;
            if (aweme != null) {
                video = aweme.getVideo();
            }
            if (video != null) {
                i = this.f93312a.getVideo().getDuration();
            }
            C23131p.m57779a(str2, a2.mo47822a(str3, Integer.valueOf(i)).mo47824a("netType", NetworkUtils.getNetworkAccessType(C11010c.m22280a())).mo47825b());
        }
    }

    public C36431h(Aweme aweme, String str, int i, C48121w wVar) {
        C52711k.m112240b(str, "mEventType");
        this.f93312a = aweme;
        this.f93313b = str;
        this.f93314c = i;
        this.f93315d = wVar;
    }
}
