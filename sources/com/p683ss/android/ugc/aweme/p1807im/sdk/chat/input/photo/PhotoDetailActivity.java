package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.photo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView.ScaleType;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p702im.core.p706c.C11207p;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.C33631o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.OnlyPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryPictureContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35277o;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.C35353a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.IViewInfo;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.PhotoDraweeView;
import com.ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity */
public class PhotoDetailActivity extends AmeActivity {

    /* renamed from: a */
    public View f87174a;

    /* renamed from: b */
    public View f87175b;

    /* renamed from: c */
    public DragView f87176c;

    /* renamed from: d */
    public View f87177d;

    /* renamed from: e */
    public PhotoDraweeView f87178e;

    /* renamed from: f */
    public int f87179f;

    /* renamed from: g */
    C11207p f87180g;

    /* renamed from: h */
    public boolean f87181h;

    /* renamed from: i */
    UrlModel f87182i;

    /* renamed from: j */
    OnlyPictureContent f87183j;

    /* renamed from: k */
    StoryPictureContent f87184k;

    /* renamed from: l */
    public boolean f87185l;

    /* renamed from: m */
    public MarginLayoutParams f87186m;

    /* renamed from: n */
    private IViewInfo f87187n;

    /* renamed from: o */
    private C33631o f87188o;

    public void onBackPressed() {
        mo71085b();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* renamed from: b */
    public final void mo71085b() {
        mo71084a();
        if (this.f87176c != null) {
            this.f87176c.mo73534a();
        }
    }

    /* renamed from: c */
    public final void mo71086c() {
        C33656j.m77094a().mo71135a(this, new C33651e(this));
    }

    /* renamed from: a */
    public final void mo71084a() {
        if (this.f87186m != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f87178e.getLayoutParams();
            marginLayoutParams.leftMargin = this.f87186m.leftMargin;
            marginLayoutParams.topMargin = this.f87186m.topMargin;
            marginLayoutParams.height = this.f87186m.height;
            marginLayoutParams.width = this.f87186m.width;
            this.f87178e.setLayoutParams(marginLayoutParams);
            this.f87178e.setScaleType(ScaleType.CENTER_CROP);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("drag_view_info", this.f87187n);
        bundle.putSerializable("photo_message", this.f87180g);
        bundle.putSerializable("photo_param", this.f87182i);
        bundle.putInt("photo_show_type", this.f87179f);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onCreate", true);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 19) {
            getWindow().addFlags(67108864);
        }
        setContentView((int) R.layout.bc8);
        this.f87185l = true;
        if (bundle != null) {
            this.f87182i = (UrlModel) bundle.getSerializable("photo_param");
            this.f87180g = (C11207p) bundle.getSerializable("photo_message");
            this.f87179f = bundle.getInt("photo_show_type", 0);
            this.f87187n = (IViewInfo) bundle.getParcelable("drag_view_info");
        } else {
            this.f87180g = (C11207p) getIntent().getSerializableExtra("photo_message");
            this.f87179f = getIntent().getIntExtra("photo_show_type", 0);
            this.f87187n = (IViewInfo) getIntent().getParcelableExtra("drag_view_info");
            if (this.f87180g.getMsgType() == 27) {
                this.f87184k = (StoryPictureContent) C35277o.m79760a(this.f87180g.getContent(), StoryPictureContent.class);
                if (this.f87184k != null) {
                    this.f87182i = this.f87184k.getUrl();
                    if (this.f87182i == null || TextUtils.isEmpty(this.f87182i.getUri())) {
                        this.f87182i = new UrlModel();
                        UrlModel urlModel = this.f87182i;
                        StringBuilder sb = new StringBuilder("file://");
                        sb.append(this.f87184k.getPicturePath());
                        urlModel.setUri(sb.toString());
                        this.f87182i.setWidth(this.f87184k.getWidth());
                        this.f87182i.setHeight(this.f87184k.getHeight());
                    } else {
                        this.f87182i.setWidth(this.f87184k.getWidth());
                        this.f87182i.setHeight(this.f87184k.getHeight());
                    }
                }
            } else if (this.f87180g.getMsgType() == 2) {
                this.f87183j = (OnlyPictureContent) C35277o.m79760a(this.f87180g.getContent(), OnlyPictureContent.class);
                if (this.f87183j != null) {
                    this.f87182i = this.f87183j.getUrl();
                    if (this.f87182i != null && !C9376b.m18558a((Collection<T>) this.f87182i.getUrlList())) {
                        this.f87182i.setWidth(this.f87183j.getWidth());
                        this.f87182i.setHeight(this.f87183j.getHeight());
                    } else if (!TextUtils.isEmpty(this.f87183j.getPicturePath())) {
                        this.f87182i = new UrlModel();
                        UrlModel urlModel2 = this.f87182i;
                        StringBuilder sb2 = new StringBuilder("file://");
                        sb2.append(this.f87183j.getPicturePath());
                        urlModel2.setUri(sb2.toString());
                        this.f87182i.setWidth(this.f87183j.getWidth());
                        this.f87182i.setHeight(this.f87183j.getHeight());
                        this.f87183j.setUrl(this.f87182i);
                    }
                }
            }
        }
        this.f87176c = (DragView) findViewById(R.id.b8v);
        if (VERSION.SDK_INT >= 19) {
            this.f87176c.setFullScreenWindow(true);
        }
        this.f87175b = findViewById(R.id.cfg);
        this.f87174a = findViewById(R.id.cgu);
        this.f87177d = LayoutInflater.from(this).inflate(R.layout.bf7, this.f87176c, false);
        this.f87178e = (PhotoDraweeView) this.f87177d.findViewById(R.id.b30);
        if (this.f87187n != null) {
            this.f87176c.mo73536a(this.f87177d, this.f87178e, this.f87187n);
        }
        PhotoDraweeView photoDraweeView = this.f87178e;
        C14229b[] a = C23515d.m57684a(this.f87182i, (C13952d) null, (C14234d) null);
        if (!(a == null || a.length == 0)) {
            C13773e eVar = (C13773e) ((C13773e) C13771c.m27870a().mo25759b(photoDraweeView.f90856a.f36129c)).mo25755a((REQUEST[]) a);
            eVar.mo25751a((C13791d<? super INFO>) new C13790c<C14045f>(a, null) {

                /* renamed from: a */
                final /* synthetic */ C14229b[] f90857a;

                /* renamed from: b */
                final /* synthetic */ C13791d f90858b;

                public final void onFailure(String str, Throwable th) {
                    super.onFailure(str, th);
                    if (this.f90858b != null) {
                        this.f90858b.onFailure(str, th);
                    }
                }

                public final void onSubmit(String str, Object obj) {
                    super.onSubmit(str, obj);
                    if (this.f90858b != null) {
                        this.f90858b.onSubmit(str, obj);
                    }
                }

                {
                    this.f90857a = r2;
                    this.f90858b = r3;
                }

                /* JADX WARNING: Removed duplicated region for block: B:37:0x0069  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void onFinalImageSet(java.lang.String r8, java.lang.Object r9, android.graphics.drawable.Animatable r10) {
                    /*
                        r7 = this;
                        com.facebook.imagepipeline.j.f r9 = (com.facebook.imagepipeline.p970j.C14045f) r9
                        super.onFinalImageSet(r8, r9, r10)
                        com.facebook.imagepipeline.e.h r0 = com.facebook.drawee.p930a.p931a.C13771c.m27875c()
                        r1 = 0
                        com.facebook.imagepipeline.o.b[] r2 = r7.f90857a     // Catch:{ all -> 0x0065 }
                        int r3 = r2.length     // Catch:{ all -> 0x0065 }
                        r4 = 0
                        r5 = r1
                    L_0x000f:
                        if (r4 >= r3) goto L_0x0031
                        r6 = r2[r4]     // Catch:{ all -> 0x002f }
                        com.facebook.d.c r6 = r0.mo26182a(r6, r1)     // Catch:{ all -> 0x002f }
                        if (r6 == 0) goto L_0x002b
                        java.lang.Object r5 = r6.mo25674d()     // Catch:{ all -> 0x0028 }
                        if (r5 == 0) goto L_0x002b
                        java.lang.Object r0 = r6.mo25674d()     // Catch:{ all -> 0x0028 }
                        com.facebook.common.h.a r0 = (com.facebook.common.p924h.C13715a) r0     // Catch:{ all -> 0x0028 }
                        r1 = r0
                        r5 = r6
                        goto L_0x0031
                    L_0x0028:
                        r8 = move-exception
                        r5 = r6
                        goto L_0x0067
                    L_0x002b:
                        int r4 = r4 + 1
                        r5 = r6
                        goto L_0x000f
                    L_0x002f:
                        r8 = move-exception
                        goto L_0x0067
                    L_0x0031:
                        if (r1 != 0) goto L_0x003c
                        if (r5 == 0) goto L_0x0038
                        r5.mo25677g()
                    L_0x0038:
                        com.facebook.common.p924h.C13715a.m27752c(r1)
                        return
                    L_0x003c:
                        java.lang.Object r0 = r1.mo25630a()     // Catch:{ all -> 0x002f }
                        com.facebook.imagepipeline.j.c r0 = (com.facebook.imagepipeline.p970j.C14042c) r0     // Catch:{ all -> 0x002f }
                        boolean r2 = r0 instanceof com.facebook.imagepipeline.p970j.C14043d     // Catch:{ all -> 0x002f }
                        if (r2 == 0) goto L_0x005c
                        com.facebook.imagepipeline.j.d r0 = (com.facebook.imagepipeline.p970j.C14043d) r0     // Catch:{ all -> 0x002f }
                        android.graphics.Bitmap r0 = r0.mo26257d()     // Catch:{ all -> 0x002f }
                        if (r0 == 0) goto L_0x005c
                        com.ss.android.ugc.aweme.im.sdk.widget.PhotoDraweeView r2 = com.p683ss.android.ugc.aweme.p1807im.sdk.widget.PhotoDraweeView.this     // Catch:{ all -> 0x002f }
                        r2.setImageBitmap(r0)     // Catch:{ all -> 0x002f }
                        com.facebook.drawee.c.d r0 = r7.f90858b     // Catch:{ all -> 0x002f }
                        if (r0 == 0) goto L_0x005c
                        com.facebook.drawee.c.d r0 = r7.f90858b     // Catch:{ all -> 0x002f }
                        r0.onFinalImageSet(r8, r9, r10)     // Catch:{ all -> 0x002f }
                    L_0x005c:
                        if (r5 == 0) goto L_0x0061
                        r5.mo25677g()
                    L_0x0061:
                        com.facebook.common.p924h.C13715a.m27752c(r1)
                        return
                    L_0x0065:
                        r8 = move-exception
                        r5 = r1
                    L_0x0067:
                        if (r5 == 0) goto L_0x006c
                        r5.mo25677g()
                    L_0x006c:
                        com.facebook.common.p924h.C13715a.m27752c(r1)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.widget.PhotoDraweeView.C353651.onFinalImageSet(java.lang.String, java.lang.Object, android.graphics.drawable.Animatable):void");
                }
            });
            photoDraweeView.f90856a.mo25979a((C13842a) eVar.mo25763d());
        }
        if (this.f87188o == null) {
            this.f87188o = new C33631o() {
                public final void onClick(View view) {
                    if (view.equals(PhotoDetailActivity.this.f87174a)) {
                        PhotoDetailActivity.this.mo71086c();
                        return;
                    }
                    if (view.equals(PhotoDetailActivity.this.f87175b) || view.equals(PhotoDetailActivity.this.f87177d)) {
                        PhotoDetailActivity.this.mo71085b();
                    }
                }

                public final boolean onLongClick(View view) {
                    if ((view.equals(PhotoDetailActivity.this.f87175b) || view.equals(PhotoDetailActivity.this.f87178e)) && !PhotoDetailActivity.this.f87181h) {
                        C26891a aVar = new C26891a(PhotoDetailActivity.this);
                        switch (PhotoDetailActivity.this.f87179f) {
                            case 0:
                            case 1:
                                aVar.mo54844a((CharSequence[]) new String[]{C11010c.m22280a().getString(R.string.bo1), C11010c.m22280a().getString(R.string.bmo)}, (OnClickListener) new C33652f(this));
                                aVar.mo54845b();
                                break;
                            case 2:
                                aVar.mo54844a((CharSequence[]) new String[]{C11010c.m22280a().getString(R.string.bmo)}, (OnClickListener) new C33653g(this));
                                aVar.mo54845b();
                                break;
                        }
                    } else {
                        return true;
                    }
                    return true;
                }
            };
        }
        C33631o.m77054a((View.OnClickListener) this.f87188o, this.f87175b, this.f87177d, this.f87174a);
        C33631o.m77055a((OnLongClickListener) this.f87188o, this.f87175b, this.f87178e);
        this.f87178e.setOnPhotoTapListener(new C33650d(this));
        this.f87176c.setDragStateListener(new C35353a() {
            /* renamed from: a */
            public final void mo71091a() {
            }

            /* renamed from: a */
            public final void mo71092a(ValueAnimator valueAnimator) {
            }

            /* renamed from: b */
            public final void mo71093b() {
            }

            /* renamed from: g */
            public final boolean mo71098g() {
                return false;
            }

            /* renamed from: h */
            public final boolean mo71099h() {
                return false;
            }

            /* renamed from: d */
            public final void mo71095d() {
                PhotoDetailActivity.this.mo71084a();
            }

            /* renamed from: e */
            public final void mo71096e() {
                PhotoDetailActivity.this.f87174a.setVisibility(8);
                PhotoDetailActivity.this.f87181h = true;
            }

            /* renamed from: f */
            public final void mo71097f() {
                PhotoDetailActivity.this.f87181h = false;
                PhotoDetailActivity.this.finish();
            }

            /* renamed from: c */
            public final void mo71094c() {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) PhotoDetailActivity.this.f87178e.getLayoutParams();
                if (PhotoDetailActivity.this.f87185l) {
                    PhotoDetailActivity.this.f87185l = false;
                    if (PhotoDetailActivity.this.f87186m == null) {
                        PhotoDetailActivity.this.f87186m = new MarginLayoutParams(PhotoDetailActivity.this.f87176c.getFullWidth(), PhotoDetailActivity.this.f87176c.getFullHeight());
                        PhotoDetailActivity.this.f87186m.leftMargin = marginLayoutParams.leftMargin;
                        PhotoDetailActivity.this.f87186m.topMargin = marginLayoutParams.topMargin;
                    }
                }
                if (PhotoDetailActivity.this.f87176c.getFullWidth() < PhotoDetailActivity.this.f87176c.getWidth() || PhotoDetailActivity.this.f87176c.getFullHeight() < PhotoDetailActivity.this.f87176c.getHeight()) {
                    PhotoDetailActivity.this.f87178e.setScaleType(ScaleType.FIT_CENTER);
                } else {
                    PhotoDetailActivity.this.f87178e.setScaleType(ScaleType.CENTER_CROP);
                }
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                marginLayoutParams.width = PhotoDetailActivity.this.f87176c.getWidth();
                marginLayoutParams.height = PhotoDetailActivity.this.f87176c.getHeight();
                PhotoDetailActivity.this.f87178e.setLayoutParams(marginLayoutParams);
                PhotoDetailActivity.this.f87174a.setVisibility(0);
                PhotoDetailActivity.this.f87181h = false;
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.chat.input.photo.PhotoDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m77056a(Context context, C11207p pVar, int i, IViewInfo iViewInfo) {
        Intent intent = new Intent(context, PhotoDetailActivity.class);
        intent.putExtra("drag_view_info", iViewInfo);
        intent.putExtra("photo_message", pVar);
        intent.putExtra("photo_show_type", i);
        context.startActivity(intent);
    }
}
