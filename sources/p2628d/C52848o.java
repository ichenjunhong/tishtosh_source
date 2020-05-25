package p2628d;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.o */
public final class C52848o<T> implements Serializable {
    public static final C52849a Companion = new C52849a(null);

    /* renamed from: a */
    private final Object f131094a;

    /* renamed from: d.o$a */
    public static final class C52849a {
        private C52849a() {
        }

        public /* synthetic */ C52849a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: d.o$b */
    public static final class C52850b implements Serializable {
        public final Throwable exception;

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Failure(");
            sb.append(this.exception);
            sb.append(')');
            return sb.toString();
        }

        public C52850b(Throwable th) {
            C52711k.m112240b(th, "exception");
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C52850b) || !C52711k.m112239a((Object) this.exception, (Object) ((C52850b) obj).exception)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: box-impl reason: not valid java name */
    public static final /* synthetic */ C52848o m114619boximpl(Object obj) {
        return new C52848o(obj);
    }

    /* renamed from: constructor-impl reason: not valid java name */
    public static Object m114620constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl reason: not valid java name */
    public static boolean m114621equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof C52848o) && C52711k.m112239a(obj, ((C52848o) obj2).m114628unboximpl());
    }

    /* renamed from: equals-impl0 reason: not valid java name */
    public static final boolean m114622equalsimpl0(Object obj, Object obj2) {
        throw null;
    }

    /* renamed from: hashCode-impl reason: not valid java name */
    public static int m114624hashCodeimpl(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static /* synthetic */ void value$annotations() {
    }

    /* renamed from: unbox-impl reason: not valid java name */
    public final /* synthetic */ Object m114628unboximpl() {
        return this.f131094a;
    }

    public final int hashCode() {
        return m114624hashCodeimpl(this.f131094a);
    }

    public final String toString() {
        return m114627toStringimpl(this.f131094a);
    }

    /* renamed from: isFailure-impl reason: not valid java name */
    public static final boolean m114625isFailureimpl(Object obj) {
        return obj instanceof C52850b;
    }

    private /* synthetic */ C52848o(Object obj) {
        this.f131094a = obj;
    }

    /* renamed from: isSuccess-impl reason: not valid java name */
    public static final boolean m114626isSuccessimpl(Object obj) {
        if (!(obj instanceof C52850b)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return m114621equalsimpl(this.f131094a, obj);
    }

    /* renamed from: exceptionOrNull-impl reason: not valid java name */
    public static final Throwable m114623exceptionOrNullimpl(Object obj) {
        if (obj instanceof C52850b) {
            return ((C52850b) obj).exception;
        }
        return null;
    }

    /* renamed from: toString-impl reason: not valid java name */
    public static String m114627toStringimpl(Object obj) {
        if (obj instanceof C52850b) {
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder("Success(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
