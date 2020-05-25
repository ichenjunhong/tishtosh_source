package p064c.p065a.p072e.p087j;

import java.io.Serializable;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p074b.C1745b;

/* renamed from: c.a.e.j.j */
public enum C2134j {
    COMPLETE;

    /* renamed from: c.a.e.j.j$a */
    static final class C2135a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: a */
        final C1690c f6893a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Disposable[");
            sb.append(this.f6893a);
            sb.append("]");
            return sb.toString();
        }

        C2135a(C1690c cVar) {
            this.f6893a = cVar;
        }
    }

    /* renamed from: c.a.e.j.j$b */
    static final class C2136b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: a */
        final Throwable f6894a;

        public final int hashCode() {
            return this.f6894a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Error[");
            sb.append(this.f6894a);
            sb.append("]");
            return sb.toString();
        }

        C2136b(Throwable th) {
            this.f6894a = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C2136b)) {
                return false;
            }
            return C1745b.m6051a((Object) this.f6894a, (Object) ((C2136b) obj).f6894a);
        }
    }

    /* renamed from: c.a.e.j.j$c */
    static final class C2137c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* renamed from: a */
        final C53696d f6895a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Subscription[");
            sb.append(this.f6895a);
            sb.append("]");
            return sb.toString();
        }

        C2137c(C53696d dVar) {
            this.f6895a = dVar;
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof C2135a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof C2136b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof C2137c;
    }

    public static Object disposable(C1690c cVar) {
        return new C2135a(cVar);
    }

    public static Object error(Throwable th) {
        return new C2136b(th);
    }

    public static C1690c getDisposable(Object obj) {
        return ((C2135a) obj).f6893a;
    }

    public static Throwable getError(Object obj) {
        return ((C2136b) obj).f6894a;
    }

    public static C53696d getSubscription(Object obj) {
        return ((C2137c) obj).f6895a;
    }

    public static boolean isComplete(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static Object subscription(C53696d dVar) {
        return new C2137c(dVar);
    }

    public static <T> boolean accept(Object obj, C1674ab<? super T> abVar) {
        if (obj == COMPLETE) {
            abVar.onComplete();
            return true;
        } else if (obj instanceof C2136b) {
            abVar.onError(((C2136b) obj).f6894a);
            return true;
        } else {
            abVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean accept(Object obj, C53695c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C2136b) {
            cVar.onError(((C2136b) obj).f6894a);
            return true;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, C1674ab<? super T> abVar) {
        if (obj == COMPLETE) {
            abVar.onComplete();
            return true;
        } else if (obj instanceof C2136b) {
            abVar.onError(((C2136b) obj).f6894a);
            return true;
        } else if (obj instanceof C2135a) {
            abVar.onSubscribe(((C2135a) obj).f6893a);
            return false;
        } else {
            abVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, C53695c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C2136b) {
            cVar.onError(((C2136b) obj).f6894a);
            return true;
        } else if (obj instanceof C2137c) {
            cVar.onSubscribe(((C2137c) obj).f6895a);
            return false;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }
}
