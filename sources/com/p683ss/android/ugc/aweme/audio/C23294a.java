package com.p683ss.android.ugc.aweme.audio;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.audio.a */
public final class C23294a {

    /* renamed from: a */
    private static final Object f62286a = new Object();

    /* renamed from: b */
    private static volatile C23294a f62287b;

    /* renamed from: c */
    private List<C23295a> f62288c;

    /* renamed from: com.ss.android.ugc.aweme.audio.a$a */
    public interface C23295a {
        /* renamed from: a */
        boolean mo48314a(boolean z);
    }

    private C23294a() {
        if (f62287b != null) {
            throw new RuntimeException("Illegal access.");
        }
    }

    /* renamed from: a */
    public static C23294a m57302a() {
        if (f62287b == null) {
            synchronized (f62286a) {
                if (f62287b == null) {
                    f62287b = new C23294a();
                }
            }
        }
        return f62287b;
    }

    /* renamed from: a */
    public final void mo48313a(boolean z) {
        synchronized (f62286a) {
            if (this.f62288c != null) {
                Iterator it = this.f62288c.iterator();
                while (it.hasNext()) {
                    if (((C23295a) it.next()).mo48314a(z)) {
                        it.remove();
                    }
                }
            }
        }
    }
}
