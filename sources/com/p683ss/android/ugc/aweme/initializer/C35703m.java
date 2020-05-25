package com.p683ss.android.ugc.aweme.initializer;

import android.support.p030v4.p038f.C0794k;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.google.gson.C17971f;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.choosemusic.p1513g.C24954a;
import com.p683ss.android.ugc.aweme.commercialize.C25655c;
import com.p683ss.android.ugc.aweme.commercialize.C25932h;
import com.p683ss.android.ugc.aweme.commercialize.C25946l;
import com.p683ss.android.ugc.aweme.commercialize.C26199s;
import com.p683ss.android.ugc.aweme.commercialize.C26319t;
import com.p683ss.android.ugc.aweme.commercialize.link.C25960g;
import com.p683ss.android.ugc.aweme.commercialize.model.C26109ad;
import com.p683ss.android.ugc.aweme.commercialize.star.C26262e;
import com.p683ss.android.ugc.aweme.opensdk.share.C38524d;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.poi.p2074ui.publish.C39395a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc;
import com.p683ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p683ss.android.ugc.aweme.services.publish.AnchorPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.CouponPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.GamePublishModel;
import com.p683ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.I18nShopPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p683ss.android.ugc.aweme.services.publish.LinkPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.LocationActivityPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.MediumPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.MicroAppPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.MoviePublishModel;
import com.p683ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.PostPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.SeedPublishModel;
import com.p683ss.android.ugc.aweme.services.publish.WikiPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p683ss.android.ugc.aweme.shortvideo.model.StarAtlasPublishModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43890d;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44940aa;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44960ac;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44969ag;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44977ao;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45087c;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45165dh;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45176g;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45184j;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45192l;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45200m;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45210s;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45217u;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45222v;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C45229x;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44370d;
import com.p683ss.android.ugc.aweme.shortvideo.publish.CreateAwemeApi;
import com.p683ss.android.ugc.aweme.shortvideo.publish.CreatePhotoApi;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.initializer.m */
public final class C35703m implements C39591bc {
    /* renamed from: a */
    public final boolean mo74311a() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo74315c() {
        return C24954a.m60699b();
    }

    /* renamed from: b */
    public final List<C44370d> mo74314b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C26319t());
        arrayList.add(new C26199s());
        arrayList.add(new C39395a());
        arrayList.add(new C25946l());
        arrayList.add(new C38524d());
        arrayList.add(new C25655c());
        arrayList.add(new C25932h());
        return arrayList;
    }

    /* renamed from: a */
    public final HashMap<String, String> mo74305a(Object obj) {
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        if (obj instanceof BaseShortVideoContext) {
            return hashMap;
        }
        PhotoContext photoContext = (PhotoContext) obj;
        C26109ad a = C26109ad.m63391a(photoContext);
        if (a.f68924f != null) {
            hashMap.put("shop_order_share", new C17971f().mo34889b(a.f68924f.getShopOrderShareStruct()));
        }
        String str2 = "commerce_ad_link";
        if (C26109ad.m63391a(photoContext).f68919a) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str2, str);
        return hashMap;
    }

    /* renamed from: a */
    public final void mo74310a(boolean z) {
        C47718bf.m103288a(new C43890d(false));
    }

    /* renamed from: a */
    public final List<C0794k<Class<?>, IAVPublishExtension<?>>> mo74306a(AVPublishContentType aVPublishContentType) {
        ArrayList arrayList = new ArrayList();
        switch (aVPublishContentType) {
            case Video:
            case PhotoMovie:
                arrayList.add(C0794k.m2265a(StarAtlasPublishModel.class, new C26262e()));
                arrayList.add(C0794k.m2265a(LocationActivityPublishModel.class, new C45210s()));
                arrayList.add(C0794k.m2265a(PoiPublishModel.class, new C44940aa()));
                arrayList.add(C0794k.m2265a(AnchorPublishModel.class, new C45087c()));
                arrayList.add(C0794k.m2265a(GoodsPublishModel.class, new C45192l()));
                arrayList.add(C0794k.m2265a(MicroAppPublishModel.class, new C45222v()));
                arrayList.add(C0794k.m2265a(GamePublishModel.class, new C45184j()));
                arrayList.add(C0794k.m2265a(PostPublishModel.class, new C44960ac()));
                arrayList.add(C0794k.m2265a(I18nShopPublishModel.class, new C45200m()));
                arrayList.add(C0794k.m2265a(WikiPublishModel.class, new C45165dh()));
                arrayList.add(C0794k.m2265a(MoviePublishModel.class, new C45229x()));
                arrayList.add(C0794k.m2265a(SeedPublishModel.class, new C44977ao()));
                arrayList.add(C0794k.m2265a(MediumPublishModel.class, new C45217u()));
                arrayList.add(C0794k.m2265a(CouponPublishModel.class, new C45176g()));
                arrayList.add(C0794k.m2265a(LinkPublishModel.class, new C25960g()));
                break;
            case Photo:
                arrayList.add(C0794k.m2265a(LocationActivityPublishModel.class, new C45210s()));
                arrayList.add(C0794k.m2265a(PoiPublishModel.class, new C44940aa()));
                arrayList.add(C0794k.m2265a(GoodsPublishModel.class, new C45192l()));
                break;
            default:
                StringBuilder sb = new StringBuilder("unknown type: ");
                sb.append(aVPublishContentType.getContentType());
                throw new IllegalArgumentException(sb.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C17832m<? extends C42421al> mo74304a(String str, LinkedHashMap<String, String> linkedHashMap) {
        return CreateAwemeApi.f112263a.createAweme(str, linkedHashMap);
    }

    /* renamed from: b */
    public final C17832m<? extends C42421al> mo74313b(String str, LinkedHashMap<String, String> linkedHashMap) {
        return CreatePhotoApi.f112264a.createAweme(str, linkedHashMap);
    }

    /* renamed from: a */
    public final void mo74308a(BaseResponse baseResponse, int i) {
        if (baseResponse instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) baseResponse;
            if (createAwemeResponse.aweme != null) {
                createAwemeResponse.aweme.getVideo().setVideoLength(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo74309a(BaseResponse baseResponse, List<InteractStickerStruct> list) {
        if (baseResponse instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) baseResponse;
            if (createAwemeResponse.aweme != null) {
                if (createAwemeResponse.aweme.getInteractStickerStructs() == null) {
                    createAwemeResponse.aweme.setInteractStickerStructs(new ArrayList());
                }
                ArrayList arrayList = new ArrayList(createAwemeResponse.aweme.getInteractStickerStructs());
                if (!C9376b.m18558a((Collection<T>) list)) {
                    arrayList.addAll(list);
                }
                createAwemeResponse.aweme.setInteractStickerStructs(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo74307a(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap) {
        new C44969ag(commonItemView, z, hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0107, code lost:
        if (r6.hasExtra(r9) == false) goto L_0x00f3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x013f A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo74312a(android.support.p030v4.app.FragmentActivity r5, android.content.Intent r6, java.lang.Class<? extends android.app.Service> r7, java.lang.String r8, java.lang.String r9) {
        /*
            r4 = this;
            java.lang.String r0 = "Tools-Client"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PublishServiceImpl process publish intent:"
            r1.<init>(r2)
            android.os.Bundle r2 = r6.getExtras()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 4
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r2, r0, r1)
            java.lang.String r0 = "aweme"
            java.io.Serializable r0 = r6.getSerializableExtra(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
            java.lang.String r1 = "aweme_response"
            java.io.Serializable r1 = r6.getSerializableExtra(r1)
            com.ss.android.ugc.aweme.shortvideo.CreateAwemeResponse r1 = (com.p683ss.android.ugc.aweme.shortvideo.CreateAwemeResponse) r1
            r2 = 1
            if (r0 == 0) goto L_0x0039
            java.lang.String r7 = "processPublish.processPublish()"
            com.p683ss.android.ugc.aweme.util.C47625i.m103103a(r7)
            com.ss.android.ugc.aweme.initializer.n r7 = new com.ss.android.ugc.aweme.initializer.n
            r7.<init>(r0, r5, r6)
            com.p683ss.android.ugc.aweme.base.component.EventActivityComponent.m57648a(r5, r1, r7)
            return r2
        L_0x0039:
            java.lang.String r0 = "com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT"
            boolean r0 = r6.hasExtra(r0)
            if (r0 == 0) goto L_0x0047
            java.lang.String r5 = "processPublish. EXTRA_AWEME_DRAFT "
            com.p683ss.android.ugc.aweme.util.C47625i.m103103a(r5)
            return r2
        L_0x0047:
            java.lang.String r0 = "multi_publish_id"
            boolean r0 = r6.hasExtra(r0)
            if (r0 == 0) goto L_0x005d
            java.lang.String r7 = "multi_publish_id"
            java.lang.String r6 = r6.getStringExtra(r7)
            com.ss.android.ugc.aweme.port.internal.MainActivityCallback r7 = new com.ss.android.ugc.aweme.port.internal.MainActivityCallback
            r7.<init>(r5, r6)
            boolean r5 = r7.f101211e
            return r5
        L_0x005d:
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r0 = r0.avsettingsConfig()
            boolean r0 = r0.uploadOptimizeForPie()
            r1 = 0
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r6.hasExtra(r8)
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = "extra_photo_publish_args"
            boolean r0 = r6.hasExtra(r0)
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r6.hasExtra(r9)
            if (r0 != 0) goto L_0x00bf
            java.lang.String r0 = android.os.Build.MODEL
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r3 = "SM-J610F"
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 != 0) goto L_0x00a8
        L_0x0094:
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r0 = r0.avsettingsConfig()
            boolean r0 = r0.enableUploadFallback()
            if (r0 == 0) goto L_0x00aa
        L_0x00a8:
            r0 = 1
            goto L_0x00ab
        L_0x00aa:
            r0 = 0
        L_0x00ab:
            if (r0 == 0) goto L_0x00bf
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r0 < r3) goto L_0x00bf
            android.os.Bundle r0 = com.p683ss.android.ugc.aweme.services.publish.Publish.PublishBundle
            if (r0 == 0) goto L_0x00bf
            android.os.Bundle r0 = com.p683ss.android.ugc.aweme.services.publish.Publish.PublishBundle
            r6.putExtras(r0)
            r0 = 0
            com.p683ss.android.ugc.aweme.services.publish.Publish.PublishBundle = r0
        L_0x00bf:
            com.ss.android.ugc.aweme.services.IExternalService r0 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r0 = (com.p683ss.android.ugc.aweme.services.IExternalService) r0
            com.ss.android.ugc.aweme.services.external.IConfigService r0 = r0.configService()
            com.ss.android.ugc.aweme.services.settings.IAVSettingsService r0 = r0.avsettingsConfig()
            boolean r0 = r0.uploadOptimizeForPie()
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "publish_bundle"
            android.os.Bundle r0 = r6.getBundleExtra(r0)
            if (r0 == 0) goto L_0x00f3
            java.io.Serializable r8 = r0.getSerializable(r8)
            if (r8 != 0) goto L_0x00ef
            java.lang.String r8 = "extra_photo_publish_args"
            java.io.Serializable r8 = r0.getSerializable(r8)
            if (r8 != 0) goto L_0x00ef
            android.os.Parcelable r8 = r0.getParcelable(r9)
            if (r8 == 0) goto L_0x00f3
        L_0x00ef:
            r6.putExtras(r0)
            goto L_0x0109
        L_0x00f3:
            r8 = 0
            goto L_0x010a
        L_0x00f5:
            boolean r8 = r6.hasExtra(r8)
            if (r8 != 0) goto L_0x0109
            java.lang.String r8 = "extra_photo_publish_args"
            boolean r8 = r6.hasExtra(r8)
            if (r8 != 0) goto L_0x0109
            boolean r8 = r6.hasExtra(r9)
            if (r8 == 0) goto L_0x00f3
        L_0x0109:
            r8 = 1
        L_0x010a:
            if (r8 == 0) goto L_0x013f
            android.content.Intent r8 = new android.content.Intent
            r8.<init>(r5, r7)
            r8.putExtras(r6)
            r5.startService(r8)     // Catch:{ SecurityException -> 0x0128 }
            java.lang.String r7 = "pre_publish_type"
            int r6 = r6.getIntExtra(r7, r1)
            if (r6 != 0) goto L_0x0127
            com.ss.android.ugc.aweme.port.internal.ServiceConnectionImpl r6 = new com.ss.android.ugc.aweme.port.internal.ServiceConnectionImpl
            r6.<init>(r5)
            r5.bindService(r8, r6, r2)
        L_0x0127:
            return r2
        L_0x0128:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "PublishServiceImpl.processPublish() startService error "
            r6.<init>(r7)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.p683ss.android.ugc.aweme.util.C47625i.m103103a(r5)
            return r1
        L_0x013f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.initializer.C35703m.mo74312a(android.support.v4.app.FragmentActivity, android.content.Intent, java.lang.Class, java.lang.String, java.lang.String):boolean");
    }
}
