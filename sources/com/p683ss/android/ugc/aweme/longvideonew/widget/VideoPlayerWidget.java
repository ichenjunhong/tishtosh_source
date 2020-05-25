package com.p683ss.android.ugc.aweme.longvideonew.widget;

import android.arch.lifecycle.C0199s;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.commercialize.log.C26053at;
import com.p683ss.android.ugc.aweme.commercialize.log.C26053at.C26054a;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25724m;
import com.p683ss.android.ugc.aweme.crossplatform.p1612a.C27095b;
import com.p683ss.android.ugc.aweme.feed.C30303h;
import com.p683ss.android.ugc.aweme.feed.helper.C30360a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.freeflowcard.strategy.C32492a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.longvideo.C36385k;
import com.p683ss.android.ugc.aweme.longvideonew.C36431h;
import com.p683ss.android.ugc.aweme.longvideonew.feature.C36428c;
import com.p683ss.android.ugc.aweme.longvideonew.p1935a.C36397a;
import com.p683ss.android.ugc.aweme.longvideonew.p1935a.C36397a.C36399b;
import com.p683ss.android.ugc.aweme.longvideonew.p1935a.C36397a.C36400c;
import com.p683ss.android.ugc.aweme.newfollow.util.C37937e;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.GenericWidget;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.preload.C48072b;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget */
public final class VideoPlayerWidget extends GenericWidget implements C0199s<C23274a>, C38871j {

    /* renamed from: p */
    public static final C36443a f93376p = new C36443a(null);

    /* renamed from: a */
    public C36397a f93377a;

    /* renamed from: h */
    public boolean f93378h;

    /* renamed from: i */
    public final Aweme f93379i;

    /* renamed from: j */
    public final String f93380j;

    /* renamed from: k */
    public final int f93381k;

    /* renamed from: l */
    public final String f93382l;

    /* renamed from: m */
    public final C30303h f93383m;

    /* renamed from: n */
    public final int f93384n;

    /* renamed from: o */
    public final String f93385o;

    /* renamed from: q */
    private C26053at f93386q = new C26053at(this.f93379i);

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget$a */
    public static final class C36443a {
        private C36443a() {
        }

        public /* synthetic */ C36443a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget$b */
    public static final class C36444b implements C36400c {

        /* renamed from: a */
        final /* synthetic */ VideoPlayerWidget f93387a;

        C36444b(VideoPlayerWidget videoPlayerWidget) {
            this.f93387a = videoPlayerWidget;
        }

        /* renamed from: a */
        public final void mo75342a(int i) {
            this.f93387a.f62238e.mo48228a("action_video_secondary_progress", (Object) Integer.valueOf(i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget$c */
    public static final class C36445c implements C36399b {

        /* renamed from: a */
        final /* synthetic */ VideoPlayerWidget f93388a;

        /* renamed from: a */
        public final boolean mo75341a() {
            if (this.f93388a.f93378h) {
                return false;
            }
            C23718g b = C23718g.m58207b();
            C52711k.m112236a((Object) b, "NetworkStateManager.getInstance()");
            if (b.mo49152c()) {
                return true;
            }
            C32492a.m75236a().mo65806a(this.f93388a.f93380j);
            return true;
        }

        C36445c(VideoPlayerWidget videoPlayerWidget) {
            this.f93388a = videoPlayerWidget;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.widget.VideoPlayerWidget$d */
    static final class C36446d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoPlayerWidget f93389a;

        C36446d(VideoPlayerWidget videoPlayerWidget) {
            this.f93389a = videoPlayerWidget;
        }

        public final void run() {
            String str;
            C36397a aVar = this.f93389a.f93377a;
            if (aVar != null) {
                Aweme aweme = this.f93389a.f93379i;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                aVar.mo53533c(str);
            }
        }
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

    /* renamed from: d */
    public final long mo75387d() {
        C36397a aVar = this.f93377a;
        if (aVar != null) {
            C48121w wVar = aVar.f93214f;
            if (wVar != null) {
                return wVar.mo95256n();
            }
        }
        return 0;
    }

    public final void onPause() {
        super.onPause();
        C36397a aVar = this.f93377a;
        if (aVar != null) {
            aVar.mo75340c();
        }
    }

    /* renamed from: f */
    private static boolean m82230f() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Integer isAdapterVideoPlaySize = b.getIsAdapterVideoPlaySize();
            if (isAdapterVideoPlaySize != null) {
                if (isAdapterVideoPlaySize.intValue() == 1) {
                    return true;
                }
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void onResume() {
        super.onResume();
        C36397a aVar = this.f93377a;
        if (!(aVar == null || aVar.f93211c.f78757a == 0)) {
            aVar.mo75338b();
        }
    }

    public final void onCreate() {
        super.onCreate();
        C0199s sVar = this;
        this.f62238e.mo48226a("action_seek_stop_tracking_touch", sVar).mo48226a("action_play_control", sVar).mo48226a("action_replay", sVar).mo48226a("action_video_play_loop", sVar).mo48226a("action_video_mute", sVar).mo48226a("action_video_unmute", sVar).mo48226a("action_video_auto_resize", sVar);
        if (C26054a.m63124a(this.f93379i)) {
            C47718bf.m103290c(this.f93386q);
        }
    }

    /* renamed from: g */
    private final boolean m82231g() {
        C48121w wVar;
        try {
            if (this.f93379i == null) {
                return false;
            }
            Video a = C36385k.f93161b.mo75308a(this.f93379i);
            if (a == null) {
                a = C36385k.f93160a.mo75308a(this.f93379i);
            }
            if (a == null) {
                return false;
            }
            C36397a aVar = this.f93377a;
            if (aVar != null) {
                wVar = aVar.f93214f;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                return false;
            }
            int l = wVar.mo95254l();
            int m = wVar.mo95255m();
            if (l <= 0 || m <= 0 || a.getWidth() <= 0 || a.getHeight() <= 0 || !C30360a.m71263a(a.getWidth(), a.getHeight(), l, m)) {
                return false;
            }
            a.setWidth(l);
            a.setHeight(m);
            UrlModel originCover = a.getOriginCover();
            if (originCover != null) {
                originCover.setWidth(l);
            }
            UrlModel originCover2 = a.getOriginCover();
            if (originCover2 != null) {
                originCover2.setHeight(m);
            }
            this.f62238e.mo48228a("resize_video_and_cover", (Object) new C36428c(l, m));
            return true;
        } catch (Exception unused) {
        }
        return false;
    }

    public final void onDestroy() {
        super.onDestroy();
        C36397a aVar = this.f93377a;
        if (aVar != null) {
            aVar.f93216h = null;
            C48107j.m104193f().mo95349b((C48072b) aVar);
            if (aVar.f93214f.mo95287b((C38871j) aVar)) {
                aVar.f93213e.mo77401a();
            }
            aVar.f93212d.mo97920b(aVar.f93217i);
            aVar.f93210b.clear();
            try {
                aVar.f93214f.mo95267D();
                aVar.f93214f.mo95264A();
            } catch (Throwable unused) {
            }
        }
        if (C26054a.m63124a(this.f93379i)) {
            this.f93386q.mo53522a();
        }
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        this.f62238e.mo48228a("action_video_on_play_fail", (Object) dVar);
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        this.f62238e.mo48228a("action_video_on_prepare_play", (Object) str);
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
        this.f62238e.mo48228a("action_video_on_play_progress_change", (Object) Float.valueOf(f));
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
        this.f62238e.mo48228a("action_video_on_buffering", (Object) Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo53526a(C50118g gVar) {
        this.f62238e.mo48228a("on_render_first_frame", (Object) gVar);
        if (m82230f()) {
            m82231g();
        }
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        boolean z;
        VideoPlayerWidget videoPlayerWidget;
        this.f62238e.mo48228a("action_video_on_render_ready", (Object) fVar);
        if (TextUtils.isEmpty(this.f93385o) || this.f93379i == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            videoPlayerWidget = this;
        } else {
            videoPlayerWidget = null;
        }
        VideoPlayerWidget videoPlayerWidget2 = videoPlayerWidget;
        if (videoPlayerWidget2 != null) {
            String str = videoPlayerWidget2.f93385o;
            long d = videoPlayerWidget2.mo75387d();
            Aweme aweme = videoPlayerWidget2.f93379i;
            if (aweme == null) {
                C52711k.m112234a();
            }
            String aid = aweme.getAid();
            C52711k.m112236a((Object) aid, "mAweme!!.aid");
            C27095b bVar = new C27095b(str, 0, d, aid);
            C47718bf.m103288a(bVar);
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        boolean z;
        VideoPlayerWidget videoPlayerWidget;
        this.f62238e.mo48228a("action_video_on_pause_play", (Object) str);
        if (TextUtils.isEmpty(this.f93385o) || this.f93379i == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            videoPlayerWidget = this;
        } else {
            videoPlayerWidget = null;
        }
        VideoPlayerWidget videoPlayerWidget2 = videoPlayerWidget;
        if (videoPlayerWidget2 != null) {
            String str2 = videoPlayerWidget2.f93385o;
            long d = videoPlayerWidget2.mo75387d();
            Aweme aweme = videoPlayerWidget2.f93379i;
            if (aweme == null) {
                C52711k.m112234a();
            }
            String aid = aweme.getAid();
            C52711k.m112236a((Object) aid, "mAweme!!.aid");
            C27095b bVar = new C27095b(str2, 1, d, aid);
            C47718bf.m103288a(bVar);
        }
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        boolean z;
        VideoPlayerWidget videoPlayerWidget;
        this.f62238e.mo48228a("action_video_on_play_completed", (Object) "onPlayCompleted");
        if (TextUtils.isEmpty(this.f93385o) || this.f93379i == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            videoPlayerWidget = this;
        } else {
            videoPlayerWidget = null;
        }
        VideoPlayerWidget videoPlayerWidget2 = videoPlayerWidget;
        if (videoPlayerWidget2 != null) {
            String str2 = videoPlayerWidget2.f93385o;
            long d = videoPlayerWidget2.mo75387d();
            Aweme aweme = videoPlayerWidget2.f93379i;
            if (aweme == null) {
                C52711k.m112234a();
            }
            String aid = aweme.getAid();
            C52711k.m112236a((Object) aid, "mAweme!!.aid");
            C27095b bVar = new C27095b(str2, 3, d, aid);
            C47718bf.m103288a(bVar);
        }
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        boolean z;
        boolean z2;
        C48121w wVar;
        super.mo48241a(view);
        if ("long_video_player_activity".equals(this.f93382l)) {
            z2 = true;
            z = true;
        } else {
            z2 = false;
            z = false;
        }
        if (view != null) {
            C36397a aVar = new C36397a((ViewGroup) view, this.f93379i, z2, z, this.f93384n);
            this.f93377a = aVar;
            C36397a aVar2 = this.f93377a;
            if (aVar2 != null) {
                aVar2.mo75337a((C38871j) this);
            }
            C36397a aVar3 = this.f93377a;
            if (aVar3 != null) {
                Aweme aweme = this.f93379i;
                String str = this.f93380j;
                int i = this.f93381k;
                C36397a aVar4 = this.f93377a;
                if (aVar4 != null) {
                    wVar = aVar4.f93214f;
                } else {
                    wVar = null;
                }
                aVar3.mo75337a((C38871j) new C36431h(aweme, str, i, wVar));
            }
            if (C26054a.m63124a(this.f93379i)) {
                C36397a aVar5 = this.f93377a;
                if (aVar5 != null) {
                    aVar5.mo75337a((C38871j) this.f93386q);
                }
            }
            C36397a aVar6 = this.f93377a;
            if (aVar6 != null) {
                C36400c bVar = new C36444b(this);
                C52711k.m112240b(bVar, "videoPlayerViewCallBack");
                aVar6.f93215g = bVar;
            }
            C36397a aVar7 = this.f93377a;
            if (aVar7 != null) {
                C36399b cVar = new C36445c(this);
                C52711k.m112240b(cVar, "interceptor");
                aVar7.f93209a.add(cVar);
                return;
            }
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: a */
    public final void onChanged(C23274a aVar) {
        String str;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            switch (str.hashCode()) {
                case -1926260769:
                    if (str.equals("action_video_unmute")) {
                        C36397a aVar2 = this.f93377a;
                        if (aVar2 != null) {
                            C37937e eVar = aVar2.f93213e;
                            if (eVar.f96594a != null) {
                                eVar.f96594a.mo95266C();
                                break;
                            }
                        } else {
                            return;
                        }
                    }
                    break;
                case -1061452538:
                    if (str.equals("action_video_mute")) {
                        C36397a aVar3 = this.f93377a;
                        if (aVar3 != null) {
                            C37937e eVar2 = aVar3.f93213e;
                            if (eVar2.f96594a != null) {
                                eVar2.f96594a.mo95265B();
                                break;
                            }
                        } else {
                            return;
                        }
                    }
                    break;
                case -884511230:
                    if (str.equals("action_video_play_loop")) {
                        C25724m mVar = (C25724m) aVar.mo48246a();
                        C36397a aVar4 = this.f93377a;
                        if (!(aVar4 == null || mVar == null)) {
                            C25724m mVar2 = aVar4.f93216h;
                            if (mVar2 == null || !mVar2.equals(mVar)) {
                                aVar4.f93216h = mVar;
                                C25724m mVar3 = aVar4.f93216h;
                                if (mVar3 != null && mVar3.f68037a && aVar4.f93211c.f78757a == 3) {
                                    aVar4.mo75338b();
                                    break;
                                }
                            }
                        }
                        return;
                    }
                    break;
                case -263396937:
                    if (str.equals("action_video_auto_resize")) {
                        m82231g();
                        break;
                    }
                    break;
                case 561796795:
                    if (str.equals("action_play_control")) {
                        C36397a aVar5 = this.f93377a;
                        if (aVar5 != null) {
                            if (aVar5.f93211c.f78757a != 3) {
                                aVar5.mo75340c();
                                break;
                            } else {
                                aVar5.mo75338b();
                            }
                        }
                        return;
                    }
                    break;
                case 710880054:
                    if (str.equals("action_seek_stop_tracking_touch")) {
                        Object a = aVar.mo48246a();
                        if (a == null) {
                            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                        } else if (((Float) a).floatValue() == 100.0f) {
                            View view = this.f62237d;
                            if (view != null) {
                                view.postDelayed(new C36446d(this), 600);
                                break;
                            } else {
                                return;
                            }
                        } else {
                            C36397a aVar6 = this.f93377a;
                            if (aVar6 != null) {
                                Object a2 = aVar.mo48246a();
                                C52711k.m112236a(a2, "t.getData()");
                                aVar6.mo75339b(((Number) a2).floatValue());
                                break;
                            } else {
                                return;
                            }
                        }
                    }
                    break;
                case 1497529872:
                    if (str.equals("action_replay")) {
                        C36397a aVar7 = this.f93377a;
                        if (aVar7 != null) {
                            aVar7.mo75338b();
                            break;
                        } else {
                            return;
                        }
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        boolean z;
        VideoPlayerWidget videoPlayerWidget;
        this.f62238e.mo48228a("action_video_on_resume_play", (Object) str);
        if (TextUtils.isEmpty(this.f93385o) || this.f93379i == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            videoPlayerWidget = this;
        } else {
            videoPlayerWidget = null;
        }
        VideoPlayerWidget videoPlayerWidget2 = videoPlayerWidget;
        if (videoPlayerWidget2 != null) {
            String str2 = videoPlayerWidget2.f93385o;
            long d = videoPlayerWidget2.mo75387d();
            Aweme aweme = videoPlayerWidget2.f93379i;
            if (aweme == null) {
                C52711k.m112234a();
            }
            String aid = aweme.getAid();
            C52711k.m112236a((Object) aid, "mAweme!!.aid");
            C27095b bVar = new C27095b(str2, 0, d, aid);
            C47718bf.m103288a(bVar);
        }
    }

    public VideoPlayerWidget(Aweme aweme, String str, int i, String str2, C30303h hVar, int i2, String str3) {
        C52711k.m112240b(str, "mEventType");
        C52711k.m112240b(str2, "mBusinessType");
        C52711k.m112240b(str3, "reactSessionId");
        this.f93379i = aweme;
        this.f93380j = str;
        this.f93381k = i;
        this.f93382l = str2;
        this.f93383m = hVar;
        this.f93384n = i2;
        this.f93385o = str3;
    }
}
