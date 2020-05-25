package com.p683ss.android.ugc.aweme.poi.preview.p2071c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.p683ss.android.ugc.aweme.poi.preview.view.image.TransferImage;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.c.g */
public abstract class C39193g {

    /* renamed from: a */
    protected C39184f f100012a;

    /* renamed from: b */
    protected Context f100013b;

    /* renamed from: a */
    public abstract TransferImage mo79821a(int i);

    /* renamed from: a */
    public abstract void mo79822a(TransferImage transferImage, int i);

    /* renamed from: b */
    public abstract void mo79823b(int i);

    /* renamed from: c */
    public abstract TransferImage mo79824c(int i);

    /* renamed from: a */
    private int m87095a() {
        try {
            Class cls = Class.forName("com.android.internal.R$dimen");
            return this.f100013b.getResources().getDimensionPixelSize(((Integer) cls.getField("status_bar_height").get(cls.newInstance())).intValue());
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo79873d(int i) {
        return i - m87095a();
    }

    C39193g(C39184f fVar) {
        this.f100012a = fVar;
        this.f100013b = fVar.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final TransferImage mo79871a(ImageView imageView) {
        C39181e transConfig = this.f100012a.getTransConfig();
        int[] iArr = {0, 0};
        if (!transConfig.f99960z) {
            if (transConfig.mo79829d()) {
                iArr = new int[2];
                transConfig.f99955u.getLocationInWindow(iArr);
            } else if (imageView != null) {
                iArr = new int[2];
                imageView.getLocationInWindow(iArr);
            }
        }
        TransferImage transferImage = new TransferImage(this.f100013b);
        transferImage.setScaleType(ScaleType.FIT_CENTER);
        if (!transConfig.f99960z) {
            if (transConfig.mo79829d()) {
                transferImage.mo79927a(iArr[0], mo79873d(iArr[1]), transConfig.f99955u.getWidth(), transConfig.f99955u.getHeight());
            } else if (imageView != null) {
                transferImage.mo79927a(iArr[0], mo79873d(iArr[1]), imageView.getWidth(), imageView.getHeight());
            }
            transferImage.setDuration(transConfig.f99940f);
            transferImage.setLayoutParams(new LayoutParams(-1, -1));
            transferImage.setOnTransferListener(this.f100012a.getTransListener());
            return transferImage;
        }
        transferImage.mo79927a(iArr[0], mo79873d(iArr[1]), 0, 0);
        transferImage.setDuration(transConfig.f99940f);
        transferImage.setLayoutParams(new LayoutParams(-1, -1));
        transferImage.setOnTransferListener(this.f100012a.getTransListener());
        return transferImage;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo79872a(String str, TransferImage transferImage, boolean z) {
        C39181e transConfig = this.f100012a.getTransConfig();
        if (this instanceof C39179d) {
            transferImage.setImageDrawable(transConfig.mo79825a(this.f100013b));
            if (z) {
                transferImage.mo79930f();
            } else {
                transferImage.mo79931g();
            }
        } else {
            C39181e transConfig2 = this.f100012a.getTransConfig();
            Drawable a = transConfig2.f99951q.mo79794a(str, transConfig2);
            if (a == null) {
                transferImage.setImageDrawable(transConfig2.mo79825a(this.f100013b));
            } else {
                transferImage.setImageDrawable(a);
            }
            if (z) {
                transferImage.mo79930f();
            } else {
                transferImage.mo79931g();
            }
        }
    }
}
