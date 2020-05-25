package com.p683ss.android.ugc.aweme.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.C9395d;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p524d.C9396a;
import com.facebook.common.p918b.C13660a;
import com.facebook.common.p918b.C13670i;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.C13951c;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p964d.C13978j;
import com.facebook.imagepipeline.p965e.C14001h;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p966f.C14024b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p913b.C13613a;
import com.facebook.p913b.C13614b;
import com.facebook.p929d.C13744b;
import com.facebook.p929d.C13745c;
import com.facebook.p929d.C13748e;
import com.p683ss.android.p1147d.C18933b;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1412d.p1413a.C23522b;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.d */
public final class C23515d {

    /* renamed from: a */
    public static boolean f62614a;

    /* renamed from: com.ss.android.ugc.aweme.base.d$a */
    public interface C23520a {
        /* renamed from: a */
        void mo48679a(C13745c<C13715a<C14042c>> cVar);

        /* renamed from: a */
        void mo48680a(Exception exc);
    }

    /* renamed from: a */
    public static void m57673a(RemoteImageView remoteImageView, UrlModel urlModel, C13791d<C14045f> dVar, boolean z) {
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            Context applicationContext = remoteImageView.getContext() != null ? remoteImageView.getContext().getApplicationContext() : null;
            C14229b[] a = m57684a(urlModel, (C13952d) null, (C14234d) null);
            if (a != null && a.length != 0) {
                C13773e eVar = (C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(remoteImageView.getController())).mo25755a((REQUEST[]) a)).mo25762c(z);
                eVar.mo25751a(m57662a(dVar, a[0].mSourceUri, applicationContext, urlModel));
                remoteImageView.setController(eVar.mo25763d());
            }
        }
    }

    /* renamed from: a */
    public static void m57678a(RemoteImageView remoteImageView, String str, int i, int i2) {
        if (remoteImageView != null) {
            if (TextUtils.isEmpty(str)) {
                m57668a(remoteImageView, 2131953301);
                return;
            }
            C13952d dVar = null;
            if (i > 0 && i2 > 0) {
                dVar = new C13952d(i, i2);
            }
            C14232c a = C14232c.m29169a(Uri.parse(str));
            if (dVar != null) {
                a.mo26453a(dVar);
            }
            remoteImageView.setController(((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(remoteImageView.getController())).mo25757b(a.mo26449a())).mo25762c(true)).mo25763d());
        }
    }

    /* renamed from: a */
    public static void m57672a(RemoteImageView remoteImageView, UrlModel urlModel, C13791d<C14045f> dVar) {
        C13951c cVar = C13951c.MEDIUM;
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            Context applicationContext = remoteImageView.getContext() != null ? remoteImageView.getContext().getApplicationContext() : null;
            C14229b[] a = m57682a(urlModel, (C13952d) null, cVar, (C14234d) null);
            if (a != null && a.length != 0) {
                C13773e eVar = (C13773e) ((C13773e) C13771c.m27870a().mo25759b(remoteImageView.getController())).mo25755a((REQUEST[]) a);
                eVar.mo25751a(m57662a(dVar, a[0].mSourceUri, applicationContext, urlModel));
                remoteImageView.setController(eVar.mo25763d());
            }
        }
    }

    /* renamed from: a */
    public static void m57675a(RemoteImageView remoteImageView, UrlModel urlModel, C14234d dVar) {
        m57671a(remoteImageView, urlModel, -1, -1, dVar);
    }

    /* renamed from: a */
    public static void m57671a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, C14234d dVar) {
        m57674a(remoteImageView, urlModel, (i <= 0 || i2 <= 0) ? null : new C13952d(i, i2), dVar);
    }

    /* renamed from: a */
    private static void m57674a(RemoteImageView remoteImageView, UrlModel urlModel, C13952d dVar, C14234d dVar2) {
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            C14229b[] a = m57684a(urlModel, dVar, dVar2);
            if (a != null && a.length != 0) {
                remoteImageView.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(remoteImageView.getController())).mo25755a((REQUEST[]) a)).mo25763d());
            }
        }
    }

    /* renamed from: a */
    public static void m57676a(RemoteImageView remoteImageView, C23556a aVar) {
        switch (aVar.f62678a) {
            case RES_ID:
                m57668a(remoteImageView, aVar.mo48742a());
                return;
            case URL_MODEL:
                m57669a(remoteImageView, aVar.mo48744c());
                return;
            case URL:
                m57677a(remoteImageView, aVar.mo48743b());
                break;
        }
    }

    /* renamed from: a */
    public static void m57677a(RemoteImageView remoteImageView, String str) {
        m57686b(remoteImageView, str, -1, -1);
    }

    /* renamed from: a */
    private static void m57679a(RemoteImageView remoteImageView, String str, int i, int i2, Config config) {
        if (remoteImageView != null) {
            if (TextUtils.isEmpty(str)) {
                m57668a(remoteImageView, 2131953301);
                return;
            }
            C13952d dVar = null;
            if (i > 0 && i2 > 0) {
                dVar = new C13952d(i, i2);
            }
            C14232c a = C14232c.m29169a(Uri.parse(str));
            if (dVar != null) {
                a.mo26453a(dVar);
            }
            if (config != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                a.mo26451a(new C13950b(imageDecodeOptionsBuilder));
            }
            remoteImageView.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(remoteImageView.getController())).mo25757b(a.mo26449a())).mo25763d());
        }
    }

    /* renamed from: a */
    public static C14229b[] m57684a(UrlModel urlModel, C13952d dVar, C14234d dVar2) {
        return m57683a(urlModel, dVar, C13951c.MEDIUM, dVar2, Config.RGB_565);
    }

    /* renamed from: a */
    public static C14229b[] m57682a(UrlModel urlModel, C13952d dVar, C13951c cVar, C14234d dVar2) {
        return m57683a(urlModel, dVar, cVar, dVar2, Config.RGB_565);
    }

    /* renamed from: a */
    public static C14229b[] m57685a(UrlModel urlModel, C13952d dVar, C14234d dVar2, Config config) {
        return m57683a(urlModel, (C13952d) null, C13951c.MEDIUM, (C14234d) null, config);
    }

    /* renamed from: a */
    private static C14229b[] m57683a(UrlModel urlModel, C13952d dVar, C13951c cVar, C14234d dVar2, Config config) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new C14229b[0];
        }
        ArrayList arrayList = new ArrayList();
        C23527f fVar = null;
        if (!f62614a) {
            fVar = new C23527f();
        }
        for (String str : urlModel.getUrlList()) {
            if (!C9431p.m18664a(str)) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                imageDecodeOptionsBuilder.mo26112a(1);
                imageDecodeOptionsBuilder.mo26113a(false);
                C14232c a = C14232c.m29169a(Uri.parse(str)).mo26452a(cVar).mo26451a(new C13950b(imageDecodeOptionsBuilder));
                if (dVar2 != null) {
                    a.mo26458a(dVar2);
                }
                if (dVar != null) {
                    a.mo26453a(dVar);
                }
                if (fVar != null) {
                    fVar.mo48686a(a);
                }
                arrayList.add(a.mo26449a());
            }
        }
        if (arrayList.size() == 0) {
            return new C14229b[0];
        }
        return (C14229b[]) arrayList.toArray(new C14229b[arrayList.size()]);
    }

    /* renamed from: a */
    public static boolean m57680a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C14017k.m28587a().mo26210d().mo25512d(C13978j.m28504a().mo26147c(C14229b.fromUri(uri), null));
    }

    /* renamed from: a */
    public static boolean m57681a(C14001h hVar, C14229b[] bVarArr, int i, C13748e<C13715a<C14042c>> eVar) {
        if (i >= bVarArr.length) {
            return false;
        }
        hVar.mo26182a(bVarArr[i], (Object) null).mo25666a(eVar, C13670i.m27623a());
        return true;
    }

    /* renamed from: a */
    public static String m57665a(String str) {
        String str2 = "";
        if (str == null || str.isEmpty()) {
            return str2;
        }
        Uri parse = Uri.parse(str);
        if (m57680a(parse)) {
            C13613a a = C14017k.m28587a().mo26210d().mo25504a(C13978j.m28504a().mo26147c(C14229b.fromUri(parse), null));
            if (a != null) {
                File file = ((C13614b) a).f35532a;
                if (file != null) {
                    str2 = file.getAbsolutePath();
                }
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static void m57687b(String str) {
        if (str != null && !str.isEmpty() && !m57680a(Uri.parse(str))) {
            C14017k.m28587a().mo26211e().mo26192c(C14229b.fromUri(str), null);
        }
    }

    /* renamed from: a */
    public static String m57664a(UrlModel urlModel) {
        if (urlModel != null) {
            try {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    List urlList = urlModel.getUrlList();
                    if (urlList == null || urlList.isEmpty()) {
                        return "";
                    }
                    int size = urlList.size();
                    for (int i = 0; i < size; i++) {
                        if (m57680a(Uri.parse((String) urlList.get(i)))) {
                            return (String) urlList.get(i);
                        }
                    }
                    return "";
                }
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    /* renamed from: a */
    public static void m57669a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m57671a(remoteImageView, urlModel, -1, -1, (C14234d) null);
    }

    /* renamed from: a */
    public static void m57667a(UrlModel urlModel, final C23520a aVar) {
        final C14229b[] a = m57684a(urlModel, (C13952d) null, (C14234d) null);
        final C14001h c = C13771c.m27875c();
        m57681a(c, a, 0, (C13748e<C13715a<C14042c>>) new C13744b<C13715a<C14042c>>() {

            /* renamed from: d */
            private int f62621d = 1;

            public final void onNewResultImpl(C13745c<C13715a<C14042c>> cVar) {
                aVar.mo48679a(cVar);
            }

            public final void onFailureImpl(C13745c<C13715a<C14042c>> cVar) {
                Throwable e = cVar.mo25675e();
                C14001h hVar = c;
                C14229b[] bVarArr = a;
                int i = this.f62621d;
                this.f62621d = i + 1;
                if (!C23515d.m57681a(hVar, bVarArr, i, (C13748e<C13715a<C14042c>>) this)) {
                    aVar.mo48680a((Exception) new RuntimeException(e));
                }
            }
        });
    }

    /* renamed from: a */
    public static String m57663a(Context context, String str) {
        if (C9431p.m18664a(str)) {
            return "";
        }
        String str2 = "";
        Uri parse = Uri.parse(str);
        if (m57680a(parse)) {
            C13613a a = C14017k.m28587a().mo26210d().mo25504a(C13978j.m28504a().mo26147c(C14229b.fromUri(parse), null));
            if (a != null) {
                File file = ((C13614b) a).f35532a;
                if (file != null) {
                    new C18933b(context);
                    String a2 = C18933b.m46087a();
                    String a3 = C9395d.m18571a(file.getName());
                    File file2 = new File(a2, a3);
                    if (!file2.exists()) {
                        C9396a.m18580a(file.getAbsolutePath(), a2, a3);
                    }
                    str2 = file2.getAbsolutePath();
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static void m57668a(RemoteImageView remoteImageView, int i) {
        if (remoteImageView != null) {
            remoteImageView.setImageURI(C14232c.m29168a(i).mo26449a().mSourceUri);
        }
    }

    /* renamed from: a */
    public static C13791d<C14045f> m57662a(final C13791d<C14045f> dVar, Uri uri, Context context, UrlModel urlModel) {
        return new C13791d<C14045f>() {
            public final void onRelease(String str) {
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            }

            public final void onFailure(String str, Throwable th) {
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            }

            public final void onIntermediateImageFailed(String str, Throwable th) {
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            }

            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
                C14045f fVar = (C14045f) obj;
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, fVar);
                }
            }

            public final void onSubmit(String str, Object obj) {
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            }

            public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                C14045f fVar = (C14045f) obj;
                if (dVar != null) {
                    dVar.onFinalImageSet(str, fVar, animatable);
                }
            }
        };
    }

    /* renamed from: b */
    public static void m57686b(RemoteImageView remoteImageView, String str, int i, int i2) {
        m57679a(remoteImageView, str, i, i2, Config.ARGB_8888);
    }

    /* renamed from: a */
    public static void m57666a(UrlModel urlModel, int i, int i2, final C23522b<Bitmap> bVar) {
        C14001h e = C14017k.m28587a().mo26211e();
        C14229b[] a = m57684a(urlModel, (C13952d) null, (C14234d) null);
        if (a.length != 0) {
            final C13745c a2 = e.mo26182a(a[0], (Object) null);
            a2.mo25666a(new C14024b() {
                public final void onFailureImpl(C13745c<C13715a<C14042c>> cVar) {
                    if (cVar != null) {
                        cVar.mo25677g();
                    }
                    bVar.mo48682a(null);
                }

                /* renamed from: a */
                public final void mo9012a(Bitmap bitmap) {
                    if (!a2.mo25672b() || bitmap == null) {
                        bVar.mo48682a(null);
                        return;
                    }
                    bVar.mo48682a(Bitmap.createBitmap(bitmap));
                    a2.mo25677g();
                }
            }, C13660a.m27612a());
        }
    }

    /* renamed from: a */
    public static void m57670a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        m57671a(remoteImageView, urlModel, i, i2, (C14234d) null);
    }
}
