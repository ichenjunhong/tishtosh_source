package com.p683ss.android.ugc.aweme.choosemusic.fragment;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.fragment.y */
public final class C24952y {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0060 A[SYNTHETIC, Splitter:B:16:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.p030v4.app.Fragment m60688a(android.content.Intent r8) {
        /*
            if (r8 == 0) goto L_0x00a4
            java.lang.String r0 = "cid"
            java.lang.String r0 = r8.getStringExtra(r0)
            java.lang.String r1 = "name"
            java.lang.String r1 = r8.getStringExtra(r1)
            java.lang.String r2 = "is_hot"
            java.lang.String r2 = r8.getStringExtra(r2)
            java.lang.String r3 = "music_category_is_hot"
            r4 = 0
            boolean r3 = r8.getBooleanExtra(r3, r4)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 != 0) goto L_0x002a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x002a }
            boolean r2 = r2.booleanValue()     // Catch:{ Exception -> 0x002a }
            goto L_0x002b
        L_0x002a:
            r2 = r3
        L_0x002b:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = "music_class_id"
            java.lang.String r3 = r8.getStringExtra(r3)
            goto L_0x0039
        L_0x0038:
            r3 = r0
        L_0x0039:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x0045
            java.lang.String r1 = "music_class_name"
            java.lang.String r1 = r8.getStringExtra(r1)
        L_0x0045:
            java.lang.String r4 = "change_music_page_detail"
            java.lang.String r5 = "music_class_enter_method"
            java.lang.String r5 = r8.getStringExtra(r5)
            java.lang.String r6 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            r7 = 1
            int r6 = r8.getIntExtra(r6, r7)
            java.lang.String r7 = "musicType"
            java.lang.String r8 = r8.getStringExtra(r7)
            boolean r7 = android.text.TextUtils.isEmpty(r8)
            if (r7 != 0) goto L_0x006a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0069 }
            int r6 = r8.intValue()     // Catch:{ Exception -> 0x0069 }
            goto L_0x006a
        L_0x0069:
            r6 = 2
        L_0x006a:
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L_0x0072
            java.lang.String r5 = "click_banner"
        L_0x0072:
            boolean r8 = android.text.TextUtils.isEmpty(r3)
            if (r8 != 0) goto L_0x00a4
            com.ss.android.ugc.aweme.choosemusic.fragment.v r8 = new com.ss.android.ugc.aweme.choosemusic.fragment.v
            r8.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r7 = "music_class_id"
            r0.putString(r7, r3)
            java.lang.String r3 = "music_class_name"
            r0.putString(r3, r1)
            java.lang.String r1 = "music_class_enter_from"
            r0.putString(r1, r4)
            java.lang.String r1 = "music_class_is_hot"
            r0.putBoolean(r1, r2)
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_MUSIC_TYPE"
            r0.putInt(r1, r6)
            java.lang.String r1 = "music_class_enter_method"
            r0.putString(r1, r5)
            r8.setArguments(r0)
            return r8
        L_0x00a4:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.choosemusic.fragment.C24952y.m60688a(android.content.Intent):android.support.v4.app.Fragment");
    }
}
