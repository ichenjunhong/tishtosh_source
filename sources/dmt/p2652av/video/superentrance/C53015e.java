package dmt.p2652av.video.superentrance;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p683ss.android.socialbase.downloader.downloader.Downloader;
import com.p683ss.android.socialbase.downloader.exception.BaseException;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42469bn;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: dmt.av.video.superentrance.e */
public final class C53015e {

    /* renamed from: a */
    static String f131464a;

    /* renamed from: b */
    static final String f131465b;

    /* renamed from: c */
    static final String f131466c;

    /* renamed from: d */
    static final String f131467d;

    /* renamed from: e */
    static final String f131468e;

    /* renamed from: f */
    static C53006b f131469f = new C53006b();

    /* renamed from: g */
    public static final C53015e f131470g = new C53015e();

    /* renamed from: h */
    private static SuperEntranceConfig f131471h;

    /* renamed from: i */
    private static boolean f131472i;

    /* renamed from: dmt.av.video.superentrance.e$a */
    public static final class C53016a extends AbsDownloadListener {
        C53016a() {
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            C26890h.m65011a("super_entrance_download", C23089d.m56640a().mo47829a("download_type", "icon").mo47829a("to_status", "successful").f61491a);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            C26890h.m65011a("super_entrance_download", C23089d.m56640a().mo47829a("download_type", "icon").mo47829a("to_status", "failed").f61491a);
        }
    }

    /* renamed from: dmt.av.video.superentrance.e$b */
    public static final class C53017b implements C48705j {
        C53017b() {
        }

        /* renamed from: a */
        public final void mo8643a(Effect effect) {
            C52711k.m112240b(effect, "effect");
            C26890h.m65011a("super_entrance_download_start", C23089d.m56640a().mo47829a("download_type", "prop").f61491a);
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            Effect effect = (Effect) obj;
            C52711k.m112240b(effect, "effect");
            C53015e eVar = C53015e.f131470g;
            C53015e.f131469f.f131448a.storeString("super_entrance_effect", C39618d.f101161b.mo34889b(effect));
            C26890h.m65011a("super_entrance_download", C23089d.m56640a().mo47829a("download_type", "prop").mo47829a("to_status", "successful").f61491a);
        }

        /* renamed from: a */
        public final void mo8644a(Effect effect, C48649d dVar) {
            C52711k.m112240b(dVar, "e");
            C26890h.m65011a("super_entrance_download", C23089d.m56640a().mo47829a("download_type", "prop").mo47829a("to_status", "failed").f61491a);
        }
    }

    /* renamed from: dmt.av.video.superentrance.e$c */
    public static final class C53018c extends AbsDownloadListener {
        C53018c() {
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            C26890h.m65011a("super_entrance_download", C23089d.m56640a().mo47829a("download_type", "placeholder").mo47829a("to_status", "successful").f61491a);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            C26890h.m65011a("super_entrance_download", C23089d.m56640a().mo47829a("download_type", "placeholder").mo47829a("to_status", "failed").f61491a);
        }
    }

    /* renamed from: dmt.av.video.superentrance.e$d */
    public static final class C53019d extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ String f131473a;

        C53019d(String str) {
            this.f131473a = str;
        }

        public final void onSuccessed(DownloadInfo downloadInfo) {
            super.onSuccessed(downloadInfo);
            C26890h.m65011a("super_entrance_download", C23089d.m56640a().mo47829a("download_type", this.f131473a).mo47829a("to_status", "successful").f61491a);
        }

        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            super.onFailed(downloadInfo, baseException);
            C26890h.m65011a("super_entrance_download", C23089d.m56640a().mo47829a("download_type", this.f131473a).mo47829a("to_status", "failed").f61491a);
        }
    }

    private C53015e() {
    }

    /* renamed from: a */
    static SuperEntranceConfig m112741a() {
        if (f131472i) {
            return f131471h;
        }
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            f131471h = b.getSuperEntranceConfig();
        } catch (Exception unused) {
        }
        f131472i = true;
        return f131471h;
    }

    static {
        StringBuilder sb = new StringBuilder();
        Application application = C39618d.f101160a;
        C52711k.m112236a((Object) application, "AVEnv.application");
        sb.append(application.getFilesDir().toString());
        sb.append(File.separator);
        sb.append("superentrance");
        f131464a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f131464a);
        sb2.append(File.separator);
        sb2.append("babydemo.mp4");
        f131465b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f131464a);
        sb3.append(File.separator);
        sb3.append("loop_babydemo.mp4");
        f131466c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f131464a);
        sb4.append(File.separator);
        sb4.append("plusicon.png");
        f131467d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(f131464a);
        sb5.append(File.separator);
        sb5.append("videobackimg.png");
        f131468e = sb5.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        if (r1 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0061, code lost:
        if (r1 == null) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r4 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0085, code lost:
        if (r4 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        if (r1 == null) goto L_0x0033;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p683ss.android.ugc.aweme.feed.model.Video m112740a(boolean r4) {
        /*
            com.ss.android.ugc.aweme.feed.model.Video r0 = new com.ss.android.ugc.aweme.feed.model.Video
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r4 == 0) goto L_0x0012
            java.lang.String r2 = f131466c
            r1.add(r2)
            goto L_0x0017
        L_0x0012:
            java.lang.String r2 = f131465b
            r1.add(r2)
        L_0x0017:
            java.util.List r1 = (java.util.List) r1
            com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = new com.ss.android.ugc.aweme.feed.model.VideoUrlModel
            r2.<init>()
            r3 = 0
            r2.setH265(r3)
            r2.setUrlList(r1)
            if (r4 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = m112741a()
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = r1.getLoopVideoMd5()
            if (r1 != 0) goto L_0x0043
        L_0x0033:
            java.lang.String r1 = ""
            goto L_0x0043
        L_0x0036:
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = m112741a()
            if (r1 == 0) goto L_0x0033
            java.lang.String r1 = r1.getVideoMd5()
            if (r1 != 0) goto L_0x0043
            goto L_0x0033
        L_0x0043:
            r2.setUrlKey(r1)
            if (r4 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = m112741a()
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r1.getLoopVideoMd5()
            if (r1 != 0) goto L_0x0064
        L_0x0054:
            java.lang.String r1 = ""
            goto L_0x0064
        L_0x0057:
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r1 = m112741a()
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = r1.getVideoMd5()
            if (r1 != 0) goto L_0x0064
            goto L_0x0054
        L_0x0064:
            r2.setUri(r1)
            r0.setPlayAddr(r2)
            if (r4 == 0) goto L_0x007b
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r4 = m112741a()
            if (r4 == 0) goto L_0x0078
            java.lang.String r4 = r4.getLoopVideoMd5()
            if (r4 != 0) goto L_0x0088
        L_0x0078:
            java.lang.String r4 = ""
            goto L_0x0088
        L_0x007b:
            com.ss.android.ugc.aweme.global.config.settings.pojo.SuperEntranceConfig r4 = m112741a()
            if (r4 == 0) goto L_0x0078
            java.lang.String r4 = r4.getVideoMd5()
            if (r4 != 0) goto L_0x0088
            goto L_0x0078
        L_0x0088:
            r0.setSourceId(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dmt.p2652av.video.superentrance.C53015e.m112740a(boolean):com.ss.android.ugc.aweme.feed.model.Video");
    }

    /* renamed from: a */
    static boolean m112742a(String str, String str2) {
        if (!C50200d.m108346a(str)) {
            return true;
        }
        String a = C42469bn.m93319a(new File(str));
        CharSequence charSequence = str2;
        if (TextUtils.isEmpty(charSequence) || TextUtils.equals(a, charSequence)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo110566a(Context context, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        if (z) {
            str5 = "splash_loop";
        } else {
            str5 = "splash_once";
        }
        if (m112742a(str, str2)) {
            C26890h.m65011a("super_entrance_download_start", C23089d.m56640a().mo47829a("download_type", str5).f61491a);
            Downloader.with(context).url(str4).name(str3).savePath(f131464a).force(true).mainThreadListener(new C53019d(str5)).download();
        }
    }
}
