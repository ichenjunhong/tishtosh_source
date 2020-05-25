package android.support.p019b;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1056u;
import android.util.Property;
import android.view.View;

/* renamed from: android.support.b.c */
public final class C0260c extends C0296m {

    /* renamed from: p */
    private static final String[] f632p = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: q */
    private static final Property<Drawable, PointF> f633q = new Property<Drawable, PointF>(PointF.class, "boundsOrigin") {

        /* renamed from: a */
        private Rect f643a = new Rect();

        public final /* synthetic */ Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f643a);
            return new PointF((float) this.f643a.left, (float) this.f643a.top);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f643a);
            this.f643a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f643a);
        }
    };

    /* renamed from: r */
    private static final Property<C0271a, PointF> f634r = new Property<C0271a, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0271a aVar = (C0271a) obj;
            PointF pointF = (PointF) obj2;
            aVar.f662a = Math.round(pointF.x);
            aVar.f663b = Math.round(pointF.y);
            aVar.f666e++;
            if (aVar.f666e == aVar.f667f) {
                aVar.mo559a();
            }
        }
    };

    /* renamed from: s */
    private static final Property<C0271a, PointF> f635s = new Property<C0271a, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0271a aVar = (C0271a) obj;
            PointF pointF = (PointF) obj2;
            aVar.f664c = Math.round(pointF.x);
            aVar.f665d = Math.round(pointF.y);
            aVar.f667f++;
            if (aVar.f666e == aVar.f667f) {
                aVar.mo559a();
            }
        }
    };

    /* renamed from: t */
    private static final Property<View, PointF> f636t = new Property<View, PointF>(PointF.class, "bottomRight") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C0244ae.m501a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    };

    /* renamed from: u */
    private static final Property<View, PointF> f637u = new Property<View, PointF>(PointF.class, "topLeft") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C0244ae.m501a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    };

    /* renamed from: v */
    private static final Property<View, PointF> f638v = new Property<View, PointF>(PointF.class, "position") {
        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            return null;
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C0244ae.m501a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    };

    /* renamed from: y */
    private static C0283i f639y = new C0283i();

    /* renamed from: a */
    public boolean f640a;

    /* renamed from: w */
    private int[] f641w = new int[2];

    /* renamed from: x */
    private boolean f642x;

    /* renamed from: android.support.b.c$a */
    static class C0271a {

        /* renamed from: a */
        int f662a;

        /* renamed from: b */
        int f663b;

        /* renamed from: c */
        int f664c;

        /* renamed from: d */
        int f665d;

        /* renamed from: e */
        int f666e;

        /* renamed from: f */
        int f667f;

        /* renamed from: g */
        private View f668g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo559a() {
            C0244ae.m501a(this.f668g, this.f662a, this.f663b, this.f664c, this.f665d);
            this.f666e = 0;
            this.f667f = 0;
        }

        C0271a(View view) {
            this.f668g = view;
        }
    }

    /* renamed from: a */
    public final String[] mo526a() {
        return f632p;
    }

    /* renamed from: a */
    public final void mo524a(C0312s sVar) {
        m536d(sVar);
    }

    /* renamed from: b */
    public final void mo528b(C0312s sVar) {
        m536d(sVar);
    }

    /* renamed from: d */
    private void m536d(C0312s sVar) {
        View view = sVar.f771b;
        if (C1056u.m3079y(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            sVar.f770a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            sVar.f770a.put("android:changeBounds:parent", sVar.f771b.getParent());
            if (this.f642x) {
                sVar.f771b.getLocationInWindow(this.f641w);
                sVar.f770a.put("android:changeBounds:windowX", Integer.valueOf(this.f641w[0]));
                sVar.f770a.put("android:changeBounds:windowY", Integer.valueOf(this.f641w[1]));
            }
            if (this.f640a) {
                sVar.f770a.put("android:changeBounds:clip", C1056u.m3017A(view));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [android.animation.Animator] */
    /* JADX WARNING: type inference failed for: r14v1 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: type inference failed for: r1v22, types: [android.animation.AnimatorSet] */
    /* JADX WARNING: type inference failed for: r2v15, types: [android.animation.Animator[]] */
    /* JADX WARNING: type inference failed for: r0v23 */
    /* JADX WARNING: type inference failed for: r0v24 */
    /* JADX WARNING: type inference failed for: r0v25 */
    /* JADX WARNING: type inference failed for: r10v11, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r0v28 */
    /* JADX WARNING: type inference failed for: r1v28, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r14v3 */
    /* JADX WARNING: type inference failed for: r14v4 */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: type inference failed for: r0v34, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r0v37, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r3v33, types: [android.animation.AnimatorSet] */
    /* JADX WARNING: type inference failed for: r0v39 */
    /* JADX WARNING: type inference failed for: r0v42, types: [android.animation.ObjectAnimator] */
    /* JADX WARNING: type inference failed for: r0v43 */
    /* JADX WARNING: type inference failed for: r14v5 */
    /* JADX WARNING: type inference failed for: r0v44 */
    /* JADX WARNING: type inference failed for: r0v45 */
    /* JADX WARNING: type inference failed for: r0v46 */
    /* JADX WARNING: type inference failed for: r0v47 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v30
      assigns: []
      uses: []
      mth insns count: 281
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d4  */
    /* JADX WARNING: Unknown variable types count: 13 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo522a(android.view.ViewGroup r20, android.support.p019b.C0312s r21, android.support.p019b.C0312s r22) {
        /*
            r19 = this;
            r8 = r19
            r0 = r21
            r1 = r22
            if (r0 == 0) goto L_0x029f
            if (r1 != 0) goto L_0x000c
            goto L_0x029f
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.f770a
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f770a
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r3 = r3.get(r5)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r3 == 0) goto L_0x029d
            if (r4 != 0) goto L_0x0026
            goto L_0x029d
        L_0x0026:
            android.view.View r9 = r1.f771b
            boolean r5 = r8.f642x
            r11 = 1
            if (r5 == 0) goto L_0x003c
            android.support.b.s r5 = r8.mo604b(r3, r11)
            if (r5 != 0) goto L_0x0038
            if (r3 != r4) goto L_0x0036
            goto L_0x003c
        L_0x0036:
            r3 = 0
            goto L_0x003d
        L_0x0038:
            android.view.View r3 = r5.f771b
            if (r4 != r3) goto L_0x0036
        L_0x003c:
            r3 = 1
        L_0x003d:
            if (r3 == 0) goto L_0x01d4
            java.util.Map<java.lang.String, java.lang.Object> r3 = r0.f770a
            java.lang.String r4 = "android:changeBounds:bounds"
            java.lang.Object r3 = r3.get(r4)
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f770a
            java.lang.String r5 = "android:changeBounds:bounds"
            java.lang.Object r4 = r4.get(r5)
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            int r5 = r3.left
            int r6 = r4.left
            int r7 = r3.top
            int r13 = r4.top
            int r14 = r3.right
            int r15 = r4.right
            int r3 = r3.bottom
            int r4 = r4.bottom
            int r2 = r14 - r5
            int r11 = r3 - r7
            int r10 = r15 - r6
            int r12 = r4 - r13
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f770a
            r16 = r9
            java.lang.String r9 = "android:changeBounds:clip"
            java.lang.Object r0 = r0.get(r9)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f770a
            java.lang.String r9 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r9)
            r9 = r1
            android.graphics.Rect r9 = (android.graphics.Rect) r9
            if (r2 == 0) goto L_0x0086
            if (r11 != 0) goto L_0x008a
        L_0x0086:
            if (r10 == 0) goto L_0x0099
            if (r12 == 0) goto L_0x0099
        L_0x008a:
            if (r5 != r6) goto L_0x0091
            if (r7 == r13) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r1 = 0
            goto L_0x0092
        L_0x0091:
            r1 = 1
        L_0x0092:
            if (r14 != r15) goto L_0x0096
            if (r3 == r4) goto L_0x009a
        L_0x0096:
            int r1 = r1 + 1
            goto L_0x009a
        L_0x0099:
            r1 = 0
        L_0x009a:
            if (r0 == 0) goto L_0x00a2
            boolean r17 = r0.equals(r9)
            if (r17 == 0) goto L_0x00a6
        L_0x00a2:
            if (r0 != 0) goto L_0x00a8
            if (r9 == 0) goto L_0x00a8
        L_0x00a6:
            int r1 = r1 + 1
        L_0x00a8:
            if (r1 <= 0) goto L_0x0211
            r18 = r9
            boolean r9 = r8.f640a
            if (r9 != 0) goto L_0x0136
            r9 = r16
            android.support.p019b.C0244ae.m501a(r9, r5, r7, r14, r3)
            r0 = 2
            if (r1 != r0) goto L_0x010f
            if (r2 != r10) goto L_0x00cd
            if (r11 != r12) goto L_0x00cd
            android.support.b.g r0 = r8.f733o
            float r1 = (float) r5
            float r2 = (float) r7
            float r3 = (float) r6
            float r4 = (float) r13
            android.graphics.Path r0 = r0.mo579a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = f638v
            android.animation.ObjectAnimator r0 = android.support.p019b.C0280f.m578a(r9, r1, r0)
            goto L_0x010c
        L_0x00cd:
            android.support.b.c$a r0 = new android.support.b.c$a
            r0.<init>(r9)
            android.support.b.g r1 = r8.f733o
            float r2 = (float) r5
            float r5 = (float) r7
            float r6 = (float) r6
            float r7 = (float) r13
            android.graphics.Path r1 = r1.mo579a(r2, r5, r6, r7)
            android.util.Property<android.support.b.c$a, android.graphics.PointF> r2 = f634r
            android.animation.ObjectAnimator r1 = android.support.p019b.C0280f.m578a(r0, r2, r1)
            android.support.b.g r2 = r8.f733o
            float r5 = (float) r14
            float r3 = (float) r3
            float r6 = (float) r15
            float r4 = (float) r4
            android.graphics.Path r2 = r2.mo579a(r5, r3, r6, r4)
            android.util.Property<android.support.b.c$a, android.graphics.PointF> r3 = f635s
            android.animation.ObjectAnimator r2 = android.support.p019b.C0280f.m578a(r0, r3, r2)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r4 = 2
            android.animation.Animator[] r4 = new android.animation.Animator[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r2
            r3.playTogether(r4)
            android.support.b.c$8 r1 = new android.support.b.c$8
            r1.<init>(r0)
            r3.addListener(r1)
            r0 = r3
        L_0x010c:
            r3 = 1
            goto L_0x01ba
        L_0x010f:
            if (r5 != r6) goto L_0x0125
            if (r7 == r13) goto L_0x0114
            goto L_0x0125
        L_0x0114:
            android.support.b.g r0 = r8.f733o
            float r1 = (float) r14
            float r2 = (float) r3
            float r3 = (float) r15
            float r4 = (float) r4
            android.graphics.Path r0 = r0.mo579a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = f636t
            android.animation.ObjectAnimator r0 = android.support.p019b.C0280f.m578a(r9, r1, r0)
            goto L_0x010c
        L_0x0125:
            android.support.b.g r0 = r8.f733o
            float r1 = (float) r5
            float r2 = (float) r7
            float r3 = (float) r6
            float r4 = (float) r13
            android.graphics.Path r0 = r0.mo579a(r1, r2, r3, r4)
            android.util.Property<android.view.View, android.graphics.PointF> r1 = f637u
            android.animation.ObjectAnimator r0 = android.support.p019b.C0280f.m578a(r9, r1, r0)
            goto L_0x010c
        L_0x0136:
            r9 = r16
            int r1 = java.lang.Math.max(r2, r10)
            int r3 = java.lang.Math.max(r11, r12)
            int r1 = r1 + r5
            int r3 = r3 + r7
            android.support.p019b.C0244ae.m501a(r9, r5, r7, r1, r3)
            if (r5 != r6) goto L_0x014c
            if (r7 == r13) goto L_0x014a
            goto L_0x014c
        L_0x014a:
            r14 = 0
            goto L_0x015d
        L_0x014c:
            android.support.b.g r1 = r8.f733o
            float r3 = (float) r5
            float r5 = (float) r7
            float r7 = (float) r6
            float r14 = (float) r13
            android.graphics.Path r1 = r1.mo579a(r3, r5, r7, r14)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = f638v
            android.animation.ObjectAnimator r1 = android.support.p019b.C0280f.m578a(r9, r3, r1)
            r14 = r1
        L_0x015d:
            if (r0 != 0) goto L_0x0166
            android.graphics.Rect r0 = new android.graphics.Rect
            r1 = 0
            r0.<init>(r1, r1, r2, r11)
            goto L_0x0167
        L_0x0166:
            r1 = 0
        L_0x0167:
            if (r18 != 0) goto L_0x016f
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r1, r1, r10, r12)
            goto L_0x0171
        L_0x016f:
            r2 = r18
        L_0x0171:
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto L_0x019e
            android.support.p030v4.view.C1056u.m3029a(r9, r0)
            java.lang.String r3 = "clipBounds"
            android.support.b.i r5 = f639y
            r7 = 2
            java.lang.Object[] r10 = new java.lang.Object[r7]
            r10[r1] = r0
            r0 = 1
            r10[r0] = r2
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofObject(r9, r3, r5, r10)
            android.support.b.c$9 r11 = new android.support.b.c$9
            r0 = r11
            r1 = r19
            r2 = r9
            r3 = r18
            r7 = r4
            r4 = r6
            r5 = r13
            r6 = r15
            r0.<init>(r2, r3, r4, r5, r6, r7)
            r10.addListener(r11)
            r0 = r10
            goto L_0x019f
        L_0x019e:
            r0 = 0
        L_0x019f:
            if (r14 != 0) goto L_0x01a3
            goto L_0x010c
        L_0x01a3:
            if (r0 != 0) goto L_0x01a8
            r0 = r14
            goto L_0x010c
        L_0x01a8:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            r2 = 2
            android.animation.Animator[] r2 = new android.animation.Animator[r2]
            r3 = 0
            r2[r3] = r14
            r3 = 1
            r2[r3] = r0
            r1.playTogether(r2)
            r0 = r1
        L_0x01ba:
            android.view.ViewParent r1 = r9.getParent()
            boolean r1 = r1 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x01d3
            android.view.ViewParent r1 = r9.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.support.p019b.C0319y.m693a(r1, r3)
            android.support.b.c$10 r2 = new android.support.b.c$10
            r2.<init>(r1)
            r8.mo589a(r2)
        L_0x01d3:
            return r0
        L_0x01d4:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r0.f770a
            java.lang.String r3 = "android:changeBounds:windowX"
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f770a
            java.lang.String r3 = "android:changeBounds:windowY"
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r3 = r1.f770a
            java.lang.String r4 = "android:changeBounds:windowX"
            java.lang.Object r3 = r3.get(r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f770a
            java.lang.String r4 = "android:changeBounds:windowY"
            java.lang.Object r1 = r1.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r2 != r3) goto L_0x0213
            if (r0 == r1) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            r0 = 0
            return r0
        L_0x0213:
            int[] r4 = r8.f641w
            r5 = r20
            r5.getLocationInWindow(r4)
            int r4 = r9.getWidth()
            int r6 = r9.getHeight()
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r6, r7)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r4)
            r9.draw(r6)
            android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
            r6.<init>(r4)
            float r7 = android.support.p019b.C0244ae.m503c(r9)
            r4 = 0
            android.support.p019b.C0244ae.m499a(r9, r4)
            android.support.b.ad r4 = android.support.p019b.C0244ae.m498a(r20)
            r4.mo501a(r6)
            android.support.b.g r4 = r8.f733o
            int[] r10 = r8.f641w
            r11 = 0
            r10 = r10[r11]
            int r2 = r2 - r10
            float r2 = (float) r2
            int[] r10 = r8.f641w
            r12 = 1
            r10 = r10[r12]
            int r0 = r0 - r10
            float r0 = (float) r0
            int[] r10 = r8.f641w
            r10 = r10[r11]
            int r3 = r3 - r10
            float r3 = (float) r3
            int[] r10 = r8.f641w
            r10 = r10[r12]
            int r1 = r1 - r10
            float r1 = (float) r1
            android.graphics.Path r0 = r4.mo579a(r2, r0, r3, r1)
            android.util.Property<android.graphics.drawable.Drawable, android.graphics.PointF> r1 = f633q
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 < r3) goto L_0x0273
            r2 = 0
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofObject(r1, r2, r0)
        L_0x0271:
            r1 = 1
            goto L_0x0283
        L_0x0273:
            android.support.b.h r2 = new android.support.b.h
            r2.<init>(r1, r0)
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {0, 1065353216} // fill-array
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofFloat(r2, r0)
            goto L_0x0271
        L_0x0283:
            android.animation.PropertyValuesHolder[] r1 = new android.animation.PropertyValuesHolder[r1]
            r2 = 0
            r1[r2] = r0
            android.animation.ObjectAnimator r10 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r6, r1)
            android.support.b.c$2 r11 = new android.support.b.c$2
            r0 = r11
            r1 = r19
            r2 = r20
            r3 = r6
            r4 = r9
            r5 = r7
            r0.<init>(r2, r3, r4, r5)
            r10.addListener(r11)
            return r10
        L_0x029d:
            r0 = 0
            return r0
        L_0x029f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p019b.C0260c.mo522a(android.view.ViewGroup, android.support.b.s, android.support.b.s):android.animation.Animator");
    }
}
