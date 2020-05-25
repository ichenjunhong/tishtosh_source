package com.p683ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.bullet.C24098a;
import com.p683ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.p683ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod.C24112a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29907m;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47787cs;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod */
public final class OpenSchemaMethod extends BaseBridgeMethod {

    /* renamed from: b */
    public static final C24201a f64213b = new C24201a(null);

    /* renamed from: c */
    private final String f64214c = "openSchema";

    /* renamed from: d */
    private C10269a f64215d = C10269a.PROTECT;

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod$a */
    public static final class C24201a {
        private C24201a() {
        }

        public /* synthetic */ C24201a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.framework.OpenSchemaMethod$b */
    static final class C24202b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ OpenSchemaMethod f64216a;

        /* renamed from: b */
        final /* synthetic */ String f64217b;

        /* renamed from: c */
        final /* synthetic */ String f64218c;

        /* renamed from: d */
        final /* synthetic */ C24112a f64219d;

        C24202b(OpenSchemaMethod openSchemaMethod, String str, String str2, C24112a aVar) {
            this.f64216a = openSchemaMethod;
            this.f64217b = str;
            this.f64218c = str2;
            this.f64219d = aVar;
        }

        public final void run() {
            String str;
            IBulletService a = C24098a.m58973a();
            String str2 = this.f64217b;
            if (str2 == null) {
                str2 = "";
            }
            Activity activityById = a.getActivityById(str2);
            if (TextUtils.isEmpty(this.f64218c) || activityById == null) {
                this.f64219d.mo49910a(-1, "schema is not legal");
                return;
            }
            String str3 = this.f64218c;
            if (str3 != null && C52830p.m112411b(str3, "aweme://live/", false, 2, null)) {
                Uri parse = Uri.parse(this.f64218c);
                String queryParameter = parse.getQueryParameter("room_id");
                String queryParameter2 = parse.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                    C23060d.f61431e.mo47789a((Context) activityById, C52830p.m112401a(this.f64218c, "aweme", C23057c.f61423a, false, 4, (Object) null), (String) null);
                    this.f64219d.mo49911a((Object) new JSONObject());
                    return;
                }
                this.f64219d.mo49910a(-1, "");
            } else if (C47787cs.m103416a(this.f64218c)) {
                ILiveOuterService a2 = C36173w.m81665a();
                C52711k.m112236a((Object) a2, "ServiceManager.get().get…OuterService::class.java)");
                if (a2.getLive().mo74830p()) {
                    this.f64219d.mo49911a((Object) new JSONObject());
                } else {
                    this.f64219d.mo49910a(-1, "");
                }
            } else if (C29907m.m70059a(this.f64218c)) {
                this.f64219d.mo49911a((Object) new JSONObject());
            } else {
                Context context = activityById;
                boolean a3 = OpenSchemaMethod.m59206a(context, this.f64218c);
                if (!a3) {
                    String str4 = this.f64218c;
                    if (str4 != null) {
                        str = C52830p.m112401a(str4, "aweme", C23057c.f61423a, false, 4, (Object) null);
                    } else {
                        str = null;
                    }
                    a3 = C23060d.f61431e.mo47789a(context, str, (String) null);
                }
                if (a3) {
                    this.f64219d.mo49911a((Object) new JSONObject());
                } else {
                    this.f64219d.mo49910a(-1, "");
                }
            }
        }
    }

    /* renamed from: b */
    public final C10269a mo18297b() {
        return this.f64215d;
    }

    /* renamed from: d */
    public final String mo18313d() {
        return this.f64214c;
    }

    /* renamed from: a */
    public final void mo18296a(C10269a aVar) {
        C52711k.m112240b(aVar, "<set-?>");
        this.f64215d = aVar;
    }

    public OpenSchemaMethod(C10326b bVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* renamed from: b */
    private final void m59208b(String str) {
        String str2;
        Context e = mo18743e();
        if (!(e instanceof Activity)) {
            m59206a((Context) null, str);
        } else if (!C29907m.m70059a(str) && !m59206a(e, str)) {
            if (str != null) {
                str2 = C52830p.m112401a(str, "aweme", C23057c.f61423a, false, 4, (Object) null);
            } else {
                str2 = null;
            }
            C23060d.f61431e.mo47789a(e, str2, (String) null);
        }
    }

    /* renamed from: a */
    public static boolean m59206a(Context context, String str) {
        if (context != null) {
            return C41302w.m91042a().mo83861a(str);
        }
        return C41302w.m91042a().mo83858a((Activity) context, str);
    }

    /* renamed from: a */
    public final void mo49906a(JSONObject jSONObject, C24112a aVar) {
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(aVar, "iReturn");
        String optString = jSONObject.optString("reactId");
        String optString2 = jSONObject.optString("schema");
        switch (C24224b.f64270a[mo49908h().ordinal()]) {
            case 1:
                m59208b(optString2);
                return;
            case 2:
                m59208b(optString2);
                aVar.mo49911a((Object) new JSONObject());
                return;
            case 3:
                new Handler(Looper.getMainLooper()).post(new C24202b(this, optString, optString2, aVar));
                break;
        }
    }
}
