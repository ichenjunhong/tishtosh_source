package com.p683ss.android.ugc.aweme.commercialize.link.nationaltask;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.commercialize.link.video.C25982a;
import com.p683ss.android.ugc.aweme.feed.model.NationalTaskLink;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskTagLayout */
public final class NationalTaskTagLayout extends FrameLayout {

    /* renamed from: a */
    public NationalTaskLinkContent f68578a;

    public NationalTaskTagLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public NationalTaskTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo53346a() {
        removeAllViews();
        this.f68578a = null;
    }

    /* renamed from: a */
    public final void mo53347a(NationalTaskLink nationalTaskLink, C25982a aVar) {
        View view;
        C52711k.m112240b(nationalTaskLink, "nationalTaskLink");
        C52711k.m112240b(aVar, "commerceTagCallBack");
        Context context = getContext();
        C52711k.m112236a((Object) context, "context");
        NationalTaskLinkContent nationalTaskLinkContent = new NationalTaskLinkContent(context, null, 0, 6, null);
        this.f68578a = nationalTaskLinkContent;
        NationalTaskLinkContent nationalTaskLinkContent2 = this.f68578a;
        if (nationalTaskLinkContent2 != null) {
            nationalTaskLinkContent2.mo53344a(nationalTaskLink, aVar);
        }
        removeAllViews();
        NationalTaskLinkContent nationalTaskLinkContent3 = this.f68578a;
        if (nationalTaskLinkContent3 != null) {
            view = nationalTaskLinkContent3.mo53343a();
        } else {
            view = null;
        }
        addView(view);
    }

    public NationalTaskTagLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ NationalTaskTagLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
