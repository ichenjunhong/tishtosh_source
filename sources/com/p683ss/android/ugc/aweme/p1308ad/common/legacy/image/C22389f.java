package com.p683ss.android.ugc.aweme.p1308ad.common.legacy.image;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.ad.common.legacy.image.f */
public final class C22389f {
    /* renamed from: a */
    public static void m55398a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m55399a(remoteImageView, urlModel, -1, -1, null);
    }

    /* renamed from: a */
    public static void m55401a(RemoteImageView remoteImageView, String str) {
        m55402a(remoteImageView, str, -1, -1);
    }

    /* renamed from: a */
    private static void m55397a(RemoteImageView remoteImageView, int i) {
        if (remoteImageView != null) {
            remoteImageView.setImageURI(C14232c.m29168a(i).mo26449a().mSourceUri);
        }
    }

    /* renamed from: a */
    public static void m55400a(RemoteImageView remoteImageView, C23556a aVar) {
        switch (aVar.f62678a) {
            case RES_ID:
                m55397a(remoteImageView, aVar.mo48742a());
                return;
            case URL_MODEL:
                m55398a(remoteImageView, aVar.mo48744c());
                return;
            case URL:
                m55401a(remoteImageView, aVar.mo48743b());
                break;
        }
    }

    /* renamed from: a */
    private static void m55402a(RemoteImageView remoteImageView, String str, int i, int i2) {
        if (remoteImageView != null) {
            if (TextUtils.isEmpty(str)) {
                m55397a(remoteImageView, 2131953301);
                return;
            }
            remoteImageView.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(remoteImageView.getController())).mo25757b(C14232c.m29169a(Uri.parse(str)).mo26449a())).mo25763d());
        }
    }

    /* renamed from: a */
    private static void m55399a(RemoteImageView remoteImageView, final UrlModel urlModel, int i, int i2, C14234d dVar) {
        C14229b[] bVarArr;
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
                bVarArr = new C14229b[0];
            } else {
                ArrayList arrayList = new ArrayList();
                for (String str : urlModel.getUrlList()) {
                    if (!C9431p.m18664a(str)) {
                        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                        imageDecodeOptionsBuilder.mo26113a(false);
                        arrayList.add(C14232c.m29169a(Uri.parse(str)).mo26451a(new C13950b(imageDecodeOptionsBuilder)).mo26449a());
                    }
                }
                if (arrayList.size() == 0) {
                    bVarArr = new C14229b[0];
                } else {
                    bVarArr = (C14229b[]) arrayList.toArray(new C14229b[arrayList.size()]);
                }
            }
            if (bVarArr != null && bVarArr.length != 0) {
                C13773e eVar = (C13773e) ((C13773e) C13771c.m27870a().mo25759b(remoteImageView.getController())).mo25755a((REQUEST[]) bVarArr);
                if (remoteImageView.getContext() != null) {
                    remoteImageView.getContext().getApplicationContext();
                }
                Uri uri = bVarArr[0].mSourceUri;
                eVar.mo25751a((C13791d<? super INFO>) new C13791d<C14045f>(null) {

                    /* renamed from: a */
                    UrlModel f60301a;

                    /* renamed from: b */
                    long f60302b = System.currentTimeMillis();

                    public final void onRelease(String str) {
                        if (null != null) {
                            null.onRelease(str);
                        }
                    }

                    public final void onFailure(String str, Throwable th) {
                        if (null != null) {
                            null.onFailure(str, th);
                        }
                    }

                    public final void onIntermediateImageFailed(String str, Throwable th) {
                        if (null != null) {
                            null.onIntermediateImageFailed(str, th);
                        }
                    }

                    public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                        C14045f fVar = (C14045f) obj;
                        if (null != null) {
                            null.onIntermediateImageSet(str, fVar);
                        }
                    }

                    public final void onSubmit(String str, Object obj) {
                        this.f60302b = System.currentTimeMillis();
                        this.f60301a = urlModel;
                        if (null != null) {
                            null.onSubmit(str, obj);
                        }
                    }

                    public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                        C14045f fVar = (C14045f) obj;
                        if (null != null) {
                            null.onFinalImageSet(str, fVar, animatable);
                        }
                    }
                });
                remoteImageView.setController(eVar.mo25763d());
            }
        }
    }
}
