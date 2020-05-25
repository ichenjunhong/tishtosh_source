package com.bytedance.crash.p555n;

import com.C2240a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.n.k */
public final class C9699k {

    /* renamed from: a */
    final Writer f26423a;

    /* renamed from: b */
    private final List<C9700a> f26424b = new ArrayList();

    /* renamed from: com.bytedance.crash.n.k$a */
    enum C9700a {
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
    private C9699k m19375a() throws JSONException, IOException {
        return m19377a(C9700a.EMPTY_OBJECT, "{");
    }

    /* renamed from: b */
    private C9699k m19383b() throws JSONException, IOException {
        return m19376a(C9700a.EMPTY_OBJECT, C9700a.NONEMPTY_OBJECT, "}");
    }

    /* renamed from: c */
    private C9700a m19385c() throws JSONException {
        return (C9700a) this.f26424b.get(this.f26424b.size() - 1);
    }

    /* renamed from: d */
    private void m19386d() throws JSONException, IOException {
        if (!this.f26424b.isEmpty()) {
            C9700a c = m19385c();
            if (c == C9700a.EMPTY_ARRAY) {
                m19379a(C9700a.NONEMPTY_ARRAY);
            } else if (c == C9700a.NONEMPTY_ARRAY) {
                this.f26423a.write(44);
            } else if (c == C9700a.DANGLING_KEY) {
                this.f26423a.write(":");
                m19379a(C9700a.NONEMPTY_OBJECT);
            } else if (c != C9700a.NULL) {
                throw new JSONException("Nesting problem");
            }
        }
    }

    private C9699k(Writer writer) {
        this.f26423a = writer;
    }

    /* renamed from: b */
    private C9699k m19384b(String str) throws JSONException, IOException {
        C9700a c = m19385c();
        if (c == C9700a.NONEMPTY_OBJECT) {
            this.f26423a.write(44);
        } else if (c != C9700a.EMPTY_OBJECT) {
            throw new JSONException("Nesting problem");
        }
        m19379a(C9700a.DANGLING_KEY);
        m19380a(str);
        return this;
    }

    /* renamed from: a */
    private C9699k m19378a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            m19377a(C9700a.EMPTY_ARRAY, "[");
            for (int i = 0; i < jSONArray.length(); i++) {
                m19378a(jSONArray.get(i));
            }
            m19376a(C9700a.EMPTY_ARRAY, C9700a.NONEMPTY_ARRAY, "]");
            return this;
        } else if (obj instanceof JSONObject) {
            m19381a((JSONObject) obj);
            return this;
        } else {
            m19386d();
            if (obj == null || obj == JSONObject.NULL) {
                this.f26423a.write(TEVideoRecorder.FACE_BEAUTY_NULL);
            } else if (obj instanceof Boolean) {
                this.f26423a.write(String.valueOf(obj));
            } else if (obj instanceof Number) {
                this.f26423a.write(JSONObject.numberToString((Number) obj));
            } else {
                m19380a(obj.toString());
            }
            return this;
        }
    }

    /* renamed from: a */
    private void m19379a(C9700a aVar) {
        this.f26424b.set(this.f26424b.size() - 1, aVar);
    }

    /* renamed from: a */
    private void m19380a(String str) throws IOException {
        this.f26423a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                switch (charAt) {
                    case 8:
                        this.f26423a.write("\\b");
                        continue;
                    case 9:
                        this.f26423a.write("\\t");
                        continue;
                    case 10:
                        this.f26423a.write("\\n");
                        continue;
                    default:
                        switch (charAt) {
                            case 12:
                                this.f26423a.write("\\f");
                                continue;
                            case 13:
                                this.f26423a.write("\\r");
                                continue;
                            default:
                                if (charAt <= 31) {
                                    this.f26423a.write(C2240a.m6772a("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                                    continue;
                                    continue;
                                }
                                break;
                        }
                }
            } else {
                this.f26423a.write(92);
            }
            this.f26423a.write(charAt);
        }
        this.f26423a.write("\"");
    }

    /* renamed from: a */
    private void m19381a(JSONObject jSONObject) throws JSONException, IOException {
        m19375a();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            m19384b(str).m19378a(jSONObject.get(str));
        }
        m19383b();
    }

    /* renamed from: a */
    private C9699k m19377a(C9700a aVar, String str) throws JSONException, IOException {
        m19386d();
        this.f26424b.add(aVar);
        this.f26423a.write(str);
        return this;
    }

    /* renamed from: a */
    public static void m19382a(JSONObject jSONObject, Writer writer) throws Throwable {
        new C9699k(writer).m19381a(jSONObject);
        writer.flush();
    }

    /* renamed from: a */
    private C9699k m19376a(C9700a aVar, C9700a aVar2, String str) throws JSONException, IOException {
        m19385c();
        this.f26424b.remove(this.f26424b.size() - 1);
        this.f26423a.write(str);
        return this;
    }
}
