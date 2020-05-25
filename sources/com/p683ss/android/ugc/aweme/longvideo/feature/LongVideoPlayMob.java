package com.p683ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.os.SystemClock;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.longvideo.DiggView.C36332a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36363g;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36363g.C36364a;
import com.p683ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import com.p683ss.android.ugc.aweme.p1382aq.C23217av;
import com.p683ss.android.ugc.aweme.p1382aq.C23219ax;
import com.p683ss.android.ugc.aweme.p1382aq.C23221az;
import com.p683ss.android.ugc.aweme.p1382aq.C23256z;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.video.C48069o;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob */
public final class LongVideoPlayMob implements C0183j, OnSeekBarChangeListener, C36332a, C38871j {

    /* renamed from: a */
    public long f93094a;

    /* renamed from: b */
    public long f93095b = -1;

    /* renamed from: c */
    public long f93096c;

    /* renamed from: d */
    public LongVideoMobViewModel f93097d;

    /* renamed from: e */
    public Aweme f93098e;

    /* renamed from: f */
    public String f93099f = "";

    /* renamed from: g */
    public int f93100g;

    /* renamed from: h */
    public int f93101h;

    /* renamed from: i */
    public int f93102i;

    /* renamed from: j */
    public long f93103j;

    /* renamed from: k */
    public boolean f93104k;

    /* renamed from: l */
    public final FragmentActivity f93105l;

    /* renamed from: m */
    public final C48121w f93106m;

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

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public final void onResume() {
        this.f93096c = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo75228a() {
        new C23256z().mo48189d(this.f93099f).mo48191e(this.f93099f).mo48185b(this.f93100g).mo47954f(this.f93098e).mo48187c(this.f93102i).mo48183a(System.currentTimeMillis() - this.f93094a).mo48076e();
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public final void onPause() {
        long currentTimeMillis = System.currentTimeMillis() - this.f93096c;
        if (!TextUtils.equals(this.f93099f, "discovery_second_floor")) {
            new C23213as("long_video_stay_time").mo48005a(String.valueOf(currentTimeMillis)).mo48006b(this.f93099f).mo47954f(this.f93098e).mo48076e();
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        this.f93094a = System.currentTimeMillis();
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        this.f93094a = System.currentTimeMillis();
        this.f93095b = System.currentTimeMillis();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
        if (seekBar != null) {
            this.f93101h = seekBar.getProgress();
        }
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        Video video;
        Aweme aweme = this.f93098e;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        C36364a.m82054a(dVar, video, "aweme_long_video_error_rate", 1, "aweme_long_video_play_error_log", "play_error");
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        new C23219ax().mo48039a(this.f93099f).mo48041b(this.f93099f).mo48042c(this.f93098e, this.f93100g).mo48037a(this.f93102i).mo48076e();
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        String str;
        String str2;
        if (seekBar != null) {
            if (this.f93101h < seekBar.getProgress()) {
                str = "front";
            } else {
                str = "back";
            }
            String str3 = "click_progress_bar";
            C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f93099f).mo47829a("action_type", str);
            String str4 = "group_id";
            Aweme aweme = this.f93098e;
            if (aweme != null) {
                str2 = aweme.getAid();
            } else {
                str2 = null;
            }
            C26890h.m65011a(str3, a.mo47829a(str4, str2).f61491a);
        }
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        Video video;
        if (this.f93095b != -1) {
            C36364a.m82051a(System.currentTimeMillis() - this.f93095b, "long_video_first_frame_time");
            this.f93095b = -1;
        }
        Aweme aweme = this.f93098e;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        C36364a.m82052a(video, "aweme_long_video_error_rate");
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        new C23221az().mo48052a(this.f93099f).mo47954f(this.f93098e).mo48049a(System.currentTimeMillis() - this.f93094a).mo48056c(this.f93106m.mo95242a().toString()).mo48057d(C23198ae.m56847a(this.f93098e, this.f93100g)).mo48047a(this.f93106m.mo95249g()).mo48048a(this.f93102i).mo48076e();
        if (this.f93104k) {
            mo53532b(false);
        }
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        new C23217av().mo48025b(this.f93099f).mo48029d(this.f93099f).mo48026c(this.f93098e, this.f93100g).mo48032f(C48069o.m104089K().name()).mo48024b(this.f93102i).mo48076e();
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        String str;
        Video video;
        boolean z2 = z;
        this.f93104k = z2;
        if (z2) {
            if (this.f93103j == -1) {
                this.f93103j = SystemClock.elapsedRealtime();
            }
        } else if (this.f93103j != -1) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f93103j;
            this.f93103j = -1;
            IRequestIdService a = C23325e.m57379a();
            Aweme aweme = this.f93098e;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            String str2 = a.getRequestIdAndIndex(C52711k.m112231a(str, (Object) Integer.valueOf(this.f93100g))).f62324a;
            C36364a aVar = C36363g.f93076a;
            Aweme aweme2 = this.f93098e;
            if (aweme2 != null) {
                video = aweme2.getVideo();
            } else {
                video = null;
            }
            String m = C23198ae.m56877m(this.f93098e);
            C52711k.m112236a((Object) m, "MobUtils.getAid(aweme)");
            aVar.mo75275a(video, m, elapsedRealtime, "resume", str2, "type_long_video_log_block_report", this.f93106m);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0046, code lost:
        if (r2 == null) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LongVideoPlayMob(android.support.p030v4.app.FragmentActivity r2, com.p683ss.android.ugc.aweme.video.C48121w r3) {
        /*
            r1 = this;
            java.lang.String r0 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "mPlayManager"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            r1.<init>()
            r1.f93105l = r2
            r1.f93106m = r3
            r2 = -1
            r1.f93095b = r2
            java.lang.String r0 = ""
            r1.f93099f = r0
            r0 = 1
            r1.f93102i = r0
            r1.f93103j = r2
            android.support.v4.app.FragmentActivity r2 = r1.f93105l
            android.arch.lifecycle.h r2 = r2.getLifecycle()
            r3 = r1
            android.arch.lifecycle.j r3 = (android.arch.lifecycle.C0183j) r3
            r2.mo324a(r3)
            android.support.v4.app.FragmentActivity r2 = r1.f93105l
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = com.p683ss.android.ugc.aweme.longvideo.p1934b.C36351a.C36352a.m82036a(r2)
            r1.f93097d = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f93097d
            if (r2 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f93194b
            goto L_0x003a
        L_0x0039:
            r2 = 0
        L_0x003a:
            r1.f93098e = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f93097d
            if (r2 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f93193a
            if (r2 == 0) goto L_0x0048
            java.lang.String r2 = r2.f93088a
            if (r2 != 0) goto L_0x004a
        L_0x0048:
            java.lang.String r2 = ""
        L_0x004a:
            r1.f93099f = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f93097d
            if (r2 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f93193a
            if (r2 == 0) goto L_0x0057
            int r2 = r2.f93089b
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            r1.f93100g = r2
            com.ss.android.ugc.aweme.longvideo.viewmodel.LongVideoMobViewModel r2 = r1.f93097d
            if (r2 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.longvideo.f r2 = r2.f93193a
            if (r2 == 0) goto L_0x0064
            int r0 = r2.f93090c
        L_0x0064:
            r1.f93102i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.longvideo.feature.LongVideoPlayMob.<init>(android.support.v4.app.FragmentActivity, com.ss.android.ugc.aweme.video.w):void");
    }
}
