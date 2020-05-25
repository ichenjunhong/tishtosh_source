package com.facebook.drawee.p940f;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build.VERSION;
import com.facebook.common.p921e.C13697a;
import com.facebook.drawee.p939e.C13800c;
import com.facebook.drawee.p939e.C13804g;
import com.facebook.drawee.p939e.C13807j;
import com.facebook.drawee.p939e.C13808k;
import com.facebook.drawee.p939e.C13809l;
import com.facebook.drawee.p939e.C13810m;
import com.facebook.drawee.p939e.C13814o;
import com.facebook.drawee.p939e.C13815p;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13837e.C13838a;
import com.facebook.imagepipeline.p976p.C14237b;

/* renamed from: com.facebook.drawee.f.f */
public final class C13839f {

    /* renamed from: a */
    static final Drawable f36117a = new ColorDrawable(0);

    /* renamed from: a */
    private static C13800c m28128a(C13800c cVar) {
        while (true) {
            Drawable drawable = cVar.getDrawable();
            if (drawable == cVar || !(drawable instanceof C13800c)) {
                return cVar;
            }
            cVar = (C13800c) drawable;
        }
        return cVar;
    }

    /* renamed from: a */
    private static void m28131a(C13807j jVar) {
        jVar.mo25846a(false);
        jVar.mo25844a(0.0f);
        jVar.mo25845a(0, 0.0f);
        jVar.mo25848b(0.0f);
        jVar.mo25849b(false);
    }

    /* renamed from: a */
    static Drawable m28124a(Drawable drawable, C13818b bVar) {
        return m28125a(drawable, bVar, (PointF) null);
    }

    /* renamed from: a */
    static Drawable m28126a(Drawable drawable, C13837e eVar) {
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (!(drawable == null || eVar == null)) {
                if (eVar.f36108a == C13838a.OVERLAY_COLOR) {
                    C13810m mVar = new C13810m(drawable);
                    m28132a((C13807j) mVar, eVar);
                    mVar.mo25862a(eVar.f36111d);
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                    return mVar;
                }
            }
            return drawable;
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    /* renamed from: a */
    static void m28129a(C13800c cVar, C13837e eVar) {
        Drawable drawable = cVar.getDrawable();
        if (eVar == null || eVar.f36108a != C13838a.OVERLAY_COLOR) {
            if (drawable instanceof C13810m) {
                cVar.setDrawable(((C13810m) drawable).setCurrent(f36117a));
                f36117a.setCallback(null);
            }
        } else if (drawable instanceof C13810m) {
            C13810m mVar = (C13810m) drawable;
            m28132a((C13807j) mVar, eVar);
            mVar.mo25862a(eVar.f36111d);
        } else {
            cVar.setDrawable(m28126a(cVar.setDrawable(f36117a), eVar));
        }
    }

    /* renamed from: a */
    private static void m28132a(C13807j jVar, C13837e eVar) {
        jVar.mo25846a(eVar.f36109b);
        jVar.mo25847a(eVar.f36110c);
        jVar.mo25845a(eVar.f36113f, eVar.f36112e);
        jVar.mo25848b(eVar.f36114g);
        jVar.mo25849b(eVar.f36115h);
    }

    /* renamed from: a */
    static Drawable m28125a(Drawable drawable, C13818b bVar, PointF pointF) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || bVar == null) {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
            return drawable;
        }
        C13815p pVar = new C13815p(drawable, bVar);
        if (pointF != null) {
            pVar.mo25871a(pointF);
        }
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
        return pVar;
    }

    /* renamed from: b */
    private static Drawable m28133b(Drawable drawable, C13837e eVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            C13808k kVar = new C13808k(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            m28132a((C13807j) kVar, eVar);
            return kVar;
        } else if (drawable instanceof NinePatchDrawable) {
            C13814o oVar = new C13814o((NinePatchDrawable) drawable);
            m28132a((C13807j) oVar, eVar);
            return oVar;
        } else if (!(drawable instanceof ColorDrawable) || VERSION.SDK_INT < 11) {
            C13697a.m27691b("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        } else {
            C13809l a = C13809l.m28005a((ColorDrawable) drawable);
            m28132a((C13807j) a, eVar);
            return a;
        }
    }

    /* renamed from: a */
    static Drawable m28127a(Drawable drawable, C13837e eVar, Resources resources) {
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (!(drawable == null || eVar == null)) {
                if (eVar.f36108a == C13838a.BITMAP_ONLY) {
                    if (drawable instanceof C13804g) {
                        C13800c a = m28128a((C13800c) (C13804g) drawable);
                        a.setDrawable(m28133b(a.setDrawable(f36117a), eVar, resources));
                        if (C14237b.m29187b()) {
                            C14237b.m29185a();
                        }
                        return drawable;
                    }
                    Drawable b = m28133b(drawable, eVar, resources);
                    if (C14237b.m29187b()) {
                        C14237b.m29185a();
                    }
                    return b;
                }
            }
            return drawable;
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    /* renamed from: a */
    static void m28130a(C13800c cVar, C13837e eVar, Resources resources) {
        C13800c a = m28128a(cVar);
        Drawable drawable = a.getDrawable();
        if (eVar == null || eVar.f36108a != C13838a.BITMAP_ONLY) {
            if (drawable instanceof C13807j) {
                m28131a((C13807j) drawable);
            }
        } else if (drawable instanceof C13807j) {
            m28132a((C13807j) drawable, eVar);
        } else if (drawable != null) {
            a.setDrawable(f36117a);
            a.setDrawable(m28133b(drawable, eVar, resources));
        }
    }
}
