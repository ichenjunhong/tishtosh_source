package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.android.live.C2940a;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.C4494aa;
import com.bytedance.android.livesdk.chatroom.api.StickerDonationRetrofitApi;
import com.bytedance.android.livesdk.chatroom.event.C5165ak;
import com.bytedance.android.livesdk.chatroom.presenter.C5817be;
import com.bytedance.android.livesdk.chatroom.presenter.C5817be.C5818a;
import com.bytedance.android.livesdk.chatroom.presenter.C5817be.C5819b;
import com.bytedance.android.livesdk.chatroom.presenter.C5817be.C5820c;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.widget.C8555i;
import com.bytedance.android.livesdkapi.depend.model.live.C8720t;
import com.bytedance.ies.p672e.C10753b;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.C1673aa;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p2628d.C52856t;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dn */
public final class C6107dn extends C2940a implements OnClickListener, C5818a {

    /* renamed from: a */
    private final String f16366a = "live.mt.sticker_donation_list_guide.shown";

    /* renamed from: b */
    private final C5817be f16367b;

    /* renamed from: c */
    private boolean f16368c;

    /* renamed from: d */
    private C1689b f16369d;

    /* renamed from: e */
    private boolean f16370e;

    /* renamed from: f */
    private boolean f16371f;

    /* renamed from: g */
    private boolean f16372g;

    /* renamed from: h */
    private final FragmentActivity f16373h;

    /* renamed from: i */
    private final boolean f16374i;

    /* renamed from: j */
    private HashMap f16375j;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dn$a */
    static final class C6108a<T> implements C1710e<C5165ak> {

        /* renamed from: a */
        final /* synthetic */ C6107dn f16376a;

        C6108a(C6107dn dnVar) {
            this.f16376a = dnVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            C5165ak akVar = (C5165ak) obj;
            if (akVar != null) {
                this.f16376a.onEvent(akVar);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dn$b */
    static final class C6109b implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6107dn f16377a;

        /* renamed from: b */
        final /* synthetic */ C5165ak f16378b;

        C6109b(C6107dn dnVar, C5165ak akVar) {
            this.f16377a = dnVar;
            this.f16378b = akVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r9, int r10) {
            /*
                r8 = this;
                r9.dismiss()
                com.bytedance.android.livesdk.chatroom.ui.dn r9 = r8.f16377a
                com.bytedance.android.livesdk.chatroom.event.ak r10 = r8.f16378b
                com.bytedance.android.livesdkapi.depend.model.live.s r10 = r10.f13845a
                com.bytedance.android.livesdkapi.depend.model.live.u r0 = new com.bytedance.android.livesdkapi.depend.model.live.u
                r0.<init>()
                java.lang.String r1 = r10.f23933e
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L_0x001f
                boolean r1 = p2628d.p2650m.C52830p.m112402a(r1)
                if (r1 == 0) goto L_0x001d
                goto L_0x001f
            L_0x001d:
                r1 = 0
                goto L_0x0020
            L_0x001f:
                r1 = 1
            L_0x0020:
                r4 = 0
                if (r1 != 0) goto L_0x003f
                java.lang.String r1 = r10.f23933e
                android.net.Uri r1 = android.net.Uri.parse(r1)
                java.lang.String r6 = "campaignId"
                java.lang.String r1 = r1.getQueryParameter(r6)
                if (r1 != 0) goto L_0x0034
                java.lang.String r1 = ""
            L_0x0034:
                java.lang.Long r1 = p2628d.p2650m.C52830p.m112396d(r1)
                if (r1 == 0) goto L_0x003f
                long r6 = r1.longValue()
                goto L_0x0040
            L_0x003f:
                r6 = r4
            L_0x0040:
                int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r1 <= 0) goto L_0x0045
                goto L_0x0050
            L_0x0045:
                java.lang.String r1 = r10.f23929a
                if (r1 != 0) goto L_0x004b
                java.lang.String r1 = ""
            L_0x004b:
                int r1 = r1.hashCode()
                long r6 = (long) r1
            L_0x0050:
                r0.f23947h = r6
                r1 = 3
                r0.f23946g = r1
                com.google.gson.f r1 = com.bytedance.android.live.C2942b.m8369a()
                java.lang.String r10 = r1.mo34889b(r10)
                r0.f23943d = r10
                r9.dismissAllowingStateLoss()
                com.bytedance.android.livesdk.aa.a r9 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
                com.bytedance.android.livesdk.chatroom.event.au r10 = new com.bytedance.android.livesdk.chatroom.event.au
                r10.<init>()
                r9.mo10301a(r10)
                com.bytedance.android.livesdk.aa.a r9 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
                com.bytedance.android.livesdk.chatroom.event.aj r10 = new com.bytedance.android.livesdk.chatroom.event.aj
                r10.<init>(r0)
                r9.mo10301a(r10)
                com.bytedance.android.livesdk.o.c r9 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
                java.lang.String r10 = "livesdk_donation_stick_setting_success"
                java.lang.Object[] r0 = new java.lang.Object[r3]
                java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r1 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                r0[r2] = r1
                r9.mo14203a(r10, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6107dn.C6109b.onClick(android.content.DialogInterface, int):void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dn$c */
    static final class C6110c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final C6110c f16379a = new C6110c();

        C6110c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dn$d */
    static final class C6111d implements OnDismissListener {

        /* renamed from: a */
        public static final C6111d f16380a = new C6111d();

        C6111d() {
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C4494aa.m10815a().mo10296c();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dn$e */
    static final class C6112e implements OnShowListener {

        /* renamed from: a */
        public static final C6112e f16381a = new C6112e();

        C6112e() {
        }

        public final void onShow(DialogInterface dialogInterface) {
            C4494aa.m10815a().mo10295b();
        }
    }

    /* renamed from: a */
    private View m13277a(int i) {
        if (this.f16375j == null) {
            this.f16375j = new HashMap();
        }
        View view = (View) this.f16375j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f16375j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f16375j != null) {
            this.f16375j.clear();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f16368c = false;
        this.f16367b.mo8247a();
        this.f16369d.dispose();
        this.f16369d.mo6180a();
    }

    /* renamed from: a */
    private final void m13278a() {
        String str;
        RecyclerView recyclerView = (RecyclerView) m13277a((int) R.id.exu);
        if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
        View a = m13277a((int) R.id.bhy);
        if (a != null) {
            a.setVisibility(0);
        }
        ProgressBar progressBar = (ProgressBar) m13277a((int) R.id.c62);
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        TextView textView = (TextView) m13277a((int) R.id.cbv);
        if (textView != null) {
            textView.setVisibility(8);
        }
        C5817be beVar = this.f16367b;
        Map a2 = C52550ab.m112050a(C52856t.m112465a("cursor", "0"), C52856t.m112465a("count", "11"));
        C52711k.m112240b(a2, "map");
        StringBuilder sb = new StringBuilder();
        if ("tiktok".contains("tiktok")) {
            str = TutorialVideoApiManager.f96873a;
        } else {
            str = "https://api2.musical.ly";
        }
        sb.append(str);
        sb.append("/aweme/v1/donation/orgs");
        beVar.f15270a.mo6181a(((StickerDonationRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(StickerDonationRetrofitApi.class)).fetchStickerDonation(sb.toString(), a2).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5819b<Object>(beVar), (C1710e<? super Throwable>) new C5820c<Object>(beVar)));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f16368c = true;
        setStyle(1, R.style.xy);
        this.f16369d.mo6181a(C4495a.m10823a().mo10300a(C5165ak.class).mo6545f((C1710e<? super T>) new C6108a<Object>(this)));
        C10753b a = C10753b.m21793a(getContext());
        boolean z = false;
        if (a != null) {
            z = a.mo19444a(this.f16366a, false);
        }
        this.f16370e = z;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        C52711k.m112236a((Object) onCreateDialog, "super.onCreateDialog(savedInstanceState)");
        onCreateDialog.requestWindowFeature(1);
        onCreateDialog.setCanceledOnTouchOutside(true);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            double b = (double) C3922z.m9908b();
            Double.isNaN(b);
            attributes.height = (int) (b * 0.7d);
            window.setAttributes(attributes);
        }
        return onCreateDialog;
    }

    /* renamed from: a */
    public final void mo11697a(C8720t tVar) {
        C52711k.m112240b(tVar, "organizationResponse");
        if (this.f16368c) {
            RecyclerView recyclerView = (RecyclerView) m13277a((int) R.id.exu);
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            View a = m13277a((int) R.id.bhy);
            if (a != null) {
                a.setVisibility(8);
            }
            RecyclerView recyclerView2 = (RecyclerView) m13277a((int) R.id.exu);
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(new C6196fe(this.f16373h, tVar, this.f16374i));
            }
            RecyclerView recyclerView3 = (RecyclerView) m13277a((int) R.id.exu);
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            }
        }
    }

    public final void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.cbv) {
            m13278a();
        } else if (num != null && num.intValue() == R.id.ex9) {
            if (this.f16374i || this.f16370e) {
                dismissAllowingStateLoss();
            } else {
                m13279a(false);
            }
        } else if (num != null && num.intValue() == R.id.exf) {
            m13279a(true);
        } else {
            if (num != null && num.intValue() == R.id.exd) {
                dismissAllowingStateLoss();
            }
        }
    }

    public final void onEvent(C5165ak akVar) {
        if (akVar.f13845a != null) {
            C8555i.m16887a();
            C8555i.m16886a(getContext()).mo15013d((CharSequence) C3922z.m9905a((int) R.string.h0p, akVar.f13845a.f23929a)).mo15008c((int) R.string.h0q).mo15003b(0, (int) R.string.h0r, (DialogInterface.OnClickListener) new C6109b(this, akVar)).mo15003b(1, (int) R.string.e45, (DialogInterface.OnClickListener) C6110c.f16379a).mo15005b((OnDismissListener) C6111d.f16380a).mo15006b((OnShowListener) C6112e.f16381a).mo15011d();
        }
    }

    /* renamed from: a */
    private final void m13279a(boolean z) {
        int i;
        int i2;
        ConstraintLayout constraintLayout = (ConstraintLayout) m13277a((int) R.id.exk);
        int i3 = 8;
        if (constraintLayout != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            constraintLayout.setVisibility(i2);
        }
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.exe);
        if (viewStub != null) {
            if (z) {
                i = 8;
            } else {
                i = 0;
            }
            viewStub.setVisibility(i);
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) m13277a((int) R.id.exc);
        if (constraintLayout2 != null) {
            if (!z) {
                i3 = 0;
            }
            constraintLayout2.setVisibility(i3);
        }
        if (z && !this.f16371f) {
            m13278a();
            this.f16371f = true;
        }
        if (!z && !this.f16372g) {
            C10753b a = C10753b.m21793a(getContext());
            if (a != null) {
                a.mo19445b(this.f16366a, Boolean.valueOf(true));
            }
            TextView textView = (TextView) m13277a((int) R.id.exf);
            if (textView != null) {
                textView.setOnClickListener(this);
            }
            View a2 = m13277a((int) R.id.exd);
            if (a2 != null) {
                a2.setOnClickListener(this);
            }
            this.f16372g = true;
        }
    }

    /* renamed from: a */
    public final void mo11698a(Throwable th) {
        if (this.f16368c) {
            C4602l.m11047a(getContext(), th, (int) R.string.ev4);
            RecyclerView recyclerView = (RecyclerView) m13277a((int) R.id.exu);
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
            View a = m13277a((int) R.id.bhy);
            if (a != null) {
                a.setVisibility(0);
            }
            ProgressBar progressBar = (ProgressBar) m13277a((int) R.id.c62);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextView textView = (TextView) m13277a((int) R.id.cbv);
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public C6107dn(FragmentActivity fragmentActivity, boolean z) {
        C52711k.m112240b(fragmentActivity, "fragmentActivity");
        this.f16373h = fragmentActivity;
        this.f16374i = z;
        C5817be beVar = new C5817be();
        beVar.mo8520a(this);
        this.f16367b = beVar;
        this.f16369d = new C1689b();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        boolean z;
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) m13277a((int) R.id.cbv);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) m13277a((int) R.id.ex9);
        if (autoRTLImageView != null) {
            autoRTLImageView.setOnClickListener(this);
        }
        if (this.f16374i || this.f16370e) {
            z = true;
        } else {
            z = false;
        }
        m13279a(z);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.bw8, viewGroup);
    }
}
