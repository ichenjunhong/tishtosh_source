package com.p683ss.android.ugc.aweme.antiaddic.p1353a;

import com.p683ss.android.ugc.aweme.app.C23051bf;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.a.a */
public abstract class C22689a {

    /* renamed from: b */
    protected static int f60886b = 12;

    /* renamed from: a */
    protected int f60887a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C23051bf<Long> mo47077a();

    public C22689a() {
        this(5);
    }

    public C22689a(int i) {
        this.f60887a = i;
    }

    /* renamed from: a */
    public final void mo47078a(long j) {
        mo47077a().mo47776a(Long.valueOf(j));
    }

    /* renamed from: b */
    public final boolean mo47079b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        int i = instance.get(11);
        if (i >= 0 && i < this.f60887a) {
            instance.add(5, -1);
        }
        instance.set(11, this.f60887a);
        instance.set(12, 0);
        instance.set(13, 0);
        long timeInMillis = instance.getTimeInMillis();
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(instance.getTime());
        if (((Long) mo47077a().mo47782d()).longValue() < timeInMillis) {
            return true;
        }
        return false;
    }
}
