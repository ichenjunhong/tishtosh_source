package com.bytedance.android.livesdk.gift.dialog.view.topbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.dialog.viewmodel.GiftViewModel;
import com.ss.android.ugc.trill.R;

public class LiveTopDefaultView extends FrameLayout {

    /* renamed from: a */
    private TextView f19812a;

    /* renamed from: b */
    private GiftViewModel f19813b;

    public void setViewModel(GiftViewModel giftViewModel) {
        this.f19813b = giftViewModel;
    }

    public LiveTopDefaultView(Context context) {
        this(context, null);
    }

    public LiveTopDefaultView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveTopDefaultView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.bxb, this);
        this.f19812a = (TextView) findViewById(R.id.e4s);
        this.f19812a.setOnClickListener(new C7285g(this));
    }
}
