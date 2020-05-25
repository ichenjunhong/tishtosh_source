package com.p683ss.android.ugc.aweme.commercialize.link.staratlas;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.commercialize.link.video.C25982a;
import com.p683ss.android.ugc.aweme.feed.model.StarAtlasLink;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasTagLayout */
public final class StarAtlasTagLayout extends FrameLayout {

    /* renamed from: a */
    public StarAtlasLinkContent f68582a;

    public StarAtlasTagLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public StarAtlasTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo53351a() {
        removeAllViews();
        this.f68582a = null;
    }

    /* renamed from: a */
    public final void mo53352a(StarAtlasLink starAtlasLink, C25982a aVar) {
        View view;
        C52711k.m112240b(starAtlasLink, "starAtlasLink");
        C52711k.m112240b(aVar, "commerceTagCallBack");
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        StarAtlasLinkContent starAtlasLinkContent = new StarAtlasLinkContent(context, null, 0, 6, null);
        this.f68582a = starAtlasLinkContent;
        StarAtlasLinkContent starAtlasLinkContent2 = this.f68582a;
        if (starAtlasLinkContent2 != null) {
            starAtlasLinkContent2.mo53349a(starAtlasLink, aVar);
        }
        removeAllViews();
        StarAtlasLinkContent starAtlasLinkContent3 = this.f68582a;
        if (starAtlasLinkContent3 != null) {
            view = starAtlasLinkContent3.mo53348a();
        } else {
            view = null;
        }
        addView(view);
    }

    public StarAtlasTagLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ StarAtlasTagLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
