package com.p683ss.android.ugc.aweme.profile.p2085c;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13837e;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23485d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2085c.C39819c.C39820a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.c.b */
public final class C39815b extends C39807a implements C39978l, C39985s {

    /* renamed from: g */
    public static final C39816a f101598g = new C39816a(null);

    /* renamed from: d */
    public final C39948a f101599d;

    /* renamed from: e */
    public boolean f101600e;

    /* renamed from: f */
    public String f101601f;

    /* renamed from: h */
    private final int f101602h = -2;

    /* renamed from: i */
    private final String f101603i = "guide_profile_photo";

    /* renamed from: j */
    private DmtTextView f101604j;

    /* renamed from: k */
    private View f101605k;

    /* renamed from: l */
    private RemoteImageView f101606l;

    /* renamed from: m */
    private DmtTextView f101607m;

    /* renamed from: n */
    private final C39954ad f101608n;

    /* renamed from: o */
    private String f101609o;

    /* renamed from: p */
    private final int f101610p;

    /* renamed from: q */
    private HashMap f101611q;

    /* renamed from: com.ss.android.ugc.aweme.profile.c.b$a */
    public static final class C39816a {
        private C39816a() {
        }

        public /* synthetic */ C39816a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo80899a(C0654k kVar, Bundle bundle) {
            C52711k.m112240b(kVar, "fragmentManager");
            Fragment a = kVar.mo2224a("ProfileGuideFillAvatarDialogFragment");
            if (!(a instanceof C39815b)) {
                a = null;
            }
            C39815b bVar = (C39815b) a;
            if (bVar == null) {
                bVar = new C39815b();
            }
            if (bundle != null) {
                bVar.setArguments(bundle);
            }
            if (!bVar.isAdded()) {
                kVar.mo2225a().mo2178a((Fragment) bVar, "ProfileGuideFillAvatarDialogFragment").mo2195c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.b$b */
    static final class C39817b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39815b f101612a;

        C39817b(C39815b bVar) {
            this.f101612a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f101612a.f101600e) {
                C0654k fragmentManager = this.f101612a.getFragmentManager();
                if (fragmentManager != null) {
                    C39820a aVar = C39819c.f101614e;
                    C52711k.m112236a((Object) fragmentManager, "this");
                    aVar.mo80907a(fragmentManager, this.f101612a.getArguments());
                }
            }
            this.f101612a.dismiss(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.c.b$c */
    static final class C39818c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C39815b f101613a;

        C39818c(C39815b bVar) {
            this.f101613a = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (this.f101613a.f101587a) {
                C39815b bVar = this.f101613a;
                String str2 = "replace_profile_photo";
                C23089d a = C23089d.m56640a().mo47829a("enter_method", "click_guide");
                String str3 = "enter_from";
                Bundle arguments = bVar.getArguments();
                String str4 = null;
                if (arguments != null) {
                    str = arguments.getString("enter_from");
                } else {
                    str = null;
                }
                C23089d a2 = a.mo47829a(str3, str);
                String str5 = "enter_method";
                Bundle arguments2 = bVar.getArguments();
                if (arguments2 != null) {
                    str4 = arguments2.getString("enter_method");
                }
                C26890h.m65011a(str2, a2.mo47829a(str5, str4).f61491a);
                C26890h.m65011a("change_profile_photo", C23089d.m56640a().mo47829a("enter_method", "click_guide").f61491a);
                if (C52711k.m112239a((Object) this.f101613a.f101601f, (Object) "show_type_profile_post_guide")) {
                    C39948a aVar = this.f101613a.f101599d;
                    short[] sArr = {0, 1};
                    if (aVar.f101826b != null) {
                        aVar.f101826b.mo82826a(0, (int) R.array.b7, sArr);
                    }
                    return;
                }
                this.f101613a.f101599d.mo81846b(0);
            }
        }
    }

    /* renamed from: a */
    public final int mo80886a() {
        return this.f101602h;
    }

    /* renamed from: b */
    public final String mo80887b() {
        return this.f101603i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo80890d() {
    }

    /* renamed from: f */
    public final void mo80893f() {
        if (this.f101611q != null) {
            this.f101611q.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo80893f();
    }

    public C39815b() {
        C39948a aVar = new C39948a();
        aVar.f101827c = this;
        this.f101599d = aVar;
        C39954ad adVar = new C39954ad();
        adVar.mo81850a((C39985s) this);
        this.f101608n = adVar;
        this.f101610p = C23728o.m58241a(1.0d);
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        this.f101600e = g.getCurUser().nicknameUpdateReminder();
        this.f101601f = "show_type_default";
    }

    /* renamed from: a */
    public final void mo54362a(boolean z) {
        if (this.f101587a) {
            this.f101599d.mo81848e();
        }
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
        if (this.f101587a) {
            if (avatarUri == null) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cq).mo19066a();
            } else {
                this.f101608n.mo81855b(avatarUri.uri);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.f101599d.mo80925b(activity, this);
        }
    }

    /* renamed from: a */
    private final void m88538a(User user) {
        RemoteImageView remoteImageView = this.f101606l;
        if (remoteImageView == null) {
            C52711k.m112237a("mUploadAvatarImageView");
        }
        C23515d.m57669a(remoteImageView, user.getAvatarMedium());
        RemoteImageView remoteImageView2 = this.f101606l;
        if (remoteImageView2 == null) {
            C52711k.m112237a("mUploadAvatarImageView");
        }
        C13833a aVar = (C13833a) remoteImageView2.getHierarchy();
        C52711k.m112236a((Object) aVar, "mUploadAvatarImageView.hierarchy");
        C13837e eVar = aVar.f36079a;
        if (eVar != null) {
            Context context = getContext();
            if (context == null) {
                context = C11010c.m22280a();
            }
            eVar.mo25938b(C0726c.m2098c(context, R.color.auv));
            eVar.mo25939c((float) this.f101610p);
        }
        DmtTextView dmtTextView = this.f101607m;
        if (dmtTextView == null) {
            C52711k.m112237a("mUploadAvatarTextView");
        }
        dmtTextView.setText(R.string.zm);
        DmtTextView dmtTextView2 = this.f101607m;
        if (dmtTextView2 == null) {
            C52711k.m112237a("mUploadAvatarTextView");
        }
        Context context2 = getContext();
        if (context2 == null) {
            context2 = C11010c.m22280a();
        }
        dmtTextView2.setTextColor(C0726c.m2098c(context2, R.color.avs));
        DmtTextView dmtTextView3 = this.f101604j;
        if (dmtTextView3 == null) {
            C52711k.m112237a("mAction");
        }
        dmtTextView3.setEnabled(true);
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
        mo80888b(false);
        if (this.f101587a) {
            this.f101599d.mo81848e();
            C22971a.m56494a(getActivity(), exc, R.string.cq);
        }
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
        if (this.f101587a) {
            C39948a aVar = this.f101599d;
            if (aVar.f101826b != null) {
                aVar.f101826b.mo82833c();
            }
            this.f101609o = str;
            this.f101599d.mo81847d();
        }
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        mo80888b(true);
        if (this.f101587a) {
            this.f101599d.mo81848e();
            if (i == 4) {
                if (user != null) {
                    m88538a(user);
                }
                Context context = getContext();
                if (context == null) {
                    context = C11010c.m22280a();
                }
                C10691a.m21533a(context, (int) R.string.czi).mo19066a();
                C47718bf.m103288a(new C23485d());
            }
        }
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        mo80888b(false);
        if (this.f101587a) {
            this.f101599d.mo81848e();
            if (4 == i && (exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 20022) {
                C18898c.m46009a(getContext(), "profile_image_setting", "review_failure");
            }
            if (i != 116) {
                C22971a.m56494a(getContext(), exc, R.string.czy);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r6 == null) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r5, android.os.Bundle r6) {
        /*
            r4 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            super.onViewCreated(r5, r6)
            android.os.Bundle r6 = r4.getArguments()
            if (r6 == 0) goto L_0x0016
            java.lang.String r0 = "show_type"
            java.lang.String r6 = r6.getString(r0)
            if (r6 != 0) goto L_0x0018
        L_0x0016:
            java.lang.String r6 = "show_type_default"
        L_0x0018:
            r4.f101601f = r6
            r6 = 2132017180(0x7f14001c, float:1.9672631E38)
            android.view.View r6 = r5.findViewById(r6)
            java.lang.String r0 = "rootView.findViewById(R.id.action)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            r4.f101604j = r6
            r6 = 2132020543(0x7f140d3f, float:1.9679452E38)
            android.view.View r6 = r5.findViewById(r6)
            java.lang.String r0 = "rootView.findViewById(R.id.layout_upload_avatar)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            r4.f101605k = r6
            r6 = 2132019625(0x7f1409a9, float:1.967759E38)
            android.view.View r6 = r5.findViewById(r6)
            java.lang.String r0 = "rootView.findViewById(R.id.image_upload_avatar)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r6 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r6
            r4.f101606l = r6
            r6 = 2132023332(0x7f141824, float:1.9685109E38)
            android.view.View r5 = r5.findViewById(r6)
            java.lang.String r6 = "rootView.findViewById(R.id.text_upload_avatar)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5
            r4.f101607m = r5
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r4.f101604j
            if (r5 != 0) goto L_0x0061
            java.lang.String r6 = "mAction"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0061:
            com.ss.android.ugc.aweme.profile.c.b$b r6 = new com.ss.android.ugc.aweme.profile.c.b$b
            r6.<init>(r4)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
            android.view.View r5 = r4.f101605k
            if (r5 != 0) goto L_0x0074
            java.lang.String r6 = "mUploadAvatarLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x0074:
            com.ss.android.ugc.aweme.w.a r6 = new com.ss.android.ugc.aweme.w.a
            r0 = 1056964608(0x3f000000, float:0.5)
            r1 = 0
            r3 = 0
            r6.<init>(r0, r1, r3)
            android.view.View$OnTouchListener r6 = (android.view.View.OnTouchListener) r6
            r5.setOnTouchListener(r6)
            android.view.View r5 = r4.f101605k
            if (r5 != 0) goto L_0x008c
            java.lang.String r6 = "mUploadAvatarLayout"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x008c:
            com.ss.android.ugc.aweme.profile.c.b$c r6 = new com.ss.android.ugc.aweme.profile.c.b$c
            r6.<init>(r4)
            android.view.View$OnClickListener r6 = (android.view.View.OnClickListener) r6
            r5.setOnClickListener(r6)
            java.lang.String r5 = r4.f101601f
            java.lang.String r6 = "show_type_profile_post_guide"
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r5, r6)
            if (r5 == 0) goto L_0x00e3
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r6 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getCurUser()
            boolean r5 = r5.avatarUpdateReminder()
            if (r5 != 0) goto L_0x00e3
            com.ss.android.ugc.aweme.IAccountUserService r5 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r6 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getCurUser()
            java.lang.String r6 = "AccountProxyService.userService().curUser"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            r4.m88538a(r5)
            android.view.View r5 = r4.getView()
            if (r5 == 0) goto L_0x00df
            r6 = 2132023392(0x7f141860, float:1.968523E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00df
            r6 = 2132547921(0x7f1c1951, float:2.0749102E38)
            r5.setText(r6)
        L_0x00df:
            r5 = 1
            r4.f101600e = r5
            goto L_0x00f2
        L_0x00e3:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r4.f101606l
            if (r5 != 0) goto L_0x00ec
            java.lang.String r6 = "mUploadAvatarImageView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00ec:
            r6 = 2131954388(0x7f130ad4, float:1.9545274E38)
            com.p683ss.android.ugc.aweme.base.C23515d.m57668a(r5, r6)
        L_0x00f2:
            boolean r5 = r4.f101600e
            if (r5 == 0) goto L_0x0105
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = r4.f101604j
            if (r5 != 0) goto L_0x00ff
            java.lang.String r6 = "mAction"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00ff:
            r6 = 2132542467(0x7f1c0403, float:2.073804E38)
            r5.setText(r6)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2085c.C39815b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        mo80888b(false);
        if (this.f101587a) {
            this.f101599d.mo81848e();
            if (!TextUtils.isEmpty(str)) {
                Context context = getContext();
                if (context == null) {
                    context = C11010c.m22280a();
                }
                C10691a.m21545b(context, str).mo19066a();
                if (z) {
                    dismiss(false);
                }
            }
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f101599d.mo80923a(i, i2, intent);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.b9c, viewGroup, false);
    }
}
