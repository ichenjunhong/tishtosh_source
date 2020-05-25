package com.p683ss.android.ugc.aweme.account.login.p1292v2.p1293a;

import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21848h;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.r */
public final class C21675r extends Throwable {
    public static final C21676a Companion = new C21676a(null);

    /* renamed from: a */
    private final int f58707a;

    /* renamed from: b */
    private final String f58708b;

    /* renamed from: c */
    private final C21848h f58709c;

    /* renamed from: d */
    private final C21850i f58710d;

    /* renamed from: e */
    private JSONObject f58711e;

    /* renamed from: f */
    private final String f58712f;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.r$a */
    public static final class C21676a {
        private C21676a() {
        }

        public /* synthetic */ C21676a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C21675r m54395a(C21848h hVar, C21850i iVar) {
            C52711k.m112240b(hVar, "scene");
            C52711k.m112240b(iVar, "step");
            C21675r rVar = new C21675r(-1, "no data", hVar, iVar, null, "no data");
            return rVar;
        }
    }

    public final String getDetailErrorMsg() {
        return this.f58712f;
    }

    public final int getErrorCode() {
        return this.f58707a;
    }

    public final String getErrorMsg() {
        return this.f58708b;
    }

    public final JSONObject getExtra() {
        return this.f58711e;
    }

    public final C21848h getScene() {
        return this.f58709c;
    }

    public final C21850i getStep() {
        return this.f58710d;
    }

    public final void setExtra(JSONObject jSONObject) {
        this.f58711e = jSONObject;
    }

    public C21675r(int i, String str, C21848h hVar, C21850i iVar, JSONObject jSONObject, String str2) {
        C52711k.m112240b(hVar, "scene");
        C52711k.m112240b(iVar, "step");
        C52711k.m112240b(str2, "detailErrorMsg");
        super(str);
        this.f58707a = i;
        this.f58708b = str;
        this.f58709c = hVar;
        this.f58710d = iVar;
        this.f58711e = jSONObject;
        this.f58712f = str2;
    }

    public /* synthetic */ C21675r(int i, String str, C21848h hVar, C21850i iVar, JSONObject jSONObject, String str2, int i2, C52707g gVar) {
        if ((i2 & 32) != 0) {
            str2 = "";
        }
        this(i, str, hVar, iVar, jSONObject, str2);
    }
}
