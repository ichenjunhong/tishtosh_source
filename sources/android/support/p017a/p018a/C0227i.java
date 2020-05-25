package android.support.p017a.p018a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.p030v4.content.p035a.C0711b;
import android.support.p030v4.content.p035a.C0720f;
import android.support.p030v4.content.p035a.C0724g;
import android.support.p030v4.graphics.C0804b;
import android.support.p030v4.graphics.C0804b.C0806b;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.p038f.C0777a;
import android.util.AttributeSet;
import android.util.Xml;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import leakcanary.internal.LeakCanaryFileProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.a.a.i */
public final class C0227i extends C0226h {

    /* renamed from: a */
    static final Mode f519a = Mode.SRC_IN;

    /* renamed from: c */
    public boolean f520c;

    /* renamed from: d */
    private C0235g f521d;

    /* renamed from: e */
    private PorterDuffColorFilter f522e;

    /* renamed from: f */
    private ColorFilter f523f;

    /* renamed from: g */
    private boolean f524g;

    /* renamed from: h */
    private ConstantState f525h;

    /* renamed from: i */
    private final float[] f526i;

    /* renamed from: j */
    private final Matrix f527j;

    /* renamed from: k */
    private final Rect f528k;

    /* renamed from: android.support.a.a.i$a */
    static class C0229a extends C0233e {
        public C0229a() {
        }

        /* renamed from: a */
        public final boolean mo442a() {
            return true;
        }

        public C0229a(C0229a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo441a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f556n = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f555m = C0804b.m2306b(string2);
            }
        }
    }

    /* renamed from: android.support.a.a.i$b */
    static class C0230b extends C0233e {

        /* renamed from: a */
        C0711b f529a;

        /* renamed from: b */
        float f530b;

        /* renamed from: c */
        C0711b f531c;

        /* renamed from: d */
        float f532d = 1.0f;

        /* renamed from: e */
        int f533e;

        /* renamed from: f */
        float f534f = 1.0f;

        /* renamed from: g */
        float f535g;

        /* renamed from: h */
        float f536h = 1.0f;

        /* renamed from: i */
        float f537i;

        /* renamed from: j */
        Cap f538j = Cap.BUTT;

        /* renamed from: k */
        Join f539k = Join.MITER;

        /* renamed from: l */
        float f540l = 4.0f;

        /* renamed from: p */
        private int[] f541p;

        /* access modifiers changed from: 0000 */
        public final float getFillAlpha() {
            return this.f534f;
        }

        /* access modifiers changed from: 0000 */
        public final float getStrokeAlpha() {
            return this.f532d;
        }

        /* access modifiers changed from: 0000 */
        public final float getStrokeWidth() {
            return this.f530b;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathEnd() {
            return this.f536h;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathOffset() {
            return this.f537i;
        }

        /* access modifiers changed from: 0000 */
        public final float getTrimPathStart() {
            return this.f535g;
        }

        /* access modifiers changed from: 0000 */
        public final int getFillColor() {
            return this.f531c.f2501b;
        }

        /* access modifiers changed from: 0000 */
        public final int getStrokeColor() {
            return this.f529a.f2501b;
        }

        public C0230b() {
        }

        /* renamed from: b */
        public final boolean mo445b() {
            if (this.f531c.mo2379b() || this.f529a.mo2379b()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        public final void setFillAlpha(float f) {
            this.f534f = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeAlpha(float f) {
            this.f532d = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeWidth(float f) {
            this.f530b = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathEnd(float f) {
            this.f536h = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathOffset(float f) {
            this.f537i = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setTrimPathStart(float f) {
            this.f535g = f;
        }

        /* access modifiers changed from: 0000 */
        public final void setFillColor(int i) {
            this.f531c.f2501b = i;
        }

        /* access modifiers changed from: 0000 */
        public final void setStrokeColor(int i) {
            this.f529a.f2501b = i;
        }

        /* renamed from: a */
        public final boolean mo444a(int[] iArr) {
            return this.f529a.mo2378a(iArr) | this.f531c.mo2378a(iArr);
        }

        public C0230b(C0230b bVar) {
            super(bVar);
            this.f541p = bVar.f541p;
            this.f529a = bVar.f529a;
            this.f530b = bVar.f530b;
            this.f532d = bVar.f532d;
            this.f531c = bVar.f531c;
            this.f533e = bVar.f533e;
            this.f534f = bVar.f534f;
            this.f535g = bVar.f535g;
            this.f536h = bVar.f536h;
            this.f537i = bVar.f537i;
            this.f538j = bVar.f538j;
            this.f539k = bVar.f539k;
            this.f540l = bVar.f540l;
        }

        /* renamed from: a */
        private static Cap m468a(int i, Cap cap) {
            switch (i) {
                case 0:
                    return Cap.BUTT;
                case 1:
                    return Cap.ROUND;
                case 2:
                    return Cap.SQUARE;
                default:
                    return cap;
            }
        }

        /* renamed from: a */
        private static Join m469a(int i, Join join) {
            switch (i) {
                case 0:
                    return Join.MITER;
                case 1:
                    return Join.ROUND;
                case 2:
                    return Join.BEVEL;
                default:
                    return join;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo443a(TypedArray typedArray, XmlPullParser xmlPullParser, Theme theme) {
            this.f541p = null;
            if (C0724g.m2085a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f556n = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f555m = C0804b.m2306b(string2);
                }
                Theme theme2 = theme;
                this.f531c = C0724g.m2083a(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f534f = C0724g.m2080a(typedArray, xmlPullParser, "fillAlpha", 12, this.f534f);
                this.f538j = m468a(C0724g.m2081a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f538j);
                this.f539k = m469a(C0724g.m2081a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f539k);
                this.f540l = C0724g.m2080a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f540l);
                this.f529a = C0724g.m2083a(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f532d = C0724g.m2080a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f532d);
                this.f530b = C0724g.m2080a(typedArray, xmlPullParser, "strokeWidth", 4, this.f530b);
                this.f536h = C0724g.m2080a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f536h);
                this.f537i = C0724g.m2080a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f537i);
                this.f535g = C0724g.m2080a(typedArray, xmlPullParser, "trimPathStart", 5, this.f535g);
                this.f533e = C0724g.m2081a(typedArray, xmlPullParser, "fillType", 13, this.f533e);
            }
        }
    }

    /* renamed from: android.support.a.a.i$c */
    static class C0231c extends C0232d {

        /* renamed from: a */
        final Matrix f542a = new Matrix();

        /* renamed from: b */
        final ArrayList<C0232d> f543b = new ArrayList<>();

        /* renamed from: c */
        float f544c = 0.0f;

        /* renamed from: d */
        float f545d = 0.0f;

        /* renamed from: e */
        float f546e = 0.0f;

        /* renamed from: f */
        float f547f = 1.0f;

        /* renamed from: g */
        float f548g = 1.0f;

        /* renamed from: h */
        float f549h = 0.0f;

        /* renamed from: i */
        float f550i = 0.0f;

        /* renamed from: j */
        final Matrix f551j = new Matrix();

        /* renamed from: k */
        int f552k;

        /* renamed from: l */
        int[] f553l;

        /* renamed from: m */
        String f554m = null;

        public final String getGroupName() {
            return this.f554m;
        }

        public final Matrix getLocalMatrix() {
            return this.f551j;
        }

        public final float getPivotX() {
            return this.f545d;
        }

        public final float getPivotY() {
            return this.f546e;
        }

        public final float getRotation() {
            return this.f544c;
        }

        public final float getScaleX() {
            return this.f547f;
        }

        public final float getScaleY() {
            return this.f548g;
        }

        public final float getTranslateX() {
            return this.f549h;
        }

        public final float getTranslateY() {
            return this.f550i;
        }

        /* renamed from: b */
        public final boolean mo445b() {
            for (int i = 0; i < this.f543b.size(); i++) {
                if (((C0232d) this.f543b.get(i)).mo445b()) {
                    return true;
                }
            }
            return false;
        }

        public C0231c() {
            super();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo462a() {
            this.f551j.reset();
            this.f551j.postTranslate(-this.f545d, -this.f546e);
            this.f551j.postScale(this.f547f, this.f548g);
            this.f551j.postRotate(this.f544c, 0.0f, 0.0f);
            this.f551j.postTranslate(this.f549h + this.f545d, this.f550i + this.f546e);
        }

        public final void setPivotX(float f) {
            if (f != this.f545d) {
                this.f545d = f;
                mo462a();
            }
        }

        public final void setPivotY(float f) {
            if (f != this.f546e) {
                this.f546e = f;
                mo462a();
            }
        }

        public final void setRotation(float f) {
            if (f != this.f544c) {
                this.f544c = f;
                mo462a();
            }
        }

        public final void setScaleX(float f) {
            if (f != this.f547f) {
                this.f547f = f;
                mo462a();
            }
        }

        public final void setScaleY(float f) {
            if (f != this.f548g) {
                this.f548g = f;
                mo462a();
            }
        }

        public final void setTranslateX(float f) {
            if (f != this.f549h) {
                this.f549h = f;
                mo462a();
            }
        }

        public final void setTranslateY(float f) {
            if (f != this.f550i) {
                this.f550i = f;
                mo462a();
            }
        }

        /* renamed from: a */
        public final boolean mo444a(int[] iArr) {
            boolean z = false;
            for (int i = 0; i < this.f543b.size(); i++) {
                z |= ((C0232d) this.f543b.get(i)).mo444a(iArr);
            }
            return z;
        }

        public C0231c(C0231c cVar, C0777a<String, Object> aVar) {
            C0233e eVar;
            super();
            this.f544c = cVar.f544c;
            this.f545d = cVar.f545d;
            this.f546e = cVar.f546e;
            this.f547f = cVar.f547f;
            this.f548g = cVar.f548g;
            this.f549h = cVar.f549h;
            this.f550i = cVar.f550i;
            this.f553l = cVar.f553l;
            this.f554m = cVar.f554m;
            this.f552k = cVar.f552k;
            if (this.f554m != null) {
                aVar.put(this.f554m, this);
            }
            this.f551j.set(cVar.f551j);
            ArrayList<C0232d> arrayList = cVar.f543b;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0231c) {
                    this.f543b.add(new C0231c((C0231c) obj, aVar));
                } else {
                    if (obj instanceof C0230b) {
                        eVar = new C0230b((C0230b) obj);
                    } else if (obj instanceof C0229a) {
                        eVar = new C0229a((C0229a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f543b.add(eVar);
                    if (eVar.f556n != null) {
                        aVar.put(eVar.f556n, eVar);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.a.a.i$d */
    static abstract class C0232d {
        private C0232d() {
        }

        /* renamed from: a */
        public boolean mo444a(int[] iArr) {
            return false;
        }

        /* renamed from: b */
        public boolean mo445b() {
            return false;
        }
    }

    /* renamed from: android.support.a.a.i$e */
    static abstract class C0233e extends C0232d {

        /* renamed from: m */
        protected C0806b[] f555m;

        /* renamed from: n */
        String f556n;

        /* renamed from: o */
        int f557o;

        /* renamed from: a */
        public boolean mo442a() {
            return false;
        }

        public C0806b[] getPathData() {
            return this.f555m;
        }

        public String getPathName() {
            return this.f556n;
        }

        public C0233e() {
            super();
        }

        /* renamed from: a */
        public final void mo479a(Path path) {
            path.reset();
            if (this.f555m != null) {
                C0806b.m2311a(this.f555m, path);
            }
        }

        public C0233e(C0233e eVar) {
            super();
            this.f556n = eVar.f556n;
            this.f557o = eVar.f557o;
            this.f555m = C0804b.m2305a(eVar.f555m);
        }

        public void setPathData(C0806b[] bVarArr) {
            if (!C0804b.m2303a(this.f555m, bVarArr)) {
                this.f555m = C0804b.m2305a(bVarArr);
                return;
            }
            C0806b[] bVarArr2 = this.f555m;
            for (int i = 0; i < bVarArr.length; i++) {
                bVarArr2[i].f2733a = bVarArr[i].f2733a;
                for (int i2 = 0; i2 < bVarArr[i].f2734b.length; i2++) {
                    bVarArr2[i].f2734b[i2] = bVarArr[i].f2734b[i2];
                }
            }
        }
    }

    /* renamed from: android.support.a.a.i$f */
    static class C0234f {

        /* renamed from: n */
        private static final Matrix f558n = new Matrix();

        /* renamed from: a */
        Paint f559a;

        /* renamed from: b */
        Paint f560b;

        /* renamed from: c */
        final C0231c f561c;

        /* renamed from: d */
        float f562d;

        /* renamed from: e */
        float f563e;

        /* renamed from: f */
        float f564f;

        /* renamed from: g */
        float f565g;

        /* renamed from: h */
        int f566h;

        /* renamed from: i */
        String f567i;

        /* renamed from: j */
        Boolean f568j;

        /* renamed from: k */
        final C0777a<String, Object> f569k;

        /* renamed from: l */
        private final Path f570l;

        /* renamed from: m */
        private final Path f571m;

        /* renamed from: o */
        private final Matrix f572o;

        /* renamed from: p */
        private PathMeasure f573p;

        /* renamed from: q */
        private int f574q;

        public final int getRootAlpha() {
            return this.f566h;
        }

        public final float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        /* renamed from: a */
        public final boolean mo484a() {
            if (this.f568j == null) {
                this.f568j = Boolean.valueOf(this.f561c.mo445b());
            }
            return this.f568j.booleanValue();
        }

        public C0234f() {
            this.f572o = new Matrix();
            this.f562d = 0.0f;
            this.f563e = 0.0f;
            this.f564f = 0.0f;
            this.f565g = 0.0f;
            this.f566h = NormalGiftView.ALPHA_255;
            this.f567i = null;
            this.f568j = null;
            this.f569k = new C0777a<>();
            this.f561c = new C0231c();
            this.f570l = new Path();
            this.f571m = new Path();
        }

        public final void setRootAlpha(int i) {
            this.f566h = i;
        }

        public final void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public C0234f(C0234f fVar) {
            this.f572o = new Matrix();
            this.f562d = 0.0f;
            this.f563e = 0.0f;
            this.f564f = 0.0f;
            this.f565g = 0.0f;
            this.f566h = NormalGiftView.ALPHA_255;
            this.f567i = null;
            this.f568j = null;
            this.f569k = new C0777a<>();
            this.f561c = new C0231c(fVar.f561c, this.f569k);
            this.f570l = new Path(fVar.f570l);
            this.f571m = new Path(fVar.f571m);
            this.f562d = fVar.f562d;
            this.f563e = fVar.f563e;
            this.f564f = fVar.f564f;
            this.f565g = fVar.f565g;
            this.f574q = fVar.f574q;
            this.f566h = fVar.f566h;
            this.f567i = fVar.f567i;
            if (fVar.f567i != null) {
                this.f569k.put(fVar.f567i, this);
            }
            this.f568j = fVar.f568j;
        }

        /* renamed from: a */
        public final void mo483a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m480a(this.f561c, f558n, canvas, i, i2, null);
        }

        /* JADX WARNING: type inference failed for: r11v0 */
        /* JADX WARNING: type inference failed for: r11v1, types: [boolean] */
        /* JADX WARNING: type inference failed for: r11v2 */
        /* JADX WARNING: type inference failed for: r11v21 */
        /* JADX WARNING: type inference failed for: r11v22 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r11v1, types: [boolean]
          assigns: []
          uses: [?[int, short, byte, char], boolean]
          mth insns count: 222
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 3 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m480a(android.support.p017a.p018a.C0227i.C0231c r17, android.graphics.Matrix r18, android.graphics.Canvas r19, int r20, int r21, android.graphics.ColorFilter r22) {
            /*
                r16 = this;
                r7 = r16
                r8 = r17
                r9 = r19
                r10 = r22
                android.graphics.Matrix r0 = r8.f542a
                r1 = r18
                r0.set(r1)
                android.graphics.Matrix r0 = r8.f542a
                android.graphics.Matrix r1 = r8.f551j
                r0.preConcat(r1)
                r19.save()
                r11 = 0
                r12 = 0
            L_0x001b:
                java.util.ArrayList<android.support.a.a.i$d> r0 = r8.f543b
                int r0 = r0.size()
                if (r12 >= r0) goto L_0x0206
                java.util.ArrayList<android.support.a.a.i$d> r0 = r8.f543b
                java.lang.Object r0 = r0.get(r12)
                android.support.a.a.i$d r0 = (android.support.p017a.p018a.C0227i.C0232d) r0
                boolean r1 = r0 instanceof android.support.p017a.p018a.C0227i.C0231c
                if (r1 == 0) goto L_0x0048
                r1 = r0
                android.support.a.a.i$c r1 = (android.support.p017a.p018a.C0227i.C0231c) r1
                android.graphics.Matrix r2 = r8.f542a
                r0 = r16
                r3 = r19
                r4 = r20
                r5 = r21
                r6 = r22
                r0.m480a(r1, r2, r3, r4, r5, r6)
            L_0x0041:
                r1 = r20
                r3 = r21
                r5 = r7
                goto L_0x0200
            L_0x0048:
                boolean r1 = r0 instanceof android.support.p017a.p018a.C0227i.C0233e
                if (r1 == 0) goto L_0x0041
                android.support.a.a.i$e r0 = (android.support.p017a.p018a.C0227i.C0233e) r0
                r1 = r20
                float r2 = (float) r1
                float r3 = r7.f564f
                float r2 = r2 / r3
                r3 = r21
                float r4 = (float) r3
                float r5 = r7.f565g
                float r4 = r4 / r5
                float r5 = java.lang.Math.min(r2, r4)
                android.graphics.Matrix r6 = r8.f542a
                android.graphics.Matrix r13 = r7.f572o
                r13.set(r6)
                android.graphics.Matrix r13 = r7.f572o
                r13.postScale(r2, r4)
                r2 = 4
                float[] r2 = new float[r2]
                r2 = {0, 1065353216, 1065353216, 0} // fill-array
                r6.mapVectors(r2)
                r4 = r2[r11]
                double r13 = (double) r4
                r4 = 1
                r6 = r2[r4]
                r15 = r5
                double r4 = (double) r6
                double r4 = java.lang.Math.hypot(r13, r4)
                float r4 = (float) r4
                r5 = 2
                r6 = r2[r5]
                double r13 = (double) r6
                r6 = 3
                r5 = r2[r6]
                double r6 = (double) r5
                double r5 = java.lang.Math.hypot(r13, r6)
                float r5 = (float) r5
                r6 = r2[r11]
                r7 = 1
                r13 = r2[r7]
                r7 = 2
                r7 = r2[r7]
                r14 = 3
                r2 = r2[r14]
                float r6 = r6 * r2
                float r13 = r13 * r7
                float r6 = r6 - r13
                float r2 = java.lang.Math.max(r4, r5)
                r4 = 0
                int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r5 <= 0) goto L_0x00ad
                float r5 = java.lang.Math.abs(r6)
                float r2 = r5 / r2
                goto L_0x00ae
            L_0x00ad:
                r2 = 0
            L_0x00ae:
                int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x01fe
                r5 = r16
                android.graphics.Path r6 = r5.f570l
                r0.mo479a(r6)
                android.graphics.Path r6 = r5.f570l
                android.graphics.Path r7 = r5.f571m
                r7.reset()
                boolean r7 = r0.mo442a()
                if (r7 == 0) goto L_0x00d4
                android.graphics.Path r0 = r5.f571m
                android.graphics.Matrix r2 = r5.f572o
                r0.addPath(r6, r2)
                android.graphics.Path r0 = r5.f571m
                r9.clipPath(r0)
                goto L_0x0200
            L_0x00d4:
                android.support.a.a.i$b r0 = (android.support.p017a.p018a.C0227i.C0230b) r0
                float r7 = r0.f535g
                r13 = 1065353216(0x3f800000, float:1.0)
                int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r7 != 0) goto L_0x00e4
                float r7 = r0.f536h
                int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
                if (r7 == 0) goto L_0x012a
            L_0x00e4:
                float r7 = r0.f535g
                float r14 = r0.f537i
                float r7 = r7 + r14
                float r7 = r7 % r13
                float r14 = r0.f536h
                float r4 = r0.f537i
                float r14 = r14 + r4
                float r14 = r14 % r13
                android.graphics.PathMeasure r4 = r5.f573p
                if (r4 != 0) goto L_0x00fb
                android.graphics.PathMeasure r4 = new android.graphics.PathMeasure
                r4.<init>()
                r5.f573p = r4
            L_0x00fb:
                android.graphics.PathMeasure r4 = r5.f573p
                android.graphics.Path r13 = r5.f570l
                r4.setPath(r13, r11)
                android.graphics.PathMeasure r4 = r5.f573p
                float r4 = r4.getLength()
                float r7 = r7 * r4
                float r14 = r14 * r4
                r6.reset()
                int r13 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
                if (r13 <= 0) goto L_0x0120
                android.graphics.PathMeasure r13 = r5.f573p
                r11 = 1
                r13.getSegment(r7, r4, r6, r11)
                android.graphics.PathMeasure r4 = r5.f573p
                r13 = 0
                r4.getSegment(r13, r14, r6, r11)
                goto L_0x0127
            L_0x0120:
                r11 = 1
                r13 = 0
                android.graphics.PathMeasure r4 = r5.f573p
                r4.getSegment(r7, r14, r6, r11)
            L_0x0127:
                r6.rLineTo(r13, r13)
            L_0x012a:
                android.graphics.Path r4 = r5.f571m
                android.graphics.Matrix r7 = r5.f572o
                r4.addPath(r6, r7)
                android.support.v4.content.a.b r4 = r0.f531c
                boolean r4 = r4.mo2380c()
                r6 = 1132396544(0x437f0000, float:255.0)
                if (r4 == 0) goto L_0x018f
                android.support.v4.content.a.b r4 = r0.f531c
                android.graphics.Paint r7 = r5.f560b
                if (r7 != 0) goto L_0x0150
                android.graphics.Paint r7 = new android.graphics.Paint
                r11 = 1
                r7.<init>(r11)
                r5.f560b = r7
                android.graphics.Paint r7 = r5.f560b
                android.graphics.Paint$Style r11 = android.graphics.Paint.Style.FILL
                r7.setStyle(r11)
            L_0x0150:
                android.graphics.Paint r7 = r5.f560b
                boolean r11 = r4.mo2377a()
                if (r11 == 0) goto L_0x016e
                android.graphics.Shader r4 = r4.f2500a
                android.graphics.Matrix r11 = r5.f572o
                r4.setLocalMatrix(r11)
                r7.setShader(r4)
                float r4 = r0.f534f
                float r4 = r4 * r6
                int r4 = java.lang.Math.round(r4)
                r7.setAlpha(r4)
                goto L_0x0179
            L_0x016e:
                int r4 = r4.f2501b
                float r11 = r0.f534f
                int r4 = android.support.p017a.p018a.C0227i.m460a(r4, r11)
                r7.setColor(r4)
            L_0x0179:
                r7.setColorFilter(r10)
                android.graphics.Path r4 = r5.f571m
                int r11 = r0.f533e
                if (r11 != 0) goto L_0x0185
                android.graphics.Path$FillType r11 = android.graphics.Path.FillType.WINDING
                goto L_0x0187
            L_0x0185:
                android.graphics.Path$FillType r11 = android.graphics.Path.FillType.EVEN_ODD
            L_0x0187:
                r4.setFillType(r11)
                android.graphics.Path r4 = r5.f571m
                r9.drawPath(r4, r7)
            L_0x018f:
                android.support.v4.content.a.b r4 = r0.f529a
                boolean r4 = r4.mo2380c()
                if (r4 == 0) goto L_0x0200
                android.support.v4.content.a.b r4 = r0.f529a
                android.graphics.Paint r7 = r5.f559a
                if (r7 != 0) goto L_0x01ac
                android.graphics.Paint r7 = new android.graphics.Paint
                r11 = 1
                r7.<init>(r11)
                r5.f559a = r7
                android.graphics.Paint r7 = r5.f559a
                android.graphics.Paint$Style r11 = android.graphics.Paint.Style.STROKE
                r7.setStyle(r11)
            L_0x01ac:
                android.graphics.Paint r7 = r5.f559a
                android.graphics.Paint$Join r11 = r0.f539k
                if (r11 == 0) goto L_0x01b7
                android.graphics.Paint$Join r11 = r0.f539k
                r7.setStrokeJoin(r11)
            L_0x01b7:
                android.graphics.Paint$Cap r11 = r0.f538j
                if (r11 == 0) goto L_0x01c0
                android.graphics.Paint$Cap r11 = r0.f538j
                r7.setStrokeCap(r11)
            L_0x01c0:
                float r11 = r0.f540l
                r7.setStrokeMiter(r11)
                boolean r11 = r4.mo2377a()
                if (r11 == 0) goto L_0x01e1
                android.graphics.Shader r4 = r4.f2500a
                android.graphics.Matrix r11 = r5.f572o
                r4.setLocalMatrix(r11)
                r7.setShader(r4)
                float r4 = r0.f532d
                float r4 = r4 * r6
                int r4 = java.lang.Math.round(r4)
                r7.setAlpha(r4)
                goto L_0x01ec
            L_0x01e1:
                int r4 = r4.f2501b
                float r6 = r0.f532d
                int r4 = android.support.p017a.p018a.C0227i.m460a(r4, r6)
                r7.setColor(r4)
            L_0x01ec:
                r7.setColorFilter(r10)
                float r2 = r2 * r15
                float r0 = r0.f530b
                float r0 = r0 * r2
                r7.setStrokeWidth(r0)
                android.graphics.Path r0 = r5.f571m
                r9.drawPath(r0, r7)
                goto L_0x0200
            L_0x01fe:
                r5 = r16
            L_0x0200:
                int r12 = r12 + 1
                r7 = r5
                r11 = 0
                goto L_0x001b
            L_0x0206:
                r5 = r7
                r19.restore()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p017a.p018a.C0227i.C0234f.m480a(android.support.a.a.i$c, android.graphics.Matrix, android.graphics.Canvas, int, int, android.graphics.ColorFilter):void");
        }
    }

    /* renamed from: android.support.a.a.i$g */
    static class C0235g extends ConstantState {

        /* renamed from: a */
        int f575a;

        /* renamed from: b */
        C0234f f576b;

        /* renamed from: c */
        ColorStateList f577c;

        /* renamed from: d */
        Mode f578d;

        /* renamed from: e */
        boolean f579e;

        /* renamed from: f */
        Bitmap f580f;

        /* renamed from: g */
        ColorStateList f581g;

        /* renamed from: h */
        Mode f582h;

        /* renamed from: i */
        int f583i;

        /* renamed from: j */
        boolean f584j;

        /* renamed from: k */
        boolean f585k;

        /* renamed from: l */
        Paint f586l;

        public final int getChangingConfigurations() {
            return this.f575a;
        }

        /* renamed from: a */
        public final boolean mo490a() {
            return this.f576b.mo484a();
        }

        public final Drawable newDrawable() {
            return new C0227i(this);
        }

        public C0235g() {
            this.f578d = C0227i.f519a;
            this.f576b = new C0234f();
        }

        public final Drawable newDrawable(Resources resources) {
            return new C0227i(this);
        }

        public C0235g(C0235g gVar) {
            this.f578d = C0227i.f519a;
            if (gVar != null) {
                this.f575a = gVar.f575a;
                this.f576b = new C0234f(gVar.f576b);
                if (gVar.f576b.f560b != null) {
                    this.f576b.f560b = new Paint(gVar.f576b.f560b);
                }
                if (gVar.f576b.f559a != null) {
                    this.f576b.f559a = new Paint(gVar.f576b.f559a);
                }
                this.f577c = gVar.f577c;
                this.f578d = gVar.f578d;
                this.f579e = gVar.f579e;
            }
        }

        /* renamed from: a */
        public final void mo489a(int i, int i2) {
            this.f580f.eraseColor(0);
            this.f576b.mo483a(new Canvas(this.f580f), i, i2, null);
        }
    }

    /* renamed from: android.support.a.a.i$h */
    static class C0236h extends ConstantState {

        /* renamed from: a */
        private final ConstantState f587a;

        public final boolean canApplyTheme() {
            return this.f587a.canApplyTheme();
        }

        public final int getChangingConfigurations() {
            return this.f587a.getChangingConfigurations();
        }

        public final Drawable newDrawable() {
            C0227i iVar = new C0227i();
            iVar.f518b = (VectorDrawable) this.f587a.newDrawable();
            return iVar;
        }

        public C0236h(ConstantState constantState) {
            this.f587a = constantState;
        }

        public final Drawable newDrawable(Resources resources) {
            C0227i iVar = new C0227i();
            iVar.f518b = (VectorDrawable) this.f587a.newDrawable(resources);
            return iVar;
        }

        public final Drawable newDrawable(Resources resources, Theme theme) {
            C0227i iVar = new C0227i();
            iVar.f518b = (VectorDrawable) this.f587a.newDrawable(resources, theme);
            return iVar;
        }
    }

    public final /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public final /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
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
            C0809a.m2335d(this.f518b);
        }
        return false;
    }

    public final int getOpacity() {
        if (this.f518b != null) {
            return this.f518b.getOpacity();
        }
        return -3;
    }

    public final void invalidateSelf() {
        if (this.f518b != null) {
            this.f518b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public final boolean isAutoMirrored() {
        if (this.f518b != null) {
            return C0809a.m2332b(this.f518b);
        }
        return this.f521d.f579e;
    }

    public final int getAlpha() {
        if (this.f518b != null) {
            return C0809a.m2334c(this.f518b);
        }
        return this.f521d.f576b.getRootAlpha();
    }

    public final int getChangingConfigurations() {
        if (this.f518b != null) {
            return this.f518b.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f521d.getChangingConfigurations();
    }

    public final int getIntrinsicHeight() {
        if (this.f518b != null) {
            return this.f518b.getIntrinsicHeight();
        }
        return (int) this.f521d.f576b.f563e;
    }

    public final int getIntrinsicWidth() {
        if (this.f518b != null) {
            return this.f518b.getIntrinsicWidth();
        }
        return (int) this.f521d.f576b.f562d;
    }

    C0227i() {
        this.f520c = true;
        this.f526i = new float[9];
        this.f527j = new Matrix();
        this.f528k = new Rect();
        this.f521d = new C0235g();
    }

    public final ConstantState getConstantState() {
        if (this.f518b != null && VERSION.SDK_INT >= 24) {
            return new C0236h(this.f518b.getConstantState());
        }
        this.f521d.f575a = getChangingConfigurations();
        return this.f521d;
    }

    public final boolean isStateful() {
        if (this.f518b != null) {
            return this.f518b.isStateful();
        }
        if (super.isStateful() || (this.f521d != null && (this.f521d.mo490a() || (this.f521d.f577c != null && this.f521d.f577c.isStateful())))) {
            return true;
        }
        return false;
    }

    public final Drawable mutate() {
        if (this.f518b != null) {
            this.f518b.mutate();
            return this;
        }
        if (!this.f524g && super.mutate() == this) {
            this.f521d = new C0235g(this.f521d);
            this.f524g = true;
        }
        return this;
    }

    public final /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
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

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        if (this.f518b != null) {
            this.f518b.setBounds(rect);
        }
    }

    public final void setAutoMirrored(boolean z) {
        if (this.f518b != null) {
            C0809a.m2331a(this.f518b, z);
        } else {
            this.f521d.f579e = z;
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f518b != null) {
            this.f518b.setColorFilter(colorFilter);
            return;
        }
        this.f523f = colorFilter;
        invalidateSelf();
    }

    public final void unscheduleSelf(Runnable runnable) {
        if (this.f518b != null) {
            this.f518b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public final void setAlpha(int i) {
        if (this.f518b != null) {
            this.f518b.setAlpha(i);
            return;
        }
        if (this.f521d.f576b.getRootAlpha() != i) {
            this.f521d.f576b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    public final void setTint(int i) {
        if (this.f518b != null) {
            C0809a.m2325a(this.f518b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (this.f518b != null) {
            C0809a.m2327a(this.f518b, colorStateList);
            return;
        }
        C0235g gVar = this.f521d;
        if (gVar.f577c != colorStateList) {
            gVar.f577c = colorStateList;
            this.f522e = m461a(this.f522e, colorStateList, gVar.f578d);
            invalidateSelf();
        }
    }

    public final void setTintMode(Mode mode) {
        if (this.f518b != null) {
            C0809a.m2330a(this.f518b, mode);
            return;
        }
        C0235g gVar = this.f521d;
        if (gVar.f578d != mode) {
            gVar.f578d = mode;
            this.f522e = m461a(this.f522e, gVar.f577c, mode);
            invalidateSelf();
        }
    }

    C0227i(C0235g gVar) {
        this.f520c = true;
        this.f526i = new float[9];
        this.f527j = new Matrix();
        this.f528k = new Rect();
        this.f521d = gVar;
        this.f522e = m461a(this.f522e, gVar.f577c, gVar.f578d);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        if (this.f518b != null) {
            return this.f518b.setState(iArr);
        }
        boolean z = false;
        C0235g gVar = this.f521d;
        if (!(gVar.f577c == null || gVar.f578d == null)) {
            this.f522e = m461a(this.f522e, gVar.f577c, gVar.f578d);
            invalidateSelf();
            z = true;
        }
        if (gVar.mo490a()) {
            boolean a = gVar.f576b.f561c.mo444a(iArr);
            gVar.f585k |= a;
            if (a) {
                invalidateSelf();
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo419a(String str) {
        return this.f521d.f576b.f569k.get(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e2, code lost:
        if (r7 == false) goto L_0x00e4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.drawable.Drawable r0 = r10.f518b
            if (r0 == 0) goto L_0x000a
            android.graphics.drawable.Drawable r0 = r10.f518b
            r0.draw(r11)
            return
        L_0x000a:
            android.graphics.Rect r0 = r10.f528k
            r10.copyBounds(r0)
            android.graphics.Rect r0 = r10.f528k
            int r0 = r0.width()
            if (r0 <= 0) goto L_0x017e
            android.graphics.Rect r0 = r10.f528k
            int r0 = r0.height()
            if (r0 > 0) goto L_0x0021
            goto L_0x017e
        L_0x0021:
            android.graphics.ColorFilter r0 = r10.f523f
            if (r0 != 0) goto L_0x0028
            android.graphics.PorterDuffColorFilter r0 = r10.f522e
            goto L_0x002a
        L_0x0028:
            android.graphics.ColorFilter r0 = r10.f523f
        L_0x002a:
            android.graphics.Matrix r1 = r10.f527j
            r11.getMatrix(r1)
            android.graphics.Matrix r1 = r10.f527j
            float[] r2 = r10.f526i
            r1.getValues(r2)
            float[] r1 = r10.f526i
            r2 = 0
            r1 = r1[r2]
            float r1 = java.lang.Math.abs(r1)
            float[] r3 = r10.f526i
            r4 = 4
            r3 = r3[r4]
            float r3 = java.lang.Math.abs(r3)
            float[] r4 = r10.f526i
            r5 = 1
            r4 = r4[r5]
            float r4 = java.lang.Math.abs(r4)
            float[] r6 = r10.f526i
            r7 = 3
            r6 = r6[r7]
            float r6 = java.lang.Math.abs(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0065
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0069
        L_0x0065:
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 1065353216(0x3f800000, float:1.0)
        L_0x0069:
            android.graphics.Rect r4 = r10.f528k
            int r4 = r4.width()
            float r4 = (float) r4
            float r4 = r4 * r1
            int r1 = (int) r4
            android.graphics.Rect r4 = r10.f528k
            int r4 = r4.height()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 2048(0x800, float:2.87E-42)
            int r1 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.min(r4, r3)
            if (r1 <= 0) goto L_0x017d
            if (r3 > 0) goto L_0x008d
            goto L_0x017d
        L_0x008d:
            int r4 = r11.save()
            android.graphics.Rect r6 = r10.f528k
            int r6 = r6.left
            float r6 = (float) r6
            android.graphics.Rect r9 = r10.f528k
            int r9 = r9.top
            float r9 = (float) r9
            r11.translate(r6, r9)
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 17
            if (r6 < r9) goto L_0x00b2
            boolean r6 = r10.isAutoMirrored()
            if (r6 == 0) goto L_0x00b2
            int r6 = android.support.p030v4.graphics.drawable.C0809a.m2338g(r10)
            if (r6 != r5) goto L_0x00b2
            r6 = 1
            goto L_0x00b3
        L_0x00b2:
            r6 = 0
        L_0x00b3:
            if (r6 == 0) goto L_0x00c4
            android.graphics.Rect r6 = r10.f528k
            int r6 = r6.width()
            float r6 = (float) r6
            r11.translate(r6, r8)
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r11.scale(r6, r7)
        L_0x00c4:
            android.graphics.Rect r6 = r10.f528k
            r6.offsetTo(r2, r2)
            android.support.a.a.i$g r6 = r10.f521d
            android.graphics.Bitmap r7 = r6.f580f
            if (r7 == 0) goto L_0x00e4
            android.graphics.Bitmap r7 = r6.f580f
            int r7 = r7.getWidth()
            if (r1 != r7) goto L_0x00e1
            android.graphics.Bitmap r7 = r6.f580f
            int r7 = r7.getHeight()
            if (r3 != r7) goto L_0x00e1
            r7 = 1
            goto L_0x00e2
        L_0x00e1:
            r7 = 0
        L_0x00e2:
            if (r7 != 0) goto L_0x00ee
        L_0x00e4:
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r1, r3, r7)
            r6.f580f = r7
            r6.f585k = r5
        L_0x00ee:
            boolean r6 = r10.f520c
            if (r6 != 0) goto L_0x00f8
            android.support.a.a.i$g r6 = r10.f521d
            r6.mo489a(r1, r3)
            goto L_0x013c
        L_0x00f8:
            android.support.a.a.i$g r6 = r10.f521d
            boolean r7 = r6.f585k
            if (r7 != 0) goto L_0x011c
            android.content.res.ColorStateList r7 = r6.f581g
            android.content.res.ColorStateList r8 = r6.f577c
            if (r7 != r8) goto L_0x011c
            android.graphics.PorterDuff$Mode r7 = r6.f582h
            android.graphics.PorterDuff$Mode r8 = r6.f578d
            if (r7 != r8) goto L_0x011c
            boolean r7 = r6.f584j
            boolean r8 = r6.f579e
            if (r7 != r8) goto L_0x011c
            int r7 = r6.f583i
            android.support.a.a.i$f r6 = r6.f576b
            int r6 = r6.getRootAlpha()
            if (r7 != r6) goto L_0x011c
            r6 = 1
            goto L_0x011d
        L_0x011c:
            r6 = 0
        L_0x011d:
            if (r6 != 0) goto L_0x013c
            android.support.a.a.i$g r6 = r10.f521d
            r6.mo489a(r1, r3)
            android.support.a.a.i$g r1 = r10.f521d
            android.content.res.ColorStateList r3 = r1.f577c
            r1.f581g = r3
            android.graphics.PorterDuff$Mode r3 = r1.f578d
            r1.f582h = r3
            android.support.a.a.i$f r3 = r1.f576b
            int r3 = r3.getRootAlpha()
            r1.f583i = r3
            boolean r3 = r1.f579e
            r1.f584j = r3
            r1.f585k = r2
        L_0x013c:
            android.support.a.a.i$g r1 = r10.f521d
            android.graphics.Rect r3 = r10.f528k
            android.support.a.a.i$f r6 = r1.f576b
            int r6 = r6.getRootAlpha()
            r7 = 255(0xff, float:3.57E-43)
            if (r6 >= r7) goto L_0x014b
            r2 = 1
        L_0x014b:
            r6 = 0
            if (r2 != 0) goto L_0x0152
            if (r0 != 0) goto L_0x0152
            r0 = r6
            goto L_0x0174
        L_0x0152:
            android.graphics.Paint r2 = r1.f586l
            if (r2 != 0) goto L_0x0162
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r1.f586l = r2
            android.graphics.Paint r2 = r1.f586l
            r2.setFilterBitmap(r5)
        L_0x0162:
            android.graphics.Paint r2 = r1.f586l
            android.support.a.a.i$f r5 = r1.f576b
            int r5 = r5.getRootAlpha()
            r2.setAlpha(r5)
            android.graphics.Paint r2 = r1.f586l
            r2.setColorFilter(r0)
            android.graphics.Paint r0 = r1.f586l
        L_0x0174:
            android.graphics.Bitmap r1 = r1.f580f
            r11.drawBitmap(r1, r6, r3, r0)
            r11.restoreToCount(r4)
            return
        L_0x017d:
            return
        L_0x017e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p017a.p018a.C0227i.draw(android.graphics.Canvas):void");
    }

    public final /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public final /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    /* renamed from: a */
    static int m460a(int i, float f) {
        return (i & 16777215) | (((int) (((float) Color.alpha(i)) * f)) << 24);
    }

    public final void scheduleSelf(Runnable runnable, long j) {
        if (this.f518b != null) {
            this.f518b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f518b != null) {
            return this.f518b.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        if (this.f518b != null) {
            this.f518b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* renamed from: a */
    private PorterDuffColorFilter m461a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: a */
    public static C0227i m462a(Resources resources, int i, Theme theme) {
        int next;
        if (VERSION.SDK_INT >= 24) {
            C0227i iVar = new C0227i();
            iVar.f518b = C0720f.m2075a(resources, i, theme);
            iVar.f525h = new C0236h(iVar.f518b.getConstantState());
            return iVar;
        }
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
                return m463a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException | XmlPullParserException unused) {
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    /* renamed from: a */
    public static C0227i m463a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        C0227i iVar = new C0227i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    /* renamed from: b */
    private void m464b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        Resources resources2 = resources;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        AttributeSet attributeSet2 = attributeSet;
        Theme theme2 = theme;
        C0235g gVar = this.f521d;
        C0234f fVar = gVar.f576b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar.f561c);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        for (int i = 1; eventType != i && (xmlPullParser.getDepth() >= depth || eventType != 3); i = 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                C0231c cVar = (C0231c) arrayDeque.peek();
                if (LeakCanaryFileProvider.f132050j.equals(name)) {
                    C0230b bVar = new C0230b();
                    TypedArray a = C0724g.m2082a(resources2, theme2, attributeSet2, C0215a.f493c);
                    bVar.mo443a(a, xmlPullParser2, theme2);
                    a.recycle();
                    cVar.f543b.add(bVar);
                    if (bVar.getPathName() != null) {
                        fVar.f569k.put(bVar.getPathName(), bVar);
                    }
                    gVar.f575a = bVar.f557o | gVar.f575a;
                    z = false;
                } else if ("clip-path".equals(name)) {
                    C0229a aVar = new C0229a();
                    if (C0724g.m2085a(xmlPullParser2, "pathData")) {
                        TypedArray a2 = C0724g.m2082a(resources2, theme2, attributeSet2, C0215a.f494d);
                        aVar.mo441a(a2);
                        a2.recycle();
                    }
                    cVar.f543b.add(aVar);
                    if (aVar.getPathName() != null) {
                        fVar.f569k.put(aVar.getPathName(), aVar);
                    }
                    gVar.f575a = aVar.f557o | gVar.f575a;
                } else if ("group".equals(name)) {
                    C0231c cVar2 = new C0231c();
                    TypedArray a3 = C0724g.m2082a(resources2, theme2, attributeSet2, C0215a.f492b);
                    cVar2.f553l = null;
                    cVar2.f544c = C0724g.m2080a(a3, xmlPullParser2, "rotation", 5, cVar2.f544c);
                    cVar2.f545d = a3.getFloat(1, cVar2.f545d);
                    cVar2.f546e = a3.getFloat(2, cVar2.f546e);
                    cVar2.f547f = C0724g.m2080a(a3, xmlPullParser2, "scaleX", 3, cVar2.f547f);
                    cVar2.f548g = C0724g.m2080a(a3, xmlPullParser2, "scaleY", 4, cVar2.f548g);
                    cVar2.f549h = C0724g.m2080a(a3, xmlPullParser2, "translateX", 6, cVar2.f549h);
                    cVar2.f550i = C0724g.m2080a(a3, xmlPullParser2, "translateY", 7, cVar2.f550i);
                    String string = a3.getString(0);
                    if (string != null) {
                        cVar2.f554m = string;
                    }
                    cVar2.mo462a();
                    a3.recycle();
                    cVar.f543b.add(cVar2);
                    arrayDeque.push(cVar2);
                    if (cVar2.getGroupName() != null) {
                        fVar.f569k.put(cVar2.getGroupName(), cVar2);
                    }
                    gVar.f575a = cVar2.f552k | gVar.f575a;
                }
            } else if (eventType == 3) {
                if ("group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (this.f518b != null) {
            C0809a.m2329a(this.f518b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0235g gVar = this.f521d;
        gVar.f576b = new C0234f();
        TypedArray a = C0724g.m2082a(resources, theme, attributeSet, C0215a.f491a);
        C0235g gVar2 = this.f521d;
        C0234f fVar = gVar2.f576b;
        int a2 = C0724g.m2081a(a, xmlPullParser, "tintMode", 6, -1);
        Mode mode = Mode.SRC_IN;
        if (a2 == 3) {
            mode = Mode.SRC_OVER;
        } else if (a2 == 5) {
            mode = Mode.SRC_IN;
        } else if (a2 != 9) {
            switch (a2) {
                case 14:
                    mode = Mode.MULTIPLY;
                    break;
                case 15:
                    mode = Mode.SCREEN;
                    break;
                case 16:
                    mode = Mode.ADD;
                    break;
            }
        } else {
            mode = Mode.SRC_ATOP;
        }
        gVar2.f578d = mode;
        ColorStateList colorStateList = a.getColorStateList(1);
        if (colorStateList != null) {
            gVar2.f577c = colorStateList;
        }
        boolean z = gVar2.f579e;
        if (C0724g.m2085a(xmlPullParser, "autoMirrored")) {
            z = a.getBoolean(5, z);
        }
        gVar2.f579e = z;
        fVar.f564f = C0724g.m2080a(a, xmlPullParser, "viewportWidth", 7, fVar.f564f);
        fVar.f565g = C0724g.m2080a(a, xmlPullParser, "viewportHeight", 8, fVar.f565g);
        if (fVar.f564f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.getPositionDescription());
            sb.append("<vector> tag requires viewportWidth > 0");
            throw new XmlPullParserException(sb.toString());
        } else if (fVar.f565g > 0.0f) {
            fVar.f562d = a.getDimension(3, fVar.f562d);
            fVar.f563e = a.getDimension(2, fVar.f563e);
            if (fVar.f562d <= 0.0f) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(a.getPositionDescription());
                sb2.append("<vector> tag requires width > 0");
                throw new XmlPullParserException(sb2.toString());
            } else if (fVar.f563e > 0.0f) {
                fVar.setAlpha(C0724g.m2080a(a, xmlPullParser, "alpha", 4, fVar.getAlpha()));
                String string = a.getString(0);
                if (string != null) {
                    fVar.f567i = string;
                    fVar.f569k.put(string, fVar);
                }
                a.recycle();
                gVar.f575a = getChangingConfigurations();
                gVar.f585k = true;
                m464b(resources, xmlPullParser, attributeSet, theme);
                this.f522e = m461a(this.f522e, gVar.f577c, gVar.f578d);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(a.getPositionDescription());
                sb3.append("<vector> tag requires height > 0");
                throw new XmlPullParserException(sb3.toString());
            }
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(a.getPositionDescription());
            sb4.append("<vector> tag requires viewportHeight > 0");
            throw new XmlPullParserException(sb4.toString());
        }
    }
}
