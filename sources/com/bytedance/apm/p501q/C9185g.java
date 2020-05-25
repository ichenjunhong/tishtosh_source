package com.bytedance.apm.p501q;

import com.C2240a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.q.g */
public final class C9185g {

    /* renamed from: com.bytedance.apm.q.g$a */
    static class C9187a {

        /* renamed from: a */
        final Writer f25152a;

        /* renamed from: b */
        private final List<C9188a> f25153b = new ArrayList();

        /* renamed from: com.bytedance.apm.q.g$a$a */
        enum C9188a {
            EMPTY_ARRAY,
            NONEMPTY_ARRAY,
            EMPTY_OBJECT,
            DANGLING_KEY,
            NONEMPTY_OBJECT,
            NULL
        }

        public final String toString() {
            return "";
        }

        /* renamed from: a */
        private C9187a m18240a() throws JSONException, IOException {
            return m18242a(C9188a.EMPTY_OBJECT, "{");
        }

        /* renamed from: b */
        private C9187a m18246b() throws JSONException, IOException {
            return m18241a(C9188a.EMPTY_OBJECT, C9188a.NONEMPTY_OBJECT, "}");
        }

        /* renamed from: c */
        private C9188a m18248c() throws JSONException {
            return (C9188a) this.f25153b.get(this.f25153b.size() - 1);
        }

        /* renamed from: d */
        private void m18249d() throws JSONException, IOException {
            if (!this.f25153b.isEmpty()) {
                C9188a c = m18248c();
                if (c == C9188a.EMPTY_ARRAY) {
                    m18244a(C9188a.NONEMPTY_ARRAY);
                } else if (c == C9188a.NONEMPTY_ARRAY) {
                    this.f25152a.write(44);
                } else if (c == C9188a.DANGLING_KEY) {
                    this.f25152a.write(":");
                    m18244a(C9188a.NONEMPTY_OBJECT);
                } else if (c != C9188a.NULL) {
                    throw new JSONException("Nesting problem");
                }
            }
        }

        public C9187a(Writer writer) {
            this.f25152a = writer;
        }

        /* renamed from: b */
        private C9187a m18247b(String str) throws JSONException, IOException {
            C9188a c = m18248c();
            if (c == C9188a.NONEMPTY_OBJECT) {
                this.f25152a.write(44);
            } else if (c != C9188a.EMPTY_OBJECT) {
                throw new JSONException("Nesting problem");
            }
            m18244a(C9188a.DANGLING_KEY);
            m18245a(str);
            return this;
        }

        /* renamed from: a */
        private C9187a m18243a(Object obj) throws JSONException, IOException {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                m18242a(C9188a.EMPTY_ARRAY, "[");
                for (int i = 0; i < jSONArray.length(); i++) {
                    m18243a(jSONArray.get(i));
                }
                m18241a(C9188a.EMPTY_ARRAY, C9188a.NONEMPTY_ARRAY, "]");
                return this;
            } else if (obj instanceof JSONObject) {
                mo16551a((JSONObject) obj);
                return this;
            } else {
                m18249d();
                if (obj == null || obj == JSONObject.NULL) {
                    this.f25152a.write(TEVideoRecorder.FACE_BEAUTY_NULL);
                } else if (obj instanceof Boolean) {
                    this.f25152a.write(String.valueOf(obj));
                } else if (obj instanceof Number) {
                    this.f25152a.write(JSONObject.numberToString((Number) obj));
                } else {
                    m18245a(obj.toString());
                }
                return this;
            }
        }

        /* renamed from: a */
        private void m18244a(C9188a aVar) {
            this.f25153b.set(this.f25153b.size() - 1, aVar);
        }

        /* renamed from: a */
        private void m18245a(String str) throws IOException {
            this.f25152a.write("\"");
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                    switch (charAt) {
                        case 8:
                            this.f25152a.write("\\b");
                            continue;
                        case 9:
                            this.f25152a.write("\\t");
                            continue;
                        case 10:
                            this.f25152a.write("\\n");
                            continue;
                        default:
                            switch (charAt) {
                                case 12:
                                    this.f25152a.write("\\f");
                                    continue;
                                case 13:
                                    this.f25152a.write("\\r");
                                    continue;
                                default:
                                    if (charAt <= 31) {
                                        this.f25152a.write(C2240a.m6772a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                        continue;
                                        continue;
                                    }
                                    break;
                            }
                    }
                } else {
                    this.f25152a.write(92);
                }
                this.f25152a.write(charAt);
            }
            this.f25152a.write("\"");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo16551a(JSONObject jSONObject) throws JSONException, IOException {
            m18240a();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                m18247b(str).m18243a(jSONObject.get(str));
            }
            m18246b();
        }

        /* renamed from: a */
        private C9187a m18242a(C9188a aVar, String str) throws JSONException, IOException {
            m18249d();
            this.f25153b.add(aVar);
            this.f25152a.write(str);
            return this;
        }

        /* renamed from: a */
        private C9187a m18241a(C9188a aVar, C9188a aVar2, String str) throws JSONException, IOException {
            m18248c();
            this.f25153b.remove(this.f25153b.size() - 1);
            this.f25152a.write(str);
            return this;
        }
    }

    /* renamed from: com.bytedance.apm.q.g$b */
    static class C9189b extends Writer {

        /* renamed from: a */
        public int f25161a;

        private C9189b() {
        }

        public final void close() throws IOException {
        }

        public final void flush() throws IOException {
        }

        public final Writer append(char c) throws IOException {
            this.f25161a++;
            return this;
        }

        public final void write(int i) throws IOException {
            this.f25161a++;
        }

        public final Writer append(CharSequence charSequence) throws IOException {
            this.f25161a += charSequence.length();
            return this;
        }

        public final void write(String str) throws IOException {
            this.f25161a += str.length();
        }

        public final void write(char[] cArr) throws IOException {
            this.f25161a += cArr.length;
        }

        public final Writer append(CharSequence charSequence, int i, int i2) throws IOException {
            this.f25161a += i2 - i;
            return this;
        }

        public final void write(String str, int i, int i2) throws IOException {
            this.f25161a += i2;
        }

        public final void write(char[] cArr, int i, int i2) throws IOException {
            this.f25161a += i2;
        }
    }

    /* renamed from: c */
    public static boolean m18238c(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static int m18239d(JSONObject jSONObject) {
        try {
            C9189b bVar = new C9189b();
            new C9187a(bVar).mo16551a(jSONObject);
            bVar.flush();
            return bVar.f25161a;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONObject m18233a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    /* renamed from: b */
    public static JSONObject m18237b(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            return null;
        }
        Iterator keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        JSONObject jSONObject2 = new JSONObject();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            jSONObject2.put(str, jSONObject.opt(str));
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public static boolean m18236a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m18235a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject2.length() > 0) {
            try {
                Iterator keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String str = (String) keys.next();
                    jSONObject.put(str, jSONObject2.get(str));
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static JSONObject m18234a(JSONObject jSONObject, String str, String str2) {
        if (jSONObject == null) {
            return null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return null;
        }
        return optJSONObject.optJSONObject(str2);
    }

    /* renamed from: a */
    public static int m18232a(JSONObject jSONObject, String str, String str2, String str3) {
        JSONObject a = m18234a(jSONObject, str, str2);
        if (a == null) {
            return 0;
        }
        return a.optInt(str3, 0);
    }
}
