package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p017a.p018a.C0217c;
import android.support.p017a.p018a.C0227i;
import android.support.p030v4.graphics.C0803a;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.p038f.C0777a;
import android.support.p030v4.p038f.C0785g;
import android.support.p030v4.p038f.C0786h;
import android.support.p030v4.p038f.C0801o;
import android.support.p043v7.p046b.p047a.C1181a;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.widget.g */
public final class C1480g {

    /* renamed from: a */
    private static final Mode f5338a = Mode.SRC_IN;

    /* renamed from: b */
    private static C1480g f5339b;

    /* renamed from: c */
    private static final C1483c f5340c = new C1483c(6);

    /* renamed from: d */
    private static final int[] f5341d = {R.drawable.bo, R.drawable.bm, R.drawable.h};

    /* renamed from: e */
    private static final int[] f5342e = {R.drawable.a3, R.drawable.b7, R.drawable.a_, R.drawable.a5, R.drawable.a6, R.drawable.a9, R.drawable.a8};

    /* renamed from: f */
    private static final int[] f5343f = {R.drawable.bl, R.drawable.bn, 2131951638, R.drawable.be, R.drawable.bf, R.drawable.bh, R.drawable.bj, R.drawable.bg, R.drawable.bi, R.drawable.bk};

    /* renamed from: g */
    private static final int[] f5344g = {R.drawable.ax, R.drawable.u, R.drawable.aw};

    /* renamed from: h */
    private static final int[] f5345h = {R.drawable.bc, R.drawable.bp};

    /* renamed from: i */
    private static final int[] f5346i = {R.drawable.k, R.drawable.p};

    /* renamed from: j */
    private WeakHashMap<Context, C0801o<ColorStateList>> f5347j;

    /* renamed from: k */
    private C0777a<String, C1484d> f5348k;

    /* renamed from: l */
    private C0801o<String> f5349l;

    /* renamed from: m */
    private final WeakHashMap<Context, C0785g<WeakReference<ConstantState>>> f5350m = new WeakHashMap<>(0);

    /* renamed from: n */
    private TypedValue f5351n;

    /* renamed from: o */
    private boolean f5352o;

    /* renamed from: android.support.v7.widget.g$a */
    static class C1481a implements C1484d {
        C1481a() {
        }

        /* renamed from: a */
        public final Drawable mo5775a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C1181a.m3576a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.g$b */
    static class C1482b implements C1484d {
        C1482b() {
        }

        /* renamed from: a */
        public final Drawable mo5775a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0217c.m443a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.g$c */
    static class C1483c extends C0786h<Integer, PorterDuffColorFilter> {
        public C1483c(int i) {
            super(6);
        }

        /* renamed from: a */
        static int m5221a(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }
    }

    /* renamed from: android.support.v7.widget.g$d */
    interface C1484d {
        /* renamed from: a */
        Drawable mo5775a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: android.support.v7.widget.g$e */
    static class C1485e implements C1484d {
        C1485e() {
        }

        /* renamed from: a */
        public final Drawable mo5775a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0227i.m463a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: a */
    public final synchronized Drawable mo5770a(Context context, int i) {
        return mo5771a(context, i, false);
    }

    /* renamed from: a */
    public final synchronized void mo5773a(Context context) {
        C0785g gVar = (C0785g) this.f5350m.get(context);
        if (gVar != null) {
            gVar.mo2495c();
        }
    }

    /* renamed from: a */
    private synchronized boolean m5210a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C0785g gVar = (C0785g) this.f5350m.get(context);
        if (gVar == null) {
            gVar = new C0785g();
            this.f5350m.put(context, gVar);
        }
        gVar.mo2493b(j, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized Drawable mo5772a(Context context, C1460bg bgVar, int i) {
        Drawable c = m5212c(context, i);
        if (c == null) {
            c = bgVar.mo5705a(i);
        }
        if (c == null) {
            return null;
        }
        return m5203a(context, i, false, c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean m5209a(android.content.Context r6, int r7, android.graphics.drawable.Drawable r8) {
        /*
            android.graphics.PorterDuff$Mode r0 = f5338a
            int[] r1 = f5341d
            boolean r1 = m5211a(r1, r7)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            r3 = -1
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0016
            r2 = 2131362073(0x7f0a0119, float:1.8343916E38)
        L_0x0013:
            r7 = 1
            r1 = -1
            goto L_0x0048
        L_0x0016:
            int[] r1 = f5343f
            boolean r1 = m5211a(r1, r7)
            if (r1 == 0) goto L_0x0022
            r2 = 2131362071(0x7f0a0117, float:1.8343912E38)
            goto L_0x0013
        L_0x0022:
            int[] r1 = f5344g
            boolean r1 = m5211a(r1, r7)
            if (r1 == 0) goto L_0x002d
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L_0x0013
        L_0x002d:
            r1 = 2131951664(0x7f130030, float:1.9539749E38)
            if (r7 != r1) goto L_0x003f
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r7 = 1109603123(0x42233333, float:40.8)
            int r7 = java.lang.Math.round(r7)
            r1 = r7
            r7 = 1
            goto L_0x0048
        L_0x003f:
            r1 = 2131951640(0x7f130018, float:1.95397E38)
            if (r7 != r1) goto L_0x0045
            goto L_0x0013
        L_0x0045:
            r7 = 0
            r1 = -1
            r2 = 0
        L_0x0048:
            if (r7 == 0) goto L_0x0065
            boolean r7 = android.support.p043v7.widget.C1518y.m5428c(r8)
            if (r7 == 0) goto L_0x0054
            android.graphics.drawable.Drawable r8 = r8.mutate()
        L_0x0054:
            int r6 = android.support.p043v7.widget.C1446ax.m5023a(r6, r2)
            android.graphics.PorterDuffColorFilter r6 = m5201a(r6, r0)
            r8.setColorFilter(r6)
            if (r1 == r3) goto L_0x0064
            r8.setAlpha(r1)
        L_0x0064:
            return r5
        L_0x0065:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1480g.m5209a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }

    /* renamed from: a */
    private void m5208a(String str, C1484d dVar) {
        if (this.f5348k == null) {
            this.f5348k = new C0777a<>();
        }
        this.f5348k.put(str, dVar);
    }

    /* renamed from: a */
    private static boolean m5211a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static void m5207a(Drawable drawable, C1448az azVar, int[] iArr) {
        if (!C1518y.m5428c(drawable) || drawable.mutate() == drawable) {
            if (azVar.f5228d || azVar.f5227c) {
                drawable.setColorFilter(m5202a(azVar.f5228d ? azVar.f5225a : null, azVar.f5227c ? azVar.f5226b : f5338a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.graphics.drawable.Drawable mo5771a(android.content.Context r9, int r10, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.f5352o     // Catch:{ all -> 0x0098 }
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0037
            r8.f5352o = r2     // Catch:{ all -> 0x0098 }
            r0 = 2131951706(0x7f13005a, float:1.9539834E38)
            android.graphics.drawable.Drawable r0 = r8.mo5770a(r9, r0)     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x002d
            boolean r3 = r0 instanceof android.support.p017a.p018a.C0227i     // Catch:{ all -> 0x0098 }
            if (r3 != 0) goto L_0x0029
            java.lang.String r3 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x0098 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r0 = 0
            goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r8.f5352o = r1     // Catch:{ all -> 0x0098 }
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0098 }
            java.lang.String r10 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r9.<init>(r10)     // Catch:{ all -> 0x0098 }
            throw r9     // Catch:{ all -> 0x0098 }
        L_0x0037:
            android.graphics.drawable.Drawable r0 = r8.m5212c(r9, r10)     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0085
            android.util.TypedValue r0 = r8.f5351n     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0048
            android.util.TypedValue r0 = new android.util.TypedValue     // Catch:{ all -> 0x0098 }
            r0.<init>()     // Catch:{ all -> 0x0098 }
            r8.f5351n = r0     // Catch:{ all -> 0x0098 }
        L_0x0048:
            android.util.TypedValue r0 = r8.f5351n     // Catch:{ all -> 0x0098 }
            android.content.res.Resources r3 = r9.getResources()     // Catch:{ all -> 0x0098 }
            r3.getValue(r10, r0, r2)     // Catch:{ all -> 0x0098 }
            long r3 = m5199a(r0)     // Catch:{ all -> 0x0098 }
            android.graphics.drawable.Drawable r5 = r8.m5204a(r9, r3)     // Catch:{ all -> 0x0098 }
            if (r5 != 0) goto L_0x0084
            r6 = 2131951637(0x7f130015, float:1.9539694E38)
            if (r10 != r6) goto L_0x007a
            android.graphics.drawable.LayerDrawable r5 = new android.graphics.drawable.LayerDrawable     // Catch:{ all -> 0x0098 }
            r6 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]     // Catch:{ all -> 0x0098 }
            r7 = 2131951636(0x7f130014, float:1.9539692E38)
            android.graphics.drawable.Drawable r7 = r8.mo5770a(r9, r7)     // Catch:{ all -> 0x0098 }
            r6[r1] = r7     // Catch:{ all -> 0x0098 }
            r1 = 2131951638(0x7f130016, float:1.9539696E38)
            android.graphics.drawable.Drawable r1 = r8.mo5770a(r9, r1)     // Catch:{ all -> 0x0098 }
            r6[r2] = r1     // Catch:{ all -> 0x0098 }
            r5.<init>(r6)     // Catch:{ all -> 0x0098 }
        L_0x007a:
            if (r5 == 0) goto L_0x0084
            int r0 = r0.changingConfigurations     // Catch:{ all -> 0x0098 }
            r5.setChangingConfigurations(r0)     // Catch:{ all -> 0x0098 }
            r8.m5210a(r9, r3, r5)     // Catch:{ all -> 0x0098 }
        L_0x0084:
            r0 = r5
        L_0x0085:
            if (r0 != 0) goto L_0x008b
            android.graphics.drawable.Drawable r0 = android.support.p030v4.content.C0726c.m2091a(r9, r10)     // Catch:{ all -> 0x0098 }
        L_0x008b:
            if (r0 == 0) goto L_0x0091
            android.graphics.drawable.Drawable r0 = r8.m5203a(r9, r10, r11, r0)     // Catch:{ all -> 0x0098 }
        L_0x0091:
            if (r0 == 0) goto L_0x0096
            android.support.p043v7.widget.C1518y.m5427b(r0)     // Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r8)
            return r0
        L_0x0098:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1480g.mo5771a(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    public static synchronized C1480g m5205a() {
        C1480g gVar;
        synchronized (C1480g.class) {
            if (f5339b == null) {
                C1480g gVar2 = new C1480g();
                f5339b = gVar2;
                if (VERSION.SDK_INT < 24) {
                    gVar2.m5208a("vector", (C1484d) new C1485e());
                    gVar2.m5208a("animated-vector", (C1484d) new C1482b());
                    gVar2.m5208a("animated-selector", (C1484d) new C1481a());
                }
            }
            gVar = f5339b;
        }
        return gVar;
    }

    /* renamed from: a */
    private static long m5199a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    private static Mode m5200a(int i) {
        if (i == R.drawable.ba) {
            return Mode.MULTIPLY;
        }
        return null;
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m5201a(int i, Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C1480g.class) {
            porterDuffColorFilter = (PorterDuffColorFilter) f5340c.mo2501a(Integer.valueOf(C1483c.m5221a(i, mode)));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) f5340c.mo2502a(Integer.valueOf(C1483c.m5221a(i, mode)), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: d */
    private static ColorStateList m5213d(Context context, int i) {
        int a = C1446ax.m5023a(context, R.attr.fu);
        return new ColorStateList(new int[][]{C1446ax.f5211a, C1446ax.f5214d, C1446ax.f5212b, C1446ax.f5218h}, new int[]{C1446ax.m5027c(context, R.attr.fs), C0803a.m2295a(a, i), C0803a.m2295a(a, i), i});
    }

    /* renamed from: c */
    private Drawable m5212c(Context context, int i) {
        int next;
        if (this.f5348k == null || this.f5348k.isEmpty()) {
            return null;
        }
        if (this.f5349l != null) {
            String str = (String) this.f5349l.mo2591a(i);
            if ("appcompat_skip_skip".equals(str) || (str != null && this.f5348k.get(str) == null)) {
                return null;
            }
        } else {
            this.f5349l = new C0801o<>();
        }
        if (this.f5351n == null) {
            this.f5351n = new TypedValue();
        }
        TypedValue typedValue = this.f5351n;
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        long a = m5199a(typedValue);
        Drawable a2 = m5204a(context, a);
        if (a2 != null) {
            return a2;
        }
        if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    String name = xml.getName();
                    this.f5349l.mo2598c(i, name);
                    C1484d dVar = (C1484d) this.f5348k.get(name);
                    if (dVar != null) {
                        a2 = dVar.mo5775a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (a2 != null) {
                        a2.setChangingConfigurations(typedValue.changingConfigurations);
                        m5210a(context, a, a2);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception unused) {
            }
        }
        if (a2 == null) {
            this.f5349l.mo2598c(i, "appcompat_skip_skip");
        }
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m5204a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, android.support.v4.f.g<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f5350m     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            android.support.v4.f.g r0 = (android.support.p030v4.p038f.C0785g) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo2487a(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo2492b(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1480g.m5204a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0121  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized android.content.res.ColorStateList mo5774b(android.content.Context r10, int r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.WeakHashMap<android.content.Context, android.support.v4.f.o<android.content.res.ColorStateList>> r0 = r9.f5347j     // Catch:{ all -> 0x0145 }
            r1 = 0
            if (r0 == 0) goto L_0x0017
            java.util.WeakHashMap<android.content.Context, android.support.v4.f.o<android.content.res.ColorStateList>> r0 = r9.f5347j     // Catch:{ all -> 0x0145 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0145 }
            android.support.v4.f.o r0 = (android.support.p030v4.p038f.C0801o) r0     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x0017
            java.lang.Object r0 = r0.mo2591a(r11)     // Catch:{ all -> 0x0145 }
            r1 = r0
            android.content.res.ColorStateList r1 = (android.content.res.ColorStateList) r1     // Catch:{ all -> 0x0145 }
        L_0x0017:
            if (r1 != 0) goto L_0x0143
            r0 = 2131951641(0x7f130019, float:1.9539702E38)
            if (r11 != r0) goto L_0x0028
            r0 = 2131820667(0x7f11007b, float:1.9274055E38)
            android.content.res.ColorStateList r0 = android.support.p043v7.p044a.p045a.C1124a.m3313a(r10, r0)     // Catch:{ all -> 0x0145 }
        L_0x0025:
            r1 = r0
            goto L_0x011f
        L_0x0028:
            r0 = 2131951691(0x7f13004b, float:1.9539804E38)
            if (r11 != r0) goto L_0x0035
            r0 = 2131820670(0x7f11007e, float:1.9274061E38)
            android.content.res.ColorStateList r0 = android.support.p043v7.p044a.p045a.C1124a.m3313a(r10, r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0025
        L_0x0035:
            r0 = 2131951690(0x7f13004a, float:1.9539802E38)
            r2 = 0
            if (r11 != r0) goto L_0x009b
            r0 = 3
            int[][] r1 = new int[r0][]     // Catch:{ all -> 0x0145 }
            int[] r0 = new int[r0]     // Catch:{ all -> 0x0145 }
            r3 = 2131362079(0x7f0a011f, float:1.8343928E38)
            android.content.res.ColorStateList r4 = android.support.p043v7.widget.C1446ax.m5026b(r10, r3)     // Catch:{ all -> 0x0145 }
            r5 = 2131362071(0x7f0a0117, float:1.8343912E38)
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0075
            boolean r8 = r4.isStateful()     // Catch:{ all -> 0x0145 }
            if (r8 == 0) goto L_0x0075
            int[] r3 = android.support.p043v7.widget.C1446ax.f5211a     // Catch:{ all -> 0x0145 }
            r1[r2] = r3     // Catch:{ all -> 0x0145 }
            r3 = r1[r2]     // Catch:{ all -> 0x0145 }
            int r3 = r4.getColorForState(r3, r2)     // Catch:{ all -> 0x0145 }
            r0[r2] = r3     // Catch:{ all -> 0x0145 }
            int[] r2 = android.support.p043v7.widget.C1446ax.f5215e     // Catch:{ all -> 0x0145 }
            r1[r7] = r2     // Catch:{ all -> 0x0145 }
            int r2 = android.support.p043v7.widget.C1446ax.m5023a(r10, r5)     // Catch:{ all -> 0x0145 }
            r0[r7] = r2     // Catch:{ all -> 0x0145 }
            int[] r2 = android.support.p043v7.widget.C1446ax.f5218h     // Catch:{ all -> 0x0145 }
            r1[r6] = r2     // Catch:{ all -> 0x0145 }
            int r2 = r4.getDefaultColor()     // Catch:{ all -> 0x0145 }
            r0[r6] = r2     // Catch:{ all -> 0x0145 }
            goto L_0x0093
        L_0x0075:
            int[] r4 = android.support.p043v7.widget.C1446ax.f5211a     // Catch:{ all -> 0x0145 }
            r1[r2] = r4     // Catch:{ all -> 0x0145 }
            int r4 = android.support.p043v7.widget.C1446ax.m5027c(r10, r3)     // Catch:{ all -> 0x0145 }
            r0[r2] = r4     // Catch:{ all -> 0x0145 }
            int[] r2 = android.support.p043v7.widget.C1446ax.f5215e     // Catch:{ all -> 0x0145 }
            r1[r7] = r2     // Catch:{ all -> 0x0145 }
            int r2 = android.support.p043v7.widget.C1446ax.m5023a(r10, r5)     // Catch:{ all -> 0x0145 }
            r0[r7] = r2     // Catch:{ all -> 0x0145 }
            int[] r2 = android.support.p043v7.widget.C1446ax.f5218h     // Catch:{ all -> 0x0145 }
            r1[r6] = r2     // Catch:{ all -> 0x0145 }
            int r2 = android.support.p043v7.widget.C1446ax.m5023a(r10, r3)     // Catch:{ all -> 0x0145 }
            r0[r6] = r2     // Catch:{ all -> 0x0145 }
        L_0x0093:
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList     // Catch:{ all -> 0x0145 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0145 }
            r1 = r2
            goto L_0x011f
        L_0x009b:
            r0 = 2131951630(0x7f13000e, float:1.953968E38)
            if (r11 != r0) goto L_0x00ad
            r0 = 2131362070(0x7f0a0116, float:1.834391E38)
            int r0 = android.support.p043v7.widget.C1446ax.m5023a(r10, r0)     // Catch:{ all -> 0x0145 }
            android.content.res.ColorStateList r0 = m5213d(r10, r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0025
        L_0x00ad:
            r0 = 2131951625(0x7f130009, float:1.953967E38)
            if (r11 != r0) goto L_0x00b8
            android.content.res.ColorStateList r0 = m5213d(r10, r2)     // Catch:{ all -> 0x0145 }
            goto L_0x0025
        L_0x00b8:
            r0 = 2131951629(0x7f13000d, float:1.9539678E38)
            if (r11 != r0) goto L_0x00ca
            r0 = 2131362068(0x7f0a0114, float:1.8343906E38)
            int r0 = android.support.p043v7.widget.C1446ax.m5023a(r10, r0)     // Catch:{ all -> 0x0145 }
            android.content.res.ColorStateList r0 = m5213d(r10, r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0025
        L_0x00ca:
            r0 = 2131951688(0x7f130048, float:1.9539798E38)
            if (r11 == r0) goto L_0x0116
            r0 = 2131951689(0x7f130049, float:1.95398E38)
            if (r11 != r0) goto L_0x00d5
            goto L_0x0116
        L_0x00d5:
            int[] r0 = f5342e     // Catch:{ all -> 0x0145 }
            boolean r0 = m5211a(r0, r11)     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x00e6
            r0 = 2131362073(0x7f0a0119, float:1.8343916E38)
            android.content.res.ColorStateList r0 = android.support.p043v7.widget.C1446ax.m5026b(r10, r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0025
        L_0x00e6:
            int[] r0 = f5345h     // Catch:{ all -> 0x0145 }
            boolean r0 = m5211a(r0, r11)     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x00f7
            r0 = 2131820666(0x7f11007a, float:1.9274053E38)
            android.content.res.ColorStateList r0 = android.support.p043v7.p044a.p045a.C1124a.m3313a(r10, r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0025
        L_0x00f7:
            int[] r0 = f5346i     // Catch:{ all -> 0x0145 }
            boolean r0 = m5211a(r0, r11)     // Catch:{ all -> 0x0145 }
            if (r0 == 0) goto L_0x0108
            r0 = 2131820665(0x7f110079, float:1.9274051E38)
            android.content.res.ColorStateList r0 = android.support.p043v7.p044a.p045a.C1124a.m3313a(r10, r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0025
        L_0x0108:
            r0 = 2131951685(0x7f130045, float:1.9539791E38)
            if (r11 != r0) goto L_0x011f
            r0 = 2131820668(0x7f11007c, float:1.9274057E38)
            android.content.res.ColorStateList r0 = android.support.p043v7.p044a.p045a.C1124a.m3313a(r10, r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0025
        L_0x0116:
            r0 = 2131820669(0x7f11007d, float:1.927406E38)
            android.content.res.ColorStateList r0 = android.support.p043v7.p044a.p045a.C1124a.m3313a(r10, r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0025
        L_0x011f:
            if (r1 == 0) goto L_0x0143
            java.util.WeakHashMap<android.content.Context, android.support.v4.f.o<android.content.res.ColorStateList>> r0 = r9.f5347j     // Catch:{ all -> 0x0145 }
            if (r0 != 0) goto L_0x012c
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch:{ all -> 0x0145 }
            r0.<init>()     // Catch:{ all -> 0x0145 }
            r9.f5347j = r0     // Catch:{ all -> 0x0145 }
        L_0x012c:
            java.util.WeakHashMap<android.content.Context, android.support.v4.f.o<android.content.res.ColorStateList>> r0 = r9.f5347j     // Catch:{ all -> 0x0145 }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x0145 }
            android.support.v4.f.o r0 = (android.support.p030v4.p038f.C0801o) r0     // Catch:{ all -> 0x0145 }
            if (r0 != 0) goto L_0x0140
            android.support.v4.f.o r0 = new android.support.v4.f.o     // Catch:{ all -> 0x0145 }
            r0.<init>()     // Catch:{ all -> 0x0145 }
            java.util.WeakHashMap<android.content.Context, android.support.v4.f.o<android.content.res.ColorStateList>> r2 = r9.f5347j     // Catch:{ all -> 0x0145 }
            r2.put(r10, r0)     // Catch:{ all -> 0x0145 }
        L_0x0140:
            r0.mo2598c(r11, r1)     // Catch:{ all -> 0x0145 }
        L_0x0143:
            monitor-exit(r9)
            return r1
        L_0x0145:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1480g.mo5774b(android.content.Context, int):android.content.res.ColorStateList");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m5202a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m5201a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    private static void m5206a(Drawable drawable, int i, Mode mode) {
        if (C1518y.m5428c(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f5338a;
        }
        drawable.setColorFilter(m5201a(i, mode));
    }

    /* renamed from: a */
    private Drawable m5203a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo5774b(context, i);
        if (b != null) {
            if (C1518y.m5428c(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable f = C0809a.m2337f(drawable);
            C0809a.m2327a(f, b);
            Mode a = m5200a(i);
            if (a == null) {
                return f;
            }
            C0809a.m2330a(f, a);
            return f;
        } else if (i == R.drawable.b8) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            m5206a(layerDrawable.findDrawableByLayerId(16908288), C1446ax.m5023a(context, R.attr.fv), f5338a);
            m5206a(layerDrawable.findDrawableByLayerId(16908303), C1446ax.m5023a(context, R.attr.fv), f5338a);
            m5206a(layerDrawable.findDrawableByLayerId(16908301), C1446ax.m5023a(context, R.attr.ft), f5338a);
            return drawable;
        } else if (i == R.drawable.az || i == R.drawable.ay || i == R.drawable.b0) {
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m5206a(layerDrawable2.findDrawableByLayerId(16908288), C1446ax.m5027c(context, R.attr.fv), f5338a);
            m5206a(layerDrawable2.findDrawableByLayerId(16908303), C1446ax.m5023a(context, R.attr.ft), f5338a);
            m5206a(layerDrawable2.findDrawableByLayerId(16908301), C1446ax.m5023a(context, R.attr.ft), f5338a);
            return drawable;
        } else if (m5209a(context, i, drawable) || !z) {
            return drawable;
        } else {
            return null;
        }
    }
}
