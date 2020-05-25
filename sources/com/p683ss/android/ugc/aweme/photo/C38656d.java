package com.p683ss.android.ugc.aweme.photo;

import com.facebook.common.p920d.C13696m;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.C42477bv;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;

/* renamed from: com.ss.android.ugc.aweme.photo.d */
public final class C38656d implements C17824h<VideoCreation> {
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    public final void onFailure(Throwable th) {
        int a = C42477bv.m93326a(11, th);
        String c = C13696m.m27668c(th);
        C23569o.m57783b("aweme_photo_publish_log", "fetch_upload_parameters_error", C23088c.m56631a().mo47824a("exception", c).mo47825b());
        C23569o.m57776a("aweme_photo_publish_error_rate", a, C23088c.m56631a().mo47824a("exception", c).mo47825b());
    }
}
