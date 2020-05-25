package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.c */
public final class C14299c {

    /* renamed from: a */
    private static final Map<Class<?>, C14307a> f37247a;

    /* renamed from: com.facebook.internal.c$a */
    public interface C14307a {
        /* renamed from: a */
        void mo26518a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        f37247a = hashMap;
        hashMap.put(Boolean.class, new C14307a() {
            /* renamed from: a */
            public final void mo26518a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        });
        f37247a.put(Integer.class, new C14307a() {
            /* renamed from: a */
            public final void mo26518a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putInt(str, ((Integer) obj).intValue());
            }
        });
        f37247a.put(Long.class, new C14307a() {
            /* renamed from: a */
            public final void mo26518a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putLong(str, ((Long) obj).longValue());
            }
        });
        f37247a.put(Double.class, new C14307a() {
            /* renamed from: a */
            public final void mo26518a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }
        });
        f37247a.put(String.class, new C14307a() {
            /* renamed from: a */
            public final void mo26518a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putString(str, (String) obj);
            }
        });
        f37247a.put(String[].class, new C14307a() {
            /* renamed from: a */
            public final void mo26518a(Bundle bundle, String str, Object obj) throws JSONException {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }
        });
        f37247a.put(JSONArray.class, new C14307a() {
            /* renamed from: a */
            public final void mo26518a(Bundle bundle, String str, Object obj) throws JSONException {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                int i = 0;
                while (i < jSONArray.length()) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof String) {
                        arrayList.add((String) obj2);
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("Unexpected type in an array: ");
                        sb.append(obj2.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                bundle.putStringArrayList(str, arrayList);
            }
        });
    }

    /* renamed from: a */
    public static Bundle m29338a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(str, m29338a((JSONObject) obj));
                } else {
                    C14307a aVar = (C14307a) f37247a.get(obj.getClass());
                    if (aVar != null) {
                        aVar.mo26518a(bundle, str, obj);
                    } else {
                        StringBuilder sb = new StringBuilder("Unsupported type: ");
                        sb.append(obj.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return bundle;
    }
}
