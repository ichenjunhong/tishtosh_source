package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod */
public final class OpenSchemaMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29824a f77873a = new C29824a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.OpenSchemaMethod$a */
    public static final class C29824a {
        private C29824a() {
        }

        public /* synthetic */ C29824a(C52707g gVar) {
            this();
        }
    }

    public OpenSchemaMethod() {
        this(null, 1, null);
    }

    public OpenSchemaMethod(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        String str;
        Context context;
        String str2;
        Context context2;
        if (jSONObject != null) {
            str = jSONObject.optString("schema");
        } else {
            str = null;
        }
        if (this.f77795g != null) {
            if (this.f77793e.get() == null) {
                C41302w.m91042a().mo83861a(str);
            } else if (!C29907m.m70059a(str)) {
                Context context3 = (Context) this.f77793e.get();
                if (!(context3 instanceof Activity)) {
                    context = null;
                } else {
                    context = context3;
                }
                Activity activity = (Activity) context;
                if (activity == null) {
                    if (!(context3 instanceof MutableContextWrapper)) {
                        context3 = null;
                    }
                    MutableContextWrapper mutableContextWrapper = (MutableContextWrapper) context3;
                    if (mutableContextWrapper != null) {
                        context2 = mutableContextWrapper.getBaseContext();
                    } else {
                        context2 = null;
                    }
                    if (!(context2 instanceof Activity)) {
                        context2 = null;
                    }
                    activity = (Activity) context2;
                }
                if (!C41302w.m91042a().mo83858a(activity, str)) {
                    if (str != null) {
                        str2 = C52830p.m112401a(str, "aweme", C23057c.f61423a, false, 4, (Object) null);
                    } else {
                        str2 = null;
                    }
                    C23060d.f61431e.mo47789a((Context) this.f77793e.get(), str2, (String) null);
                }
            }
        }
    }

    private /* synthetic */ OpenSchemaMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
