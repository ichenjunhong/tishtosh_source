package com.facebook.imagepipeline.p963c;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p924h.C13715a;
import com.facebook.common.p928l.C13732a;
import com.facebook.imagepipeline.memory.C14067ac;
import com.facebook.imagepipeline.memory.C14085n;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.p955h.C13899b;

/* renamed from: com.facebook.imagepipeline.c.d */
public final class C13944d implements C13732a {

    /* renamed from: a */
    private final C13942b f36363a;

    /* renamed from: b */
    private final C14085n f36364b;

    public C13944d(C14067ac acVar) {
        this.f36364b = acVar.mo26321b();
        this.f36363a = new C13942b(acVar.mo26323d());
    }

    public final Bitmap createNakedBitmap(int i, int i2, Config config) {
        C14044e eVar;
        Options options;
        int a;
        C13709h hVar;
        C13715a a2;
        C13715a a3 = this.f36363a.mo26107a((short) i, (short) i2);
        C13715a aVar = null;
        try {
            eVar = new C14044e(a3);
            try {
                eVar.f36702c = C13899b.f36263a;
                int i3 = eVar.f36707h;
                options = new Options();
                options.inDither = true;
                options.inPreferredConfig = config;
                options.inPurgeable = true;
                options.inInputShareable = true;
                options.inSampleSize = i3;
                if (VERSION.SDK_INT >= 11) {
                    options.inMutable = true;
                }
                a = ((C13709h) a3.mo25630a()).mo25608a();
                hVar = (C13709h) a3.mo25630a();
                a2 = this.f36364b.mo26341a(a + 2);
            } catch (Throwable th) {
                th = th;
                C13715a.m27752c(aVar);
                C14044e.m28705d(eVar);
                C13715a.m27752c(a3);
                throw th;
            }
            try {
                byte[] bArr = (byte[]) a2.mo25630a();
                hVar.mo25609a(0, bArr, 0, a);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, a, options);
                decodeByteArray.setHasAlpha(true);
                decodeByteArray.eraseColor(0);
                C13715a.m27752c(a2);
                C14044e.m28705d(eVar);
                C13715a.m27752c(a3);
                return decodeByteArray;
            } catch (Throwable th2) {
                th = th2;
                aVar = a2;
                C13715a.m27752c(aVar);
                C14044e.m28705d(eVar);
                C13715a.m27752c(a3);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            eVar = null;
            C13715a.m27752c(aVar);
            C14044e.m28705d(eVar);
            C13715a.m27752c(a3);
            throw th;
        }
    }
}
