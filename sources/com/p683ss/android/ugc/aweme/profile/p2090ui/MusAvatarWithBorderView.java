package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import com.bytedance.common.utility.C9432q;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.MusAvatarWithBorderView */
public class MusAvatarWithBorderView extends AvatarImageView {
    /* renamed from: d */
    public final void mo82245d() {
        if (((C13833a) getHierarchy()).f36079a != null) {
            ((C13833a) getHierarchy()).mo25899a(((C13833a) getHierarchy()).f36079a);
        }
    }

    /* renamed from: a */
    public final void mo48929a() {
        super.mo48929a();
        if (((C13833a) getHierarchy()).f36079a != null) {
            ((C13833a) getHierarchy()).f36079a.mo25939c(C9432q.m18687b(getContext(), 1.0f));
            ((C13833a) getHierarchy()).f36079a.mo25938b(getResources().getColor(R.color.a1x));
            ((C13833a) getHierarchy()).f36079a.mo25940d(C9432q.m18687b(getContext(), 1.0f));
        }
    }

    public MusAvatarWithBorderView(Context context) {
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

    public MusAvatarWithBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MusAvatarWithBorderView(Context context, C13833a aVar) {
        super(context, aVar);
    }

    public MusAvatarWithBorderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MusAvatarWithBorderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
