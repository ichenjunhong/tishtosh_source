package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dc */
public class C40320dc<T extends C23526a> extends C0677p {

    /* renamed from: c */
    public List<T> f102922c;

    /* renamed from: d */
    public List<Integer> f102923d;

    public int getCount() {
        return this.f102922c.size();
    }

    public C40320dc(C0654k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    public final Fragment mo2309a(int i) {
        return (Fragment) this.f102922c.get(i);
    }

    /* renamed from: b */
    public final long mo2310b(int i) {
        return (long) ((Integer) this.f102923d.get(i)).intValue();
    }

    /* renamed from: d */
    public final int mo82578d(int i) {
        return ((Integer) this.f102923d.get(i)).intValue();
    }

    /* renamed from: e */
    public final int mo82579e(int i) {
        return this.f102923d.indexOf(Integer.valueOf(i));
    }

    /* renamed from: f */
    public final Fragment mo82580f(int i) {
        int indexOf = this.f102923d.indexOf(Integer.valueOf(0));
        if (indexOf < 0 || indexOf >= this.f102922c.size()) {
            return null;
        }
        return (Fragment) this.f102922c.get(indexOf);
    }

    public int getItemPosition(Object obj) {
        if (this.f102922c.contains(obj)) {
            return this.f102922c.indexOf(obj);
        }
        return -2;
    }

    public CharSequence getPageTitle(int i) {
        Integer num = (Integer) this.f102923d.get(i);
        if (this.f102922c.get(i) instanceof C40270br) {
            return ((C40270br) this.f102922c.get(i)).mo52133g();
        }
        int intValue = num.intValue();
        if (intValue == 16) {
            return C23723j.m58219b(R.string.a47);
        }
        if (intValue == 19) {
            return C23723j.m58219b(R.string.b9n);
        }
        switch (intValue) {
            case 0:
            case 2:
                if (this.f102922c.get(i) == null || !((C23526a) this.f102922c.get(i)).f62623N) {
                    return C23723j.m58219b(R.string.bcd);
                }
                return C23723j.m58219b(R.string.ab1);
            case 1:
                break;
            case 3:
                if (this.f102922c.get(i) != null && ((C23526a) this.f102922c.get(i)).f62623N) {
                    return C23723j.m58219b(R.string.ab1);
                }
            default:
                switch (intValue) {
                    case 8:
                        return C23723j.m58219b(R.string.a4g);
                    case 9:
                        return C23723j.m58219b(R.string.cq3);
                    case 10:
                        return C23723j.m58219b(R.string.a4_);
                    case 11:
                        return C23723j.m58219b(R.string.a4c);
                    case 12:
                        return C23723j.m58219b(R.string.b2d);
                    default:
                        switch (intValue) {
                            case 21:
                                return C23723j.m58219b(R.string.c5l);
                            case 22:
                                return C23723j.m58219b(R.string.c61);
                            default:
                                return "";
                        }
                }
        }
        return C23723j.m58219b(R.string.b6i);
    }

    public C40320dc(C0654k kVar, List<T> list, List<Integer> list2) {
        super(kVar);
        this.f102922c = list;
        this.f102923d = list2;
    }
}
