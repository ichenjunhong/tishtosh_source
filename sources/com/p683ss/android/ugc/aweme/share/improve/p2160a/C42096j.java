package com.p683ss.android.ugc.aweme.share.improve.p2160a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.familiar.service.C29650b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30338g;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30473ab;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer.C31040b.C31041a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23243m;
import com.p683ss.android.ugc.aweme.share.p2152d.p2153a.C42002a;
import com.p683ss.android.ugc.aweme.share.p2152d.p2153a.C42004b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g.C42358a;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.j */
public final class C42096j implements C30473ab, C42357g {

    /* renamed from: a */
    public static final C42097a f106530a = new C42097a(null);

    /* renamed from: b */
    private final Aweme f106531b;

    /* renamed from: c */
    private final String f106532c;

    /* renamed from: d */
    private final String f106533d;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.j$a */
    public static final class C42097a {
        private C42097a() {
        }

        public /* synthetic */ C42097a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: b */
    public final int mo49953b() {
        return R.string.che;
    }

    /* renamed from: c */
    public final String mo49954c() {
        return "dislike";
    }

    /* renamed from: d */
    public final boolean mo49955d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo49956e() {
        return false;
    }

    /* renamed from: f */
    public final boolean mo49957f() {
        return true;
    }

    /* renamed from: g */
    public final int mo49958g() {
        return R.drawable.dxf;
    }

    /* renamed from: a */
    public final int mo49948a() {
        if (C31041a.m72639a()) {
            return R.drawable.an6;
        }
        return R.drawable.an5;
    }

    /* renamed from: a */
    public final void mo49949a(Context context) {
        C52711k.m112240b(context, "context");
        C42358a.m93001a((C42357g) this, context);
    }

    /* renamed from: a */
    public final void mo49951a(ImageView imageView) {
        C52711k.m112240b(imageView, "iconView");
        C42358a.m93002a((C42357g) this, imageView);
    }

    /* renamed from: a */
    public final void mo49952a(TextView textView) {
        C52711k.m112240b(textView, "textView");
        C42358a.m93003a((C42357g) this, textView);
    }

    /* renamed from: a */
    public final void mo60891a(String str) {
        Context context;
        if (C11016e.m22312g() != null) {
            context = C11016e.m22312g();
        } else {
            context = C11010c.m22280a();
        }
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf hasLongPressDislike = inst.getHasLongPressDislike();
        C52711k.m112236a((Object) hasLongPressDislike, "SharePrefCache.inst().hasLongPressDislike");
        Object d = hasLongPressDislike.mo47782d();
        C52711k.m112236a(d, "SharePrefCache.inst().hasLongPressDislike.cache");
        if (((Boolean) d).booleanValue() || C23794bh.m58390d().mo47103a()) {
            C10691a.m21533a(context, (int) R.string.ar_).mo19066a();
        } else {
            C10691a.m21533a(context, (int) R.string.c38).mo19066a();
        }
        C47718bf.m103288a(new C30338g(this.f106531b, this.f106532c));
    }

    public C42096j(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        this(aweme, str, "click_share_button");
    }

    /* renamed from: a */
    public final void mo49950a(Context context, SharePackage sharePackage) {
        int i;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C23243m d = new C23243m().mo48110a(this.f106532c).mo48111b(C23198ae.m56877m(this.f106531b)).mo48112c(C23198ae.m56846a(this.f106531b)).mo48113d(this.f106533d);
        d.f62052a = C23198ae.m56879o(this.f106531b);
        C23243m e = d.mo48114e(C23198ae.m56857c(this.f106531b));
        e.f62053b = C22858c.f61208d;
        e.mo48076e();
        if (TextUtils.equals(this.f106532c, "homepage_hot")) {
            C29650b bVar = C29650b.f77509a;
            Aweme aweme = this.f106531b;
            String str = this.f106532c;
            String str2 = "delete";
            String str3 = this.f106533d;
            Integer num = (Integer) C29650b.f77509a.getFeedOrderMap().get(this.f106531b.getAid());
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            bVar.mobRecommendFamiliarVideoAction(aweme, str, str2, str3, i);
        }
        C42004b bVar2 = new C42004b();
        bVar2.mo54799a(new C42002a());
        bVar2.mo54800a(this);
        bVar2.mo44934a_(this.f106531b);
    }

    public C42096j(Aweme aweme, String str, String str2) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        C52711k.m112240b(str2, "enterMethod");
        this.f106531b = aweme;
        this.f106532c = str;
        this.f106533d = str2;
    }
}
