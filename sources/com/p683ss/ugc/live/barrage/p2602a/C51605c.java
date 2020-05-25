package com.p683ss.ugc.live.barrage.p2602a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.RectF;
import android.view.View;
import com.p683ss.ugc.live.barrage.p2602a.C51596a.C51597a;
import com.p683ss.ugc.live.barrage.p2602a.C51596a.C51597a.C51600c;
import com.p683ss.ugc.live.barrage.p2602a.C51596a.C51597a.C51601d;
import com.p683ss.ugc.live.barrage.p2604c.C51616a;
import com.p683ss.ugc.live.barrage.p2604c.C51616a.C51617a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.live.barrage.a.c */
public final class C51605c extends C51596a {

    /* renamed from: a */
    public Bitmap f128889a;

    /* renamed from: b */
    public View f128890b;

    /* renamed from: c */
    private final Context f128891c;

    /* renamed from: d */
    private int f128892d;

    /* renamed from: e */
    private final C51606a f128893e = new C51606a(this);

    /* renamed from: com.ss.ugc.live.barrage.a.c$a */
    public static final class C51606a implements C51617a {

        /* renamed from: a */
        final /* synthetic */ C51605c f128894a;

        C51606a(C51605c cVar) {
            this.f128894a = cVar;
        }

        /* renamed from: a */
        public final void mo105546a(View view, Bitmap bitmap) {
            int i;
            C52711k.m112240b(view, "view");
            C52711k.m112240b(bitmap, "bitmap");
            this.f128894a.f128890b = view;
            int i2 = 0;
            if (bitmap.isRecycled()) {
                this.f128894a.f128889a = Bitmap.createBitmap(0, 0, Config.ARGB_4444);
            } else {
                this.f128894a.f128889a = bitmap.copy(Config.ARGB_8888, true);
            }
            View view2 = this.f128894a.f128890b;
            if (view2 != null) {
                view2.destroyDrawingCache();
            }
            RectF rectF = this.f128894a.f128881k;
            float f = this.f128894a.f128881k.left;
            Bitmap bitmap2 = this.f128894a.f128889a;
            if (bitmap2 != null) {
                i = bitmap2.getWidth();
            } else {
                i = 0;
            }
            rectF.right = f + ((float) i);
            RectF rectF2 = this.f128894a.f128881k;
            float f2 = this.f128894a.f128881k.top;
            Bitmap bitmap3 = this.f128894a.f128889a;
            if (bitmap3 != null) {
                i2 = bitmap3.getHeight();
            }
            rectF2.bottom = f2 + ((float) i2);
            this.f128894a.mo105544e();
        }
    }

    /* renamed from: b */
    public final Bitmap mo105541b() {
        return this.f128889a;
    }

    /* renamed from: c */
    public final void mo105542c() {
        super.mo105542c();
        View view = this.f128890b;
        if (view != null) {
            C51616a.m110791a(view, this.f128893e);
        } else {
            C51616a.f128920a.mo105555a(this.f128891c, this.f128892d, this.f128893e);
        }
    }

    /* renamed from: d */
    public final void mo105543d() {
        super.mo105543d();
        View view = this.f128890b;
        if (view != null) {
            view.destroyDrawingCache();
        }
        this.f128890b = null;
        Bitmap bitmap = this.f128889a;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f128889a = null;
    }

    /* renamed from: a */
    public final void mo105545a(View view) {
        C52711k.m112240b(view, "view");
        m110762a(view, -1);
    }

    public C51605c(View view) {
        C52711k.m112240b(view, "view");
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "view.context");
        this.f128891c = context;
        mo105545a(view);
    }

    /* renamed from: a */
    private final void m110762a(View view, int i) {
        this.f128890b = view;
        this.f128892d = -1;
        C51597a aVar = this.f128882l;
        if (C52711k.m112239a((Object) aVar, (Object) C51600c.f128885a) || C52711k.m112239a((Object) aVar, (Object) C51601d.f128886a)) {
            View view2 = this.f128890b;
            if (view2 != null) {
                C51616a.m110791a(view2, this.f128893e);
                return;
            }
            C51616a.f128920a.mo105555a(this.f128891c, this.f128892d, this.f128893e);
        }
    }
}
