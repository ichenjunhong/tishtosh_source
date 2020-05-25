package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.ies.p675g.p677b.C10782e;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.google.gson.p1076a.C17952c;

public class ToastMethod extends C10782e<Params, Object> {

    static final class Params {
        @C17952c(mo34828a = "position")
        int position;
        @C17952c(mo34828a = "text")
        String text;

        Params() {
        }
    }

    public Object invoke(Params params, C10783f fVar) throws Exception {
        if (params.position == 1) {
            C4575an.m10987a(params.text);
        } else {
            C4204a.m10423a(fVar.f28972a, params.text);
        }
        return null;
    }
}
