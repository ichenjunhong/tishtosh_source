package com.google.android.play.core.p1051c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.c.m */
public final class C17300m implements C17292e {
    /* renamed from: a */
    public static void m42364a(ClassLoader classLoader, Set<File> set, C17305r rVar) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File parentFile : set) {
                hashSet.add(parentFile.getParentFile());
            }
            Object a = C17294g.m42351a(classLoader);
            List list = (List) C17253ac.m42252a(a, "nativeLibraryDirectories", List.class).mo33600a();
            hashSet.removeAll(list);
            list.addAll(hashSet);
            ArrayList arrayList = new ArrayList();
            Object[] a2 = rVar.mo33599a(a, new ArrayList(hashSet), null, arrayList);
            if (!arrayList.isEmpty()) {
                C17278b bVar = new C17278b("Error in makePathElements");
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    C17261ak.m42289a(bVar, (IOException) obj);
                }
                throw bVar;
            }
            C17253ac.m42262b(a, "nativeLibraryPathElements", Object.class).mo33604b((T[]) a2);
        }
    }

    /* renamed from: a */
    public static boolean m42365a(ClassLoader classLoader, File file, File file2, boolean z, String str) {
        return C17294g.m42352a(classLoader, file, file2, z, new C17303p(), str, new C17296i());
    }

    /* renamed from: a */
    public final void mo33594a(ClassLoader classLoader, Set<File> set) {
        m42364a(classLoader, set, new C17302o());
    }

    /* renamed from: a */
    public final boolean mo33595a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m42365a(classLoader, file, file2, z, "zip");
    }
}
