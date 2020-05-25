package dmt.p2652av.video;

import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: dmt.av.video.s */
final /* synthetic */ class C52987s implements Callable {

    /* renamed from: a */
    private final C529811 f131419a;

    /* renamed from: b */
    private final int f131420b;

    /* renamed from: c */
    private final int f131421c;

    /* renamed from: d */
    private final float f131422d;

    C52987s(C529811 r1, int i, int i2, float f) {
        this.f131419a = r1;
        this.f131420b = i;
        this.f131421c = i2;
        this.f131422d = f;
    }

    public final Object call() {
        C529811 r0 = this.f131419a;
        int i = this.f131420b;
        int i2 = this.f131421c;
        float f = this.f131422d;
        List<String> list = C52979m.this.f131393a;
        StringBuilder sb = new StringBuilder("type:");
        sb.append(i);
        sb.append(" ext:");
        sb.append(i2);
        sb.append(" f:");
        sb.append(f);
        list.add(sb.toString());
        return null;
    }
}
