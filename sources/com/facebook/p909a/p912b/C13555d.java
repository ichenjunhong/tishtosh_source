package com.facebook.p909a.p912b;

import android.os.Bundle;
import com.facebook.C14533n;
import com.facebook.internal.C14336o;
import com.facebook.internal.C14338p;
import com.facebook.p909a.C13589l;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.d */
public class C13555d {

    /* renamed from: a */
    static final C13589l f35370a = new C13589l(C14533n.m29773g());

    /* renamed from: b */
    private static final String f35371b = C13555d.class.getCanonicalName();

    /* renamed from: com.facebook.a.b.d$a */
    static class C13556a {

        /* renamed from: a */
        BigDecimal f35372a;

        /* renamed from: b */
        Currency f35373b;

        /* renamed from: c */
        Bundle f35374c;

        C13556a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f35372a = bigDecimal;
            this.f35373b = currency;
            this.f35374c = bundle;
        }
    }

    /* renamed from: a */
    public static boolean m27374a() {
        C14336o a = C14338p.m29397a(C14533n.m29777k());
        if (a == null || !C14533n.m29780n() || !a.f37299k) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static C13556a m27373a(String str, String str2, Map<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject jSONObject2 = new JSONObject(str2);
            Bundle bundle = new Bundle(1);
            bundle.putCharSequence("fb_iap_product_id", jSONObject.getString("productId"));
            bundle.putCharSequence("fb_iap_purchase_time", jSONObject.getString("purchaseTime"));
            bundle.putCharSequence("fb_iap_purchase_token", jSONObject.getString("purchaseToken"));
            bundle.putCharSequence("fb_iap_package_name", jSONObject.optString("packageName"));
            bundle.putCharSequence("fb_iap_product_title", jSONObject2.optString("title"));
            bundle.putCharSequence("fb_iap_product_description", jSONObject2.optString("description"));
            String optString = jSONObject2.optString("type");
            bundle.putCharSequence("fb_iap_product_type", optString);
            if (optString.equals("subs")) {
                bundle.putCharSequence("fb_iap_subs_auto_renewing", Boolean.toString(jSONObject.optBoolean("autoRenewing", false)));
                bundle.putCharSequence("fb_iap_subs_period", jSONObject2.optString("subscriptionPeriod"));
                bundle.putCharSequence("fb_free_trial_period", jSONObject2.optString("freeTrialPeriod"));
                String optString2 = jSONObject2.optString("introductoryPriceCycles");
                if (!optString2.isEmpty()) {
                    bundle.putCharSequence("fb_intro_price_amount_micros", jSONObject2.optString("introductoryPriceAmountMicros"));
                    bundle.putCharSequence("fb_intro_price_cycles", optString2);
                }
            }
            for (String str3 : map.keySet()) {
                bundle.putCharSequence(str3, (CharSequence) map.get(str3));
            }
            double d = (double) jSONObject2.getLong("price_amount_micros");
            Double.isNaN(d);
            return new C13556a(new BigDecimal(d / 1000000.0d), Currency.getInstance(jSONObject2.getString("price_currency_code")), bundle);
        } catch (JSONException unused) {
            return null;
        }
    }
}
