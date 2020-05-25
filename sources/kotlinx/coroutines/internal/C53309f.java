package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52857u;
import p2628d.p2629a.C52568f;
import p2628d.p2630b.C52594a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: kotlinx.coroutines.internal.f */
public final class C53309f {

    /* renamed from: a */
    private static final ReentrantReadWriteLock f131928a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private static final WeakHashMap<Class<? extends Throwable>, C52671b<Throwable, Throwable>> f131929b = new WeakHashMap<>();

    /* renamed from: kotlinx.coroutines.internal.f$a */
    public static final class C53310a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Constructor constructor = (Constructor) t2;
            C52711k.m112236a((Object) constructor, "it");
            Comparable valueOf = Integer.valueOf(constructor.getParameterTypes().length);
            Constructor constructor2 = (Constructor) t;
            C52711k.m112236a((Object) constructor2, "it");
            return C52594a.m112153a(valueOf, Integer.valueOf(constructor2.getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$b */
    static final class C53311b extends C52712l implements C52671b<Throwable, E> {

        /* renamed from: a */
        final /* synthetic */ Constructor f131930a;

        C53311b(Constructor constructor) {
            this.f131930a = constructor;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public E invoke(Throwable th) {
            E e;
            C52711k.m112240b(th, "e");
            try {
                Object newInstance = this.f131930a.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    e = C52848o.m114620constructorimpl((Throwable) newInstance);
                    if (C52848o.m114625isFailureimpl(e)) {
                        e = null;
                    }
                    return (Throwable) e;
                }
                throw new C52857u("null cannot be cast to non-null type E");
            } catch (Throwable th2) {
                e = C52848o.m114620constructorimpl(C52851p.m112464a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$c */
    static final class C53312c extends C52712l implements C52671b<Throwable, E> {

        /* renamed from: a */
        final /* synthetic */ Constructor f131931a;

        C53312c(Constructor constructor) {
            this.f131931a = constructor;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public E invoke(Throwable th) {
            E e;
            C52711k.m112240b(th, "e");
            try {
                Object newInstance = this.f131931a.newInstance(new Object[]{th});
                if (newInstance != null) {
                    e = C52848o.m114620constructorimpl((Throwable) newInstance);
                    if (C52848o.m114625isFailureimpl(e)) {
                        e = null;
                    }
                    return (Throwable) e;
                }
                throw new C52857u("null cannot be cast to non-null type E");
            } catch (Throwable th2) {
                e = C52848o.m114620constructorimpl(C52851p.m112464a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$d */
    static final class C53313d extends C52712l implements C52671b<Throwable, E> {

        /* renamed from: a */
        final /* synthetic */ Constructor f131932a;

        C53313d(Constructor constructor) {
            this.f131932a = constructor;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public E invoke(Throwable th) {
            E e;
            C52711k.m112240b(th, "e");
            try {
                Object newInstance = this.f131932a.newInstance(new Object[0]);
                if (newInstance != null) {
                    e = C52848o.m114620constructorimpl((Throwable) newInstance);
                    if (C52848o.m114625isFailureimpl(e)) {
                        e = null;
                    }
                    E e2 = (Throwable) e;
                    if (e2 == null) {
                        return null;
                    }
                    e2.initCause(th);
                    return e2;
                }
                throw new C52857u("null cannot be cast to non-null type E");
            } catch (Throwable th2) {
                e = C52848o.m114620constructorimpl(C52851p.m112464a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.f$e */
    static final class C53314e extends C52712l implements C52671b {

        /* renamed from: a */
        public static final C53314e f131933a = new C53314e();

        C53314e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((Throwable) obj, "it");
            return null;
        }
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m113303a(E e) {
        boolean z;
        C52671b bVar;
        int i;
        C52671b bVar2;
        boolean z2;
        C52711k.m112240b(e, "exception");
        ReadLock readLock = f131928a.readLock();
        readLock.lock();
        try {
            C52671b bVar3 = (C52671b) f131929b.get(e.getClass());
            if (bVar3 != null) {
                return (Throwable) bVar3.invoke(e);
            }
            Object[] constructors = e.getClass().getConstructors();
            C52711k.m112236a((Object) constructors, "exception.javaClass.constructors");
            Comparator aVar = new C53310a();
            C52711k.m112240b(constructors, "$this$sortedWith");
            C52711k.m112240b(aVar, "comparator");
            C52711k.m112240b(constructors, "$this$sortedArrayWith");
            C52711k.m112240b(aVar, "comparator");
            int i2 = 0;
            if (constructors.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                constructors = Arrays.copyOf(constructors, constructors.length);
                C52711k.m112236a((Object) constructors, "java.util.Arrays.copyOf(this, size)");
                C52568f.m112069a((T[]) constructors, aVar);
            }
            Iterator it = C52568f.m112068a(constructors).iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                Constructor constructor = (Constructor) it.next();
                C52711k.m112236a((Object) constructor, "constructor");
                Class[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length != 2 || !C52711k.m112239a((Object) parameterTypes[i2], (Object) String.class) || !C52711k.m112239a((Object) parameterTypes[1], (Object) Throwable.class)) {
                    if (parameterTypes.length == 1 && C52711k.m112239a((Object) parameterTypes[i2], (Object) Throwable.class)) {
                        bVar = new C53312c(constructor);
                        break;
                    }
                    C52711k.m112236a((Object) parameterTypes, "parameters");
                    if (parameterTypes.length == 0) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        bVar = new C53313d(constructor);
                        break;
                    }
                } else {
                    bVar = new C53311b(constructor);
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock = f131928a;
            ReadLock readLock2 = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i = 0;
            }
            for (int i3 = 0; i3 < i; i3++) {
                readLock2.unlock();
            }
            WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                Map map = f131929b;
                Class cls = e.getClass();
                if (bVar == null) {
                    bVar2 = C53314e.f131933a;
                } else {
                    bVar2 = bVar;
                }
                map.put(cls, bVar2);
                writeLock.unlock();
                if (bVar != null) {
                    return (Throwable) bVar.invoke(e);
                }
                return null;
            } finally {
                while (i2 < i) {
                    readLock2.lock();
                    i2++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
