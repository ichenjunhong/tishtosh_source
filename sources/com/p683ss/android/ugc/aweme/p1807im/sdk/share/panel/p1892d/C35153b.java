package com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1892d;

import android.os.Build.VERSION;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1877a.C34886b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35193ai;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35211ax;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35212ay;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMConversation;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.trill.R;
import java.util.Set;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.d.b */
public final class C35153b extends C1352v {

    /* renamed from: j */
    public static final C35156a f90409j = new C35156a(null);

    /* renamed from: p */
    private static final int f90410p = C11010c.m22280a().getResources().getDimensionPixelSize(R.dimen.ip);

    /* renamed from: a */
    public final DmtTextView f90411a;

    /* renamed from: b */
    public final AvatarImageView f90412b;

    /* renamed from: c */
    public final ImageView f90413c;

    /* renamed from: d */
    public IMContact f90414d;

    /* renamed from: e */
    public int f90415e = -1;

    /* renamed from: f */
    public boolean f90416f;

    /* renamed from: g */
    public boolean f90417g;

    /* renamed from: h */
    public C52847n<Boolean, String> f90418h;

    /* renamed from: i */
    public final SharePanelViewModel f90419i;

    /* renamed from: k */
    private final View f90420k;

    /* renamed from: l */
    private final ImageView f90421l;

    /* renamed from: m */
    private final DmtTextView f90422m;

    /* renamed from: n */
    private final View f90423n;

    /* renamed from: o */
    private final View f90424o;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.d.b$a */
    public static final class C35156a {
        private C35156a() {
        }

        public /* synthetic */ C35156a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.d.b$b */
    static final class C35157b extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35153b f90427a;

        C35157b(C35153b bVar) {
            this.f90427a = bVar;
            super(1);
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x004d  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0053  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
            /*
                r2 = this;
                android.view.View r3 = (android.view.View) r3
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
                com.ss.android.ugc.aweme.im.sdk.d.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                java.lang.String r0 = "AwemeImManager.instance()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                com.ss.android.ugc.aweme.im.service.j r3 = r3.mo71949f()
                if (r3 == 0) goto L_0x0049
                com.ss.android.ugc.aweme.im.sdk.d.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                java.lang.String r0 = "AwemeImManager.instance()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                com.ss.android.ugc.aweme.im.service.j r3 = r3.mo71949f()
                java.lang.String r0 = "AwemeImManager.instance().proxy"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                com.ss.android.ugc.aweme.im.service.m r3 = r3.getUnder16Proxy()
                if (r3 == 0) goto L_0x0049
                com.ss.android.ugc.aweme.im.sdk.d.b r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                java.lang.String r0 = "AwemeImManager.instance()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                com.ss.android.ugc.aweme.im.service.j r3 = r3.mo71949f()
                java.lang.String r0 = "AwemeImManager.instance().proxy"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
                com.ss.android.ugc.aweme.im.service.m r3 = r3.getUnder16Proxy()
                boolean r0 = r3.mo70449c()
                goto L_0x004b
            L_0x0049:
                r0 = 0
                r3 = 0
            L_0x004b:
                if (r0 == 0) goto L_0x0053
                if (r3 == 0) goto L_0x0071
                r3.mo70454h()
                goto L_0x0071
            L_0x0053:
                com.ss.android.ugc.aweme.im.sdk.share.panel.d.b r3 = r2.f90427a
                boolean r3 = r3.f90416f
                r3 = r3 ^ 1
                com.ss.android.ugc.aweme.im.sdk.share.panel.d.b r0 = r2.f90427a
                com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel r0 = r0.f90419i
                com.ss.android.ugc.aweme.im.sdk.share.panel.d.b r1 = r2.f90427a
                com.ss.android.ugc.aweme.im.service.model.IMContact r1 = r1.f90414d
                if (r1 != 0) goto L_0x0066
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0066:
                boolean r0 = r0.mo73281a(r1, r3)
                if (r0 == 0) goto L_0x0071
                com.ss.android.ugc.aweme.im.sdk.share.panel.d.b r0 = r2.f90427a
                r0.mo73273a(r3)
            L_0x0071:
                d.x r3 = p2628d.C52860x.f131107a
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.share.panel.p1892d.C35153b.C35157b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.d.b$c */
    public static final class C35158c extends ClickableSpan {
        C35158c() {
        }

        public final void onClick(View view) {
            C52711k.m112240b(view, "widget");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.panel.d.b$d */
    public static final class C35159d implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35153b f90428a;

        C35159d(C35153b bVar) {
            this.f90428a = bVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            mo73275a(((Number) obj).intValue());
            return C52860x.f131107a;
        }

        /* renamed from: a */
        public final void mo73275a(int i) {
            if (this.f90428a.f90411a.getMaxLines() != i) {
                this.f90428a.f90411a.setMaxLines(i);
                if (this.f90428a.f90414d instanceof IMUser) {
                    C35153b bVar = this.f90428a;
                    IMContact iMContact = this.f90428a.f90414d;
                    if (iMContact != null) {
                        bVar.mo73272a((IMUser) iMContact);
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                } else if (this.f90428a.f90414d instanceof IMConversation) {
                    C35153b bVar2 = this.f90428a;
                    IMContact iMContact2 = this.f90428a.f90414d;
                    if (iMContact2 != null) {
                        bVar2.mo73271a((IMConversation) iMContact2);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMConversation");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo73270a() {
        Long l;
        boolean z;
        C35159d dVar = new C35159d(this);
        IMContact iMContact = this.f90414d;
        if (!(iMContact instanceof IMUser)) {
            iMContact = null;
        }
        IMUser iMUser = (IMUser) iMContact;
        if (iMUser != null) {
            l = (Long) this.f90419i.mo73282b().get(iMUser.getSecUid());
        } else {
            l = null;
        }
        if (l == null || l.longValue() <= 0) {
            this.f90418h = null;
            this.f90420k.setVisibility(8);
            this.f90421l.setVisibility(8);
            this.f90422m.setVisibility(8);
            dVar.mo73275a(2);
            return;
        }
        C52847n<Boolean, String> a = C34886b.m78988a(l.longValue());
        boolean z2 = false;
        if (((Boolean) a.getFirst()).booleanValue()) {
            this.f90420k.setVisibility(0);
            this.f90421l.setVisibility(0);
            View view = this.f90424o;
            if (view != null) {
                view.setVisibility(8);
            }
            this.f90413c.setVisibility(8);
        } else {
            this.f90420k.setVisibility(8);
            this.f90421l.setVisibility(8);
        }
        CharSequence charSequence = (CharSequence) a.getSecond();
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f90422m.setText((CharSequence) a.getSecond());
            this.f90422m.setVisibility(0);
            dVar.mo73275a(1);
        } else {
            this.f90422m.setVisibility(8);
            dVar.mo73275a(2);
        }
        IMContact iMContact2 = this.f90414d;
        if (iMContact2 != null) {
            String uid = ((IMUser) iMContact2).getUid();
            CharSequence charSequence2 = (CharSequence) a.getSecond();
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            }
            if (!z2 && this.f90417g && !this.f90419i.mo73283c().contains(uid)) {
                C35193ai.m79546a("share_head_online_status_show", ((Boolean) a.getFirst()).booleanValue(), (String) a.getSecond(), uid);
                Set c = this.f90419i.mo73283c();
                C52711k.m112236a((Object) uid, "uid");
                c.add(uid);
            }
            this.f90418h = a;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
    }

    /* renamed from: a */
    public final void mo73273a(boolean z) {
        int i;
        this.f90416f = z;
        if (RefineShareInSiteExperiment.m80104a() == 0) {
            View view = this.f90423n;
            int i2 = 8;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            View view2 = this.f90424o;
            if (view2 != null) {
                if (z) {
                    i2 = this.f90413c.getVisibility();
                }
                view2.setVisibility(i2);
            }
            return;
        }
        this.f90423n.setSelected(z);
    }

    /* renamed from: a */
    public final void mo73271a(IMConversation iMConversation) {
        boolean z;
        C35153b bVar;
        int i;
        String displayName = iMConversation.getDisplayName();
        CharSequence charSequence = displayName;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bVar = this;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            this.f90411a.setText("");
            return;
        }
        C11180b a = C11182d.m22641a().mo20658a(iMConversation.getConversationId());
        if (a != null) {
            i = a.getMemberCount();
        } else {
            i = 0;
        }
        String string = this.f90411a.getContext().getString(R.string.bim, new Object[]{Integer.valueOf(i)});
        StringBuilder sb = new StringBuilder();
        sb.append(displayName);
        sb.append(string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.toString());
        spannableStringBuilder.setSpan(new C35158c(), displayName.length(), spannableStringBuilder.length(), 34);
        int measureText = (int) (this.f90411a.getPaint().measureText(string) + 0.5f);
        TextPaint paint = this.f90411a.getPaint();
        C52711k.m112236a((Object) paint, "nameTv.paint");
        SpannableStringBuilder a2 = C35212ay.m79598a(spannableStringBuilder, paint, f90410p, this.f90411a.getMaxLines(), string.length(), measureText);
        if (VERSION.SDK_INT >= 23) {
            this.f90411a.setBreakStrategy(0);
        }
        this.f90411a.setText(a2.toString());
    }

    /* renamed from: a */
    public final void mo73272a(IMUser iMUser) {
        boolean z;
        CharSequence a;
        CharSequence a2;
        DmtTextView dmtTextView = this.f90411a;
        CharSequence displayName = iMUser.getDisplayName();
        boolean z2 = false;
        if (displayName == null || displayName.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a = "";
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(C35211ax.m79597a(iMUser.getDisplayName()));
            TextPaint paint = this.f90411a.getPaint();
            C52711k.m112236a((Object) paint, "nameTv.paint");
            a = C35212ay.m79598a(spannableStringBuilder, paint, f90410p, this.f90411a.getMaxLines(), 0, 0);
        }
        dmtTextView.setText(a);
        if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Message")) {
            DmtTextView dmtTextView2 = this.f90411a;
            CharSequence displayId = iMUser.getDisplayId();
            if (displayId == null || displayId.length() == 0) {
                z2 = true;
            }
            if (z2) {
                a2 = "";
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(C35211ax.m79597a(iMUser.getDisplayId()));
                TextPaint paint2 = this.f90411a.getPaint();
                C52711k.m112236a((Object) paint2, "nameTv.paint");
                a2 = C35212ay.m79598a(spannableStringBuilder2, paint2, f90410p, this.f90411a.getMaxLines(), 0, 0);
            }
            dmtTextView2.setText(a2);
        }
    }

    public C35153b(final View view, SharePanelViewModel sharePanelViewModel) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(sharePanelViewModel, "viewModel");
        super(view);
        this.f90419i = sharePanelViewModel;
        View findViewById = view.findViewById(R.id.bpu);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.name_tv)");
        this.f90411a = (DmtTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.i0);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.avatar_iv)");
        this.f90412b = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dw_);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.active_iv_mask)");
        this.f90420k = findViewById3;
        this.f90424o = view.findViewById(R.id.dof);
        View findViewById4 = view.findViewById(R.id.dw9);
        C52711k.m112236a((Object) findViewById4, "findViewById(R.id.active_iv)");
        this.f90421l = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dwa);
        C52711k.m112236a((Object) findViewById5, "findViewById(R.id.active_tv)");
        this.f90422m = (DmtTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.doe);
        C52711k.m112236a((Object) findViewById6, "findViewById(R.id.verify_iv)");
        this.f90413c = (ImageView) findViewById6;
        View findViewById7 = view.findViewById(R.id.ane);
        C52711k.m112236a((Object) findViewById7, "findViewById(R.id.has_selected_fl)");
        this.f90423n = findViewById7;
        C52671b bVar = new C35157b(this);
        this.f90412b.setOnClickListener(new C35160c(bVar));
        this.f90411a.setOnClickListener(new C35160c(bVar));
        SharePanelViewModel sharePanelViewModel2 = this.f90419i;
        C52670a r0 = new C52670a<C52860x>(this) {

            /* renamed from: a */
            final /* synthetic */ C35153b f90425a;

            {
                this.f90425a = r1;
            }

            public final /* synthetic */ Object invoke() {
                view.post(new C35161d(new C52670a<C52860x>(this.f90425a) {
                    public final String getName() {
                        return "updateUserActiveStatus";
                    }

                    public final C52761d getOwner() {
                        return C52728w.m112245a(C35153b.class);
                    }

                    public final String getSignature() {
                        return "updateUserActiveStatus()V";
                    }

                    public final /* synthetic */ Object invoke() {
                        ((C35153b) this.receiver).mo73270a();
                        return C52860x.f131107a;
                    }
                }));
                return C52860x.f131107a;
            }
        };
        C52711k.m112240b(r0, "observer");
        sharePanelViewModel2.mo73285e().add(r0);
    }
}
