package p096cn.p097a.p098a.p099a;

import android.os.Environment;
import android.util.SparseArray;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/* renamed from: cn.a.a.a.f */
public final class C2236f {

    /* renamed from: a */
    public static String f7083a = "libmktplayer.so";

    /* renamed from: b */
    public static String f7084b = "libmktplayer_mediacodec.so";

    /* renamed from: c */
    public static String f7085c = "mktplayer";

    /* renamed from: d */
    public static String f7086d = "mktplayer_mediacodec";

    /* renamed from: e */
    private static String f7087e = "player_crash.log";

    /* renamed from: f */
    private static boolean f7088f;

    /* renamed from: g */
    private static final SparseArray<C2239c> f7089g = new SparseArray<>();

    /* renamed from: cn.a.a.a.f$a */
    static final class C2237a extends C2239c {

        /* renamed from: a */
        public int f7090a;

        public C2237a(int i, int i2) {
            super(i);
            this.f7090a = i2;
        }
    }

    /* renamed from: cn.a.a.a.f$b */
    static class C2238b extends C2239c {

        /* renamed from: a */
        public String f7091a;

        public C2238b(int i, String str) {
            super(i);
            this.f7091a = str;
        }
    }

    /* renamed from: cn.a.a.a.f$c */
    static class C2239c {

        /* renamed from: b */
        public int f7092b = -1;

        protected C2239c(int i) {
            this.f7092b = i;
        }
    }

    static {
        m6769b(13, 1);
        m6770b(14, "999.999.999.9");
        m6770b(15, "version code:1,name:999.999.999.9default sdk info 2016-12-05");
        m6768a(0, false);
        m6768a(1, true);
        m6768a(2, true);
        m6768a(3, false);
        m6768a(4, false);
        m6768a(5, false);
        m6768a(6, false);
        m6768a(7, false);
        m6768a(8, false);
        m6769b(10, 0);
        m6768a(11, false);
        m6769b(18, 2);
        m6767a();
    }

    /* renamed from: a */
    private static final void m6767a() {
        boolean z;
        if (m6765a(0, 0) == 0) {
            m6769b(0, 1);
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory().getAbsolutePath());
                sb.append(File.separatorChar);
                sb.append("mediakit");
                sb.append(File.separatorChar);
                sb.append("mediakit.debug");
                File file = new File(sb.toString());
                if (file.exists()) {
                    FileReader fileReader = new FileReader(file);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    boolean z2 = false;
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            String replace = readLine.replace("\r\n", "");
                            if (replace.contains(":on")) {
                                z = true;
                            } else {
                                boolean contains = replace.contains(":off");
                                z = false;
                            }
                            if (replace.startsWith("debug_player:")) {
                                z2 = z;
                            } else if (replace.startsWith("ipc_player:")) {
                                m6768a(2, z);
                            } else if (replace.startsWith("print_info:")) {
                                f7088f = z;
                            } else {
                                replace.startsWith("check_lib:");
                                if (replace.startsWith("throw_crash:")) {
                                    m6768a(4, z);
                                } else if (replace.startsWith("choose_jmediacodec:")) {
                                    m6768a(24, z);
                                }
                            }
                        } else {
                            bufferedReader.close();
                            fileReader.close();
                            m6768a(6, z2);
                            return;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static final void m6768a(int i, boolean z) {
        m6769b(i, z ? 1 : 0);
    }

    /* renamed from: a */
    public static final int m6765a(int i, int i2) {
        Object obj = f7089g.get(i);
        if (obj == null || !(obj instanceof C2237a)) {
            return 0;
        }
        return ((C2237a) obj).f7090a;
    }

    /* renamed from: b */
    private static boolean m6771b(int i, boolean z) {
        Object obj = f7089g.get(6);
        if (obj == null || !(obj instanceof C2237a) || ((C2237a) obj).f7090a != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static final String m6766a(int i, String str) {
        C2239c cVar = (C2239c) f7089g.get(14);
        if (cVar == null || !(cVar instanceof C2238b)) {
            return str;
        }
        return ((C2238b) cVar).f7091a;
    }

    /* renamed from: b */
    public static final void m6769b(int i, int i2) {
        Object obj = f7089g.get(i);
        if (obj != null) {
            if (!(obj instanceof C2237a)) {
                f7089g.remove(i);
            } else if (i != 2 || !m6771b(6, false)) {
                ((C2237a) obj).f7090a = i2;
                return;
            } else {
                return;
            }
        }
        f7089g.append(i, new C2237a(i, i2));
    }

    /* renamed from: b */
    private static void m6770b(int i, String str) {
        Object obj = f7089g.get(i);
        if (obj != null) {
            if (obj instanceof C2238b) {
                ((C2238b) obj).f7091a = str;
                return;
            }
            f7089g.remove(i);
        }
        f7089g.append(i, new C2238b(i, str));
    }
}
