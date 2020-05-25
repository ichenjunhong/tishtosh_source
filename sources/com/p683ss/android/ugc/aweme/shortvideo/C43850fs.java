package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.p1057b.p1058a.C17429o;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.fs */
public final class C43850fs implements C17824h<VideoCreation> {

    /* renamed from: a */
    C17429o f111055a = C17429o.m42675b();

    /* renamed from: b */
    File f111056b;

    public final void onFailure(Throwable th) {
    }

    public C43850fs(String str) {
        this.f111056b = new File(str);
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        VideoCreation videoCreation = (VideoCreation) obj;
        if (this.f111056b.exists()) {
            long a = this.f111055a.mo33754a(TimeUnit.MILLISECONDS);
            float length = ((float) this.f111056b.length()) / ((float) a);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("duration", a);
                jSONObject.put("fileSize", this.f111056b.length());
                jSONObject.put("speed", (double) length);
            } catch (JSONException unused) {
            }
            C23569o.m57783b("aweme_movie_publish_performance", "upload_time", jSONObject);
        }
    }
}
