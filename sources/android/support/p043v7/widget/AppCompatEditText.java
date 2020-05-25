package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1054s;
import android.support.p030v4.widget.C1115o;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.AppCompatEditText */
public class AppCompatEditText extends EditText implements C1054s {
    private final C1478e mBackgroundTintHelper;
    private final C1491m mTextHelper;

    public ColorStateList getSupportBackgroundTintList() {
        if (this.mBackgroundTintHelper != null) {
            return this.mBackgroundTintHelper.mo5757a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.mBackgroundTintHelper != null) {
            return this.mBackgroundTintHelper.mo5763b();
        }
        return null;
    }

    public Editable getText() {
        if (VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.mo5764c();
        }
        if (this.mTextHelper != null) {
            this.mTextHelper.mo5788a();
        }
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1115o.m3254a((TextView) this, callback));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1486h.m5224a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.mo5761a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.mo5758a(i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.mo5759a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.mo5760a(mode);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.k8);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.mTextHelper != null) {
            this.mTextHelper.mo5792a(context, i);
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C1447ay.m5028a(context), attributeSet, i);
        this.mBackgroundTintHelper = new C1478e(this);
        this.mBackgroundTintHelper.mo5762a(attributeSet, i);
        this.mTextHelper = new C1491m(this);
        this.mTextHelper.mo5793a(attributeSet, i);
        this.mTextHelper.mo5788a();
    }
}
