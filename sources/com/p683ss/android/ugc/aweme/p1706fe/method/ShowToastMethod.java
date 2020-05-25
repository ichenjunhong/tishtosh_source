package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.ShowToastMethod */
public final class ShowToastMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29842a f77913a = new C29842a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShowToastMethod$a */
    public static final class C29842a {
        private C29842a() {
        }

        public /* synthetic */ C29842a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.ShowToastMethod$b */
    static final class C29843b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f77914a;

        /* renamed from: b */
        final /* synthetic */ String f77915b;

        C29843b(Context context, String str) {
            this.f77914a = context;
            this.f77915b = str;
        }

        public final void run() {
            C10691a.m21537a(this.f77914a, this.f77915b).mo19066a();
        }
    }

    public ShowToastMethod() {
        this(null, 1, null);
    }

    public ShowToastMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        String str;
        if (jSONObject != null) {
            str = jSONObject.optString("message");
        } else {
            str = null;
        }
        new Handler(Looper.getMainLooper()).post(new C29843b((Context) this.f77793e.get(), str));
    }

    private /* synthetic */ ShowToastMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
