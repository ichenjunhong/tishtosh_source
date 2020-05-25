package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.p1057b.p1058a.C17437s;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ba */
public final class C42445ba implements C17824h<VideoCreation> {
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    public C42445ba() {
        C23569o.m57776a("aweme_movie_publish_error_rate_sdk", -1, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        C23569o.m57776a("aweme_movie_publish_error_rate_sdk", C42477bv.m93326a(11, th), C42437ay.m93202a().mo86521a("exception", C17437s.m42688b(th)).mo86522b());
    }
}
