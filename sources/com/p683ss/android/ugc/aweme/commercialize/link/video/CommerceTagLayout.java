package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout */
public class CommerceTagLayout extends FrameLayout {

    /* renamed from: a */
    public C25992k f68583a;

    /* renamed from: a */
    public final void mo53353a() {
        removeAllViews();
        this.f68583a = null;
    }

    /* renamed from: b */
    public final void mo53355b() {
        if (this.f68583a != null) {
            this.f68583a.mo53357a();
        }
    }

    public CommerceTagLayout(Context context) {
        super(context);
    }

    public CommerceTagLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void mo53354a(C26138s sVar, C25993l lVar) {
        switch (sVar.feedShowType) {
            case 1:
                this.f68583a = new I18nWeakLinkContent(getContext());
                break;
            case 2:
                this.f68583a = new I18nStrongLinkContent(getContext());
                break;
            default:
                this.f68583a = new C25983b(getContext());
                break;
        }
        this.f68583a.setLinkTagCallBack(lVar);
        this.f68583a.mo53358a(sVar, lVar, this);
        removeAllViews();
        addView(this.f68583a.mo53360c());
    }

    public CommerceTagLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
