package android.support.p043v7.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1054s;
import android.support.p030v4.widget.C1095b;
import android.support.p030v4.widget.C1115o;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import com.bytedance.apm.C8936b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;

/* renamed from: android.support.v7.widget.AppCompatButton */
public class AppCompatButton extends Button implements C1054s, C1095b {

    /* renamed from: b */
    private final C1478e f4455b;

    /* renamed from: c */
    private final C1491m f4456c;

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4455b != null) {
            return this.f4455b.mo5757a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4455b != null) {
            return this.f4455b.mo5763b();
        }
        return null;
    }

    public int getAutoSizeMaxTextSize() {
        if (f3483a) {
            return super.getAutoSizeMaxTextSize();
        }
        if (this.f4456c != null) {
            return this.f4456c.mo5802g();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (f3483a) {
            return super.getAutoSizeMinTextSize();
        }
        if (this.f4456c != null) {
            return this.f4456c.mo5801f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (f3483a) {
            return super.getAutoSizeStepGranularity();
        }
        if (this.f4456c != null) {
            return this.f4456c.mo5800e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (f3483a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        if (this.f4456c != null) {
            return this.f4456c.mo5803h();
        }
        return new int[0];
    }

    public int getAutoSizeTextType() {
        if (f3483a) {
            if (super.getAutoSizeTextType() == 1) {
                return 1;
            }
            return 0;
        } else if (this.f4456c != null) {
            return this.f4456c.mo5799d();
        } else {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        String str;
        try {
            super.drawableStateChanged();
            if (this.f4455b != null) {
                this.f4455b.mo5764c();
            }
            if (this.f4456c != null) {
                this.f4456c.mo5788a();
            }
        } catch (Exception e) {
            C32458a.m75148a((Throwable) e);
            JSONObject jSONObject = new JSONObject();
            View view = this;
            jSONObject.put("targetViewId", view.getId());
            jSONObject.put("targetViewClassName", view.getClass().getName());
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                jSONObject.put("targetParentViewId", ((ViewGroup) parent).getId());
                jSONObject.put("targetParentViewClassName", ((ViewGroup) parent).getClass().getName());
            }
            Activity g = C11016e.m22312g();
            if (g != null) {
                str = g.getClass().getName();
            } else {
                str = "";
            }
            jSONObject.put("currentActivity", str);
            jSONObject.put("errorMsg", Log.getStackTraceString(e));
            C8936b.m17657a("detail_view_animation_crash", (JSONObject) null, (JSONObject) null, jSONObject);
        } catch (Throwable unused) {
        }
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C1115o.m3254a((TextView) this, callback));
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4455b != null) {
            this.f4455b.mo5761a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4455b != null) {
            this.f4455b.mo5758a(i);
        }
    }

    public void setSupportAllCaps(boolean z) {
        if (this.f4456c != null) {
            this.f4456c.mo5794a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4455b != null) {
            this.f4455b.mo5759a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4455b != null) {
            this.f4455b.mo5760a(mode);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f3483a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        if (this.f4456c != null) {
            this.f4456c.mo5789a(i);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.dr);
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f4456c != null) {
            this.f4456c.mo5792a(context, i);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (f3483a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        if (this.f4456c != null) {
            this.f4456c.mo5796a(iArr, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (f3483a) {
            super.setTextSize(i, f);
            return;
        }
        if (this.f4456c != null) {
            this.f4456c.mo5790a(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C1447ay.m5028a(context), attributeSet, i);
        this.f4455b = new C1478e(this);
        this.f4455b.mo5762a(attributeSet, i);
        this.f4456c = new C1491m(this);
        this.f4456c.mo5793a(attributeSet, i);
        this.f4456c.mo5788a();
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (this.f4456c != null && !f3483a && this.f4456c.mo5798c()) {
            this.f4456c.mo5797b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (f3483a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        if (this.f4456c != null) {
            this.f4456c.mo5791a(i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f4456c != null) {
            this.f4456c.mo5795a(z, i, i2, i3, i4);
        }
    }
}
