package android.support.p043v7.p046b.p047a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017a.p018a.C0217c;
import android.support.p017a.p018a.C0227i;
import android.support.p030v4.content.p035a.C0724g;
import android.support.p030v4.p038f.C0785g;
import android.support.p030v4.p038f.C0801o;
import android.support.p043v7.p044a.p045a.C1124a;
import android.util.AttributeSet;
import android.util.StateSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.b.a.a */
public class C1181a extends C1195e {

    /* renamed from: c */
    private static final String f3884c = "a";

    /* renamed from: d */
    private C1184b f3885d;

    /* renamed from: e */
    private C1188f f3886e;

    /* renamed from: f */
    private int f3887f;

    /* renamed from: g */
    private int f3888g;

    /* renamed from: h */
    private boolean f3889h;

    /* renamed from: android.support.v7.b.a.a$a */
    static class C1183a extends C1188f {

        /* renamed from: a */
        private final Animatable f3890a;

        /* renamed from: a */
        public final void mo3846a() {
            this.f3890a.start();
        }

        /* renamed from: b */
        public final void mo3847b() {
            this.f3890a.stop();
        }

        C1183a(Animatable animatable) {
            super();
            this.f3890a = animatable;
        }
    }

    /* renamed from: android.support.v7.b.a.a$b */
    static class C1184b extends C1196a {

        /* renamed from: a */
        C0785g<Long> f3891a;

        /* renamed from: b */
        C0801o<Integer> f3892b;

        /* renamed from: a */
        static long m3586a(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        public final Drawable newDrawable() {
            return new C1181a(this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3852a() {
            this.f3891a = this.f3891a.clone();
            this.f3892b = this.f3892b.clone();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3850a(int[] iArr) {
            int b = super.mo3919b(iArr);
            if (b >= 0) {
                return b;
            }
            return super.mo3919b(StateSet.WILD_CARD);
        }

        public final Drawable newDrawable(Resources resources) {
            return new C1181a(this, resources);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3848a(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f3892b.mo2592a(i, Integer.valueOf(0))).intValue();
        }

        C1184b(C1184b bVar, C1181a aVar, Resources resources) {
            super(bVar, aVar, resources);
            if (bVar != null) {
                this.f3891a = bVar.f3891a;
                this.f3892b = bVar.f3892b;
                return;
            }
            this.f3891a = new C0785g<>();
            this.f3892b = new C0801o<>();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3851a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo3918a(iArr, drawable);
            this.f3892b.mo2595b(a, Integer.valueOf(i));
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final int mo3849a(int i, int i2, Drawable drawable, boolean z) {
            long j;
            int a = super.mo3870a(drawable);
            long a2 = m3586a(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = (long) a;
            this.f3891a.mo2497c(a2, Long.valueOf(j2 | j));
            if (z) {
                this.f3891a.mo2497c(m3586a(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }
    }

    /* renamed from: android.support.v7.b.a.a$c */
    static class C1185c extends C1188f {

        /* renamed from: a */
        private final C0217c f3893a;

        /* renamed from: a */
        public final void mo3846a() {
            this.f3893a.start();
        }

        /* renamed from: b */
        public final void mo3847b() {
            this.f3893a.stop();
        }

        C1185c(C0217c cVar) {
            super();
            this.f3893a = cVar;
        }
    }

    /* renamed from: android.support.v7.b.a.a$d */
    static class C1186d extends C1188f {

        /* renamed from: a */
        private final ObjectAnimator f3894a;

        /* renamed from: b */
        private final boolean f3895b;

        /* renamed from: c */
        public final boolean mo3855c() {
            return this.f3895b;
        }

        /* renamed from: a */
        public final void mo3846a() {
            this.f3894a.start();
        }

        /* renamed from: b */
        public final void mo3847b() {
            this.f3894a.cancel();
        }

        /* renamed from: d */
        public final void mo3856d() {
            this.f3894a.reverse();
        }

        C1186d(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            int i;
            int i2;
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            C1187e eVar = new C1187e(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) eVar.f3896a);
            ofInt.setInterpolator(eVar);
            this.f3895b = z2;
            this.f3894a = ofInt;
        }
    }

    /* renamed from: android.support.v7.b.a.a$e */
    static class C1187e implements TimeInterpolator {

        /* renamed from: a */
        public int f3896a;

        /* renamed from: b */
        private int[] f3897b;

        /* renamed from: c */
        private int f3898c;

        public final float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * ((float) this.f3896a)) + 0.5f);
            int i2 = this.f3898c;
            int[] iArr = this.f3897b;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            if (i3 < i2) {
                f2 = ((float) i) / ((float) this.f3896a);
            } else {
                f2 = 0.0f;
            }
            return (((float) i3) / ((float) i2)) + f2;
        }

        C1187e(AnimationDrawable animationDrawable, boolean z) {
            m3598a(animationDrawable, z);
        }

        /* renamed from: a */
        private int m3598a(AnimationDrawable animationDrawable, boolean z) {
            int i;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f3898c = numberOfFrames;
            if (this.f3897b == null || this.f3897b.length < numberOfFrames) {
                this.f3897b = new int[numberOfFrames];
            }
            int[] iArr = this.f3897b;
            int i2 = 0;
            for (int i3 = 0; i3 < numberOfFrames; i3++) {
                if (z) {
                    i = (numberOfFrames - i3) - 1;
                } else {
                    i = i3;
                }
                int duration = animationDrawable.getDuration(i);
                iArr[i3] = duration;
                i2 += duration;
            }
            this.f3896a = i2;
            return i2;
        }
    }

    /* renamed from: android.support.v7.b.a.a$f */
    static abstract class C1188f {
        private C1188f() {
        }

        /* renamed from: a */
        public abstract void mo3846a();

        /* renamed from: b */
        public abstract void mo3847b();

        /* renamed from: c */
        public boolean mo3855c() {
            return false;
        }

        /* renamed from: d */
        public void mo3856d() {
        }
    }

    public boolean isStateful() {
        return true;
    }

    public C1181a() {
        this(null, null);
    }

    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public C1184b mo3814b() {
        return new C1184b(this.f3885d, this, null);
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        if (this.f3886e != null) {
            this.f3886e.mo3847b();
            this.f3886e = null;
            mo3860a(this.f3887f);
            this.f3887f = -1;
            this.f3888g = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f3889h && super.mutate() == this) {
            this.f3885d.mo3852a();
            this.f3889h = true;
        }
        return this;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ void setDither(boolean z) {
        super.setDither(z);
    }

    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    public /* bridge */ /* synthetic */ void setTintMode(Mode mode) {
        super.setTintMode(mode);
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i) {
        return super.onLayoutDirectionChanged(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo3812a(C1192b bVar) {
        super.mo3812a(bVar);
        if (bVar instanceof C1184b) {
            this.f3885d = (C1184b) bVar;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ea, code lost:
        if (mo3860a(r2) == false) goto L_0x00ed;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStateChange(int[] r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            android.support.v7.b.a.a$b r2 = r0.f3885d
            int r2 = r2.mo3850a(r1)
            int r3 = r0.f3899a
            r4 = 1
            r5 = 0
            if (r2 == r3) goto L_0x00ed
            android.support.v7.b.a.a$f r3 = r0.f3886e
            if (r3 == 0) goto L_0x0035
            int r6 = r0.f3887f
            if (r2 != r6) goto L_0x001b
        L_0x0018:
            r3 = 1
            goto L_0x00e4
        L_0x001b:
            int r6 = r0.f3888g
            if (r2 != r6) goto L_0x002f
            boolean r6 = r3.mo3855c()
            if (r6 == 0) goto L_0x002f
            r3.mo3856d()
            int r3 = r0.f3888g
            r0.f3887f = r3
            r0.f3888g = r2
            goto L_0x0018
        L_0x002f:
            int r6 = r0.f3887f
            r3.mo3847b()
            goto L_0x0037
        L_0x0035:
            int r6 = r0.f3899a
        L_0x0037:
            r3 = 0
            r0.f3886e = r3
            r3 = -1
            r0.f3888g = r3
            r0.f3887f = r3
            android.support.v7.b.a.a$b r3 = r0.f3885d
            int r7 = r3.mo3848a(r6)
            int r8 = r3.mo3848a(r2)
            if (r8 == 0) goto L_0x00e3
            if (r7 != 0) goto L_0x004f
            goto L_0x00e3
        L_0x004f:
            long r9 = android.support.p043v7.p046b.p047a.C1181a.C1184b.m3586a(r7, r8)
            android.support.v4.f.g<java.lang.Long> r11 = r3.f3891a
            r12 = -1
            java.lang.Long r14 = java.lang.Long.valueOf(r12)
            java.lang.Object r9 = r11.mo2488a(r9, r14)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            int r9 = (int) r9
            if (r9 >= 0) goto L_0x006a
            goto L_0x00e3
        L_0x006a:
            long r10 = android.support.p043v7.p046b.p047a.C1181a.C1184b.m3586a(r7, r8)
            android.support.v4.f.g<java.lang.Long> r14 = r3.f3891a
            java.lang.Long r15 = java.lang.Long.valueOf(r12)
            java.lang.Object r10 = r14.mo2488a(r10, r15)
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            r14 = 8589934592(0x200000000, double:4.243991582E-314)
            long r10 = r10 & r14
            r14 = 0
            int r16 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x008c
            r10 = 1
            goto L_0x008d
        L_0x008c:
            r10 = 0
        L_0x008d:
            r0.mo3860a(r9)
            android.graphics.drawable.Drawable r9 = r17.getCurrent()
            boolean r11 = r9 instanceof android.graphics.drawable.AnimationDrawable
            if (r11 == 0) goto L_0x00c1
            long r7 = android.support.p043v7.p046b.p047a.C1181a.C1184b.m3586a(r7, r8)
            android.support.v4.f.g<java.lang.Long> r3 = r3.f3891a
            java.lang.Long r11 = java.lang.Long.valueOf(r12)
            java.lang.Object r3 = r3.mo2488a(r7, r11)
            java.lang.Long r3 = (java.lang.Long) r3
            long r7 = r3.longValue()
            r11 = 4294967296(0x100000000, double:2.121995791E-314)
            long r7 = r7 & r11
            int r3 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r3 == 0) goto L_0x00b8
            r3 = 1
            goto L_0x00b9
        L_0x00b8:
            r3 = 0
        L_0x00b9:
            android.support.v7.b.a.a$d r7 = new android.support.v7.b.a.a$d
            android.graphics.drawable.AnimationDrawable r9 = (android.graphics.drawable.AnimationDrawable) r9
            r7.<init>(r9, r3, r10)
            goto L_0x00d8
        L_0x00c1:
            boolean r3 = r9 instanceof android.support.p017a.p018a.C0217c
            if (r3 == 0) goto L_0x00cd
            android.support.v7.b.a.a$c r7 = new android.support.v7.b.a.a$c
            android.support.a.a.c r9 = (android.support.p017a.p018a.C0217c) r9
            r7.<init>(r9)
            goto L_0x00d8
        L_0x00cd:
            boolean r3 = r9 instanceof android.graphics.drawable.Animatable
            if (r3 == 0) goto L_0x00e3
            android.support.v7.b.a.a$a r7 = new android.support.v7.b.a.a$a
            android.graphics.drawable.Animatable r9 = (android.graphics.drawable.Animatable) r9
            r7.<init>(r9)
        L_0x00d8:
            r7.mo3846a()
            r0.f3886e = r7
            r0.f3888g = r6
            r0.f3887f = r2
            goto L_0x0018
        L_0x00e3:
            r3 = 0
        L_0x00e4:
            if (r3 != 0) goto L_0x00ee
            boolean r2 = r0.mo3860a(r2)
            if (r2 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r4 = 0
        L_0x00ee:
            android.graphics.drawable.Drawable r2 = r17.getCurrent()
            if (r2 == 0) goto L_0x00f9
            boolean r1 = r2.setState(r1)
            r4 = r4 | r1
        L_0x00f9:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.p046b.p047a.C1181a.onStateChange(int[]):boolean");
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    C1181a(C1184b bVar, Resources resources) {
        super(null);
        this.f3887f = -1;
        this.f3888g = -1;
        mo3812a(new C1184b(bVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f3886e != null && (visible || z2)) {
            if (z) {
                this.f3886e.mo3846a();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        super.scheduleDrawable(drawable, runnable, j);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: b */
    private void m3577b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m3580d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m3578c(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static C1181a m3576a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C1181a aVar = new C1181a();
            TypedArray a = C0724g.m2082a(resources, theme, attributeSet, new int[]{16843036, 16843156, 16843157, 16843158, 16843532, 16843533});
            aVar.setVisible(a.getBoolean(1, true), true);
            C1184b bVar = aVar.f3885d;
            if (VERSION.SDK_INT >= 21) {
                bVar.f3928f |= a.getChangingConfigurations();
            }
            bVar.f3933k = a.getBoolean(2, bVar.f3933k);
            bVar.f3936n = a.getBoolean(3, bVar.f3936n);
            bVar.f3916C = a.getInt(4, bVar.f3916C);
            bVar.f3917D = a.getInt(5, bVar.f3917D);
            aVar.setDither(a.getBoolean(0, bVar.f3948z));
            aVar.mo3858a(resources);
            a.recycle();
            aVar.m3577b(context, resources, xmlPullParser, attributeSet, theme);
            aVar.onStateChange(aVar.getState());
            return aVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: c */
    private int m3578c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray a = C0724g.m2082a(resources, theme, attributeSet, new int[]{16843161, 16843849, 16843850, 16843851});
        int resourceId = a.getResourceId(2, -1);
        int resourceId2 = a.getResourceId(1, -1);
        int resourceId3 = a.getResourceId(0, -1);
        if (resourceId3 > 0) {
            drawable = C1124a.m3315b(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = a.getBoolean(3, false);
        a.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = C0217c.m443a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f3885d.mo3849a(resourceId, resourceId2, drawable, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    /* renamed from: d */
    private int m3580d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable;
        int next;
        TypedArray a = C0724g.m2082a(resources, theme, attributeSet, new int[]{16842960, 16843161});
        int resourceId = a.getResourceId(0, 0);
        int resourceId2 = a.getResourceId(1, -1);
        if (resourceId2 > 0) {
            drawable = C1124a.m3315b(context, resourceId2);
        } else {
            drawable = null;
        }
        a.recycle();
        int[] a2 = m3629a(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                drawable = C0227i.m463a(resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (drawable != null) {
            return this.f3885d.mo3851a(a2, drawable, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(sb2.toString());
    }
}
