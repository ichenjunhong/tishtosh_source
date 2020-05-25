package com.bytedance.android.livesdk.chatroom.p301a.p302a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.p683ss.ugc.live.barrage.p2602a.C51596a.C51597a.C51601d;
import com.p683ss.ugc.live.barrage.p2602a.C51604b;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a */
public final class C4965a extends C51604b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f13321a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C4965a.class), "matrix", "getMatrix()Landroid/graphics/Matrix;"))};

    /* renamed from: f */
    public static final C4966a f13322f = new C4966a(null);

    /* renamed from: b */
    public int f13323b = 204;

    /* renamed from: c */
    public float f13324c = 1.0f;

    /* renamed from: d */
    public float f13325d;

    /* renamed from: e */
    public double f13326e;

    /* renamed from: m */
    private final C52668f f13327m = C52732g.m112285a(C4967b.f13328a);

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a$a */
    public static final class C4966a {
        private C4966a() {
        }

        public /* synthetic */ C4966a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.a.a$b */
    static final class C4967b extends C52712l implements C52670a<Matrix> {

        /* renamed from: a */
        public static final C4967b f13328a = new C4967b();

        C4967b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Matrix();
        }
    }

    /* renamed from: f */
    private final Matrix m11458f() {
        return (Matrix) this.f13327m.getValue();
    }

    /* renamed from: a */
    public final void mo10730a(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        mo105538a().setAlpha(this.f13323b);
        RectF rectF = this.f128881k;
        float width = rectF.width();
        float height = rectF.height();
        float f = width / 2.0f;
        float f2 = height / 2.0f;
        m11458f().setRotate(this.f13325d, f, f2);
        m11458f().postScale(this.f13324c, this.f13324c);
        m11458f().postTranslate((rectF.left + ((width * 0.5f) * (1.0f - this.f13324c))) - f, (rectF.top + ((height * 0.5f) * (1.0f - this.f13324c))) - f2);
        Matrix f3 = m11458f();
        C52711k.m112240b(canvas, "canvas");
        C52711k.m112240b(f3, "matrix");
        if (!(!C52711k.m112239a((Object) this.f128882l, (Object) C51601d.f128886a))) {
            Bitmap b = mo105541b();
            if (b != null && !b.isRecycled()) {
                canvas.drawBitmap(mo105541b(), f3, mo105538a());
            }
        }
    }

    public C4965a(Bitmap bitmap, double d) {
        C52711k.m112240b(bitmap, "bitmap");
        super(bitmap);
        this.f13326e = d;
    }
}
