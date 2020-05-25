package com.p2620vk.sdk.api.p2622a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import com.p2620vk.sdk.api.p2622a.C52327a.C52330a;
import com.p2620vk.sdk.api.p2622a.C52327a.C52331b;
import com.p2620vk.sdk.api.p2622a.C52327a.C52332c;
import com.p2620vk.sdk.api.p2622a.C52333b.C52337a;

/* renamed from: com.vk.sdk.api.a.e */
public final class C52343e extends C52341d<Bitmap> {

    /* renamed from: f */
    public float f130336f;

    /* renamed from: com.vk.sdk.api.a.e$a */
    public static abstract class C52346a extends C52330a<C52343e, Bitmap> {
    }

    /* renamed from: f */
    public final Bitmap mo109152c() {
        byte[] bArr;
        if (this.f130332e != null) {
            bArr = this.f130332e.f130329d;
        } else {
            bArr = null;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (this.f130336f > 0.0f) {
            return Bitmap.createScaledBitmap(decodeByteArray, (int) (((float) decodeByteArray.getWidth()) * this.f130336f), (int) (((float) decodeByteArray.getHeight()) * this.f130336f), true);
        }
        return decodeByteArray;
    }

    /* renamed from: a */
    public final void mo109155a(final C52346a aVar) {
        this.f130308a = new C52331b() {
            /* renamed from: a */
            public final void mo109146a() {
                if (C52343e.this.f130309b == C52332c.Finished && C52343e.this.f130331d == null) {
                    final Bitmap f = C52343e.this.mo109152c();
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            aVar.mo109145a(C52343e.this, f);
                        }
                    });
                    return;
                }
                aVar.mo109144a(C52343e.this, C52343e.this.mo109151a(C52343e.this.f130331d));
            }
        };
    }

    public C52343e(String str) {
        super(new C52337a(str));
    }
}
