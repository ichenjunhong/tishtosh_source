package com.bytedance.android.livesdk.gift;

import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;

public class GiftEndWidget extends LiveWidget {

    /* renamed from: a */
    final DataCenter f19549a;

    public int getLayoutId() {
        return R.layout.bw3;
    }

    public void onCreate() {
        super.onCreate();
        this.contentView.addOnLayoutChangeListener(new C7215b(this));
    }

    public GiftEndWidget(DataCenter dataCenter) {
        this.f19549a = dataCenter;
    }
}
