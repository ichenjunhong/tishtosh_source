package com.p683ss.android.ugc.aweme.message.p1948a;

import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0677p;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.message.a.a */
public final class C36777a extends C0677p {

    /* renamed from: a */
    public List<Fragment> f93991a = new ArrayList();

    /* renamed from: b */
    private boolean f93992b;

    public final int getCount() {
        if (this.f93992b) {
            return 2;
        }
        return 1;
    }

    /* renamed from: b */
    public final long mo2310b(int i) {
        if (!this.f93992b || i != 0) {
            return 1;
        }
        return 0;
    }

    /* renamed from: c */
    public final Fragment mo75926c(int i) {
        if (i < this.f93991a.size()) {
            return (Fragment) this.f93991a.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public final Fragment mo2309a(int i) {
        Fragment fragment;
        if (!this.f93992b) {
            fragment = C38046d.m85104d().mo77567a();
        } else if (i != 0) {
            fragment = C38046d.m85104d().mo77567a();
        } else {
            fragment = C33194e.m76279d().getRelationSelectFragment().mo72686f();
        }
        this.f93991a.add(fragment);
        return fragment;
    }

    public C36777a(C0654k kVar, boolean z) {
        super(kVar);
        this.f93992b = z;
    }
}
