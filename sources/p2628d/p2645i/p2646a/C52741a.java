package p2628d.p2645i.p2646a;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2645i.C52740a;

/* renamed from: d.i.a.a */
public final class C52741a extends C52740a {
    /* renamed from: a */
    public final Random mo110336a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C52711k.m112236a((Object) current, "ThreadLocalRandom.current()");
        return current;
    }

    /* renamed from: a */
    public final int mo110340a(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }
}
