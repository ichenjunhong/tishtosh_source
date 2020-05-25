package android.support.p043v7.p046b.p047a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.support.p030v4.graphics.drawable.C0809a;
import android.util.SparseArray;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: android.support.v7.b.a.b */
class C1189b extends Drawable implements Callback {

    /* renamed from: a */
    public int f3899a = -1;

    /* renamed from: b */
    private C1192b f3900b;

    /* renamed from: c */
    private Rect f3901c;

    /* renamed from: d */
    private Drawable f3902d;

    /* renamed from: e */
    private Drawable f3903e;

    /* renamed from: f */
    private int f3904f = NormalGiftView.ALPHA_255;

    /* renamed from: g */
    private boolean f3905g;

    /* renamed from: h */
    private int f3906h = -1;

    /* renamed from: i */
    private boolean f3907i;

    /* renamed from: j */
    private Runnable f3908j;

    /* renamed from: k */
    private long f3909k;

    /* renamed from: l */
    private long f3910l;

    /* renamed from: m */
    private C1191a f3911m;

    /* renamed from: android.support.v7.b.a.b$a */
    static class C1191a implements Callback {

        /* renamed from: a */
        private Callback f3913a;

        C1191a() {
        }

        public final void invalidateDrawable(Drawable drawable) {
        }

        /* renamed from: a */
        public final Callback mo3865a() {
            Callback callback = this.f3913a;
            this.f3913a = null;
            return callback;
        }

        /* renamed from: a */
        public final C1191a mo3866a(Callback callback) {
            this.f3913a = callback;
            return this;
        }

        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            if (this.f3913a != null) {
                this.f3913a.unscheduleDrawable(drawable, runnable);
            }
        }

        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            if (this.f3913a != null) {
                this.f3913a.scheduleDrawable(drawable, runnable, j);
            }
        }
    }

    /* renamed from: android.support.v7.b.a.b$b */
    static abstract class C1192b extends ConstantState {

        /* renamed from: A */
        boolean f3914A;

        /* renamed from: B */
        int f3915B;

        /* renamed from: C */
        public int f3916C;

        /* renamed from: D */
        public int f3917D;

        /* renamed from: E */
        boolean f3918E;

        /* renamed from: F */
        ColorFilter f3919F;

        /* renamed from: G */
        boolean f3920G;

        /* renamed from: H */
        ColorStateList f3921H;

        /* renamed from: I */
        Mode f3922I;

        /* renamed from: J */
        boolean f3923J;

        /* renamed from: K */
        boolean f3924K;

        /* renamed from: c */
        final C1189b f3925c;

        /* renamed from: d */
        Resources f3926d;

        /* renamed from: e */
        int f3927e = 160;

        /* renamed from: f */
        int f3928f;

        /* renamed from: g */
        int f3929g;

        /* renamed from: h */
        SparseArray<ConstantState> f3930h;

        /* renamed from: i */
        Drawable[] f3931i;

        /* renamed from: j */
        public int f3932j;

        /* renamed from: k */
        public boolean f3933k;

        /* renamed from: l */
        boolean f3934l;

        /* renamed from: m */
        Rect f3935m;

        /* renamed from: n */
        public boolean f3936n;

        /* renamed from: o */
        boolean f3937o;

        /* renamed from: p */
        int f3938p;

        /* renamed from: q */
        int f3939q;

        /* renamed from: r */
        int f3940r;

        /* renamed from: s */
        int f3941s;

        /* renamed from: t */
        boolean f3942t;

        /* renamed from: u */
        int f3943u;

        /* renamed from: v */
        boolean f3944v;

        /* renamed from: w */
        boolean f3945w;

        /* renamed from: x */
        boolean f3946x;

        /* renamed from: y */
        boolean f3947y;

        /* renamed from: z */
        boolean f3948z = true;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo3873b() {
            this.f3942t = false;
            this.f3944v = false;
        }

        public int getChangingConfigurations() {
            return this.f3928f | this.f3929g;
        }

        /* renamed from: d */
        public final int mo3877d() {
            if (!this.f3937o) {
                m3613i();
            }
            return this.f3938p;
        }

        /* renamed from: e */
        public final int mo3878e() {
            if (!this.f3937o) {
                m3613i();
            }
            return this.f3939q;
        }

        /* renamed from: f */
        public final int mo3879f() {
            if (!this.f3937o) {
                m3613i();
            }
            return this.f3940r;
        }

        /* renamed from: g */
        public final int mo3880g() {
            if (!this.f3937o) {
                m3613i();
            }
            return this.f3941s;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3852a() {
            int i = this.f3932j;
            Drawable[] drawableArr = this.f3931i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null) {
                    drawableArr[i2].mutate();
                }
            }
            this.f3914A = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3875c() {
            if (this.f3930h != null) {
                int size = this.f3930h.size();
                for (int i = 0; i < size; i++) {
                    this.f3931i[this.f3930h.keyAt(i)] = m3612b(((ConstantState) this.f3930h.valueAt(i)).newDrawable(this.f3926d));
                }
                this.f3930h = null;
            }
        }

        public boolean canApplyTheme() {
            int i = this.f3932j;
            Drawable[] drawableArr = this.f3931i;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f3930h.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: h */
        public final synchronized boolean mo3882h() {
            if (this.f3946x) {
                return this.f3947y;
            }
            mo3875c();
            this.f3946x = true;
            int i = this.f3932j;
            Drawable[] drawableArr = this.f3931i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f3947y = false;
                    return false;
                }
            }
            this.f3947y = true;
            return true;
        }

        /* renamed from: i */
        private void m3613i() {
            this.f3937o = true;
            mo3875c();
            int i = this.f3932j;
            Drawable[] drawableArr = this.f3931i;
            this.f3939q = -1;
            this.f3938p = -1;
            this.f3941s = 0;
            this.f3940r = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f3938p) {
                    this.f3938p = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f3939q) {
                    this.f3939q = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f3940r) {
                    this.f3940r = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f3941s) {
                    this.f3941s = minimumHeight;
                }
            }
        }

        /* renamed from: b */
        private Drawable m3612b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f3915B);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f3925c);
            return mutate;
        }

        /* renamed from: a */
        public final int mo3870a(Drawable drawable) {
            int i = this.f3932j;
            if (i >= this.f3931i.length) {
                mo3874b(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f3925c);
            this.f3931i[i] = drawable;
            this.f3932j++;
            this.f3929g = drawable.getChangingConfigurations() | this.f3929g;
            mo3873b();
            this.f3935m = null;
            this.f3934l = false;
            this.f3937o = false;
            this.f3946x = false;
            return i;
        }

        /* renamed from: b */
        public final Drawable mo3872b(int i) {
            Drawable drawable = this.f3931i[i];
            if (drawable != null) {
                return drawable;
            }
            if (this.f3930h != null) {
                int indexOfKey = this.f3930h.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable b = m3612b(((ConstantState) this.f3930h.valueAt(indexOfKey)).newDrawable(this.f3926d));
                    this.f3931i[i] = b;
                    this.f3930h.removeAt(indexOfKey);
                    if (this.f3930h.size() == 0) {
                        this.f3930h = null;
                    }
                    return b;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3871a(Resources resources) {
            if (resources != null) {
                this.f3926d = resources;
                int a = C1189b.m3603a(resources, this.f3927e);
                int i = this.f3927e;
                this.f3927e = a;
                if (i != a) {
                    this.f3937o = false;
                    this.f3934l = false;
                }
            }
        }

        /* renamed from: b */
        public void mo3874b(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f3931i, 0, drawableArr, 0, i);
            this.f3931i = drawableArr;
        }

        C1192b(C1192b bVar, C1189b bVar2, Resources resources) {
            Resources resources2;
            int i;
            this.f3925c = bVar2;
            if (resources != null) {
                resources2 = resources;
            } else if (bVar != null) {
                resources2 = bVar.f3926d;
            } else {
                resources2 = null;
            }
            this.f3926d = resources2;
            if (bVar != null) {
                i = bVar.f3927e;
            } else {
                i = 0;
            }
            this.f3927e = C1189b.m3603a(resources, i);
            if (bVar != null) {
                this.f3928f = bVar.f3928f;
                this.f3929g = bVar.f3929g;
                this.f3946x = true;
                this.f3947y = true;
                this.f3933k = bVar.f3933k;
                this.f3936n = bVar.f3936n;
                this.f3948z = bVar.f3948z;
                this.f3914A = bVar.f3914A;
                this.f3915B = bVar.f3915B;
                this.f3916C = bVar.f3916C;
                this.f3917D = bVar.f3917D;
                this.f3918E = bVar.f3918E;
                this.f3919F = bVar.f3919F;
                this.f3920G = bVar.f3920G;
                this.f3921H = bVar.f3921H;
                this.f3922I = bVar.f3922I;
                this.f3923J = bVar.f3923J;
                this.f3924K = bVar.f3924K;
                if (bVar.f3927e == this.f3927e) {
                    if (bVar.f3934l) {
                        this.f3935m = new Rect(bVar.f3935m);
                        this.f3934l = true;
                    }
                    if (bVar.f3937o) {
                        this.f3938p = bVar.f3938p;
                        this.f3939q = bVar.f3939q;
                        this.f3940r = bVar.f3940r;
                        this.f3941s = bVar.f3941s;
                        this.f3937o = true;
                    }
                }
                if (bVar.f3942t) {
                    this.f3943u = bVar.f3943u;
                    this.f3942t = true;
                }
                if (bVar.f3944v) {
                    this.f3945w = bVar.f3945w;
                    this.f3944v = true;
                }
                Drawable[] drawableArr = bVar.f3931i;
                this.f3931i = new Drawable[drawableArr.length];
                this.f3932j = bVar.f3932j;
                SparseArray<ConstantState> sparseArray = bVar.f3930h;
                if (sparseArray != null) {
                    this.f3930h = sparseArray.clone();
                } else {
                    this.f3930h = new SparseArray<>(this.f3932j);
                }
                int i2 = this.f3932j;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null) {
                        ConstantState constantState = drawableArr[i3].getConstantState();
                        if (constantState != null) {
                            this.f3930h.put(i3, constantState);
                        } else {
                            this.f3931i[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f3931i = new Drawable[10];
            this.f3932j = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C1192b mo3814b() {
        return this.f3900b;
    }

    public int getAlpha() {
        return this.f3904f;
    }

    public Drawable getCurrent() {
        return this.f3902d;
    }

    public boolean canApplyTheme() {
        return this.f3900b.canApplyTheme();
    }

    public boolean isAutoMirrored() {
        return this.f3900b.f3918E;
    }

    C1189b() {
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f3900b.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (!this.f3900b.mo3882h()) {
            return null;
        }
        this.f3900b.f3928f = getChangingConfigurations();
        return this.f3900b;
    }

    public int getIntrinsicHeight() {
        if (this.f3900b.f3936n) {
            return this.f3900b.mo3878e();
        }
        if (this.f3902d != null) {
            return this.f3902d.getIntrinsicHeight();
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        if (this.f3900b.f3936n) {
            return this.f3900b.mo3877d();
        }
        if (this.f3902d != null) {
            return this.f3902d.getIntrinsicWidth();
        }
        return -1;
    }

    public int getMinimumHeight() {
        if (this.f3900b.f3936n) {
            return this.f3900b.mo3880g();
        }
        if (this.f3902d != null) {
            return this.f3902d.getMinimumHeight();
        }
        return 0;
    }

    public int getMinimumWidth() {
        if (this.f3900b.f3936n) {
            return this.f3900b.mo3879f();
        }
        if (this.f3902d != null) {
            return this.f3902d.getMinimumWidth();
        }
        return 0;
    }

    public Drawable mutate() {
        if (!this.f3907i && super.mutate() == this) {
            C1192b b = mo3814b();
            b.mo3852a();
            mo3812a(b);
            this.f3907i = true;
        }
        return this;
    }

    public int getOpacity() {
        int i = -2;
        if (this.f3902d == null || !this.f3902d.isVisible()) {
            return -2;
        }
        C1192b bVar = this.f3900b;
        if (bVar.f3942t) {
            return bVar.f3943u;
        }
        bVar.mo3875c();
        int i2 = bVar.f3932j;
        Drawable[] drawableArr = bVar.f3931i;
        if (i2 > 0) {
            i = drawableArr[0].getOpacity();
        }
        int i3 = i;
        for (int i4 = 1; i4 < i2; i4++) {
            i3 = Drawable.resolveOpacity(i3, drawableArr[i4].getOpacity());
        }
        bVar.f3943u = i3;
        bVar.f3942t = true;
        return i3;
    }

    public boolean isStateful() {
        C1192b bVar = this.f3900b;
        if (bVar.f3944v) {
            return bVar.f3945w;
        }
        bVar.mo3875c();
        int i = bVar.f3932j;
        Drawable[] drawableArr = bVar.f3931i;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (drawableArr[i2].isStateful()) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        bVar.f3945w = z;
        bVar.f3944v = true;
        return z;
    }

    public void jumpToCurrentState() {
        boolean z;
        if (this.f3903e != null) {
            this.f3903e.jumpToCurrentState();
            this.f3903e = null;
            this.f3906h = -1;
            z = true;
        } else {
            z = false;
        }
        if (this.f3902d != null) {
            this.f3902d.jumpToCurrentState();
            if (this.f3905g) {
                this.f3902d.setAlpha(this.f3904f);
            }
        }
        if (this.f3910l != 0) {
            this.f3910l = 0;
            z = true;
        }
        if (this.f3909k != 0) {
            this.f3909k = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3858a(Resources resources) {
        this.f3900b.mo3871a(resources);
    }

    public void getHotspotBounds(Rect rect) {
        if (this.f3901c != null) {
            rect.set(this.f3901c);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public void getOutline(Outline outline) {
        if (this.f3902d != null) {
            this.f3902d.getOutline(outline);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3812a(C1192b bVar) {
        this.f3900b = bVar;
        if (this.f3899a >= 0) {
            this.f3902d = bVar.mo3872b(this.f3899a);
            if (this.f3902d != null) {
                m3604a(this.f3902d);
            }
        }
        this.f3906h = -1;
        this.f3903e = null;
    }

    public void draw(Canvas canvas) {
        if (this.f3902d != null) {
            this.f3902d.draw(canvas);
        }
        if (this.f3903e != null) {
            this.f3903e.draw(canvas);
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        if (this.f3900b != null) {
            this.f3900b.mo3873b();
        }
        if (drawable == this.f3902d && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f3903e != null) {
            this.f3903e.setBounds(rect);
        }
        if (this.f3902d != null) {
            this.f3902d.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f3903e != null) {
            return this.f3903e.setLevel(i);
        }
        if (this.f3902d != null) {
            return this.f3902d.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        if (this.f3903e != null) {
            return this.f3903e.setState(iArr);
        }
        if (this.f3902d != null) {
            return this.f3902d.setState(iArr);
        }
        return false;
    }

    public void setAutoMirrored(boolean z) {
        if (this.f3900b.f3918E != z) {
            this.f3900b.f3918E = z;
            if (this.f3902d != null) {
                C0809a.m2331a(this.f3902d, this.f3900b.f3918E);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3900b.f3920G = true;
        if (this.f3900b.f3919F != colorFilter) {
            this.f3900b.f3919F = colorFilter;
            if (this.f3902d != null) {
                this.f3902d.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        if (this.f3900b.f3948z != z) {
            this.f3900b.f3948z = z;
            if (this.f3902d != null) {
                this.f3902d.setDither(this.f3900b.f3948z);
            }
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f3900b.f3923J = true;
        if (this.f3900b.f3921H != colorStateList) {
            this.f3900b.f3921H = colorStateList;
            C0809a.m2327a(this.f3902d, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        this.f3900b.f3924K = true;
        if (this.f3900b.f3922I != mode) {
            this.f3900b.f3922I = mode;
            C0809a.m2330a(this.f3902d, mode);
        }
    }

    public void applyTheme(Theme theme) {
        C1192b bVar = this.f3900b;
        if (theme != null) {
            bVar.mo3875c();
            int i = bVar.f3932j;
            Drawable[] drawableArr = bVar.f3931i;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                    drawableArr[i2].applyTheme(theme);
                    bVar.f3929g |= drawableArr[i2].getChangingConfigurations();
                }
            }
            bVar.mo3871a(theme.getResources());
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        boolean z;
        C1192b bVar = this.f3900b;
        int i2 = this.f3899a;
        int i3 = bVar.f3932j;
        Drawable[] drawableArr = bVar.f3931i;
        boolean z2 = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                if (VERSION.SDK_INT >= 23) {
                    z = drawableArr[i4].setLayoutDirection(i);
                } else {
                    z = false;
                }
                if (i4 == i2) {
                    z2 = z;
                }
            }
        }
        bVar.f3915B = i;
        return z2;
    }

    public void setAlpha(int i) {
        if (!this.f3905g || this.f3904f != i) {
            this.f3905g = true;
            this.f3904f = i;
            if (this.f3902d != null) {
                if (this.f3909k == 0) {
                    this.f3902d.setAlpha(i);
                    return;
                }
                mo3859a(false);
            }
        }
    }

    /* renamed from: a */
    private void m3604a(Drawable drawable) {
        if (this.f3911m == null) {
            this.f3911m = new C1191a();
        }
        drawable.setCallback(this.f3911m.mo3866a(drawable.getCallback()));
        try {
            if (this.f3900b.f3916C <= 0 && this.f3905g) {
                drawable.setAlpha(this.f3904f);
            }
            if (this.f3900b.f3920G) {
                drawable.setColorFilter(this.f3900b.f3919F);
            } else {
                if (this.f3900b.f3923J) {
                    C0809a.m2327a(drawable, this.f3900b.f3921H);
                }
                if (this.f3900b.f3924K) {
                    C0809a.m2330a(drawable, this.f3900b.f3922I);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f3900b.f3948z);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f3900b.f3918E);
            }
            Rect rect = this.f3901c;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f3911m.mo3865a());
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        C1192b bVar = this.f3900b;
        Rect rect2 = null;
        boolean z2 = true;
        if (!bVar.f3933k) {
            if (bVar.f3935m != null || bVar.f3934l) {
                rect2 = bVar.f3935m;
            } else {
                bVar.mo3875c();
                Rect rect3 = new Rect();
                int i = bVar.f3932j;
                Drawable[] drawableArr = bVar.f3931i;
                Rect rect4 = null;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect3)) {
                        if (rect4 == null) {
                            rect4 = new Rect(0, 0, 0, 0);
                        }
                        if (rect3.left > rect4.left) {
                            rect4.left = rect3.left;
                        }
                        if (rect3.top > rect4.top) {
                            rect4.top = rect3.top;
                        }
                        if (rect3.right > rect4.right) {
                            rect4.right = rect3.right;
                        }
                        if (rect3.bottom > rect4.bottom) {
                            rect4.bottom = rect3.bottom;
                        }
                    }
                }
                bVar.f3934l = true;
                bVar.f3935m = rect4;
                rect2 = rect4;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z = true;
            } else {
                z = false;
            }
        } else if (this.f3902d != null) {
            z = this.f3902d.getPadding(rect);
        } else {
            z = super.getPadding(rect);
        }
        if (!isAutoMirrored() || getLayoutDirection() != 1) {
            z2 = false;
        }
        if (z2) {
            int i3 = rect.left;
            rect.left = rect.right;
            rect.right = i3;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo3859a(boolean r13) {
        /*
            r12 = this;
            r0 = 1
            r12.f3905g = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r12.f3902d
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x003e
            long r9 = r12.f3909k
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0040
            long r9 = r12.f3909k
            int r3 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0024
            android.graphics.drawable.Drawable r3 = r12.f3902d
            int r9 = r12.f3904f
            r3.setAlpha(r9)
            goto L_0x003e
        L_0x0024:
            long r9 = r12.f3909k
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r3 = (int) r9
            android.support.v7.b.a.b$b r9 = r12.f3900b
            int r9 = r9.f3916C
            int r3 = r3 / r9
            android.graphics.drawable.Drawable r9 = r12.f3902d
            int r3 = 255 - r3
            int r10 = r12.f3904f
            int r3 = r3 * r10
            int r3 = r3 / 255
            r9.setAlpha(r3)
            r3 = 1
            goto L_0x0041
        L_0x003e:
            r12.f3909k = r7
        L_0x0040:
            r3 = 0
        L_0x0041:
            android.graphics.drawable.Drawable r9 = r12.f3903e
            if (r9 == 0) goto L_0x0074
            long r9 = r12.f3910l
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x0076
            long r9 = r12.f3910l
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x005d
            android.graphics.drawable.Drawable r0 = r12.f3903e
            r0.setVisible(r6, r6)
            r0 = 0
            r12.f3903e = r0
            r0 = -1
            r12.f3906h = r0
            goto L_0x0074
        L_0x005d:
            long r6 = r12.f3910l
            long r6 = r6 - r1
            long r6 = r6 * r4
            int r3 = (int) r6
            android.support.v7.b.a.b$b r4 = r12.f3900b
            int r4 = r4.f3917D
            int r3 = r3 / r4
            android.graphics.drawable.Drawable r4 = r12.f3903e
            int r5 = r12.f3904f
            int r3 = r3 * r5
            int r3 = r3 / 255
            r4.setAlpha(r3)
            goto L_0x0077
        L_0x0074:
            r12.f3910l = r7
        L_0x0076:
            r0 = r3
        L_0x0077:
            if (r13 == 0) goto L_0x0083
            if (r0 == 0) goto L_0x0083
            java.lang.Runnable r13 = r12.f3908j
            r3 = 16
            long r1 = r1 + r3
            r12.scheduleSelf(r13, r1)
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.p046b.p047a.C1189b.mo3859a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo3860a(int i) {
        if (i == this.f3899a) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f3900b.f3917D > 0) {
            if (this.f3903e != null) {
                this.f3903e.setVisible(false, false);
            }
            if (this.f3902d != null) {
                this.f3903e = this.f3902d;
                this.f3906h = this.f3899a;
                this.f3910l = ((long) this.f3900b.f3917D) + uptimeMillis;
            } else {
                this.f3903e = null;
                this.f3906h = -1;
                this.f3910l = 0;
            }
        } else if (this.f3902d != null) {
            this.f3902d.setVisible(false, false);
        }
        if (i < 0 || i >= this.f3900b.f3932j) {
            this.f3902d = null;
            this.f3899a = -1;
        } else {
            Drawable b = this.f3900b.mo3872b(i);
            this.f3902d = b;
            this.f3899a = i;
            if (b != null) {
                if (this.f3900b.f3916C > 0) {
                    this.f3909k = uptimeMillis + ((long) this.f3900b.f3916C);
                }
                m3604a(b);
            }
        }
        if (!(this.f3909k == 0 && this.f3910l == 0)) {
            if (this.f3908j == null) {
                this.f3908j = new Runnable() {
                    public final void run() {
                        C1189b.this.mo3859a(true);
                        C1189b.this.invalidateSelf();
                    }
                };
            } else {
                unscheduleSelf(this.f3908j);
            }
            mo3859a(true);
        }
        invalidateSelf();
        return true;
    }

    /* renamed from: a */
    static int m3603a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }

    public void setHotspot(float f, float f2) {
        if (this.f3902d != null) {
            C0809a.m2324a(this.f3902d, f, f2);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f3903e != null) {
            this.f3903e.setVisible(z, z2);
        }
        if (this.f3902d != null) {
            this.f3902d.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f3902d && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f3902d && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f3901c == null) {
            this.f3901c = new Rect(i, i2, i3, i4);
        } else {
            this.f3901c.set(i, i2, i3, i4);
        }
        if (this.f3902d != null) {
            C0809a.m2326a(this.f3902d, i, i2, i3, i4);
        }
    }
}
