package p064c.p065a.p070c;

/* renamed from: c.a.c.f */
public final class C1704f extends IllegalStateException {
    private static final long serialVersionUID = 1644750035281290266L;

    public C1704f(Throwable th) {
        StringBuilder sb = new StringBuilder("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | ");
        sb.append(th);
        super(sb.toString(), th);
    }
}
