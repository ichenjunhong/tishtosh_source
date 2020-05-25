package com.p683ss.android.ugc.rhea.p2503e;

import android.content.Context;
import java.io.File;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import p2628d.p2638e.C52659i;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: com.ss.android.ugc.rhea.e.a */
public final class C50178a {

    /* renamed from: a */
    public static File f125716a;

    /* renamed from: b */
    public static final SimpleDateFormat f125717b = new SimpleDateFormat("HH_mm_ss_yyyy_MM_dd");

    /* renamed from: c */
    public static final C50178a f125718c = new C50178a();

    private C50178a() {
    }

    /* renamed from: a */
    public final synchronized void mo97971a(String str, Context context) {
        C52711k.m112240b(str, "data");
        if (context != null) {
            File file = f125716a;
            boolean z = true;
            if (file != null) {
                double length = (double) file.length();
                Double.isNaN(length);
                if (length / 1048576.0d < 10.0d) {
                    z = false;
                }
            }
            if (!z) {
                File file2 = f125716a;
                if (file2 != null) {
                    Charset charset = C52808d.f131043a;
                    C52711k.m112240b(file2, "$this$appendText");
                    C52711k.m112240b(str, "text");
                    C52711k.m112240b(charset, "charset");
                    byte[] bytes = str.getBytes(charset);
                    C52711k.m112236a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                    C52659i.m112203a(file2, bytes);
                }
            }
        }
    }
}
