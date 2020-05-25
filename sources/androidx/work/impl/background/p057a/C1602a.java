package androidx.work.impl.background.p057a;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.TextUtils;
import androidx.work.C1543i.C1544a;
import androidx.work.impl.C1547a;
import androidx.work.impl.C1620c;
import androidx.work.impl.C1626f;
import androidx.work.impl.p053a.C1570c;
import androidx.work.impl.p053a.C1571d;
import androidx.work.impl.p056b.C1583g;
import com.C2240a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.a.a */
public final class C1602a implements C1547a, C1570c, C1620c {

    /* renamed from: a */
    private C1626f f5645a;

    /* renamed from: b */
    private C1571d f5646b;

    /* renamed from: c */
    private List<C1583g> f5647c = new ArrayList();

    /* renamed from: d */
    private boolean f5648d;

    /* renamed from: e */
    private final Object f5649e;

    /* renamed from: a */
    private void m5644a() {
        if (!this.f5648d) {
            this.f5645a.f5707f.mo5968a((C1547a) this);
            this.f5648d = true;
        }
    }

    /* renamed from: a */
    public final void mo6002a(String str) {
        m5644a();
        C2240a.m6772a("Cancelling work ID %s", new Object[]{str});
        this.f5645a.mo6028b(str);
    }

    /* renamed from: b */
    public final void mo5964b(List<String> list) {
        for (String str : list) {
            C2240a.m6772a("Constraints not met: Cancelling work ID %s", new Object[]{str});
            this.f5645a.mo6028b(str);
        }
    }

    /* renamed from: a */
    public final void mo5963a(List<String> list) {
        for (String str : list) {
            C2240a.m6772a("Constraints met: Scheduling work ID %s", new Object[]{str});
            this.f5645a.mo6026a(str);
        }
    }

    /* renamed from: a */
    public final void mo6003a(C1583g... gVarArr) {
        m5644a();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C1583g gVar : gVarArr) {
            if (gVar.f5603b == C1544a.ENQUEUED && !gVar.mo5982a() && gVar.f5608g == 0 && !gVar.mo5983b()) {
                if (!gVar.mo5985d()) {
                    this.f5645a.mo6026a(gVar.f5602a);
                } else if (VERSION.SDK_INT < 24 || !gVar.f5611j.mo5912a()) {
                    arrayList.add(gVar);
                    arrayList2.add(gVar.f5602a);
                }
            }
        }
        synchronized (this.f5649e) {
            if (!arrayList.isEmpty()) {
                C2240a.m6772a("Starting tracking for [%s]", new Object[]{TextUtils.join(",", arrayList2)});
                this.f5647c.addAll(arrayList);
                this.f5646b.mo5966a(this.f5647c);
            }
        }
    }

    public C1602a(Context context, C1626f fVar) {
        this.f5645a = fVar;
        this.f5646b = new C1571d(context, this);
        this.f5649e = new Object();
    }

    /* renamed from: a */
    public final void mo5939a(String str, boolean z) {
        synchronized (this.f5649e) {
            int size = this.f5647c.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (((C1583g) this.f5647c.get(i)).f5602a.equals(str)) {
                    C2240a.m6772a("Stopping tracking for %s", new Object[]{str});
                    this.f5647c.remove(i);
                    this.f5646b.mo5966a(this.f5647c);
                    break;
                } else {
                    i++;
                }
            }
        }
    }
}
