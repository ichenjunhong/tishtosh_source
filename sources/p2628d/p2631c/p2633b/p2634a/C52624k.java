package p2628d.p2631c.p2633b.p2634a;

import p2628d.p2631c.C52625c;
import p2628d.p2639f.p2641b.C52709i;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52729x;

/* renamed from: d.c.b.a.k */
public abstract class C52624k extends C52616d implements C52709i<Object> {

    /* renamed from: a */
    private final int f130918a;

    public int getArity() {
        return this.f130918a;
    }

    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String a = C52729x.m112255a((C52709i) this);
        C52711k.m112236a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }

    public C52624k(int i) {
        this(i, null);
    }

    public C52624k(int i, C52625c<Object> cVar) {
        super(cVar);
        this.f130918a = i;
    }
}
