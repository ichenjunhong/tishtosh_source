package p2628d.p2639f.p2641b;

import java.io.Serializable;

/* renamed from: d.f.b.l */
public abstract class C52712l<R> implements C52709i<R>, Serializable {
    private final int arity;

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        C52729x xVar = C52728w.f130984a;
        String a = C52729x.m112255a((C52709i) this);
        C52711k.m112236a((Object) a, "Reflection.renderLambdaToString(this)");
        return a;
    }

    public C52712l(int i) {
        this.arity = i;
    }
}
