package com.p683ss.android.ugc.aweme.challenge.p1500ui.header;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.challenge.ChallengeDetailProvicer;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24664a.C24665a;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.ChallengeTransform;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p2628d.C52775l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.o */
public final class C24709o extends C24664a {

    /* renamed from: j */
    public static final C24710a f65428j = new C24710a(null);

    /* renamed from: k */
    private DmtTextView f65429k;

    /* renamed from: l */
    private View f65430l;

    /* renamed from: m */
    private DmtTextView f65431m;

    /* renamed from: n */
    private DmtTextView f65432n;

    /* renamed from: o */
    private DmtTextView f65433o;

    /* renamed from: p */
    private DmtTextView f65434p;

    /* renamed from: q */
    private View f65435q;

    /* renamed from: r */
    private CheckableImageView f65436r;

    /* renamed from: s */
    private DmtTextView f65437s;

    /* renamed from: t */
    private C24688i f65438t;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.o$a */
    public static final class C24710a {
        private C24710a() {
        }

        public /* synthetic */ C24710a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.o$b */
    static final class C24711b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C24709o f65439a;

        /* renamed from: b */
        final /* synthetic */ ChallengeTransform f65440b;

        C24711b(C24709o oVar, ChallengeTransform challengeTransform) {
            this.f65439a = oVar;
            this.f65440b = challengeTransform;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f65439a.mo50597b("challenge_transform_button_click");
            if (C24678b.m60182a(this.f65440b.getAction())) {
                String action = this.f65440b.getAction();
                if (action == null) {
                    action = "";
                }
                String str = "ffffff";
                if (C24678b.m60182a(action)) {
                    action = Uri.parse(action).buildUpon().appendQueryParameter("bundle_webview_background", str).build().toString();
                }
                C52711k.m112236a((Object) action, "if (url.isNotNullOrEmpty… else {\n        url\n    }");
                if (!C25945k.m62914e().mo53193a(this.f65439a.getContext(), action, true)) {
                    C25945k.m62914e().mo53192a(this.f65439a.getContext(), action, "");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final int getAttrsResId() {
        return R.layout.h5;
    }

    /* access modifiers changed from: protected */
    public final int getLayoutResId() {
        return R.layout.hc;
    }

    /* renamed from: a */
    public final void mo50508a() {
        C24708n createCommerceHeaderDelegate = ChallengeDetailProvicer.createIChallengeDetailProviderbyMonsterPlugin().createCommerceHeaderDelegate();
        C52711k.m112236a((Object) createCommerceHeaderDelegate, "ServiceManager.get().get…eCommerceHeaderDelegate()");
        mo50510a(createCommerceHeaderDelegate);
    }

    /* access modifiers changed from: protected */
    public final int getButtonResId() {
        switch (C24712p.f65441a[getMHeaderParam().f65423c.ordinal()]) {
            case 1:
                return R.layout.h7;
            case 2:
                return R.layout.h8;
            default:
                throw new C52775l();
        }
    }

    /* renamed from: b */
    public final void mo50513b() {
        View findViewById = findViewById(R.id.ia);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.avatar_tag)");
        this.f65429k = (DmtTextView) findViewById;
        View findViewById2 = findViewById(R.id.gj);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.attrs_container)");
        ViewStub viewStub = (ViewStub) findViewById2;
        viewStub.setLayoutResource(getAttrsResId());
        View inflate = viewStub.inflate();
        C52711k.m112236a((Object) inflate, "containerVs.apply { layo… = attrsResId }.inflate()");
        this.f65430l = inflate;
        View view = this.f65430l;
        if (view == null) {
            C52711k.m112237a("attrsContainer");
        }
        View findViewById3 = view.findViewById(R.id.gk);
        C52711k.m112236a((Object) findViewById3, "attrsContainer.findViewById(R.id.attrs_first)");
        this.f65431m = (DmtTextView) findViewById3;
        View view2 = this.f65430l;
        if (view2 == null) {
            C52711k.m112237a("attrsContainer");
        }
        View findViewById4 = view2.findViewById(R.id.gn);
        C52711k.m112236a((Object) findViewById4, "attrsContainer.findViewById(R.id.attrs_second)");
        this.f65432n = (DmtTextView) findViewById4;
        View view3 = this.f65430l;
        if (view3 == null) {
            C52711k.m112237a("attrsContainer");
        }
        View findViewById5 = view3.findViewById(R.id.go);
        C52711k.m112236a((Object) findViewById5, "attrsContainer.findViewById(R.id.attrs_third)");
        this.f65433o = (DmtTextView) findViewById5;
        View view4 = this.f65430l;
        if (view4 == null) {
            C52711k.m112237a("attrsContainer");
        }
        View findViewById6 = view4.findViewById(R.id.gl);
        C52711k.m112236a((Object) findViewById6, "attrsContainer.findViewById(R.id.attrs_forth)");
        this.f65434p = (DmtTextView) findViewById6;
        View findViewById7 = findViewById(R.id.q0);
        C52711k.m112236a((Object) findViewById7, "findViewById(R.id.button_container)");
        ViewStub viewStub2 = (ViewStub) findViewById7;
        viewStub2.setLayoutResource(getButtonResId());
        View inflate2 = viewStub2.inflate();
        View findViewById8 = inflate2.findViewById(R.id.uy);
        C52711k.m112236a((Object) findViewById8, "container.findViewById(R.id.collect_container)");
        View findViewById9 = inflate2.findViewById(R.id.azc);
        C52711k.m112236a((Object) findViewById9, "container.findViewById(R.id.iv_collect)");
        C24688i iVar = new C24688i(findViewById8, (CheckableImageView) findViewById9, (DmtTextView) inflate2.findViewById(R.id.d88), null, 8, null);
        this.f65438t = iVar;
        this.f65435q = inflate2.findViewById(R.id.d40);
        if (this.f65435q != null) {
            View findViewById10 = inflate2.findViewById(R.id.b53);
            C52711k.m112236a((Object) findViewById10, "container.findViewById(R.id.iv_transform)");
            this.f65436r = (CheckableImageView) findViewById10;
            View findViewById11 = inflate2.findViewById(R.id.dhz);
            C52711k.m112236a((Object) findViewById11, "container.findViewById(R.id.tv_transform)");
            this.f65437s = (DmtTextView) findViewById11;
        }
        super.mo50513b();
    }

    /* renamed from: b */
    public final void mo50597b(String str) {
        C26890h.m65011a(str, C23089d.m56640a().mo47829a("challenge_id", getMChallenge().getCid()).mo47826a("content_type", getMChallenge().getContentType()).f61491a);
    }

    /* renamed from: a */
    public final void mo50509a(ChallengeDetail challengeDetail) {
        boolean z;
        C52711k.m112240b(challengeDetail, "data");
        if (challengeDetail.challenge != null) {
            super.mo50509a(challengeDetail);
            if (C24678b.m60182a(getMChallenge().getProfileTagUrl())) {
                DmtTextView dmtTextView = this.f65429k;
                if (dmtTextView == null) {
                    C52711k.m112237a("avatarTag");
                }
                dmtTextView.setVisibility(0);
                DmtTextView dmtTextView2 = this.f65429k;
                if (dmtTextView2 == null) {
                    C52711k.m112237a("avatarTag");
                }
                dmtTextView2.setText(getMChallenge().getProfileTagUrl());
            } else {
                DmtTextView dmtTextView3 = this.f65429k;
                if (dmtTextView3 == null) {
                    C52711k.m112237a("avatarTag");
                }
                dmtTextView3.setVisibility(8);
            }
            Collection attrs = getMChallenge().getAttrs();
            if (attrs == null || attrs.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                View view = this.f65430l;
                if (view == null) {
                    C52711k.m112237a("attrsContainer");
                }
                view.setVisibility(4);
            } else {
                DmtTextView dmtTextView4 = this.f65431m;
                if (dmtTextView4 == null) {
                    C52711k.m112237a("attrsFirst");
                }
                m60220a(0, dmtTextView4);
                DmtTextView dmtTextView5 = this.f65432n;
                if (dmtTextView5 == null) {
                    C52711k.m112237a("attrsSecond");
                }
                m60220a(1, dmtTextView5);
                DmtTextView dmtTextView6 = this.f65433o;
                if (dmtTextView6 == null) {
                    C52711k.m112237a("attrsThird");
                }
                m60220a(2, dmtTextView6);
                DmtTextView dmtTextView7 = this.f65434p;
                if (dmtTextView7 == null) {
                    C52711k.m112237a("attrsForth");
                }
                m60220a(3, dmtTextView7);
                View view2 = this.f65430l;
                if (view2 == null) {
                    C52711k.m112237a("attrsContainer");
                }
                view2.setVisibility(0);
            }
            C24688i iVar = this.f65438t;
            if (iVar == null) {
                C52711k.m112237a("collectButtonBlock");
            }
            iVar.mo50569a(getMChallenge(), getMHeaderParam());
            if (this.f65435q != null && C24665a.m60178a(getMChallengeDetail())) {
                ChallengeTransform transfrom = getMChallenge().getTransfrom();
                if (transfrom.getIconUrlModel() == null) {
                    CheckableImageView checkableImageView = this.f65436r;
                    if (checkableImageView == null) {
                        C52711k.m112237a("transformIv");
                    }
                    checkableImageView.setVisibility(8);
                } else {
                    CheckableImageView checkableImageView2 = this.f65436r;
                    if (checkableImageView2 == null) {
                        C52711k.m112237a("transformIv");
                    }
                    C23515d.m57669a((RemoteImageView) checkableImageView2, transfrom.getIconUrlModel());
                }
                DmtTextView dmtTextView8 = this.f65437s;
                if (dmtTextView8 == null) {
                    C52711k.m112237a("transformTv");
                }
                dmtTextView8.setText(transfrom.getText());
                View view3 = this.f65435q;
                if (view3 == null) {
                    C52711k.m112234a();
                }
                view3.setOnClickListener(new C24711b(this, transfrom));
                mo50597b("challenge_transform_button_show");
            }
        }
    }

    /* renamed from: a */
    private final void m60220a(int i, DmtTextView dmtTextView) {
        List attrs = getMChallenge().getAttrs();
        int size = attrs.size() - (4 - i);
        if (size >= 0) {
            dmtTextView.setVisibility(0);
            dmtTextView.setText((CharSequence) attrs.get(size));
            return;
        }
        dmtTextView.setVisibility(4);
    }

    private C24709o(Context context, C24706l lVar, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, lVar, attributeSet);
    }

    public /* synthetic */ C24709o(Context context, C24706l lVar, AttributeSet attributeSet, int i, C52707g gVar) {
        this(context, lVar, null);
    }
}
