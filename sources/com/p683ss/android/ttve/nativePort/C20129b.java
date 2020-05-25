package com.p683ss.android.ttve.nativePort;

import android.content.Context;
import com.p683ss.android.ttve.log.C20085a;
import com.p683ss.android.vesdk.runtime.C50773f;
import com.p683ss.p2567e.C51299a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.ss.android.ttve.nativePort.b */
public class C20129b {

    /* renamed from: a */
    public static volatile C20135f f55374a = C20135f.NOT_LOAD;

    /* renamed from: b */
    public static final String f55375b = C20129b.class.getSimpleName();

    /* renamed from: c */
    public static Context f55376c;

    /* renamed from: d */
    public static boolean f55377d = false;

    /* renamed from: e */
    private static boolean f55378e;

    /* renamed from: f */
    private static C20133d f55379f = null;

    /* renamed from: g */
    private static C20132c f55380g = null;

    /* renamed from: h */
    private static C20133d f55381h = new C20131b();

    /* renamed from: i */
    private static C20132c f55382i = new C20130a();

    /* renamed from: j */
    private static ArrayList<C20134e> f55383j = new ArrayList<>();

    /* renamed from: k */
    private static boolean f55384k = false;

    /* renamed from: com.ss.android.ttve.nativePort.b$a */
    public static class C20130a implements C20132c {
        /* renamed from: a */
        public final void mo42621a(String[] strArr) {
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.b$b */
    public static class C20131b implements C20133d {
        /* renamed from: a */
        public final boolean mo17579a(List<String> list) {
            System.currentTimeMillis();
            for (String str : list) {
                System.currentTimeMillis();
                StringBuilder sb = new StringBuilder("Start loadLibrary ");
                sb.append(str);
                C20085a.m49602a(3, sb.toString());
                if (!C50773f.m109886a(str, C20129b.f55376c)) {
                    return false;
                }
                System.currentTimeMillis();
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.b$c */
    public interface C20132c {
        /* renamed from: a */
        void mo42621a(String[] strArr);
    }

    /* renamed from: com.ss.android.ttve.nativePort.b$d */
    public interface C20133d {
        /* renamed from: a */
        boolean mo17579a(List<String> list);
    }

    /* renamed from: com.ss.android.ttve.nativePort.b$e */
    public static class C20134e {

        /* renamed from: a */
        public String f55385a;

        /* renamed from: b */
        public volatile boolean f55386b;

        public C20134e(String str) {
            this.f55385a = str;
        }
    }

    /* renamed from: com.ss.android.ttve.nativePort.b$f */
    public enum C20135f {
        NOT_LOAD,
        LOADING,
        LOADED
    }

    /* renamed from: a */
    public static C20135f m49679a() {
        return f55374a;
    }

    /* renamed from: b */
    public static synchronized void m49685b() {
        synchronized (C20129b.class) {
            if (!f55378e) {
                m49689f();
            } else {
                m49683a("ttvideoeditor");
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m49686c() {
        synchronized (C20129b.class) {
            if (!f55378e) {
                m49689f();
            } else {
                m49683a("ttvebase");
            }
        }
    }

    /* renamed from: d */
    public static synchronized void m49687d() {
        synchronized (C20129b.class) {
            if (!f55378e) {
                m49689f();
            } else {
                m49683a("ttvideorecorder");
            }
        }
    }

    /* renamed from: e */
    public static synchronized void m49688e() {
        synchronized (C20129b.class) {
            if (!f55378e) {
                m49689f();
            } else if ("mt".equals("hotsoon")) {
                m49683a("main");
            } else {
                m49683a("ttmain");
            }
        }
    }

    /* renamed from: f */
    private static void m49689f() {
        if (f55374a != C20135f.LOADED) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("c++_shared");
            arrayList.add("x264");
            arrayList.add("byte264");
            arrayList.add("fdk-aac");
            arrayList.addAll(C51299a.m110298a());
            arrayList.add("yuv");
            arrayList.add("audioeffect");
            arrayList.add("bytenn");
            arrayList.add("effect");
            arrayList.add("ttvebase");
            arrayList.add("ttvideorecorder");
            if ("mt".equals("hotsoon")) {
                arrayList.add("ffmpeg-invoker");
                arrayList.add("ffmpeg-main");
                arrayList.add("main");
            } else {
                arrayList.add("ttmain");
            }
            if (f55384k) {
                arrayList.add("ttvideoeditor");
                f55377d = true;
            } else {
                arrayList.add("ttvideoeditor");
                f55377d = false;
            }
            String[] strArr = new String[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                StringBuilder sb = new StringBuilder("lib");
                sb.append((String) arrayList.get(i));
                sb.append(".so");
                strArr[i] = sb.toString();
            }
            f55374a = C20135f.LOADING;
            if (f55379f != null) {
                if (!f55379f.mo17579a(arrayList)) {
                    f55374a = C20135f.NOT_LOAD;
                    return;
                }
            } else if (!f55381h.mo17579a(arrayList)) {
                f55374a = C20135f.NOT_LOAD;
                return;
            }
            f55374a = C20135f.LOADED;
            if (f55380g != null) {
                f55380g.mo42621a(strArr);
            }
        }
    }

    /* renamed from: g */
    private static void m49690g() {
        if (f55384k) {
            f55383j.add(new C20134e("ttvideoeditor"));
            f55377d = true;
        } else {
            f55383j.add(new C20134e("ttvideoeditor"));
            f55377d = false;
        }
        if ("mt".equals("hotsoon")) {
            f55383j.add(new C20134e("main"));
            f55383j.add(new C20134e("ffmpeg-main"));
            f55383j.add(new C20134e("ffmpeg-invoker"));
        } else {
            f55383j.add(new C20134e("ttmain"));
        }
        f55383j.add(new C20134e("ttvideorecorder"));
        f55383j.add(new C20134e("ttvebase"));
        f55383j.add(new C20134e("byte264"));
        f55383j.add(new C20134e("effect"));
        f55383j.add(new C20134e("bytenn"));
        f55383j.add(new C20134e("audioeffect"));
        f55383j.add(new C20134e("yuv"));
        List a = C51299a.m110298a();
        for (int size = a.size() - 1; size >= 0; size--) {
            f55383j.add(new C20134e((String) a.get(size)));
        }
        f55383j.add(new C20134e("fdk-aac"));
        f55383j.add(new C20134e("x264"));
        f55383j.add(new C20134e("c++_shared"));
    }

    /* renamed from: a */
    public static void m49681a(C20132c cVar) {
        f55380g = cVar;
    }

    /* renamed from: a */
    public static synchronized void m49680a(Context context) {
        synchronized (C20129b.class) {
            f55376c = context;
        }
    }

    /* renamed from: a */
    public static void m49682a(C20133d dVar) {
        f55379f = dVar;
    }

    /* renamed from: a */
    public static void m49684a(boolean z) {
        f55384k = true;
    }

    /* renamed from: a */
    private static void m49683a(String str) {
        if (f55383j.size() <= 0) {
            m49690g();
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = f55383j.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C20134e eVar = (C20134e) it.next();
            if (str == eVar.f55385a) {
                if (!eVar.f55386b) {
                    eVar.f55386b = true;
                    linkedList.add(eVar.f55385a);
                } else {
                    return;
                }
            }
        }
        while (it.hasNext()) {
            C20134e eVar2 = (C20134e) it.next();
            if (eVar2.f55386b) {
                break;
            }
            eVar2.f55386b = true;
            linkedList.add(eVar2.f55385a);
        }
        Collections.reverse(linkedList);
        String[] strArr = new String[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            StringBuilder sb = new StringBuilder("lib");
            sb.append((String) linkedList.get(i));
            sb.append(".so");
            strArr[i] = sb.toString();
        }
        f55374a = C20135f.LOADING;
        if (f55379f != null) {
            if (!f55379f.mo17579a(linkedList)) {
                f55374a = C20135f.NOT_LOAD;
                return;
            }
        } else if (!f55381h.mo17579a(linkedList)) {
            f55374a = C20135f.NOT_LOAD;
            return;
        }
        f55374a = C20135f.LOADED;
        if (f55380g != null) {
            f55380g.mo42621a(strArr);
        }
    }
}
