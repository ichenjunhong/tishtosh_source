package com.bytedance.common.utility;

import android.os.Looper;
import android.util.Printer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.common.utility.j */
public final class C9420j {

    /* renamed from: a */
    public static int f25659a = 5;

    /* renamed from: b */
    public static C9422b f25660b;

    /* renamed from: c */
    public static C9421a f25661c;

    /* renamed from: d */
    public static boolean f25662d;

    /* renamed from: e */
    public static Printer f25663e;

    /* renamed from: com.bytedance.common.utility.j$a */
    public interface C9421a {
    }

    /* renamed from: com.bytedance.common.utility.j$b */
    public static class C9422b implements Printer {

        /* renamed from: a */
        public List<Printer> f25664a = new ArrayList();

        /* renamed from: b */
        List<Printer> f25665b = new ArrayList();

        /* renamed from: c */
        public List<Printer> f25666c = new ArrayList();

        /* renamed from: d */
        boolean f25667d = false;

        /* renamed from: e */
        public boolean f25668e = false;

        public final void println(String str) {
            long j;
            if (C9420j.f25661c != null) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            if (str.startsWith(">>>>> Dispatching") && this.f25668e) {
                for (Printer printer : this.f25666c) {
                    if (!this.f25664a.contains(printer)) {
                        this.f25664a.add(printer);
                    }
                }
                this.f25666c.clear();
                this.f25668e = false;
            }
            this.f25664a.size();
            for (Printer printer2 : this.f25664a) {
                if (printer2 != null) {
                    printer2.println(str);
                }
            }
            if (str.startsWith("<<<<< Finished") && this.f25667d) {
                for (Printer printer3 : this.f25665b) {
                    this.f25664a.remove(printer3);
                    this.f25666c.remove(printer3);
                }
                this.f25665b.clear();
                this.f25667d = false;
            }
            if (C9420j.f25661c != null && j > 0) {
                System.currentTimeMillis();
            }
        }
    }

    /* renamed from: a */
    public static Printer m18636a() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }
}
