package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1054s;
import android.support.p030v4.widget.C1115o;
import android.support.p043v7.p044a.p045a.C1124a;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.AppCompatAutoCompleteTextView */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements C1054s {

    /* renamed from: a */
    private static final int[] f4452a = {16843126};

    /* renamed from: b */
    private final C1478e f4453b;

    /* renamed from: c */
    private final C1491m f4454c;

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4453b != null) {
            return this.f4453b.mo5757a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4453b != null) {
            return this.f4453b.mo5763b();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4453b != null) {
            this.f4453b.mo5764c();
        }
        if (this.f4454c != null) {
            this.f4454c.mo5788a();
        }
    }

    public AppCompatAutoCompleteTextView(Context context) {
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
        if (this.f4453b != null) {
            this.f4453b.mo5761a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4453b != null) {
            this.f4453b.mo5758a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C1124a.m3315b(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4453b != null) {
            this.f4453b.mo5759a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4453b != null) {
            this.f4453b.mo5760a(mode);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bm);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f4454c != null) {
            this.f4454c.mo5792a(context, i);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C1447ay.m5028a(context), attributeSet, i);
        C1451bb a = C1451bb.m5032a(getContext(), attributeSet, f4452a, i, 0);
        if (a.mo5664f(0)) {
            setDropDownBackgroundDrawable(a.mo5652a(0));
        }
        a.mo5653a();
        this.f4453b = new C1478e(this);
        this.f4453b.mo5762a(attributeSet, i);
        this.f4454c = new C1491m(this);
        this.f4454c.mo5793a(attributeSet, i);
        this.f4454c.mo5788a();
    }
}
