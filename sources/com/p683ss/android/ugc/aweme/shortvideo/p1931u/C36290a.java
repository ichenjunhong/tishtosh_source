package com.p683ss.android.ugc.aweme.shortvideo.p1931u;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.XSConfig;
import java.util.Set;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.u.a */
public final class C36290a {

    /* renamed from: a */
    public static final C36290a f92886a = new C36290a();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static boolean f92887b;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.u.a$a */
    public static final class C36291a implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ boolean f92888a;

        /* renamed from: b */
        final /* synthetic */ Activity f92889b;

        /* renamed from: c */
        final /* synthetic */ Builder f92890c;

        /* renamed from: d */
        final /* synthetic */ Uri f92891d;

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            if (!this.f92888a || !C36290a.f92887b) {
                asyncAVService.uiService().recordService().startRecord((Context) this.f92889b, this.f92890c.build());
            } else {
                asyncAVService.uiService().recordService().startRecord(this.f92889b, this.f92890c.build(), this.f92891d);
            }
        }

        public C36291a(boolean z, Activity activity, Builder builder, Uri uri) {
            this.f92888a = z;
            this.f92889b = activity;
            this.f92890c = builder;
            this.f92891d = uri;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.u.a$b */
    public static final class C36292b implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ boolean f92892a;

        /* renamed from: b */
        final /* synthetic */ Activity f92893b;

        /* renamed from: c */
        final /* synthetic */ Builder f92894c;

        /* renamed from: d */
        final /* synthetic */ Uri f92895d;

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            if (!this.f92892a || !C36290a.f92887b) {
                asyncAVService.uiService().recordService().startRecord((Context) this.f92893b, this.f92894c.build());
            } else {
                asyncAVService.uiService().recordService().startRecord(this.f92893b, this.f92894c.build(), this.f92895d);
            }
        }

        public C36292b(boolean z, Activity activity, Builder builder, Uri uri) {
            this.f92892a = z;
            this.f92893b = activity;
            this.f92894c = builder;
            this.f92895d = uri;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.u.a$c */
    public static final class C36293c implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ Activity f92896a;

        /* renamed from: b */
        final /* synthetic */ Builder f92897b;

        public C36293c(Activity activity, Builder builder) {
            this.f92896a = activity;
            this.f92897b = builder;
        }

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            asyncAVService.uiService().recordService().startRecord((Context) this.f92896a, this.f92897b.build());
        }
    }

    private C36290a() {
    }

    static {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean enableParamsOverrideDeeplinkhandleractivity = b.getEnableParamsOverrideDeeplinkhandleractivity();
            if (enableParamsOverrideDeeplinkhandleractivity == null) {
                C52711k.m112234a();
            }
            f92887b = enableParamsOverrideDeeplinkhandleractivity.booleanValue();
        } catch (C10174a unused) {
        }
    }

    /* renamed from: a */
    private static void m81931a(Uri uri, Builder builder) {
        String str = "retarget";
        if (TextUtils.equals(str, uri.getQueryParameter("gd_label"))) {
            C26890h.m65011a("shoot", C23089d.m56640a().mo47829a("shoot_way", str).f61491a);
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
            for (String str2 : queryParameterNames) {
                String queryParameter = uri.getQueryParameter(str2);
                if (str2 != null) {
                    int hashCode = str2.hashCode();
                    if (hashCode != -1195408547) {
                        if (hashCode != -818786127) {
                            if (hashCode == -719156057 && str2.equals("filter_business")) {
                                builder.filterBuinessSticker(queryParameter);
                            }
                        } else if (str2.equals("enter_from")) {
                            builder.enterFrom(queryParameter);
                        }
                    } else if (str2.equals("sticker_id")) {
                        builder.sticker(queryParameter).usePresetSticker(Boolean.valueOf(true));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m81932a(Uri uri, Builder builder, Boolean bool) {
        C52711k.m112240b(uri, "uri");
        C52711k.m112240b(builder, "builder");
        String queryParameter = uri.getQueryParameter("tab");
        String queryParameter2 = uri.getQueryParameter("xs_enter_from");
        String queryParameter3 = uri.getQueryParameter("city");
        if (!(!C52711k.m112239a((Object) queryParameter, (Object) "xs"))) {
            Builder defaultTab = builder.defaultTab(3);
            XSConfig xSConfig = new XSConfig();
            xSConfig.setEnterFrom(queryParameter2);
            xSConfig.setFromClick(bool);
            xSConfig.setCity(queryParameter3);
            defaultTab.XSConfig(xSConfig);
        }
    }

    /* renamed from: a */
    public final void mo75122a(Activity activity, Builder builder, Uri uri) {
        boolean z;
        String queryParameter = uri.getQueryParameter("from");
        CharSequence charSequence = queryParameter;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            queryParameter = "schema";
        }
        if (!TextUtils.isEmpty(uri.getQueryParameter("enter_from"))) {
            queryParameter = uri.getQueryParameter("enter_from");
        }
        builder.shootWay(queryParameter);
        String host = uri.getHost();
        if (host != null) {
            int hashCode = host.hashCode();
            if (hashCode != -891901482) {
                if (hashCode == 305667899 && host.equals("openRecord")) {
                    m81930a(activity, uri, builder);
                }
            } else if (host.equals("studio")) {
                m81931a(uri, builder);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0243  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0248  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x006e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m81930a(android.app.Activity r17, android.net.Uri r18, com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig.Builder r19) {
        /*
            r16 = this;
            r1 = r18
            r2 = r19
            java.lang.String r0 = r18.getPath()
            java.lang.String r3 = "recordParam"
            java.lang.String r3 = r1.getQueryParameter(r3)
            java.lang.String r4 = "recordOrigin"
            java.lang.String r4 = r1.getQueryParameter(r4)
            java.lang.String r5 = "uid"
            java.lang.String r5 = r1.getQueryParameter(r5)
            java.lang.String r6 = "nickname"
            java.lang.String r6 = r1.getQueryParameter(r6)
            java.lang.String r7 = "sticker_pannel_show"
            r8 = 0
            boolean r7 = r1.getBooleanQueryParameter(r7, r8)
            java.lang.String r9 = "tab"
            java.lang.String r9 = r1.getQueryParameter(r9)
            r10 = r0
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            r11 = 0
            if (r10 != 0) goto L_0x004a
            java.lang.String r10 = "path"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r10)
            java.lang.String r10 = "/detail/"
            r12 = 2
            boolean r0 = p2628d.p2650m.C52830p.m112411b(r0, r10, r8, r12, r11)
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = r18.getLastPathSegment()
            goto L_0x0050
        L_0x004a:
            java.lang.String r0 = "id"
            java.lang.String r0 = r1.getQueryParameter(r0)
        L_0x0050:
            java.lang.String r8 = "mv_id"
            java.lang.String r8 = r1.getQueryParameter(r8)
            java.lang.String r10 = "effect_meta_info"
            java.lang.String r10 = r1.getQueryParameter(r10)
            java.lang.String r12 = "effect_image"
            java.lang.String r12 = r1.getQueryParameter(r12)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r7 = r2.showStickerPanel(r7)
            r7.mvStickerId(r8)
            r7 = 1
            if (r4 != 0) goto L_0x006e
            goto L_0x00f9
        L_0x006e:
            int r8 = r4.hashCode()
            r13 = -887328209(0xffffffffcb1c722f, float:-1.0252847E7)
            if (r8 == r13) goto L_0x00bb
            r13 = 1036042802(0x3dc0c232, float:0.0941204)
            if (r8 == r13) goto L_0x007e
            goto L_0x00f9
        L_0x007e:
            java.lang.String r8 = "jsBridge"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00f9
            java.lang.String r4 = "from"
            java.lang.String r4 = r1.getQueryParameter(r4)
            java.lang.String r8 = "dou_plus"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r4, r8)
            if (r4 == 0) goto L_0x00f9
            java.lang.String r4 = "dou_plus"
            java.util.UUID r8 = java.util.UUID.randomUUID()
            java.lang.String r8 = r8.toString()
            java.lang.String r13 = "UUID.randomUUID().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r13)
            java.lang.String r13 = "shoot"
            com.ss.android.ugc.aweme.app.f.d r14 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r15 = "shoot_way"
            com.ss.android.ugc.aweme.app.f.d r4 = r14.mo47829a(r15, r4)
            java.lang.String r14 = "creation_id"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r14, r8)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r13, r4)
            goto L_0x00f9
        L_0x00bb:
            java.lang.String r8 = "system"
            boolean r4 = r4.equals(r8)
            if (r4 == 0) goto L_0x00f9
            java.lang.String r4 = "other_platform_camera"
            r2.shootWay(r4)
            com.ss.android.ugc.aweme.services.IExternalService r4 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r4 = (com.p683ss.android.ugc.aweme.services.IExternalService) r4
            com.ss.android.ugc.aweme.services.external.IConfigService r8 = r4.configService()
            com.ss.android.ugc.aweme.services.IShortVideoConfig r8 = r8.shortVideoConfig()
            boolean r8 = r8.isRecording()
            if (r8 != 0) goto L_0x00f2
            com.ss.android.ugc.aweme.services.video.IAVPublishService r4 = r4.publishService()
            r8 = r17
            android.content.Context r8 = (android.content.Context) r8
            boolean r4 = r4.inPublishPage(r8)
            if (r4 == 0) goto L_0x00eb
            goto L_0x00f2
        L_0x00eb:
            com.ss.android.ugc.aweme.app.AwemeAppData r4 = com.p683ss.android.ugc.aweme.app.AwemeAppData.m47851a()
            r4.f61131i = r7
            goto L_0x00f9
        L_0x00f2:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
            r2.fromSystem(r4)
        L_0x00f9:
            if (r3 != 0) goto L_0x00fd
            goto L_0x022f
        L_0x00fd:
            int r4 = r3.hashCode()
            switch(r4) {
                case -2090378579: goto L_0x021f;
                case -1890252483: goto L_0x01e7;
                case 104263205: goto L_0x01db;
                case 1158383506: goto L_0x01a1;
                case 1402633315: goto L_0x0194;
                case 1883228653: goto L_0x014d;
                case 2122459230: goto L_0x0106;
                default: goto L_0x0104;
            }
        L_0x0104:
            goto L_0x022f
        L_0x0106:
            java.lang.String r0 = "star_atlas"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x022f
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            java.lang.String r3 = "ServiceManager.get()\n   …ridgeService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            boolean r0 = r0.getEnableParamsOverrideDeeplinkhandleractivity()
            if (r0 != 0) goto L_0x022f
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r3 = r18.getQueryParameterNames()
            java.util.Iterator r3 = r3.iterator()
        L_0x012c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0148
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r8 = r0
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r10 = "queryParameterName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r10)
            java.lang.String r10 = r1.getQueryParameter(r4)
            r8.put(r4, r10)
            goto L_0x012c
        L_0x0148:
            r2.starAtlasConfig(r0)
            goto L_0x022f
        L_0x014d:
            java.lang.String r0 = "task_platform"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x022f
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            java.lang.String r3 = "ServiceManager.get()\n   …ridgeService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            boolean r0 = r0.getEnableParamsOverrideDeeplinkhandleractivity()
            if (r0 != 0) goto L_0x022f
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r3 = r18.getQueryParameterNames()
            java.util.Iterator r3 = r3.iterator()
        L_0x0173:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x018f
            java.lang.Object r4 = r3.next()
            java.lang.String r4 = (java.lang.String) r4
            r8 = r0
            java.util.Map r8 = (java.util.Map) r8
            java.lang.String r10 = "queryParameterName"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r10)
            java.lang.String r10 = r1.getQueryParameter(r4)
            r8.put(r4, r10)
            goto L_0x0173
        L_0x018f:
            r2.taskPlatformConfig(r0)
            goto L_0x022f
        L_0x0194:
            java.lang.String r4 = "challenge"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x022f
            r2.challengeId(r0)
            goto L_0x022f
        L_0x01a1:
            java.lang.String r4 = "donation"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x022f
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "UUID.randomUUID().toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r4 = "christmas_h5"
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r8 = r2.shootWay(r4)
            com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder r8 = r8.creationId(r3)
            r8.donationId(r0)
            java.lang.String r0 = "shoot"
            com.ss.android.ugc.aweme.app.f.d r8 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r10 = "shoot_way"
            com.ss.android.ugc.aweme.app.f.d r4 = r8.mo47829a(r10, r4)
            java.lang.String r8 = "creation_id"
            com.ss.android.ugc.aweme.app.f.d r3 = r4.mo47829a(r8, r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r3)
            goto L_0x022f
        L_0x01db:
            java.lang.String r4 = "music"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x022f
            r2.musicId(r0)
            goto L_0x022f
        L_0x01e7:
            java.lang.String r4 = "sticker"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x022f
            java.lang.String r3 = "come_from"
            java.lang.String r3 = r1.getQueryParameter(r3)
            java.lang.String r4 = "activity"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0206
            java.lang.String r3 = "recordDetail"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            r2.autoUseSticker(r0)
            goto L_0x020d
        L_0x0206:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)
            r2.usePresetSticker(r3)
        L_0x020d:
            r2.sticker(r0)
            com.ss.android.ugc.aweme.services.external.ui.EffectConfig r0 = new com.ss.android.ugc.aweme.services.external.ui.EffectConfig
            r0.<init>()
            r0.setEffectMetaInfo(r10)
            r0.setEffectImage(r12)
            r2.effectConfig(r0)
            goto L_0x022f
        L_0x021f:
            java.lang.String r0 = "withStickerPanel"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x022f
            r2.showStickerPanel(r7)
            java.lang.String r0 = "system_camera_stickers"
            com.p683ss.android.ugc.aweme.base.utils.C23717f.m58206a(r0)
        L_0x022f:
            r0 = r5
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x024e
            r0 = r6
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x024e
            if (r5 != 0) goto L_0x0246
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0246:
            if (r6 != 0) goto L_0x024b
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x024b:
            r2.mentionUser(r5, r6)
        L_0x024e:
            java.lang.String r0 = "from_special_plus"
            java.lang.String r0 = r1.getQueryParameter(r0)
            if (r0 == 0) goto L_0x0275
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x0261
            goto L_0x0262
        L_0x0261:
            r0 = r11
        L_0x0262:
            if (r0 == 0) goto L_0x0275
            java.lang.String r3 = "1"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            r2.fromSpecialPlus(r0)
            r0 = 3
            r2.translationType(r0)
        L_0x0275:
            if (r9 != 0) goto L_0x0278
            return
        L_0x0278:
            int r0 = r9.hashCode()
            r3 = 3835(0xefb, float:5.374E-42)
            if (r0 == r3) goto L_0x0281
            goto L_0x0295
        L_0x0281:
            java.lang.String r0 = "xs"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0295
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r16
            r1 = r18
            r2 = r19
            m81932a(r1, r2, java.lang.Boolean.valueOf(false))
        L_0x0295:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p1931u.C36290a.m81930a(android.app.Activity, android.net.Uri, com.ss.android.ugc.aweme.services.external.ui.RecordConfig$Builder):void");
    }
}
