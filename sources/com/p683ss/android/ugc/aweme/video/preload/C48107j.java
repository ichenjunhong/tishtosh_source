package com.p683ss.android.ugc.aweme.video.preload;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.p829r.C12660a;
import com.bytedance.p829r.C12662c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.setting.C41631k;
import com.p683ss.android.ugc.aweme.video.C47984ae;
import com.p683ss.android.ugc.aweme.video.C47985af;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.C48070p;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import com.p683ss.android.ugc.aweme.video.experiment.GatherModeExperiment;
import com.p683ss.android.ugc.aweme.video.p2394c.C48003a;
import com.p683ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.C48082a;
import com.p683ss.android.ugc.aweme.video.preload.experiment.H265PlayAddrPolicyUnifyExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.playerkit.C50105b;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;
import java.io.File;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.video.preload.j */
public final class C48107j implements C48073c {

    /* renamed from: a */
    public LruCache<String, Long> f120913a;

    /* renamed from: b */
    private volatile boolean f120914b;

    /* renamed from: c */
    private C48073c f120915c;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.j$a */
    static class C48110a {

        /* renamed from: a */
        static final C48107j f120918a = new C48107j();
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.j$b */
    static class C48111b implements C12660a {
        private C48111b() {
        }

        /* renamed from: a */
        public final String mo23789a() {
            return "CACHE";
        }

        /* renamed from: b */
        public final boolean mo23790b() {
            C48107j.m104193f().mo95408g().mo95350c();
            return true;
        }

        /* renamed from: c */
        public final File mo23791c() {
            return C48107j.m104193f().mo95408g().mo95355e();
        }

        /* renamed from: d */
        public final long mo23792d() {
            File c = mo23791c();
            if (c == null || !c.exists()) {
                return 0;
            }
            return Math.max(C48016e.m103949d(c.getAbsolutePath()) - 31457280, 0);
        }
    }

    /* renamed from: f */
    public static C48107j m104193f() {
        return C48110a.f120918a;
    }

    /* renamed from: b */
    public final void mo95348b() {
        mo95408g().mo95348b();
    }

    /* renamed from: c */
    public final void mo95350c() {
        mo95408g().mo95350c();
    }

    /* renamed from: h */
    public final C48073c mo95409h() {
        return mo95408g();
    }

    private C48107j() {
        this.f120913a = new LruCache<>(1048576);
    }

    /* renamed from: d */
    public final String mo95352d() {
        return mo95408g().mo95352d();
    }

    /* renamed from: e */
    public final File mo95355e() {
        return mo95408g().mo95355e();
    }

    /* renamed from: g */
    public final C48073c mo95408g() {
        if (!this.f120914b) {
            synchronized (this) {
                if (this.f120915c == null) {
                    if (C48017a.m103960b() == 2) {
                        this.f120915c = C48082a.f120827a;
                    } else {
                        this.f120915c = C48105b.f120912a;
                    }
                    this.f120915c.mo95343a();
                    C12662c.m25453a((C12660a) new C48111b());
                    this.f120914b = true;
                }
            }
        }
        return this.f120915c;
    }

    /* renamed from: a */
    public final boolean mo95343a() {
        return mo95408g().mo95343a();
    }

    /* renamed from: a */
    public final void mo95405a(Aweme aweme) {
        m104191a(aweme, -1);
    }

    /* renamed from: d */
    public final void mo95353d(VideoUrlModel videoUrlModel) {
        mo95408g().mo95353d(videoUrlModel);
    }

    /* renamed from: a */
    public final long mo95340a(String str) {
        return mo95408g().mo95340a(str);
    }

    /* renamed from: b */
    public final int mo95346b(VideoUrlModel videoUrlModel) {
        return mo95408g().mo95346b(videoUrlModel);
    }

    /* renamed from: e */
    public final C48075e mo95354e(VideoUrlModel videoUrlModel) {
        return mo95408g().mo95354e(videoUrlModel);
    }

    /* renamed from: f */
    public final C48083f mo95356f(VideoUrlModel videoUrlModel) {
        return mo95409h().mo95356f(videoUrlModel);
    }

    /* renamed from: g */
    public final List<C48083f> mo95357g(VideoUrlModel videoUrlModel) {
        return mo95409h().mo95357g(videoUrlModel);
    }

    /* renamed from: h */
    public final List<C47985af> mo95358h(VideoUrlModel videoUrlModel) {
        return mo95409h().mo95358h(videoUrlModel);
    }

    /* renamed from: j */
    public final int mo95411j(VideoUrlModel videoUrlModel) {
        return mo95408g().mo95346b(videoUrlModel);
    }

    /* renamed from: k */
    public final C48075e mo95412k(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null) {
            return mo95408g().mo95354e(videoUrlModel);
        }
        return null;
    }

    /* renamed from: b */
    public final long mo95347b(String str) {
        return mo95408g().mo95347b(str);
    }

    /* renamed from: c */
    public final boolean mo95351c(VideoUrlModel videoUrlModel) {
        if (!C48106i.m104190a()) {
            return false;
        }
        return mo95408g().mo95351c(videoUrlModel);
    }

    /* renamed from: i */
    public final long mo95410i(VideoUrlModel videoUrlModel) {
        if (videoUrlModel != null) {
            return mo95408g().mo95347b(videoUrlModel.getBitRatedRatioUri());
        }
        return -1;
    }

    /* renamed from: c */
    private static VideoUrlModel m104192c(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        Video video = aweme.getVideo();
        if (video == null) {
            return null;
        }
        VideoUrlModel properPlayAddr = video.getProperPlayAddr();
        if (properPlayAddr == null) {
            return null;
        }
        properPlayAddr.setRatio(video.getRatio());
        if (!C50105b.m108061a((UrlModel) properPlayAddr)) {
            return null;
        }
        return properPlayAddr;
    }

    /* renamed from: a */
    public final void mo95342a(C48072b bVar) {
        if (this.f120915c != null) {
            mo95408g().mo95342a(bVar);
        }
    }

    /* renamed from: b */
    public final void mo95407b(Aweme aweme) {
        VideoUrlModel c = m104192c(aweme);
        if (c != null) {
            mo95408g().mo95353d(c);
        }
    }

    /* renamed from: b */
    public final void mo95349b(C48072b bVar) {
        if (this.f120915c != null) {
            mo95408g().mo95349b(bVar);
        }
    }

    /* renamed from: a */
    public final boolean mo95344a(VideoUrlModel videoUrlModel) {
        return mo95408g().mo95344a(videoUrlModel);
    }

    /* renamed from: a */
    private void m104191a(Aweme aweme, int i) {
        VideoUrlModel videoUrlModel;
        boolean z;
        if (aweme != null && !aweme.isLive() && aweme.getVideo() != null && aweme.getVideo().getProperPlayAddr() != null && C48106i.m104190a()) {
            if (C10181b.m20511a().mo18172a(H265PlayAddrPolicyUnifyExperiment.class, true, "h265_play_addr_policy_unify", 31744, true)) {
                videoUrlModel = C48070p.m104094a(aweme.getVideo(), C50109a.m108068s().mo95420a());
            } else {
                videoUrlModel = aweme.getVideo().getProperPlayAddr();
            }
            if (videoUrlModel != null && C48003a.m103852b()) {
                videoUrlModel.setSourceId(aweme.getAid());
                videoUrlModel.setRatio(aweme.getVideo().getRatio());
                if (!TextUtils.isEmpty(aweme.getVideo().getVideoModelStr())) {
                    videoUrlModel.setDashVideoModelStr(aweme.getVideo().getVideoModelStr());
                }
                if (C50105b.m108061a((UrlModel) videoUrlModel)) {
                    if (i < 0) {
                        z = mo95408g().mo95351c(videoUrlModel);
                    } else {
                        z = mo95408g().mo95345a(videoUrlModel, i);
                    }
                    if (z) {
                        this.f120913a.put(videoUrlModel.getUri(), Long.valueOf(0));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo95345a(VideoUrlModel videoUrlModel, int i) {
        if (!C48106i.m104190a()) {
            return false;
        }
        return mo95408g().mo95345a(videoUrlModel, i);
    }

    /* renamed from: a */
    public final Object mo95341a(VideoUrlModel videoUrlModel, String str, String[] strArr) {
        return mo95408g().mo95341a(videoUrlModel, str, strArr);
    }

    /* renamed from: a */
    public final void mo95406a(boolean z, int i, List<Aweme> list, List<PreloadTask> list2) {
        if ((C10181b.m20511a().mo18168a(GatherModeExperiment.class, true, "gather_mode", 31744, 0) != 2 || !C47984ae.f120618a.nextBoolean()) && C48106i.m104190a()) {
            for (PreloadTask preloadTask : list2) {
                if (preloadTask.count > 0 && preloadTask.offset >= 0) {
                    if (C41631k.f105364a.mo85386b() == 2) {
                        preloadTask.count = 1;
                    }
                    int i2 = preloadTask.count;
                    int i3 = preloadTask.offset;
                    Aweme[] awemeArr = new Aweme[i2];
                    if (z) {
                        for (int i4 = 0; i4 < awemeArr.length; i4++) {
                            int i5 = i + 1 + i4 + i3;
                            if (i5 < list.size()) {
                                awemeArr[i4] = (Aweme) list.get(i5);
                            }
                        }
                    } else {
                        for (int i6 = 0; i6 < awemeArr.length; i6++) {
                            int i7 = ((i - 1) - i6) - i3;
                            if (i7 >= 0 && i7 < list.size()) {
                                awemeArr[i6] = (Aweme) list.get(i7);
                            }
                        }
                    }
                    int videoPreloadSize = preloadTask.getVideoPreloadSize();
                    if (awemeArr.length > 0) {
                        for (Aweme a : awemeArr) {
                            m104191a(a, videoPreloadSize);
                        }
                    }
                }
            }
        }
    }
}
