package com.bytedance.android.livesdk.rank;

import android.os.SystemClock;
import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.rank.model.C8214a;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.rank.l */
public final class C8212l {

    /* renamed from: a */
    public static long f22405a = 0;

    /* renamed from: b */
    public static long f22406b = 0;

    /* renamed from: c */
    public static long f22407c = 0;

    /* renamed from: d */
    public static long f22408d = 0;

    /* renamed from: e */
    private static int f22409e = 0;

    /* renamed from: f */
    private static int f22410f = 0;

    /* renamed from: g */
    private static int f22411g = 0;

    /* renamed from: h */
    private static int f22412h = 1;

    /* renamed from: a */
    private static String m16281a(int i) {
        if (i == -1) {
            return "ttlive_watermelon_rank_api";
        }
        if (i == 7 || i == 9) {
            return "ttlive_week_rank_api";
        }
        if (i != 12) {
            switch (i) {
                case 16:
                    break;
                case 17:
                case 18:
                    return "ttlive_current_rank_api";
                default:
                    return "";
            }
        }
        return "ttlive_hour_rank_api";
    }

    /* renamed from: a */
    private static String m16282a(String str) {
        return C3836d.m9734a(str);
    }

    /* renamed from: b */
    private static String m16288b(String str) {
        return C3836d.m9735b(str);
    }

    /* renamed from: a */
    private static int m16280a(C4175b bVar) {
        if (bVar == null) {
            return 0;
        }
        if (bVar.data instanceof C8214a) {
            C8214a aVar = (C8214a) bVar.data;
            if (aVar.f22413a != null) {
                return aVar.f22413a.size();
            }
            return 0;
        } else if (!(bVar.data instanceof CurrentRankListResponse)) {
            return 0;
        } else {
            CurrentRankListResponse currentRankListResponse = (CurrentRankListResponse) bVar.data;
            if (currentRankListResponse.ranks != null) {
                return currentRankListResponse.ranks.size();
            }
            return 0;
        }
    }

    /* renamed from: a */
    public static void m16284a(int i, C4175b bVar) {
        m16285a(i, bVar, -1);
    }

    /* renamed from: a */
    public static void m16286a(int i, Throwable th) {
        m16287a(i, th, -1);
    }

    /* renamed from: a */
    public static void m16283a(int i, int i2) {
        if (i2 == 17) {
            f22409e = i + i2;
            f22405a = SystemClock.uptimeMillis();
        }
        if (i2 == 7) {
            f22410f = i + i2;
            f22406b = SystemClock.uptimeMillis();
        }
        if (i2 == -1) {
            f22411g = i + i2;
            f22407c = SystemClock.uptimeMillis();
        }
    }

    /* renamed from: a */
    public static void m16285a(int i, C4175b bVar, int i2) {
        HashMap hashMap = new HashMap();
        hashMap.put("rank_type", Integer.valueOf(i));
        hashMap.put("rank_numbers", Integer.valueOf(m16280a(bVar)));
        if (i == 12) {
            hashMap.put("rank_hour_info", Integer.valueOf(i2));
            if (i2 == 1 && bVar != null && (bVar.data instanceof C8214a)) {
                hashMap.put("rank_hour_hide", Boolean.valueOf(((C8214a) bVar.data).f22423k));
            }
        }
        if (bVar != null) {
            hashMap.put("error_code", Integer.valueOf(bVar.statusCode));
        }
        C3837e.m9743a(m16282a(m16281a(i)), 0, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m16287a(int i, Throwable th, int i2) {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "error_msg";
        if (th != null) {
            str = th.getMessage();
        } else {
            str = "";
        }
        hashMap.put(str2, str);
        if (th instanceof C2949a) {
            hashMap.put("error_code", Integer.valueOf(((C2949a) th).getErrorCode()));
        }
        if (i == 12) {
            hashMap.put("rank_hour_info", Integer.valueOf(i2));
        }
        C3837e.m9743a(m16282a(m16281a(i)), 1, (Map<String, Object>) hashMap);
        C3837e.m9743a(m16288b(m16281a(i)), 1, (Map<String, Object>) hashMap);
    }
}
