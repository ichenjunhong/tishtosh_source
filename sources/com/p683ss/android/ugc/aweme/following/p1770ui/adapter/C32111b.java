package com.p683ss.android.ugc.aweme.following.p1770ui.adapter;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.friends.adapter.C32540o;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.following.ui.adapter.b */
public final class C32111b extends C0677p {

    /* renamed from: a */
    public final C0654k f83789a;

    /* renamed from: b */
    public final List<Fragment> f83790b;

    /* renamed from: c */
    public final List<String> f83791c;

    public final int getCount() {
        return this.f83790b.size();
    }

    /* renamed from: a */
    public final Fragment mo2309a(int i) {
        return (Fragment) this.f83790b.get(i);
    }

    public final CharSequence getPageTitle(int i) {
        return (CharSequence) this.f83791c.get(i);
    }

    /* renamed from: c */
    public final void mo65297c(int i) {
        boolean z;
        int i2 = 0;
        for (Object next : this.f83790b) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C52575l.m112100b();
            }
            Fragment fragment = (Fragment) next;
            if (fragment instanceof C32540o) {
                C32540o oVar = (C32540o) fragment;
                if (i2 != i) {
                    z = true;
                } else {
                    z = false;
                }
                oVar.mo65254a(z);
            }
            i2 = i3;
        }
    }

    public C32111b(C0654k kVar, List<Fragment> list, List<String> list2) {
        C52711k.m112240b(kVar, "fm");
        C52711k.m112240b(list, "fragments");
        C52711k.m112240b(list2, "fragmentTitles");
        super(kVar);
        this.f83789a = kVar;
        this.f83790b = list;
        this.f83791c = list2;
    }
}
