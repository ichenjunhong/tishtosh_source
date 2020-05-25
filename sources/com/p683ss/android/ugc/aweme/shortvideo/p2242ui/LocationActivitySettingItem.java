package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.PoiContext;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.LocationActivitySettingItem */
public class LocationActivitySettingItem extends FrameLayout {

    /* renamed from: a */
    TextView f113643a;

    /* renamed from: b */
    TextView f113644b;

    /* renamed from: c */
    private PoiContext f113645c;

    public LocationActivitySettingItem(Context context) {
        this(context, null);
    }

    public void setPoiActivity(PoiContext poiContext) {
        this.f113645c = poiContext;
        this.f113643a.setText(poiContext.mShootPoiName);
        this.f113644b.setText(this.f113645c.mPoiActivity.getTitle());
    }

    public void setSingleLine(boolean z) {
        if (z) {
            ((LayoutParams) this.f113643a.getLayoutParams()).weight = 1.0f;
            this.f113643a.setSingleLine(true);
            this.f113643a.setEllipsize(TruncateAt.END);
        }
    }

    public LocationActivitySettingItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m98139a(TextView textView, boolean z) {
        int i;
        if (z) {
            i = C0726c.m2098c(getContext(), R.color.a1k);
        } else {
            i = C0726c.m2098c(getContext(), R.color.a1o);
        }
        textView.setTextColor(i);
    }

    public LocationActivitySettingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.yw, this);
        this.f113643a = (TextView) findViewById(R.id.c53);
        this.f113644b = (TextView) findViewById(R.id.c54);
        m98139a(this.f113643a, true);
        m98139a(this.f113644b, false);
    }
}
