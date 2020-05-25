package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.p037e.C0765c;
import android.support.p030v4.p037e.C0765c.C0766a;
import android.support.p030v4.view.C1054s;
import android.support.p030v4.widget.C1095b;
import android.support.p030v4.widget.C1115o;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: android.support.v7.widget.AppCompatTextView */
public class AppCompatTextView extends TextView implements C1054s, C1095b {

    /* renamed from: b */
    private final C1478e f4493b;

    /* renamed from: c */
    private final C1491m f4494c;

    /* renamed from: d */
    private Future<C0765c> f4495d;

    public CharSequence getText() {
        mo1037a();
        return super.getText();
    }

    public C0766a getTextMetricsParamsCompat() {
        return C1115o.m3262c(this);
    }

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4493b != null) {
            return this.f4493b.mo5757a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4493b != null) {
            return this.f4493b.mo5763b();
        }
        return null;
    }

    /* renamed from: a */
    private void mo1037a() {
        if (this.f4495d != null) {
            try {
                Future<C0765c> future = this.f4495d;
                this.f4495d = null;
                C1115o.m3259a((TextView) this, (C0765c) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4493b != null) {
            this.f4493b.mo5764c();
        }
        if (this.f4494c != null) {
            this.f4494c.mo5788a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (f3483a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f4494c != null) {
            return this.f4494c.mo5802g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f3483a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f4494c != null) {
            return this.f4494c.mo5801f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f3483a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f4494c != null) {
            return this.f4494c.mo5800e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f3483a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f4494c != null) {
            return this.f4494c.mo5803h();
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (f3483a) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        } else if (this.f4494c != null) {
            return this.f4494c.mo5799d();
        } else {
            return 0;
        }
    }

    public void setLineHeight(int i) {
        C1115o.m3265e(this, i);
    }

    public void setPrecomputedText(C0765c cVar) {
        C1115o.m3259a((TextView) this, cVar);
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1115o.m3254a((TextView) this, callback));
    }

    public void setTextFuture(Future<C0765c> future) {
        this.f4495d = future;
        requestLayout();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return C1486h.m5224a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4493b != null) {
            this.f4493b.mo5761a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4493b != null) {
            this.f4493b.mo5758a(i);
        }
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C1115o.m3263c(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C1115o.m3264d(this, i);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4493b != null) {
            this.f4493b.mo5759a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4493b != null) {
            this.f4493b.mo5760a(mode);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f3483a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        if (this.f4494c != null) {
            this.f4494c.mo5789a(i);
        }
    }

    public void setTextMetricsParamsCompat(C0766a aVar) {
        int i;
        if (VERSION.SDK_INT >= 18) {
            TextDirectionHeuristic textDirectionHeuristic = aVar.f2644b;
            if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
                if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                    i = 2;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                    i = 3;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                    i = 4;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                    i = 5;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                    i = 6;
                } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                    i = 7;
                }
                setTextDirection(i);
            }
            i = 1;
            setTextDirection(i);
        }
        if (VERSION.SDK_INT < 23) {
            float textScaleX = aVar.f2643a.getTextScaleX();
            getPaint().set(aVar.f2643a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.f2643a);
        setBreakStrategy(aVar.f2645c);
        setHyphenationFrequency(aVar.f2646d);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        mo1037a();
        super.onMeasure(i, i2);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f4494c != null) {
            this.f4494c.mo5792a(context, i);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (f3483a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        if (this.f4494c != null) {
            this.f4494c.mo5796a(iArr, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (f3483a) {
            super.setTextSize(i, f);
            return;
        }
        if (this.f4494c != null) {
            this.f4494c.mo5790a(i, f);
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C1447ay.m5028a(context), attributeSet, i);
        this.f4493b = new C1478e(this);
        this.f4493b.mo5762a(attributeSet, i);
        this.f4494c = new C1491m(this);
        this.f4494c.mo5793a(attributeSet, i);
        this.f4494c.mo5788a();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f4494c != null && !f3483a && this.f4494c.mo5798c()) {
            this.f4494c.mo5797b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (f3483a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        if (this.f4494c != null) {
            this.f4494c.mo5791a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f4494c != null) {
            this.f4494c.mo5795a(z, i, i2, i3, i4);
        }
    }
}
