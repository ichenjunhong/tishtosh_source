package com.bytedance.android.p161c.p165d;

import com.bytedance.android.p161c.p167f.C2852b;
import com.bytedance.android.p161c.p168g.C2855b;
import com.bytedance.android.p161c.p172j.C2886h;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.c.d.a */
public final class C2849a {

    /* renamed from: a */
    private static Map<String, C2855b<Class<? extends InputStream>, List<Class<?>>>> f8481a = new HashMap();

    static {
        try {
            m8136a("xz", Class.forName("com.bytedance.android.sodecompress.xz.SsXzInputStream"), InputStream.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            m8136a("zstd", Class.forName("com.github.luben.zstd.ZstdInputStream"), InputStream.class);
        } catch (ClassNotFoundException unused2) {
        }
    }

    /* renamed from: a */
    public static InputStream m8135a(String str, Object... objArr) {
        Constructor constructor;
        InputStream inputStream;
        String str2;
        String str3;
        C2855b bVar = (C2855b) f8481a.get(str);
        if (bVar == null) {
            return null;
        }
        Class cls = (Class) bVar.f8499a;
        if (cls == null) {
            return null;
        }
        Class[] clsArr = (Class[]) ((List) bVar.f8500b).toArray();
        if (clsArr == null) {
            try {
                constructor = cls.getConstructor(new Class[0]);
            } catch (NoSuchMethodException unused) {
                StringBuilder sb = new StringBuilder("Can not find match constructor for ");
                sb.append(cls.getName());
                sb.append(" with params ");
                if (clsArr == null) {
                    str3 = "";
                } else {
                    str3 = C2886h.m8191a((Object[]) clsArr);
                }
                sb.append(str3);
                C2852b.m8147a("DecompressInputStreamFactory", sb.toString());
                constructor = null;
            }
        } else {
            constructor = cls.getConstructor(clsArr);
        }
        if (constructor == null) {
            return null;
        }
        try {
            inputStream = (InputStream) constructor.newInstance(objArr);
        } catch (Exception unused2) {
            StringBuilder sb2 = new StringBuilder("Can not new an instance for ");
            sb2.append(cls.getName());
            sb2.append(" with params ");
            if (clsArr == null) {
                str2 = "";
            } else {
                str2 = C2886h.m8191a((Object[]) clsArr);
            }
            sb2.append(str2);
            C2852b.m8147a("DecompressInputStreamFactory", sb2.toString());
            inputStream = null;
        }
        return inputStream;
    }

    /* renamed from: a */
    private static void m8136a(String str, Class<? extends InputStream> cls, Class<?>... clsArr) {
        f8481a.put(str, new C2855b(cls, Arrays.asList(clsArr)));
    }
}
