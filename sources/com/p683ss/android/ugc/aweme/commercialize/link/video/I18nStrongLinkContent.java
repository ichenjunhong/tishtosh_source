package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.I18nStrongLinkContent */
public class I18nStrongLinkContent extends RelativeLayout implements C25992k {

    /* renamed from: a */
    C25993l f68589a;

    /* renamed from: b */
    private RemoteImageView f68590b;

    /* renamed from: c */
    private ImageView f68591c;

    /* renamed from: c */
    public final View mo53360c() {
        return this;
    }

    /* renamed from: a */
    public final void mo53357a() {
        if (this.f68589a != null) {
            this.f68589a.mo53092a();
        }
    }

    /* renamed from: b */
    public final void mo53359b() {
        if (this.f68589a != null) {
            this.f68589a.mo53099d();
        }
    }

    public void setLinkTagCallBack(C25993l lVar) {
        this.f68589a = lVar;
    }

    public I18nStrongLinkContent(Context context) {
        this(context, null, 0);
    }

    public I18nStrongLinkContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.b_a, this, true);
        this.f68590b = (RemoteImageView) findViewById(R.id.bbi);
        this.f68591c = (ImageView) findViewById(R.id.bbj);
        setBackgroundResource(R.drawable.cvq);
        this.f68590b.setOnClickListener(new C25986e(this));
    }

    /* renamed from: a */
    public final void mo53358a(C26138s sVar, C25993l lVar, CommerceTagLayout commerceTagLayout) {
        this.f68589a = lVar;
        ((C13833a) this.f68590b.getHierarchy()).mo25907c((int) R.color.a2q);
        if (sVar.getImageList() == null || sVar.getImageList().size() <= 0) {
            commerceTagLayout.setVisibility(8);
            return;
        }
        UrlModel urlModel = (UrlModel) sVar.getImageList().get(0);
        C23515d.m57669a(this.f68590b, urlModel);
        setLayoutParams(new LayoutParams(C23728o.m58241a((double) (urlModel.getWidth() / 2)), C23728o.m58241a((double) (urlModel.getHeight() / 2))));
        if (sVar.showCloseTips) {
            this.f68591c.setVisibility(0);
            this.f68591c.setOnClickListener(new C25987f(commerceTagLayout, lVar));
            return;
        }
        this.f68591c.setVisibility(8);
    }
}
