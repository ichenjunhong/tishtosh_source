package com.facebook.imagepipeline.p963c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p972l.C14056f;
import com.facebook.p955h.C13899b;

/* renamed from: com.facebook.imagepipeline.c.e */
public class C13945e extends C13946f {

    /* renamed from: a */
    private static final String f36365a = "e";

    /* renamed from: b */
    private final C13942b f36366b;

    /* renamed from: c */
    private final C14056f f36367c;

    /* renamed from: d */
    private boolean f36368d;

    public C13945e(C13942b bVar, C14056f fVar) {
        this.f36366b = bVar;
        this.f36367c = fVar;
    }

    /* renamed from: c */
    private static C13715a<Bitmap> m28402c(int i, int i2, Config config) {
        return C13715a.m27747a(Bitmap.createBitmap(i, i2, config), C13948g.m28419a());
    }

    /* renamed from: a */
    public final C13715a<Bitmap> mo26106a(int i, int i2, Config config) {
        C14044e eVar;
        if (this.f36368d) {
            return m28402c(i, i2, config);
        }
        C13715a a = this.f36366b.mo26107a((short) i, (short) i2);
        try {
            eVar = new C14044e(a);
            eVar.f36702c = C13899b.f36263a;
            C13715a<Bitmap> decodeJPEGFromEncodedImage = this.f36367c.decodeJPEGFromEncodedImage(eVar, config, null, ((C13709h) a.mo25630a()).mo25608a());
            if (!((Bitmap) decodeJPEGFromEncodedImage.mo25630a()).isMutable()) {
                C13715a.m27752c(decodeJPEGFromEncodedImage);
                this.f36368d = true;
                String str = f36365a;
                String str2 = "Immutable bitmap returned by decoder";
                if (C13697a.f35669a.mo25590b(6)) {
                    C13697a.f35669a.mo25596f(str, str2);
                }
                C13715a<Bitmap> c = m28402c(i, i2, config);
                C14044e.m28705d(eVar);
                a.close();
                return c;
            }
            ((Bitmap) decodeJPEGFromEncodedImage.mo25630a()).setHasAlpha(true);
            ((Bitmap) decodeJPEGFromEncodedImage.mo25630a()).eraseColor(0);
            C14044e.m28705d(eVar);
            a.close();
            return decodeJPEGFromEncodedImage;
        } catch (Throwable th) {
            a.close();
            throw th;
        }
    }
}
