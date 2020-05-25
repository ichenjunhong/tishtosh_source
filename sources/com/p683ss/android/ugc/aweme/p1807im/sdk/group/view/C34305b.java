package com.p683ss.android.ugc.aweme.p1807im.sdk.group.view;

import android.content.Context;
import android.os.Bundle;
import android.support.p043v7.app.C1164e;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p703a.p704a.C11163c;
import com.bytedance.p702im.core.p706c.C11202k;
import com.bytedance.p702im.core.p706c.C11206o;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.ChatRoomActivity;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34148e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34149f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.C34237d.C34238a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34278c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34279d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.model.C34280e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.group.p1838b.C34214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35286u;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.b */
public final class C34305b extends C1164e {

    /* renamed from: n */
    public static final C34306a f88574n = new C34306a(null);

    /* renamed from: a */
    public final DmtTextView f88575a = ((DmtTextView) this.f88588o.findViewById(R.id.a4m));

    /* renamed from: b */
    public final C34303a f88576b;

    /* renamed from: c */
    public String f88577c;

    /* renamed from: d */
    public String f88578d;

    /* renamed from: e */
    String f88579e;

    /* renamed from: f */
    Integer f88580f;

    /* renamed from: g */
    public int f88581g;

    /* renamed from: h */
    public C34280e f88582h;

    /* renamed from: i */
    public C34149f f88583i;

    /* renamed from: j */
    public int f88584j;

    /* renamed from: k */
    public final String f88585k;

    /* renamed from: l */
    String f88586l;

    /* renamed from: m */
    public final int f88587m;

    /* renamed from: o */
    private final View f88588o;

    /* renamed from: p */
    private final AvatarImageView f88589p = ((AvatarImageView) this.f88588o.findViewById(R.id.i0));

    /* renamed from: q */
    private final DmtTextView f88590q = ((DmtTextView) this.f88588o.findViewById(R.id.bpu));

    /* renamed from: r */
    private final DmtTextView f88591r = ((DmtTextView) this.f88588o.findViewById(R.id.a1a));

    /* renamed from: s */
    private final DmtTextView f88592s = ((DmtTextView) this.f88588o.findViewById(R.id.yn));

    /* renamed from: t */
    private final ImageButton f88593t = ((ImageButton) this.f88588o.findViewById(R.id.ue));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.b$a */
    public static final class C34306a {
        private C34306a() {
        }

        public /* synthetic */ C34306a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.b$b */
    public static final class C34307b implements C11163c<List<? extends C11206o>> {

        /* renamed from: a */
        final /* synthetic */ C34305b f88594a;

        C34307b(C34305b bVar) {
            this.f88594a = bVar;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20506a(Object obj) {
            List list = (List) obj;
            C32458a.m75144a("GroupInviteDialog enterGroup success");
            this.f88594a.dismiss();
            this.f88594a.mo42942b();
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
            Context context = this.f88594a.getContext();
            C52711k.m112236a((Object) context, "context");
            C34214b.m78054a(context, kVar);
            if (kVar != null) {
                String str3 = kVar.f30207e;
                if (str3 != null) {
                    try {
                        Object a = C35277o.m79760a(str3, C34279d.class);
                        C52711k.m112236a(a, "GsonUtil.parse(this, GroupCheckMsg::class.java)");
                        C34279d dVar = (C34279d) a;
                        this.f88594a.f88581g = C34303a.m78208a(dVar.getStatusCode());
                        this.f88594a.f88576b.mo72330a(this.f88594a.f88581g);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        /* renamed from: a */
        public final /* synthetic */ void mo20509a(Object obj, C11202k kVar) {
            List list = (List) obj;
            C32458a.m75144a("GroupInviteDialog enterGroup success with info");
            this.f88594a.dismiss();
            this.f88594a.mo42942b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.b$c */
    static final class C34308c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34305b f88595a;

        C34308c(C34305b bVar) {
            this.f88595a = bVar;
        }

        public final void onClick(View view) {
            int i;
            ClickInstrumentation.onClick(view);
            int i2 = 6;
            if (this.f88595a.f88581g == 6) {
                this.f88595a.mo72331a();
                return;
            }
            C34305b bVar = this.f88595a;
            if (bVar.f88587m == 4) {
                String str = bVar.f88578d;
                String str2 = bVar.f88577c;
                Integer num = bVar.f88580f;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                C35190af.m79462a(str, str2, i);
            }
            StringBuilder sb = new StringBuilder("GroupInviteDialog enterGroup, mInviteUserId:");
            sb.append(bVar.f88577c);
            sb.append(", mConversationId:");
            sb.append(bVar.f88578d);
            sb.append(", mConversationShortId:");
            sb.append(bVar.f88579e);
            sb.append(", mTicket:");
            sb.append(bVar.f88586l);
            sb.append(", type=");
            sb.append(bVar.f88587m);
            C32458a.m75144a(sb.toString());
            String str3 = bVar.f88577c;
            if (str3 != null) {
                int i3 = bVar.f88587m;
                if (i3 == 1) {
                    i2 = 2;
                } else if (i3 == 4) {
                    i2 = 5;
                }
                C34238a.m78110a().mo72225a(bVar.f88578d, bVar.f88579e, C52575l.m112092a(IMUser.fromUser(C35265e.m79732c())), C34278c.m78180a(Long.parseLong(str3), i2, bVar.f88586l), new C34307b(bVar));
            }
            if (this.f88595a.f88587m == 1) {
                C35190af.m79463a(this.f88595a.f88578d, "pop_ups", 0, 0, 0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.b$d */
    static final class C34309d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34305b f88596a;

        C34309d(C34305b bVar) {
            this.f88596a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f88596a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.group.view.b$e */
    static final class C34310e<TTaskResult, TContinuationResult> implements C0011g<C34149f, Void> {

        /* renamed from: a */
        final /* synthetic */ C34305b f88597a;

        C34310e(C34305b bVar) {
            this.f88597a = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            Object obj;
            C34148e eVar;
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
                                C34149f fVar = (C34149f) rawResponse;
                                this.f88597a.f88583i = fVar;
                                this.f88597a.f88584j = aVar.getErrorCode();
                                this.f88597a.mo72332a(fVar.getGroupVerifyInfo(), aVar.getErrorCode());
                            } else {
                                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.detail.model.GroupVerifyResponse");
                            }
                        } else {
                            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
                        }
                    }
                }
                this.f88597a.f88581g = 6;
            } else {
                this.f88597a.f88583i = (C34149f) iVar.mo34e();
                C34305b bVar = this.f88597a;
                C34149f fVar2 = (C34149f) iVar.mo34e();
                if (fVar2 != null) {
                    eVar = fVar2.getGroupVerifyInfo();
                } else {
                    eVar = null;
                }
                bVar.mo72332a(eVar, ((C34149f) iVar.mo34e()).status_code);
            }
            StringBuilder sb = new StringBuilder("GroupInviteDialog refreshGroupInfo, RawTicket:");
            sb.append(this.f88597a.f88585k);
            sb.append(", type:");
            sb.append(this.f88597a.f88587m);
            sb.append(", Response:");
            sb.append(this.f88597a.f88583i);
            sb.append(", VerifyInfo:");
            C34149f fVar3 = this.f88597a.f88583i;
            if (fVar3 != null) {
                obj = fVar3.getGroupVerifyInfo();
            } else {
                obj = null;
            }
            sb.append(obj);
            sb.append(", ErrorCode:");
            sb.append(this.f88597a.f88584j);
            sb.append(", CurrentType:");
            sb.append(this.f88597a.f88581g);
            C32458a.m75144a(sb.toString());
            String str = this.f88597a.f88577c;
            if (!(str == null || !C35265e.m79729a(str) || this.f88597a.f88581g == 8)) {
                this.f88597a.f88581g = 0;
            }
            this.f88597a.f88576b.mo72330a(this.f88597a.f88581g);
            if (this.f88597a.f88581g == 0 || this.f88597a.f88581g == 8) {
                DmtTextView dmtTextView = this.f88597a.f88575a;
                C52711k.m112236a((Object) dmtTextView, "mDescriptionTv");
                dmtTextView.setText(C11010c.m22280a().getString(R.string.bib));
            }
            if (this.f88597a.f88587m == 4) {
                switch (this.f88597a.f88581g) {
                    case 0:
                        C35190af.m79493c(this.f88597a.f88578d, C35265e.m79730b().toString(), C35265e.m79730b().toString(), "send");
                        break;
                    case 1:
                        C35190af.m79493c(this.f88597a.f88578d, this.f88597a.f88577c, C35265e.m79730b().toString(), "join");
                        break;
                    case 2:
                        C35190af.m79493c(this.f88597a.f88578d, this.f88597a.f88577c, C35265e.m79730b().toString(), "expired");
                        break;
                }
            }
            return null;
        }
    }

    public final void onStop() {
        C32458a.m75144a("GroupInviteDialog onStop");
        super.onStop();
    }

    /* renamed from: a */
    public final void mo72331a() {
        if (this.f88586l != null) {
            if (!TextUtils.equals(this.f88577c, C35265e.m79730b())) {
                this.f88581g = 5;
                this.f88576b.mo72330a(this.f88581g);
            }
            C35286u.m79875a(this.f88586l, this.f88587m, this.f88578d, (C0011g<C34149f, Void>) new C34310e<C34149f,Void>(this));
        }
    }

    /* renamed from: b */
    public final void mo42942b() {
        if (this.f88587m == 1) {
            C34004b a = C34004b.m77717a();
            C52711k.m112236a((Object) a, "AwemeImManager.instance()");
            C35460j f = a.mo71949f();
            C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
            if (f.isMainPage()) {
                Bundle bundle = new Bundle();
                bundle.putInt("key_enter_from", 8);
                ChatRoomActivity.m76454a(getContext(), this.f88578d, 3, bundle);
                C35190af.m79442a();
                C35190af.m79468a(this.f88578d, "", "group", "command", "", ChatRoomActivity.m76444a());
                return;
            }
            C10691a.m21533a(getContext(), (int) R.string.bh2).mo19066a();
            return;
        }
        if (this.f88587m == 4) {
            C10691a.m21533a(getContext(), (int) R.string.bh2).mo19066a();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("key_enter_from", 8);
            ChatRoomActivity.m76454a(getContext(), this.f88578d, 3, bundle2);
            C35190af.m79442a();
            C35190af.m79468a(this.f88578d, "", "group", "invite_card", "", ChatRoomActivity.m76444a());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a0, code lost:
        if (r2 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c0, code lost:
        if (r3 != null) goto L_0x00c7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            r8 = 1
            r7.requestWindowFeature(r8)
            android.view.View r0 = r7.f88588o
            r7.setContentView(r0)
            android.view.Window r0 = r7.getWindow()
            if (r0 == 0) goto L_0x0016
            r1 = -2
            r0.setLayout(r1, r1)
        L_0x0016:
            java.lang.String r0 = "GroupInviteDialog onCreate"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f88592s
            com.ss.android.ugc.aweme.im.sdk.group.view.b$c r1 = new com.ss.android.ugc.aweme.im.sdk.group.view.b$c
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            android.widget.ImageButton r0 = r7.f88593t
            com.ss.android.ugc.aweme.im.sdk.group.view.b$d r1 = new com.ss.android.ugc.aweme.im.sdk.group.view.b$d
            r1.<init>(r7)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f88590q
            java.lang.String r1 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2132545333(0x7f1c0f35, float:2.0743853E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f88575a
            java.lang.String r1 = "mDescriptionTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.content.Context r1 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2132545336(0x7f1c0f38, float:2.0743859E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            com.ss.android.ugc.aweme.im.sdk.group.model.e r0 = r7.f88582h
            if (r0 == 0) goto L_0x0170
            java.lang.String r1 = r0.getConversationId()
            r7.f88578d = r1
            java.lang.String r1 = r0.getConversationShortId()
            r7.f88579e = r1
            java.lang.String r1 = r0.getFromUserId()
            r7.f88577c = r1
            com.bytedance.im.core.c.d r1 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r2 = r0.getConversationId()
            com.bytedance.im.core.c.b r1 = r1.mo20658a(r2)
            if (r1 == 0) goto L_0x00a2
            com.bytedance.im.core.c.c r2 = r1.getCoreInfo()
            if (r2 == 0) goto L_0x00a2
            java.lang.String r2 = r2.getIcon()
            if (r2 == 0) goto L_0x00a2
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r3 = r7.f88589p
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r3
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r3, r2)
            if (r2 != 0) goto L_0x00ad
        L_0x00a2:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r2 = r7.f88589p
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r2 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r2
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r0.getGroupIcon()
            com.p683ss.android.ugc.aweme.base.C23515d.m57669a(r2, r3)
        L_0x00ad:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r7.f88590q
            java.lang.String r3 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            if (r1 == 0) goto L_0x00c3
            com.bytedance.im.core.c.c r3 = r1.getCoreInfo()
            if (r3 == 0) goto L_0x00c3
            java.lang.String r3 = r3.getName()
            if (r3 == 0) goto L_0x00c3
            goto L_0x00c7
        L_0x00c3:
            java.lang.String r3 = r0.getGroupName()
        L_0x00c7:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            r2 = 0
            if (r1 == 0) goto L_0x0108
            int r1 = r1.getMemberCount()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r7.f88580f = r3
            if (r1 <= 0) goto L_0x0108
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r7.f88591r
            java.lang.String r4 = "mCountTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r3.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r7.f88591r
            java.lang.String r4 = "mCountTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2132545355(0x7f1c0f4b, float:2.0743897E38)
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r2] = r1
            java.lang.String r1 = r4.getString(r5, r6)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.setText(r1)
        L_0x0108:
            java.lang.String r1 = r0.getFromUserId()
            java.lang.CharSequence r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79730b()
            java.lang.String r3 = r3.toString()
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)
            if (r1 == 0) goto L_0x0138
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = r7.f88575a
            java.lang.String r0 = "mDescriptionTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            android.content.Context r0 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2132545344(0x7f1c0f40, float:2.0743875E38)
            java.lang.String r0 = r0.getString(r1)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.setText(r0)
            r7.f88581g = r2
            goto L_0x0169
        L_0x0138:
            com.ss.android.ugc.aweme.im.sdk.d.e r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            java.lang.String r0 = r0.getFromUserId()
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r1.mo71952a(r0)
            if (r0 == 0) goto L_0x0169
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f88575a
            java.lang.String r3 = "mDescriptionTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2132545347(0x7f1c0f43, float:2.0743881E38)
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r0 = r0.getDisplayName()
            r8[r2] = r0
            java.lang.String r8 = r3.getString(r4, r8)
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            r1.setText(r8)
        L_0x0169:
            com.ss.android.ugc.aweme.im.sdk.group.view.a r8 = r7.f88576b
            int r0 = r7.f88581g
            r8.mo72330a(r0)
        L_0x0170:
            r7.mo72331a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34305b.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fa, code lost:
        if (r3 == null) goto L_0x00fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0193, code lost:
        if (r1 == null) goto L_0x0195;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72332a(com.p683ss.android.ugc.aweme.p1807im.sdk.detail.p1832b.C34148e r10, int r11) {
        /*
            r9 = this;
            r0 = 1
            if (r10 == 0) goto L_0x01c7
            java.lang.String r1 = r10.getInviterUserId()
            r9.f88577c = r1
            java.lang.String r1 = r10.getTicket()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            if (r1 == 0) goto L_0x001b
            boolean r1 = p2628d.p2650m.C52830p.m112402a(r1)
            if (r1 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = 0
            goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = r10.getTicket()
            r9.f88586l = r1
        L_0x0024:
            java.lang.String r1 = r10.getInviterUserId()
            r9.f88577c = r1
            java.lang.String r1 = r10.getConversationId()
            r9.f88578d = r1
            java.lang.String r1 = r10.getConversationShortId()
            r9.f88579e = r1
            com.bytedance.im.core.c.d r1 = com.bytedance.p702im.core.p706c.C11182d.m22641a()
            java.lang.String r3 = r10.getConversationId()
            com.bytedance.im.core.c.b r1 = r1.mo20658a(r3)
            java.lang.String r3 = r10.getGroupAvatar()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0053
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r3 = 0
            goto L_0x0054
        L_0x0053:
            r3 = 1
        L_0x0054:
            r4 = 0
            if (r3 == 0) goto L_0x006d
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r3 = r9.f88589p
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r3
            if (r1 == 0) goto L_0x0068
            com.bytedance.im.core.c.c r5 = r1.getCoreInfo()
            if (r5 == 0) goto L_0x0068
            java.lang.String r5 = r5.getIcon()
            goto L_0x0069
        L_0x0068:
            r5 = r4
        L_0x0069:
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r3, r5)
            goto L_0x0078
        L_0x006d:
            com.ss.android.ugc.aweme.base.ui.AvatarImageView r3 = r9.f88589p
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r3
            java.lang.String r5 = r10.getGroupAvatar()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r3, r5)
        L_0x0078:
            java.lang.String r3 = r10.getGroupName()
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0089
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0087
            goto L_0x0089
        L_0x0087:
            r3 = 0
            goto L_0x008a
        L_0x0089:
            r3 = 1
        L_0x008a:
            if (r3 == 0) goto L_0x00a5
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r9.f88590q
            java.lang.String r5 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            if (r1 == 0) goto L_0x009f
            com.bytedance.im.core.c.c r5 = r1.getCoreInfo()
            if (r5 == 0) goto L_0x009f
            java.lang.String r4 = r5.getName()
        L_0x009f:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
            goto L_0x00b5
        L_0x00a5:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r9.f88590q
            java.lang.String r4 = "mNameTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r4 = r10.getGroupName()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            r3.setText(r4)
        L_0x00b5:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r9.f88590q
            r3.requestLayout()
            java.lang.Integer r3 = r10.getGroupMemberCount()
            r4 = 2132545355(0x7f1c0f4b, float:2.0743897E38)
            if (r3 == 0) goto L_0x00fc
            r5 = r3
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r9.f88580f = r6
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r9.f88591r
            java.lang.String r7 = "mCountTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            r6.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r6 = r9.f88591r
            java.lang.String r7 = "mCountTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            android.content.Context r7 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object[] r8 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8[r2] = r5
            java.lang.String r5 = r7.getString(r4, r8)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6.setText(r5)
            if (r3 != 0) goto L_0x0134
        L_0x00fc:
            if (r1 == 0) goto L_0x0134
            int r1 = r1.getMemberCount()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r9.f88580f = r3
            if (r1 <= 0) goto L_0x0134
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r9.f88591r
            java.lang.String r5 = "mCountTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            r3.setVisibility(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r9.f88591r
            java.lang.String r5 = "mCountTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r5 = r5.getResources()
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6[r2] = r1
            java.lang.String r1 = r5.getString(r4, r6)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.setText(r1)
        L_0x0134:
            java.lang.String r1 = r10.getInviterUserId()
            java.lang.CharSequence r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35265e.m79730b()
            java.lang.String r3 = r3.toString()
            boolean r1 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r3)
            if (r1 == 0) goto L_0x0162
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.f88575a
            java.lang.String r2 = "mDescriptionTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132545344(0x7f1c0f40, float:2.0743875E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            goto L_0x01b0
        L_0x0162:
            com.ss.android.ugc.aweme.im.sdk.d.e r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34010e.m77748a()
            java.lang.String r3 = r10.getInviterUserId()
            com.ss.android.ugc.aweme.im.service.model.IMUser r1 = r1.mo71952a(r3)
            if (r1 == 0) goto L_0x0195
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r9.f88575a
            java.lang.String r4 = "mDescriptionTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2132545347(0x7f1c0f43, float:2.0743881E38)
            java.lang.Object[] r6 = new java.lang.Object[r0]
            java.lang.String r7 = r1.getDisplayName()
            r6[r2] = r7
            java.lang.String r2 = r4.getString(r5, r6)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3.setText(r2)
            if (r1 != 0) goto L_0x01b0
        L_0x0195:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r9.f88575a
            java.lang.String r2 = "mDescriptionTv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132545336(0x7f1c0f38, float:2.0743859E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
        L_0x01b0:
            int r1 = r9.f88587m
            if (r1 != r0) goto L_0x01bb
            java.lang.String r1 = r9.f88578d
            java.lang.String r2 = "pop_ups"
            com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af.m79519h(r1, r2)
        L_0x01bb:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            int r1 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34303a.m78208a(r1)
            r9.f88581g = r1
            if (r10 != 0) goto L_0x01db
        L_0x01c7:
            r10 = r9
            com.ss.android.ugc.aweme.im.sdk.group.view.b r10 = (com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34305b) r10
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r11 = com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34303a.m78208a(r11)
            r10.f88581g = r11
            int r11 = r10.f88581g
            if (r11 != r0) goto L_0x01db
            r11 = 6
            r10.f88581g = r11
        L_0x01db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.group.view.C34305b.mo72332a(com.ss.android.ugc.aweme.im.sdk.detail.b.e, int):void");
    }

    public C34305b(Context context, String str, int i) {
        C52711k.m112240b(context, "context");
        super(context, R.style.v0);
        this.f88586l = str;
        this.f88587m = i;
        View inflate = LayoutInflater.from(context).inflate(R.layout.bfv, null);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…roup_invite_dialog, null)");
        this.f88588o = inflate;
        DmtTextView dmtTextView = this.f88592s;
        C52711k.m112236a((Object) dmtTextView, "mConfirmBtn");
        this.f88576b = new C34303a(dmtTextView);
        this.f88581g = 1;
        this.f88585k = this.f88586l;
    }
}
