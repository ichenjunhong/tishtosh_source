package com.p683ss.android.ugc.aweme.shortvideo.upload;

import android.app.Application;
import com.google.p1057b.p1058a.C17429o;
import com.google.p1057b.p1058a.C17437s;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42437ay;
import com.p683ss.android.ugc.aweme.shortvideo.C43951l;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.aweme.shortvideo.net.C44332b;
import com.p683ss.android.ugc.aweme.shortvideo.upload.p2248c.C45292c;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.ttuploader.UploadEventManager;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.ab */
public final class C45243ab implements C17824h<VideoCreation> {

    /* renamed from: a */
    final String f114424a;

    /* renamed from: b */
    String f114425b;

    /* renamed from: c */
    public boolean f114426c;

    /* renamed from: d */
    private C17429o f114427d = C17429o.m42675b();

    /* renamed from: e */
    private C45292c f114428e;

    /* renamed from: f */
    private UploadSpeedInfo f114429f;

    /* renamed from: g */
    private int f114430g;

    /* renamed from: h */
    private int f114431h;

    /* renamed from: i */
    private String f114432i;

    /* renamed from: j */
    private boolean f114433j;

    /* renamed from: a */
    private static void m98716a(boolean z) {
        String str;
        StringBuilder sb = new StringBuilder("PublishDurationMonitor Upload End ");
        if (z) {
            str = "success";
        } else {
            str = "failed";
        }
        sb.append(str);
        C50203g.m108358a(sb.toString());
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        String str;
        String str2;
        VideoCreation videoCreation = (VideoCreation) obj;
        m98716a(true);
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        C42437ay a = C42437ay.m93202a().mo86521a("events", popAllEvents.toString());
        String str3 = "click_publish";
        if (this.f114428e.f114536h) {
            str = "1";
        } else {
            str = "0";
        }
        C42437ay a2 = a.mo86521a(str3, str);
        if (new File(this.f114424a).exists()) {
            long a3 = this.f114427d.mo33754a(TimeUnit.MILLISECONDS);
            a2.mo86518a("speed", Float.valueOf(((float) new File(this.f114424a).length()) / ((float) a3))).mo86520a("duration", Long.valueOf(a3));
        }
        String str4 = "parallel_publish_result";
        C23089d a4 = C23089d.m56640a().mo47826a("mob_lost_assist", 1);
        String str5 = "retry_publish";
        if (this.f114433j) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C26890h.m65011a(str4, a4.mo47829a(str5, str2).mo47826a("status", 82).mo47826a("publish_step", 31).mo47829a("publish_id", this.f114432i).f61491a);
        C23569o.m57776a("upload_error_parallel", 0, a2.mo86522b());
        m98715a(popAllEvents, "");
    }

    public final void onFailure(Throwable th) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        m98716a(false);
        int resolveErrorCode = C45241aa.resolveErrorCode(th);
        String b = C17437s.m42688b(th);
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        StringBuilder sb = new StringBuilder("Publisher UploadFailed: ");
        sb.append(b);
        C50203g.m108361b(sb.toString());
        String str7 = "upload_error_parallel";
        C42437ay a = C42437ay.m93202a().mo86521a("events", popAllEvents.toString()).mo86521a("exception", b);
        String str8 = "click_publish";
        if (this.f114428e.f114536h) {
            str = "1";
        } else {
            str = "0";
        }
        C23569o.m57776a(str7, resolveErrorCode, a.mo86521a(str8, str).mo86522b());
        String arrayList = C45324z.m98803a().mo91603b().toString();
        String str9 = "aweme_movie_publish_error_rate_parallel";
        C42437ay a2 = C42437ay.m93202a().mo86521a("exception", b).mo86521a("event", arrayList);
        String str10 = "click_publish";
        if (this.f114428e.f114536h) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C23569o.m57776a(str9, resolveErrorCode, a2.mo86521a(str10, str2).mo86522b());
        String str11 = "parallel_publish_result";
        C23089d a3 = C23089d.m56640a().mo47826a("status", resolveErrorCode);
        String str12 = "retry_publish";
        if (this.f114433j) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        C23089d a4 = a3.mo47829a(str12, str3);
        String str13 = "is_synthetic_success";
        if (this.f114428e.mo91554b()) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        C23089d a5 = a4.mo47829a(str13, str4).mo47826a("synthetic_error_code", this.f114428e.f114533e).mo47826a("publish_step", 31).mo47826a("error_code", resolveErrorCode);
        String str14 = "click_publish";
        if (this.f114428e.f114536h) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        C23089d a6 = a5.mo47829a(str14, str5);
        String str15 = "network_available";
        if (C44332b.m97107a(C39629l.m88233b())) {
            str6 = "1";
        } else {
            str6 = "0";
        }
        C26890h.m65011a(str11, a6.mo47829a(str15, str6).mo47829a("publish_id", this.f114432i).f61491a);
        C43951l a7 = C43951l.m96492a();
        StringBuilder sb2 = new StringBuilder("output file: ");
        sb2.append(this.f114424a);
        a7.mo89516a(sb2.toString());
        if (this.f114424a != null) {
            C43951l a8 = C43951l.m96492a();
            StringBuilder sb3 = new StringBuilder(" size: ");
            sb3.append(new File(this.f114424a).length());
            a8.mo89516a(sb3.toString());
        } else {
            C43951l.m96492a().mo89516a("output file == null");
        }
        m98715a(popAllEvents, arrayList);
    }

    /* renamed from: a */
    private void m98715a(JSONArray jSONArray, String str) {
        if (jSONArray != null) {
            Application application = C39618d.f101160a;
            ArrayList b = C43951l.m96492a().mo89517b();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    jSONObject.put("aweme_sdkextra", b);
                    jSONObject.put("aweme_video_resolution", this.f114425b);
                    jSONObject.put("aweme_video_type", this.f114430g);
                    jSONObject.put("aweme_upload_type", this.f114431h);
                    jSONObject.put("aweme_click_publish", this.f114426c);
                    jSONObject.put("aweme_publish_id", this.f114432i);
                    jSONObject.put("aweme_parallel_log", str);
                    jSONObject.put("aweme_upload_speed", this.f114429f.getSpeed());
                    jSONObject.put("aweme_speed_start", this.f114429f.getStartTime());
                    jSONObject.put("aweme_speed_end", this.f114429f.getEndTime());
                    jSONObject.put("aweme_synthetic_start", this.f114428e.f114531c);
                    jSONObject.put("aweme_synthetic_end", this.f114428e.f114532d);
                    jSONObject.put("aweme_upload_wait_ms", this.f114428e.mo91556d());
                    jSONObject.put("aweme_upload_offset_size_when_synthetic_end", this.f114428e.f114534f);
                    jSONObject.put("aweme_to_upload_size_when_synthetic_end", this.f114428e.f114535g);
                    StringBuilder sb = new StringBuilder("TTUploaderEventV1 content:");
                    sb.append(jSONObject.toString());
                    C50203g.m108358a(sb.toString());
                    AppLog.recordMiscLog(application, "video_upload", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public C45243ab(String str, String str2, UploadSpeedInfo uploadSpeedInfo, C45292c cVar, boolean z, int i, int i2, String str3, boolean z2) {
        String str4;
        this.f114424a = str;
        this.f114425b = str2;
        this.f114429f = uploadSpeedInfo;
        this.f114428e = cVar;
        this.f114426c = z;
        this.f114430g = i;
        this.f114431h = i2;
        this.f114432i = str3;
        this.f114433j = z2;
        String str5 = "parallel_publish_result";
        C23089d a = C23089d.m56640a();
        String str6 = "retry_publish";
        if (z2) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        C26890h.m65011a(str5, a.mo47829a(str6, str4).mo47826a("publish_step", 30).mo47829a("publish_id", str3).f61491a);
    }
}
