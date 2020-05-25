package com.p683ss.android.ugc.aweme.base.widget.recyclerview.p1425a;

import com.p683ss.android.ugc.aweme.base.mvvm.C23562e;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.a.a */
public final class C23757a {

    /* renamed from: a */
    public final List<C23562e> f63332a;

    /* renamed from: b */
    public C23758b f63333b;

    /* renamed from: c */
    public boolean f63334c = true;

    /* renamed from: d */
    public C23562e f63335d;

    /* renamed from: e */
    private C23562e f63336e;

    /* renamed from: c */
    private C23562e m58294c() {
        if (this.f63336e == null) {
            this.f63336e = this.f63333b.mo49215b();
        }
        return this.f63336e;
    }

    /* renamed from: a */
    public C23562e mo49212a() {
        if (this.f63335d == null) {
            this.f63335d = this.f63333b.mo49214a();
        }
        return this.f63335d;
    }

    /* renamed from: b */
    public void mo49213b() {
        if (m58294c() != null) {
            int indexOf = this.f63332a.indexOf(m58294c());
            if (indexOf != -1) {
                this.f63332a.remove(indexOf);
                this.f63333b.notifyItemRemoved(indexOf);
            }
            this.f63332a.add(m58294c());
            this.f63333b.notifyItemInserted(this.f63332a.size() - 1);
        }
    }

    public C23757a(List<C23562e> list, C23758b bVar) {
        this.f63332a = list;
        this.f63333b = bVar;
    }
}
