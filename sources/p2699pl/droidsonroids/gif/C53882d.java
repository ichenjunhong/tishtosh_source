package p2699pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: pl.droidsonroids.gif.d */
final class C53882d extends Handler {

    /* renamed from: a */
    private final WeakReference<C53874a> f133517a;

    C53882d(C53874a aVar) {
        super(Looper.getMainLooper());
        this.f133517a = new WeakReference<>(aVar);
    }

    public final void handleMessage(Message message) {
        C53874a aVar = (C53874a) this.f133517a.get();
        if (aVar != null) {
            if (message.what == -1) {
                aVar.invalidateSelf();
                return;
            }
            Iterator it = aVar.f133498g.iterator();
            while (it.hasNext()) {
                it.next();
                int i = message.what;
            }
        }
    }
}
