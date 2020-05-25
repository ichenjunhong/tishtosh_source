package android.support.p043v7.p046b.p047a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

/* renamed from: android.support.v7.b.a.e */
class C1195e extends C1189b {

    /* renamed from: b */
    public C1196a f3963b;

    /* renamed from: c */
    private boolean f3964c;

    /* renamed from: android.support.v7.b.a.e$a */
    static class C1196a extends C1192b {

        /* renamed from: L */
        int[][] f3965L;

        public Drawable newDrawable() {
            return new C1195e(this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3852a() {
            int[] iArr;
            int[][] iArr2 = new int[this.f3965L.length][];
            for (int length = this.f3965L.length - 1; length >= 0; length--) {
                if (this.f3965L[length] != null) {
                    iArr = (int[]) this.f3965L[length].clone();
                } else {
                    iArr = null;
                }
                iArr2[length] = iArr;
            }
            this.f3965L = iArr2;
        }

        public Drawable newDrawable(Resources resources) {
            return new C1195e(this, resources);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final int mo3919b(int[] iArr) {
            int[][] iArr2 = this.f3965L;
            int i = this.f3932j;
            for (int i2 = 0; i2 < i; i2++) {
                if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                    return i2;
                }
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3918a(int[] iArr, Drawable drawable) {
            int a = mo3870a(drawable);
            this.f3965L[a] = iArr;
            return a;
        }

        /* renamed from: b */
        public final void mo3874b(int i, int i2) {
            super.mo3874b(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f3965L, 0, iArr, 0, i);
            this.f3965L = iArr;
        }

        C1196a(C1196a aVar, C1195e eVar, Resources resources) {
            super(aVar, eVar, resources);
            if (aVar != null) {
                this.f3965L = aVar.f3965L;
            } else {
                this.f3965L = new int[this.f3931i.length][];
            }
        }
    }

    public boolean isStateful() {
        return true;
    }

    C1195e() {
        this(null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1196a mo3814b() {
        return new C1196a(this.f3963b, this, null);
    }

    public Drawable mutate() {
        if (!this.f3964c && super.mutate() == this) {
            this.f3963b.mo3852a();
            this.f3964c = true;
        }
        return this;
    }

    C1195e(C1196a aVar) {
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3812a(C1192b bVar) {
        super.mo3812a(bVar);
        if (bVar instanceof C1196a) {
            this.f3963b = (C1196a) bVar;
        }
    }

    /* renamed from: a */
    static int[] m3629a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int b = this.f3963b.mo3919b(iArr);
        if (b < 0) {
            b = this.f3963b.mo3919b(StateSet.WILD_CARD);
        }
        if (mo3860a(b) || onStateChange) {
            return true;
        }
        return false;
    }

    C1195e(C1196a aVar, Resources resources) {
        mo3812a((C1192b) new C1196a(aVar, this, resources));
        onStateChange(getState());
    }
}
