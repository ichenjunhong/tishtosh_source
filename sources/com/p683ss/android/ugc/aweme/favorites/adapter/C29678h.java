package com.p683ss.android.ugc.aweme.favorites.adapter;

import android.content.Context;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.C29721d;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.C29723f;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.C29740i;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40320dc;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40321dd;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.adapter.h */
public final class C29678h extends C40320dc {

    /* renamed from: k */
    private static final String f77572k;

    /* renamed from: a */
    public ArrayList<Fragment> f77573a = new ArrayList<>();

    /* renamed from: b */
    public List<Integer> f77574b = new ArrayList();

    /* renamed from: e */
    private Context f77575e;

    /* renamed from: f */
    private C29723f f77576f;

    /* renamed from: g */
    private C40266bq f77577g;

    /* renamed from: h */
    private C29721d f77578h;

    /* renamed from: i */
    private C29740i f77579i;

    /* renamed from: j */
    private C23526a f77580j;

    static {
        StringBuilder sb = new StringBuilder("android:switcher:");
        sb.append(R.id.ds2);
        sb.append(":");
        f77572k = sb.toString();
    }

    /* renamed from: c */
    public void mo59935c(int i) {
        for (int i2 = 0; i2 < getCount(); i2++) {
            if (mo2309a(i2) instanceof C40321dd) {
                C40321dd ddVar = (C40321dd) mo2309a(i2);
                if (!(ddVar == null || ddVar.getFragmentManager() == null)) {
                    if (i2 == i) {
                        ddVar.setUserVisibleHint(true);
                    } else {
                        ddVar.setUserVisibleHint(false);
                    }
                    ddVar.aX_();
                }
            }
        }
    }

    public final CharSequence getPageTitle(int i) {
        switch (((Integer) this.f77574b.get(i)).intValue()) {
            case 0:
            case 2:
                return this.f77575e.getString(R.string.bcd);
            case 1:
            case 3:
                return this.f77575e.getString(R.string.b6i);
            case 8:
                return this.f77575e.getString(R.string.a4g);
            case 9:
                return this.f77575e.getString(R.string.cq3);
            case 10:
                return this.f77575e.getString(R.string.a4_);
            case 11:
                return this.f77575e.getString(R.string.a4c);
            case 12:
                return this.f77575e.getString(R.string.b2d);
            case 16:
                return this.f77575e.getString(R.string.a47);
            case 17:
                return this.f77575e.getString(R.string.b6l);
            case 18:
                return this.f77575e.getString(R.string.eb);
            case 19:
                return this.f77575e.getString(R.string.b9n);
            case 21:
                return this.f77575e.getString(R.string.c5l);
            case 22:
                return this.f77575e.getString(R.string.c61);
            case 23:
                return "影视综";
            default:
                return "";
        }
    }

    public C29678h(C0654k kVar, Context context, String str, ArrayList<String> arrayList) {
        super(kVar);
        this.f77575e = context;
        StringBuilder sb = new StringBuilder();
        sb.append(f77572k);
        sb.append(0);
        this.f77577g = (C40266bq) kVar.mo2224a(sb.toString());
        if (this.f77577g == null) {
            this.f77577g = C40733z.f103767a.newBasicAwemeListFragment((int) this.f77575e.getResources().getDimension(R.dimen.a14), 4, C20854a.m53167g().getCurUserId(), C20854a.m53167g().getCurSecUserId(), false, true);
        }
        this.f77577g.mo82507e(true);
        this.f77577g.mo82505d(true);
        this.f77577g.mo82506e("collection");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f77572k);
        sb2.append(3);
        this.f77578h = (C29721d) kVar.mo2224a(sb2.toString());
        if (this.f77578h == null) {
            this.f77578h = new C29721d();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(f77572k);
        sb3.append(4);
        this.f77579i = (C29740i) kVar.mo2224a(sb3.toString());
        if (this.f77579i == null) {
            this.f77579i = new C29740i();
        }
        this.f77573a.add((Fragment) this.f77577g);
        this.f77574b.add(Integer.valueOf(8));
        if (C23794bh.m58395i().mo76335b()) {
            if (this.f77576f == null) {
                this.f77576f = new C29723f();
                this.f77576f.setArguments(C47661ab.m103163a().mo94972a("enter_from", str).mo94971a("mix_push_ids", (Serializable) arrayList).f120139a);
            }
            this.f77573a.add(this.f77576f);
            this.f77574b.add(Integer.valueOf(21));
        }
        this.f77573a.add(this.f77578h);
        this.f77573a.add(this.f77579i);
        this.f77574b.add(Integer.valueOf(10));
        this.f77574b.add(Integer.valueOf(11));
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().showStickerCollection()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(f77572k);
            sb4.append(5);
            this.f77580j = (C23526a) kVar.mo2224a(sb4.toString());
            if (this.f77580j == null) {
                this.f77580j = C23794bh.m58404r().mo92588b();
            }
            this.f77573a.add(this.f77580j);
            this.f77574b.add(Integer.valueOf(16));
        }
        ArrayList<Fragment> arrayList2 = this.f77573a;
        List<Integer> list = this.f77574b;
        this.f102922c = arrayList2;
        this.f102923d = list;
    }
}
