package com.p683ss.android.ugc.aweme.profile.p2090ui;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bd */
final /* synthetic */ class C40253bd implements C1710e {

    /* renamed from: a */
    private final I18nBaseUserProfileFragment f102793a;

    /* renamed from: b */
    private final String f102794b;

    C40253bd(I18nBaseUserProfileFragment i18nBaseUserProfileFragment, String str) {
        this.f102793a = i18nBaseUserProfileFragment;
        this.f102794b = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r9) {
        /*
            r8 = this;
            com.ss.android.ugc.aweme.profile.ui.I18nBaseUserProfileFragment r0 = r8.f102793a
            java.lang.String r1 = r8.f102794b
            java.util.Map r9 = (java.util.Map) r9
            if (r9 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.f103081w
            if (r2 != 0) goto L_0x000d
            goto L_0x006f
        L_0x000d:
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.f103081w
            long r2 = r2.roomId
            r4 = 0
            long r6 = java.lang.Long.parseLong(r1)     // Catch:{ Throwable -> 0x0028 }
            java.lang.Long r1 = java.lang.Long.valueOf(r6)     // Catch:{ Throwable -> 0x0028 }
            if (r1 == 0) goto L_0x0028
            java.lang.Object r9 = r9.get(r1)     // Catch:{ Throwable -> 0x0028 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ Throwable -> 0x0028 }
            long r6 = r9.longValue()     // Catch:{ Throwable -> 0x0028 }
            goto L_0x0029
        L_0x0028:
            r6 = r4
        L_0x0029:
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 != 0) goto L_0x0032
            com.ss.android.ugc.aweme.profile.model.User r9 = r0.f103081w
            r9.roomId = r4
            goto L_0x0036
        L_0x0032:
            com.ss.android.ugc.aweme.profile.model.User r9 = r0.f103081w
            r9.roomId = r6
        L_0x0036:
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.profile.model.User r9 = r0.f103081w
            r0.mo81900c(r9)
            com.ss.android.ugc.aweme.profile.presenter.ae r9 = r0.f102204aj
            if (r9 == 0) goto L_0x004a
            com.ss.android.ugc.aweme.profile.presenter.ae r9 = r0.f102204aj
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.f103081w
            r9.mo81911a(r1)
        L_0x004a:
            com.bytedance.android.live.base.event.RoomStatusEvent r9 = new com.bytedance.android.live.base.event.RoomStatusEvent
            r9.<init>()
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.f103081w
            java.lang.String r1 = r1.getUid()
            long r1 = java.lang.Long.parseLong(r1)
            r9.f8661b = r1
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.f103081w
            long r1 = r1.roomId
            r9.f8660a = r1
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.f103081w
            boolean r0 = r0.isLive()
            r0 = r0 ^ 1
            r9.f8662c = r0
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r9)
            return
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.C40253bd.accept(java.lang.Object):void");
    }
}
