package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16736hd;
import com.google.android.gms.internal.measurement.C16736hd.C16737a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.measurement.hd */
public abstract class C16736hd<MessageType extends C16736hd<MessageType, BuilderType>, BuilderType extends C16737a<MessageType, BuilderType>> extends C16684fl<MessageType, BuilderType> {
    private static Map<Object, C16736hd<?, ?>> zzbyf = new ConcurrentHashMap();
    protected C16813jv zzbyd = C16813jv.m40633a();
    private int zzbye = -1;

    /* renamed from: com.google.android.gms.internal.measurement.hd$a */
    public static abstract class C16737a<MessageType extends C16736hd<MessageType, BuilderType>, BuilderType extends C16737a<MessageType, BuilderType>> extends C16685fm<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f47086a;

        /* renamed from: b */
        private final MessageType f47087b;

        /* renamed from: c */
        private boolean f47088c = false;

        protected C16737a(MessageType messagetype) {
            this.f47087b = messagetype;
            this.f47086a = (C16736hd) messagetype.mo31917a(C16741e.f47093d, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo32237b() {
            if (this.f47088c) {
                MessageType messagetype = (C16736hd) this.f47086a.mo31917a(C16741e.f47093d, (Object) null, (Object) null);
                m40292a(messagetype, this.f47086a);
                this.f47086a = messagetype;
                this.f47088c = false;
            }
        }

        /* renamed from: e */
        public final boolean mo32227e() {
            return C16736hd.m40281a(this.f47086a, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public MessageType mo32238c() {
            if (this.f47088c) {
                return this.f47086a;
            }
            MessageType messagetype = this.f47086a;
            C16788ix.m40472a().mo32309a(messagetype).mo32304c(messagetype);
            this.f47088c = true;
            return this.f47086a;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public MessageType mo32239d() {
            MessageType messagetype = (C16736hd) mo32238c();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo31917a(C16741e.f47090a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C16788ix.m40472a().mo32309a(messagetype).mo32305d(messagetype);
                    if (booleanValue) {
                        messagetype.mo31917a(C16741e.f47091b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new C16811jt(messagetype);
        }

        /* renamed from: a */
        public final BuilderType mo31990a(MessageType messagetype) {
            mo32237b();
            m40292a(this.f47086a, messagetype);
            return this;
        }

        /* renamed from: a */
        private static void m40292a(MessageType messagetype, MessageType messagetype2) {
            C16788ix.m40472a().mo32309a(messagetype).mo32303b(messagetype, messagetype2);
        }

        /* renamed from: a */
        public final /* synthetic */ C16685fm mo31989a() {
            return (C16737a) clone();
        }

        /* renamed from: j */
        public final /* synthetic */ C16775ik mo32234j() {
            return this.f47087b;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C16737a aVar = (C16737a) ((C16736hd) this.f47087b).mo31917a(C16741e.f47094e, (Object) null, (Object) null);
            aVar.mo31990a((MessageType) (C16736hd) mo32238c());
            return aVar;
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.hd$b */
    public static class C16738b<T extends C16736hd<T, ?>> extends C16686fn<T> {

        /* renamed from: a */
        private final T f47089a;

        public C16738b(T t) {
            this.f47089a = t;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo32240a(C16704ge geVar, C16721gq gqVar) throws C16748hk {
            return C16736hd.m40276a(this.f47089a, geVar, gqVar);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.hd$c */
    public static abstract class C16739c<MessageType extends C16739c<MessageType, BuilderType>, BuilderType> extends C16736hd<MessageType, BuilderType> implements C16777im {
        protected C16726gu<Object> zzbyj = C16726gu.f47002d;
    }

    /* renamed from: com.google.android.gms.internal.measurement.hd$d */
    public static class C16740d<ContainingType extends C16775ik, Type> extends C16718gn<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.measurement.hd$e */
    public static final class C16741e {

        /* renamed from: a */
        public static final int f47090a = 1;

        /* renamed from: b */
        public static final int f47091b = 2;

        /* renamed from: c */
        public static final int f47092c = 3;

        /* renamed from: d */
        public static final int f47093d = 4;

        /* renamed from: e */
        public static final int f47094e = 5;

        /* renamed from: f */
        public static final int f47095f = 6;

        /* renamed from: g */
        public static final int f47096g = 7;

        /* renamed from: h */
        public static final int f47097h = 1;

        /* renamed from: i */
        public static final int f47098i = 2;

        /* renamed from: j */
        public static final int f47099j = 1;

        /* renamed from: k */
        public static final int f47100k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f47101l = {f47090a, f47091b, f47092c, f47093d, f47094e, f47095f, f47096g};

        /* renamed from: m */
        private static final /* synthetic */ int[] f47102m = {f47097h, f47098i};

        /* renamed from: n */
        private static final /* synthetic */ int[] f47103n = {f47099j, f47100k};

        /* renamed from: a */
        public static int[] m40304a() {
            return (int[]) f47101l.clone();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo31917a(int i, Object obj, Object obj2);

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C16778in.m40412a(this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.zzbti != 0) {
            return this.zzbti;
        }
        this.zzbti = C16788ix.m40472a().mo32309a(this).mo32297a(this);
        return this.zzbti;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C16736hd) mo31917a(C16741e.f47095f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return C16788ix.m40472a().mo32309a(this).mo32301a(this, (C16736hd) obj);
    }

    /* renamed from: e */
    public final boolean mo32227e() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo31917a(C16741e.f47090a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = C16788ix.m40472a().mo32309a(this).mo32305d(this);
        if (booleanValue) {
            mo31917a(C16741e.f47091b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    /* renamed from: f */
    public final BuilderType mo32229f() {
        BuilderType buildertype = (C16737a) mo31917a(C16741e.f47094e, (Object) null, (Object) null);
        buildertype.mo31990a(this);
        return buildertype;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo31988d() {
        return this.zzbye;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo31986a(int i) {
        this.zzbye = i;
    }

    /* renamed from: a */
    public final void mo32226a(C16709gj gjVar) throws IOException {
        C16716gl glVar;
        C16793jb a = C16788ix.m40472a().mo32308a(getClass());
        if (gjVar.f46972a != null) {
            glVar = gjVar.f46972a;
        } else {
            glVar = new C16716gl(gjVar);
        }
        a.mo32300a(this, (C16838kp) glVar);
    }

    /* renamed from: g */
    public final int mo32230g() {
        if (this.zzbye == -1) {
            this.zzbye = C16788ix.m40472a().mo32309a(this).mo32302b(this);
        }
        return this.zzbye;
    }

    /* renamed from: a */
    static <T extends C16736hd<?, ?>> T m40277a(Class<T> cls) {
        T t = (C16736hd) zzbyf.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (C16736hd) zzbyf.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (C16736hd) ((C16736hd) C16819ka.m40676a(cls)).mo31917a(C16741e.f47095f, (Object) null, (Object) null);
            if (t != null) {
                zzbyf.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    protected static <T extends C16736hd<?, ?>> void m40280a(Class<T> cls, T t) {
        zzbyf.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m40278a(C16775ik ikVar, String str, Object[] objArr) {
        return new C16790iz(ikVar, str, objArr);
    }

    /* renamed from: a */
    static Object m40279a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: a */
    protected static final <T extends C16736hd<T, ?>> boolean m40281a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo31917a(C16741e.f47090a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return C16788ix.m40472a().mo32309a(t).mo32305d(t);
    }

    /* renamed from: a */
    static <T extends C16736hd<T, ?>> T m40276a(T t, C16704ge geVar, C16721gq gqVar) throws C16748hk {
        C16707gh ghVar;
        T t2 = (C16736hd) t.mo31917a(C16741e.f47093d, (Object) null, (Object) null);
        try {
            C16793jb a = C16788ix.m40472a().mo32309a(t2);
            if (geVar.f46955c != null) {
                ghVar = geVar.f46955c;
            } else {
                ghVar = new C16707gh(geVar);
            }
            a.mo32299a(t2, ghVar, gqVar);
            C16788ix.m40472a().mo32309a(t2).mo32304c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C16748hk) {
                throw ((C16748hk) e.getCause());
            }
            throw new C16748hk(e.getMessage()).zzg(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C16748hk) {
                throw ((C16748hk) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: h */
    public final /* synthetic */ C16776il mo32231h() {
        C16737a aVar = (C16737a) mo31917a(C16741e.f47094e, (Object) null, (Object) null);
        aVar.mo31990a(this);
        return aVar;
    }

    /* renamed from: i */
    public final /* synthetic */ C16776il mo32233i() {
        return (C16737a) mo31917a(C16741e.f47094e, (Object) null, (Object) null);
    }

    /* renamed from: j */
    public final /* synthetic */ C16775ik mo32234j() {
        return (C16736hd) mo31917a(C16741e.f47095f, (Object) null, (Object) null);
    }
}
