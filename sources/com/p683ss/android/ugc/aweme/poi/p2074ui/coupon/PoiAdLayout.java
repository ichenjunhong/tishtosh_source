package com.p683ss.android.ugc.aweme.poi.p2074ui.coupon;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.model.C39085a;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39051a.C39052a;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39053b;
import com.p683ss.android.ugc.aweme.poi.utils.C39443d;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.PoiAdLayout */
public class PoiAdLayout extends RelativeLayout {

    /* renamed from: a */
    private RelativeLayout f100457a;

    /* renamed from: b */
    private CircleImageView f100458b;

    /* renamed from: c */
    private TextView f100459c;

    /* renamed from: d */
    private TextView f100460d;

    /* renamed from: e */
    private TextView f100461e;

    /* renamed from: f */
    private TextView f100462f;

    /* renamed from: g */
    private TextView f100463g;

    /* renamed from: h */
    private TextView f100464h;

    /* renamed from: i */
    private TextView f100465i;

    /* renamed from: j */
    private boolean f100466j;

    public PoiAdLayout(Context context) {
        this(context, null);
    }

    public PoiAdLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m87370a(AwemeRawAd awemeRawAd, String str) {
        if (!this.f100466j) {
            this.f100466j = true;
            C39443d.m87703a(getContext(), awemeRawAd, str);
        }
    }

    public PoiAdLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.bnw, this);
        this.f100457a = (RelativeLayout) findViewById(R.id.byj);
        this.f100458b = (CircleImageView) findViewById(R.id.byi);
        this.f100459c = (TextView) findViewById(R.id.bys);
        this.f100460d = (TextView) findViewById(R.id.byu);
        this.f100461e = (TextView) findViewById(R.id.bym);
        this.f100462f = (TextView) findViewById(R.id.byr);
        this.f100463g = (TextView) findViewById(R.id.byp);
        this.f100464h = (TextView) findViewById(R.id.byo);
        this.f100465i = (TextView) findViewById(R.id.byk);
    }

    /* renamed from: a */
    public final void mo80121a(C39085a aVar, String str, C39067g gVar) {
        if (aVar != null) {
            AwemeRawAd awemeAd = aVar.getAwemeAd();
            if (awemeAd != null) {
                C39053b.m86892c(new C39052a().mo79210b(gVar.getPoiId()).mo79208a("poi_page").mo79213e(gVar.getPreviousPage()).mo79217i(str).mo79206a(gVar).mo79214f("click_button").mo79209a());
                this.f100457a.setVisibility(0);
                C23515d.m57669a((RemoteImageView) this.f100458b, awemeAd.getAvatarIcon());
                this.f100459c.setText(awemeAd.getSource());
                this.f100460d.setText(awemeAd.getTitle());
                this.f100465i.setText(awemeAd.getButtonText());
                if (TextUtils.isEmpty(awemeAd.getFeatureLabel())) {
                    this.f100461e.setVisibility(8);
                } else {
                    this.f100461e.setVisibility(0);
                    this.f100461e.setText(awemeAd.getFeatureLabel());
                }
                String price = awemeAd.getPrice();
                if (TextUtils.isEmpty(price)) {
                    this.f100462f.setVisibility(8);
                    this.f100463g.setVisibility(8);
                    this.f100464h.setVisibility(8);
                } else {
                    this.f100462f.setText(price);
                    if (TextUtils.isEmpty(awemeAd.getOriginPrice())) {
                        this.f100463g.setVisibility(8);
                    } else {
                        this.f100464h.setText(awemeAd.getOriginPrice());
                        this.f100464h.getPaint().setFlags(16);
                    }
                }
                this.f100457a.setOnClickListener(new C39313f(this, gVar, str, awemeAd));
                if (TextUtils.isEmpty(gVar.getAwemeId())) {
                    m87370a(awemeAd, gVar.getPoiId());
                }
            }
        }
    }
}
