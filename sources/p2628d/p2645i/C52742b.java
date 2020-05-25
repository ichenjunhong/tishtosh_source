package p2628d.p2645i;

import java.util.Random;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.i.b */
public final class C52742b extends C52740a {

    /* renamed from: d */
    private final C52743a f130989d = new C52743a();

    /* renamed from: d.i.b$a */
    public static final class C52743a extends ThreadLocal<Random> {
        C52743a() {
        }

        public final /* synthetic */ Object initialValue() {
            return new Random();
        }
    }

    /* renamed from: a */
    public final Random mo110336a() {
        Object obj = this.f130989d.get();
        C52711k.m112236a(obj, "implStorage.get()");
        return (Random) obj;
    }
}
