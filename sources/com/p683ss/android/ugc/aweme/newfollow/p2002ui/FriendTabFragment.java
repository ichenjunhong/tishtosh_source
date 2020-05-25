package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.discover.p1659ui.HotSearchAndDiscoveryFragment2;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment */
public class FriendTabFragment extends C23526a {

    /* renamed from: a */
    private ArrayList<Fragment> f96511a = new ArrayList<>();
    ViewPager mViewPager;

    /* renamed from: a */
    public final C37915b mo77354a() {
        if (this.f96511a.size() == 0 || !(this.f96511a.get(0) instanceof C37915b)) {
            return null;
        }
        return (C37915b) this.f96511a.get(0);
    }

    /* renamed from: e */
    public final C27721d mo77355e() {
        if (this.f96511a.size() == 0 || !(this.f96511a.get(0) instanceof C27721d)) {
            return null;
        }
        return (C27721d) this.f96511a.get(0);
    }

    /* renamed from: f */
    public final HotSearchAndDiscoveryFragment2 mo77356f() {
        if (this.f96511a.size() == 0 || !(this.f96511a.get(0) instanceof HotSearchAndDiscoveryFragment2)) {
            return null;
        }
        return (HotSearchAndDiscoveryFragment2) this.f96511a.get(0);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        Iterator it = this.f96511a.iterator();
        while (it.hasNext()) {
            ((Fragment) it.next()).setUserVisibleHint(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f96511a.clear();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("i18n_tab_mode", Boolean.valueOf(true));
        C0654k childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.ds2);
        sb.append(":0");
        Fragment a = childFragmentManager.mo2224a(sb.toString());
        if (a == null) {
            a = new HotSearchAndDiscoveryFragment2();
            a.setArguments(bundle2);
        }
        this.f96511a.add(a);
        this.mViewPager.setAdapter(new C37917c(getChildFragmentManager(), this.f96511a));
        this.mViewPager.setOverScrollMode(2);
        this.mViewPager.setCurrentItem(0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.nt, viewGroup, false);
    }
}
