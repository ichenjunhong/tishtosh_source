package android.support.p043v7.widget;

import android.content.Context;
import android.support.p030v4.widget.C1115o;
import android.support.p043v7.p044a.p045a.C1124a;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.AppCompatCheckedTextView */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: a */
    private static final int[] f4458a = {16843016};

    /* renamed from: b */
    private final C1491m f4459b;

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4459b != null) {
            this.f4459b.mo5788a();
        }
    }

    public AppCompatCheckedTextView(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1115o.m3254a((TextView) this, callback));
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1486h.m5224a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C1124a.m3315b(getContext(), i));
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f4459b != null) {
            this.f4459b.mo5792a(context, i);
        }
    }

    public AppCompatCheckedTextView(Context context, AttributeSet attributeSet, int i) {
        super(C1447ay.m5028a(context), attributeSet, i);
        this.f4459b = new C1491m(this);
        this.f4459b.mo5793a(attributeSet, i);
        this.f4459b.mo5788a();
        C1451bb a = C1451bb.m5032a(getContext(), attributeSet, f4458a, i, 0);
        setCheckMarkDrawable(a.mo5652a(0));
        a.mo5653a();
    }
}
