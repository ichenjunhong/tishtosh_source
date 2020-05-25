package com.bytedance.p126ad.symphony.p138h;

import com.bytedance.p126ad.symphony.p139i.C2745d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ad.symphony.h.a */
public final class C2739a {

    /* renamed from: a */
    public static final C2739a f8277a = new C2739a();

    /* renamed from: b */
    public int f8278b;

    /* renamed from: c */
    public Map<String, String> f8279c;

    /* renamed from: d */
    public String f8280d;

    /* renamed from: e */
    String f8281e;

    /* renamed from: f */
    private List<Integer> f8282f;

    /* renamed from: g */
    private List<List<Integer>> f8283g;

    /* renamed from: h */
    private List<String> f8284h;

    /* renamed from: i */
    private List<Integer> f8285i;

    /* renamed from: a */
    public final String mo7293a() {
        return this.f8281e;
    }

    /* renamed from: c */
    public final List<List<Integer>> mo7295c() {
        if (this.f8283g != null) {
            return this.f8283g;
        }
        return new ArrayList();
    }

    /* renamed from: d */
    public final List<Integer> mo7296d() {
        if (this.f8285i == null) {
            this.f8285i = new ArrayList();
        }
        return this.f8285i;
    }

    /* renamed from: b */
    public final List<Integer> mo7294b() {
        this.f8282f = m7817a(this.f8282f);
        if (this.f8282f != null) {
            return this.f8282f;
        }
        return new ArrayList();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("displaySort-->");
        sb.append(mo7294b());
        if (C2745d.m7836a(this.f8283g)) {
            sb.append("preloadSort-->");
            sb.append(mo7295c());
        }
        if (this.f8285i != null && !this.f8285i.isEmpty()) {
            sb.append(this.f8285i);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static List<Integer> m7817a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Integer) it.next()) == null) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C2739a m7816a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                C2739a aVar = new C2739a();
                aVar.f8281e = jSONObject.toString();
                JSONArray optJSONArray = jSONObject.optJSONArray("display_sort");
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(Integer.valueOf(optJSONArray.getInt(i)));
                    }
                    aVar.f8282f = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("preload_sort");
                if (optJSONArray2 != null) {
                    ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i2);
                        if (optJSONArray3 != null) {
                            ArrayList arrayList3 = new ArrayList(optJSONArray3.length());
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                arrayList3.add(Integer.valueOf(optJSONArray3.getInt(i3)));
                            }
                            arrayList2.add(arrayList3);
                        }
                        aVar.f8283g = arrayList2;
                    }
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("keywords");
                if (optJSONArray4 != null) {
                    ArrayList arrayList4 = new ArrayList(optJSONArray4.length());
                    for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                        arrayList4.add(optJSONArray4.optString(i4, ""));
                    }
                    aVar.f8284h = arrayList4;
                }
                aVar.f8278b = jSONObject.optInt("gender");
                JSONArray optJSONArray5 = jSONObject.optJSONArray("separated_preload_sort");
                if (optJSONArray5 != null) {
                    ArrayList arrayList5 = new ArrayList(optJSONArray5.length());
                    for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                        arrayList5.add(Integer.valueOf(optJSONArray5.getInt(i5)));
                    }
                    aVar.f8285i = arrayList5;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("custom_targeting");
                if (optJSONObject != null) {
                    aVar.f8279c = new HashMap();
                    Iterator keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        aVar.f8279c.put(str, optJSONObject.optString(str));
                    }
                }
                return aVar;
            } catch (JSONException unused) {
                new StringBuilder("strategy json is not valid,json string:").append(jSONObject.toString());
            }
        }
        return null;
    }
}
