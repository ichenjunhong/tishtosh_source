package com.bytedance.geckox.p594a;

import com.bytedance.geckox.p610h.C10112a;
import com.bytedance.geckox.p610h.C10113b;
import com.bytedance.geckox.p610h.C10114c;
import com.bytedance.geckox.utils.C10153c;
import com.bytedance.geckox.utils.C10154d;
import com.bytedance.geckox.utils.C10157f;
import com.bytedance.geckox.utils.C10164l;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.geckox.a.c */
public final class C10039c {
    /* renamed from: a */
    private static void m20199a(final File file) {
        C10157f.m20483a().execute(new Runnable() {
            public final void run() {
                C10154d.m20480a(file);
            }
        });
    }

    /* renamed from: a */
    public static void m20200a(final String str) {
        C10164l.m20491a().execute(new Runnable() {
            public final void run() {
                try {
                    C10039c.m20201b(str);
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("删除channel旧版本失败，path：");
                    sb.append(str);
                    C10153c.m20478a(new RuntimeException(sb.toString(), th));
                }
            }
        });
    }

    /* renamed from: a */
    private static List<File> m20198a(File[] fileArr) {
        long j;
        File file;
        ArrayList<File> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        int length = fileArr.length;
        long j2 = -1;
        File file2 = null;
        for (int i = 0; i < length; i++) {
            file = fileArr[i];
            String name = file.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file);
            } else if (name.endsWith("--pending-delete")) {
                m20199a(file);
            } else {
                try {
                    long parseLong = Long.parseLong(name);
                    if (parseLong > j2) {
                        if (file2 != null) {
                            try {
                                arrayList2.add(file2);
                            } catch (Exception unused) {
                                j2 = parseLong;
                            }
                        }
                        file2 = file;
                        j2 = parseLong;
                    } else {
                        arrayList2.add(file);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        for (File file3 : arrayList) {
            String name2 = file3.getName();
            int indexOf = name2.indexOf("--updating");
            if (indexOf == -1) {
                m20199a(file3);
            } else {
                try {
                    j = Long.parseLong(name2.substring(0, indexOf));
                } catch (NumberFormatException unused3) {
                    j = -1;
                }
                if (j <= j2) {
                    m20199a(file3);
                }
            }
        }
        return arrayList2;
        m20199a(file);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0057 A[Catch:{ all -> 0x009a, all -> 0x009f }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20201b(java.lang.String r4) throws java.lang.Exception {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r1 = "update.lock"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.geckox.h.a r0 = com.bytedance.geckox.p610h.C10112a.m20382a(r0)
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009f }
            r1.<init>()     // Catch:{ all -> 0x009f }
            r1.append(r4)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x009f }
            r1.append(r2)     // Catch:{ all -> 0x009f }
            java.lang.String r2 = "select.lock"
            r1.append(r2)     // Catch:{ all -> 0x009f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x009f }
            com.bytedance.geckox.h.b r1 = com.bytedance.geckox.p610h.C10113b.m20384a(r1)     // Catch:{ all -> 0x009f }
            java.io.File r2 = new java.io.File     // Catch:{ all -> 0x009a }
            r2.<init>(r4)     // Catch:{ all -> 0x009a }
            com.bytedance.geckox.a.c$3 r4 = new com.bytedance.geckox.a.c$3     // Catch:{ all -> 0x009a }
            r4.<init>()     // Catch:{ all -> 0x009a }
            java.io.File[] r4 = r2.listFiles(r4)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x0054
            int r2 = r4.length     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x0054
            int r2 = r4.length     // Catch:{ all -> 0x009a }
            r3 = 1
            if (r2 != r3) goto L_0x004f
            goto L_0x0054
        L_0x004f:
            java.util.List r4 = m20198a(r4)     // Catch:{ all -> 0x009a }
            goto L_0x0055
        L_0x0054:
            r4 = 0
        L_0x0055:
            if (r4 == 0) goto L_0x0093
            boolean r2 = r4.isEmpty()     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x005e
            goto L_0x0093
        L_0x005e:
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x009a }
        L_0x0062:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x008c
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x009a }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r3.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ all -> 0x009a }
            r3.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x009a }
            r3.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "using.lock"
            r3.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x009a }
            com.bytedance.geckox.p610h.C10114c.m20386a(r2)     // Catch:{ all -> 0x009a }
            goto L_0x0062
        L_0x008c:
            r1.mo18091a()     // Catch:{ all -> 0x009f }
            r0.mo18090a()
            return
        L_0x0093:
            r1.mo18091a()     // Catch:{ all -> 0x009f }
            r0.mo18090a()
            return
        L_0x009a:
            r4 = move-exception
            r1.mo18091a()     // Catch:{ all -> 0x009f }
            throw r4     // Catch:{ all -> 0x009f }
        L_0x009f:
            r4 = move-exception
            r0.mo18090a()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.geckox.p594a.C10039c.m20201b(java.lang.String):void");
    }

    /* renamed from: c */
    public static boolean m20202c(String str) {
        C10113b a;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append("update.lock");
            C10112a a2 = C10112a.m20382a(sb.toString());
            if (a2 != null) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(File.separator);
                    sb2.append("select.lock");
                    a = C10113b.m20384a(sb2.toString());
                    File[] listFiles = new File(str).listFiles(new FileFilter() {
                        public final boolean accept(File file) {
                            return file.isDirectory();
                        }
                    });
                    if (listFiles == null || listFiles.length == 0) {
                        listFiles = null;
                    }
                    if (listFiles != null) {
                        if (listFiles.length > 0) {
                            for (File file : listFiles) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(file.getAbsolutePath());
                                sb3.append(File.separator);
                                sb3.append("using.lock");
                                C10114c.m20386a(sb3.toString());
                            }
                            a.mo18091a();
                            a2.mo18090a();
                        }
                    }
                    a.mo18091a();
                    a2.mo18090a();
                } catch (Throwable th) {
                    a2.mo18090a();
                    throw th;
                }
            }
            return true;
        } catch (Throwable th2) {
            StringBuilder sb4 = new StringBuilder("删除channel旧版本失败，path：");
            sb4.append(str);
            C10153c.m20478a(new RuntimeException(sb4.toString(), th2));
            return false;
        }
    }
}
