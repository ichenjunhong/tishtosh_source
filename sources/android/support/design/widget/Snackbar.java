package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.p029g.C0433a;
import android.support.design.widget.BaseTransientBottomBar.C0488d;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;

public final class Snackbar extends BaseTransientBottomBar<Snackbar> {

    /* renamed from: k */
    private static final int[] f1756k = {R.attr.a2i};

    /* renamed from: i */
    private final AccessibilityManager f1757i;

    /* renamed from: j */
    private boolean f1758j;

    public static final class SnackbarLayout extends C0488d {
        public SnackbarLayout(Context context) {
            super(context);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo1230b() {
        super.mo1230b();
    }

    public final void dismiss() {
        super.dismiss();
    }

    /* renamed from: c */
    public final boolean mo1232c() {
        return super.mo1232c();
    }

    /* renamed from: a */
    public final int mo1228a() {
        if (!this.f1758j || !this.f1757i.isTouchExplorationEnabled()) {
            return super.mo1228a();
        }
        return -2;
    }

    private Snackbar(ViewGroup viewGroup, View view, C0433a aVar) {
        super(viewGroup, view, aVar);
        this.f1757i = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: a */
    public static Snackbar m1373a(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        boolean z;
        int i2;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (!(view instanceof CoordinatorLayout)) {
                if (view instanceof FrameLayout) {
                    if (view.getId() == 16908290) {
                        viewGroup = (ViewGroup) view;
                        break;
                    }
                    viewGroup2 = (ViewGroup) view;
                }
                if (view != null) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                        continue;
                    } else {
                        view = null;
                        continue;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                viewGroup = (ViewGroup) view;
                break;
            }
        }
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(f1756k);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            obtainStyledAttributes.recycle();
            if (resourceId != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i2 = R.layout.aae;
            } else {
                i2 = R.layout.j3;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
            Snackbar snackbar = new Snackbar(viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) snackbar.f1592d.getChildAt(0)).getMessageView().setText(charSequence);
            snackbar.f1594f = -2;
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }
}
