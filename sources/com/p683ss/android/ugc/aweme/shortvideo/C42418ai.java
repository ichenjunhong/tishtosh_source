package com.p683ss.android.ugc.aweme.shortvideo;

import com.facebook.common.p920d.C13696m;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ai */
public final class C42418ai implements C17824h<C42421al> {
    public final /* synthetic */ void onSuccess(Object obj) {
        C42421al alVar = (C42421al) obj;
        C23569o.m57776a("aweme_movie_publish_error_rate", 0, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        C23569o.m57776a("aweme_movie_publish_error_rate", C42477bv.m93326a(13, th), C23088c.m56631a().mo47824a("exception", C13696m.m27668c(th)).mo47825b());
    }
}
