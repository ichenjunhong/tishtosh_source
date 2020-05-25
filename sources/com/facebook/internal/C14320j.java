package com.facebook.internal;

import com.facebook.FacebookRequestError.C13493a;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.j */
public final class C14320j {

    /* renamed from: g */
    private static C14320j f37263g;

    /* renamed from: a */
    public final Map<Integer, Set<Integer>> f37264a;

    /* renamed from: b */
    public final Map<Integer, Set<Integer>> f37265b;

    /* renamed from: c */
    public final Map<Integer, Set<Integer>> f37266c;

    /* renamed from: d */
    public final String f37267d;

    /* renamed from: e */
    public final String f37268e;

    /* renamed from: f */
    public final String f37269f;

    /* renamed from: com.facebook.internal.j$3 */
    public static /* synthetic */ class C143233 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f37270a = new int[C13493a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.facebook.FacebookRequestError$a[] r0 = com.facebook.FacebookRequestError.C13493a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37270a = r0
                int[] r0 = f37270a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.FacebookRequestError$a r1 = com.facebook.FacebookRequestError.C13493a.OTHER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f37270a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.FacebookRequestError$a r1 = com.facebook.FacebookRequestError.C13493a.LOGIN_RECOVERABLE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f37270a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.FacebookRequestError$a r1 = com.facebook.FacebookRequestError.C13493a.TRANSIENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C14320j.C143233.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static synchronized C14320j m29374a() {
        C14320j jVar;
        synchronized (C14320j.class) {
            if (f37263g == null) {
                C14320j jVar2 = new C14320j(null, new HashMap<Integer, Set<Integer>>() {
                    {
                        put(Integer.valueOf(2), null);
                        put(Integer.valueOf(4), null);
                        put(Integer.valueOf(9), null);
                        put(Integer.valueOf(17), null);
                        put(Integer.valueOf(341), null);
                    }
                }, new HashMap<Integer, Set<Integer>>() {
                    {
                        put(Integer.valueOf(102), null);
                        put(Integer.valueOf(190), null);
                        put(Integer.valueOf(412), null);
                    }
                }, null, null, null);
                f37263g = jVar2;
            }
            jVar = f37263g;
        }
        return jVar;
    }

    /* renamed from: a */
    public static C14320j m29375a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString(LeakCanaryFileProvider.f132049i);
                if (optString != null) {
                    if (optString.equalsIgnoreCase("other")) {
                        str = optJSONObject.optString("recovery_message", null);
                        map = m29376a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("transient")) {
                        str2 = optJSONObject.optString("recovery_message", null);
                        map2 = m29376a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("login_recoverable")) {
                        str3 = optJSONObject.optString("recovery_message", null);
                        map3 = m29376a(optJSONObject);
                    }
                }
            }
        }
        C14320j jVar = new C14320j(map, map2, map3, str, str2, str3);
        return jVar;
    }

    /* renamed from: a */
    private static Map<Integer, Set<Integer>> m29376a(JSONObject jSONObject) {
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("code");
                if (optInt != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
        }
        return hashMap;
    }

    private C14320j(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f37264a = map;
        this.f37265b = map2;
        this.f37266c = map3;
        this.f37267d = str;
        this.f37268e = str2;
        this.f37269f = str3;
    }
}
