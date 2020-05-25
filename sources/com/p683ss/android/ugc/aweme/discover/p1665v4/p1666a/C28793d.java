package com.p683ss.android.ugc.aweme.discover.p1665v4.p1666a;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0678q;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverCategoryStructV4;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListDataCenter;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28836c;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28853d;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28872e;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.v4.a.d */
public final class C28793d extends C0678q {

    /* renamed from: a */
    public final Map<Integer, WeakReference<C28872e>> f75477a = new LinkedHashMap();

    /* renamed from: b */
    public final C0654k f75478b;

    /* renamed from: c */
    public List<DiscoverCategoryStructV4> f75479c;

    public final int getCount() {
        return this.f75479c.size();
    }

    public final CharSequence getPageTitle(int i) {
        return ((DiscoverCategoryStructV4) this.f75479c.get(i)).tabText;
    }

    public final Fragment getItem(int i) {
        if (!NewDiscoverV4Experiment.m69618b() || !TextUtils.equals(((DiscoverCategoryStructV4) this.f75479c.get(i)).tabName, DiscoverV4PlayListDataCenter.Companion.getTRENDING_PLAYLIST())) {
            C28853d dVar = new C28853d();
            Bundle bundle = new Bundle();
            bundle.putString("tabName", ((DiscoverCategoryStructV4) this.f75479c.get(i)).tabName);
            bundle.putString("tabText", ((DiscoverCategoryStructV4) this.f75479c.get(i)).tabText);
            dVar.setArguments(bundle);
            this.f75477a.put(Integer.valueOf(i), new WeakReference(dVar));
            return dVar;
        }
        C28836c cVar = new C28836c();
        this.f75477a.put(Integer.valueOf(i), new WeakReference(cVar));
        return cVar;
    }

    public final Object instantiateItem(View view, int i) {
        C52711k.m112240b(view, "container");
        Object instantiateItem = super.instantiateItem(view, i);
        C52711k.m112236a(instantiateItem, "super.instantiateItem(container, position)");
        return instantiateItem;
    }

    public C28793d(C0654k kVar, List<DiscoverCategoryStructV4> list) {
        C52711k.m112240b(kVar, "fm");
        C52711k.m112240b(list, "list");
        super(kVar);
        this.f75478b = kVar;
        this.f75479c = list;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C52711k.m112240b(viewGroup, "container");
        C52711k.m112240b(obj, "object");
        super.destroyItem(viewGroup, i, obj);
        WeakReference weakReference = (WeakReference) this.f75477a.get(Integer.valueOf(i));
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f75477a.remove(Integer.valueOf(i));
    }
}
