package com.bytedance.android.live.broadcast;

/* renamed from: com.bytedance.android.live.broadcast.j */
final /* synthetic */ class C3448j implements Runnable {

    /* renamed from: a */
    private final C3134c f9864a;

    C3448j(C3134c cVar) {
        this.f9864a = cVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x011e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.bytedance.android.live.broadcast.c r0 = r8.f9864a
            boolean r1 = r0.mo8452l()
            if (r1 == 0) goto L_0x0138
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r0.f9131e
            if (r1 == 0) goto L_0x0018
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r0.f9131e
            java.lang.String r2 = "cmd_dismiss_dialog_end"
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r1.lambda$put$1$DataCenter(r2, r3)
        L_0x0018:
            r0.mo8472a()
            com.bytedance.android.live.room.f r1 = r0.f9139m
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0078
            java.lang.String r1 = "LiveBroadcastFragment"
            java.lang.String r4 = "room close new LiveBroadcastEndFragment"
            com.bytedance.android.live.core.p224c.C3831a.m9707a(r1, r4)
            java.lang.Class<com.bytedance.android.live.room.ILiveSDKService> r1 = com.bytedance.android.live.room.ILiveSDKService.class
            com.bytedance.android.live.base.b r1 = com.bytedance.android.live.p245d.C4116c.m10249a(r1)
            com.bytedance.android.live.room.ILiveSDKService r1 = (com.bytedance.android.live.room.ILiveSDKService) r1
            com.bytedance.android.live.core.setting.p<java.lang.Boolean> r4 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_ENABLE_USE_NEW_BROADCAST_END
            java.lang.Object r4 = r4.mo9431a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x004a
            com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r0.f9129c
            java.lang.String r4 = r4.finish_url
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x004a
            r4 = 1
            goto L_0x004b
        L_0x004a:
            r4 = 0
        L_0x004b:
            com.bytedance.android.live.room.f r1 = r1.createLiveBroadcastEndFragment(r4)
            r0.f9139m = r1
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r4 = "live_end_banned_url"
            java.lang.String r5 = r0.f9140n
            r1.putString(r4, r5)
            java.lang.String r4 = "live_end_banned_title"
            java.lang.CharSequence r5 = r0.f9141o
            r1.putCharSequence(r4, r5)
            java.lang.String r4 = "live_end_banned_reason"
            java.lang.CharSequence r5 = r0.f9142p
            r1.putCharSequence(r4, r5)
            java.lang.String r4 = "live_end_banned_content"
            java.lang.CharSequence r5 = r0.f9143q
            r1.putCharSequence(r4, r5)
            com.bytedance.android.live.room.f r4 = r0.f9139m
            r4.setArguments(r1)
            goto L_0x009c
        L_0x0078:
            com.bytedance.android.live.room.f r1 = r0.f9139m
            android.os.Bundle r1 = r1.getArguments()
            if (r1 == 0) goto L_0x009c
            java.lang.String r4 = "live_end_banned_url"
            java.lang.String r5 = r0.f9140n
            r1.putString(r4, r5)
            java.lang.String r4 = "live_end_banned_title"
            java.lang.CharSequence r5 = r0.f9141o
            r1.putCharSequence(r4, r5)
            java.lang.String r4 = "live_end_banned_reason"
            java.lang.CharSequence r5 = r0.f9142p
            r1.putCharSequence(r4, r5)
            java.lang.String r4 = "live_end_banned_content"
            java.lang.CharSequence r5 = r0.f9143q
            r1.putCharSequence(r4, r5)
        L_0x009c:
            com.bytedance.android.live.room.f r1 = r0.f9139m
            r1.mo9602a(r0)
            com.bytedance.android.live.room.f r1 = r0.f9139m
            android.support.v4.app.FragmentActivity r4 = r0.getActivity()
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r0.f9129c
            com.bytedance.android.live.broadcast.h r6 = new com.bytedance.android.live.broadcast.h
            r6.<init>(r0)
            java.lang.String r7 = ""
            r1.mo9601a(r4, r5, r6, r7)
            android.support.v4.app.FragmentActivity r1 = r0.getActivity()
            android.support.v4.app.k r1 = r1.getSupportFragmentManager()
            android.view.View r4 = r0.getView()
            r5 = 2132018826(0x7f14068a, float:1.967597E38)
            android.view.View r4 = r4.findViewById(r5)
            r4.setVisibility(r3)
            android.support.v4.app.Fragment r4 = r1.mo2222a(r5)
            if (r4 != 0) goto L_0x0138
            boolean r4 = r0.f9127a
            if (r4 == 0) goto L_0x0138
            r0.f9127a = r3
            java.lang.Class r3 = r1.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
            java.lang.String r4 = "mAdded"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
            r3.setAccessible(r2)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
            java.lang.Object r2 = r3.get(r1)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
            if (r2 == 0) goto L_0x011e
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
        L_0x00ee:
            boolean r3 = r2.hasNext()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
            if (r3 == 0) goto L_0x011e
            java.lang.Object r3 = r2.next()     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
            android.support.v4.app.Fragment r3 = (android.support.p030v4.app.Fragment) r3     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
            boolean r3 = r3 instanceof com.bytedance.android.live.room.C4187f     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
            if (r3 == 0) goto L_0x00ee
            java.lang.String r2 = "LiveBroadcastFragment"
            java.lang.String r3 = "multiple LiveBroadcastEndFragment found."
            com.bytedance.android.live.core.p224c.C3831a.m9716d(r2, r3)     // Catch:{ IllegalAccessException | NoSuchFieldException -> 0x011e, Exception -> 0x0106 }
            return
        L_0x0106:
            r2 = move-exception
            java.lang.String r3 = "LiveBroadcastFragment"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "showLiveEndDialog:"
            r4.<init>(r6)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.bytedance.android.live.core.p224c.C3831a.m9716d(r3, r2)
        L_0x011e:
            android.support.v4.app.r r1 = r1.mo2225a()     // Catch:{ Throwable -> 0x012e }
            com.bytedance.android.live.room.f r0 = r0.f9139m     // Catch:{ Throwable -> 0x012e }
            android.support.v4.app.Fragment r0 = (android.support.p030v4.app.Fragment) r0     // Catch:{ Throwable -> 0x012e }
            android.support.v4.app.r r0 = r1.mo2175a(r5, r0)     // Catch:{ Throwable -> 0x012e }
            r0.mo2200e()     // Catch:{ Throwable -> 0x012e }
            return
        L_0x012e:
            r0 = move-exception
            java.lang.String r1 = "LiveBroadcastFragmentadd LiveBroadcastEndFragment"
            java.lang.String r0 = r0.toString()
            com.bytedance.android.live.core.p224c.C3831a.m9716d(r1, r0)
        L_0x0138:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.C3448j.run():void");
    }
}
