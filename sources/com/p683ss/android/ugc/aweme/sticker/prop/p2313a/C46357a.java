package com.p683ss.android.ugc.aweme.sticker.prop.p2313a;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.prop.a.a */
public final class C46357a<T extends C23526a> extends C0677p {

    /* renamed from: a */
    private List<T> f116953a;

    /* renamed from: b */
    public final long mo2310b(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.f116953a.size();
    }

    /* renamed from: a */
    public final Fragment mo2309a(int i) {
        return (Fragment) this.f116953a.get(i);
    }

    public C46357a(C0654k kVar, List<T> list) {
        super(kVar);
        this.f116953a = list;
    }
}
