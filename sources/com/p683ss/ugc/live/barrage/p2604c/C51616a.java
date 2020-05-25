package com.p683ss.ugc.live.barrage.p2604c;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.live.barrage.c.a */
public final class C51616a {

    /* renamed from: a */
    public static final C51616a f128920a = new C51616a();

    /* renamed from: com.ss.ugc.live.barrage.c.a$a */
    public interface C51617a {
        /* renamed from: a */
        void mo105546a(View view, Bitmap bitmap);
    }

    private C51616a() {
    }

    /* renamed from: a */
    public static void m110791a(View view, C51617a aVar) {
        C52711k.m112240b(view, "view");
        C52711k.m112240b(aVar, "listener");
        view.measure(MeasureSpec.makeMeasureSpec(0, 0), MeasureSpec.makeMeasureSpec(0, 0));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        view.setDrawingCacheEnabled(true);
        try {
            Bitmap drawingCache = view.getDrawingCache();
            if (drawingCache != null && !drawingCache.isRecycled()) {
                aVar.mo105546a(view, drawingCache);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo105555a(Context context, int i, C51617a aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aVar, "listener");
        View inflate = LayoutInflater.from(context).inflate(i, null);
        C52711k.m112236a((Object) inflate, "view");
        m110791a(inflate, aVar);
    }
}
