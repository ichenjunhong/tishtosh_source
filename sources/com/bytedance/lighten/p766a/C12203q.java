package com.bytedance.lighten.p766a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.lighten.p766a.C12204r;
import com.bytedance.lighten.p766a.C12207s;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p767a.C12156a;
import com.bytedance.lighten.p766a.p768b.C12162b;
import com.bytedance.lighten.p766a.p768b.C12163c;
import com.bytedance.lighten.p766a.p768b.C12164d;
import java.io.File;

/* renamed from: com.bytedance.lighten.a.q */
public final class C12203q {

    /* renamed from: a */
    public static final C12201o f32142a;

    /* renamed from: b */
    public static volatile C12204r f32143b;

    /* renamed from: c */
    public static volatile boolean f32144c;

    /* renamed from: d */
    public static String f32145d;

    /* renamed from: a */
    public static C12204r m24641a() {
        if (f32143b != null) {
            return f32143b;
        }
        throw new IllegalStateException("Lighten:lighten is not initialized, call Lighten.init");
    }

    static {
        C12201o a = C12162b.m24603a();
        if (a == null) {
            a = C12163c.m24604a();
            if (a == null) {
                a = C12164d.m24605a();
                if (a == null) {
                    a = new C12201o() {
                        public final void display(C12207s sVar) {
                        }

                        public final void download(C12207s sVar) {
                        }

                        public final void init(C12204r rVar) {
                        }

                        public final C12208t load(int i) {
                            return null;
                        }

                        public final C12208t load(Uri uri) {
                            return null;
                        }

                        public final C12208t load(C12156a aVar) {
                            return null;
                        }

                        public final C12208t load(File file) {
                            return null;
                        }

                        public final C12208t load(Object obj) {
                            return null;
                        }

                        public final C12208t load(String str) {
                            return null;
                        }

                        public final void loadBitmap(C12207s sVar) {
                        }

                        public final void trimDisk(int i) {
                        }

                        public final void trimMemory(int i) {
                        }
                    };
                }
            }
        }
        f32142a = a;
    }

    /* renamed from: a */
    public static C12208t m24642a(int i) {
        return f32142a.load(i);
    }

    /* renamed from: b */
    public static void m24648b(int i) {
        if (f32144c) {
            f32142a.trimMemory(i);
        }
    }

    /* renamed from: a */
    public static C12208t m24643a(C12156a aVar) {
        return f32142a.load(aVar);
    }

    /* renamed from: b */
    static void m24649b(C12207s sVar) {
        if (f32144c && sVar != null) {
            f32142a.loadBitmap(sVar);
        }
    }

    /* renamed from: a */
    public static C12208t m24644a(File file) {
        if (!file.exists()) {
            return C12208t.f32222O;
        }
        return f32142a.load(file);
    }

    /* renamed from: a */
    public static C12208t m24645a(Object obj) {
        return f32142a.load(obj);
    }

    /* renamed from: a */
    public static C12208t m24646a(String str) {
        if (TextUtils.isEmpty(str)) {
            return C12208t.f32222O;
        }
        return f32142a.load(str);
    }

    /* renamed from: a */
    static void m24647a(C12207s sVar) {
        if (f32144c && sVar != null) {
            f32142a.display(sVar);
        }
    }
}
