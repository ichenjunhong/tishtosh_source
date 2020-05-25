package com.p683ss.android.ugc.aweme.discover.p1640c;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27903j.C27905b;
import com.p683ss.android.ugc.aweme.discover.adapter.DiscoverBannerViewHolder;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.c.a */
public final class C28068a extends C26835b<List<DiscoverItemData>> {

    /* renamed from: a */
    public boolean f73743a = true;

    /* renamed from: b */
    public C27905b f73744b;

    /* renamed from: c */
    private DiscoverBannerViewHolder f73745c;

    /* renamed from: b */
    public final void mo54758b(C1352v vVar) {
        ((DiscoverBannerViewHolder) vVar).mo56181a(false);
    }

    /* renamed from: a */
    public final void mo54756a(C1352v vVar) {
        if (this.f73743a) {
            ((DiscoverBannerViewHolder) vVar).mo56181a(true);
        }
    }

    /* renamed from: b */
    public final void mo56492b(boolean z) {
        if (!(this.f73743a == z || this.f73745c == null)) {
            this.f73745c.mo56182b(z);
        }
        this.f73743a = z;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bti, viewGroup, false);
        if (this.f73744b != null) {
            this.f73744b.mo56317a(inflate);
        }
        if (this.f73745c == null) {
            this.f73745c = new DiscoverBannerViewHolder(inflate);
        }
        return this.f73745c;
    }

    /* renamed from: a */
    public final void mo56491a(boolean z) {
        if (this.f73745c != null) {
            this.f73745c.mo56181a(z);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        if (((DiscoverItemData) ((List) obj).get(i)).getType() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        ((DiscoverBannerViewHolder) vVar).mo56180a(((DiscoverItemData) ((List) obj).get(i)).getBannerList(), true);
    }
}
