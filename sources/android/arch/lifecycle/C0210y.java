package android.arch.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.arch.lifecycle.y */
public final class C0210y {

    /* renamed from: a */
    private final C0212b f487a;

    /* renamed from: b */
    private final C0159aa f488b;

    /* renamed from: android.arch.lifecycle.y$a */
    public static class C0211a extends C0213c {

        /* renamed from: a */
        private static C0211a f489a;

        /* renamed from: b */
        private Application f490b;

        private C0211a(Application application) {
            this.f490b = application;
        }

        /* renamed from: a */
        public static C0211a m433a(Application application) {
            if (f489a == null) {
                f489a = new C0211a(application);
            }
            return f489a;
        }

        /* renamed from: a */
        public final <T extends C0209x> T mo361a(Class<T> cls) {
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return super.mo361a(cls);
            }
            try {
                return (C0209x) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{this.f490b});
            } catch (NoSuchMethodException e) {
                StringBuilder sb = new StringBuilder("Cannot create an instance of ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder("Cannot create an instance of ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            } catch (InstantiationException e3) {
                StringBuilder sb3 = new StringBuilder("Cannot create an instance of ");
                sb3.append(cls);
                throw new RuntimeException(sb3.toString(), e3);
            } catch (InvocationTargetException e4) {
                StringBuilder sb4 = new StringBuilder("Cannot create an instance of ");
                sb4.append(cls);
                throw new RuntimeException(sb4.toString(), e4);
            }
        }
    }

    /* renamed from: android.arch.lifecycle.y$b */
    public interface C0212b {
        /* renamed from: a */
        <T extends C0209x> T mo361a(Class<T> cls);
    }

    /* renamed from: android.arch.lifecycle.y$c */
    public static class C0213c implements C0212b {
        /* renamed from: a */
        public <T extends C0209x> T mo361a(Class<T> cls) {
            try {
                return (C0209x) cls.newInstance();
            } catch (InstantiationException e) {
                StringBuilder sb = new StringBuilder("Cannot create an instance of ");
                sb.append(cls);
                throw new RuntimeException(sb.toString(), e);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder("Cannot create an instance of ");
                sb2.append(cls);
                throw new RuntimeException(sb2.toString(), e2);
            }
        }
    }

    /* renamed from: a */
    public final <T extends C0209x> T mo359a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return mo360a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C0210y(C0159aa aaVar, C0212b bVar) {
        this.f487a = bVar;
        this.f488b = aaVar;
    }

    /* renamed from: a */
    public final <T extends C0209x> T mo360a(String str, Class<T> cls) {
        T a = this.f488b.mo300a(str);
        if (cls.isInstance(a)) {
            return a;
        }
        T a2 = this.f487a.mo361a(cls);
        this.f488b.mo302a(str, a2);
        return a2;
    }
}
