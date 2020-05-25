package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C16299uq
public final class alc implements C15948hq<aib> {
    /* renamed from: a */
    private static Integer m33193a(Map<String, String> map, String str) {
        if (!map.containsKey(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt((String) map.get(str)));
        } catch (NumberFormatException unused) {
            String str2 = (String) map.get(str);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length());
            sb.append("Precache invalid numeric parameter '");
            sb.append(str);
            sb.append("': ");
            sb.append(str2);
            abv.m32798e(sb.toString());
            return null;
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        akt akt;
        aib aib = (aib) obj;
        if (abv.m32791a(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            String valueOf = String.valueOf(jSONObject);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("Precache GMSG: ");
            sb.append(valueOf);
            abv.m32792b(sb.toString());
        }
        if (map.containsKey("abort")) {
            if (!aks.m33177a(aib)) {
                abv.m32798e("Precache abort but no precache task running.");
            }
            return;
        }
        String str = (String) map.get("src");
        if (str != null) {
            String[] strArr = {str};
            String str2 = (String) map.get("demuxed");
            if (str2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    String[] strArr2 = new String[jSONArray.length()];
                    for (int i = 0; i < jSONArray.length(); i++) {
                        strArr2[i] = jSONArray.getString(i);
                    }
                    strArr = strArr2;
                } catch (JSONException unused) {
                    String str3 = "Malformed demuxed URL list for precache: ";
                    String valueOf2 = String.valueOf(str2);
                    abv.m32798e(valueOf2.length() != 0 ? str3.concat(valueOf2) : new String(str3));
                    strArr = null;
                }
            }
            if (strArr == null) {
                strArr = new String[]{str};
            }
            if (aks.m33178b(aib) != null) {
                abv.m32798e("Precache task is already running.");
                return;
            } else if (aib.mo28939e() == null) {
                abv.m32798e("Precache requires a dependency provider.");
                return;
            } else {
                aia aia = new aia((String) map.get("flags"));
                Integer a = m33193a(map, "player");
                if (a == null) {
                    a = Integer.valueOf(0);
                }
                akt = aib.mo28939e().f38689a.mo29084a(aib, a.intValue(), null, aia);
                new akq(aib, akt, str, strArr).mo28618c();
            }
        } else {
            akq b = aks.m33178b(aib);
            if (b != null) {
                akt = b.f40777b;
            } else {
                abv.m32798e("Precache must specify a source.");
                return;
            }
        }
        Integer a2 = m33193a(map, "minBufferMs");
        if (a2 != null) {
            akt.mo29096b(a2.intValue());
        }
        Integer a3 = m33193a(map, "maxBufferMs");
        if (a3 != null) {
            akt.mo29089a(a3.intValue());
        }
        Integer a4 = m33193a(map, "bufferForPlaybackMs");
        if (a4 != null) {
            akt.mo29097c(a4.intValue());
        }
        Integer a5 = m33193a(map, "bufferForPlaybackAfterRebufferMs");
        if (a5 != null) {
            akt.mo29098d(a5.intValue());
        }
    }
}
