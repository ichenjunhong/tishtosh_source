package com.zhihu.matisse.internal.p2254ui.widget;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.p035a.C0720f;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.ss.android.ugc.trill.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.CheckRadioView */
public class CheckRadioView extends AppCompatImageView {

    /* renamed from: a */
    private Drawable f130811a;

    /* renamed from: b */
    private int f130812b;

    /* renamed from: c */
    private int f130813c;

    /* renamed from: a */
    private void m112021a() {
        this.f130812b = C0720f.m2076b(getResources(), R.color.ati, getContext().getTheme());
        this.f130813c = C0720f.m2076b(getResources(), R.color.ath, getContext().getTheme());
        setChecked(false);
    }

    public CheckRadioView(Context context) {
        super(context);
        m112021a();
    }

    public void setColor(int i) {
        if (this.f130811a == null) {
            this.f130811a = getDrawable();
        }
        this.f130811a.setColorFilter(i, Mode.SRC_IN);
    }

    public void setChecked(boolean z) {
        if (z) {
            setImageResource(2131953400);
            this.f130811a = getDrawable();
            if (this.f130811a != null) {
                this.f130811a.setColorFilter(this.f130812b, Mode.SRC_IN);
            }
        } else {
            setImageResource(2131953399);
            this.f130811a = getDrawable();
            if (this.f130811a != null) {
                this.f130811a.setColorFilter(this.f130813c, Mode.SRC_IN);
            }
        }
    }

    public CheckRadioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m112021a();
    }
}
