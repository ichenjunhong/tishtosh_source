package com.p683ss.android.ugc.effectmanager.common.p2433a;

import android.text.TextUtils;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48618b;
import com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a;
import com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48615b;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48671i;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.i */
public class C48604i extends C48618b implements C48615b {

    /* renamed from: b */
    private static C48604i f122187b;

    /* renamed from: f */
    private static String f122188f;

    /* renamed from: g */
    private static C48597e f122189g;

    /* renamed from: h */
    private static List<String> f122190h = Arrays.asList(new String[]{"52310", "42494", "22435", "52308", "22428", "29412", "23202", "85256", "51522", "51092", "45973", "40781"});

    /* renamed from: i */
    private static List<String> f122191i = Arrays.asList(new String[]{"52352", "42504", "50593", "249501", "22146", "166469", "221655", "234650", "240739", "203226"});

    /* renamed from: j */
    private static ArrayList<String> f122192j;

    /* renamed from: c */
    private C48608a f122193c;

    /* renamed from: d */
    private boolean f122194d = false;

    /* renamed from: e */
    private final int f122195e = 115343360;

    /* renamed from: k */
    private File f122196k;

    /* renamed from: c_ */
    public final String mo96154c_(String str) {
        return super.mo96154c_(str);
    }

    /* renamed from: e */
    private static boolean m105156e(String str) {
        if (TextUtils.isEmpty(str) || !str.equals(f122188f)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo96153c(String str) {
        try {
            this.f122193c.mo96174c(C48608a.m105182f(new File(str).getName()));
        } catch (Exception unused) {
        }
        return super.mo96153c(str);
    }

    /* renamed from: d */
    public final boolean mo96155d(String str) {
        if (this.f122193c.mo96178e(str)) {
            if (super.mo96155d(str)) {
                return true;
            }
            try {
                this.f122193c.mo96174c(str);
            } catch (IOException unused) {
            }
        }
        return false;
    }

    private C48604i(C48890g gVar) {
        super(gVar.f122964j.getAbsolutePath());
        try {
            this.f122196k = gVar.f122964j;
            this.f122193c = C48608a.m105177a(gVar.f122964j, 0, 1, 115343360, this);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static C48604i m105155a(C48890g gVar) {
        if (f122187b == null) {
            synchronized (C48604i.class) {
                if (f122187b == null) {
                    f122188f = gVar.f122965k;
                    f122192j = gVar.f122974t;
                    f122187b = new C48604i(gVar);
                    f122189g = new C48597e(gVar.f122964j);
                }
            }
        }
        return f122187b;
    }

    /* renamed from: a */
    public final void mo96163a(Effect effect) throws Exception {
        C48671i.f122310a.mo96258b(effect.getZipPath(), effect.getUnzipPath());
        this.f122193c.mo96177d(new File(effect.getUnzipPath()).getName());
        f122189g.mo96157a(effect.getId(), effect.getEffectId());
        String[] split = effect.getZipPath().split(File.separator);
        this.f122193c.mo96174c(split[split.length - 1]);
    }

    /* renamed from: a */
    public final boolean mo96162a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (m105156e("BR") && f122190h.contains(f122189g.mo96156a(str))) {
            return true;
        }
        if (m105156e("RU") && f122191i.contains(f122189g.mo96156a(str))) {
            return true;
        }
        if (f122192j == null || !f122192j.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final long mo96148a(String str, String str2) {
        return super.mo96148a(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9 A[SYNTHETIC, Splitter:B:47:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de A[Catch:{ IOException -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00e3 A[Catch:{ IOException -> 0x00e6 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo96164a(com.p683ss.android.ugc.effectmanager.effect.model.Effect r17, java.io.InputStream r18, long r19, com.p683ss.android.ugc.effectmanager.common.p2436c.C48625b r21) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r5 = r21
            java.lang.String r6 = r17.getId()
            java.lang.String r7 = r17.getEffectId()
            java.lang.String r8 = r17.getId()
            java.lang.String r8 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.m105182f(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.io.File r10 = r1.f122196k
            java.lang.String r10 = r10.getPath()
            r9.append(r10)
            java.lang.String r10 = java.io.File.separator
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r0.setUnzipPath(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = ".zip"
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.String r8 = com.p683ss.android.ugc.effectmanager.common.p2434b.p2435a.C48608a.m105182f(r8)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.io.File r10 = r1.f122196k
            java.lang.String r10 = r10.getPath()
            r9.append(r10)
            java.lang.String r10 = java.io.File.separator
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            r0.setZipPath(r9)
            r9 = 0
            com.ss.android.ugc.effectmanager.common.b.a.a r0 = r1.f122193c     // Catch:{ IOException -> 0x00cd, all -> 0x00c9 }
            com.ss.android.ugc.effectmanager.common.b.a.a$a r8 = r0.mo96171b(r8)     // Catch:{ IOException -> 0x00cd, all -> 0x00c9 }
            r0 = 0
            java.io.OutputStream r10 = r8.mo96181a(r0)     // Catch:{ IOException -> 0x00c5, all -> 0x00c2 }
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
            r11 = 0
            r13 = r11
        L_0x007c:
            int r15 = r2.read(r9)     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
            if (r15 <= 0) goto L_0x00a4
            r10.write(r9, r0, r15)     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
            long r0 = (long) r15     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
            long r13 = r13 + r0
            if (r5 == 0) goto L_0x00a0
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a0
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a0
            float r0 = (float) r13     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            float r1 = (float) r3     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
            float r0 = r0 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            int r0 = (int) r0     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
            r5.mo96205a(r0, r3)     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
        L_0x00a0:
            r0 = 0
            r1 = r16
            goto L_0x007c
        L_0x00a4:
            r10.close()     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
            com.ss.android.ugc.effectmanager.common.a.e r0 = f122189g     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
            r0.mo96157a(r6, r7)     // Catch:{ IOException -> 0x00c0, all -> 0x00be }
            if (r2 == 0) goto L_0x00b1
            r18.close()     // Catch:{ IOException -> 0x00bc }
        L_0x00b1:
            if (r10 == 0) goto L_0x00b6
            r10.close()     // Catch:{ IOException -> 0x00bc }
        L_0x00b6:
            if (r8 == 0) goto L_0x00bd
            r8.mo96182a()     // Catch:{ IOException -> 0x00bc }
            goto L_0x00bd
        L_0x00bc:
            return
        L_0x00bd:
            return
        L_0x00be:
            r0 = move-exception
            goto L_0x00d7
        L_0x00c0:
            r0 = move-exception
            goto L_0x00c7
        L_0x00c2:
            r0 = move-exception
            r10 = r9
            goto L_0x00d7
        L_0x00c5:
            r0 = move-exception
            r10 = r9
        L_0x00c7:
            r9 = r8
            goto L_0x00cf
        L_0x00c9:
            r0 = move-exception
            r8 = r9
            r10 = r8
            goto L_0x00d7
        L_0x00cd:
            r0 = move-exception
            r10 = r9
        L_0x00cf:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ all -> 0x00d5 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d5 }
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            r8 = r9
        L_0x00d7:
            if (r2 == 0) goto L_0x00dc
            r18.close()     // Catch:{ IOException -> 0x00e6 }
        L_0x00dc:
            if (r10 == 0) goto L_0x00e1
            r10.close()     // Catch:{ IOException -> 0x00e6 }
        L_0x00e1:
            if (r8 == 0) goto L_0x00e6
            r8.mo96182a()     // Catch:{ IOException -> 0x00e6 }
        L_0x00e6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.effectmanager.common.p2433a.C48604i.mo96164a(com.ss.android.ugc.effectmanager.effect.model.Effect, java.io.InputStream, long, com.ss.android.ugc.effectmanager.common.c.b):void");
    }
}
