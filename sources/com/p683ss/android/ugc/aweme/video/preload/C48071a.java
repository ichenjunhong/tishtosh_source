package com.p683ss.android.ugc.aweme.video.preload;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.io.File;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.video.preload.a */
public final class C48071a {

    /* renamed from: a */
    public static volatile boolean f120796a = false;

    /* renamed from: b */
    public static final C48071a f120797b = new C48071a();

    /* renamed from: c */
    private static final String f120798c = f120798c;

    private C48071a() {
    }

    /* renamed from: a */
    public static final boolean m104097a() {
        return f120796a;
    }

    /* renamed from: b */
    public static final boolean m104098b(String str) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final String m104096a(String str) {
        if (C11010c.m22280a() == null || TextUtils.isEmpty(str)) {
            return null;
        }
        File cacheDir = C11010c.m22280a().getCacheDir();
        C52711k.m112236a((Object) cacheDir, "AppContextManager.getApplicationContext().cacheDir");
        String absolutePath = cacheDir.getAbsolutePath();
        if (TextUtils.isEmpty(absolutePath)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(absolutePath);
        sb.append(File.separator);
        sb.append("feedCache");
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }
}
