package com.p683ss.android.ugc.aweme.qrcode.p2107v2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.qrcode.C40952c;
import com.p683ss.android.ugc.aweme.qrcode.p2104b.C40939a;
import com.p683ss.android.ugc.aweme.qrcode.view.QRCodeCardView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.QRCodeCardViewV2 */
public class QRCodeCardViewV2 extends QRCodeCardView {

    /* renamed from: h */
    private Context f104279h;

    /* renamed from: i */
    private DmtTextView f104280i;

    /* renamed from: j */
    private DmtTextView f104281j;

    /* renamed from: k */
    private DmtTextView f104282k;

    /* renamed from: l */
    private View f104283l;

    /* renamed from: m */
    private ImageView f104284m;

    /* renamed from: n */
    private ImageView f104285n;

    /* renamed from: o */
    private C40939a f104286o;

    public C40939a getQrCodeInfo() {
        return this.f104286o;
    }

    public void setData(String str) {
    }

    public void setQRCodeCardSubtitleColor(int i) {
    }

    public void setQRCodeCardTitleColor(int i) {
    }

    public QRCodeCardViewV2(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void mo83462a(C40939a aVar) {
        this.f104286o = aVar;
        mo83557b(aVar);
    }

    /* renamed from: a */
    public void mo83463a(Exception exc) {
        C22971a.m56493a(this.f104279h, (Throwable) exc);
        mo83558c();
    }

    /* renamed from: a */
    public final void mo83510a(Context context) {
        super.mo83510a(context);
        this.f104279h = context;
        LayoutInflater.from(context).inflate(R.layout.ave, this, true);
        this.f104283l = findViewById(R.id.c7i);
        this.f104285n = (ImageView) findViewById(R.id.qw);
        this.f104361b = (RemoteImageView) findViewById(R.id.c7h);
        this.f104280i = (DmtTextView) findViewById(R.id.title);
        this.f104281j = (DmtTextView) findViewById(R.id.a4e);
        this.f104282k = (DmtTextView) findViewById(R.id.c6n);
        this.f104284m = (ImageView) findViewById(R.id.bjd);
    }

    public void setData(C40952c cVar) {
        String str;
        super.setData(cVar);
        this.f104360a.mo83468a(cVar.type, cVar.objectId);
        this.f104280i.setText(C41030b.m90690a(this.f104279h, cVar));
        this.f104281j.setText(C41030b.m90691b(this.f104279h, cVar));
        DmtTextView dmtTextView = this.f104282k;
        Context context = this.f104279h;
        int i = cVar.type;
        if (i == 11) {
            str = "";
        } else if (i != 17) {
            if (i != 23) {
                switch (i) {
                    case 1:
                        str = context.getString(R.string.d32);
                        break;
                    case 2:
                        break;
                    case 3:
                        str = context.getString(R.string.d2m);
                        break;
                    case 4:
                        if (!cVar.isEnterpriseUser) {
                            str = context.getString(R.string.d2y);
                            break;
                        } else {
                            str = context.getString(R.string.d2g, new Object[]{cVar.title});
                            break;
                        }
                    case 5:
                        str = "";
                        break;
                    default:
                        switch (i) {
                            case 7:
                                str = context.getString(R.string.d2q);
                                break;
                            case 8:
                                str = "";
                                break;
                            case 9:
                                str = "";
                                break;
                            default:
                                str = "";
                                break;
                        }
                }
            }
            str = context.getString(R.string.d2c);
        } else {
            str = context.getString(R.string.d2t);
        }
        dmtTextView.setText(str);
        this.f104285n.setImageResource(C41030b.m90689a(cVar));
    }

    public QRCodeCardViewV2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public QRCodeCardViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo83510a(context);
    }
}
