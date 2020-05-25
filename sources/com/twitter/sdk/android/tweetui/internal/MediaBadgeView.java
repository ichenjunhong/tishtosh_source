package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import com.twitter.sdk.android.core.internal.C52187t;
import com.twitter.sdk.android.core.models.C52197d;
import com.twitter.sdk.android.core.models.C52203j;

public class MediaBadgeView extends FrameLayout {

    /* renamed from: a */
    TextView f130156a;

    /* renamed from: b */
    ImageView f130157b;

    /* renamed from: a */
    private void m111696a() {
        this.f130156a.setVisibility(8);
        this.f130157b.setVisibility(8);
    }

    public MediaBadgeView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    public void setBadge(Drawable drawable) {
        this.f130157b.setVisibility(0);
        this.f130156a.setVisibility(8);
        this.f130157b.setImageDrawable(drawable);
    }

    public void setCard(C52197d dVar) {
        if (C52187t.m111610a(dVar)) {
            setBadge(getResources().getDrawable(R.drawable.c9h));
        } else {
            m111696a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void setText(long j) {
        this.f130156a.setVisibility(0);
        this.f130157b.setVisibility(8);
        this.f130156a.setText(C52292c.m111729a(j));
    }

    public void setMediaEntity(C52203j jVar) {
        long j;
        if ("animated_gif".equals(jVar.type)) {
            setBadge(getResources().getDrawable(R.drawable.c6w));
        } else if ("video".equals(jVar.type)) {
            if (jVar.videoInfo == null) {
                j = 0;
            } else {
                j = jVar.videoInfo.durationMillis;
            }
            setText(j);
        } else {
            m111696a();
        }
    }

    public MediaBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MediaBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.ass, this, true);
        this.f130156a = (TextView) inflate.findViewById(R.id.djw);
        this.f130157b = (ImageView) inflate.findViewById(R.id.djf);
    }
}
