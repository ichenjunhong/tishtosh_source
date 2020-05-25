package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;

/* renamed from: com.ss.android.ugc.aweme.base.ui.SmartRoundImageView */
public class SmartRoundImageView extends SmartImageView {
    /* renamed from: a */
    public final void mo23132a() {
        super.mo23132a();
        C13837e eVar = new C13837e();
        eVar.mo25932a(C9432q.m18687b(getContext(), 2.0f));
        ((C13833a) getHierarchy()).mo25899a(eVar);
        ((C13833a) getHierarchy()).mo25898a(C13818b.f36067g);
    }

    public SmartRoundImageView(Context context) {
        super(context);
    }

    public SmartRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SmartRoundImageView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    public SmartRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
