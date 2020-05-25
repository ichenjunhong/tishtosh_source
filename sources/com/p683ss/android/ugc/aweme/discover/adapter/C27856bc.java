package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.discover.model.SearchPoi;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.poi.C39054d;
import com.p683ss.android.ugc.aweme.search.C41428h;
import com.p683ss.android.ugc.aweme.search.p2122b.C41406a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bc */
public final class C27856bc extends C27818an<SearchPoi> {

    /* renamed from: h */
    private C39054d f73187h;

    /* renamed from: a */
    public final void mo50303a(List<SearchPoi> list) {
        this.f73084g.mo84080a();
        super.mo50303a(list);
    }

    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        C27857bd bdVar = new C27857bd(LayoutInflater.from(viewGroup.getContext()).inflate(C41428h.f105000a.getSearchPoiItemLayout(), viewGroup, false), this.f73187h, false);
        bdVar.mo56270a(this.f73082e);
        return bdVar;
    }

    /* renamed from: b */
    public final void mo49207b(C1352v vVar, int i) {
        C27857bd bdVar = (C27857bd) vVar;
        SearchPoi searchPoi = (SearchPoi) this.f70670n.get(i);
        String str = this.f73083f;
        if (!(searchPoi == null || searchPoi.poi == null)) {
            bdVar.f73190e = str;
            bdVar.f73189d = searchPoi;
            SimplePoiInfoStruct simplePoiInfoStruct = searchPoi.poi;
            simplePoiInfoStruct.setCost(ProfileUiInitOptimizeEnterThreshold.DEFAULT);
            simplePoiInfoStruct.setPosition(searchPoi.position);
            bdVar.f73192g.mo56196a(-1, simplePoiInfoStruct);
        }
        this.f73084g.mo84081a(i, mo48636c());
    }

    public C27856bc(Context context, C27797ad adVar, String str, C41406a aVar) {
        super(adVar, str, aVar);
        this.f73187h = C36272l.m81897a(context).mo75072a();
    }
}
