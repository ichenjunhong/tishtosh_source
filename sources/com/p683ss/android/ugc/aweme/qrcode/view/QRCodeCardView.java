package com.p683ss.android.ugc.aweme.qrcode.view;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.p929d.C13745c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.C23515d.C23520a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.qrcode.C40952c;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40939a;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40940b;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40968b;
import com.p683ss.android.ugc.aweme.qrcode.p2105c.C40973e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.QRCodeCardView */
public abstract class QRCodeCardView extends LinearLayout implements C40968b {

    /* renamed from: a */
    protected C40973e f104360a;

    /* renamed from: b */
    protected RemoteImageView f104361b;

    /* renamed from: c */
    protected C41046a f104362c;

    /* renamed from: d */
    protected C40952c f104363d;

    /* renamed from: e */
    protected boolean f104364e;

    /* renamed from: f */
    public boolean f104365f;

    /* renamed from: g */
    protected C13790c<C14045f> f104366g;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.view.QRCodeCardView$a */
    public interface C41046a {
        /* renamed from: a */
        void mo83507a();

        /* renamed from: b */
        void mo83508b();

        /* renamed from: c */
        void mo83509c();
    }

    public abstract void setData(String str);

    public abstract void setQRCodeCardSubtitleColor(int i);

    public abstract void setQRCodeCardTitleColor(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C40940b mo83553a() {
        return new C40940b();
    }

    public View getQRCodeCardBottom() {
        return findViewById(R.id.c7l);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo83558c() {
        if (this.f104362c != null) {
            this.f104362c.mo83508b();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f104360a.mo77195c();
        this.f104362c = null;
    }

    public void setOnBindQrCodeListener(C41046a aVar) {
        this.f104362c = aVar;
    }

    public void setData(C40952c cVar) {
        this.f104363d = cVar;
        setData(cVar.objectId);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo83510a(Context context) {
        this.f104360a = new C40973e(mo83553a(), this);
        this.f104366g = new C13790c<C14045f>() {
            public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                C14045f fVar = (C14045f) obj;
                QRCodeCardView.this.f104365f = true;
            }
        };
    }

    /* renamed from: a */
    public static String m90699a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return "";
        }
        return (String) urlModel.getUrlList().get(0);
    }

    /* renamed from: b */
    public final void mo83557b(final C40939a aVar) {
        if (aVar != null) {
            String a = m90699a(aVar.f104163a);
            if (C23515d.m57680a(Uri.parse(a))) {
                this.f104361b.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25725b(Uri.parse(a)).mo25759b(this.f104361b.getController())).mo25751a((C13791d<? super INFO>) this.f104366g)).mo25763d());
                if (!this.f104360a.mo83470a()) {
                    this.f104360a.mo83469a(a);
                }
                if (this.f104362c != null) {
                    this.f104362c.mo83507a();
                }
            } else {
                C23515d.m57667a(aVar.f104163a, (C23520a) new C23520a() {
                    /* renamed from: a */
                    public final void mo48680a(Exception exc) {
                        QRCodeCardView.this.mo83558c();
                    }

                    /* renamed from: a */
                    public final void mo48679a(C13745c<C13715a<C14042c>> cVar) {
                        QRCodeCardView.this.f104361b.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25725b(Uri.parse(QRCodeCardView.m90699a(aVar.f104163a))).mo25759b(QRCodeCardView.this.f104361b.getController())).mo25751a((C13791d<? super INFO>) QRCodeCardView.this.f104366g)).mo25763d());
                        if (QRCodeCardView.this.f104362c != null) {
                            QRCodeCardView.this.f104362c.mo83507a();
                        }
                        QRCodeCardView.this.f104360a.mo83469a(QRCodeCardView.m90699a(aVar.f104163a));
                    }
                });
            }
        }
    }

    public QRCodeCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
