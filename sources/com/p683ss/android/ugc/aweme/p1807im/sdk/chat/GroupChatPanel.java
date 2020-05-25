package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p703a.p704a.C11162b;
import com.bytedance.p702im.core.p706c.C11180b;
import com.bytedance.p702im.core.p706c.C11181c;
import com.bytedance.p702im.core.p706c.C11182d;
import com.bytedance.p702im.core.p706c.C11190e;
import com.bytedance.p702im.core.p706c.C11197f;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11207p;
import com.bytedance.p702im.core.p706c.C11207p.C11209a;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.emoji.p1687f.C29366a;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.SayHelloContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1814b.p1815a.C33367a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.GroupChatDetailActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34213a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34341h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34341h.C34342a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.GroupFollowGuideDialog;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35197am;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35210aw;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel */
public final class GroupChatPanel extends BaseChatPanel {

    /* renamed from: u */
    static final /* synthetic */ C52767h[] f86430u = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupChatPanel.class), "mGroupFollowGuideDialog", "getMGroupFollowGuideDialog()Lcom/ss/android/ugc/aweme/im/sdk/group/view/GroupFollowGuideDialog;"))};

    /* renamed from: x */
    public static final C33326a f86431x = new C33326a(null);

    /* renamed from: v */
    public boolean f86432v;

    /* renamed from: w */
    public final C33677l f86433w;

    /* renamed from: y */
    private final StringBuilder f86434y = new StringBuilder();

    /* renamed from: z */
    private final C52668f f86435z = C52732g.m112285a(new C33330e(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$a */
    public static final class C33326a {
        private C33326a() {
        }

        public /* synthetic */ C33326a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$b */
    public static final class C33327b implements C11162b<C11180b> {
        C33327b() {
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo20506a(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$c */
    static final class C33328c extends C52712l implements C52671b<List<? extends C33367a>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupChatPanel f86436a;

        C33328c(GroupChatPanel groupChatPanel) {
            this.f86436a = groupChatPanel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Integer num;
            List list = (List) obj;
            C11180b a = C11182d.m22641a().mo20658a(this.f86436a.f86433w.getConversationId());
            StringBuilder sb = new StringBuilder(" mHasCheckShowGroupFollowGuideDialog: ");
            sb.append(this.f86436a.f86432v);
            sb.append(" memberList: ");
            if (list != null) {
                num = Integer.valueOf(list.size());
            } else {
                num = Integer.valueOf(0);
            }
            sb.append(num);
            if (a != null) {
                boolean z = this.f86436a.f86432v;
                this.f86436a.f86432v = true;
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$d */
    static final class C33329d extends C52712l implements C52671b<Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupChatPanel f86437a;

        C33329d(GroupChatPanel groupChatPanel) {
            this.f86437a = groupChatPanel;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            this.f86437a.f86433w.setGroupRole(((Number) obj).intValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$e */
    static final class C33330e extends C52712l implements C52670a<GroupFollowGuideDialog> {

        /* renamed from: a */
        final /* synthetic */ GroupChatPanel f86438a;

        C33330e(GroupChatPanel groupChatPanel) {
            this.f86438a = groupChatPanel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f86438a.f86384c;
            C52711k.m112236a((Object) context, "mContext");
            return new GroupFollowGuideDialog(context, this.f86438a.f86433w.getConversationId());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$f */
    static final class C33331f<T> implements C23371a<List<C29366a>> {

        /* renamed from: a */
        final /* synthetic */ C11180b f86439a;

        /* renamed from: b */
        final /* synthetic */ GroupChatPanel f86440b;

        C33331f(C11180b bVar, GroupChatPanel groupChatPanel) {
            this.f86439a = bVar;
            this.f86440b = groupChatPanel;
        }

        public final /* synthetic */ void run(Object obj) {
            boolean z;
            List list = (List) obj;
            Collection collection = list;
            boolean z2 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C11180b bVar = this.f86439a;
                SayHelloContent sayHelloContent = new SayHelloContent();
                sayHelloContent.setEmoji(list);
                C11207p a = new C11209a().mo20825a(bVar).mo20824a((int) BaseNotice.CHECK_PROFILE).mo20826a(C35277o.m79761a(sayHelloContent)).mo20827a();
                C52711k.m112236a((Object) a, "it");
                a.setMsgStatus(2);
                C35197am.m79561b(a);
                Map localExt = bVar.getLocalExt();
                if (localExt == null) {
                    localExt = new LinkedHashMap();
                }
                localExt.put("a:s_awe_greet_msg", "1");
                bVar.setLocalExt(localExt);
                Map map = null;
                C11190e.m22688a(bVar.getConversationId(), localExt, (Runnable) null);
                C11190e eVar = new C11190e(bVar.getConversationId());
                C11197f settingInfo = bVar.getSettingInfo();
                if (settingInfo != null) {
                    Map ext = settingInfo.getExt();
                    if (ext != null) {
                        map = C52550ab.m112058c(ext);
                    }
                }
                if (map == null || map.isEmpty()) {
                    z2 = true;
                }
                if (z2) {
                    map = new LinkedHashMap();
                }
                map.put("a:s_awe_greet_msg", "1");
                C11197f settingInfo2 = bVar.getSettingInfo();
                if (settingInfo2 != null) {
                    settingInfo2.setExt(map);
                }
                eVar.mo20692a(map, (C11162b) new C33327b());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$g */
    static final class C33332g extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ GroupChatPanel f86441a;

        /* renamed from: b */
        final /* synthetic */ C34279d f86442b;

        C33332g(GroupChatPanel groupChatPanel, C34279d dVar) {
            this.f86441a = groupChatPanel;
            this.f86442b = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            List invalidMembers = this.f86442b.getInvalidMembers();
            if (invalidMembers != null) {
                C34238a.m78110a();
                String conversationId = this.f86441a.f86433w.getConversationId();
                Iterable<IMUser> iterable = invalidMembers;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (IMUser uid : iterable) {
                    arrayList.add(uid.getUid());
                }
                C34237d.m78092c(conversationId, (List) arrayList);
            }
            C10691a.m21537a(this.f86441a.f86384c, C11010c.m22280a().getResources().getString(R.string.bik)).mo19066a();
            C35190af.m79470a("start", "group_agree", this.f86442b.getInvalidMembers(), "confirm");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$h */
    static final class C33333h extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34279d f86443a;

        C33333h(C34279d dVar) {
            this.f86443a = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            C35190af.m79470a("start", "group_agree", this.f86443a.getInvalidMembers(), "cancel");
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$i */
    public static final class C33334i implements C35356a {

        /* renamed from: a */
        final /* synthetic */ GroupChatPanel f86444a;

        /* renamed from: b */
        final /* synthetic */ C11180b f86445b;

        /* renamed from: c */
        public final void mo70671c() {
        }

        /* renamed from: a */
        public final void mo70669a() {
            this.f86444a.f86385d.finish();
            C35190af.m79514g(this.f86444a.f86433w.getConversationId(), "group");
        }

        /* renamed from: b */
        public final void mo70670b() {
            String str;
            C11180b bVar = this.f86445b;
            if (bVar != null) {
                C11180b bVar2 = this.f86445b;
                if (bVar2 != null) {
                    str = bVar2.getConversationId();
                } else {
                    str = null;
                }
                C35190af.m79498d(str, "", "group");
                if (!bVar.isMember()) {
                    C10691a.m21542b((Context) this.f86444a.f86385d, (int) R.string.bmj).mo19066a();
                } else if (C34213a.m78051a(bVar)) {
                    C10691a.m21542b((Context) this.f86444a.f86385d, (int) R.string.bhv).mo19066a();
                } else {
                    Context context = this.f86444a.f86385d;
                    C52711k.m112240b(context, "context");
                    C52711k.m112240b(bVar, "conversation");
                    Intent intent = new Intent(context, GroupChatDetailActivity.class);
                    intent.putExtra("conversation", bVar);
                    context.startActivity(intent);
                }
            }
        }

        C33334i(GroupChatPanel groupChatPanel, C11180b bVar) {
            this.f86444a = groupChatPanel;
            this.f86445b = bVar;
        }
    }

    public final void onResume() {
        super.onResume();
        C11180b a = C11182d.m22641a().mo20658a(this.f86433w.getConversationId());
        if (a != null) {
            C34238a.m78110a();
            C34237d.m78094d(a);
        }
    }

    public final void onStop() {
        super.onStop();
        C11180b a = C11182d.m22641a().mo20658a(this.f86433w.getConversationId());
        if (a != null) {
            C34238a.m78110a();
            C34237d.m78094d(a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (r1 == null) goto L_0x0041;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70656d() {
        /*
            r5 = this;
            super.mo70656d()
            com.bytedance.im.core.c.d r0 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            com.ss.android.ugc.aweme.im.sdk.chat.l r1 = r5.f86433w
            java.lang.String r1 = r1.getConversationId()
            com.bytedance.im.core.c.b r0 = r0.mo20658a(r1)
            if (r0 == 0) goto L_0x0085
            r1 = 4
            java.lang.String r2 = "GroupChatPanel"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "refreshData:"
            r3.<init>(r4)
            java.lang.String r4 = r0.getConversationId()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r1, r2, r3)
            com.bytedance.im.core.c.f r1 = r0.getSettingInfo()
            if (r1 == 0) goto L_0x0041
            java.util.Map r1 = r1.getExt()
            if (r1 == 0) goto L_0x0041
            java.lang.String r2 = "a:s_awe_greet_msg"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0051
        L_0x0041:
            java.util.Map r1 = r0.getLocalExt()
            if (r1 == 0) goto L_0x0050
            java.lang.String r2 = "a:s_awe_greet_msg"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            boolean r2 = r0.isMember()
            if (r2 == 0) goto L_0x0077
            com.bytedance.im.core.c.o r2 = r0.getMember()
            if (r2 == 0) goto L_0x0069
            int r2 = r2.getRole()
            com.bytedance.im.core.proto.GroupRole r3 = com.bytedance.p702im.core.proto.GroupRole.OWNER
            int r3 = r3.getValue()
            if (r2 == r3) goto L_0x0077
        L_0x0069:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "1"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0077
            r1 = 1
            goto L_0x0078
        L_0x0077:
            r1 = 0
        L_0x0078:
            if (r1 == 0) goto L_0x0084
            com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$f r1 = new com.ss.android.ugc.aweme.im.sdk.chat.GroupChatPanel$f
            r1.<init>(r0, r5)
            com.ss.android.ugc.aweme.base.a r1 = (com.p683ss.android.ugc.aweme.base.C23371a) r1
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u.m79878b(r1)
        L_0x0084:
            return
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.chat.GroupChatPanel.mo70656d():void");
    }

    /* renamed from: c */
    public final void mo70655c() {
        boolean z;
        super.mo70655c();
        C34238a.m78110a().mo72224a(this.f86433w.getConversationId(), (C52671b<? super List<C33367a>, C52860x>) new C33328c<Object,C52860x>(this));
        C34238a.m78110a();
        C34237d.m78088a(this.f86433w.getConversationId(), C35265e.m79730b().toString(), (C52671b<? super Integer, C52860x>) new C33329d<Object,C52860x>(this));
        C34279d groupCheckMessage = this.f86433w.getGroupCheckMessage();
        if (groupCheckMessage != null) {
            Context context = this.f86384c;
            C52711k.m112236a((Object) context, "mContext");
            C34342a aVar = new C34342a(context);
            aVar.f88673e = new C33332g(this, groupCheckMessage);
            List<IMUser> invalidMembers = groupCheckMessage.getInvalidMembers();
            if (invalidMembers != null) {
                StringBuilder sb = new StringBuilder();
                for (IMUser iMUser : invalidMembers) {
                    IMUser a = C34010e.m77748a().mo71952a(iMUser.getUid());
                    if (a != null) {
                        sb.append(a.getDisplayName());
                        sb.append("、");
                        if (a != null) {
                        }
                    }
                    sb.append(iMUser.getDisplayName());
                    sb.append("、");
                }
                if (sb.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    sb.setLength(sb.length() - 1);
                }
                if (invalidMembers.size() > 1) {
                    C11010c.m22280a().getResources().getString(R.string.bii, new Object[]{sb.toString(), Integer.valueOf(invalidMembers.size())});
                } else {
                    C11010c.m22280a().getResources().getString(R.string.bih, new Object[]{sb.toString()});
                }
                aVar.f88669a = C11010c.m22280a().getResources().getString(R.string.bih, new Object[]{sb.toString()});
            }
            aVar.f88670b = C11010c.m22280a().getResources().getString(R.string.bid);
            aVar.f88672d = new C33333h(groupCheckMessage);
            new C34341h(aVar).show();
        }
    }

    /* renamed from: a */
    public final void mo70650a(ImTextTitleBar imTextTitleBar) {
        int i;
        C52711k.m112240b(imTextTitleBar, "titleBar");
        super.mo70650a(imTextTitleBar);
        C11180b a = C11182d.m22641a().mo20658a(this.f86433w.getConversationId());
        C11182d a2 = C11182d.m22641a();
        C52711k.m112236a((Object) a2, "ConversationListModel.inst()");
        Map e = a2.mo20678e();
        if (e != null) {
            i = e.size();
        } else {
            i = 0;
        }
        this.f86434y.append(i);
        this.f86434y.append(" ");
        if (a == null) {
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("conversation_id", this.f86433w.getConversationId());
            String sb = this.f86434y.toString();
            C52711k.m112236a((Object) sb, "mLogBuilder.toString()");
            int length = sb.length();
            if (length > 200) {
                String str = "tag";
                int i2 = length - 200;
                if (sb != null) {
                    String substring = sb.substring(i2, length);
                    C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    linkedHashMap.put(str, substring);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.lang.String");
                }
            } else {
                linkedHashMap.put("tag", sb);
            }
            linkedHashMap.put("error", String.valueOf(this.f86433w.getEnterFrom()));
            C35265e.m79731b("empty_conversation", linkedHashMap);
        }
        if (a != null) {
            C11181c coreInfo = a.getCoreInfo();
            if (coreInfo != null) {
                String name = coreInfo.getName();
                if (name != null) {
                    C52711k.m112240b(name, "$this$substringForGroupTitle");
                    if (C35210aw.m79596b(name, 0, name.length()) > 15) {
                        int a3 = C35210aw.m79596b(name, 0, name.length());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(C35210aw.m79595a(name, 0, 11));
                        sb2.append("...");
                        sb2.append(C35210aw.m79595a(name, a3 - 4, a3));
                        name = sb2.toString();
                    }
                } else {
                    name = null;
                }
                imTextTitleBar.setTitle(name);
            }
            imTextTitleBar.setTitleCount(C11010c.m22280a().getString(R.string.bim, new Object[]{Integer.valueOf(a.getMemberCount())}));
            if (!a.isMember() || C34213a.m78051a(a)) {
                View rightView = imTextTitleBar.getRightView();
                C52711k.m112236a((Object) rightView, "titleBar.rightView");
                rightView.setVisibility(8);
            } else {
                View rightView2 = imTextTitleBar.getRightView();
                C52711k.m112236a((Object) rightView2, "titleBar.rightView");
                rightView2.setVisibility(0);
            }
        }
        imTextTitleBar.setOnTitlebarClickListener(new C33334i(this, a));
    }

    public GroupChatPanel(C0184k kVar, View view, C33677l lVar) {
        C52711k.m112240b(kVar, "parent");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(lVar, "groupSessionInfo");
        super(kVar, view, lVar);
        this.f86433w = lVar;
    }

    /* renamed from: a */
    public final void mo70647a(int i, int i2, Intent intent) {
        Object obj;
        super.mo70647a(i, i2, intent);
        if (i == 223) {
            Object obj2 = null;
            if (intent != null) {
                obj = intent.getSerializableExtra("key_at_member");
            } else {
                obj = null;
            }
            if (obj instanceof IMUser) {
                obj2 = obj;
            }
            IMUser iMUser = (IMUser) obj2;
            if (iMUser != null) {
                String nickName = iMUser.getNickName();
                C52711k.m112236a((Object) nickName, "this.nickName");
                String uid = iMUser.getUid();
                C52711k.m112236a((Object) uid, "uid");
                mo70651a(nickName, uid);
                if (iMUser != null) {
                    return;
                }
            }
            mo70651a("", "");
        }
    }
}
