package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.imagepipeline.common.C13952d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarWithBorderView */
public class AvatarWithBorderView extends AvatarImageView {

    /* renamed from: f */
    private C13952d f62907f;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48929a() {
        super.mo48929a();
        if (((C13833a) getHierarchy()).f36079a != null) {
            ((C13833a) getHierarchy()).f36079a.mo25939c(C9432q.m18687b(getContext(), 1.0f));
            ((C13833a) getHierarchy()).f36079a.mo25938b(getResources().getColor(R.color.bs));
            ((C13833a) getHierarchy()).f36079a.mo25940d(C9432q.m18687b(getContext(), 1.0f));
        }
    }

    public AvatarWithBorderView(Context context) {
        super(context);
    }

    public void setResizeOptions(C13952d dVar) {
        this.f62907f = dVar;
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

    public AvatarWithBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AvatarWithBorderView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    public AvatarWithBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AvatarWithBorderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
