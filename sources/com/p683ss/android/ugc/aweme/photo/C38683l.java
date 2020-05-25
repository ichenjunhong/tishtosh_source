package com.p683ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.ugc.aweme.base.C23551l;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.beauty.C23778b;
import com.p683ss.android.ugc.aweme.beauty.C23780d;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.plugin.C38949c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.setting.C41623i;
import com.p683ss.android.ugc.aweme.shortvideo.C42421al;
import com.p683ss.android.ugc.aweme.shortvideo.C43211de;
import com.p683ss.android.ugc.aweme.shortvideo.C43846fo;
import com.p683ss.android.ugc.aweme.shortvideo.C43847fp;
import com.p683ss.android.ugc.aweme.shortvideo.C43907k;
import com.p683ss.android.ugc.aweme.shortvideo.C44338p;
import com.p683ss.android.ugc.aweme.shortvideo.SynthetiseResult;
import com.p683ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p683ss.android.ugc.aweme.shortvideo.api.C42426a;
import com.p683ss.android.ugc.aweme.shortvideo.model.VideoCreation;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44370d;
import com.p683ss.android.ugc.aweme.shortvideo.upload.C45248af;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.utils.C47922gm;
import com.p683ss.android.ugc.aweme.utils.C47955u;
import com.p683ss.ttuploader.TTImageUploader;
import java.io.File;
import java.util.LinkedHashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.photo.l */
public final class C38683l extends C43907k {

    /* renamed from: f */
    private final TTUploaderService f98389f;

    /* renamed from: a */
    public final void mo78617a() {
    }

    /* renamed from: a */
    public final C43211de<SynthetiseResult> mo78615a(Object obj) {
        return new C43211de<SynthetiseResult>() {
            {
                mo34624b(new SynthetiseResult());
            }
        };
    }

    /* renamed from: c */
    public final Bitmap mo78619c(Object obj) {
        return m86039a((PhotoContext) obj);
    }

    /* renamed from: a */
    public static Bitmap m86039a(PhotoContext photoContext) {
        C47922gm.m103690a();
        return C47922gm.m103691b(photoContext.mPhotoLocalPath, 90, OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, 1);
    }

    /* renamed from: b */
    public final long mo78618b(Object obj) {
        String str = ((PhotoContext) obj).mPhotoLocalPath;
        if (!TextUtils.isEmpty(str)) {
            return new File(str).length();
        }
        C9220a.m18310a("PhotoFutureFactory empty photoLocalPath");
        return 0;
    }

    /* renamed from: a */
    public final C17832m<VideoCreation> mo78613a(Object obj, SynthetiseResult synthetiseResult) {
        if (synthetiseResult == null) {
            return null;
        }
        C17832m<VideoCreation> a = this.f98389f.mo86428a(null);
        C17825i.m43740a(a, new C38656d(), C23551l.f62672a);
        return a;
    }

    /* renamed from: a */
    public final C43211de<VideoCreation> mo78616a(Object obj, VideoCreation videoCreation) {
        C43211de<VideoCreation> deVar;
        final String str = ((PhotoContext) obj).mPhotoLocalPath;
        if (str == null || !new File(str).exists()) {
            deVar = new C43211de<VideoCreation>() {
                {
                    StringBuilder sb = new StringBuilder("Photo file does not exist. file name: ");
                    sb.append(str);
                    mo34623a((Throwable) new RuntimeException(sb.toString()));
                }
            };
        } else {
            final C43847fp fpVar = ((C43846fo) videoCreation).f111028c;
            deVar = new C43211de<VideoCreation>() {
                {
                    TTImageUploader b;
                    try {
                        b = C38949c.m86786b();
                        b.setListener(new C38690n(this, b));
                        C43847fp fpVar = fpVar;
                        C52711k.m112240b(fpVar, "imageConfig");
                        C52711k.m112240b(b, "uploader");
                        C45248af afVar = new C45248af();
                        afVar.mo91536a(fpVar);
                        b.setServerParameter(afVar.mo91535a());
                        b.setSliceSize(fpVar.f111035f);
                        b.setFileUploadDomain(fpVar.f111031b);
                        b.setImageUploadDomain(fpVar.f111032c);
                        b.setSliceTimeout(fpVar.f111036g);
                        b.setSliceReTryCount(fpVar.f111037h);
                        b.setFilePath(1, new String[]{str});
                        b.setFileRetryCount(1);
                        b.setUserKey(fpVar.f111030a);
                        b.setEnableHttps(fpVar.f111039j);
                        b.setAuthorization(fpVar.f111038i);
                        C47955u.m103766a();
                        boolean b2 = C41623i.m91496b();
                        b.setOpenBoe(b2);
                        StringBuilder sb = new StringBuilder("PhotoFuture enableBoe:");
                        sb.append(b2);
                        C45407ay.m98968a(sb.toString());
                        b.start();
                    } catch (Exception e) {
                        b.close();
                        throw e;
                    } catch (Throwable th) {
                        mo34623a(th);
                    }
                }
            };
        }
        C17825i.m43740a(deVar, new C38707s(this.f111184a, this.f111185b), C23551l.f62672a);
        return deVar;
    }

    public C38683l(TTUploaderService tTUploaderService, int i, int i2) {
        super(i, i2);
        this.f98389f = tTUploaderService;
        this.f111184a = i;
        this.f111185b = i2;
    }

    /* renamed from: a */
    public final C17832m<C42421al> mo78614a(Object obj, VideoCreation videoCreation, SynthetiseResult synthetiseResult) {
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        String str5;
        PhotoContext photoContext = (PhotoContext) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(photoContext.mText)) {
            linkedHashMap.put("text", photoContext.mText);
        }
        if (photoContext.mExtras == null) {
            str = null;
        } else {
            str = C39618d.f101161b.mo34889b(photoContext.mExtras);
        }
        if (!TextUtils.isEmpty(str)) {
            linkedHashMap.put("text_extra", str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(photoContext.mPhotoFrom);
        linkedHashMap.put("original", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(photoContext.mImageType);
        linkedHashMap.put("image_type", sb2.toString());
        TextUtils.isEmpty(photoContext.mStickers);
        String str6 = "stickers";
        if (!TextUtils.isEmpty(photoContext.mStickers)) {
            str2 = photoContext.mStickers;
        } else {
            str2 = "";
        }
        linkedHashMap.put(str6, str2);
        String str7 = "filter_name";
        if (!TextUtils.isEmpty(photoContext.mFilterName)) {
            str3 = photoContext.mFilterName;
        } else {
            str3 = "";
        }
        linkedHashMap.put(str7, str3);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(photoContext.mCamera);
        linkedHashMap.put("camera", sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        sb4.append(photoContext.mPrettify);
        linkedHashMap.put("prettify", sb4.toString());
        StringBuilder sb5 = new StringBuilder();
        sb5.append(photoContext.mLongitude);
        linkedHashMap.put("longitude", sb5.toString());
        StringBuilder sb6 = new StringBuilder();
        sb6.append(photoContext.mLatitude);
        linkedHashMap.put("latitude", sb6.toString());
        StringBuilder sb7 = new StringBuilder();
        sb7.append(photoContext.mIsPrivate);
        linkedHashMap.put("is_private", sb7.toString());
        if (!TextUtils.isEmpty(photoContext.shopDraftId)) {
            linkedHashMap.put("shop_draft_id", photoContext.shopDraftId);
        }
        if (!TextUtils.isEmpty(photoContext.mShootWay)) {
            linkedHashMap.put("shoot_way", photoContext.mShootWay);
        }
        boolean z = true;
        if (!TextUtils.isEmpty(photoContext.mSyncPlatforms)) {
            i = 0;
            for (int i2 : C42426a.m93192a(photoContext.mSyncPlatforms)) {
                switch (i2) {
                    case 1:
                        i = 1;
                        break;
                    case 2:
                        linkedHashMap.put("sync_to_duoshan", "1");
                        break;
                }
            }
        } else {
            i = 0;
        }
        StringBuilder sb8 = new StringBuilder();
        sb8.append(i);
        linkedHashMap.put("sync_to_toutiao", sb8.toString());
        if (C39618d.f101152P.mo83103a(C40790a.EnableFilterIntensityJust)) {
            StringBuilder sb9 = new StringBuilder();
            sb9.append(photoContext.mFilterRate);
            linkedHashMap.put("filter_value", sb9.toString());
            C31459g b = C39618d.f101144H.mo58584o().mo64333c().mo64346b(photoContext.mFilterIndex);
            if (((double) Math.abs(b.f82334k - photoContext.mFilterRate)) >= 0.01d && b.f82334k != -1.0f) {
                z = false;
            }
            String str8 = "is_original_filter";
            if (z) {
                str5 = "1";
            } else {
                str5 = "0";
            }
            linkedHashMap.put(str8, str5);
        }
        linkedHashMap.put("beautify_info", C23778b.m58351a());
        linkedHashMap.put("beautify_used", String.valueOf(C23778b.m58353b()));
        String str9 = "is_composer";
        if (C23780d.m58365a()) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        linkedHashMap.put(str9, str4);
        if (photoContext.poiServerMobParam != null) {
            linkedHashMap.putAll(photoContext.poiServerMobParam);
        }
        if (photoContext.cameraLensInfo != null && !photoContext.cameraLensInfo.isEmpty()) {
            linkedHashMap.put("camera_lens_info", photoContext.cameraLensInfo);
        }
        for (C44370d a : C39618d.f101179t.mo74314b()) {
            a.mo52804a(photoContext, linkedHashMap);
        }
        C17832m b2 = C39618d.f101179t.mo74313b(videoCreation.materialId, linkedHashMap);
        C17825i.m43740a(b2, new C38654b(), C23551l.f62672a);
        return C17825i.m43735a(b2, C23459a.class, C44338p.m97117a(new C38689m(this, obj, videoCreation, synthetiseResult)), C23551l.f62672a);
    }
}
