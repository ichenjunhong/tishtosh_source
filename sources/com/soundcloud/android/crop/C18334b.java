package com.soundcloud.android.crop;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.View;
import com.ss.android.ugc.trill.R;

/* renamed from: com.soundcloud.android.crop.b */
final class C18334b {

    /* renamed from: a */
    RectF f50620a;

    /* renamed from: b */
    Rect f50621b;

    /* renamed from: c */
    Matrix f50622c;

    /* renamed from: d */
    RectF f50623d;

    /* renamed from: e */
    final Paint f50624e = new Paint();

    /* renamed from: f */
    final Paint f50625f = new Paint();

    /* renamed from: g */
    final Paint f50626g = new Paint();

    /* renamed from: h */
    View f50627h;

    /* renamed from: i */
    boolean f50628i;

    /* renamed from: j */
    boolean f50629j;

    /* renamed from: k */
    int f50630k;

    /* renamed from: l */
    C18336b f50631l = C18336b.None;

    /* renamed from: m */
    C18335a f50632m = C18335a.Changing;

    /* renamed from: n */
    boolean f50633n;

    /* renamed from: o */
    float f50634o;

    /* renamed from: p */
    float f50635p;

    /* renamed from: q */
    float f50636q;

    /* renamed from: r */
    public boolean f50637r;

    /* renamed from: com.soundcloud.android.crop.b$a */
    enum C18335a {
        Changing,
        Always,
        Never
    }

    /* renamed from: com.soundcloud.android.crop.b$b */
    enum C18336b {
        None,
        Move,
        Grow
    }

    /* renamed from: b */
    public final void mo36774b() {
        this.f50621b = mo36772a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Rect mo36772a() {
        RectF rectF = new RectF(this.f50620a.left, this.f50620a.top, this.f50620a.right, this.f50620a.bottom);
        this.f50622c.mapRect(rectF);
        return new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo36771a(float f) {
        return f * this.f50627h.getResources().getDisplayMetrics().density;
    }

    /* renamed from: a */
    public final void mo36773a(C18336b bVar) {
        if (bVar != this.f50631l) {
            this.f50631l = bVar;
            this.f50627h.invalidate();
        }
    }

    public C18334b(View view) {
        this.f50627h = view;
        Context context = view.getContext();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.j2, typedValue, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, new int[]{R.attr.nc, R.attr.a20, R.attr.a24, R.attr.a27});
        try {
            this.f50628i = obtainStyledAttributes.getBoolean(3, false);
            this.f50629j = obtainStyledAttributes.getBoolean(1, false);
            this.f50630k = obtainStyledAttributes.getColor(0, -13388315);
            this.f50632m = C18335a.values()[obtainStyledAttributes.getInt(2, 0)];
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
