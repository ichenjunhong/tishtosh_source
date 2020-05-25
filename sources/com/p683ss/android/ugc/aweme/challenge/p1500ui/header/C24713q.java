package com.p683ss.android.ugc.aweme.challenge.p1500ui.header;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.p683ss.android.ugc.aweme.challenge.ChallengeDetailProvicer;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24659e;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.model.ChallengeAnnouncement;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.music.p1978ui.CheckableImageView;
import com.ss.android.ugc.trill.R;
import p2628d.C52775l;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.q */
public final class C24713q extends C24664a {

    /* renamed from: j */
    private DmtTextView f65442j;

    /* renamed from: k */
    private DmtTextView f65443k;

    /* renamed from: l */
    private View f65444l;

    /* renamed from: m */
    private View f65445m;

    /* renamed from: n */
    private View f65446n;

    /* renamed from: o */
    private DmtTextView f65447o;

    /* renamed from: p */
    private ViewGroup f65448p;

    /* renamed from: q */
    private DmtTextView f65449q;

    /* renamed from: r */
    private DmtTextView f65450r;

    /* renamed from: s */
    private ImageView f65451s;

    /* renamed from: t */
    private View f65452t;

    /* renamed from: u */
    private C24688i f65453u;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.header.q$a */
    static final /* synthetic */ class C24714a extends C52710j implements C52670a<C52860x> {
        C24714a(C24713q qVar) {
            super(0, qVar);
        }

        public final String getName() {
            return "relayoutButton";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C24713q.class);
        }

        public final String getSignature() {
            return "relayoutButton()V";
        }

        public final /* synthetic */ Object invoke() {
            ((C24713q) this.receiver).mo50599e();
            return C52860x.f131107a;
        }
    }

    /* access modifiers changed from: protected */
    public final int getLayoutResId() {
        return R.layout.hd;
    }

    /* renamed from: a */
    public final void mo50508a() {
        C24708n createCommerceHeaderDelegate = ChallengeDetailProvicer.createIChallengeDetailProviderbyMonsterPlugin().createCommerceHeaderDelegate();
        C52711k.m112236a((Object) createCommerceHeaderDelegate, "ServiceManager.get().get…eCommerceHeaderDelegate()");
        mo50510a(createCommerceHeaderDelegate);
    }

    /* access modifiers changed from: protected */
    public final int getAttrsResId() {
        switch (C24715r.f65454a[getMHeaderParam().f65422b.ordinal()]) {
            case 1:
                return R.layout.h6;
            case 2:
                return R.layout.h6;
            default:
                throw new C52775l();
        }
    }

    /* access modifiers changed from: protected */
    public final int getButtonResId() {
        switch (C24715r.f65455b[getMHeaderParam().f65423c.ordinal()]) {
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
        View findViewById = findViewById(R.id.gj);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.attrs_container)");
        ViewStub viewStub = (ViewStub) findViewById;
        viewStub.setLayoutResource(getAttrsResId());
        View inflate = viewStub.inflate();
        View findViewById2 = inflate.findViewById(R.id.gm);
        C52711k.m112236a((Object) findViewById2, "container.findViewById(R.id.attrs_link)");
        this.f65442j = (DmtTextView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.gk);
        C52711k.m112236a((Object) findViewById3, "container.findViewById(R.id.attrs_first)");
        this.f65443k = (DmtTextView) findViewById3;
        C52711k.m112236a((Object) inflate, "container");
        this.f65444l = inflate;
        View findViewById4 = findViewById(R.id.q0);
        C52711k.m112236a((Object) findViewById4, "findViewById(R.id.button_container)");
        ViewStub viewStub2 = (ViewStub) findViewById4;
        viewStub2.setLayoutResource(getButtonResId());
        View inflate2 = viewStub2.inflate();
        View findViewById5 = inflate2.findViewById(R.id.uy);
        C52711k.m112236a((Object) findViewById5, "container.findViewById(R.id.collect_container)");
        View findViewById6 = inflate2.findViewById(R.id.azc);
        C52711k.m112236a((Object) findViewById6, "container.findViewById(R.id.iv_collect)");
        C24688i iVar = new C24688i(findViewById5, (CheckableImageView) findViewById6, (DmtTextView) inflate2.findViewById(R.id.d88), null, 8, null);
        this.f65453u = iVar;
        C52711k.m112236a((Object) inflate2, "container");
        this.f65445m = inflate2;
        super.mo50513b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x008f  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo50599e() {
        /*
            r8 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.view.View r3 = r8.f65444l
            if (r3 != 0) goto L_0x0018
            java.lang.String r4 = "mAttrsContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0018:
            r3.getGlobalVisibleRect(r0)
            android.view.View r3 = r8.f65445m
            if (r3 != 0) goto L_0x0024
            java.lang.String r4 = "mButtonContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0024:
            r3.getGlobalVisibleRect(r1)
            com.bytedance.lighten.loader.SmartImageView r3 = r8.getMAvatar()
            r3.getGlobalVisibleRect(r2)
            int r1 = r1.top
            int r3 = r0.bottom
            int r1 = r1 - r3
            android.view.View r3 = r8.f65445m
            if (r3 != 0) goto L_0x003c
            java.lang.String r4 = "mButtonContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x003c:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x009a
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            r4 = 4618441417868443648(0x4018000000000000, double:6.0)
            int r4 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r4)
            r5 = 8
            r6 = 3
            r7 = 0
            if (r1 < r4) goto L_0x0070
            int r1 = r2.bottom
            int r0 = r0.bottom
            android.view.View r2 = r8.f65445m
            if (r2 != 0) goto L_0x005d
            java.lang.String r4 = "mButtonContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x005d:
            int r2 = r2.getHeight()
            int r0 = r0 + r2
            if (r1 <= r0) goto L_0x0070
            r0 = 2132017508(0x7f140164, float:1.9673296E38)
            r3.addRule(r5, r0)
            r3.addRule(r6, r7)
            r3.topMargin = r7
            goto L_0x008b
        L_0x0070:
            android.view.View r0 = r8.f65444l
            if (r0 != 0) goto L_0x0079
            java.lang.String r1 = "mAttrsContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0079:
            int r0 = r0.getId()
            r3.addRule(r6, r0)
            r3.addRule(r5, r7)
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            int r0 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r0)
            r3.topMargin = r0
        L_0x008b:
            android.view.View r0 = r8.f65445m
            if (r0 != 0) goto L_0x0094
            java.lang.String r1 = "mButtonContainer"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0094:
            android.view.ViewGroup$LayoutParams r3 = (android.view.ViewGroup.LayoutParams) r3
            r0.setLayoutParams(r3)
            return
        L_0x009a:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.header.C24713q.mo50599e():void");
    }

    /* renamed from: a */
    public final void mo50509a(ChallengeDetail challengeDetail) {
        CharSequence charSequence;
        C52711k.m112240b(challengeDetail, "data");
        if (challengeDetail.challenge != null) {
            super.mo50509a(challengeDetail);
            DmtTextView dmtTextView = this.f65443k;
            if (dmtTextView == null) {
                C52711k.m112237a("mAttrsFirst");
            }
            dmtTextView.setText(getContext().getString(R.string.zk, new Object[]{C33095b.m76068a(getMChallenge().getDisplayCount())}));
            C24688i iVar = this.f65453u;
            if (iVar == null) {
                C52711k.m112237a("mCollectButtonBlock");
            }
            iVar.mo50569a(getMChallenge(), getMHeaderParam());
            View view = this.f65445m;
            if (view == null) {
                C52711k.m112237a("mButtonContainer");
            }
            view.post(new C24716s(new C24714a(this)));
            ChallengeAnnouncement challengeAnnouncement = getMChallenge().getChallengeAnnouncement();
            String str = null;
            if (challengeAnnouncement != null) {
                charSequence = challengeAnnouncement.getTitle();
            } else {
                charSequence = null;
            }
            if (challengeAnnouncement != null) {
                str = challengeAnnouncement.getContent();
            }
            int i = 8;
            if (challengeAnnouncement != null) {
                CharSequence charSequence2 = charSequence;
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(str)) {
                    if (this.f65446n == null) {
                        View inflate = ((ViewStub) findViewById(R.id.dst)).inflate();
                        if (inflate != null) {
                            this.f65446n = (ViewGroup) inflate;
                            View findViewById = findViewById(R.id.ry);
                            C52711k.m112236a((Object) findViewById, "findViewById(R.id.challenge_announcement_title)");
                            this.f65447o = (DmtTextView) findViewById;
                            View findViewById2 = findViewById(R.id.rw);
                            C52711k.m112236a((Object) findViewById2, "findViewById(R.id.challe…ncement_expand_container)");
                            this.f65448p = (ViewGroup) findViewById2;
                            View findViewById3 = findViewById(R.id.ru);
                            C52711k.m112236a((Object) findViewById3, "findViewById(R.id.challenge_announcement_desc)");
                            this.f65449q = (DmtTextView) findViewById3;
                            View findViewById4 = findViewById(R.id.rv);
                            C52711k.m112236a((Object) findViewById4, "findViewById(R.id.challenge_announcement_expand)");
                            this.f65450r = (DmtTextView) findViewById4;
                            View findViewById5 = findViewById(R.id.rx);
                            C52711k.m112236a((Object) findViewById5, "findViewById(R.id.challe…e_announcement_expand_iv)");
                            this.f65451s = (ImageView) findViewById5;
                            View findViewById6 = findViewById(R.id.bay);
                            C52711k.m112236a((Object) findViewById6, "findViewById(R.id.line_divider)");
                            this.f65452t = findViewById6;
                            ImageView imageView = this.f65451s;
                            if (imageView == null) {
                                C52711k.m112237a("mAnnounceExpandIv");
                            }
                            imageView.setImageDrawable(getResources().getDrawable(R.drawable.cra));
                            DmtTextView dmtTextView2 = this.f65447o;
                            if (dmtTextView2 == null) {
                                C52711k.m112237a("mAnnounceTitle");
                            }
                            dmtTextView2.setFontType(C10751d.f28903b);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
                        }
                    }
                    View view2 = this.f65452t;
                    if (view2 == null) {
                        C52711k.m112237a("mAnnounceDivider");
                    }
                    if (!TextUtils.isEmpty(getMChallenge().getDesc())) {
                        i = 0;
                    }
                    view2.setVisibility(i);
                    DmtTextView dmtTextView3 = this.f65447o;
                    if (dmtTextView3 == null) {
                        C52711k.m112237a("mAnnounceTitle");
                    }
                    dmtTextView3.setText(charSequence2);
                    View view3 = this.f65446n;
                    if (view3 == null) {
                        C52711k.m112234a();
                    }
                    view3.setVisibility(0);
                    Challenge mChallenge = getMChallenge();
                    DmtTextView dmtTextView4 = this.f65449q;
                    if (dmtTextView4 == null) {
                        C52711k.m112237a("mAnnounceContent");
                    }
                    TextView textView = dmtTextView4;
                    ViewGroup viewGroup = this.f65448p;
                    if (viewGroup == null) {
                        C52711k.m112237a("mAnnounceExpandContainer");
                    }
                    DmtTextView dmtTextView5 = this.f65450r;
                    if (dmtTextView5 == null) {
                        C52711k.m112237a("mAnnounceExpandTv");
                    }
                    TextView textView2 = dmtTextView5;
                    ImageView imageView2 = this.f65451s;
                    if (imageView2 == null) {
                        C52711k.m112237a("mAnnounceExpandIv");
                    }
                    C24659e.m60164a(mChallenge, textView, viewGroup, textView2, imageView2, true);
                }
            }
            View view4 = this.f65446n;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
    }

    private C24713q(Context context, C24706l lVar, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, lVar, attributeSet);
    }

    public /* synthetic */ C24713q(Context context, C24706l lVar, AttributeSet attributeSet, int i, C52707g gVar) {
        this(context, lVar, null);
    }
}
