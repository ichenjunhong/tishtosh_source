package com.facebook.internal.p979a;

import com.C2240a;
import com.facebook.AccessToken;
import com.facebook.C14533n;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13501b;
import com.facebook.internal.C14277aa;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a.b */
public final class C14270b {
    /* renamed from: a */
    public static File m29235a() {
        File file = new File(C14533n.m29773g().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: a */
    public static String m29236a(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (true) {
            Throwable th3 = th2;
            th2 = th;
            Throwable th4 = th3;
            if (th2 != null && th2 != th4) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    jSONArray.put(stackTraceElement.toString());
                }
                th = th2.getCause();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    public static boolean m29240a(String str) {
        File a = m29235a();
        if (a == null || str == null) {
            return false;
        }
        return new File(a, str).delete();
    }

    /* renamed from: a */
    public static JSONObject m29237a(String str, boolean z) {
        File a = m29235a();
        if (a == null || str == null) {
            return null;
        }
        try {
            return new JSONObject(C14277aa.m29252a((InputStream) new FileInputStream(new File(a, str))));
        } catch (Exception unused) {
            m29240a(str);
            return null;
        }
    }

    /* renamed from: a */
    public static void m29238a(String str, String str2) {
        File a = m29235a();
        if (a != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(a, str));
                fileOutputStream.write(str2.getBytes());
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m29239a(String str, JSONArray jSONArray, C13501b bVar) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                GraphRequest.m27266a((AccessToken) null, C2240a.m6772a("%s/instruments", new Object[]{C14533n.m29777k()}), jSONObject, bVar).mo25314b();
            } catch (JSONException unused) {
            }
        }
    }
}
