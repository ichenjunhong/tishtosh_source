package com.p683ss.android.ugc.aweme.p1706fe.method;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.base.activity.C23423b;
import com.p683ss.android.ugc.aweme.crossplatform.activity.AbsActivityContainer;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22507e;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2647j.C52751c;
import p2628d.p2647j.C52753d;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePushMethod */
public final class RoutePushMethod extends BaseCommonJavaMethod {

    /* renamed from: c */
    public static final C52751c f77890c = C52753d.m112320b(50000, 60000);

    /* renamed from: d */
    public static final C29833a f77891d = new C29833a(null);

    /* renamed from: a */
    public final Map<Integer, C29789a> f77892a;

    /* renamed from: b */
    public final C10757a f77893b;

    /* renamed from: h */
    private int f77894h;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePushMethod$a */
    public static final class C29833a {
        private C29833a() {
        }

        public /* synthetic */ C29833a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RoutePushMethod$b */
    public static final class C29834b implements C23423b {

        /* renamed from: a */
        final /* synthetic */ AbsActivityContainer f77895a;

        /* renamed from: b */
        final /* synthetic */ String f77896b;

        /* renamed from: c */
        final /* synthetic */ RoutePushMethod f77897c;

        /* renamed from: d */
        final /* synthetic */ C29789a f77898d;

        /* renamed from: a */
        public final boolean mo48596a(int i, int i2, Intent intent) {
            JSONObject jSONObject;
            if (i2 == 50000) {
                C29789a aVar = (C29789a) this.f77897c.f77892a.remove(Integer.valueOf(i));
                if (aVar != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    if (intent != null) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("serialized_data");
                            if (string != null) {
                                try {
                                    jSONObject = new JSONObject(string).optJSONObject("data");
                                } catch (JSONException unused) {
                                    jSONObject = null;
                                }
                                if (jSONObject != null) {
                                    C22507e.m55596a(jSONObject2, jSONObject);
                                }
                            }
                        }
                    }
                    aVar.mo60040a(jSONObject2, 1, "push callback succeed");
                }
            }
            this.f77895a.mo55371b(this);
            return false;
        }

        C29834b(AbsActivityContainer absActivityContainer, String str, RoutePushMethod routePushMethod, C29789a aVar) {
            this.f77895a = absActivityContainer;
            this.f77896b = str;
            this.f77897c = routePushMethod;
            this.f77898d = aVar;
        }
    }

    public RoutePushMethod() {
        this(null, 1, null);
    }

    public RoutePushMethod(C10757a aVar) {
        super(aVar);
        this.f77893b = aVar;
        this.f77892a = new LinkedHashMap();
        this.f77894h = f77890c.f130995a;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("schema");
            if (optString != null) {
                if (!(!TextUtils.isEmpty(optString))) {
                    optString = null;
                }
                if (optString != null) {
                    AbsActivityContainer a = mo60033a();
                    if (a != null) {
                        a.mo55367a((C23423b) new C29834b(a, optString, this, aVar));
                        if (a.mo55370a(optString, this.f77894h)) {
                            this.f77892a.put(Integer.valueOf(this.f77894h), aVar);
                            this.f77894h++;
                            if (this.f77894h > f77890c.f130996b) {
                                this.f77894h = f77890c.f130995a;
                                return;
                            }
                        } else {
                            aVar.mo60038a(-1, "router not supported");
                        }
                        return;
                    }
                }
            }
        }
        aVar.mo60038a(-1, "params not valid");
    }

    private /* synthetic */ RoutePushMethod(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
