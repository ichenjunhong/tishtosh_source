package com.p683ss.android.ugc.aweme.p1706fe.method;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.live.p1920c.C36063b;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.DisableGestureClose */
public final class DisableGestureClose extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29796a f77805a = new C29796a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DisableGestureClose$a */
    public static final class C29796a {
        private C29796a() {
        }

        public /* synthetic */ C29796a(C52707g gVar) {
            this();
        }
    }

    public DisableGestureClose() {
        this(null, 1, null);
    }

    public DisableGestureClose(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        int i;
        if (jSONObject != null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("args");
            if (optJSONObject != null) {
                i = optJSONObject.optInt("disable_gesture");
                C47718bf.m103288a(new C36063b(i));
            }
        }
        i = 0;
        C47718bf.m103288a(new C36063b(i));
    }

    private /* synthetic */ DisableGestureClose(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
