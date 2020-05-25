package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.presenter.C5852cc;
import com.bytedance.android.livesdk.chatroom.presenter.C5852cc.C5853a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import p064c.p065a.p069b.C1690c;

public class RoomPushWidget extends LiveRecyclableWidget implements C0199s<KVData>, C5853a {

    /* renamed from: a */
    public C5852cc f17550a;

    /* renamed from: b */
    Room f17551b;

    /* renamed from: c */
    public View f17552c;

    /* renamed from: d */
    private boolean f17553d;

    /* renamed from: e */
    private TextView f17554e;

    /* renamed from: f */
    private ImageView f17555f;

    /* renamed from: g */
    private boolean f17556g;

    /* renamed from: h */
    private User f17557h;

    /* renamed from: i */
    private C1690c f17558i;

    /* renamed from: j */
    private Animation f17559j;

    /* renamed from: a */
    public final void mo8500a(Throwable th) {
        C6464az.m13908a(this, th);
    }

    /* renamed from: b */
    public final String mo8502b() {
        return C6464az.m13907a(this);
    }

    public int getLayoutId() {
        return R.layout.ar_;
    }

    /* renamed from: a */
    public final boolean mo11724a() {
        return this.f17553d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo12529c() {
        if (this.f17558i != null) {
            this.f17558i.dispose();
        }
        this.f17559j = AnimationUtils.loadAnimation(this.context, R.anim.ce);
        this.f17559j.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                C9432q.m18691b(RoomPushWidget.this.f17552c, 8);
                if (RoomPushWidget.this.f17550a != null) {
                    RoomPushWidget.this.f17550a.mo11722b();
                }
            }
        });
        this.f17552c.startAnimation(this.f17559j);
        this.f17553d = false;
    }

    public void onUnload() {
        this.f17550a.mo8247a();
        this.dataCenter.removeObserver(this);
        this.f17552c.setVisibility(8);
        this.f17553d = false;
        this.f17557h = null;
        if (this.f17558i != null) {
            this.f17558i.dispose();
        }
        if (this.f17559j != null) {
            this.f17559j.cancel();
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (kVData != null) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == -1741164106 && key.equals("data_user_in_room")) {
                c = 0;
            }
            if (c == 0) {
                Object data = kVData.getData();
                if (data instanceof User) {
                    this.f17557h = (User) data;
                }
            }
        }
    }

    public void onInit(Object... objArr) {
        this.f17550a = new C5852cc();
        this.f17554e = (TextView) this.contentView.findViewById(R.id.c7c);
        this.f17555f = (ImageView) this.contentView.findViewById(R.id.cci);
        this.f17552c = this.contentView.findViewById(R.id.c7d);
    }

    public void onLoad(Object... objArr) {
        this.f17551b = (Room) this.dataCenter.get("data_room");
        this.f17556g = ((Boolean) this.dataCenter.get("data_is_anchor")).booleanValue();
        this.dataCenter.observeForever("data_user_in_room", this);
        this.f17550a.mo8520a((C5853a) this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0236  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11723a(com.bytedance.android.livesdk.message.model.C7866cg r15) {
        /*
            r14 = this;
            boolean r0 = r14.isViewValid()
            if (r0 == 0) goto L_0x025f
            boolean r0 = r14.f17553d
            if (r0 == 0) goto L_0x000c
            goto L_0x025f
        L_0x000c:
            android.widget.ImageView r0 = r14.f17555f
            r1 = 0
            r0.setVisibility(r1)
            if (r15 == 0) goto L_0x025e
            java.lang.String r0 = r15.f21777k
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r3 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r14.f17551b
            long r4 = r4.getOwnerUserId()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.put(r3, r4)
            java.lang.String r3 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r14.f17551b
            long r4 = r4.getId()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r2.put(r3, r4)
            java.lang.String r3 = "message_type"
            r2.put(r3, r0)
            com.bytedance.android.livesdk.o.c r0 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r3 = "livesdk_bottom_message_show"
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r0.mo14202a(r3, r2, r4)
            com.bytedance.android.live.base.model.FlexImageModel r0 = r15.f21775i
            r2 = 0
            if (r0 == 0) goto L_0x005f
            android.view.View r0 = r14.f17552c
            com.bytedance.android.live.base.model.FlexImageModel r3 = r15.f21775i
            android.content.Context r4 = com.bytedance.android.live.core.p230g.C3922z.m9915e()
            boolean r4 = com.bytedance.android.live.uikit.p257c.C4206c.m10426a(r4)
            com.bytedance.android.livesdk.chatroom.p310f.C5235t.m11853a(r3, r0, r4, r2)
            goto L_0x00f8
        L_0x005f:
            java.lang.String r0 = r15.f21768b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f0
            android.view.View r0 = r14.f17552c
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r0 = r0 instanceof android.graphics.drawable.GradientDrawable
            if (r0 == 0) goto L_0x00a9
            android.view.View r0 = r14.f17552c
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
            java.lang.String r3 = r15.f21768b     // Catch:{ Exception -> 0x0083 }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x0083 }
            r0.setColor(r3)     // Catch:{ Exception -> 0x0083 }
            goto L_0x00f8
        L_0x0083:
            r0 = move-exception
            com.bytedance.android.livesdk.p399o.C8064d.m16005b()
            java.lang.String r3 = "ttlive_msg"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "RoomPushWidget load bg color error, color is "
            r4.<init>(r5)
            java.lang.String r5 = r15.f21768b
            r4.append(r5)
            java.lang.String r5 = "/n error is "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.bytedance.android.livesdk.p399o.C8064d.m9721c(r3, r0)
            goto L_0x00f8
        L_0x00a9:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r0.setShape(r1)     // Catch:{ Exception -> 0x00ca }
            r3 = 1094713344(0x41400000, float:12.0)
            int r3 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r3)     // Catch:{ Exception -> 0x00ca }
            float r3 = (float) r3     // Catch:{ Exception -> 0x00ca }
            r0.setCornerRadius(r3)     // Catch:{ Exception -> 0x00ca }
            java.lang.String r3 = r15.f21768b     // Catch:{ Exception -> 0x00ca }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x00ca }
            r0.setColor(r3)     // Catch:{ Exception -> 0x00ca }
            android.view.View r3 = r14.f17552c     // Catch:{ Exception -> 0x00ca }
            r3.setBackground(r0)     // Catch:{ Exception -> 0x00ca }
            goto L_0x00f8
        L_0x00ca:
            r0 = move-exception
            com.bytedance.android.livesdk.p399o.C8064d.m16005b()
            java.lang.String r3 = "ttlive_msg"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "RoomPushWidget load bg color error, color is "
            r4.<init>(r5)
            java.lang.String r5 = r15.f21768b
            r4.append(r5)
            java.lang.String r5 = "/n error is "
            r4.append(r5)
            java.lang.String r0 = r0.getMessage()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.bytedance.android.livesdk.p399o.C8064d.m9721c(r3, r0)
            goto L_0x00f8
        L_0x00f0:
            android.view.View r0 = r14.f17552c
            r3 = 2131955842(0x7f131082, float:1.9548223E38)
            r0.setBackgroundResource(r3)
        L_0x00f8:
            com.bytedance.android.live.base.model.ImageModel r0 = r15.f21776j
            if (r0 == 0) goto L_0x0103
            android.widget.ImageView r0 = r14.f17555f
            com.bytedance.android.live.base.model.ImageModel r3 = r15.f21776j
            com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11814a(r0, r3)
        L_0x0103:
            java.lang.String r0 = r15.f21772f
            java.lang.String r3 = "0"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x0114
            android.widget.ImageView r3 = r14.f17555f
            r4 = 8
            r3.setVisibility(r4)
        L_0x0114:
            java.lang.String r3 = "7"
            boolean r3 = r3.equals(r0)
            r4 = 1
            if (r3 == 0) goto L_0x0184
            java.lang.String r3 = r15.f21771e
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0184
            java.lang.String r3 = r15.f21771e     // Catch:{ Exception -> 0x01cf }
            com.google.gson.q r5 = new com.google.gson.q     // Catch:{ Exception -> 0x01cf }
            r5.<init>()     // Catch:{ Exception -> 0x01cf }
            com.google.gson.l r3 = r5.mo35029a(r3)     // Catch:{ Exception -> 0x01cf }
            com.google.gson.o r3 = r3.mo35009m()     // Catch:{ Exception -> 0x01cf }
            java.util.Set r5 = r3.mo35016a()     // Catch:{ Exception -> 0x01cf }
            int r5 = r5.size()     // Catch:{ Exception -> 0x01cf }
            if (r5 <= 0) goto L_0x0174
            java.lang.String r5 = "gift_id"
            com.google.gson.l r5 = r3.mo35022b(r5)     // Catch:{ Exception -> 0x01cf }
            long r5 = r5.mo34909f()     // Catch:{ Exception -> 0x01cf }
            java.lang.String r7 = "count"
            com.google.gson.l r3 = r3.mo35022b(r7)     // Catch:{ Exception -> 0x01cf }
            int r3 = r3.mo34910g()     // Catch:{ Exception -> 0x01cf }
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r7 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.p245d.C4116c.m10249a(r7)     // Catch:{ Exception -> 0x01cf }
            com.bytedance.android.live.gift.IGiftService r7 = (com.bytedance.android.live.gift.IGiftService) r7     // Catch:{ Exception -> 0x01cf }
            com.bytedance.android.livesdk.gift.model.d r5 = r7.findGiftById(r5)     // Catch:{ Exception -> 0x01cf }
            if (r5 == 0) goto L_0x0174
            r2 = 2132550579(0x7f1c23b3, float:2.0754493E38)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01cf }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x01cf }
            r6[r1] = r3     // Catch:{ Exception -> 0x01cf }
            java.lang.String r3 = r5.f20540a     // Catch:{ Exception -> 0x01cf }
            r6[r4] = r3     // Catch:{ Exception -> 0x01cf }
            java.lang.String r2 = com.bytedance.android.live.core.p230g.C3922z.m9905a(r2, r6)     // Catch:{ Exception -> 0x01cf }
        L_0x0174:
            if (r2 == 0) goto L_0x017c
            android.widget.TextView r3 = r14.f17554e     // Catch:{ Exception -> 0x01cf }
            r3.setText(r2)     // Catch:{ Exception -> 0x01cf }
            goto L_0x01d6
        L_0x017c:
            android.widget.TextView r2 = r14.f17554e     // Catch:{ Exception -> 0x01cf }
            java.lang.String r3 = r15.f21767a     // Catch:{ Exception -> 0x01cf }
            r2.setText(r3)     // Catch:{ Exception -> 0x01cf }
            goto L_0x01d6
        L_0x0184:
            boolean r2 = r15.supportDisplayText()
            if (r2 == 0) goto L_0x01cf
            com.bytedance.android.livesdkapi.message.b r2 = r15.baseMessage
            com.bytedance.android.livesdkapi.message.g r2 = r2.f24139j
            java.lang.String r3 = r2.f24155a
            if (r3 == 0) goto L_0x01ad
            com.bytedance.android.livesdk.i18n.b r3 = com.bytedance.android.livesdk.i18n.C7676b.m15696a()
            java.lang.String r5 = r2.f24155a
            java.lang.String r3 = r3.mo14036a(r5)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01ad
            com.bytedance.android.livesdk.i18n.b r3 = com.bytedance.android.livesdk.i18n.C7676b.m15696a()
            java.lang.String r5 = r2.f24155a
            java.lang.String r3 = r3.mo14036a(r5)
            goto L_0x01af
        L_0x01ad:
            java.lang.String r3 = r2.f24156b
        L_0x01af:
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x01c7
            android.text.Spannable r5 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11758a(r3, r2)
            android.text.Spannable r6 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.f13664a
            if (r5 == r6) goto L_0x01c7
            android.widget.TextView r5 = r14.f17554e
            android.text.Spannable r2 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11758a(r3, r2)
            r5.setText(r2)
            goto L_0x01d6
        L_0x01c7:
            android.widget.TextView r2 = r14.f17554e
            java.lang.String r3 = r15.f21767a
            r2.setText(r3)
            goto L_0x01d6
        L_0x01cf:
            android.widget.TextView r2 = r14.f17554e
            java.lang.String r3 = r15.f21767a
            r2.setText(r3)
        L_0x01d6:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x01e6
            android.view.View r2 = r14.f17552c
            com.bytedance.android.livesdk.chatroom.viewmodule.er r3 = new com.bytedance.android.livesdk.chatroom.viewmodule.er
            r3.<init>(r14, r15, r0)
            r2.setOnClickListener(r3)
        L_0x01e6:
            android.view.animation.TranslateAnimation r0 = new android.view.animation.TranslateAnimation
            r6 = 1
            r7 = 0
            r8 = 1
            r9 = 0
            r10 = 1
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 1
            r13 = 0
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r2 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r2)
            android.view.View r2 = r14.f17552c
            r2.startAnimation(r0)
            android.view.View r0 = r14.f17552c
            r0.setVisibility(r1)
            long r0 = r15.f21773g
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            c.a.v r0 = p064c.p065a.C2201v.m6592a(r0, r2)
            com.bytedance.android.live.core.rxutils.a r1 = r14.getAutoUnbindTransformer()
            c.a.v r0 = r0.mo6513a(r1)
            c.a.ac r1 = p064c.p065a.p066a.p068b.C1667a.m5940a()
            c.a.v r0 = r0.mo6514a(r1)
            com.bytedance.android.livesdk.chatroom.viewmodule.es r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.es
            r1.<init>(r14)
            com.bytedance.android.livesdk.chatroom.viewmodule.et r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.et
            r2.<init>(r14)
            c.a.b.c r0 = r0.mo6505a(r1, r2)
            r14.f17558i = r0
            r14.f17553d = r4
            java.lang.String r0 = r15.f21769c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x025e
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "trace_id"
            java.lang.String r15 = r15.f21769c     // Catch:{ JSONException -> 0x025e }
            r0.put(r1, r15)     // Catch:{ JSONException -> 0x025e }
            com.bytedance.android.livesdk.ab.e r15 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()     // Catch:{ JSONException -> 0x025e }
            com.bytedance.android.livesdk.user.e r15 = r15.mo10315h()     // Catch:{ JSONException -> 0x025e }
            com.bytedance.android.live.base.model.user.i r15 = r15.mo14521a()     // Catch:{ JSONException -> 0x025e }
            android.content.Context r0 = r14.context     // Catch:{ JSONException -> 0x025e }
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r0)     // Catch:{ JSONException -> 0x025e }
            if (r15 == 0) goto L_0x0258
            r15.getId()     // Catch:{ JSONException -> 0x025e }
        L_0x0258:
            com.bytedance.android.livesdkapi.depend.model.live.Room r15 = r14.f17551b     // Catch:{ JSONException -> 0x025e }
            r15.getId()     // Catch:{ JSONException -> 0x025e }
            return
        L_0x025e:
            return
        L_0x025f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget.mo11723a(com.bytedance.android.livesdk.message.model.cg):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0570  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x05c7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0298  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02d0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12528a(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r0 = r20
            r2 = r21
            r19.mo12529c()
            int r3 = r20.hashCode()
            r4 = -2082923311(0xffffffff83d91cd1, float:-1.276073E-36)
            r5 = 7
            r6 = 6
            r7 = 5
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 8
            r12 = 1
            r13 = 0
            if (r3 == r4) goto L_0x00d9
            r4 = 1507424(0x170060, float:2.112351E-39)
            if (r3 == r4) goto L_0x00ce
            r4 = 855900630(0x330401d6, float:3.0735315E-8)
            if (r3 == r4) goto L_0x00c3
            r4 = 1619041129(0x60809b69, float:7.413693E19)
            if (r3 == r4) goto L_0x00b9
            switch(r3) {
                case 48: goto L_0x00af;
                case 49: goto L_0x00a5;
                case 50: goto L_0x009b;
                case 51: goto L_0x0091;
                case 52: goto L_0x0087;
                case 53: goto L_0x007d;
                default: goto L_0x002e;
            }
        L_0x002e:
            switch(r3) {
                case 55: goto L_0x0072;
                case 56: goto L_0x0066;
                case 57: goto L_0x005a;
                default: goto L_0x0031;
            }
        L_0x0031:
            switch(r3) {
                case 1567: goto L_0x004e;
                case 1568: goto L_0x0042;
                case 1569: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x00e4
        L_0x0036:
            java.lang.String r3 = "12"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 14
            goto L_0x00e5
        L_0x0042:
            java.lang.String r3 = "11"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 13
            goto L_0x00e5
        L_0x004e:
            java.lang.String r3 = "10"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 12
            goto L_0x00e5
        L_0x005a:
            java.lang.String r3 = "9"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 11
            goto L_0x00e5
        L_0x0066:
            java.lang.String r3 = "8"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 8
            goto L_0x00e5
        L_0x0072:
            java.lang.String r3 = "7"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 6
            goto L_0x00e5
        L_0x007d:
            java.lang.String r3 = "5"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 5
            goto L_0x00e5
        L_0x0087:
            java.lang.String r3 = "4"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 4
            goto L_0x00e5
        L_0x0091:
            java.lang.String r3 = "3"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 3
            goto L_0x00e5
        L_0x009b:
            java.lang.String r3 = "2"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 2
            goto L_0x00e5
        L_0x00a5:
            java.lang.String r3 = "1"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 1
            goto L_0x00e5
        L_0x00af:
            java.lang.String r3 = "0"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 0
            goto L_0x00e5
        L_0x00b9:
            java.lang.String r3 = "cmd_pk_mvp_show_list"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 7
            goto L_0x00e5
        L_0x00c3:
            java.lang.String r3 = "cmd_show_gift_task_info"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 9
            goto L_0x00e5
        L_0x00ce:
            java.lang.String r3 = "1001"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 15
            goto L_0x00e5
        L_0x00d9:
            java.lang.String r3 = "cmd_show_steal_tower_info"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00e4
            r0 = 10
            goto L_0x00e5
        L_0x00e4:
            r0 = -1
        L_0x00e5:
            r3 = 4607722850755301868(0x3ff1eb851eb851ec, double:1.12)
            r14 = 2132551114(0x7f1c25ca, float:2.0755578E38)
            switch(r0) {
                case 0: goto L_0x05c7;
                case 1: goto L_0x05b3;
                case 2: goto L_0x059a;
                case 3: goto L_0x058d;
                case 4: goto L_0x0570;
                case 5: goto L_0x0562;
                case 6: goto L_0x03d7;
                case 7: goto L_0x03c8;
                case 8: goto L_0x02d0;
                case 9: goto L_0x02c1;
                case 10: goto L_0x02b2;
                case 11: goto L_0x0298;
                case 12: goto L_0x0196;
                case 13: goto L_0x011f;
                case 14: goto L_0x0101;
                case 15: goto L_0x00f2;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            goto L_0x05c8
        L_0x00f2:
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r0 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.live.gift.IGiftService r0 = (com.bytedance.android.live.gift.IGiftService) r0
            java.lang.String r2 = "prop"
            r0.openGiftDialog(r2, r13)
            goto L_0x05c8
        L_0x0101:
            com.bytedance.android.livesdk.chatroom.event.ai r0 = new com.bytedance.android.livesdk.chatroom.event.ai
            r0.<init>(r12)
            com.bytedance.android.livesdk.message.model.bh r3 = new com.bytedance.android.livesdk.message.model.bh
            r3.<init>()
            java.lang.Long r2 = java.lang.Long.valueOf(r21)
            long r4 = r2.longValue()
            r3.f21607b = r4
            r0.f13843b = r3
            com.bytedance.android.livesdk.aa.a r2 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            r2.mo10301a(r0)
            return
        L_0x011f:
            java.lang.Class<com.bytedance.android.live.c.a> r0 = com.bytedance.android.live.p221c.C3807a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            if (r0 == 0) goto L_0x05c8
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "log_action_type"
            java.lang.Object r0 = r0.get(r2)
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Class<com.bytedance.android.live.c.a> r0 = com.bytedance.android.live.p221c.C3807a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            r2 = r0
            com.bytedance.android.live.c.a r2 = (com.bytedance.android.live.p221c.C3807a) r2
            android.content.Context r3 = r19.getContext()
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r1.f17551b
            java.lang.String r6 = "metoo"
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r7 = "data_is_portrait"
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r12)
            java.lang.Object r0 = r0.get(r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r7 = r0.booleanValue()
            r8 = 0
            r2.showJoinFansDialog(r3, r4, r5, r6, r7, r8)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f17551b
            if (r3 == 0) goto L_0x016f
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f17551b
            long r3 = r3.getOwnerUserId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x0171
        L_0x016f:
            java.lang.String r3 = "0"
        L_0x0171:
            r0.put(r2, r3)
            java.lang.String r2 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f17551b
            if (r3 == 0) goto L_0x0185
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f17551b
            long r3 = r3.getId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            goto L_0x0187
        L_0x0185:
            java.lang.String r3 = "0"
        L_0x0187:
            r0.put(r2, r3)
            com.bytedance.android.livesdk.o.c r2 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r3 = "livesdk_fans_club_metoo_show"
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r2.mo14202a(r3, r0, r4)
            return
        L_0x0196:
            com.bytedance.android.livesdk.ab.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo10315h()
            boolean r0 = r0.mo14532c()
            if (r0 == 0) goto L_0x025f
            com.bytedance.android.livesdk.ab.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo10315h()
            com.bytedance.android.livesdk.user.h r2 = com.bytedance.android.livesdk.user.C8336h.TURNTABLE
            boolean r0 = r0.mo14528a(r2)
            if (r0 == 0) goto L_0x01b5
            return
        L_0x01b5:
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            boolean r2 = com.bytedance.android.livesdkapi.p430b.C8607a.f23572a
            if (r2 == 0) goto L_0x01fb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.android.live.core.setting.p<java.lang.String> r5 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            r2.append(r5)
            java.lang.String r5 = "&room_id="
            r2.append(r5)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r1.f17551b
            long r5 = r5.getId()
            r2.append(r5)
            java.lang.String r5 = "&language="
            r2.append(r5)
            android.content.Context r5 = r1.context
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            java.lang.String r5 = r5.getLanguage()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x01f9:
            r13 = r2
            goto L_0x021e
        L_0x01fb:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.android.live.core.setting.p<java.lang.String> r5 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            java.lang.Object r5 = r5.mo9431a()
            java.lang.String r5 = (java.lang.String) r5
            r2.append(r5)
            java.lang.String r5 = "&room_id="
            r2.append(r5)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r1.f17551b
            long r5 = r5.getId()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            goto L_0x01f9
        L_0x021e:
            com.bytedance.android.livesdk.aa.a r2 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            com.bytedance.android.livesdk.chatroom.event.ag r5 = new com.bytedance.android.livesdk.chatroom.event.ag
            java.lang.String r14 = "banner"
            r15 = 80
            android.content.Context r6 = r1.context
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.widthPixels
            float r6 = (float) r6
            float r6 = r6 / r0
            int r6 = (int) r6
            android.content.Context r7 = r1.context
            android.content.res.Resources r7 = r7.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r7 = r7.widthPixels
            float r7 = (float) r7
            float r7 = r7 / r0
            double r7 = (double) r7
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r3
            int r0 = (int) r7
            r18 = 0
            r12 = r5
            r16 = r6
            r17 = r0
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r2.mo10301a(r5)
            android.view.View r0 = r1.f17552c
            r0.setVisibility(r11)
            return
        L_0x025f:
            com.bytedance.android.livesdk.ab.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo10315h()
            android.content.Context r2 = r1.context
            com.bytedance.android.livesdk.user.i$a r3 = com.bytedance.android.livesdk.user.C8337i.m16520a()
            java.lang.String r4 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r14)
            com.bytedance.android.livesdk.user.i$a r3 = r3.mo14540a(r4)
            java.lang.String r4 = "turntable"
            com.bytedance.android.livesdk.user.i$a r3 = r3.mo14543c(r4)
            com.bytedance.android.livesdk.user.i$a r3 = r3.mo14539a(r13)
            com.bytedance.android.livesdk.user.i r3 = r3.mo14541a()
            c.a.v r0 = r0.mo14516a(r2, r3)
            com.bytedance.android.live.core.rxutils.a r2 = r19.getAutoUnbindTransformer()
            c.a.v r0 = r0.mo6513a(r2)
            com.bytedance.android.livesdk.user.g r2 = new com.bytedance.android.livesdk.user.g
            r2.<init>()
            r0.mo6314a(r2)
            return
        L_0x0298:
            com.bytedance.android.livesdk.aa.a r0 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            com.bytedance.android.livesdk.chatroom.event.ag r9 = new com.bytedance.android.livesdk.chatroom.event.ag
            java.lang.String r3 = "https://api.hypstar.com/falcon/live_inroom/page/fans_intro/index.html?show_rule=true"
            java.lang.String r4 = ""
            r5 = 17
            r6 = 300(0x12c, float:4.2E-43)
            r7 = 360(0x168, float:5.04E-43)
            r8 = 12
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.mo10301a(r9)
            return
        L_0x02b2:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
            java.lang.String r2 = "cmd_show_steal_tower_info"
            com.bytedance.android.livesdk.chatroom.model.d r3 = new com.bytedance.android.livesdk.chatroom.model.d
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x02c1:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
            java.lang.String r2 = "cmd_show_gift_task_info"
            com.bytedance.android.livesdk.chatroom.model.d r3 = new com.bytedance.android.livesdk.chatroom.model.d
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x02d0:
            com.bytedance.android.livesdk.ab.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo10315h()
            boolean r0 = r0.mo14532c()
            if (r0 == 0) goto L_0x038f
            com.bytedance.android.livesdk.ab.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo10315h()
            com.bytedance.android.livesdk.user.h r2 = com.bytedance.android.livesdk.user.C8336h.TURNTABLE
            boolean r0 = r0.mo14528a(r2)
            if (r0 == 0) goto L_0x02ef
            return
        L_0x02ef:
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            boolean r2 = com.bytedance.android.livesdkapi.p430b.C8607a.f23572a
            if (r2 == 0) goto L_0x0335
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.android.live.core.setting.p<java.lang.String> r5 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            r2.append(r5)
            java.lang.String r5 = "&room_id="
            r2.append(r5)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r1.f17551b
            long r5 = r5.getId()
            r2.append(r5)
            java.lang.String r5 = "&language="
            r2.append(r5)
            android.content.Context r5 = r1.context
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            java.util.Locale r5 = r5.locale
            java.lang.String r5 = r5.getLanguage()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x0333:
            r6 = r2
            goto L_0x0358
        L_0x0335:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.android.live.core.setting.p<java.lang.String> r5 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TURNTABLE_URL
            java.lang.Object r5 = r5.mo9431a()
            java.lang.String r5 = (java.lang.String) r5
            r2.append(r5)
            java.lang.String r5 = "&room_id="
            r2.append(r5)
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r1.f17551b
            long r5 = r5.getId()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            goto L_0x0333
        L_0x0358:
            com.bytedance.android.livesdk.aa.a r2 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            com.bytedance.android.livesdk.chatroom.event.ag r12 = new com.bytedance.android.livesdk.chatroom.event.ag
            java.lang.String r7 = "banner"
            r8 = 80
            android.content.Context r5 = r1.context
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            float r5 = (float) r5
            float r5 = r5 / r0
            int r9 = (int) r5
            android.content.Context r5 = r1.context
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            float r5 = (float) r5
            float r5 = r5 / r0
            double r10 = (double) r5
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r3
            int r10 = (int) r10
            r11 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.mo10301a(r12)
            return
        L_0x038f:
            com.bytedance.android.livesdk.ab.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo10315h()
            android.content.Context r2 = r1.context
            com.bytedance.android.livesdk.user.i$a r3 = com.bytedance.android.livesdk.user.C8337i.m16520a()
            java.lang.String r4 = com.bytedance.android.live.core.p230g.C3922z.m9903a(r14)
            com.bytedance.android.livesdk.user.i$a r3 = r3.mo14540a(r4)
            java.lang.String r4 = "turntable"
            com.bytedance.android.livesdk.user.i$a r3 = r3.mo14543c(r4)
            com.bytedance.android.livesdk.user.i$a r3 = r3.mo14539a(r13)
            com.bytedance.android.livesdk.user.i r3 = r3.mo14541a()
            c.a.v r0 = r0.mo14516a(r2, r3)
            com.bytedance.android.live.core.rxutils.a r2 = r19.getAutoUnbindTransformer()
            c.a.v r0 = r0.mo6513a(r2)
            com.bytedance.android.livesdk.user.g r2 = new com.bytedance.android.livesdk.user.g
            r2.<init>()
            r0.mo6314a(r2)
            return
        L_0x03c8:
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r0 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m11103a()
            java.lang.String r2 = "cmd_pk_mvp_show_list"
            com.bytedance.android.livesdk.chatroom.model.d r3 = new com.bytedance.android.livesdk.chatroom.model.d
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x03d7:
            boolean r0 = r1.f17556g
            if (r0 != 0) goto L_0x0435
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x0435
            java.lang.String r0 = "gift_id"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0435
            java.lang.String r0 = "count"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0435
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x041c }
            r0.<init>(r2)     // Catch:{ JSONException -> 0x041c }
            java.lang.String r2 = "gift_id"
            long r2 = r0.getLong(r2)     // Catch:{ JSONException -> 0x041c }
            java.lang.String r4 = "count"
            int r0 = r0.getInt(r4)     // Catch:{ JSONException -> 0x041c }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x041b
            if (r0 <= 0) goto L_0x041b
            com.bytedance.android.livesdk.chatroom.event.g r4 = new com.bytedance.android.livesdk.chatroom.event.g     // Catch:{ JSONException -> 0x041c }
            r4.<init>(r2, r0)     // Catch:{ JSONException -> 0x041c }
            java.lang.String r0 = "fans_club_msg"
            r4.mo11051a(r0)     // Catch:{ JSONException -> 0x041c }
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter     // Catch:{ JSONException -> 0x041c }
            java.lang.String r2 = "cmd_do_send_gift"
            r0.lambda$put$1$DataCenter(r2, r4)     // Catch:{ JSONException -> 0x041c }
        L_0x041b:
            return
        L_0x041c:
            r0 = move-exception
            java.lang.String r2 = "RoomPushWidget"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "fans club send enableGift error:"
            r3.<init>(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.bytedance.android.live.core.p224c.C3831a.m9716d(r2, r0)
            return
        L_0x0435:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "log_enter_live_source"
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r1.dataCenter
            java.lang.String r3 = "data_is_portrait"
            java.lang.Object r2 = r2.get(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            com.bytedance.android.live.base.model.user.User r3 = r1.f17557h
            if (r3 == 0) goto L_0x047e
            com.bytedance.android.live.base.model.user.User r3 = r1.f17557h
            com.bytedance.android.live.base.model.FansClubMember r3 = r3.getFansClub()
            if (r3 == 0) goto L_0x047e
            com.bytedance.android.live.base.model.user.User r3 = r1.f17557h
            com.bytedance.android.live.base.model.FansClubMember r3 = r3.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r3 = r3.getData()
            if (r3 == 0) goto L_0x047e
            com.bytedance.android.live.base.model.user.User r3 = r1.f17557h
            com.bytedance.android.live.base.model.FansClubMember r3 = r3.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r3 = r3.getData()
            long r3 = r3.anchorId
            com.bytedance.android.livesdkapi.depend.model.live.Room r14 = r1.f17551b
            long r14 = r14.getOwnerUserId()
            int r16 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x047e
            java.lang.String r3 = "1"
            goto L_0x0480
        L_0x047e:
            java.lang.String r3 = "0"
        L_0x0480:
            java.lang.String r4 = com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget.f18056b
            boolean r14 = r1.f17556g
            boolean r14 = com.bytedance.android.livesdk.fansclub.C6780c.m14218a(r14)
            if (r14 == 0) goto L_0x048c
            java.lang.String r4 = com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget.f18057c
        L_0x048c:
            java.util.Locale r14 = java.util.Locale.US
            java.lang.Object[] r11 = new java.lang.Object[r11]
            com.bytedance.android.livesdkapi.depend.model.live.Room r15 = r1.f17551b
            long r15 = r15.getId()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r11[r13] = r15
            com.bytedance.android.livesdkapi.depend.model.live.Room r15 = r1.f17551b
            com.bytedance.android.live.base.model.user.User r15 = r15.getOwner()
            long r15 = r15.getId()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            r11[r12] = r15
            com.bytedance.android.livesdk.ab.e r12 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r12 = r12.mo10315h()
            long r15 = r12.mo14529b()
            java.lang.Long r12 = java.lang.Long.valueOf(r15)
            r11[r10] = r12
            r11[r9] = r0
            java.lang.String r0 = ""
            r11[r8] = r0
            java.lang.String r0 = "bottom"
            r11[r7] = r0
            r11[r6] = r3
            com.bytedance.android.livesdk.ab.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo10315h()
            com.bytedance.android.live.base.model.user.i r0 = r0.mo14521a()
            int r0 = com.bytedance.android.livesdk.p282ag.p283a.C4627a.m11090a(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11[r5] = r0
            java.lang.String r0 = com.C2240a.m6773a(r14, r4, r11)
            boolean r3 = r1.f17556g
            boolean r3 = com.bytedance.android.livesdk.fansclub.C6780c.m14218a(r3)
            if (r3 == 0) goto L_0x04fd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = "&web_bg_color=%2300000000"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x04fd:
            r4 = r0
            android.content.Context r0 = r1.context
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r3 = r0.widthPixels
            float r3 = (float) r3
            float r5 = r0.density
            float r3 = r3 / r5
            int r3 = (int) r3
            int r5 = r0.heightPixels
            float r5 = (float) r5
            float r0 = r0.density
            float r5 = r5 / r0
            int r0 = (int) r5
            if (r2 == 0) goto L_0x0530
            r5 = 440(0x1b8, float:6.17E-43)
            boolean r6 = r1.f17556g
            boolean r6 = com.bytedance.android.livesdk.fansclub.C6780c.m14218a(r6)
            if (r6 == 0) goto L_0x052c
            float r0 = (float) r0
            r5 = 1062836634(0x3f59999a, float:0.85)
            float r0 = r0 * r5
            int r0 = (int) r0
            r8 = r0
            r7 = r3
            goto L_0x0532
        L_0x052c:
            r7 = r3
            r8 = 440(0x1b8, float:6.17E-43)
            goto L_0x0532
        L_0x0530:
            r7 = r0
            r8 = r7
        L_0x0532:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0561
            com.bytedance.android.livesdk.chatroom.event.ag r0 = new com.bytedance.android.livesdk.chatroom.event.ag
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x0543
            r2 = 80
            r6 = 80
            goto L_0x0549
        L_0x0543:
            r2 = 8388613(0x800005, float:1.175495E-38)
            r6 = 8388613(0x800005, float:1.175495E-38)
        L_0x0549:
            r9 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            boolean r2 = r1.f17556g
            boolean r2 = com.bytedance.android.livesdk.fansclub.C6780c.m14218a(r2)
            if (r2 == 0) goto L_0x055a
            r0.f13839i = r13
            r0.f13840j = r13
        L_0x055a:
            com.bytedance.android.livesdk.aa.a r2 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            r2.mo10301a(r0)
        L_0x0561:
            return
        L_0x0562:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "cmd_send_gift"
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r1.f17551b
            com.bytedance.android.live.base.model.user.User r3 = r3.getOwner()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x0570:
            boolean r0 = r1.f17556g
            if (r0 != 0) goto L_0x05c8
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r1.f17551b
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            boolean r0 = r0.isFollowing()
            if (r0 != 0) goto L_0x05c8
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "cmd_wanna_follow_anchor"
            com.bytedance.android.livesdk.chatroom.event.ay r3 = new com.bytedance.android.livesdk.chatroom.event.ay
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x058d:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "cmd_wanna_share_live"
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x059a:
            com.bytedance.android.livesdk.aa.a r0 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            com.bytedance.android.livesdk.chatroom.event.ba r2 = new com.bytedance.android.livesdk.chatroom.event.ba
            r2.<init>()
            r0.mo10301a(r2)
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r1.dataCenter
            java.lang.String r2 = "cmd_wanna_send_message"
            com.bytedance.android.livesdk.chatroom.event.ba r3 = new com.bytedance.android.livesdk.chatroom.event.ba
            r3.<init>()
            r0.lambda$put$1$DataCenter(r2, r3)
            return
        L_0x05b3:
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L_0x05c8
            com.bytedance.android.livesdk.ab.f r0 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.livesdk.schema.interfaces.a r0 = r0.mo10328i()
            android.content.Context r3 = r1.context
            r0.handle(r3, r2)
            return
        L_0x05c7:
            return
        L_0x05c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget.mo12528a(java.lang.String, java.lang.String):void");
    }
}
