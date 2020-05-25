package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axz;
import com.google.android.gms.internal.ads.axz.C15671a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class axz<MessageType extends axz<MessageType, BuilderType>, BuilderType extends C15671a<MessageType, BuilderType>> extends awe<MessageType, BuilderType> {
    private static Map<Object, axz<?, ?>> zzfzc = new ConcurrentHashMap();
    protected bav zzfza = bav.m35112a();
    private int zzfzb = -1;

    /* renamed from: com.google.android.gms.internal.ads.axz$a */
    public static abstract class C15671a<MessageType extends axz<MessageType, BuilderType>, BuilderType extends C15671a<MessageType, BuilderType>> extends awf<MessageType, BuilderType> {

        /* renamed from: a */
        protected MessageType f41605a;

        /* renamed from: b */
        private final MessageType f41606b;

        /* renamed from: c */
        private boolean f41607c = false;

        protected C15671a(MessageType messagetype) {
            this.f41606b = messagetype;
            this.f41605a = (axz) messagetype.mo28773a(C15675e.f41612d, (Object) null, (Object) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final void mo29830c() {
            if (this.f41607c) {
                MessageType messagetype = (axz) this.f41605a.mo28773a(C15675e.f41612d, (Object) null, (Object) null);
                m34729a(messagetype, this.f41605a);
                this.f41605a = messagetype;
                this.f41607c = false;
            }
        }

        /* renamed from: h */
        public final boolean mo29822h() {
            return axz.m34716a(this.f41605a, false);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MessageType mo29831d() {
            if (this.f41607c) {
                return this.f41605a;
            }
            MessageType messagetype = this.f41605a;
            azx.m34942a().mo29906a(messagetype).mo29901c(messagetype);
            this.f41607c = true;
            return this.f41605a;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public MessageType mo29832e() {
            MessageType messagetype = (axz) mo29831d();
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) messagetype.mo28773a(C15675e.f41609a, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = azx.m34942a().mo29906a(messagetype).mo29902d(messagetype);
                    if (booleanValue) {
                        messagetype.mo28773a(C15675e.f41610b, (Object) z ? messagetype : null, (Object) null);
                    }
                }
            }
            if (z) {
                return messagetype;
            }
            throw new bat(messagetype);
        }

        /* renamed from: a */
        public final BuilderType mo29582a(MessageType messagetype) {
            mo29830c();
            m34729a(this.f41605a, messagetype);
            return this;
        }

        /* renamed from: a */
        private static void m34729a(MessageType messagetype, MessageType messagetype2) {
            azx.m34942a().mo29906a(messagetype).mo29900b(messagetype, messagetype2);
        }

        /* renamed from: b */
        private final BuilderType m34731b(byte[] bArr, int i, int i2, axm axm) throws ayi {
            mo29830c();
            try {
                azx.m34942a().mo29906a(this.f41605a).mo29897a(this.f41605a, bArr, 0, i2 + 0, new awl(axm));
                return this;
            } catch (ayi e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw ayi.m34778a();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final BuilderType mo29583a(axa axa, axm axm) throws IOException {
            mo29830c();
            try {
                azx.m34942a().mo29906a(this.f41605a).mo29895a(this.f41605a, axd.m34377a(axa), axm);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: a */
        public final /* synthetic */ awf mo29584a(byte[] bArr, int i, int i2, axm axm) throws ayi {
            return m34731b(bArr, 0, i2, axm);
        }

        /* renamed from: b */
        public final /* synthetic */ awf mo29586b() {
            return (C15671a) clone();
        }

        /* renamed from: n */
        public final /* synthetic */ azj mo29827n() {
            return this.f41606b;
        }

        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            C15671a aVar = (C15671a) ((axz) this.f41606b).mo28773a(C15675e.f41613e, (Object) null, (Object) null);
            aVar.mo29582a((MessageType) (axz) mo29831d());
            return aVar;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.axz$b */
    public static class C15672b<T extends axz<T, ?>> extends awg<T> {

        /* renamed from: a */
        private final T f41608a;

        public C15672b(T t) {
            this.f41608a = t;
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.axz$c */
    public static abstract class C15673c<MessageType extends C15673c<MessageType, BuilderType>, BuilderType> extends axz<MessageType, BuilderType> implements azl {
        protected axq<Object> zzfzg = axq.f41528d;
    }

    /* renamed from: com.google.android.gms.internal.ads.axz$d */
    public static class C15674d<ContainingType extends azj, Type> extends axj<ContainingType, Type> {
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.internal.ads.axz$e */
    public static final class C15675e {

        /* renamed from: a */
        public static final int f41609a = 1;

        /* renamed from: b */
        public static final int f41610b = 2;

        /* renamed from: c */
        public static final int f41611c = 3;

        /* renamed from: d */
        public static final int f41612d = 4;

        /* renamed from: e */
        public static final int f41613e = 5;

        /* renamed from: f */
        public static final int f41614f = 6;

        /* renamed from: g */
        public static final int f41615g = 7;

        /* renamed from: h */
        public static final int f41616h = 1;

        /* renamed from: i */
        public static final int f41617i = 2;

        /* renamed from: j */
        public static final int f41618j = 1;

        /* renamed from: k */
        public static final int f41619k = 2;

        /* renamed from: l */
        private static final /* synthetic */ int[] f41620l = {f41609a, f41610b, f41611c, f41612d, f41613e, f41614f, f41615g};

        /* renamed from: m */
        private static final /* synthetic */ int[] f41621m = {f41616h, f41617i};

        /* renamed from: n */
        private static final /* synthetic */ int[] f41622n = {f41618j, f41619k};

        /* renamed from: a */
        public static int[] m34743a() {
            return (int[]) f41620l.clone();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo28773a(int i, Object obj, Object obj2);

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        azn.m34873a(this, sb, 0);
        return sb.toString();
    }

    public int hashCode() {
        if (this.zzfuc != 0) {
            return this.zzfuc;
        }
        this.zzfuc = azx.m34942a().mo29906a(this).mo29892a(this);
        return this.zzfuc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((axz) mo28773a(C15675e.f41614f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return azx.m34942a().mo29906a(this).mo29898a(this, (axz) obj);
    }

    /* renamed from: h */
    public final boolean mo29822h() {
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) mo28773a(C15675e.f41609a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d = azx.m34942a().mo29906a(this).mo29902d(this);
        if (booleanValue) {
            mo28773a(C15675e.f41610b, (Object) d ? this : null, (Object) null);
        }
        return d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final int mo29581g() {
        return this.zzfzb;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo29578a(int i) {
        this.zzfzb = i;
    }

    /* renamed from: a */
    public final void mo29820a(axf axf) throws IOException {
        axh axh;
        bab a = azx.m34942a().mo29905a(getClass());
        if (axf.f41497a != null) {
            axh = axf.f41497a;
        } else {
            axh = new axh(axf);
        }
        a.mo29896a(this, (bbq) axh);
    }

    /* renamed from: i */
    public final int mo29824i() {
        if (this.zzfzb == -1) {
            this.zzfzb = azx.m34942a().mo29906a(this).mo29899b(this);
        }
        return this.zzfzb;
    }

    /* renamed from: a */
    static <T extends axz<?, ?>> T m34712a(Class<T> cls) {
        T t = (axz) zzfzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (axz) zzfzc.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (axz) ((axz) bba.m35146a(cls)).mo28773a(C15675e.f41614f, (Object) null, (Object) null);
            if (t != null) {
                zzfzc.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: a */
    protected static <T extends axz<?, ?>> void m34715a(Class<T> cls, T t) {
        zzfzc.put(cls, t);
    }

    /* renamed from: a */
    protected static Object m34713a(azj azj, String str, Object[] objArr) {
        return new azz(azj, str, objArr);
    }

    /* renamed from: a */
    static Object m34714a(Method method, Object obj, Object... objArr) {
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
    protected static final <T extends axz<T, ?>> boolean m34716a(T t, boolean z) {
        byte byteValue = ((Byte) t.mo28773a(C15675e.f41609a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return azx.m34942a().mo29906a(t).mo29902d(t);
    }

    /* renamed from: j */
    protected static ayf m34717j() {
        return aya.m34758d();
    }

    /* renamed from: k */
    protected static <E> ayh<E> m34718k() {
        return azy.m34945d();
    }

    /* renamed from: a */
    private static <T extends axz<T, ?>> T m34708a(T t, axa axa, axm axm) throws ayi {
        T t2 = (axz) t.mo28773a(C15675e.f41612d, (Object) null, (Object) null);
        try {
            azx.m34942a().mo29906a(t2).mo29895a(t2, axd.m34377a(axa), axm);
            azx.m34942a().mo29906a(t2).mo29901c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof ayi) {
                throw ((ayi) e.getCause());
            }
            throw new ayi(e.getMessage()).zzk(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof ayi) {
                throw ((ayi) e2.getCause());
            }
            throw e2;
        }
    }

    /* renamed from: a */
    private static <T extends axz<T, ?>> T m34710a(T t, byte[] bArr, int i, int i2, axm axm) throws ayi {
        T t2 = (axz) t.mo28773a(C15675e.f41612d, (Object) null, (Object) null);
        try {
            azx.m34942a().mo29906a(t2).mo29897a(t2, bArr, 0, i2, new awl(axm));
            azx.m34942a().mo29906a(t2).mo29901c(t2);
            if (t2.zzfuc == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof ayi) {
                throw ((ayi) e.getCause());
            }
            throw new ayi(e.getMessage()).zzk(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw ayi.m34778a().zzk(t2);
        }
    }

    /* renamed from: a */
    protected static <T extends axz<T, ?>> T m34706a(T t, awo awo) throws ayi {
        boolean z;
        T a = m34707a(t, awo, axm.m34646a());
        boolean z2 = false;
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo28773a(C15675e.f41609a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue == 0) {
                z = false;
            } else {
                z = azx.m34942a().mo29906a(a).mo29902d(a);
                if (booleanValue) {
                    a.mo28773a(C15675e.f41610b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                throw new bat(a).zzavo().zzk(a);
            }
        }
        if (a != null) {
            boolean booleanValue2 = Boolean.TRUE.booleanValue();
            byte byteValue2 = ((Byte) a.mo28773a(C15675e.f41609a, (Object) null, (Object) null)).byteValue();
            if (byteValue2 == 1) {
                z2 = true;
            } else if (byteValue2 != 0) {
                z2 = azx.m34942a().mo29906a(a).mo29902d(a);
                if (booleanValue2) {
                    a.mo28773a(C15675e.f41610b, (Object) z2 ? a : null, (Object) null);
                }
            }
            if (!z2) {
                throw new bat(a).zzavo().zzk(a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static <T extends axz<T, ?>> T m34707a(T t, awo awo, axm axm) throws ayi {
        T a;
        try {
            axa zzarg = awo.zzarg();
            a = m34708a(t, zzarg, axm);
            zzarg.mo29635a(0);
            return a;
        } catch (ayi e) {
            throw e.zzk(a);
        } catch (ayi e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    protected static <T extends axz<T, ?>> T m34709a(T t, byte[] bArr) throws ayi {
        boolean z = false;
        T a = m34710a(t, bArr, 0, bArr.length, axm.m34646a());
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo28773a(C15675e.f41609a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = azx.m34942a().mo29906a(a).mo29902d(a);
                if (booleanValue) {
                    a.mo28773a(C15675e.f41610b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                throw new bat(a).zzavo().zzk(a);
            }
        }
        return a;
    }

    /* renamed from: a */
    protected static <T extends axz<T, ?>> T m34711a(T t, byte[] bArr, axm axm) throws ayi {
        boolean z = false;
        T a = m34710a(t, bArr, 0, bArr.length, axm);
        if (a != null) {
            boolean booleanValue = Boolean.TRUE.booleanValue();
            byte byteValue = ((Byte) a.mo28773a(C15675e.f41609a, (Object) null, (Object) null)).byteValue();
            if (byteValue == 1) {
                z = true;
            } else if (byteValue != 0) {
                z = azx.m34942a().mo29906a(a).mo29902d(a);
                if (booleanValue) {
                    a.mo28773a(C15675e.f41610b, (Object) z ? a : null, (Object) null);
                }
            }
            if (!z) {
                throw new bat(a).zzavo().zzk(a);
            }
        }
        return a;
    }

    /* renamed from: l */
    public final /* synthetic */ azk mo29825l() {
        C15671a aVar = (C15671a) mo28773a(C15675e.f41613e, (Object) null, (Object) null);
        aVar.mo29582a(this);
        return aVar;
    }

    /* renamed from: m */
    public final /* synthetic */ azk mo29826m() {
        return (C15671a) mo28773a(C15675e.f41613e, (Object) null, (Object) null);
    }

    /* renamed from: n */
    public final /* synthetic */ azj mo29827n() {
        return (axz) mo28773a(C15675e.f41614f, (Object) null, (Object) null);
    }
}
