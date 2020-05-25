package com.p683ss.android.ugc.aweme.p1807im.sdk.detail;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11200i;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11206o;
import com.bytedance.p702im.core.proto.GroupRole;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33368b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupAnnouncementEditActivity.C34086a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1831a.C34137c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34144a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34150g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34313e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34007c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35221bc.C35225a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity */
public final class GroupChatDetailActivity extends BaseChatDetailActivity implements OnClickListener {

    /* renamed from: f */
    static final /* synthetic */ C52767h[] f88151f = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mAvatarListView", "getMAvatarListView()Landroid/support/v7/widget/RecyclerView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mMoreMemberView", "getMMoreMemberView()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mGroupNameView", "getMGroupNameView()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mGroupNickName", "getMGroupNickName()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mGroupAnnouncement", "getMGroupAnnouncement()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mGroupAnnouncementNotSet", "getMGroupAnnouncementNotSet()Lcom/bytedance/ies/dmt/ui/widget/DmtTextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mInviteQQFriendsLayout", "getMInviteQQFriendsLayout()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mInviteWechatFriendsLayout", "getMInviteWechatFriendsLayout()Landroid/widget/FrameLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mReportLayout", "getMReportLayout()Landroid/widget/RelativeLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mExitGroupChatLayout", "getMExitGroupChatLayout()Landroid/widget/RelativeLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mEditGroupNameLayout", "getMEditGroupNameLayout()Landroid/widget/RelativeLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mEditGroupNicknameLayout", "getMEditGroupNicknameLayout()Landroid/widget/RelativeLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatDetailActivity.class), "mEditGroupAnnouncementLayout", "getMEditGroupAnnouncementLayout()Landroid/widget/RelativeLayout;"))};

    /* renamed from: h */
    public static final C34102a f88152h = new C34102a(null);

    /* renamed from: A */
    private C33367a f88153A;

    /* renamed from: B */
    private HashMap f88154B;

    /* renamed from: g */
    public C11180b f88155g;

    /* renamed from: i */
    private final C52668f f88156i = C52732g.m112285a(new C34108f(this));

    /* renamed from: j */
    private final C52668f f88157j = C52732g.m112285a(new C34119q(this));

    /* renamed from: k */
    private final C52668f f88158k = C52732g.m112285a(new C34115m(this));

    /* renamed from: l */
    private final C52668f f88159l = C52732g.m112285a(new C34116n(this));

    /* renamed from: m */
    private final C52668f f88160m = C52732g.m112285a(new C34113k(this));

    /* renamed from: n */
    private final C52668f f88161n = C52732g.m112285a(new C34114l(this));

    /* renamed from: o */
    private final C52668f f88162o = C52732g.m112285a(new C34117o(this));

    /* renamed from: p */
    private final C52668f f88163p = C52732g.m112285a(new C34118p(this));

    /* renamed from: q */
    private final C52668f f88164q = C52732g.m112285a(new C34120r(this));

    /* renamed from: r */
    private final C52668f f88165r = C52732g.m112285a(new C34112j(this));

    /* renamed from: s */
    private final C52668f f88166s = C52732g.m112285a(new C34110h(this));

    /* renamed from: t */
    private final C52668f f88167t = C52732g.m112285a(new C34111i(this));

    /* renamed from: u */
    private final C52668f f88168u = C52732g.m112285a(new C34109g(this));

    /* renamed from: v */
    private C34137c f88169v;

    /* renamed from: w */
    private ArrayList<C33367a> f88170w = new ArrayList<>();

    /* renamed from: x */
    private final ArrayList<C33368b> f88171x = new ArrayList<>();

    /* renamed from: y */
    private C34150g f88172y;

    /* renamed from: z */
    private C34144a f88173z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$a */
    public static final class C34102a {
        private C34102a() {
        }

        public /* synthetic */ C34102a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m77925a(Context context, C11180b bVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(bVar, "conversation");
            Intent intent = new Intent(context, GroupChatDetailActivity.class);
            intent.putExtra("conversation", bVar);
            intent.setFlags(67108864);
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$b */
    static final class C34103b extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88174a;

        /* renamed from: b */
        final /* synthetic */ String f88175b;

        C34103b(GroupChatDetailActivity groupChatDetailActivity, String str) {
            this.f88174a = groupChatDetailActivity;
            this.f88175b = str;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f88174a.mo72061a(this.f88175b, Integer.valueOf(((Number) obj).intValue()), false);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$c */
    static final class C34104c implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88176a;

        C34104c(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88176a = groupChatDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            boolean z;
            String str;
            if (this.f88176a.f88155g != null) {
                C11180b bVar = this.f88176a.f88155g;
                if (bVar == null) {
                    C52711k.m112234a();
                }
                CharSequence conversationId = bVar.getConversationId();
                if (conversationId == null || conversationId.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    C11182d a = C11182d.m22641a();
                    C11180b bVar2 = this.f88176a.f88155g;
                    String str2 = null;
                    if (bVar2 != null) {
                        str = bVar2.getConversationId();
                    } else {
                        str = null;
                    }
                    if (a.mo20658a(str) != null) {
                        C11190e eVar = this.f88176a.f88043e;
                        if (eVar != null) {
                            eVar.mo20696b((C11162b<String>) new C11162b<String>(this) {

                                /* renamed from: a */
                                final /* synthetic */ C34104c f88177a;

                                {
                                    this.f88177a = r1;
                                }

                                /* renamed from: a */
                                public final void mo20508a(C11202k kVar) {
                                    C34214b.m78054a(this.f88177a.f88176a, kVar);
                                }

                                /* renamed from: a */
                                public final /* bridge */ /* synthetic */ void mo20506a(Object obj) {
                                    String str = (String) obj;
                                    C41302w.m91042a().mo83858a((Activity) this.f88177a.f88176a, "aweme://main");
                                }
                            });
                        }
                    }
                    C35190af.m79442a();
                    C11180b bVar3 = this.f88176a.f88155g;
                    if (bVar3 != null) {
                        str2 = bVar3.getConversationId();
                    }
                    C35190af.m79484b(str2, "quit_group");
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$d */
    public static final class C34106d implements C35356a {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88178a;

        /* renamed from: b */
        public final void mo70670b() {
        }

        /* renamed from: c */
        public final void mo70671c() {
        }

        /* renamed from: a */
        public final void mo70669a() {
            this.f88178a.finish();
        }

        C34106d(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88178a = groupChatDetailActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$e */
    public static final class C34107e extends C34007c {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88179a;

        C34107e(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88179a = groupChatDetailActivity;
        }

        /* renamed from: a */
        public final void mo20665a(List<C11206o> list) {
            super.mo20665a(list);
            this.f88179a.mo72062h();
        }

        /* renamed from: b */
        public final void mo20668b(C11180b bVar) {
            super.mo20668b(bVar);
            this.f88179a.f88155g = bVar;
            this.f88179a.mo72062h();
        }

        /* renamed from: b */
        public final void mo20670b(List<C11206o> list) {
            super.mo20670b(list);
            this.f88179a.mo72062h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$f */
    static final class C34108f extends C52712l implements C52670a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88180a;

        C34108f(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88180a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RecyclerView) this.f88180a.mo72009a((int) R.id.cg2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$g */
    static final class C34109g extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88181a;

        C34109g(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88181a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RelativeLayout) this.f88181a.mo72009a((int) R.id.ei7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$h */
    static final class C34110h extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88182a;

        C34110h(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88182a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RelativeLayout) this.f88182a.mo72009a((int) R.id.b7h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$i */
    static final class C34111i extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88183a;

        C34111i(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88183a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RelativeLayout) this.f88183a.mo72009a((int) R.id.b7i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$j */
    static final class C34112j extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88184a;

        C34112j(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88184a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RelativeLayout) this.f88184a.mo72009a((int) R.id.b7l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$k */
    static final class C34113k extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88185a;

        C34113k(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88185a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f88185a.mo72009a((int) R.id.f2g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$l */
    static final class C34114l extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88186a;

        C34114l(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88186a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88186a.mo72009a((int) R.id.f2h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$m */
    static final class C34115m extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88187a;

        C34115m(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88187a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88187a.mo72009a((int) R.id.d_y);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$n */
    static final class C34116n extends C52712l implements C52670a<DmtTextView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88188a;

        C34116n(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88188a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtTextView) this.f88188a.mo72009a((int) R.id.d_z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$o */
    static final class C34117o extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88189a;

        C34117o(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88189a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f88189a.mo72009a((int) R.id.b85);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$p */
    static final class C34118p extends C52712l implements C52670a<FrameLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88190a;

        C34118p(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88190a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (FrameLayout) this.f88190a.mo72009a((int) R.id.b86);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$q */
    static final class C34119q extends C52712l implements C52670a<TextView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88191a;

        C34119q(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88191a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextView) this.f88191a.mo72009a((int) R.id.dc0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$r */
    static final class C34120r extends C52712l implements C52670a<RelativeLayout> {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88192a;

        C34120r(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88192a = groupChatDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RelativeLayout) this.f88192a.mo72009a((int) R.id.b9b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$s */
    static final class C34121s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GroupChatDetailActivity f88193a;

        C34121s(GroupChatDetailActivity groupChatDetailActivity) {
            this.f88193a = groupChatDetailActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0022  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r9 = this;
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r0 = r9.f88193a
                com.bytedance.im.core.c.b r0 = r0.f88155g
                r1 = 0
                if (r0 == 0) goto L_0x0016
                com.bytedance.im.core.c.c r0 = r0.getCoreInfo()
                if (r0 == 0) goto L_0x0016
                long r2 = r0.getOwner()
                java.lang.Long r0 = java.lang.Long.valueOf(r2)
                goto L_0x0017
            L_0x0016:
                r0 = r1
            L_0x0017:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r2 = r9.f88193a
                com.bytedance.im.core.c.b r2 = r2.f88155g
                if (r2 == 0) goto L_0x0022
                java.lang.String r2 = r2.getConversationId()
                goto L_0x0023
            L_0x0022:
                r2 = r1
            L_0x0023:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r3 = r9.f88193a
                com.bytedance.im.core.c.b r3 = r3.f88155g
                if (r3 == 0) goto L_0x0032
                long r3 = r3.getConversationShortId()
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                goto L_0x0033
            L_0x0032:
                r3 = r1
            L_0x0033:
                if (r3 == 0) goto L_0x00bc
                r4 = r2
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                if (r4 == 0) goto L_0x0043
                int r4 = r4.length()
                if (r4 != 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                r4 = 0
                goto L_0x0044
            L_0x0043:
                r4 = 1
            L_0x0044:
                if (r4 != 0) goto L_0x00bc
                if (r0 == 0) goto L_0x00bc
                long r4 = r0.longValue()
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 > 0) goto L_0x0053
                goto L_0x00bc
            L_0x0053:
                r4 = 3
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33707b.m77193a(r2, r4)
                com.p683ss.android.ugc.aweme.p1807im.sdk.chat.selectmsg.C33707b.m77192a(r2)
                com.google.gson.o r4 = new com.google.gson.o     // Catch:{ Exception -> 0x006d }
                r4.<init>()     // Catch:{ Exception -> 0x006d }
                java.lang.String r5 = "conversation_id"
                r4.mo35020a(r5, r2)     // Catch:{ Exception -> 0x006d }
                java.lang.String r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o.m79761a(r4)     // Catch:{ Exception -> 0x006d }
                goto L_0x006f
            L_0x006d:
                java.lang.String r2 = ""
            L_0x006f:
                android.net.Uri$Builder r4 = new android.net.Uri$Builder
                r4.<init>()
                java.lang.String r5 = "owner_id"
                long r6 = r0.longValue()
                java.lang.String r0 = java.lang.String.valueOf(r6)
                android.net.Uri$Builder r0 = r4.appendQueryParameter(r5, r0)
                java.lang.String r4 = "extra"
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r4, r2)
                java.lang.String r2 = "object_id"
                long r3 = r3.longValue()
                java.lang.String r3 = java.lang.String.valueOf(r3)
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
                java.lang.String r2 = "report_type"
                java.lang.String r3 = "im_group"
                android.net.Uri$Builder r0 = r0.appendQueryParameter(r2, r3)
                com.ss.android.ugc.aweme.compliance.api.services.report.IReportService r2 = com.p683ss.android.ugc.aweme.compliance.api.C27013a.m65227a()
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r3 = r9.f88193a
                android.app.Activity r3 = (android.app.Activity) r3
                r2.report(r3, r0)
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity r0 = r9.f88193a
                com.bytedance.im.core.c.b r0 = r0.f88155g
                if (r0 == 0) goto L_0x00b6
                java.lang.String r1 = r0.getConversationId()
            L_0x00b6:
                java.lang.String r0 = "group"
                com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79497d(r1, r0)
                return
            L_0x00bc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatDetailActivity.C34121s.run():void");
        }
    }

    /* renamed from: i */
    private final RecyclerView m77902i() {
        return (RecyclerView) this.f88156i.getValue();
    }

    /* renamed from: j */
    private final TextView m77903j() {
        return (TextView) this.f88157j.getValue();
    }

    /* renamed from: k */
    private final DmtTextView m77904k() {
        return (DmtTextView) this.f88158k.getValue();
    }

    /* renamed from: l */
    private final DmtTextView m77905l() {
        return (DmtTextView) this.f88159l.getValue();
    }

    /* renamed from: m */
    private final TextView m77906m() {
        return (TextView) this.f88160m.getValue();
    }

    /* renamed from: n */
    private final DmtTextView m77907n() {
        return (DmtTextView) this.f88161n.getValue();
    }

    /* renamed from: o */
    private final FrameLayout m77908o() {
        return (FrameLayout) this.f88162o.getValue();
    }

    /* renamed from: p */
    private final FrameLayout m77909p() {
        return (FrameLayout) this.f88163p.getValue();
    }

    /* renamed from: q */
    private final RelativeLayout m77910q() {
        return (RelativeLayout) this.f88164q.getValue();
    }

    /* renamed from: r */
    private final RelativeLayout m77911r() {
        return (RelativeLayout) this.f88165r.getValue();
    }

    /* renamed from: s */
    private final RelativeLayout m77912s() {
        return (RelativeLayout) this.f88166s.getValue();
    }

    /* renamed from: t */
    private final RelativeLayout m77913t() {
        return (RelativeLayout) this.f88168u.getValue();
    }

    /* renamed from: a */
    public final View mo72009a(int i) {
        if (this.f88154B == null) {
            this.f88154B = new HashMap();
        }
        View view = (View) this.f88154B.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88154B.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public final int mo72015d() {
        return R.layout.bc3;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onCreate", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        C11190e eVar = this.f88043e;
        if (eVar != null) {
            eVar.mo20695b();
        }
    }

    /* renamed from: v */
    private final void m77915v() {
        if (this.f88170w.size() >= 20) {
            ArrayList<C33368b> arrayList = this.f88171x;
            C34144a aVar = this.f88173z;
            if (aVar == null) {
                C52711k.m112237a("mAddMemberItem");
            }
            arrayList.set(19, aVar);
        } else {
            ArrayList<C33368b> arrayList2 = this.f88171x;
            C34144a aVar2 = this.f88173z;
            if (aVar2 == null) {
                C52711k.m112237a("mAddMemberItem");
            }
            arrayList2.add(aVar2);
        }
        C34137c cVar = this.f88169v;
        if (cVar == null) {
            C52711k.m112237a("mAvatarListAdapter");
        }
        cVar.mo72083a(this.f88171x);
    }

    /* renamed from: w */
    private final void m77916w() {
        mo72010a().setTitle(getString(R.string.bhw, new Object[]{Integer.valueOf(this.f88170w.size())}));
        m77917x();
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m77917x() {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.im.sdk.detail.b.g r0 = r2.f88172y
            if (r0 == 0) goto L_0x0016
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> r0 = r2.f88171x
            com.ss.android.ugc.aweme.im.sdk.detail.b.g r1 = r2.f88172y
            if (r1 != 0) goto L_0x000d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x000d:
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0016
            r0 = 18
            goto L_0x0018
        L_0x0016:
            r0 = 19
        L_0x0018:
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r1 = r2.f88170w
            int r1 = r1.size()
            if (r1 <= r0) goto L_0x002e
            android.widget.TextView r0 = r2.m77903j()
            java.lang.String r1 = "mMoreMemberView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r1 = 0
            r0.setVisibility(r1)
            return
        L_0x002e:
            android.widget.TextView r0 = r2.m77903j()
            java.lang.String r1 = "mMoreMemberView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatDetailActivity.m77917x():void");
    }

    /* renamed from: e */
    public final void mo72016e() {
        Serializable serializable;
        CharSequence charSequence;
        boolean z;
        String str;
        super.mo72016e();
        Intent intent = getIntent();
        String str2 = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("conversation");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f88155g = (C11180b) serializable;
            C11180b bVar = this.f88155g;
            if (bVar != null) {
                charSequence = bVar.getConversationId();
            } else {
                charSequence = null;
            }
            CharSequence charSequence2 = charSequence;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                finish();
                return;
            }
            C11180b bVar2 = this.f88155g;
            if (bVar2 != null) {
                str = bVar2.getConversationId();
            } else {
                str = null;
            }
            this.f88043e = new C11190e(str);
            C11180b bVar3 = this.f88155g;
            if (bVar3 != null) {
                str2 = bVar3.getConversationId();
            }
            this.f88173z = new C34144a(str2);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.im.core.model.Conversation");
    }

    /* renamed from: f */
    public final void mo72017f() {
        String str;
        super.mo72017f();
        RecyclerView i = m77902i();
        C52711k.m112236a((Object) i, "mAvatarListView");
        i.setLayoutManager(new GridLayoutManager(this, 5));
        this.f88169v = new C34137c(this.f88171x);
        C34137c cVar = this.f88169v;
        if (cVar == null) {
            C52711k.m112237a("mAvatarListAdapter");
        }
        C11180b bVar = this.f88155g;
        if (bVar != null) {
            str = bVar.getConversationId();
        } else {
            str = null;
        }
        cVar.f88233b = str;
        RecyclerView i2 = m77902i();
        C52711k.m112236a((Object) i2, "mAvatarListView");
        C34137c cVar2 = this.f88169v;
        if (cVar2 == null) {
            C52711k.m112237a("mAvatarListAdapter");
        }
        i2.setAdapter(cVar2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r0.getRole() == com.bytedance.p702im.core.proto.GroupRole.OWNER.getValue()) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r0.getRole() == com.bytedance.p702im.core.proto.GroupRole.MANAGER.getValue()) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a();
        r1 = r3.f88155g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r1 == null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r1 = r1.getConversationId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r0.mo72235c(r1) != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        m77914u();
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72062h() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.im.sdk.group.d r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
            com.bytedance.im.core.c.b r1 = r3.f88155g
            if (r1 != 0) goto L_0x000b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x000b:
            java.lang.String r1 = r1.getConversationId()
            java.lang.String r2 = "mConversation!!.conversationId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.List r0 = r0.mo72231b(r1)
            if (r0 == 0) goto L_0x0076
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r1 = r3.f88170w
            r1.clear()
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r1 = r3.f88170w
            java.util.Collection r0 = (java.util.Collection) r0
            r1.addAll(r0)
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r0 = r3.f88170w
            r3.m77900a(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = r3.f88153A
            if (r0 == 0) goto L_0x0041
            com.bytedance.im.core.c.o r0 = r0.getMember()
            if (r0 == 0) goto L_0x0041
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.p702im.core.proto.GroupRole.OWNER
            int r1 = r1.getValue()
            if (r0 == r1) goto L_0x0057
        L_0x0041:
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = r3.f88153A
            if (r0 == 0) goto L_0x006f
            com.bytedance.im.core.c.o r0 = r0.getMember()
            if (r0 == 0) goto L_0x006f
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.p702im.core.proto.GroupRole.MANAGER
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x006f
        L_0x0057:
            com.ss.android.ugc.aweme.im.sdk.group.d r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
            com.bytedance.im.core.c.b r1 = r3.f88155g
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = r1.getConversationId()
            goto L_0x0065
        L_0x0064:
            r1 = 0
        L_0x0065:
            boolean r0 = r0.mo72235c(r1)
            if (r0 != 0) goto L_0x006f
            r3.m77914u()
            goto L_0x0072
        L_0x006f:
            r3.m77915v()
        L_0x0072:
            r3.m77916w()
            return
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatDetailActivity.mo72062h():void");
    }

    /* renamed from: u */
    private final void m77914u() {
        String str;
        if (this.f88172y == null) {
            C11180b bVar = this.f88155g;
            if (bVar != null) {
                str = bVar.getConversationId();
            } else {
                str = null;
            }
            this.f88172y = new C34150g(str);
        }
        if (this.f88170w.size() >= 20) {
            ArrayList<C33368b> arrayList = this.f88171x;
            C34144a aVar = this.f88173z;
            if (aVar == null) {
                C52711k.m112237a("mAddMemberItem");
            }
            arrayList.set(18, aVar);
            ArrayList<C33368b> arrayList2 = this.f88171x;
            C34150g gVar = this.f88172y;
            if (gVar == null) {
                C52711k.m112234a();
            }
            arrayList2.set(19, gVar);
        } else if (this.f88170w.size() >= 19) {
            ArrayList<C33368b> arrayList3 = this.f88171x;
            C34144a aVar2 = this.f88173z;
            if (aVar2 == null) {
                C52711k.m112237a("mAddMemberItem");
            }
            arrayList3.set(18, aVar2);
            ArrayList<C33368b> arrayList4 = this.f88171x;
            C34150g gVar2 = this.f88172y;
            if (gVar2 == null) {
                C52711k.m112234a();
            }
            arrayList4.add(gVar2);
        } else {
            ArrayList<C33368b> arrayList5 = this.f88171x;
            C34144a aVar3 = this.f88173z;
            if (aVar3 == null) {
                C52711k.m112237a("mAddMemberItem");
            }
            arrayList5.add(aVar3);
            ArrayList<C33368b> arrayList6 = this.f88171x;
            C34150g gVar3 = this.f88172y;
            if (gVar3 == null) {
                C52711k.m112234a();
            }
            arrayList6.add(gVar3);
        }
        C34137c cVar = this.f88169v;
        if (cVar == null) {
            C52711k.m112237a("mAvatarListAdapter");
        }
        cVar.mo72083a(this.f88171x);
    }

    /* renamed from: g */
    public final void mo72018g() {
        super.mo72018g();
        OnClickListener onClickListener = this;
        m77910q().setOnClickListener(onClickListener);
        m77903j().setOnClickListener(onClickListener);
        m77912s().setOnClickListener(onClickListener);
        m77911r().setOnClickListener(onClickListener);
        m77913t().setOnClickListener(onClickListener);
        m77908o().setOnClickListener(onClickListener);
        m77909p().setOnClickListener(onClickListener);
        mo72010a().setOnTitlebarClickListener(new C34106d(this));
        C11190e eVar = this.f88043e;
        if (eVar != null) {
            eVar.mo20688a((C11200i) new C34107e(this));
        }
        Context context = this;
        C35221bc.m79613a(C0726c.m2098c(context, R.color.a8w), C0726c.m2098c(context, R.color.qb), m77912s(), (RelativeLayout) this.f88167t.getValue(), m77910q(), m77911r(), m77913t());
        C35225a.m79617l().mo73331a(m77903j(), m77908o(), m77909p());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ba, code lost:
        if (r4.getRole() == com.bytedance.p702im.core.proto.GroupRole.OWNER.getValue()) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d0, code lost:
        if (r4.getRole() == com.bytedance.p702im.core.proto.GroupRole.MANAGER.getValue()) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d2, code lost:
        r0 = m77905l();
        p2628d.p2639f.p2641b.C52711k.m112236a((java.lang.Object) r0, "mGroupNickName");
        r4 = r8.f88153A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dd, code lost:
        if (r4 == null) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00df, code lost:
        r4 = r4.getMemberDisplayName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e4, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e5, code lost:
        r0.setText(r4);
        r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a();
        r4 = r8.f88155g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f0, code lost:
        if (r4 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f2, code lost:
        r4 = r4.getConversationId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fc, code lost:
        if (r0.mo72235c(r4) == false) goto L_0x0102;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fe, code lost:
        m77915v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0102, code lost:
        m77914u();
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r8 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity"
            java.lang.String r1 = "onResume"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onResume()
            com.ss.android.ugc.aweme.im.sdk.group.d r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
            com.bytedance.im.core.c.b r1 = r8.f88155g
            if (r1 != 0) goto L_0x0016
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0016:
            java.lang.String r1 = r1.getConversationId()
            java.lang.String r3 = "mConversation!!.conversationId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.util.List r0 = r0.mo72231b(r1)
            r1 = 0
            r3 = 0
            if (r0 == 0) goto L_0x011e
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r8.m77904k()
            java.lang.String r5 = "mGroupNameView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            com.bytedance.im.core.c.b r5 = r8.f88155g
            if (r5 == 0) goto L_0x0043
            com.bytedance.im.core.c.c r5 = r5.getCoreInfo()
            if (r5 == 0) goto L_0x0043
            java.lang.String r5 = r5.getName()
            if (r5 == 0) goto L_0x0043
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            goto L_0x004c
        L_0x0043:
            r5 = 2132545333(0x7f1c0f35, float:2.0743853E38)
            java.lang.String r5 = r8.getString(r5)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
        L_0x004c:
            r4.setText(r5)
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r4 = r8.f88170w
            r4.clear()
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r4 = r8.f88170w
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r0 = r8.f88170w
            r8.m77900a(r0)
            com.ss.android.ugc.aweme.profile.model.User r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79732c()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser.fromUser(r0)
            if (r0 != 0) goto L_0x006c
            goto L_0x011b
        L_0x006c:
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r4 = r8.f88170w
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.Iterator r4 = r4.iterator()
        L_0x007b:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0096
            java.lang.Object r6 = r4.next()
            r7 = r6
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r7 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a) r7
            com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r7.getUser()
            boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r7)
            if (r7 == 0) goto L_0x007b
            r5.add(r6)
            goto L_0x007b
        L_0x0096:
            java.util.List r5 = (java.util.List) r5
            int r4 = r5.size()
            if (r4 != r2) goto L_0x011b
            java.lang.Object r4 = r5.get(r3)
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a) r4
            r8.f88153A = r4
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r4 = r8.f88153A
            if (r4 == 0) goto L_0x00bc
            com.bytedance.im.core.c.o r4 = r4.getMember()
            if (r4 == 0) goto L_0x00bc
            int r4 = r4.getRole()
            com.bytedance.im.core.proto.GroupRole r5 = com.bytedance.p702im.core.proto.GroupRole.OWNER
            int r5 = r5.getValue()
            if (r4 == r5) goto L_0x00d2
        L_0x00bc:
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r4 = r8.f88153A
            if (r4 == 0) goto L_0x0106
            com.bytedance.im.core.c.o r4 = r4.getMember()
            if (r4 == 0) goto L_0x0106
            int r4 = r4.getRole()
            com.bytedance.im.core.proto.GroupRole r5 = com.bytedance.p702im.core.proto.GroupRole.MANAGER
            int r5 = r5.getValue()
            if (r4 != r5) goto L_0x0106
        L_0x00d2:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.m77905l()
            java.lang.String r4 = "mGroupNickName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r4 = r8.f88153A
            if (r4 == 0) goto L_0x00e4
            java.lang.String r4 = r4.getMemberDisplayName()
            goto L_0x00e5
        L_0x00e4:
            r4 = r1
        L_0x00e5:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r0.setText(r4)
            com.ss.android.ugc.aweme.im.sdk.group.d r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
            com.bytedance.im.core.c.b r4 = r8.f88155g
            if (r4 == 0) goto L_0x00f7
            java.lang.String r4 = r4.getConversationId()
            goto L_0x00f8
        L_0x00f7:
            r4 = r1
        L_0x00f8:
            boolean r0 = r0.mo72235c(r4)
            if (r0 == 0) goto L_0x0102
            r8.m77915v()
            goto L_0x011b
        L_0x0102:
            r8.m77914u()
            goto L_0x011b
        L_0x0106:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r8.m77905l()
            java.lang.String r5 = "mGroupNickName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            java.lang.String r0 = r0.getDisplayName()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r4.setText(r0)
            r8.m77915v()
        L_0x011b:
            r8.m77916w()
        L_0x011e:
            com.bytedance.im.core.c.b r0 = r8.f88155g
            r4 = 8
            if (r0 == 0) goto L_0x0168
            com.bytedance.im.core.c.c r0 = r0.getCoreInfo()
            if (r0 == 0) goto L_0x0168
            java.lang.String r0 = r0.getNotice()
            if (r0 == 0) goto L_0x0168
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x013a
            goto L_0x013b
        L_0x013a:
            r2 = 0
        L_0x013b:
            if (r2 == 0) goto L_0x013e
            goto L_0x013f
        L_0x013e:
            r0 = r1
        L_0x013f:
            if (r0 == 0) goto L_0x0168
            android.widget.TextView r1 = r8.m77906m()
            java.lang.String r2 = "mGroupAnnouncement"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.setText(r0)
            android.widget.TextView r0 = r8.m77906m()
            java.lang.String r1 = "mGroupAnnouncement"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setVisibility(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.m77907n()
            java.lang.String r1 = "mGroupAnnouncementNotSet"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setVisibility(r4)
            goto L_0x0180
        L_0x0168:
            android.widget.TextView r0 = r8.m77906m()
            java.lang.String r1 = "mGroupAnnouncement"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setVisibility(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r8.m77907n()
            java.lang.String r1 = "mGroupAnnouncementNotSet"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setVisibility(r3)
        L_0x0180:
            java.lang.String r0 = "com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity"
            java.lang.String r1 = "onResume"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatDetailActivity.onResume():void");
    }

    /* renamed from: a */
    private final void m77900a(ArrayList<C33367a> arrayList) {
        this.f88171x.clear();
        if (arrayList.size() <= 20) {
            this.f88171x.addAll(arrayList);
        } else {
            this.f88171x.addAll(arrayList.subList(0, 20));
        }
    }

    /* renamed from: b */
    private final void m77901b(int i) {
        C11180b bVar = this.f88155g;
        if (bVar != null && bVar.getConversationId() != null) {
            Context context = this;
            C11180b bVar2 = this.f88155g;
            if (bVar2 == null) {
                C52711k.m112234a();
            }
            String conversationId = bVar2.getConversationId();
            if (conversationId == null) {
                C52711k.m112234a();
            }
            new C34313e(context, conversationId, i).show();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            com.bytedance.apm.agent.instrumentation.ClickInstrumentation.onClick(r8)
            java.lang.String r0 = "v"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            super.onClick(r8)
            android.widget.RelativeLayout r0 = r7.m77910q()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r0)
            r1 = 0
            if (r0 == 0) goto L_0x002c
            r8 = r7
            android.content.Context r8 = (android.content.Context) r8
            com.bytedance.im.core.c.b r0 = r7.f88155g
            if (r0 == 0) goto L_0x0021
            java.lang.String r1 = r0.getConversationId()
        L_0x0021:
            com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$s r0 = new com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$s
            r0.<init>(r7)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b.m78055a(r8, r1, r0)
            return
        L_0x002c:
            android.widget.TextView r0 = r7.m77903j()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r0)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x008c
            com.bytedance.im.core.c.b r8 = r7.f88155g
            if (r8 == 0) goto L_0x026a
            com.bytedance.im.core.c.b r8 = r7.f88155g
            if (r8 != 0) goto L_0x0043
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0043:
            java.lang.String r8 = r8.getConversationId()
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L_0x0051
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0052
        L_0x0051:
            r2 = 1
        L_0x0052:
            if (r2 == 0) goto L_0x0056
            goto L_0x026a
        L_0x0056:
            r8 = r7
            android.content.Context r8 = (android.content.Context) r8
            com.bytedance.im.core.c.b r0 = r7.f88155g
            if (r0 != 0) goto L_0x0060
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0060:
            java.lang.String r2 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r2)
            java.lang.String r2 = "conversation"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity> r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatMembersActivity.class
            r2.<init>(r8, r3)
            java.lang.String r3 = "conversation"
            java.io.Serializable r0 = (java.io.Serializable) r0
            r2.putExtra(r3, r0)
            r8.startActivity(r2)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            com.bytedance.im.core.c.b r8 = r7.f88155g
            if (r8 == 0) goto L_0x0086
            java.lang.String r1 = r8.getConversationId()
        L_0x0086:
            java.lang.String r8 = "group_more_member_click"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79484b(r1, r8)
            return
        L_0x008c:
            android.widget.RelativeLayout r0 = r7.m77912s()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r0)
            if (r0 == 0) goto L_0x0134
            java.lang.String r8 = ""
            com.bytedance.im.core.c.b r0 = r7.f88155g
            if (r0 == 0) goto L_0x00b1
            com.bytedance.im.core.c.c r0 = r0.getCoreInfo()
            if (r0 == 0) goto L_0x00b1
            java.util.Map r0 = r0.getExt()
            if (r0 == 0) goto L_0x00b1
            java.lang.String r4 = "a:s_name_operator"
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00b2
        L_0x00b1:
            r0 = r1
        L_0x00b2:
            if (r0 == 0) goto L_0x00d7
            java.lang.String r4 = "0"
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r4)
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00d7
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r7.m77904k()
            java.lang.String r0 = "mGroupNameView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            java.lang.CharSequence r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35211ax.m79597a(r8)
            java.lang.String r0 = "StringHelper.trim(mGroupNameView.text.toString())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
        L_0x00d7:
            int r0 = r8.length()
            r3 = 20
            if (r0 <= r3) goto L_0x00f3
            if (r8 == 0) goto L_0x00eb
            java.lang.String r8 = r8.substring(r2, r3)
            java.lang.String r0 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            goto L_0x00f3
        L_0x00eb:
            d.u r8 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r0)
            throw r8
        L_0x00f3:
            r0 = r7
            android.app.Activity r0 = (android.app.Activity) r0
            com.bytedance.im.core.c.b r3 = r7.f88155g
            if (r3 == 0) goto L_0x00ff
            java.lang.String r3 = r3.getConversationId()
            goto L_0x0100
        L_0x00ff:
            r3 = r1
        L_0x0100:
            java.lang.String r4 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r4)
            android.content.Intent r4 = new android.content.Intent
            r5 = r0
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.detail.EditGroupInfoActivity> r6 = com.p683ss.android.ugc.aweme.p1807im.sdk.detail.EditGroupInfoActivity.class
            r4.<init>(r5, r6)
            java.lang.String r5 = "conversationId"
            r4.putExtra(r5, r3)
            java.lang.String r3 = "editInfo"
            r4.putExtra(r3, r8)
            java.lang.String r8 = "type"
            r4.putExtra(r8, r2)
            r8 = 222(0xde, float:3.11E-43)
            r0.startActivityForResult(r4, r8)
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            com.bytedance.im.core.c.b r8 = r7.f88155g
            if (r8 == 0) goto L_0x012e
            java.lang.String r1 = r8.getConversationId()
        L_0x012e:
            java.lang.String r8 = "group_name_click"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79484b(r1, r8)
            return
        L_0x0134:
            android.widget.RelativeLayout r0 = r7.m77911r()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r0)
            if (r0 == 0) goto L_0x0181
            com.bytedance.ies.dmt.ui.b.a$a r8 = new com.bytedance.ies.dmt.ui.b.a$a
            r0 = r7
            android.content.Context r0 = (android.content.Context) r0
            r8.<init>(r0)
            r0 = 2132545398(0x7f1c0f76, float:2.0743985E38)
            com.bytedance.ies.dmt.ui.b.a$a r8 = r8.mo18899b(r0)
            r0 = 2132607429(0x7f1d01c5, float:2.0869798E38)
            com.bytedance.ies.dmt.ui.b.a$a r8 = r8.mo18911e(r0)
            r0 = 2132545260(0x7f1c0eec, float:2.0743705E38)
            com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$c r2 = new com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$c
            r2.<init>(r7)
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            com.bytedance.ies.dmt.ui.b.a$a r8 = r8.mo18886a(r0, r2)
            r0 = 2132545230(0x7f1c0ece, float:2.0743644E38)
            com.bytedance.ies.dmt.ui.b.a$a r8 = r8.mo18900b(r0, r1)
            com.bytedance.ies.dmt.ui.b.a r8 = r8.mo18897a()
            r8.mo18882b()
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            com.bytedance.im.core.c.b r8 = r7.f88155g
            if (r8 == 0) goto L_0x017b
            java.lang.String r1 = r8.getConversationId()
        L_0x017b:
            java.lang.String r8 = "group_quit_click"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79484b(r1, r8)
            return
        L_0x0181:
            android.widget.FrameLayout r0 = r7.m77908o()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r0)
            if (r0 == 0) goto L_0x019f
            r8 = 3
            r7.m77901b(r8)
            java.lang.String r8 = "group_qq_invite_click"
            com.bytedance.im.core.c.b r0 = r7.f88155g
            if (r0 == 0) goto L_0x0199
            java.lang.String r1 = r0.getConversationId()
        L_0x0199:
            java.lang.String r0 = "setting"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79524i(r8, r1, r0)
            return
        L_0x019f:
            android.widget.FrameLayout r0 = r7.m77909p()
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r0)
            if (r0 == 0) goto L_0x01bc
            r7.m77901b(r3)
            java.lang.String r8 = "group_wx_invite_click"
            com.bytedance.im.core.c.b r0 = r7.f88155g
            if (r0 == 0) goto L_0x01b6
            java.lang.String r1 = r0.getConversationId()
        L_0x01b6:
            java.lang.String r0 = "setting"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79524i(r8, r1, r0)
            return
        L_0x01bc:
            android.widget.RelativeLayout r0 = r7.m77913t()
            boolean r8 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r0)
            if (r8 == 0) goto L_0x026a
            java.lang.CharSequence r8 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79730b()
            if (r8 == 0) goto L_0x01d1
            java.lang.String r8 = r8.toString()
            goto L_0x01d2
        L_0x01d1:
            r8 = r1
        L_0x01d2:
            com.bytedance.im.core.c.b r0 = r7.f88155g
            if (r0 == 0) goto L_0x01db
            java.lang.String r0 = r0.getConversationId()
            goto L_0x01dc
        L_0x01db:
            r0 = r1
        L_0x01dc:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "GroupChatDetailActivity enterAnnouncementEdit: "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r4 = ", "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r4 = ", "
            r2.append(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = r7.m77907n()
            java.lang.String r5 = "mGroupAnnouncementNotSet"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            int r4 = r4.getVisibility()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r2)
            if (r0 != 0) goto L_0x020d
            goto L_0x025c
        L_0x020d:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r7.m77907n()
            java.lang.String r4 = "mGroupAnnouncementNotSet"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x0245
            if (r8 != 0) goto L_0x021f
            goto L_0x025c
        L_0x021f:
            com.ss.android.ugc.aweme.im.sdk.group.d r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
            java.lang.Integer r2 = r2.mo72223a(r0, r8)
            if (r2 == 0) goto L_0x0237
            java.lang.Number r2 = (java.lang.Number) r2
            int r8 = r2.intValue()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r7.mo72061a(r0, r8, r3)
            goto L_0x025c
        L_0x0237:
            com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
            com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$b r2 = new com.ss.android.ugc.aweme.im.sdk.detail.GroupChatDetailActivity$b
            r2.<init>(r7, r0)
            d.f.a.b r2 = (p2628d.p2639f.p2640a.C52671b) r2
            com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.m78088a(r0, r8, r2)
            goto L_0x025c
        L_0x0245:
            r8 = r7
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r2 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.ss.android.ugc.aweme.im.sdk.detail.GroupAnnouncementActivity> r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupAnnouncementActivity.class
            r2.<init>(r8, r3)
            java.lang.String r3 = "conversationId"
            r2.putExtra(r3, r0)
            r8.startActivity(r2)
        L_0x025c:
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79442a()
            com.bytedance.im.core.c.b r8 = r7.f88155g
            if (r8 == 0) goto L_0x0267
            java.lang.String r1 = r8.getConversationId()
        L_0x0267:
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79513g(r1)
        L_0x026a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatDetailActivity.onClick(android.view.View):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        boolean z;
        super.onActivityResult(i, i2, intent);
        if (i == 222) {
            if (intent != null) {
                str = intent.getStringExtra("editInfo");
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                DmtTextView k = m77904k();
                C52711k.m112236a((Object) k, "mGroupNameView");
                k.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public final void mo72061a(String str, Integer num, boolean z) {
        StringBuilder sb = new StringBuilder("GroupChatDetailActivity toastOrEnterAnnouncementEdit: ");
        sb.append(num);
        sb.append(", ");
        sb.append(z);
        C32458a.m75144a(sb.toString());
        int value = GroupRole.OWNER.getValue();
        if (num != null && value == num.intValue()) {
            C34086a.m77894a(this, str, "");
        } else {
            C10691a.m21542b((Context) this, (int) R.string.fse).mo19066a();
        }
    }
}
