package com.facebook.p982j;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.SparseArray;
import com.facebook.p982j.C14392b.C14393a;
import com.facebook.p982j.C14450d.C14453b;
import com.facebook.p982j.p984b.C14413d;
import com.facebook.p982j.p984b.C14418f;
import com.facebook.p982j.p984b.C14426i;
import com.facebook.p982j.p984b.C14430k;
import com.facebook.p982j.p984b.p985a.C14397c.C14398a;
import com.facebook.p982j.p984b.p985a.C14403f;
import com.facebook.p982j.p984b.p985a.C14404g.C14405a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.j.c */
public class C14433c extends Drawable implements C14392b, C14453b {

    /* renamed from: a */
    public final C14430k f37485a;

    /* renamed from: b */
    public final SparseArray<Matrix> f37486b;

    /* renamed from: c */
    public final Matrix f37487c;

    /* renamed from: d */
    public final Map<String, C14434a> f37488d;

    /* renamed from: e */
    private final Paint f37489e = new Paint(1);

    /* renamed from: f */
    private final List<C14435b> f37490f;

    /* renamed from: g */
    private final C14450d f37491g;

    /* renamed from: h */
    private final Matrix f37492h;

    /* renamed from: i */
    private final Matrix f37493i;

    /* renamed from: j */
    private int f37494j;

    /* renamed from: k */
    private int f37495k;

    /* renamed from: l */
    private float f37496l;

    /* renamed from: m */
    private float f37497m;

    /* renamed from: n */
    private float f37498n;

    /* renamed from: o */
    private boolean f37499o;

    /* renamed from: p */
    private WeakReference<C14436c> f37500p;

    /* renamed from: com.facebook.j.c$a */
    public static class C14434a {

        /* renamed from: a */
        final Drawable f37501a;

        /* renamed from: b */
        final Matrix f37502b;

        public C14434a(Drawable drawable, Matrix matrix) {
            this.f37502b = matrix;
            this.f37501a = drawable;
        }
    }

    /* renamed from: com.facebook.j.c$b */
    class C14435b {

        /* renamed from: f */
        static final /* synthetic */ boolean f37503f = (!C14433c.class.desiredAssertionStatus());

        /* renamed from: a */
        final C14418f f37504a;

        /* renamed from: b */
        public final C14369a f37505b;

        /* renamed from: c */
        final Matrix f37506c;

        /* renamed from: d */
        public boolean f37507d;

        /* renamed from: e */
        public Shader f37508e;

        /* renamed from: h */
        private final C14405a f37510h;

        /* renamed from: i */
        private final float[] f37511i = new float[9];

        /* renamed from: j */
        private Shader[] f37512j;

        /* renamed from: b */
        public final int mo26603b() {
            return this.f37504a.f37430c;
        }

        /* renamed from: c */
        public final int mo26604c() {
            return this.f37504a.f37429b;
        }

        /* renamed from: e */
        private boolean m29534e() {
            C14434a d = mo26605d();
            if (d == null || d.f37501a == null) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        public final float mo26601a() {
            if (this.f37510h != null) {
                return this.f37510h.mo26582a();
            }
            return 0.0f;
        }

        /* renamed from: d */
        public final C14434a mo26605d() {
            if (C14433c.this.f37488d == null) {
                return null;
            }
            return (C14434a) C14433c.this.f37488d.get(this.f37504a.f37441n);
        }

        /* renamed from: a */
        private float m29531a(Matrix matrix) {
            matrix.getValues(this.f37511i);
            return (Math.abs(this.f37511i[0]) + Math.abs(this.f37511i[4])) / 2.0f;
        }

        /* renamed from: b */
        private Shader m29533b(float f) {
            if (this.f37512j == null) {
                return null;
            }
            return this.f37512j[(int) ((f / ((float) C14433c.this.f37485a.f37474b)) * ((float) (this.f37512j.length - 1)))];
        }

        /* renamed from: a */
        private void m29532a(C14418f fVar) {
            if (this.f37512j == null) {
                float f = (float) C14433c.this.f37485a.f37474b;
                int round = Math.round((30.0f * f) / ((float) C14433c.this.f37485a.f37473a));
                this.f37512j = new LinearGradient[(round + 1)];
                C14398a aVar = new C14398a();
                C14426i iVar = fVar.f37440m.f37458a;
                for (int i = 0; i < round; i++) {
                    float f2 = (((float) i) / ((float) round)) * f;
                    iVar.f37465a.mo26579a(f2, aVar);
                    iVar.f37466b.mo26579a(f2, aVar);
                    Shader[] shaderArr = this.f37512j;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, C14433c.this.f37485a.f37477e[1], aVar.f37390a, aVar.f37391b, TileMode.CLAMP);
                    shaderArr[i] = linearGradient;
                }
            }
        }

        /* renamed from: a */
        public final void mo26602a(float f) {
            if (f < this.f37504a.f37431d || f > this.f37504a.f37432e) {
                this.f37507d = false;
                return;
            }
            this.f37507d = true;
            this.f37504a.mo26587a(this.f37506c, f);
            Matrix matrix = (Matrix) C14433c.this.f37486b.get(this.f37504a.f37435h);
            if (matrix != null && !matrix.isIdentity()) {
                this.f37506c.postConcat(matrix);
            }
            C14403f fVar = this.f37504a.f37442o;
            if (!m29534e() && fVar != null) {
                this.f37505b.mo26566a();
                fVar.mo26579a(f, this.f37505b);
                this.f37505b.mo26570a(this.f37506c);
                this.f37504a.mo26588a(this.f37510h, f);
                this.f37510h.mo26583a(m29531a(this.f37506c));
                if (this.f37504a.f37440m != null) {
                    m29532a(this.f37504a);
                }
                this.f37508e = m29533b(f);
            }
        }

        public C14435b(C14418f fVar) {
            this.f37504a = fVar;
            if (m29534e()) {
                this.f37505b = null;
                this.f37510h = null;
                this.f37506c = new Matrix();
            } else {
                this.f37505b = new C14369a();
                this.f37510h = new C14405a();
                this.f37506c = C14433c.this.f37487c;
            }
            if (!f37503f && this.f37506c == null) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: com.facebook.j.c$c */
    public interface C14436c {
        /* renamed from: a */
        void mo26606a();
    }

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: a */
    public final void mo26591a() {
        this.f37491g.mo26614c();
    }

    /* renamed from: b */
    public final void mo26594b() {
        this.f37491g.f37534a = true;
    }

    /* renamed from: c */
    public final void mo26595c() {
        if (this.f37500p != null) {
            C14436c cVar = (C14436c) this.f37500p.get();
            if (cVar != null) {
                cVar.mo26606a();
                this.f37500p.clear();
            }
        }
    }

    /* renamed from: a */
    public final void mo26592a(float f) {
        m29525b(f);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo26593a(C14436c cVar) {
        this.f37500p = new WeakReference<>(cVar);
    }

    /* renamed from: b */
    private void m29525b(float f) {
        this.f37499o = true;
        this.f37485a.mo26590a(this.f37486b, f);
        int size = this.f37490f.size();
        for (int i = 0; i < size; i++) {
            ((C14435b) this.f37490f.get(i)).mo26602a(f);
        }
    }

    C14433c(C14455e eVar) {
        Map<String, C14434a> map;
        C14450d dVar;
        boolean z = true;
        this.f37499o = false;
        this.f37485a = eVar.f37544a;
        if (eVar.f37546c.f37547a == null) {
            map = null;
        } else {
            map = Collections.unmodifiableMap(eVar.f37546c.f37547a);
        }
        this.f37488d = map;
        this.f37487c = new Matrix();
        this.f37492h = new Matrix();
        this.f37493i = new Matrix();
        C14430k kVar = this.f37485a;
        if (VERSION.SDK_INT < 16) {
            z = false;
        }
        if (z) {
            dVar = new C14452a(this, kVar.f37473a, kVar.f37474b);
        } else {
            dVar = new C14454c(this, kVar.f37473a, kVar.f37474b);
        }
        this.f37491g = dVar;
        this.f37489e.setStrokeCap(Cap.ROUND);
        ArrayList arrayList = new ArrayList();
        int size = this.f37485a.f37475c.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new C14435b((C14418f) this.f37485a.f37475c.get(i)));
        }
        this.f37490f = Collections.unmodifiableList(arrayList);
        this.f37486b = new SparseArray<>();
        List<C14413d> list = this.f37485a.f37476d;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            this.f37486b.put(((C14413d) list.get(i2)).f37417a, new Matrix());
        }
        this.f37491g.f37535b = (long) (1000 / eVar.f37545b);
    }

    public void draw(Canvas canvas) {
        Matrix matrix;
        boolean z;
        Rect bounds = getBounds();
        canvas.translate((float) bounds.left, (float) bounds.top);
        int size = this.f37490f.size();
        for (int i = 0; i < size; i++) {
            C14435b bVar = (C14435b) this.f37490f.get(i);
            if (bVar.f37507d) {
                C14434a d = bVar.mo26605d();
                if (bVar.f37506c == C14433c.this.f37487c) {
                    matrix = null;
                } else {
                    matrix = bVar.f37506c;
                }
                if (d == null || d.f37501a == null || matrix == null) {
                    C14369a aVar = bVar.f37505b;
                    if (aVar != null && !aVar.f37372a.isEmpty()) {
                        this.f37489e.setShader(null);
                        this.f37489e.setStrokeCap(bVar.f37504a.f37436i);
                        if (bVar.mo26604c() != 0) {
                            this.f37489e.setStyle(Style.FILL);
                            if (bVar.f37508e == null) {
                                this.f37489e.setColor(bVar.mo26604c());
                                aVar.mo26570a(this.f37492h);
                                canvas.drawPath(aVar.f37372a, this.f37489e);
                                aVar.mo26570a(this.f37493i);
                            } else {
                                this.f37489e.setShader(bVar.f37508e);
                                canvas.concat(this.f37492h);
                                canvas.drawPath(aVar.f37372a, this.f37489e);
                                canvas.concat(this.f37493i);
                            }
                        }
                        if (bVar.mo26603b() != 0 && bVar.mo26601a() > 0.0f) {
                            this.f37489e.setColor(bVar.mo26603b());
                            this.f37489e.setStyle(Style.STROKE);
                            this.f37489e.setStrokeWidth(bVar.mo26601a() * this.f37496l * this.f37497m * this.f37498n);
                            aVar.mo26570a(this.f37492h);
                            canvas.drawPath(aVar.f37372a, this.f37489e);
                            aVar.mo26570a(this.f37493i);
                        }
                    }
                } else {
                    canvas.save();
                    canvas.concat(this.f37492h);
                    canvas.concat(matrix);
                    if (d.f37502b == null || d.f37502b.isIdentity()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        canvas.save();
                        canvas.concat(d.f37502b);
                    }
                    d.f37501a.draw(canvas);
                    if (z) {
                        canvas.restore();
                    }
                    canvas.restore();
                }
            }
        }
        canvas.translate((float) (-bounds.left), (float) (-bounds.top));
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f37494j = i3 - i;
        this.f37495k = i4 - i2;
        this.f37496l = Math.min(((float) this.f37494j) / this.f37485a.f37477e[0], ((float) this.f37495k) / this.f37485a.f37477e[1]);
        C14393a aVar = C14393a.UP;
        if (!(this.f37497m == 1.0f && this.f37498n == 1.0f)) {
            this.f37492h.setScale(this.f37496l, this.f37496l);
            this.f37497m = 1.0f;
            this.f37498n = 1.0f;
            this.f37492h.invert(this.f37493i);
        }
        if (!this.f37499o) {
            m29525b(0.0f);
        }
    }
}
