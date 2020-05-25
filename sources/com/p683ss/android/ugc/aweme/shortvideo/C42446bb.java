package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.p1057b.p1058a.C17437s;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bb */
public final class C42446bb implements C17824h<VideoCreation> {
    public final /* synthetic */ void onSuccess(Object obj) {
        VideoCreation videoCreation = (VideoCreation) obj;
        C23569o.m57776a("fetch_upload_parameters_error", 0, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        C23569o.m57776a("fetch_upload_parameters_error", 1, C42437ay.m93202a().mo86521a("exception", C17437s.m42688b(th)).mo86522b());
    }
}
