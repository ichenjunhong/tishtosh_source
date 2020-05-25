package com.p683ss.android.ugc.aweme.festival.p1739a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.LruCache;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.festival.a.d */
public final class C31351d {

    /* renamed from: a */
    private static LruCache<String, Drawable> f82116a = new LruCache<>(20);

    /* renamed from: b */
    private static LruCache<String, Bitmap> f82117b = new LruCache<>(20);

    /* renamed from: a */
    public static File m73083a() {
        return m73086b("top_left_icon_animation.webp");
    }

    /* renamed from: b */
    public static Drawable m73085b() {
        Drawable a = m73082a("avatar_hat.png");
        if (a != null) {
            return a;
        }
        Drawable a2 = m73080a(m73086b("avatar_hat.png"));
        if (a2 != null) {
            m73084a("avatar_hat.png", a2);
        }
        return a2;
    }

    /* renamed from: a */
    public static Drawable m73080a(File file) {
        return m73081a(file, 0);
    }

    /* renamed from: a */
    public static Drawable m73082a(String str) {
        return (Drawable) f82116a.get(str);
    }

    /* renamed from: b */
    public static File m73086b(String str) {
        File c = C31348b.m73074a().mo64226c();
        if (c == null || !c.exists() || !c.isDirectory()) {
            return null;
        }
        File file = new File(c, str);
        if (!file.exists() || !file.isFile()) {
            return null;
        }
        return file;
    }

    /* renamed from: a */
    private static Drawable m73081a(File file, int i) {
        if (file == null || !file.exists()) {
            return null;
        }
        Drawable createFromPath = Drawable.createFromPath(file.getPath());
        if (createFromPath instanceof BitmapDrawable) {
            ((BitmapDrawable) createFromPath).setTargetDensity((C9432q.m18694d(C11010c.m22280a()) * C9432q.m18694d(C11010c.m22280a())) / 480);
        }
        return createFromPath;
    }

    /* renamed from: a */
    public static void m73084a(String str, Drawable drawable) {
        if (drawable != null) {
            f82116a.put(str, drawable);
        }
    }
}
