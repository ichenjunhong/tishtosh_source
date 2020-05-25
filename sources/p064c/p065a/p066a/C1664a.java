package p064c.p065a.p066a;

import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;

/* renamed from: c.a.a.a */
public abstract class C1664a implements C1690c {

    /* renamed from: a */
    private final AtomicBoolean f5803a = new AtomicBoolean();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6125a();

    public final boolean isDisposed() {
        return this.f5803a.get();
    }

    public final void dispose() {
        if (this.f5803a.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo6125a();
                return;
            }
            C1667a.m5940a().mo6139a(new Runnable() {
                public final void run() {
                    C1664a.this.mo6125a();
                }
            });
        }
    }
}
