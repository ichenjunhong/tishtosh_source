package com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.p1856e;

import android.view.View;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.choose.viewmodel.MediaChooseViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34413b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.e.a */
public final class C34473a extends C34477c {

    /* renamed from: b */
    public static final C34474a f88912b = new C34474a(null);

    /* renamed from: l */
    private final boolean f88913l = true;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.choose.e.a$a */
    public static final class C34474a {
        private C34474a() {
        }

        public /* synthetic */ C34474a(C52707g gVar) {
            this();
        }
    }

    public C34473a(View view, MediaChooseViewModel mediaChooseViewModel) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(mediaChooseViewModel, "viewModel");
        super(view, mediaChooseViewModel);
    }

    /* renamed from: a */
    public final void mo72500a(C34409a aVar, int i, int i2) {
        C52711k.m112240b(aVar, "data");
        if (aVar.isImage() || aVar.isGif()) {
            super.mo72500a(aVar, i, i2);
            C34413b.f88804a.mo72446a(mo72501e(), aVar, i, i2, this.f88913l);
        }
    }
}
