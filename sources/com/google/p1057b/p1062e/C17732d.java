package com.google.p1057b.p1062e;

import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1058a.C17437s;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.b.e.d */
public final class C17732d implements Closeable {

    /* renamed from: a */
    static final C17735c f49464a;

    /* renamed from: b */
    final C17735c f49465b;

    /* renamed from: c */
    Throwable f49466c;

    /* renamed from: d */
    private final Deque<Closeable> f49467d = new ArrayDeque(4);

    /* renamed from: com.google.b.e.d$a */
    static final class C17733a implements C17735c {

        /* renamed from: a */
        static final C17733a f49468a = new C17733a();

        C17733a() {
        }

        /* renamed from: a */
        public final void mo34512a(Closeable closeable, Throwable th, Throwable th2) {
            Logger logger = C17731c.f49463a;
            Level level = Level.WARNING;
            StringBuilder sb = new StringBuilder("Suppressing exception thrown when closing ");
            sb.append(closeable);
            logger.log(level, sb.toString(), th2);
        }
    }

    /* renamed from: com.google.b.e.d$b */
    static final class C17734b implements C17735c {

        /* renamed from: a */
        static final C17734b f49469a = new C17734b();

        /* renamed from: b */
        static final Method f49470b = m43555a();

        C17734b() {
        }

        /* renamed from: a */
        private static Method m43555a() {
            try {
                return Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: a */
        public final void mo34512a(Closeable closeable, Throwable th, Throwable th2) {
            if (th != th2) {
                try {
                    f49470b.invoke(th, new Object[]{th2});
                } catch (Throwable unused) {
                    C17733a.f49468a.mo34512a(closeable, th, th2);
                }
            }
        }
    }

    /* renamed from: com.google.b.e.d$c */
    interface C17735c {
        /* renamed from: a */
        void mo34512a(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        boolean z;
        C17735c cVar;
        if (C17734b.f49470b != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar = C17734b.f49469a;
        } else {
            cVar = C17733a.f49468a;
        }
        f49464a = cVar;
    }

    public final void close() throws IOException {
        Throwable th = this.f49466c;
        while (!this.f49467d.isEmpty()) {
            Closeable closeable = (Closeable) this.f49467d.removeFirst();
            try {
                closeable.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f49465b.mo34512a(closeable, th, th2);
                }
            }
        }
        if (this.f49466c == null && th != null) {
            C17437s.m42687a(th, IOException.class);
            throw new AssertionError(th);
        }
    }

    /* renamed from: a */
    public final <C extends Closeable> C mo34510a(C c) {
        if (c != null) {
            this.f49467d.addFirst(c);
        }
        return c;
    }

    C17732d(C17735c cVar) {
        this.f49465b = (C17735c) C17421k.m42653a(cVar);
    }
}
