package com.p683ss.android.ugc.aweme.util;

import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.pendant.C38588b;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.util.u */
public final class C47641u {

    /* renamed from: c */
    public static final C47642a f120112c = new C47642a(null);

    /* renamed from: a */
    public final Keva f120113a;

    /* renamed from: b */
    public final String f120114b;

    /* renamed from: com.ss.android.ugc.aweme.util.u$a */
    public static final class C47642a {
        private C47642a() {
        }

        public /* synthetic */ C47642a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo94938a() {
        m103138a(m103141c());
    }

    /* renamed from: b */
    private final List<String> m103139b() {
        String[] stringArray = this.f120113a.getStringArray(this.f120114b, new String[0]);
        C52711k.m112236a((Object) stringArray, "getKeva().getStringArray(type, arrayOf())");
        return C52568f.m112085f(stringArray);
    }

    /* renamed from: c */
    private static long m103141c() {
        Calendar instance = Calendar.getInstance();
        C52711k.m112236a((Object) instance, "calendar");
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        return instance.getTimeInMillis();
    }

    public C47641u(String str) {
        C52711k.m112240b(str, "type");
        this.f120114b = str;
        Keva repo = Keva.getRepo("time_stamp_count_helper");
        C52711k.m112236a((Object) repo, "Keva.getRepo(KEVA_NAME)");
        this.f120113a = repo;
    }

    /* renamed from: a */
    public final int mo94937a(int i) {
        int i2;
        if (i <= 0) {
            i2 = 0;
        } else {
            i2 = i - 1;
        }
        return m103137a(i2, m103141c());
    }

    /* renamed from: a */
    private void m103138a(long j) {
        List<String> b = m103139b();
        b.add(String.valueOf(j));
        Keva keva = this.f120113a;
        String str = this.f120114b;
        String[] strArr = new String[b.size()];
        int i = 0;
        for (String str2 : b) {
            int i2 = i + 1;
            strArr[i] = str2;
            i = i2;
        }
        keva.storeStringArray(str, strArr);
    }

    /* renamed from: a */
    private final int m103137a(int i, long j) {
        return m103140b(i, j).size();
    }

    /* renamed from: b */
    private final List<String> m103140b(int i, long j) {
        List<String> b = m103139b();
        List<String> arrayList = new ArrayList<>();
        long j2 = j - ((long) (i * C38588b.f98133g));
        for (String d : b) {
            Long d2 = C52830p.m112396d(d);
            if (d2 != null && d2.longValue() >= j2) {
                arrayList.add(String.valueOf(d2.longValue()));
            }
        }
        return arrayList;
    }
}
