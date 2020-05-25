package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.b */
public final class C33220b implements C33242d {

    /* renamed from: a */
    public C33242d f86213a;

    /* renamed from: b */
    private Context f86214b;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void sendMsg() {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.p683ss.android.ugc.aweme.services.BaseUserService.getBaseUserService_Monster()
            r1 = 10
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.p683ss.android.ugc.aweme.services.BaseUserService.getBaseUserService_Monster()
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.p683ss.android.ugc.aweme.framework.services.IUserService) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.p683ss.android.ugc.aweme.services.BaseUserService.getBaseUserService_Monster()
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = (com.p683ss.android.ugc.aweme.framework.services.IUserService) r0
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getCurrentUser()
            boolean r0 = r0.isPhoneBinded()
            if (r0 == 0) goto L_0x0027
        L_0x0024:
            r0 = 10
            goto L_0x0037
        L_0x0027:
            com.ss.android.ugc.aweme.im.service.IIMService r0 = com.p683ss.android.ugc.aweme.p1807im.DefaultIMService.provideIMService_Monster()
            com.ss.android.ugc.aweme.im.service.IIMService r0 = (com.p683ss.android.ugc.aweme.p1807im.service.IIMService) r0
            com.ss.android.ugc.aweme.im.service.b r0 = r0.getAbInterface()
            if (r0 == 0) goto L_0x0024
            int r0 = r0.mo70320a()
        L_0x0037:
            if (r0 != r1) goto L_0x0043
            com.ss.android.ugc.aweme.im.sdk.abtest.d r0 = r11.f86213a
            if (r0 == 0) goto L_0x012b
            com.ss.android.ugc.aweme.im.sdk.abtest.d r0 = r11.f86213a
            r0.sendMsg()
            return
        L_0x0043:
            r1 = 20
            r2 = 2132545222(0x7f1c0ec6, float:2.0743628E38)
            r3 = 2132545223(0x7f1c0ec7, float:2.074363E38)
            if (r0 != r1) goto L_0x0077
            android.content.Context r4 = r11.f86214b
            android.content.Context r0 = r11.f86214b
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r5 = r0.getString(r3)
            android.content.Context r0 = r11.f86214b
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r6 = r0.getString(r2)
            r7 = 2132545270(0x7f1c0ef6, float:2.0743725E38)
            com.ss.android.ugc.aweme.im.sdk.abtest.b$1 r8 = new com.ss.android.ugc.aweme.im.sdk.abtest.b$1
            r8.<init>()
            r9 = 2132545219(0x7f1c0ec3, float:2.0743621E38)
            com.ss.android.ugc.aweme.im.sdk.abtest.b$2 r10 = new com.ss.android.ugc.aweme.im.sdk.abtest.b$2
            r10.<init>()
            com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33219a.m76334a(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x0077:
            r1 = 21
            if (r0 != r1) goto L_0x00cd
            android.content.Context r0 = r11.f86214b
            com.bytedance.ies.e.b r0 = com.bytedance.ies.p672e.C10753b.m21793a(r0)
            java.lang.String r1 = "im_fake_bind_phone_key"
            r4 = 0
            boolean r1 = r0.mo19444a(r1, r4)
            if (r1 == 0) goto L_0x0095
            com.ss.android.ugc.aweme.im.sdk.abtest.d r0 = r11.f86213a
            if (r0 == 0) goto L_0x00cc
            com.ss.android.ugc.aweme.im.sdk.abtest.d r0 = r11.f86213a
            r0.sendMsg()
            goto L_0x012b
        L_0x0095:
            java.lang.String r1 = "im_fake_bind_phone_key"
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            com.bytedance.ies.e.b r0 = r0.mo19441a(r1, r4)
            r0.mo19443a()
            android.content.Context r4 = r11.f86214b
            android.content.Context r0 = r11.f86214b
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r5 = r0.getString(r3)
            android.content.Context r0 = r11.f86214b
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r6 = r0.getString(r2)
            r7 = 2132545270(0x7f1c0ef6, float:2.0743725E38)
            com.ss.android.ugc.aweme.im.sdk.abtest.b$3 r8 = new com.ss.android.ugc.aweme.im.sdk.abtest.b$3
            r8.<init>()
            r9 = 2132545219(0x7f1c0ec3, float:2.0743621E38)
            com.ss.android.ugc.aweme.im.sdk.abtest.b$4 r10 = new com.ss.android.ugc.aweme.im.sdk.abtest.b$4
            r10.<init>()
            com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33219a.m76334a(r4, r5, r6, r7, r8, r9, r10)
        L_0x00cc:
            return
        L_0x00cd:
            r1 = 30
            if (r0 != r1) goto L_0x00fb
            android.content.Context r4 = r11.f86214b
            android.content.Context r0 = r11.f86214b
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r5 = r0.getString(r3)
            android.content.Context r0 = r11.f86214b
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r6 = r0.getString(r2)
            r7 = 2132545270(0x7f1c0ef6, float:2.0743725E38)
            com.ss.android.ugc.aweme.im.sdk.abtest.b$5 r8 = new com.ss.android.ugc.aweme.im.sdk.abtest.b$5
            r8.<init>()
            r9 = 2132545219(0x7f1c0ec3, float:2.0743621E38)
            com.ss.android.ugc.aweme.im.sdk.abtest.b$6 r10 = new com.ss.android.ugc.aweme.im.sdk.abtest.b$6
            r10.<init>()
            com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33219a.m76334a(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x00fb:
            r1 = 40
            if (r0 != r1) goto L_0x012b
            android.content.Context r4 = r11.f86214b
            android.content.Context r0 = r11.f86214b
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r5 = r0.getString(r3)
            android.content.Context r0 = r11.f86214b
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2132545221(0x7f1c0ec5, float:2.0743626E38)
            java.lang.String r6 = r0.getString(r1)
            r7 = 2132545270(0x7f1c0ef6, float:2.0743725E38)
            com.ss.android.ugc.aweme.im.sdk.abtest.b$7 r8 = new com.ss.android.ugc.aweme.im.sdk.abtest.b$7
            r8.<init>()
            r9 = 2132545219(0x7f1c0ec3, float:2.0743621E38)
            com.ss.android.ugc.aweme.im.sdk.abtest.b$8 r10 = new com.ss.android.ugc.aweme.im.sdk.abtest.b$8
            r10.<init>()
            com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33219a.m76334a(r4, r5, r6, r7, r8, r9, r10)
        L_0x012b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33220b.sendMsg():void");
    }

    public C33220b(Context context, C33242d dVar) {
        this.f86214b = context;
        this.f86213a = dVar;
    }
}
