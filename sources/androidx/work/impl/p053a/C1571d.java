package androidx.work.impl.p053a;

import android.content.Context;
import androidx.work.impl.p053a.p054a.C1549a;
import androidx.work.impl.p053a.p054a.C1550b;
import androidx.work.impl.p053a.p054a.C1551c;
import androidx.work.impl.p053a.p054a.C1551c.C1552a;
import androidx.work.impl.p053a.p054a.C1553d;
import androidx.work.impl.p053a.p054a.C1554e;
import androidx.work.impl.p053a.p054a.C1555f;
import androidx.work.impl.p053a.p054a.C1556g;
import androidx.work.impl.p053a.p054a.C1557h;
import androidx.work.impl.p056b.C1583g;
import com.C2240a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.a.d */
public final class C1571d implements C1552a {

    /* renamed from: a */
    private final C1570c f5574a;

    /* renamed from: b */
    private final C1551c[] f5575b;

    /* renamed from: c */
    private final Object f5576c = new Object();

    /* renamed from: a */
    public final void mo5965a() {
        C1551c[] cVarArr;
        synchronized (this.f5576c) {
            for (C1551c cVar : this.f5575b) {
                if (!cVar.f5550a.isEmpty()) {
                    cVar.f5550a.clear();
                    cVar.f5552c.mo5958b(cVar);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo5946c(List<String> list) {
        synchronized (this.f5576c) {
            if (this.f5574a != null) {
                this.f5574a.mo5964b(list);
            }
        }
    }

    /* renamed from: b */
    public final void mo5945b(List<String> list) {
        synchronized (this.f5576c) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (mo5967a(str)) {
                    C2240a.m6772a("Constraints met for %s", new Object[]{str});
                    arrayList.add(str);
                }
            }
            if (this.f5574a != null) {
                this.f5574a.mo5963a(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo5966a(List<C1583g> list) {
        synchronized (this.f5576c) {
            for (C1551c a : this.f5575b) {
                a.mo5943a((C1552a) null);
            }
            for (C1551c a2 : this.f5575b) {
                a2.mo5944a(list);
            }
            for (C1551c a3 : this.f5575b) {
                a3.mo5943a((C1552a) this);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo5967a(String str) {
        C1551c[] cVarArr;
        boolean z;
        synchronized (this.f5576c) {
            for (C1551c cVar : this.f5575b) {
                if (cVar.f5551b == null || !cVar.mo5942b(cVar.f5551b) || !cVar.f5550a.contains(str)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C2240a.m6772a("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()});
                    return false;
                }
            }
            return true;
        }
    }

    public C1571d(Context context, C1570c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5574a = cVar;
        this.f5575b = new C1551c[]{new C1549a(applicationContext), new C1550b(applicationContext), new C1557h(applicationContext), new C1553d(applicationContext), new C1556g(applicationContext), new C1555f(applicationContext), new C1554e(applicationContext)};
    }
}
