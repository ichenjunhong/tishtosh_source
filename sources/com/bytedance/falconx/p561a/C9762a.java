package com.bytedance.falconx.p561a;

import android.content.Context;
import android.content.res.AssetManager;
import com.bytedance.geckox.p611i.C10117b;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.falconx.a.a */
public final class C9762a implements C9764c {

    /* renamed from: a */
    private final File f26569a;

    /* renamed from: b */
    private AssetManager f26570b;

    /* renamed from: c */
    private AtomicBoolean f26571c = new AtomicBoolean(false);

    /* renamed from: b */
    public final Map<String, Long> mo17594b() {
        return Collections.emptyMap();
    }

    /* renamed from: a */
    public final String mo17593a() {
        StringBuilder sb = new StringBuilder("asset:///");
        sb.append(this.f26569a);
        return sb.toString();
    }

    /* renamed from: a */
    public final InputStream mo17592a(String str) throws Exception {
        if (!this.f26571c.get()) {
            C10117b.m20388a("FALCON", "AssetResLoader准备加载, file:", str);
            return this.f26570b.open(new File(this.f26569a, str).getPath());
        }
        throw new RuntimeException("released!");
    }

    public C9762a(Context context, File file) {
        this.f26569a = file;
        this.f26570b = context.getAssets();
    }
}
