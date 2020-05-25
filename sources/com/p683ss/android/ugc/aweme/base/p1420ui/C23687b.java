package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.os.Parcelable;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.PagerAdapter;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;

/* renamed from: com.ss.android.ugc.aweme.base.ui.b */
public abstract class C23687b extends PagerAdapter {

    /* renamed from: a */
    protected final C0654k f63176a;

    /* renamed from: b */
    protected C0679r f63177b;

    /* renamed from: c */
    private Fragment f63178c;

    /* renamed from: d */
    private SparseArray<String> f63179d = new SparseArray<>();

    /* renamed from: b */
    private static long mo69930b(int i) {
        return (long) i;
    }

    /* renamed from: a */
    public abstract Fragment mo49105a(int i);

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void startUpdate(ViewGroup viewGroup) {
    }

    public C23687b(C0654k kVar) {
        this.f63176a = kVar;
    }

    /* renamed from: c */
    private String m58140c(int i) {
        return String.valueOf(mo69930b(i));
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f63177b != null) {
            try {
                this.f63177b.mo2195c();
                this.f63177b = null;
                this.f63176a.mo2234b();
            } catch (IllegalStateException e) {
                StringBuilder sb = new StringBuilder("finishUpdate ->");
                sb.append(e);
                C32458a.m75141a(6, "FragmentPagerAdapter", sb.toString());
            }
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private String m58138a(int i, int i2) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(m58140c(i2));
        return sb.toString();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f63177b == null) {
            this.f63177b = this.f63176a.mo2225a();
        }
        String a = m58138a(viewGroup.getId(), i);
        Fragment a2 = this.f63176a.mo2224a(a);
        if (a2 != null) {
            this.f63177b.mo2199e(a2);
        } else {
            a2 = mo49105a(i);
            if (a2 == this.f63178c) {
                this.f63177b.mo2176a(viewGroup.getId(), a2, a);
                this.f63179d.put(i, a);
            }
        }
        if (a2 != this.f63178c) {
            a2.setMenuVisibility(false);
            a2.setUserVisibleHint(false);
        }
        return a2;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f63177b == null) {
            this.f63177b = this.f63176a.mo2225a();
        }
        this.f63177b.mo2197d((Fragment) obj);
        this.f63179d.remove(i);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        boolean z;
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f63178c) {
            boolean z2 = !TextUtils.equals(fragment.getTag(), (CharSequence) this.f63179d.get(i, ""));
            if (TextUtils.isEmpty(fragment.getTag()) || z2) {
                String a = m58138a(viewGroup.getId(), i);
                if (this.f63177b == null) {
                    this.f63177b = this.f63176a.mo2225a();
                }
                Fragment a2 = this.f63176a.mo2224a(a);
                if (a2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f63177b.mo2196c(a2);
                } else {
                    this.f63177b.mo2176a(viewGroup.getId(), fragment, a);
                }
                this.f63179d.put(i, a);
            }
            if (this.f63178c != null) {
                this.f63178c.setMenuVisibility(false);
                this.f63178c.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f63178c = fragment;
        }
    }
}
