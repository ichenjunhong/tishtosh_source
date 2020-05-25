package com.p683ss.android.ugc.playerkit.videoview;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.text.TextUtils;
import android.view.Surface;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.ttnet.p883a.C13258a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.player.sdk.C38854a;
import com.p683ss.android.ugc.aweme.player.sdk.impl.C38893c;
import com.p683ss.android.ugc.aweme.player.sdk.impl.C38900d;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38856b;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38866g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38869h;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c;
import com.p683ss.android.ugc.playerkit.C50100a;
import com.p683ss.android.ugc.playerkit.C50105b;
import com.p683ss.android.ugc.playerkit.p2492a.C50101a;
import com.p683ss.android.ugc.playerkit.p2492a.C50104d;
import com.p683ss.android.ugc.playerkit.p2493b.C50107b;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.p2494c.C50120i;
import com.p683ss.android.ugc.playerkit.p2494c.C50121j;
import com.p683ss.android.ugc.playerkit.session.C50122a;
import com.p683ss.android.ugc.playerkit.session.Session;
import com.p683ss.android.ugc.playerkit.videoview.p2497c.C50141a;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent */
public class VideoViewComponent implements C38871j, VideoPlayerPageLifecycleProxy, C50158g {

    /* renamed from: h */
    private static C50101a f125617h = new C50101a() {
        public final void onEvent(JSONArray jSONArray) {
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        AppLog.recordMiscLog(C11010c.m22280a(), "video_playq", jSONArray.getJSONObject(i));
                    } catch (JSONException unused) {
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo95443a(JSONArray jSONArray, String str) {
            if (jSONArray != null && !TextUtils.isEmpty(str) && C50109a.m108068s().mo95437r()) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        C26890h.m65012a(str, jSONArray.getJSONObject(i));
                    } catch (JSONException unused) {
                    }
                }
            }
        }
    };

    /* renamed from: a */
    public C38869h f125618a;

    /* renamed from: b */
    public C50160i f125619b;

    /* renamed from: c */
    public Video f125620c;

    /* renamed from: d */
    public Session f125621d;

    /* renamed from: e */
    public volatile boolean f125622e;

    /* renamed from: f */
    public boolean f125623f;

    /* renamed from: g */
    public int f125624g;

    /* renamed from: i */
    private boolean f125625i;

    /* renamed from: j */
    private Set<C38871j> f125626j;

    /* renamed from: k */
    private C38856b f125627k;

    /* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent$a */
    static class C50127a implements C50104d<Boolean> {

        /* renamed from: a */
        private VideoUrlModel f125629a;

        /* renamed from: a */
        public final /* synthetic */ Object mo95137a() {
            if (C50140c.INSTANCE.cacheChecker() == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf(C50140c.INSTANCE.cacheChecker().mo95441a(this.f125629a));
        }

        public C50127a(VideoUrlModel videoUrlModel) {
            this.f125629a = videoUrlModel;
        }
    }

    /* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent$b */
    static class C50128b implements C50104d<C50121j> {

        /* renamed from: a */
        private VideoUrlModel f125630a;

        /* renamed from: b */
        private Session f125631b;

        /* renamed from: c */
        private boolean f125632c;

        /* renamed from: a */
        public final /* synthetic */ Object mo95137a() {
            return C50141a.m108193a().mo97943b(this.f125630a.getUrlKey()).mo97945a(this.f125630a, this.f125631b.playerType, this.f125632c);
        }

        public C50128b(VideoUrlModel videoUrlModel, Session session, boolean z) {
            this.f125630a = videoUrlModel;
            this.f125631b = session;
            this.f125632c = z;
        }
    }

    /* renamed from: com.ss.android.ugc.playerkit.videoview.VideoViewComponent$c */
    static class C50129c implements C50104d<Integer> {

        /* renamed from: a */
        private VideoUrlModel f125633a;

        /* renamed from: a */
        public final /* synthetic */ Object mo95137a() {
            Integer num;
            VideoUrlModel videoUrlModel = this.f125633a;
            int i = -1;
            if (videoUrlModel != null) {
                C48525c hitBitrate = videoUrlModel.getHitBitrate();
                if (hitBitrate == null) {
                    num = null;
                } else {
                    num = Integer.valueOf(hitBitrate.getQualityType());
                }
                if (num == null) {
                    num = Integer.valueOf(-1);
                }
                i = num.intValue();
            }
            return Integer.valueOf(i);
        }

        public C50129c(VideoUrlModel videoUrlModel) {
            this.f125633a = videoUrlModel;
        }
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
    }

    @C0200t(mo345a = C0177a.ON_PAUSE)
    public void onPagePause() {
        mo60215af();
    }

    @C0200t(mo345a = C0177a.ON_RESUME)
    public void onPageResume() {
        mo60214ae();
    }

    /* renamed from: a */
    public final void mo97917a(KeepSurfaceTextureView keepSurfaceTextureView) {
        this.f125619b = C50160i.m108259a(keepSurfaceTextureView);
        m108125a(keepSurfaceTextureView.getContext());
    }

    /* renamed from: a */
    public final void mo60207a(C38871j jVar) {
        this.f125626j.add(jVar);
        if (this.f125618a != null) {
            this.f125618a.mo78897a((C38871j) this);
        }
    }

    /* renamed from: a */
    public final void mo97918a(C50161j jVar) {
        this.f125619b.mo97950a(jVar);
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        if (!this.f125626j.isEmpty()) {
            for (C38871j a : this.f125626j) {
                a.mo53525a(fVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        this.f125622e = false;
        if (!this.f125626j.isEmpty()) {
            for (C38871j a : this.f125626j) {
                a.mo53524a(dVar);
            }
        }
        if (dVar.f125524b && this.f125620c != null) {
            m108126a(this.f125620c.getPlayAddrH264(), true, true, this.f125624g, this.f125620c.isNeedSetCookie());
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        if (!this.f125626j.isEmpty()) {
            for (C38871j a : this.f125626j) {
                a.mo53527a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        this.f125622e = false;
        this.f125623f = false;
        C50130a.m108170a().mo97925a(this);
        if (!this.f125626j.isEmpty()) {
            for (C38871j a : this.f125626j) {
                a.mo53526a(gVar);
            }
        }
    }

    /* renamed from: ah */
    public final long mo60217ah() {
        if (this.f125618a != null) {
            return this.f125618a.mo78913i();
        }
        return 0;
    }

    /* renamed from: ai */
    public final void mo60218ai() {
        if (this.f125618a != null) {
            this.f125618a.mo78919o();
        }
    }

    /* renamed from: aj */
    public final C38866g mo60219aj() {
        if (this.f125618a != null) {
            return this.f125618a.mo78923s();
        }
        return null;
    }

    /* renamed from: c */
    public final long mo97921c() {
        if (this.f125618a != null) {
            return this.f125618a.mo78912h();
        }
        return 0;
    }

    /* renamed from: d */
    public final boolean mo97922d() {
        if (this.f125618a != null) {
            return this.f125618a.mo78914j();
        }
        return false;
    }

    public VideoViewComponent() {
        this.f125626j = Collections.newSetFromMap(new WeakHashMap());
        this.f125624g = 0;
        this.f125627k = C50162k.f125679a;
    }

    /* renamed from: a */
    public final void mo97915a() {
        if (this.f125618a != null) {
            this.f125618a.mo78889a(0.0f, 0.0f);
        }
    }

    /* renamed from: ad */
    public final void mo60213ad() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("render() called ");
            sb.append(this.f125618a);
            C38854a.m86290a("VideoViewComponent", sb.toString());
        }
        if (this.f125618a != null) {
            C50130a.m108170a().mo97925a(this);
            this.f125622e = false;
            this.f125618a.mo78902b();
        }
    }

    /* renamed from: ae */
    public final void mo60214ae() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("resume() called ");
            sb.append(this.f125618a);
            C38854a.m86290a("VideoViewComponent", sb.toString());
        }
        if (this.f125621d != null && this.f125621d.urlModel != null) {
            this.f125618a.mo78900a(this.f125621d.urlModel.getSourceId());
        }
    }

    /* renamed from: b */
    public final void mo97919b() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("release() called ");
            sb.append(this.f125618a);
            C38854a.m86290a("VideoViewComponent", sb.toString());
        }
        if (this.f125618a != null) {
            this.f125618a.mo78910f();
        }
        if (this.f125619b != null) {
            this.f125619b.mo97957f();
        }
    }

    /* renamed from: af */
    public final void mo60215af() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("pause() called ");
            sb.append(this.f125618a);
            C38854a.m86290a("VideoViewComponent", sb.toString());
        }
        if (this.f125618a != null) {
            this.f125618a.mo78909e();
        }
        if (this.f125619b != null) {
            this.f125619b.mo97956e();
            if (this.f125618a != null && this.f125618a.mo78921q() == C50116c.IjkHardware && this.f125619b.mo97967i()) {
                this.f125619b.mo97951a(true);
            }
        }
    }

    /* renamed from: ag */
    public final void mo60216ag() {
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("stop() called ");
            sb.append(this.f125618a);
            C38854a.m86290a("VideoViewComponent", sb.toString());
        }
        if (this.f125618a != null) {
            if (C50142d.f125655a && C50105b.m108062a(this.f125618a.mo78921q()) && C50109a.m108068s().mo95424e()) {
                C50142d.f125655a = this.f125618a.mo78911g();
            }
            this.f125618a.mo78908d();
        }
        if (this.f125619b != null) {
            this.f125619b.mo97957f();
        }
    }

    /* renamed from: c */
    private static C50104d<Integer> m108130c(VideoUrlModel videoUrlModel) {
        return new C50129c(videoUrlModel);
    }

    /* renamed from: d */
    private static C50104d<Boolean> m108131d(VideoUrlModel videoUrlModel) {
        return new C50127a(videoUrlModel);
    }

    /* renamed from: b */
    public final void mo97920b(C50161j jVar) {
        this.f125619b.mo97953b(jVar);
    }

    /* renamed from: a */
    private void m108125a(Context context) {
        this.f125619b.mo97950a((C50161j) new C50161j() {
            /* renamed from: b */
            public final void mo54505b(int i, int i2) {
            }

            public final void aD_() {
                if (VideoViewComponent.this.f125619b.mo97958g() == 1) {
                    VideoViewComponent.this.f125618a.mo78904b((Surface) null);
                }
            }

            /* renamed from: a */
            public final void mo54503a(int i, int i2) {
                if (VideoViewComponent.this.f125619b.mo97958g() == 1 && VideoViewComponent.this.f125619b.mo97959h()) {
                    VideoViewComponent.this.f125619b.mo97951a(false);
                }
                if (VideoViewComponent.this.f125623f) {
                    VideoViewComponent.this.f125623f = false;
                    VideoViewComponent.this.mo60205a(VideoViewComponent.this.f125620c, true, VideoViewComponent.this.f125624g);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo60226b(C38871j jVar) {
        this.f125626j.remove(jVar);
        if (this.f125626j.isEmpty() && this.f125618a != null) {
            this.f125618a.mo78897a((C38871j) null);
        }
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        if (!this.f125626j.isEmpty()) {
            for (C38871j c : this.f125626j) {
                c.mo53533c(str);
            }
        }
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
        if (!this.f125626j.isEmpty()) {
            for (C38871j d : this.f125626j) {
                d.mo53534d(str);
            }
        }
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        if (!this.f125626j.isEmpty()) {
            for (C38871j e : this.f125626j) {
                e.mo53535e(str);
            }
        }
    }

    public VideoViewComponent(boolean z) {
        this.f125626j = Collections.newSetFromMap(new WeakHashMap());
        this.f125624g = 0;
        this.f125627k = C50163l.f125680a;
        this.f125625i = true;
    }

    /* renamed from: a */
    private static boolean m108128a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return false;
        }
        List<String> urlList = videoUrlModel.getUrlList();
        if (urlList == null || urlList.size() <= 0) {
            return false;
        }
        boolean z = true;
        for (String a : urlList) {
            if (!m108127a(C11010c.m22280a(), a)) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: b */
    private boolean m108129b(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null && this.f125621d != null && this.f125621d.urlModel != null && C9431p.m18665a(videoUrlModel.getUri(), this.f125621d.urlModel.getUri()) && C9431p.m18665a(videoUrlModel.getRatio(), this.f125621d.urlModel.getRatio()) && !TextUtils.isEmpty(videoUrlModel.getSourceId()) && this.f125618a.mo78901a(videoUrlModel.getSourceId(), videoUrlModel.getBitRatedRatioUri())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
        if (!this.f125626j.isEmpty()) {
            for (C38871j a : this.f125626j) {
                a.mo53523a(f);
            }
        }
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
        this.f125622e = false;
        if (!this.f125626j.isEmpty()) {
            for (C38871j b : this.f125626j) {
                b.mo53530b(dVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        if (!this.f125626j.isEmpty()) {
            for (C38871j b : this.f125626j) {
                b.mo53531b(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo97916a(ViewGroup viewGroup) {
        this.f125619b = C50160i.m108258a(viewGroup);
        m108125a(viewGroup.getContext());
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        if (!this.f125626j.isEmpty()) {
            for (C38871j b : this.f125626j) {
                b.mo53532b(z);
            }
        }
    }

    /* renamed from: a */
    public final void mo60204a(Video video) {
        boolean z;
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("tryResume() called ");
            sb.append(this.f125618a);
            C38854a.m86290a("VideoViewComponent", sb.toString());
        }
        VideoUrlModel playAddrH265 = video.getPlayAddrH265();
        VideoUrlModel playAddrH264 = video.getPlayAddrH264();
        if (playAddrH265 != null || playAddrH264 != null) {
            if (m108129b(playAddrH265) || m108129b(playAddrH264)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo60214ae();
            } else {
                mo60205a(video, true, this.f125624g);
            }
        }
    }

    /* renamed from: a */
    private static boolean m108127a(Context context, String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("https://")) {
            return false;
        }
        try {
            if (C13258a.m26660a(context).mo17830d(URI.create(str).getHost()) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static C50104d<C50121j> m108124a(VideoUrlModel videoUrlModel, Session session, boolean z) {
        return new C50128b(videoUrlModel, session, z);
    }

    /* renamed from: a */
    public final void mo60205a(Video video, boolean z, int i) {
        if (video != null) {
            this.f125620c = video;
            if (!this.f125619b.mo97954c()) {
                this.f125623f = true;
            } else if (this.f125622e) {
                mo60213ad();
            } else if (C50142d.m108198a(video, C50109a.m108068s().mo95420a())) {
                m108126a(video.getPlayAddrH265(), z, false, i, video.isNeedSetCookie());
            } else {
                m108126a(video.getPlayAddrH264(), z, false, i, video.isNeedSetCookie());
            }
        }
    }

    /* renamed from: a */
    private void m108126a(VideoUrlModel videoUrlModel, boolean z, boolean z2, int i, boolean z3) {
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        if (C38854a.f98960a) {
            StringBuilder sb = new StringBuilder("play() called ");
            sb.append(this.f125618a);
            C38854a.m86290a("VideoViewComponent", sb.toString());
        }
        if (videoUrlModel2 != null && C50105b.m108061a((UrlModel) videoUrlModel)) {
            String uri = videoUrlModel.getUri();
            if (TextUtils.isEmpty(uri)) {
                StringBuilder sb2 = new StringBuilder("VideoUrlModel url_key is null. vid=");
                sb2.append(videoUrlModel.getSourceId());
                C9220a.m18311a((Throwable) new RuntimeException(sb2.toString()));
            }
            this.f125621d = C50122a.m108112a().mo97903d(uri);
            this.f125624g = i;
            if (this.f125625i) {
                this.f125618a = new C38893c(new C38900d(C50109a.m108068s().mo95420a()));
            } else {
                this.f125618a = C50141a.m108193a().mo97941a(uri);
            }
            this.f125621d.uri = uri;
            this.f125621d.urlModel = videoUrlModel2;
            this.f125621d.playerType = this.f125618a.mo78921q();
            this.f125618a.mo78897a((C38871j) this);
            this.f125618a.mo78898a(f125617h);
            this.f125618a.mo78893a(this.f125627k);
            this.f125618a.mo78895a(C50140c.INSTANCE.playInfoCallback());
            C50100a.m108056a().mo97880a(this.f125621d.uri, "player_try_play");
            C50107b.m108065a(uri);
            C50120i iVar = new C50120i(m108124a(videoUrlModel2, this.f125621d, z2), m108131d(videoUrlModel), C50109a.m108068s().mo95431l(), videoUrlModel.getSourceId(), z, C50109a.m108068s().mo95432m(), false, videoUrlModel.isH265(), 0, m108130c(videoUrlModel), uri, true, true, C50109a.m108068s().mo95434o(), this.f125624g);
            iVar.f125580l = C50109a.m108068s().mo95435p();
            iVar.f125583o = videoUrlModel.getBitRatedRatioUri();
            C50122a.m108112a().mo97899a(iVar.f125583o, videoUrlModel.getFileCheckSum());
            iVar.f125590v = C50109a.m108068s().mo95436q();
            if (z3 && m108128a(videoUrlModel)) {
                iVar.f125591w = true;
            }
            this.f125618a.mo78891a(this.f125619b.mo97952b());
            this.f125618a.mo78899a(iVar);
            if (!z) {
                this.f125622e = true;
            }
            if (this.f125619b != null) {
                this.f125619b.mo97957f();
            }
        }
    }
}
