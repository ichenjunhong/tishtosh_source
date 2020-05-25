package com.p683ss.android.ugc.aweme.feed;

/* renamed from: com.ss.android.ugc.aweme.feed.af */
public final class C30129af {

    /* renamed from: a */
    public static final C30129af f78649a = new C30129af();

    private C30129af() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006e, code lost:
        if (com.p683ss.android.ugc.aweme.audio.AudioUtils.f62279a.isBluetoothA2dpOn() == false) goto L_0x0055;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer m70699a(android.content.Context r8) {
        /*
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            com.bytedance.ies.abmock.n r0 = com.bytedance.ies.abmock.C10193n.m20607a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.ReportSoundOutputDeviceSetting> r1 = com.p683ss.android.ugc.aweme.feed.ReportSoundOutputDeviceSetting.class
            java.lang.String r2 = "enable_report_sound_output_device"
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C10181b.m20511a()
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r3 = r3.mo18175c()
            java.lang.Boolean r3 = r3.getEnableReportSoundOutputDevice()
            r4 = 0
            boolean r0 = r0.mo18204a(r1, r2, r3, r4)
            if (r0 == 0) goto L_0x0076
            boolean r8 = com.p683ss.android.ugc.aweme.audio.AudioUtils.m57299d(r8)
            r0 = 1
            r1 = 2
            r2 = 3
            if (r8 == 0) goto L_0x002b
        L_0x0029:
            r0 = 3
            goto L_0x0071
        L_0x002b:
            int r8 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            if (r8 < r3) goto L_0x0057
            android.media.AudioManager r8 = com.p683ss.android.ugc.aweme.audio.AudioUtils.f62279a
            android.media.AudioDeviceInfo[] r8 = r8.getDevices(r1)
            if (r8 != 0) goto L_0x003a
            goto L_0x0029
        L_0x003a:
            int r3 = r8.length
            r5 = 0
        L_0x003c:
            if (r5 >= r3) goto L_0x0055
            r6 = r8[r5]
            int r6 = r6.getType()
            if (r6 == r2) goto L_0x0071
            r7 = 4
            if (r6 != r7) goto L_0x004a
            goto L_0x0071
        L_0x004a:
            r7 = 7
            if (r6 == r7) goto L_0x0070
            r7 = 8
            if (r6 != r7) goto L_0x0052
            goto L_0x0070
        L_0x0052:
            int r5 = r5 + 1
            goto L_0x003c
        L_0x0055:
            r0 = 0
            goto L_0x0071
        L_0x0057:
            android.media.AudioManager r8 = com.p683ss.android.ugc.aweme.audio.AudioUtils.f62279a
            boolean r8 = r8.isWiredHeadsetOn()
            if (r8 == 0) goto L_0x0060
            goto L_0x0071
        L_0x0060:
            android.media.AudioManager r8 = com.p683ss.android.ugc.aweme.audio.AudioUtils.f62279a
            boolean r8 = r8.isBluetoothScoOn()
            if (r8 != 0) goto L_0x0070
            android.media.AudioManager r8 = com.p683ss.android.ugc.aweme.audio.AudioUtils.f62279a
            boolean r8 = r8.isBluetoothA2dpOn()
            if (r8 == 0) goto L_0x0055
        L_0x0070:
            r0 = 2
        L_0x0071:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            return r8
        L_0x0076:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.C30129af.m70699a(android.content.Context):java.lang.Integer");
    }
}
