package com.facebook.p909a;

import android.os.Build.VERSION;
import android.os.Bundle;
import com.C2240a;
import com.facebook.C14457k;
import com.facebook.C14699w;
import com.facebook.internal.C14349t;
import com.facebook.p909a.p912b.C13563g;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.a.c */
public final class C13568c implements Serializable {

    /* renamed from: a */
    private static final HashSet<String> f35407a = new HashSet<>();
    private static final long serialVersionUID = 1;

    /* renamed from: b */
    private final JSONObject f35408b;

    /* renamed from: c */
    private final boolean f35409c;

    /* renamed from: d */
    private final boolean f35410d;

    /* renamed from: e */
    private final String f35411e;

    /* renamed from: f */
    private final String f35412f;

    /* renamed from: com.facebook.a.c$a */
    static class C13570a implements Serializable {
        private static final long serialVersionUID = -2488473066578201069L;

        /* renamed from: a */
        private final String f35413a;

        /* renamed from: b */
        private final boolean f35414b;

        /* renamed from: c */
        private final boolean f35415c;

        private Object readResolve() throws JSONException {
            C13568c cVar = new C13568c(this.f35413a, this.f35414b, this.f35415c, null);
            return cVar;
        }
    }

    /* renamed from: com.facebook.a.c$b */
    static class C13571b implements Serializable {
        private static final long serialVersionUID = 20160803001L;

        /* renamed from: a */
        private final String f35416a;

        /* renamed from: b */
        private final boolean f35417b;

        /* renamed from: c */
        private final boolean f35418c;

        /* renamed from: d */
        private final String f35419d;

        private Object readResolve() throws JSONException {
            C13568c cVar = new C13568c(this.f35416a, this.f35417b, this.f35418c, this.f35419d);
            return cVar;
        }

        private C13571b(String str, boolean z, boolean z2, String str2) {
            this.f35416a = str;
            this.f35417b = z;
            this.f35418c = z2;
            this.f35419d = str2;
        }
    }

    public final boolean getIsImplicit() {
        return this.f35409c;
    }

    public final JSONObject getJSONObject() {
        return this.f35408b;
    }

    public final String getName() {
        return this.f35411e;
    }

    private Object writeReplace() {
        C13571b bVar = new C13571b(this.f35408b.toString(), this.f35409c, this.f35410d, this.f35412f);
        return bVar;
    }

    public final boolean isChecksumValid() {
        if (this.f35412f == null) {
            return true;
        }
        return m27399a().equals(this.f35412f);
    }

    public final String toString() {
        return C2240a.m6772a("\"%s\", implicit: %b, json: %s", new Object[]{this.f35408b.optString("_eventName"), Boolean.valueOf(this.f35409c), this.f35408b.toString()});
    }

    /* renamed from: a */
    private String m27399a() {
        if (VERSION.SDK_INT > 19) {
            return m27403b(this.f35408b.toString());
        }
        ArrayList arrayList = new ArrayList();
        Iterator keys = this.f35408b.keys();
        while (keys.hasNext()) {
            arrayList.add(keys.next());
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str);
            sb.append(" = ");
            sb.append(this.f35408b.optString(str));
            sb.append(10);
        }
        return m27403b(sb.toString());
    }

    /* renamed from: b */
    private static String m27403b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes("UTF-8");
            instance.update(bytes, 0, bytes.length);
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte valueOf : digest) {
                stringBuffer.append(C2240a.m6772a("%02x", new Object[]{Byte.valueOf(valueOf)}));
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "0";
        } catch (UnsupportedEncodingException unused2) {
            return "1";
        }
    }

    /* renamed from: a */
    private Map<String, String> m27400a(Bundle bundle) throws C14457k {
        HashMap hashMap = new HashMap();
        for (String str : bundle.keySet()) {
            m27402a(str);
            Object obj = bundle.get(str);
            if ((obj instanceof String) || (obj instanceof Number)) {
                hashMap.put(str, obj.toString());
            } else {
                throw new C14457k(C2240a.m6772a("Parameter value '%s' for key '%s' should be a string or a numeric type.", new Object[]{obj, str}));
            }
        }
        C13563g.m27390a((Map<String, String>) hashMap, this.f35411e);
        return hashMap;
    }

    /* renamed from: a */
    private static void m27402a(String str) throws C14457k {
        boolean contains;
        if (str == null || str.length() == 0 || str.length() > 40) {
            if (str == null) {
                str = "<None Provided>";
            }
            throw new C14457k(C2240a.m6773a(Locale.ROOT, "Identifier '%s' must be less than %d characters", new Object[]{str, Integer.valueOf(40)}));
        }
        synchronized (f35407a) {
            contains = f35407a.contains(str);
        }
        if (contains) {
            return;
        }
        if (str.matches("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$")) {
            synchronized (f35407a) {
                f35407a.add(str);
            }
            return;
        }
        throw new C14457k(C2240a.m6772a("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", new Object[]{str}));
    }

    private C13568c(String str, boolean z, boolean z2, String str2) throws JSONException {
        this.f35408b = new JSONObject(str);
        this.f35409c = z;
        this.f35411e = this.f35408b.optString("_eventName");
        this.f35412f = str2;
        this.f35410d = z2;
    }

    /* renamed from: a */
    private JSONObject m27401a(String str, String str2, Double d, Bundle bundle, UUID uuid) throws JSONException {
        m27402a(str2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("_eventName", str2);
        jSONObject.put("_eventName_md5", m27403b(str2));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", str);
        if (uuid != null) {
            jSONObject.put("_session_id", uuid);
        }
        if (bundle != null) {
            Map a = m27400a(bundle);
            for (String str3 : a.keySet()) {
                jSONObject.put(str3, a.get(str3));
            }
        }
        if (d != null) {
            jSONObject.put("_valueToSum", d.doubleValue());
        }
        if (this.f35410d) {
            jSONObject.put("_inBackground", "1");
        }
        if (this.f35409c) {
            jSONObject.put("_implicitlyLogged", "1");
        } else {
            C14349t.m29409a(C14699w.APP_EVENTS, "AppEvents", "Created app event '%s'", jSONObject.toString());
        }
        return jSONObject;
    }

    public C13568c(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, C14457k {
        this.f35409c = z;
        this.f35410d = z2;
        this.f35411e = str2;
        this.f35408b = m27401a(str, str2, d, bundle, uuid);
        this.f35412f = m27399a();
    }
}
