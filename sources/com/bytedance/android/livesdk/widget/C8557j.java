package com.bytedance.android.livesdk.widget;

import android.os.Parcelable;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.bytedance.android.livesdk.widget.j */
public abstract class C8557j extends PagerAdapter {

    /* renamed from: a */
    private final C0654k f23477a;

    /* renamed from: b */
    private C0679r f23478b;

    /* renamed from: c */
    private Fragment f23479c;

    /* renamed from: a */
    public abstract Fragment mo14089a(int i);

    /* renamed from: c */
    public long mo14092c(int i) {
        return (long) i;
    }

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public C8557j(C0654k kVar) {
        this.f23477a = kVar;
    }

    public void finishUpdate(ViewGroup viewGroup) {
        if (this.f23478b != null) {
            try {
                this.f23478b.mo2200e();
                this.f23477a.mo2234b();
            } catch (IllegalStateException unused) {
            } catch (NullPointerException unused2) {
            } finally {
                this.f23478b = null;
            }
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            StringBuilder sb = new StringBuilder("ViewPager with adapter ");
            sb.append(this);
            sb.append(" requires a view id");
            throw new IllegalStateException(sb.toString());
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        if (((Fragment) obj).getView() == view) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static String m16899a(int i, long j) {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(i);
        sb.append(":");
        sb.append(j);
        return sb.toString();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        if (this.f23478b == null) {
            this.f23478b = this.f23477a.mo2225a();
        }
        long c = mo14092c(i);
        Fragment a = this.f23477a.mo2224a(m16899a(viewGroup.getId(), c));
        if (a != null) {
            this.f23478b.mo2199e(a);
        } else {
            a = mo14089a(i);
            this.f23478b.mo2176a(viewGroup.getId(), a, m16899a(viewGroup.getId(), c));
        }
        if (a != this.f23479c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (this.f23478b == null) {
            this.f23478b = this.f23477a.mo2225a();
        }
        this.f23478b.mo2177a((Fragment) obj);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (fragment != this.f23479c) {
            if (this.f23479c != null) {
                this.f23479c.setMenuVisibility(false);
                this.f23479c.setUserVisibleHint(false);
            }
            if (fragment != null) {
                fragment.setMenuVisibility(true);
                fragment.setUserVisibleHint(true);
            }
            this.f23479c = fragment;
        }
    }
}
