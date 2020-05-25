package com.google.android.play.core.p1051c;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import com.C2240a;
import com.google.android.play.core.splitcompat.C17386d;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.play.core.c.ac */
public final class C17253ac {

    /* renamed from: a */
    final C17386d f48725a;

    /* renamed from: b */
    private final C17295h f48726b;

    /* renamed from: c */
    private final Context f48727c;

    public C17253ac(Context context, C17386d dVar, C17295h hVar) {
        this.f48725a = dVar;
        this.f48726b = hVar;
        this.f48727c = context;
    }

    /* renamed from: a */
    public static <T> C17312y<T> m42252a(Object obj, String str, Class<T> cls) {
        return new C17312y<>(obj, m42257a(obj, str), cls);
    }

    /* renamed from: a */
    public static <R, P0> R m42253a(Class<?> cls, String str, Class<R> cls2, Class<P0> cls3, P0 p0) {
        try {
            return cls2.cast(m42258a(cls, str, (Class<?>[]) new Class[]{cls3}).invoke(null, new Object[]{p0}));
        } catch (Exception e) {
            throw new C17251aa(C2240a.m6772a("Failed to invoke static method %s on type %s", new Object[]{str, cls}), e);
        }
    }

    /* renamed from: a */
    public static <R, P0, P1> R m42254a(Class<?> cls, String str, Class<R> cls2, Class<P0> cls3, P0 p0, Class<P1> cls4, P1 p1) {
        try {
            return cls2.cast(m42258a(cls, str, (Class<?>[]) new Class[]{cls3, cls4}).invoke(null, new Object[]{p0, p1}));
        } catch (Exception e) {
            throw new C17251aa(C2240a.m6772a("Failed to invoke static method %s on type %s", new Object[]{str, cls}), e);
        }
    }

    /* renamed from: a */
    public static <R, P0> R m42255a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0) {
        try {
            return cls.cast(m42259a(obj, str, (Class<?>[]) new Class[]{cls2}).invoke(obj, new Object[]{p0}));
        } catch (Exception e) {
            throw new C17251aa(C2240a.m6772a("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: a */
    public static <R, P0, P1, P2> R m42256a(Object obj, String str, Class<R> cls, Class<P0> cls2, P0 p0, Class<P1> cls3, P1 p1, Class<P2> cls4, P2 p2) {
        try {
            return cls.cast(m42259a(obj, str, (Class<?>[]) new Class[]{cls2, cls3, cls4}).invoke(obj, new Object[]{p0, p1, p2}));
        } catch (Exception e) {
            throw new C17251aa(C2240a.m6772a("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: a */
    private static Field m42257a(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new C17251aa(C2240a.m6772a("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    /* renamed from: a */
    private static Method m42258a(Class<?> cls, String str, Class<?>... clsArr) {
        Class<?> cls2 = cls;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new C17251aa(C2240a.m6772a("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    /* renamed from: a */
    private static Method m42259a(Object obj, String str, Class<?>... clsArr) {
        return m42258a(obj.getClass(), str, clsArr);
    }

    /* renamed from: a */
    private static X509Certificate m42260a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static <T> C17312y m42262b(Object obj, String str, Class<T> cls) {
        return new C17312y(obj, m42257a(obj, str), cls, 0);
    }

    /* renamed from: b */
    private Signature[] m42263b() {
        try {
            return this.f48727c.getPackageManager().getPackageInfo(this.f48727c.getPackageName(), 64).signatures;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final boolean mo33527a() {
        List list;
        try {
            File b = this.f48725a.mo33699b();
            Signature[] b2 = m42263b();
            if (b2 == null) {
                list = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Signature a : b2) {
                    X509Certificate a2 = m42260a(a);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
                list = arrayList;
            }
            if (list == null || list.isEmpty()) {
                return false;
            }
            File[] listFiles = b.listFiles();
            Arrays.sort(listFiles);
            int length = listFiles.length - 1;
            while (length >= 0) {
                File file = listFiles[length];
                try {
                    if (!m42261a(file.getAbsolutePath(), list)) {
                        return false;
                    }
                    try {
                        file.renameTo(new File(this.f48725a.mo33701c(), file.getName()));
                        length--;
                    } catch (IOException unused) {
                        return false;
                    }
                } catch (Exception unused2) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused3) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m42261a(String str, List<X509Certificate> list) {
        boolean z;
        try {
            X509Certificate[][] a = C17272au.m42305a(str);
            if (a == null || a.length == 0 || a[0].length == 0 || list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            do {
                z = true;
                if (it.hasNext()) {
                    X509Certificate x509Certificate = (X509Certificate) it.next();
                    int length = a.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            continue;
                            break;
                        } else if (a[i][0].equals(x509Certificate)) {
                            continue;
                            break;
                        } else {
                            i++;
                        }
                    }
                } else {
                    return true;
                }
            } while (z);
            return false;
        } catch (Exception unused) {
        }
        return false;
    }
}
