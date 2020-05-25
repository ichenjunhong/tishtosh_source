package com.p683ss.android.ugc.aweme.poi.p2074ui.publish;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiItemView */
public class SpeedRecommendPoiItemView extends LinearLayout {

    /* renamed from: a */
    TextView f100772a;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f100772a = (TextView) findViewById(R.id.c_3);
    }

    public SpeedRecommendPoiItemView(Context context) {
        super(context);
    }

    public SpeedRecommendPoiItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SpeedRecommendPoiItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
