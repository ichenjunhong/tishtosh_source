package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p030v4.widget.C1115o;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.DialogTitle */
public class DialogTitle extends TextView {
    public DialogTitle(Context context) {
        super(context);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1115o.m3254a((TextView) this, callback));
    }

    public DialogTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (lineCount > 0 && layout.getEllipsisCount(lineCount - 1) > 0) {
                setSingleLine(false);
                setMaxLines(2);
                TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{16842901, 16842902, 16842903, 16842904, 16842906, 16842907, 16843105, 16843106, 16843107, 16843108, 16843692, R.attr.m2, R.attr.a5j}, 16842817, 16973892);
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                if (dimensionPixelSize != 0) {
                    setTextSize(0, (float) dimensionPixelSize);
                }
                obtainStyledAttributes.recycle();
                super.onMeasure(i, i2);
            }
        }
    }

    public DialogTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
