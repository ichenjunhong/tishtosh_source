package com.bytedance.android.livesdk.p267a;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.a.d */
public abstract class C4489d<R> {

    /* renamed from: a */
    public C4490a f12257a;

    /* renamed from: b */
    private boolean f12258b = true;

    /* renamed from: com.bytedance.android.livesdk.a.d$a */
    public interface C4490a<R> {
        /* renamed from: a */
        void mo10284a(R r);
    }

    /* renamed from: a */
    private void m10808a() {
        this.f12258b = false;
    }

    /* renamed from: a */
    public abstract void mo10286a(Map<String, Object> map) throws Exception;

    /* renamed from: a */
    public final void mo10293a(Throwable th) {
        m10808a();
    }

    /* renamed from: a */
    public final void mo10291a(R r) {
        if (this.f12258b && this.f12257a != null) {
            this.f12257a.mo10284a(r);
        }
        m10808a();
    }

    /* renamed from: a */
    public final void mo10292a(String str, C4490a aVar) throws Exception {
        this.f12257a = aVar;
        Uri parse = Uri.parse(str);
        if (parse != null) {
            HashMap hashMap = new HashMap();
            for (String str2 : parse.getQueryParameterNames()) {
                String queryParameter = parse.getQueryParameter(str2);
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(queryParameter)) {
                    hashMap.put(str2, queryParameter);
                }
            }
            mo10286a((Map<String, Object>) hashMap);
        }
    }
}
