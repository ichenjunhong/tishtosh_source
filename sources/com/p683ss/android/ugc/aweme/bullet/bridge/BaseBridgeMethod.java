package com.p683ss.android.ugc.aweme.bullet.bridge;

import android.app.Activity;
import android.arch.lifecycle.C0183j;
import com.bytedance.ies.bullet.p628b.C10244c;
import com.bytedance.ies.bullet.p628b.p633e.C10254a;
import com.bytedance.ies.bullet.p628b.p633e.C10290i;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10270b;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10276j;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.bullet.p653ui.common.C10577d;
import com.bytedance.ies.bullet.p653ui.common.p654a.C10561a;
import com.bytedance.ies.bullet.p653ui.common.p656c.C10573c;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod */
public abstract class BaseBridgeMethod extends C10561a implements C0183j {

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$a */
    public interface C24112a {
        /* renamed from: a */
        void mo49910a(int i, String str);

        /* renamed from: a */
        void mo49911a(Object obj);

        /* renamed from: a */
        void mo49912a(Object obj, int i, String str);

        /* renamed from: a */
        void mo49913a(JSONObject jSONObject);
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$b */
    public static final class C24113b implements C24112a {

        /* renamed from: a */
        final /* synthetic */ C10270b f63987a;

        C24113b(C10270b bVar) {
            this.f63987a = bVar;
        }

        /* renamed from: a */
        public final void mo49911a(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 1);
                jSONObject.put("data", obj);
                this.f63987a.mo18315a(jSONObject);
            } catch (JSONException unused) {
            }
        }

        /* renamed from: a */
        public final void mo49913a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    this.f63987a.mo18315a(jSONObject);
                } catch (JSONException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo49910a(int i, String str) {
            C10270b bVar = this.f63987a;
            if (str == null) {
                str = "";
            }
            bVar.mo18314a(i, str);
        }

        /* renamed from: a */
        public final void mo49912a(Object obj, int i, String str) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", i);
                jSONObject.put("msg", str);
                jSONObject.put("data", obj);
                this.f63987a.mo18315a(jSONObject);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod$c */
    public static final class C24114c implements C10276j {

        /* renamed from: a */
        public final JSONObject f63988a;

        /* renamed from: b */
        final /* synthetic */ String f63989b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f63990c;

        /* renamed from: d */
        private final String f63991d;

        /* renamed from: a */
        public final String mo18285a() {
            return this.f63991d;
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo18286b() {
            return this.f63988a;
        }

        C24114c(String str, JSONObject jSONObject) {
            this.f63989b = str;
            this.f63990c = jSONObject;
            this.f63991d = str;
            this.f63988a = jSONObject;
        }
    }

    /* renamed from: a */
    public void mo49906a(JSONObject jSONObject, C24112a aVar) throws JSONException {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
    }

    /* renamed from: g */
    public final C10290i mo49907g() {
        return (C10290i) this.f27647a.mo18401c(C10290i.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final C10254a mo49908h() {
        C10290i g = mo49907g();
        if (g != null) {
            C10254a c = g.mo18345c();
            if (c != null) {
                return c;
            }
        }
        return C10254a.RN;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C10757a mo49909i() {
        return (C10757a) this.f27647a.mo18401c(C10757a.class);
    }

    public BaseBridgeMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: a */
    protected static C10766h m58998a(JSONObject jSONObject) {
        C52711k.m112240b(jSONObject, "params");
        C10766h hVar = new C10766h();
        hVar.f28947d = jSONObject;
        JSONObject optJSONObject = jSONObject.optJSONObject("jsMsg");
        if (optJSONObject != null) {
            hVar.f28944a = optJSONObject.optString("type");
            hVar.f28946c = optJSONObject.optString("func");
            hVar.f28945b = optJSONObject.optString("callback_id");
            hVar.f28948e = optJSONObject.optInt(C42311c.f106863g);
            hVar.f28951h = optJSONObject.optBoolean("needCallback");
        }
        return hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Activity mo49904a(String str) {
        if (str == null) {
            return null;
        }
        C10244c cVar = (C10244c) this.f27647a.mo18401c(C10244c.class);
        if (cVar != null) {
            C10290i a = cVar.mo18261a(str);
            if (a != null) {
                if (!(a instanceof C10573c)) {
                    a = null;
                }
                C10573c cVar2 = (C10573c) a;
                if (cVar2 != null) {
                    C10577d y = cVar2.mo18755y();
                    if (y != null) {
                        return y.mo18708a();
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo49905a(String str, JSONObject jSONObject) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(jSONObject, "params");
        C10290i g = mo49907g();
        if (g != null) {
            g.onEvent(new C24114c(str, jSONObject));
        }
    }

    /* renamed from: a */
    public final void mo18312a(JSONObject jSONObject, C10270b bVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(bVar, "callback");
        mo49906a(jSONObject, (C24112a) new C24113b(bVar));
    }
}
