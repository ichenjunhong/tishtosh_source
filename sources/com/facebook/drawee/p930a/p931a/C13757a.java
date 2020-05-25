package com.facebook.drawee.p930a.p931a;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.p939e.C13806i;
import com.facebook.imagepipeline.p968h.C14038a;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p976p.C14237b;

/* renamed from: com.facebook.drawee.a.a.a */
public final class C13757a implements C14038a {

    /* renamed from: a */
    private final Resources f35767a;

    /* renamed from: b */
    private final C14038a f35768b;

    /* renamed from: a */
    public final boolean mo25692a(C14042c cVar) {
        return true;
    }

    /* renamed from: b */
    public final Drawable mo25693b(C14042c cVar) {
        boolean z;
        try {
            if (C14237b.m29187b()) {
                C14237b.m29186a("DefaultDrawableFactory#createDrawable");
            }
            if (cVar instanceof C14043d) {
                C14043d dVar = (C14043d) cVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f35767a, dVar.mo26257d());
                boolean z2 = false;
                if (dVar.f36695a == 0 || dVar.f36695a == -1) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (!(dVar.f36696b == 1 || dVar.f36696b == 0)) {
                        z2 = true;
                    }
                    if (!z2) {
                        return bitmapDrawable;
                    }
                }
                C13806i iVar = new C13806i(bitmapDrawable, dVar.f36695a, dVar.f36696b);
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
                return iVar;
            } else if (this.f35768b == null || !this.f35768b.mo25692a(cVar)) {
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
                return null;
            } else {
                Drawable b = this.f35768b.mo25693b(cVar);
                if (C14237b.m29187b()) {
                    C14237b.m29185a();
                }
                return b;
            }
        } finally {
            if (C14237b.m29187b()) {
                C14237b.m29185a();
            }
        }
    }

    public C13757a(Resources resources, C14038a aVar) {
        this.f35767a = resources;
        this.f35768b = aVar;
    }
}
