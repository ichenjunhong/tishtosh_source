package com.facebook.imagepipeline.nativecode;

import com.facebook.imageutils.C14252b;

/* renamed from: com.facebook.imagepipeline.nativecode.d */
public final class C14225d {

    /* renamed from: a */
    private static boolean f37124a;

    /* renamed from: a */
    public static synchronized void m29166a() {
        synchronized (C14225d.class) {
            if (!f37124a) {
                C14252b.m29209a("static-webp");
                f37124a = true;
            }
        }
    }
}
