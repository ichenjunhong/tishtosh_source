package android.support.design.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.internal.C0456f;
import android.support.design.internal.C0457g;
import android.support.design.p026d.C0423a;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.C1056u;
import android.support.p030v4.widget.C1115o;
import android.support.p043v7.p044a.p045a.C1124a;
import android.support.p043v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

public class MaterialButton extends AppCompatButton {

    /* renamed from: b */
    private final C0419b f1339b;

    /* renamed from: c */
    private int f1340c;

    /* renamed from: d */
    private Mode f1341d;

    /* renamed from: e */
    private ColorStateList f1342e;

    /* renamed from: f */
    private Drawable f1343f;

    /* renamed from: g */
    private int f1344g;

    /* renamed from: h */
    private int f1345h;

    /* renamed from: i */
    private int f1346i;

    public Drawable getIcon() {
        return this.f1343f;
    }

    public int getIconGravity() {
        return this.f1346i;
    }

    public int getIconPadding() {
        return this.f1340c;
    }

    public int getIconSize() {
        return this.f1344g;
    }

    public ColorStateList getIconTint() {
        return this.f1342e;
    }

    public Mode getIconTintMode() {
        return this.f1341d;
    }

    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    public Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    /* renamed from: b */
    private boolean m1026b() {
        if (this.f1339b == null || this.f1339b.f1369w) {
            return false;
        }
        return true;
    }

    public int getCornerRadius() {
        if (m1026b()) {
            return this.f1339b.f1353g;
        }
        return 0;
    }

    public ColorStateList getRippleColor() {
        if (m1026b()) {
            return this.f1339b.f1358l;
        }
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (m1026b()) {
            return this.f1339b.f1357k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m1026b()) {
            return this.f1339b.f1354h;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        if (m1026b()) {
            return this.f1339b.f1356j;
        }
        return super.getSupportBackgroundTintList();
    }

    public Mode getSupportBackgroundTintMode() {
        if (m1026b()) {
            return this.f1339b.f1355i;
        }
        return super.getSupportBackgroundTintMode();
    }

    /* renamed from: a */
    private void m1025a() {
        int i;
        int i2;
        if (this.f1343f != null) {
            this.f1343f = this.f1343f.mutate();
            C0809a.m2327a(this.f1343f, this.f1342e);
            if (this.f1341d != null) {
                C0809a.m2330a(this.f1343f, this.f1341d);
            }
            if (this.f1344g != 0) {
                i = this.f1344g;
            } else {
                i = this.f1343f.getIntrinsicWidth();
            }
            if (this.f1344g != 0) {
                i2 = this.f1344g;
            } else {
                i2 = this.f1343f.getIntrinsicHeight();
            }
            this.f1343f.setBounds(this.f1345h, 0, this.f1345h + i, i2);
        }
        C1115o.m3258a((TextView) this, this.f1343f, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    public void setBackgroundTintMode(Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setIconGravity(int i) {
        this.f1346i = i;
    }

    /* access modifiers changed from: 0000 */
    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1124a.m3315b(getContext(), i);
        } else {
            drawable = null;
        }
        setBackgroundDrawable(drawable);
    }

    public void setIcon(Drawable drawable) {
        if (this.f1343f != drawable) {
            this.f1343f = drawable;
            m1025a();
        }
    }

    public void setIconPadding(int i) {
        if (this.f1340c != i) {
            this.f1340c = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C1124a.m3315b(getContext(), i);
        } else {
            drawable = null;
        }
        setIcon(drawable);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f1342e != colorStateList) {
            this.f1342e = colorStateList;
            m1025a();
        }
    }

    public void setIconTintMode(Mode mode) {
        if (this.f1341d != mode) {
            this.f1341d = mode;
            m1025a();
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(C1124a.m3313a(getContext(), i));
    }

    public void setCornerRadiusResource(int i) {
        if (m1026b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        } else if (this.f1344g != i) {
            this.f1344g = i;
            m1025a();
        }
    }

    public void setRippleColorResource(int i) {
        if (m1026b()) {
            setRippleColor(C1124a.m3313a(getContext(), i));
        }
    }

    public void setStrokeColorResource(int i) {
        if (m1026b()) {
            setStrokeColor(C1124a.m3313a(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m1026b()) {
            C0419b bVar = this.f1339b;
            if (bVar.f1354h != i) {
                bVar.f1354h = i;
                bVar.f1359m.setStrokeWidth((float) i);
                bVar.mo1019c();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m1026b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public void setBackgroundColor(int i) {
        if (m1026b()) {
            C0419b bVar = this.f1339b;
            if (!C0419b.f1347a || bVar.f1366t == null) {
                if (!C0419b.f1347a && bVar.f1362p != null) {
                    bVar.f1362p.setColor(i);
                }
                return;
            }
            bVar.f1366t.setColor(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (m1026b()) {
            if (drawable != getBackground()) {
                C0419b bVar = this.f1339b;
                bVar.f1369w = true;
                bVar.f1348b.setSupportBackgroundTintList(bVar.f1356j);
                bVar.f1348b.setSupportBackgroundTintMode(bVar.f1355i);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m1026b()) {
            C0419b bVar = this.f1339b;
            if (bVar.f1358l != colorStateList) {
                bVar.f1358l = colorStateList;
                if (C0419b.f1347a && (bVar.f1348b.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) bVar.f1348b.getBackground()).setColor(colorStateList);
                } else if (!C0419b.f1347a && bVar.f1365s != null) {
                    C0809a.m2327a(bVar.f1365s, colorStateList);
                }
            }
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m1026b()) {
            C0419b bVar = this.f1339b;
            if (bVar.f1357k != colorStateList) {
                bVar.f1357k = colorStateList;
                Paint paint = bVar.f1359m;
                int i = 0;
                if (colorStateList != null) {
                    i = colorStateList.getColorForState(bVar.f1348b.getDrawableState(), 0);
                }
                paint.setColor(i);
                bVar.mo1019c();
            }
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m1026b()) {
            C0419b bVar = this.f1339b;
            if (bVar.f1356j != colorStateList) {
                bVar.f1356j = colorStateList;
                if (C0419b.f1347a) {
                    bVar.mo1017a();
                } else if (bVar.f1363q != null) {
                    C0809a.m2327a(bVar.f1363q, bVar.f1356j);
                }
            }
        } else if (this.f1339b != null) {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (m1026b()) {
            C0419b bVar = this.f1339b;
            if (bVar.f1355i != mode) {
                bVar.f1355i = mode;
                if (C0419b.f1347a) {
                    bVar.mo1017a();
                } else if (!(bVar.f1363q == null || bVar.f1355i == null)) {
                    C0809a.m2330a(bVar.f1363q, bVar.f1355i);
                }
            }
        } else if (this.f1339b != null) {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (VERSION.SDK_INT < 21 && m1026b()) {
            C0419b bVar = this.f1339b;
            if (canvas != null && bVar.f1357k != null && bVar.f1354h > 0) {
                bVar.f1360n.set(bVar.f1348b.getBackground().getBounds());
                bVar.f1361o.set(((float) bVar.f1360n.left) + (((float) bVar.f1354h) / 2.0f) + ((float) bVar.f1349c), ((float) bVar.f1360n.top) + (((float) bVar.f1354h) / 2.0f) + ((float) bVar.f1351e), (((float) bVar.f1360n.right) - (((float) bVar.f1354h) / 2.0f)) - ((float) bVar.f1350d), (((float) bVar.f1360n.bottom) - (((float) bVar.f1354h) / 2.0f)) - ((float) bVar.f1352f));
                float f = ((float) bVar.f1353g) - (((float) bVar.f1354h) / 2.0f);
                canvas.drawRoundRect(bVar.f1361o, f, f, bVar.f1359m);
            }
        }
    }

    public void setCornerRadius(int i) {
        GradientDrawable gradientDrawable;
        if (m1026b()) {
            C0419b bVar = this.f1339b;
            if (bVar.f1353g != i) {
                bVar.f1353g = i;
                if (C0419b.f1347a && bVar.f1366t != null && bVar.f1367u != null && bVar.f1368v != null) {
                    if (VERSION.SDK_INT == 21) {
                        GradientDrawable gradientDrawable2 = null;
                        if (!C0419b.f1347a || bVar.f1348b.getBackground() == null) {
                            gradientDrawable = null;
                        } else {
                            gradientDrawable = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) bVar.f1348b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(0);
                        }
                        float f = ((float) i) + 1.0E-5f;
                        gradientDrawable.setCornerRadius(f);
                        if (C0419b.f1347a && bVar.f1348b.getBackground() != null) {
                            gradientDrawable2 = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) ((RippleDrawable) bVar.f1348b.getBackground()).getDrawable(0)).getDrawable()).getDrawable(1);
                        }
                        gradientDrawable2.setCornerRadius(f);
                    }
                    float f2 = ((float) i) + 1.0E-5f;
                    bVar.f1366t.setCornerRadius(f2);
                    bVar.f1367u.setCornerRadius(f2);
                    bVar.f1368v.setCornerRadius(f2);
                } else if (!(C0419b.f1347a || bVar.f1362p == null || bVar.f1364r == null)) {
                    float f3 = ((float) i) + 1.0E-5f;
                    bVar.f1362p.setCornerRadius(f3);
                    bVar.f1364r.setCornerRadius(f3);
                    bVar.f1348b.invalidate();
                }
            }
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.to);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        if (this.f1343f != null && this.f1346i == 2) {
            int measureText = (int) getPaint().measureText(getText().toString());
            if (this.f1344g == 0) {
                i3 = this.f1343f.getIntrinsicWidth();
            } else {
                i3 = this.f1344g;
            }
            int measuredWidth = (((((getMeasuredWidth() - measureText) - C1056u.m3063j(this)) - i3) - this.f1340c) - C1056u.m3061i(this)) / 2;
            boolean z = true;
            if (C1056u.m3055f(this) != 1) {
                z = false;
            }
            if (z) {
                measuredWidth = -measuredWidth;
            }
            if (this.f1345h != measuredWidth) {
                this.f1345h = measuredWidth;
                m1025a();
            }
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2;
        Drawable drawable;
        super(context, attributeSet, i);
        TypedArray a = C0456f.m1107a(context, attributeSet, new int[]{16843191, 16843192, 16843193, 16843194, R.attr.by, R.attr.bz, R.attr.ii, R.attr.nl, R.attr.no, R.attr.nq, R.attr.nr, R.attr.nu, R.attr.nv, R.attr.zj, R.attr.a3l, R.attr.a3m}, i, R.style.ra, new int[0]);
        this.f1340c = a.getDimensionPixelSize(9, 0);
        this.f1341d = C0457g.m1116a(a.getInt(12, -1), Mode.SRC_IN);
        this.f1342e = C0423a.m1032a(getContext(), a, 11);
        this.f1343f = C0423a.m1033b(getContext(), a, 7);
        this.f1346i = a.getInteger(8, 1);
        this.f1344g = a.getDimensionPixelSize(10, 0);
        this.f1339b = new C0419b(this);
        C0419b bVar = this.f1339b;
        bVar.f1349c = a.getDimensionPixelOffset(0, 0);
        bVar.f1350d = a.getDimensionPixelOffset(1, 0);
        bVar.f1351e = a.getDimensionPixelOffset(2, 0);
        bVar.f1352f = a.getDimensionPixelOffset(3, 0);
        bVar.f1353g = a.getDimensionPixelSize(6, 0);
        bVar.f1354h = a.getDimensionPixelSize(15, 0);
        bVar.f1355i = C0457g.m1116a(a.getInt(5, -1), Mode.SRC_IN);
        bVar.f1356j = C0423a.m1032a(bVar.f1348b.getContext(), a, 4);
        bVar.f1357k = C0423a.m1032a(bVar.f1348b.getContext(), a, 14);
        bVar.f1358l = C0423a.m1032a(bVar.f1348b.getContext(), a, 13);
        bVar.f1359m.setStyle(Style.STROKE);
        bVar.f1359m.setStrokeWidth((float) bVar.f1354h);
        Paint paint = bVar.f1359m;
        if (bVar.f1357k != null) {
            i2 = bVar.f1357k.getColorForState(bVar.f1348b.getDrawableState(), 0);
        } else {
            i2 = 0;
        }
        paint.setColor(i2);
        int i3 = C1056u.m3061i(bVar.f1348b);
        int paddingTop = bVar.f1348b.getPaddingTop();
        int j = C1056u.m3063j(bVar.f1348b);
        int paddingBottom = bVar.f1348b.getPaddingBottom();
        MaterialButton materialButton = bVar.f1348b;
        if (C0419b.f1347a) {
            drawable = bVar.mo1018b();
        } else {
            bVar.f1362p = new GradientDrawable();
            bVar.f1362p.setCornerRadius(((float) bVar.f1353g) + 1.0E-5f);
            bVar.f1362p.setColor(-1);
            bVar.f1363q = C0809a.m2337f(bVar.f1362p);
            C0809a.m2327a(bVar.f1363q, bVar.f1356j);
            if (bVar.f1355i != null) {
                C0809a.m2330a(bVar.f1363q, bVar.f1355i);
            }
            bVar.f1364r = new GradientDrawable();
            bVar.f1364r.setCornerRadius(((float) bVar.f1353g) + 1.0E-5f);
            bVar.f1364r.setColor(-1);
            bVar.f1365s = C0809a.m2337f(bVar.f1364r);
            C0809a.m2327a(bVar.f1365s, bVar.f1358l);
            drawable = bVar.mo1016a(new LayerDrawable(new Drawable[]{bVar.f1363q, bVar.f1365s}));
        }
        materialButton.setInternalBackground(drawable);
        C1056u.m3044b(bVar.f1348b, i3 + bVar.f1349c, paddingTop + bVar.f1351e, j + bVar.f1350d, paddingBottom + bVar.f1352f);
        a.recycle();
        setCompoundDrawablePadding(this.f1340c);
        m1025a();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (VERSION.SDK_INT == 21 && this.f1339b != null) {
            C0419b bVar = this.f1339b;
            int i5 = i4 - i2;
            int i6 = i3 - i;
            if (bVar.f1368v != null) {
                bVar.f1368v.setBounds(bVar.f1349c, bVar.f1351e, i6 - bVar.f1350d, i5 - bVar.f1352f);
            }
        }
    }
}
