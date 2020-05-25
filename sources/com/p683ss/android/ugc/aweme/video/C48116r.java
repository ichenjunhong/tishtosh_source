package com.p683ss.android.ugc.aweme.video;

import com.p683ss.android.ugc.playerkit.videoview.p2498d.C50143a;

/* renamed from: com.ss.android.ugc.aweme.video.r */
public final /* synthetic */ class C48116r implements C50143a {

    /* renamed from: a */
    public static final C50143a f120924a = new C48116r();

    private C48116r() {
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [com.ss.android.ugc.d.a.a.a.a.c] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object[], com.ss.android.ugc.aweme.feed.model.BitRate[]] */
    /* JADX WARNING: type inference failed for: r4v6, types: [com.ss.android.ugc.d.a.a.a.a.c] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r2v13 */
    /* JADX WARNING: type inference failed for: r16v1, types: [com.ss.android.ugc.aweme.feed.model.BitRate] */
    /* JADX WARNING: type inference failed for: r21v0 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: type inference failed for: r21v1 */
    /* JADX WARNING: type inference failed for: r21v2 */
    /* JADX WARNING: type inference failed for: r21v3 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r2v18 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: type inference failed for: r21v4 */
    /* JADX WARNING: type inference failed for: r21v5 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v8
      assigns: []
      uses: []
      mth insns count: 204
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0201  */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c mo95438a(com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel r26) {
        /*
            r25 = this;
            r0 = r26
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.ss.android.ugc.aweme.commercialize.splash.k r2 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62918i()
            java.lang.String r3 = r26.getSourceId()
            java.lang.String r2 = r2.mo53856a(r3)
            if (r2 == 0) goto L_0x0015
            return r1
        L_0x0015:
            com.ss.android.ugc.aweme.commercialize.splash.livesplash.a r2 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62919j()
            java.lang.String r3 = r26.getSourceId()
            java.lang.String r2 = r2.mo53881a(r3)
            if (r2 == 0) goto L_0x0024
            return r1
        L_0x0024:
            java.util.List r2 = r26.getBitRate()
            if (r2 == 0) goto L_0x0220
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0032
            goto L_0x0220
        L_0x0032:
            android.content.Context r3 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            com.ss.android.ugc.aweme.video.VideoBitRateABManager r4 = com.p683ss.android.ugc.aweme.video.VideoBitRateABManager.m103801c()
            boolean r4 = r4.mo95132d()
            if (r4 == 0) goto L_0x0215
            com.ss.android.ugc.playerkit.videoview.c.a r4 = com.p683ss.android.ugc.playerkit.videoview.p2497c.C50141a.m108193a()
            java.lang.String r5 = r26.getUrlKey()
            com.ss.android.ugc.playerkit.videoview.b.b r6 = r4.f125653b
            com.ss.android.ugc.playerkit.session.b r4 = r4.mo97944c(r5)
            com.ss.android.ugc.d.a.a.a.b.e r4 = r6.mo95135a(r4)
            if (r4 != 0) goto L_0x0055
            return r1
        L_0x0055:
            com.ss.android.ugc.f.e r5 = com.p683ss.android.ugc.p2454f.C48918e.m105713a()
            double r5 = r5.mo96744b()
            int r5 = (int) r5
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.RecordLastNetworkSpeedExperiment> r7 = com.p683ss.android.ugc.aweme.video.experiment.RecordLastNetworkSpeedExperiment.class
            r8 = 1
            java.lang.String r9 = "is_record_last_network_speed_enabled"
            r10 = 31744(0x7c00, float:4.4483E-41)
            r11 = 1
            boolean r6 = r6.mo18172a(r7, r8, r9, r10, r11)
            r7 = 0
            if (r6 == 0) goto L_0x009a
            double r9 = (double) r5
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x0098
            int r5 = com.p683ss.android.ugc.aweme.video.bitrate.C47997a.f120634a
            if (r5 <= 0) goto L_0x007e
            int r5 = com.p683ss.android.ugc.aweme.video.bitrate.C47997a.f120634a
            goto L_0x0090
        L_0x007e:
            com.ss.android.ugc.aweme.app.SharePrefCache r5 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r5 = r5.getLastUsableNetworkSpeed()
            java.lang.Object r5 = r5.mo47782d()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L_0x0090:
            com.ss.android.ugc.f.e r6 = com.p683ss.android.ugc.p2454f.C48918e.m105713a()
            double r9 = (double) r5
            r6.f123072a = r9
            goto L_0x009a
        L_0x0098:
            com.p683ss.android.ugc.aweme.video.bitrate.C47997a.f120634a = r5
        L_0x009a:
            double r9 = (double) r5
            java.util.Map r3 = com.p683ss.android.ugc.aweme.video.bitrate.C47997a.m103836a(r3, r0, r9, r4)
            com.ss.android.ugc.d.a.a.a.a.f r3 = r4.mo96025a(r2, r3)
            if (r3 != 0) goto L_0x00a6
            return r1
        L_0x00a6:
            com.p683ss.android.ugc.aweme.video.bitrate.C47997a.m103837a(r3, r0)
            com.ss.android.ugc.d.a.a.a.a.c r4 = r3.f121968a
            if (r4 == 0) goto L_0x0216
            r6 = 0
            com.ss.android.ugc.aweme.feed.model.BitRate[] r11 = new com.p683ss.android.ugc.aweme.feed.model.BitRate[r6]
            java.lang.Object[] r2 = r2.toArray(r11)
            com.ss.android.ugc.aweme.feed.model.BitRate[] r2 = (com.p683ss.android.ugc.aweme.feed.model.BitRate[]) r2
            java.util.Comparator r11 = com.p683ss.android.ugc.aweme.video.bitrate.C47998b.f120637a
            java.util.Arrays.sort(r2, r11)
            com.ss.android.ugc.aweme.video.preload.j r11 = com.p683ss.android.ugc.aweme.video.preload.C48107j.m104193f()
            com.ss.android.ugc.aweme.video.preload.c r11 = r11.mo95409h()
            if (r11 == 0) goto L_0x01ac
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.BitrateSwitchThresholdExperiment> r13 = com.p683ss.android.ugc.aweme.video.experiment.BitrateSwitchThresholdExperiment.class
            r14 = 1
            java.lang.String r15 = "bitrate_switch_threshold"
            r16 = 31744(0x7c00, float:4.4483E-41)
            r17 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            double r12 = r12.mo18166a(r13, r14, r15, r16, r17)
            int r14 = r2.length
            r15 = 0
        L_0x00d8:
            if (r15 >= r14) goto L_0x01ac
            r16 = r2[r15]
            int r6 = r16.getBitRate()
            int r1 = r4.getBitRate()
            if (r6 == r1) goto L_0x0194
            java.lang.String r1 = r16.getUrlKey()
            long r7 = r11.mo95340a(r1)
            r17 = 0
            int r1 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x0189
            java.lang.String r1 = r16.getUrlKey()
            r21 = r2
            long r1 = r11.mo95347b(r1)
            r22 = r14
            r23 = r15
            long r14 = r1 - r7
            double r14 = (double) r14
            if (r5 <= 0) goto L_0x013f
            int r6 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r6 <= 0) goto L_0x013f
            double r17 = r26.getDuration()
            r19 = 0
            int r6 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r6 <= 0) goto L_0x013c
            java.lang.Double.isNaN(r14)
            java.lang.Double.isNaN(r9)
            double r14 = r14 / r9
            r24 = r5
            double r5 = (double) r7
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r12
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r5 = r5 / r1
            double r1 = r26.getDuration()
            r17 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r17
            double r5 = r5 * r1
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0143
            r6 = 1
            goto L_0x0144
        L_0x013c:
            r24 = r5
            goto L_0x0143
        L_0x013f:
            r24 = r5
            r19 = 0
        L_0x0143:
            r6 = 0
        L_0x0144:
            int r1 = r16.getBitRate()
            int r2 = r4.getBitRate()
            if (r1 <= r2) goto L_0x0171
            java.lang.String r1 = r16.getUrlKey()
            long r1 = r11.mo95347b(r1)
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x015c
            if (r6 == 0) goto L_0x019e
        L_0x015c:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Float> r1 = com.p683ss.android.ugc.aweme.video.bitrate.C47997a.f120635b
            java.lang.String r2 = r16.getUrlKey()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0186
            int r5 = r1.intValue()
        L_0x016e:
            r4 = r16
            goto L_0x01b0
        L_0x0171:
            if (r6 == 0) goto L_0x019e
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Float> r1 = com.p683ss.android.ugc.aweme.video.bitrate.C47997a.f120635b
            java.lang.String r2 = r16.getUrlKey()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0186
            int r5 = r1.intValue()
            goto L_0x016e
        L_0x0186:
            r4 = r16
            goto L_0x01ae
        L_0x0189:
            r21 = r2
            r24 = r5
            r22 = r14
            r23 = r15
            r19 = 0
            goto L_0x019e
        L_0x0194:
            r21 = r2
            r24 = r5
            r19 = r7
            r22 = r14
            r23 = r15
        L_0x019e:
            int r15 = r23 + 1
            r7 = r19
            r2 = r21
            r14 = r22
            r5 = r24
            r1 = 0
            r6 = 0
            goto L_0x00d8
        L_0x01ac:
            r24 = r5
        L_0x01ae:
            r5 = r24
        L_0x01b0:
            java.lang.String r1 = r4.getUrlKey()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01ee
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r1 = com.p683ss.android.ugc.aweme.video.bitrate.C47997a.f120636c
            int r1 = r1.size()
            r2 = 50
            if (r1 <= r2) goto L_0x01d7
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r1 = com.p683ss.android.ugc.aweme.video.bitrate.C47997a.f120636c
            java.lang.Object r1 = r1.poll()
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x01d7
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Float> r2 = com.p683ss.android.ugc.aweme.video.bitrate.C47997a.f120635b
            r2.remove(r1)
        L_0x01d7:
            java.util.concurrent.ConcurrentLinkedQueue<java.lang.String> r1 = com.p683ss.android.ugc.aweme.video.bitrate.C47997a.f120636c
            java.lang.String r2 = r4.getUrlKey()
            r1.add(r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Float> r1 = com.p683ss.android.ugc.aweme.video.bitrate.C47997a.f120635b
            java.lang.String r2 = r4.getUrlKey()
            float r6 = (float) r5
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r1.put(r2, r6)
        L_0x01ee:
            r3.f121968a = r4
            r0.setHitBitrate(r3)
            com.ss.android.ugc.playerkit.session.a r1 = com.p683ss.android.ugc.playerkit.session.C50122a.m108112a()
            java.lang.String r2 = r26.getUri()
            com.ss.android.ugc.playerkit.session.Session r1 = r1.mo97901b(r2)
            if (r1 == 0) goto L_0x0216
            java.lang.String r0 = r26.getSourceId()
            r1.sourceId = r0
            float r0 = (float) r5
            r1.speed = r0
            int r0 = r4.getBitRate()
            r1.bitrate = r0
            double r4 = r3.f121971d
            r1.calcBitrate = r4
            goto L_0x0216
        L_0x0215:
            r3 = 0
        L_0x0216:
            if (r3 == 0) goto L_0x021e
            com.ss.android.ugc.d.a.a.a.a.c r0 = r3.f121968a
            if (r0 != 0) goto L_0x021d
            goto L_0x021e
        L_0x021d:
            return r3
        L_0x021e:
            r0 = 0
            return r0
        L_0x0220:
            r0 = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.video.C48116r.mo95438a(com.ss.android.ugc.aweme.feed.model.VideoUrlModel):com.ss.android.ugc.d.a.a.a.a.c");
    }
}
