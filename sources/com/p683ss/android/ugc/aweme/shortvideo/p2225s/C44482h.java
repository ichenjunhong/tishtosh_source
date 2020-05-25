package com.p683ss.android.ugc.aweme.shortvideo.p2225s;

import android.content.Context;
import android.os.Build.VERSION;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.settings.EnablePrePublishWhenMemoryGetFailed;
import com.p683ss.android.ugc.aweme.settings.PrePublishMinApiLevel1;
import com.p683ss.android.ugc.aweme.settings.PrePublishMinAvailableMemoryMBLevel1;
import com.p683ss.android.ugc.aweme.settings.PrePublishMinJvmAvailableMemoryMBLevel1;
import com.p683ss.android.ugc.aweme.settings.PrePublishMinTotalMemoryMBLevel1;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45380af;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47699ax;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.s.h */
public final class C44482h {
    /* renamed from: a */
    public static final int m97315a(int i) {
        return m97316a(i, (Integer) null);
    }

    /* renamed from: a */
    public static final int m97314a() {
        return (int) ((Runtime.getRuntime().maxMemory() / 1024) / 1024);
    }

    /* renamed from: b */
    public static final int m97321b() {
        return m97314a() - m97323c();
    }

    /* renamed from: d */
    private static final int m97324d() {
        C45380af a = C45380af.m98935a();
        C52711k.m112236a((Object) a, "MemoryUtil.getInstance()");
        return (int) (a.f114756f / 1024);
    }

    /* renamed from: c */
    private static final int m97323c() {
        return (int) (((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024) / 1024);
    }

    /* renamed from: a */
    public static final int m97318a(Context context) {
        C52711k.m112240b(context, "context");
        return (int) ((C47699ax.m103233a(context) / 1024) / 1024);
    }

    /* renamed from: b */
    private static final boolean m97322b(Context context) {
        C44506s a = m97320a(context, C10193n.m20607a().mo18200a(PrePublishMinApiLevel1.class, "pre_publish_min_api_level_1", C10181b.m20511a().mo18175c().getPrePublishMinApiLevel1(), -1), C10193n.m20607a().mo18200a(PrePublishMinTotalMemoryMBLevel1.class, "pre_publish_min_total_memory_mb_level_1", C10181b.m20511a().mo18175c().getPrePublishMinTotalMemoryMbLevel1(), 1600), C10193n.m20607a().mo18200a(PrePublishMinAvailableMemoryMBLevel1.class, "pre_publish_min_available_memory_mb_level_1", C10181b.m20511a().mo18175c().getPrePublishMinAvailableMemoryMbLevel1(), -1), C10193n.m20607a().mo18200a(PrePublishMinJvmAvailableMemoryMBLevel1.class, "pre_publish_min_jvm_available_memory_mb_level_1", C10181b.m20511a().mo18175c().getPrePublishMinJvmAvailableMemoryMbLevel1(), -1));
        StringBuilder sb = new StringBuilder("PreSyntheticMachinePerformanceLimitLevel1 ");
        sb.append(a.f112612b);
        C45407ay.m98968a(sb.toString());
        return a.f112611a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int m97316a(int i, Integer num) {
        int i2;
        if (num != null) {
            i2 = num.intValue();
        } else {
            i2 = m97324d();
        }
        return i - i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r4.mo74311a() != false) goto L_0x0069;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m97319a(android.content.Context r3, boolean r4) {
        /*
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            com.ss.android.ugc.aweme.property.h r0 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r1 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableMVThemePreUpload
            com.ss.android.ugc.aweme.property.aa$a r1 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r1
            boolean r0 = r0.mo83103a(r1)
            r1 = 0
            if (r0 != 0) goto L_0x0015
            if (r4 == 0) goto L_0x0015
            return r1
        L_0x0015:
            com.ss.android.ugc.aweme.property.h r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r0 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnableParallelSynthesizeUpload
            com.ss.android.ugc.aweme.property.aa$a r0 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r0
            boolean r4 = r4.mo83103a(r0)
            r0 = 1
            if (r4 == 0) goto L_0x006b
            com.ss.android.ugc.aweme.port.in.u r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.property.l r4 = r4.mo58574e()
            com.ss.android.ugc.aweme.property.l$a r2 = com.p683ss.android.ugc.aweme.property.C40795l.C40796a.EnablePreUpload
            boolean r4 = r4.mo83117a(r2)
            if (r4 == 0) goto L_0x0042
            com.ss.android.ugc.aweme.port.in.u r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.aa r4 = r4.mo58593x()
            boolean r4 = r4.mo74282b()
            if (r4 == 0) goto L_0x0042
            r4 = 1
            goto L_0x0043
        L_0x0042:
            r4 = 0
        L_0x0043:
            if (r4 == 0) goto L_0x004d
            boolean r4 = m97322b(r3)
            if (r4 != 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 == 0) goto L_0x006b
            boolean r4 = com.p683ss.android.ugc.aweme.framework.p1782c.C32462a.m75159a(r3)
            if (r4 != 0) goto L_0x0069
            boolean r4 = com.p683ss.android.ugc.aweme.framework.p1782c.C32462a.m75160b(r3)
            if (r4 == 0) goto L_0x006b
            com.ss.android.ugc.aweme.port.in.bc r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101179t
            java.lang.String r2 = "AVEnv.PUBLISH_SERVICE"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r2)
            boolean r4 = r4.mo74311a()
            if (r4 == 0) goto L_0x006b
        L_0x0069:
            r3 = 2
            return r3
        L_0x006b:
            com.ss.android.ugc.aweme.property.h r4 = com.p683ss.android.ugc.aweme.port.p2082in.C39618d.f101152P
            com.ss.android.ugc.aweme.property.h$a r2 = com.p683ss.android.ugc.aweme.property.C40789h.C40790a.EnablePreSynthetic
            com.ss.android.ugc.aweme.property.aa$a r2 = (com.p683ss.android.ugc.aweme.property.C40761aa.C40762a) r2
            boolean r4 = r4.mo83103a(r2)
            if (r4 == 0) goto L_0x007e
            boolean r3 = m97322b(r3)
            if (r3 == 0) goto L_0x007e
            return r0
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2225s.C44482h.m97319a(android.content.Context, boolean):int");
    }

    /* renamed from: a */
    public static final C44506s m97320a(Context context, int i, int i2, int i3, int i4) {
        int i5 = VERSION.SDK_INT;
        if (i <= 0 || i5 >= i) {
            boolean a = C10193n.m20607a().mo18204a(EnablePrePublishWhenMemoryGetFailed.class, "enable_pre_publish_when_memory_get_failed", C10181b.m20511a().mo18175c().getEnablePrePublishWhenMemoryGetFailed(), true);
            int a2 = m97318a(context);
            if (a2 > 0) {
                if (i2 > 0 && a2 < i2) {
                    StringBuilder sb = new StringBuilder("TotalMemory min:");
                    sb.append(i2);
                    sb.append(" current:");
                    sb.append(a2);
                    return new C44506s(true, sb.toString());
                }
            } else if (!a) {
                StringBuilder sb2 = new StringBuilder("TotalMemory invalid:");
                sb2.append(a2);
                return new C44506s(true, sb2.toString());
            }
            int d = m97324d();
            int a3 = m97316a(a2, Integer.valueOf(d));
            if (a2 <= 0 || d <= 0) {
                if (!a) {
                    StringBuilder sb3 = new StringBuilder("TotalAvailableMemoryMB invalid totalMemory:");
                    sb3.append(a2);
                    sb3.append(" totalUsedMemoryMB:");
                    sb3.append(d);
                    return new C44506s(true, sb3.toString());
                }
            } else if (i3 > 0 && a3 < i3) {
                StringBuilder sb4 = new StringBuilder("TotalAvailableMemoryMB min:");
                sb4.append(i3);
                sb4.append(" current:");
                sb4.append(a3);
                sb4.append(" totalMemory:");
                sb4.append(a2);
                sb4.append(" totalPss:");
                sb4.append(d);
                return new C44506s(true, sb4.toString());
            }
            int b = m97321b();
            if (b > 0) {
                if (i4 > 0 && b < i4) {
                    StringBuilder sb5 = new StringBuilder("JvmAvailableMemoryMB min:");
                    sb5.append(i4);
                    sb5.append(" current:");
                    sb5.append(b);
                    return new C44506s(true, sb5.toString());
                }
            } else if (!a) {
                StringBuilder sb6 = new StringBuilder("JvmAvailableMemoryMB invalid:");
                sb6.append(b);
                return new C44506s(true, sb6.toString());
            }
            return new C44506s(false, "allow");
        }
        StringBuilder sb7 = new StringBuilder("API min:");
        sb7.append(i);
        sb7.append(" current:");
        sb7.append(i5);
        return new C44506s(true, sb7.toString());
    }
}
