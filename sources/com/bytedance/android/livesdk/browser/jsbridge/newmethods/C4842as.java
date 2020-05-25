package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.fansclub.C6776a;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.as */
public final class C4842as extends C10779d<JSONObject, Object> {
    public final void onTerminate() {
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) throws Exception {
        int i = ((JSONObject) obj).getInt("status");
        C6776a aVar = new C6776a();
        aVar.f18582a = i;
        C4495a.m10823a().mo10301a((Object) aVar);
    }
}
