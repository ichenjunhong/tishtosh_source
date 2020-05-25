package com.google.android.play.core.p1051c;

import java.io.File;

/* renamed from: com.google.android.play.core.c.u */
final class C17308u implements C17299l {
    C17308u() {
    }

    /* renamed from: a */
    public final boolean mo33597a(Object obj, File file, File file2) {
        try {
            return !((Boolean) C17253ac.m42253a(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
