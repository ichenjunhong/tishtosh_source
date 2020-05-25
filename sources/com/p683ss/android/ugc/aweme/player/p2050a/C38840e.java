package com.p683ss.android.ugc.aweme.player.p2050a;

import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.cache.C30163b;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.feed.utils.C31189e;
import com.p683ss.android.ugc.aweme.p1340am.C22572b;
import com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23223a;
import com.p683ss.android.ugc.aweme.p1382aq.p1384b.C23224b;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbResponseReportLimitExp;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.p2454f.C48918e;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.player.a.e */
public final class C38840e {

    /* renamed from: a */
    public C30016ag f98891a;

    /* renamed from: b */
    public String f98892b;

    /* renamed from: c */
    public Video f98893c;

    /* renamed from: d */
    public String f98894d;

    /* renamed from: e */
    public Fragment f98895e;

    /* renamed from: f */
    public int f98896f;

    /* renamed from: g */
    private int f98897g;

    /* renamed from: com.ss.android.ugc.aweme.player.a.e$a */
    public static class C38841a {

        /* renamed from: a */
        public C38840e f98898a = new C38840e();

        /* renamed from: a */
        public final C38841a mo78811a(int i) {
            this.f98898a.f98896f = i;
            return this;
        }

        /* renamed from: b */
        public final C38841a mo78816b(String str) {
            this.f98898a.f98894d = str;
            return this;
        }

        /* renamed from: a */
        public final C38841a mo78812a(Fragment fragment) {
            this.f98898a.f98895e = fragment;
            return this;
        }

        /* renamed from: a */
        public final C38841a mo78813a(C30016ag agVar) {
            this.f98898a.f98891a = agVar;
            return this;
        }

        /* renamed from: a */
        public final C38841a mo78814a(Video video) {
            this.f98898a.f98893c = video;
            return this;
        }

        /* renamed from: a */
        public final C38841a mo78815a(String str) {
            this.f98898a.f98892b = str;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo78810a() {
        int i;
        if (this.f98891a != null && this.f98891a.mo53999e() != null && this.f98893c != null && this.f98895e != null && this.f98897g < C10181b.m20511a().mo18168a(PlayerAbResponseReportLimitExp.class, true, "video_rsp_log_frequency", 31744, 10)) {
            VideoUrlModel playAddr = this.f98893c.getPlayAddr();
            if (playAddr != null) {
                try {
                    i = C48918e.m105714f();
                } catch (Exception unused) {
                    i = 0;
                }
                boolean a = C30163b.m70774a(this.f98891a.mo53999e().getAid());
                boolean userVisibleHint = this.f98895e.getUserVisibleHint();
                int i2 = this.f98896f;
                int a2 = C31189e.m72826a(this.f98891a.mo53999e());
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long e = C30578o.m71571e();
                C38842f fVar = r0;
                C38842f fVar2 = new C38842f(this, userVisibleHint, i, a2, playAddr, a, this.f98891a.mo53999e().getAid(), i2, C30578o.m71570d(), C30578o.m71569c(), e, elapsedRealtime);
                C0013i.m18a((Callable<TResult>) fVar, (Executor) C26890h.m65003a());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo78809a(boolean z, int i, int i2, VideoUrlModel videoUrlModel, boolean z2, String str, int i3, String str2, String str3, long j, long j2) throws Exception {
        int i4;
        int i5;
        String str4 = str;
        C26898j a = new C26898j().mo54849a("request_id", this.f98894d).mo54849a("duration", this.f98892b);
        String str5 = "is_success";
        if (!z) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        C26898j a2 = a.mo54849a(str5, String.valueOf(i4)).mo54849a("internet_speed", String.valueOf(i)).mo54849a("video_quality", String.valueOf(i2)).mo54849a("is_cache", String.valueOf(C48107j.m104193f().mo95344a(videoUrlModel) ? 1 : 0));
        String str6 = "is_first";
        if (z2) {
            i5 = -1;
        } else if (C23223a.m57037a()) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        JSONObject a3 = a2.mo54849a(str6, String.valueOf(i5)).mo54849a("group_id", str4).mo54849a("status", String.valueOf(i3)).mo54849a("is_from_feed_cache", String.valueOf(z2 ? 1 : 0)).mo54849a("top_activity", str2).mo54849a("feed_tab", str3).mo54850a();
        if (!z2) {
            C23223a.f61960a = false;
        }
        C26890h.onEvent(MobClick.obtain().setEventName("video_request_response").setLabelName("perf_monitor").setValue(str4).setJsonObject(a3));
        C26890h.m65012a("video_request_response", a3);
        C22572b.m55734b("video_request_response", a3);
        String str7 = "video_request_response";
        String str8 = "duration";
        long j3 = 0;
        if (j > 0) {
            j3 = j2 - j;
        }
        String l = Long.toString(j3);
        if (!C23223a.m57038b()) {
            C23224b bVar = new C23224b(a3, str7, str8, l, C11010c.m22280a());
            C0013i.m16a((Callable<TResult>) bVar);
        }
        this.f98897g++;
        return null;
    }
}
