package com.p683ss.android.ugc.aweme.photo;

import android.app.Application;
import com.google.p1057b.p1058a.C17437s;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.shortvideo.C42477bv;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.ttuploader.UploadEventManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photo.s */
public final class C38707s implements C17824h<VideoCreation> {

    /* renamed from: a */
    private int f98454a;

    /* renamed from: b */
    private int f98455b;

    public final /* synthetic */ void onSuccess(Object obj) {
        VideoCreation videoCreation = (VideoCreation) obj;
        m86064a(UploadEventManager.instance.popAllImageEvents());
    }

    /* renamed from: a */
    private void m86064a(JSONArray jSONArray) {
        if (jSONArray != null) {
            Application application = C39618d.f101160a;
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    jSONObject.put("aweme_video_type", this.f98454a);
                    jSONObject.put("aweme_upload_type", this.f98455b);
                    AppLog.recordMiscLog(application, "image_upload", jSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final void onFailure(Throwable th) {
        int a = C42477bv.m93326a(12, th);
        String b = C17437s.m42688b(th);
        JSONArray popAllImageEvents = UploadEventManager.instance.popAllImageEvents();
        C23569o.m57783b("aweme_photo_publish_log", "upload_error_sdk", C23088c.m56631a().mo47824a("events", popAllImageEvents.toString()).mo47824a("exception", b).mo47825b());
        C23569o.m57776a("aweme_photo_publish_error_rate", a, C23088c.m56631a().mo47824a("events", popAllImageEvents.toString()).mo47824a("exception", b).mo47825b());
        m86064a(popAllImageEvents);
    }

    public C38707s(int i, int i2) {
        this.f98454a = i;
        this.f98455b = i2;
    }
}
