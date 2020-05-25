package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.p035a.C0720f;
import android.support.p030v4.content.p035a.C0720f.C0721a;
import android.support.p043v7.p044a.p045a.C1124a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.bb */
public final class C1451bb {

    /* renamed from: a */
    final TypedArray f5231a;

    /* renamed from: b */
    private final Context f5232b;

    /* renamed from: c */
    private TypedValue f5233c;

    /* renamed from: a */
    public final void mo5653a() {
        this.f5231a.recycle();
    }

    /* renamed from: c */
    public final CharSequence mo5658c(int i) {
        return this.f5231a.getText(i);
    }

    /* renamed from: d */
    public final String mo5660d(int i) {
        return this.f5231a.getString(i);
    }

    /* renamed from: f */
    public final boolean mo5664f(int i) {
        return this.f5231a.hasValue(i);
    }

    /* renamed from: b */
    public final Drawable mo5656b(int i) {
        if (this.f5231a.hasValue(i)) {
            int resourceId = this.f5231a.getResourceId(i, 0);
            if (resourceId != 0) {
                return C1480g.m5205a().mo5771a(this.f5232b, resourceId, true);
            }
        }
        return null;
    }

    /* renamed from: e */
    public final ColorStateList mo5662e(int i) {
        if (this.f5231a.hasValue(i)) {
            int resourceId = this.f5231a.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C1124a.m3313a(this.f5232b, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f5231a.getColorStateList(i);
    }

    /* renamed from: a */
    public final Drawable mo5652a(int i) {
        if (this.f5231a.hasValue(i)) {
            int resourceId = this.f5231a.getResourceId(i, 0);
            if (resourceId != 0) {
                return C1124a.m3315b(this.f5232b, resourceId);
            }
        }
        return this.f5231a.getDrawable(i);
    }

    private C1451bb(Context context, TypedArray typedArray) {
        this.f5232b = context;
        this.f5231a = typedArray;
    }

    /* renamed from: a */
    public final float mo5649a(int i, float f) {
        return this.f5231a.getFloat(i, f);
    }

    /* renamed from: b */
    public final int mo5655b(int i, int i2) {
        return this.f5231a.getColor(i, i2);
    }

    /* renamed from: c */
    public final int mo5657c(int i, int i2) {
        return this.f5231a.getInteger(i, i2);
    }

    /* renamed from: d */
    public final int mo5659d(int i, int i2) {
        return this.f5231a.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: e */
    public final int mo5661e(int i, int i2) {
        return this.f5231a.getDimensionPixelSize(i, i2);
    }

    /* renamed from: f */
    public final int mo5663f(int i, int i2) {
        return this.f5231a.getLayoutDimension(i, i2);
    }

    /* renamed from: g */
    public final int mo5665g(int i, int i2) {
        return this.f5231a.getResourceId(i, i2);
    }

    /* renamed from: a */
    public final int mo5650a(int i, int i2) {
        return this.f5231a.getInt(i, i2);
    }

    /* renamed from: a */
    public final boolean mo5654a(int i, boolean z) {
        return this.f5231a.getBoolean(i, z);
    }

    /* renamed from: a */
    public static C1451bb m5030a(Context context, int i, int[] iArr) {
        return new C1451bb(context, context.obtainStyledAttributes(i, iArr));
    }

    /* renamed from: a */
    public static C1451bb m5031a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C1451bb(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: a */
    public final Typeface mo5651a(int i, int i2, C0721a aVar) {
        int resourceId = this.f5231a.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f5233c == null) {
            this.f5233c = new TypedValue();
        }
        return C0720f.m2073a(this.f5232b, resourceId, this.f5233c, i2, aVar);
    }

    /* renamed from: a */
    public static C1451bb m5032a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C1451bb(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
