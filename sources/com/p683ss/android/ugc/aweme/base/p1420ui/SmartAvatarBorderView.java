package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView */
public class SmartAvatarBorderView extends SmartCircleImageView {

    /* renamed from: c */
    private UrlModel f63026c;

    /* renamed from: a */
    public final void mo23132a() {
        super.mo23132a();
        ((C13833a) getHierarchy()).mo25892a(2131953301, C13818b.f36061a);
        if (((C13833a) getHierarchy()).f36079a != null) {
            ((C13833a) getHierarchy()).f36079a.mo25939c(C9432q.m18687b(getContext(), 1.0f));
            ((C13833a) getHierarchy()).f36079a.mo25938b(getResources().getColor(R.color.bs));
            ((C13833a) getHierarchy()).f36079a.mo25940d(C9432q.m18687b(getContext(), 1.0f));
        }
    }

    public SmartAvatarBorderView(Context context) {
        super(context);
    }

    public void setBorderColor(int i) {
        if (((C13833a) getHierarchy()).f36079a != null) {
            ((C13833a) getHierarchy()).f36079a.mo25938b(C0726c.m2098c(getContext(), i));
        }
    }

    public void setBorderWidth(int i) {
        if (((C13833a) getHierarchy()).f36079a != null) {
            ((C13833a) getHierarchy()).f36079a.mo25939c(C9432q.m18687b(getContext(), (float) i));
        }
    }

    public void setBorderWidthPx(int i) {
        if (((C13833a) getHierarchy()).f36079a != null) {
            ((C13833a) getHierarchy()).f36079a.mo25939c((float) i);
        }
    }

    public SmartAvatarBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SmartAvatarBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo49062a(UrlModel urlModel, int[] iArr, int i, int i2, String str, boolean z) {
        if (this.f63026c != urlModel) {
            this.f63026c = urlModel;
            C12208t a = C12203q.m24645a((Object) C23608p.m57874a(urlModel));
            if (iArr != null) {
                a.mo23125b(iArr);
            }
            a.mo23111a(i, i2).mo23118a(str).mo23127c(true).mo23116a((C12197k) this).mo23121a();
        }
    }
}
