package p2666g;

/* renamed from: g.h */
public class C53105h extends RuntimeException {

    /* renamed from: a */
    private final int f131578a;

    /* renamed from: b */
    private final String f131579b;

    /* renamed from: c */
    private final transient C53133m<?> f131580c;

    public int code() {
        return this.f131578a;
    }

    public String message() {
        return this.f131579b;
    }

    public C53133m<?> response() {
        return this.f131580c;
    }

    public C53105h(C53133m<?> mVar) {
        C53139p.m112957a(mVar, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        sb.append(mVar.mo110644a());
        sb.append(" ");
        sb.append(mVar.mo110645b());
        super(sb.toString());
        this.f131578a = mVar.mo110644a();
        this.f131579b = mVar.mo110645b();
        this.f131580c = mVar;
    }
}
