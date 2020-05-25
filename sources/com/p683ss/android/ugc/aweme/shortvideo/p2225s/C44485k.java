package com.p683ss.android.ugc.aweme.shortvideo.p2225s;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.p030v4.p040os.C0958a;
import android.util.Log;
import com.C2240a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.common.p920d.C13696m;
import com.google.p1057b.p1058a.C17429o;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.google.p1057b.p1065h.p1066a.C17833n;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.p1415f.C23528a;
import com.p683ss.android.ugc.aweme.beauty.C23778b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1259ac.C20853a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.photo.publish.C38704c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C42402ab;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C42470bo;
import com.p683ss.android.ugc.aweme.shortvideo.C42477bv;
import com.p683ss.android.ugc.aweme.shortvideo.C43210dd;
import com.p683ss.android.ugc.aweme.shortvideo.C43211de;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43218dl;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.C43848fq;
import com.p683ss.android.ugc.aweme.shortvideo.C43855fx;
import com.p683ss.android.ugc.aweme.shortvideo.C43856fy;
import com.p683ss.android.ugc.aweme.shortvideo.C43907k;
import com.p683ss.android.ugc.aweme.shortvideo.C44334o;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45241aa;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45315r;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45318u;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45321x.C45322a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45419be;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.aweme.utils.C47894fo;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import dmt.p2652av.video.C52928al;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.k */
public final class C44485k implements C44481g {

    /* renamed from: A */
    private long f112508A = 0;

    /* renamed from: B */
    private double f112509B;

    /* renamed from: C */
    private String f112510C;

    /* renamed from: D */
    private String f112511D;

    /* renamed from: a */
    public C45315r f112512a;

    /* renamed from: b */
    int f112513b;

    /* renamed from: c */
    int f112514c;

    /* renamed from: d */
    C43210dd f112515d = new C43210dd();

    /* renamed from: e */
    public final C43907k f112516e;

    /* renamed from: f */
    public SynthetiseResult f112517f;

    /* renamed from: g */
    public C0958a f112518g;

    /* renamed from: h */
    C43211de<VideoCreation> f112519h;

    /* renamed from: i */
    public final C44495c f112520i;

    /* renamed from: j */
    public final C43218dl f112521j;

    /* renamed from: k */
    public boolean f112522k = false;

    /* renamed from: l */
    public long f112523l = 0;

    /* renamed from: m */
    public long f112524m = 0;

    /* renamed from: n */
    public long f112525n = 0;

    /* renamed from: o */
    public long f112526o = 0;

    /* renamed from: p */
    public long f112527p = 0;

    /* renamed from: q */
    public boolean f112528q;

    /* renamed from: r */
    public boolean f112529r;

    /* renamed from: s */
    public C43848fq f112530s;

    /* renamed from: t */
    ExecutorService f112531t;

    /* renamed from: u */
    public String f112532u;

    /* renamed from: v */
    public boolean f112533v;

    /* renamed from: w */
    public int f112534w;

    /* renamed from: x */
    private String f112535x;

    /* renamed from: y */
    private C43211de<SynthetiseResult> f112536y;

    /* renamed from: z */
    private C17832m<VideoCreation> f112537z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.s.k$a */
    static class C44493a {

        /* renamed from: a */
        C17429o f112558a;

        C44493a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90387a() {
            this.f112558a = C17429o.m42676b(C47894fo.f120488a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.s.k$b */
    static class C44494b {

        /* renamed from: a */
        C17429o f112559a;

        C44494b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90388a() {
            this.f112559a = C17429o.m42676b(C47894fo.f120488a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.s.k$c */
    class C44495c {

        /* renamed from: a */
        C43907k f112560a;

        /* renamed from: b */
        int f112561b;

        /* renamed from: c */
        String f112562c;

        /* renamed from: d */
        int f112563d;

        /* renamed from: e */
        long f112564e;

        /* renamed from: f */
        C17429o f112565f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90389a(boolean z) {
            C50203g.m108358a("PublishDurationMonitor LOG_START");
            this.f112565f = C17429o.m42676b(C47894fo.f120488a);
            this.f112564e = SystemClock.uptimeMillis();
            C26890h.m65011a("click_publish_button", new C23089d().mo47826a("compose_finish", z ? 1 : 0).f61491a);
        }

        C44495c(C43907k kVar, int i, String str, int i2) {
            this.f112560a = kVar;
            this.f112561b = i;
            this.f112562c = str;
            this.f112563d = i2;
        }
    }

    /* renamed from: a */
    public static boolean m97338a(int i) {
        return i == 1;
    }

    public final String toString() {
        return "PublisherImpl2";
    }

    /* renamed from: a */
    public final void mo90380a(boolean z, Throwable th, String str, Object obj, SynthetiseResult synthetiseResult) {
        String str2;
        String str3;
        int i;
        Throwable th2 = th;
        SynthetiseResult synthetiseResult2 = synthetiseResult;
        this.f112524m = SystemClock.uptimeMillis();
        long j = 0;
        this.f112508A = this.f112508A > 0 ? C47894fo.f120488a.mo33765a() - this.f112508A : 0;
        double d = (double) this.f112508A;
        Double.isNaN(d);
        String a = C2240a.m6773a(Locale.US, "%d", new Object[]{Integer.valueOf((int) (d / 1000000.0d))});
        StringBuilder sb = new StringBuilder();
        sb.append(z ? 1 : 0);
        C23089d a2 = C23089d.m56640a().mo47829a("duration", a).mo47829a("status", sb.toString());
        String str4 = "is_hardcode";
        String str5 = C40797m.m90243a() ? "1" : "0";
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C40797m.m90249d());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(C40797m.m90251f());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f112509B);
        C23089d a3 = a2.mo47829a(str4, str5).mo47829a("bite_rate", sb2.toString()).mo47829a("video_quality", sb3.toString()).mo47829a("_perf_monitor", "1").mo47829a("fps", sb4.toString()).mo47829a("publish_id", this.f112532u).mo47829a("current_page", str);
        String str6 = "fail_info";
        if (th2 == null) {
            str2 = null;
        } else {
            str2 = th.toString();
        }
        a3.mo47829a(str6, str2);
        if (th2 instanceof C43809fd) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(((C43809fd) th2).getCode());
            a3.mo47829a("error_code", sb5.toString());
        }
        if (C38704c.m86061b(this.f112513b)) {
            String str7 = "";
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (C48016e.m103944b(videoPublishEditModel.mOutputFile)) {
                j = new File(videoPublishEditModel.mOutputFile).length();
                if (synthetiseResult2 == null || synthetiseResult2.outputVideoFileInfo == null) {
                    str3 = str7;
                    i = C52928al.m112615d(videoPublishEditModel.mOutputFile);
                } else {
                    i = synthetiseResult2.outputVideoFileInfo.getBitrate();
                    str3 = synthetiseResult2.outputVideoFileInfo.getResolution();
                }
            } else {
                str3 = str7;
                i = 0;
            }
            this.f112528q = videoPublishEditModel.isSyntheticHardEncode;
            a3.mo47829a("compose_coding", videoPublishEditModel.isSyntheticHardEncode ? "hardcoding" : "softcoding").mo47826a("file_bitrate", i).mo47829a("resolution", str3).mo47829a("file_size", C2240a.m6773a(Locale.US, "%d", new Object[]{Long.valueOf(j / 1024)}));
            if (C48016e.m103944b(videoPublishEditModel.getLocalTempPath())) {
                j += new File(videoPublishEditModel.getLocalTempPath()).length();
            }
            if (C48016e.m103944b(videoPublishEditModel.getLocalFinalPath())) {
                j += new File(videoPublishEditModel.getLocalFinalPath()).length();
            }
            C45318u.m98795a(this.f112510C, j);
            C45322a a4 = C45318u.m98793a();
            if (a4 != null) {
                a3.mo47826a("init_available_size_mb", (int) a4.f114587a).mo47826a("max_publish_usage_mb", (int) a4.f114588b).mo47829a("available_size_detail", a4.f114589c);
            }
            StringBuilder sb6 = new StringBuilder();
            sb6.append(videoPublishEditModel.mWatermarkVideoWidth);
            sb6.append("*");
            sb6.append(videoPublishEditModel.mWatermarkVideoHeight);
            a3.mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("filter_id_list", videoPublishEditModel.mCurFilterIds).mo47829a("effect_list", videoPublishEditModel.getEditEffectList()).mo47829a("info_sticker_list", videoPublishEditModel.getInfoStickerList()).mo47829a("prop_list", videoPublishEditModel.mStickerID).mo47828a("beautify_used", (Object) Boolean.valueOf(videoPublishEditModel.faceBeautyOpen)).mo47829a("beautify_info", C23778b.m58351a()).mo47829a("watermark_resolution", sb6.toString()).mo47829a("content_type", C43855fx.m96289b(videoPublishEditModel)).mo47829a("content_source", C43855fx.m96288a(videoPublishEditModel));
        }
        C26890h.m65011a("video_compose_end", a3.f61491a);
        StringBuilder sb7 = new StringBuilder("uploadSynthetiseEndEvent: ");
        sb7.append(a);
        C50203g.m108363d(sb7.toString());
    }

    /* renamed from: a */
    public final void mo90379a(boolean z, String str) {
        this.f112526o = SystemClock.uptimeMillis();
        if (!m97338a(this.f112514c)) {
            this.f112530s.mo89388a(z, str, null, true);
        }
    }

    /* renamed from: a */
    public final void mo90378a(boolean z, C23088c cVar) {
        try {
            String stackTraceString = Log.getStackTraceString(new Exception());
            C20853a.f56796a.mo48687a("upload_video_end");
            C23528a aVar = C20853a.f56796a;
            StringBuilder sb = new StringBuilder("upload_video_end");
            sb.append(z ? "_success" : "_failure");
            aVar.mo48687a(sb.toString());
            C23569o.m57779a("aweme_upload_video_funnel", m97335a(cVar).mo47824a("type", "upload_video_end").mo47822a("status", Integer.valueOf(z ^ true ? 1 : 0)).mo47824a("extra", C20853a.f56796a.mo48688a()).mo47824a("stack_trace", stackTraceString).mo47825b());
            mo90377a("upload_video_end", stackTraceString);
        } catch (Exception e) {
            m97337a((Throwable) e);
        }
    }

    /* renamed from: d */
    private void m97339d() {
        this.f112516e.mo78617a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C23088c mo90381b() {
        return m97335a((C23088c) null);
    }

    /* renamed from: c */
    public final void mo90360c() {
        if (this.f112531t == null || this.f112531t.isShutdown()) {
            mo90375a();
        } else {
            this.f112531t.execute(new C44500p(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo90375a() {
        boolean h = C43214dh.m94817a().mo87858h();
        StringBuilder sb = new StringBuilder("Publisher cancelSynthetise publishing:");
        sb.append(h);
        C50203g.m108363d(sb.toString());
        if (h) {
            C26890h.m65011a("user_cancel_publish", C23089d.m56640a().mo47829a("publish_id", this.f112532u).mo47826a("video_type", this.f112513b).mo47826a("video_upload_type", this.f112514c).mo47829a("cancel_step", "user").f61491a);
            this.f112518g.mo2941b();
            C43214dh.m94817a().mo87849a(10);
        }
    }

    /* renamed from: b */
    public final Bitmap mo90356b(Object obj) {
        return this.f112516e.mo78619c(obj);
    }

    /* renamed from: a */
    public final void mo90353a(Object obj) {
        if (this.f112531t != null) {
            this.f112531t.execute(new C44497m(this, obj));
        } else {
            mo90384d(obj);
        }
    }

    /* renamed from: a */
    private C23088c m97335a(C23088c cVar) {
        if (cVar == null) {
            cVar = new C23088c();
        }
        cVar.mo47822a("video_type", Integer.valueOf(this.f112513b)).mo47824a("item_type", this.f112516e.getClass().getSimpleName());
        return cVar;
    }

    /* renamed from: c */
    public final void mo90362c(Object obj) {
        if (this.f112531t != null) {
            this.f112531t.execute(new C44498n(this, obj));
        } else {
            mo90385e(obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo90385e(Object obj) {
        this.f112521j.mo87871a("startPublish()::fast publish for review video");
        this.f112522k = true;
        this.f112520i.mo90389a(false);
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
        if (videoPublishEditModel.isSaveLocalWithWaterMark()) {
            m97336a(obj, 0, true);
            return;
        }
        this.f112517f = new SynthetiseResult();
        VideoCreation videoCreation = new VideoCreation();
        videoCreation.setMaterialId(videoPublishEditModel.reviewVideoId);
        mo90376a(obj, videoCreation);
    }

    /* renamed from: a */
    public static void m97337a(Throwable th) {
        try {
            C23569o.m57779a("aweme_upload_video_funnel", new C23088c().mo47824a("type", "pure_exception").mo47824a("exception", Log.getStackTraceString(th)).mo47825b());
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo90384d(final Object obj) {
        Executor executor;
        this.f112516e.f111186c = 0;
        this.f112521j.mo87871a("startPublish()");
        C47858ep.m103527f(this.f112532u);
        m97339d();
        this.f112522k = true;
        if (this.f112536y == null) {
            this.f112521j.mo87871a("startPublish() synthetise()");
            m97336a(obj, 0, false);
            this.f112520i.mo90389a(false);
            return;
        }
        boolean isDone = this.f112536y.isDone();
        if (isDone) {
            this.f112521j.mo87871a("synthetise() already done");
        } else {
            this.f112521j.mo87871a("synthetise() not finished.");
        }
        this.f112520i.mo90389a(isDone);
        C43211de<SynthetiseResult> deVar = this.f112536y;
        C444861 r1 = new C17824h<SynthetiseResult>() {
            public final void onFailure(Throwable th) {
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                if (!C44485k.this.f112518g.mo2940a()) {
                    if (!(C44485k.this.f112512a == null || synthetiseResult.outputFile == null)) {
                        C44485k.this.f112512a.onSynthetiseSuccess(synthetiseResult.outputFile);
                    }
                    C44485k.this.mo90383c(obj, 0);
                }
            }
        };
        if (this.f112531t == null) {
            executor = C23551l.f62672a;
        } else {
            executor = this.f112531t;
        }
        C17825i.m43740a(deVar, r1, executor);
    }

    /* renamed from: f */
    private void m97340f(Object obj) {
        String str;
        String str2;
        this.f112523l = SystemClock.uptimeMillis();
        int a = C44482h.m97318a(C11010c.m22280a());
        String str3 = "video_compose_start";
        C23089d a2 = C23089d.m56640a();
        String str4 = "resolution";
        if (C38704c.m86061b(this.f112513b)) {
            str = ((VideoPublishEditModel) obj).getVideoResolution();
        } else if ("upload".equals(this.f112511D)) {
            str = C40797m.m90253h();
        } else {
            str = C40797m.m90252g();
        }
        C23089d a3 = a2.mo47829a(str4, str);
        String str5 = "is_hardcode";
        if (C40797m.m90243a()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C40797m.m90249d());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C40797m.m90251f());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f112509B);
        C26890h.m65011a(str3, a3.mo47829a(str5, str2).mo47829a("bite_rate", sb.toString()).mo47829a("video_quality", sb2.toString()).mo47829a("_perf_monitor", "1").mo47829a("publish_id", this.f112532u).mo47826a("pre_publish_type", this.f112534w).mo47826a("total_available_memory_mb", C44482h.m97315a(a)).mo47826a("total_memory_mb", a).mo47826a("jvm_allow_memory_mb", C44482h.m97314a()).mo47826a("jvm_available_memory_mb", C44482h.m97321b()).mo47829a("fps", sb3.toString()).f61491a);
        this.f112508A = C47894fo.f120488a.mo33765a();
        C50203g.m108363d("Publisher uploadSynthetiseStartEvent");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo90382b(Object obj, int i) {
        this.f112516e.f111186c = i;
        C43218dl dlVar = this.f112521j;
        StringBuilder sb = new StringBuilder("prePublish() publishType:");
        sb.append(i);
        dlVar.mo87871a(sb.toString());
        if (this.f112536y == null) {
            m97336a(obj, i, false);
        }
        mo90383c(obj, i);
    }

    /* renamed from: c */
    public final void mo90383c(final Object obj, final int i) {
        Executor executor;
        Executor executor2;
        String str;
        if (this.f112537z == null) {
            this.f112537z = this.f112516e.mo78613a(obj, this.f112517f);
            if (this.f112537z == null) {
                StringBuilder sb = new StringBuilder("publish_illegal_parallel Type:");
                sb.append(this.f112513b);
                sb.append(" UploadType:");
                sb.append(this.f112514c);
                sb.append(" impl_type:2");
                C50203g.m108361b(sb.toString());
                C23569o.m57779a("publish_illegal_parallel", new C23088c().mo47822a("type", Integer.valueOf(this.f112513b)).mo47822a("upload_type", Integer.valueOf(this.f112514c)).mo47822a("impl_type", Integer.valueOf(2)).mo47825b());
                return;
            }
            C43218dl dlVar = this.f112521j;
            StringBuilder sb2 = new StringBuilder("createVideo() synthetiseResult = ");
            sb2.append(this.f112517f);
            dlVar.mo87871a(sb2.toString());
            final C44494b bVar = new C44494b();
            bVar.mo90388a();
            C17832m<VideoCreation> mVar = this.f112537z;
            C444883 r3 = new C17824h<VideoCreation>() {
                public final void onFailure(Throwable th) {
                    C47858ep.m103509a(C44485k.this.f112532u, C42477bv.m93327a(th), C42477bv.m93328b(th));
                    C44485k.this.f112521j.mo87871a("create video failed.");
                    C43214dh.m94817a().mo87849a(9);
                    if (C44485k.this.f112512a != null) {
                        C44485k.this.f112512a.onError(new C43856fy(th));
                    }
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    C47858ep.m103525d(C44485k.this.f112532u, C45419be.m98988a((VideoCreation) obj));
                    C44494b bVar = bVar;
                    if (bVar.f112559a.f48964a) {
                        bVar.f112559a.mo33756d();
                        C26890h.m65011a("get_video_key", C23089d.m56640a().mo47829a("duration", C2240a.m6773a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) bVar.f112559a.mo33754a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f61491a);
                    }
                    C44485k.this.f112521j.mo87871a("create video finished.");
                }
            };
            if (this.f112531t == null) {
                executor2 = C23551l.f62672a;
            } else {
                executor2 = this.f112531t;
            }
            C17825i.m43740a(mVar, r3, executor2);
            String str2 = "publish_start";
            C23089d a = C23089d.m56640a().mo47829a("shoot_entrance", this.f112535x);
            String str3 = "is_photo";
            if (this.f112513b == 5) {
                str = "1";
            } else {
                str = "0";
            }
            C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
        }
        C17832m<VideoCreation> mVar2 = this.f112537z;
        C444894 r2 = new C17824h<VideoCreation>() {
            public final void onFailure(Throwable th) {
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                boolean z;
                Executor executor;
                Executor executor2;
                VideoCreation videoCreation = (VideoCreation) obj;
                if (i != 1) {
                    C44485k kVar = C44485k.this;
                    Object obj2 = obj;
                    if (i != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (kVar.f112519h == null) {
                        C43218dl dlVar = kVar.f112521j;
                        StringBuilder sb = new StringBuilder("uploadVideo() synthetiseResult = ");
                        sb.append(kVar.f112517f);
                        dlVar.mo87871a(sb.toString());
                        kVar.f112525n = SystemClock.uptimeMillis();
                        if (!C44485k.m97338a(kVar.f112514c)) {
                            kVar.f112530s = new C43848fq(obj2, kVar.f112516e, kVar.f112513b, null);
                            kVar.f112530s.mo89387a(true);
                            try {
                                String stackTraceString = Log.getStackTraceString(new Exception());
                                C20853a.f56796a.mo48687a("upload_video_start");
                                C23569o.m57779a("aweme_upload_video_funnel", kVar.mo90381b().mo47824a("type", "upload_video_start").mo47824a("extra", C20853a.f56796a.mo48688a()).mo47824a("stack_trace", stackTraceString).mo47825b());
                                kVar.mo90377a("upload_video_start", stackTraceString);
                            } catch (Exception e) {
                                C44485k.m97337a((Throwable) e);
                            }
                        }
                        kVar.f112519h = kVar.f112516e.mo78616a(obj2, videoCreation);
                        C43211de<VideoCreation> deVar = kVar.f112519h;
                        C444905 r4 = new C17824h<VideoCreation>(obj2, videoCreation) {

                            /* renamed from: a */
                            final /* synthetic */ Object f112549a;

                            /* renamed from: b */
                            final /* synthetic */ VideoCreation f112550b;

                            public final void onFailure(Throwable th) {
                                String str;
                                int resolveErrorCode = C45241aa.resolveErrorCode(th);
                                String str2 = C44485k.this.f112532u;
                                if (th == null || th.getMessage() == null) {
                                    str = "";
                                } else {
                                    str = th.getMessage();
                                }
                                C47858ep.m103518b(str2, resolveErrorCode, str);
                                try {
                                    C44485k.this.mo90378a(false, new C23088c().mo47824a("throwable", Log.getStackTraceString(th)).mo47824a("args", C39618d.f101161b.mo34889b(this.f112549a)).mo47824a("result", C39618d.f101161b.mo34889b(this.f112550b)));
                                } catch (Exception e) {
                                    C44485k.m97337a((Throwable) e);
                                }
                                C43214dh.m94817a().mo87849a(9);
                                C44485k.this.mo90379a(false, th.toString());
                                if (C44485k.this.f112512a != null) {
                                    C44485k.this.f112512a.onError(new C43856fy(th, C45241aa.isUserNetworkBad(resolveErrorCode)));
                                }
                            }

                            public final /* synthetic */ void onSuccess(Object obj) {
                                VideoCreation videoCreation = (VideoCreation) obj;
                                C47858ep.m103524d(C44485k.this.f112532u);
                                try {
                                    C44485k.this.mo90378a(true, new C23088c().mo47824a("resultCode", C39618d.f101161b.mo34889b(videoCreation)).mo47824a("args", C39618d.f101161b.mo34889b(this.f112549a)).mo47824a("result", C39618d.f101161b.mo34889b(this.f112550b)));
                                } catch (Exception e) {
                                    C44485k.m97337a((Throwable) e);
                                }
                                C44485k.this.mo90379a(true, "");
                            }

                            {
                                this.f112549a = r2;
                                this.f112550b = r3;
                            }
                        };
                        if (kVar.f112531t == null) {
                            executor2 = C23551l.f62672a;
                        } else {
                            executor2 = kVar.f112531t;
                        }
                        C17825i.m43740a(deVar, r4, executor2);
                    }
                    if (!z) {
                        C43211de<VideoCreation> deVar2 = kVar.f112519h;
                        C444916 r1 = new C17824h<VideoCreation>(obj2) {

                            /* renamed from: a */
                            final /* synthetic */ Object f112552a;

                            public final void onFailure(Throwable th) {
                            }

                            public final /* synthetic */ void onSuccess(Object obj) {
                                C44485k.this.mo90376a(this.f112552a, (VideoCreation) obj);
                            }

                            {
                                this.f112552a = r2;
                            }
                        };
                        if (kVar.f112531t == null) {
                            executor = C23551l.f62672a;
                        } else {
                            executor = kVar.f112531t;
                        }
                        C17825i.m43740a(deVar2, r1, executor);
                        kVar.f112519h.mo87843b(new C44501q(kVar), C23551l.f62672a);
                    }
                }
            }
        };
        if (this.f112531t == null) {
            executor = C23551l.f62672a;
        } else {
            executor = this.f112531t;
        }
        C17825i.m43740a(mVar2, r2, executor);
        if (i == 0) {
            this.f112529r = this.f112516e.mo78774d(obj);
            if (this.f112512a != null) {
                this.f112512a.onProgressUpdate(this.f112515d.mo87841a(2, 0), false);
            }
        }
    }

    /* renamed from: a */
    public final void mo90354a(Object obj, int i) {
        if (this.f112531t != null) {
            this.f112531t.execute(new C44496l(this, obj, i));
        } else {
            mo90382b(obj, i);
        }
    }

    /* renamed from: a */
    public final void mo90376a(final Object obj, final VideoCreation videoCreation) {
        Executor executor;
        C43218dl dlVar = this.f112521j;
        StringBuilder sb = new StringBuilder("createAweme() synthetiseResult = ");
        sb.append(this.f112517f);
        sb.append(" \nargs ");
        sb.append(obj);
        dlVar.mo87871a(sb.toString());
        if (this.f112512a != null) {
            this.f112512a.onProgressUpdate(this.f112515d.mo87841a(3, 0), false);
        }
        final C44493a aVar = new C44493a();
        aVar.mo90387a();
        C17832m a = this.f112516e.mo78614a(obj, videoCreation, this.f112517f);
        C444927 r2 = new C17824h<C42421al>() {
            public final void onFailure(Throwable th) {
                C47858ep.m103522c(C44485k.this.f112532u, C42477bv.m93327a(th), C42477bv.m93328b(th));
                C43214dh.m94817a().mo87849a(9);
                if (C44485k.this.f112512a != null) {
                    C44485k.this.f112512a.onError(new C43856fy(th));
                }
            }

            /* JADX WARNING: type inference failed for: r4v0 */
            /* JADX WARNING: type inference failed for: r23v0 */
            /* JADX WARNING: type inference failed for: r4v1, types: [com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel] */
            /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r23v1 */
            /* JADX WARNING: type inference failed for: r11v7, types: [com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel] */
            /* JADX WARNING: type inference failed for: r4v80 */
            /* JADX WARNING: type inference failed for: r23v2 */
            /* JADX WARNING: type inference failed for: r4v81 */
            /* JADX WARNING: type inference failed for: r4v82 */
            /* JADX WARNING: type inference failed for: r4v85, types: [java.lang.String] */
            /* JADX WARNING: type inference failed for: r4v86 */
            /* JADX WARNING: type inference failed for: r4v87 */
            /* JADX WARNING: type inference failed for: r4v88 */
            /* JADX WARNING: type inference failed for: r4v89 */
            /* JADX WARNING: type inference failed for: r4v90 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v82
              assigns: []
              uses: []
              mth insns count: 480
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 8 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ void onSuccess(java.lang.Object r32) {
                /*
                    r31 = this;
                    r0 = r31
                    r1 = r32
                    com.ss.android.ugc.aweme.shortvideo.al r1 = (com.p683ss.android.ugc.aweme.shortvideo.C42421al) r1
                    com.ss.android.ugc.aweme.shortvideo.s.k r2 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    long r3 = android.os.SystemClock.uptimeMillis()
                    r2.f112527p = r3
                    com.ss.android.ugc.aweme.shortvideo.s.k r2 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    java.lang.String r2 = r2.f112532u
                    com.p683ss.android.ugc.aweme.utils.C47858ep.m103526e(r2)
                    com.ss.android.ugc.aweme.property.h r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
                    com.ss.android.ugc.aweme.property.h$a r3 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.MonitorPublishFailed
                    r2.mo83103a(r3)
                    com.ss.android.ugc.aweme.shortvideo.model.VideoCreation r2 = r6
                    java.lang.String r2 = r2.materialId
                    r1.materialId = r2
                    com.ss.android.ugc.aweme.port.in.ad r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101182w
                    java.lang.String r3 = "mus_af_post_video"
                    r4 = 0
                    r2.mo74170a(r3, r4)
                    com.ss.android.ugc.aweme.shortvideo.s.k$a r2 = r0
                    com.google.b.a.o r3 = r2.f112558a
                    boolean r3 = r3.f48964a
                    r5 = 1
                    r6 = 0
                    if (r3 == 0) goto L_0x0067
                    com.google.b.a.o r3 = r2.f112558a
                    r3.mo33756d()
                    java.util.Locale r3 = java.util.Locale.US
                    java.lang.String r7 = "%.2f"
                    java.lang.Object[] r8 = new java.lang.Object[r5]
                    com.google.b.a.o r2 = r2.f112558a
                    java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.NANOSECONDS
                    long r9 = r2.mo33754a(r9)
                    float r2 = (float) r9
                    r9 = 1315859240(0x4e6e6b28, float:1.0E9)
                    float r2 = r2 / r9
                    java.lang.Float r2 = java.lang.Float.valueOf(r2)
                    r8[r6] = r2
                    java.lang.String r2 = com.C2240a.m6773a(r3, r7, r8)
                    java.lang.String r3 = "url_upload"
                    com.ss.android.ugc.aweme.app.f.d r7 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                    java.lang.String r8 = "duration"
                    com.ss.android.ugc.aweme.app.f.d r2 = r7.mo47829a(r8, r2)
                    java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
                    com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r2)
                L_0x0067:
                    com.ss.android.ugc.aweme.shortvideo.s.k r2 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    com.ss.android.ugc.aweme.shortvideo.upload.r r2 = r2.f112512a
                    if (r2 == 0) goto L_0x04cc
                    com.ss.android.ugc.aweme.shortvideo.dh r2 = com.p683ss.android.ugc.aweme.shortvideo.C43214dh.m94817a()
                    r3 = 10
                    r2.mo87849a(r3)
                    com.ss.android.ugc.aweme.shortvideo.s.k r2 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    com.ss.android.ugc.aweme.shortvideo.upload.r r2 = r2.f112512a
                    r2.onSuccess(r1, r6)
                    com.ss.android.ugc.aweme.shortvideo.s.k r1 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    com.ss.android.ugc.aweme.shortvideo.s.k$c r1 = r1.f112520i
                    java.lang.Object r2 = r5
                    com.ss.android.ugc.aweme.shortvideo.s.k r3 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    boolean r3 = r3.f112529r
                    com.ss.android.ugc.aweme.shortvideo.s.k r7 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    boolean r7 = r7.f112528q
                    com.google.b.a.o r8 = r1.f112565f
                    boolean r8 = r8.f48964a
                    if (r8 == 0) goto L_0x04cc
                    java.lang.String r8 = "PublishDurationMonitor LOG_END"
                    com.p683ss.android.ugc.tools.utils.C50203g.m108358a(r8)
                    com.google.b.a.o r8 = r1.f112565f
                    java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS
                    long r8 = r8.mo33754a(r9)
                    java.lang.String r10 = "type_av_compose_upload"
                    com.ss.android.ugc.aweme.app.f.c r11 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
                    java.lang.String r12 = "speed"
                    r13 = 1065353216(0x3f800000, float:1.0)
                    com.ss.android.ugc.aweme.shortvideo.k r14 = r1.f112560a
                    long r14 = r14.mo78618b(r2)
                    float r14 = (float) r14
                    float r14 = r14 * r13
                    float r13 = (float) r8
                    float r14 = r14 / r13
                    java.lang.Float r14 = java.lang.Float.valueOf(r14)
                    com.ss.android.ugc.aweme.app.f.c r11 = r11.mo47821a(r12, r14)
                    java.lang.String r12 = "processTime"
                    java.lang.Long r14 = java.lang.Long.valueOf(r8)
                    com.ss.android.ugc.aweme.app.f.c r11 = r11.mo47823a(r12, r14)
                    org.json.JSONObject r11 = r11.mo47825b()
                    com.p683ss.android.ugc.aweme.base.C23569o.m57779a(r10, r11)
                    java.util.Locale r10 = java.util.Locale.US
                    java.lang.String r11 = "%d"
                    java.lang.Object[] r12 = new java.lang.Object[r5]
                    java.lang.Long r8 = java.lang.Long.valueOf(r8)
                    r12[r6] = r8
                    java.lang.String r8 = com.C2240a.m6773a(r10, r11, r12)
                    int r9 = r1.f112563d
                    java.lang.String r9 = com.p683ss.android.ugc.aweme.photo.publish.C38704c.m86060a(r9, r2)
                    java.lang.String r10 = ""
                    boolean r11 = r2 instanceof com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel
                    r16 = 0
                    if (r11 == 0) goto L_0x014a
                    r11 = r2
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r11 = (com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r11
                    java.lang.String r12 = r11.mOutputFile
                    boolean r12 = com.p683ss.android.ugc.aweme.video.C48016e.m103944b(r12)
                    if (r12 == 0) goto L_0x0136
                    java.io.File r4 = new java.io.File
                    java.lang.String r12 = r11.mOutputFile
                    r4.<init>(r12)
                    long r18 = r4.length()
                    r20 = 1024(0x400, double:5.06E-321)
                    long r18 = r18 / r20
                    java.util.Locale r4 = java.util.Locale.US
                    java.lang.String r12 = "%d"
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    java.lang.Long r20 = java.lang.Long.valueOf(r18)
                    r5[r6] = r20
                    java.lang.String r4 = com.C2240a.m6773a(r4, r12, r5)
                    java.lang.String r5 = r11.mOutputFile
                    com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r5 = dmt.p2652av.video.C52928al.m112613b(r5)
                    if (r5 == 0) goto L_0x012f
                    int r10 = r5.getBitrate()
                    java.lang.String r12 = r5.getResolution()
                    int r20 = r5.getFps()
                    long r21 = r5.getDuration()
                    r5 = r10
                    r10 = r12
                    goto L_0x013d
                L_0x012f:
                    java.lang.String r5 = r11.mOutputFile
                    int r5 = dmt.p2652av.video.C52928al.m112615d(r5)
                    goto L_0x0139
                L_0x0136:
                    r18 = r16
                    r5 = 0
                L_0x0139:
                    r20 = 0
                    r21 = -1
                L_0x013d:
                    long r14 = r11.userClickPublishTime
                    r23 = r4
                    r12 = r10
                    r4 = r11
                    r10 = r18
                    r24 = r20
                    r25 = r21
                    goto L_0x0155
                L_0x014a:
                    r23 = r4
                    r12 = r10
                    r10 = r16
                    r14 = r10
                    r5 = 0
                    r24 = 0
                    r25 = -1
                L_0x0155:
                    com.ss.android.ugc.aweme.app.f.d r6 = new com.ss.android.ugc.aweme.app.f.d
                    r6.<init>()
                    if (r4 == 0) goto L_0x018b
                    java.lang.String r0 = "is_fast_import"
                    r27 = r13
                    boolean r13 = r4.isFastImport
                    java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)
                    r6.mo47828a(r0, r13)
                    java.lang.String r0 = "edit_filter_id"
                    java.lang.String r13 = r4.mCurFilterIds
                    r6.mo47829a(r0, r13)
                    java.lang.String r0 = "file_size"
                    r6.mo47827a(r0, r10)
                    java.lang.String r0 = "file_bitrate"
                    r6.mo47826a(r0, r5)
                    java.lang.String r0 = "info_sticker_list"
                    java.lang.String r13 = r4.getInfoStickerList()
                    r6.mo47829a(r0, r13)
                    java.lang.String r0 = "effect_list"
                    java.lang.String r4 = r4.mStickerID
                    r6.mo47829a(r0, r4)
                    goto L_0x018d
                L_0x018b:
                    r27 = r13
                L_0x018d:
                    java.lang.String r0 = "old_user_view_publish_duration"
                    com.ss.android.ugc.aweme.app.f.d r0 = r6.mo47829a(r0, r8)
                    java.lang.String r4 = "content_type"
                    int r13 = r1.f112563d
                    java.lang.String r13 = com.p683ss.android.ugc.aweme.photo.publish.C38704c.m86059a(r13)
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r13)
                    java.lang.String r4 = "video_type"
                    int r13 = r1.f112563d
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r4, r13)
                    java.lang.String r4 = "video_upload_type"
                    int r13 = r1.f112561b
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r4, r13)
                    java.lang.String r4 = "content_source"
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r9)
                    java.lang.String r4 = "is_hardcode"
                    boolean r13 = com.p683ss.android.ugc.aweme.property.C40797m.m90243a()
                    if (r13 == 0) goto L_0x01c0
                    java.lang.String r13 = "1"
                    goto L_0x01c2
                L_0x01c0:
                    java.lang.String r13 = "0"
                L_0x01c2:
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r13)
                    java.lang.String r4 = "resolution"
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r12)
                    java.lang.String r4 = "encode_video_duration"
                    com.ss.android.ugc.aweme.shortvideo.s.k r13 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    r28 = r10
                    long r10 = r13.f112524m
                    com.ss.android.ugc.aweme.shortvideo.s.k r13 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    r30 = r12
                    long r12 = r13.f112523l
                    long r10 = r10 - r12
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47827a(r4, r10)
                    java.lang.String r4 = "upload_video_duration"
                    com.ss.android.ugc.aweme.shortvideo.s.k r10 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    long r10 = r10.f112526o
                    com.ss.android.ugc.aweme.shortvideo.s.k r12 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    long r12 = r12.f112525n
                    long r10 = r10 - r12
                    r0.mo47827a(r4, r10)
                    int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                    if (r0 <= 0) goto L_0x024c
                    java.lang.String r0 = "user_view_publish_duration"
                    com.ss.android.ugc.aweme.shortvideo.s.k r4 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    long r10 = r4.f112527p
                    long r10 = r10 - r14
                    r6.mo47827a(r0, r10)
                    java.lang.String r0 = "gap_click_start"
                    long r10 = r1.f112564e
                    long r10 = r10 - r14
                    r6.mo47827a(r0, r10)
                    java.lang.String r0 = "gap_start_end"
                    com.ss.android.ugc.aweme.shortvideo.s.k r4 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    long r10 = r4.f112527p
                    long r12 = r1.f112564e
                    long r10 = r10 - r12
                    r6.mo47827a(r0, r10)
                    java.lang.String r0 = "and_user_click_time"
                    r4 = 0
                    com.ss.android.ugc.aweme.app.f.d r0 = r6.mo47826a(r0, r4)
                    java.lang.String r4 = "and_start_synthetise_time"
                    com.ss.android.ugc.aweme.shortvideo.s.k r10 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    long r10 = r10.f112523l
                    long r10 = r10 - r14
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47827a(r4, r10)
                    java.lang.String r4 = "and_end_synthetise_time"
                    com.ss.android.ugc.aweme.shortvideo.s.k r10 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    long r10 = r10.f112524m
                    long r10 = r10 - r14
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47827a(r4, r10)
                    java.lang.String r4 = "and_start_upload_time"
                    com.ss.android.ugc.aweme.shortvideo.s.k r10 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    long r10 = r10.f112525n
                    long r10 = r10 - r14
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47827a(r4, r10)
                    java.lang.String r4 = "and_end_upload_time"
                    com.ss.android.ugc.aweme.shortvideo.s.k r10 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    long r10 = r10.f112526o
                    long r10 = r10 - r14
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47827a(r4, r10)
                    java.lang.String r4 = "and_end_create_aweme_time"
                    com.ss.android.ugc.aweme.shortvideo.s.k r10 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    long r10 = r10.f112527p
                    long r10 = r10 - r14
                    r0.mo47827a(r4, r10)
                L_0x024c:
                    java.lang.String r0 = "tool_performance_publish_duration"
                    java.util.Map<java.lang.String, java.lang.String> r4 = r6.f61491a
                    com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r4)
                    com.ss.android.ugc.aweme.app.f.d r0 = new com.ss.android.ugc.aweme.app.f.d
                    r0.<init>()
                    java.lang.String r4 = "duration"
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r8)
                    java.lang.String r4 = "upload_while_compose"
                    int r6 = r1.f112561b
                    boolean r6 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.m97338a(r6)
                    if (r6 == 0) goto L_0x026b
                    java.lang.String r6 = "1"
                    goto L_0x026d
                L_0x026b:
                    java.lang.String r6 = "0"
                L_0x026d:
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r6)
                    java.lang.String r4 = "shoot_way"
                    java.lang.String r6 = r1.f112562c
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r6)
                    java.lang.String r4 = "content_type"
                    int r6 = r1.f112563d
                    java.lang.String r6 = com.p683ss.android.ugc.aweme.photo.publish.C38704c.m86059a(r6)
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r6)
                    java.lang.String r4 = "video_type"
                    int r6 = r1.f112563d
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r4, r6)
                    java.lang.String r4 = "video_upload_type"
                    int r6 = r1.f112561b
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r4, r6)
                    java.lang.String r4 = "content_source"
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r9)
                    java.lang.String r4 = "is_hardcode"
                    boolean r6 = com.p683ss.android.ugc.aweme.property.C40797m.m90243a()
                    if (r6 == 0) goto L_0x02a6
                    java.lang.String r6 = "1"
                    goto L_0x02a8
                L_0x02a6:
                    java.lang.String r6 = "0"
                L_0x02a8:
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r6)
                    java.lang.String r4 = "is_download_video"
                    if (r3 == 0) goto L_0x02b3
                    java.lang.String r3 = "1"
                    goto L_0x02b5
                L_0x02b3:
                    java.lang.String r3 = "0"
                L_0x02b5:
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r3)
                    java.lang.String r3 = "retry_publish"
                    com.ss.android.ugc.aweme.shortvideo.s.k r4 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    boolean r4 = r4.f112533v
                    if (r4 == 0) goto L_0x02c4
                    java.lang.String r4 = "1"
                    goto L_0x02c6
                L_0x02c4:
                    java.lang.String r4 = "0"
                L_0x02c6:
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r3, r4)
                    java.lang.String r3 = "pre_publish_type"
                    com.ss.android.ugc.aweme.shortvideo.s.k r4 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    int r4 = r4.f112534w
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47826a(r3, r4)
                    java.lang.String r3 = "resolution"
                    r10 = r30
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r3, r10)
                    int r3 = r1.f112563d
                    boolean r3 = com.p683ss.android.ugc.aweme.photo.publish.C38704c.m86061b(r3)
                    if (r3 == 0) goto L_0x0478
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r2 = (com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r2
                    java.lang.String r3 = "file_bitrate"
                    com.ss.android.ugc.aweme.app.f.d r3 = r0.mo47826a(r3, r5)
                    java.lang.String r4 = "filter_id_list"
                    java.lang.String r5 = r2.mCurFilterIds
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                    java.lang.String r4 = "effect_list"
                    java.lang.String r5 = r2.getEditEffectList()
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                    java.lang.String r4 = "info_sticker_list"
                    java.lang.String r5 = r2.getInfoStickerList()
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                    java.lang.String r4 = "compose_coding"
                    if (r7 == 0) goto L_0x030f
                    java.lang.String r5 = "hardcoding"
                    goto L_0x0311
                L_0x030f:
                    java.lang.String r5 = "softcoding"
                L_0x0311:
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                    java.lang.String r4 = "is_reencode"
                    boolean r5 = dmt.p2652av.video.C52979m.m112711b(r2)
                    if (r5 == 0) goto L_0x0320
                    java.lang.String r5 = "1"
                    goto L_0x0322
                L_0x0320:
                    java.lang.String r5 = "0"
                L_0x0322:
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                    java.lang.String r4 = "creation_id"
                    java.lang.String r5 = r2.creationId
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                    java.lang.String r4 = "save_watermark"
                    boolean r5 = r2.isSaveLocalWithWaterMark()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47828a(r4, r5)
                    java.lang.String r4 = "file_size"
                    r5 = r23
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                    java.lang.String r4 = "upload_speed"
                    r5 = 1148846080(0x447a0000, float:1000.0)
                    r6 = r28
                    float r6 = (float) r6
                    float r6 = r6 * r5
                    float r6 = r6 / r27
                    java.lang.Float r5 = java.lang.Float.valueOf(r6)
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47828a(r4, r5)
                    java.lang.String r4 = "checkFastImport"
                    boolean r5 = dmt.p2652av.video.C52979m.m112712c(r2)
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47828a(r4, r5)
                    java.lang.String r4 = "prop_list"
                    java.lang.String r5 = r2.mStickerID
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                    java.lang.String r4 = "beautify_used"
                    boolean r5 = r2.faceBeautyOpen
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47828a(r4, r5)
                    java.lang.String r4 = "beautify_info"
                    java.lang.String r5 = com.p683ss.android.ugc.aweme.beauty.C23778b.m58351a()
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                    java.lang.String r4 = "file_fps"
                    r6 = r24
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47826a(r4, r6)
                    java.lang.String r4 = "file_duration_ms"
                    r5 = r25
                    r3.mo47827a(r4, r5)
                    com.ss.android.ugc.aweme.shortvideo.s.k r3 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r3 = r3.f112517f
                    int r3 = r3.unableRemuxCode
                    if (r3 == 0) goto L_0x03a5
                    java.lang.String r3 = "notRemuxErrorcode"
                    com.ss.android.ugc.aweme.shortvideo.s.k r4 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r4 = r4.f112517f
                    int r4 = r4.unableRemuxCode
                    r0.mo47826a(r3, r4)
                L_0x03a5:
                    com.ss.android.ugc.aweme.shortvideo.s.k r3 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r3 = r3.f112517f
                    if (r3 == 0) goto L_0x03b6
                    java.lang.String r3 = "synthetise_cpu_encode"
                    com.ss.android.ugc.aweme.shortvideo.s.k r4 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    com.ss.android.ugc.aweme.shortvideo.SynthetiseResult r4 = r4.f112517f
                    int r4 = r4.synthetiseCPUEncode
                    r0.mo47826a(r3, r4)
                L_0x03b6:
                    com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r3 = r2.uploadSpeedInfo
                    if (r3 == 0) goto L_0x03d4
                    dmt.p2652av.video.C52972j.m112698a(r2)
                    java.lang.String r3 = "upload_probe_speed"
                    com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r4 = r2.uploadSpeedInfo
                    long r4 = r4.getSpeed()
                    com.ss.android.ugc.aweme.app.f.d r3 = r0.mo47827a(r3, r4)
                    java.lang.String r4 = "used_compiler_setting_group"
                    com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo r5 = r2.uploadSpeedInfo
                    int r5 = r5.getUsedCompilerSettingGroup()
                    r3.mo47826a(r4, r5)
                L_0x03d4:
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r3 = r2.compileProbeResult
                    if (r3 == 0) goto L_0x0432
                    java.lang.String r3 = "pre_code"
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r4 = r2.compileProbeResult
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus r4 = r4.getStatus()
                    int r4 = r4.getVeCode()
                    com.ss.android.ugc.aweme.app.f.d r3 = r0.mo47826a(r3, r4)
                    java.lang.String r4 = "pre_tools_code"
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r5 = r2.compileProbeResult
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultStatus r5 = r5.getStatus()
                    int r5 = r5.getToolsCode()
                    r3.mo47826a(r4, r5)
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r3 = r2.compileProbeResult
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData r3 = r3.getData()
                    if (r3 == 0) goto L_0x0432
                    java.lang.String r3 = "pre_crf"
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r4 = r2.compileProbeResult
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData r4 = r4.getData()
                    int r4 = r4.getCrf()
                    com.ss.android.ugc.aweme.app.f.d r3 = r0.mo47826a(r3, r4)
                    java.lang.String r4 = "pre_bitrate"
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r5 = r2.compileProbeResult
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData r5 = r5.getData()
                    float r5 = r5.getVideoBitrate()
                    java.lang.Float r5 = java.lang.Float.valueOf(r5)
                    com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47828a(r4, r5)
                    java.lang.String r4 = "pre_duration"
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult r2 = r2.compileProbeResult
                    com.ss.android.ugc.aweme.shortvideo.edit.CompileProbeResult$ResultData r2 = r2.getData()
                    int r2 = r2.getDurationMs()
                    r3.mo47826a(r4, r2)
                L_0x0432:
                    com.ss.android.ugc.aweme.shortvideo.k r2 = r1.f112560a
                    boolean r2 = r2 instanceof com.p683ss.android.ugc.aweme.shortvideo.C42402ab
                    if (r2 == 0) goto L_0x0451
                    com.ss.android.ugc.aweme.shortvideo.k r2 = r1.f112560a
                    com.ss.android.ugc.aweme.shortvideo.ab r2 = (com.p683ss.android.ugc.aweme.shortvideo.C42402ab) r2
                    com.ss.android.ugc.aweme.shortvideo.upload.c.c r2 = r2.f107262n
                    java.lang.String r3 = "synthetic_dur_ms"
                    long r4 = r2.mo91555c()
                    com.ss.android.ugc.aweme.app.f.d r3 = r0.mo47827a(r3, r4)
                    java.lang.String r4 = "upload_wait_time_ms"
                    long r5 = r2.mo91556d()
                    r3.mo47827a(r4, r5)
                L_0x0451:
                    com.ss.android.ugc.aweme.shortvideo.s.k r2 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    com.ss.android.ugc.aweme.shortvideo.fq r2 = r2.f112530s
                    if (r2 == 0) goto L_0x045e
                    com.ss.android.ugc.aweme.shortvideo.s.k r2 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    com.ss.android.ugc.aweme.shortvideo.fq r2 = r2.f112530s
                    long r14 = r2.f111041a
                    goto L_0x046f
                L_0x045e:
                    com.ss.android.ugc.aweme.shortvideo.k r2 = r1.f112560a
                    boolean r2 = r2 instanceof com.p683ss.android.ugc.aweme.shortvideo.C42402ab
                    if (r2 == 0) goto L_0x046d
                    com.ss.android.ugc.aweme.shortvideo.k r2 = r1.f112560a
                    com.ss.android.ugc.aweme.shortvideo.ab r2 = (com.p683ss.android.ugc.aweme.shortvideo.C42402ab) r2
                    long r14 = r2.mo86496c()
                    goto L_0x046f
                L_0x046d:
                    r14 = -1
                L_0x046f:
                    int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
                    if (r2 <= 0) goto L_0x0478
                    java.lang.String r2 = "upload_dur_ms"
                    r0.mo47827a(r2, r14)
                L_0x0478:
                    java.lang.String r2 = "publish_finish"
                    java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
                    com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r0)
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r2 = "PublishDurationMonitor publish_finish "
                    r0.<init>(r2)
                    r0.append(r8)
                    java.lang.String r0 = r0.toString()
                    com.p683ss.android.ugc.tools.utils.C50203g.m108363d(r0)
                    java.lang.String r0 = "user_publish_success_rate_parallel"
                    com.ss.android.ugc.aweme.app.f.c r2 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
                    java.lang.String r3 = "video_type"
                    int r4 = r1.f112563d
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47822a(r3, r4)
                    java.lang.String r3 = "retry_publish"
                    com.ss.android.ugc.aweme.shortvideo.s.k r4 = com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.this
                    boolean r4 = r4.f112533v
                    if (r4 == 0) goto L_0x04ad
                    java.lang.String r4 = "1"
                    goto L_0x04af
                L_0x04ad:
                    java.lang.String r4 = "0"
                L_0x04af:
                    com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47824a(r3, r4)
                    java.lang.String r3 = "video_upload_type"
                    int r4 = r1.f112561b
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    com.ss.android.ugc.aweme.app.f.c r2 = r2.mo47822a(r3, r4)
                    org.json.JSONObject r2 = r2.mo47825b()
                    r3 = 0
                    com.p683ss.android.ugc.aweme.base.C23569o.m57776a(r0, r3, r2)
                    com.google.b.a.o r0 = r1.f112565f
                    r0.mo33756d()
                L_0x04cc:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44485k.C444927.onSuccess(java.lang.Object):void");
            }
        };
        if (this.f112531t == null) {
            executor = C23551l.f62672a;
        } else {
            executor = this.f112531t;
        }
        C17825i.m43740a(a, r2, executor);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo90377a(String str, String str2) throws JSONException {
        JSONObject optJSONObject = C20853a.f56796a.mo48689b().optJSONObject("events");
        if (optJSONObject.optInt("upload_video_start") < optJSONObject.optInt("upload_video_end")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_abnormal_counting");
            C23569o.m57779a("aweme_upload_video_funnel", mo90381b().mo47824a("type", sb.toString()).mo47824a("extra", C20853a.f56796a.mo48688a()).mo47824a("stack_trace", str2).mo47825b());
        }
    }

    /* renamed from: a */
    private void m97336a(final Object obj, final int i, final boolean z) {
        int i2;
        Executor executor;
        Executor executor2;
        if (C38704c.m86061b(this.f112513b)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            this.f112509B = (double) videoPublishEditModel.videoFps();
            this.f112510C = videoPublishEditModel.creationId;
            i2 = videoPublishEditModel.videoEditorType;
        } else {
            i2 = -1;
        }
        this.f112511D = C38704c.m86060a(this.f112513b, obj);
        C47858ep.m103519b(this.f112532u, C2240a.m6773a(Locale.US, "id:%s vt:%d ut:%d et:%d", new Object[]{this.f112532u, Integer.valueOf(this.f112513b), Integer.valueOf(this.f112514c), Integer.valueOf(i2)}));
        C43214dh.m94817a().mo87849a(2);
        C45318u.m98796a(this.f112510C, C38704c.m86059a(this.f112513b));
        C43211de<SynthetiseResult> a = this.f112516e.mo86491a(obj, this.f112518g, z);
        m97340f(obj);
        this.f112536y = a;
        C26890h.m65011a("av_memory_log", C23089d.m56640a().mo47827a("dalvikPss", C45380af.m98935a().f114754d).mo47827a("nativePss", C45380af.m98935a().f114755e).mo47827a("otherPss", C45380af.m98935a().f114757g).mo47827a("totalPss", C45380af.m98935a().f114756f).f61491a);
        C444872 r1 = new C17824h<SynthetiseResult>() {
            public final void onFailure(Throwable th) {
                C47858ep.m103508a(C44485k.this.f112532u, C43809fd.resolveErrorCode(th));
                C44485k.this.f112521j.mo87871a("synthetise failed");
                C26890h.m65011a("av_memory_log", C23089d.m56640a().mo47829a("synthetise_start", "failed").mo47827a("dalvikPss", C45380af.m98935a().f114754d).mo47827a("nativePss", C45380af.m98935a().f114755e).mo47827a("otherPss", C45380af.m98935a().f114757g).mo47827a("totalPss", C45380af.m98935a().f114756f).f61491a);
                C43214dh.m94817a().mo87849a(9);
                if (C44485k.this.f112522k) {
                    C44485k.this.mo90380a(false, th, "homepage_follow", obj, null);
                } else {
                    C44485k.this.mo90380a(false, th, "video_post_page", obj, null);
                }
                if (C44485k.this.f112512a != null) {
                    C44485k.this.f112512a.onError(new C43856fy(th));
                }
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
                String str = "";
                if (synthetiseResult != null) {
                    StringBuilder sb = new StringBuilder("encode:");
                    sb.append(synthetiseResult.synthetiseCPUEncode);
                    str = sb.toString();
                }
                C47858ep.m103523c(C44485k.this.f112532u, str);
                try {
                    if (C44485k.this.f112522k) {
                        C44485k.this.mo90380a(true, null, "homepage_follow", obj, synthetiseResult);
                    } else {
                        C44485k.this.mo90380a(true, null, "video_post_page", obj, synthetiseResult);
                    }
                    C26890h.m65011a("av_memory_log", C23089d.m56640a().mo47829a("synthetise_start", "success").mo47827a("dalvikPss", C45380af.m98935a().f114754d).mo47827a("nativePss", C45380af.m98935a().f114755e).mo47827a("otherPss", C45380af.m98935a().f114757g).mo47827a("totalPss", C45380af.m98935a().f114756f).f61491a);
                    C44485k.this.f112517f = synthetiseResult;
                    C43218dl dlVar = C44485k.this.f112521j;
                    StringBuilder sb2 = new StringBuilder("synthetise() finished, result = ");
                    sb2.append(synthetiseResult);
                    dlVar.mo87871a(sb2.toString());
                    if (!C44485k.this.f112518g.mo2940a()) {
                        if (!z) {
                            C44485k.this.mo90383c(obj, i);
                            return;
                        }
                        C44485k.this.f112529r = C44485k.this.f112516e.mo78774d(obj);
                        VideoCreation videoCreation = new VideoCreation();
                        videoCreation.setMaterialId(((VideoPublishEditModel) obj).reviewVideoId);
                        C44485k.this.mo90376a(obj, videoCreation);
                    }
                } catch (Exception e) {
                    C23569o.m57779a("aweme_synthetise_error_log", C23088c.m56631a().mo47824a("exception", C13696m.m27668c(e)).mo47825b());
                }
            }
        };
        if (this.f112531t == null) {
            executor = C17833n.m43743a();
        } else {
            executor = this.f112531t;
        }
        C17825i.m43740a(a, r1, executor);
        C44499o oVar = new C44499o(this, a);
        if (this.f112531t == null) {
            executor2 = C17833n.m43743a();
        } else {
            executor2 = this.f112531t;
        }
        a.mo87843b(oVar, executor2);
    }

    public C44485k(C43907k kVar, int i, int i2, int i3, String str, boolean z, C44334o<C42421al> oVar) {
        this.f112516e = kVar;
        this.f112535x = str;
        this.f112513b = i2;
        this.f112514c = i3;
        this.f112533v = z;
        this.f112534w = i;
        StringBuilder sb = new StringBuilder();
        sb.append(C19034d.m46323c());
        sb.append("-");
        sb.append(SystemClock.uptimeMillis());
        this.f112532u = sb.toString();
        kVar.f111187d = this.f112532u;
        kVar.f111188e = this.f112533v;
        if (oVar != null) {
            this.f112512a = new C45315r();
            this.f112512a.add(new C42470bo(oVar));
        }
        this.f112518g = new C0958a();
        if (kVar instanceof C42402ab) {
            ((C42402ab) kVar).mo86492a(this.f112518g);
        }
        C44495c cVar = new C44495c(this.f112516e, this.f112514c, this.f112535x, this.f112513b);
        this.f112520i = cVar;
        this.f112521j = new C43218dl(this);
        if (C39618d.f101152P.mo83103a(C40790a.EnablePublishThreadOpt)) {
            C50203g.m108363d("Publisher create mPublishExecutor");
            this.f112531t = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());
        }
        C43218dl dlVar = this.f112521j;
        StringBuilder sb2 = new StringBuilder("new Publisher() type = ");
        sb2.append(i2);
        dlVar.mo87871a(sb2.toString());
    }
}
