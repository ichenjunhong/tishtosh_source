package com.facebook.p909a.p912b;

import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import com.facebook.C14533n;
import com.facebook.internal.C14332n;
import com.facebook.p909a.C13573e;
import com.facebook.p909a.C13581g.C13582a;
import com.facebook.p909a.C13583h;
import com.facebook.p909a.C13586i;
import com.facebook.p909a.C13589l;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.b.e */
public class C13557e {

    /* renamed from: a */
    public static final AtomicBoolean f35375a = new AtomicBoolean(false);

    /* renamed from: b */
    public static Boolean f35376b = null;

    /* renamed from: c */
    public static Boolean f35377c = null;

    /* renamed from: d */
    public static ServiceConnection f35378d;

    /* renamed from: e */
    public static ActivityLifecycleCallbacks f35379e;

    /* renamed from: f */
    public static Intent f35380f;

    /* renamed from: g */
    public static Object f35381g;

    /* renamed from: h */
    private static final String f35382h = C13557e.class.getCanonicalName();

    /* renamed from: a */
    public static void m27375a(Context context, ArrayList<String> arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException unused) {
                }
            }
            for (Entry entry : C13562f.m27382a(context, arrayList2, f35381g, z).entrySet()) {
                String str2 = (String) hashMap.get(entry.getKey());
                String str3 = (String) entry.getValue();
                if (C13555d.m27374a()) {
                    C13556a a = C13555d.m27373a(str2, str3, new HashMap());
                    if (a != null) {
                        boolean z2 = false;
                        if (z && C14332n.m29392a("app_events_if_auto_log_subs", C14533n.m29777k(), false)) {
                            z2 = true;
                        }
                        if (z2) {
                            boolean a2 = C13562f.m27384a(str3);
                            C13589l lVar = C13555d.f35370a;
                            BigDecimal bigDecimal = a.f35372a;
                            Currency currency = a.f35373b;
                            Bundle bundle = a.f35374c;
                            if (C14533n.m29780n()) {
                                C13583h hVar = lVar.f35451a;
                                if (!(bigDecimal == null || currency == null)) {
                                    if (bundle == null) {
                                        bundle = new Bundle();
                                    }
                                    bundle.putString("fb_currency", currency.getCurrencyCode());
                                    Double.valueOf(bigDecimal.doubleValue());
                                }
                            }
                        } else {
                            C13589l lVar2 = C13555d.f35370a;
                            BigDecimal bigDecimal2 = a.f35372a;
                            Currency currency2 = a.f35373b;
                            Bundle bundle2 = a.f35374c;
                            if (C14533n.m29780n()) {
                                C13583h hVar2 = lVar2.f35451a;
                                if (bigDecimal2 == null) {
                                    C13583h.m27419a("purchaseAmount cannot be null");
                                } else if (currency2 == null) {
                                    C13583h.m27419a("currency cannot be null");
                                } else {
                                    if (bundle2 == null) {
                                        bundle2 = new Bundle();
                                    }
                                    bundle2.putString("fb_currency", currency2.getCurrencyCode());
                                    Double.valueOf(bigDecimal2.doubleValue());
                                    if (C13583h.m27417a() != C13582a.EXPLICIT_ONLY) {
                                        C13573e.m27408a(C13586i.EAGER_FLUSHING_EVENT);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
