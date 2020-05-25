package com.google.android.play.core.p1051c;

import java.io.File;
import java.util.Set;
import leakcanary.internal.LeakCanaryFileProvider;

/* renamed from: com.google.android.play.core.c.s */
public final class C17306s implements C17292e {
    /* renamed from: b */
    static void m42375b(ClassLoader classLoader, Set<File> set) {
        C17300m.m42364a(classLoader, set, new C17309v());
    }

    /* renamed from: b */
    static boolean m42376b(ClassLoader classLoader, File file, File file2, boolean z) {
        return C17294g.m42352a(classLoader, file, file2, z, new C17303p(), LeakCanaryFileProvider.f132050j, new C17308u());
    }

    /* renamed from: a */
    public final void mo33594a(ClassLoader classLoader, Set<File> set) {
        m42375b(classLoader, set);
    }

    /* renamed from: a */
    public final boolean mo33595a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m42376b(classLoader, file, file2, z);
    }
}
