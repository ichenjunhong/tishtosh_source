package com.p683ss.android.ugc.aweme.p1706fe.method;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.utils.C47673an;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RequestAddressBookPermission */
public final class RequestAddressBookPermission extends BaseCommonJavaMethod {

    /* renamed from: a */
    public static final C29829a f77880a = new C29829a(null);

    /* renamed from: com.ss.android.ugc.aweme.fe.method.RequestAddressBookPermission$a */
    public static final class C29829a {
        private C29829a() {
        }

        public /* synthetic */ C29829a(C52707g gVar) {
            this();
        }
    }

    public RequestAddressBookPermission() {
        this(null, 1, null);
    }

    public RequestAddressBookPermission(C10757a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (C47673an.m103185b(AwemeApplication.m56199a())) {
            aVar.mo60040a("", 1, "");
        } else {
            aVar.mo60038a(0, "");
        }
    }

    private /* synthetic */ RequestAddressBookPermission(C10757a aVar, int i, C52707g gVar) {
        this(null);
    }
}
