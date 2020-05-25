package com.p683ss.android.ugc.aweme.poi.p2074ui.coupon;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.coupon.C25668a;
import com.p683ss.android.ugc.aweme.commercialize.coupon.model.C25687b;
import com.p683ss.android.ugc.aweme.feed.C30228f;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39051a.C39052a;
import com.p683ss.android.ugc.aweme.poi.p2060c.C39053b;
import com.p683ss.android.ugc.aweme.poi.utils.C39454n;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.coupon.PoiCouponLayout */
public class PoiCouponLayout extends RelativeLayout implements C23505g {

    /* renamed from: a */
    public TextView f100467a;

    /* renamed from: b */
    C39312e f100468b;

    /* renamed from: c */
    private RelativeLayout f100469c;

    /* renamed from: d */
    private RemoteImageView f100470d;

    /* renamed from: e */
    private TextView f100471e;

    /* renamed from: f */
    private TextView f100472f;

    /* renamed from: g */
    private ImageView f100473g;

    /* renamed from: h */
    private ImageView f100474h;

    /* renamed from: i */
    private C25687b f100475i;

    /* renamed from: j */
    private C39067g f100476j;

    /* renamed from: a */
    public final void mo46279a() {
        mo80124b();
    }

    /* renamed from: a */
    public final void mo46280a(Bundle bundle) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo80124b() {
        if (this.f100468b != null) {
            this.f100468b.mo80022a(this.f100476j.getPoiId(), this.f100475i.getActivityId());
        }
        mo80122a(this.f100475i);
    }

    public PoiCouponLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo80122a(C25687b bVar) {
        Aweme rawAdAwemeById = C23324d.m57378a().getRawAdAwemeById(this.f100476j.getAwemeId());
        Context context = getContext();
        String poiId = this.f100476j.getPoiId();
        C39454n nVar = C39454n.f100872a;
        C39454n.m87738a().logPoiAdCouponClick(context, rawAdAwemeById, poiId);
        C39053b.m86893d(new C39052a().mo79210b(this.f100476j.getPoiId()).mo79208a("poi_page").mo79213e(this.f100476j.getPreviousPage()).mo79215g(String.valueOf(bVar.getCouponId())).mo79214f("click_button").mo79216h(C25668a.m62225a(getContext(), bVar.getStatus(), true)).mo79218j(C25668a.m62226a(bVar)).mo79206a(this.f100476j).mo79209a());
    }

    public PoiCouponLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PoiCouponLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.bnx, this);
        this.f100469c = (RelativeLayout) findViewById(R.id.bzb);
        this.f100470d = (RemoteImageView) findViewById(R.id.bzc);
        this.f100471e = (TextView) findViewById(R.id.a1r);
        this.f100472f = (TextView) findViewById(R.id.bzf);
        this.f100467a = (TextView) findViewById(R.id.bze);
        this.f100473g = (ImageView) findViewById(R.id.asa);
        this.f100474h = (ImageView) findViewById(R.id.asb);
    }

    /* renamed from: a */
    public final void mo80123a(C25687b bVar, C39312e eVar, List<String> list, C39067g gVar) {
        if (bVar != null) {
            C30228f.m70982f();
        }
    }
}
