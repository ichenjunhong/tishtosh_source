package android.support.p017a.p018a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.p030v4.content.p035a.C0724g;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.p038f.C0777a;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.a.a.c */
public final class C0217c extends C0226h implements C0216b {

    /* renamed from: a */
    final Callback f503a;

    /* renamed from: c */
    private C0219a f504c;

    /* renamed from: d */
    private Context f505d;

    /* renamed from: e */
    private ArgbEvaluator f506e;

    /* renamed from: android.support.a.a.c$a */
    static class C0219a extends ConstantState {

        /* renamed from: a */
        int f508a;

        /* renamed from: b */
        C0227i f509b;

        /* renamed from: c */
        AnimatorSet f510c;

        /* renamed from: d */
        ArrayList<Animator> f511d;

        /* renamed from: e */
        C0777a<Animator, String> f512e;

        public final int getChangingConfigurations() {
            return this.f508a;
        }

        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        /* renamed from: a */
        public final void mo407a() {
            if (this.f510c == null) {
                this.f510c = new AnimatorSet();
            }
            this.f510c.playTogether(this.f511d);
        }

        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public C0219a(Context context, C0219a aVar, Callback callback, Resources resources) {
            if (aVar != null) {
                this.f508a = aVar.f508a;
                if (aVar.f509b != null) {
                    ConstantState constantState = aVar.f509b.getConstantState();
                    if (resources != null) {
                        this.f509b = (C0227i) constantState.newDrawable(resources);
                    } else {
                        this.f509b = (C0227i) constantState.newDrawable();
                    }
                    this.f509b = (C0227i) this.f509b.mutate();
                    this.f509b.setCallback(callback);
                    this.f509b.setBounds(aVar.f509b.getBounds());
                    this.f509b.f520c = false;
                }
                if (aVar.f511d != null) {
                    int size = aVar.f511d.size();
                    this.f511d = new ArrayList<>(size);
                    this.f512e = new C0777a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) aVar.f511d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) aVar.f512e.get(animator);
                        clone.setTarget(this.f509b.mo419a(str));
                        this.f511d.add(clone);
                        this.f512e.put(clone, str);
                    }
                    mo407a();
                }
            }
        }
    }

    /* renamed from: android.support.a.a.c$b */
    static class C0220b extends ConstantState {

        /* renamed from: a */
        private final ConstantState f513a;

        public final boolean canApplyTheme() {
            return this.f513a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f513a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            C0217c cVar = new C0217c();
            cVar.f518b = this.f513a.newDrawable();
            cVar.f518b.setCallback(cVar.f503a);
            return cVar;
        }

        public C0220b(ConstantState constantState) {
            this.f513a = constantState;
        }

        public final Drawable newDrawable(Resources resources) {
            C0217c cVar = new C0217c();
            cVar.f518b = this.f513a.newDrawable(resources);
            cVar.f518b.setCallback(cVar.f503a);
            return cVar;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            C0217c cVar = new C0217c();
            cVar.f518b = this.f513a.newDrawable(resources, theme);
            cVar.f518b.setCallback(cVar.f503a);
            return cVar;
        }
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    C0217c() {
        this(null, null, null);
    }

    public final /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public final /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public final /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public final /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public final /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public final /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public final boolean canApplyTheme() {
        if (this.f518b != null) {
            return C0809a.m2335d(this.f518b);
        }
        return false;
    }

    public final Drawable mutate() {
        if (this.f518b != null) {
            this.f518b.mutate();
        }
        return this;
    }

    public final int getAlpha() {
        if (this.f518b != null) {
            return C0809a.m2334c(this.f518b);
        }
        return this.f504c.f509b.getAlpha();
    }

    public final int getChangingConfigurations() {
        if (this.f518b != null) {
            return this.f518b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f504c.f508a;
    }

    public final ConstantState getConstantState() {
        if (this.f518b == null || VERSION.SDK_INT < 24) {
            return null;
        }
        return new C0220b(this.f518b.getConstantState());
    }

    public final int getIntrinsicHeight() {
        if (this.f518b != null) {
            return this.f518b.getIntrinsicHeight();
        }
        return this.f504c.f509b.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        if (this.f518b != null) {
            return this.f518b.getIntrinsicWidth();
        }
        return this.f504c.f509b.getIntrinsicWidth();
    }

    public final int getOpacity() {
        if (this.f518b != null) {
            return this.f518b.getOpacity();
        }
        return this.f504c.f509b.getOpacity();
    }

    public final boolean isAutoMirrored() {
        if (this.f518b != null) {
            return C0809a.m2332b(this.f518b);
        }
        return this.f504c.f509b.isAutoMirrored();
    }

    public final boolean isRunning() {
        if (this.f518b != null) {
            return ((AnimatedVectorDrawable) this.f518b).isRunning();
        }
        return this.f504c.f510c.isRunning();
    }

    public final boolean isStateful() {
        if (this.f518b != null) {
            return this.f518b.isStateful();
        }
        return this.f504c.f509b.isStateful();
    }

    public final void stop() {
        if (this.f518b != null) {
            ((AnimatedVectorDrawable) this.f518b).stop();
        } else {
            this.f504c.f510c.end();
        }
    }

    public final void start() {
        if (this.f518b != null) {
            ((AnimatedVectorDrawable) this.f518b).start();
        } else if (!this.f504c.f510c.isStarted()) {
            this.f504c.f510c.start();
            invalidateSelf();
        }
    }

    public final /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public final /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public final /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public final /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    private C0217c(Context context) {
        this(context, null, null);
    }

    public final void applyTheme(Theme theme) {
        if (this.f518b != null) {
            C0809a.m2328a(this.f518b, theme);
        }
    }

    public final void draw(Canvas canvas) {
        if (this.f518b != null) {
            this.f518b.draw(canvas);
            return;
        }
        this.f504c.f509b.draw(canvas);
        if (this.f504c.f510c.isStarted()) {
            invalidateSelf();
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        if (this.f518b != null) {
            this.f518b.setBounds(rect);
        } else {
            this.f504c.f509b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onLevelChange(int i) {
        if (this.f518b != null) {
            return this.f518b.setLevel(i);
        }
        return this.f504c.f509b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f518b != null) {
            return this.f518b.setState(iArr);
        }
        return this.f504c.f509b.setState(iArr);
    }

    public final void setAlpha(int i) {
        if (this.f518b != null) {
            this.f518b.setAlpha(i);
        } else {
            this.f504c.f509b.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.f518b != null) {
            C0809a.m2331a(this.f518b, z);
        } else {
            this.f504c.f509b.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f518b != null) {
            this.f518b.setColorFilter(colorFilter);
        } else {
            this.f504c.f509b.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        if (this.f518b != null) {
            C0809a.m2325a(this.f518b, i);
        } else {
            this.f504c.f509b.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f518b != null) {
            C0809a.m2327a(this.f518b, colorStateList);
        } else {
            this.f504c.f509b.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.f518b != null) {
            C0809a.m2330a(this.f518b, mode);
        } else {
            this.f504c.f509b.setTintMode(mode);
        }
    }

    /* renamed from: a */
    private void m444a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            ArrayList childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m444a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f506e == null) {
                    this.f506e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f506e);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f518b != null) {
            return this.f518b.setVisible(z, z2);
        }
        this.f504c.f509b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    private C0217c(Context context, C0219a aVar, Resources resources) {
        this.f503a = new Callback() {
            public final void invalidateDrawable(Drawable drawable) {
                C0217c.this.invalidateSelf();
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C0217c.this.unscheduleSelf(runnable);
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C0217c.this.scheduleSelf(runnable, j);
            }
        };
        this.f505d = context;
        this.f504c = new C0219a(context, null, this.f503a, null);
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Animator animator;
        if (this.f518b != null) {
            C0809a.m2329a(this.f518b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray a = C0724g.m2082a(resources, theme, attributeSet, C0215a.f495e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0227i a2 = C0227i.m462a(resources, resourceId, theme);
                        a2.f520c = false;
                        a2.setCallback(this.f503a);
                        if (this.f504c.f509b != null) {
                            this.f504c.f509b.setCallback(null);
                        }
                        this.f504c.f509b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0215a.f496f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f505d != null) {
                            Context context = this.f505d;
                            if (VERSION.SDK_INT >= 24) {
                                animator = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                animator = C0222e.m447a(context, context.getResources(), context.getTheme(), resourceId2, 1.0f);
                            }
                            animator.setTarget(this.f504c.f509b.mo419a(string));
                            if (VERSION.SDK_INT < 21) {
                                m444a(animator);
                            }
                            if (this.f504c.f511d == null) {
                                this.f504c.f511d = new ArrayList<>();
                                this.f504c.f512e = new C0777a<>();
                            }
                            this.f504c.f511d.add(animator);
                            this.f504c.f512e.put(animator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f504c.mo407a();
    }

    /* renamed from: a */
    public static C0217c m443a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C0217c cVar = new C0217c(context);
        cVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return cVar;
    }
}
