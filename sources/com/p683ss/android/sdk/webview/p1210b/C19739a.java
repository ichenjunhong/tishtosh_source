package com.p683ss.android.sdk.webview.p1210b;

import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.a */
public final class C19739a implements C10762d {

    /* renamed from: a */
    private C19740a f54402a;

    /* renamed from: com.ss.android.sdk.webview.b.a$a */
    public interface C19740a {
        /* renamed from: a */
        void mo41155a(JSONObject jSONObject) throws Exception;
    }

    public C19739a(C19740a aVar) {
        this.f54402a = aVar;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (this.f54402a != null) {
            this.f54402a.mo41155a(jSONObject);
        }
    }
}
