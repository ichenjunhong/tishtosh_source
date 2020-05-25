package com.p683ss.android.ugc.aweme.p1807im.sdk.detail;

import android.content.Intent;
import android.os.Bundle;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11200i;
import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33368b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1831a.C34137c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34144a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34150g;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34007c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity */
public final class GroupChatMembersActivity extends AmeActivity {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f88194a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatMembersActivity.class), "mTitleBar", "getMTitleBar()Lcom/ss/android/ugc/aweme/im/sdk/widget/ImTextTitleBar;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatMembersActivity.class), "mAvatarListView", "getMAvatarListView()Landroid/support/v7/widget/RecyclerView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatMembersActivity.class), "mClearSearchImage", "getMClearSearchImage()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatMembersActivity.class), "mSearchMemberEdit", "getMSearchMemberEdit()Lcom/bytedance/ies/dmt/ui/widget/DmtEditText;"))};

    /* renamed from: g */
    public static final C34122a f88195g = new C34122a(null);

    /* renamed from: b */
    public GridLayoutManager f88196b;

    /* renamed from: c */
    public LinearLayoutManager f88197c;

    /* renamed from: d */
    public C34137c f88198d;

    /* renamed from: e */
    public ArrayList<C33368b> f88199e = new ArrayList<>();

    /* renamed from: f */
    public ArrayList<C33367a> f88200f = new ArrayList<>();

    /* renamed from: h */
    private final C52668f f88201h = C52732g.m112285a(new C34131j(this));

    /* renamed from: i */
    private final C52668f f88202i = C52732g.m112285a(new C34128g(this));

    /* renamed from: j */
    private final C52668f f88203j = C52732g.m112285a(new C34129h(this));

    /* renamed from: k */
    private final C52668f f88204k = C52732g.m112285a(new C34130i(this));

    /* renamed from: l */
    private C11190e f88205l;

    /* renamed from: m */
    private C11180b f88206m;

    /* renamed from: n */
    private C34150g f88207n;

    /* renamed from: o */
    private C34144a f88208o;

    /* renamed from: p */
    private C33367a f88209p;

    /* renamed from: q */
    private HashMap f88210q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$a */
    public static final class C34122a {
        private C34122a() {
        }

        public /* synthetic */ C34122a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$b */
    public static final class C34123b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f88211a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C34123b(GroupChatMembersActivity groupChatMembersActivity) {
            this.f88211a = groupChatMembersActivity;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:133:0x020f, code lost:
            if (com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77752a(r7, r9, r1, r3) != false) goto L_0x0211;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0262, code lost:
            if (com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r7, r1) == false) goto L_0x0264;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0283, code lost:
            if (com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77752a(r7, r9, r1, r3) != false) goto L_0x0285;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x0128, code lost:
            if (com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77752a(r7, r9, r1, r3) != false) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:99:0x019b, code lost:
            if (com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77752a(r7, r9, r1, r3) != false) goto L_0x019d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(android.text.Editable r11) {
            /*
                r10 = this;
                r0 = r11
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0044
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r11 = r10.f88211a
                android.support.v7.widget.RecyclerView r11 = r11.mo72066a()
                java.lang.String r0 = "mAvatarListView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r10.f88211a
                android.support.v7.widget.GridLayoutManager r0 = r0.f88196b
                if (r0 != 0) goto L_0x001f
                java.lang.String r1 = "viewMemberLayoutManager"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x001f:
                android.support.v7.widget.RecyclerView$i r0 = (android.support.p043v7.widget.RecyclerView.C1332i) r0
                r11.setLayoutManager(r0)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r11 = r10.f88211a
                com.ss.android.ugc.aweme.im.sdk.detail.a.c r11 = com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatMembersActivity.m77934a(r11)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r10.f88211a
                java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.b> r0 = r0.f88199e
                java.util.List r0 = (java.util.List) r0
                r11.mo72083a(r0)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r11 = r10.f88211a
                android.widget.ImageView r11 = r11.mo72068b()
                java.lang.String r0 = "mClearSearchImage"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                r0 = 8
                r11.setVisibility(r0)
                return
            L_0x0044:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r10.f88211a
                java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r0 = r0.f88200f
                java.util.List r0 = (java.util.List) r0
                java.lang.String r1 = java.lang.String.valueOf(r11)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                r3 = r0
                java.util.Collection r3 = (java.util.Collection) r3
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L_0x0063
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x0061
                goto L_0x0063
            L_0x0061:
                r3 = 0
                goto L_0x0064
            L_0x0063:
                r3 = 1
            L_0x0064:
                if (r3 != 0) goto L_0x02f2
                r3 = r1
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                if (r3 == 0) goto L_0x0074
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0072
                goto L_0x0074
            L_0x0072:
                r3 = 0
                goto L_0x0075
            L_0x0074:
                r3 = 1
            L_0x0075:
                if (r3 != 0) goto L_0x02f2
                int r3 = r1.length()
                r6 = 0
            L_0x007c:
                if (r6 >= r3) goto L_0x00a8
                char r7 = r1.charAt(r6)
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a.m78904a(r7)
                if (r7 == 0) goto L_0x00a5
                java.lang.String r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1875b.C34839a.m78908c(r1)
                java.lang.String r6 = "CharacterUtil.hanziToPinyin(keyWord)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
                if (r3 == 0) goto L_0x009d
                java.lang.String r3 = r3.toLowerCase()
                java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
                goto L_0x00a9
            L_0x009d:
                d.u r11 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r11.<init>(r0)
                throw r11
            L_0x00a5:
                int r6 = r6 + 1
                goto L_0x007c
            L_0x00a8:
                r3 = r1
            L_0x00a9:
                if (r1 == 0) goto L_0x02ea
                java.lang.String r1 = r1.toLowerCase()
                java.lang.String r6 = "(this as java.lang.String).toLowerCase()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r6)
                java.util.Iterator r0 = r0.iterator()
            L_0x00b8:
                boolean r6 = r0.hasNext()
                if (r6 == 0) goto L_0x02f2
                java.lang.Object r6 = r0.next()
                com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r6 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a) r6
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                r8 = 0
                if (r7 == 0) goto L_0x00d0
                java.lang.String r7 = r7.getRemarkName()
                goto L_0x00d1
            L_0x00d0:
                r7 = r8
            L_0x00d1:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 != 0) goto L_0x0138
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x00e7
                java.lang.String r7 = r7.getRemarkName()
                goto L_0x00e8
            L_0x00e7:
                r7 = r8
            L_0x00e8:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r7, r1)
                if (r7 != 0) goto L_0x012a
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
                if (r7 != 0) goto L_0x0138
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x0102
                java.lang.String r7 = r7.getRemarkInitial()
                goto L_0x0103
            L_0x0102:
                r7 = r8
            L_0x0103:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r7, r1)
                if (r7 != 0) goto L_0x012a
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x0117
                java.lang.String r7 = r7.getRemarkName()
                goto L_0x0118
            L_0x0117:
                r7 = r8
            L_0x0118:
                com.ss.android.ugc.aweme.im.service.model.IMUser r9 = r6.getUser()
                if (r9 == 0) goto L_0x0123
                java.lang.String r9 = r9.getRemarkPinyin()
                goto L_0x0124
            L_0x0123:
                r9 = r8
            L_0x0124:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77752a(r7, r9, r1, r3)
                if (r7 == 0) goto L_0x0138
            L_0x012a:
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x0134
                r8 = 5
                r7.setSearchType(r8)
            L_0x0134:
                r2.add(r6)
                goto L_0x00b8
            L_0x0138:
                com.bytedance.im.core.c.o r7 = r6.getMember()
                if (r7 == 0) goto L_0x0143
                java.lang.String r7 = r7.getAlias()
                goto L_0x0144
            L_0x0143:
                r7 = r8
            L_0x0144:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 != 0) goto L_0x01ac
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.bytedance.im.core.c.o r7 = r6.getMember()
                if (r7 == 0) goto L_0x015a
                java.lang.String r7 = r7.getAlias()
                goto L_0x015b
            L_0x015a:
                r7 = r8
            L_0x015b:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r7, r1)
                if (r7 != 0) goto L_0x019d
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
                if (r7 != 0) goto L_0x01ac
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.bytedance.im.core.c.o r7 = r6.getMember()
                if (r7 == 0) goto L_0x0175
                java.lang.String r7 = r7.getAlias()
                goto L_0x0176
            L_0x0175:
                r7 = r8
            L_0x0176:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r7, r1)
                if (r7 != 0) goto L_0x019d
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.bytedance.im.core.c.o r7 = r6.getMember()
                if (r7 == 0) goto L_0x018a
                java.lang.String r7 = r7.getAlias()
                goto L_0x018b
            L_0x018a:
                r7 = r8
            L_0x018b:
                com.bytedance.im.core.c.o r9 = r6.getMember()
                if (r9 == 0) goto L_0x0196
                java.lang.String r9 = r9.getAlias()
                goto L_0x0197
            L_0x0196:
                r9 = r8
            L_0x0197:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77752a(r7, r9, r1, r3)
                if (r7 == 0) goto L_0x01ac
            L_0x019d:
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x01a7
                r8 = 4
                r7.setSearchType(r8)
            L_0x01a7:
                r2.add(r6)
                goto L_0x00b8
            L_0x01ac:
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x01b7
                java.lang.String r7 = r7.getNickName()
                goto L_0x01b8
            L_0x01b7:
                r7 = r8
            L_0x01b8:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 != 0) goto L_0x0220
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x01ce
                java.lang.String r7 = r7.getNickName()
                goto L_0x01cf
            L_0x01ce:
                r7 = r8
            L_0x01cf:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r7, r1)
                if (r7 != 0) goto L_0x0211
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
                if (r7 != 0) goto L_0x0220
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x01e9
                java.lang.String r7 = r7.getNickNameInitial()
                goto L_0x01ea
            L_0x01e9:
                r7 = r8
            L_0x01ea:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r7, r1)
                if (r7 != 0) goto L_0x0211
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x01fe
                java.lang.String r7 = r7.getNickName()
                goto L_0x01ff
            L_0x01fe:
                r7 = r8
            L_0x01ff:
                com.ss.android.ugc.aweme.im.service.model.IMUser r9 = r6.getUser()
                if (r9 == 0) goto L_0x020a
                java.lang.String r9 = r9.getNickNamePinyin()
                goto L_0x020b
            L_0x020a:
                r9 = r8
            L_0x020b:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77752a(r7, r9, r1, r3)
                if (r7 == 0) goto L_0x0220
            L_0x0211:
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x021b
                r8 = 3
                r7.setSearchType(r8)
            L_0x021b:
                r2.add(r6)
                goto L_0x00b8
            L_0x0220:
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x022b
                java.lang.String r7 = r7.getContactName()
                goto L_0x022c
            L_0x022b:
                r7 = r8
            L_0x022c:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 != 0) goto L_0x0294
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x0242
                java.lang.String r7 = r7.getContactName()
                goto L_0x0243
            L_0x0242:
                r7 = r8
            L_0x0243:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r7, r1)
                if (r7 != 0) goto L_0x0285
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p.m79763a()
                if (r7 != 0) goto L_0x0264
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x025d
                java.lang.String r7 = r7.getContactNameInitial()
                goto L_0x025e
            L_0x025d:
                r7 = r8
            L_0x025e:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r7, r1)
                if (r7 != 0) goto L_0x0285
            L_0x0264:
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x0272
                java.lang.String r7 = r7.getContactName()
                goto L_0x0273
            L_0x0272:
                r7 = r8
            L_0x0273:
                com.ss.android.ugc.aweme.im.service.model.IMUser r9 = r6.getUser()
                if (r9 == 0) goto L_0x027e
                java.lang.String r9 = r9.getContactNamePinyin()
                goto L_0x027f
            L_0x027e:
                r9 = r8
            L_0x027f:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77752a(r7, r9, r1, r3)
                if (r7 == 0) goto L_0x0294
            L_0x0285:
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x028f
                r8 = 2
                r7.setSearchType(r8)
            L_0x028f:
                r2.add(r6)
                goto L_0x00b8
            L_0x0294:
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x029f
                java.lang.String r7 = r7.getUniqueId()
                goto L_0x02a0
            L_0x029f:
                r7 = r8
            L_0x02a0:
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                boolean r7 = android.text.TextUtils.isEmpty(r7)
                if (r7 != 0) goto L_0x02c9
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x02b5
                java.lang.String r8 = r7.getUniqueId()
            L_0x02b5:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r8, r1)
                if (r7 == 0) goto L_0x00b8
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x02c4
                r7.setSearchType(r5)
            L_0x02c4:
                r2.add(r6)
                goto L_0x00b8
            L_0x02c9:
                com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x02d6
                java.lang.String r8 = r7.getShortId()
            L_0x02d6:
                boolean r7 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77755b(r8, r1)
                if (r7 == 0) goto L_0x00b8
                com.ss.android.ugc.aweme.im.service.model.IMUser r7 = r6.getUser()
                if (r7 == 0) goto L_0x02e5
                r7.setSearchType(r5)
            L_0x02e5:
                r2.add(r6)
                goto L_0x00b8
            L_0x02ea:
                d.u r11 = new d.u
                java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
                r11.<init>(r0)
                throw r11
            L_0x02f2:
                r0 = r2
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ r5
                if (r0 == 0) goto L_0x0306
                r0 = r2
                java.util.List r0 = (java.util.List) r0
                com.ss.android.ugc.aweme.im.sdk.detail.c.a$a r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1833c.C34151a.C34152a.f88261a
                java.util.Comparator r1 = (java.util.Comparator) r1
                p2628d.p2629a.C52575l.m112105a(r0, r1)
            L_0x0306:
                java.util.List r2 = (java.util.List) r2
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r10.f88211a
                android.support.v7.widget.LinearLayoutManager r0 = r0.f88197c
                if (r0 != 0) goto L_0x0327
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r10.f88211a
                android.support.v7.widget.LinearLayoutManager r1 = new android.support.v7.widget.LinearLayoutManager
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r3 = r10.f88211a
                android.content.Context r3 = (android.content.Context) r3
                r1.<init>(r3)
                r0.f88197c = r1
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r10.f88211a
                android.support.v7.widget.LinearLayoutManager r0 = r0.f88197c
                if (r0 != 0) goto L_0x0324
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0324:
                r0.mo4731b(r5)
            L_0x0327:
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r10.f88211a
                android.support.v7.widget.RecyclerView r0 = r0.mo72066a()
                java.lang.String r1 = "mAvatarListView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r1 = r10.f88211a
                android.support.v7.widget.LinearLayoutManager r1 = r1.f88197c
                android.support.v7.widget.RecyclerView$i r1 = (android.support.p043v7.widget.RecyclerView.C1332i) r1
                r0.setLayoutManager(r1)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r0 = r10.f88211a
                com.ss.android.ugc.aweme.im.sdk.detail.a.c r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatMembersActivity.m77934a(r0)
                java.lang.String r11 = java.lang.String.valueOf(r11)
                r0.mo72084a(r2, r11)
                com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity r11 = r10.f88211a
                android.widget.ImageView r11 = r11.mo72068b()
                java.lang.String r0 = "mClearSearchImage"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
                r11.setVisibility(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatMembersActivity.C34123b.afterTextChanged(android.text.Editable):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$c */
    public static final class C34124c implements C35356a {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f88212a;

        /* renamed from: b */
        public final void mo70670b() {
        }

        /* renamed from: c */
        public final void mo70671c() {
        }

        /* renamed from: a */
        public final void mo70669a() {
            this.f88212a.finish();
        }

        C34124c(GroupChatMembersActivity groupChatMembersActivity) {
            this.f88212a = groupChatMembersActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$d */
    static final class C34125d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f88213a;

        C34125d(GroupChatMembersActivity groupChatMembersActivity) {
            this.f88213a = groupChatMembersActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f88213a.mo72069c().setText("");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$e */
    public static final class C34126e extends C34007c {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f88214a;

        C34126e(GroupChatMembersActivity groupChatMembersActivity) {
            this.f88214a = groupChatMembersActivity;
        }

        /* renamed from: a */
        public final void mo20665a(List<C11206o> list) {
            super.mo20665a(list);
            this.f88214a.mo72070d();
        }

        /* renamed from: b */
        public final void mo20668b(C11180b bVar) {
            super.mo20668b(bVar);
            this.f88214a.mo72070d();
        }

        /* renamed from: b */
        public final void mo20670b(List<C11206o> list) {
            super.mo20670b(list);
            this.f88214a.mo72070d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$f */
    static final class C34127f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f88215a;

        C34127f(GroupChatMembersActivity groupChatMembersActivity) {
            this.f88215a = groupChatMembersActivity;
        }

        public final void run() {
            RecyclerView a = this.f88215a.mo72066a();
            C52711k.m112236a((Object) a, "mAvatarListView");
            a.setVisibility(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$g */
    static final class C34128g extends C52712l implements C52670a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f88216a;

        C34128g(GroupChatMembersActivity groupChatMembersActivity) {
            this.f88216a = groupChatMembersActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (RecyclerView) this.f88216a.mo72067a((int) R.id.cg2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$h */
    static final class C34129h extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f88217a;

        C34129h(GroupChatMembersActivity groupChatMembersActivity) {
            this.f88217a = groupChatMembersActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f88217a.mo72067a((int) R.id.az8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$i */
    static final class C34130i extends C52712l implements C52670a<DmtEditText> {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f88218a;

        C34130i(GroupChatMembersActivity groupChatMembersActivity) {
            this.f88218a = groupChatMembersActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (DmtEditText) this.f88218a.mo72067a((int) R.id.aca);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity$j */
    static final class C34131j extends C52712l implements C52670a<ImTextTitleBar> {

        /* renamed from: a */
        final /* synthetic */ GroupChatMembersActivity f88219a;

        C34131j(GroupChatMembersActivity groupChatMembersActivity) {
            this.f88219a = groupChatMembersActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImTextTitleBar) this.f88219a.mo72067a((int) R.id.d10);
        }
    }

    /* renamed from: e */
    private final ImTextTitleBar m77935e() {
        return (ImTextTitleBar) this.f88201h.getValue();
    }

    /* renamed from: a */
    public final RecyclerView mo72066a() {
        return (RecyclerView) this.f88202i.getValue();
    }

    /* renamed from: a */
    public final View mo72067a(int i) {
        if (this.f88210q == null) {
            this.f88210q = new HashMap();
        }
        View view = (View) this.f88210q.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f88210q.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final ImageView mo72068b() {
        return (ImageView) this.f88203j.getValue();
    }

    /* renamed from: c */
    public final DmtEditText mo72069c() {
        return (DmtEditText) this.f88204k.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
    }

    public final void onDestroy() {
        super.onDestroy();
        C11190e eVar = this.f88205l;
        if (eVar != null) {
            eVar.mo20695b();
        }
    }

    /* renamed from: f */
    private final void m77936f() {
        m77935e().setTitle(getString(R.string.bin, new Object[]{Integer.valueOf(this.f88200f.size())}));
    }

    /* renamed from: i */
    private final void m77939i() {
        ArrayList<C33368b> arrayList = this.f88199e;
        C34144a aVar = this.f88208o;
        if (aVar == null) {
            C52711k.m112237a("mAddMemberItem");
        }
        arrayList.add(aVar);
        C34137c cVar = this.f88198d;
        if (cVar == null) {
            C52711k.m112237a("mAvatarListAdapter");
        }
        cVar.mo72083a(this.f88199e);
    }

    /* renamed from: h */
    private final void m77938h() {
        String str;
        if (this.f88207n == null) {
            C11180b bVar = this.f88206m;
            if (bVar != null) {
                str = bVar.getConversationId();
            } else {
                str = null;
            }
            this.f88207n = new C34150g(str);
        }
        ArrayList<C33368b> arrayList = this.f88199e;
        C34144a aVar = this.f88208o;
        if (aVar == null) {
            C52711k.m112237a("mAddMemberItem");
        }
        arrayList.add(aVar);
        ArrayList<C33368b> arrayList2 = this.f88199e;
        C34150g gVar = this.f88207n;
        if (gVar == null) {
            C52711k.m112234a();
        }
        arrayList2.add(gVar);
        C34137c cVar = this.f88198d;
        if (cVar == null) {
            C52711k.m112237a("mAvatarListAdapter");
        }
        cVar.mo72083a(this.f88199e);
    }

    /* renamed from: d */
    public final void mo72070d() {
        C34237d a = C34238a.m78110a();
        C11180b bVar = this.f88206m;
        if (bVar == null) {
            C52711k.m112234a();
        }
        String conversationId = bVar.getConversationId();
        C52711k.m112236a((Object) conversationId, "mConversation!!.conversationId");
        List b = a.mo72231b(conversationId);
        if (b != null) {
            this.f88199e.clear();
            this.f88200f.clear();
            Collection collection = b;
            this.f88199e.addAll(collection);
            this.f88200f.addAll(collection);
            m77937g();
            m77936f();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        if (r0.getRole() == com.bytedance.p702im.core.proto.GroupRole.OWNER.getValue()) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0071, code lost:
        if (r0.getRole() == com.bytedance.p702im.core.proto.GroupRole.MANAGER.getValue()) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a();
        r1 = r5.f88206m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        if (r1 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r1 = r1.getConversationId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0080, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0085, code lost:
        if (r0.mo72235c(r1) != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0087, code lost:
        m77938h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008a, code lost:
        return;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m77937g() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.profile.model.User r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79732c()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser.fromUser(r0)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            java.util.ArrayList<com.ss.android.ugc.aweme.im.sdk.chat.b.a.a> r1 = r5.f88200f
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r1 = r1.iterator()
        L_0x001a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0035
            java.lang.Object r3 = r1.next()
            r4 = r3
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r4 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a) r4
            com.ss.android.ugc.aweme.im.service.model.IMUser r4 = r4.getUser()
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r4)
            if (r4 == 0) goto L_0x001a
            r2.add(r3)
            goto L_0x001a
        L_0x0035:
            java.util.List r2 = (java.util.List) r2
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L_0x008e
            r0 = 0
            java.lang.Object r0 = r2.get(r0)
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = (com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a) r0
            r5.f88209p = r0
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = r5.f88209p
            if (r0 == 0) goto L_0x005d
            com.bytedance.im.core.c.o r0 = r0.getMember()
            if (r0 == 0) goto L_0x005d
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.p702im.core.proto.GroupRole.OWNER
            int r1 = r1.getValue()
            if (r0 == r1) goto L_0x0073
        L_0x005d:
            com.ss.android.ugc.aweme.im.sdk.chat.b.a.a r0 = r5.f88209p
            if (r0 == 0) goto L_0x008b
            com.bytedance.im.core.c.o r0 = r0.getMember()
            if (r0 == 0) goto L_0x008b
            int r0 = r0.getRole()
            com.bytedance.im.core.proto.GroupRole r1 = com.bytedance.p702im.core.proto.GroupRole.MANAGER
            int r1 = r1.getValue()
            if (r0 != r1) goto L_0x008b
        L_0x0073:
            com.ss.android.ugc.aweme.im.sdk.group.d r0 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a.m78110a()
            com.bytedance.im.core.c.b r1 = r5.f88206m
            if (r1 == 0) goto L_0x0080
            java.lang.String r1 = r1.getConversationId()
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            boolean r0 = r0.mo72235c(r1)
            if (r0 != 0) goto L_0x008b
            r5.m77938h()
            return
        L_0x008b:
            r5.m77939i()
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatMembersActivity.m77937g():void");
    }

    /* renamed from: a */
    public static final /* synthetic */ C34137c m77934a(GroupChatMembersActivity groupChatMembersActivity) {
        C34137c cVar = groupChatMembersActivity.f88198d;
        if (cVar == null) {
            C52711k.m112237a("mAvatarListAdapter");
        }
        return cVar;
    }

    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        CharSequence charSequence;
        String str;
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bc4);
        C34004b.m77718b().setupStatusBar(this);
        Intent intent = getIntent();
        String str2 = null;
        if (intent != null) {
            serializable = intent.getSerializableExtra("conversation");
        } else {
            serializable = null;
        }
        if (serializable != null) {
            this.f88206m = (C11180b) serializable;
            C11180b bVar = this.f88206m;
            if (bVar != null) {
                charSequence = bVar.getConversationId();
            } else {
                charSequence = null;
            }
            CharSequence charSequence2 = charSequence;
            if (!(charSequence2 == null || charSequence2.length() == 0)) {
                z = false;
            }
            if (z) {
                finish();
            } else {
                C11180b bVar2 = this.f88206m;
                if (bVar2 != null) {
                    str = bVar2.getConversationId();
                } else {
                    str = null;
                }
                this.f88205l = new C11190e(str);
                C11180b bVar3 = this.f88206m;
                if (bVar3 != null) {
                    str2 = bVar3.getConversationId();
                }
                this.f88208o = new C34144a(str2);
            }
            this.f88196b = new GridLayoutManager(this, 5);
            RecyclerView a = mo72066a();
            C52711k.m112236a((Object) a, "mAvatarListView");
            GridLayoutManager gridLayoutManager = this.f88196b;
            if (gridLayoutManager == null) {
                C52711k.m112237a("viewMemberLayoutManager");
            }
            a.setLayoutManager(gridLayoutManager);
            mo72066a().setItemViewCacheSize(25);
            this.f88198d = new C34137c(this.f88200f);
            RecyclerView a2 = mo72066a();
            C52711k.m112236a((Object) a2, "mAvatarListView");
            C34137c cVar = this.f88198d;
            if (cVar == null) {
                C52711k.m112237a("mAvatarListAdapter");
            }
            a2.setAdapter(cVar);
            mo72066a().postDelayed(new C34127f(this), 400);
            mo72070d();
            mo72069c().addTextChangedListener(new C34123b(this));
            m77935e().setOnTitlebarClickListener(new C34124c(this));
            mo72068b().setOnClickListener(new C34125d(this));
            C11190e eVar = this.f88205l;
            if (eVar != null) {
                eVar.mo20688a((C11200i) new C34126e(this));
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.detail.GroupChatMembersActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.bytedance.im.core.model.Conversation");
    }
}
