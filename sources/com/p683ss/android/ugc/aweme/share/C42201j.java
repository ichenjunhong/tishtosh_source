package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.C42318f;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42354e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.C42345e;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.MicroShareChannelBar;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.share.j */
public final class C42201j extends C41997d {

    /* renamed from: k */
    public final Activity f106720k;

    /* renamed from: com.ss.android.ugc.aweme.share.j$a */
    static final class C42202a extends C52712l implements C52671b<C42307b, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C42201j f106721a;

        C42202a(C42201j jVar) {
            this.f106721a = jVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C42307b bVar = (C42307b) obj;
            C52711k.m112240b(bVar, "it");
            return Boolean.valueOf(!bVar.mo86141a(this.f106721a.f106720k));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.j$b */
    public static final class C42203b implements C42345e {

        /* renamed from: a */
        final /* synthetic */ C42201j f106722a;

        C42203b(C42201j jVar) {
            this.f106722a = jVar;
        }

        /* renamed from: a */
        public final void mo66353a(C42307b bVar) {
            boolean z;
            C52711k.m112240b(bVar, "channel");
            SharePackage sharePackage = this.f106722a.f106301g.f106953i;
            Activity activity = this.f106722a.f106296b;
            C52711k.m112236a((Object) activity, "mContext");
            if (!sharePackage.mo85939a(bVar, (Context) activity)) {
                C42318f a = this.f106722a.f106301g.f106953i.mo73884a(bVar);
                Activity activity2 = this.f106722a.f106296b;
                C52711k.m112236a((Object) activity2, "mContext");
                z = bVar.mo49947a(a, (Context) activity2);
            } else {
                z = true;
            }
            C42354e eVar = this.f106722a.f106301g.f106956l;
            if (eVar != null) {
                SharePackage sharePackage2 = this.f106722a.f106301g.f106953i;
                Activity activity3 = this.f106722a.f106296b;
                C52711k.m112236a((Object) activity3, "mContext");
                eVar.mo49959a(bVar, z, sharePackage2, activity3);
            }
            this.f106722a.dismiss();
        }
    }

    public C42201j(Activity activity, C42348d dVar) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(dVar, "config");
        super(activity, dVar);
        this.f106720k = activity;
        if (this.f106301g.f106948d) {
            C52575l.m112110a((List) this.f106301g.f106945a, (C52671b) new C42202a(this));
        }
        MicroShareChannelBar microShareChannelBar = this.f106303i;
        List<C42307b> list = this.f106301g.f106945a;
        C52711k.m112240b(list, "channels");
        microShareChannelBar.f106911a = list;
        microShareChannelBar.f106913c.mo86255a(list);
        MicroShareChannelBar microShareChannelBar2 = this.f106303i;
        C42345e bVar = new C42203b(this);
        C52711k.m112240b(bVar, "listener");
        microShareChannelBar2.f106912b = bVar;
    }
}
