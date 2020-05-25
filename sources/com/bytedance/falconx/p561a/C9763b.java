package com.bytedance.falconx.p561a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.p608g.C10107a;
import com.bytedance.geckox.p608g.C10111b;
import com.bytedance.geckox.p611i.C10117b;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.falconx.a.b */
public final class C9763b implements C9764c {

    /* renamed from: a */
    private C10111b f26572a;

    /* renamed from: b */
    private AtomicBoolean f26573b = new AtomicBoolean(false);

    /* renamed from: a */
    public final String mo17593a() {
        return this.f26572a.f27402b;
    }

    /* renamed from: b */
    public final Map<String, Long> mo17594b() {
        return this.f26572a.mo18089a();
    }

    /* renamed from: a */
    public final InputStream mo17592a(String str) throws Exception {
        if (!this.f26573b.get()) {
            C10117b.m20388a("FALCON", "GeckoResLoader准备加载, file:", str);
            C10111b bVar = this.f26572a;
            if (bVar.f27401a.get()) {
                throw new RuntimeException("released");
            } else if (!TextUtils.isEmpty(str)) {
                C10107a a = bVar.mo18088a(str.trim());
                return a.mo18084a(a.f27394a).mo18087a(str.substring(a.f27394a.length() + 1));
            } else {
                throw new RuntimeException("relativePath empty");
            }
        } else {
            throw new RuntimeException("released!");
        }
    }

    public C9763b(Context context, String str, File file) {
        if (context == null) {
            throw new RuntimeException("context == null");
        } else if (!TextUtils.isEmpty(str)) {
            this.f26572a = new C10111b(context, str, file);
        } else {
            throw new RuntimeException("access key empty");
        }
    }
}
