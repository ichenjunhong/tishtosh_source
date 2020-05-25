package com.p683ss.android.ugc.aweme.p1807im.sdk.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.proto.GroupRole;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupAnnouncementEditActivity.C34086a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.C34015a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.Calendar;
import java.util.HashMap;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity */
public final class GroupAnnouncementActivity extends AmeActivity {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88100a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementActivity.class), "titleBar", "getTitleBar()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementActivity.class), "ivAvatar", "getIvAvatar()Lcom/ss/android/ugc/aweme/base/ui/AvatarImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementActivity.class), "tvUserName", "getTvUserName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementActivity.class), "dividerLine", "getDividerLine()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementActivity.class), "tvTime", "getTvTime()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupAnnouncementActivity.class), "tvAnnouncement", "getTvAnnouncement()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;"))};

    /* renamed from: c */
    public static final C34076a f88101c = new C34076a(null);

    /* renamed from: b */
    public String f88102b;

    /* renamed from: d */
    private final C52668f f88103d = C52732g.m112285a(new C34081f(this));

    /* renamed from: e */
    private final C52668f f88104e = C52732g.m112285a(new C34080e(this));

    /* renamed from: f */
    private final C52668f f88105f = C52732g.m112285a(new C34084i(this));

    /* renamed from: g */
    private final C52668f f88106g = C52732g.m112285a(new C34077b(this));

    /* renamed from: h */
    private final C52668f f88107h = C52732g.m112285a(new C34083h(this));

    /* renamed from: i */
    private final C52668f f88108i = C52732g.m112285a(new C34082g(this));

    /* renamed from: j */
    private String f88109j;

    /* renamed from: k */
    private HashMap f88110k;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$a */
    public static final class C34076a {
        private C34076a() {
        }

        public /* synthetic */ C34076a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$b */
    static final class C34077b extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f88111a;

        C34077b(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f88111a = groupAnnouncementActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f88111a.mo72041a((int) R.id.a6j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$c */
    static final class C34078c extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f88112a;

        C34078c(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f88112a = groupAnnouncementActivity;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f88112a.mo72044a(Integer.valueOf(((Number) obj).intValue()), false);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$d */
    public static final class C34079d implements C35356a {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f88113a;

        /* renamed from: c */
        public final void mo70671c() {
        }

        /* renamed from: a */
        public final void mo70669a() {
            this.f88113a.onBackPressed();
        }

        /* renamed from: b */
        public final void mo70670b() {
            String str;
            Context context = this.f88113a;
            String str2 = this.f88113a.f88102b;
            CharSequence text = this.f88113a.mo72042a().getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            C34086a.m77894a(context, str2, str);
        }

        C34079d(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f88113a = groupAnnouncementActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$e */
    static final class C34080e extends C52712l implements C52670a<AvatarImageView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f88114a;

        C34080e(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f88114a = groupAnnouncementActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AvatarImageView) this.f88114a.mo72041a((int) R.id.ay2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$f */
    static final class C34081f extends C52712l implements C52670a<ImTextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f88115a;

        C34081f(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f88115a = groupAnnouncementActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImTextTitleBar) this.f88115a.mo72041a((int) R.id.d10);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$g */
    static final class C34082g extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f88116a;

        C34082g(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f88116a = groupAnnouncementActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88116a.mo72041a((int) R.id.f1h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$h */
    static final class C34083h extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f88117a;

        C34083h(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f88117a = groupAnnouncementActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88117a.mo72041a((int) R.id.dh7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$i */
    static final class C34084i extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f88118a;

        C34084i(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f88118a = groupAnnouncementActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88118a.mo72041a((int) R.id.dic);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$j */
    static final class C34085j implements C34015a {

        /* renamed from: a */
        final /* synthetic */ GroupAnnouncementActivity f88119a;

        C34085j(GroupAnnouncementActivity groupAnnouncementActivity) {
            this.f88119a = groupAnnouncementActivity;
        }

        /* renamed from: a */
        public final void mo71969a(IMUser iMUser) {
            this.f88119a.mo72043a(iMUser);
        }
    }

    /* renamed from: b */
    private final ImTextTitleBar m77872b() {
        return (ImTextTitleBar) this.f88103d.getValue();
    }

    /* renamed from: c */
    private final AvatarImageView m77873c() {
        return (AvatarImageView) this.f88104e.getValue();
    }

    /* renamed from: d */
    private final DmtTextView m77874d() {
        return (DmtTextView) this.f88105f.getValue();
    }

    /* renamed from: e */
    private final View m77875e() {
        return (View) this.f88106g.getValue();
    }

    /* renamed from: f */
    private final DmtTextView m77876f() {
        return (DmtTextView) this.f88107h.getValue();
    }

    /* renamed from: a */
    public final View mo72041a(int i) {
        if (this.f88110k == null) {
            this.f88110k = new HashMap();
        }
        View view = (View) this.f88110k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88110k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final DmtTextView mo72042a() {
        return (DmtTextView) this.f88108i.getValue();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r7 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity"
            java.lang.String r1 = "onResume"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onResume()
            com.bytedance.im.core.c.d r0 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r1 = r7.f88102b
            com.bytedance.im.core.c.b r0 = r0.mo20658a(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "GroupAnnouncementActivity updateAnnouncement: "
            r1.<init>(r2)
            r2 = 0
            if (r0 == 0) goto L_0x004a
            com.bytedance.im.core.c.c r3 = r0.getCoreInfo()
            if (r3 == 0) goto L_0x004a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Map r5 = r3.getExt()
            java.lang.String r6 = "a:s_notice"
            java.lang.Object r5 = r5.get(r6)
            java.lang.String r5 = (java.lang.String) r5
            r4.append(r5)
            java.lang.String r5 = ", "
            r4.append(r5)
            java.lang.String r3 = r3.getNotice()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            goto L_0x004b
        L_0x004a:
            r3 = r2
        L_0x004b:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r1)
            if (r0 == 0) goto L_0x00bb
            com.bytedance.im.core.c.c r0 = r0.getCoreInfo()
            if (r0 == 0) goto L_0x00bb
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.mo72042a()
            java.lang.String r3 = r0.getNotice()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r1.setText(r3)
            java.util.Map r0 = r0.getExt()
            java.lang.String r1 = "a:s_notice"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00b8
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.group.model.b> r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34277b.class
            java.lang.Object r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79760a(r0, r1)     // Catch:{ Throwable -> 0x0081 }
            com.ss.android.ugc.aweme.im.sdk.group.model.b r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34277b) r0     // Catch:{ Throwable -> 0x0081 }
            goto L_0x0086
        L_0x0081:
            r0 = move-exception
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r0)
            r0 = r2
        L_0x0086:
            if (r0 == 0) goto L_0x00b4
            boolean r1 = r0.isValid()
            if (r1 == 0) goto L_0x00b4
            long r1 = r0.getUpdateTime()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7.m77871a(r1)
            com.ss.android.ugc.aweme.im.sdk.d.e r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            long r2 = r0.getUpdateUserId()
            java.lang.String r0 = java.lang.String.valueOf(r2)
            com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$j r2 = new com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity$j
            r2.<init>(r7)
            com.ss.android.ugc.aweme.im.sdk.d.e$a r2 = (com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.C34015a) r2
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r1.mo71953a(r0, r2)
            r7.mo72043a(r0)
            goto L_0x00bb
        L_0x00b4:
            r7.mo72043a(r2)
            goto L_0x00bb
        L_0x00b8:
            r7.mo72043a(r2)
        L_0x00bb:
            java.lang.String r0 = "com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity"
            java.lang.String r1 = "onResume"
            r2 = 0
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupAnnouncementActivity.onResume():void");
    }

    /* renamed from: a */
    private final void m77871a(String str) {
        if (str != null) {
            try {
                Calendar instance = Calendar.getInstance();
                instance.setTimeInMillis(Long.parseLong(str) * 1000);
                if (instance != null) {
                    DmtTextView f = m77876f();
                    StringBuilder sb = new StringBuilder();
                    sb.append(instance.get(1));
                    sb.append(24180);
                    sb.append(instance.get(2) + 1);
                    sb.append(26376);
                    sb.append(instance.get(5));
                    sb.append("日 ");
                    sb.append(instance.get(11));
                    sb.append(':');
                    sb.append(instance.get(12));
                    f.setText(sb.toString());
                }
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public final void mo72043a(IMUser iMUser) {
        int i;
        if (iMUser != null) {
            AvatarImageView c = m77873c();
            if (c == null) {
                C52711k.m112234a();
            }
            C23515d.m57669a((RemoteImageView) c, iMUser.getAvatarThumb());
            m77874d().setText(iMUser.getDisplayName());
            i = 0;
        } else {
            i = 8;
        }
        m77873c().setVisibility(i);
        m77874d().setVisibility(i);
        m77876f().setVisibility(i);
        m77875e().setVisibility(i);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bc1);
        C34004b.m77718b().setupStatusBar(this);
        Intent intent = getIntent();
        String str2 = null;
        if (intent != null) {
            str = intent.getStringExtra("conversationId");
        } else {
            str = null;
        }
        this.f88102b = str;
        CharSequence b = C35265e.m79730b();
        if (b != null) {
            str2 = b.toString();
        }
        this.f88109j = str2;
        if (!(this.f88102b == null || this.f88109j == null)) {
            C34237d a = C34238a.m78110a();
            String str3 = this.f88102b;
            if (str3 == null) {
                C52711k.m112234a();
            }
            String str4 = this.f88109j;
            if (str4 == null) {
                C52711k.m112234a();
            }
            Integer a2 = a.mo72223a(str3, str4);
            if (a2 != null) {
                mo72044a(Integer.valueOf(a2.intValue()), true);
            } else {
                C34238a.m78110a();
                String str5 = this.f88102b;
                if (str5 == null) {
                    C52711k.m112234a();
                }
                String str6 = this.f88109j;
                if (str6 == null) {
                    C52711k.m112234a();
                }
                C34237d.m78088a(str5, str6, (C52671b<? super Integer, C52860x>) new C34078c<Object,C52860x>(this));
            }
            m77872b().setTitle((int) R.string.a0l);
            m77872b().setOnTitlebarClickListener(new C34079d(this));
        }
        StringBuilder sb = new StringBuilder("GroupAnnouncementActivity onCreate: ");
        sb.append(this.f88102b);
        sb.append(", ");
        sb.append(this.f88109j);
        C32458a.m75144a(sb.toString());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo72044a(Integer num, boolean z) {
        int i;
        DmtTextView rightTexView = m77872b().getRightTexView();
        C52711k.m112236a((Object) rightTexView, "titleBar.rightTexView");
        int value = GroupRole.OWNER.getValue();
        if (num != null && value == num.intValue()) {
            i = 0;
        } else {
            i = 8;
        }
        rightTexView.setVisibility(i);
        StringBuilder sb = new StringBuilder("GroupAnnouncementActivity updateTitleBar: ");
        sb.append(num);
        sb.append(", ");
        sb.append(z);
        C32458a.m75144a(sb.toString());
    }
}
