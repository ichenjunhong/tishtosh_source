package com.p683ss.android.ugc.aweme.shortvideo;

import com.C2240a;
import com.google.p1057b.p1058a.C17429o;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.beauty.C23778b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.photo.publish.C38704c;
import com.p683ss.android.ugc.aweme.property.C40797m;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45292c;
import com.p683ss.android.ugc.aweme.utils.C47894fo;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.tools.utils.C50203g;
import dmt.p2652av.video.C52928al;
import dmt.p2652av.video.C52979m;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fq */
public final class C43848fq {

    /* renamed from: a */
    public long f111041a;

    /* renamed from: b */
    private double f111042b;

    /* renamed from: c */
    private C17429o f111043c;

    /* renamed from: d */
    private C43907k f111044d;

    /* renamed from: e */
    private int f111045e;

    /* renamed from: f */
    private String f111046f;

    /* renamed from: g */
    private String f111047g = C38704c.m86059a(this.f111045e);

    /* renamed from: h */
    private Object f111048h;

    /* renamed from: i */
    private C45292c f111049i;

    /* renamed from: a */
    public final void mo89387a(boolean z) {
        String str;
        String str2;
        this.f111043c = C17429o.m42676b(C47894fo.f120488a);
        C23089d a = C23089d.m56640a().mo47829a("resolution", "");
        String str3 = "is_hardcode";
        if (C40797m.m90243a()) {
            str = "1";
        } else {
            str = "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C40797m.m90249d());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C40797m.m90251f());
        C23089d a2 = a.mo47829a(str3, str).mo47829a("bite_rate", sb.toString()).mo47829a("video_quality", sb2.toString()).mo47829a("_perf_monitor", "1");
        String str4 = "is_click_publish";
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f111042b);
        C23089d a3 = a2.mo47829a(str4, str2).mo47829a("fps", sb3.toString());
        if (C38704c.m86061b(this.f111045e)) {
            a3.mo47827a("upload_probe_speed", ((VideoPublishEditModel) this.f111048h).uploadSpeedInfo.getSpeed());
        }
        C26890h.m65011a("video_publish_start", a3.f61491a);
    }

    public C43848fq(Object obj, C43907k kVar, int i, C45292c cVar) {
        this.f111044d = kVar;
        this.f111045e = i;
        this.f111048h = obj;
        this.f111049i = cVar;
        this.f111046f = C38704c.m86060a(this.f111045e, obj);
        if (this.f111045e == 0) {
            this.f111042b = (double) ((VideoPublishEditModel) obj).videoFps();
        }
    }

    /* renamed from: a */
    public final void mo89388a(boolean z, String str, String str2, boolean z2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i;
        String str8;
        String str9;
        String str10;
        C23089d a = C23089d.m56640a();
        String str11 = "status";
        if (z) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        C23089d a2 = a.mo47829a(str11, str3).mo47829a("fail_info", str);
        String str12 = "record_code_type";
        if (C40797m.m90243a()) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        C23089d a3 = a2.mo47829a(str12, str4);
        String str13 = "compose_code_type";
        if (C40797m.m90247b()) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C40797m.m90249d());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C40797m.m90251f());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f111042b);
        C23089d a4 = a3.mo47829a(str13, str5).mo47829a("bite_rate", sb.toString()).mo47829a("video_quality", sb2.toString()).mo47829a("_perf_monitor", "1").mo47829a("fps", sb3.toString()).mo47829a("content_source", this.f111046f).mo47829a("content_type", this.f111047g);
        if (this.f111043c.f48964a) {
            this.f111043c.mo33756d();
        }
        this.f111041a = this.f111043c.mo33754a(TimeUnit.MILLISECONDS);
        a4.mo47827a("origin_upload_dur_ms", this.f111041a);
        if (this.f111049i != null) {
            a4.mo47827a("synthetic_dur_ms", this.f111049i.mo91555c()).mo47827a("upload_wait_time_ms", this.f111049i.mo91556d());
            this.f111041a -= this.f111049i.mo91557e();
        }
        a4.mo47827a("duration", this.f111041a);
        int i2 = 0;
        a4.mo47829a("upload_speed", C2240a.m6773a(Locale.US, "%.2f", new Object[]{Float.valueOf(((float) ((this.f111044d.mo78618b(this.f111048h) * 1000) / this.f111041a)) / 1024.0f)}));
        if (!z) {
            a4.mo47829a("error_code", str2);
        }
        if (C38704c.m86061b(this.f111045e)) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.f111048h;
            VideoFileInfo b = C52928al.m112613b(videoPublishEditModel.mOutputFile);
            String str14 = null;
            if (C48016e.m103944b(videoPublishEditModel.mOutputFile)) {
                str14 = C2240a.m6773a(Locale.US, "%d", new Object[]{Long.valueOf(new File(videoPublishEditModel.mOutputFile).length() / 1024)});
            }
            C23089d a5 = a4.mo47829a("creation_id", videoPublishEditModel.creationId).mo47829a("filter_id_list", videoPublishEditModel.mCurFilterIds).mo47829a("prop_list", videoPublishEditModel.mStickerID);
            String str15 = "is_click_publish";
            if (z2) {
                str6 = "1";
            } else {
                str6 = "0";
            }
            C23089d a6 = a5.mo47829a(str15, str6).mo47829a("effect_list", videoPublishEditModel.getEditEffectList()).mo47829a("info_sticker_list", videoPublishEditModel.getInfoStickerList());
            String str16 = "video_edit_page_filter";
            if (videoPublishEditModel.mSelectedId == 0) {
                str7 = "0";
            } else {
                str7 = "1";
            }
            C23089d a7 = a6.mo47829a(str16, str7);
            String str17 = "file_bitrate";
            if (b == null) {
                i = 0;
            } else {
                i = b.getBitrate();
            }
            C23089d a8 = a7.mo47826a(str17, i);
            String str18 = "compose_coding";
            if (videoPublishEditModel.isSyntheticHardEncode) {
                str8 = "hardcoding";
            } else {
                str8 = "softcoding";
            }
            C23089d a9 = a8.mo47829a(str18, str8);
            String str19 = "is_reencode";
            if (C52979m.m112711b(videoPublishEditModel)) {
                str9 = "1";
            } else {
                str9 = "0";
            }
            C23089d a10 = a9.mo47829a(str19, str9).mo47829a("file_size", str14);
            String str20 = "resolution";
            if (b == null) {
                str10 = "";
            } else {
                str10 = b.getResolution();
            }
            C23089d a11 = a10.mo47829a(str20, str10).mo47828a("beautify_used", (Object) Boolean.valueOf(videoPublishEditModel.faceBeautyOpen)).mo47829a("beautify_info", C23778b.m58351a()).mo47827a("upload_probe_speed", videoPublishEditModel.uploadSpeedInfo.getSpeed());
            String str21 = "file_fps";
            if (b != null) {
                i2 = b.getFps();
            }
            a11.mo47826a(str21, i2);
        }
        C26890h.m65011a("video_publish_end", a4.f61491a);
        StringBuilder sb4 = new StringBuilder("PublishDurationMonitor VideoUploadDurationInMs: ");
        sb4.append(this.f111041a);
        C50203g.m108363d(sb4.toString());
    }
}
