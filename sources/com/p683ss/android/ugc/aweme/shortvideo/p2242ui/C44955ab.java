package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.location.C36255b.C36256a;
import com.p683ss.android.ugc.aweme.poi.IPOIService;
import com.p683ss.android.ugc.aweme.poi.IPOIService.C38951b;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.service.IPoiService;
import com.p683ss.android.ugc.aweme.poi.services.POIService;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ab */
public final class C44955ab {

    /* renamed from: a */
    public static final C44955ab f113869a = new C44955ab();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ab$a */
    static final class C44956a implements C38951b {

        /* renamed from: a */
        final /* synthetic */ ExtensionMisc f113870a;

        /* renamed from: b */
        final /* synthetic */ AVPublishContentType f113871b;

        C44956a(ExtensionMisc extensionMisc, AVPublishContentType aVPublishContentType) {
            this.f113870a = extensionMisc;
            this.f113871b = aVPublishContentType;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
            if (r5 == null) goto L_0x0084;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo79003a(com.p683ss.android.ugc.aweme.poi.IPOIService.C38952c r20, com.p683ss.android.ugc.aweme.poi.model.PoiStruct r21, java.lang.String r22) {
            /*
                r19 = this;
                r0 = r19
                r1 = r21
                r2 = r22
                com.ss.android.ugc.aweme.poi.service.IPoiService r3 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.poi.service.IPoiService r3 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r3
                java.lang.String r4 = "keyword"
                java.lang.String r3 = r3.getValueFromPoiStruct(r1, r4)
                if (r3 != 0) goto L_0x0016
                java.lang.String r3 = ""
            L_0x0016:
                r4 = r3
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r4 = android.text.TextUtils.isEmpty(r4)
                if (r4 == 0) goto L_0x0022
                java.lang.String r4 = "default_search_poi"
                goto L_0x0024
            L_0x0022:
                java.lang.String r4 = "search_poi"
            L_0x0024:
                java.lang.String r5 = "NULL"
                r6 = 0
                if (r1 == 0) goto L_0x002e
                java.lang.String r7 = r21.getPoiId()
                goto L_0x002f
            L_0x002e:
                r7 = r6
            L_0x002f:
                r8 = 1
                boolean r5 = p2628d.p2650m.C52830p.m112406a(r5, r7, r8)
                if (r5 == 0) goto L_0x0038
                r5 = r6
                goto L_0x0039
            L_0x0038:
                r5 = r1
            L_0x0039:
                com.ss.android.ugc.aweme.services.publish.ExtensionMisc r7 = r0.f113870a
                com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r7 = r7.getExtensionDataRepo()
                android.arch.lifecycle.r r7 = r7.getUpdateAnchor()
                com.ss.android.ugc.aweme.services.publish.AnchorTransData r15 = new com.ss.android.ugc.aweme.services.publish.AnchorTransData
                com.ss.android.ugc.aweme.commercialize.anchor.a r9 = com.p683ss.android.ugc.aweme.commercialize.anchor.C25600a.POI
                int r10 = r9.getTYPE()
                com.google.gson.f r9 = new com.google.gson.f
                r9.<init>()
                r11 = 2
                d.n[] r11 = new p2628d.C52847n[r11]
                r12 = 0
                java.lang.String r13 = "poi_id"
                if (r5 == 0) goto L_0x005b
                java.lang.String r14 = r5.poiId
                goto L_0x005c
            L_0x005b:
                r14 = r6
            L_0x005c:
                d.n r13 = p2628d.C52856t.m112465a(r13, r14)
                r11[r12] = r13
                java.lang.String r12 = "poi_name"
                if (r5 == 0) goto L_0x0068
                java.lang.String r6 = r5.poiName
            L_0x0068:
                d.n r6 = p2628d.C52856t.m112465a(r12, r6)
                r11[r8] = r6
                java.util.Map r6 = p2628d.p2629a.C52550ab.m112050a(r11)
                java.lang.String r11 = r9.mo34889b(r6)
                java.lang.String r6 = "Gson().toJson(mapOf(\n   …me\n                    ))"
                p2628d.p2639f.p2641b.C52711k.m112236a(r11, r6)
                if (r5 == 0) goto L_0x0084
                java.lang.String r5 = r5.poiName
                if (r5 != 0) goto L_0x0082
                goto L_0x0084
            L_0x0082:
                r12 = r5
                goto L_0x0087
            L_0x0084:
                java.lang.String r5 = ""
                goto L_0x0082
            L_0x0087:
                r13 = 0
                java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
                r5 = 0
                r16 = 0
                r17 = 104(0x68, float:1.46E-43)
                r18 = 0
                r9 = r15
                r6 = r15
                r15 = r5
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18)
                r7.setValue(r6)
                com.ss.android.ugc.aweme.poi.service.IPoiService r5 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.poi.service.IPoiService r5 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r5
                java.lang.String r6 = "order"
                java.lang.String r5 = r5.getValueFromPoiStruct(r1, r6)
                if (r5 != 0) goto L_0x00ac
                java.lang.String r5 = ""
            L_0x00ac:
                r6 = r5
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                boolean r6 = android.text.TextUtils.isEmpty(r6)
                if (r6 == 0) goto L_0x00b7
                java.lang.String r5 = "-1"
            L_0x00b7:
                com.ss.android.ugc.aweme.poi.service.IPoiService r6 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.poi.service.IPoiService r6 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r6
                java.lang.String r7 = "logpb"
                java.lang.String r6 = r6.getValueFromPoiStruct(r1, r7)
                if (r6 != 0) goto L_0x00c7
                java.lang.String r6 = ""
            L_0x00c7:
                java.lang.String r7 = "searchRegionType"
                p2628d.p2639f.p2641b.C52711k.m112236a(r2, r7)
                if (r1 != 0) goto L_0x00d1
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x00d1:
                java.lang.String r7 = "poiStruct!!"
                p2628d.p2639f.p2641b.C52711k.m112236a(r1, r7)
                com.ss.android.ugc.aweme.services.publish.AVPublishContentType r7 = r0.f113871b
                com.ss.android.ugc.aweme.app.f.d r8 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
                java.lang.String r9 = "enter_from"
                java.lang.String r10 = "edit_page"
                com.ss.android.ugc.aweme.app.f.d r9 = r8.mo47829a(r9, r10)
                java.lang.String r10 = "poi_type"
                int r11 = r1.iconType
                java.lang.String r11 = java.lang.String.valueOf(r11)
                com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
                java.lang.String r10 = "poi_id"
                java.lang.String r11 = r1.poiId
                com.ss.android.ugc.aweme.app.f.d r9 = r9.mo47829a(r10, r11)
                java.lang.String r10 = "enter_method"
                com.ss.android.ugc.aweme.app.f.d r4 = r9.mo47829a(r10, r4)
                java.lang.String r9 = "content_type"
                com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47828a(r9, r7)
                java.lang.String r7 = "log_pb"
                com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r7, r6)
                java.lang.String r6 = "order"
                com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r6, r5)
                java.lang.String r5 = "key_word"
                com.ss.android.ugc.aweme.app.f.d r3 = r4.mo47829a(r5, r3)
                java.lang.String r4 = "is_media_location"
                java.lang.String r5 = r21.isCandidate()
                com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                java.lang.String r4 = "distance_info"
                java.lang.String r5 = r21.getDistance()
                com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
                java.lang.String r4 = "search_region_type"
                r3.mo47829a(r4, r2)
                com.ss.android.ugc.aweme.poi.service.IPoiService r2 = com.p683ss.android.ugc.aweme.poi.PoiServiceImpl.createIPoiServicebyMonsterPlugin()
                com.ss.android.ugc.aweme.poi.service.IPoiService r2 = (com.p683ss.android.ugc.aweme.poi.service.IPoiService) r2
                java.lang.String r3 = "choose_poi"
                r2.onEventV3IncludingPoiParams(r1, r3, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44955ab.C44956a.mo79003a(com.ss.android.ugc.aweme.poi.IPOIService$c, com.ss.android.ugc.aweme.poi.model.PoiStruct, java.lang.String):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ab$b */
    static final class C44957b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ExtensionMisc f113872a;

        /* renamed from: b */
        final /* synthetic */ Fragment f113873b;

        /* renamed from: c */
        final /* synthetic */ AVPublishContentType f113874c;

        C44957b(ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
            this.f113872a = extensionMisc;
            this.f113873b = fragment;
            this.f113874c = aVPublishContentType;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            ExtensionMisc extensionMisc = this.f113872a;
            Fragment fragment = this.f113873b;
            AVPublishContentType aVPublishContentType = this.f113874c;
            if (fragment != null) {
                FragmentActivity activity = fragment.getActivity();
                if (activity != null) {
                    C36256a.m81865a(activity, new C44959d(extensionMisc, fragment, aVPublishContentType));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ab$c */
    static final class C44958c implements OnClickListener {

        /* renamed from: a */
        public static final C44958c f113875a = new C44958c();

        C44958c() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ab$d */
    public static final class C44959d implements C47939a {

        /* renamed from: a */
        final /* synthetic */ ExtensionMisc f113876a;

        /* renamed from: b */
        final /* synthetic */ Fragment f113877b;

        /* renamed from: c */
        final /* synthetic */ AVPublishContentType f113878c;

        /* renamed from: b */
        public final void mo60069b() {
        }

        /* renamed from: a */
        public final void mo60068a() {
            C44955ab.m98303b(this.f113876a, this.f113877b, this.f113878c);
        }

        C44959d(ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
            this.f113876a = extensionMisc;
            this.f113877b = fragment;
            this.f113878c = aVPublishContentType;
        }
    }

    private C44955ab() {
    }

    /* renamed from: a */
    public final void mo91247a(ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
        C52711k.m112240b(extensionMisc, "extensionMisc");
        C52711k.m112240b(aVPublishContentType, "contentType");
        m98304c(extensionMisc, fragment, aVPublishContentType);
    }

    /* renamed from: c */
    private static void m98304c(ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
        Context context;
        IPoiService createIPoiServicebyMonsterPlugin = PoiServiceImpl.createIPoiServicebyMonsterPlugin();
        if (createIPoiServicebyMonsterPlugin != null) {
            boolean hasShowPermissionTipDialog = createIPoiServicebyMonsterPlugin.getHasShowPermissionTipDialog();
            if (hasShowPermissionTipDialog) {
                m98303b(extensionMisc, fragment, aVPublishContentType);
            } else {
                if (!hasShowPermissionTipDialog) {
                    createIPoiServicebyMonsterPlugin.setHasShowPermissionTipDialog(true);
                    if (fragment != null) {
                        context = fragment.getContext();
                    } else {
                        context = null;
                    }
                    createIPoiServicebyMonsterPlugin.showLocationPermissionTipDialog(context, new C44957b(extensionMisc, fragment, aVPublishContentType), C44958c.f113875a);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m98303b(ExtensionMisc extensionMisc, Fragment fragment, AVPublishContentType aVPublishContentType) {
        FragmentActivity fragmentActivity;
        IPOIService createIPOIServicebyMonsterPlugin = POIService.createIPOIServicebyMonsterPlugin();
        if (createIPOIServicebyMonsterPlugin != null) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(extensionMisc.getCandidateLog())) {
                bundle.putString("candidateloc", extensionMisc.getCandidateLog());
            }
            bundle.putBoolean("enable_global_search", false);
            bundle.putBoolean("is_over_sea", false);
            if (fragment != null) {
                fragmentActivity = fragment.getActivity();
            } else {
                fragmentActivity = null;
            }
            createIPOIServicebyMonsterPlugin.getPOISearchDialog(fragmentActivity, bundle, new C44956a(extensionMisc, aVPublishContentType)).show();
            C26890h.onEvent(MobClick.obtain().setEventName("add_poi").setLabelName("edit_page"));
        }
    }
}
