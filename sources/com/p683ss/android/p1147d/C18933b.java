package com.p683ss.android.p1147d;

import android.content.Context;
import android.os.Environment;
import android.os.Process;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.common.utility.p524d.C9396a;
import com.facebook.common.p919c.C13671a;
import com.facebook.common.p919c.C13672b;
import com.p683ss.android.ugc.aweme.account.task.FbUploadTokenTime;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.d.b */
public final class C18933b {

    /* renamed from: a */
    public static String f52162a = "joke_essay";

    /* renamed from: b */
    protected static String f52163b;

    /* renamed from: c */
    protected static String f52164c;

    /* renamed from: d */
    protected static String f52165d;

    /* renamed from: e */
    protected static String f52166e;

    /* renamed from: f */
    protected static String f52167f;

    /* renamed from: g */
    protected static boolean f52168g;

    /* renamed from: h */
    protected static String f52169h;

    /* renamed from: i */
    protected static String f52170i;

    /* renamed from: m */
    protected static volatile boolean f52171m;

    /* renamed from: n */
    private static String f52172n;

    /* renamed from: j */
    protected final int f52173j;

    /* renamed from: k */
    protected final int f52174k;

    /* renamed from: l */
    protected final Context f52175l;

    /* renamed from: com.ss.android.d.b$a */
    static class C18938a {

        /* renamed from: a */
        public long f52180a;

        /* renamed from: b */
        public long f52181b;

        /* renamed from: c */
        public String f52182c;

        private C18938a() {
        }
    }

    /* renamed from: com.ss.android.d.b$b */
    static class C18939b implements C13672b {

        /* renamed from: a */
        final List<C18938a> f52183a;

        /* renamed from: a */
        public final void mo25487a(File file) {
        }

        /* renamed from: c */
        public final void mo25489c(File file) {
        }

        private C18939b() {
            this.f52183a = new ArrayList();
        }

        /* renamed from: b */
        public final void mo25488b(File file) {
            C18938a aVar = new C18938a();
            aVar.f52180a = file.lastModified();
            aVar.f52181b = file.length();
            aVar.f52182c = file.getAbsolutePath();
            this.f52183a.add(aVar);
        }
    }

    /* renamed from: a */
    public static String m46087a() {
        return f52166e;
    }

    /* renamed from: a */
    public final void mo38803a(Context context, String str, String str2) {
        boolean z;
        File file;
        String str3;
        String str4;
        if (!m46095e()) {
            m46091a(context, 2131952652, R.string.e0r, true);
            return;
        }
        try {
            String str5 = null;
            if (!C9431p.m18664a(str)) {
                str3 = mo38805c(str);
                file = new File(str3);
                z = file.isFile();
                if (!z) {
                    str3 = mo38808e(str);
                    file = new File(str3);
                    z = file.isFile();
                }
            } else {
                str3 = null;
                file = null;
                z = false;
            }
            if (z || C9431p.m18664a((String) null)) {
                str5 = str2;
            } else {
                String c = mo38805c(null);
                File file2 = new File(c);
                boolean isFile = file2.isFile();
                if (!isFile) {
                    c = mo38808e(null);
                    file2 = new File(c);
                    isFile = file2.isFile();
                }
                str = null;
            }
            if (!z) {
                m46091a(context, 2131952652, R.string.e0q, true);
                return;
            }
            String a = m46088a(str3, str5);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(a);
            String sb2 = sb.toString();
            String str6 = f52170i;
            if (str6.endsWith("/")) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str6);
                sb3.append(sb2);
                str4 = sb3.toString();
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str6);
                sb4.append("/");
                sb4.append(sb2);
                str4 = sb4.toString();
            }
            File file3 = new File(str4);
            if (file3.isFile() && file.length() == file3.length()) {
                m46091a(context, 2131952872, R.string.e0s, true);
            } else if (!C9396a.m18579a(C9396a.m18576a(str3), str6, sb2)) {
                m46091a(context, 2131952652, R.string.e0p, true);
            } else {
                C18961n.m46135a(context, str4);
                m46091a(context, 2131952872, R.string.e0s, true);
            }
        } catch (Exception unused) {
            m46091a(context, 2131952652, R.string.e0p, true);
        }
    }

    /* renamed from: e */
    private static boolean m46095e() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static long m46094d() {
        try {
            return 0 + C18945g.m46115a(new File(f52164c), false);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo38804b() {
        try {
            if (!C9431p.m18664a(f52167f)) {
                C18945g.m46118a(f52167f, null);
            }
            if (m46095e()) {
                C18945g.m46118a(f52165d, null);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo38806c() {
        if (!f52171m && m46094d() >= 62914560) {
            C18953j.f52228a.f52230b = System.currentTimeMillis();
            f52171m = true;
            new C9393e("ClearCache") {
                public final void run() {
                    Process.setThreadPriority(10);
                    System.currentTimeMillis();
                    try {
                        System.currentTimeMillis();
                        C18933b.this.mo38802a(20971520);
                    } catch (Exception unused) {
                    }
                    System.currentTimeMillis();
                    C18933b.f52171m = false;
                    try {
                        C18953j.f52228a.mo38827a(C18933b.this);
                    } catch (Exception unused2) {
                    }
                }
            }.start();
        }
        if (!f52171m) {
            long j = C18953j.f52228a.f52230b;
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - j < FbUploadTokenTime.group0) {
                try {
                    C18953j.f52228a.mo38827a(this);
                } catch (Exception unused) {
                }
            } else {
                C18953j.f52228a.f52230b = currentTimeMillis;
                f52171m = true;
                new C9393e("ClearCache") {
                    public final void run() {
                        Process.setThreadPriority(10);
                        System.currentTimeMillis();
                        try {
                            Thread.sleep(10000);
                            System.currentTimeMillis();
                            C18933b.this.mo38801a(C18933b.this.f52173j, C18933b.this.f52174k);
                        } catch (Exception unused) {
                        }
                        System.currentTimeMillis();
                        C18933b.f52171m = false;
                        try {
                            C18953j.f52228a.mo38827a(C18933b.this);
                        } catch (Exception unused2) {
                        }
                    }
                }.start();
            }
        }
    }

    public C18933b(Context context) {
        this(context, 5);
    }

    /* renamed from: b */
    public static String m46092b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".dat");
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo38800a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(f52165d);
        sb.append(m46096f(str));
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo38805c(String str) {
        StringBuilder sb = new StringBuilder(f52165d);
        sb.append(m46096f(str));
        sb.append("/");
        sb.append(str);
        sb.append(".dat");
        return sb.toString();
    }

    /* renamed from: f */
    private static String m46096f(String str) {
        if (str == null || str.length() < 2) {
            return "__";
        }
        String substring = str.substring(0, 2);
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        if (!Character.isLetterOrDigit(charAt) || !Character.isLetterOrDigit(charAt2)) {
            return "__";
        }
        return substring;
    }

    /* renamed from: d */
    public final String mo38807d(String str) {
        if (C9431p.m18664a(f52167f)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f52167f);
        sb.append(m46096f(str));
        return sb.toString();
    }

    /* renamed from: e */
    public final String mo38808e(String str) {
        if (C9431p.m18664a(f52167f)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(f52167f);
        sb.append(m46096f(str));
        sb.append("/");
        sb.append(str);
        sb.append(".dat");
        return sb.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:12|13|14|15|16|17|18|19|20|(1:22)(1:23)|24|(6:26|(1:28)|29|(1:31)|32|(1:34))|(3:35|36|(2:38|39)(3:40|41|(1:43)))) */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0047 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void m46090a(android.content.Context r3) {
        /*
            java.lang.Class<com.ss.android.d.b> r0 = com.p683ss.android.p1147d.C18933b.class
            monitor-enter(r0)
            boolean r1 = f52168g     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            java.lang.String r1 = r3.getPackageName()     // Catch:{ all -> 0x0122 }
            f52163b = r1     // Catch:{ all -> 0x0122 }
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r1)     // Catch:{ all -> 0x0122 }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return
        L_0x0017:
            r1 = 1
            f52168g = r1     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r1.<init>()     // Catch:{ all -> 0x0122 }
            java.io.File r2 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = r2.getPath()     // Catch:{ all -> 0x0122 }
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = "/Android/data/"
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = f52163b     // Catch:{ all -> 0x0122 }
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r2 = "/cache/"
            r1.append(r2)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0122 }
            f52164c = r1     // Catch:{ all -> 0x0122 }
            r1 = 0
            java.lang.String r3 = com.p683ss.android.p1147d.C18945g.m46116a(r3)     // Catch:{ Exception -> 0x0047 }
            f52169h = r3     // Catch:{ Exception -> 0x0047 }
            goto L_0x0049
        L_0x0047:
            f52169h = r1     // Catch:{ all -> 0x0122 }
        L_0x0049:
            java.lang.String r3 = f52169h     // Catch:{ all -> 0x0122 }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ all -> 0x0122 }
            if (r3 != 0) goto L_0x0067
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f52169h     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "/hashedimages/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f52167f = r3     // Catch:{ all -> 0x0122 }
            goto L_0x0069
        L_0x0067:
            f52167f = r1     // Catch:{ all -> 0x0122 }
        L_0x0069:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f52164c     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "hashedimages/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f52165d = r3     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f52164c     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "tmpimages/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f52166e = r3     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "/Android/data/com.ss.spipe/cache/avatar"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f52172n = r3     // Catch:{ all -> 0x0122 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0122 }
            r3.<init>()     // Catch:{ all -> 0x0122 }
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = "/"
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f52162a     // Catch:{ all -> 0x0122 }
            r3.append(r1)     // Catch:{ all -> 0x0122 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0122 }
            f52170i = r3     // Catch:{ all -> 0x0122 }
            boolean r3 = m46095e()     // Catch:{ all -> 0x0122 }
            if (r3 == 0) goto L_0x0104
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f52164c     // Catch:{ all -> 0x0122 }
            r3.<init>(r1)     // Catch:{ all -> 0x0122 }
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x00e4
            r3.mkdirs()     // Catch:{ all -> 0x0122 }
        L_0x00e4:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f52165d     // Catch:{ all -> 0x0122 }
            r3.<init>(r1)     // Catch:{ all -> 0x0122 }
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x00f4
            r3.mkdirs()     // Catch:{ all -> 0x0122 }
        L_0x00f4:
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0122 }
            java.lang.String r1 = f52166e     // Catch:{ all -> 0x0122 }
            r3.<init>(r1)     // Catch:{ all -> 0x0122 }
            boolean r1 = r3.exists()     // Catch:{ all -> 0x0122 }
            if (r1 != 0) goto L_0x0104
            r3.mkdirs()     // Catch:{ all -> 0x0122 }
        L_0x0104:
            java.lang.String r3 = f52167f     // Catch:{ Exception -> 0x0120 }
            boolean r3 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Exception -> 0x0120 }
            if (r3 == 0) goto L_0x010e
            monitor-exit(r0)
            return
        L_0x010e:
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x0120 }
            java.lang.String r1 = f52167f     // Catch:{ Exception -> 0x0120 }
            r3.<init>(r1)     // Catch:{ Exception -> 0x0120 }
            boolean r1 = r3.exists()     // Catch:{ Exception -> 0x0120 }
            if (r1 != 0) goto L_0x011e
            r3.mkdirs()     // Catch:{ Exception -> 0x0120 }
        L_0x011e:
            monitor-exit(r0)
            return
        L_0x0120:
            monitor-exit(r0)
            return
        L_0x0122:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1147d.C18933b.m46090a(android.content.Context):void");
    }

    /* renamed from: a */
    public final void mo38802a(long j) {
        try {
            C18945g.m46117a(f52166e);
        } catch (Exception unused) {
        }
        if (m46094d() > 20971520) {
            long a = m46086a(20971520, f52165d, null);
            if (a < 20971520) {
                m46086a(20971520 - a, f52167f, null);
            }
        }
    }

    private C18933b(Context context, int i) {
        this.f52173j = 5;
        this.f52174k = 1;
        this.f52175l = context.getApplicationContext();
        if (!f52168g) {
            m46090a(context);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (com.bytedance.common.utility.p524d.C9396a.C9397a.UNKNOWN.equals(r3) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r3 = android.net.Uri.parse(r4).getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        if (r3 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0042, code lost:
        r4 = r3.lastIndexOf(46);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r4 <= 0) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0050, code lost:
        if ((r4 + 1) >= r3.length()) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        r3 = r3.substring(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r3.equalsIgnoreCase(".jpg") != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0064, code lost:
        if (r3.equalsIgnoreCase(".jpeg") != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r3.equalsIgnoreCase(".png") != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        if (r3.equalsIgnoreCase(".gif") != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r3.equalsIgnoreCase(".bmp") == false) goto L_0x007f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m46088a(java.lang.String r3, java.lang.String r4) {
        /*
            java.lang.String r0 = ".jpg"
            if (r4 != 0) goto L_0x0007
            if (r3 != 0) goto L_0x0007
            return r0
        L_0x0007:
            boolean r1 = com.bytedance.common.utility.C9431p.m18664a(r3)     // Catch:{ Exception -> 0x007f }
            if (r1 != 0) goto L_0x0017
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x007f }
            r1.<init>(r3)     // Catch:{ Exception -> 0x007f }
            com.bytedance.common.utility.d.a$a r3 = com.bytedance.common.utility.p524d.C9396a.m18575a(r1)     // Catch:{ Exception -> 0x007f }
            goto L_0x0019
        L_0x0017:
            com.bytedance.common.utility.d.a$a r3 = com.bytedance.common.utility.p524d.C9396a.C9397a.UNKNOWN     // Catch:{ Exception -> 0x007f }
        L_0x0019:
            int[] r1 = com.p683ss.android.p1147d.C18933b.C189374.f52179a     // Catch:{ Exception -> 0x007f }
            int r2 = r3.ordinal()     // Catch:{ Exception -> 0x007f }
            r1 = r1[r2]     // Catch:{ Exception -> 0x007f }
            switch(r1) {
                case 1: goto L_0x002b;
                case 2: goto L_0x0028;
                case 3: goto L_0x0025;
                default: goto L_0x0024;
            }     // Catch:{ Exception -> 0x007f }
        L_0x0024:
            goto L_0x002e
        L_0x0025:
            java.lang.String r1 = ".gif"
            goto L_0x002d
        L_0x0028:
            java.lang.String r1 = ".png"
            goto L_0x002d
        L_0x002b:
            java.lang.String r1 = ".jpg"
        L_0x002d:
            r0 = r1
        L_0x002e:
            com.bytedance.common.utility.d.a$a r1 = com.bytedance.common.utility.p524d.C9396a.C9397a.UNKNOWN     // Catch:{ Exception -> 0x007f }
            boolean r3 = r1.equals(r3)     // Catch:{ Exception -> 0x007f }
            if (r3 != 0) goto L_0x0037
            return r0
        L_0x0037:
            android.net.Uri r3 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x007f }
            java.lang.String r3 = r3.getPath()     // Catch:{ Exception -> 0x007f }
            if (r3 != 0) goto L_0x0042
            return r0
        L_0x0042:
            r4 = 46
            int r4 = r3.lastIndexOf(r4)     // Catch:{ Exception -> 0x007f }
            if (r4 <= 0) goto L_0x007f
            int r1 = r4 + 1
            int r2 = r3.length()     // Catch:{ Exception -> 0x007f }
            if (r1 >= r2) goto L_0x007f
            java.lang.String r3 = r3.substring(r4)     // Catch:{ Exception -> 0x007f }
            java.lang.String r4 = ".jpg"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x007f }
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = ".jpeg"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x007f }
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = ".png"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x007f }
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = ".gif"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x007f }
            if (r4 != 0) goto L_0x0080
            java.lang.String r4 = ".bmp"
            boolean r4 = r3.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x007f }
            if (r4 == 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r3 = r0
        L_0x0080:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1147d.C18933b.m46088a(java.lang.String, java.lang.String):java.lang.String");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38801a(int i, int i2) {
        try {
            C18945g.m46117a(f52166e);
        } catch (Exception unused) {
        }
        m46089a(i, new File(f52165d), null);
        m46093b(i, new File(f52172n), null);
        if (!C9431p.m18664a(f52167f)) {
            m46089a(i2, new File(f52167f), null);
        }
    }

    /* renamed from: a */
    private void m46089a(int i, File file, Set<String> set) {
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        m46093b(i, file2, set);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private long m46086a(long j, String str, Set<String> set) {
        C18939b bVar = new C18939b();
        C13671a.m27624a(new File(str), bVar);
        ArrayList<C18938a> arrayList = new ArrayList<>(Collections.unmodifiableList(bVar.f52183a));
        Collections.sort(arrayList, new Comparator<C18938a>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                C18938a aVar = (C18938a) obj;
                C18938a aVar2 = (C18938a) obj2;
                if (aVar.f52180a == aVar2.f52180a) {
                    return 0;
                }
                if (aVar.f52180a > aVar2.f52180a) {
                    return -1;
                }
                return 1;
            }
        });
        long j2 = 0;
        for (C18938a aVar : arrayList) {
            j2 += aVar.f52181b;
            if (j2 > j) {
                File file = new File(aVar.f52182c);
                String name = file.getName();
                if (set == null || !set.contains(name)) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return j2;
    }

    /* renamed from: b */
    private static void m46093b(int i, File file, Set<String> set) {
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = ((long) (i * 24 * 3600)) * 1000;
                for (File file2 : listFiles) {
                    if (file2.isFile()) {
                        String name = file2.getName();
                        if (set == null || !set.contains(name)) {
                            try {
                                if (currentTimeMillis - file2.lastModified() > j) {
                                    file2.delete();
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m46091a(Context context, int i, int i2, boolean z) {
        if (z) {
            C9432q.m18673a(context, i, i2);
        }
    }
}
