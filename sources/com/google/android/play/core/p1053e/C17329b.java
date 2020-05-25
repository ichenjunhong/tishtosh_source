package com.google.android.play.core.p1053e;

import android.content.Context;
import com.google.android.play.core.splitcompat.C17384b;
import java.io.File;

/* renamed from: com.google.android.play.core.e.b */
public final class C17329b {

    /* renamed from: a */
    public static final C17384b f48819a = new C17384b("SplitInstallHelper");

    /* renamed from: a */
    public static void m42425a(Context context, String str) throws UnsatisfiedLinkError {
        try {
            C17337c.m42448a(str);
        } catch (UnsatisfiedLinkError e) {
            boolean z = false;
            try {
                String str2 = context.getApplicationInfo().nativeLibraryDir;
                String mapLibraryName = System.mapLibraryName(str);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(mapLibraryName).length());
                sb.append(str2);
                sb.append("/");
                sb.append(mapLibraryName);
                String sb2 = sb.toString();
                if (new File(sb2).exists()) {
                    C17337c.m42449b(sb2);
                    z = true;
                }
                if (!z) {
                    throw e;
                }
            } catch (UnsatisfiedLinkError e2) {
                throw e2;
            }
        }
    }
}
