package com.bytedance.android.live.wallet.p263f;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdkapi.host.C8807k;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.wallet.f.a */
public final class C4423a {

    /* renamed from: com.bytedance.android.live.wallet.f.a$a */
    public enum C4424a {
        CREATE_ORDER("create"),
        ALI_PAY("alipay"),
        WECHAT_PAY("wxpay"),
        GOOGLE_PAY("google_pay"),
        CHECK_ORDER("check"),
        WALLET("wallet"),
        VERIFY("verify"),
        CONSUME("consume");
        
        public final String domain;

        public final String getDomain() {
            return this.domain;
        }

        private C4424a(String str) {
            this.domain = str;
        }
    }

    /* renamed from: a */
    public static void m10738a() {
        m10739a(0);
    }

    /* renamed from: a */
    private static void m10739a(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pay_type", 0);
        } catch (JSONException unused) {
        }
        C3837e.m9750c("hotsoon_live_recharge_failure_rate", 0, jSONObject);
    }

    /* renamed from: a */
    public static void m10740a(C4424a aVar, Exception exc) {
        m10741a(aVar, exc, 0);
    }

    /* renamed from: a */
    public static void m10744a(C8807k kVar, Exception exc) {
        if (exc instanceof C2949a) {
            C2949a aVar = (C2949a) exc;
            m10743a(kVar, aVar.getErrorCode(), aVar.getErrorMsg(), (JSONObject) null);
        } else if (exc instanceof C9872a) {
            m10743a(kVar, 2, exc.toString(), (JSONObject) null);
        } else if (exc instanceof IOException) {
            m10743a(kVar, 3, exc.toString(), (JSONObject) null);
        } else {
            m10743a(kVar, 0, exc.toString(), (JSONObject) null);
        }
    }

    /* renamed from: a */
    public static void m10745a(C8807k kVar, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorDomain", kVar);
            C3837e.m9750c("hotsoon_live_create_order_failure_rate", 0, jSONObject2);
        } catch (JSONException e) {
            C3831a.m9714b("OrderMonitor", (Throwable) e);
        }
    }

    /* renamed from: a */
    private static void m10741a(C4424a aVar, Exception exc, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pay_type", 0);
        } catch (JSONException unused) {
        }
        if (exc instanceof C2949a) {
            C2949a aVar2 = (C2949a) exc;
            m10742a(aVar, String.valueOf(aVar2.getErrorCode()), aVar2.getErrorMsg(), jSONObject);
            return;
        }
        m10742a(aVar, "0", exc.toString(), jSONObject);
    }

    /* renamed from: a */
    public static void m10742a(C4424a aVar, String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            try {
                jSONObject = new JSONObject();
            } catch (JSONException unused) {
                return;
            }
        }
        jSONObject.put("errorDomain", aVar.domain);
        jSONObject.put("errorCode", str);
        jSONObject.put("errorDesc", str2);
        C3837e.m9750c("hotsoon_live_recharge_failure_rate", 1, jSONObject);
    }

    /* renamed from: a */
    public static void m10743a(C8807k kVar, int i, String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("errorDomain", kVar);
            jSONObject2.put("errorCode", i);
            jSONObject2.put("errorDesc", str);
            C3837e.m9750c("hotsoon_live_create_order_failure_rate", 1, jSONObject2);
        } catch (JSONException e) {
            C3831a.m9714b("OrderMonitor", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static JSONObject m10737a(int i, long j, String str, String str2, String str3, long j2, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("item_id", j);
            jSONObject.put("iap_id", str);
            jSONObject.put("hotsoon_order_id", str2);
            jSONObject.put("iap_order_id", str3);
            jSONObject.put("purchase_time", 0);
            jSONObject.put("extra", str4);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
