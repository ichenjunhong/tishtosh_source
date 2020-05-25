package com.p683ss.android.ugc.aweme.photo;

import com.google.p1057b.p1058a.C17437s;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C42477bv;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photo.b */
public final class C38654b implements C17824h<C42421al> {
    public final /* synthetic */ void onSuccess(Object obj) {
        C42421al alVar = (C42421al) obj;
        C23569o.m57776a("aweme_photo_publish_error_rate", 0, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        String b = C17437s.m42688b(th);
        int a = C42477bv.m93326a(13, th);
        C23569o.m57783b("aweme_photo_publish_log", "publish_error", C23088c.m56631a().mo47824a("exception", b).mo47825b());
        C23569o.m57776a("aweme_photo_publish_error_rate", a, C23088c.m56631a().mo47824a("exception", b).mo47825b());
    }
}
