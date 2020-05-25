package com.p683ss.android.ugc.aweme.base.p1420ui.anchor;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.C17971f;
import com.google.gson.C18091u;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import com.p683ss.android.ugc.aweme.utils.GsonProvider;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONObject;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.f */
public final class C23661f extends C23649b {

    /* renamed from: a */
    public static final C23662a f63087a = new C23662a(null);

    /* renamed from: b */
    private List<AnchorCommonStruct> f63088b;

    /* renamed from: s */
    private JSONObject f63089s;

    /* renamed from: u */
    private final Activity f63090u;

    /* renamed from: v */
    private final String f63091v;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.anchor.f$a */
    public static final class C23662a {
        private C23662a() {
        }

        public /* synthetic */ C23662a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static List<AnchorCommonStruct> m58047a(Aweme aweme) {
            boolean z;
            if (aweme != null) {
                List anchors = aweme.getAnchors();
                if (anchors != null) {
                    Iterable iterable = anchors;
                    Collection arrayList = new ArrayList();
                    for (Object next : iterable) {
                        if (((AnchorCommonStruct) next).getType() == C25600a.DONATION_STICKER.getTYPE()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                    return (List) arrayList;
                }
            }
            return null;
        }
    }

    /* renamed from: e */
    public final int mo49083e() {
        return R.drawable.cmr;
    }

    /* renamed from: a */
    public final void mo49074a() {
        C26890h.m65012a("anchor_entrance_show", m58040f());
    }

    /* renamed from: b */
    public final void mo49077b() {
        C26890h.m65012a("anchor_entrance_click", m58040f());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r0 == null) goto L_0x000c;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String m58041g() {
        /*
            r2 = this;
            org.json.JSONObject r0 = r2.f63089s
            if (r0 == 0) goto L_0x000c
            java.lang.String r1 = "request_id"
            java.lang.String r0 = r0.optString(r1)
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r0 = ""
        L_0x000e:
            com.ss.android.ugc.aweme.feed.model.LogPbBean r1 = new com.ss.android.ugc.aweme.feed.model.LogPbBean
            r1.<init>()
            r1.setImprId(r0)
            com.ss.android.ugc.aweme.feed.aa r0 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            java.lang.String r0 = r0.mo60160a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.base.p1420ui.anchor.C23661f.m58041g():java.lang.String");
    }

    /* renamed from: f */
    private final JSONObject m58040f() {
        String str;
        String e = C23198ae.m56861e(this.f63071q);
        String m = C23198ae.m56877m(this.f63071q);
        C26898j a = new C26898j().mo54849a("log_pb", m58041g());
        String str2 = "author_id";
        Aweme aweme = this.f63071q;
        if (aweme != null) {
            str = aweme.getAuthorUid();
        } else {
            str = null;
        }
        JSONObject a2 = a.mo54849a(str2, str).mo54849a("group_id", m).mo54849a("impr_type", C23198ae.m56883s(this.f63071q)).mo54849a("enter_from", this.f63091v).mo54849a("prop_id", e).mo54849a("anchor_type", "donation_sticker").mo54850a();
        C52711k.m112236a((Object) a2, "MobJsonHelper()\n        …\n                .build()");
        return a2;
    }

    /* renamed from: a */
    private static List<UrlModel> m58039a(String str) {
        List<UrlModel> list;
        if (str == null) {
            return null;
        }
        try {
            GsonProvider a = C47759cc.m103382a();
            C52711k.m112236a((Object) a, "GsonProvider.get()");
            C17971f gson = a.getGson();
            C52711k.m112236a((Object) gson, "GsonProvider.get().gson");
            Object a2 = gson.mo34884a(str, C23663g.class);
            C52711k.m112236a(a2, "this.fromJson(json, T::class.java)");
            list = ((C23663g) a2).getIconUrlList();
        } catch (C18091u e) {
            C32458a.m75148a((Throwable) e);
            list = null;
        }
        return list;
    }

    /* renamed from: a */
    public final void mo49075a(View view) {
        String str;
        super.mo49075a(view);
        if (!C32800a.m75679a(view)) {
            SmartRoute withParam = SmartRouter.buildRoute((Context) this.f63090u, "aweme://donation/pannel").withParam("enter_method", "anchor_click").withParam("enter_from", this.f63091v);
            String str2 = "aweme_id";
            Aweme aweme = this.f63071q;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            withParam.withParam(str2, str).withParam("log_pb", m58041g()).open();
        }
    }

    /* renamed from: a */
    public final void mo49076a(Aweme aweme, JSONObject jSONObject) {
        CharSequence charSequence;
        CharSequence charSequence2;
        String str;
        super.mo49076a(aweme, jSONObject);
        this.f63089s = jSONObject;
        Activity activity = this.f63090u;
        if (activity != null) {
            this.f63059e.setActualImageResource(R.drawable.dcj);
            this.f63060f.setActualImageResource(R.drawable.dcj);
            this.f63057c.setScaleType(ScaleType.CENTER_INSIDE);
            this.f63088b = C23662a.m58047a(aweme);
            List<AnchorCommonStruct> list = this.f63088b;
            if (list != null) {
                Drawable drawable = null;
                if (!(!list.isEmpty())) {
                    list = null;
                }
                if (list != null) {
                    AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) list.get(0);
                    if (anchorCommonStruct != null) {
                        charSequence = anchorCommonStruct.getExtra();
                    } else {
                        charSequence = null;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        this.f63057c.setVisibility(8);
                        this.f63059e.setVisibility(0);
                        this.f63060f.setVisibility(0);
                        AnchorCommonStruct anchorCommonStruct2 = (AnchorCommonStruct) list.get(0);
                        if (anchorCommonStruct2 != null) {
                            str = anchorCommonStruct2.getExtra();
                        } else {
                            str = null;
                        }
                        List a = m58039a(str);
                        if (a != null) {
                            UrlModel urlModel = (UrlModel) C52575l.m112118a(a, 0);
                            if (urlModel != null) {
                                C23515d.m57669a((RemoteImageView) this.f63059e, urlModel);
                            }
                        }
                        if (a != null) {
                            UrlModel urlModel2 = (UrlModel) C52575l.m112118a(a, 1);
                            if (urlModel2 != null) {
                                C23515d.m57669a((RemoteImageView) this.f63060f, urlModel2);
                            }
                        }
                    } else {
                        this.f63057c.setVisibility(0);
                        this.f63059e.setVisibility(8);
                        this.f63060f.setVisibility(8);
                        this.f63057c.setImageResource(R.drawable.d1a);
                    }
                    this.f63058d.setFontType(C10751d.f28908g);
                    DmtTextView dmtTextView = this.f63058d;
                    AnchorCommonStruct anchorCommonStruct3 = (AnchorCommonStruct) list.get(0);
                    if (anchorCommonStruct3 != null) {
                        charSequence2 = anchorCommonStruct3.getKeyword();
                    } else {
                        charSequence2 = null;
                    }
                    dmtTextView.setText(charSequence2);
                    Context context = activity;
                    this.f63058d.setTextColor(C0726c.m2098c(context, R.color.avn));
                    this.f63068n.setVisibility(0);
                    LayoutParams layoutParams = this.f63068n.getLayoutParams();
                    if (!(layoutParams instanceof LinearLayout.LayoutParams)) {
                        layoutParams = null;
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    if (layoutParams2 != null) {
                        layoutParams2.setMarginStart(0);
                    }
                    this.f63068n.setLayoutParams(layoutParams2);
                    this.f63068n.setImageDrawable(C0726c.m2091a(context, (int) R.drawable.d1_));
                    ImageView imageView = this.f63068n;
                    if (VERSION.SDK_INT >= 19) {
                        Drawable drawable2 = imageView.getDrawable();
                        Drawable background = imageView.getBackground();
                        if (VERSION.SDK_INT >= 23) {
                            drawable = imageView.getForeground();
                        }
                        if (drawable2 != null) {
                            drawable2.setAutoMirrored(true);
                        }
                        if (background != null) {
                            background.setAutoMirrored(true);
                        }
                        if (drawable != null) {
                            drawable.setAutoMirrored(true);
                        }
                    }
                }
            }
        }
    }

    public C23661f(ViewGroup viewGroup, Activity activity, String str) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
        this.f63090u = activity;
        this.f63091v = str;
    }
}
