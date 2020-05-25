package com.google.android.play.core.p1051c;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.play.core.c.g */
public final class C17294g implements C17292e {
    /* renamed from: a */
    static Object m42351a(ClassLoader classLoader) {
        return C17253ac.m42252a((Object) classLoader, "pathList", Object.class).mo33600a();
    }

    /* renamed from: a */
    static boolean m42352a(ClassLoader classLoader, File file, File file2, boolean z, C17298k kVar, String str, C17299l lVar) {
        ArrayList arrayList = new ArrayList();
        Object a = m42351a(classLoader);
        C17312y b = C17253ac.m42262b(a, "dexElements", Object.class);
        List<Object> asList = Arrays.asList((Object[]) b.mo33600a());
        ArrayList arrayList2 = new ArrayList();
        for (Object a2 : asList) {
            arrayList2.add((File) C17253ac.m42252a(a2, str, File.class).mo33600a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        int i = 0;
        if (z || lVar.mo33597a(a, file2, file)) {
            b.mo33602a((T[]) kVar.mo33598a(a, new ArrayList(Collections.singleton(file2)), file, arrayList));
            if (arrayList.isEmpty()) {
                return true;
            }
            C17278b bVar = new C17278b("DexPathList.makeDexElement failed");
            ArrayList arrayList3 = arrayList;
            int size = arrayList3.size();
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                C17261ak.m42289a(bVar, (IOException) obj);
            }
            C17253ac.m42262b(a, "dexElementsSuppressedExceptions", IOException.class).mo33601a((Collection<T>) arrayList);
            throw bVar;
        }
        String str2 = "Should be optimized ";
        String valueOf = String.valueOf(file2.getPath());
        if (valueOf.length() != 0) {
            str2.concat(valueOf);
        } else {
            new String(str2);
        }
        return false;
    }

    /* renamed from: b */
    static void m42353b(ClassLoader classLoader, Set<File> set) {
        if (!set.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (File file : set) {
                String str = "Adding native library parent directory: ";
                String valueOf = String.valueOf(file.getParentFile().getAbsolutePath());
                if (valueOf.length() != 0) {
                    str.concat(valueOf);
                } else {
                    new String(str);
                }
                hashSet.add(file.getParentFile());
            }
            C17312y b = C17253ac.m42262b(m42351a(classLoader), "nativeLibraryDirectories", File.class);
            hashSet.removeAll(Arrays.asList((File[]) b.mo33600a()));
            b.mo33603b((Collection<T>) hashSet);
        }
    }

    /* renamed from: a */
    public final void mo33594a(ClassLoader classLoader, Set<File> set) {
        m42353b(classLoader, set);
    }

    /* renamed from: a */
    public final boolean mo33595a(ClassLoader classLoader, File file, File file2, boolean z) {
        return m42352a(classLoader, file, file2, z, new C17297j(), "zip", new C17296i());
    }
}
