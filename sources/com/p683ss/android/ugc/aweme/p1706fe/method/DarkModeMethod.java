package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47887fi;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.DarkModeMethod */
public final class DarkModeMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29795a f77804a = new C29795a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.DarkModeMethod$a */
    public static final class C29795a {
        private C29795a() {
        }

        public /* synthetic */ C29795a(C52707g gVar) {
            this();
        }
    }

    public DarkModeMethod() {
        this(null, 1, null);
    }

    public DarkModeMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("enable");
        } else {
            str = null;
        }
        try {
            Object obj = this.f77793e.get();
            if (obj != null) {
                CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) obj;
                C47887fi.f120483a.mo95098a(crossPlatformActivity, crossPlatformActivity.getWindow(), TextUtils.equals(str, "true"));
                aVar.mo60039a((Object) new C18085o());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
        } catch (Exception unused) {
            aVar.mo60038a(0, "");
        }
    }

    private /* synthetic */ DarkModeMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
