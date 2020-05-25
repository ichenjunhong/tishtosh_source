package com.p683ss.android.ugc.aweme.poi.preview.p2067a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C9431p;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p965e.C14001h;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.p929d.C13745c;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.poi.preview.C39159b;
import com.p683ss.android.ugc.aweme.poi.preview.p2067a.C39157b.C39158a;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.C39181e;
import com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.a.a */
public final class C39155a implements C39157b {
    /* renamed from: a */
    public final Drawable mo79794a(String str, C39181e eVar) {
        String str2;
        String a = C23515d.m57665a(str);
        if (!C9431p.m18664a(a)) {
            try {
                Options options = new Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(a, options);
                float b = (float) C39159b.m87006b();
                if (((float) options.outWidth) <= b || ((float) options.outHeight) <= b) {
                    return BitmapDrawable.createFromPath(a);
                }
                options.inSampleSize = m86996a(options.outWidth, options.outHeight, b, b);
                options.inJustDecodeBounds = false;
                if (eVar != null) {
                    str2 = eVar.f99957w;
                } else {
                    str2 = "";
                }
                m86997a(str2, str, options.outWidth, options.outHeight);
                return new BitmapDrawable(BitmapFactory.decodeFile(a, options));
            } catch (Exception | OutOfMemoryError unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final Bitmap mo79793a(Bitmap bitmap, String str, String str2) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float b = (float) C39159b.m87006b();
        float f = (float) width;
        if (f > b) {
            float f2 = (float) height;
            if (f2 > b) {
                float max = Math.max(f / b, f2 / b);
                Matrix matrix = new Matrix();
                float f3 = 1.0f / max;
                matrix.setScale(f3, f3);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
                m86997a(str, str2, width, height);
                return createBitmap;
            }
        }
        return bitmap;
    }

    /* renamed from: a */
    private static int m86996a(int i, int i2, float f, float f2) {
        float min = Math.min(((float) i) / f, ((float) i2) / f2);
        float f3 = 1.0f;
        while (true) {
            float f4 = 2.0f * f3;
            if (f4 > min) {
                return (int) f3;
            }
            f3 = f4;
        }
    }

    /* renamed from: a */
    private static void m86997a(String str, String str2, int i, int i2) {
        C23088c a = C23088c.m56631a();
        a.mo47824a("item_id", str);
        a.mo47824a("url", str2);
        a.mo47822a("width", Integer.valueOf(i));
        a.mo47822a("height", Integer.valueOf(i2));
        C23131p.m56692a("poi_log", "poi_preview", a.mo47825b());
    }

    /* renamed from: a */
    public final void mo79795a(String str, ImageView imageView, Drawable drawable, C39181e eVar, C39158a aVar) {
        C14001h c = C13771c.m27875c();
        C14229b a = C14232c.m29169a(Uri.parse(str)).mo26449a();
        final C13745c a2 = c.mo26182a(a, (Object) null);
        TransferImage transferImage = (TransferImage) imageView;
        C13773e eVar2 = (C13773e) ((C13773e) C13771c.m27870a().mo25757b(a)).mo25759b(transferImage.getController());
        final C39158a aVar2 = aVar;
        final ImageView imageView2 = imageView;
        final C39181e eVar3 = eVar;
        final String str2 = str;
        final Drawable drawable2 = drawable;
        C391561 r3 = new C13790c<C14045f>() {
            public final void onSubmit(String str, Object obj) {
                if (aVar2 != null) {
                    aVar2.mo79796a();
                }
            }

            public final void onFailure(String str, Throwable th) {
                if (drawable2 != null) {
                    imageView2.setImageDrawable(drawable2);
                    imageView2.setScaleType(ScaleType.FIT_CENTER);
                }
                if (aVar2 != null) {
                    aVar2.mo79797a(0);
                }
            }

            public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                C13715a aVar;
                Throwable th;
                String str2;
                C14045f fVar = (C14045f) obj;
                try {
                    aVar = (C13715a) a2.mo25674d();
                    if (aVar != null) {
                        try {
                            C14042c cVar = (C14042c) aVar.mo25630a();
                            if (cVar != null && (cVar instanceof C14043d)) {
                                Bitmap d = ((C14043d) cVar).mo26257d();
                                if (d != null) {
                                    ImageView imageView = imageView2;
                                    C39155a aVar2 = C39155a.this;
                                    if (eVar3 != null) {
                                        str2 = eVar3.f99957w;
                                    } else {
                                        str2 = "";
                                    }
                                    imageView.setImageBitmap(aVar2.mo79793a(d, str2, str2));
                                    imageView2.setScaleType(ScaleType.FIT_CENTER);
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            a2.mo25677g();
                            C13715a.m27752c(aVar);
                            throw th;
                        }
                    }
                    a2.mo25677g();
                    C13715a.m27752c(aVar);
                    if (aVar2 != null) {
                        aVar2.mo79797a(1);
                    }
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    aVar = null;
                    th = th4;
                    a2.mo25677g();
                    C13715a.m27752c(aVar);
                    throw th;
                }
            }
        };
        transferImage.setController(((C13773e) eVar2.mo25751a((C13791d<? super INFO>) r3)).mo25763d());
    }
}
