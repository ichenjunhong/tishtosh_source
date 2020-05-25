package com.p683ss.android.ugc.aweme.music;

import android.content.Context;
import com.p683ss.android.ugc.aweme.music.p1974b.C37333e;
import com.p683ss.android.ugc.aweme.music.p1976d.C37360a;
import com.p683ss.android.ugc.aweme.music.p1976d.C37361b;
import com.p683ss.android.ugc.aweme.music.p1976d.C37363d;
import com.p683ss.android.ugc.aweme.music.p1976d.C37365e;
import com.p683ss.android.ugc.aweme.music.p1976d.C37369f;
import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.p2425e.C48545a;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.music.e */
public final class C37372e {

    /* renamed from: c */
    public static final C37373a f95346c = new C37373a(null);

    /* renamed from: a */
    public int f95347a;

    /* renamed from: b */
    public Map<String, Integer> f95348b;

    /* renamed from: d */
    private final Context f95349d;

    /* renamed from: e */
    private final C37333e f95350e;

    /* renamed from: f */
    private C37369f f95351f;

    /* renamed from: g */
    private C37363d f95352g;

    /* renamed from: h */
    private Set<Integer> f95353h;

    /* renamed from: i */
    private volatile int f95354i;

    /* renamed from: j */
    private boolean f95355j;

    /* renamed from: k */
    private boolean f95356k;

    /* renamed from: l */
    private final boolean f95357l;

    /* renamed from: m */
    private String f95358m;

    /* renamed from: com.ss.android.ugc.aweme.music.e$a */
    public static final class C37373a {
        private C37373a() {
        }

        public /* synthetic */ C37373a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.e$b */
    public static final class C37374b implements C37435b {

        /* renamed from: a */
        final /* synthetic */ C37372e f95359a;

        /* renamed from: b */
        final /* synthetic */ MusicModel f95360b;

        /* renamed from: c */
        final /* synthetic */ C37435b f95361c;

        /* renamed from: d */
        final /* synthetic */ C52727e f95362d;

        /* renamed from: e */
        final /* synthetic */ int f95363e;

        /* renamed from: a */
        public final void mo55350a() {
            this.f95361c.mo55350a();
        }

        /* renamed from: b */
        public final void mo55354b() {
            this.f95361c.mo55354b();
        }

        /* renamed from: a */
        public final void mo55351a(int i) {
            this.f95361c.mo55351a(i);
        }

        /* renamed from: a */
        public final void mo55352a(C48545a aVar) {
            C52711k.m112240b(aVar, "error");
            this.f95361c.mo55352a(aVar);
            ((C37369f) this.f95362d.element).mo76650a(false);
        }

        /* renamed from: a */
        public final void mo55353a(String str, MusicWaveBean musicWaveBean) {
            C52711k.m112240b(str, "musicFile");
            this.f95361c.mo55353a(str, musicWaveBean);
            ((C37369f) this.f95362d.element).mo76652c();
        }

        C37374b(C37372e eVar, MusicModel musicModel, C37435b bVar, C52727e eVar2, int i) {
            this.f95359a = eVar;
            this.f95360b = musicModel;
            this.f95361c = bVar;
            this.f95362d = eVar2;
            this.f95363e = i;
        }
    }

    public C37372e(Context context, boolean z) {
        this(context, z, false, false, null, 28, null);
    }

    public C37372e(Context context, boolean z, boolean z2, boolean z3) {
        this(context, false, true, z3, null, 16, null);
    }

    /* renamed from: a */
    public final synchronized int mo76654a() {
        this.f95354i++;
        return this.f95354i;
    }

    /* renamed from: b */
    private boolean m83673b(int i) {
        return this.f95353h.contains(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final void mo76655a(int i) {
        if (i >= 0) {
            this.f95353h.add(Integer.valueOf(i));
        }
        this.f95350e.mo76635a();
        C37369f fVar = this.f95351f;
        if (fVar != null) {
            fVar.mo76653d();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0053, code lost:
        if (r4 == null) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m83672a(com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel r21, com.p683ss.android.ugc.aweme.music.service.C37435b r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r3 = r21
            r1 = r23
            java.lang.String r2 = "musicModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r2)
            java.lang.String r2 = "listener"
            r7 = r22
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r2)
            boolean r2 = r0.m83673b(r1)
            r12 = 0
            if (r2 == 0) goto L_0x001a
            return r12
        L_0x001a:
            com.ss.android.ugc.aweme.music.d$a r2 = com.p683ss.android.ugc.aweme.music.C37357d.f95320g
            java.lang.String r8 = r0.f95358m
            java.lang.String r2 = "musicModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r2)
            com.ss.android.ugc.aweme.music.d r2 = new com.ss.android.ugc.aweme.music.d
            java.lang.String r5 = r21.getMusicId()
            java.lang.String r4 = "musicModel.musicId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r4)
            java.lang.String r4 = r21.getUri()
            r10 = 2
            r13 = 1
            if (r4 == 0) goto L_0x0055
            r14 = r4
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            java.lang.String[] r15 = new java.lang.String[r13]
            java.lang.String r4 = "/"
            r15[r12] = r4
            r16 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            java.util.List r4 = p2628d.p2650m.C52830p.m112452b(r14, r15, r16, r17, r18, r19)
            if (r4 == 0) goto L_0x0055
            java.lang.Object r4 = p2628d.p2629a.C52575l.m112118a(r4, r10)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0057
        L_0x0055:
            java.lang.String r4 = ""
        L_0x0057:
            r6 = r4
            r9 = 0
            r4 = r2
            r7 = r22
            r4.<init>(r5, r6, r7, r8, r9)
            com.ss.android.ugc.aweme.music.service.b r2 = (com.p683ss.android.ugc.aweme.music.service.C37435b) r2
            android.content.Context r4 = r0.f95349d
            boolean r5 = r0.f95355j
            boolean r4 = com.p683ss.android.ugc.aweme.music.p1977e.C37378c.m83700a(r3, r4, r5)
            if (r4 != 0) goto L_0x006c
            return r12
        L_0x006c:
            if (r3 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r4 = r21.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r5 = com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.ONLINE
            if (r4 != r5) goto L_0x0078
            r4 = 1
            goto L_0x0079
        L_0x0078:
            r4 = 0
        L_0x0079:
            if (r4 != 0) goto L_0x0081
            java.lang.String r1 = "MusicFetcher download not online music"
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98971b(r1)
            return r12
        L_0x0081:
            com.ss.android.ugc.e.d r4 = com.p683ss.android.ugc.p2425e.C48557d.m105031a()
            java.lang.String r5 = "MusicProviderConfig.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r4 = r4.mo96062b()
            com.ss.android.ugc.aweme.base.model.UrlModel r5 = r21.getUrl()
            java.lang.String r6 = "musicModel.url"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            java.lang.String r5 = com.p683ss.android.ugc.aweme.music.p1974b.C37332d.m83629b(r5)
            java.lang.String r5 = com.p683ss.android.ugc.p2425e.C48551b.m105020b(r5)
            java.lang.String r6 = "mDownDir"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
            java.lang.String r6 = "/"
            r7 = 0
            boolean r6 = p2628d.p2650m.C52830p.m112413c(r4, r6, r12, r10, r7)
            if (r6 == 0) goto L_0x00bd
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            goto L_0x00d1
        L_0x00bd:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            java.lang.String r4 = java.io.File.separator
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
        L_0x00d1:
            java.lang.String r6 = r21.getMusicId()
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = r21.getUrl()
            java.lang.String r8 = com.p683ss.android.ugc.aweme.music.p1974b.C37332d.m83628a(r8)
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r21.getStrongBeatUrl()
            java.lang.String r9 = com.p683ss.android.ugc.aweme.music.p1974b.C37332d.m83628a(r9)
            com.ss.android.ugc.aweme.music.model.Music r10 = r21.getMusic()
            if (r10 == 0) goto L_0x00f0
            int r10 = r10.getSource()
            goto L_0x00f1
        L_0x00f0:
            r10 = -1
        L_0x00f1:
            java.lang.String r11 = r0.f95358m
            com.ss.android.ugc.aweme.app.f.d r15 = new com.ss.android.ugc.aweme.app.f.d
            r15.<init>()
            java.lang.String r7 = "music_id"
            com.ss.android.ugc.aweme.app.f.d r7 = r15.mo47829a(r7, r6)
            java.lang.String r15 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r15, r11)
            java.lang.String r11 = "url"
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r11, r8)
            java.lang.String r11 = "download_strategy"
            com.ss.android.ugc.aweme.music.service.IMusicService r15 = com.p683ss.android.ugc.aweme.component.music.MusicService.createIMusicServicebyMonsterPlugin()
            java.lang.String r14 = "ServiceManager.get().get…MusicService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r15, r14)
            com.ss.android.ugc.aweme.music.service.IMusicService r15 = (com.p683ss.android.ugc.aweme.music.service.IMusicService) r15
            int r14 = r15.getDownloadStrategy()
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47826a(r11, r14)
            java.lang.String r11 = "musicEffectsUrl"
            com.ss.android.ugc.aweme.app.f.d r7 = r7.mo47829a(r11, r9)
            java.lang.String r9 = "download_music"
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r9, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = r0.f95358m
            r7.append(r9)
            java.lang.String r9 = ", MusicDownloadStart: musicId="
            r7.append(r9)
            r7.append(r6)
            r6 = 44
            r7.append(r6)
            java.lang.String r9 = " url="
            r7.append(r9)
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = " musicSource="
            r7.append(r6)
            r7.append(r10)
            java.lang.String r6 = r7.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r6)
            boolean r6 = r0.f95356k
            r14 = 3
            if (r6 == 0) goto L_0x0226
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r21.getStrongBeatUrl()
            if (r6 == 0) goto L_0x0226
            boolean r6 = r0.m83673b(r1)
            if (r6 == 0) goto L_0x016f
            return r12
        L_0x016f:
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch
            r6.<init>(r13)
            com.ss.android.ugc.aweme.music.b.c r7 = new com.ss.android.ugc.aweme.music.b.c
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = r21.getStrongBeatUrl()
            java.lang.String r9 = "musicModel.strongBeatUrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            r7.<init>(r8, r4, r6)
            com.ss.android.ugc.aweme.music.b.e r4 = r0.f95350e
            java.lang.String r8 = "pool"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r8)
            r7.f95262e = r4
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r7.f95263f
            if (r4 == 0) goto L_0x01a9
            java.lang.String r8 = r4.getUri()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 != 0) goto L_0x01a9
            java.util.List r4 = r4.getUrlList()
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r4)
            if (r4 != 0) goto L_0x01a9
            r4 = 1
            goto L_0x01aa
        L_0x01a9:
            r4 = 0
        L_0x01aa:
            if (r4 != 0) goto L_0x01c9
            java.util.concurrent.CountDownLatch r4 = r7.f95264g
            r4.countDown()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "Download Music Beat illegal beat url: "
            r4.<init>(r8)
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r7.f95263f
            java.lang.String r7 = com.p683ss.android.ugc.aweme.music.p1974b.C37332d.m83628a(r7)
            r4.append(r7)
            java.lang.String r4 = r4.toString()
            com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay.m98971b(r4)
            goto L_0x0227
        L_0x01c9:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.ss.android.socialbase.downloader.model.HttpHeader r8 = new com.ss.android.socialbase.downloader.model.HttpHeader
            java.lang.String r9 = "Accept-Encoding"
            java.lang.String r10 = " "
            r8.<init>(r9, r10)
            r4.add(r8)
            com.ss.android.ugc.aweme.music.b.c$c r8 = new com.ss.android.ugc.aweme.music.b.c$c
            r8.<init>(r7)
            com.ss.android.socialbase.downloader.depend.IDownloadListener r8 = (com.p683ss.android.socialbase.downloader.depend.IDownloadListener) r8
            r7.f95261d = r8
            android.content.Context r8 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            com.ss.android.socialbase.downloader.model.DownloadTask r8 = com.p683ss.android.socialbase.downloader.downloader.Downloader.with(r8)
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r7.f95263f
            java.lang.String r9 = com.p683ss.android.ugc.aweme.music.p1974b.C37332d.m83629b(r9)
            com.ss.android.socialbase.downloader.model.DownloadTask r8 = r8.url(r9)
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r7.f95263f
            java.util.List r9 = com.p683ss.android.ugc.aweme.music.p1974b.C37332d.m83630c(r9)
            com.ss.android.socialbase.downloader.model.DownloadTask r8 = r8.backUpUrls(r9)
            java.lang.String r9 = com.p683ss.android.ugc.aweme.music.p1977e.C37381f.f95373a
            com.ss.android.socialbase.downloader.model.DownloadTask r8 = r8.savePath(r9)
            java.lang.String r9 = r7.f95259b
            com.ss.android.socialbase.downloader.model.DownloadTask r8 = r8.name(r9)
            com.ss.android.socialbase.downloader.model.DownloadTask r8 = r8.retryCount(r14)
            com.ss.android.socialbase.downloader.model.DownloadTask r8 = r8.showNotification(r12)
            com.ss.android.socialbase.downloader.depend.IDownloadListener r9 = r7.f95261d
            com.ss.android.socialbase.downloader.model.DownloadTask r8 = r8.subThreadListener(r9)
            java.util.List r4 = (java.util.List) r4
            com.ss.android.socialbase.downloader.model.DownloadTask r4 = r8.extraHeaders(r4)
            int r4 = r4.download()
            r7.f95260c = r4
            goto L_0x0227
        L_0x0226:
            r6 = 0
        L_0x0227:
            boolean r1 = r0.m83673b(r1)
            if (r1 == 0) goto L_0x022e
            return r12
        L_0x022e:
            com.ss.android.ugc.aweme.music.b.f r15 = new com.ss.android.ugc.aweme.music.b.f
            android.content.Context r4 = r0.f95349d
            java.lang.String r1 = "musicName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r1)
            com.ss.android.ugc.aweme.music.c r1 = new com.ss.android.ugc.aweme.music.c
            r1.<init>(r2)
            r7 = r1
            com.ss.android.ugc.aweme.music.service.b r7 = (com.p683ss.android.ugc.aweme.music.service.C37435b) r7
            boolean r8 = r0.f95357l
            boolean r9 = r0.f95355j
            java.lang.String r10 = r0.f95358m
            int r11 = r0.f95347a
            java.util.Map<java.lang.String, java.lang.Integer> r2 = r0.f95348b
            r1 = r15
            r16 = r2
            r2 = r4
            r3 = r21
            r4 = r5
            r5 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.music.b.e r1 = r0.f95350e
            java.lang.String r2 = "pool"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            r15.f95280k = r1
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r15.f95281l
            boolean r1 = r1.isPlayUrlValid()
            if (r1 == 0) goto L_0x0310
            com.ss.android.ugc.aweme.music.service.b r1 = r15.f95283n
            r1.mo55354b()
            com.ss.android.ugc.e.d r1 = com.p683ss.android.ugc.p2425e.C48557d.m105031a()
            java.lang.String r2 = "MusicProviderConfig.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.String r1 = r1.mo96062b()
            boolean r2 = com.p683ss.android.ugc.p2425e.C48551b.m105019a(r1)
            if (r2 != 0) goto L_0x0286
            com.p683ss.android.ugc.p2425e.C48551b.m105018a(r1, r12)
        L_0x0286:
            com.ss.android.ugc.aweme.music.b.f$d r1 = new com.ss.android.ugc.aweme.music.b.f$d
            r1.<init>(r15)
            com.ss.android.socialbase.downloader.depend.IDownloadListener r1 = (com.p683ss.android.socialbase.downloader.depend.IDownloadListener) r1
            r15.f95279j = r1
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r15.f95287r
            java.lang.String r2 = r15.f95272c
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto L_0x02b2
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = -1
            if (r1 == r2) goto L_0x02b2
            android.content.Context r2 = r15.f95271b
            com.ss.android.socialbase.downloader.downloader.Downloader r2 = com.p683ss.android.socialbase.downloader.downloader.Downloader.getInstance(r2)
            com.ss.android.socialbase.downloader.depend.IDownloadListener r3 = r15.f95279j
            r2.addSubThreadListener(r1, r3)
            r15.f95278i = r1
            goto L_0x0310
        L_0x02b2:
            android.content.Context r1 = r15.f95271b
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = com.p683ss.android.socialbase.downloader.downloader.Downloader.with(r1)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = r15.f95281l
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getUrl()
            java.lang.String r3 = "musicModel.url"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r2 = com.p683ss.android.ugc.aweme.music.p1974b.C37332d.m83629b(r2)
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.url(r2)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = r15.f95281l
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getUrl()
            java.lang.String r3 = "musicModel.url"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.util.List r2 = com.p683ss.android.ugc.aweme.music.p1974b.C37332d.m83630c(r2)
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.backUpUrls(r2)
            java.lang.String r2 = r15.f95275f
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.savePath(r2)
            java.lang.String r2 = r15.f95282m
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.name(r2)
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.retryCount(r14)
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.showNotification(r12)
            com.ss.android.socialbase.downloader.depend.IDownloadListener r2 = r15.f95279j
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.subThreadListener(r2)
            int r1 = r1.download()
            r15.f95278i = r1
            java.util.Map<java.lang.String, java.lang.Integer> r1 = r15.f95287r
            java.lang.String r2 = r15.f95272c
            java.lang.String r3 = "musicId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            int r3 = r15.f95278i
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r2, r3)
        L_0x0310:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.music.C37372e.m83672a(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, com.ss.android.ugc.aweme.music.service.b, int):boolean");
    }

    /* renamed from: a */
    public final boolean mo76656a(MusicModel musicModel, C37435b bVar, int i, boolean z) {
        C52711k.m112240b(musicModel, "musicModel");
        C52711k.m112240b(bVar, "listener");
        if (!z) {
            return m83672a(musicModel, bVar, i);
        }
        C52727e eVar = new C52727e();
        eVar.element = (C37369f) new C37365e(this.f95352g);
        this.f95351f = (C37369f) eVar.element;
        C37360a aVar = (C37369f) eVar.element;
        if (aVar != null) {
            try {
                aVar.mo76646a();
            } catch (Throwable th) {
                if (th instanceof C37361b) {
                    throw ((C37361b) th).getRealThrowable();
                }
                throw th;
            }
        }
        C37374b bVar2 = new C37374b(this, musicModel, bVar, eVar, i);
        return m83672a(musicModel, bVar2, i);
    }

    public C37372e(Context context, boolean z, boolean z2, boolean z3, String str) {
        C52711k.m112240b(context, "context");
        this.f95355j = z;
        this.f95356k = z2;
        this.f95357l = z3;
        this.f95358m = str;
        this.f95347a = 6;
        Context applicationContext = context.getApplicationContext();
        C52711k.m112236a((Object) applicationContext, "context.applicationContext");
        this.f95349d = applicationContext;
        this.f95350e = new C37333e();
        this.f95352g = new C37363d(context);
        this.f95353h = new LinkedHashSet();
        this.f95354i = -1;
        this.f95348b = new LinkedHashMap();
    }

    public /* synthetic */ C37372e(Context context, boolean z, boolean z2, boolean z3, String str, int i, C52707g gVar) {
        boolean z4;
        boolean z5;
        boolean z6;
        if ((i & 2) != 0) {
            z4 = false;
        } else {
            z4 = z;
        }
        if ((i & 4) != 0) {
            z5 = true;
        } else {
            z5 = z2;
        }
        if ((i & 8) != 0) {
            z6 = true;
        } else {
            z6 = z3;
        }
        if ((i & 16) != 0) {
            str = null;
        }
        this(context, z4, z5, z6, str);
    }
}
