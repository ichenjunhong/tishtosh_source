package com.facebook.applinks;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.C14457k;
import com.facebook.internal.C14277aa;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.applinks.a */
public class C13604a {

    /* renamed from: f */
    private static final String f35497f = C13604a.class.getCanonicalName();

    /* renamed from: a */
    public String f35498a;

    /* renamed from: b */
    public Uri f35499b;

    /* renamed from: c */
    JSONObject f35500c;

    /* renamed from: d */
    public Bundle f35501d;

    /* renamed from: e */
    public String f35502e;

    /* renamed from: com.facebook.applinks.a$a */
    public interface C13606a {
        /* renamed from: a */
        void mo25458a(C13604a aVar);
    }

    private C13604a() {
    }

    /* renamed from: a */
    private static Bundle m27470a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (obj instanceof JSONObject) {
                bundle.putBundle(str, m27470a((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                int i = 0;
                if (jSONArray.length() == 0) {
                    bundle.putStringArray(str, new String[0]);
                } else {
                    Object obj2 = jSONArray.get(0);
                    if (obj2 instanceof JSONObject) {
                        Bundle[] bundleArr = new Bundle[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            bundleArr[i] = m27470a(jSONArray.getJSONObject(i));
                            i++;
                        }
                        bundle.putParcelableArray(str, bundleArr);
                    } else if (!(obj2 instanceof JSONArray)) {
                        String[] strArr = new String[jSONArray.length()];
                        while (i < jSONArray.length()) {
                            strArr[i] = jSONArray.get(i).toString();
                            i++;
                        }
                        bundle.putStringArray(str, strArr);
                    } else {
                        throw new C14457k("Nested arrays are not supported.");
                    }
                }
            } else {
                bundle.putString(str, obj.toString());
            }
        }
        return bundle;
    }

    /* renamed from: a */
    static C13604a m27471a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(C42311c.f106863g);
            if (jSONObject.getJSONObject("bridge_args").getString("method").equals("applink") && string.equals("2")) {
                C13604a aVar = new C13604a();
                aVar.f35500c = jSONObject.getJSONObject("method_args");
                if (aVar.f35500c.has("ref")) {
                    aVar.f35498a = aVar.f35500c.getString("ref");
                } else if (aVar.f35500c.has("referer_data")) {
                    JSONObject jSONObject2 = aVar.f35500c.getJSONObject("referer_data");
                    if (jSONObject2.has("fb_ref")) {
                        aVar.f35498a = jSONObject2.getString("fb_ref");
                    }
                }
                if (aVar.f35500c.has("target_url")) {
                    aVar.f35499b = Uri.parse(aVar.f35500c.getString("target_url"));
                }
                if (aVar.f35500c.has("extras")) {
                    JSONObject jSONObject3 = aVar.f35500c.getJSONObject("extras");
                    if (jSONObject3.has("deeplink_context")) {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("deeplink_context");
                        if (jSONObject4.has("promo_code")) {
                            aVar.f35502e = jSONObject4.getString("promo_code");
                        }
                    }
                }
                aVar.f35501d = m27470a(aVar.f35500c);
                return aVar;
            }
        } catch (JSONException e) {
            C14277aa.m29270a(f35497f, "Unable to parse AppLink JSON", (Throwable) e);
        } catch (C14457k e2) {
            C14277aa.m29270a(f35497f, "Unable to parse AppLink JSON", (Throwable) e2);
        }
        return null;
    }
}
