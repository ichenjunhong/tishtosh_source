package com.p683ss.android.ugc.aweme.notification.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;

/* renamed from: com.ss.android.ugc.aweme.notification.view.RemoteRoundImageView */
public class RemoteRoundImageView extends AnimatedImageView {
    /* renamed from: a */
    public final void mo48929a() {
        super.mo48929a();
        C13837e eVar = new C13837e();
        eVar.mo25932a(C9432q.m18687b(C11010c.m22280a(), 2.0f));
        ((C13833a) getHierarchy()).mo25899a(eVar);
        ((C13833a) getHierarchy()).mo25898a(C13818b.f36067g);
    }

    public RemoteRoundImageView(Context context) {
        super(context);
    }

    public RemoteRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RemoteRoundImageView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    public RemoteRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RemoteRoundImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
