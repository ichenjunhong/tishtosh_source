package com.bytedance.polaris.browser.p823a.p824a;

import android.app.Activity;
import com.bytedance.polaris.browser.p823a.C12608b;
import com.bytedance.polaris.browser.p823a.C12610d;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.i */
public final class C12607i implements C12608b {

    /* renamed from: a */
    private final WeakReference<Activity> f33096a;

    /* renamed from: b */
    private final C12597c f33097b;

    /* renamed from: c */
    private boolean f33098c;

    /* renamed from: a */
    public final boolean mo23675a(C12610d dVar, JSONObject jSONObject) {
        return false;
    }

    /* renamed from: a */
    public final void mo23674a() {
        this.f33098c = true;
        m25321a(true);
    }

    /* renamed from: b */
    public final void mo23676b() {
        if (this.f33098c) {
            this.f33098c = false;
            m25321a(false);
        }
    }

    /* renamed from: a */
    private void m25321a(boolean z) {
        String str;
        if (this.f33097b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", "1");
                if (z) {
                    str = "visible";
                } else {
                    str = "invisible";
                }
                this.f33097b.mo23682b(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public C12607i(WeakReference<Activity> weakReference, C12597c cVar) {
        this.f33096a = weakReference;
        this.f33097b = cVar;
    }
}
