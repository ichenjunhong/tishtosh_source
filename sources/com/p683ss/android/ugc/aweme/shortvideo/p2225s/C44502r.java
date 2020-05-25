package com.p683ss.android.ugc.aweme.shortvideo.p2225s;

import android.os.SystemClock;
import android.util.Log;
import com.C2240a;
import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.p1415f.C23528a;
import com.p683ss.android.ugc.aweme.beauty.C23778b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.p1259ac.C20853a;
import com.p683ss.android.ugc.aweme.photo.publish.C38704c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.C42402ab;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C42477bv;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.C43848fq;
import com.p683ss.android.ugc.aweme.shortvideo.C43907k;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45241aa;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45318u;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45321x.C45322a;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45292c;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45419be;
import com.p683ss.android.ugc.aweme.utils.C47858ep;
import com.p683ss.android.ugc.aweme.utils.C47894fo;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import dmt.p2652av.video.C52928al;
import dmt.p2652av.video.C52972j;
import dmt.p2652av.video.C52979m;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.r */
public final class C44502r {

    /* renamed from: a */
    public long f112578a;

    /* renamed from: b */
    public long f112579b;

    /* renamed from: c */
    public long f112580c;

    /* renamed from: d */
    public long f112581d;

    /* renamed from: e */
    public long f112582e;

    /* renamed from: f */
    String f112583f;

    /* renamed from: g */
    int f112584g;

    /* renamed from: h */
    int f112585h;

    /* renamed from: i */
    public SynthetiseResult f112586i;

    /* renamed from: j */
    String f112587j;

    /* renamed from: k */
    double f112588k;

    /* renamed from: l */
    long f112589l;

    /* renamed from: m */
    String f112590m;

    /* renamed from: n */
    String f112591n;

    /* renamed from: o */
    public boolean f112592o;

    /* renamed from: p */
    C44504b f112593p;

    /* renamed from: q */
    public C43848fq f112594q;

    /* renamed from: r */
    C44503a f112595r;

    /* renamed from: s */
    final C43907k f112596s;

    /* renamed from: t */
    public int f112597t;

    /* renamed from: u */
    private boolean f112598u;

    /* renamed from: v */
    private final C44505c f112599v;

    /* renamed from: w */
    private boolean f112600w;

    /* renamed from: x */
    private boolean f112601x;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.s.r$a */
    static class C44503a {

        /* renamed from: a */
        C17429o f112602a;

        C44503a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90404a() {
            if (this.f112602a.f48964a) {
                this.f112602a.mo33756d();
                C26890h.m65011a("url_upload", C23089d.m56640a().mo47829a("duration", C2240a.m6773a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) this.f112602a.mo33754a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.s.r$b */
    static class C44504b {

        /* renamed from: a */
        C17429o f112603a;

        C44504b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90405a() {
            if (this.f112603a.f48964a) {
                this.f112603a.mo33756d();
                C26890h.m65011a("get_video_key", C23089d.m56640a().mo47829a("duration", C2240a.m6773a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) this.f112603a.mo33754a(TimeUnit.NANOSECONDS)) / 1.0E9f)})).f61491a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.s.r$c */
    class C44505c {

        /* renamed from: a */
        C43907k f112604a;

        /* renamed from: b */
        int f112605b;

        /* renamed from: c */
        String f112606c;

        /* renamed from: d */
        int f112607d;

        /* renamed from: e */
        C17429o f112608e;

        /* renamed from: g */
        private long f112610g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90407a(boolean z) {
            C50203g.m108358a("PublishDurationMonitor LOG_START");
            this.f112608e = C17429o.m42676b(C47894fo.f120488a);
            this.f112610g = SystemClock.uptimeMillis();
            C26890h.m65011a("click_publish_button", new C23089d().mo47826a("compose_finish", z ? 1 : 0).f61491a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo90406a(Object obj, boolean z, boolean z2) {
            if (this.f112608e.f48964a) {
                m97374b(obj, z, z2);
                this.f112608e.mo33756d();
            }
        }

        /* renamed from: b */
        private void m97374b(Object obj, boolean z, boolean z2) {
            String str;
            long j;
            int i;
            long j2;
            VideoPublishEditModel videoPublishEditModel;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            Object obj2 = obj;
            C50203g.m108358a("PublishDurationMonitor LOG_END");
            long a = this.f112608e.mo33754a(TimeUnit.MILLISECONDS);
            float f = (float) a;
            C23569o.m57779a("type_av_compose_upload", C23088c.m56631a().mo47821a("speed", Float.valueOf((((float) this.f112604a.mo78618b(obj2)) * 1.0f) / f)).mo47823a("processTime", Long.valueOf(a)).mo47825b());
            String a2 = C2240a.m6773a(Locale.US, "%d", new Object[]{Long.valueOf(a)});
            String a3 = C38704c.m86060a(this.f112607d, obj2);
            if ("upload".equals(a3)) {
                str = C40797m.m90253h();
            } else {
                str = C40797m.m90252g();
            }
            String str10 = null;
            if (obj2 instanceof VideoPublishEditModel) {
                videoPublishEditModel = (VideoPublishEditModel) obj2;
                i = C52928al.m112615d(videoPublishEditModel.mOutputFile);
                if (C48016e.m103944b(videoPublishEditModel.mOutputFile)) {
                    j = new File(videoPublishEditModel.mOutputFile).length() / 1024;
                    str10 = C2240a.m6773a(Locale.US, "%d", new Object[]{Long.valueOf(j)});
                } else {
                    j = 0;
                }
                j2 = videoPublishEditModel.userClickPublishTime;
            } else {
                videoPublishEditModel = null;
                j2 = 0;
                i = 0;
                j = 0;
            }
            C23089d dVar = new C23089d();
            if (videoPublishEditModel != null) {
                dVar.mo47828a("is_fast_import", (Object) Boolean.valueOf(videoPublishEditModel.isFastImport));
                dVar.mo47829a("edit_filter_id", videoPublishEditModel.mCurFilterIds);
                dVar.mo47827a("file_size", j);
                dVar.mo47826a("file_bitrate", i);
                dVar.mo47829a("info_sticker_list", videoPublishEditModel.getInfoStickerList());
                dVar.mo47829a("effect_list", videoPublishEditModel.mStickerID);
            }
            C23089d a4 = dVar.mo47829a("old_user_view_publish_duration", a2).mo47829a("content_type", C38704c.m86059a(this.f112607d)).mo47826a("video_type", this.f112607d).mo47826a("video_upload_type", this.f112605b).mo47829a("content_source", a3);
            String str11 = "is_hardcode";
            if (C40797m.m90243a()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            long j3 = j;
            float f2 = f;
            String str12 = str10;
            a4.mo47829a(str11, str2).mo47829a("resolution", str).mo47827a("encode_video_duration", C44502r.this.f112579b - C44502r.this.f112578a).mo47827a("upload_video_duration", C44502r.this.f112581d - C44502r.this.f112580c);
            if (j2 > 0) {
                dVar.mo47827a("user_view_publish_duration", C44502r.this.f112582e - j2);
                dVar.mo47827a("gap_click_start", this.f112610g - j2);
                dVar.mo47827a("gap_start_end", C44502r.this.f112582e - this.f112610g);
                dVar.mo47826a("and_user_click_time", 0).mo47827a("and_start_synthetise_time", C44502r.this.f112578a - j2).mo47827a("and_end_synthetise_time", C44502r.this.f112579b - j2).mo47827a("and_start_upload_time", C44502r.this.f112580c - j2).mo47827a("and_end_upload_time", C44502r.this.f112581d - j2).mo47827a("and_end_create_aweme_time", C44502r.this.f112582e - j2);
            }
            C26890h.m65011a("tool_performance_publish_duration", dVar.f61491a);
            C23089d a5 = new C23089d().mo47829a("duration", a2);
            String str13 = "upload_while_compose";
            if (C44502r.m97363a(this.f112605b)) {
                str3 = "1";
            } else {
                str3 = "0";
            }
            C23089d a6 = a5.mo47829a(str13, str3).mo47829a("shoot_way", this.f112606c).mo47829a("content_type", C38704c.m86059a(this.f112607d)).mo47826a("video_type", this.f112607d).mo47826a("video_upload_type", this.f112605b).mo47829a("content_source", a3);
            String str14 = "is_hardcode";
            if (C40797m.m90243a()) {
                str4 = "1";
            } else {
                str4 = "0";
            }
            C23089d a7 = a6.mo47829a(str14, str4);
            String str15 = "is_download_video";
            if (z) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            C23089d a8 = a7.mo47829a(str15, str5);
            String str16 = "retry_publish";
            if (C44502r.this.f112592o) {
                str6 = "1";
            } else {
                str6 = "0";
            }
            C23089d a9 = a8.mo47829a(str16, str6).mo47826a("pre_publish_type", C44502r.this.f112597t).mo47829a("resolution", str);
            if (C38704c.m86061b(this.f112607d)) {
                VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) obj2;
                C23089d a10 = a9.mo47826a("file_bitrate", i).mo47829a("filter_id_list", videoPublishEditModel2.mCurFilterIds).mo47829a("effect_list", videoPublishEditModel2.getEditEffectList()).mo47829a("info_sticker_list", videoPublishEditModel2.getInfoStickerList());
                String str17 = "compose_coding";
                if (z2) {
                    str8 = "hardcoding";
                } else {
                    str8 = "softcoding";
                }
                C23089d a11 = a10.mo47829a(str17, str8);
                String str18 = "is_reencode";
                if (C52979m.m112711b(videoPublishEditModel2)) {
                    str9 = "1";
                } else {
                    str9 = "0";
                }
                a11.mo47829a(str18, str9).mo47829a("creation_id", videoPublishEditModel2.creationId).mo47828a("save_watermark", (Object) Boolean.valueOf(videoPublishEditModel2.isSaveLocalWithWaterMark())).mo47829a("file_size", str12).mo47828a("upload_speed", (Object) Float.valueOf((((float) j3) * 1000.0f) / f2)).mo47828a("checkFastImport", (Object) Boolean.valueOf(C52979m.m112712c(videoPublishEditModel2))).mo47829a("prop_list", videoPublishEditModel2.mStickerID).mo47828a("beautify_used", (Object) Boolean.valueOf(videoPublishEditModel2.faceBeautyOpen)).mo47829a("beautify_info", C23778b.m58351a()).mo47826a("file_fps", C52928al.m112614c(videoPublishEditModel2.mOutputFile));
                if (C44502r.this.f112586i != null) {
                    if (C44502r.this.f112586i.unableRemuxCode != 0) {
                        a9.mo47826a("notRemuxErrorcode", C44502r.this.f112586i.unableRemuxCode);
                    }
                    a9.mo47826a("synthetise_cpu_encode", C44502r.this.f112586i.synthetiseCPUEncode);
                }
                if (videoPublishEditModel2.uploadSpeedInfo != null) {
                    C52972j.m112698a(videoPublishEditModel2);
                    a9.mo47827a("upload_probe_speed", videoPublishEditModel2.uploadSpeedInfo.getSpeed()).mo47826a("used_compiler_setting_group", videoPublishEditModel2.uploadSpeedInfo.getUsedCompilerSettingGroup());
                }
                if (videoPublishEditModel2.compileProbeResult != null) {
                    a9.mo47826a("pre_code", videoPublishEditModel2.compileProbeResult.getStatus().getVeCode()).mo47826a("pre_tools_code", videoPublishEditModel2.compileProbeResult.getStatus().getToolsCode());
                    if (videoPublishEditModel2.compileProbeResult.getData() != null) {
                        a9.mo47826a("pre_crf", videoPublishEditModel2.compileProbeResult.getData().getCrf()).mo47828a("pre_bitrate", (Object) Float.valueOf(videoPublishEditModel2.compileProbeResult.getData().getVideoBitrate())).mo47826a("pre_duration", videoPublishEditModel2.compileProbeResult.getData().getDurationMs());
                    }
                }
                if (this.f112604a instanceof C42402ab) {
                    C45292c cVar = ((C42402ab) this.f112604a).f107262n;
                    a9.mo47827a("synthetic_dur_ms", cVar.mo91555c()).mo47827a("upload_wait_time_ms", cVar.mo91556d());
                }
                long j4 = -1;
                if (C44502r.this.f112594q != null) {
                    j4 = C44502r.this.f112594q.f111041a;
                } else if (this.f112604a instanceof C42402ab) {
                    j4 = ((C42402ab) this.f112604a).mo86496c();
                }
                if (j4 > 0) {
                    a9.mo47827a("upload_dur_ms", j4);
                }
            }
            C26890h.m65011a("publish_finish", a9.f61491a);
            StringBuilder sb = new StringBuilder("PublishDurationMonitor publish_finish ");
            sb.append(a2);
            C50203g.m108363d(sb.toString());
            String str19 = "user_publish_success_rate_parallel";
            C23088c a12 = C23088c.m56631a().mo47822a("video_type", Integer.valueOf(this.f112607d));
            String str20 = "retry_publish";
            if (C44502r.this.f112592o) {
                str7 = "1";
            } else {
                str7 = "0";
            }
            C23569o.m57776a(str19, 0, a12.mo47824a(str20, str7).mo47822a("video_upload_type", Integer.valueOf(this.f112605b)).mo47825b());
        }

        C44505c(C43907k kVar, int i, String str, int i2) {
            this.f112604a = kVar;
            this.f112605b = i;
            this.f112606c = str;
            this.f112607d = i2;
        }
    }

    /* renamed from: a */
    public static boolean m97363a(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public final void mo90401a(boolean z, Throwable th, VideoCreation videoCreation, Object obj) {
        if (z) {
            C47858ep.m103524d(this.f112591n);
            try {
                m97362a(true, new C23088c().mo47824a("resultCode", C39618d.f101161b.mo34889b(videoCreation)).mo47824a("args", C39618d.f101161b.mo34889b(obj)).mo47824a("result", C39618d.f101161b.mo34889b(videoCreation)));
            } catch (Exception e) {
                m97361a((Throwable) e);
            }
        } else {
            C47858ep.m103518b(this.f112591n, C45241aa.resolveErrorCode(th), (th == null || th.getMessage() == null) ? "" : th.getMessage());
            try {
                m97362a(false, new C23088c().mo47824a("throwable", Log.getStackTraceString(th)).mo47824a("args", C39618d.f101161b.mo34889b(obj)).mo47824a("result", C39618d.f101161b.mo34889b(videoCreation)));
            } catch (Exception e2) {
                m97361a((Throwable) e2);
            }
            C43214dh.m94817a().mo87849a(9);
        }
        this.f112581d = SystemClock.uptimeMillis();
        if (!m97363a(this.f112585h)) {
            this.f112594q.mo89388a(z, th != null ? th.toString() : "", null, true);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C23088c mo90403c() {
        return m97360a((C23088c) null);
    }

    /* renamed from: a */
    public final void mo90396a() {
        this.f112600w = true;
        this.f112599v.mo90407a(this.f112601x);
    }

    /* renamed from: b */
    public final void mo90402b() {
        C26890h.m65011a("user_cancel_publish", C23089d.m56640a().mo47829a("publish_id", this.f112591n).mo47826a("video_type", this.f112584g).mo47826a("video_upload_type", this.f112585h).mo47829a("cancel_step", "user").f61491a);
        C43214dh.m94817a().mo87849a(10);
    }

    /* renamed from: a */
    private C23088c m97360a(C23088c cVar) {
        if (cVar == null) {
            cVar = new C23088c();
        }
        cVar.mo47822a("video_type", Integer.valueOf(this.f112584g)).mo47824a("item_type", this.f112596s.getClass().getSimpleName());
        return cVar;
    }

    /* renamed from: a */
    static void m97361a(Throwable th) {
        try {
            C23569o.m57779a("aweme_upload_video_funnel", new C23088c().mo47824a("type", "pure_exception").mo47824a("exception", Log.getStackTraceString(th)).mo47825b());
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m97362a(boolean z, C23088c cVar) {
        String str;
        try {
            String stackTraceString = Log.getStackTraceString(new Exception());
            C20853a.f56796a.mo48687a("upload_video_end");
            C23528a aVar = C20853a.f56796a;
            StringBuilder sb = new StringBuilder("upload_video_end");
            if (z) {
                str = "_success";
            } else {
                str = "_failure";
            }
            sb.append(str);
            aVar.mo48687a(sb.toString());
            C23569o.m57779a("aweme_upload_video_funnel", m97360a(cVar).mo47824a("type", "upload_video_end").mo47822a("status", Integer.valueOf(z ^ true ? 1 : 0)).mo47824a("extra", C20853a.f56796a.mo48688a()).mo47824a("stack_trace", stackTraceString).mo47825b());
            mo90397a("upload_video_end", stackTraceString);
        } catch (Exception e) {
            m97361a((Throwable) e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo90397a(String str, String str2) throws JSONException {
        JSONObject optJSONObject = C20853a.f56796a.mo48689b().optJSONObject("events");
        if (optJSONObject.optInt("upload_video_start") < optJSONObject.optInt("upload_video_end")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("_abnormal_counting");
            C23569o.m57779a("aweme_upload_video_funnel", mo90403c().mo47824a("type", sb.toString()).mo47824a("extra", C20853a.f56796a.mo48688a()).mo47824a("stack_trace", str2).mo47825b());
        }
    }

    /* renamed from: a */
    public final void mo90400a(boolean z, VideoCreation videoCreation, Throwable th) {
        if (z) {
            C47858ep.m103525d(this.f112591n, C45419be.m98988a(videoCreation));
            this.f112593p.mo90405a();
            C50203g.m108363d("Publisher create video finished.");
            return;
        }
        C47858ep.m103509a(this.f112591n, C42477bv.m93327a(th), C42477bv.m93328b(th));
        C50203g.m108363d("Publisher create video failed.");
        C43214dh.m94817a().mo87849a(9);
    }

    /* renamed from: a */
    public final void mo90398a(boolean z, SynthetiseResult synthetiseResult, Throwable th, Object obj) {
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        this.f112601x = true;
        String str7 = "";
        if (synthetiseResult != null) {
            StringBuilder sb = new StringBuilder("encode:");
            sb.append(synthetiseResult.synthetiseCPUEncode);
            str7 = sb.toString();
        }
        if (z) {
            C47858ep.m103523c(this.f112591n, str7);
            StringBuilder sb2 = new StringBuilder("Publisher synthetise() finished, result = ");
            sb2.append(synthetiseResult);
            C50203g.m108363d(sb2.toString());
            this.f112586i = synthetiseResult;
        } else {
            C47858ep.m103508a(this.f112591n, C43809fd.resolveErrorCode(th));
            C50203g.m108363d("Publisher synthetise failed");
            C43214dh.m94817a().mo87849a(9);
        }
        String str8 = "av_memory_log";
        C23089d a = C23089d.m56640a();
        String str9 = "synthetise_start";
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        C26890h.m65011a(str8, a.mo47829a(str9, str).mo47827a("dalvikPss", C45380af.m98935a().f114754d).mo47827a("nativePss", C45380af.m98935a().f114755e).mo47827a("otherPss", C45380af.m98935a().f114757g).mo47827a("totalPss", C45380af.m98935a().f114756f).f61491a);
        this.f112579b = SystemClock.uptimeMillis();
        long j2 = 0;
        if (this.f112589l > 0) {
            j = C47894fo.f120488a.mo33765a() - this.f112589l;
        } else {
            j = 0;
        }
        this.f112589l = j;
        double d = (double) this.f112589l;
        Double.isNaN(d);
        String a2 = C2240a.m6773a(Locale.US, "%d", new Object[]{Integer.valueOf((int) (d / 1000000.0d))});
        StringBuilder sb3 = new StringBuilder();
        sb3.append(z ? 1 : 0);
        C23089d a3 = C23089d.m56640a().mo47829a("duration", a2).mo47829a("status", sb3.toString());
        String str10 = "resolution";
        if ("upload".equals(this.f112583f)) {
            str2 = C40797m.m90253h();
        } else {
            str2 = C40797m.m90252g();
        }
        C23089d a4 = a3.mo47829a(str10, str2);
        String str11 = "is_hardcode";
        if (C40797m.m90243a()) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(C40797m.m90249d());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(C40797m.m90251f());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.f112588k);
        C23089d a5 = a4.mo47829a(str11, str3).mo47829a("bite_rate", sb4.toString()).mo47829a("video_quality", sb5.toString()).mo47829a("_perf_monitor", "1").mo47829a("fps", sb6.toString());
        String str12 = "current_page";
        if (this.f112600w) {
            str4 = "homepage_follow";
        } else {
            str4 = "video_post_page";
        }
        C23089d a6 = a5.mo47829a(str12, str4);
        String str13 = "fail_info";
        if (th == null) {
            str5 = null;
        } else {
            str5 = th.toString();
        }
        a6.mo47829a(str13, str5);
        if (th instanceof C43809fd) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(((C43809fd) th).getCode());
            a6.mo47829a("error_code", sb7.toString());
        }
        if (C38704c.m86061b(this.f112584g)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) obj;
            if (C48016e.m103944b(videoPublishEditModel.mOutputFile)) {
                j2 = new File(videoPublishEditModel.mOutputFile).length();
                i = C52928al.m112615d(videoPublishEditModel.mOutputFile);
            } else {
                i = 0;
            }
            this.f112598u = videoPublishEditModel.isSyntheticHardEncode;
            String str14 = "compose_coding";
            if (videoPublishEditModel.isSyntheticHardEncode) {
                str6 = "hardcoding";
            } else {
                str6 = "softcoding";
            }
            a6.mo47829a(str14, str6).mo47826a("file_bitrate", i).mo47829a("file_size", C2240a.m6773a(Locale.US, "%d", new Object[]{Long.valueOf(j2 / 1024)}));
            if (C48016e.m103944b(videoPublishEditModel.getLocalTempPath())) {
                j2 += new File(videoPublishEditModel.getLocalTempPath()).length();
            }
            if (C48016e.m103944b(videoPublishEditModel.getLocalFinalPath())) {
                j2 += new File(videoPublishEditModel.getLocalFinalPath()).length();
            }
            C45318u.m98795a(this.f112590m, j2);
            C45322a a7 = C45318u.m98793a();
            if (a7 != null) {
                a6.mo47826a("init_available_size_mb", (int) a7.f114587a).mo47826a("max_publish_usage_mb", (int) a7.f114588b).mo47829a("available_size_detail", a7.f114589c);
            }
            a6.mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("filter_id_list", videoPublishEditModel.mCurFilterIds).mo47829a("effect_list", videoPublishEditModel.getEditEffectList()).mo47829a("info_sticker_list", videoPublishEditModel.getInfoStickerList()).mo47829a("prop_list", videoPublishEditModel.mStickerID).mo47828a("beautify_used", (Object) Boolean.valueOf(videoPublishEditModel.faceBeautyOpen)).mo47829a("publish_id", this.f112591n).mo47829a("beautify_info", C23778b.m58351a()).mo47829a("content_type", videoPublishEditModel.getAvetParameter().getContentType()).mo47829a("content_source", videoPublishEditModel.getAvetParameter().getContentSource());
        }
        C26890h.m65011a("video_compose_end", a6.f61491a);
        StringBuilder sb8 = new StringBuilder("Publisher uploadSynthetiseEndEvent: ");
        sb8.append(a2);
        C50203g.m108363d(sb8.toString());
    }

    /* renamed from: a */
    public final void mo90399a(boolean z, VideoCreation videoCreation, C42421al alVar, Throwable th, Object obj, boolean z2) {
        if (z) {
            this.f112582e = SystemClock.uptimeMillis();
            C47858ep.m103526e(this.f112591n);
            alVar.materialId = videoCreation.materialId;
            C39618d.f101182w.mo74170a("mus_af_post_video", null);
            this.f112595r.mo90404a();
            C43214dh.m94817a().mo87849a(10);
            this.f112599v.mo90406a(obj, z2, this.f112598u);
            return;
        }
        C47858ep.m103522c(this.f112591n, C42477bv.m93327a(th), C42477bv.m93328b(th));
        C43214dh.m94817a().mo87849a(9);
    }

    public C44502r(C43907k kVar, int i, int i2, int i3, String str, String str2, boolean z) {
        this.f112596s = kVar;
        this.f112587j = str2;
        this.f112584g = i2;
        this.f112585h = i3;
        this.f112592o = z;
        this.f112591n = str;
        this.f112597t = i;
        C44505c cVar = new C44505c(this.f112596s, this.f112585h, this.f112587j, this.f112584g);
        this.f112599v = cVar;
    }
}
