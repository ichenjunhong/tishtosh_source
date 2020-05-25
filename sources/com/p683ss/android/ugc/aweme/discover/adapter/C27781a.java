package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.discover.abtest.LazyViewPagerExperiment;
import com.p683ss.android.ugc.aweme.lego.p1913a.C35880a.C35881a;
import com.p683ss.android.ugc.aweme.lego.p1913a.C35882b;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.a */
public abstract class C27781a extends C35882b<Fragment> {

    /* renamed from: a */
    private final C0654k f73010a;

    /* renamed from: d */
    private C0679r f73011d;

    /* renamed from: e */
    private boolean f73012e = C10181b.m20511a().mo18172a(LazyViewPagerExperiment.class, true, "is_lazy_viewpager", 31744, true);

    /* renamed from: b */
    private static long mo56345b(int i) {
        return (long) i;
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public final boolean mo56226a(int i) {
        if (!this.f73012e || !super.mo56226a(i)) {
            return false;
        }
        return true;
    }

    public C27781a(C0654k kVar) {
        this.f73010a = kVar;
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f73011d != null) {
            this.f73011d.mo2195c();
            this.f73011d = null;
            this.f73010a.mo2234b();
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m66524a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    /* renamed from: a */
    public final Fragment mo56227b(ViewGroup viewGroup, int i) {
        if (!this.f73012e) {
            return null;
        }
        Fragment fragment = (Fragment) this.f92088b.get(i);
        if (fragment == null) {
            return null;
        }
        String a = m66524a(viewGroup.getId(), mo56345b(i));
        if (this.f73010a.mo2224a(a) == null) {
            if (this.f73011d == null) {
                this.f73011d = this.f73010a.mo2225a();
            }
            this.f73011d.mo2176a(viewGroup.getId(), fragment, a);
            this.f92088b.remove(i);
        }
        return fragment;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f73011d == null) {
            this.f73011d = this.f73010a.mo2225a();
        }
        String a = m66524a(viewGroup.getId(), mo56345b(i));
        Fragment a2 = this.f73010a.mo2224a(a);
        if (a2 != null) {
            this.f73011d.mo2199e(a2);
        } else {
            a2 = (Fragment) mo56346c(viewGroup, i);
            if (!this.f73012e || !(a2 instanceof C35881a)) {
                this.f73011d.mo2176a(viewGroup.getId(), a2, a);
            } else {
                this.f92088b.put(i, a2);
            }
        }
        if (a2 != this.f92089c) {
            a2.setMenuVisibility(false);
            a2.setUserVisibleHint(false);
        }
        return a2;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f73011d == null) {
            this.f73011d = this.f73010a.mo2225a();
        }
        String a = m66524a(viewGroup.getId(), mo56345b(i));
        if (!this.f73012e || this.f73010a.mo2224a(a) == null) {
            this.f73011d.mo2197d((Fragment) obj);
        } else {
            this.f92088b.remove(i);
        }
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        if (mo56226a(i)) {
            startUpdate(viewGroup);
            mo56227b(viewGroup, i);
            finishUpdate(viewGroup);
        }
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f92089c) {
            if (this.f92089c != null) {
                ((Fragment) this.f92089c).setMenuVisibility(false);
                ((Fragment) this.f92089c).setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f92089c = fragment;
        }
    }
}
