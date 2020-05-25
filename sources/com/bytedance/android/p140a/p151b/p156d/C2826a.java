package com.bytedance.android.p140a.p151b.p156d;

import com.bytedance.android.p140a.p141a.p146e.C2788b;
import com.bytedance.android.p140a.p151b.C2806a;
import com.bytedance.android.p140a.p151b.p156d.p157a.C2827a;
import com.bytedance.android.p140a.p151b.p156d.p158b.C2829a;
import com.bytedance.android.p140a.p151b.p156d.p159c.C2830a;
import java.util.List;

/* renamed from: com.bytedance.android.a.b.d.a */
public final class C2826a implements C2828b {

    /* renamed from: a */
    private C2806a f8432a;

    /* renamed from: b */
    private int f8433b;

    /* renamed from: c */
    private C2828b f8434c = m8026b(this.f8433b);

    /* renamed from: b */
    public final List<C2788b> mo7423b() {
        return this.f8434c.mo7423b();
    }

    /* renamed from: c */
    public final List<C2788b> mo7425c() {
        return this.f8434c.mo7425c();
    }

    /* renamed from: d */
    public final void mo7427d() {
        this.f8434c.mo7427d();
    }

    /* renamed from: a */
    public final void mo7420a() {
        this.f8434c.mo7420a();
    }

    /* renamed from: a */
    public final List<C2788b> mo7419a(List<C2788b> list) {
        return this.f8434c.mo7419a(list);
    }

    /* renamed from: b */
    public final void mo7424b(C2788b bVar) {
        this.f8434c.mo7424b(bVar);
    }

    /* renamed from: c */
    public final void mo7426c(C2788b bVar) {
        this.f8434c.mo7426c(bVar);
    }

    public C2826a(C2806a aVar) {
        this.f8432a = aVar;
        this.f8433b = aVar.f8390a.f8424d;
    }

    /* renamed from: a */
    public final boolean mo7422a(C2788b bVar) {
        return this.f8434c.mo7422a(bVar);
    }

    /* renamed from: b */
    private static C2828b m8026b(int i) {
        switch (i) {
            case 0:
                return new C2830a();
            case 1:
                return new C2827a();
            case 2:
                return new C2829a();
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo7421a(int i) {
        if (i != this.f8433b || this.f8434c == null) {
            C2828b b = m8026b(i);
            if (b != null) {
                C2828b bVar = this.f8434c;
                List list = null;
                if (bVar != null) {
                    list = bVar.mo7423b();
                    bVar.mo7420a();
                    bVar.mo7427d();
                }
                this.f8434c = b;
                if (list != null) {
                    this.f8434c.mo7419a(list);
                }
            }
        }
    }
}
