package com.bytedance.android.livesdk.gift.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

public class GiftTabTextView extends RelativeLayout {

    /* renamed from: a */
    private TextView f19670a;

    /* renamed from: b */
    private View f19671b;

    /* renamed from: a */
    public final boolean mo13473a() {
        if (this.f19671b == null || this.f19671b.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public GiftTabTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo13472a(boolean z) {
        int i;
        if (this.f19671b != null) {
            View view = this.f19671b;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public void setGravity(int i) {
        if (this.f19670a != null) {
            this.f19670a.setGravity(i);
        }
    }

    public void setText(String str) {
        if (this.f19670a != null) {
            this.f19670a.setText(str);
        }
    }

    public void setTextColor(int i) {
        if (this.f19670a != null) {
            this.f19670a.setTextColor(i);
        }
    }

    public void setTextSize(float f) {
        if (this.f19670a != null) {
            this.f19670a.setTextSize(f);
        }
    }

    public GiftTabTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftTabTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(R.layout.aoh, this);
        this.f19670a = (TextView) inflate.findViewById(R.id.c6q);
        this.f19671b = inflate.findViewById(R.id.c6p);
    }
}
