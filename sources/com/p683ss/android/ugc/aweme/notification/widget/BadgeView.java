package com.p683ss.android.ugc.aweme.notification.widget;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView.BufferType;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.widget.BadgeView */
public class BadgeView extends DmtTextView {

    /* renamed from: b */
    public boolean f97871b;

    public int getBadgeGravity() {
        return ((LayoutParams) getLayoutParams()).gravity;
    }

    public Integer getBadgeCount() {
        if (getText() == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(getText().toString()));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public int[] getBadgeMargin() {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        return new int[]{layoutParams.leftMargin, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin};
    }

    public BadgeView(Context context) {
        this(context, null);
    }

    public void setBadgeGravity(int i) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.gravity = i;
        setLayoutParams(layoutParams);
    }

    public void setHideOnNull(boolean z) {
        this.f97871b = z;
        setText(getText());
    }

    /* renamed from: a */
    private int m85797a(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setBadgeMargin(int i) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        float f = (float) i;
        layoutParams.leftMargin = m85797a(f);
        layoutParams.topMargin = m85797a(f);
        layoutParams.rightMargin = m85797a(f);
        layoutParams.bottomMargin = m85797a(f);
        setLayoutParams(layoutParams);
    }

    public void setTargetView(View view) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        if (view != null) {
            if (view.getParent() instanceof FrameLayout) {
                ((FrameLayout) view.getParent()).addView(this);
            } else if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeView(view);
                FrameLayout frameLayout = new FrameLayout(getContext());
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                frameLayout.setLayoutParams(layoutParams);
                view.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                viewGroup.addView(frameLayout, indexOfChild, layoutParams);
                frameLayout.addView(view);
                frameLayout.addView(this);
            } else {
                view.getParent();
            }
        }
    }

    public void setBadgeCount(int i) {
        String str = null;
        if (i < 0) {
            str = " ";
        } else if (i > 99) {
            str = "99+";
        } else if (i > 0 && i <= 99) {
            str = String.valueOf(i);
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.length() == 1) {
                if (" ".equals(str)) {
                    setLayoutParams(new LayoutParams(m85797a(6.0f), m85797a(6.0f)));
                } else {
                    setLayoutParams(new LayoutParams(m85797a(18.0f), m85797a(18.0f)));
                }
            } else if (str.length() == 2) {
                setLayoutParams(new LayoutParams(m85797a(24.5f), m85797a(18.0f)));
            } else if (str.length() == 3) {
                setLayoutParams(new LayoutParams(m85797a(31.0f), m85797a(18.0f)));
            }
        }
        setText(str);
    }

    public BadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (!this.f97871b || (charSequence != null && !charSequence.toString().equalsIgnoreCase("0"))) {
            setVisibility(0);
        } else {
            setVisibility(8);
        }
        super.setText(charSequence, bufferType);
    }

    /* renamed from: a */
    public final void mo78361a(int i, int i2) {
        float a = (float) m85797a((float) i);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{a, a, a, a, a, a, a, a}, null, null));
        shapeDrawable.getPaint().setColor(i2);
        setBackground(shapeDrawable);
    }

    public BadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f97871b = true;
        if (!(getLayoutParams() instanceof LayoutParams)) {
            setLayoutParams(new LayoutParams(-2, -2, 53));
        }
        setTextColor(getContext().getResources().getColor(R.color.b0_));
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(1, 12.0f);
        mo78361a(9, getContext().getResources().getColor(R.color.b09));
        setGravity(17);
        setHideOnNull(true);
        setBadgeCount(0);
    }
}
