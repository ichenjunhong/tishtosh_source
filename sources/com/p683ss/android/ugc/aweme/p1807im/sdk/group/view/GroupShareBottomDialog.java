package com.p683ss.android.ugc.aweme.p1807im.sdk.group.view;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11202k;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34147d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34278c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34032k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.RelationSelectActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35284t;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.Map;
import p001a.C0011g;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupShareBottomDialog */
public final class GroupShareBottomDialog extends BaseBottomShareDialog implements OnClickListener {

    /* renamed from: i */
    public static final C34299a f88556i = new C34299a(null);

    /* renamed from: g */
    public C11180b f88557g;

    /* renamed from: h */
    public String f88558h;

    /* renamed from: j */
    private boolean f88559j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupShareBottomDialog$a */
    public static final class C34299a {
        private C34299a() {
        }

        public /* synthetic */ C34299a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupShareBottomDialog$b */
    static final class C34300b extends C52712l implements C52682m<C11180b, C11202k, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupShareBottomDialog f88560a;

        /* renamed from: b */
        final /* synthetic */ int f88561b;

        /* renamed from: c */
        final /* synthetic */ C52682m f88562c;

        /* renamed from: d */
        final /* synthetic */ String f88563d;

        C34300b(GroupShareBottomDialog groupShareBottomDialog, int i, C52682m mVar, String str) {
            this.f88560a = groupShareBottomDialog;
            this.f88561b = i;
            this.f88562c = mVar;
            this.f88563d = str;
            super(2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
            if (r6 == null) goto L_0x0055;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                com.bytedance.im.core.c.b r5 = (com.bytedance.p702im.core.p706c.C11180b) r5
                com.bytedance.im.core.c.k r6 = (com.bytedance.p702im.core.p706c.C11202k) r6
                if (r5 == 0) goto L_0x0027
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupShareBottomDialog r6 = r4.f88560a
                r6.f88557g = r5
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupShareBottomDialog r6 = r4.f88560a
                java.lang.String r0 = r5.getConversationId()
                r6.f88558h = r0
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupShareBottomDialog r6 = r4.f88560a
                int r0 = r4.f88561b
                d.f.a.m r1 = r4.f88562c
                r6.mo72327a(r5, r0, r1)
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupShareBottomDialog r5 = r4.f88560a
                java.lang.String r5 = r5.f88558h
                java.lang.String r6 = "success"
                java.lang.String r0 = r4.f88563d
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79510f(r5, r6, r0)
                goto L_0x0060
            L_0x0027:
                com.ss.android.ugc.aweme.im.sdk.group.view.GroupShareBottomDialog r5 = r4.f88560a
                java.lang.String r5 = r5.f88558h
                java.lang.String r0 = "failure"
                java.lang.String r1 = r4.f88563d
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79510f(r5, r0, r1)
                r5 = 0
                if (r6 == 0) goto L_0x0038
                java.lang.String r6 = r6.f30207e
                goto L_0x0039
            L_0x0038:
                r6 = r5
            L_0x0039:
                java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.model.d> r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d.class
                java.lang.Object r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79760a(r6, r0)
                com.ss.android.ugc.aweme.im.sdk.group.model.d r6 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d) r6
                r0 = 0
                if (r6 == 0) goto L_0x0055
                d.f.a.m r1 = r4.f88562c
                if (r1 == 0) goto L_0x0053
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                java.lang.String r3 = r6.getStatusMsg()
                r1.invoke(r2, r3)
            L_0x0053:
                if (r6 != 0) goto L_0x0060
            L_0x0055:
                d.f.a.m r6 = r4.f88562c
                if (r6 == 0) goto L_0x0060
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r6.invoke(r0, r5)
            L_0x0060:
                d.x r5 = p2628d.C52860x.f131107a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.GroupShareBottomDialog.C34300b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupShareBottomDialog$c */
    static final class C34301c extends C52712l implements C52682m<Boolean, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupShareBottomDialog f88564a;

        /* renamed from: b */
        final /* synthetic */ String f88565b;

        /* renamed from: c */
        final /* synthetic */ String f88566c;

        /* renamed from: d */
        final /* synthetic */ String f88567d;

        C34301c(GroupShareBottomDialog groupShareBottomDialog, String str, String str2, String str3) {
            this.f88564a = groupShareBottomDialog;
            this.f88565b = str;
            this.f88566c = str2;
            this.f88567d = str3;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj2;
            if (((Boolean) obj).booleanValue()) {
                this.f88564a.mo72326a(1);
                C35190af.m79499d(this.f88565b, this.f88564a.f88558h, "cell", "success");
                C35284t a = C35284t.m79782a();
                C52711k.m112236a((Object) a, "IMSPUtils.get()");
                a.mo73428i(3);
                C34032k.m77795a().mo71988e();
                this.f88564a.dismiss();
                C34004b a2 = C34004b.m77717a();
                C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
                a2.mo71949f().shareToTargetChannel(this.f88564a.f88523d, this.f88566c);
            } else {
                this.f88564a.mo72326a(2);
                C35190af.m79499d(this.f88565b, this.f88564a.f88558h, "cell", "failure");
                Context context = this.f88564a.f88523d;
                if (str == null) {
                    str = this.f88564a.f88523d.getResources().getString(R.string.bh3);
                }
                C10691a.m21551c(context, str).mo19066a();
            }
            C35190af.m79524i(this.f88567d, this.f88564a.f88558h, "cell");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupShareBottomDialog$d */
    static final class C34302d<TTaskResult, TContinuationResult> implements C0011g<C34147d, Void> {

        /* renamed from: a */
        final /* synthetic */ GroupShareBottomDialog f88568a;

        /* renamed from: b */
        final /* synthetic */ int f88569b;

        /* renamed from: c */
        final /* synthetic */ C52682m f88570c;

        C34302d(GroupShareBottomDialog groupShareBottomDialog, int i, C52682m mVar) {
            this.f88568a = groupShareBottomDialog;
            this.f88569b = i;
            this.f88570c = mVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fb, code lost:
            if (r11 == null) goto L_0x00fd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x010d, code lost:
            if (r11 == null) goto L_0x010f;
         */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x0113  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r11) {
            /*
                r10 = this;
                java.lang.String r0 = "task"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                boolean r0 = r11.mo26b()
                r1 = 0
                r2 = 0
                if (r0 == 0) goto L_0x011b
                java.lang.Object r0 = r11.mo34e()
                com.ss.android.ugc.aweme.im.sdk.detail.b.d r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34147d) r0
                if (r0 == 0) goto L_0x011b
                int r0 = r0.status_code
                if (r0 != 0) goto L_0x011b
                java.lang.Object r11 = r11.mo34e()
                com.ss.android.ugc.aweme.im.sdk.detail.b.d r11 = (com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34147d) r11
                r0 = 1
                if (r11 == 0) goto L_0x0054
                com.ss.android.ugc.aweme.im.sdk.detail.b.c r11 = r11.getGroupPasswordInfo()
                if (r11 == 0) goto L_0x0054
                java.util.List r11 = r11.getGroupPasswordDetailList()
                if (r11 == 0) goto L_0x0054
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.Iterator r11 = r11.iterator()
            L_0x0034:
                boolean r3 = r11.hasNext()
                if (r3 == 0) goto L_0x004f
                java.lang.Object r3 = r11.next()
                r4 = r3
                com.ss.android.ugc.aweme.im.sdk.detail.b.b r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34145b) r4
                int r4 = r4.getShareChannel()
                int r5 = r10.f88569b
                if (r4 != r5) goto L_0x004b
                r4 = 1
                goto L_0x004c
            L_0x004b:
                r4 = 0
            L_0x004c:
                if (r4 == 0) goto L_0x0034
                goto L_0x0050
            L_0x004f:
                r3 = r2
            L_0x0050:
                r11 = r3
                com.ss.android.ugc.aweme.im.sdk.detail.b.b r11 = (com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34145b) r11
                goto L_0x0055
            L_0x0054:
                r11 = r2
            L_0x0055:
                if (r11 == 0) goto L_0x010f
                java.lang.String r3 = r11.getDescription()
                if (r3 == 0) goto L_0x00fd
                r4 = r3
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                java.lang.String r5 = "\n"
                r6 = 0
                r7 = 0
                r8 = 6
                r9 = 0
                int r4 = p2628d.p2650m.C52830p.m112419a(r4, r5, r6, r7, r8, r9)
                int r4 = r4 + r0
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>(r3)
                com.ss.android.ugc.aweme.profile.model.User r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79732c()
                com.ss.android.ugc.aweme.im.service.model.IMUser r3 = com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser.fromUser(r3)
                java.lang.String r6 = "IMUser.fromUser(AppUtil.getCurrentUser())"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
                java.lang.String r3 = r3.getDisplayName()
                java.lang.StringBuilder r3 = r5.insert(r4, r3)
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = r11.getToken()
                android.app.Activity r11 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
                r5 = r4
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                if (r5 == 0) goto L_0x009f
                int r5 = r5.length()
                if (r5 != 0) goto L_0x009d
                goto L_0x009f
            L_0x009d:
                r5 = 0
                goto L_0x00a0
            L_0x009f:
                r5 = 1
            L_0x00a0:
                if (r5 != 0) goto L_0x00eb
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                if (r3 == 0) goto L_0x00af
                int r5 = r3.length()
                if (r5 != 0) goto L_0x00ad
                goto L_0x00af
            L_0x00ad:
                r5 = 0
                goto L_0x00b0
            L_0x00af:
                r5 = 1
            L_0x00b0:
                if (r5 != 0) goto L_0x00eb
                if (r11 == 0) goto L_0x00eb
                boolean r5 = r11.isFinishing()
                if (r5 == 0) goto L_0x00bb
                goto L_0x00eb
            L_0x00bb:
                java.lang.String r5 = "clipboard"
                java.lang.Object r11 = r11.getSystemService(r5)
                android.content.ClipboardManager r11 = (android.content.ClipboardManager) r11
                java.lang.String r5 = ""
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                android.content.ClipData r3 = android.content.ClipData.newPlainText(r5, r3)
                if (r11 == 0) goto L_0x00d0
                r11.setPrimaryClip(r3)
            L_0x00d0:
                com.ss.android.ugc.aweme.im.sdk.d.b r11 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b.m77717a()
                java.lang.String r3 = "AwemeImManager.instance()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r3)
                com.ss.android.ugc.aweme.im.service.j r11 = r11.mo71949f()
                java.lang.String r5 = "\n"
                java.lang.String r6 = ""
                r7 = 0
                r8 = 4
                r9 = 0
                java.lang.String r3 = p2628d.p2650m.C52830p.m112401a(r4, r5, r6, r7, r8, r9)
                r11.saveShareCommandToSp(r3)
            L_0x00eb:
                d.f.a.m r11 = r10.f88570c
                if (r11 == 0) goto L_0x00fa
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                java.lang.Object r11 = r11.invoke(r0, r2)
                d.x r11 = (p2628d.C52860x) r11
                goto L_0x00fb
            L_0x00fa:
                r11 = r2
            L_0x00fb:
                if (r11 != 0) goto L_0x010d
            L_0x00fd:
                d.f.a.m r11 = r10.f88570c
                if (r11 == 0) goto L_0x010c
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                java.lang.Object r11 = r11.invoke(r0, r2)
                d.x r11 = (p2628d.C52860x) r11
                goto L_0x010d
            L_0x010c:
                r11 = r2
            L_0x010d:
                if (r11 != 0) goto L_0x0126
            L_0x010f:
                d.f.a.m r11 = r10.f88570c
                if (r11 == 0) goto L_0x0126
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                r11.invoke(r0, r2)
                goto L_0x0126
            L_0x011b:
                d.f.a.m r11 = r10.f88570c
                if (r11 == 0) goto L_0x0126
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                r11.invoke(r0, r2)
            L_0x0126:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.GroupShareBottomDialog.C34302d.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: b */
    public final int mo42942b() {
        return R.layout.bcg;
    }

    public final void show() {
        super.show();
        C35190af.m79501e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo72312c() {
        super.mo72312c();
        OnClickListener onClickListener = this;
        ((LinearLayout) findViewById(R.id.edd)).setOnClickListener(onClickListener);
        ((LinearLayout) findViewById(R.id.edc)).setOnClickListener(onClickListener);
        ((DmtTextView) findViewById(R.id.edb)).setOnClickListener(onClickListener);
        ((ImageView) findViewById(R.id.ue)).setOnClickListener(onClickListener);
        StringBuilder sb = new StringBuilder();
        sb.append("🍟🍕😉🍍😇😉");
        sb.append("\n");
        sb.append("🍛🍥😗🍊😘😃");
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.dd9);
        C52711k.m112236a((Object) dmtTextView, "tv_password");
        dmtTextView.setText(sb.toString());
    }

    /* renamed from: c */
    private final void m78203c(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        if (i == 3) {
            str = "qq";
        } else {
            str = "weixin";
        }
        if (i == 3) {
            str2 = "com.tencent.mobileqq";
        } else {
            str2 = "com.tencent.mm";
        }
        if (i == 3) {
            str3 = "group_qq_command_copy_click";
        } else {
            str3 = "group_wx_command_copy_click";
        }
        if (i == 3) {
            str4 = "group_qq_invite_click";
        } else {
            str4 = "group_wx_invite_click";
        }
        if (C18920g.m46052b(this.f88523d, str2)) {
            m78202a(i, new C34301c(this, str3, str, str4));
            mo72326a(0);
            return;
        }
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        a.mo71949f().shareToTargetChannel(this.f88523d, str);
        C35190af.m79524i(str4, this.f88558h, "cell");
        C35190af.m79499d(str3, this.f88558h, "cell", "failure");
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.edd) {
            m78203c(1);
        } else if (num != null && num.intValue() == R.id.edc) {
            m78203c(3);
        } else if (num != null && num.intValue() == R.id.edb) {
            dismiss();
            RelationSelectActivity.m78823a(this.f88523d, "cell_onsite");
            C35190af.m79538t("cell");
        } else {
            if (num != null && num.intValue() == R.id.ue) {
                dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo72326a(int i) {
        switch (i) {
            case 0:
                DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.f4i);
                C52711k.m112236a((Object) dmtTextView, "tv_status");
                dmtTextView.setVisibility(0);
                DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.dd9);
                C52711k.m112236a((Object) dmtTextView2, "tv_password");
                dmtTextView2.setVisibility(4);
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.edd);
                linearLayout.setAlpha(0.5f);
                linearLayout.setEnabled(false);
                LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.edc);
                linearLayout2.setAlpha(0.5f);
                linearLayout2.setEnabled(false);
                DmtTextView dmtTextView3 = (DmtTextView) findViewById(R.id.edb);
                dmtTextView3.setAlpha(0.5f);
                dmtTextView3.setEnabled(false);
                return;
            case 1:
            case 2:
                DmtTextView dmtTextView4 = (DmtTextView) findViewById(R.id.f4i);
                C52711k.m112236a((Object) dmtTextView4, "tv_status");
                dmtTextView4.setVisibility(8);
                DmtTextView dmtTextView5 = (DmtTextView) findViewById(R.id.dd9);
                C52711k.m112236a((Object) dmtTextView5, "tv_password");
                dmtTextView5.setVisibility(0);
                LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.edd);
                linearLayout3.setAlpha(1.0f);
                linearLayout3.setEnabled(true);
                LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.edc);
                linearLayout4.setAlpha(1.0f);
                linearLayout4.setEnabled(true);
                DmtTextView dmtTextView6 = (DmtTextView) findViewById(R.id.edb);
                dmtTextView6.setAlpha(1.0f);
                dmtTextView6.setEnabled(true);
                break;
        }
    }

    /* renamed from: a */
    private final void m78202a(int i, C52682m<? super Boolean, ? super String, C52860x> mVar) {
        String str;
        if (this.f88557g != null) {
            mo72327a(this.f88557g, i, mVar);
            return;
        }
        if (i == 3) {
            str = "cell_qq";
        } else {
            str = "cell_wx";
        }
        C34238a.m78110a().mo72230a(C52575l.m112092a(IMUser.fromUser(C35265e.m79732c())), (Map<String, String>) C34278c.m78179a(6, 1), false, (C52682m<? super C11180b, ? super C11202k, C52860x>) new C34300b<Object,Object,C52860x>(this, i, mVar, str));
    }

    /* renamed from: a */
    public final void mo72327a(C11180b bVar, int i, C52682m<? super Boolean, ? super String, C52860x> mVar) {
        if (bVar != null) {
            if (this.f88559j) {
                this.f88559j = false;
                C34238a.m78110a();
                C34237d.m78090b(bVar);
            }
            C35286u.m79868a(12, 2, bVar.getConversationId(), (C0011g<C34147d, Void>) new C34302d<C34147d,Void>(this, i, mVar));
        }
    }
}
