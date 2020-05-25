package com.p683ss.android.ugc.aweme.feed.helper;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p963c.C13946f;
import com.facebook.imagepipeline.p975o.C14228a;
import com.facebook.p914c.p915a.C13619c;
import com.facebook.p914c.p915a.C13624h;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.feed.adapter.C30032at;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.posterprocessor2.PosterSRProcessor;
import com.p683ss.posterprocessor2.PosterSRProcessor.C51370a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.p */
public final class C30392p extends C14228a {

    /* renamed from: d */
    public static final C30393a f79452d = new C30393a(null);

    /* renamed from: a */
    public final String f79453a;

    /* renamed from: b */
    public final DataCenter f79454b;

    /* renamed from: c */
    public final C30032at f79455c;

    /* renamed from: com.ss.android.ugc.aweme.feed.helper.p$a */
    public static final class C30393a {
        private C30393a() {
        }

        public /* synthetic */ C30393a(C52707g gVar) {
            this();
        }
    }

    public final C13619c getPostprocessorCacheKey() {
        return new C13624h("PosterSrPostProcessor");
    }

    public final C13715a<Bitmap> process(Bitmap bitmap, C13946f fVar) {
        int i;
        String str;
        int i2;
        C52711k.m112240b(bitmap, "sourceBitmap");
        C52711k.m112240b(fVar, "bitmapFactory");
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        PosterSRProcessor.f128456b.lock();
        if (C51370a.NN == PosterSRProcessor.f128460f && width * height <= 230400) {
            i = 2;
        } else if (C51370a.VASR == PosterSRProcessor.f128460f && (width & 3) == 0 && (height & 3) == 0) {
            i = 3;
        } else {
            i = -1;
        }
        PosterSRProcessor.f128456b.unlock();
        if (i != -1) {
            if (i == 2) {
                str = "NN";
            } else {
                str = "VASR";
            }
            C13715a b = fVar.mo26111b(width * i, i * height, Config.RGB_565);
            try {
                long currentTimeMillis = System.currentTimeMillis();
                Bitmap bitmap2 = (Bitmap) b.mo25630a();
                PosterSRProcessor.f128456b.lock();
                if (C51370a.NONE == PosterSRProcessor.f128460f) {
                    PosterSRProcessor.f128456b.unlock();
                    i2 = -12;
                } else {
                    if (C51370a.NN == PosterSRProcessor.f128460f && bitmap2.getWidth() == bitmap.getWidth() * 2 && bitmap2.getHeight() == bitmap.getHeight() * 2) {
                        i2 = PosterSRProcessor.nativePosterNNProcessWithBMP(PosterSRProcessor.f128459e, bitmap, bitmap2);
                        if (i2 != 0) {
                            PosterSRProcessor.f128456b.unlock();
                        }
                    } else if (C51370a.VASR == PosterSRProcessor.f128460f && bitmap2.getWidth() == bitmap.getWidth() * 3 && bitmap2.getHeight() == bitmap.getHeight() * 3) {
                        i2 = PosterSRProcessor.nativePosterASRProcessWithBMP(bitmap, bitmap2);
                        if (i2 != 0) {
                            PosterSRProcessor.f128456b.unlock();
                        }
                    } else {
                        PosterSRProcessor.f128456b.unlock();
                        i2 = -11;
                    }
                    PosterSRProcessor.f128456b.unlock();
                    i2 = 0;
                }
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                StringBuilder sb = new StringBuilder("Process Cost:");
                sb.append(currentTimeMillis2);
                sb.append(",code:");
                sb.append(i2);
                sb.append(",model:");
                sb.append(str);
                sb.append(",url:");
                sb.append(this.f79453a);
                String sb2 = sb.toString();
                C32458a.m75150b("PosterSR", sb2);
                this.f79455c.f78391a = currentTimeMillis2;
                this.f79455c.f78394d = str;
                if (i2 == 0) {
                    return C13715a.m27751b(b);
                }
                StringBuilder sb3 = new StringBuilder("poster sr fail:");
                sb3.append(sb2);
                throw new IllegalStateException(sb3.toString());
            } finally {
                C13715a.m27752c(b);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public C30392p(String str, DataCenter dataCenter, C30032at atVar) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(atVar, "controllerListener");
        this.f79453a = str;
        this.f79454b = dataCenter;
        this.f79455c = atVar;
    }
}
