package com.facebook.imageutils;

import android.content.Context;
import com.facebook.soloader.SoLoader;
import java.io.IOException;

/* renamed from: com.facebook.imageutils.b */
public final class C14252b {

    /* renamed from: a */
    private static C14253a f37158a;

    /* renamed from: com.facebook.imageutils.b$a */
    public interface C14253a {
        /* renamed from: a */
        void mo23183a(String str);
    }

    /* renamed from: a */
    public static void m29208a(C14253a aVar) {
        f37158a = aVar;
    }

    /* renamed from: a */
    public static void m29207a(Context context) throws IOException {
        if (f37158a == null) {
            SoLoader.m29992a(context, 0);
        }
    }

    /* renamed from: a */
    public static void m29209a(String str) {
        if (f37158a != null) {
            f37158a.mo23183a(str);
        } else {
            SoLoader.m29996a(str);
        }
    }
}
