package android.support.p043v7.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.p043v7.view.menu.C1246h.C1248b;
import android.support.p043v7.view.menu.C1264p.C1265a;
import android.support.p043v7.widget.ActionMenuView.C1287a;
import android.support.p043v7.widget.AppCompatTextView;
import android.support.p043v7.widget.C1407ac;
import android.support.p043v7.widget.C1455bd;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;

/* renamed from: android.support.v7.view.menu.ActionMenuItemView */
public class ActionMenuItemView extends AppCompatTextView implements C1265a, C1287a, OnClickListener {

    /* renamed from: b */
    C1250j f4089b;

    /* renamed from: c */
    C1248b f4090c;

    /* renamed from: d */
    C1232b f4091d;

    /* renamed from: e */
    private CharSequence f4092e;

    /* renamed from: f */
    private Drawable f4093f;

    /* renamed from: g */
    private C1407ac f4094g;

    /* renamed from: h */
    private boolean f4095h;

    /* renamed from: i */
    private boolean f4096i;

    /* renamed from: j */
    private int f4097j;

    /* renamed from: k */
    private int f4098k;

    /* renamed from: l */
    private int f4099l;

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$a */
    class C1231a extends C1407ac {
        /* renamed from: a */
        public final C1268s mo4009a() {
            if (ActionMenuItemView.this.f4091d != null) {
                return ActionMenuItemView.this.f4091d.mo4011a();
            }
            return null;
        }

        /* renamed from: b */
        public final boolean mo4010b() {
            if (ActionMenuItemView.this.f4090c == null || !ActionMenuItemView.this.f4090c.mo4012a(ActionMenuItemView.this.f4089b)) {
                return false;
            }
            C1268s a = mo4009a();
            if (a == null || !a.mo4077e()) {
                return false;
            }
            return true;
        }

        public C1231a() {
            super(ActionMenuItemView.this);
        }
    }

    /* renamed from: android.support.v7.view.menu.ActionMenuItemView$b */
    public static abstract class C1232b {
        /* renamed from: a */
        public abstract C1268s mo4011a();
    }

    /* renamed from: a */
    public final boolean mo1037a() {
        return true;
    }

    public C1250j getItemData() {
        return this.f4089b;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    /* renamed from: d */
    public final boolean mo3995d() {
        return mo3993b();
    }

    /* renamed from: b */
    public final boolean mo3993b() {
        if (!TextUtils.isEmpty(getText())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo3994c() {
        if (!mo3993b() || this.f4089b.getIcon() != null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private boolean m3743e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i >= 480 || ((i >= 640 && i2 >= 480) || configuration.orientation == 2)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void m3744f() {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f4092e);
        if (this.f4093f != null && (!this.f4089b.mo4188i() || (!this.f4095h && !this.f4096i))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence3 = null;
        if (z3) {
            charSequence = this.f4092e;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence contentDescription = this.f4089b.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            if (z3) {
                charSequence2 = null;
            } else {
                charSequence2 = this.f4089b.getTitle();
            }
            setContentDescription(charSequence2);
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f4089b.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z3) {
                charSequence3 = this.f4089b.getTitle();
            }
            C1455bd.m5087a(this, charSequence3);
            return;
        }
        C1455bd.m5087a(this, tooltipText);
    }

    public void setItemInvoker(C1248b bVar) {
        this.f4090c = bVar;
    }

    public void setPopupCallback(C1232b bVar) {
        this.f4091d = bVar;
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    public void setTitle(CharSequence charSequence) {
        this.f4092e = charSequence;
        m3744f();
    }

    public void onClick(View view) {
        if (this.f4090c != null) {
            this.f4090c.mo4012a(this.f4089b);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4095h = m3743e();
        m3744f();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f4089b.hasSubMenu() || this.f4094g == null || !this.f4094g.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setExpandedFormat(boolean z) {
        if (this.f4096i != z) {
            this.f4096i = z;
            if (this.f4089b != null) {
                C1250j jVar = this.f4089b;
                jVar.f4252d.mo4124b(jVar);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4093f = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > this.f4099l) {
                float f = ((float) this.f4099l) / ((float) intrinsicWidth);
                intrinsicWidth = this.f4099l;
                intrinsicHeight = (int) (((float) intrinsicHeight) * f);
            }
            if (intrinsicHeight > this.f4099l) {
                float f2 = ((float) this.f4099l) / ((float) intrinsicHeight);
                intrinsicHeight = this.f4099l;
                intrinsicWidth = (int) (((float) intrinsicWidth) * f2);
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, null, null, null);
        m3744f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo1036a(C1250j jVar, int i) {
        int i2;
        this.f4089b = jVar;
        setIcon(jVar.getIcon());
        setTitle(jVar.mo4161a((C1265a) this));
        setId(jVar.getItemId());
        if (jVar.isVisible()) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        setVisibility(i2);
        setEnabled(jVar.isEnabled());
        if (jVar.hasSubMenu() && this.f4094g == null) {
            this.f4094g = new C1231a();
        }
    }

    public void onMeasure(int i, int i2) {
        int i3;
        boolean b = mo3993b();
        if (b && this.f4098k >= 0) {
            super.setPadding(this.f4098k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, this.f4097j);
        } else {
            i3 = this.f4097j;
        }
        if (mode != 1073741824 && this.f4097j > 0 && measuredWidth < i3) {
            super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!b && this.f4093f != null) {
            super.setPadding((getMeasuredWidth() - this.f4093f.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        this.f4095h = m3743e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071}, i, 0);
        this.f4097j = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f4099l = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4098k = -1;
        setSaveEnabled(false);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f4098k = i;
        super.setPadding(i, i2, i3, i4);
    }
}
