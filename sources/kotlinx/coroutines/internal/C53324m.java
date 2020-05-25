package kotlinx.coroutines.internal;

import java.util.List;
import kotlinx.coroutines.C53280bw;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.m */
public final class C53324m {
    /* renamed from: a */
    public static final C53280bw m113340a(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        C52711k.m112240b(mainDispatcherFactory, "receiver$0");
        C52711k.m112240b(list, "factories");
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return new C53325n(th, mainDispatcherFactory.hintOnError());
        }
    }
}
