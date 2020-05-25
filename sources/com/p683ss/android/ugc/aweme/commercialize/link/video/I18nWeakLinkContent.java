package com.p683ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.StaticLayout.Builder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.I18nWeakLinkContent */
public class I18nWeakLinkContent extends LinearLayout implements C25992k {

    /* renamed from: a */
    C25993l f68592a;

    /* renamed from: b */
    private RemoteImageView f68593b;

    /* renamed from: c */
    private DmtTextView f68594c;

    /* renamed from: d */
    private DmtTextView f68595d;

    /* renamed from: e */
    private ImageView f68596e;

    /* renamed from: f */
    private C26138s f68597f;

    /* renamed from: c */
    public final View mo53360c() {
        return this;
    }

    /* renamed from: a */
    public final void mo53357a() {
        if (this.f68592a != null) {
            this.f68592a.mo53092a();
        }
    }

    /* renamed from: b */
    public final void mo53359b() {
        if (this.f68592a != null) {
            this.f68592a.mo53099d();
        }
    }

    public void setLinkTagCallBack(C25993l lVar) {
        this.f68592a = lVar;
    }

    public I18nWeakLinkContent(Context context) {
        this(context, null, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        StaticLayout staticLayout;
        String str;
        super.onMeasure(i, i2);
        measureChildren(i, i2);
        int maxWidth = this.f68594c.getMaxWidth();
        this.f68594c.setTextSize(13.0f);
        if (VERSION.SDK_INT >= 23) {
            if (this.f68597f.title == null) {
                str = "";
            } else {
                str = this.f68597f.title;
            }
            staticLayout = Builder.obtain(str, 0, str.length(), this.f68594c.getPaint(), maxWidth).build();
        } else {
            staticLayout = new StaticLayout(this.f68597f.title, this.f68594c.getPaint(), maxWidth, Alignment.ALIGN_NORMAL, this.f68594c.getLineSpacingMultiplier(), this.f68594c.getLineSpacingExtra(), this.f68594c.getIncludeFontPadding());
        }
        if (staticLayout.getLineCount() > 1 && !TextUtils.isEmpty(this.f68597f.label)) {
            LayoutParams layoutParams = (LayoutParams) this.f68593b.getLayoutParams();
            layoutParams.height = C23728o.m58241a(48.0d);
            layoutParams.width = C23728o.m58241a(48.0d);
            this.f68593b.setLayoutParams(layoutParams);
        }
    }

    public I18nWeakLinkContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.b_b, this, true);
        setPadding(C23728o.m58241a(5.0d), C23728o.m58241a(5.0d), C23728o.m58241a(5.0d), C23728o.m58241a(5.0d));
        this.f68593b = (RemoteImageView) findViewById(R.id.bbk);
        this.f68594c = (DmtTextView) findViewById(R.id.bbh);
        this.f68595d = (DmtTextView) findViewById(R.id.bbg);
        this.f68596e = (ImageView) findViewById(R.id.bbj);
        setBackgroundResource(R.drawable.de5);
        setOrientation(0);
        setPadding(C23728o.m58241a(5.0d), C23728o.m58241a(5.0d), C23728o.m58241a(5.0d), C23728o.m58241a(5.0d));
        setOnClickListener(new C25989h(this));
    }

    /* renamed from: a */
    public final void mo53358a(C26138s sVar, C25993l lVar, CommerceTagLayout commerceTagLayout) {
        this.f68592a = lVar;
        if (sVar == null) {
            this.f68594c.setText("");
            return;
        }
        this.f68597f = sVar;
        ((C13833a) this.f68593b.getHierarchy()).mo25907c((int) R.color.a2q);
        UrlModel urlModel = sVar.avatarIcon;
        if (urlModel != null && !C9376b.m18558a((Collection<T>) urlModel.getUrlList())) {
            C23515d.m57669a(this.f68593b, sVar.avatarIcon);
        }
        if (!TextUtils.isEmpty(this.f68597f.label)) {
            this.f68595d.setVisibility(0);
            this.f68595d.setFontType(C10751d.f28908g);
            this.f68595d.setText(this.f68597f.label);
        }
        this.f68594c.setText(this.f68597f.title);
        if (sVar.showCloseTips) {
            this.f68596e.setVisibility(0);
            this.f68596e.setOnClickListener(new C25990i(commerceTagLayout, lVar));
        } else {
            this.f68596e.setVisibility(8);
        }
        this.f68594c.setText(sVar.title);
    }
}
