package com.p683ss.android.ugc.aweme.discover.helper;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.content.Context;
import android.os.CountDownTimer;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.music.C37372e;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.p2425e.C48545a;
import com.p683ss.android.ugc.p2425e.C48554c;
import com.p683ss.android.ugc.p2425e.p2426a.C48547b;
import com.p683ss.android.ugc.p2425e.p2426a.C48548c;
import com.p683ss.android.ugc.p2425e.p2426a.C48549d;
import com.ss.android.ugc.trill.R;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper */
public final class MusicPlayHelper extends C0209x {

    /* renamed from: g */
    public static final C28181a f73983g = new C28181a(null);

    /* renamed from: a */
    public final C23275b<C52847n<Integer, Long>> f73984a = new C23275b<>();

    /* renamed from: b */
    public C37372e f73985b;

    /* renamed from: c */
    public Music f73986c;

    /* renamed from: d */
    CountDownTimer f73987d;

    /* renamed from: e */
    public final C23275b<C28197f> f73988e = new C23275b<>();

    /* renamed from: f */
    public String f73989f = "";

    /* renamed from: h */
    private final C48554c f73990h = new C48554c();

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$a */
    public static final class C28181a {
        private C28181a() {
        }

        public /* synthetic */ C28181a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$b */
    public static final class C28182b implements C37435b {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f73991a;

        /* renamed from: b */
        final /* synthetic */ MusicModel f73992b;

        /* renamed from: a */
        public final void mo55350a() {
        }

        /* renamed from: b */
        public final void mo55354b() {
            C23275b<C28197f> bVar = this.f73991a.f73988e;
            C28197f fVar = new C28197f(1, 0, 0, null, 12, null);
            bVar.setValue(fVar);
        }

        /* renamed from: a */
        public final void mo55351a(int i) {
            C23275b<C28197f> bVar = this.f73991a.f73988e;
            C28197f fVar = new C28197f(2, i, 0, null, 12, null);
            bVar.postValue(fVar);
        }

        /* renamed from: a */
        public final void mo55352a(C48545a aVar) {
            C52711k.m112240b(aVar, "error");
            C23275b<C28197f> bVar = this.f73991a.f73988e;
            C28197f fVar = new C28197f(4, -1, 0, null, 8, null);
            bVar.postValue(fVar);
        }

        public C28182b(MusicPlayHelper musicPlayHelper, MusicModel musicModel) {
            this.f73991a = musicPlayHelper;
            this.f73992b = musicModel;
        }

        /* renamed from: a */
        public final void mo55353a(String str, MusicWaveBean musicWaveBean) {
            C52711k.m112240b(str, "musicFile");
            this.f73991a.f73988e.postValue(new C28197f(3, 100, 0, new C28208p(str, this.f73992b)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$c */
    static final class C28183c implements C48549d {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f73993a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f73994b;

        /* renamed from: c */
        final /* synthetic */ Music f73995c;

        /* renamed from: d */
        final /* synthetic */ MusicModel f73996d;

        /* renamed from: e */
        final /* synthetic */ int f73997e;

        /* renamed from: f */
        final /* synthetic */ boolean f73998f;

        /* renamed from: g */
        final /* synthetic */ String f73999g;

        C28183c(MusicPlayHelper musicPlayHelper, FragmentActivity fragmentActivity, Music music, MusicModel musicModel, int i, boolean z, String str) {
            this.f73993a = musicPlayHelper;
            this.f73994b = fragmentActivity;
            this.f73995c = music;
            this.f73996d = musicModel;
            this.f73997e = i;
            this.f73998f = z;
            this.f73999g = str;
        }

        /* renamed from: a */
        public final void mo50923a(int i, int i2) {
            C28381ab d;
            int i3;
            String str;
            MusicPlayHelper musicPlayHelper = this.f73993a;
            FragmentActivity fragmentActivity = this.f73994b;
            Music music = this.f73995c;
            if (C10181b.m20511a().mo18172a(RemoveMusic15sCapExperiment.class, true, "remove_15s_cap_music", 31744, true)) {
                CountDownTimer countDownTimer = musicPlayHelper.f73987d;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                if (music.getDuration() != music.getRealAuditionDuration()) {
                    long realAuditionDuration = ((long) music.getRealAuditionDuration()) * 1000;
                    if (realAuditionDuration <= 0) {
                        StringBuilder sb = new StringBuilder("MusicPlayHelper: audition_duration is zero, music id: ");
                        sb.append(music.getId());
                        C47625i.m103103a(sb.toString());
                    } else {
                        C28186f fVar = new C28186f(musicPlayHelper, realAuditionDuration, realAuditionDuration, 1000);
                        musicPlayHelper.f73987d = fVar;
                        CountDownTimer countDownTimer2 = musicPlayHelper.f73987d;
                        if (countDownTimer2 != null) {
                            countDownTimer2.start();
                        }
                    }
                }
            }
            this.f73993a.f73984a.setValue(new C52847n(Integer.valueOf(2), Long.valueOf(this.f73995c.getId())));
            MusicModel musicModel = this.f73996d;
            C52711k.m112236a((Object) musicModel, "musicModel");
            int i4 = this.f73997e;
            boolean z = this.f73998f;
            C52711k.m112240b(musicModel, "musicModel");
            if (z) {
                d = C28381ab.m67359d();
                i3 = 3;
            } else {
                d = C28381ab.m67359d();
                i3 = 1;
            }
            String a = d.mo56813a(i3);
            String str2 = "play_music";
            C23089d a2 = C23089d.m56640a().mo47829a("music_id", musicModel.getMusicId());
            String str3 = "enter_from";
            if (z) {
                str = "general_search";
            } else {
                str = "search_result";
            }
            C26890h.m65011a(str2, a2.mo47829a(str3, str).mo47829a("enter_method", "click_play_music").mo47826a("order", i4).mo47829a("log_pb", C29981aa.m70153a().mo60161a(a)).f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$d */
    static final class C28184d implements C48547b {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f74000a;

        C28184d(MusicPlayHelper musicPlayHelper) {
            this.f74000a = musicPlayHelper;
        }

        /* renamed from: a */
        public final void mo50919a() {
            this.f74000a.f73984a.setValue(new C52847n(Integer.valueOf(0), Long.valueOf(-1)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$e */
    static final class C28185e implements C48548c {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f74001a;

        C28185e(MusicPlayHelper musicPlayHelper) {
            this.f74001a = musicPlayHelper;
        }

        /* renamed from: a */
        public final void mo50920a(int i, int i2) {
            this.f74001a.f73984a.setValue(new C52847n(Integer.valueOf(0), Long.valueOf(-1)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$f */
    public static final class C28186f extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ MusicPlayHelper f74002a;

        /* renamed from: b */
        final /* synthetic */ long f74003b;

        public final void onTick(long j) {
        }

        public final void onFinish() {
            this.f74002a.mo56585a();
        }

        C28186f(MusicPlayHelper musicPlayHelper, long j, long j2, long j3) {
            this.f74002a = musicPlayHelper;
            this.f74003b = j;
            super(j2, 1000);
        }
    }

    public final void onCleared() {
        CountDownTimer countDownTimer = this.f73987d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        mo56585a();
        this.f73990h.mo96050a();
        C37372e eVar = this.f73985b;
        if (eVar != null) {
            eVar.mo76655a(-1);
        }
    }

    /* renamed from: a */
    public final void mo56585a() {
        CountDownTimer countDownTimer = this.f73987d;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f73990h.mo96057b();
        this.f73986c = null;
        this.f73984a.setValue(new C52847n(Integer.valueOf(0), Long.valueOf(-1)));
    }

    /* renamed from: a */
    public final void mo56587a(C0199s<C52847n<Integer, Long>> sVar) {
        C52711k.m112240b(sVar, "observer");
        this.f73984a.removeObserver(sVar);
    }

    /* renamed from: b */
    public final boolean mo56590b(long j) {
        if (this.f73984a.getValue() != null) {
            C52847n nVar = (C52847n) this.f73984a.getValue();
            if (nVar != null && ((Number) nVar.getFirst()).intValue() == 1) {
                C52847n nVar2 = (C52847n) this.f73984a.getValue();
                if (nVar2 != null && ((Number) nVar2.getSecond()).longValue() == j) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo56589a(long j) {
        if (this.f73984a.getValue() != null) {
            C52847n nVar = (C52847n) this.f73984a.getValue();
            if (nVar != null && ((Number) nVar.getFirst()).intValue() == 2) {
                C52847n nVar2 = (C52847n) this.f73984a.getValue();
                if (nVar2 != null && ((Number) nVar2.getSecond()).longValue() == j) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m67065a(Context context, Music music) {
        String offlineDesc = music.getOfflineDesc();
        if (TextUtils.isEmpty(offlineDesc)) {
            offlineDesc = context.getString(R.string.ce6);
        }
        C10691a.m21551c(context, offlineDesc).mo19066a();
    }

    /* renamed from: a */
    public final void mo56586a(C0184k kVar, C0199s<C52847n<Integer, Long>> sVar) {
        C52711k.m112240b(kVar, "lifecycleOwner");
        C52711k.m112240b(sVar, "observer");
        this.f73984a.mo48247a(kVar, sVar, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00f5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo56588a(android.support.p030v4.app.FragmentActivity r20, com.p683ss.android.ugc.aweme.music.model.Music r21, java.lang.String r22, int r23, boolean r24) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            r10 = r21
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            java.lang.String r0 = "music"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r0)
            java.lang.String r0 = "keyWord"
            r7 = r22
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            com.ss.android.ugc.e.c r0 = r8.f73990h
            r0.mo96057b()
            r8.f73986c = r10
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r4 = r21.convertToMusicModel()
            com.ss.android.ugc.aweme.music.service.IMusicService r0 = com.p683ss.android.ugc.aweme.component.music.MusicService.createIMusicServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.music.service.IMusicService r0 = (com.p683ss.android.ugc.aweme.music.service.IMusicService) r0
            r11 = r9
            android.content.Context r11 = (android.content.Context) r11
            r1 = 1
            boolean r0 = r0.checkValidMusic(r4, r11, r1)
            if (r0 != 0) goto L_0x0033
            return
        L_0x0033:
            com.ss.android.ugc.e.b.a r12 = new com.ss.android.ugc.e.b.a
            r12.<init>()
            java.lang.String r0 = "musicModel"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r0 = r4.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r2 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.ONLINE
            if (r0 != r2) goto L_0x0048
            r0 = 4
            r12.f121993c = r0
        L_0x0048:
            com.bytedance.ies.abmock.b r13 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment> r14 = com.p683ss.android.ugc.aweme.experiment.RemoveMusic15sCapExperiment.class
            r15 = 1
            java.lang.String r16 = "remove_15s_cap_music"
            r17 = 31744(0x7c00, float:4.4483E-41)
            r18 = 1
            boolean r0 = r13.mo18172a(r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x006b
            java.lang.Integer r0 = r4.getAuditionDuration()
            java.lang.String r2 = "musicModel.auditionDuration"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            int r0 = r0.intValue()
            r12.f121994d = r0
            goto L_0x0071
        L_0x006b:
            int r0 = r4.getDuration()
            r12.f121994d = r0
        L_0x0071:
            com.ss.android.ugc.aweme.arch.widgets.base.b<d.n<java.lang.Integer, java.lang.Long>> r0 = r8.f73984a
            d.n r2 = new d.n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            long r5 = r21.getId()
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r2.<init>(r1, r3)
            r0.setValue(r2)
            com.ss.android.ugc.e.c r13 = r8.f73990h
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$c r14 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$c
            r0 = r14
            r1 = r19
            r2 = r20
            r3 = r21
            r5 = r23
            r6 = r24
            r7 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            com.ss.android.ugc.e.a.d r14 = (com.p683ss.android.ugc.p2425e.p2426a.C48549d) r14
            r13.mo96053a(r14)
            com.ss.android.ugc.e.c r0 = r8.f73990h
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$d r1 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$d
            r1.<init>(r8)
            com.ss.android.ugc.e.a.b r1 = (com.p683ss.android.ugc.p2425e.p2426a.C48547b) r1
            r0.mo96051a(r1)
            com.ss.android.ugc.e.c r0 = r8.f73990h
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$e r1 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$e
            r1.<init>(r8)
            com.ss.android.ugc.e.a.c r1 = (com.p683ss.android.ugc.p2425e.p2426a.C48548c) r1
            r0.mo96052a(r1)
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r21.getPlayUrl()
            if (r0 == 0) goto L_0x00ec
            java.util.List r0 = r0.getUrlList()
            if (r0 == 0) goto L_0x00ec
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x00d3
            r12.f121992b = r0
            com.ss.android.ugc.e.c r0 = r8.f73990h
            r1 = 0
            r0.mo96055a(r12, r1)
            goto L_0x00ef
        L_0x00d3:
            m67065a(r11, r10)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Music Url List size is zero, and music id:  "
            r0.<init>(r1)
            long r1 = r21.getId()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p683ss.android.ugc.aweme.util.C47625i.m103103a(r0)
            goto L_0x00ef
        L_0x00ec:
            m67065a(r11, r10)
        L_0x00ef:
            android.arch.lifecycle.h r0 = r20.getLifecycle()
            if (r0 == 0) goto L_0x00ff
            com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$play$6 r1 = new com.ss.android.ugc.aweme.discover.helper.MusicPlayHelper$play$6
            r1.<init>(r8)
            android.arch.lifecycle.j r1 = (android.arch.lifecycle.C0183j) r1
            r0.mo324a(r1)
        L_0x00ff:
            com.ss.android.ugc.aweme.discover.d.h r0 = new com.ss.android.ugc.aweme.discover.d.h
            r0.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.helper.MusicPlayHelper.mo56588a(android.support.v4.app.FragmentActivity, com.ss.android.ugc.aweme.music.model.Music, java.lang.String, int, boolean):void");
    }
}
