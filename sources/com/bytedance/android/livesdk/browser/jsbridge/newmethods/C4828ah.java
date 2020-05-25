package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6107dn;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ah */
public final class C4828ah extends C10782e<JSONObject, Object> {
    public final /* synthetic */ Object invoke(Object obj, C10783f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        Context context = fVar.f28972a;
        if (context instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            C4104a.m10232a(fragmentActivity, new C6107dn(fragmentActivity, true));
        }
        return null;
    }
}
