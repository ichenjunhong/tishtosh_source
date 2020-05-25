package com.p683ss.android.ugc.aweme.poi.preview.p2071c;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.p683ss.android.ugc.aweme.poi.preview.p2067a.C39157b;
import com.p683ss.android.ugc.aweme.poi.preview.p2067a.C39157b.C39158a;
import com.p683ss.android.ugc.aweme.poi.preview.p2068b.C39170c;
import com.p683ss.android.ugc.aweme.poi.preview.p2071c.p2072a.C39174c;
import com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.c.d */
final class C39179d extends C39193g {
    C39179d(C39184f fVar) {
        super(fVar);
    }

    /* renamed from: b */
    public final void mo79823b(int i) {
        C39174c transAdapter = this.f100012a.getTransAdapter();
        C39181e transConfig = this.f100012a.getTransConfig();
        TransferImage a = this.f100012a.getTransAdapter().mo79816a(i);
        C39170c cVar = transConfig.f99949o;
        cVar.mo79814a(i, transAdapter.mo79819b(i));
        if (transConfig.f99941g) {
            m87050a(a.getDrawable(), i, a, cVar);
            return;
        }
        transConfig.f99947m.get(i);
        m87050a(transConfig.mo79825a(this.f100013b), i, a, cVar);
    }

    /* renamed from: c */
    public final TransferImage mo79824c(int i) {
        C39181e transConfig = this.f100012a.getTransConfig();
        List b = transConfig.mo79827b();
        if (b.size() <= i || b.get(i) == null) {
            return null;
        }
        TransferImage a = mo79871a((ImageView) b.get(i));
        mo79872a((String) transConfig.f99947m.get(i), a, false);
        this.f100012a.addView(a, 1);
        return a;
    }

    /* renamed from: a */
    public final TransferImage mo79821a(int i) {
        C39181e transConfig = this.f100012a.getTransConfig();
        TransferImage a = mo79871a((ImageView) transConfig.mo79827b().get(i));
        mo79872a((String) transConfig.f99947m.get(i), a, true);
        this.f100012a.addView(a, 1);
        return a;
    }

    /* renamed from: a */
    public final void mo79822a(TransferImage transferImage, int i) {
        C39181e transConfig = this.f100012a.getTransConfig();
        transConfig.f99947m.get(i);
        transferImage.setImageDrawable(transConfig.mo79825a(this.f100013b));
    }

    /* renamed from: a */
    private void m87050a(Drawable drawable, int i, TransferImage transferImage, C39170c cVar) {
        C39181e transConfig = this.f100012a.getTransConfig();
        C39157b bVar = transConfig.f99951q;
        String str = (String) transConfig.f99946l.get(i);
        final C39170c cVar2 = cVar;
        final int i2 = i;
        final TransferImage transferImage2 = transferImage;
        final C39181e eVar = transConfig;
        C391801 r1 = new C39158a() {
            /* renamed from: a */
            public final void mo79796a() {
                cVar2.mo79813a(i2);
            }

            /* renamed from: a */
            public final void mo79797a(int i) {
                switch (i) {
                    case 0:
                        transferImage2.setImageDrawable(eVar.mo79826b(C39179d.this.f100013b));
                        break;
                    case 1:
                        cVar2.mo79815b(i2);
                        transferImage2.mo79881a();
                        C39179d.this.f100012a.mo79851a((ImageView) transferImage2, i2);
                        return;
                }
            }
        };
        bVar.mo79795a(str, transferImage, drawable, transConfig, r1);
    }
}
