package com.p683ss.android.ugc.aweme.qrcode.p2107v2;

import android.content.Context;
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

/* renamed from: com.ss.android.ugc.aweme.qrcode.v2.a */
public final class C41029a extends QRCodeCardView {

    /* renamed from: h */
    private Context f104338h;

    /* renamed from: i */
    private DmtTextView f104339i;

    /* renamed from: j */
    private DmtTextView f104340j;

    /* renamed from: k */
    private DmtTextView f104341k;

    /* renamed from: l */
    private View f104342l;

    /* renamed from: m */
    private ImageView f104343m;

    /* renamed from: n */
    private ImageView f104344n;

    public final void setData(String str) {
    }

    public final void setQRCodeCardSubtitleColor(int i) {
    }

    public final void setQRCodeCardTitleColor(int i) {
    }

    /* renamed from: a */
    public final void mo83462a(C40939a aVar) {
        mo83557b(aVar);
    }

    /* renamed from: a */
    public final void mo83463a(Exception exc) {
        C22971a.m56493a(this.f104338h, (Throwable) exc);
        mo83558c();
    }

    public final void setData(C40952c cVar) {
        super.setData(cVar);
        this.f104360a.mo83468a(cVar.type, cVar.objectId);
        this.f104339i.setText(C41030b.m90690a(this.f104338h, cVar));
        this.f104340j.setText(C41030b.m90691b(this.f104338h, cVar));
        this.f104341k.setText(C41030b.m90692c(this.f104338h, cVar));
        this.f104344n.setImageResource(C41030b.m90689a(cVar));
    }

    public final void setParams(C40952c cVar) {
        this.f104363d = cVar;
        this.f104339i.setText(C41030b.m90690a(this.f104338h, cVar));
        this.f104340j.setText(C41030b.m90691b(this.f104338h, cVar));
        this.f104341k.setText(C41030b.m90692c(this.f104338h, cVar));
        this.f104344n.setImageResource(C41030b.m90689a(cVar));
    }

    /* renamed from: a */
    public final void mo83510a(Context context) {
        super.mo83510a(context);
        this.f104338h = context;
        LayoutInflater.from(context).inflate(R.layout.avf, this, true);
        this.f104342l = findViewById(R.id.c7i);
        this.f104344n = (ImageView) findViewById(R.id.qw);
        this.f104361b = (RemoteImageView) findViewById(R.id.c7h);
        this.f104339i = (DmtTextView) findViewById(R.id.title);
        this.f104340j = (DmtTextView) findViewById(R.id.a4e);
        this.f104341k = (DmtTextView) findViewById(R.id.c6n);
        this.f104343m = (ImageView) findViewById(R.id.bjd);
    }
}
