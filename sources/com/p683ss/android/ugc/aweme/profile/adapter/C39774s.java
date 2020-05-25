package com.p683ss.android.ugc.aweme.profile.adapter;

import android.arch.lifecycle.C0184k;
import com.bytedance.jedi.ext.adapter.C11971g;
import com.bytedance.jedi.ext.adapter.p747b.C11946b;
import com.bytedance.jedi.ext.adapter.p747b.C11954g;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import com.bytedance.jedi.ext.adapter.p747b.C11959h.C11960a;
import com.p683ss.android.ugc.aweme.profile.model.MediaMixList;
import com.p683ss.android.ugc.aweme.profile.viewmodel.MediaMixListState;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.s */
public final class C39774s implements C11946b<MediaMixListViewHolder, C11954g<MediaMixListViewHolder>> {

    /* renamed from: a */
    public final C11971g<MediaMixListViewHolder> f101527a = new C11971g<>(this.f101528b);

    /* renamed from: b */
    public final C0184k f101528b;

    /* renamed from: com.ss.android.ugc.aweme.profile.adapter.s$a */
    static final class C39776a extends C52712l implements C52671b<MediaMixListState, MediaMixListState> {

        /* renamed from: a */
        final /* synthetic */ MediaMixList f101530a;

        C39776a(MediaMixList mediaMixList) {
            this.f101530a = mediaMixList;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MediaMixListState mediaMixListState = (MediaMixListState) obj;
            C52711k.m112240b(mediaMixListState, "$receiver");
            return MediaMixListState.copy$default(mediaMixListState, null, null, null, this.f101530a, null, 23, null);
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C11954g mo22686b() {
        return this.f101527a;
    }

    public C39774s(C0184k kVar) {
        C52711k.m112240b(kVar, "owner");
        this.f101528b = kVar;
        C11960a.m24344a((C11959h) this.f101527a, (C52671b) null, (C52682m) null, (C52671b) C397751.f101529a, 3, (Object) null);
    }
}
