package com.p888c.p889a.p890a.p891a.p897e;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build.VERSION;
import android.view.WindowManager;
import com.p888c.p889a.p890a.p891a.p895c.C13410c;
import com.p888c.p889a.p890a.p891a.p900h.C13447b.C13448a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.e.b */
public final class C13422b {

    /* renamed from: a */
    public static WindowManager f34977a;

    /* renamed from: b */
    public static float f34978b = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: c */
    private static String[] f34979c = {"x", "y", "width", "height"};

    /* renamed from: com.c.a.a.a.e.b$a */
    static class C13423a {

        /* renamed from: a */
        final float f34980a;

        /* renamed from: b */
        final float f34981b;

        C13423a(float f, float f2) {
            this.f34980a = f;
            this.f34981b = f2;
        }
    }

    /* renamed from: a */
    private static float m27057a(int i) {
        return ((float) i) / f34978b;
    }

    /* renamed from: a */
    public static JSONObject m27058a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) m27057a(i));
            jSONObject.put("y", (double) m27057a(i2));
            jSONObject.put("width", (double) m27057a(i3));
            jSONObject.put("height", (double) m27057a(i4));
        } catch (JSONException e) {
            C13424c.m27068a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m27060a(JSONObject jSONObject, C13448a aVar) {
        C13410c cVar = aVar.f35026a;
        JSONArray jSONArray = new JSONArray();
        for (String put : aVar.f35027b) {
            jSONArray.put(put);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", cVar.f34958b);
            jSONObject.put("friendlyObstructionPurpose", cVar.f34959c);
            jSONObject.put("friendlyObstructionReason", cVar.f34960d);
        } catch (JSONException e) {
            C13424c.m27068a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m27061a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C13424c.m27068a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m27062a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            C13424c.m27068a(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public static void m27063a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException unused) {
        }
    }

    /* renamed from: a */
    private static boolean m27064a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    public static void m27065b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C13424c.m27068a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m27059a(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                float f3 = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f3 = Math.max(f3, (float) (optDouble2 + optDouble4));
                    }
                }
                f = f3;
                C13423a aVar = new C13423a(f2, f);
                jSONObject.put("width", (double) aVar.f34980a);
                jSONObject.put("height", (double) aVar.f34981b);
            }
        } else if (f34977a != null) {
            Point point = new Point(0, 0);
            f34977a.getDefaultDisplay().getRealSize(point);
            f2 = m27057a(point.x);
            f = m27057a(point.y);
            C13423a aVar2 = new C13423a(f2, f);
            jSONObject.put("width", (double) aVar2.f34980a);
            jSONObject.put("height", (double) aVar2.f34981b);
        }
        f = 0.0f;
        C13423a aVar22 = new C13423a(f2, f);
        try {
            jSONObject.put("width", (double) aVar22.f34980a);
            jSONObject.put("height", (double) aVar22.f34981b);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ab A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m27066b(org.json.JSONObject r10, org.json.JSONObject r11) {
        /*
            r0 = 1
            if (r10 != 0) goto L_0x0006
            if (r11 != 0) goto L_0x0006
            return r0
        L_0x0006:
            r1 = 0
            if (r10 == 0) goto L_0x00ad
            if (r11 != 0) goto L_0x000d
            goto L_0x00ad
        L_0x000d:
            java.lang.String[] r2 = f34979c
            int r3 = r2.length
            r4 = 0
        L_0x0011:
            if (r4 >= r3) goto L_0x0026
            r5 = r2[r4]
            double r6 = r10.optDouble(r5)
            double r8 = r11.optDouble(r5)
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 == 0) goto L_0x0023
            r2 = 0
            goto L_0x0027
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0026:
            r2 = 1
        L_0x0027:
            if (r2 == 0) goto L_0x00ac
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r2 = r10.optString(r2, r3)
            java.lang.String r3 = "adSessionId"
            java.lang.String r4 = ""
            java.lang.String r3 = r11.optString(r3, r4)
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00ac
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            java.lang.String r3 = "isFriendlyObstructionFor"
            org.json.JSONArray r3 = r11.optJSONArray(r3)
            if (r2 != 0) goto L_0x004f
            if (r3 == 0) goto L_0x0074
        L_0x004f:
            boolean r4 = m27064a(r2, r3)
            if (r4 != 0) goto L_0x0057
        L_0x0055:
            r2 = 0
            goto L_0x0075
        L_0x0057:
            r4 = 0
        L_0x0058:
            int r5 = r2.length()
            if (r4 >= r5) goto L_0x0074
            java.lang.String r5 = ""
            java.lang.String r5 = r2.optString(r4, r5)
            java.lang.String r6 = ""
            java.lang.String r6 = r3.optString(r4, r6)
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x0071
            goto L_0x0055
        L_0x0071:
            int r4 = r4 + 1
            goto L_0x0058
        L_0x0074:
            r2 = 1
        L_0x0075:
            if (r2 == 0) goto L_0x00ac
            java.lang.String r2 = "childViews"
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            java.lang.String r2 = "childViews"
            org.json.JSONArray r11 = r11.optJSONArray(r2)
            if (r10 != 0) goto L_0x0087
            if (r11 == 0) goto L_0x00a8
        L_0x0087:
            boolean r2 = m27064a(r10, r11)
            if (r2 != 0) goto L_0x008f
        L_0x008d:
            r10 = 0
            goto L_0x00a9
        L_0x008f:
            r2 = 0
        L_0x0090:
            int r3 = r10.length()
            if (r2 >= r3) goto L_0x00a8
            org.json.JSONObject r3 = r10.optJSONObject(r2)
            org.json.JSONObject r4 = r11.optJSONObject(r2)
            boolean r3 = m27066b(r3, r4)
            if (r3 != 0) goto L_0x00a5
            goto L_0x008d
        L_0x00a5:
            int r2 = r2 + 1
            goto L_0x0090
        L_0x00a8:
            r10 = 1
        L_0x00a9:
            if (r10 == 0) goto L_0x00ac
            return r0
        L_0x00ac:
            return r1
        L_0x00ad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p888c.p889a.p890a.p891a.p897e.C13422b.m27066b(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
