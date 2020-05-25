package com.bytedance.sdk.account.p844a.p845a;

import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p859d.C13077a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.a.a.a */
public abstract class C12989a<T extends C12990b> extends C13077a {
    public boolean cancel;

    public abstract void onResponse(T t);

    public JSONObject onSendEvent(String str) {
        return null;
    }

    public void cancel() {
        this.cancel = true;
        cancelApi();
    }

    public final void dispatchOnResponse(T t) {
        if (!this.cancel) {
            onResponse(t);
        }
    }
}
