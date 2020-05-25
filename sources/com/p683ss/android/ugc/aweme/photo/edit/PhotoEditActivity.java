package com.p683ss.android.ugc.aweme.photo.edit;

import android.app.Activity;
import android.app.ActivityOptions;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0636b;
import android.transition.Slide;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.medialib.image.C19340b;
import com.p683ss.android.medialib.image.C19340b.C19342a;
import com.p683ss.android.medialib.image.C19340b.C19343b;
import com.p683ss.android.medialib.image.ImageRenderView.C193372;
import com.p683ss.android.medialib.image.ImageRenderView.C19338a;
import com.p683ss.android.ugc.aweme.adaptation.BaseScreenAdaptActivity;
import com.p683ss.android.ugc.aweme.adaptation.C22452a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.filter.C31405ah;
import com.p683ss.android.ugc.aweme.filter.C31475n;
import com.p683ss.android.ugc.aweme.photo.C38681j;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.photo.PhotoView;
import com.p683ss.android.ugc.aweme.photo.edit.p2046a.C38670a;
import com.p683ss.android.ugc.aweme.photo.edit.p2046a.C38672b;
import com.p683ss.android.ugc.aweme.photo.edit.p2047b.C38674a;
import com.p683ss.android.ugc.aweme.photo.setfilter.EffectPhotoSetFilterActivity;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43650k;
import com.p683ss.android.ugc.aweme.shortvideo.p2264x.C45624b;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45547d;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity */
public class PhotoEditActivity extends BaseScreenAdaptActivity implements OnClickListener, C38674a {

    /* renamed from: b */
    public C38670a f98341b;

    /* renamed from: c */
    public PhotoView f98342c;

    /* renamed from: d */
    public boolean f98343d;

    /* renamed from: e */
    private RelativeLayout f98344e;

    /* renamed from: f */
    private RelativeLayout f98345f;

    /* renamed from: g */
    private C31405ah f98346g = C31475n.m73310a("PhotoEditActivity");

    /* renamed from: h */
    private ViewGroup f98347h;

    /* renamed from: i */
    private TextView f98348i;

    /* renamed from: j */
    private ImageView f98349j;

    /* renamed from: k */
    private View f98350k;

    /* renamed from: l */
    private C45547d f98351l;

    /* renamed from: d */
    public final PhotoView mo78592d() {
        return this.f98342c;
    }

    /* renamed from: e */
    public final ViewGroup mo78593e() {
        return this.f98347h;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onBackPressed() {
        this.f98349j.performClick();
    }

    /* renamed from: g */
    public final void mo78595g() {
        if (this.f98342c != null) {
            this.f98351l.dismiss();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C45412b.m98979a().leave(this, "video_edit");
    }

    /* renamed from: f */
    public final void mo78594f() {
        this.f98351l = C45546c.m99207a(this, getResources().getString(R.string.bqn));
    }

    public void onPause() {
        super.onPause();
        C45412b.m98979a().pause(this, "video_edit", this.f98341b.f98358b.creationId, this.f98341b.f98358b.mShootWay);
    }

    /* renamed from: b */
    public final void mo46740b() {
        int i;
        int i2;
        int i3;
        if (this.f98341b != null) {
            PhotoView photoView = this.f98342c;
            C38670a aVar = this.f98341b;
            if (aVar.f98358b == null) {
                i = C38681j.f98387a;
            } else {
                i = aVar.f98358b.mWidth;
            }
            C38670a aVar2 = this.f98341b;
            if (aVar2.f98358b == null) {
                i2 = C38681j.f98388b;
            } else {
                i2 = aVar2.f98358b.mHeight;
            }
            int c = C22452a.m55497c();
            if (photoView != null && i != 0 && i2 != 0) {
                int b = C43303dy.m94971b(C22452a.f60458a);
                LayoutParams layoutParams = new LayoutParams(-1, -1);
                int d = C22452a.m55498d();
                int b2 = C22452a.m55496b(c);
                if (i2 * 9 >= i * 16) {
                    layoutParams.height = b2;
                    layoutParams.topMargin = d;
                    layoutParams.width = (i * b2) / i2;
                    layoutParams.leftMargin = (C43303dy.m94971b(C22452a.f60458a) - layoutParams.width) / 2;
                } else {
                    layoutParams.width = b;
                    layoutParams.height = (i2 * b) / i;
                    layoutParams.topMargin = d + ((b2 - layoutParams.height) / 2);
                    if (layoutParams.topMargin >= 0) {
                        i3 = layoutParams.topMargin;
                    } else {
                        i3 = 0;
                    }
                    layoutParams.topMargin = i3;
                    layoutParams.leftMargin = 0;
                }
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(layoutParams.leftMargin);
                }
                photoView.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: c */
    public final void mo78591c(boolean z) {
        this.f98350k.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo46741b(boolean z) {
        int c = C22452a.m55497c();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f98345f.getLayoutParams();
        if (!z) {
            c = 0;
        }
        layoutParams.bottomMargin = c;
        this.f98345f.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo46739a(boolean z) {
        int i;
        int c = C43303dy.m94972c(this);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f98344e.getLayoutParams();
        if (z) {
            i = c;
        } else {
            i = 0;
        }
        layoutParams.topMargin = i;
        this.f98344e.setLayoutParams(layoutParams);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.d1b);
        LayoutParams layoutParams2 = (LayoutParams) relativeLayout.getLayoutParams();
        layoutParams2.topMargin = (int) (((float) c) + C9432q.m18687b((Context) this, 28.0f));
        relativeLayout.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.a2b);
        LayoutParams layoutParams3 = (LayoutParams) linearLayout.getLayoutParams();
        if (!z) {
            c = 0;
        }
        layoutParams3.topMargin = c;
        linearLayout.setLayoutParams(layoutParams3);
    }

    public void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        if (view.getId() == R.id.ij) {
            C26890h.m65008a((Context) this, "back_to_shoot", "mid_page", "0", "0", new C26898j().mo54849a("is_photo", "1").mo54850a());
            if (this.f98341b.f98358b.mPhotoFrom == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                new C10643a(this).mo18899b((int) R.string.aq9).mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18886a((int) R.string.aq8, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(PhotoEditActivity.this, C39618d.f101162c.mo74158d());
                        intent.setFlags(335544320);
                        PhotoEditActivity.this.startActivity(intent);
                        PhotoEditActivity.this.finish();
                    }
                }).mo18897a().mo18882b();
            } else {
                C39618d.f101149M.mo78421a(this, this.f98341b.f98358b);
                finish();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo78589a(View view) {
        C38670a aVar = this.f98341b;
        C26890h.m65008a((Context) (Activity) aVar.f98357a, "add_filter", "mid_page", "0", "0", aVar.mo78602a());
        Activity activity = (Activity) aVar.f98357a;
        PhotoContext photoContext = aVar.f98358b;
        boolean z = aVar.f98360d;
        PhotoView d = aVar.f98357a.mo78592d();
        Intent intent = new Intent();
        intent.setClass(activity, EffectPhotoSetFilterActivity.class);
        intent.putExtra("photo_model", photoContext);
        intent.putExtra("is_first_open_filter", z);
        if (VERSION.SDK_INT >= 21) {
            d.setTransitionName("photo");
            Slide slide = new Slide();
            slide.setDuration(300);
            activity.getWindow().setExitTransition(slide);
            activity.getWindow().setReenterTransition(slide);
            activity.startActivityForResult(intent, 1, ActivityOptions.makeSceneTransitionAnimation(activity, d, "photo").toBundle());
        } else {
            activity.startActivityForResult(intent, 1);
        }
        C26890h.m65011a("click_modify_entrance", C23089d.m56640a().mo47829a("creation_id", this.f98341b.f98358b.creationId).mo47829a("shoot_way", this.f98341b.f98358b.mShootWay).mo47829a("enter_from", "video_edit_page").mo47829a("content_type", "photo").mo47829a("content_source", "upload").mo47829a("enter_from", "video_edit_page").mo47829a("scene_id", "1004").f61491a);
    }

    public void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onCreate", true);
        C45412b.m98979a().enter(this, "video_edit");
        if (VERSION.SDK_INT >= 21) {
            getWindow().requestFeature(12);
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.d4);
        this.f98347h = (ViewGroup) findViewById(R.id.cfc);
        this.f98349j = (ImageView) findViewById(R.id.ij);
        this.f98349j.setOnClickListener(this);
        this.f98348i = (TextView) findViewById(R.id.bqp);
        this.f98348i.setOnClickListener(new C47687av() {
            /* renamed from: a */
            public final void mo59929a(View view) {
                C38670a aVar = PhotoEditActivity.this.f98341b;
                C26890h.m65008a((Context) (Activity) aVar.f98357a, "next", "mid_page", "0", "0", aVar.mo78602a());
                aVar.f98357a.mo78594f();
                aVar.f98357a.mo78590a(aVar.f98358b.getTmpPhotoPath(C39618d.f101160a), aVar);
            }
        });
        this.f98342c = (PhotoView) findViewById(R.id.bxm);
        this.f98350k = findViewById(R.id.af1);
        this.f98350k.setOnClickListener(new C38669a(this));
        this.f98344e = (RelativeLayout) findViewById(R.id.a0w);
        this.f98345f = (RelativeLayout) findViewById(R.id.a0v);
        this.f98345f.setVisibility(0);
        this.f98344e.setVisibility(0);
        C39618d.f101144H.mo58584o().mo64333c().mo64345a();
        this.f98341b = new C38670a(this);
        this.f98341b.f98361e = this.f98346g;
        Intent intent = getIntent();
        C38670a aVar = this.f98341b;
        aVar.f98358b = (PhotoContext) intent.getSerializableExtra("photo_model");
        aVar.f98357a.mo78591c(true);
        aVar.f98357a.mo78592d().mo78580a((C0184k) aVar.f98357a, aVar.f98358b);
        aVar.f98359c = new C43650k(aVar.f98357a.mo78593e(), (Context) aVar.f98357a, (C0184k) aVar.f98357a, C39618d.f101144H.mo58584o().mo64333c().mo64346b(aVar.f98358b.mFilterIndex));
        aVar.f98359c.mo88990a(1);
        aVar.f98359c.f110556b = aVar;
        PhotoView d = aVar.f98357a.mo78592d();
        d.getClass();
        aVar.f98362f = new C38672b(d);
        aVar.f98360d = true;
        String str2 = "enter_video_edit_page";
        C23089d a = C23089d.m56640a().mo47829a("creation_id", this.f98341b.f98358b.creationId).mo47829a("shoot_way", this.f98341b.f98358b.mShootWay).mo47826a("draft_id", this.f98341b.f98358b.draftId).mo47829a("filter_list", this.f98341b.f98358b.mFilterName).mo47826a("filter_id_list", this.f98341b.f98358b.mFilterId).mo47829a("content_type", "photo");
        String str3 = "content_source";
        if (this.f98341b.f98358b.mPhotoFrom == 0) {
            str = "upload";
        } else {
            str = "shoot";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).mo47826a("video_cnt", 0).mo47826a("pic_cnt", 1).mo47826a("is_multi_content", 0).mo47829a("mix_type", C45624b.m99356a(0, 1)).f61491a);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.photo.edit.PhotoEditActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m86002a(Context context, PhotoContext photoContext) {
        Intent intent = new Intent();
        intent.setClass(context, PhotoEditActivity.class);
        intent.putExtra("photo_model", photoContext);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo78590a(String str, C19338a aVar) {
        PhotoView photoView = this.f98342c;
        CompressFormat compressFormat = CompressFormat.PNG;
        C19340b bVar = photoView.f53431l;
        C193372 r3 = new C19342a(str, compressFormat, aVar) {

            /* renamed from: a */
            final /* synthetic */ String f53433a;

            /* renamed from: b */
            final /* synthetic */ CompressFormat f53434b;

            /* renamed from: c */
            final /* synthetic */ C19338a f53435c;

            /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0031 A[SYNTHETIC, Splitter:B:21:0x0031] */
            /* JADX WARNING: Removed duplicated region for block: B:26:0x0038  */
            /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo39871a(int r3, int r4, java.nio.ByteBuffer r5) {
                /*
                    r2 = this;
                    android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                    android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r0)
                    r3.copyPixelsFromBuffer(r5)
                    r4 = 0
                    java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
                    java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
                    java.lang.String r1 = r2.f53433a     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
                    r0.<init>(r1)     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
                    r5.<init>(r0)     // Catch:{ Exception -> 0x002e, all -> 0x0027 }
                    android.graphics.Bitmap$CompressFormat r4 = r2.f53434b     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
                    r0 = 80
                    r3.compress(r4, r0, r5)     // Catch:{ Exception -> 0x0025, all -> 0x0022 }
                    r3 = 1
                    r5.close()     // Catch:{ IOException -> 0x0034 }
                    goto L_0x0034
                L_0x0022:
                    r3 = move-exception
                    r4 = r5
                    goto L_0x0028
                L_0x0025:
                    r4 = r5
                    goto L_0x002e
                L_0x0027:
                    r3 = move-exception
                L_0x0028:
                    if (r4 == 0) goto L_0x002d
                    r4.close()     // Catch:{ IOException -> 0x002d }
                L_0x002d:
                    throw r3
                L_0x002e:
                    r3 = 0
                    if (r4 == 0) goto L_0x0034
                    r4.close()     // Catch:{ IOException -> 0x0034 }
                L_0x0034:
                    com.ss.android.medialib.image.ImageRenderView$a r4 = r2.f53435c
                    if (r4 == 0) goto L_0x003d
                    com.ss.android.medialib.image.ImageRenderView$a r4 = r2.f53435c
                    r4.mo39872a(r3)
                L_0x003d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.medialib.image.ImageRenderView.C193372.mo39871a(int, int, java.nio.ByteBuffer):void");
            }

            {
                this.f53433a = r2;
                this.f53434b = r3;
                this.f53435c = r4;
            }
        };
        bVar.f53448b = true;
        bVar.f53449c = r3;
        photoView.mo39815a();
    }

    public void onActivityReenter(int i, Intent intent) {
        super.onActivityReenter(i, intent);
        this.f98343d = false;
        this.f98342c.mo39817c();
        C39629l.m88232a().mo58586q();
        PhotoContext photoContext = (PhotoContext) intent.getSerializableExtra("photo_model");
        int intExtra = intent.getIntExtra("set_filter_result", 0);
        if (photoContext != null) {
            this.f98341b.mo78605a(photoContext, intExtra);
        }
        C0636b.m1720b(this);
        this.f98342c.setDrawFrameCallback(new C19343b() {
            /* renamed from: a */
            public final void mo39879a() {
                PhotoEditActivity.this.f98342c.post(new Runnable() {
                    public final void run() {
                        if (!PhotoEditActivity.this.f98343d) {
                            PhotoEditActivity.this.f98343d = true;
                            C0636b.m1721c(PhotoEditActivity.this);
                            PhotoEditActivity.this.f98342c.setDrawFrameCallback(null);
                        }
                    }
                });
            }
        });
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1 && VERSION.SDK_INT < 21) {
            PhotoContext photoContext = (PhotoContext) intent.getSerializableExtra("photo_model");
            int intExtra = intent.getIntExtra("set_filter_result", 0);
            if (photoContext != null) {
                this.f98341b.mo78605a(photoContext, intExtra);
            }
        }
        if (i == 1 && i2 == -1) {
            C38670a aVar = this.f98341b;
            PhotoContext photoContext2 = (PhotoContext) intent.getSerializableExtra("photo_model");
            aVar.f98358b.mText = photoContext2.mText;
            aVar.f98358b.mExtras = photoContext2.mExtras;
            aVar.f98358b.mIsPrivate = photoContext2.mIsPrivate;
            aVar.f98358b.mPoiId = photoContext2.mPoiId;
            aVar.f98358b.defaultSelectStickerPoi = photoContext2.defaultSelectStickerPoi;
            setResult(-1);
        }
    }
}
