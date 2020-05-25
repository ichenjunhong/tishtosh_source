package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.p2077b;

import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.adapter.C24540e;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24622b;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.DetailAwemeListFragment.C24623c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.location.C36282r;
import com.p683ss.android.ugc.aweme.location.C36285u.C36286a;
import com.p683ss.android.ugc.aweme.poi.C39065f.C39066a;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.C39104aj;
import com.p683ss.android.ugc.aweme.poi.utils.C39440a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.b.a */
public final class C39323a implements C24622b {

    /* renamed from: a */
    private final C39067g f100525a;

    public final void onJumpToDetail(String str) {
    }

    public C39323a(C39067g gVar) {
        this.f100525a = gVar;
    }

    public final C24623c getJumpToVideoParam(C24623c cVar, Aweme aweme) {
        C52711k.m112240b(cVar, "param");
        cVar.f65166a = "poi_multi_colums";
        cVar.f65167b = "poi_id";
        cVar.f65168c = "poi_page";
        return cVar;
    }

    public final C26876b<? extends C26875a<?, ?>> getPresenter(int i, FragmentActivity fragmentActivity) {
        String str;
        C26876b<? extends C26875a<?, ?>> bVar = new C26876b<>();
        C39104aj ajVar = new C39104aj();
        C39067g gVar = this.f100525a;
        String str2 = null;
        if (gVar != null) {
            str = gVar.getPoiId();
        } else {
            str = null;
        }
        ajVar.f99741b = str;
        C39067g gVar2 = this.f100525a;
        if (gVar2 != null) {
            str2 = gVar2.getBackendType();
        }
        ajVar.f99744e = str2;
        bVar.mo54799a(ajVar);
        return bVar;
    }

    public final boolean sendCustomRequest(C26876b<? extends C26875a<?, ?>> bVar, int i) {
        String str;
        C39066a aVar = new C39066a();
        C39067g gVar = this.f100525a;
        String str2 = null;
        if (gVar != null) {
            str = gVar.getPoiId();
        } else {
            str = null;
        }
        C39066a a = aVar.mo79225a(str);
        C39067g gVar2 = this.f100525a;
        if (gVar2 != null) {
            str2 = gVar2.getAwemeId();
        }
        C39066a b = a.mo79231d(str2).mo79228b(3);
        C36282r a2 = C36286a.m81925a().mo75118a();
        if (a2 != null) {
            String[] a3 = C39440a.m87682a(a2);
            b.mo79229b(a3[0]).mo79230c(a3[1]);
        }
        if (bVar != null) {
            bVar.mo44934a_(Integer.valueOf(i), b.mo79227a());
        }
        return true;
    }

    public final C24540e onCreateDetailAwemeViewHolder(View view, String str, C24579d dVar) {
        return new C39324b(view, str, dVar);
    }
}
