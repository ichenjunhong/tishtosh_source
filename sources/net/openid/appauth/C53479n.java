package net.openid.appauth;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.n */
final class C53479n {

    /* renamed from: net.openid.appauth.n$a */
    static final class C53480a extends C53481b<Boolean> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo111238a(String str) {
            return Boolean.valueOf(Boolean.parseBoolean(str));
        }

        C53480a(String str, boolean z) {
            super(str, Boolean.valueOf(z));
        }
    }

    /* renamed from: net.openid.appauth.n$b */
    static abstract class C53481b<T> {

        /* renamed from: a */
        public final String f132317a;

        /* renamed from: b */
        public final T f132318b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract T mo111238a(String str);

        C53481b(String str, T t) {
            this.f132317a = str;
            this.f132318b = t;
        }
    }

    /* renamed from: net.openid.appauth.n$c */
    static abstract class C53482c<T> {

        /* renamed from: a */
        public final String f132319a;

        /* renamed from: b */
        public final List<T> f132320b;

        C53482c(String str, List<T> list) {
            this.f132319a = str;
            this.f132320b = list;
        }
    }

    /* renamed from: net.openid.appauth.n$d */
    static final class C53483d extends C53481b<String> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo111238a(String str) {
            return str;
        }

        C53483d(String str) {
            this(str, null);
        }

        private C53483d(String str, String str2) {
            super(str, null);
        }
    }

    /* renamed from: net.openid.appauth.n$e */
    static final class C53484e extends C53482c<String> {
        C53484e(String str) {
            super(str, null);
        }

        C53484e(String str, List<String> list) {
            super(str, list);
        }
    }

    /* renamed from: net.openid.appauth.n$f */
    static final class C53485f extends C53481b<Uri> {
        C53485f(String str) {
            this(str, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ Object mo111238a(String str) {
            return Uri.parse(str);
        }

        private C53485f(String str, Uri uri) {
            super(str, null);
        }
    }

    /* renamed from: a */
    public static JSONObject m113569a(Map<String, String> map) {
        C53487p.m113584a(map);
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            C53487p.m113585a(entry.getKey(), (Object) "map entries must not have null keys");
            C53487p.m113585a(entry.getValue(), (Object) "map entries must not have null values");
            m113571a(jSONObject, (String) entry.getKey(), (String) entry.getValue());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static <T> T m113567a(JSONObject jSONObject, C53481b<T> bVar) {
        try {
            if (!jSONObject.has(bVar.f132317a)) {
                return bVar.f132318b;
            }
            return bVar.mo111238a(jSONObject.getString(bVar.f132317a));
        } catch (JSONException e) {
            throw new IllegalStateException("unexpected JSONException", e);
        }
    }

    /* renamed from: b */
    public static String m113573b(JSONObject jSONObject, String str) throws JSONException {
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        StringBuilder sb = new StringBuilder("field \"");
        sb.append(str);
        sb.append("\" is mapped to a null value");
        throw new JSONException(sb.toString());
    }

    /* renamed from: c */
    public static Uri m113575c(JSONObject jSONObject, String str) throws JSONException {
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        StringBuilder sb = new StringBuilder("field \"");
        sb.append(str);
        sb.append("\" is mapped to a null value");
        throw new JSONException(sb.toString());
    }

    /* renamed from: d */
    public static Uri m113576d(JSONObject jSONObject, String str) throws JSONException {
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        StringBuilder sb = new StringBuilder("field \"");
        sb.append(str);
        sb.append("\" is mapped to a null value");
        throw new JSONException(sb.toString());
    }

    /* renamed from: e */
    public static Long m113577e(JSONObject jSONObject, String str) throws JSONException {
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        try {
            return Long.valueOf(jSONObject.getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static Map<String, String> m113578f(JSONObject jSONObject, String str) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return linkedHashMap;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        Iterator keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String str2 = (String) keys.next();
            linkedHashMap.put(str2, (String) C53487p.m113585a(jSONObject2.getString(str2), (Object) "additional parameter values must not be null"));
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    public static String m113568a(JSONObject jSONObject, String str) throws JSONException {
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            if (string != null) {
                return string;
            }
            StringBuilder sb = new StringBuilder("field \"");
            sb.append(str);
            sb.append("\" is mapped to a null value");
            throw new JSONException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("field \"");
        sb2.append(str);
        sb2.append("\" not found in json object");
        throw new JSONException(sb2.toString());
    }

    /* renamed from: b */
    public static void m113574b(JSONObject jSONObject, String str, String str2) {
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        if (str2 != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
    }

    /* renamed from: a */
    public static void m113570a(JSONObject jSONObject, String str, int i) {
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        C53487p.m113585a(Integer.valueOf(i), (Object) "value must not be null");
        try {
            jSONObject.put(str, i);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    /* renamed from: a */
    public static void m113571a(JSONObject jSONObject, String str, String str2) {
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        C53487p.m113585a(str2, (Object) "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    /* renamed from: a */
    public static void m113572a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        C53487p.m113585a(jSONObject, (Object) "json must not be null");
        C53487p.m113585a(str, (Object) "field must not be null");
        C53487p.m113585a(jSONObject2, (Object) "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }
}
