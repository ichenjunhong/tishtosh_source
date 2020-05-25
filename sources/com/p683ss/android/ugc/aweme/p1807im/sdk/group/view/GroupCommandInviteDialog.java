package com.p683ss.android.ugc.aweme.p1807im.sdk.group.view;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0210y.C0212b;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.p702im.core.p703a.p704a.C11163c;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.app.p1373d.C23064c;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34149f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34278c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1837a.C34185b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.viewmodel.GroupFollowMemberViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupCommandInviteDialog */
public final class GroupCommandInviteDialog extends BaseBottomShareDialog implements OnClickListener {

    /* renamed from: g */
    static final /* synthetic */ C52767h[] f88528g = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(GroupCommandInviteDialog.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/im/sdk/group/adapter/FollowMemberHeadListAdapter;"))};

    /* renamed from: k */
    public static final C34287a f88529k = new C34287a(null);

    /* renamed from: h */
    public String f88530h;

    /* renamed from: i */
    public int f88531i = 1;

    /* renamed from: j */
    public C34303a f88532j;

    /* renamed from: l */
    private String f88533l;

    /* renamed from: m */
    private String f88534m;

    /* renamed from: n */
    private int f88535n;

    /* renamed from: o */
    private final C52668f f88536o = C52732g.m112285a(new C34291e(this));

    /* renamed from: p */
    private final GroupFollowMemberViewModel f88537p;

    /* renamed from: q */
    private String f88538q;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupCommandInviteDialog$a */
    public static final class C34287a {
        private C34287a() {
        }

        public /* synthetic */ C34287a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupCommandInviteDialog$b */
    public static final class C34288b implements C11163c<List<? extends C11206o>> {

        /* renamed from: a */
        final /* synthetic */ GroupCommandInviteDialog f88539a;

        C34288b(GroupCommandInviteDialog groupCommandInviteDialog) {
            this.f88539a = groupCommandInviteDialog;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            List list = (List) obj;
            C32458a.m75144a("GroupInviteDialog enterGroup success");
            this.f88539a.dismiss();
            this.f88539a.mo72320e();
        }

        /* renamed from: a */
        public final void mo20508a(C11202k kVar) {
            Object obj;
            Object obj2;
            String str;
            Object obj3;
            StringBuilder sb = new StringBuilder("GroupInviteDialog enterGroup failed: ");
            String str2 = null;
            if (kVar != null) {
                obj = Integer.valueOf(kVar.f30203a);
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ");
            if (kVar != null) {
                obj2 = Integer.valueOf(kVar.f30204b);
            } else {
                obj2 = null;
            }
            sb.append(obj2);
            sb.append(", ");
            if (kVar != null) {
                str = kVar.f30205c;
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(", ");
            if (kVar != null) {
                obj3 = Long.valueOf(kVar.f30206d);
            } else {
                obj3 = null;
            }
            sb.append(obj3);
            sb.append(", ");
            if (kVar != null) {
                str2 = kVar.f30207e;
            }
            sb.append(str2);
            C32458a.m75144a(sb.toString());
            Context context = this.f88539a.getContext();
            C52711k.m112236a((Object) context, "context");
            C34214b.m78054a(context, kVar);
            if (kVar != null) {
                String str3 = kVar.f30207e;
                if (str3 != null) {
                    try {
                        Object a = C35277o.m79760a(str3, C34279d.class);
                        C52711k.m112236a(a, "GsonUtil.parse(this, GroupCheckMsg::class.java)");
                        C34279d dVar = (C34279d) a;
                        GroupCommandInviteDialog groupCommandInviteDialog = this.f88539a;
                        GroupCommandInviteDialog.m78185a(this.f88539a);
                        groupCommandInviteDialog.f88531i = C34303a.m78208a(dVar.getStatusCode());
                        GroupCommandInviteDialog.m78185a(this.f88539a).mo72330a(this.f88539a.f88531i);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20509a(Object obj, C11202k kVar) {
            List list = (List) obj;
            C32458a.m75144a("GroupInviteDialog enterGroup success with info");
            this.f88539a.dismiss();
            this.f88539a.mo72320e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupCommandInviteDialog$c */
    static final class C34289c<T> implements C1710e<Object> {

        /* renamed from: a */
        public static final C34289c f88540a = new C34289c();

        C34289c() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupCommandInviteDialog$d */
    static final class C34290d<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C34290d f88541a = new C34290d();

        C34290d() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th != null) {
                C32458a.m75148a(th);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupCommandInviteDialog$e */
    static final class C34291e extends C52712l implements C52670a<C34185b> {

        /* renamed from: a */
        final /* synthetic */ GroupCommandInviteDialog f88542a;

        C34291e(GroupCommandInviteDialog groupCommandInviteDialog) {
            this.f88542a = groupCommandInviteDialog;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C34185b(this.f88542a.f88524e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupCommandInviteDialog$f */
    static final class C34292f extends C52712l implements C52671b<GroupFollowMemberViewModel, GroupFollowMemberViewModel> {

        /* renamed from: a */
        final /* synthetic */ GroupCommandInviteDialog f88543a;

        C34292f(GroupCommandInviteDialog groupCommandInviteDialog) {
            this.f88543a = groupCommandInviteDialog;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            GroupFollowMemberViewModel groupFollowMemberViewModel = (GroupFollowMemberViewModel) obj;
            C52711k.m112240b(groupFollowMemberViewModel, "$receiver");
            groupFollowMemberViewModel.f88677a = this.f88543a.f88530h;
            return groupFollowMemberViewModel;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.GroupCommandInviteDialog$g */
    static final class C34293g<TTaskResult, TContinuationResult> implements C0011g<C34149f, Void> {

        /* renamed from: a */
        final /* synthetic */ GroupCommandInviteDialog f88544a;

        C34293g(GroupCommandInviteDialog groupCommandInviteDialog) {
            this.f88544a = groupCommandInviteDialog;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            if (!iVar.mo26b() || iVar.mo34e() == null) {
                if (iVar.mo35f() instanceof C23459a) {
                    Exception f = iVar.mo35f();
                    if (f == null) {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                    } else if (((C23459a) f).getRawResponse() instanceof C34149f) {
                        Exception f2 = iVar.mo35f();
                        if (f2 != null) {
                            C23459a aVar = (C23459a) f2;
                            Object rawResponse = aVar.getRawResponse();
                            if (rawResponse != null) {
                                this.f88544a.mo72317a(((C34149f) rawResponse).getGroupVerifyInfo(), aVar.getErrorCode());
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.detail.model.GroupVerifyResponse");
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                        }
                    }
                }
                this.f88544a.mo72317a(null, -1);
            } else {
                this.f88544a.mo72317a(((C34149f) iVar.mo34e()).getGroupVerifyInfo(), ((C34149f) iVar.mo34e()).status_code);
            }
            return null;
        }
    }

    /* renamed from: b */
    public final int mo42942b() {
        return R.layout.bcf;
    }

    /* renamed from: d */
    public final C34185b mo72319d() {
        return (C34185b) this.f88536o.getValue();
    }

    public final void show() {
        super.show();
        C35190af.m79519h(this.f88530h, "floating_layer");
    }

    /* renamed from: f */
    private final void m78186f() {
        if (this.f88538q != null) {
            this.f88531i = 5;
            C34303a aVar = this.f88532j;
            if (aVar == null) {
                C52711k.m112237a("mGroupCommandInviteDelegate");
            }
            aVar.mo72330a(this.f88531i);
            DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.a4o);
            C52711k.m112236a((Object) dmtTextView, "description_tv");
            dmtTextView.setText(this.f88523d.getResources().getText(R.string.bi4));
            C35286u.m79875a(this.f88538q, 1, (String) null, (C0011g<C34149f, Void>) new C34293g<C34149f,Void>(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo72312c() {
        super.mo72312c();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.e9q);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.f88523d, 0, false));
        recyclerView.setAdapter(mo72319d());
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.yo);
        C52711k.m112236a((Object) dmtTextView, "confirm_btn");
        this.f88532j = new C34303a(dmtTextView);
        OnClickListener onClickListener = this;
        ((DmtTextView) findViewById(R.id.yo)).setOnClickListener(onClickListener);
        ((ImageView) findViewById(R.id.ue)).setOnClickListener(onClickListener);
    }

    /* renamed from: e */
    public final void mo72320e() {
        boolean z;
        Collection collection = (Collection) this.f88537p.f90199p.getValue();
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            List list = (List) this.f88537p.f90199p.getValue();
            if (list != null) {
                Iterable<IMContact> iterable = list;
                Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
                for (IMContact iMContact : iterable) {
                    if (iMContact != null) {
                        arrayList.add((IMUser) iMContact);
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.service.model.IMUser");
                    }
                }
                List<IMUser> list2 = (List) arrayList;
                C35286u.m79863a(list2, 1, 0, -1, C23064c.m56602a("message"), this.f88530h).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) C34289c.f88540a, (C1710e<? super Throwable>) C34290d.f88541a);
                for (IMUser uid : list2) {
                    C35190af.m79505e(this.f88530h, "group_inflow_layer", "", uid.getUid());
                }
            }
        }
        C34004b a = C34004b.m77717a();
        C52711k.m112236a((Object) a, "AwemeImManager.instance()");
        C35460j f = a.mo71949f();
        C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
        if (f.isMainPage()) {
            Bundle bundle = new Bundle();
            bundle.putInt("key_enter_from", 8);
            ChatRoomActivity.m76454a(getContext(), this.f88530h, 3, bundle);
            return;
        }
        C10691a.m21533a(getContext(), (int) R.string.bh2).mo19066a();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m78186f();
    }

    /* renamed from: a */
    public static final /* synthetic */ C34303a m78185a(GroupCommandInviteDialog groupCommandInviteDialog) {
        C34303a aVar = groupCommandInviteDialog.f88532j;
        if (aVar == null) {
            C52711k.m112237a("mGroupCommandInviteDelegate");
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo72318a(boolean z) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.e9r);
        C52711k.m112236a((Object) linearLayout, "follow_user_infos");
        linearLayout.setVisibility(8);
        DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.a4o);
        C52711k.m112236a((Object) dmtTextView, "description_tv");
        dmtTextView.setText(this.f88523d.getResources().getText(R.string.fsu));
    }

    public final void onClick(View view) {
        Integer num;
        int i;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num == null || num.intValue() != R.id.yo) {
            if (num != null && num.intValue() == R.id.ue) {
                dismiss();
            }
        } else if (this.f88531i == 6) {
            m78186f();
        } else {
            String str = this.f88534m;
            if (str != null) {
                C34238a.m78110a().mo72225a(this.f88530h, this.f88533l, C52575l.m112092a(IMUser.fromUser(C35265e.m79732c())), C34278c.m78180a(Long.parseLong(str), 2, this.f88538q), new C34288b(this));
            }
            String str2 = this.f88530h;
            String str3 = "floating_layer";
            List list = (List) this.f88537p.f90194k.getValue();
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            C35190af.m79463a(str2, str3, i, this.f88535n, this.f88537p.mo73184p());
        }
    }

    public GroupCommandInviteDialog(Context context, String str) {
        C0209x xVar;
        C52711k.m112240b(context, "context");
        super(context);
        this.f88538q = str;
        C0184k kVar = this.f88524e;
        C52671b fVar = new C34292f(this);
        Class<GroupFollowMemberViewModel> cls = GroupFollowMemberViewModel.class;
        if (kVar instanceof Fragment) {
            C0210y a = C0214z.m439a((Fragment) kVar, (C0212b) mo72311a());
            String name = cls.getName();
            C52711k.m112236a((Object) name, "viewModelClass.java.name");
            xVar = a.mo360a(name, cls);
            C52711k.m112236a((Object) xVar, "this");
            fVar.invoke(xVar);
        } else if (kVar instanceof FragmentActivity) {
            C0210y a2 = C0214z.m441a((FragmentActivity) kVar, (C0212b) mo72311a());
            String name2 = cls.getName();
            C52711k.m112236a((Object) name2, "viewModelClass.java.name");
            xVar = a2.mo360a(name2, cls);
            C52711k.m112236a((Object) xVar, "this");
            fVar.invoke(xVar);
        } else {
            throw new IllegalAccessException("owner must be either FragmentActivity or Fragment");
        }
        C52711k.m112236a((Object) xVar, "when (lifecycleOwner) {\n…)\n            }\n        }");
        this.f88537p = (GroupFollowMemberViewModel) xVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fb, code lost:
        if (r10 == null) goto L_0x00fd;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72317a(com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34148e r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L_0x0168
            java.lang.String r2 = r10.getInviterUserId()
            r9.f88534m = r2
            java.lang.String r2 = r10.getConversationId()
            r9.f88530h = r2
            java.lang.String r2 = r10.getConversationShortId()
            r9.f88533l = r2
            java.lang.String r2 = r10.getTicket()
            r9.f88538q = r2
            com.bytedance.im.core.c.d r2 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r3 = r10.getConversationId()
            com.bytedance.im.core.c.b r2 = r2.mo20658a(r3)
            java.lang.String r3 = r10.getGroupAvatar()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0039
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r3 = 0
            goto L_0x003a
        L_0x0039:
            r3 = 1
        L_0x003a:
            r4 = 0
            r5 = 2132017532(0x7f14017c, float:1.9673345E38)
            if (r3 == 0) goto L_0x0058
            android.view.View r3 = r9.findViewById(r5)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r3 = (com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView) r3
            if (r2 == 0) goto L_0x0053
            com.bytedance.im.core.c.c r5 = r2.getCoreInfo()
            if (r5 == 0) goto L_0x0053
            java.lang.String r5 = r5.getIcon()
            goto L_0x0054
        L_0x0053:
            r5 = r4
        L_0x0054:
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r3, r5)
            goto L_0x0065
        L_0x0058:
            android.view.View r3 = r9.findViewById(r5)
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r3 = (com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView) r3
            java.lang.String r5 = r10.getGroupAvatar()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r3, r5)
        L_0x0065:
            java.lang.String r3 = r10.getGroupName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0076
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r3 = 0
            goto L_0x0077
        L_0x0076:
            r3 = 1
        L_0x0077:
            r5 = 2132021228(0x7f140fec, float:1.9680841E38)
            if (r3 == 0) goto L_0x0099
            android.view.View r3 = r9.findViewById(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r3
            java.lang.String r6 = "name_tv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
            if (r2 == 0) goto L_0x0093
            com.bytedance.im.core.c.c r6 = r2.getCoreInfo()
            if (r6 == 0) goto L_0x0093
            java.lang.String r4 = r6.getName()
        L_0x0093:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            goto L_0x00ad
        L_0x0099:
            android.view.View r3 = r9.findViewById(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r3
            java.lang.String r4 = "name_tv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r4 = r10.getGroupName()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
        L_0x00ad:
            android.view.View r3 = r9.findViewById(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r3
            r3.requestLayout()
            java.lang.Integer r10 = r10.getGroupMemberCount()
            r3 = 2132545355(0x7f1c0f4b, float:2.0743897E38)
            r4 = 2132018351(0x7f1404af, float:1.9675006E38)
            if (r10 == 0) goto L_0x00fd
            r5 = r10
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            android.view.View r6 = r9.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r7 = "count_tv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r6.setVisibility(r1)
            android.view.View r6 = r9.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r6
            java.lang.String r7 = "count_tv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            android.content.Context r7 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8[r1] = r5
            java.lang.String r5 = r7.getString(r3, r8)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6.setText(r5)
            if (r10 != 0) goto L_0x0137
        L_0x00fd:
            if (r2 == 0) goto L_0x0137
            int r10 = r2.getMemberCount()
            if (r10 <= 0) goto L_0x0137
            android.view.View r2 = r9.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r5 = "count_tv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            r2.setVisibility(r1)
            android.view.View r2 = r9.findViewById(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r2
            java.lang.String r4 = "count_tv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r0[r1] = r10
            java.lang.String r10 = r4.getString(r3, r0)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r2.setText(r10)
        L_0x0137:
            com.ss.android.ugc.aweme.im.sdk.group.view.a r10 = r9.f88532j
            if (r10 != 0) goto L_0x0140
            java.lang.String r10 = "mGroupCommandInviteDelegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x0140:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            int r10 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34303a.m78208a(r10)
            r9.f88531i = r10
            java.lang.String r10 = r9.f88534m
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            com.ss.android.ugc.aweme.profile.model.User r11 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79732c()
            java.lang.String r0 = "AppUtil.getCurrentUser()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r0)
            java.lang.String r11 = r11.getUid()
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            boolean r10 = android.text.TextUtils.equals(r10, r11)
            if (r10 == 0) goto L_0x0182
            r10 = 8
            r9.f88531i = r10
            goto L_0x0182
        L_0x0168:
            com.ss.android.ugc.aweme.im.sdk.group.view.a r10 = r9.f88532j
            if (r10 != 0) goto L_0x0171
            java.lang.String r10 = "mGroupCommandInviteDelegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r10)
        L_0x0171:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            int r10 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34303a.m78208a(r10)
            r9.f88531i = r10
            int r10 = r9.f88531i
            if (r10 != r0) goto L_0x0182
            r10 = 6
            r9.f88531i = r10
        L_0x0182:
            r9.mo72318a(r1)
            com.ss.android.ugc.aweme.im.sdk.group.view.a r10 = r9.f88532j
            if (r10 != 0) goto L_0x018e
            java.lang.String r11 = "mGroupCommandInviteDelegate"
            p2628d.p2639f.p2641b.C52711k.m112237a(r11)
        L_0x018e:
            int r11 = r9.f88531i
            r10.mo72330a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.GroupCommandInviteDialog.mo72317a(com.ss.android.ugc.aweme.im.sdk.detail.b.e, int):void");
    }
}
