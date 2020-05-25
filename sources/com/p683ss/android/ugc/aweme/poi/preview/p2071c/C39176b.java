package com.p683ss.android.ugc.aweme.poi.preview.p2071c;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p683ss.android.ugc.aweme.poi.preview.p2067a.C39157b;
import com.p683ss.android.ugc.aweme.poi.preview.p2067a.C39157b.C39158a;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39170c;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.p2072a.C39174c;
import com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.c.b */
final class C39176b extends C39193g {
    C39176b(C39184f fVar) {
        super(fVar);
    }

    /* renamed from: e */
    private Drawable m87041e(int i) {
        C39181e transConfig = this.f100012a.getTransConfig();
        ImageView imageView = (ImageView) transConfig.mo79827b().get(i);
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return transConfig.mo79825a(this.f100013b);
    }

    /* renamed from: a */
    public final TransferImage mo79821a(int i) {
        ImageView imageView = (ImageView) this.f100012a.getTransConfig().mo79827b().get(i);
        TransferImage a = mo79871a(imageView);
        a.setImageDrawable(imageView.getDrawable());
        a.mo79926a(201);
        this.f100012a.addView(a, 1);
        return a;
    }

    /* renamed from: b */
    public final void mo79823b(int i) {
        Drawable b;
        C39174c transAdapter = this.f100012a.getTransAdapter();
        C39181e transConfig = this.f100012a.getTransConfig();
        String str = (String) transConfig.f99946l.get(i);
        TransferImage a = transAdapter.mo79816a(i);
        if (transConfig.f99941g) {
            b = m87041e(i);
        } else {
            b = m87040b(a, i);
        }
        Drawable drawable = b;
        final C39170c cVar = transConfig.f99949o;
        cVar.mo79814a(i, transAdapter.mo79819b(i));
        C39157b bVar = transConfig.f99951q;
        final int i2 = i;
        final TransferImage transferImage = a;
        final C39181e eVar = transConfig;
        C391771 r2 = new C39158a() {
            /* renamed from: a */
            public final void mo79796a() {
                cVar.mo79813a(i2);
            }

            /* renamed from: a */
            public final void mo79797a(int i) {
                switch (i) {
                    case 0:
                        transferImage.setImageDrawable(eVar.mo79826b(C39176b.this.f100013b));
                        break;
                    case 1:
                        cVar.mo79815b(i2);
                        transferImage.mo79926a(202);
                        transferImage.mo79881a();
                        C39176b.this.f100012a.mo79851a((ImageView) transferImage, i2);
                        return;
                }
            }
        };
        bVar.mo79795a(str, a, drawable, transConfig, r2);
    }

    /* renamed from: c */
    public final TransferImage mo79824c(int i) {
        C39181e transConfig = this.f100012a.getTransConfig();
        List b = transConfig.mo79827b();
        if (b.size() <= i || b.get(i) == null) {
            return null;
        }
        TransferImage a = mo79871a((ImageView) b.get(i));
        a.setImageDrawable(this.f100012a.getTransAdapter().mo79816a(transConfig.f99935a).getDrawable());
        a.f100093F = 200;
        a.f100092E = 2;
        a.f100094G = 201;
        a.f100099L = true;
        a.f100100M.setAlpha(NormalGiftView.ALPHA_255);
        a.invalidate();
        this.f100012a.addView(a, 1);
        return a;
    }

    /* renamed from: a */
    public final void mo79822a(TransferImage transferImage, int i) {
        transferImage.setImageDrawable(m87040b(transferImage, i));
    }

    /* renamed from: b */
    private Drawable m87040b(TransferImage transferImage, int i) {
        C39181e transConfig = this.f100012a.getTransConfig();
        Drawable e = m87041e(i);
        int[] iArr = new int[2];
        ImageView imageView = (ImageView) transConfig.mo79827b().get(i);
        if (imageView != null) {
            iArr[0] = imageView.getWidth();
            iArr[1] = imageView.getHeight();
        }
        m87039a(transferImage, e, iArr);
        return e;
    }

    /* renamed from: a */
    private void m87039a(TransferImage transferImage, Drawable drawable, int[] iArr) {
        DisplayMetrics displayMetrics = this.f100013b.getResources().getDisplayMetrics();
        TransferImage transferImage2 = transferImage;
        Drawable drawable2 = drawable;
        transferImage2.mo79928a(drawable2, iArr[0], iArr[1], displayMetrics.widthPixels, mo79873d(displayMetrics.heightPixels));
        transferImage.mo79929e();
    }
}
