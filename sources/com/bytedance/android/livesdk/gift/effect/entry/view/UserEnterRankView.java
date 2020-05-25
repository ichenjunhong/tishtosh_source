package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.livesdk.gift.effect.entry.p367e.C7394a;
import com.ss.android.ugc.trill.R;

public class UserEnterRankView extends LinearLayout {

    /* renamed from: a */
    private View f20265a;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        Context context = getContext();
        this.f20265a = new View(context);
        int a = C3922z.m9899a(16.0f);
        LayoutParams layoutParams = new LayoutParams(a, a);
        layoutParams.gravity = 16;
        ImageView imageView = new ImageView(context);
        LayoutParams layoutParams2 = new LayoutParams(C3922z.m9899a(30.0f), C3922z.m9899a(14.0f));
        layoutParams.gravity = 16;
        imageView.setImageResource(R.drawable.byx);
        if (C4206c.m10426a(context)) {
            addView(imageView, 0, layoutParams2);
            addView(this.f20265a, layoutParams);
            return;
        }
        addView(this.f20265a, 0, layoutParams);
        addView(imageView, layoutParams2);
    }

    public UserEnterRankView(Context context) {
        super(context);
    }

    public void setupUI(C7394a aVar) {
        TextView textView = (TextView) findViewById(R.id.d8j);
        if (aVar.f20194l != 0) {
            if (aVar.f20194l == 1) {
                this.f20265a.setBackgroundResource(R.drawable.c17);
                textView.setText(R.string.eff);
                return;
            } else if (aVar.f20194l == 2) {
                this.f20265a.setBackgroundResource(R.drawable.c18);
                textView.setText(R.string.efh);
                return;
            } else if (aVar.f20194l == 3) {
                this.f20265a.setBackgroundResource(R.drawable.c19);
                textView.setText(R.string.efi);
                return;
            } else if (aVar.f20194l == 4) {
                this.f20265a.setVisibility(8);
                textView.setText(R.string.efg);
                return;
            }
        }
        setVisibility(8);
    }

    public UserEnterRankView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UserEnterRankView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
