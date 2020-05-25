package p064c.p065a.p072e.p084g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: c.a.e.g.k */
public final class C2095k extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* renamed from: a */
    final String f6812a;

    /* renamed from: b */
    final int f6813b;

    /* renamed from: c */
    final boolean f6814c;

    /* renamed from: c.a.e.g.k$a */
    static final class C2096a extends Thread implements C2094j {
        C2096a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RxThreadFactory[");
        sb.append(this.f6812a);
        sb.append("]");
        return sb.toString();
    }

    public C2095k(String str) {
        this(str, 5, false);
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread;
        StringBuilder sb = new StringBuilder(this.f6812a);
        sb.append('-');
        sb.append(incrementAndGet());
        String sb2 = sb.toString();
        if (this.f6814c) {
            thread = new C2096a(runnable, sb2);
        } else {
            thread = new Thread(runnable, sb2);
        }
        thread.setPriority(this.f6813b);
        thread.setDaemon(true);
        return thread;
    }

    public C2095k(String str, int i) {
        this(str, i, false);
    }

    public C2095k(String str, int i, boolean z) {
        this.f6812a = str;
        this.f6813b = i;
        this.f6814c = z;
    }
}
