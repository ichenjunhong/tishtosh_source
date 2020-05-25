package com.p683ss.android.ugc.aweme.antiaddic.lock.p1357ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.lock.ui.widget.TimeLockDesc */
public class TimeLockDesc extends FrameLayout {

    /* renamed from: a */
    private TextView f61033a;

    /* renamed from: b */
    private ImageView f61034b;

    public void setImageDrawable(Drawable drawable) {
        this.f61034b.setImageDrawable(drawable);
    }

    public void setText(String str) {
        this.f61033a.setText(str);
    }

    public TimeLockDesc(Context context) {
        super(context);
        m56099a(null, 0);
    }

    public TimeLockDesc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m56099a(attributeSet, 0);
    }

    /* renamed from: a */
    private void m56099a(AttributeSet attributeSet, int i) {
        inflate(getContext(), R.layout.aft, this);
        this.f61034b = (ImageView) findViewById(R.id.cs8);
        this.f61033a = (TextView) findViewById(R.id.d0h);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.jl, R.attr.a35}, i, 0);
        String string = obtainStyledAttributes.getString(0);
        if (obtainStyledAttributes.hasValue(1)) {
            this.f61034b.setImageDrawable(obtainStyledAttributes.getDrawable(1));
        }
        this.f61033a.setText(string);
        obtainStyledAttributes.recycle();
    }

    public TimeLockDesc(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m56099a(attributeSet, i);
    }
}
