package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.C3012k;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.C4494aa;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.event.C5182ba;
import com.bytedance.android.livesdk.chatroom.presenter.C5813bd;
import com.bytedance.android.livesdk.chatroom.presenter.C5813bd.C5814a;
import com.bytedance.android.livesdk.message.C7792f;
import com.bytedance.android.livesdk.message.model.C7859c;
import com.bytedance.android.livesdk.message.model.C8001m;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4504e;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p328d.C6737a;
import com.bytedance.android.livesdk.p328d.C6742f;
import com.bytedance.android.livesdk.p330f.C6768c;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p422w.C8442a;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p455i.C8818h;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.by */
public final class C6011by extends C6768c implements OnClickListener, C5814a, C6742f {

    /* renamed from: a */
    private final C6737a f15938a;

    /* renamed from: b */
    private final C5813bd f15939b;

    /* renamed from: c */
    private boolean f15940c;

    /* renamed from: d */
    private boolean f15941d;

    /* renamed from: e */
    private final boolean f15942e;

    /* renamed from: f */
    private final Context f15943f;

    /* renamed from: j */
    private User f15944j;

    /* renamed from: k */
    private final Room f15945k;

    /* renamed from: l */
    private final boolean f15946l;

    /* renamed from: m */
    private final C7859c f15947m;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.by$a */
    static final class C6012a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6011by f15948a;

        C6012a(C6011by byVar) {
            this.f15948a = byVar;
        }

        public final void onClick(View view) {
            this.f15948a.dismiss();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15940c = true;
    }

    public final void onDetachedFromWindow() {
        this.f15940c = false;
        this.f15939b.mo8247a();
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    private final Map<String, String> m13107a() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("anchor_id", String.valueOf(this.f15945k.getOwnerUserId()));
        String idStr = this.f15945k.getIdStr();
        C52711k.m112236a((Object) idStr, "mRoom.idStr");
        hashMap.put("room_id", idStr);
        return hashMap;
    }

    /* renamed from: a */
    public final void mo11696a(Throwable th) {
        if (this.f15940c) {
            this.f15941d = false;
            m13109b(true);
        }
    }

    /* renamed from: a */
    public final void mo11695a(C3009i iVar) {
        if (this.f15940c) {
            if (iVar == null || iVar.getId() <= 0) {
                mo11696a((Throwable) new IllegalArgumentException("User is invalid"));
                return;
            }
            User from = User.from(iVar);
            if (from != null) {
                this.f15944j = from;
                this.f15941d = true;
                m13109b(false);
                return;
            }
            mo11696a((Throwable) new IllegalArgumentException("User is invalid"));
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        setContentView(getLayoutInflater().inflate(R.layout.bw4, null));
        TextView textView = (TextView) findViewById(R.id.cbv);
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        TextView textView2 = (TextView) findViewById(R.id.q7);
        if (textView2 != null) {
            textView2.setOnClickListener(new C6012a(this));
        }
        TextView textView3 = (TextView) findViewById(R.id.erx);
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        TextView textView4 = (TextView) findViewById(R.id.erv);
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        TextView textView5 = (TextView) findViewById(R.id.bp1);
        if (textView5 != null) {
            textView5.setOnClickListener(this);
        }
        TextView textView6 = (TextView) findViewById(R.id.b66);
        if (textView6 != null) {
            textView6.setOnClickListener(this);
        }
        m13109b(false);
    }

    /* renamed from: a */
    public final void mo12005a(boolean z) {
        if (this.f15940c) {
            User user = this.f15944j;
            if (user.getUserAttr() == null) {
                user.setUserAttr(new C3012k());
            }
            C3012k userAttr = user.getUserAttr();
            C52711k.m112236a((Object) userAttr, "it.userAttr");
            userAttr.f8850a = z;
            m13109b(false);
        }
    }

    public final void onClick(View view) {
        Integer num;
        String str;
        String str2;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.erx) {
            C8862e liveService = TTLiveSDKContext.getLiveService();
            if (liveService != null) {
                Context context = this.f15943f;
                long id = this.f15945k.getId();
                long ownerUserId = this.f15945k.getOwnerUserId();
                long id2 = this.f15944j.getId();
                String secUid = this.f15944j.getSecUid();
                String str3 = "comment";
                long messageId = this.f15947m.getMessageId();
                if (this.f15947m instanceof C8001m) {
                    str2 = ((C8001m) this.f15947m).f21869b;
                } else {
                    str2 = "";
                }
                C8818h hVar = new C8818h(id, ownerUserId, id2, secUid, str3, messageId, str2);
                liveService.mo15040a(context, hVar);
            }
            dismiss();
            return;
        }
        boolean z = true;
        if (num != null && num.intValue() == R.id.erv) {
            C4495a.m10823a().mo10301a((Object) new C5182ba(1, C7792f.m15860a(this.f15944j)));
            C4494aa.m10815a().mo10294a(true);
            dismiss();
        } else if (num != null && num.intValue() == R.id.bp1) {
            User user = this.f15944j;
            if (user.getUserAttr() != null) {
                C3012k userAttr = user.getUserAttr();
                C52711k.m112236a((Object) userAttr, "it.userAttr");
                if (userAttr.f8850a) {
                    z = false;
                }
            }
            this.f15938a.mo12852a(z, this.f15945k.getId(), user.getId(), user.getSecUid());
            Map a = m13107a();
            a.put("user_id", String.valueOf(user.getId()));
            String str4 = "action_type";
            if (z) {
                str = "set";
            } else {
                str = "cancel";
            }
            a.put(str4, str);
            C8049c.m15979a().mo14202a("livesdk_mute_click", a, new Object[0]);
        } else if (num != null && num.intValue() == R.id.b66) {
            User user2 = this.f15944j;
            C8442a aVar = new C8442a(this.f15943f, this.f15945k.getId(), this.f15945k.getOwnerUserId(), user2.getId());
            aVar.show();
            Map a2 = m13107a();
            a2.put("user_id", String.valueOf(user2.getId()));
            C8049c.m15979a().mo14202a("blacklist_click", a2, new C8059j().mo14214b("relation").mo14218f("click").mo14213a("live_detail"));
            dismiss();
        } else {
            if (num != null && num.intValue() == R.id.cbv) {
                m13109b(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a3, code lost:
        if (r2 == null) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d9, code lost:
        if (r2 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f8, code lost:
        if (r2 == null) goto L_0x00fa;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m13109b(boolean r8) {
        /*
            r7 = this;
            boolean r0 = r7.f15946l
            r1 = 2132020898(0x7f140ea2, float:1.9680172E38)
            r2 = 2132017191(0x7f140027, float:1.9672653E38)
            r3 = 8
            r4 = 0
            if (r0 == 0) goto L_0x013a
            boolean r0 = r7.f15942e
            if (r0 != 0) goto L_0x013a
            boolean r0 = r7.f15941d
            if (r0 == 0) goto L_0x0017
            goto L_0x013a
        L_0x0017:
            r0 = 2132022246(0x7f1413e6, float:1.9682906E38)
            r5 = 2132021960(0x7f1412c8, float:1.9682326E38)
            if (r8 == 0) goto L_0x004a
            android.view.View r8 = r7.findViewById(r2)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x002a
            r8.setVisibility(r3)
        L_0x002a:
            android.view.View r8 = r7.findViewById(r1)
            if (r8 == 0) goto L_0x0033
            r8.setVisibility(r4)
        L_0x0033:
            android.view.View r8 = r7.findViewById(r5)
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            if (r8 == 0) goto L_0x003e
            r8.setVisibility(r3)
        L_0x003e:
            android.view.View r8 = r7.findViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0049
            r8.setVisibility(r4)
        L_0x0049:
            return
        L_0x004a:
            android.view.View r8 = r7.findViewById(r2)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x0055
            r8.setVisibility(r3)
        L_0x0055:
            android.view.View r8 = r7.findViewById(r1)
            if (r8 == 0) goto L_0x005e
            r8.setVisibility(r4)
        L_0x005e:
            android.view.View r8 = r7.findViewById(r5)
            android.widget.ProgressBar r8 = (android.widget.ProgressBar) r8
            if (r8 == 0) goto L_0x0069
            r8.setVisibility(r4)
        L_0x0069:
            android.view.View r8 = r7.findViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0074
            r8.setVisibility(r3)
        L_0x0074:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r0 = r8
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r1 = "target_uid"
            com.bytedance.android.live.base.model.user.User r2 = r7.f15944j
            long r2 = r2.getId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r1, r2)
            java.lang.String r1 = "sec_target_uid"
            com.bytedance.android.livesdk.ab.e r2 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            if (r2 == 0) goto L_0x00a5
            com.bytedance.android.livesdk.user.e r2 = r2.mo10315h()
            if (r2 == 0) goto L_0x00a5
            com.bytedance.android.live.base.model.user.User r3 = r7.f15944j
            long r3 = r3.getId()
            java.lang.String r2 = r2.mo14522a(r3)
            if (r2 != 0) goto L_0x00a7
        L_0x00a5:
            java.lang.String r2 = ""
        L_0x00a7:
            r0.put(r1, r2)
            java.lang.String r1 = "packed_level"
            java.lang.String r2 = "2"
            r0.put(r1, r2)
            java.lang.String r1 = "current_room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r7.f15945k
            long r2 = r2.getId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r0.put(r1, r2)
            java.lang.String r1 = "request_from"
            java.lang.String r2 = "admin"
            r0.put(r1, r2)
            java.lang.String r1 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r7.f15945k
            com.bytedance.android.live.base.model.user.User r2 = r2.getOwner()
            if (r2 == 0) goto L_0x00db
            long r2 = r2.getId()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            if (r2 != 0) goto L_0x00dd
        L_0x00db:
            java.lang.String r2 = "0"
        L_0x00dd:
            r0.put(r1, r2)
            java.lang.String r1 = "sec_anchor_id"
            com.bytedance.android.livesdk.ab.e r2 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            if (r2 == 0) goto L_0x00fa
            com.bytedance.android.livesdk.user.e r2 = r2.mo10315h()
            if (r2 == 0) goto L_0x00fa
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r7.f15945k
            long r3 = r3.getOwnerUserId()
            java.lang.String r2 = r2.mo14522a(r3)
            if (r2 != 0) goto L_0x00fc
        L_0x00fa:
            java.lang.String r2 = ""
        L_0x00fc:
            r0.put(r1, r2)
            com.bytedance.android.livesdk.chatroom.presenter.bd r0 = r7.f15939b
            java.lang.String r1 = "map"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r1)
            com.bytedance.android.livesdk.ab.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            if (r1 == 0) goto L_0x0135
            com.bytedance.android.livesdk.user.e r1 = r1.mo10315h()
            if (r1 == 0) goto L_0x0135
            c.a.ad r8 = r1.mo14515a(r8)
            if (r8 == 0) goto L_0x0135
            c.a.ac r1 = p064c.p065a.p066a.p068b.C1667a.m5940a()
            c.a.ad r8 = r8.mo6148a(r1)
            if (r8 == 0) goto L_0x0135
            com.bytedance.android.livesdk.chatroom.presenter.bd$b r1 = new com.bytedance.android.livesdk.chatroom.presenter.bd$b
            r1.<init>(r0)
            c.a.d.e r1 = (p064c.p065a.p071d.C1710e) r1
            com.bytedance.android.livesdk.chatroom.presenter.bd$c r2 = new com.bytedance.android.livesdk.chatroom.presenter.bd$c
            r2.<init>(r0)
            c.a.d.e r2 = (p064c.p065a.p071d.C1710e) r2
            c.a.b.c r8 = r8.mo6152a(r1, r2)
            goto L_0x0136
        L_0x0135:
            r8 = 0
        L_0x0136:
            r0.f15267a = r8
            goto L_0x0204
        L_0x013a:
            android.view.View r8 = r7.findViewById(r2)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            if (r8 == 0) goto L_0x0145
            r8.setVisibility(r4)
        L_0x0145:
            android.view.View r8 = r7.findViewById(r1)
            if (r8 == 0) goto L_0x014e
            r8.setVisibility(r3)
        L_0x014e:
            r8 = 2132022226(0x7f1413d2, float:1.9682866E38)
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0164
            boolean r0 = r7.f15942e
            if (r0 != 0) goto L_0x015f
            r0 = 0
            goto L_0x0161
        L_0x015f:
            r0 = 8
        L_0x0161:
            r8.setVisibility(r0)
        L_0x0164:
            r8 = 2132021198(0x7f140fce, float:1.968078E38)
            android.view.View r0 = r7.findViewById(r8)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 == 0) goto L_0x017e
            boolean r1 = r7.f15946l
            if (r1 == 0) goto L_0x0179
            boolean r1 = r7.f15942e
            if (r1 != 0) goto L_0x0179
            r1 = 0
            goto L_0x017b
        L_0x0179:
            r1 = 8
        L_0x017b:
            r0.setVisibility(r1)
        L_0x017e:
            r0 = 2132020349(0x7f140c7d, float:1.9679059E38)
            android.view.View r1 = r7.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x0195
            boolean r2 = r7.f15946l
            if (r2 == 0) goto L_0x0192
            boolean r2 = r7.f15942e
            if (r2 != 0) goto L_0x0192
            r3 = 0
        L_0x0192:
            r1.setVisibility(r3)
        L_0x0195:
            com.bytedance.android.live.base.model.user.User r1 = r7.f15944j
            java.lang.String r1 = com.bytedance.android.livesdk.message.C7792f.m15860a(r1)
            r2 = 2132022216(0x7f1413c8, float:1.9682845E38)
            android.view.View r2 = r7.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 1
            if (r2 == 0) goto L_0x01b7
            r5 = 2132547462(0x7f1c1786, float:2.074817E38)
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r6[r4] = r1
            java.lang.String r5 = com.bytedance.android.live.core.p230g.C3922z.m9905a(r5, r6)
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.setText(r5)
        L_0x01b7:
            boolean r2 = r7.f15946l
            if (r2 == 0) goto L_0x0204
            boolean r2 = r7.f15942e
            if (r2 != 0) goto L_0x0204
            android.view.View r8 = r7.findViewById(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x01eb
            com.bytedance.android.live.base.model.user.User r2 = r7.f15944j
            com.bytedance.android.live.base.model.user.k r2 = r2.getUserAttr()
            if (r2 == 0) goto L_0x01db
            boolean r2 = r2.f8850a
            if (r2 != r3) goto L_0x01db
            r2 = 2132547463(0x7f1c1787, float:2.0748173E38)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r1
            goto L_0x01e2
        L_0x01db:
            r2 = 2132547461(0x7f1c1785, float:2.0748169E38)
            java.lang.Object[] r5 = new java.lang.Object[r3]
            r5[r4] = r1
        L_0x01e2:
            java.lang.String r2 = com.bytedance.android.live.core.p230g.C3922z.m9905a(r2, r5)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r8.setText(r2)
        L_0x01eb:
            android.view.View r8 = r7.findViewById(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            if (r8 == 0) goto L_0x0203
            r0 = 2132547458(0x7f1c1782, float:2.0748163E38)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r2[r4] = r1
            java.lang.String r0 = com.bytedance.android.live.core.p230g.C3922z.m9905a(r0, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r8.setText(r0)
        L_0x0203:
            return
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6011by.m13109b(boolean):void");
    }

    /* renamed from: b */
    public final void mo12006b(boolean z, Exception exc) {
        if (this.f15940c) {
            C4602l.m11047a(this.f15943f, (Throwable) exc, (int) R.string.eon);
        }
    }

    public C6011by(Context context, User user, Room room, boolean z, C7859c cVar) {
        Object obj;
        C52711k.m112240b(context, "mContext");
        C52711k.m112240b(user, "mUser");
        C52711k.m112240b(room, "mRoom");
        C52711k.m112240b(cVar, "msg");
        super(context, true);
        this.f15943f = context;
        this.f15944j = user;
        this.f15945k = room;
        this.f15946l = z;
        this.f15947m = cVar;
        C6737a aVar = new C6737a();
        this.f15938a = aVar;
        C5813bd bdVar = new C5813bd();
        bdVar.mo8520a(this);
        this.f15939b = bdVar;
        long id = this.f15944j.getId();
        C4504e hostService = TTLiveSDKContext.getHostService();
        boolean z2 = false;
        if (hostService != null) {
            C8333e h = hostService.mo10315h();
            if (h != null) {
                obj = Long.valueOf(h.mo14529b());
                if ((obj instanceof Long) && id == ((Long) obj).longValue()) {
                    z2 = true;
                }
                this.f15942e = z2;
            }
        }
        obj = Integer.valueOf(0);
        z2 = true;
        this.f15942e = z2;
    }
}
