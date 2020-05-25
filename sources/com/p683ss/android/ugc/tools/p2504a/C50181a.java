package com.p683ss.android.ugc.tools.p2504a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.support.p030v4.p038f.C0781c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.facebook.common.p918b.C13660a;
import com.facebook.common.p918b.C13670i;
import com.facebook.common.p924h.C13715a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.view.SimpleDraweeView;
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
import com.facebook.imagepipeline.p971k.C14048a;
import com.facebook.imagepipeline.p971k.C14050c;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.imagepipeline.p975o.C14234d;
import com.facebook.p929d.C13744b;
import com.facebook.p929d.C13745c;
import com.facebook.p929d.C13748e;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;

/* renamed from: com.ss.android.ugc.tools.a.a */
public final class C50181a {

    /* renamed from: com.ss.android.ugc.tools.a.a$a */
    public static class C50184a extends C13790c<C14045f> {

        /* renamed from: a */
        private final View f125734a;

        public C50184a(View view) {
            this.f125734a = view;
        }

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            if (fVar != null) {
                int width = fVar.getWidth();
                int height = fVar.getHeight();
                if (height > 0) {
                    LayoutParams layoutParams = this.f125734a.getLayoutParams();
                    layoutParams.width = (layoutParams.height * width) / height;
                    this.f125734a.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.a.a$b */
    public interface C50185b {
        /* renamed from: a */
        void mo86744a(C13745c<C13715a<C14042c>> cVar);

        /* renamed from: a */
        void mo86745a(Exception exc);
    }

    /* renamed from: a */
    public static void m108295a(SimpleDraweeView simpleDraweeView, String str, int i, int i2, Config config, C14050c cVar) {
        if (simpleDraweeView != null) {
            if (TextUtils.isEmpty(str)) {
                C39629l.m88232a().mo58564B();
                m108286a(simpleDraweeView, 2131953301);
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
            simpleDraweeView.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(simpleDraweeView.getController())).mo25757b(a.mo26455a(cVar).mo26449a())).mo25763d());
        }
    }

    /* renamed from: a */
    public static void m108296a(UrlModel urlModel, int i, int i2, final C0781c<Bitmap> cVar) {
        C14001h e = C14017k.m28587a().mo26211e();
        C14229b[] a = m108301a(urlModel, (i <= 0 || i2 <= 0) ? null : new C13952d(i, i2), (C14234d) null);
        if (a.length != 0) {
            final C13745c a2 = e.mo26182a(a[0], (Object) null);
            a2.mo25666a(new C14024b() {
                public final void onFailureImpl(C13745c<C13715a<C14042c>> cVar) {
                    if (cVar != null) {
                        cVar.mo25677g();
                    }
                    cVar.accept(null);
                }

                /* renamed from: a */
                public final void mo9012a(Bitmap bitmap) {
                    if (!a2.mo25672b() || bitmap == null) {
                        cVar.accept(null);
                        return;
                    }
                    cVar.accept(Bitmap.createBitmap(bitmap));
                    a2.mo25677g();
                }
            }, C13660a.m27612a());
        }
    }

    /* renamed from: a */
    public static C14229b[] m108301a(UrlModel urlModel, C13952d dVar, C14234d dVar2) {
        return m108300a(urlModel, dVar, C13951c.MEDIUM, dVar2, Config.RGB_565);
    }

    /* renamed from: a */
    private static C14229b[] m108300a(UrlModel urlModel, C13952d dVar, C13951c cVar, C14234d dVar2, Config config) {
        return C39629l.m88232a().mo58564B().mo74267a(urlModel, dVar, cVar, dVar2, config);
    }

    /* renamed from: a */
    public static boolean m108298a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C14017k.m28587a().mo26210d().mo25512d(C13978j.m28504a().mo26147c(C14229b.fromUri(uri), null));
    }

    /* renamed from: a */
    public static void m108297a(UrlModel urlModel, final C50185b bVar) {
        final C14229b[] a = m108301a(urlModel, (C13952d) null, (C14234d) null);
        final C14001h c = C13771c.m27875c();
        m108299a(c, a, 0, (C13748e<C13715a<C14042c>>) new C13744b<C13715a<C14042c>>() {

            /* renamed from: d */
            private int f125733d = 1;

            public final void onNewResultImpl(C13745c<C13715a<C14042c>> cVar) {
                bVar.mo86744a(cVar);
            }

            public final void onFailureImpl(C13745c<C13715a<C14042c>> cVar) {
                Throwable e = cVar.mo25675e();
                C14001h hVar = c;
                C14229b[] bVarArr = a;
                int i = this.f125733d;
                this.f125733d = i + 1;
                if (!C50181a.m108299a(hVar, bVarArr, i, (C13748e<C13715a<C14042c>>) this)) {
                    bVar.mo86745a((Exception) new RuntimeException(e));
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m108299a(C14001h hVar, C14229b[] bVarArr, int i, C13748e<C13715a<C14042c>> eVar) {
        if (i >= bVarArr.length) {
            return false;
        }
        hVar.mo26182a(bVarArr[i], (Object) null).mo25666a(eVar, C13670i.m27623a());
        return true;
    }

    /* renamed from: a */
    public static void m108287a(SimpleDraweeView simpleDraweeView, UrlModel urlModel) {
        m108289a(simpleDraweeView, urlModel, -1, -1, (C14234d) null);
    }

    /* renamed from: b */
    public static void m108302b(SimpleDraweeView simpleDraweeView, UrlModel urlModel) {
        m108290a(simpleDraweeView, urlModel, null);
    }

    /* renamed from: a */
    public static void m108286a(SimpleDraweeView simpleDraweeView, int i) {
        if (simpleDraweeView != null) {
            simpleDraweeView.setImageURI(C14232c.m29168a(i).mo26449a().mSourceUri);
        }
    }

    /* renamed from: a */
    public static void m108292a(SimpleDraweeView simpleDraweeView, String str) {
        m108293a(simpleDraweeView, str, -1, -1);
    }

    /* renamed from: b */
    private static void m108303b(SimpleDraweeView simpleDraweeView, UrlModel urlModel, C13791d<C14045f> dVar) {
        if (simpleDraweeView != null && urlModel != null && simpleDraweeView.getContext() != null) {
            C14229b[] a = m108301a(urlModel, (C13952d) null, (C14234d) null);
            if (a != null && a.length > 0) {
                C13773e eVar = (C13773e) ((C13773e) C13771c.m27870a().mo25759b(simpleDraweeView.getController())).mo25755a((REQUEST[]) a);
                eVar.mo25751a((C13791d<? super INFO>) new C50186b<Object>(m108285a(null, a[0].mSourceUri, simpleDraweeView.getContext(), urlModel), dVar));
                simpleDraweeView.setController(eVar.mo25763d());
            }
        }
    }

    /* renamed from: a */
    private static void m108290a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, C13791d<C14045f> dVar) {
        m108303b(simpleDraweeView, urlModel, new C50186b(null, new C50184a(simpleDraweeView)));
    }

    /* renamed from: a */
    public static C13791d<C14045f> m108285a(C13791d<C14045f> dVar, Uri uri, Context context, UrlModel urlModel) {
        return C39629l.m88232a().mo58564B().mo74264a(dVar, uri, context, urlModel);
    }

    /* renamed from: a */
    public static void m108288a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, int i, int i2) {
        m108289a(simpleDraweeView, urlModel, i, i2, (C14234d) null);
    }

    /* renamed from: b */
    public static void m108304b(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        if (simpleDraweeView != null && !TextUtils.isEmpty(str)) {
            C13952d dVar = null;
            if (i > 0 && i2 > 0) {
                dVar = new C13952d(i, i2);
            }
            C14232c a = C14232c.m29169a(Uri.parse(str));
            if (dVar != null) {
                a.mo26453a(dVar);
            }
            simpleDraweeView.setController(((C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25759b(simpleDraweeView.getController())).mo25757b(a.mo26449a())).mo25762c(true)).mo25763d());
        }
    }

    /* renamed from: a */
    private static void m108291a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, C13952d dVar, C14234d dVar2) {
        if (simpleDraweeView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            C14229b[] a = m108301a(urlModel, dVar, dVar2);
            if (a != null && a.length != 0) {
                simpleDraweeView.setController(((C13773e) ((C13773e) C13771c.m27870a().mo25759b(simpleDraweeView.getController())).mo25755a((REQUEST[]) a)).mo25763d());
            }
        }
    }

    /* renamed from: a */
    public static void m108293a(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        m108294a(simpleDraweeView, str, i, i2, Config.ARGB_8888);
    }

    /* renamed from: a */
    private static void m108289a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, int i, int i2, C14234d dVar) {
        C13952d dVar2;
        if (i <= 0 || i2 <= 0) {
            dVar2 = null;
        } else {
            dVar2 = new C13952d(i, i2);
        }
        m108291a(simpleDraweeView, urlModel, dVar2, (C14234d) null);
    }

    /* renamed from: a */
    public static void m108294a(SimpleDraweeView simpleDraweeView, String str, int i, int i2, Config config) {
        m108295a(simpleDraweeView, str, i, i2, Config.ARGB_8888, new C14048a());
    }
}
