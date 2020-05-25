package com.p683ss.android.ugc.aweme.photo.setfilter;

import android.support.p043v7.widget.RecyclerView;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31499l;
import com.p683ss.android.ugc.aweme.filter.view.internal.C31634f;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.C31669d;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.C31684g;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.FilterListViewSelectionViewModel;
import com.p683ss.android.ugc.aweme.filter.view.internal.main.FilterListViewStateViewModel;
import com.p683ss.android.ugc.aweme.filter.view.internal.p1751a.C31620a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout;
import p064c.p065a.p071d.C1707b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p072e.p074b.C1723a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.a */
final /* synthetic */ class C38709a implements C1707b {

    /* renamed from: a */
    private final EffectPhotoSetFilterActivity f98480a;

    /* renamed from: b */
    private final C31499l f98481b;

    /* renamed from: c */
    private final C31634f f98482c;

    C38709a(EffectPhotoSetFilterActivity effectPhotoSetFilterActivity, C31499l lVar, C31634f fVar) {
        this.f98480a = effectPhotoSetFilterActivity;
        this.f98481b = lVar;
        this.f98482c = fVar;
    }

    /* renamed from: a */
    public final Object mo6200a(Object obj, Object obj2) {
        C31669d dVar;
        EffectPhotoSetFilterActivity effectPhotoSetFilterActivity = this.f98480a;
        C31499l lVar = this.f98481b;
        C31634f fVar = this.f98482c;
        TabLayout tabLayout = (TabLayout) obj;
        RecyclerView recyclerView = (RecyclerView) obj2;
        if (effectPhotoSetFilterActivity.f98460e) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C52711k.m112240b(effectPhotoSetFilterActivity, "lifecycleOwner");
            C52711k.m112240b(lVar, "repository");
            dVar = new C31669d(recyclerView, effectPhotoSetFilterActivity, new FilterListViewSelectionViewModel(effectPhotoSetFilterActivity, lVar, fVar), new FilterListViewStateViewModel(effectPhotoSetFilterActivity, lVar), null, 16, null);
        } else {
            dVar = new C31620a(recyclerView, effectPhotoSetFilterActivity, lVar, fVar);
        }
        C31684g gVar = new C31684g(dVar, tabLayout, fVar);
        gVar.mo64502e().mo6505a((C1710e<? super T>) new C38715g<Object>(effectPhotoSetFilterActivity), C1723a.m6037b());
        return gVar;
    }
}
