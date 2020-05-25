package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.cj */
public final class C53294cj extends CancellationException {
    public final C53263bl coroutine;

    public C53294cj(String str) {
        C52711k.m112240b(str, "message");
        this(str, null);
    }

    public C53294cj(String str, C53263bl blVar) {
        C52711k.m112240b(str, "message");
        super(str);
        this.coroutine = blVar;
    }
}
