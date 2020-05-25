package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.arch.lifecycle.C0199s;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.eo */
final /* synthetic */ class C6564eo implements C0199s {

    /* renamed from: a */
    private final RechargeWidget f17897a;

    C6564eo(RechargeWidget rechargeWidget) {
        this.f17897a = rechargeWidget;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0116, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onChanged(java.lang.Object r9) {
        /*
            r8 = this;
            com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget r0 = r8.f17897a
            com.bytedance.ies.sdk.widgets.KVData r9 = (com.bytedance.ies.sdk.widgets.KVData) r9
            if (r9 == 0) goto L_0x0118
            java.lang.String r1 = r9.getKey()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0012
            goto L_0x0118
        L_0x0012:
            java.lang.String r1 = r9.getKey()
            r2 = -1
            int r3 = r1.hashCode()
            r4 = -187819389(0xfffffffff4ce1a83, float:-1.3063365E32)
            r5 = 0
            r6 = 1
            if (r3 == r4) goto L_0x0032
            r4 = 1257343548(0x4af18a3c, float:7914782.0)
            if (r3 == r4) goto L_0x0028
            goto L_0x003b
        L_0x0028:
            java.lang.String r3 = "cmd_show_pay_dialog"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003b
            r2 = 1
            goto L_0x003b
        L_0x0032:
            java.lang.String r3 = "cmd_show_recharge_dialog"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x003b
            r2 = 0
        L_0x003b:
            switch(r2) {
                case 0: goto L_0x00d8;
                case 1: goto L_0x0040;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0117
        L_0x0040:
            java.lang.Object r9 = r9.getData()
            com.bytedance.android.livesdk.chatroom.event.ar r9 = (com.bytedance.android.livesdk.chatroom.event.C5172ar) r9
            if (r9 == 0) goto L_0x0117
            com.bytedance.android.livesdkapi.depend.model.ChargeDeal r1 = r9.f13858a
            java.lang.String r2 = r9.f13859b
            android.app.Dialog r3 = r0.f17545a
            if (r3 == 0) goto L_0x005d
            android.app.Dialog r3 = r0.f17545a
            boolean r3 = r3.isShowing()
            if (r3 == 0) goto L_0x005d
            android.app.Dialog r3 = r0.f17545a
            com.bytedance.android.livesdk.chatroom.viewmodule.C6565ep.m13940a(r3)
        L_0x005d:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = "KEY_CHARGE_REASON"
            r3.putString(r4, r2)
            java.lang.String r4 = "KEY_REQUEST_PAGE"
            java.lang.String r7 = "live_detail"
            r3.putString(r4, r7)
            java.lang.String r4 = "key_bundle_charge_type"
            int r7 = r9.f13860c
            r3.putInt(r4, r7)
            java.lang.Class<com.bytedance.android.live.wallet.IWalletService> r4 = com.bytedance.android.live.wallet.IWalletService.class
            com.bytedance.android.live.base.b r4 = com.bytedance.android.live.p245d.C4116c.m10249a(r4)
            com.bytedance.android.live.wallet.IWalletService r4 = (com.bytedance.android.live.wallet.IWalletService) r4
            android.content.Context r7 = r0.context
            android.app.Dialog r3 = r4.getPayDialog(r7, r6, r3, r1)
            r0.f17545a = r3
            android.app.Dialog r3 = r0.f17545a
            r3.setCanceledOnTouchOutside(r6)
            android.app.Dialog r0 = r0.f17545a
            r0.show()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = r1.f23691e
            int r1 = r1.f23692f
            int r3 = r3 + r1
            java.lang.String r1 = "money"
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r1, r3)
            java.lang.String r1 = "request_page"
            java.lang.String r3 = "live_detail"
            r0.put(r1, r3)
            java.lang.String r1 = "charge_reason"
            r0.put(r1, r2)
            int r1 = r9.f13860c
            r2 = 2
            if (r1 != r6) goto L_0x00b6
            java.lang.String r9 = "first_recharge"
            goto L_0x00bf
        L_0x00b6:
            int r9 = r9.f13860c
            if (r9 != r2) goto L_0x00bd
            java.lang.String r9 = "small_heart"
            goto L_0x00bf
        L_0x00bd:
            java.lang.String r9 = "normal"
        L_0x00bf:
            java.lang.String r1 = "panel_position"
            r0.put(r1, r9)
            com.bytedance.android.livesdk.o.c r9 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r1 = "livesdk_check_out_show"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class<com.bytedance.android.livesdk.o.c.j> r3 = com.bytedance.android.livesdk.p399o.p402c.C8059j.class
            r2[r5] = r3
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r3 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            r2[r6] = r3
            r9.mo14202a(r1, r0, r2)
            goto L_0x0117
        L_0x00d8:
            java.lang.Object r9 = r9.getData()
            com.bytedance.android.livesdk.chatroom.event.as r9 = (com.bytedance.android.livesdk.chatroom.event.C5173as) r9
            int r1 = r9.f13861a
            switch(r1) {
                case 0: goto L_0x00f6;
                case 1: goto L_0x00ea;
                case 2: goto L_0x00e4;
                default: goto L_0x00e3;
            }
        L_0x00e3:
            goto L_0x0116
        L_0x00e4:
            java.lang.String r9 = r9.f13863c
            r0.mo12524a(r9)
            goto L_0x0116
        L_0x00ea:
            java.lang.String r1 = r9.f13863c
            java.lang.String r2 = r9.f13864d
            java.lang.String r3 = r9.f13865e
            int r9 = r9.f13862b
            r0.mo12525a(r1, r2, r3, r9)
            goto L_0x0117
        L_0x00f6:
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r1 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_ROOM_CHARGE_TYPE
            java.lang.Object r1 = r1.mo9431a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r6) goto L_0x0110
            java.lang.String r1 = r9.f13863c
            java.lang.String r2 = r9.f13864d
            java.lang.String r3 = r9.f13865e
            int r9 = r9.f13862b
            r0.mo12525a(r1, r2, r3, r9)
            goto L_0x0117
        L_0x0110:
            java.lang.String r9 = r9.f13863c
            r0.mo12524a(r9)
            goto L_0x0117
        L_0x0116:
            return
        L_0x0117:
            return
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.viewmodule.C6564eo.onChanged(java.lang.Object):void");
    }
}
