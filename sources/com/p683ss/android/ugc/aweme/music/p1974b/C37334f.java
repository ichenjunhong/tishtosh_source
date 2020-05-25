package com.p683ss.android.ugc.aweme.music.p1974b;

import android.content.Context;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.facebook.p987k.p988a.C14460b;
import com.p683ss.android.socialbase.downloader.depend.IDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.music.p1977e.C37378c;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1981c.C37596a;
import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.music.service.IMusicService;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVTransformService.ITransformCallback;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.p2425e.C48545a;
import com.p683ss.android.ugc.p2425e.C48557d;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.music.b.f */
public final class C37334f implements C37326b {

    /* renamed from: s */
    public static final C37335a f95270s = new C37335a(null);

    /* renamed from: b */
    public final Context f95271b;

    /* renamed from: c */
    public final String f95272c = this.f95281l.getMusicId();

    /* renamed from: d */
    final String f95273d = C37332d.m83628a(this.f95281l.getUrl());

    /* renamed from: e */
    final int f95274e;

    /* renamed from: f */
    public final String f95275f;

    /* renamed from: g */
    public final String f95276g;

    /* renamed from: h */
    public final boolean f95277h;

    /* renamed from: i */
    public int f95278i;

    /* renamed from: j */
    public IDownloadListener f95279j;

    /* renamed from: k */
    public C37333e f95280k;

    /* renamed from: l */
    public final MusicModel f95281l;

    /* renamed from: m */
    public final String f95282m;

    /* renamed from: n */
    public final C37435b f95283n;

    /* renamed from: o */
    public final CountDownLatch f95284o;

    /* renamed from: p */
    public boolean f95285p;

    /* renamed from: q */
    String f95286q;

    /* renamed from: r */
    public Map<String, Integer> f95287r;

    /* renamed from: t */
    private final boolean f95288t;

    /* renamed from: u */
    private int f95289u;

    /* renamed from: com.ss.android.ugc.aweme.music.b.f$a */
    public static final class C37335a {
        private C37335a() {
        }

        public /* synthetic */ C37335a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.b.f$b */
    public static final class C37336b extends C37325a {

        /* renamed from: a */
        final /* synthetic */ C37334f f95290a;

        C37336b(C37334f fVar) {
            this.f95290a = fVar;
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            this.f95290a.f95287r.remove(this.f95290a.f95272c);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            this.f95290a.f95287r.remove(this.f95290a.f95272c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.b.f$c */
    static final class C37337c<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37334f f95291a;

        /* renamed from: b */
        final /* synthetic */ boolean f95292b;

        C37337c(C37334f fVar, boolean z) {
            this.f95291a = fVar;
            this.f95292b = z;
        }

        public final /* synthetic */ Object call() {
            int i;
            if (this.f95291a.f95285p) {
                if (this.f95292b) {
                    i = R.string.ar9;
                } else {
                    i = R.string.cdt;
                }
                if (!C37341g.m83638a(this.f95291a.f95271b)) {
                    i = R.string.cg1;
                }
                C10691a.m21542b(this.f95291a.f95271b, i).mo19066a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.b.f$d */
    public static final class C37338d extends C37325a {

        /* renamed from: a */
        final /* synthetic */ C37334f f95293a;

        /* renamed from: com.ss.android.ugc.aweme.music.b.f$d$a */
        public static final class C37339a implements IGetInfoCallback<Integer> {

            /* renamed from: a */
            final /* synthetic */ C37338d f95294a;

            /* renamed from: b */
            final /* synthetic */ DownloadInfo f95295b;

            /* renamed from: c */
            final /* synthetic */ long f95296c;

            /* renamed from: com.ss.android.ugc.aweme.music.b.f$d$a$a */
            public static final class C37340a implements ITransformCallback<MusicWaveBean> {

                /* renamed from: a */
                final /* synthetic */ C37339a f95297a;

                C37340a(C37339a aVar) {
                    this.f95297a = aVar;
                }

                public final /* synthetic */ void finish(Object obj) {
                    MusicWaveBean musicWaveBean = (MusicWaveBean) obj;
                    CountDownLatch countDownLatch = this.f95297a.f95294a.f95293a.f95284o;
                    if (countDownLatch != null) {
                        try {
                            Boolean.valueOf(countDownLatch.await(1500, TimeUnit.MILLISECONDS));
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder("Download Music, countDownLatch await error: ");
                            sb.append(e);
                            C45407ay.m98971b(sb.toString());
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("Download Music get wave data duration: ");
                    sb2.append(System.currentTimeMillis() - this.f95297a.f95296c);
                    sb2.append(" currentTime: ");
                    sb2.append(System.currentTimeMillis());
                    C45407ay.m98968a(sb2.toString());
                    if (this.f95297a.f95294a.f95293a.f95277h) {
                        this.f95297a.f95294a.f95293a.f95283n.mo55351a(100);
                    }
                    this.f95297a.f95294a.f95293a.f95283n.mo55353a(this.f95297a.f95294a.f95293a.f95276g, musicWaveBean);
                }
            }

            public final /* synthetic */ void finish(Object obj) {
                double d;
                int intValue = ((Number) obj).intValue();
                if (intValue < 0) {
                    this.f95294a.f95293a.mo76639a(false);
                    this.f95294a.f95293a.mo76638a(Integer.valueOf(-2), "", this.f95295b.getConnectionUrl(), intValue, this.f95295b.getTotalBytes(), C47723bk.m103316d(this.f95294a.f95293a.f95276g));
                    this.f95294a.f95293a.f95283n.mo55352a(this.f95294a.f95293a.mo76637a(Integer.valueOf(-2)));
                    return;
                }
                C37334f fVar = this.f95294a.f95293a;
                String connectionUrl = this.f95295b.getConnectionUrl();
                long downloadTime = this.f95295b.getDownloadTime();
                long totalBytes = this.f95295b.getTotalBytes();
                String str = fVar.f95273d;
                int i = fVar.f95274e;
                if (downloadTime == 0) {
                    d = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
                } else {
                    d = (double) (totalBytes / downloadTime);
                }
                C23569o.m57776a("aweme_music_download_error_rate", 0, C23088c.m56631a().mo47823a("duration", Long.valueOf(downloadTime)).mo47822a("downloadStrategy", Integer.valueOf(MusicService.createIMusicServicebyMonsterPlugin().getDownloadStrategy())).mo47820a("speed", Double.valueOf(d)).mo47823a("size", Long.valueOf(totalBytes)).mo47824a("fileUri", connectionUrl).mo47824a("fileUrlList", str).mo47824a("hostname", C37378c.m83702b(connectionUrl)).mo47822a("source_platform", Integer.valueOf(i)).mo47825b());
                String str2 = fVar.f95272c;
                String str3 = fVar.f95286q;
                String str4 = fVar.f95273d;
                Long valueOf = Long.valueOf(downloadTime);
                Long valueOf2 = Long.valueOf(totalBytes);
                IMusicService createIMusicServicebyMonsterPlugin = MusicService.createIMusicServicebyMonsterPlugin();
                C52711k.m112236a((Object) createIMusicServicebyMonsterPlugin, "ServiceManager.get().get…MusicService::class.java)");
                C26890h.m65011a("download_music_succeed", new C23089d().mo47829a("music_id", str2).mo47829a("enter_from", str3).mo47829a("url", str4).mo47828a("time", (Object) valueOf).mo47828a("size", (Object) valueOf2).mo47826a("download_strategy", createIMusicServicebyMonsterPlugin.getDownloadStrategy()).f61491a);
                StringBuilder sb = new StringBuilder();
                sb.append(fVar.f95286q);
                sb.append(", MusicDownloadSuccess: musicId=");
                sb.append(fVar.f95272c);
                sb.append(',');
                sb.append(" url=");
                sb.append(fVar.f95273d);
                sb.append(',');
                sb.append(" curUrl=");
                sb.append(connectionUrl);
                sb.append(" musicSource=");
                sb.append(fVar.f95274e);
                C32458a.m75144a(sb.toString());
                AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().transformService().audio2wavebean(this.f95294a.f95293a.f95276g, new C37340a(this));
            }

            C37339a(C37338d dVar, DownloadInfo downloadInfo, long j) {
                this.f95294a = dVar;
                this.f95295b = downloadInfo;
                this.f95296c = j;
            }
        }

        public C37338d(C37334f fVar) {
            this.f95293a = fVar;
        }

        public final void onStart(DownloadInfo downloadInfo) {
            super.onStart(downloadInfo);
            C37333e eVar = this.f95293a.f95280k;
            if (eVar != null) {
                eVar.mo76636a(this.f95293a);
            }
            StringBuilder sb = new StringBuilder("Download Music start, id: ");
            sb.append(this.f95293a.f95272c);
            sb.append(" time: ");
            sb.append(System.currentTimeMillis());
            C45407ay.m98968a(sb.toString());
        }

        public final void onProgress(DownloadInfo downloadInfo) {
            super.onProgress(downloadInfo);
            if (downloadInfo != null && downloadInfo.getTotalBytes() > 0) {
                int curBytes = (int) ((downloadInfo.getCurBytes() * 100) / downloadInfo.getTotalBytes());
                if (this.f95293a.f95277h) {
                    if (curBytes > 99) {
                        this.f95293a.f95283n.mo55351a(99);
                    } else {
                        this.f95293a.f95283n.mo55351a(curBytes);
                    }
                    return;
                }
                this.f95293a.f95283n.mo55351a(curBytes);
            }
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            if (downloadInfo != null) {
                this.f95293a.f95287r.remove(this.f95293a.f95272c);
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("Download Music onsuccess, id: ");
                sb.append(this.f95293a.f95272c);
                sb.append(" time: ");
                sb.append(currentTimeMillis);
                sb.append(" duration: ");
                sb.append(downloadInfo.getDownloadTime());
                C45407ay.m98968a(sb.toString());
                if (!C48016e.m103944b(this.f95293a.f95276g)) {
                    this.f95293a.mo76639a(false);
                    C37334f.m83633a(this.f95293a, Integer.valueOf(1063), "file not exist", null, 0, 0, null, 60, null);
                    this.f95293a.f95283n.mo55352a(this.f95293a.mo76637a(Integer.valueOf(1063)));
                }
                AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().infoService().audioLegal(this.f95293a.f95276g, (IGetInfoCallback<Integer>) new C37339a<Integer>(this, downloadInfo, currentTimeMillis));
            }
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            boolean z;
            Integer num;
            String str;
            String str2;
            super.onFailed(downloadInfo, baseException);
            this.f95293a.f95287r.remove(this.f95293a.f95272c);
            C37334f fVar = this.f95293a;
            if (baseException == null || !(baseException.getErrorCode() == 1006 || baseException.getErrorCode() == 1007)) {
                z = false;
            } else {
                z = true;
            }
            fVar.mo76639a(z);
            C37334f fVar2 = this.f95293a;
            Integer num2 = null;
            if (baseException != null) {
                num = Integer.valueOf(baseException.getErrorCode());
            } else {
                num = null;
            }
            if (baseException != null) {
                str = baseException.getErrorMessage();
            } else {
                str = null;
            }
            if (downloadInfo != null) {
                str2 = downloadInfo.getConnectionUrl();
            } else {
                str2 = null;
            }
            C37334f.m83633a(fVar2, num, str, str2, 0, 0, null, 56, null);
            C37435b bVar = this.f95293a.f95283n;
            C37334f fVar3 = this.f95293a;
            if (baseException != null) {
                num2 = Integer.valueOf(baseException.getErrorCode());
            }
            bVar.mo55352a(fVar3.mo76637a(num2));
        }
    }

    /* renamed from: a */
    public final void mo76634a() {
        Downloader.getInstance(this.f95271b).removeSubThreadListener(this.f95278i, this.f95279j);
        Downloader.getInstance(this.f95271b).addSubThreadListener(this.f95278i, new C37336b(this));
        this.f95283n.mo55350a();
        this.f95280k = null;
    }

    /* renamed from: a */
    public final void mo76639a(boolean z) {
        C0013i.m18a((Callable<TResult>) new C37337c<TResult>(this, z), C0013i.f25b);
    }

    /* renamed from: a */
    public final C48545a mo76637a(Integer num) {
        int i;
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        return new C48545a(i, this.f95271b.getString(R.string.cdt));
    }

    /* renamed from: a */
    public final void mo76638a(Integer num, String str, String str2, int i, long j, String str3) {
        int i2;
        Integer num2 = num;
        String str4 = str;
        String str5 = str2;
        Context context = this.f95271b;
        if (num2 != null) {
            i2 = num.intValue();
        } else {
            i2 = -1;
        }
        String str6 = this.f95272c;
        String str7 = this.f95273d;
        int i3 = this.f95274e;
        String str8 = this.f95286q;
        boolean a = C37596a.m84035a(context);
        if (a) {
            C23569o.m57776a("aweme_music_download_error_rate", i2, C23088c.m56631a().mo47824a("fileUri", str5).mo47824a("hostname", C37378c.m83702b(str2)).mo47824a("trace", str8).mo47822a("source_platform", Integer.valueOf(i3)).mo47824a("music_id", str6).mo47824a("fileUrlList", str7).mo47822a("downloadStrategy", Integer.valueOf(MusicService.createIMusicServicebyMonsterPlugin().getDownloadStrategy())).mo47824a("fileMagic", str3).mo47824a("code", String.valueOf(i)).mo47823a("size", Long.valueOf(j)).mo47825b());
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("netWorkQuality", C14460b.m29586a().mo26625b().toString());
            jSONObject.put("netWorkSpeed", (int) C14460b.m29586a().mo26626c());
            jSONObject.put("errorDesc", str4);
            jSONObject.put("errorUrl", str5);
            jSONObject.put("is_network_available", a);
            C23569o.m57783b("aweme_music_download_log", "aweme_music", jSONObject);
        } catch (Exception unused) {
        }
        String str9 = this.f95272c;
        String str10 = this.f95286q;
        String str11 = this.f95273d;
        C14460b a2 = C14460b.m29586a();
        C52711k.m112236a((Object) a2, "ConnectionClassManager.getInstance()");
        int c = (int) a2.mo26626c();
        IMusicService createIMusicServicebyMonsterPlugin = MusicService.createIMusicServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIMusicServicebyMonsterPlugin, "ServiceManager.get().get…MusicService::class.java)");
        C26890h.m65011a("download_music_failed", new C23089d().mo47829a("music_id", str9).mo47829a("enter_from", str10).mo47829a("url", str11).mo47826a("download_strategy", createIMusicServicebyMonsterPlugin.getDownloadStrategy()).mo47829a("fail_reason", str4).mo47826a("net_speed", c).f61491a);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f95286q);
        sb.append(", MusicDownloadError: errocode=");
        sb.append(num);
        sb.append("errorMsg=");
        sb.append(str4);
        sb.append("musicId=");
        sb.append(this.f95272c);
        sb.append(',');
        sb.append(" url=");
        sb.append(this.f95273d);
        sb.append(',');
        sb.append(" curUrl=");
        sb.append(str5);
        sb.append(" musicSource=");
        sb.append(this.f95274e);
        C32458a.m75144a(sb.toString());
    }

    /* renamed from: a */
    static /* synthetic */ void m83633a(C37334f fVar, Integer num, String str, String str2, int i, long j, String str3, int i2, Object obj) {
        String str4;
        String str5;
        if ((i2 & 4) != 0) {
            str4 = "";
        } else {
            str4 = str2;
        }
        if ((i2 & 32) != 0) {
            str5 = "";
        } else {
            str5 = str3;
        }
        fVar.mo76638a(num, str, str4, 0, 0, str5);
    }

    public C37334f(Context context, MusicModel musicModel, String str, C37435b bVar, CountDownLatch countDownLatch, boolean z, boolean z2, String str2, int i, Map<String, Integer> map) {
        int i2;
        String str3;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(musicModel, "musicModel");
        C52711k.m112240b(str, "musicName");
        C52711k.m112240b(bVar, "downloadListener");
        C52711k.m112240b(map, "musicTaskMap");
        this.f95281l = musicModel;
        this.f95282m = str;
        this.f95283n = bVar;
        this.f95284o = countDownLatch;
        this.f95288t = z;
        this.f95285p = z2;
        this.f95286q = str2;
        this.f95289u = i;
        this.f95287r = map;
        this.f95271b = context.getApplicationContext();
        Music music = this.f95281l.getMusic();
        if (music != null) {
            i2 = music.getSource();
        } else {
            i2 = -1;
        }
        this.f95274e = i2;
        C48557d a = C48557d.m105031a();
        C52711k.m112236a((Object) a, "MusicProviderConfig.getInstance()");
        this.f95275f = a.mo96062b();
        String str4 = this.f95275f;
        C52711k.m112236a((Object) str4, "saveDir");
        boolean z3 = false;
        if (C52830p.m112413c(str4, "/", false, 2, null)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f95275f);
            sb.append(this.f95282m);
            str3 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f95275f);
            sb2.append(File.separator);
            sb2.append(this.f95282m);
            str3 = sb2.toString();
        }
        this.f95276g = str3;
        if (this.f95288t || this.f95284o != null) {
            z3 = true;
        }
        this.f95277h = z3;
        this.f95278i = -1;
    }
}
