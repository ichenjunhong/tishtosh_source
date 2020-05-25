package android.support.design.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.support.p030v4.content.C0726c;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.C1052q;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1115o;
import android.support.p043v7.view.menu.C1250j;
import android.support.p043v7.view.menu.C1264p.C1265a;
import android.support.p043v7.widget.C1455bd;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.trill.R;

public class BottomNavigationItemView extends FrameLayout implements C1265a {

    /* renamed from: a */
    private static final int[] f1431a = {16842912};

    /* renamed from: b */
    private final int f1432b;

    /* renamed from: c */
    private float f1433c;

    /* renamed from: d */
    private float f1434d;

    /* renamed from: e */
    private float f1435e;

    /* renamed from: f */
    private int f1436f;

    /* renamed from: g */
    private boolean f1437g;

    /* renamed from: h */
    private ImageView f1438h;

    /* renamed from: i */
    private final TextView f1439i;

    /* renamed from: j */
    private final TextView f1440j;

    /* renamed from: k */
    private int f1441k;

    /* renamed from: l */
    private C1250j f1442l;

    /* renamed from: m */
    private ColorStateList f1443m;

    /* renamed from: a */
    public final boolean mo1037a() {
        return false;
    }

    public C1250j getItemData() {
        return this.f1442l;
    }

    public int getItemPosition() {
        return this.f1441k;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setItemBackground(Drawable drawable) {
        C1056u.m3030a((View) this, drawable);
    }

    public void setItemPosition(int i) {
        this.f1441k = i;
    }

    public BottomNavigationItemView(Context context) {
        this(context, null);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f1443m = colorStateList;
        if (this.f1442l != null) {
            setIcon(this.f1442l.getIcon());
        }
    }

    public void setItemBackground(int i) {
        Drawable drawable;
        if (i == 0) {
            drawable = null;
        } else {
            drawable = C0726c.m2091a(getContext(), i);
        }
        setItemBackground(drawable);
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f1439i.setTextColor(colorStateList);
            this.f1440j.setTextColor(colorStateList);
        }
    }

    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.f1442l != null && this.f1442l.isCheckable() && this.f1442l.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f1431a);
        }
        return onCreateDrawableState;
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = C0809a.m2337f(drawable).mutate();
            C0809a.m2327a(drawable, this.f1443m);
        }
        this.f1438h.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        LayoutParams layoutParams = (LayoutParams) this.f1438h.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f1438h.setLayoutParams(layoutParams);
    }

    public void setLabelVisibilityMode(int i) {
        boolean z;
        if (this.f1436f != i) {
            this.f1436f = i;
            if (this.f1442l != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                setChecked(this.f1442l.isChecked());
            }
        }
    }

    public void setShifting(boolean z) {
        boolean z2;
        if (this.f1437g != z) {
            this.f1437g = z;
            if (this.f1442l != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setChecked(this.f1442l.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        C1115o.m3256a(this.f1440j, i);
        m1052a(this.f1439i.getTextSize(), this.f1440j.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        C1115o.m3256a(this.f1439i, i);
        m1052a(this.f1439i.getTextSize(), this.f1440j.getTextSize());
    }

    public void setTitle(CharSequence charSequence) {
        this.f1439i.setText(charSequence);
        this.f1440j.setText(charSequence);
        if (this.f1442l == null || TextUtils.isEmpty(this.f1442l.getContentDescription())) {
            setContentDescription(charSequence);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f1439i.setEnabled(z);
        this.f1440j.setEnabled(z);
        this.f1438h.setEnabled(z);
        if (z) {
            C1056u.m3033a((View) this, C1052q.m3014a(getContext(), BaseNotice.CHECK_PROFILE));
        } else {
            C1056u.m3033a((View) this, (C1052q) null);
        }
    }

    public void setChecked(boolean z) {
        this.f1440j.setPivotX((float) (this.f1440j.getWidth() / 2));
        this.f1440j.setPivotY((float) this.f1440j.getBaseline());
        this.f1439i.setPivotX((float) (this.f1439i.getWidth() / 2));
        this.f1439i.setPivotY((float) this.f1439i.getBaseline());
        switch (this.f1436f) {
            case -1:
                if (!this.f1437g) {
                    if (!z) {
                        m1054a(this.f1438h, this.f1432b, 49);
                        m1053a(this.f1440j, this.f1435e, this.f1435e, 4);
                        m1053a(this.f1439i, 1.0f, 1.0f, 0);
                        break;
                    } else {
                        m1054a(this.f1438h, (int) (((float) this.f1432b) + this.f1433c), 49);
                        m1053a(this.f1440j, 1.0f, 1.0f, 0);
                        m1053a(this.f1439i, this.f1434d, this.f1434d, 4);
                        break;
                    }
                } else {
                    if (z) {
                        m1054a(this.f1438h, this.f1432b, 49);
                        m1053a(this.f1440j, 1.0f, 1.0f, 0);
                    } else {
                        m1054a(this.f1438h, this.f1432b, 17);
                        m1053a(this.f1440j, 0.5f, 0.5f, 4);
                    }
                    this.f1439i.setVisibility(4);
                    break;
                }
            case 0:
                if (z) {
                    m1054a(this.f1438h, this.f1432b, 49);
                    m1053a(this.f1440j, 1.0f, 1.0f, 0);
                } else {
                    m1054a(this.f1438h, this.f1432b, 17);
                    m1053a(this.f1440j, 0.5f, 0.5f, 4);
                }
                this.f1439i.setVisibility(4);
                break;
            case 1:
                if (!z) {
                    m1054a(this.f1438h, this.f1432b, 49);
                    m1053a(this.f1440j, this.f1435e, this.f1435e, 4);
                    m1053a(this.f1439i, 1.0f, 1.0f, 0);
                    break;
                } else {
                    m1054a(this.f1438h, (int) (((float) this.f1432b) + this.f1433c), 49);
                    m1053a(this.f1440j, 1.0f, 1.0f, 0);
                    m1053a(this.f1439i, this.f1434d, this.f1434d, 4);
                    break;
                }
            case 2:
                m1054a(this.f1438h, this.f1432b, 17);
                this.f1440j.setVisibility(8);
                this.f1439i.setVisibility(8);
                break;
        }
        refreshDrawableState();
        setSelected(z);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m1052a(float f, float f2) {
        this.f1433c = f - f2;
        this.f1434d = (f2 * 1.0f) / f;
        this.f1435e = (f * 1.0f) / f2;
    }

    /* renamed from: a */
    public final void mo1036a(C1250j jVar, int i) {
        int i2;
        this.f1442l = jVar;
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setIcon(jVar.getIcon());
        setTitle(jVar.getTitle());
        setId(jVar.getItemId());
        if (!TextUtils.isEmpty(jVar.getContentDescription())) {
            setContentDescription(jVar.getContentDescription());
        }
        C1455bd.m5087a(this, jVar.getTooltipText());
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
    }

    /* renamed from: a */
    private static void m1054a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    public BottomNavigationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1441k = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(R.layout.j0, this, true);
        setBackgroundResource(R.drawable.x7);
        this.f1432b = resources.getDimensionPixelSize(R.dimen.fv);
        this.f1438h = (ImageView) findViewById(R.id.aqa);
        this.f1439i = (TextView) findViewById(R.id.cpe);
        this.f1440j = (TextView) findViewById(R.id.b6f);
        C1056u.m3043b((View) this.f1439i, 2);
        C1056u.m3043b((View) this.f1440j, 2);
        setFocusable(true);
        m1052a(this.f1439i.getTextSize(), this.f1440j.getTextSize());
    }

    /* renamed from: a */
    private static void m1053a(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }
}
