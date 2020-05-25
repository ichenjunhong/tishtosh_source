package com.p683ss.android.ugc.aweme.photomovie;

import com.google.p1057b.p1058a.C17437s;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.C43809fd;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.photomovie.y */
final class C38823y implements C17824h<SynthetiseResult> {
    C38823y() {
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        SynthetiseResult synthetiseResult = (SynthetiseResult) obj;
        C23569o.m57776a("aweme_photo_movie_synthesis_error_rate", 0, (JSONObject) null);
    }

    public final void onFailure(Throwable th) {
        int i;
        if (th instanceof C43809fd) {
            i = ((C43809fd) th).getCode();
        } else {
            i = 1;
        }
        C23569o.m57776a("aweme_photo_movie_synthesis_error_rate", i, (JSONObject) null);
        C23569o.m57783b("aweme_movie_publish_log", "aweme_photo_movie_synthesis_error_rate", C23088c.m56631a().mo47824a("exception", C17437s.m42688b(th)).mo47825b());
    }
}
