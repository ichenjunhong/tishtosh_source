package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2370d;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0678q;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.e */
public final class C47263e extends C0678q {

    /* renamed from: a */
    private List<C47259a> f119344a = new ArrayList();

    /* renamed from: b */
    private List<MvThemeData> f119345b = new ArrayList();

    public final int getCount() {
        return this.f119345b.size();
    }

    /* renamed from: b */
    public final void mo94537b(List<MvThemeData> list) {
        if (!C23715d.m58202a((Collection<T>) list)) {
            this.f119345b.addAll(list);
            notifyDataSetChanged();
        }
    }

    public C47263e(C0654k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    public final void mo94535a(List<MvThemeData> list) {
        if (!C23715d.m58202a((Collection<T>) list)) {
            this.f119345b.clear();
            this.f119345b.addAll(list);
            notifyDataSetChanged();
        }
    }

    /* renamed from: b */
    public final MvThemeData mo94536b(int i) {
        if (!C23715d.m58202a((Collection<T>) this.f119345b) && i >= 0 && i < this.f119345b.size()) {
            return (MvThemeData) this.f119345b.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final C47259a getItem(int i) {
        if (i < this.f119344a.size()) {
            return (C47259a) this.f119344a.get(i);
        }
        C47259a a = C47259a.m102595a((MvThemeData) this.f119345b.get(i), i);
        this.f119344a.add(a);
        return a;
    }
}
