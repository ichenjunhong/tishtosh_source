package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.util.AttributeSet;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.AvatarImageWithVerifyAndLive */
public class AvatarImageWithVerifyAndLive extends AvatarImageWithVerify {

    /* renamed from: f */
    private ImageView f62906f;

    private LayoutParams getLiveLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(m57919a(41), m57919a(17));
        layoutParams.gravity = 49;
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo48963a() {
        super.mo48963a();
        LayoutParams liveLayoutParams = getLiveLayoutParams();
        this.f62906f = new ImageView(getContext());
        try {
            this.f62906f.setImageDrawable(getResources().getDrawable(R.drawable.dev));
        } catch (NotFoundException unused) {
        }
        this.f62906f.setVisibility(8);
        addView(this.f62906f, liveLayoutParams);
    }

    public AvatarImageWithVerifyAndLive(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private int m57919a(int i) {
        return (int) C9432q.m18687b(getContext(), (float) i);
    }

    /* renamed from: a */
    public final void mo48975a(boolean z) {
        if (!z) {
            this.f62906f.setVisibility(8);
        } else {
            this.f62906f.setVisibility(0);
        }
    }

    public AvatarImageWithVerifyAndLive(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageWithVerifyAndLive(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
