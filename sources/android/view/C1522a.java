package android.view;

import android.support.constraint.ConstraintLayout;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

/* renamed from: android.view.a */
public final class C1522a extends View {
    /* renamed from: a */
    public static void m5435a(View view) {
        view.onFinishInflate();
    }

    /* renamed from: a */
    public static void m5436a(View view, int i) {
        ((TextView) view).setMinHeight(i);
    }

    /* renamed from: a */
    public static MarginLayoutParams m5434a(ViewGroup viewGroup, int i, int i2) {
        if (viewGroup instanceof RelativeLayout) {
            return new LayoutParams(i, i2);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(i, i2);
        }
        if (viewGroup instanceof ConstraintLayout) {
            return new ConstraintLayout.LayoutParams(i, i2);
        }
        return new MarginLayoutParams(i, i2);
    }
}
