package com.p683ss.android.ugc.aweme.poi.search;

import android.content.Context;
import android.support.p030v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.poi.search.C39227a.C39230a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.search.r */
public final class C39248r extends PagerAdapter {

    /* renamed from: a */
    private List<C39227a> f100249a = new ArrayList();

    /* renamed from: b */
    private C39227a f100250b;

    /* renamed from: c */
    private C39227a f100251c;

    /* renamed from: d */
    private C39227a f100252d;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public final int getCount() {
        return this.f100249a.size();
    }

    /* renamed from: a */
    public final C39227a mo80004a(int i) {
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (C39227a) this.f100249a.get(i);
    }

    /* renamed from: a */
    public final void mo80005a(boolean z) {
        if (!C9376b.m18558a((Collection<T>) this.f100249a)) {
            for (C39227a notShowNoMyLocation : this.f100249a) {
                notShowNoMyLocation.setNotShowNoMyLocation(z);
            }
        }
    }

    public final CharSequence getPageTitle(int i) {
        switch (i) {
            case 0:
                return C23723j.m58219b(R.string.h2p);
            case 1:
                return C23723j.m58219b(R.string.csq);
            case 2:
                return C23723j.m58219b(R.string.csr);
            default:
                return "";
        }
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        viewGroup.addView((View) this.f100249a.get(i));
        return this.f100249a.get(i);
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public C39248r(Context context, String str, boolean z, C39230a aVar, boolean z2, boolean z3) {
        this.f100250b = new C39239j(context, str, z2, z3);
        this.f100249a.add(this.f100250b);
        if (z) {
            this.f100251c = new C39236g(context, str);
            this.f100249a.add(this.f100251c);
            this.f100252d = new C39237h(context, str);
            this.f100249a.add(this.f100252d);
        }
        for (C39227a hideImmListener : this.f100249a) {
            hideImmListener.setHideImmListener(aVar);
        }
    }
}
