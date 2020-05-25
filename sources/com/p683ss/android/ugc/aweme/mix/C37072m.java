package com.p683ss.android.ugc.aweme.mix;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p126ad.symphony.p139i.C2744c;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.challenge.p1496b.C24556a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.MixStruct;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.search.C41408c;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.m */
public final class C37072m {

    /* renamed from: A */
    public static final C37074a f94677A = new C37074a(null);

    /* renamed from: B */
    private CheckableImageView f94678B;

    /* renamed from: C */
    private DmtTextView f94679C;

    /* renamed from: a */
    public View f94680a;

    /* renamed from: b */
    RemoteImageView f94681b;

    /* renamed from: c */
    public DmtTextView f94682c;

    /* renamed from: d */
    public DmtTextView f94683d;

    /* renamed from: e */
    public View f94684e;

    /* renamed from: f */
    DmtTextView f94685f;

    /* renamed from: g */
    DmtTextView f94686g;

    /* renamed from: h */
    View f94687h;

    /* renamed from: i */
    DmtTextView f94688i;

    /* renamed from: j */
    LinearLayout f94689j;

    /* renamed from: k */
    public LinearLayout f94690k;

    /* renamed from: l */
    DmtTextView f94691l;

    /* renamed from: m */
    ImageView f94692m;

    /* renamed from: n */
    DmtTextView f94693n;

    /* renamed from: o */
    public View f94694o;

    /* renamed from: p */
    C37024f f94695p;

    /* renamed from: q */
    LinearLayout f94696q;

    /* renamed from: r */
    LinearLayout f94697r;

    /* renamed from: s */
    public MixStruct f94698s;

    /* renamed from: t */
    public final int f94699t = ((int) C9432q.m18687b((Context) this.f94700u, 300.0f));

    /* renamed from: u */
    public final Activity f94700u;

    /* renamed from: v */
    public final String f94701v;

    /* renamed from: w */
    public final String f94702w;

    /* renamed from: x */
    public final String f94703x;

    /* renamed from: y */
    public final C52682m<View, Long, C52860x> f94704y;

    /* renamed from: z */
    public final String f94705z;

    /* renamed from: com.ss.android.ugc.aweme.mix.m$a */
    public static final class C37074a {
        private C37074a() {
        }

        public /* synthetic */ C37074a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.m$b */
    static final class C37075b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37072m f94707a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f94708b;

        C37075b(C37072m mVar, MixStruct mixStruct) {
            this.f94707a = mVar;
            this.f94708b = mixStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94707a.mo76364a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.m$c */
    static final class C37076c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37072m f94709a;

        /* renamed from: b */
        final /* synthetic */ MixStruct f94710b;

        C37076c(C37072m mVar, MixStruct mixStruct) {
            this.f94709a = mVar;
            this.f94710b = mixStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94709a.mo76364a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.m$d */
    public static final class C37077d implements OnGlobalLayoutListener {

        /* renamed from: a */
        final /* synthetic */ C37072m f94711a;

        public final void onGlobalLayout() {
            if (this.f94711a.f94682c.getLineCount() >= 2) {
                LayoutParams layoutParams = this.f94711a.f94690k.getLayoutParams();
                if (layoutParams != null) {
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                    layoutParams2.topMargin = (int) C2744c.m7835a(this.f94711a.f94700u, 20.0f);
                    this.f94711a.f94690k.setLayoutParams(layoutParams2);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
            } else {
                LayoutParams layoutParams3 = this.f94711a.f94690k.getLayoutParams();
                if (layoutParams3 != null) {
                    RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) layoutParams3;
                    layoutParams4.topMargin = (int) C2744c.m7835a(this.f94711a.f94700u, 28.0f);
                    this.f94711a.f94690k.setLayoutParams(layoutParams4);
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                }
            }
            if (this.f94711a.f94682c.getLineCount() > 2) {
                this.f94711a.f94682c.setTextSize(1, 17.0f);
                this.f94711a.f94682c.setMaxLines(2);
                this.f94711a.f94682c.setEllipsize(TruncateAt.END);
            }
            this.f94711a.f94682c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        C37077d(C37072m mVar) {
            this.f94711a = mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.m$e */
    static final class C37078e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37072m f94712a;

        C37078e(C37072m mVar) {
            this.f94712a = mVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94712a.mo76365a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.m$f */
    static final class C37079f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37072m f94713a;

        C37079f(C37072m mVar) {
            this.f94713a = mVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94713a.mo76365a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.m$g */
    static final class C37080g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37072m f94714a;

        /* renamed from: b */
        final /* synthetic */ TextView f94715b;

        /* renamed from: c */
        final /* synthetic */ SpannableString f94716c;

        /* renamed from: d */
        final /* synthetic */ ImageView f94717d;

        /* renamed from: e */
        final /* synthetic */ TextView f94718e;

        /* renamed from: f */
        final /* synthetic */ ViewGroup f94719f;

        /* renamed from: g */
        final /* synthetic */ SpannableString f94720g;

        C37080g(C37072m mVar, TextView textView, SpannableString spannableString, ImageView imageView, TextView textView2, ViewGroup viewGroup, SpannableString spannableString2) {
            this.f94714a = mVar;
            this.f94715b = textView;
            this.f94716c = spannableString;
            this.f94717d = imageView;
            this.f94718e = textView2;
            this.f94719f = viewGroup;
            this.f94720g = spannableString2;
        }

        public final void run() {
            int height = this.f94715b.getHeight();
            Integer num = C24556a.m59970a(this.f94715b, this.f94716c).f65015b;
            if (num != null && height == num.intValue()) {
                this.f94715b.setText(this.f94716c);
                return;
            }
            this.f94717d.setSelected(true);
            this.f94718e.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C37080g f94721a;

                {
                    this.f94721a = r1;
                }

                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    this.f94721a.f94717d.performClick();
                }
            });
            this.f94717d.setOnClickListener(new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C37080g f94722a;

                {
                    this.f94722a = r1;
                }

                public final void onClick(View view) {
                    int i;
                    String str;
                    String str2;
                    ClickInstrumentation.onClick(view);
                    boolean isSelected = this.f94722a.f94717d.isSelected();
                    LayoutParams layoutParams = this.f94722a.f94719f.getLayoutParams();
                    if (layoutParams != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        if (!isSelected) {
                            this.f94722a.f94715b.setText(this.f94722a.f94720g);
                            this.f94722a.f94717d.setImageResource(R.drawable.dg_);
                            marginLayoutParams.topMargin = (int) this.f94722a.f94717d.getResources().getDimension(R.dimen.hm);
                            this.f94722a.f94719f.setLayoutParams(marginLayoutParams);
                        }
                        if (isSelected) {
                            this.f94722a.f94715b.setText(this.f94722a.f94716c);
                            this.f94722a.f94717d.setImageResource(R.drawable.dg9);
                            marginLayoutParams.topMargin = (int) C9432q.m18687b(this.f94722a.f94717d.getContext(), 0.0f);
                            this.f94722a.f94719f.setLayoutParams(marginLayoutParams);
                        }
                        TextView textView = this.f94722a.f94718e;
                        Context context = this.f94722a.f94715b.getContext();
                        if (isSelected) {
                            i = R.string.b3v;
                        } else {
                            i = R.string.azy;
                        }
                        textView.setText(context.getString(i));
                        this.f94722a.f94717d.setSelected(!isSelected);
                        MixStruct mixStruct = this.f94722a.f94714a.f94698s;
                        String str3 = null;
                        if (mixStruct != null) {
                            str = mixStruct.mixId;
                        } else {
                            str = null;
                        }
                        MixStruct mixStruct2 = this.f94722a.f94714a.f94698s;
                        if (mixStruct2 != null) {
                            User user = mixStruct2.author;
                            if (user != null) {
                                str3 = user.getUid();
                            }
                        }
                        boolean z = !isSelected;
                        String str4 = "unfold_compilation_description";
                        C23089d a = C23089d.m56640a().mo47829a("enter_from", "compilation_detail").mo47829a("compilation_id", str).mo47829a("author_id", str3);
                        String str5 = "to_status";
                        if (z) {
                            str2 = "close";
                        } else {
                            str2 = "open";
                        }
                        C26890h.m65011a(str4, a.mo47829a(str5, str2).f61491a);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo76364a() {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r8.f94698s
            r1 = 0
            if (r0 == 0) goto L_0x0008
            java.lang.String r0 = r0.mixId
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r8.f94698s
            if (r2 == 0) goto L_0x0016
            com.ss.android.ugc.aweme.profile.model.User r2 = r2.author
            if (r2 == 0) goto L_0x0016
            java.lang.String r2 = r2.getUid()
            goto L_0x0017
        L_0x0016:
            r2 = r1
        L_0x0017:
            java.lang.String r3 = r8.f94702w
            java.lang.String r4 = "compilation_detail"
            java.lang.String r5 = "enter_personal_detail"
            com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r7 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r4 = r6.mo47829a(r7, r4)
            java.lang.String r6 = "compilation_id"
            com.ss.android.ugc.aweme.app.f.d r0 = r4.mo47829a(r6, r0)
            java.lang.String r4 = "to_user_id"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r2)
            java.lang.String r2 = "previous_page"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r2, r3)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r0)
            com.ss.android.ugc.aweme.feed.model.MixStruct r0 = r8.f94698s
            if (r0 == 0) goto L_0x006a
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.author
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = r0.getUid()
            if (r0 == 0) goto L_0x006a
            java.lang.String r2 = r8.f94701v
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x005a
            android.app.Activity r0 = r8.f94700u
            r0.finish()
            goto L_0x006a
        L_0x005a:
            android.app.Activity r0 = r8.f94700u
            android.content.Context r0 = (android.content.Context) r0
            com.ss.android.ugc.aweme.feed.model.MixStruct r2 = r8.f94698s
            if (r2 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.profile.model.User r1 = r2.author
        L_0x0064:
            java.lang.String r2 = "compilation_detail"
            com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity.m89402a(r0, r1, r2)
            return
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.mix.C37072m.mo76364a():void");
    }

    /* renamed from: a */
    public final void mo76365a(View view) {
        boolean z;
        if (view != null && !C32800a.m75679a(view)) {
            MixStruct mixStruct = this.f94698s;
            if (mixStruct != null) {
                C41408c cVar = mixStruct.autoMixAuthorInfo;
                if (cVar != null) {
                    CharSequence schemaUrl = cVar.getSchemaUrl();
                    if (schemaUrl == null || schemaUrl.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        SmartRouter.buildRoute((Context) this.f94700u, "//webview").withParam(Uri.parse(cVar.getSchemaUrl())).open();
                    }
                }
            }
        }
    }

    public C37072m(Activity activity, String str, String str2, String str3, C52682m<? super View, ? super Long, C52860x> mVar, String str4) {
        Activity activity2 = activity;
        C52682m<? super View, ? super Long, C52860x> mVar2 = mVar;
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(mVar2, "outClickListener");
        this.f94700u = activity2;
        this.f94701v = str;
        this.f94702w = str2;
        this.f94703x = str3;
        this.f94704y = mVar2;
        this.f94705z = str4;
        View inflate = LayoutInflater.from(this.f94700u).inflate(R.layout.aa8, null, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(acti…info_layout, null, false)");
        this.f94680a = inflate;
        View findViewById = this.f94680a.findViewById(R.id.ao5);
        C52711k.m112236a((Object) findViewById, "mRootView.findViewById(R.id.header_content_ll)");
        this.f94696q = (LinearLayout) findViewById;
        View findViewById2 = this.f94680a.findViewById(R.id.ao7);
        C52711k.m112236a((Object) findViewById2, "mRootView.findViewById(R.id.header_loading_ll)");
        this.f94697r = (LinearLayout) findViewById2;
        View findViewById3 = this.f94680a.findViewById(R.id.a27);
        C52711k.m112236a((Object) findViewById3, "mRootView.findViewById(R.id.cover_iv)");
        this.f94681b = (RemoteImageView) findViewById3;
        View findViewById4 = this.f94680a.findViewById(R.id.d1l);
        C52711k.m112236a((Object) findViewById4, "mRootView.findViewById(R.id.title_tv)");
        this.f94682c = (DmtTextView) findViewById4;
        View findViewById5 = this.f94680a.findViewById(R.id.a2e);
        C52711k.m112236a((Object) findViewById5, "mRootView.findViewById(R.id.create_mix_tip_tv)");
        this.f94684e = findViewById5;
        View findViewById6 = this.f94680a.findViewById(R.id.d1c);
        C52711k.m112236a((Object) findViewById6, "mRootView.findViewById(R.id.title_ll)");
        this.f94690k = (LinearLayout) findViewById6;
        View findViewById7 = this.f94680a.findViewById(R.id.h4);
        C52711k.m112236a((Object) findViewById7, "mRootView.findViewById(R.id.author_tv)");
        this.f94683d = (DmtTextView) findViewById7;
        View findViewById8 = this.f94680a.findViewById(R.id.dlr);
        C52711k.m112236a((Object) findViewById8, "mRootView.findViewById(R.id.update_tv)");
        this.f94685f = (DmtTextView) findViewById8;
        View findViewById9 = this.f94680a.findViewById(R.id.e3q);
        C52711k.m112236a((Object) findViewById9, "mRootView.findViewById(R.id.continue_watch_tv)");
        this.f94686g = (DmtTextView) findViewById9;
        View findViewById10 = this.f94680a.findViewById(R.id.byd);
        C52711k.m112236a((Object) findViewById10, "mRootView.findViewById(R.id.play_vv_tv)");
        this.f94693n = (DmtTextView) findViewById10;
        View findViewById11 = this.f94680a.findViewById(R.id.a4d);
        C52711k.m112236a((Object) findViewById11, "mRootView.findViewById(R.id.des_container)");
        this.f94687h = findViewById11;
        View findViewById12 = this.f94680a.findViewById(R.id.d98);
        C52711k.m112236a((Object) findViewById12, "mRootView.findViewById(R.id.tv_desc)");
        this.f94688i = (DmtTextView) findViewById12;
        View findViewById13 = this.f94680a.findViewById(R.id.acr);
        C52711k.m112236a((Object) findViewById13, "mRootView.findViewById(R.id.expand_container)");
        this.f94689j = (LinearLayout) findViewById13;
        View findViewById14 = this.f94680a.findViewById(R.id.d_2);
        C52711k.m112236a((Object) findViewById14, "mRootView.findViewById(R.id.tv_expand)");
        this.f94691l = (DmtTextView) findViewById14;
        View findViewById15 = this.f94680a.findViewById(R.id.b0f);
        C52711k.m112236a((Object) findViewById15, "mRootView.findViewById(R.id.iv_expand)");
        this.f94692m = (ImageView) findViewById15;
        View findViewById16 = this.f94680a.findViewById(R.id.bmb);
        C52711k.m112236a((Object) findViewById16, "mRootView.findViewById(R…d.mix_header_add_collect)");
        this.f94694o = findViewById16;
        View findViewById17 = this.f94680a.findViewById(R.id.bmc);
        C52711k.m112236a((Object) findViewById17, "mRootView.findViewById(R.id.mix_header_iv_collect)");
        this.f94678B = (CheckableImageView) findViewById17;
        View findViewById18 = this.f94680a.findViewById(R.id.bmd);
        C52711k.m112236a((Object) findViewById18, "mRootView.findViewById(R.id.mix_header_tv_collect)");
        this.f94679C = (DmtTextView) findViewById18;
        C37024f fVar = new C37024f(this.f94694o, this.f94678B, this.f94679C, "inner_up", this.f94702w, null, false, 96, null);
        this.f94695p = fVar;
        this.f94684e.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {

            /* renamed from: a */
            final /* synthetic */ C37072m f94706a;

            public final void onGlobalLayout() {
                this.f94706a.f94683d.setMaxWidth((int) ((((float) C9432q.m18670a((Context) this.f94706a.f94700u)) - C9432q.m18687b((Context) this.f94706a.f94700u, 184.0f)) - ((float) this.f94706a.f94684e.getWidth())));
                this.f94706a.f94684e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }

            {
                this.f94706a = r1;
            }
        });
    }
}
