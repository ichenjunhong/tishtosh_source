package com.p683ss.android.ugc.aweme.tutorial;

import android.support.p030v4.app.C0678q;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47376c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tutorial.d */
public final class C47387d extends C0678q {

    /* renamed from: a */
    final List<C47376c> f119592a = new ArrayList();

    /* renamed from: b */
    final Map<Integer, Fragment> f119593b = new LinkedHashMap();

    /* renamed from: c */
    public final FragmentActivity f119594c;

    public final int getItemPosition(Object obj) {
        C52711k.m112240b(obj, "object");
        return -2;
    }

    public final int getCount() {
        return this.f119592a.size();
    }

    public final CharSequence getPageTitle(int i) {
        return ((C47376c) this.f119592a.get(i)).f119555a;
    }

    public final Fragment getItem(int i) {
        C47380b bVar = new C47380b();
        String str = ((C47376c) this.f119592a.get(i)).f119555a;
        int i2 = ((C47376c) this.f119592a.get(i)).f119556b;
        C52711k.m112240b(str, "categoryName");
        bVar.f119572d = str;
        bVar.f119573e = i2;
        this.f119593b.put(Integer.valueOf(i), bVar);
        return bVar;
    }

    public C47387d(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        super(fragmentActivity.getSupportFragmentManager());
        this.f119594c = fragmentActivity;
        List<C47376c> list = this.f119592a;
        String string = this.f119594c.getString(R.string.g1w);
        C52711k.m112236a((Object) string, "activity.getString(R.str…reation_tutorials_how_to)");
        list.add(new C47376c(string, 0));
        List<C47376c> list2 = this.f119592a;
        String string2 = this.f119594c.getString(R.string.g1x);
        C52711k.m112236a((Object) string2, "activity.getString(R.str…reation_tutorials_trends)");
        list2.add(new C47376c(string2, 1));
    }
}
