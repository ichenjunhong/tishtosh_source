package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.sdk.webview.p1210b.C19746f;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ac */
public final class C48329ac extends C19746f {
    public C48329ac(WeakReference<Context> weakReference, C10757a aVar) {
        super(weakReference);
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        hVar.f28946c = "open";
        hVar.f28947d.put("type", "publishVideo");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("video_id", hVar.f28947d.optString("review_video_id"));
        jSONObject2.put("video_url", hVar.f28947d.optString("video_url"));
        jSONObject2.put("music_id", hVar.f28947d.optString("music_id"));
        jSONObject2.put("challenge_id", hVar.f28947d.optString("challenge_id"));
        hVar.f28947d.put("args", jSONObject2);
        open(hVar.f28947d);
    }
}
