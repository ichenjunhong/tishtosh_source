package com.facebook.p955h;

import com.facebook.common.p921e.C13697a;
import com.facebook.imageutils.C14254c;

/* renamed from: com.facebook.h.b */
public final class C13899b {

    /* renamed from: a */
    public static final C13900c f36263a = new C13900c("JPEG", "jpeg");

    /* renamed from: b */
    public static final C13900c f36264b = new C13900c("PNG", "png");

    /* renamed from: c */
    public static final C13900c f36265c = new C13900c("GIF", "gif");

    /* renamed from: d */
    public static final C13900c f36266d = new C13900c("BMP", "bmp");

    /* renamed from: e */
    public static final C13900c f36267e = new C13900c("ICO", "ico");

    /* renamed from: f */
    public static final C13900c f36268f = new C13900c("WEBP_SIMPLE", "webp");

    /* renamed from: g */
    public static final C13900c f36269g = new C13900c("WEBP_LOSSLESS", "webp");

    /* renamed from: h */
    public static final C13900c f36270h = new C13900c("WEBP_EXTENDED", "webp");

    /* renamed from: i */
    public static final C13900c f36271i = new C13900c("WEBP_EXTENDED_WITH_ALPHA", "webp");

    /* renamed from: j */
    public static final C13900c f36272j = new C13900c("WEBP_ANIMATED", "webp");

    /* renamed from: k */
    public static final C13900c f36273k = new C13900c("HEIF", "heif");

    /* renamed from: l */
    public static final C13900c f36274l = null;

    /* renamed from: a */
    public static boolean m28308a(C13900c cVar) {
        if (m28309b(cVar) || cVar == f36272j) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m28309b(C13900c cVar) {
        if (cVar == f36268f || cVar == f36269g || cVar == f36270h || cVar == f36271i) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m28310c(C13900c cVar) {
        try {
            if (cVar == C14254c.m29211a()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            C13697a.m27696c("DefaultImageFormats", "isHeifFormat error", th);
            return false;
        }
    }
}
