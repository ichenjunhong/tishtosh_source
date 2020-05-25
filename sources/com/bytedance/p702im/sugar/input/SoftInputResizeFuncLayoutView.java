package com.bytedance.p702im.sugar.input;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.p702im.sugar.input.C11506b.C11507a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35242bk;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.im.sugar.input.SoftInputResizeFuncLayoutView */
public class SoftInputResizeFuncLayoutView extends FuncLayoutView implements C11506b {

    /* renamed from: d */
    protected C11507a f30854d;

    /* renamed from: e */
    private EditText f30855e;

    /* renamed from: f */
    private boolean f30856f;

    /* renamed from: g */
    private boolean f30857g;

    /* renamed from: h */
    private int f30858h;

    /* renamed from: i */
    private boolean f30859i;

    /* renamed from: e */
    public final void mo22253e() {
        mo22246a(-2);
    }

    public int getSoftKeyboardHeight() {
        return C11508c.m23575a(0);
    }

    private int getCurrentHeight() {
        if (this.f30857g) {
            return C11508c.m23575a(this.f30858h);
        }
        return this.f30858h;
    }

    public int getPanelHeight() {
        if (!mo22248a()) {
            return 0;
        }
        if (this.f30859i) {
            return getSoftKeyboardHeight();
        }
        return getMeasuredHeight();
    }

    /* renamed from: d */
    public final boolean mo22252d() {
        boolean z = false;
        if (this.f30856f) {
            return false;
        }
        Rect rect = new Rect();
        Activity activity = (Activity) getContext();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int height = activity.getWindow().getDecorView().getHeight();
        int a = C35242bk.m79687a(activity);
        int c = ((height - rect.bottom) - a) + C23724k.m58225c();
        if (c >= (((height - a) - C11065a.m22390a((Context) activity)) / 10) * 3) {
            z = true;
        }
        if (this.f30859i != z) {
            this.f30859i = z;
            getLocationInWindow(new int[2]);
            if (z) {
                if (c > 0) {
                    C11508c.f30861a = c;
                }
                LayoutParams layoutParams = getLayoutParams();
                int currentHeight = getCurrentHeight();
                if (layoutParams.height != currentHeight) {
                    layoutParams.height = currentHeight;
                    setLayoutParams(layoutParams);
                }
                this.f30851a = -2;
                if (this.f30852b != null) {
                    this.f30852b.mo22264a(this.f30851a, null);
                }
            } else if (this.f30851a == -2) {
                mo22246a(-1);
            }
        }
        return z;
    }

    public void setDefaultPanelHeight(int i) {
        this.f30858h = i;
    }

    public void setEditText(EditText editText) {
        this.f30855e = editText;
    }

    public void setForceHide(boolean z) {
        this.f30856f = z;
    }

    public void setOnKeyBordChangedListener(C11507a aVar) {
        this.f30854d = aVar;
    }

    public void setResizable(boolean z) {
        this.f30857g = z;
    }

    public SoftInputResizeFuncLayoutView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo22246a(int i) {
        if (this.f30851a != i) {
            if (i == -1) {
                setVisibility(8);
                C11509d.m23576a((Activity) getContext(), this.f30855e);
                this.f30851a = i;
                if (this.f30852b != null) {
                    this.f30852b.mo22264a(i, null);
                }
            } else if (i == -2) {
                this.f30855e.requestFocus();
                EditText editText = this.f30855e;
                InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService("input_method");
                if (!inputMethodManager.showSoftInput(editText, 0)) {
                    editText.postDelayed(new Runnable(inputMethodManager, editText, 0) {

                        /* renamed from: a */
                        final /* synthetic */ InputMethodManager f30862a;

                        /* renamed from: b */
                        final /* synthetic */ View f30863b;

                        /* renamed from: c */
                        final /* synthetic */ int f30864c;

                        public final void run() {
                            this.f30862a.showSoftInput(this.f30863b, this.f30864c);
                        }

                        {
                            this.f30862a = r1;
                            this.f30863b = r2;
                            this.f30864c = r3;
                        }
                    }, 100);
                }
                this.f30851a = i;
                if (this.f30852b != null) {
                    this.f30852b.mo22264a(i, null);
                }
            } else {
                View view = (View) this.f30853c.get(i);
                if (view != null) {
                    setVisibility(0);
                    int size = this.f30853c.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int keyAt = this.f30853c.keyAt(i2);
                        if (keyAt != i) {
                            ((View) this.f30853c.get(keyAt)).setVisibility(8);
                        }
                    }
                    view.setVisibility(0);
                    this.f30851a = i;
                    if (this.f30852b != null) {
                        this.f30852b.mo22264a(i, view);
                    }
                    C11509d.m23576a((Activity) getContext(), this.f30855e);
                }
            }
        }
    }

    public SoftInputResizeFuncLayoutView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (mo22252d()) {
            i3 = 0;
        } else {
            i3 = getCurrentHeight();
        }
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public SoftInputResizeFuncLayoutView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30857g = true;
        this.f30858h = getResources().getDimensionPixelSize(R.dimen.iq);
        ((Activity) getContext()).getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                SoftInputResizeFuncLayoutView.this.mo22252d();
            }
        });
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
