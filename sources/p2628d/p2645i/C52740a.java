package p2628d.p2645i;

import java.util.Random;

/* renamed from: d.i.a */
public abstract class C52740a extends C52744c {
    /* renamed from: a */
    public abstract Random mo110336a();

    /* renamed from: b */
    public final int mo110337b() {
        return mo110336a().nextInt();
    }

    /* renamed from: c */
    public final double mo110339c() {
        return mo110336a().nextDouble();
    }

    /* renamed from: a */
    public final int mo110335a(int i) {
        return ((-i) >> 31) & (mo110336a().nextInt() >>> (32 - i));
    }

    /* renamed from: b */
    public final int mo110338b(int i) {
        return mo110336a().nextInt(i);
    }
}
