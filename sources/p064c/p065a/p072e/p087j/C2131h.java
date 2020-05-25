package p064c.p065a.p072e.p087j;

/* renamed from: c.a.e.j.h */
public final class C2131h {

    /* renamed from: a */
    public static final Throwable f6891a = new C2132a();

    /* renamed from: c.a.e.j.h$a */
    static final class C2132a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        public final Throwable fillInStackTrace() {
            return this;
        }

        C2132a() {
            super("No further exceptions");
        }
    }

    /* renamed from: b */
    public static <E extends Throwable> Exception m6423b(Throwable th) throws Throwable {
        if (th instanceof Exception) {
            return (Exception) th;
        }
        throw th;
    }

    /* renamed from: a */
    public static RuntimeException m6422a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }
}
