package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.b */
final class C25983b extends LinearLayout implements OnClickListener, C25992k {

    /* renamed from: a */
    private RemoteImageView f68598a;

    /* renamed from: b */
    private DmtTextView f68599b;

    /* renamed from: c */
    private ImageView f68600c;

    /* renamed from: d */
    private C25993l f68601d;

    /* renamed from: c */
    public final View mo53360c() {
        return this;
    }

    /* renamed from: a */
    public final void mo53357a() {
        if (this.f68601d != null) {
            this.f68601d.mo53092a();
        }
    }

    /* renamed from: b */
    public final void mo53359b() {
        if (this.f68601d != null) {
            this.f68601d.mo53099d();
        }
    }

    public final void setLinkTagCallBack(C25993l lVar) {
        this.f68601d = lVar;
    }

    C25983b(Context context) {
        this(context, null);
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (this.f68601d != null) {
            this.f68601d.mo53093b();
        }
    }

    private C25983b(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
    }

    private C25983b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.b_c, this, true);
        setPadding(C23728o.m58241a(5.0d), C23728o.m58241a(5.0d), C23728o.m58241a(5.0d), C23728o.m58241a(5.0d));
        setBackgroundResource(R.drawable.de5);
        this.f68598a = (RemoteImageView) findViewById(R.id.bbe);
        this.f68599b = (DmtTextView) findViewById(R.id.bbb);
        this.f68600c = (ImageView) findViewById(R.id.bbj);
        setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo53358a(C26138s sVar, C25993l lVar, CommerceTagLayout commerceTagLayout) {
        this.f68601d = lVar;
        if (sVar == null) {
            this.f68598a.setImageResource(17170445);
            this.f68599b.setText("");
            return;
        }
        ((C13833a) this.f68598a.getHierarchy()).mo25907c((int) R.color.a2q);
        UrlModel urlModel = sVar.avatarIcon;
        if (urlModel == null || C9376b.m18558a((Collection<T>) urlModel.getUrlList())) {
            this.f68598a.setImageResource(17170445);
        } else {
            C23515d.m57669a(this.f68598a, sVar.avatarIcon);
        }
        if (sVar.showCloseTips) {
            this.f68600c.setVisibility(0);
        } else {
            this.f68600c.setVisibility(8);
        }
        this.f68600c.setOnClickListener(new C25984c(commerceTagLayout, lVar));
        this.f68599b.setText(sVar.title);
        if (!TextUtils.isEmpty(sVar.label)) {
            DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.cw);
            dmtTextView.setVisibility(0);
            dmtTextView.setText(sVar.label);
        }
    }
}
