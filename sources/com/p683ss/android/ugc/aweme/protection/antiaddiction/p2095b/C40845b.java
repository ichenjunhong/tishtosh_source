package com.p683ss.android.ugc.aweme.protection.antiaddiction.p2095b;

import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40839a;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.C40849c;
import com.p683ss.android.ugc.aweme.protection.antiaddiction.p2094a.C40840a;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.protection.antiaddiction.b.b */
public final class C40845b extends C40839a {

    /* renamed from: a */
    public C40840a f103998a = new C40840a();

    /* renamed from: b */
    private int f103999b = 60000;

    /* renamed from: a */
    public final boolean mo83168a(long j, long j2) {
        boolean z;
        long j3 = j;
        C40840a aVar = this.f103998a;
        long b = C40840a.m90321b();
        if (b >= 0) {
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(j3);
            instance.set(11, aVar.f103988a);
            instance.set(12, aVar.f103989b);
            instance.set(13, 0);
            long timeInMillis = instance.getTimeInMillis();
            long longValue = ((Long) C40840a.m90320a().mo47782d()).longValue();
            Calendar instance2 = Calendar.getInstance();
            instance2.setTimeInMillis(longValue);
            new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(instance2.getTime());
            if (longValue < timeInMillis && j3 >= timeInMillis) {
                C40840a.m90320a().mo47776a(Long.valueOf(timeInMillis));
                aVar.f103990c = 0;
                longValue = timeInMillis;
            }
            if (j3 - longValue > b) {
                z = true;
                if (z && j2 > C40840a.m90321b() && C40840a.m90321b() > 0) {
                    C40840a aVar2 = this.f103998a;
                    C40840a.m90320a().mo47776a(Long.valueOf(System.currentTimeMillis()));
                    aVar2.f103990c++;
                    long b2 = (C40840a.m90321b() * ((long) this.f103998a.f103990c)) / ((long) this.f103999b);
                    C40849c.m90331a().f104003b = String.valueOf(b2);
                }
                return false;
            }
        }
        z = false;
        C40840a aVar22 = this.f103998a;
        C40840a.m90320a().mo47776a(Long.valueOf(System.currentTimeMillis()));
        aVar22.f103990c++;
        long b22 = (C40840a.m90321b() * ((long) this.f103998a.f103990c)) / ((long) this.f103999b);
        C40849c.m90331a().f104003b = String.valueOf(b22);
        return false;
    }
}
