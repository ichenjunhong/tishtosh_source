package com.linecorp.linesdk.p1086a.p1087a;

import com.linecorp.linesdk.p1086a.p1087a.p1088a.C18199c;
import com.linecorp.linesdk.p1086a.p1087a.p1088a.C18200d;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.a */
abstract class C18196a<T> implements C18200d<T> {

    /* renamed from: a */
    private final C18199c f50243a;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo36280a(JSONObject jSONObject);

    C18196a() {
        this(new C18199c());
    }

    private C18196a(C18199c cVar) {
        this.f50243a = cVar;
    }

    /* renamed from: a */
    public final T mo36279a(InputStream inputStream) {
        try {
            return mo36280a(this.f50243a.mo36279a(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
