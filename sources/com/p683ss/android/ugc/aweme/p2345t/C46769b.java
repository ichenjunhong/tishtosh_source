package com.p683ss.android.ugc.aweme.p2345t;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39637s;
import com.p683ss.android.ugc.aweme.shortvideo.C42438az;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46054d;
import com.p683ss.android.ugc.aweme.utils.C47702b;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.t.b */
public final class C46769b implements C46054d {

    /* renamed from: a */
    public static C46770a f118124a;

    /* renamed from: b */
    public static String f118125b;

    /* renamed from: c */
    public static final C46769b f118126c = new C46769b();

    /* renamed from: com.ss.android.ugc.aweme.t.b$a */
    public static final class C46770a {

        /* renamed from: a */
        public final String f118127a;

        /* renamed from: b */
        public final String f118128b;

        /* renamed from: c */
        public final String f118129c;

        /* renamed from: d */
        public final long f118130d;

        public final boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C46770a) {
                    C46770a aVar = (C46770a) obj;
                    if (C52711k.m112239a((Object) this.f118127a, (Object) aVar.f118127a) && C52711k.m112239a((Object) this.f118128b, (Object) aVar.f118128b) && C52711k.m112239a((Object) this.f118129c, (Object) aVar.f118129c)) {
                        if (this.f118130d == aVar.f118130d) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f118127a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f118128b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f118129c;
            if (str3 != null) {
                i = str3.hashCode();
            }
            int i2 = (hashCode2 + i) * 31;
            long j = this.f118130d;
            return i2 + ((int) (j ^ (j >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EffectData(creationId=");
            sb.append(this.f118127a);
            sb.append(", shootWay=");
            sb.append(this.f118128b);
            sb.append(", propId=");
            sb.append(this.f118129c);
            sb.append(", startUseTime=");
            sb.append(this.f118130d);
            sb.append(")");
            return sb.toString();
        }

        public C46770a(String str, String str2, String str3, long j) {
            this.f118127a = str;
            this.f118128b = str2;
            this.f118129c = str3;
            this.f118130d = j;
        }
    }

    private C46769b() {
    }

    /* renamed from: a */
    public static void m101573a() {
        Long l;
        String str;
        String str2;
        String str3;
        if (f118124a != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C46770a aVar = f118124a;
            if (aVar != null) {
                l = Long.valueOf(aVar.f118130d);
            } else {
                l = null;
            }
            if (l == null) {
                C52711k.m112234a();
            }
            long longValue = elapsedRealtime - l.longValue();
            C47702b bVar = C47702b.f120193a;
            String str4 = "prop_click_time";
            C42438az a = C42438az.m93209a();
            String str5 = "creation_id";
            C46770a aVar2 = f118124a;
            if (aVar2 != null) {
                str = aVar2.f118127a;
            } else {
                str = null;
            }
            C42438az a2 = a.mo86526a(str5, str);
            String str6 = "shoot_way";
            C46770a aVar3 = f118124a;
            if (aVar3 != null) {
                str2 = aVar3.f118128b;
            } else {
                str2 = null;
            }
            C42438az a3 = a2.mo86526a(str6, str2).mo86526a("enter_from", "video_shoot_page");
            String str7 = "prop_id";
            C46770a aVar4 = f118124a;
            if (aVar4 != null) {
                str3 = aVar4.f118129c;
            } else {
                str3 = null;
            }
            bVar.mo94984a(str4, a3.mo86526a(str7, str3).mo86524a("duration", longValue).f107329a);
            f118124a = null;
            f118125b = null;
        }
    }

    /* renamed from: c */
    private static boolean m101574c(Effect effect) {
        if (effect != null && !TextUtils.isEmpty(effect.getAdRawData())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo92601a(Effect effect) {
        String str;
        if (m101574c(effect)) {
            C39637s v = C39629l.m88232a().mo58591v();
            String str2 = "camera_ad";
            String str3 = "click";
            String str4 = "sticker";
            if (effect != null) {
                str = effect.getAdRawData();
            } else {
                str = null;
            }
            v.mo74192a(str2, str3, str4, str, null);
        }
    }

    /* renamed from: b */
    public final void mo92602b(Effect effect) {
        String str;
        if (m101574c(effect)) {
            C39637s v = C39629l.m88232a().mo58591v();
            String str2 = "camera_ad";
            String str3 = "show";
            String str4 = "sticker";
            if (effect != null) {
                str = effect.getAdRawData();
            } else {
                str = null;
            }
            v.mo74192a(str2, str3, str4, str, null);
        }
    }
}
