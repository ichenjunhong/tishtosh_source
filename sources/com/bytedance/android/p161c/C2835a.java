package com.bytedance.android.p161c;

import android.content.Context;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.bytedance.android.p161c.p162a.C2842a;
import com.bytedance.android.p161c.p162a.C2843b;
import com.bytedance.android.p161c.p163b.C2845a;
import com.bytedance.android.p161c.p164c.C2847b;
import com.bytedance.android.p161c.p167f.C2852b;
import com.bytedance.android.p161c.p168g.C2854a;
import com.bytedance.android.p161c.p168g.C2856c;
import com.bytedance.android.p161c.p169h.C2865c;
import com.bytedance.android.p161c.p171i.C2877a;
import com.bytedance.android.p161c.p172j.C2878a;
import com.bytedance.android.p161c.p172j.C2879b;
import com.bytedance.android.p161c.p172j.C2880c;
import com.bytedance.android.p161c.p172j.C2884f;
import com.bytedance.android.p161c.p172j.C2885g;
import com.bytedance.android.p161c.p172j.C2886h;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.android.c.a */
public class C2835a {

    /* renamed from: c */
    private static volatile C2835a f8445c;

    /* renamed from: d */
    private static volatile String f8446d;

    /* renamed from: g */
    private static ThreadLocal<Boolean> f8447g = new ThreadLocal<>();

    /* renamed from: a */
    public String f8448a;

    /* renamed from: b */
    Map<String, C2854a> f8449b = new HashMap();

    /* renamed from: e */
    private File f8450e;

    /* renamed from: f */
    private Map<String, C2854a> f8451f = new HashMap();

    /* renamed from: a */
    public final String mo7471a() {
        File file = this.f8450e;
        StringBuilder sb = new StringBuilder();
        sb.append(f8446d);
        sb.append("/");
        sb.append(this.f8448a);
        return new File(file, sb.toString()).getAbsolutePath();
    }

    /* JADX INFO: used method not loaded: com.bytedance.android.c.a.b.a(java.lang.String):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.android.c.j.h.a(byte[]):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.android.c.a.b.a(com.bytedance.android.c.b.a):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.android.c.c.c.<init>(java.lang.String):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.bytedance.android.c.c.a.<init>(java.lang.String):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (f8446d == null) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        if ("".equals(f8446d) != false) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        r1 = m8094a(r22, r19, r17, r18, r20, r21, r23);
        r3 = new java.io.File(r11.f8497k, f8446d);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r11.f8497k != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r2 = com.bytedance.android.p161c.p172j.C2882d.m8183a(r11.f8497k.listFiles(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r1 = m8093a(m8095a(r1, r13, r11, r2), r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r10 != null) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        if (r14 != false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r11.mo7486a(r0, f8446d) == false) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007c, code lost:
        com.bytedance.android.p161c.p167f.C2852b.m8150d("DecompressableSoLoader", "Decompressed already.");
        r0 = new java.lang.StringBuilder();
        r0.append(r3.getPath());
        r0.append("/");
        r0.append(r9.f8448a);
        r1.mo7477a(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a1, code lost:
        if (r12 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        if (r13 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a5, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append(r9.f8448a);
        r4.append("/");
        r4.append(r12);
        r2 = new java.io.File(r3, r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c4, code lost:
        if (r2.exists() == false) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c6, code lost:
        r4 = (com.bytedance.android.p161c.p168g.C2855b) r11.f8492f.get(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ce, code lost:
        if (r4 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d8, code lost:
        if (m8101a(r2, (java.lang.String) r4.f8500b) == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00db, code lost:
        r5 = new java.lang.StringBuilder("verify lib ");
        r5.append(r12);
        r5.append(" md5 fail! delete and rebuild!");
        com.bytedance.android.p161c.p167f.C2852b.m8150d("DecompressableSoLoader", r5.toString());
        r2.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f7, code lost:
        r1.mo7478a(r13, r2.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ff, code lost:
        r2 = m8097a(r0, r11, r1, r14);
        r6 = r2.mo7475a();
        r7 = r2.mo7475a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010b, code lost:
        if (r7 == null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x010d, code lost:
        if (r6 != null) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0111, code lost:
        r0 = m8102b();
        r4 = m8092a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r5 = com.bytedance.android.p161c.p172j.C2883e.m8184a(r7);
        r8 = r5.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0124, code lost:
        if (r8 == 3842) goto L_0x0144;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0129, code lost:
        if (r8 == 100511) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012e, code lost:
        if (r8 == 3748713) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0137, code lost:
        if (r5.equals("zstd") == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0140, code lost:
        if (r5.equals("elf") == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0142, code lost:
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014a, code lost:
        if (r5.equals("xz") == false) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014c, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x014e, code lost:
        r15 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x014f, code lost:
        switch(r15) {
            case 0: goto L_0x0164;
            case 1: goto L_0x0164;
            case 2: goto L_0x0155;
            default: goto L_0x0152;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0155, code lost:
        if (r10 == null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0157, code lost:
        com.bytedance.android.p161c.C2844b.m8132a(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        m8099a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x015d, code lost:
        com.bytedance.android.p161c.p172j.C2885g.m8188a(r6);
        com.bytedance.android.p161c.p172j.C2885g.m8188a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0163, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        m8105b(r0);
        new com.bytedance.android.p161c.p169h.C2868f(r0.getLooper(), r4, r3, r9.f8448a).mo7500a(r2, r19, r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017a, code lost:
        r2 = new java.lang.StringBuilder("Unknown file format for magic number ");
        r2.append(com.bytedance.android.p161c.p172j.C2886h.m8190a(r5.getBytes()));
        r4.mo7476a(new com.bytedance.android.p161c.p163b.C2845a(8, "Unknown file format!", new com.bytedance.android.p161c.p164c.C2848c(r2.toString())));
        m8099a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01aa, code lost:
        com.bytedance.android.p161c.p172j.C2885g.m8188a(r6);
        com.bytedance.android.p161c.p172j.C2885g.m8188a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b1, code lost:
        r1.mo7476a(new com.bytedance.android.p161c.p163b.C2845a(4, "Compressed data is broken!", new com.bytedance.android.p161c.p164c.C2846a("Compressed data is broken while reading data stream!")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01cb, code lost:
        throw new java.lang.RuntimeException("You must set version for overlay installation！");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7474a(android.content.Context r17, java.lang.String r18, com.bytedance.android.p161c.p168g.C2854a r19, java.lang.String r20, java.lang.String r21, com.bytedance.android.p161c.p162a.C2842a r22, boolean r23) {
        /*
            r16 = this;
            r9 = r16
            r0 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r23
            monitor-enter(r19)
            boolean r1 = r11.f8493g     // Catch:{ all -> 0x01cc }
            if (r1 == 0) goto L_0x0027
            if (r14 != 0) goto L_0x0027
            java.util.List<com.bytedance.android.c.g.c<android.content.Context, java.lang.String, com.bytedance.android.c.a.a>> r1 = r11.f8495i     // Catch:{ all -> 0x01cc }
            com.bytedance.android.c.g.c r2 = new com.bytedance.android.c.g.c     // Catch:{ all -> 0x01cc }
            android.content.Context r0 = r17.getApplicationContext()     // Catch:{ all -> 0x01cc }
            r3 = r22
            r2.<init>(r0, r10, r3)     // Catch:{ all -> 0x01cc }
            r1.add(r2)     // Catch:{ all -> 0x01cc }
            monitor-exit(r19)     // Catch:{ all -> 0x01cc }
            return
        L_0x0027:
            r3 = r22
            r15 = 1
            r11.f8493g = r15     // Catch:{ all -> 0x01cc }
            monitor-exit(r19)     // Catch:{ all -> 0x01cc }
            java.lang.String r1 = f8446d
            if (r1 == 0) goto L_0x01c4
            java.lang.String r1 = ""
            java.lang.String r2 = f8446d
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x01c4
            r1 = r16
            r2 = r22
            r3 = r19
            r4 = r17
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r23
            com.bytedance.android.c.a.a r1 = r1.m8094a(r2, r3, r4, r5, r6, r7, r8)
            java.io.File r3 = new java.io.File
            java.io.File r2 = r11.f8497k
            java.lang.String r4 = f8446d
            r3.<init>(r2, r4)
            java.io.File r2 = r11.f8497k
            if (r2 != 0) goto L_0x005e
            r2 = 0
            goto L_0x0068
        L_0x005e:
            java.io.File r2 = r11.f8497k
            java.io.File[] r2 = r2.listFiles()
            java.io.File[] r2 = com.bytedance.android.p161c.p172j.C2882d.m8183a(r2, r3)
        L_0x0068:
            com.bytedance.android.c.a.a r1 = r9.m8095a(r1, r13, r11, r2)
            com.bytedance.android.c.a.a r1 = r9.m8093a(r1, r11)
            if (r10 != 0) goto L_0x00a1
            if (r14 != 0) goto L_0x00a1
            java.lang.String r2 = f8446d
            boolean r2 = r11.mo7486a(r0, r2)
            if (r2 == 0) goto L_0x00a1
            java.lang.String r0 = "DecompressableSoLoader"
            java.lang.String r2 = "Decompressed already."
            com.bytedance.android.p161c.p167f.C2852b.m8150d(r0, r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r3.getPath()
            r0.append(r2)
            java.lang.String r2 = "/"
            r0.append(r2)
            java.lang.String r2 = r9.f8448a
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.mo7477a(r0)
            return
        L_0x00a1:
            if (r12 == 0) goto L_0x00ff
            if (r13 == 0) goto L_0x00ff
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r9.f8448a
            r4.append(r5)
            java.lang.String r5 = "/"
            r4.append(r5)
            r4.append(r12)
            java.lang.String r4 = r4.toString()
            r2.<init>(r3, r4)
            boolean r4 = r2.exists()
            if (r4 == 0) goto L_0x00ff
            java.util.Map<java.lang.String, com.bytedance.android.c.g.b<java.lang.Long, java.lang.String>> r4 = r11.f8492f
            java.lang.Object r4 = r4.get(r13)
            com.bytedance.android.c.g.b r4 = (com.bytedance.android.p161c.p168g.C2855b) r4
            if (r4 == 0) goto L_0x00f7
            java.lang.Object r4 = r4.f8500b
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = m8101a(r2, r4)
            if (r4 == 0) goto L_0x00db
            goto L_0x00f7
        L_0x00db:
            java.lang.String r4 = "DecompressableSoLoader"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "verify lib "
            r5.<init>(r6)
            r5.append(r12)
            java.lang.String r6 = " md5 fail! delete and rebuild!"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.bytedance.android.p161c.p167f.C2852b.m8150d(r4, r5)
            r2.delete()
            goto L_0x00ff
        L_0x00f7:
            java.lang.String r0 = r2.getAbsolutePath()
            r1.mo7478a(r13, r0)
            return
        L_0x00ff:
            com.bytedance.android.c.h.c r2 = r9.m8097a(r0, r11, r1, r14)
            java.io.InputStream r6 = r2.mo7475a()
            java.io.InputStream r7 = r2.mo7475a()
            if (r7 == 0) goto L_0x01b1
            if (r6 != 0) goto L_0x0111
            goto L_0x01b1
        L_0x0111:
            android.os.HandlerThread r0 = m8102b()
            com.bytedance.android.c.a.a r4 = r9.m8092a(r1, r0)
            java.lang.String r5 = com.bytedance.android.p161c.p172j.C2883e.m8184a(r7)     // Catch:{ all -> 0x01a9 }
            r1 = -1
            int r8 = r5.hashCode()     // Catch:{ all -> 0x01a9 }
            r12 = 3842(0xf02, float:5.384E-42)
            if (r8 == r12) goto L_0x0144
            r12 = 100511(0x1889f, float:1.40846E-40)
            if (r8 == r12) goto L_0x013a
            r12 = 3748713(0x393369, float:5.253066E-39)
            if (r8 == r12) goto L_0x0131
            goto L_0x014e
        L_0x0131:
            java.lang.String r8 = "zstd"
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x01a9 }
            if (r8 == 0) goto L_0x014e
            goto L_0x014f
        L_0x013a:
            java.lang.String r8 = "elf"
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x01a9 }
            if (r8 == 0) goto L_0x014e
            r15 = 2
            goto L_0x014f
        L_0x0144:
            java.lang.String r8 = "xz"
            boolean r8 = r5.equals(r8)     // Catch:{ all -> 0x01a9 }
            if (r8 == 0) goto L_0x014e
            r15 = 0
            goto L_0x014f
        L_0x014e:
            r15 = -1
        L_0x014f:
            switch(r15) {
                case 0: goto L_0x0164;
                case 1: goto L_0x0164;
                case 2: goto L_0x0155;
                default: goto L_0x0152;
            }     // Catch:{ all -> 0x01a9 }
        L_0x0152:
            com.bytedance.android.c.c.c r1 = new com.bytedance.android.c.c.c     // Catch:{ all -> 0x01a9 }
            goto L_0x017a
        L_0x0155:
            if (r10 == 0) goto L_0x015a
            com.bytedance.android.p161c.C2844b.m8132a(r18)     // Catch:{ all -> 0x01a9 }
        L_0x015a:
            m8099a(r0)     // Catch:{ all -> 0x01a9 }
            com.bytedance.android.p161c.p172j.C2885g.m8188a(r6)
            com.bytedance.android.p161c.p172j.C2885g.m8188a(r7)
            return
        L_0x0164:
            m8105b(r0)     // Catch:{ all -> 0x01a9 }
            com.bytedance.android.c.h.f r1 = new com.bytedance.android.c.h.f     // Catch:{ all -> 0x01a9 }
            android.os.Looper r0 = r0.getLooper()     // Catch:{ all -> 0x01a9 }
            java.lang.String r8 = r9.f8448a     // Catch:{ all -> 0x01a9 }
            r1.<init>(r0, r4, r3, r8)     // Catch:{ all -> 0x01a9 }
            r0 = r1
            r1 = r2
            r2 = r19
            r0.mo7500a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x01a9 }
            goto L_0x01a2
        L_0x017a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a9 }
            java.lang.String r3 = "Unknown file format for magic number "
            r2.<init>(r3)     // Catch:{ all -> 0x01a9 }
            byte[] r3 = r5.getBytes()     // Catch:{ all -> 0x01a9 }
            java.lang.String r3 = com.bytedance.android.p161c.p172j.C2886h.m8190a(r3)     // Catch:{ all -> 0x01a9 }
            r2.append(r3)     // Catch:{ all -> 0x01a9 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a9 }
            r1.<init>(r2)     // Catch:{ all -> 0x01a9 }
            com.bytedance.android.c.b.a r2 = new com.bytedance.android.c.b.a     // Catch:{ all -> 0x01a9 }
            r3 = 8
            java.lang.String r5 = "Unknown file format!"
            r2.<init>(r3, r5, r1)     // Catch:{ all -> 0x01a9 }
            r4.mo7476a(r2)     // Catch:{ all -> 0x01a9 }
            m8099a(r0)     // Catch:{ all -> 0x01a9 }
        L_0x01a2:
            com.bytedance.android.p161c.p172j.C2885g.m8188a(r6)
            com.bytedance.android.p161c.p172j.C2885g.m8188a(r7)
            return
        L_0x01a9:
            r0 = move-exception
            com.bytedance.android.p161c.p172j.C2885g.m8188a(r6)
            com.bytedance.android.p161c.p172j.C2885g.m8188a(r7)
            throw r0
        L_0x01b1:
            com.bytedance.android.c.c.a r0 = new com.bytedance.android.c.c.a
            java.lang.String r2 = "Compressed data is broken while reading data stream!"
            r0.<init>(r2)
            com.bytedance.android.c.b.a r2 = new com.bytedance.android.c.b.a
            r3 = 4
            java.lang.String r4 = "Compressed data is broken!"
            r2.<init>(r3, r4, r0)
            r1.mo7476a(r2)
            return
        L_0x01c4:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "You must set version for overlay installation！"
            r0.<init>(r1)
            throw r0
        L_0x01cc:
            r0 = move-exception
            monitor-exit(r19)     // Catch:{ all -> 0x01cc }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p161c.C2835a.mo7474a(android.content.Context, java.lang.String, com.bytedance.android.c.g.a, java.lang.String, java.lang.String, com.bytedance.android.c.a.a, boolean):void");
    }

    /* renamed from: a */
    public final void mo7473a(Context context, String str, final C2843b bVar) {
        C2854a b = m8103b(str);
        if (b == null) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder("Metadata ");
            sb2.append(this.f8448a);
            sb2.append(" with ");
            sb2.append(str);
            sb2.append(" not find!");
            sb.append(sb2.toString());
            sb.append("Map Entry:[");
            for (Entry entry : this.f8451f.entrySet()) {
                sb.append("\"");
                sb.append((String) entry.getKey());
                sb.append(":");
                sb.append(((C2854a) entry.getValue()).f8487a);
                sb.append("\",");
            }
            sb.append("].");
            StringBuilder sb3 = new StringBuilder("Get metadata error! error detail: ");
            sb3.append(sb.toString());
            C2852b.m8147a("DecompressableSoLoader", sb3.toString());
            if (this.f8451f.size() == 1) {
                b = (C2854a) this.f8451f.values().toArray()[0];
            } else {
                bVar.mo7476a(new C2845a(1, sb.toString()));
                return;
            }
        }
        mo7474a(context, (String) null, b, (String) null, (String) null, (C2842a) new C2842a() {
            /* renamed from: a */
            public final void mo7478a(String str, String str2) {
            }

            /* renamed from: a */
            public final void mo7476a(C2845a aVar) {
                if (bVar != null) {
                    bVar.mo7476a(aVar);
                }
            }

            /* renamed from: a */
            public final void mo7477a(String str) {
                if (bVar != null) {
                    bVar.mo7477a(str);
                }
            }
        }, false);
    }

    /* renamed from: a */
    public final String mo7472a(String str) {
        C2854a b = m8103b(str);
        if (b == null) {
            return TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        return b.f8498l;
    }

    /* renamed from: a */
    private static boolean m8101a(File file, String str) {
        return str.equals(C2884f.m8186a(file));
    }

    /* renamed from: b */
    private static HandlerThread m8102b() {
        return new HandlerThread("so-decompress-handler");
    }

    /* renamed from: b */
    private static void m8105b(HandlerThread handlerThread) {
        if (handlerThread != null && !handlerThread.isAlive() && !handlerThread.isInterrupted()) {
            handlerThread.start();
        }
    }

    private C2835a(Context context) {
        this.f8448a = C2880c.m8179a(context);
        this.f8450e = context.getDir("lib", 0);
        m8100a(m8104b(context));
    }

    /* renamed from: b */
    private C2854a m8103b(String str) {
        Map<String, C2854a> map = this.f8451f;
        StringBuilder sb = new StringBuilder("assets/lib/");
        sb.append(str);
        C2854a aVar = (C2854a) map.get(sb.toString());
        if (aVar != null) {
            return aVar;
        }
        Map<String, C2854a> map2 = this.f8451f;
        StringBuilder sb2 = new StringBuilder("lib/");
        sb2.append(this.f8448a);
        sb2.append("/lib");
        sb2.append(str);
        return (C2854a) map2.get(sb2.toString());
    }

    /* renamed from: c */
    private static InputStream m8106c(Context context) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            inputStream = context.getResources().getAssets().open("lib/metadata.txt");
        } catch (IOException e) {
            C2845a.m8134a(e);
            inputStream = null;
        }
        if (inputStream != null) {
            return inputStream;
        }
        String str = "assets/lib/metadata.txt";
        if (context != null) {
            try {
                String packageResourcePath = context.getPackageResourcePath();
                if (packageResourcePath != null) {
                    inputStream2 = C2878a.m8176a(new File(packageResourcePath), str);
                }
            } catch (IOException e2) {
                C2845a.m8134a(e2);
                return inputStream;
            }
        }
        return inputStream2;
    }

    /* renamed from: a */
    public static C2835a m8096a(Context context) {
        if (f8445c == null) {
            synchronized (C2835a.class) {
                if (f8445c == null) {
                    f8445c = new C2835a(context);
                }
            }
        }
        return f8445c;
    }

    /* renamed from: b */
    private List<C2854a> m8104b(Context context) {
        InputStream c = m8106c(context);
        List<C2854a> arrayList = new ArrayList<>();
        if (c != null) {
            try {
                List<C2854a> a = C2877a.m8175a(c);
                C2885g.m8188a(c);
                arrayList = a;
            } catch (IOException e) {
                C2845a.m8134a(e);
                C2885g.m8188a(c);
            } catch (Throwable th) {
                C2885g.m8188a(c);
                throw th;
            }
        }
        for (C2854a aVar : arrayList) {
            aVar.f8497k = this.f8450e;
        }
        return arrayList;
    }

    /* renamed from: c */
    private String m8107c(String str) {
        String[] split = str.split("/");
        if (split.length != 3) {
            StringBuilder sb = new StringBuilder("Invalid file format while parse origin so name: ");
            sb.append(str);
            throw new C2847b(sb.toString());
        } else if (split[1].equals(this.f8448a)) {
            return split[2];
        } else {
            return split[2];
        }
    }

    /* renamed from: a */
    public static void m8099a(HandlerThread handlerThread) {
        if (handlerThread != null && handlerThread.isAlive() && handlerThread.getLooper() != null) {
            handlerThread.quit();
        }
    }

    /* renamed from: a */
    private void m8100a(List<C2854a> list) {
        for (C2854a aVar : list) {
            for (String c : aVar.f8492f.keySet()) {
                String c2 = m8107c(c);
                if (c2 != null) {
                    this.f8449b.put(c2, aVar);
                }
            }
            this.f8451f.put(aVar.mo7485a(), aVar);
        }
    }

    /* renamed from: a */
    private C2842a m8092a(final C2842a aVar, final HandlerThread handlerThread) {
        return new C2842a() {
            /* renamed from: a */
            public final void mo7476a(C2845a aVar) {
                if (aVar != null) {
                    aVar.mo7476a(aVar);
                }
                C2835a.m8099a(handlerThread);
            }

            /* renamed from: a */
            public final void mo7477a(String str) {
                if (aVar != null) {
                    aVar.mo7477a(str);
                }
                C2835a.m8099a(handlerThread);
            }

            /* renamed from: a */
            public final void mo7478a(String str, String str2) {
                if (aVar != null) {
                    aVar.mo7478a(str, str2);
                }
                C2835a.m8099a(handlerThread);
            }
        };
    }

    /* renamed from: a */
    private C2842a m8093a(final C2842a aVar, final C2854a aVar2) {
        return new C2842a() {
            /* renamed from: a */
            public final void mo7476a(C2845a aVar) {
                int i;
                ArrayList arrayList = new ArrayList();
                synchronized (aVar2) {
                    aVar2.f8493g = false;
                    if (!aVar2.f8495i.isEmpty()) {
                        arrayList.addAll(aVar2.f8495i);
                    }
                    aVar2.f8495i.clear();
                }
                if (aVar != null) {
                    aVar.mo7476a(aVar);
                }
                if (!arrayList.isEmpty()) {
                    for (i = 0; i < arrayList.size(); i++) {
                        ((C2842a) ((C2856c) arrayList.get(i)).f8503c).mo7476a(aVar);
                    }
                }
            }

            /* renamed from: a */
            public final void mo7477a(String str) {
                int i;
                ArrayList arrayList = new ArrayList();
                synchronized (aVar2) {
                    aVar2.f8493g = false;
                    if (!aVar2.f8495i.isEmpty()) {
                        arrayList.addAll(aVar2.f8495i);
                    }
                    aVar2.f8495i.clear();
                }
                if (aVar != null) {
                    aVar.mo7477a(str);
                }
                if (!arrayList.isEmpty()) {
                    StringBuilder sb = new StringBuilder("Have multi thread decompress! thread size: ");
                    sb.append(arrayList.size());
                    C2852b.m8150d("DecompressableSoLoader", sb.toString());
                    for (i = 0; i < arrayList.size(); i++) {
                        C2856c cVar = (C2856c) arrayList.get(i);
                        Context context = (Context) cVar.f8501a;
                        String str2 = (String) cVar.f8502b;
                        C2842a aVar = (C2842a) cVar.f8503c;
                        if (!C2886h.m8192a(str2)) {
                            C2835a aVar2 = C2835a.this;
                            StringBuilder sb2 = new StringBuilder("lib");
                            sb2.append(str2);
                            sb2.append(".so");
                            String sb3 = sb2.toString();
                            StringBuilder sb4 = new StringBuilder("lib/");
                            sb4.append(aVar2.f8448a);
                            sb4.append("/lib");
                            sb4.append(str2);
                            sb4.append(".so");
                            String sb5 = sb4.toString();
                            C2854a aVar3 = (C2854a) aVar2.f8449b.get(sb3);
                            if (aVar3 == null) {
                                if (aVar != null) {
                                    aVar.mo7478a(null, null);
                                }
                                C2844b.m8132a(str2);
                            } else {
                                aVar2.mo7474a(context, str2, aVar3, sb3, sb5, aVar, false);
                            }
                        } else if (aVar != null) {
                            aVar.mo7477a(str);
                        }
                    }
                }
            }

            /* renamed from: a */
            public final void mo7478a(String str, String str2) {
                if (aVar != null) {
                    aVar.mo7478a(str, str2);
                }
            }
        };
    }

    /* JADX INFO: used method not loaded: com.bytedance.android.c.j.c.a(android.content.Context):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (android.os.Build.VERSION.SDK_INT > 22) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r8 = com.bytedance.android.p161c.C2835a.class.getClassLoader();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        if (android.os.Build.VERSION.SDK_INT <= 27) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        r1 = com.bytedance.android.p161c.p166e.C2850a.m8137a(dalvik.system.BaseDexClassLoader.class, "pathList");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r1 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0037, code lost:
        r1 = dalvik.system.BaseDexClassLoader.class.getDeclaredField("pathList");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        r1.setAccessible(true);
        r8 = r1.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        if (android.os.Build.VERSION.SDK_INT <= 27) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        r1 = com.bytedance.android.p161c.p166e.C2850a.m8137a(r8.getClass(), "nativeLibraryDirectories");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0055, code lost:
        if (r1 != null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        r1 = r8.getClass().getDeclaredField("nativeLibraryDirectories");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        r1.setAccessible(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (android.os.Build.VERSION.SDK_INT > 22) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006a, code lost:
        r0 = (java.io.File[]) r1.get(r8);
        r2 = new java.io.File[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0074, code lost:
        if (r0 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0076, code lost:
        r2 = new java.io.File[(r0.length + 1)];
        java.lang.System.arraycopy(r0, 0, r2, 1, r0.length);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        r2[0] = new java.io.File(new java.io.File(r7.getDir("lib", 0), f8446d), com.bytedance.android.p161c.p172j.C2880c.m8179a(r7));
        r1.set(r8, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009a, code lost:
        r8 = (java.util.List) r1.get(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a0, code lost:
        if (r8 == null) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        r8.add(0, new java.io.File(new java.io.File(r7.getDir("lib", 0), f8446d), com.bytedance.android.p161c.p172j.C2880c.m8179a(r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        com.bytedance.android.p161c.p163b.C2845a.m8134a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c1, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c2, code lost:
        com.bytedance.android.p161c.p163b.C2845a.m8134a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c6, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        com.bytedance.android.p161c.p163b.C2845a.m8134a(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ca, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8098a(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.Class<com.bytedance.android.c.a> r0 = com.bytedance.android.p161c.C2835a.class
            monitor-enter(r0)
            if (r8 == 0) goto L_0x00ce
            java.lang.String r1 = ""
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x00cc }
            if (r1 != 0) goto L_0x00ce
            java.lang.String r1 = f8446d     // Catch:{ all -> 0x00cc }
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x00cc }
            if (r1 == 0) goto L_0x0017
            goto L_0x00ce
        L_0x0017:
            f8446d = r8     // Catch:{ all -> 0x00cc }
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            int r8 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r8 > r0) goto L_0x00cb
            java.lang.Class<com.bytedance.android.c.a> r8 = com.bytedance.android.p161c.C2835a.class
            java.lang.ClassLoader r8 = r8.getClassLoader()     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            r2 = 27
            if (r1 <= r2) goto L_0x0037
            java.lang.Class<dalvik.system.BaseDexClassLoader> r1 = dalvik.system.BaseDexClassLoader.class
            java.lang.String r3 = "pathList"
            java.lang.reflect.Field r1 = com.bytedance.android.p161c.p166e.C2850a.m8137a(r1, r3)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            if (r1 != 0) goto L_0x003f
            return
        L_0x0037:
            java.lang.Class<dalvik.system.BaseDexClassLoader> r1 = dalvik.system.BaseDexClassLoader.class
            java.lang.String r3 = "pathList"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
        L_0x003f:
            r3 = 1
            r1.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.lang.Object r8 = r1.get(r8)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            if (r1 <= r2) goto L_0x0058
            java.lang.Class r1 = r8.getClass()     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.lang.String r2 = "nativeLibraryDirectories"
            java.lang.reflect.Field r1 = com.bytedance.android.p161c.p166e.C2850a.m8137a(r1, r2)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            if (r1 != 0) goto L_0x0062
            return
        L_0x0058:
            java.lang.Class r1 = r8.getClass()     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.lang.String r2 = "nativeLibraryDirectories"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
        L_0x0062:
            r1.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            r4 = 0
            if (r2 > r0) goto L_0x009a
            java.lang.Object r0 = r1.get(r8)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.io.File[] r0 = (java.io.File[]) r0     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.io.File[] r0 = (java.io.File[]) r0     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.io.File[] r2 = new java.io.File[r3]     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            if (r0 == 0) goto L_0x007e
            int r2 = r0.length     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            int r2 = r2 + r3
            java.io.File[] r2 = new java.io.File[r2]     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            int r5 = r0.length     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.lang.System.arraycopy(r0, r4, r2, r3, r5)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
        L_0x007e:
            java.lang.String r0 = com.bytedance.android.p161c.p172j.C2880c.m8179a(r7)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.io.File r3 = new java.io.File     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.io.File r5 = new java.io.File     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.lang.String r6 = "lib"
            java.io.File r7 = r7.getDir(r6, r4)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.lang.String r6 = f8446d     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            r5.<init>(r7, r6)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            r3.<init>(r5, r0)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            r2[r4] = r3     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            r1.set(r8, r2)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            goto L_0x00cb
        L_0x009a:
            java.lang.Object r8 = r1.get(r8)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.util.List r8 = (java.util.List) r8     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            if (r8 == 0) goto L_0x00bb
            java.lang.String r0 = com.bytedance.android.p161c.p172j.C2880c.m8179a(r7)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.io.File r1 = new java.io.File     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.io.File r2 = new java.io.File     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.lang.String r3 = "lib"
            java.io.File r7 = r7.getDir(r3, r4)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            java.lang.String r3 = f8446d     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            r2.<init>(r7, r3)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            r1.<init>(r2, r0)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
            r8.add(r4, r1)     // Catch:{ NoSuchFieldException -> 0x00c6, IllegalAccessException -> 0x00c1, InvocationTargetException -> 0x00bc }
        L_0x00bb:
            return
        L_0x00bc:
            r7 = move-exception
            com.bytedance.android.p161c.p163b.C2845a.m8134a(r7)
            goto L_0x00cb
        L_0x00c1:
            r7 = move-exception
            com.bytedance.android.p161c.p163b.C2845a.m8134a(r7)
            return
        L_0x00c6:
            r7 = move-exception
            com.bytedance.android.p161c.p163b.C2845a.m8134a(r7)
            return
        L_0x00cb:
            return
        L_0x00cc:
            r7 = move-exception
            goto L_0x00d0
        L_0x00ce:
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            return
        L_0x00d0:
            monitor-exit(r0)     // Catch:{ all -> 0x00cc }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p161c.C2835a.m8098a(android.content.Context, java.lang.String):void");
    }

    /* renamed from: a */
    private C2842a m8095a(final C2842a aVar, final String str, C2854a aVar2, final File[] fileArr) {
        return new C2842a() {
            /* renamed from: a */
            public final void mo7476a(C2845a aVar) {
                if (aVar != null) {
                    aVar.mo7476a(aVar);
                }
            }

            /* renamed from: a */
            public final void mo7477a(String str) {
                if (aVar != null) {
                    aVar.mo7477a(str);
                    StringBuilder sb = new StringBuilder("Metadata decompress complete.Put to dir: ");
                    sb.append(str);
                    C2852b.m8149c("DecompressableSoLoader", sb.toString());
                }
                if (fileArr != null && fileArr.length > 0) {
                    File[] fileArr = fileArr;
                    if (fileArr != null) {
                        new Thread(new C2879b(fileArr)).start();
                    }
                    StringBuilder sb2 = new StringBuilder("clean directories used for history: ");
                    sb2.append(C2886h.m8191a((Object[]) fileArr));
                    C2852b.m8149c("DecompressableSoLoader", sb2.toString());
                }
            }

            /* renamed from: a */
            public final void mo7478a(String str, String str2) {
                if (aVar != null) {
                    aVar.mo7478a(str, str2);
                }
                if (str != null && str.equals(str)) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    System.load(str2);
                    C18973a.m46141a(uptimeMillis, str2);
                }
            }
        };
    }

    /* renamed from: a */
    private C2865c m8097a(Context context, C2854a aVar, C2842a aVar2, boolean z) {
        final C2854a aVar3 = aVar;
        final boolean z2 = z;
        final Context context2 = context;
        final C2842a aVar4 = aVar2;
        C28361 r0 = new C2865c(context) {
            /* JADX WARNING: Removed duplicated region for block: B:35:0x00e9  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.io.InputStream mo7475a() {
                /*
                    r8 = this;
                    com.bytedance.android.c.g.a r0 = r3
                    java.lang.String r0 = r0.f8487a
                    boolean r1 = r4
                    if (r1 == 0) goto L_0x0016
                    java.lang.String r1 = "DecompressableSoLoader"
                    java.lang.String r2 = "force retry by data from apk!"
                    com.bytedance.android.p161c.p167f.C2852b.m8150d(r1, r2)
                    android.content.Context r1 = r5
                    java.io.InputStream r0 = r8.m8112a(r1, r0)
                    return r0
                L_0x0016:
                    r1 = 0
                    java.lang.String r2 = "lib/"
                    boolean r2 = r0.startsWith(r2)     // Catch:{ IOException -> 0x00d2 }
                    if (r2 == 0) goto L_0x00a5
                    java.lang.String r2 = "DecompressableSoLoader"
                    java.lang.String r3 = "get compressed data from lib."
                    com.bytedance.android.p161c.p167f.C2852b.m8149c(r2, r3)     // Catch:{ IOException -> 0x00d2 }
                    android.content.Context r2 = r5     // Catch:{ IOException -> 0x00d2 }
                    java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch:{ IOException -> 0x00d2 }
                    dalvik.system.PathClassLoader r2 = (dalvik.system.PathClassLoader) r2     // Catch:{ IOException -> 0x00d2 }
                    com.bytedance.android.c.g.a r3 = r3     // Catch:{ IOException -> 0x00d2 }
                    java.lang.String r4 = r3.f8496j     // Catch:{ IOException -> 0x00d2 }
                    if (r4 != 0) goto L_0x0061
                    java.lang.String r4 = r3.f8487a     // Catch:{ IOException -> 0x00d2 }
                    if (r4 == 0) goto L_0x0061
                    java.lang.String r4 = r3.f8487a     // Catch:{ IOException -> 0x00d2 }
                    java.lang.String r5 = "/"
                    java.lang.String[] r4 = r4.split(r5)     // Catch:{ IOException -> 0x00d2 }
                    int r5 = r4.length     // Catch:{ IOException -> 0x00d2 }
                    r6 = 3
                    if (r5 != r6) goto L_0x0061
                    r5 = 2
                    r4 = r4[r5]     // Catch:{ IOException -> 0x00d2 }
                    java.lang.String r5 = "lib"
                    java.lang.String r6 = ""
                    java.lang.String r4 = r4.replace(r5, r6)     // Catch:{ IOException -> 0x00d2 }
                    java.lang.String r5 = ".so"
                    java.lang.String r6 = ""
                    java.lang.String r4 = r4.replace(r5, r6)     // Catch:{ IOException -> 0x00d2 }
                    java.lang.String r5 = ".xzs"
                    java.lang.String r6 = ""
                    java.lang.String r4 = r4.replace(r5, r6)     // Catch:{ IOException -> 0x00d2 }
                    r3.f8496j = r4     // Catch:{ IOException -> 0x00d2 }
                L_0x0061:
                    java.lang.String r3 = r3.f8496j     // Catch:{ IOException -> 0x00d2 }
                    java.lang.String r2 = r2.findLibrary(r3)     // Catch:{ IOException -> 0x00d2 }
                    if (r2 == 0) goto L_0x00e7
                    java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x00d2 }
                    r3.<init>(r2)     // Catch:{ IOException -> 0x00d2 }
                    boolean r4 = r3.exists()     // Catch:{ IOException -> 0x00d2 }
                    if (r4 == 0) goto L_0x007a
                    java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00d2 }
                    r2.<init>(r3)     // Catch:{ IOException -> 0x00d2 }
                    goto L_0x00a3
                L_0x007a:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d2 }
                    r3.<init>()     // Catch:{ IOException -> 0x00d2 }
                    java.lang.String r4 = "\\.apk!"
                    java.lang.String[] r2 = r2.split(r4)     // Catch:{ IOException -> 0x00d2 }
                    r4 = 0
                    r2 = r2[r4]     // Catch:{ IOException -> 0x00d2 }
                    r3.append(r2)     // Catch:{ IOException -> 0x00d2 }
                    java.lang.String r2 = ".apk"
                    r3.append(r2)     // Catch:{ IOException -> 0x00d2 }
                    java.lang.String r2 = r3.toString()     // Catch:{ IOException -> 0x00d2 }
                    java.io.File r3 = new java.io.File     // Catch:{ IOException -> 0x00d2 }
                    r3.<init>(r2)     // Catch:{ IOException -> 0x00d2 }
                    boolean r2 = r3.exists()     // Catch:{ IOException -> 0x00d2 }
                    if (r2 == 0) goto L_0x00e7
                    java.io.InputStream r2 = com.bytedance.android.p161c.p172j.C2878a.m8176a(r3, r0)     // Catch:{ IOException -> 0x00d2 }
                L_0x00a3:
                    r1 = r2
                    goto L_0x00e7
                L_0x00a5:
                    java.lang.String r2 = "assets/"
                    boolean r2 = r0.startsWith(r2)     // Catch:{ IOException -> 0x00d2 }
                    if (r2 == 0) goto L_0x00e7
                    java.lang.String r2 = "DecompressableSoLoader"
                    java.lang.String r3 = "get compressed data from assets."
                    com.bytedance.android.p161c.p167f.C2852b.m8149c(r2, r3)     // Catch:{ IOException -> 0x00d2 }
                    java.lang.String r2 = "assets/"
                    java.lang.String r3 = ""
                    java.lang.String r2 = r0.replace(r2, r3)     // Catch:{ IOException -> 0x00d2 }
                    android.content.Context r0 = r5     // Catch:{ IOException -> 0x00cd }
                    android.content.res.Resources r0 = r0.getResources()     // Catch:{ IOException -> 0x00cd }
                    android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ IOException -> 0x00cd }
                    java.io.InputStream r0 = r0.open(r2)     // Catch:{ IOException -> 0x00cd }
                    r1 = r0
                    r0 = r2
                    goto L_0x00e7
                L_0x00cd:
                    r0 = move-exception
                    r7 = r2
                    r2 = r0
                    r0 = r7
                    goto L_0x00d3
                L_0x00d2:
                    r2 = move-exception
                L_0x00d3:
                    java.lang.String r3 = "Compressed data is broken by some unknown reason!"
                    com.bytedance.android.c.c.a r4 = new com.bytedance.android.c.c.a
                    r4.<init>(r3, r2)
                    com.bytedance.android.c.a.a r2 = r6
                    com.bytedance.android.c.b.a r3 = new com.bytedance.android.c.b.a
                    r5 = 4
                    java.lang.String r6 = "Can not find valid compressed data file path!"
                    r3.<init>(r5, r6, r4)
                    r2.mo7476a(r3)
                L_0x00e7:
                    if (r1 != 0) goto L_0x00f6
                    java.lang.String r1 = "DecompressableSoLoader"
                    java.lang.String r2 = "get input stream fail, fall back to apk!"
                    com.bytedance.android.p161c.p167f.C2852b.m8150d(r1, r2)
                    android.content.Context r1 = r5
                    java.io.InputStream r1 = r8.m8112a(r1, r0)
                L_0x00f6:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p161c.C2835a.C28361.mo7475a():java.io.InputStream");
            }

            /* renamed from: a */
            private InputStream m8112a(Context context, String str) {
                InputStream inputStream;
                List<File> list = C2865c.f8526f;
                if (list == null) {
                    return null;
                }
                for (File file : list) {
                    if (file != null && file.exists()) {
                        try {
                            inputStream = C2878a.m8176a(file, str);
                        } catch (IOException e) {
                            StringBuilder sb = new StringBuilder("Error while find valid compressed data at ");
                            sb.append(file);
                            sb.append("! stack:");
                            sb.append(C2886h.m8189a((Throwable) e));
                            C2852b.m8147a("DecompressableSoLoader", sb.toString());
                            inputStream = null;
                        }
                        if (inputStream != null) {
                            return inputStream;
                        }
                    }
                }
                return null;
            }
        };
        return r0;
    }

    /* renamed from: a */
    private C2842a m8094a(C2842a aVar, C2854a aVar2, Context context, String str, String str2, String str3, boolean z) {
        final C2842a aVar3 = aVar;
        final boolean z2 = z;
        final Context context2 = context;
        final String str4 = str;
        final C2854a aVar4 = aVar2;
        final String str5 = str2;
        final String str6 = str3;
        C28394 r0 = new C2842a() {
            /* renamed from: a */
            public final void mo7477a(String str) {
                if (aVar3 != null) {
                    aVar3.mo7477a(str);
                }
            }

            /* renamed from: a */
            public final void mo7476a(C2845a aVar) {
                if (z2 || aVar.f8478a != 6) {
                    if (aVar3 != null) {
                        aVar3.mo7476a(aVar);
                    }
                    C2852b.m8147a("DecompressableSoLoader", aVar.toString());
                    return;
                }
                C2852b.m8150d("DecompressableSoLoader", "force retry!");
                C2835a.this.mo7474a(context2, str4, aVar4, str5, str6, aVar3, true);
            }

            /* renamed from: a */
            public final void mo7478a(String str, String str2) {
                if (aVar3 != null) {
                    aVar3.mo7478a(str, str2);
                }
            }
        };
        return r0;
    }
}
