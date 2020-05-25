package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.work.impl.C1620c;
import androidx.work.impl.p056b.C1583g;
import com.C2240a;

/* renamed from: androidx.work.impl.background.systemalarm.f */
public final class C1612f implements C1620c {

    /* renamed from: a */
    private final Context f5681a;

    public C1612f(Context context) {
        this.f5681a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void mo6002a(String str) {
        C1613g.m5678a(this.f5681a, C1604b.m5659c(this.f5681a, str));
    }

    /* renamed from: a */
    public final void mo6003a(C1583g... gVarArr) {
        for (C1583g gVar : gVarArr) {
            C2240a.m6772a("Scheduling work with workSpecId %s", new Object[]{gVar.f5602a});
            C1613g.m5678a(this.f5681a, C1604b.m5655a(this.f5681a, gVar.f5602a));
        }
    }
}
