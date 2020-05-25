package com.p683ss.android.ugc.aweme.music.p1974b;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.music.p1977e.C37381f;
import com.p683ss.android.ugc.aweme.music.p1978ui.C37630p;
import com.p683ss.android.ugc.aweme.p1445bp.C23883c;
import com.p683ss.android.ugc.aweme.p1445bp.C23887d;
import com.p683ss.android.ugc.aweme.p1445bp.C23909f;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.video.C48016e;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.music.b.c */
public final class C37328c implements C37326b {

    /* renamed from: h */
    public static final C52668f f95257h = C52732g.m112285a(C37330b.f95267a);

    /* renamed from: i */
    public static final C37329a f95258i = new C37329a(null);

    /* renamed from: b */
    public final String f95259b;

    /* renamed from: c */
    public int f95260c = -1;

    /* renamed from: d */
    public IDownloadListener f95261d;

    /* renamed from: e */
    public C37333e f95262e;

    /* renamed from: f */
    public final UrlModel f95263f;

    /* renamed from: g */
    public final CountDownLatch f95264g;

    /* renamed from: j */
    private final String f95265j;

    /* renamed from: com.ss.android.ugc.aweme.music.b.c$a */
    public static final class C37329a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f95266a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37329a.class), "LRUCACHE", "getLRUCACHE()Lcom/ss/android/ugc/aweme/music/ui/MemoryBufferedCache;"))};

        private C37329a() {
        }

        public /* synthetic */ C37329a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.b.c$b */
    static final class C37330b extends C52712l implements C52670a<C37630p> {

        /* renamed from: a */
        public static final C37330b f95267a = new C37330b();

        C37330b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m83627a();
        }

        /* renamed from: a */
        private static C37630p m83627a() {
            C23883c cVar;
            try {
                cVar = new C23887d(new File(C48016e.m103953e(), "music_effects"), 1, 16777216);
            } catch (IOException unused) {
                cVar = new C23909f();
            }
            return new C37630p(cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.b.c$c */
    public static final class C37331c extends C37325a {

        /* renamed from: a */
        final /* synthetic */ C37328c f95268a;

        public C37331c(C37328c cVar) {
            this.f95268a = cVar;
        }

        public final void onCanceled(DownloadInfo downloadInfo) {
            super.onCanceled(downloadInfo);
            this.f95268a.f95264g.countDown();
        }

        public final void onPause(DownloadInfo downloadInfo) {
            super.onPause(downloadInfo);
            this.f95268a.f95264g.countDown();
        }

        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            C37333e eVar = this.f95268a.f95262e;
            if (eVar != null) {
                eVar.mo76636a(this.f95268a);
            }
            StringBuilder sb = new StringBuilder("Download Music Beat start time: ");
            sb.append(System.currentTimeMillis());
            C45407ay.m98968a(sb.toString());
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            Long l;
            super.onSuccessed(downloadInfo);
            StringBuilder sb = new StringBuilder("Download Music Beat success time: ");
            sb.append(System.currentTimeMillis());
            sb.append(" duration: ");
            if (downloadInfo != null) {
                l = Long.valueOf(downloadInfo.getDownloadTime());
            } else {
                l = null;
            }
            sb.append(l);
            C45407ay.m98968a(sb.toString());
            this.f95268a.f95264g.countDown();
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            String str;
            super.onFailed(downloadInfo, baseException);
            StringBuilder sb = new StringBuilder("Download Music Beat beat url fail, cur url: ");
            Integer num = null;
            if (downloadInfo != null) {
                str = downloadInfo.getConnectionUrl();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(",retry url index: ");
            if (downloadInfo != null) {
                num = Integer.valueOf(downloadInfo.getCurBackUpUrlIndex());
            }
            sb.append(num);
            C45407ay.m98968a(sb.toString());
            this.f95268a.f95264g.countDown();
        }
    }

    /* renamed from: a */
    public final void mo76634a() {
        Downloader.getInstance(C11010c.m22280a()).removeSubThreadListener(this.f95260c, this.f95261d);
        this.f95262e = null;
    }

    public C37328c(UrlModel urlModel, String str, CountDownLatch countDownLatch) {
        C52711k.m112240b(urlModel, "beatUrl");
        C52711k.m112240b(str, "musicPath");
        C52711k.m112240b(countDownLatch, "countDownLatch");
        this.f95263f = urlModel;
        this.f95264g = countDownLatch;
        String a = C37381f.m83705a(str);
        C52711k.m112236a((Object) a, "RhythmMusicUtil.getRhythmMusicFilePath(musicPath)");
        this.f95265j = a;
        String b = C37381f.m83706b(str);
        C52711k.m112236a((Object) b, "RhythmMusicUtil.getMusicRhythmFileName(musicPath)");
        this.f95259b = b;
        C47723bk.m103306a(C37381f.f95373a, false);
    }
}
