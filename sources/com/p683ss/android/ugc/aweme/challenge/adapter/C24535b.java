package com.p683ss.android.ugc.aweme.challenge.adapter;

import android.arch.lifecycle.C0184k;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.jedi.arch.C11796d;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.challenge.experiment.HashtagBiColAwemeListExperiment;
import com.p683ss.android.ugc.aweme.challenge.viewholder.BiColAwemeListCoverViewholder;
import com.p683ss.android.ugc.aweme.challenge.viewholder.BiColAwemeListVideoViewholder;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.playlist.p2057a.C38916a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2643g.C52733a;

/* renamed from: com.ss.android.ugc.aweme.challenge.adapter.b */
public final class C24535b extends C38916a {

    /* renamed from: c */
    public C24579d f64960c;

    /* renamed from: d */
    public String f64961d;

    /* renamed from: e */
    public String f64962e;

    /* renamed from: com.ss.android.ugc.aweme.challenge.adapter.b$a */
    static final class C24536a extends C52712l implements C52671b<ViewGroup, BiColAwemeListVideoViewholder<Aweme>> {

        /* renamed from: a */
        final /* synthetic */ C24535b f64963a;

        C24536a(C24535b bVar) {
            this.f64963a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b5b, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(it.c…icol_playlist, it, false)");
            BiColAwemeListVideoViewholder biColAwemeListVideoViewholder = new BiColAwemeListVideoViewholder(inflate, C52733a.m112277a(this.f64963a.mo78989l()), this.f64963a.f64960c, this.f64963a.f64961d, this.f64963a.f64962e);
            return biColAwemeListVideoViewholder;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.adapter.b$b */
    static final class C24537b extends C52712l implements C52671b<ViewGroup, BiColAwemeListCoverViewholder<Aweme>> {

        /* renamed from: a */
        final /* synthetic */ C24535b f64964a;

        C24537b(C24535b bVar) {
            this.f64964a = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ViewGroup viewGroup = (ViewGroup) obj;
            C52711k.m112240b(viewGroup, "it");
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b5b, viewGroup, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(it.c…icol_playlist, it, false)");
            return new BiColAwemeListCoverViewholder(inflate, C52733a.m112277a(this.f64964a.mo78989l()), this.f64964a.f64960c);
        }
    }

    /* renamed from: d */
    public final List<Aweme> mo48637d() {
        Iterable d = super.mo48637d();
        Collection arrayList = new ArrayList();
        for (Object next : d) {
            if (next instanceof Aweme) {
                arrayList.add(next);
            }
        }
        return (List) arrayList;
    }

    /* renamed from: a */
    public final int mo48641a(int i) {
        boolean z;
        int a = C10181b.m20511a().mo18168a(HashtagBiColAwemeListExperiment.class, true, "hashtag_detail_double_playlist", 31744, 0);
        if (a == 1 || a == 3 || a == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return 0;
        }
        int i2 = i % 4;
        if (i2 == 1 || i2 == 2) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo48639a(C11959h<JediViewHolder<? extends C11796d, ?>> hVar) {
        C52711k.m112240b(hVar, "registry");
        C11959h<JediViewHolder<? extends C11796d, ?>> hVar2 = hVar;
        hVar2.mo22697a(1, null, (C52671b<? super ViewGroup, ? extends VH>) new C24536a<Object,Object>(this));
        hVar2.mo22697a(0, null, (C52671b<? super ViewGroup, ? extends VH>) new C24537b<Object,Object>(this));
    }

    public C24535b(C0184k kVar, C24579d dVar, String str, String str2) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(str, "cid");
        C52711k.m112240b(str2, "processId");
        super(kVar, null);
        this.f64960c = dVar;
        this.f64961d = str;
        this.f64962e = str2;
    }
}
