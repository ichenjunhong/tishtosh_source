package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.p923g.C13703b;

/* renamed from: com.facebook.imagepipeline.memory.p */
public final class C14089p implements C14073d {

    /* renamed from: a */
    protected final C14063aa<Bitmap> f36810a = new C14074e();

    /* renamed from: b */
    private final int f36811b;

    /* renamed from: c */
    private int f36812c;

    /* renamed from: d */
    private final C14069ae f36813d;

    /* renamed from: e */
    private int f36814e;

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void mo25600a(Bitmap bitmap) {
        int b = this.f36810a.mo26317b(bitmap);
        if (b <= this.f36812c) {
            this.f36810a.mo26316a(bitmap);
            this.f36814e += b;
        }
    }

    /* renamed from: b */
    private synchronized void m28828b(int i) {
        while (this.f36814e > i) {
            Bitmap bitmap = (Bitmap) this.f36810a.mo26314a();
            if (bitmap == null) {
                break;
            }
            this.f36814e -= this.f36810a.mo26317b(bitmap);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized Bitmap mo25599a(int i) {
        if (this.f36814e > this.f36811b) {
            m28828b(this.f36811b);
        }
        Bitmap bitmap = (Bitmap) this.f36810a.mo26315a(i);
        if (bitmap != null) {
            this.f36814e -= this.f36810a.mo26317b(bitmap);
            return bitmap;
        }
        return Bitmap.createBitmap(1, i, Config.ALPHA_8);
    }

    /* renamed from: a */
    public final void mo25598a(C13703b bVar) {
        double d = (double) this.f36811b;
        double suggestedTrimRatio = 1.0d - bVar.getSuggestedTrimRatio();
        Double.isNaN(d);
        m28828b((int) (d * suggestedTrimRatio));
    }

    public C14089p(int i, int i2, C14069ae aeVar) {
        this.f36811b = i;
        this.f36812c = i2;
        this.f36813d = aeVar;
    }
}
