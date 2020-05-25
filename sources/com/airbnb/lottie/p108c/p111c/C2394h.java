package com.airbnb.lottie.p108c.p111c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C2408e;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.C2482o;
import com.airbnb.lottie.p104a.p105a.C2302c;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2320a.C2321a;
import com.airbnb.lottie.p104a.p106b.C2334n;
import com.airbnb.lottie.p107b.C2338a;
import com.airbnb.lottie.p108c.C2356b;
import com.airbnb.lottie.p108c.C2381c;
import com.airbnb.lottie.p108c.C2397d;
import com.airbnb.lottie.p108c.C2401h;
import com.airbnb.lottie.p108c.p109a.C2352k;
import com.airbnb.lottie.p108c.p110b.C2373n;
import com.airbnb.lottie.p114f.C2454f;
import com.airbnb.lottie.p115g.C2470c;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.airbnb.lottie.c.c.h */
public final class C2394h extends C2382a {

    /* renamed from: g */
    private final char[] f7481g = new char[1];

    /* renamed from: h */
    private final RectF f7482h = new RectF();

    /* renamed from: i */
    private final Matrix f7483i = new Matrix();

    /* renamed from: j */
    private final Paint f7484j = new Paint(1) {
        {
            setStyle(Style.FILL);
        }
    };

    /* renamed from: k */
    private final Paint f7485k = new Paint(1) {
        {
            setStyle(Style.STROKE);
        }
    };

    /* renamed from: l */
    private final Map<C2397d, List<C2302c>> f7486l = new HashMap();

    /* renamed from: m */
    private final C2334n f7487m;

    /* renamed from: n */
    private final C2455g f7488n;

    /* renamed from: o */
    private final C2408e f7489o;

    /* renamed from: p */
    private C2320a<Integer, Integer> f7490p;

    /* renamed from: q */
    private C2320a<Integer, Integer> f7491q;

    /* renamed from: r */
    private C2320a<Float, Float> f7492r;

    /* renamed from: s */
    private C2320a<Float, Float> f7493s;

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
        super.mo6711a(t, cVar);
        if (t == C2474j.f7636a && this.f7490p != null) {
            this.f7490p.mo6723a(cVar);
        } else if (t == C2474j.f7637b && this.f7491q != null) {
            this.f7491q.mo6723a(cVar);
        } else if (t != C2474j.f7646k || this.f7492r == null) {
            if (t == C2474j.f7647l && this.f7493s != null) {
                this.f7493s.mo6723a(cVar);
            }
        } else {
            this.f7492r.mo6723a(cVar);
        }
    }

    C2394h(C2455g gVar, C2388d dVar) {
        super(gVar, dVar);
        this.f7488n = gVar;
        this.f7489o = dVar.f7452b;
        this.f7487m = dVar.f7467q.mo6735a();
        this.f7487m.mo6722a((C2321a) this);
        mo6752a((C2320a<?, ?>) this.f7487m);
        C2352k kVar = dVar.f7468r;
        if (!(kVar == null || kVar.f7303a == null)) {
            this.f7490p = kVar.f7303a.mo6735a();
            this.f7490p.mo6722a((C2321a) this);
            mo6752a(this.f7490p);
        }
        if (!(kVar == null || kVar.f7304b == null)) {
            this.f7491q = kVar.f7304b.mo6735a();
            this.f7491q.mo6722a((C2321a) this);
            mo6752a(this.f7491q);
        }
        if (!(kVar == null || kVar.f7305c == null)) {
            this.f7492r = kVar.f7305c.mo6735a();
            this.f7492r.mo6722a((C2321a) this);
            mo6752a(this.f7492r);
        }
        if (kVar != null && kVar.f7306d != null) {
            this.f7493s = kVar.f7306d.mo6735a();
            this.f7493s.mo6722a((C2321a) this);
            mo6752a(this.f7493s);
        }
    }

    /* renamed from: a */
    private static void m7038a(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    /* renamed from: a */
    private static void m7040a(char[] cArr, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(cArr, 0, 1, 0.0f, 0.0f, paint);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6754b(Canvas canvas, Matrix matrix, int i) {
        String str;
        List list;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        canvas.save();
        if (!this.f7488n.mo6844i()) {
            canvas.setMatrix(matrix);
        }
        C2356b bVar = (C2356b) this.f7487m.mo6726d();
        C2381c cVar = (C2381c) this.f7489o.f7518d.get(bVar.f7316b);
        if (cVar == null) {
            canvas.restore();
            return;
        }
        if (this.f7490p != null) {
            this.f7484j.setColor(((Integer) this.f7490p.mo6726d()).intValue());
        } else {
            this.f7484j.setColor(bVar.f7322h);
        }
        if (this.f7491q != null) {
            this.f7485k.setColor(((Integer) this.f7491q.mo6726d()).intValue());
        } else {
            this.f7485k.setColor(bVar.f7323i);
        }
        int intValue = (((Integer) this.f7421f.f7275e.mo6726d()).intValue() * NormalGiftView.ALPHA_255) / 100;
        this.f7484j.setAlpha(intValue);
        this.f7485k.setAlpha(intValue);
        if (this.f7492r != null) {
            this.f7485k.setStrokeWidth(((Float) this.f7492r.mo6726d()).floatValue());
        } else {
            this.f7485k.setStrokeWidth(((float) bVar.f7324j) * C2454f.m7176a() * C2454f.m7177a(matrix));
        }
        if (this.f7488n.mo6844i()) {
            float f = ((float) bVar.f7317c) / 100.0f;
            float a = C2454f.m7177a(matrix);
            String str2 = bVar.f7315a;
            int i2 = 0;
            while (i2 < str2.length()) {
                C2397d dVar = (C2397d) this.f7489o.f7519e.mo2591a(C2397d.m7043a(str2.charAt(i2), cVar.f7412a, cVar.f7414c));
                if (dVar != null) {
                    if (this.f7486l.containsKey(dVar)) {
                        str = str2;
                        list = (List) this.f7486l.get(dVar);
                    } else {
                        List<C2373n> list2 = dVar.f7496a;
                        int size = list2.size();
                        list = new ArrayList(size);
                        int i3 = 0;
                        while (i3 < size) {
                            String str3 = str2;
                            list.add(new C2302c(this.f7488n, this, (C2373n) list2.get(i3)));
                            i3++;
                            str2 = str3;
                        }
                        str = str2;
                        this.f7486l.put(dVar, list);
                    }
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        Path e = ((C2302c) list.get(i4)).mo6716e();
                        e.computeBounds(this.f7482h, false);
                        this.f7483i.set(matrix2);
                        this.f7483i.preTranslate(0.0f, ((float) (-bVar.f7321g)) * C2454f.m7176a());
                        this.f7483i.preScale(f, f);
                        e.transform(this.f7483i);
                        if (bVar.f7325k) {
                            m7038a(e, this.f7484j, canvas2);
                            m7038a(e, this.f7485k, canvas2);
                        } else {
                            m7038a(e, this.f7485k, canvas2);
                            m7038a(e, this.f7484j, canvas2);
                        }
                    }
                    float a2 = ((float) dVar.f7498c) * f * C2454f.m7176a() * a;
                    float f2 = ((float) bVar.f7319e) / 10.0f;
                    if (this.f7493s != null) {
                        f2 += ((Float) this.f7493s.mo6726d()).floatValue();
                    }
                    canvas2.translate(a2 + (f2 * a), 0.0f);
                } else {
                    str = str2;
                }
                i2++;
                str2 = str;
            }
        } else {
            m7039a(bVar, cVar, matrix2, canvas2);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private void m7039a(C2356b bVar, C2381c cVar, Matrix matrix, Canvas canvas) {
        C2338a aVar;
        int i;
        float a = C2454f.m7177a(matrix);
        C2455g gVar = this.f7488n;
        T t = cVar.f7412a;
        T t2 = cVar.f7414c;
        Typeface typeface = null;
        if (gVar.getCallback() == null) {
            aVar = null;
        } else {
            if (gVar.f7577h == null) {
                gVar.f7577h = new C2338a(gVar.getCallback(), gVar.f7578i);
            }
            aVar = gVar.f7577h;
        }
        if (aVar != null) {
            C2401h<String> hVar = aVar.f7280a;
            hVar.f7506a = t;
            hVar.f7507b = t2;
            typeface = (Typeface) aVar.f7281b.get(aVar.f7280a);
            if (typeface == null) {
                typeface = (Typeface) aVar.f7282c.get(t);
                if (typeface == null) {
                    StringBuilder sb = new StringBuilder("fonts/");
                    sb.append(t);
                    sb.append(aVar.f7285f);
                    typeface = Typeface.createFromAsset(aVar.f7283d, sb.toString());
                    aVar.f7282c.put(t, typeface);
                }
                boolean contains = t2.contains("Italic");
                boolean contains2 = t2.contains("Bold");
                if (contains && contains2) {
                    i = 3;
                } else if (contains) {
                    i = 2;
                } else if (contains2) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (typeface.getStyle() != i) {
                    typeface = Typeface.create(typeface, i);
                }
                aVar.f7281b.put(aVar.f7280a, typeface);
            }
        }
        if (typeface != null) {
            String str = bVar.f7315a;
            C2482o oVar = this.f7488n.f7579j;
            if (oVar != null) {
                if (oVar.f7678b && oVar.f7677a.containsKey(str)) {
                    str = (String) oVar.f7677a.get(str);
                } else if (oVar.f7678b) {
                    oVar.f7677a.put(str, str);
                }
            }
            this.f7484j.setTypeface(typeface);
            Paint paint = this.f7484j;
            double d = bVar.f7317c;
            double a2 = (double) C2454f.m7176a();
            Double.isNaN(a2);
            paint.setTextSize((float) (d * a2));
            this.f7485k.setTypeface(this.f7484j.getTypeface());
            this.f7485k.setTextSize(this.f7484j.getTextSize());
            for (int i2 = 0; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                this.f7481g[0] = charAt;
                if (bVar.f7325k) {
                    m7040a(this.f7481g, this.f7484j, canvas);
                    m7040a(this.f7481g, this.f7485k, canvas);
                } else {
                    m7040a(this.f7481g, this.f7485k, canvas);
                    m7040a(this.f7481g, this.f7484j, canvas);
                }
                this.f7481g[0] = charAt;
                float measureText = this.f7484j.measureText(this.f7481g, 0, 1);
                float f = ((float) bVar.f7319e) / 10.0f;
                if (this.f7493s != null) {
                    f += ((Float) this.f7493s.mo6726d()).floatValue();
                }
                canvas.translate(measureText + (f * a), 0.0f);
            }
        }
    }
}
