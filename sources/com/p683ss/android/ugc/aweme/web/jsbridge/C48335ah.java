package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import com.bytedance.sdk.account.p849b.p852c.C13029c.C13030a;
import com.google.gson.C17971f;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.openauthorize.C38478c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ah */
public final class C48335ah implements C10762d, C38478c {

    /* renamed from: a */
    private String f121614a;

    /* renamed from: b */
    private String f121615b;

    /* renamed from: c */
    private String f121616c;

    /* renamed from: d */
    private String f121617d;

    /* renamed from: e */
    private final WeakReference<Context> f121618e;

    /* renamed from: f */
    private final C10757a f121619f;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.ah$a */
    public static final class C48336a extends C17956a<HashMap<String, Integer>> {
        C48336a() {
        }
    }

    public C48335ah(WeakReference<Context> weakReference, C10757a aVar) {
        C52711k.m112240b(weakReference, "contextRef");
        C52711k.m112240b(aVar, "jsBridge");
        this.f121618e = weakReference;
        this.f121619f = aVar;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        String str3;
        boolean z3;
        boolean z4;
        boolean z5;
        String str4;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        String str5 = null;
        if (hVar != null) {
            str = hVar.f28945b;
        } else {
            str = null;
        }
        this.f121614a = str;
        boolean z6 = true;
        if (hVar != null) {
            JSONObject jSONObject2 = hVar.f28947d;
            if (jSONObject2 != null && jSONObject2.has("client_key")) {
                JSONObject jSONObject3 = hVar.f28947d;
                if (jSONObject3 != null) {
                    str4 = jSONObject3.getString("client_key");
                } else {
                    str4 = null;
                }
                this.f121615b = str4;
            }
        }
        if (hVar != null) {
            JSONObject jSONObject4 = hVar.f28947d;
            if (jSONObject4 != null && jSONObject4.has("scopes")) {
                JSONObject jSONObject5 = hVar.f28947d;
                if (jSONObject5 != null) {
                    str3 = jSONObject5.getString("scopes");
                } else {
                    str3 = null;
                }
                Object a = new C17971f().mo34885a(str3, new C48336a().f49843c);
                C52711k.m112236a(a, "Gson().fromJson(scopes, …p<String, Int>>(){}.type)");
                for (Entry entry : ((HashMap) a).entrySet()) {
                    String str6 = (String) entry.getKey();
                    int intValue = ((Number) entry.getValue()).intValue();
                    if (intValue == 0) {
                        if (sb.length() > 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            sb.append(",");
                        }
                        sb.append(str6);
                    } else if (intValue == 1) {
                        if (sb2.length() > 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            sb2.append(",");
                        }
                        sb2.append(str6);
                    } else if (intValue == 2) {
                        if (sb3.length() > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            sb3.append(",");
                        }
                        sb3.append(str6);
                    }
                }
            }
        }
        if (hVar != null) {
            JSONObject jSONObject6 = hVar.f28947d;
            if (jSONObject6 != null && jSONObject6.has("state")) {
                JSONObject jSONObject7 = hVar.f28947d;
                if (jSONObject7 != null) {
                    str2 = jSONObject7.getString("state");
                } else {
                    str2 = null;
                }
                this.f121616c = str2;
            }
        }
        if (hVar != null) {
            JSONObject jSONObject8 = hVar.f28947d;
            if (jSONObject8 != null && jSONObject8.has("redirect_uri")) {
                JSONObject jSONObject9 = hVar.f28947d;
                if (jSONObject9 != null) {
                    str5 = jSONObject9.getString("redirect_uri");
                }
                this.f121617d = str5;
            }
        }
        C13030a aVar = new C13030a();
        aVar.f34044a = this.f121616c;
        aVar.f34045b = this.f121617d;
        if (sb.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            aVar.f34049f = sb.toString();
        }
        if (sb2.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            aVar.f34050g = sb2.toString();
        }
        if (sb3.length() <= 0) {
            z6 = false;
        }
        if (z6) {
            aVar.f34051h = sb3.toString();
        }
        aVar.f34046c = this.f121615b;
        aVar.f34047d = "wap_to_native";
        Bundle bundle = new Bundle();
        aVar.toBundle(bundle);
        if (hVar != null) {
            hVar.f28951h = false;
        }
        if (this.f121618e.get() instanceof FragmentActivity) {
            Object obj = this.f121618e.get();
            if (obj != null) {
                I18nBridgeService.getBridgeService_Monster().startAuthHalfDialog((FragmentActivity) obj, bundle, this);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }
}
