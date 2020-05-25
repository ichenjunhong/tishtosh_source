package com.bytedance.crash.p551k;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p555n.C9695g;

/* renamed from: com.bytedance.crash.k.i */
public final class C9655i {

    /* renamed from: a */
    public int f26356a = -1;

    /* renamed from: b */
    private String f26357b;

    /* renamed from: a */
    public final String mo17507a() {
        if (!TextUtils.isEmpty(this.f26357b) && !"0".equals(this.f26357b)) {
            return this.f26357b;
        }
        this.f26357b = C9616k.m19147a().mo17448c();
        if (!TextUtils.isEmpty(this.f26357b) && !"0".equals(this.f26357b)) {
            return this.f26357b;
        }
        this.f26357b = C9652h.m19252a().mo17504b();
        return this.f26357b;
    }

    public C9655i(Context context) {
    }

    /* renamed from: a */
    public final void mo17508a(String str) {
        this.f26357b = str;
        try {
            C9695g.m19352a(C9652h.m19252a().f26346a, str, false);
        } catch (Throwable unused) {
        }
    }
}
