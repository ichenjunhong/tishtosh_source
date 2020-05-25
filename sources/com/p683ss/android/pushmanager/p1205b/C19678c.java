package com.p683ss.android.pushmanager.p1205b;

import android.os.Looper;
import com.p683ss.android.message.C19408a;
import com.p683ss.android.message.C19487k;
import com.p683ss.android.message.p1191b.C19470k;
import com.p683ss.android.pushmanager.C19700f;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.b.c */
public final class C19678c {

    /* renamed from: a */
    public static C19672a f54179a = null;

    /* renamed from: b */
    public static boolean f54180b = true;

    /* renamed from: c */
    private static Boolean f54181c;

    /* renamed from: b */
    static Looper m48072b() {
        Looper looper = C19487k.m47712a().f53817a;
        if (looper == null) {
            return Looper.getMainLooper();
        }
        return looper;
    }

    /* renamed from: a */
    public static boolean m48071a() {
        if (f54181c == null) {
            f54181c = Boolean.valueOf(C19470k.m47658c(C19408a.m47500a()));
        }
        if (!f54180b || !f54181c.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m48070a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            Iterator keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String str = (String) keys.next();
                    jSONObject.put(str, jSONObject2.get(str));
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: a */
    static void m48069a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        m48073b(str, jSONObject, jSONObject2, jSONObject3);
        if (f54179a != null) {
            f54179a.mo41021a(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    /* renamed from: b */
    private static void m48073b(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4 = new JSONObject();
        m48070a(jSONObject4, jSONObject);
        m48070a(jSONObject4, jSONObject2);
        m48070a(jSONObject4, jSONObject3);
        C19700f.m48124a().mo41057a(str, jSONObject4);
    }
}
