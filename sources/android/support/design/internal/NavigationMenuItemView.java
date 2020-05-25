package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.StateListDrawable;
import android.support.p030v4.content.p035a.C0720f;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.C1002a;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.view.p041a.C1008c;
import android.support.p030v4.widget.C1115o;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1264p.C1265a;
import android.support.p043v7.widget.C1455bd;
import android.support.p043v7.widget.LinearLayoutCompat.LayoutParams;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

public class NavigationMenuItemView extends ForegroundLinearLayout implements C1265a {

    /* renamed from: h */
    private static final int[] f1482h = {16842912};

    /* renamed from: c */
    boolean f1483c;

    /* renamed from: d */
    final CheckedTextView f1484d;

    /* renamed from: e */
    FrameLayout f1485e;

    /* renamed from: i */
    private final int f1486i;

    /* renamed from: j */
    private boolean f1487j;

    /* renamed from: k */
    private C1250j f1488k;

    /* renamed from: l */
    private ColorStateList f1489l;

    /* renamed from: m */
    private boolean f1490m;

    /* renamed from: n */
    private Drawable f1491n;

    /* renamed from: o */
    private final C1002a f1492o;

    /* renamed from: a */
    public final boolean mo1037a() {
        return false;
    }

    public C1250j getItemData() {
        return this.f1488k;
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.f1487j = z;
    }

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIconPadding(int i) {
        this.f1484d.setCompoundDrawablePadding(i);
    }

    public void setTextAppearance(int i) {
        C1115o.m3256a((TextView) this.f1484d, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f1484d.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f1484d.setText(charSequence);
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.f1484d.setChecked(z);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f1488k != null && this.f1488k.isCheckable() && this.f1488k.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f1482h);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.f1483c != z) {
            this.f1483c = z;
            C1002a.m2875a((View) this.f1484d, 2048);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setIconTintList(ColorStateList colorStateList) {
        boolean z;
        this.f1489l = colorStateList;
        if (this.f1489l != null) {
            z = true;
        } else {
            z = false;
        }
        this.f1490m = z;
        if (this.f1488k != null) {
            setIcon(this.f1488k.getIcon());
        }
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f1485e == null) {
                this.f1485e = (FrameLayout) ((ViewStub) findViewById(R.id.a4s)).inflate();
            }
            this.f1485e.removeAllViews();
            this.f1485e.addView(view);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f1490m) {
                ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = C0809a.m2337f(drawable).mutate();
                C0809a.m2327a(drawable, this.f1489l);
            }
            drawable.setBounds(0, 0, this.f1486i, this.f1486i);
        } else if (this.f1487j) {
            if (this.f1491n == null) {
                this.f1491n = C0720f.m2075a(getResources(), R.drawable.b5c, getContext().getTheme());
                if (this.f1491n != null) {
                    this.f1491n.setBounds(0, 0, this.f1486i, this.f1486i);
                }
            }
            drawable = this.f1491n;
        }
        C1115o.m3258a((TextView) this.f1484d, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo1036a(C1250j jVar, int i) {
        int i2;
        StateListDrawable stateListDrawable;
        this.f1488k = jVar;
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        boolean z = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.fu, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f1482h, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C1056u.m3030a((View) this, (Drawable) stateListDrawable);
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        C1455bd.m5087a(this, jVar.getTooltipText());
        if (!(this.f1488k.getTitle() == null && this.f1488k.getIcon() == null && this.f1488k.getActionView() != null)) {
            z = false;
        }
        if (z) {
            this.f1484d.setVisibility(8);
            if (this.f1485e != null) {
                LayoutParams layoutParams = (LayoutParams) this.f1485e.getLayoutParams();
                layoutParams.width = -1;
                this.f1485e.setLayoutParams(layoutParams);
            }
        } else {
            this.f1484d.setVisibility(0);
            if (this.f1485e != null) {
                LayoutParams layoutParams2 = (LayoutParams) this.f1485e.getLayoutParams();
                layoutParams2.width = -2;
                this.f1485e.setLayoutParams(layoutParams2);
            }
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1492o = new C1002a() {
            /* renamed from: a */
            public final void mo1119a(View view, C1008c cVar) {
                super.mo1119a(view, cVar);
                cVar.mo3135a(NavigationMenuItemView.this.f1483c);
            }
        };
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.jb, this, true);
        this.f1486i = context.getResources().getDimensionPixelSize(R.dimen.g9);
        this.f1484d = (CheckedTextView) findViewById(R.id.a4t);
        this.f1484d.setDuplicateParentStateEnabled(true);
        C1056u.m3031a((View) this.f1484d, this.f1492o);
    }
}
