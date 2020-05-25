package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.gift.C4129g;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.gift.effect.entry.p363a.C7373b;
import com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;

public class EnterAnimWidget extends LiveRecyclableWidget implements C0199s<KVData>, C4129g {

    /* renamed from: a */
    public EnterAnimationView f16969a;

    /* renamed from: b */
    private int f16970b;

    /* renamed from: c */
    private C7373b f16971c;

    public int getLayoutId() {
        return R.layout.asc;
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
    }

    /* renamed from: a */
    public final void mo9499a(long j) {
        if (j != 0) {
            this.dataCenter.lambda$put$1$DataCenter("cmd_show_user_profile", new UserProfileEvent(j));
        }
    }

    public void onInit(Object... objArr) {
        this.f16971c = new C7373b();
        this.f16969a = (EnterAnimationView) this.contentView.findViewById(R.id.aao);
        if (objArr.length > 0 && (objArr[0] instanceof Integer)) {
            this.f16969a.setChildMarginBottom(objArr[0].intValue());
        }
        this.f16969a.setUserEventListener(this);
    }

    public void onLoad(Object... objArr) {
        this.dataCenter.observe("data_member_message", this);
        this.dataCenter.observe("data_live_ecom_message", this);
        if (this.f16969a != null && objArr.length > 0 && (objArr[0] instanceof Integer)) {
            this.f16969a.setChildMarginBottom(objArr[0].intValue());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            com.bytedance.ies.sdk.widgets.KVData r1 = (com.bytedance.ies.sdk.widgets.KVData) r1
            if (r1 == 0) goto L_0x035b
            java.lang.String r2 = r1.getKey()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0014
            goto L_0x035b
        L_0x0014:
            java.lang.String r2 = r1.getKey()
            int r3 = r2.hashCode()
            r4 = -970251873(0xffffffffc62b219f, float:-10952.405)
            r6 = 1
            r7 = 0
            if (r3 == r4) goto L_0x0042
            r4 = -407049065(0xffffffffe7bcec97, float:-1.7843384E24)
            if (r3 == r4) goto L_0x0038
            r4 = 771158242(0x2df6f0e2, float:2.8073936E-11)
            if (r3 == r4) goto L_0x002e
            goto L_0x004c
        L_0x002e:
            java.lang.String r3 = "data_live_ecom_message"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x004c
            r2 = 2
            goto L_0x004d
        L_0x0038:
            java.lang.String r3 = "data_member_message"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x004c
            r2 = 0
            goto L_0x004d
        L_0x0042:
            java.lang.String r3 = "data_member_count"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x004c
            r2 = 1
            goto L_0x004d
        L_0x004c:
            r2 = -1
        L_0x004d:
            r3 = 0
            switch(r2) {
                case 0: goto L_0x00b2;
                case 1: goto L_0x009f;
                case 2: goto L_0x0055;
                default: goto L_0x0052;
            }
        L_0x0052:
            r3 = r0
            goto L_0x035a
        L_0x0055:
            java.lang.Object r2 = r1.getData()
            boolean r2 = r2 instanceof com.bytedance.android.livesdk.message.model.C7831bf
            if (r2 == 0) goto L_0x0052
            java.lang.Object r1 = r1.getData()
            com.bytedance.android.livesdk.message.model.bf r1 = (com.bytedance.android.livesdk.message.model.C7831bf) r1
            if (r1 == 0) goto L_0x009e
            boolean r2 = r26.isViewValid()
            if (r2 == 0) goto L_0x009e
            com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView r2 = r0.f16969a
            if (r2 != 0) goto L_0x0070
            goto L_0x009e
        L_0x0070:
            int r2 = r1.f21591a
            if (r2 != 0) goto L_0x0052
            long r5 = r1.f21593c
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x009d
            java.lang.String r2 = r1.f21592b
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0083
            goto L_0x009d
        L_0x0083:
            com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView r2 = r0.f16969a
            com.bytedance.android.livesdk.gift.effect.entry.e.b r9 = new com.bytedance.android.livesdk.gift.effect.entry.e.b
            java.lang.String r4 = r1.f21592b
            long r5 = r1.f21593c
            java.lang.String r7 = r1.f21595e
            java.lang.String r8 = r1.f21594d
            r3 = r9
            r3.<init>(r4, r5, r7, r8)
            boolean r1 = r2.f20228b
            if (r1 == 0) goto L_0x0052
            com.bytedance.android.livesdk.gift.effect.entry.c.a r1 = r2.f20227a
            r1.mo13651a(r9)
            goto L_0x0052
        L_0x009d:
            return
        L_0x009e:
            return
        L_0x009f:
            boolean r2 = r26.isViewValid()
            if (r2 == 0) goto L_0x0052
            java.lang.Object r1 = r1.getData()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.f16970b = r1
            return
        L_0x00b2:
            java.lang.Object r1 = r1.getData()
            com.bytedance.android.livesdk.message.model.bj r1 = (com.bytedance.android.livesdk.message.model.C7835bj) r1
            if (r1 == 0) goto L_0x0052
            boolean r2 = r26.isViewValid()
            if (r2 == 0) goto L_0x0052
            com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView r2 = r0.f16969a
            if (r2 != 0) goto L_0x00c5
            goto L_0x0052
        L_0x00c5:
            long r8 = r1.mo14147a()
            r10 = 1
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 != 0) goto L_0x0358
            com.bytedance.android.live.base.model.user.User r2 = r1.f21634b
            if (r2 == 0) goto L_0x0358
            com.bytedance.android.live.base.model.user.NobleLevelInfo r2 = r2.getNobleLevelInfo()
            com.bytedance.ies.sdk.widgets.DataCenter r8 = r0.dataCenter
            java.lang.String r9 = "data_is_portrait"
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            java.lang.Object r8 = r8.get(r9, r10)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            com.bytedance.ies.sdk.widgets.DataCenter r9 = r0.dataCenter
            java.lang.String r10 = "data_room"
            r11 = 0
            r9.get(r10, r11)
            if (r2 == 0) goto L_0x014a
            long r9 = r2.getNobleLevel()
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x014a
            com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView r2 = r0.f16969a
            com.bytedance.android.live.base.model.user.User r3 = r1.f21634b
            if (r3 != 0) goto L_0x0102
            goto L_0x0137
        L_0x0102:
            com.bytedance.android.live.base.model.user.NobleLevelInfo r15 = r3.getNobleLevelInfo()
            com.bytedance.android.live.base.model.ImageModel r14 = r3.getAvatarThumb()
            com.bytedance.android.livesdk.message.model.bj$a r4 = r1.f21643k
            if (r4 != 0) goto L_0x010f
            goto L_0x0137
        L_0x010f:
            com.bytedance.android.live.base.model.ImageModel r4 = r4.f21651e
            com.bytedance.android.live.base.model.user.m r5 = r3.getUserHonor()
            if (r5 == 0) goto L_0x0122
            com.bytedance.android.live.base.model.user.m r5 = r3.getUserHonor()
            int r7 = r5.mo8159n()
            r18 = r7
            goto L_0x0124
        L_0x0122:
            r18 = 0
        L_0x0124:
            com.bytedance.android.livesdk.gift.effect.entry.e.c r5 = new com.bytedance.android.livesdk.gift.effect.entry.e.c
            java.lang.String r13 = r3.getNickName()
            com.bytedance.android.livesdkapi.message.b r3 = r1.baseMessage
            com.bytedance.android.livesdkapi.message.g r3 = r3.f24139j
            r12 = r5
            r16 = r4
            r17 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r11 = r5
        L_0x0137:
            if (r11 == 0) goto L_0x0052
            com.bytedance.android.live.base.model.user.User r1 = r1.f21634b
            com.bytedance.android.live.base.model.user.NobleLevelInfo r1 = r1.getNobleLevelInfo()
            if (r1 == 0) goto L_0x0052
            r11.f20205u = r8
            com.bytedance.android.livesdk.gift.effect.entry.c.a r1 = r2.f20227a
            r1.mo13651a(r11)
            goto L_0x0052
        L_0x014a:
            java.lang.String r2 = r1.mo14149c()
            java.lang.String r8 = ""
            int r9 = r1.f21641i
            r10 = 15
            r12 = 1000(0x3e8, float:1.401E-42)
            if (r9 == r10) goto L_0x018f
            if (r9 == r12) goto L_0x0185
            r10 = 2000(0x7d0, float:2.803E-42)
            if (r9 == r10) goto L_0x017b
            r10 = 3000(0xbb8, float:4.204E-42)
            if (r9 == r10) goto L_0x0171
            r10 = 4000(0xfa0, float:5.605E-42)
            if (r9 == r10) goto L_0x0167
            goto L_0x0198
        L_0x0167:
            r8 = 2132550528(0x7f1c2380, float:2.075439E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r8 = com.bytedance.android.livesdk.message.model.C7835bj.m15872a(r8, r9)
            goto L_0x0198
        L_0x0171:
            r8 = 2132550530(0x7f1c2382, float:2.0754393E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r8 = com.bytedance.android.livesdk.message.model.C7835bj.m15872a(r8, r9)
            goto L_0x0198
        L_0x017b:
            r8 = 2132550529(0x7f1c2381, float:2.0754391E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r8 = com.bytedance.android.livesdk.message.model.C7835bj.m15872a(r8, r9)
            goto L_0x0198
        L_0x0185:
            r8 = 2132550527(0x7f1c237f, float:2.0754387E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r8 = com.bytedance.android.livesdk.message.model.C7835bj.m15872a(r8, r9)
            goto L_0x0198
        L_0x018f:
            r8 = 2132551107(0x7f1c25c3, float:2.0755564E38)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.String r8 = com.bytedance.android.livesdk.message.model.C7835bj.m15872a(r8, r9)
        L_0x0198:
            com.bytedance.android.live.base.model.user.User r9 = r1.f21634b
            if (r9 != 0) goto L_0x01a7
            com.bytedance.android.livesdk.gift.effect.entry.e.a r2 = new com.bytedance.android.livesdk.gift.effect.entry.e.a
            java.lang.String r5 = ""
            java.lang.String r6 = ""
            r2.<init>(r3, r5, r6)
            goto L_0x0309
        L_0x01a7:
            long r3 = r9.getId()
            java.lang.String r10 = r9.getNickName()
            int r13 = r9.getLevel()
            com.bytedance.android.live.base.model.ImageModel r14 = r9.getAvatarThumb()
            java.lang.String r15 = ""
            if (r14 == 0) goto L_0x01d5
            java.util.List r16 = r14.getUrls()
            boolean r16 = com.bytedance.common.utility.p522b.C9376b.m18558a(r16)
            if (r16 != 0) goto L_0x01d5
            java.util.List r14 = r14.getUrls()
            java.lang.Object r14 = r14.get(r7)
            r15 = r14
            java.lang.String r15 = (java.lang.String) r15
            com.bytedance.android.live.base.model.ImageModel r14 = r9.getAvatarThumb()
            goto L_0x01d6
        L_0x01d5:
            r14 = r11
        L_0x01d6:
            java.lang.String r16 = ""
            com.bytedance.android.live.base.model.user.m r17 = r9.getUserHonor()
            if (r17 == 0) goto L_0x0223
            com.bytedance.android.live.base.model.user.m r17 = r9.getUserHonor()
            com.bytedance.android.live.base.model.ImageModel r17 = r17.mo8156k()
            if (r17 == 0) goto L_0x0223
            com.bytedance.android.live.base.model.user.m r17 = r9.getUserHonor()
            com.bytedance.android.live.base.model.ImageModel r17 = r17.mo8156k()
            java.util.List r17 = r17.getUrls()
            boolean r17 = com.bytedance.common.utility.C9414h.m18630a(r17)
            if (r17 != 0) goto L_0x0223
            com.bytedance.android.live.base.model.user.m r16 = r9.getUserHonor()
            com.bytedance.android.live.base.model.ImageModel r16 = r16.mo8156k()
            java.util.List r5 = r16.getUrls()
            java.lang.Object r5 = r5.get(r7)
            r16 = r5
            java.lang.String r16 = (java.lang.String) r16
            com.bytedance.android.live.base.model.user.m r5 = r9.getUserHonor()
            int r5 = r5.mo8159n()
            com.bytedance.android.live.base.model.user.m r17 = r9.getUserHonor()
            com.bytedance.android.live.base.model.ImageModel r17 = r17.mo8156k()
            r11 = r16
            r7 = r17
            goto L_0x0227
        L_0x0223:
            r7 = r11
            r11 = r16
            r5 = 0
        L_0x0227:
            int r6 = r1.f21641i
            r12 = 100
            if (r6 <= r12) goto L_0x023c
            int r6 = r1.f21641i
            int r12 = r6 % 10
            r19 = r12
            r12 = 1000(0x3e8, float:1.401E-42)
            int r6 = r6 / r12
            int r6 = r6 % 10
            r12 = r6
            r6 = r19
            goto L_0x023e
        L_0x023c:
            r6 = -1
            r12 = 0
        L_0x023e:
            java.lang.String r16 = ""
            com.bytedance.android.live.base.model.FansClubMember r17 = r9.getFansClub()
            if (r17 == 0) goto L_0x02d4
            com.bytedance.android.live.base.model.FansClubMember r17 = r9.getFansClub()
            com.bytedance.android.live.base.model.user.FansClubData r17 = r17.getData()
            com.bytedance.android.live.base.model.FansClubMember r9 = r9.getFansClub()
            java.util.Map r9 = r9.getPreferData()
            boolean r18 = com.bytedance.android.live.base.model.user.FansClubData.isValid(r17)
            if (r18 != 0) goto L_0x0272
            if (r9 == 0) goto L_0x0272
            boolean r18 = r9.isEmpty()
            if (r18 != 0) goto L_0x0272
            r18 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            java.lang.Object r0 = r9.get(r0)
            r17 = r0
            com.bytedance.android.live.base.model.user.FansClubData r17 = (com.bytedance.android.live.base.model.user.FansClubData) r17
        L_0x0272:
            r0 = r17
            boolean r9 = com.bytedance.android.live.base.model.user.FansClubData.isValid(r0)
            if (r9 == 0) goto L_0x02d4
            int r9 = r0.level
            r20 = r9
            java.lang.String r9 = r0.clubName
            r21 = r9
            com.bytedance.android.live.base.model.user.FansClubData$UserBadge r9 = r0.badge
            if (r9 == 0) goto L_0x02c6
            com.bytedance.android.live.base.model.user.FansClubData$UserBadge r9 = r0.badge
            java.util.Map<java.lang.Integer, com.bytedance.android.live.base.model.ImageModel> r9 = r9.icons
            if (r9 == 0) goto L_0x02c6
            com.bytedance.android.live.base.model.user.FansClubData$UserBadge r9 = r0.badge
            java.util.Map<java.lang.Integer, com.bytedance.android.live.base.model.ImageModel> r9 = r9.icons
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x02c6
            com.bytedance.android.live.base.model.user.FansClubData$UserBadge r9 = r0.badge
            java.util.Map<java.lang.Integer, com.bytedance.android.live.base.model.ImageModel> r9 = r9.icons
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x02a2:
            boolean r16 = r9.hasNext()
            if (r16 == 0) goto L_0x02c6
            java.lang.Object r16 = r9.next()
            r22 = r9
            r9 = r16
            java.lang.Integer r9 = (java.lang.Integer) r9
            r23 = r1
            com.bytedance.android.live.base.model.user.FansClubData$UserBadge r1 = r0.badge
            java.util.Map<java.lang.Integer, com.bytedance.android.live.base.model.ImageModel> r1 = r1.icons
            java.lang.Object r1 = r1.get(r9)
            com.bytedance.android.live.base.model.ImageModel r1 = (com.bytedance.android.live.base.model.ImageModel) r1
            if (r1 == 0) goto L_0x02c1
            goto L_0x02c9
        L_0x02c1:
            r9 = r22
            r1 = r23
            goto L_0x02a2
        L_0x02c6:
            r23 = r1
            r1 = 0
        L_0x02c9:
            int r0 = r0.userFansClubStatus
            r24 = r0
            r25 = r1
            r0 = r20
            r1 = r21
            goto L_0x02dd
        L_0x02d4:
            r23 = r1
            r1 = r16
            r0 = 0
            r24 = 0
            r25 = 0
        L_0x02dd:
            com.bytedance.android.livesdk.gift.effect.entry.e.a r9 = new com.bytedance.android.livesdk.gift.effect.entry.e.a
            r9.<init>(r3, r10, r15)
            r9.f20185c = r13
            r9.f20189g = r2
            com.bytedance.android.livesdk.gift.effect.entry.e.a r2 = r9.mo13656a(r14)
            r2.f20188f = r7
            r2.f20191i = r11
            r2.f20190h = r5
            r2.f20192j = r8
            r2.f20193k = r6
            r2.f20194l = r12
            long r3 = (long) r0
            r2.f20197o = r3
            r2.f20198p = r1
            r1 = r25
            r2.f20199q = r1
            r0 = r24
            r2.f20200r = r0
            r1 = r23
            com.bytedance.android.livesdk.message.model.bj$a r0 = r1.f21643k
            r2.f20195m = r0
        L_0x0309:
            com.bytedance.android.livesdk.message.model.bj$a r0 = r1.f21643k
            if (r0 != 0) goto L_0x0315
            int r0 = r1.f21641i
            if (r0 == 0) goto L_0x0312
            goto L_0x0315
        L_0x0312:
            r3 = r26
            goto L_0x0359
        L_0x0315:
            boolean r0 = r2.mo13658a()
            if (r0 == 0) goto L_0x0350
            com.bytedance.android.livesdk.message.model.bj$a r0 = r2.f20195m
            com.bytedance.android.live.base.model.ImageModel r0 = r0.f21651e
            if (r0 == 0) goto L_0x034d
            java.lang.String r1 = com.bytedance.android.livesdk.gift.effect.entry.p364b.C7374a.C7375a.m15220a(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0345
            com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget$1 r1 = new com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget$1
            r3 = r26
            r1.<init>(r2)
            java.lang.String r2 = "imageModel"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            java.lang.String r2 = "callback"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            com.bytedance.android.livesdk.gift.effect.entry.b.a$b r2 = new com.bytedance.android.livesdk.gift.effect.entry.b.a$b
            r2.<init>(r0, r1)
            r2.mo13649a()
            goto L_0x0359
        L_0x0345:
            r3 = r26
            com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView r0 = r3.f16969a
            r0.mo13667a(r2)
            goto L_0x035a
        L_0x034d:
            r3 = r26
            goto L_0x035a
        L_0x0350:
            r3 = r26
            com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView r0 = r3.f16969a
            r0.mo13667a(r2)
            goto L_0x0359
        L_0x0358:
            r3 = r0
        L_0x0359:
            return
        L_0x035a:
            return
        L_0x035b:
            r3 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget.onChanged(java.lang.Object):void");
    }
}
