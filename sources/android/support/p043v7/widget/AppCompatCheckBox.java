package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p030v4.widget.C1117p;
import android.support.p043v7.p044a.p045a.C1124a;
import android.util.AttributeSet;
import android.widget.CheckBox;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.AppCompatCheckBox */
public class AppCompatCheckBox extends CheckBox implements C1117p {

    /* renamed from: a */
    private final C1479f f4457a;

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        if (this.f4457a != null) {
            return this.f4457a.mo5765a(compoundPaddingLeft);
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportButtonTintList() {
        if (this.f4457a != null) {
            return this.f4457a.f5332a;
        }
        return null;
    }

    public Mode getSupportButtonTintMode() {
        if (this.f4457a != null) {
            return this.f4457a.f5333b;
        }
        return null;
    }

    public AppCompatCheckBox(Context context) {
        this(context, null);
    }

    public void setButtonDrawable(int i) {
        setButtonDrawable(C1124a.m3315b(getContext(), i));
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        if (this.f4457a != null) {
            this.f4457a.mo5767a(colorStateList);
        }
    }

    public void setSupportButtonTintMode(Mode mode) {
        if (this.f4457a != null) {
            this.f4457a.mo5768a(mode);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        if (this.f4457a != null) {
            this.f4457a.mo5766a();
        }
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.ea);
    }

    public AppCompatCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(C1447ay.m5028a(context), attributeSet, i);
        this.f4457a = new C1479f(this);
        this.f4457a.mo5769a(attributeSet, i);
    }
}
