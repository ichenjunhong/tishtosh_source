package com.p683ss.android.ugc.aweme.shortvideo;

import android.app.Application;
import com.google.p1057b.p1058a.C17437s;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.ttuploader.UploadEventManager;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fr */
public final class C43849fr implements C17824h<VideoCreation> {

    /* renamed from: a */
    final String f111050a;

    /* renamed from: b */
    String f111051b;

    /* renamed from: c */
    private UploadSpeedInfo f111052c;

    /* renamed from: d */
    private int f111053d;

    /* renamed from: e */
    private int f111054e;

    public final /* synthetic */ void onSuccess(Object obj) {
        VideoCreation videoCreation = (VideoCreation) obj;
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        C23569o.m57776a("upload_error_sdk", 0, C42437ay.m93202a().mo86521a("events", popAllEvents.toString()).mo86522b());
        m96285a(popAllEvents);
    }

    /* renamed from: a */
    private void m96285a(JSONArray jSONArray) {
        if (jSONArray != null) {
            Application application = C39618d.f101160a;
            ArrayList b = C43951l.m96492a().mo89517b();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    jSONObject.put("aweme_sdkextra", b);
                    jSONObject.put("aweme_upload_speed", this.f111052c.getSpeed());
                    jSONObject.put("aweme_video_type", this.f111053d);
                    jSONObject.put("aweme_upload_type", this.f111054e);
                    jSONObject.put("aweme_speed_start", this.f111052c.getStartTime());
                    jSONObject.put("aweme_speed_end", this.f111052c.getEndTime());
                    jSONObject.put("aweme_video_resolution", this.f111051b);
                    StringBuilder sb = new StringBuilder("TTUploaderEventV1 content:");
                    sb.append(jSONObject.toString());
                    C50203g.m108358a(sb.toString());
                    AppLog.recordMiscLog(application, "video_upload", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void onFailure(Throwable th) {
        int a = C42477bv.m93326a(12, th);
        String b = C17437s.m42688b(th);
        JSONArray popAllEvents = UploadEventManager.instance.popAllEvents();
        C23569o.m57776a("upload_error_sdk", 1, C42437ay.m93202a().mo86521a("events", popAllEvents.toString()).mo86521a("exception", b).mo86522b());
        C23569o.m57776a("aweme_movie_publish_error_rate_sdk", a, C42437ay.m93202a().mo86521a("exception", b).mo86522b());
        C43951l a2 = C43951l.m96492a();
        StringBuilder sb = new StringBuilder("output file: ");
        sb.append(this.f111050a);
        a2.mo89516a(sb.toString());
        if (this.f111050a != null) {
            C43951l a3 = C43951l.m96492a();
            StringBuilder sb2 = new StringBuilder(" size: ");
            sb2.append(new File(this.f111050a).length());
            a3.mo89516a(sb2.toString());
        } else {
            C43951l.m96492a().mo89516a("output file == null");
        }
        m96285a(popAllEvents);
    }

    public C43849fr(String str, String str2, UploadSpeedInfo uploadSpeedInfo, int i, int i2) {
        this.f111050a = str;
        this.f111051b = str2;
        this.f111052c = uploadSpeedInfo;
        this.f111053d = i;
        this.f111054e = i2;
    }
}
