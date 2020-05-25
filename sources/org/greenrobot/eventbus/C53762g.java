package org.greenrobot.eventbus;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintStream;
import java.util.logging.Level;

/* renamed from: org.greenrobot.eventbus.g */
public interface C53762g {

    /* renamed from: org.greenrobot.eventbus.g$a */
    public static class C53763a implements C53762g {

        /* renamed from: a */
        static final boolean f133353a;

        /* renamed from: b */
        private final String f133354b;

        /* renamed from: a */
        public static boolean m114345a() {
            return f133353a;
        }

        /* renamed from: a */
        public final void mo112968a(Level level, String str) {
        }

        /* renamed from: a */
        public final void mo112969a(Level level, String str, Throwable th) {
        }

        static {
            boolean z = false;
            try {
                if (Class.forName("android.util.Log") != null) {
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            }
            f133353a = z;
        }

        public C53763a(String str) {
            this.f133354b = str;
        }
    }

    /* renamed from: org.greenrobot.eventbus.g$b */
    public static class C53764b implements C53762g {
        /* renamed from: a */
        public final void mo112968a(Level level, String str) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("[");
            sb.append(level);
            sb.append("] ");
            sb.append(str);
            printStream.println(sb.toString());
        }

        /* renamed from: a */
        public final void mo112969a(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("[");
            sb.append(level);
            sb.append("] ");
            sb.append(str);
            printStream.println(sb.toString());
            C17840a.m43750a(th, System.out);
        }
    }

    /* renamed from: a */
    void mo112968a(Level level, String str);

    /* renamed from: a */
    void mo112969a(Level level, String str, Throwable th);
}
