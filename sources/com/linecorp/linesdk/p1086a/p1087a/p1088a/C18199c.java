package com.linecorp.linesdk.p1086a.p1087a.p1088a;

import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.linecorp.linesdk.a.a.a.c */
public final class C18199c implements C18200d<JSONObject> {

    /* renamed from: a */
    private final C18201e f50249a = new C18201e();

    /* renamed from: b */
    public final JSONObject mo36279a(InputStream inputStream) {
        try {
            return new JSONObject(this.f50249a.mo36279a(inputStream));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
