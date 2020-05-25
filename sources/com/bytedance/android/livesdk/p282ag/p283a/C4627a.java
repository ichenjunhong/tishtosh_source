package com.bytedance.android.livesdk.p282ag.p283a;

import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.ag.a.a */
public final class C4627a {
    /* renamed from: a */
    public static int m11090a(C3009i iVar) {
        if (iVar.getUserHonor() == null || iVar.getUserHonor().mo8159n() != 0) {
            return 0;
        }
        return 1;
    }

    /* renamed from: c */
    public static void m11095c(int i, long j, Map<String, Object> map) {
        C3837e.m9741a(C3836d.m9735b("ttlive_charge_package_from_google"), i, j, map);
    }

    /* renamed from: d */
    public static void m11096d(int i, long j, Map<String, Object> map) {
        C3837e.m9741a(C3836d.m9734a("ttlive_charge_order"), i, j, map);
    }

    /* renamed from: e */
    public static void m11097e(int i, long j, Map<String, Object> map) {
        C3837e.m9741a(C3836d.m9735b("ttlive_charge_order"), i, j, map);
    }

    /* renamed from: f */
    public static void m11098f(int i, long j, Map<String, Object> map) {
        C3837e.m9741a(C3836d.m9734a("ttlive_charge_current_diamond_status"), i, j, map);
    }

    /* renamed from: b */
    public static void m11094b(int i, long j, Map<String, Object> map) {
        C3837e.m9741a(C3836d.m9734a("ttlive_charge_package_from_google"), i, j, map);
    }

    /* renamed from: a */
    public static void m11092a(int i, long j, Map<String, Object> map) {
        C3837e.m9741a(C3836d.m9734a("ttlive_charge_package_list_status"), i, j, map);
    }

    /* renamed from: a */
    public static void m11091a(int i, int i2, long j, Map<String, Object> map) {
        C3837e.m9741a(C3836d.m9734a("ttlive_charge_pay_sequence"), i2 + i, j, map);
    }

    /* renamed from: b */
    public static void m11093b(int i, int i2, long j, Map<String, Object> map) {
        C3837e.m9741a(C3836d.m9735b("ttlive_charge_pay_sequence"), i2 + i, 0, map);
    }
}
