package p064c.p065a.p070c;

/* renamed from: c.a.c.d */
public final class C1702d extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public C1702d(Throwable th) {
        StringBuilder sb = new StringBuilder("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | ");
        sb.append(th);
        this(sb.toString(), th);
    }

    public C1702d(String str, Throwable th) {
        if (th == null) {
            th = new NullPointerException();
        }
        super(str, th);
    }
}
