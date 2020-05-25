package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1860d;

import android.view.View;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import com.ss.android.ugc.trill.R;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.c */
public final class C34527c extends C34524a {

    /* renamed from: e */
    public static final C34528a f89013e = new C34528a(null);

    /* renamed from: d */
    public RemoteImageView f89014d;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.c$a */
    public static final class C34528a {
        private C34528a() {
        }

        public /* synthetic */ C34528a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.c$b */
    static final class C34529b extends C52712l implements C52671b<C34409a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34527c f89015a;

        /* renamed from: b */
        final /* synthetic */ C34409a f89016b;

        C34529b(C34527c cVar, C34409a aVar) {
            this.f89015a = cVar;
            this.f89016b = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C34409a) obj, "it");
            C34527c.super.mo70626a(this.f89016b);
            C52847n a = this.f89015a.mo72536a((View) C34527c.m78457a(this.f89015a));
            if (a == null) {
                a = C52856t.m112465a(Integer.valueOf(-1), Integer.valueOf(-1));
            }
            String filePath = this.f89016b.getFilePath();
            if (filePath != null) {
                RemoteImageView a2 = C34527c.m78457a(this.f89015a);
                StringBuilder sb = new StringBuilder("file://");
                sb.append(filePath);
                C23515d.m57686b(a2, sb.toString(), ((Number) a.getFirst()).intValue(), ((Number) a.getSecond()).intValue());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public final void mo70628b() {
        Object a = mo70624a((int) R.id.azj);
        C52711k.m112236a(a, "findViewById(R.id.iv_cover)");
        this.f89014d = (RemoteImageView) a;
    }

    /* renamed from: a */
    public static final /* synthetic */ RemoteImageView m78457a(C34527c cVar) {
        RemoteImageView remoteImageView = cVar.f89014d;
        if (remoteImageView == null) {
            C52711k.m112237a("ivCover");
        }
        return remoteImageView;
    }

    /* renamed from: a */
    public final void mo70626a(C34409a aVar) {
        C52711k.m112240b(aVar, "data");
        if (aVar != this.f89006b && (aVar.isGif() || aVar.isImage())) {
            aVar.accurateSize(false, new C34529b(this, aVar));
        }
    }

    public C34527c(View view, MediaPreviewViewModel mediaPreviewViewModel) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(mediaPreviewViewModel, "viewModel");
        super(view, mediaPreviewViewModel);
    }
}
