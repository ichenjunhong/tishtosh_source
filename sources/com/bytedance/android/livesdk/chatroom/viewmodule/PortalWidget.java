package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C4067n;
import com.bytedance.android.live.core.setting.C4097p;
import com.bytedance.android.live.network.C4157e;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.chatroom.api.PortalApi;
import com.bytedance.android.livesdk.chatroom.api.PortalApi.C4986a;
import com.bytedance.android.livesdk.chatroom.model.C5720ak;
import com.bytedance.android.livesdk.chatroom.model.C5721al;
import com.bytedance.android.livesdk.chatroom.model.C5722am;
import com.bytedance.android.livesdk.chatroom.model.C5723an;
import com.bytedance.android.livesdk.chatroom.model.C5723an.C5724a;
import com.bytedance.android.livesdk.chatroom.model.C5726ao;
import com.bytedance.android.livesdk.chatroom.model.C5757m;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5702k;
import com.bytedance.android.livesdk.chatroom.widget.AnimationLayer;
import com.bytedance.android.livesdk.chatroom.widget.C6659aq;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C7843bp;
import com.bytedance.android.livesdk.message.model.C7843bp.C7844a;
import com.bytedance.android.livesdk.message.model.C7843bp.C7845b;
import com.bytedance.android.livesdk.message.model.C7843bp.C7847d;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdk.viewmodel.C8424h;
import com.bytedance.android.livesdk.viewmodel.C8424h.C8425a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.p683ss.ugc.live.sdk.message.data.IMessage;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p683ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C1674ab;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2647j.C52753d;
import p2628d.p2648k.C52761d;
import p2628d.p2650m.C52830p;

public final class PortalWidget extends LiveRecyclableWidget implements OnMessageListener {

    /* renamed from: g */
    public static C5720ak f17440g;

    /* renamed from: h */
    public static final C6366a f17441h = new C6366a(null);

    /* renamed from: a */
    public Room f17442a;

    /* renamed from: b */
    public User f17443b;

    /* renamed from: c */
    public boolean f17444c;

    /* renamed from: d */
    public boolean f17445d;

    /* renamed from: e */
    C1689b f17446e = new C1689b();

    /* renamed from: f */
    public C8424h f17447f;

    /* renamed from: i */
    private C1689b f17448i = new C1689b();

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$a */
    public static final class C6366a {
        private C6366a() {
        }

        public /* synthetic */ C6366a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static String m13763a(int i) {
            int i2 = i / 60;
            int i3 = i % 60;
            StringBuilder sb = new StringBuilder();
            sb.append(C52830p.m112430a(String.valueOf(i2), 2, '0'));
            sb.append(':');
            sb.append(C52830p.m112430a(String.valueOf(i3), 2, '0'));
            return sb.toString();
        }

        /* renamed from: b */
        public static String m13765b(int i) {
            if (i < 1000) {
                String a = C2240a.m6772a("%d人", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                C52711k.m112236a((Object) a, "java.lang.String.format(this, *args)");
                return a;
            }
            String a2 = C2240a.m6772a("%.1fk人", Arrays.copyOf(new Object[]{Float.valueOf(((float) i) / 1000.0f)}, 1));
            C52711k.m112236a((Object) a2, "java.lang.String.format(this, *args)");
            return a2;
        }

        /* renamed from: a */
        public static String m13764a(String str) {
            C52711k.m112240b(str, "s");
            if (str.length() <= 4) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(C52830p.m112431a(str, C52753d.m112320b(0, 3)));
            sb.append("…");
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$b */
    static final class C6367b<T> implements C1710e<C4177d<C5723an>> {

        /* renamed from: a */
        final /* synthetic */ PortalWidget f17449a;

        /* renamed from: b */
        final /* synthetic */ User f17450b;

        /* renamed from: c */
        final /* synthetic */ C8424h f17451c;

        /* renamed from: d */
        final /* synthetic */ Room f17452d;

        C6367b(PortalWidget portalWidget, User user, C8424h hVar, Room room) {
            this.f17449a = portalWidget;
            this.f17450b = user;
            this.f17451c = hVar;
            this.f17452d = room;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
            if (r9 == null) goto L_0x000e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r9) {
            /*
                r8 = this;
                com.bytedance.android.live.network.response.d r9 = (com.bytedance.android.live.network.response.C4177d) r9
                if (r9 == 0) goto L_0x000e
                java.lang.Object r9 = r9.data
                com.bytedance.android.livesdk.chatroom.model.an r9 = (com.bytedance.android.livesdk.chatroom.model.C5723an) r9
                if (r9 == 0) goto L_0x000e
                java.util.List<com.bytedance.android.livesdk.chatroom.model.an$a> r9 = r9.f15060a
                if (r9 != 0) goto L_0x0012
            L_0x000e:
                java.util.List r9 = p2628d.p2629a.C52575l.m112097a()
            L_0x0012:
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget r0 = r8.f17449a
                boolean r0 = r0.f17444c
                com.bytedance.android.live.base.model.user.User r1 = r8.f17450b
                long r1 = r1.getId()
                java.util.List r9 = com.bytedance.android.livesdk.viewmodel.C8424h.C8425a.m16639a(r9, r0, r1)
                java.util.Collection r9 = (java.util.Collection) r9
                boolean r9 = r9.isEmpty()
                r9 = r9 ^ 1
                if (r9 == 0) goto L_0x0049
                com.bytedance.android.livesdk.viewmodel.h r9 = r8.f17451c
                com.bytedance.android.livesdk.chatroom.model.al r7 = new com.bytedance.android.livesdk.chatroom.model.al
                com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r8.f17452d
                long r1 = r0.getId()
                com.bytedance.android.live.base.model.user.User r0 = r8.f17450b
                long r3 = r0.getId()
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget r0 = r8.f17449a
                boolean r5 = r0.f17444c
                com.bytedance.android.live.base.model.user.User r6 = r8.f17450b
                r0 = r7
                r0.<init>(r1, r3, r5, r6)
                com.bytedance.android.livesdk.chatroom.model.m r7 = (com.bytedance.android.livesdk.chatroom.model.C5757m) r7
                r9.mo14657a(r7)
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6367b.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$c */
    static final class C6368c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C6368c f17453a = new C6368c();

        C6368c() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8064d.m16005b();
            C52711k.m112236a((Object) th, "t");
            C8064d.m9718a(5, th.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$d */
    static final class C6369d<T> implements C1710e<C6566eq> {

        /* renamed from: a */
        final /* synthetic */ PortalWidget f17454a;

        C6369d(PortalWidget portalWidget) {
            this.f17454a = portalWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C6566eq eqVar = (C6566eq) obj;
            if (this.f17454a.f17445d) {
                eqVar.f17898a.invoke(this.f17454a.f17447f, this.f17454a.f17442a);
            } else {
                eqVar.f17898a.invoke(null, null);
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$e */
    static final class C6370e<T> implements C1710e<C3009i> {

        /* renamed from: a */
        final /* synthetic */ PortalWidget f17455a;

        C6370e(PortalWidget portalWidget) {
            this.f17455a = portalWidget;
        }

        public final /* synthetic */ void accept(Object obj) {
            C3009i iVar = (C3009i) obj;
            this.f17455a.f17443b = User.from(iVar);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$f */
    static final class C6371f<T> implements C1710e<C52847n<? extends C5757m, ? extends C5757m>> {

        /* renamed from: a */
        final /* synthetic */ C8424h f17456a;

        /* renamed from: b */
        final /* synthetic */ PortalWidget f17457b;

        C6371f(C8424h hVar, PortalWidget portalWidget) {
            this.f17456a = hVar;
            this.f17457b = portalWidget;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:39:0x040f, code lost:
            if (r0 == null) goto L_0x0411;
         */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x040d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void accept(java.lang.Object r24) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                d.n r1 = (p2628d.C52847n) r1
                java.lang.Object r2 = r1.component1()
                com.bytedance.android.livesdk.chatroom.model.m r2 = (com.bytedance.android.livesdk.chatroom.model.C5757m) r2
                java.lang.Object r1 = r1.component2()
                com.bytedance.android.livesdk.chatroom.model.m r1 = (com.bytedance.android.livesdk.chatroom.model.C5757m) r1
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget r13 = r0.f17457b
                com.bytedance.android.livesdk.viewmodel.h r10 = r0.f17456a
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget r3 = r0.f17457b
                android.view.View r3 = r3.contentView
                if (r3 == 0) goto L_0x0432
                r9 = r3
                android.view.ViewGroup r9 = (android.view.ViewGroup) r9
                c.a.b.b r3 = r13.f17446e
                r10.mo14656a(r3)
                r9.removeAllViews()
                android.view.View r3 = r13.contentView
                java.lang.String r4 = "contentView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                boolean r4 = r1 instanceof com.bytedance.android.livesdk.chatroom.model.C5719aj
                r14 = 0
                if (r4 != 0) goto L_0x0035
                r5 = 0
                goto L_0x0037
            L_0x0035:
                r5 = 8
            L_0x0037:
                r3.setVisibility(r5)
                if (r4 != 0) goto L_0x0407
                boolean r3 = r1 instanceof com.bytedance.android.livesdk.chatroom.model.C5720ak
                r4 = 2132024409(0x7f141c59, float:1.9687293E38)
                r5 = 4
                r12 = 2
                r6 = 2132018343(0x7f1404a7, float:1.967499E38)
                if (r3 == 0) goto L_0x0166
                android.content.Context r3 = r13.context
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                r7 = 2132216366(0x7f170a2e, float:2.0076628E38)
                android.view.View r8 = r3.inflate(r7, r9, r14)
                java.lang.String r3 = "view"
                p2628d.p2639f.p2641b.C52711k.m112236a(r8, r3)
                r8.setVisibility(r5)
                c.a.v r3 = r10.mo14658b()
                android.view.View r5 = r8.findViewById(r6)
                java.lang.String r11 = "view.findViewById(R.id.count_down)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r11)
                android.widget.TextView r5 = (android.widget.TextView) r5
                c.a.ab r5 = com.bytedance.android.live.core.rxutils.C4067n.m10189a(r5)
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$k r11 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6376k.f17485a
                d.f.a.b r11 = (p2628d.p2639f.p2640a.C52671b) r11
                r13.mo12510a(r3, r5, r11)
                r11 = r1
                com.bytedance.android.livesdk.chatroom.model.ak r11 = (com.bytedance.android.livesdk.chatroom.model.C5720ak) r11
                com.bytedance.android.live.base.model.user.User r3 = r11.f15045d
                java.lang.String r3 = r3.getNickName()
                if (r3 != 0) goto L_0x0084
                java.lang.String r3 = ""
            L_0x0084:
                r16 = r3
                android.view.View r3 = r8.findViewById(r4)
                java.lang.String r5 = "view.findViewById<TextView>(R.id.user_name)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
                android.widget.TextView r3 = (android.widget.TextView) r3
                java.lang.String r5 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6366a.m13764a(r16)
                java.lang.CharSequence r5 = (java.lang.CharSequence) r5
                r3.setText(r5)
                r9.addView(r8)
                com.bytedance.android.livesdk.chatroom.widget.AnimationLayer r3 = r13.mo12507a()
                if (r3 == 0) goto L_0x0110
                android.view.View r5 = r3.mo12695a(r7)
                long r14 = r11.f15043b
                android.view.View r4 = r5.findViewById(r4)
                java.lang.String r7 = "animView.findViewById<TextView>(R.id.user_name)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r7)
                android.widget.TextView r4 = (android.widget.TextView) r4
                java.lang.String r7 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6366a.m13764a(r16)
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r4.setText(r7)
                android.view.View r4 = r5.findViewById(r6)
                java.lang.String r6 = "animView.findViewById<TextView>(R.id.count_down)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
                android.widget.TextView r4 = (android.widget.TextView) r4
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                int r7 = (int) r14
                r6.append(r7)
                r7 = 115(0x73, float:1.61E-43)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r4.setText(r6)
                android.view.View r4 = r13.contentView
                java.lang.String r6 = "contentView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r6)
                r3.mo12696a(r5, r4)
                r18 = 1
                r19 = 0
                r21 = 4
                r22 = 0
                r17 = r5
                android.animation.AnimatorSet r14 = com.bytedance.android.livesdk.chatroom.viewmodule.C6555eh.m13938a(r17, true, 330)
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$h r15 = new com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$h
                r3 = r15
                r4 = r5
                r5 = r1
                r6 = r16
                r7 = r8
                r8 = r13
                r0 = r11
                r11 = r2
                r2 = 2
                r12 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                android.animation.Animator$AnimatorListener r15 = (android.animation.Animator.AnimatorListener) r15
                r14.addListener(r15)
                r14.start()
                goto L_0x0112
            L_0x0110:
                r0 = r11
                r2 = 2
            L_0x0112:
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.f17440g = r0
                r1 = 3
                d.n[] r1 = new p2628d.C52847n[r1]
                java.lang.String r3 = "from_room_id"
                long r4 = r0.f15049h
                java.lang.String r4 = java.lang.String.valueOf(r4)
                d.n r3 = p2628d.C52856t.m112465a(r3, r4)
                r4 = 0
                r1[r4] = r3
                java.lang.String r3 = "from_user_id"
                com.bytedance.android.live.base.model.user.User r4 = r0.f15045d
                long r4 = r4.getId()
                java.lang.String r4 = java.lang.String.valueOf(r4)
                d.n r3 = p2628d.C52856t.m112465a(r3, r4)
                r4 = 1
                r1[r4] = r3
                java.lang.String r3 = "from_anchor_id"
                com.bytedance.android.live.base.model.user.User r0 = r0.f15046e
                long r4 = r0.getId()
                java.lang.String r0 = java.lang.String.valueOf(r4)
                d.n r0 = p2628d.C52856t.m112465a(r3, r0)
                r1[r2] = r0
                java.util.Map r0 = p2628d.p2629a.C52550ab.m112050a(r1)
                com.bytedance.android.livesdk.o.c r1 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
                java.lang.String r3 = "invitation_show"
                java.lang.Object[] r2 = new java.lang.Object[r2]
                java.lang.Class<com.bytedance.android.livesdk.o.c.j> r4 = com.bytedance.android.livesdk.p399o.p402c.C8059j.class
                r7 = 0
                r2[r7] = r4
                java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r4 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                r5 = 1
                r2[r5] = r4
                r1.mo14202a(r3, r0, r2)
                goto L_0x0407
            L_0x0166:
                r0 = 2
                r7 = 0
                boolean r3 = r1 instanceof com.bytedance.android.livesdk.chatroom.model.C5721al
                if (r3 == 0) goto L_0x02cb
                android.content.Context r3 = r13.context
                android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
                r6 = 2132216372(0x7f170a34, float:2.007664E38)
                android.view.View r6 = r3.inflate(r6, r9, r7)
                r3 = 2132023149(0x7f14176d, float:1.9684738E38)
                android.view.View r3 = r6.findViewById(r3)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r7 = 2132023150(0x7f14176e, float:1.968474E38)
                android.view.View r7 = r6.findViewById(r7)
                r8 = 2132018842(0x7f14069a, float:1.9676002E38)
                android.view.View r11 = r6.findViewById(r8)
                android.widget.TextView r11 = (android.widget.TextView) r11
                java.lang.String r12 = "superscript"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r12)
                java.lang.String r12 = "0"
                java.lang.CharSequence r12 = (java.lang.CharSequence) r12
                r3.setText(r12)
                java.lang.String r12 = "enterCount"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r12)
                r12 = 0
                java.lang.String r14 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6366a.m13765b(r12)
                java.lang.CharSequence r14 = (java.lang.CharSequence) r14
                r11.setText(r14)
                c.a.v r12 = r10.mo14655a()
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$s r14 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6384s.f17491a
                c.a.d.f r14 = (p064c.p065a.p071d.C1711f) r14
                c.a.v r12 = r12.mo6541d(r14)
                java.lang.String r14 = "portalCountChanged"
                p2628d.p2639f.p2641b.C52711k.m112236a(r12, r14)
                c.a.ab r14 = com.bytedance.android.live.core.rxutils.C4067n.m10189a(r3)
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$m r15 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6378m.f17487a
                d.f.a.b r15 = (p2628d.p2639f.p2640a.C52671b) r15
                r13.mo12510a(r12, r14, r15)
                c.a.ab[] r0 = new p064c.p065a.C1674ab[r0]
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$n r14 = new com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$n
                r14.<init>(r3)
                d.f.a.b r14 = (p2628d.p2639f.p2640a.C52671b) r14
                c.a.ab r3 = com.bytedance.android.live.core.rxutils.C4067n.m10190a(r14)
                r14 = 0
                r0[r14] = r3
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$o r3 = new com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$o
                r3.<init>(r7)
                d.f.a.b r3 = (p2628d.p2639f.p2640a.C52671b) r3
                c.a.ab r3 = com.bytedance.android.live.core.rxutils.C4067n.m10190a(r3)
                r7 = 1
                r0[r7] = r3
                java.lang.String r3 = "observers"
                p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
                com.bytedance.android.live.core.rxutils.n$e r3 = new com.bytedance.android.live.core.rxutils.n$e
                r3.<init>(r0)
                c.a.ab r3 = (p064c.p065a.C1674ab) r3
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$p r0 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6381p.f17488a
                d.f.a.b r0 = (p2628d.p2639f.p2640a.C52671b) r0
                r13.mo12510a(r12, r3, r0)
                c.a.v r0 = r10.mo14655a()
                c.a.ab r3 = com.bytedance.android.live.core.rxutils.C4067n.m10189a(r11)
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$q r7 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6382q.f17489a
                d.f.a.b r7 = (p2628d.p2639f.p2640a.C52671b) r7
                r13.mo12510a(r0, r3, r7)
                r9.addView(r6)
                boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r1)
                r3 = 1
                r0 = r0 ^ r3
                if (r0 != 0) goto L_0x021b
                r0 = r1
                com.bytedance.android.livesdk.chatroom.model.al r0 = (com.bytedance.android.livesdk.chatroom.model.C5721al) r0
                boolean r0 = r0.f15052c
                if (r0 == 0) goto L_0x0407
            L_0x021b:
                java.lang.String r0 = "view"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
                r6.setVisibility(r5)
                com.bytedance.android.livesdk.chatroom.widget.AnimationLayer r0 = r13.mo12507a()
                if (r0 == 0) goto L_0x0407
                r3 = 2132216370(0x7f170a32, float:2.0076636E38)
                android.view.View r5 = r0.mo12695a(r3)
                android.view.View r3 = r5.findViewById(r4)
                java.lang.String r4 = "animView.findViewById<TextView>(R.id.user_name)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                android.widget.TextView r3 = (android.widget.TextView) r3
                r4 = r1
                com.bytedance.android.livesdk.chatroom.model.al r4 = (com.bytedance.android.livesdk.chatroom.model.C5721al) r4
                com.bytedance.android.live.base.model.user.User r7 = r4.f15053d
                java.lang.String r7 = r7.getNickName()
                java.lang.String r11 = "sugarDaddy.nickName"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r11)
                java.lang.String r7 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6366a.m13764a(r7)
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r3.setText(r7)
                android.content.Context r3 = r0.getContext()
                com.bytedance.android.live.core.g.a.a r3 = com.bytedance.android.live.core.p230g.p231a.C3848a.m9760a(r3)
                java.lang.String r7 = "#fe2c55"
                int r7 = android.graphics.Color.parseColor(r7)
                android.content.Context r11 = r0.getContext()
                r12 = 1065353216(0x3f800000, float:1.0)
                float r11 = com.bytedance.android.livesdk.p279af.C4577ap.m10990a(r11, r12)
                com.bytedance.android.live.core.g.a.a r3 = r3.mo9219a(r7, r11)
                com.bytedance.android.live.core.g.a.a r3 = r3.mo9217a()
                com.bytedance.android.live.base.model.user.User r4 = r4.f15053d
                com.bytedance.android.live.base.model.ImageModel r4 = r4.getAvatarThumb()
                com.bytedance.android.live.core.g.a.a r3 = r3.mo9223a(r4)
                r4 = 2132024372(0x7f141c34, float:1.9687218E38)
                android.view.View r4 = r5.findViewById(r4)
                android.widget.ImageView r4 = (android.widget.ImageView) r4
                r3.mo9227a(r4)
                android.view.View r3 = r5.findViewById(r8)
                java.lang.String r4 = "animView.findViewById<TextView>(R.id.enter_count)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                android.widget.TextView r3 = (android.widget.TextView) r3
                android.content.Context r4 = r0.getContext()
                r7 = 2132551282(0x7f1c2672, float:2.0755919E38)
                java.lang.String r4 = r4.getString(r7)
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                r3.setText(r4)
                android.view.View r3 = r13.contentView
                java.lang.String r4 = "contentView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                r0.mo12696a(r5, r3)
                r3 = 3000(0xbb8, double:1.482E-320)
                r0 = 0
                android.animation.AnimatorSet r12 = com.bytedance.android.livesdk.chatroom.viewmodule.C6555eh.m13938a(r5, r0, r3)
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$i r0 = new com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$i
                r3 = r0
                r4 = r5
                r5 = r1
                r7 = r13
                r8 = r9
                r9 = r10
                r10 = r2
                r11 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                android.animation.Animator$AnimatorListener r0 = (android.animation.Animator.AnimatorListener) r0
                r12.addListener(r0)
                r12.start()
                goto L_0x0407
            L_0x02cb:
                boolean r3 = r1 instanceof com.bytedance.android.livesdk.chatroom.model.C5726ao
                if (r3 == 0) goto L_0x039c
                android.content.Context r0 = r13.context
                android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                r3 = 2132216368(0x7f170a30, float:2.0076632E38)
                r4 = 0
                android.view.View r0 = r0.inflate(r3, r9, r4)
                java.lang.String r4 = "view"
                p2628d.p2639f.p2641b.C52711k.m112236a(r0, r4)
                r0.setVisibility(r5)
                c.a.v r4 = r10.mo14658b()
                android.view.View r5 = r0.findViewById(r6)
                java.lang.String r7 = "view.findViewById(R.id.count_down)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r5, r7)
                android.widget.TextView r5 = (android.widget.TextView) r5
                c.a.ab r5 = com.bytedance.android.live.core.rxutils.C4067n.m10189a(r5)
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$r r7 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6383r.f17490a
                d.f.a.b r7 = (p2628d.p2639f.p2640a.C52671b) r7
                r13.mo12510a(r4, r5, r7)
                r9.addView(r0)
                com.bytedance.android.livesdk.chatroom.widget.AnimationLayer r4 = r13.mo12507a()
                if (r4 == 0) goto L_0x0407
                android.view.View r5 = r4.mo12695a(r3)
                r3 = 2132024675(0x7f141d63, float:1.9687833E38)
                android.view.View r3 = r5.findViewById(r3)
                java.lang.String r7 = "animView.findViewById<TextView>(R.id.wait_hint)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r7)
                android.widget.TextView r3 = (android.widget.TextView) r3
                android.content.Context r7 = r4.getContext()
                r8 = 2132551283(0x7f1c2673, float:2.075592E38)
                java.lang.String r7 = r7.getString(r8)
                java.lang.String r8 = "context.getString(R.stri….ttlive_portal_wait_hint)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
                r8 = 1
                java.lang.Object[] r11 = new java.lang.Object[r8]
                r12 = r1
                com.bytedance.android.livesdk.chatroom.model.ao r12 = (com.bytedance.android.livesdk.chatroom.model.C5726ao) r12
                long r14 = r12.f15072b
                double r14 = (double) r14
                r16 = 4633641066610819072(0x404e000000000000, double:60.0)
                java.lang.Double.isNaN(r14)
                double r14 = r14 / r16
                double r14 = java.lang.Math.ceil(r14)
                int r14 = (int) r14
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r15 = 0
                r11[r15] = r14
                java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r8)
                java.lang.String r7 = com.C2240a.m6772a(r7, r11)
                java.lang.String r8 = "java.lang.String.format(this, *args)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                r3.setText(r7)
                android.view.View r3 = r5.findViewById(r6)
                java.lang.String r6 = "animView.findViewById<TextView>(R.id.count_down)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
                android.widget.TextView r3 = (android.widget.TextView) r3
                long r6 = r12.f15072b
                int r6 = (int) r6
                java.lang.String r6 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6366a.m13763a(r6)
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                r3.setText(r6)
                android.view.View r3 = r13.contentView
                java.lang.String r6 = "contentView"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r6)
                r4.mo12696a(r5, r3)
                r15 = 1
                r16 = 0
                r18 = 4
                r19 = 0
                r14 = r5
                android.animation.AnimatorSet r12 = com.bytedance.android.livesdk.chatroom.viewmodule.C6555eh.m13938a(r14, true, 330)
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$j r14 = new com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$j
                r3 = r14
                r4 = r5
                r5 = r1
                r6 = r0
                r7 = r13
                r8 = r9
                r9 = r10
                r10 = r2
                r11 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
                android.animation.Animator$AnimatorListener r14 = (android.animation.Animator.AnimatorListener) r14
                r12.addListener(r14)
                r12.start()
                goto L_0x0407
            L_0x039c:
                boolean r1 = r1 instanceof com.bytedance.android.livesdk.chatroom.model.C5722am
                if (r1 == 0) goto L_0x0407
                android.content.Context r1 = r13.context
                android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
                r2 = 2132216367(0x7f170a2f, float:2.007663E38)
                r3 = 0
                android.view.View r1 = r1.inflate(r2, r9, r3)
                c.a.v r2 = r10.mo14658b()
                android.view.View r3 = r1.findViewById(r6)
                java.lang.String r4 = "view.findViewById(R.id.count_down)"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                android.widget.TextView r3 = (android.widget.TextView) r3
                c.a.ab r3 = com.bytedance.android.live.core.rxutils.C4067n.m10189a(r3)
                com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$l r4 = com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6377l.f17486a
                d.f.a.b r4 = (p2628d.p2639f.p2640a.C52671b) r4
                r13.mo12510a(r2, r3, r4)
                r9.addView(r1)
                android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
                r2.<init>()
                android.content.Context r3 = r13.context
                r4 = 2131099659(0x7f06000b, float:1.7811677E38)
                android.animation.Animator r3 = android.animation.AnimatorInflater.loadAnimator(r3, r4)
                android.animation.Animator r4 = r3.clone()
                java.lang.String r5 = "shake.clone()"
                p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
                r3.setTarget(r1)
                r4.setTarget(r1)
                r5 = 1000(0x3e8, double:4.94E-321)
                r4.setStartDelay(r5)
                android.animation.Animator[] r0 = new android.animation.Animator[r0]
                r1 = 0
                r0[r1] = r3
                r3 = 1
                r0[r3] = r4
                r2.playSequentially(r0)
                r2.start()
                com.bytedance.android.livesdk.o.c r0 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
                java.lang.String r2 = "openpacket_show"
                java.lang.Object[] r4 = new java.lang.Object[r1]
                r0.mo14203a(r2, r4)
                goto L_0x0409
            L_0x0407:
                r1 = 0
                r3 = 1
            L_0x0409:
                com.bytedance.android.livesdk.viewmodel.h r0 = r13.f17447f
                if (r0 == 0) goto L_0x0411
                com.bytedance.android.livesdk.chatroom.model.m r0 = r0.f22872a
                if (r0 != 0) goto L_0x0418
            L_0x0411:
                com.bytedance.android.livesdk.chatroom.model.aj r0 = new com.bytedance.android.livesdk.chatroom.model.aj
                r0.<init>()
                com.bytedance.android.livesdk.chatroom.model.m r0 = (com.bytedance.android.livesdk.chatroom.model.C5757m) r0
            L_0x0418:
                boolean r2 = r0 instanceof com.bytedance.android.livesdk.chatroom.model.C5720ak
                if (r2 != 0) goto L_0x0426
                boolean r2 = r0 instanceof com.bytedance.android.livesdk.chatroom.model.C5726ao
                if (r2 != 0) goto L_0x0426
                boolean r0 = r0 instanceof com.bytedance.android.livesdk.chatroom.model.C5722am
                if (r0 == 0) goto L_0x0425
                goto L_0x0426
            L_0x0425:
                r1 = 1
            L_0x0426:
                com.bytedance.ies.sdk.widgets.DataCenter r0 = r13.dataCenter
                java.lang.String r2 = "data_allow_send_portal_gift"
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.lambda$put$1$DataCenter(r2, r1)
                return
            L_0x0432:
                d.u r0 = new d.u
                java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget.C6371f.accept(java.lang.Object):void");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$g */
    static final class C6372g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8424h f17458a;

        /* renamed from: b */
        final /* synthetic */ PortalWidget f17459b;

        C6372g(C8424h hVar, PortalWidget portalWidget) {
            this.f17458a = hVar;
            this.f17459b = portalWidget;
        }

        public final void onClick(View view) {
            String str;
            PortalWidget portalWidget = this.f17459b;
            C5757m mVar = this.f17458a.f22872a;
            if (mVar instanceof C5721al) {
                if (((C5721al) mVar).f15052c) {
                    C4097p<String> pVar = LiveConfigSettingKeys.PORTAL_ANCHOR_URI;
                    C52711k.m112236a((Object) pVar, "LiveConfigSettingKeys.PORTAL_ANCHOR_URI");
                    str = (String) pVar.mo9431a();
                } else {
                    C4097p<String> pVar2 = LiveConfigSettingKeys.PORTAL_SENDER_URI;
                    C52711k.m112236a((Object) pVar2, "LiveConfigSettingKeys.PORTAL_SENDER_URI");
                    str = (String) pVar2.mo9431a();
                }
            } else if (mVar instanceof C5720ak) {
                C5720ak akVar = (C5720ak) mVar;
                C8049c.m15979a().mo14202a("invitation_click", C52550ab.m112050a(C52856t.m112465a("from_room_id", String.valueOf(akVar.f15049h)), C52856t.m112465a("from_user_id", String.valueOf(akVar.f15045d.getId())), C52856t.m112465a("from_anchor_id", String.valueOf(akVar.f15046e.getId()))), C8059j.class, Room.class);
                C1690c a = ((PortalApi) C4157e.m10322a().mo9550a(PortalApi.class)).ping(akVar.f15047f, akVar.f15048g, C4986a.CLICK_INVITATION).mo6505a((C1710e<? super T>) C6385t.f17492a, (C1710e<? super Throwable>) C6386u.f17493a);
                C52711k.m112236a((Object) a, "LiveClient.get().getServ…                       })");
                portalWidget.mo12509a(a);
                C4097p<String> pVar3 = LiveConfigSettingKeys.PORTAL_INVITATION_URI;
                C52711k.m112236a((Object) pVar3, "LiveConfigSettingKeys.PORTAL_INVITATION_URI");
                str = (String) pVar3.mo9431a();
            } else if ((mVar instanceof C5726ao) || (mVar instanceof C5722am)) {
                if (mVar instanceof C5722am) {
                    C8049c.m15979a().mo14203a("openpacket_click", new Object[0]);
                }
                C4097p<String> pVar4 = LiveConfigSettingKeys.PORTAL_REWARD_URI;
                C52711k.m112236a((Object) pVar4, "LiveConfigSettingKeys.PORTAL_REWARD_URI");
                str = (String) pVar4.mo9431a();
            } else {
                str = "";
            }
            try {
                Boolean.valueOf(C4514j.m10883j().mo10328i().handle(portalWidget.context, Uri.parse(str)));
            } catch (Throwable th) {
                C8064d.m16005b();
                C8064d.m9718a(5, th.getStackTrace());
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$h */
    public static final class C6373h extends C6659aq {

        /* renamed from: a */
        final /* synthetic */ View f17460a;

        /* renamed from: b */
        final /* synthetic */ C5757m f17461b;

        /* renamed from: c */
        final /* synthetic */ String f17462c;

        /* renamed from: d */
        final /* synthetic */ View f17463d;

        /* renamed from: e */
        final /* synthetic */ PortalWidget f17464e;

        /* renamed from: f */
        final /* synthetic */ ViewGroup f17465f;

        /* renamed from: g */
        final /* synthetic */ C8424h f17466g;

        /* renamed from: h */
        final /* synthetic */ C5757m f17467h;

        /* renamed from: i */
        final /* synthetic */ C5757m f17468i;

        public final void onAnimationEnd(Animator animator) {
            AnimationLayer a = this.f17464e.mo12507a();
            if (a != null) {
                a.removeView(this.f17460a);
            }
            View view = this.f17463d;
            C52711k.m112236a((Object) view, "view");
            view.setVisibility(0);
        }

        C6373h(View view, C5757m mVar, String str, View view2, PortalWidget portalWidget, ViewGroup viewGroup, C8424h hVar, C5757m mVar2, C5757m mVar3) {
            this.f17460a = view;
            this.f17461b = mVar;
            this.f17462c = str;
            this.f17463d = view2;
            this.f17464e = portalWidget;
            this.f17465f = viewGroup;
            this.f17466g = hVar;
            this.f17467h = mVar2;
            this.f17468i = mVar3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$i */
    public static final class C6374i extends C6659aq {

        /* renamed from: a */
        final /* synthetic */ View f17469a;

        /* renamed from: b */
        final /* synthetic */ C5757m f17470b;

        /* renamed from: c */
        final /* synthetic */ View f17471c;

        /* renamed from: d */
        final /* synthetic */ PortalWidget f17472d;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f17473e;

        /* renamed from: f */
        final /* synthetic */ C8424h f17474f;

        /* renamed from: g */
        final /* synthetic */ C5757m f17475g;

        /* renamed from: h */
        final /* synthetic */ C5757m f17476h;

        public final void onAnimationEnd(Animator animator) {
            AnimationLayer a = this.f17472d.mo12507a();
            if (a != null) {
                a.removeView(this.f17469a);
            }
            View view = this.f17471c;
            C52711k.m112236a((Object) view, "view");
            view.setVisibility(0);
        }

        C6374i(View view, C5757m mVar, View view2, PortalWidget portalWidget, ViewGroup viewGroup, C8424h hVar, C5757m mVar2, C5757m mVar3) {
            this.f17469a = view;
            this.f17470b = mVar;
            this.f17471c = view2;
            this.f17472d = portalWidget;
            this.f17473e = viewGroup;
            this.f17474f = hVar;
            this.f17475g = mVar2;
            this.f17476h = mVar3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$j */
    public static final class C6375j extends C6659aq {

        /* renamed from: a */
        final /* synthetic */ View f17477a;

        /* renamed from: b */
        final /* synthetic */ C5757m f17478b;

        /* renamed from: c */
        final /* synthetic */ View f17479c;

        /* renamed from: d */
        final /* synthetic */ PortalWidget f17480d;

        /* renamed from: e */
        final /* synthetic */ ViewGroup f17481e;

        /* renamed from: f */
        final /* synthetic */ C8424h f17482f;

        /* renamed from: g */
        final /* synthetic */ C5757m f17483g;

        /* renamed from: h */
        final /* synthetic */ C5757m f17484h;

        public final void onAnimationEnd(Animator animator) {
            AnimationLayer a = this.f17480d.mo12507a();
            if (a != null) {
                a.removeView(this.f17477a);
            }
            View view = this.f17479c;
            C52711k.m112236a((Object) view, "view");
            view.setVisibility(0);
        }

        C6375j(View view, C5757m mVar, View view2, PortalWidget portalWidget, ViewGroup viewGroup, C8424h hVar, C5757m mVar2, C5757m mVar3) {
            this.f17477a = view;
            this.f17478b = mVar;
            this.f17479c = view2;
            this.f17480d = portalWidget;
            this.f17481e = viewGroup;
            this.f17482f = hVar;
            this.f17483g = mVar2;
            this.f17484h = mVar3;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$k */
    static final class C6376k extends C52712l implements C52671b<C52847n<? extends Long, ? extends Long>, String> {

        /* renamed from: a */
        public static final C6376k f17485a = new C6376k();

        C6376k() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52847n nVar = (C52847n) obj;
            C52711k.m112240b(nVar, "it");
            StringBuilder sb = new StringBuilder();
            sb.append((int) ((Number) nVar.getFirst()).longValue());
            sb.append('s');
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$l */
    static final class C6377l extends C52712l implements C52671b<C52847n<? extends Long, ? extends Long>, String> {

        /* renamed from: a */
        public static final C6377l f17486a = new C6377l();

        C6377l() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52847n nVar = (C52847n) obj;
            C52711k.m112240b(nVar, "it");
            StringBuilder sb = new StringBuilder();
            sb.append((int) ((Number) nVar.getFirst()).longValue());
            sb.append('s');
            return sb.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$m */
    static final class C6378m extends C52712l implements C52671b<Integer, String> {

        /* renamed from: a */
        public static final C6378m f17487a = new C6378m();

        C6378m() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return String.valueOf(((Integer) obj).intValue());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$n */
    static final /* synthetic */ class C6379n extends C52710j implements C52671b<Integer, C52860x> {
        C6379n(TextView textView) {
            super(1, textView);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(TextView.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((TextView) this.receiver).setVisibility(((Number) obj).intValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$o */
    static final /* synthetic */ class C6380o extends C52710j implements C52671b<Integer, C52860x> {
        C6380o(View view) {
            super(1, view);
        }

        public final String getName() {
            return "setVisibility";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(View.class);
        }

        public final String getSignature() {
            return "setVisibility(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((View) this.receiver).setVisibility(((Number) obj).intValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$p */
    static final class C6381p extends C52712l implements C52671b<Integer, Integer> {

        /* renamed from: a */
        public static final C6381p f17488a = new C6381p();

        C6381p() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            int i;
            if (C52711k.m112230a(((Integer) obj).intValue(), 1) > 0) {
                i = 0;
            } else {
                i = 8;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$q */
    static final class C6382q extends C52712l implements C52671b<List<? extends C5724a>, String> {

        /* renamed from: a */
        public static final C6382q f17489a = new C6382q();

        C6382q() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Object obj2;
            int i;
            List list = (List) obj;
            C52711k.m112240b(list, "portals");
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                obj2 = null;
            } else {
                obj2 = it.next();
                if (it.hasNext()) {
                    long j = ((C5724a) obj2).f15061a;
                    do {
                        Object next = it.next();
                        long j2 = ((C5724a) next).f15061a;
                        if (j > j2) {
                            obj2 = next;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
            }
            C5724a aVar = (C5724a) obj2;
            if (aVar != null) {
                i = (int) aVar.f15062b;
            } else {
                i = 0;
            }
            return C6366a.m13765b(i);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$r */
    static final class C6383r extends C52712l implements C52671b<C52847n<? extends Long, ? extends Long>, String> {

        /* renamed from: a */
        public static final C6383r f17490a = new C6383r();

        C6383r() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52847n nVar = (C52847n) obj;
            C52711k.m112240b(nVar, "it");
            return C6366a.m13763a((int) ((Number) nVar.getFirst()).longValue());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$s */
    static final class C6384s<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C6384s f17491a = new C6384s();

        C6384s() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            List list = (List) obj;
            C52711k.m112240b(list, "it");
            return Integer.valueOf(list.size());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$t */
    static final class C6385t<T> implements C1710e<C4177d<C5702k>> {

        /* renamed from: a */
        public static final C6385t f17492a = new C6385t();

        C6385t() {
        }

        public final /* synthetic */ void accept(Object obj) {
            C4177d dVar = (C4177d) obj;
            C8064d.m16005b();
            C8064d.m9720b("ttlive_portal", "CLICK_INVITATION ping success");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$u */
    static final class C6386u<T> implements C1710e<Throwable> {

        /* renamed from: a */
        public static final C6386u f17493a = new C6386u();

        C6386u() {
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8064d.m16005b();
            C52711k.m112236a((Object) th, "t");
            C8064d.m9718a(5, th.getStackTrace());
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$v */
    static final class C6387v<T> implements C1710e<C4177d<C5702k>> {

        /* renamed from: a */
        final /* synthetic */ PortalWidget f17494a;

        /* renamed from: b */
        final /* synthetic */ C5720ak f17495b;

        C6387v(PortalWidget portalWidget, C5720ak akVar) {
            this.f17494a = portalWidget;
            this.f17495b = akVar;
        }

        public final /* synthetic */ void accept(Object obj) {
            long j;
            C4177d dVar = (C4177d) obj;
            if (((C5702k) dVar.data).f14988c) {
                C8424h hVar = this.f17494a.f17447f;
                if (hVar != null) {
                    long a = C8425a.m16638a();
                    long j2 = ((C5702k) dVar.data).f14987b;
                    long j3 = this.f17495b.f15044c;
                    User user = this.f17495b.f15045d;
                    User user2 = this.f17495b.f15046e;
                    Room room = this.f17494a.f17442a;
                    if (room != null) {
                        j = room.getId();
                    } else {
                        j = 0;
                    }
                    C5726ao aoVar = new C5726ao(a, j2, j3, user, user2, j, this.f17495b.f15048g);
                    hVar.mo14657a((C5757m) aoVar);
                }
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.PortalWidget$w */
    static final class C6388w<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ PortalWidget f17496a;

        /* renamed from: b */
        final /* synthetic */ C5720ak f17497b;

        /* renamed from: c */
        final /* synthetic */ int f17498c;

        C6388w(PortalWidget portalWidget, C5720ak akVar, int i) {
            this.f17496a = portalWidget;
            this.f17497b = akVar;
            this.f17498c = i;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C8064d.m16005b();
            C52711k.m112236a((Object) th, "t");
            C8064d.m9718a(5, th.getStackTrace());
            if (this.f17498c > 0) {
                PortalWidget portalWidget = this.f17496a;
                C1690c f = C2201v.m6592a(5, TimeUnit.SECONDS).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C1710e<Long>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C6388w f17499a;

                    {
                        this.f17499a = r1;
                    }

                    public final /* synthetic */ void accept(Object obj) {
                        Long l = (Long) obj;
                        this.f17499a.f17496a.mo12508a(this.f17499a.f17497b, this.f17499a.f17498c - 1);
                    }
                });
                C52711k.m112236a((Object) f, "Observable.timer(INITIAL…                        }");
                portalWidget.mo12509a(f);
            }
        }
    }

    public final int getLayoutId() {
        return R.layout.bxt;
    }

    /* renamed from: a */
    public final AnimationLayer mo12507a() {
        View view = this.contentView;
        if (view != null) {
            View rootView = view.getRootView();
            if (rootView != null) {
                return (AnimationLayer) rootView.findViewById(R.id.dxv);
            }
        }
        return null;
    }

    public final void onPause() {
        C8064d.m16005b();
        C8064d.m9720b("ttlive_portal", "widget onPause");
        super.onPause();
        this.f17445d = false;
    }

    public final void onResume() {
        C8064d.m16005b();
        C8064d.m9720b("ttlive_portal", "widget onResume");
        super.onResume();
        this.f17445d = true;
    }

    public final void onUnload() {
        C8064d.m16005b();
        C8064d.m9720b("ttlive_portal", "widget onUnload");
        View view = this.contentView;
        if (view != null) {
            ((ViewGroup) view).removeAllViews();
            IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager", null);
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(this);
            }
            this.f17442a = null;
            this.f17443b = null;
            this.f17444c = false;
            this.f17445d = false;
            this.f17447f = null;
            this.f17448i.dispose();
            this.f17446e.dispose();
            this.f17448i = new C1689b();
            this.f17446e = new C1689b();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    private final boolean m13758b(C1690c cVar) {
        return this.f17448i.mo6181a(cVar);
    }

    /* renamed from: a */
    public final boolean mo12509a(C1690c cVar) {
        return this.f17446e.mo6181a(cVar);
    }

    public final void onInit(Object[] objArr) {
        C8064d.m16005b();
        C8064d.m9720b("ttlive_portal", "widget onInit");
    }

    public final void onMessage(IMessage iMessage) {
        IMessage iMessage2 = iMessage;
        C8064d.m16005b();
        StringBuilder sb = new StringBuilder("widget onMessage=");
        sb.append(iMessage2);
        C8064d.m9720b("ttlive_portal", sb.toString());
        Room room = this.f17442a;
        if (room != null) {
            User user = this.f17443b;
            if (user != null) {
                C8424h hVar = this.f17447f;
                if (hVar != null && (iMessage2 instanceof C7843bp)) {
                    C7843bp bpVar = (C7843bp) iMessage2;
                    C7844a aVar = bpVar.f21676g;
                    if (aVar instanceof C7845b) {
                        long id = room.getId();
                        long id2 = user.getId();
                        boolean z = this.f17444c;
                        User user2 = ((C7845b) aVar).f21677a;
                        C52711k.m112236a((Object) user2, "payload.sugarDaddy");
                        C5721al alVar = new C5721al(id, id2, z, user2);
                        hVar.mo14657a((C5757m) alVar);
                    } else if ((aVar instanceof C7847d) && !this.f17444c) {
                        long a = C8425a.m16638a();
                        C7847d dVar = (C7847d) aVar;
                        long j = dVar.f21679a;
                        long j2 = dVar.f21680b;
                        User user3 = dVar.f21681c;
                        C52711k.m112236a((Object) user3, "payload.sugarDaddy");
                        User user4 = dVar.f21682d;
                        C52711k.m112236a((Object) user4, "payload.anchor");
                        C5720ak akVar = new C5720ak(a, j, j2, user3, user4, room.getId(), bpVar.f21671b, bpVar.f21672c);
                        hVar.mo14657a((C5757m) akVar);
                    }
                }
            }
        }
    }

    public final void onLoad(Object[] objArr) {
        Object obj;
        Object obj2;
        C8064d.m16005b();
        C8064d.m9720b("ttlive_portal", "widget onLoad");
        this.f17442a = (Room) this.dataCenter.get("data_room", null);
        C8333e user = ((C4282a) C4116c.m10249a(C4282a.class)).user();
        C52711k.m112236a((Object) user, "userService");
        this.f17443b = User.from(user.mo14521a());
        C1690c f = user.mo14536f().mo6545f((C1710e<? super T>) new C6370e<Object>(this));
        C52711k.m112236a((Object) f, "userService.observeCurre…= User.from(it)\n        }");
        m13758b(f);
        boolean z = false;
        Object obj3 = this.dataCenter.get("data_is_anchor", Boolean.valueOf(false));
        C52711k.m112236a(obj3, "dataCenter.get(WidgetCon…nt.DATA_IS_ANCHOR, false)");
        this.f17444c = ((Boolean) obj3).booleanValue();
        this.f17447f = (C8424h) this.dataCenter.get("data_portal_view_model", null);
        if (this.f17447f == null) {
            this.f17447f = new C8424h();
            this.dataCenter.lambda$put$1$DataCenter("data_portal_view_model", this.f17447f);
        }
        C1690c f2 = C4495a.m10823a().mo10300a(C6566eq.class).mo6545f((C1710e<? super T>) new C6369d<Object>(this));
        C52711k.m112236a((Object) f2, "RxBus.getInstance().regi…)\n            }\n        }");
        m13758b(f2);
        IMessageManager iMessageManager = (IMessageManager) this.dataCenter.get("data_message_manager", null);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C8629a.PORTAL_MESSAGE.getIntType(), this);
        }
        C8424h hVar = this.f17447f;
        if (hVar != null) {
            hVar.mo14656a(this.f17446e);
            C2201v a = hVar.f22873b.mo6514a(C1667a.m5940a());
            C52711k.m112236a((Object) a, "_stateChanged.observeOn(…dSchedulers.mainThread())");
            C1690c f3 = a.mo6545f((C1710e<? super T>) new C6371f<Object>(hVar, this));
            C52711k.m112236a((Object) f3, "stateChanged.subscribe {…as ViewGroup, from, to) }");
            m13758b(f3);
            this.contentView.setOnClickListener(new C6372g(hVar, this));
        }
        C5720ak akVar = f17440g;
        if (akVar != null) {
            Long l = (Long) this.dataCenter.get("data_from_portal_id", Long.valueOf(0));
            C5720ak akVar2 = f17440g;
            if (akVar2 != null) {
                obj = Long.valueOf(akVar2.f15048g);
            } else {
                obj = null;
            }
            if (C52711k.m112239a((Object) l, obj)) {
                mo12508a(akVar, 5);
                f17440g = null;
                C8064d.m16005b();
                StringBuilder sb = new StringBuilder("invitation accepted, fromPortalId=");
                sb.append(l);
                C8064d.m9719a("ttlive_portal", sb.toString());
                z = true;
            } else {
                C8424h hVar2 = this.f17447f;
                if (hVar2 != null) {
                    obj2 = hVar2.f22872a;
                } else {
                    obj2 = null;
                }
                if (!C52711k.m112239a(obj2, (Object) f17440g)) {
                    f17440g = null;
                    C8064d.m16005b();
                    StringBuilder sb2 = new StringBuilder("invitation dropped, fromPortalId=");
                    sb2.append(l);
                    C8064d.m9722d("ttlive_portal", sb2.toString());
                }
            }
        }
        if (!z) {
            Room room = this.f17442a;
            if (room != null) {
                User user2 = this.f17443b;
                if (user2 != null) {
                    C8424h hVar3 = this.f17447f;
                    if (hVar3 != null) {
                        C1690c a2 = ((PortalApi) C4157e.m10322a().mo9550a(PortalApi.class)).stats(room.getId()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6367b<Object>(this, user2, hVar3, room), (C1710e<? super Throwable>) C6368c.f17453a);
                        C52711k.m112236a((Object) a2, "LiveClient.get().getServ…ce.WARN, t.stackTrace) })");
                        mo12509a(a2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo12508a(C5720ak akVar, int i) {
        long j;
        C8064d.m16005b();
        StringBuilder sb = new StringBuilder("initial ping, retriesLeft=");
        sb.append(i);
        C8064d.m9719a("ttlive_portal", sb.toString());
        PortalApi portalApi = (PortalApi) C4157e.m10322a().mo9550a(PortalApi.class);
        Room room = this.f17442a;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        C1690c a = portalApi.ping(j, akVar.f15048g, C4986a.WAIT_REWARD).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C6387v<Object>(this, akVar), (C1710e<? super Throwable>) new C6388w<Object>(this, akVar, i));
        C52711k.m112236a((Object) a, "LiveClient.get().getServ…     }\n                })");
        m13758b(a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <S, T> boolean mo12510a(C2201v<S> vVar, C1674ab<T> abVar, C52671b<? super S, ? extends T> bVar) {
        return this.f17446e.mo6181a(C4067n.m10191a(vVar, abVar, bVar));
    }
}
