package com.facebook.imagepipeline.p967g;

import android.graphics.Bitmap;
import android.os.Build.VERSION;
import com.facebook.common.p920d.C13678a;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p970j.C14046g;
import com.facebook.imagepipeline.p970j.C14047h;
import com.facebook.imagepipeline.p972l.C14056f;
import com.facebook.imagepipeline.p978r.C14249a;
import com.facebook.p955h.C13899b;
import com.facebook.p955h.C13900c;
import com.facebook.p955h.C13902d;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.g.b */
public final class C14028b implements C14030c {

    /* renamed from: a */
    final C14030c f36675a;

    /* renamed from: b */
    final C14030c f36676b;

    /* renamed from: c */
    private final C14030c f36677c;

    /* renamed from: d */
    private final C14056f f36678d;

    /* renamed from: e */
    private final C14030c f36679e;

    /* renamed from: f */
    private final Map<C13900c, C14030c> f36680f;

    /* renamed from: a */
    private static void m28668a(C14249a aVar, C13715a<Bitmap> aVar2) {
        if (aVar != null) {
            Bitmap bitmap = (Bitmap) aVar2.mo25630a();
            if (VERSION.SDK_INT >= 12 && aVar.mo26462a()) {
                bitmap.setHasAlpha(true);
            }
        }
    }

    /* renamed from: a */
    public final C14043d mo26244a(C14044e eVar, C13950b bVar) {
        C13715a decodeFromEncodedImageWithColorSpace = this.f36678d.decodeFromEncodedImageWithColorSpace(eVar, bVar.f36393h, null, bVar.f36392g);
        try {
            m28668a(bVar.f36395j, decodeFromEncodedImageWithColorSpace);
            return new C14043d(decodeFromEncodedImageWithColorSpace, C14046g.f36711a, eVar.mo26268e(), eVar.mo26269f());
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }

    public C14028b(C14030c cVar, C14030c cVar2, C14030c cVar3, C14056f fVar) {
        this(cVar, cVar2, cVar3, fVar, null);
    }

    /* renamed from: a */
    public final C14042c mo26049a(C14044e eVar, int i, C14047h hVar, C13950b bVar) {
        if (bVar.f36394i != null) {
            return bVar.f36394i.mo26049a(eVar, i, hVar, bVar);
        }
        C13900c d = eVar.mo26267d();
        if (d == null || d == C13900c.f36275a) {
            d = C13902d.m28314a(eVar.mo26265c());
            eVar.f36702c = d;
        }
        if (this.f36680f != null) {
            C14030c cVar = (C14030c) this.f36680f.get(d);
            if (cVar != null) {
                return cVar.mo26049a(eVar, i, hVar, bVar);
            }
        }
        return this.f36679e.mo26049a(eVar, i, hVar, bVar);
    }

    /* renamed from: b */
    public final C14043d mo26245b(C14044e eVar, int i, C14047h hVar, C13950b bVar) {
        C13715a decodeJPEGFromEncodedImageWithColorSpace = this.f36678d.decodeJPEGFromEncodedImageWithColorSpace(eVar, bVar.f36393h, null, i, bVar.f36392g);
        try {
            m28668a(bVar.f36395j, decodeJPEGFromEncodedImageWithColorSpace);
            return new C14043d(decodeJPEGFromEncodedImageWithColorSpace, hVar, eVar.mo26268e(), eVar.mo26269f());
        } finally {
            decodeJPEGFromEncodedImageWithColorSpace.close();
        }
    }

    public C14028b(C14030c cVar, C14030c cVar2, C14030c cVar3, C14056f fVar, Map<C13900c, C14030c> map) {
        this.f36679e = new C14030c() {
            /* renamed from: a */
            public final C14042c mo26049a(C14044e eVar, int i, C14047h hVar, C13950b bVar) {
                String str;
                C13900c d = eVar.mo26267d();
                if (d == C13899b.f36263a) {
                    return C14028b.this.mo26245b(eVar, i, hVar, bVar);
                }
                if (d == C13899b.f36265c) {
                    C14028b bVar2 = C14028b.this;
                    if (bVar.f36391f || bVar2.f36675a == null) {
                        return bVar2.mo26244a(eVar, bVar);
                    }
                    return bVar2.f36675a.mo26049a(eVar, i, hVar, bVar);
                } else if (d == C13899b.f36272j) {
                    return C14028b.this.f36676b.mo26049a(eVar, i, hVar, bVar);
                } else {
                    if (d != C13900c.f36275a) {
                        return C14028b.this.mo26244a(eVar, bVar);
                    }
                    try {
                        byte[] bArr = new byte[22];
                        C13678a.m27631a(eVar.mo26265c(), bArr, 0, 22);
                        StringBuilder sb = new StringBuilder(44);
                        for (int i2 = 0; i2 < 22; i2++) {
                            String hexString = Integer.toHexString(bArr[i2] & 255);
                            if (hexString.length() < 2) {
                                sb.append('0');
                            }
                            sb.append(hexString.toLowerCase());
                        }
                        str = sb.toString();
                    } catch (Throwable unused) {
                        str = "unknow";
                    }
                    StringBuilder sb2 = new StringBuilder("unknown image format, errorHead: ");
                    sb2.append(str);
                    throw new C14027a(sb2.toString(), eVar);
                }
            }
        };
        this.f36675a = cVar;
        this.f36676b = cVar2;
        this.f36677c = cVar3;
        this.f36678d = fVar;
        this.f36680f = map;
    }
}
