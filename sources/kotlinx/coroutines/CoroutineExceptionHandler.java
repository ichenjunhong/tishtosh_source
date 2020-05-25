package kotlinx.coroutines;

import p2628d.p2631c.C52628e;
import p2628d.p2631c.C52628e.C52631b;
import p2628d.p2631c.C52628e.C52633c;

public interface CoroutineExceptionHandler extends C52631b {

    /* renamed from: b */
    public static final C53189a f131765b = C53189a.f131766a;

    /* renamed from: kotlinx.coroutines.CoroutineExceptionHandler$a */
    public static final class C53189a implements C52633c<CoroutineExceptionHandler> {

        /* renamed from: a */
        static final /* synthetic */ C53189a f131766a = new C53189a();

        private C53189a() {
        }
    }

    void handleException(C52628e eVar, Throwable th);
}
