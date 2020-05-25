package com.p683ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;

/* renamed from: com.ss.android.ugc.tools.view.widget.AvatarImageView */
public class AvatarImageView extends CircleImageView {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo98118a() {
        super.mo98118a();
        Drawable a = C39629l.m88232a().mo58564B().mo74263a(getContext());
        if (a != null) {
            ((C13833a) getHierarchy()).mo25897a(a, C13818b.f36067g);
        }
    }

    public AvatarImageView(Context context) {
        super(context);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarImageView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
