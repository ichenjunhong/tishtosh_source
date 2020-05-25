package com.bytedance.android.live.core.p230g;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p230g.C3909r.C3910a;
import com.bytedance.android.live.core.p230g.C3909r.C3911b;
import com.bytedance.android.live.core.p230g.p231a.C3853c;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.common.utility.C9431p;
import com.facebook.common.p918b.C13660a;
import com.facebook.common.p923g.C13709h;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.drawee.p940f.C13834b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p966f.C14024b;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p929d.C13745c;
import com.facebook.p929d.C13748e;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.g.m */
public final class C3899m {

    /* renamed from: a */
    private static final Handler f10904a = new Handler(Looper.getMainLooper());

    /* renamed from: com.bytedance.android.live.core.g.m$a */
    public static class C3902a {

        /* renamed from: a */
        public final ImageModel f10908a;

        /* renamed from: b */
        public Drawable f10909b;

        /* renamed from: c */
        public int f10910c = 300;

        /* renamed from: d */
        public int f10911d = -1;

        /* renamed from: e */
        public int f10912e = -1;

        /* renamed from: f */
        public C14234d f10913f;

        /* renamed from: g */
        public C3910a f10914g;

        /* renamed from: h */
        public boolean f10915h;

        /* renamed from: i */
        public boolean f10916i = ((Boolean) CoreSettingKeys.ENABLE_IMAGE_DEFAULT_565.mo9431a()).booleanValue();

        public C3902a(ImageModel imageModel) {
            this.f10908a = imageModel;
        }
    }

    /* renamed from: com.bytedance.android.live.core.g.m$b */
    public static class C3903b implements C13791d<C14045f> {

        /* renamed from: a */
        private ImageModel f10917a;

        /* renamed from: b */
        private C3910a f10918b;

        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, Object obj) {
        }

        public final void onRelease(String str) {
        }

        public C3903b(ImageModel imageModel, C3910a aVar) {
            this.f10917a = imageModel;
            this.f10918b = aVar;
        }

        public final void onSubmit(String str, Object obj) {
            if (this.f10918b != null) {
                this.f10918b.mo9270a(this.f10917a);
            }
        }

        public final void onFailure(String str, Throwable th) {
            if (this.f10918b != null) {
                this.f10918b.mo9272a(this.f10917a, new RuntimeException(th));
            }
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            int i;
            C14045f fVar = (C14045f) obj;
            boolean a = C3907q.m9871a().mo9268a(this.f10917a);
            int i2 = -1;
            if (fVar != null) {
                i = fVar.getWidth();
            } else {
                i = -1;
            }
            if (fVar != null) {
                i2 = fVar.getHeight();
            }
            if (this.f10917a != null) {
                C3907q a2 = C3907q.m9871a();
                ImageModel imageModel = this.f10917a;
                if (imageModel != null) {
                    List urls = imageModel.getUrls();
                    if (urls != null && !urls.isEmpty()) {
                        a2.f10924a.execute(new Runnable(urls) {

                            /* renamed from: a */
                            final /* synthetic */ List f10927a;

                            public final void run() {
                                synchronized (C3907q.this.f10926c) {
                                    C3907q.this.f10925b.removeAll(this.f10927a);
                                }
                            }

                            {
                                this.f10927a = r2;
                            }
                        });
                    }
                }
                this.f10917a.setLoaded(true);
            }
            if (this.f10918b != null) {
                this.f10918b.mo9271a(this.f10917a, i, i2, a);
            }
        }
    }

    /* renamed from: a */
    public static C14229b[] m9867a(ImageModel imageModel, C13952d dVar, C14234d dVar2, boolean z) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return new C14229b[0];
        }
        ArrayList arrayList = new ArrayList();
        C3853c cVar = new C3853c();
        for (String str : imageModel.getUrls()) {
            if (!C9431p.m18664a(str)) {
                C14232c a = C14232c.m29169a(Uri.parse(str));
                if (dVar2 != null) {
                    a.mo26458a(dVar2);
                }
                if (dVar != null) {
                    a.mo26453a(dVar);
                }
                cVar.mo9234a(a);
                arrayList.add(a.mo26449a());
            }
        }
        if (arrayList.size() == 0) {
            return new C14229b[0];
        }
        return (C14229b[]) arrayList.toArray(new C14229b[arrayList.size()]);
    }

    /* renamed from: a */
    public static void m9865a(String str, int i, int i2, C3911b bVar) {
        C14229b bVar2;
        ArrayList arrayList = new ArrayList();
        Uri parse = Uri.parse(str);
        if (parse == null) {
            bVar2 = null;
        } else {
            bVar2 = C14232c.m29169a(parse).mo26449a();
        }
        if (bVar2 != null) {
            arrayList.add(bVar2);
        }
        m9866a((C14229b[]) arrayList.toArray(new C14229b[arrayList.size()]), bVar);
    }

    /* renamed from: a */
    public static void m9866a(C14229b[] bVarArr, final C3911b bVar) {
        if (bVarArr != null && bVarArr.length != 0) {
            final C13745c a = C14017k.m28587a().mo26211e().mo26182a(bVarArr[0], (Object) null);
            a.mo25666a(new C14024b() {
                public final void onFailureImpl(C13745c<C13715a<C14042c>> cVar) {
                    if (cVar != null) {
                        cVar.mo25677g();
                    }
                    if (bVar != null) {
                        C3899m.m9864a((Runnable) new C3906p(bVar));
                    }
                }

                /* renamed from: a */
                public final void mo9012a(Bitmap bitmap) {
                    if (a.mo25672b() && bitmap != null) {
                        C3899m.m9864a((Runnable) new C3904n(bVar, Bitmap.createBitmap(bitmap)));
                    } else if (bVar != null) {
                        C3899m.m9864a((Runnable) new C3905o(bVar));
                    }
                    a.mo25677g();
                }
            }, C13660a.m27612a());
        }
    }

    /* renamed from: a */
    public static void m9864a(Runnable runnable) {
        f10904a.post(runnable);
    }

    /* renamed from: a */
    public static InputStream m9856a(Uri uri) {
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();
        try {
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
            C13771c.m27875c().mo26183a(C14232c.m29169a(uri).mo26449a(), (Object) null, (C14050c) null).mo25666a(new C13748e<C13715a<C13709h>>() {
                public final void onProgressUpdate(C13745c<C13715a<C13709h>> cVar) {
                }

                public final void onCancellation(C13745c<C13715a<C13709h>> cVar) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException unused) {
                    } finally {
                        cVar.mo25677g();
                    }
                }

                public final void onFailure(C13745c<C13715a<C13709h>> cVar) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException unused) {
                    } finally {
                        cVar.mo25677g();
                    }
                }

                public final void onNewResult(C13745c<C13715a<C13709h>> cVar) {
                    C13715a aVar = (C13715a) cVar.mo25674d();
                    if (aVar != null) {
                        C13709h hVar = (C13709h) aVar.mo25630a();
                        byte[] bArr = new byte[hVar.mo25608a()];
                        hVar.mo25609a(0, bArr, 0, hVar.mo25608a());
                        try {
                            pipedOutputStream.write(bArr);
                            pipedOutputStream.close();
                        } catch (IOException unused) {
                        } finally {
                            cVar.mo25677g();
                        }
                    }
                }
            }, AsyncTask.THREAD_POOL_EXECUTOR);
            return pipedInputStream;
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m9868b(HSImageView hSImageView, ImageModel imageModel) {
        m9863a(hSImageView, imageModel, null, -1, -1, null, null, false);
    }

    /* renamed from: b */
    public static void m9869b(HSImageView hSImageView, String str) {
        if (hSImageView != null && !TextUtils.isEmpty(str)) {
            if (!str.startsWith("file://")) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(str);
                str = sb.toString();
            }
            hSImageView.setImageURI(C14232c.m29169a(Uri.parse(str)).mo26449a().mSourceUri);
        }
    }

    /* renamed from: a */
    public static void m9857a(HSImageView hSImageView, ImageModel imageModel) {
        if (hSImageView != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            C14229b[] a = m9867a(imageModel, (C13952d) null, (C14234d) null, false);
            if (a != null && a.length != 0) {
                hSImageView.setController(((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(hSImageView.getController())).mo25755a((REQUEST[]) a)).mo25762c(true)).mo25763d());
            }
        }
    }

    /* renamed from: a */
    public static void m9860a(HSImageView hSImageView, String str) {
        if (hSImageView != null && !TextUtils.isEmpty(str)) {
            hSImageView.setImageURI(C14232c.m29169a(Uri.parse(str)).mo26449a().mSourceUri);
        }
    }

    /* renamed from: a */
    public static void m9858a(HSImageView hSImageView, ImageModel imageModel, C3910a aVar) {
        m9863a(hSImageView, imageModel, null, -1, -1, null, aVar, false);
    }

    /* renamed from: a */
    public static void m9859a(HSImageView hSImageView, ImageModel imageModel, C14234d dVar) {
        m9863a(hSImageView, imageModel, null, -1, -1, dVar, null, false);
    }

    /* renamed from: a */
    public static void m9861a(HSImageView hSImageView, String str, C14234d dVar) {
        if (hSImageView != null && !TextUtils.isEmpty(str) && dVar != null) {
            C14229b a = C14232c.m29169a(Uri.parse(str)).mo26458a(dVar).mo26449a();
            C13773e eVar = (C13773e) ((C13773e) C13771c.m27870a().mo25759b(hSImageView.getController())).mo25755a((REQUEST[]) new C14229b[]{a});
            hSImageView.setImageURI(a.mSourceUri);
            hSImageView.setController(eVar.mo25763d());
        }
    }

    /* renamed from: a */
    public static void m9863a(SimpleDraweeView simpleDraweeView, ImageModel imageModel, Drawable drawable, int i, int i2, C14234d dVar, C3910a aVar, boolean z) {
        m9862a(simpleDraweeView, imageModel, null, 300, i, i2, dVar, aVar, z, false);
    }

    /* renamed from: a */
    public static void m9862a(SimpleDraweeView simpleDraweeView, ImageModel imageModel, Drawable drawable, int i, int i2, int i3, C14234d dVar, C3910a aVar, boolean z, boolean z2) {
        if (simpleDraweeView != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            C13952d dVar2 = null;
            if (i2 < 0 || i3 < 0) {
                i2 = simpleDraweeView.getMeasuredWidth();
                i3 = simpleDraweeView.getMeasuredHeight();
            }
            if (i2 > 0 && i3 > 0) {
                dVar2 = new C13952d(i2, i3);
            }
            C14229b[] a = m9867a(imageModel, dVar2, dVar, z2);
            if (a != null && a.length != 0) {
                C13773e eVar = (C13773e) ((C13773e) C13771c.m27870a().mo25759b(simpleDraweeView.getController())).mo25755a((REQUEST[]) a);
                if (z) {
                    eVar.mo25762c(true);
                }
                if (drawable != null) {
                    if (simpleDraweeView.getHierarchy() == null) {
                        simpleDraweeView.setHierarchy(new C13834b(simpleDraweeView.getContext().getResources()).mo25913a(300).mo25916a(drawable).mo25917a(C13818b.f36067g).mo25912a());
                    } else {
                        C13833a aVar2 = (C13833a) simpleDraweeView.getHierarchy();
                        aVar2.mo25890a(300);
                        aVar2.mo25904b(drawable);
                        simpleDraweeView.setHierarchy(aVar2);
                    }
                }
                eVar.mo25751a((C13791d<? super INFO>) new C3903b<Object>(imageModel, aVar));
                simpleDraweeView.setController(eVar.mo25763d());
            }
        }
    }
}
