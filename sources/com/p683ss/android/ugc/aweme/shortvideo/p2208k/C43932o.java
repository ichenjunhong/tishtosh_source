package com.p683ss.android.ugc.aweme.shortvideo.p2208k;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.music.C37372e;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IRecordService;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.duet.C43237b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45627c;
import com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44413c;
import com.p683ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.p2425e.C48545a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o */
public final class C43932o {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f111233a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C43932o.class), "musicFetcher", "getMusicFetcher()Lcom/ss/android/ugc/aweme/music/MusicFetcher;"))};

    /* renamed from: o */
    public static final C43933a f111234o = new C43933a(null);

    /* renamed from: b */
    public Context f111235b;

    /* renamed from: c */
    public String f111236c = "";

    /* renamed from: d */
    public Aweme f111237d;

    /* renamed from: e */
    public C45547d f111238e;

    /* renamed from: f */
    public int f111239f;

    /* renamed from: g */
    public final List<String> f111240g = new ArrayList();

    /* renamed from: h */
    public String f111241h;

    /* renamed from: i */
    public C42482c f111242i;

    /* renamed from: j */
    public int f111243j = 20;

    /* renamed from: k */
    public float f111244k;

    /* renamed from: l */
    public float f111245l;

    /* renamed from: m */
    public boolean f111246m;

    /* renamed from: n */
    public final Callable<C52860x> f111247n;

    /* renamed from: p */
    private String f111248p;

    /* renamed from: q */
    private String f111249q;

    /* renamed from: r */
    private final String f111250r = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().cacheDir();

    /* renamed from: s */
    private final Handler f111251s = new Handler(Looper.getMainLooper());

    /* renamed from: t */
    private final C52668f f111252t = C52732g.m112285a(new C43942j(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$a */
    public static final class C43933a {
        private C43933a() {
        }

        public /* synthetic */ C43933a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$b */
    public static final class C43934b implements C37435b {

        /* renamed from: a */
        final /* synthetic */ C43932o f111253a;

        /* renamed from: b */
        final /* synthetic */ Music f111254b;

        /* renamed from: a */
        public final void mo55350a() {
        }

        /* renamed from: b */
        public final void mo55354b() {
            this.f111253a.f111239f = 100 - this.f111253a.f111243j;
            C0013i.m18a(this.f111253a.f111247n, C0013i.f25b);
        }

        /* renamed from: a */
        public final void mo55352a(C48545a aVar) {
            C52711k.m112240b(aVar, "error");
            this.f111253a.mo89490b();
        }

        /* renamed from: a */
        public final void mo55351a(int i) {
            this.f111253a.f111239f = ((int) (((float) i) * this.f111253a.f111245l)) + (100 - this.f111253a.f111243j);
            C0013i.m18a(this.f111253a.f111247n, C0013i.f25b);
        }

        C43934b(C43932o oVar, Music music) {
            this.f111253a = oVar;
            this.f111254b = music;
        }

        /* renamed from: a */
        public final void mo55353a(String str, MusicWaveBean musicWaveBean) {
            C52711k.m112240b(str, "musicFile");
            C43932o oVar = this.f111253a;
            new C45627c();
            C42482c a = C45627c.m99362a(this.f111254b.convertToMusicModel());
            a.path = str;
            oVar.f111242i = a;
            this.f111253a.mo89491c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$c */
    public static final class C43935c extends C44413c {

        /* renamed from: a */
        final /* synthetic */ C43932o f111255a;

        /* renamed from: b */
        final /* synthetic */ Aweme f111256b;

        /* renamed from: a */
        public final void mo89476a(String str, String str2) {
            C52711k.m112240b(str, "url");
            C52711k.m112240b(str2, "fullFilePath");
            super.mo89476a(str, str2);
            this.f111255a.f111239f = 100 - this.f111255a.f111243j;
            C0013i.m18a(this.f111255a.f111247n, C0013i.f25b);
            if (new File(str2).length() == 0) {
                StringBuilder sb = new StringBuilder("WaterMarkComposer download file size == 0: ");
                sb.append(this.f111255a.f111240g);
                C32458a.m75148a((Throwable) new Exception(sb.toString()));
                this.f111255a.mo89490b();
                return;
            }
            this.f111255a.f111241h = str2;
            if (this.f111256b.getMusic() == null || !this.f111255a.f111246m) {
                this.f111255a.mo89491c();
                return;
            }
            C43932o oVar = this.f111255a;
            Music music = this.f111256b.getMusic();
            C52711k.m112236a((Object) music, "aweme.music");
            oVar.mo89488a(music);
        }

        /* renamed from: a */
        public final void mo89475a(Exception exc, String str, Integer num) {
            super.mo89475a(exc, str, num);
            this.f111255a.mo89490b();
        }

        /* renamed from: a */
        public final void mo89474a(int i, long j, long j2) {
            super.mo89474a(i, j, j2);
            if (this.f111255a.f111235b != null) {
                if (i > 100) {
                    i = 100;
                }
                this.f111255a.f111239f = (int) (((float) i) * this.f111255a.f111244k);
                C0013i.m18a(this.f111255a.f111247n, C0013i.f25b);
            }
        }

        C43935c(C43932o oVar, Aweme aweme, List list, String str) {
            this.f111255a = oVar;
            this.f111256b = aweme;
            super(list, str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$d */
    public static final class C43936d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ Aweme f111257a;

        public C43936d(Aweme aweme) {
            this.f111257a = aweme;
        }

        public final /* synthetic */ Object call() {
            IPrivacyConfig privacyConfig = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().privacyConfig();
            String aid = this.f111257a.getAid();
            C52711k.m112236a((Object) aid, "aweme.aid");
            return privacyConfig.checkDuetReactPermission(aid, 2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$e */
    public static final class C43937e<TTaskResult, TContinuationResult> implements C0011g<C43237b, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43932o f111258a;

        public C43937e(C43932o oVar) {
            this.f111258a = oVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0049  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r2) {
            /*
                r1 = this;
                java.lang.String r0 = "task"
                p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
                boolean r0 = r2.mo33d()
                if (r0 != 0) goto L_0x0058
                boolean r0 = r2.mo31c()
                if (r0 == 0) goto L_0x0012
                goto L_0x0058
            L_0x0012:
                java.lang.Object r0 = r2.mo34e()
                com.ss.android.ugc.aweme.shortvideo.duet.b r0 = (com.p683ss.android.ugc.aweme.shortvideo.duet.C43237b) r0
                boolean r0 = r0.f109339a
                if (r0 != 0) goto L_0x0052
                java.lang.Object r2 = r2.mo34e()
                com.ss.android.ugc.aweme.shortvideo.duet.b r2 = (com.p683ss.android.ugc.aweme.shortvideo.duet.C43237b) r2
                java.lang.String r2 = r2.f109342d
                r0 = r2
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                int r0 = r0.length()
                if (r0 != 0) goto L_0x002f
                r0 = 1
                goto L_0x0030
            L_0x002f:
                r0 = 0
            L_0x0030:
                if (r0 == 0) goto L_0x004c
                com.ss.android.ugc.aweme.shortvideo.k.o r2 = r1.f111258a
                android.content.Context r2 = r2.f111235b
                if (r2 == 0) goto L_0x0046
                android.content.res.Resources r2 = r2.getResources()
                if (r2 == 0) goto L_0x0046
                r0 = 2132549505(0x7f1c1f81, float:2.0752314E38)
                java.lang.String r2 = r2.getString(r0)
                goto L_0x0047
            L_0x0046:
                r2 = 0
            L_0x0047:
                if (r2 != 0) goto L_0x004c
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x004c:
                com.ss.android.ugc.aweme.shortvideo.k.o r0 = r1.f111258a
                r0.mo89489a(r2)
                goto L_0x005d
            L_0x0052:
                com.ss.android.ugc.aweme.shortvideo.k.o r2 = r1.f111258a
                r2.mo89487a()
                goto L_0x005d
            L_0x0058:
                com.ss.android.ugc.aweme.shortvideo.k.o r2 = r1.f111258a
                r2.mo89487a()
            L_0x005d:
                d.x r2 = p2628d.C52860x.f131107a
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43932o.C43937e.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$f */
    static final class C43938f<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43932o f111259a;

        C43938f(C43932o oVar) {
            this.f111259a = oVar;
        }

        public final /* synthetic */ Object call() {
            if (this.f111259a.f111235b != null) {
                this.f111259a.mo89492d();
                C10691a.m21542b(this.f111259a.f111235b, (int) R.string.at3).mo19066a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$g */
    static final class C43939g<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43932o f111260a;

        C43939g(C43932o oVar) {
            this.f111260a = oVar;
        }

        public final /* synthetic */ Object call() {
            this.f111260a.mo89492d();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$h */
    public static final class C43940h implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ C43932o f111261a;

        /* renamed from: b */
        final /* synthetic */ Intent f111262b;

        /* renamed from: c */
        final /* synthetic */ StitchParams f111263c;

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            IRecordService recordService = asyncAVService.uiService().recordService();
            Context context = this.f111261a.f111235b;
            if (context == null) {
                C52711k.m112234a();
            }
            recordService.startStitch(context, this.f111262b, this.f111263c);
        }

        C43940h(C43932o oVar, Intent intent, StitchParams stitchParams) {
            this.f111261a = oVar;
            this.f111262b = intent;
            this.f111263c = stitchParams;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$i */
    static final class C43941i<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C43932o f111264a;

        C43941i(C43932o oVar) {
            this.f111264a = oVar;
        }

        public final /* synthetic */ Object call() {
            C45547d dVar = this.f111264a.f111238e;
            if (dVar != null) {
                int i = 100;
                if (this.f111264a.f111239f < 100) {
                    i = this.f111264a.f111239f;
                }
                dVar.setProgress(i);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$j */
    static final class C43942j extends C52712l implements C52670a<C37372e> {

        /* renamed from: a */
        final /* synthetic */ C43932o f111265a;

        C43942j(C43932o oVar) {
            this.f111265a = oVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f111265a.f111235b;
            if (context == null) {
                C52711k.m112234a();
            }
            C37372e eVar = new C37372e(context, false, false, false, "stitch", 12, null);
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.o$k */
    static final class C43943k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43932o f111266a;

        C43943k(C43932o oVar) {
            this.f111266a = oVar;
        }

        public final void run() {
            if (this.f111266a.f111239f == 0) {
                this.f111266a.mo89490b();
            }
        }
    }

    /* renamed from: e */
    private final C37372e m96466e() {
        return (C37372e) this.f111252t.getValue();
    }

    /* renamed from: b */
    public final void mo89490b() {
        C0013i.m18a((Callable<TResult>) new C43938f<TResult>(this), C0013i.f25b);
    }

    /* renamed from: d */
    public final void mo89492d() {
        try {
            C45547d dVar = this.f111238e;
            if (dVar != null) {
                dVar.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f111238e = null;
    }

    public C43932o() {
        m96465a(20);
        this.f111247n = new C43941i(this);
    }

    /* renamed from: c */
    public final void mo89491c() {
        String str;
        String str2;
        if (this.f111235b != null) {
            C0013i.m18a((Callable<TResult>) new C43939g<TResult>(this), C0013i.f25b);
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
            String str3 = "shoot";
            C23089d a = C23089d.m56640a().mo47829a("creation_id", uuid).mo47829a("shoot_way", "stitch");
            String str4 = "group_id";
            Aweme aweme = this.f111237d;
            if (aweme == null) {
                C52711k.m112237a("mAweme");
            }
            C26890h.m65011a(str3, a.mo47829a(str4, aweme.getAid()).mo47829a("enter_from", this.f111236c).mo47829a("enter_method", "click_stitch_button").mo47829a("content_source", "shoot").mo47829a("content_type", "video").f61491a);
            String str5 = this.f111241h;
            if (str5 == null) {
                C52711k.m112237a("mOutPath");
            }
            C42482c cVar = this.f111242i;
            C42482c cVar2 = this.f111242i;
            if (cVar2 != null) {
                str = cVar2.getPath();
            } else {
                str = null;
            }
            boolean z = this.f111246m;
            Aweme aweme2 = this.f111237d;
            if (aweme2 == null) {
                C52711k.m112237a("mAweme");
            }
            User author = aweme2.getAuthor();
            Aweme aweme3 = this.f111237d;
            if (aweme3 == null) {
                C52711k.m112237a("mAweme");
            }
            String aid = aweme3.getAid();
            C42482c cVar3 = this.f111242i;
            if (cVar3 != null) {
                str2 = cVar3.getMusicId();
            } else {
                str2 = null;
            }
            StitchParams stitchParams = new StitchParams(null, str5, cVar, str, 0, z, str2, author, aid, null, 0, null, null, false, false, 32272, null);
            Intent intent = new Intent();
            intent.putExtra("creation_id", uuid);
            intent.putExtra("shoot_way", "stitch");
            AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C43940h(this, intent, stitchParams));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89487a() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f111237d
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0009:
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47935p.m103710c(r0)
            if (r0 != 0) goto L_0x002b
            android.content.Context r0 = r8.f111235b
            if (r0 == 0) goto L_0x0021
            android.content.res.Resources r0 = r0.getResources()
            if (r0 == 0) goto L_0x0021
            r1 = 2132549505(0x7f1c1f81, float:2.0752314E38)
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 != 0) goto L_0x0027
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0027:
            r8.mo89489a(r0)
            return
        L_0x002b:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f111237d
            if (r0 != 0) goto L_0x0034
            java.lang.String r1 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0034:
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            java.lang.String r1 = "mAweme.video"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r0 = r0.getPlayAddrH264()
            if (r0 == 0) goto L_0x017e
            java.util.List r1 = r0.getUrlList()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x004f
            goto L_0x017e
        L_0x004f:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f111237d
            if (r1 != 0) goto L_0x0058
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0058:
            com.ss.android.ugc.aweme.music.model.Music r1 = r1.getMusic()
            if (r1 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f111237d
            if (r1 != 0) goto L_0x0067
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0067:
            com.ss.android.ugc.aweme.music.model.Music r1 = r1.getMusic()
            java.lang.String r2 = "mAweme.music"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            boolean r1 = r1.isPgc()
            r8.f111246m = r1
        L_0x0076:
            boolean r1 = r8.f111246m
            r2 = 0
            if (r1 != 0) goto L_0x007e
            r8.m96465a(r2)
        L_0x007e:
            java.util.List<java.lang.String> r1 = r8.f111240g
            java.util.List r3 = r0.getUrlList()
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = p2628d.p2629a.C52575l.m112092a(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r8.f111237d
            if (r4 != 0) goto L_0x0095
            java.lang.String r5 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0095:
            java.util.List r3 = com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44414d.m97221a(r3, r4)
            java.util.Collection r3 = (java.util.Collection) r3
            r1.addAll(r3)
            java.lang.String r0 = r0.getBitRatedRatioUri()
            java.lang.String r0 = com.p683ss.android.vesdk.utils.C50785a.m109897a(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r8.f111250r
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ".mp4"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r8.f111241h = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r8.f111250r
            r1.append(r3)
            java.lang.String r3 = "temp_"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ".mp4"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r8.f111248p = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = r8.f111250r
            r1.append(r3)
            java.lang.String r3 = "temp_"
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = ".wav"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r8.f111249q = r1
            java.lang.String r1 = r8.f111241h
            if (r1 != 0) goto L_0x0101
            java.lang.String r3 = "mOutPath"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0101:
            boolean r1 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r1)
            if (r1 != 0) goto L_0x013d
            java.lang.String r1 = r8.f111250r
            com.p683ss.android.ugc.aweme.video.C48016e.m103935a(r1, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f111237d
            if (r1 != 0) goto L_0x0115
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0115:
            java.lang.String r2 = r8.f111250r
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = ".mp4"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = r1.getAid()
            java.util.List<java.lang.String> r4 = r8.f111240g
            com.ss.android.ugc.aweme.shortvideo.k.o$c r5 = new com.ss.android.ugc.aweme.shortvideo.k.o$c
            java.util.List<java.lang.String> r6 = r8.f111240g
            java.lang.String r7 = "stitch"
            r5.<init>(r8, r1, r6, r7)
            com.ss.android.ugc.aweme.shortvideo.reaction.a.a r5 = (com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44410a) r5
            com.p683ss.android.ugc.aweme.shortvideo.reaction.p2222a.C44415e.m97222a(r3, r4, r2, r0, r5)
            goto L_0x016e
        L_0x013d:
            r0 = 100
            r8.m96465a(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f111237d
            if (r0 != 0) goto L_0x014b
            java.lang.String r1 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x014b:
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            if (r0 == 0) goto L_0x016b
            boolean r0 = r8.f111246m
            if (r0 == 0) goto L_0x016b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.f111237d
            if (r0 != 0) goto L_0x015e
            java.lang.String r1 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x015e:
            com.ss.android.ugc.aweme.music.model.Music r0 = r0.getMusic()
            java.lang.String r1 = "mAweme.music"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r8.mo89488a(r0)
            goto L_0x016e
        L_0x016b:
            r8.mo89491c()
        L_0x016e:
            android.os.Handler r0 = r8.f111251s
            com.ss.android.ugc.aweme.shortvideo.k.o$k r1 = new com.ss.android.ugc.aweme.shortvideo.k.o$k
            r1.<init>(r8)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r2 = 60000(0xea60, double:2.9644E-319)
            r0.postDelayed(r1, r2)
            return
        L_0x017e:
            r8.mo89492d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2208k.C43932o.mo89487a():void");
    }

    /* renamed from: a */
    private final void m96465a(int i) {
        this.f111243j = i;
        this.f111245l = ((float) i) / 100.0f;
        this.f111244k = 1.0f - this.f111245l;
    }

    /* renamed from: a */
    public final void mo89489a(String str) {
        if (this.f111235b != null) {
            C10691a.m21551c(this.f111235b, str).mo19066a();
            mo89492d();
        }
    }

    /* renamed from: a */
    public final void mo89488a(Music music) {
        if (this.f111246m) {
            C37372e e = m96466e();
            MusicModel convertToMusicModel = music.convertToMusicModel();
            C52711k.m112236a((Object) convertToMusicModel, "music.convertToMusicModel()");
            e.m83672a(convertToMusicModel, new C43934b(this, music), -1);
        }
    }
}
