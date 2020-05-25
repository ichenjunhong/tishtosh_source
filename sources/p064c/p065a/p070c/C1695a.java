package p064c.p065a.p070c;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: c.a.c.a */
public final class C1695a extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: a */
    private final List<Throwable> f5833a;

    /* renamed from: b */
    private final String f5834b;

    /* renamed from: c */
    private Throwable f5835c;

    /* renamed from: c.a.c.a$a */
    static final class C1696a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        C1696a() {
        }

        public final String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: c.a.c.a$b */
    static abstract class C1697b {
        C1697b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo6195a(Object obj);
    }

    /* renamed from: c.a.c.a$c */
    static final class C1698c extends C1697b {

        /* renamed from: a */
        private final PrintStream f5836a;

        C1698c(PrintStream printStream) {
            this.f5836a = printStream;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6195a(Object obj) {
            this.f5836a.println(obj);
        }
    }

    /* renamed from: c.a.c.a$d */
    static final class C1699d extends C1697b {

        /* renamed from: a */
        private final PrintWriter f5837a;

        C1699d(PrintWriter printWriter) {
            this.f5837a = printWriter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6195a(Object obj) {
            this.f5837a.println(obj);
        }
    }

    public final List<Throwable> getExceptions() {
        return this.f5833a;
    }

    public final String getMessage() {
        return this.f5834b;
    }

    public final void printStackTrace() {
        C17840a.m43750a((Throwable) this, System.err);
    }

    public final int size() {
        return this.f5833a.size();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:9|(4:12|(2:14|32)(2:15|33)|31|10)|16|17|18|19|30) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0054 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f5835c     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x005b
            c.a.c.a$a r0 = new c.a.c.a$a     // Catch:{ all -> 0x005f }
            r0.<init>()     // Catch:{ all -> 0x005f }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x005f }
            r1.<init>()     // Catch:{ all -> 0x005f }
            java.util.List<java.lang.Throwable> r2 = r8.f5833a     // Catch:{ all -> 0x005f }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x005f }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x005f }
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x005f }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x005f }
            if (r5 != 0) goto L_0x0016
            r1.add(r4)     // Catch:{ all -> 0x005f }
            java.util.List r5 = m6009a(r4)     // Catch:{ all -> 0x005f }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x005f }
        L_0x0033:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x005f }
            if (r6 == 0) goto L_0x0051
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x005f }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x005f }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x004d
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x005f }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0033
        L_0x004d:
            r1.add(r6)     // Catch:{ all -> 0x005f }
            goto L_0x0033
        L_0x0051:
            r3.initCause(r4)     // Catch:{ Throwable -> 0x0054 }
        L_0x0054:
            java.lang.Throwable r3 = m6012b(r3)     // Catch:{ all -> 0x005f }
            goto L_0x0016
        L_0x0059:
            r8.f5835c = r0     // Catch:{ all -> 0x005f }
        L_0x005b:
            java.lang.Throwable r0 = r8.f5835c     // Catch:{ all -> 0x005f }
            monitor-exit(r8)
            return r0
        L_0x005f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p070c.C1695a.getCause():java.lang.Throwable");
    }

    public final void printStackTrace(PrintStream printStream) {
        m6010a((C1697b) new C1698c(printStream));
    }

    public C1695a(Throwable... thArr) {
        List list;
        if (thArr == null) {
            list = Collections.singletonList(new NullPointerException("exceptions was null"));
        } else {
            list = Arrays.asList(thArr);
        }
        this((Iterable<? extends Throwable>) list);
    }

    /* renamed from: a */
    private static List<Throwable> m6009a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause == null || cause == th) {
            return arrayList;
        }
        while (true) {
            arrayList.add(cause);
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return arrayList;
            }
            cause = cause2;
        }
        return arrayList;
    }

    /* renamed from: b */
    private static Throwable m6012b(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }

    public final void printStackTrace(PrintWriter printWriter) {
        m6010a((C1697b) new C1699d(printWriter));
    }

    public C1695a(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof C1695a) {
                    linkedHashSet.addAll(((C1695a) th).getExceptions());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.f5833a = Collections.unmodifiableList(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5833a.size());
            sb.append(" exceptions occurred. ");
            this.f5834b = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    /* renamed from: a */
    private void m6010a(C1697b bVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        int i = 1;
        for (Throwable th : this.f5833a) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m6011a(sb, th, "\t");
            i++;
        }
        bVar.mo6195a(sb.toString());
    }

    /* renamed from: a */
    private void m6011a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        while (true) {
            sb.append(str);
            sb.append(th);
            sb.append(10);
            for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                sb.append("\t\tat ");
                sb.append(stackTraceElement);
                sb.append(10);
            }
            if (th.getCause() != null) {
                sb.append("\tCaused by: ");
                th = th.getCause();
                str = "";
            } else {
                return;
            }
        }
    }
}
