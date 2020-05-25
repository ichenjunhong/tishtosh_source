package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.support.p030v4.content.C0726c;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.b */
public abstract class C23649b extends C23668l {

    /* renamed from: c */
    public final RemoteImageView f63057c;

    /* renamed from: d */
    public final DmtTextView f63058d;

    /* renamed from: e */
    public final AvatarImageView f63059e;

    /* renamed from: f */
    public final AvatarImageView f63060f;

    /* renamed from: g */
    public final ImageView f63061g;

    /* renamed from: h */
    public final DmtTextView f63062h;

    /* renamed from: i */
    public final DmtTextView f63063i;

    /* renamed from: j */
    public final ViewGroup f63064j;

    /* renamed from: k */
    public final DmtTextView f63065k;

    /* renamed from: l */
    public final View f63066l;

    /* renamed from: m */
    public final ViewGroup f63067m;

    /* renamed from: n */
    public final ImageView f63068n;

    /* renamed from: o */
    public final View f63069o;

    /* renamed from: p */
    public final DmtTextView f63070p;

    /* renamed from: q */
    public Aweme f63071q;

    /* renamed from: r */
    public JSONObject f63072r;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.b$a */
    static final class C23650a<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C23649b f63073a;

        C23650a(C23649b bVar) {
            this.f63073a = bVar;
        }

        public final /* synthetic */ Object call() {
            this.f63073a.mo49077b();
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.b$b */
    static final class C23651b<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ C23649b f63074a;

        C23651b(C23649b bVar) {
            this.f63074a = bVar;
        }

        public final /* synthetic */ Object call() {
            this.f63074a.mo49074a();
            return null;
        }
    }

    /* renamed from: a */
    public abstract void mo49074a();

    /* renamed from: b */
    public abstract void mo49077b();

    /* renamed from: c */
    public final boolean mo49081c() {
        return false;
    }

    /* renamed from: e */
    public int mo49083e() {
        return R.drawable.crv;
    }

    /* renamed from: d */
    public final void mo49082d() {
        C0013i.m18a((Callable<TResult>) new C23651b<TResult>(this), (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public void mo49075a(View view) {
        C0013i.m18a((Callable<TResult>) new C23650a<TResult>(this), (Executor) C26890h.m65003a());
    }

    public C23649b(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
        View findViewById = viewGroup.findViewById(R.id.b27);
        C52711k.m112236a((Object) findViewById, "parent.findViewById(R.id.iv_location_special)");
        this.f63057c = (RemoteImageView) findViewById;
        View findViewById2 = viewGroup.findViewById(R.id.bi8);
        C52711k.m112236a((Object) findViewById2, "parent.findViewById(R.id.location_2)");
        this.f63058d = (DmtTextView) findViewById2;
        View findViewById3 = viewGroup.findViewById(R.id.eex);
        C52711k.m112236a((Object) findViewById3, "parent.findViewById(R.id.iv_head_1)");
        this.f63059e = (AvatarImageView) findViewById3;
        View findViewById4 = viewGroup.findViewById(R.id.eey);
        C52711k.m112236a((Object) findViewById4, "parent.findViewById(R.id.iv_head_2)");
        this.f63060f = (AvatarImageView) findViewById4;
        View findViewById5 = viewGroup.findViewById(R.id.a6n);
        C52711k.m112236a((Object) findViewById5, "parent.findViewById(R.id.divider_top)");
        this.f63061g = (ImageView) findViewById5;
        View findViewById6 = viewGroup.findViewById(R.id.f5s);
        C52711k.m112236a((Object) findViewById6, "parent.findViewById(R.id.type_name)");
        this.f63062h = (DmtTextView) findViewById6;
        View findViewById7 = viewGroup.findViewById(R.id.th);
        C52711k.m112236a((Object) findViewById7, "parent.findViewById(R.id.city_name_or_distance_2)");
        this.f63063i = (DmtTextView) findViewById7;
        View findViewById8 = viewGroup.findViewById(R.id.c10);
        C52711k.m112236a((Object) findViewById8, "parent.findViewById(R.id.poi_info_container)");
        this.f63064j = (ViewGroup) findViewById8;
        View findViewById9 = viewGroup.findViewById(R.id.co1);
        C52711k.m112236a((Object) findViewById9, "parent.findViewById(R.id.shop_title)");
        this.f63065k = (DmtTextView) findViewById9;
        View findViewById10 = viewGroup.findViewById(R.id.co0);
        C52711k.m112236a((Object) findViewById10, "parent.findViewById(R.id.shop_tag_divider)");
        this.f63066l = findViewById10;
        View findViewById11 = viewGroup.findViewById(R.id.e39);
        C52711k.m112236a((Object) findViewById11, "parent.findViewById(R.id.commerce_info)");
        this.f63067m = (ViewGroup) findViewById11;
        View findViewById12 = viewGroup.findViewById(R.id.b3p);
        C52711k.m112236a((Object) findViewById12, "parent.findViewById(R.id.iv_right_arrow)");
        this.f63068n = (ImageView) findViewById12;
        View findViewById13 = viewGroup.findViewById(R.id.by7);
        C52711k.m112236a((Object) findViewById13, "parent.findViewById(R.id.place_holder_view)");
        this.f63069o = findViewById13;
        View findViewById14 = viewGroup.findViewById(R.id.d_a);
        C52711k.m112236a((Object) findViewById14, "parent.findViewById(R.id.tv_festival_name)");
        this.f63070p = (DmtTextView) findViewById14;
    }

    /* renamed from: a */
    public void mo49076a(Aweme aweme, JSONObject jSONObject) {
        super.mo49076a(aweme, jSONObject);
        this.f63071q = aweme;
        this.f63072r = jSONObject;
        this.f63057c.setVisibility(0);
        this.f63058d.setVisibility(0);
        this.f63059e.setVisibility(8);
        this.f63060f.setVisibility(8);
        this.f63061g.setVisibility(8);
        this.f63062h.setVisibility(8);
        this.f63063i.setVisibility(8);
        this.f63064j.setVisibility(8);
        this.f63070p.setVisibility(8);
        this.f63067m.setVisibility(8);
        this.f63066l.setVisibility(8);
        this.f63065k.setVisibility(8);
        this.f63068n.setVisibility(8);
        this.f63069o.setVisibility(8);
        this.f63057c.setScaleType(ScaleType.CENTER_CROP);
        this.f63058d.setFontType(C10751d.f28902a);
        this.f63058d.setTextColor(C0726c.m2098c(C11010c.m22280a(), R.color.aul));
        LayoutParams layoutParams = this.f63068n.getLayoutParams();
        if (!(layoutParams instanceof MarginLayoutParams)) {
            layoutParams = null;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart((int) C9432q.m18687b(C11010c.m22280a(), 3.0f));
        }
        this.f63068n.setLayoutParams(marginLayoutParams);
        this.f63068n.setImageDrawable(C0726c.m2091a(C11010c.m22280a(), (int) R.drawable.dfr));
    }
}
