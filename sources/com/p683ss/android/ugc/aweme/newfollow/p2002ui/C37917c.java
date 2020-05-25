package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.familiar.p1700b.C29642a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.c */
public final class C37917c extends C0677p {

    /* renamed from: a */
    private ArrayList<Fragment> f96563a = new ArrayList<>();

    public final int getCount() {
        return this.f96563a.size();
    }

    /* renamed from: a */
    public final Fragment mo2309a(int i) {
        return (Fragment) this.f96563a.get(i);
    }

    public final CharSequence getPageTitle(int i) {
        if (i == 0) {
            return AwemeApplication.m56199a().getString(R.string.b6s);
        }
        if (i == 1) {
            return C29642a.m69690a(R.string.b6t, R.string.ggk, R.string.ggl);
        }
        return "";
    }

    public C37917c(C0654k kVar, ArrayList<Fragment> arrayList) {
        super(kVar);
        this.f96563a = arrayList;
    }
}
