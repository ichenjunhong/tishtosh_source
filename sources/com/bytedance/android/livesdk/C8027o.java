package com.bytedance.android.livesdk;

import android.os.Bundle;

/* renamed from: com.bytedance.android.livesdk.o */
final /* synthetic */ class C8027o implements Runnable {

    /* renamed from: a */
    private final C6752f f21967a;

    /* renamed from: b */
    private final String f21968b;

    /* renamed from: c */
    private final Bundle f21969c;

    /* renamed from: d */
    private final String f21970d;

    /* renamed from: e */
    private final long f21971e;

    C8027o(C6752f fVar, String str, Bundle bundle, String str2, long j) {
        this.f21967a = fVar;
        this.f21968b = str;
        this.f21969c = bundle;
        this.f21970d = str2;
        this.f21971e = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        if (r7.getLong("live.intent.extra.LOAD_DURATION", 0) > 0) goto L_0x0057;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            com.bytedance.android.livesdk.f r8 = r0.f21967a
            java.lang.String r1 = r0.f21968b
            android.os.Bundle r2 = r0.f21969c
            java.lang.String r3 = r0.f21970d
            long r4 = r0.f21971e
            com.bytedance.android.livesdkapi.depend.live.j r6 = r8.mo12871c()
            if (r6 == 0) goto L_0x01b4
            r7 = 0
            r8.f18469i = r7
            com.bytedance.android.livesdk.f$b r9 = r8.f18471k
            if (r9 != 0) goto L_0x0024
            com.bytedance.android.livesdk.p399o.C8064d.m16005b()
            java.lang.String r1 = "LiveRoomFragment"
            java.lang.String r2 = "mPageChangeListener is null !"
            com.bytedance.android.livesdk.p399o.C8064d.m9721c(r1, r2)
            return
        L_0x0024:
            com.bytedance.android.livesdk.f$b r9 = r8.f18471k
            r9.f18524a = r6
            android.os.Bundle r9 = r8.getArguments()
            java.lang.String r10 = "live.intent.extra.ENTER_TYPE"
            android.os.Bundle r11 = r8.getArguments()
            r12 = 1
            r13 = 0
            r14 = 0
            if (r11 == 0) goto L_0x0056
            java.lang.String r7 = "live.intent.extra.LOAD_DURATION"
            long r17 = r11.getLong(r7, r14)
            int r7 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x0043
            goto L_0x0057
        L_0x0043:
            java.lang.String r7 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r7 = r11.getBundle(r7)
            if (r7 == 0) goto L_0x0056
            java.lang.String r11 = "live.intent.extra.LOAD_DURATION"
            long r17 = r7.getLong(r11, r14)
            int r7 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r7 <= 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r12 = 0
        L_0x0057:
            if (r12 == 0) goto L_0x005c
            java.lang.String r7 = "draw"
            goto L_0x005e
        L_0x005c:
            java.lang.String r7 = "click"
        L_0x005e:
            java.lang.String r7 = r9.getString(r10, r7)
            android.support.v4.app.Fragment r9 = r6.mo12049i()
            android.os.Bundle r9 = r9.getArguments()
            java.lang.String r10 = "live.intent.extra.ENTER_TYPE"
            r9.putString(r10, r7)
            android.support.v4.app.Fragment r9 = r6.mo12049i()
            android.os.Bundle r9 = r9.getArguments()
            java.lang.String r10 = "live.intent.extra.PAGE_DELAY_TYPE"
            r9.putString(r10, r1)
            android.support.v4.app.Fragment r1 = r6.mo12049i()
            android.os.Bundle r1 = r1.getArguments()
            java.lang.String r9 = "live.intent.extra.EXTRA_ENTER_FEED_STYLE"
            java.lang.String r10 = r8.f18479s
            r1.putString(r9, r10)
            android.os.Bundle r1 = r8.getArguments()
            java.lang.String r9 = "enter_from_merge_recommend"
            java.lang.String r10 = ""
            java.lang.String r1 = r1.getString(r9, r10)
            boolean r9 = android.text.TextUtils.isEmpty(r1)
            if (r9 == 0) goto L_0x00bb
            android.os.Bundle r9 = r8.getArguments()
            java.lang.String r10 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r9 = r9.getBundle(r10)
            if (r9 == 0) goto L_0x00bb
            android.os.Bundle r1 = r8.getArguments()
            java.lang.String r9 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r1 = r1.getBundle(r9)
            java.lang.String r9 = "enter_from_merge_recommend"
            java.lang.String r10 = ""
            java.lang.String r1 = r1.getString(r9, r10)
        L_0x00bb:
            android.os.Bundle r9 = r8.getArguments()
            java.lang.String r10 = "live.intent.extra.WARM_UP_PLAYER_TAG"
            java.lang.String r9 = r9.getString(r10)
            if (r9 == 0) goto L_0x00d4
            android.support.v4.app.Fragment r10 = r6.mo12049i()
            android.os.Bundle r10 = r10.getArguments()
            java.lang.String r11 = "live.intent.extra.WARM_UP_PLAYER_TAG"
            r10.putString(r11, r9)
        L_0x00d4:
            android.os.Bundle r9 = r8.getArguments()
            java.lang.String r10 = "live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME"
            long r9 = r9.getLong(r10, r14)
            android.os.Bundle r11 = r8.getArguments()
            java.lang.String r12 = "live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE"
            java.lang.String r14 = ""
            java.lang.String r11 = r11.getString(r12, r14)
            android.support.v4.app.Fragment r12 = r6.mo12049i()
            android.os.Bundle r12 = r12.getArguments()
            java.lang.String r14 = "live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME"
            r12.putLong(r14, r9)
            android.support.v4.app.Fragment r9 = r6.mo12049i()
            android.os.Bundle r9 = r9.getArguments()
            java.lang.String r10 = "live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE"
            r9.putString(r10, r11)
            android.support.v4.app.Fragment r9 = r6.mo12049i()
            android.os.Bundle r9 = r9.getArguments()
            java.lang.String r10 = "live.intent.extra.EXTRA_ENTER_ROOM_STAR_INNER_TIME"
            long r11 = r8.f18480t
            r9.putLong(r10, r11)
            android.support.v4.app.Fragment r9 = r6.mo12049i()
            android.os.Bundle r9 = r9.getArguments()
            java.lang.String r10 = "enter_from_merge_recommend"
            r9.putString(r10, r1)
            r6.mo12041b()
            java.lang.String r1 = ""
            if (r2 == 0) goto L_0x012d
            java.lang.String r1 = "live.intent.extra.WINDOW_MODE"
            java.lang.String r1 = r2.getString(r1)
        L_0x012d:
            java.lang.String r9 = "draw"
            boolean r9 = android.text.TextUtils.equals(r7, r9)
            if (r9 != 0) goto L_0x013c
            java.lang.String r9 = "small_picture"
            boolean r1 = android.text.TextUtils.equals(r1, r9)
            goto L_0x0147
        L_0x013c:
            android.support.v4.app.Fragment r1 = r6.mo12049i()
            android.os.Bundle r1 = r1.getArguments()
            r8.mo12865a(r3, r7, r6, r1)
        L_0x0147:
            com.bytedance.android.livesdkapi.depend.live.u r1 = r6.mo12047g()
            if (r1 == 0) goto L_0x0155
            com.bytedance.android.livesdkapi.depend.live.u r1 = r6.mo12047g()
            com.bytedance.android.livesdkapi.depend.live.u r9 = com.bytedance.android.livesdkapi.depend.live.C8671u.IDLE
            if (r1 != r9) goto L_0x0171
        L_0x0155:
            android.content.Context r1 = r8.getContext()
            r9 = 2132550565(0x7f1c23a5, float:2.0754464E38)
            android.widget.Toast r1 = android.widget.Toast.makeText(r1, r9, r13)
            com.bytedance.android.livesdk.C8441w.m16642a(r1)
            java.lang.String r1 = ""
            java.lang.String r9 = "init_state_invalid"
            r10 = 0
            r8.mo12863a(r1, r10, r9)
            com.bytedance.android.livesdkapi.depend.live.o r1 = r8.f18476p
            r1.mo12891a()
        L_0x0171:
            if (r2 == 0) goto L_0x018d
            java.lang.String r1 = "live.intent.extra.ENTER_LIVE_EXTRA_V1"
            android.os.Bundle r1 = r2.getBundle(r1)
            if (r1 == 0) goto L_0x0189
            java.lang.String r2 = "live.intent.extra.ENTER_LIVE_SOURCE_V1"
            java.lang.String r2 = r1.getString(r2, r3)
            java.lang.String r3 = "live.intent.extra.ENTER_LIVE_SOURCE_V1"
            r1.remove(r3)
            r16 = r1
            goto L_0x0190
        L_0x0189:
            r16 = r1
            r2 = r3
            goto L_0x0190
        L_0x018d:
            r2 = r3
            r16 = 0
        L_0x0190:
            com.bytedance.android.livesdk.o.c r1 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.Class<com.bytedance.android.livesdk.o.c.j> r3 = com.bytedance.android.livesdk.p399o.p402c.C8059j.class
            com.bytedance.android.livesdk.o.b.g r1 = r1.mo14201a(r3)
            if (r1 == 0) goto L_0x01a1
            java.lang.String r3 = "action_type"
            r1.mo14194a(r3, r7)
        L_0x01a1:
            android.support.v4.app.Fragment r1 = r6.mo12049i()
            android.os.Bundle r6 = r1.getArguments()
            r1 = r8
            r3 = r4
            r5 = r7
            r7 = r16
            r1.mo12864a(r2, r3, r5, r6, r7)
            r8.mo12877h()
        L_0x01b4:
            boolean r1 = r8.f18468h
            if (r1 != 0) goto L_0x01bb
            r8.mo12876g()
        L_0x01bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.C8027o.run():void");
    }
}
