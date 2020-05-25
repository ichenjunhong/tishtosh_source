package com.p683ss.android.ugc.aweme.video;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38866g;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.ai */
public final class C47989ai {
    /* renamed from: a */
    private static C38866g m103822a(C50158g gVar) {
        if (gVar == null) {
            return null;
        }
        C38866g aj = gVar.mo60219aj();
        if (aj == null) {
            return null;
        }
        return aj;
    }

    /* renamed from: a */
    static String m103823a(C38866g gVar, String str) {
        if (gVar == null || gVar.f98979b != null || TextUtils.isEmpty(gVar.f98978a)) {
            return null;
        }
        try {
            return new JSONObject(gVar.f98978a).getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m103824a(C50158g gVar, String str) {
        return m103823a(m103822a(gVar), str);
    }
}
