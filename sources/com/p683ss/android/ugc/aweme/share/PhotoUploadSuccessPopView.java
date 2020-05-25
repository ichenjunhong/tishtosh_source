package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p683ss.android.ugc.aweme.commercialize.model.C26131l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26132m;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26502cf;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26515i;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout;
import com.p683ss.android.ugc.aweme.common.widget.PullUpLayout.C26950b;
import com.p683ss.android.ugc.aweme.common.widget.scrollablelayout.C26989a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.photo.PhotoContext;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.share.libra.NonStandardAdPostExperiment;
import com.p683ss.android.ugc.aweme.share.p2155f.p2156a.C42010a.C42011a;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.share.PhotoUploadSuccessPopView */
public class PhotoUploadSuccessPopView extends PopupWindow implements C26989a {

    /* renamed from: a */
    public int f106090a = 4000;

    /* renamed from: b */
    Activity f106091b;

    /* renamed from: c */
    public View f106092c;
    RemoteImageView commerceIconView;
    View commerceLineView;
    TextView commerceMsgView;
    View commerceView;

    /* renamed from: d */
    public C41920a f106093d = new C41920a();

    /* renamed from: e */
    public boolean f106094e = false;

    /* renamed from: f */
    public long f106095f = 0;

    /* renamed from: g */
    private Aweme f106096g;

    /* renamed from: h */
    private PhotoContext f106097h;
    RelativeLayout mLayoutView;
    PullUpLayout mPullUpLayout;
    LinearLayout mRootLayout;
    LinearLayout mShareItemContainer;
    RemoteImageView mVideoCover;

    /* renamed from: com.ss.android.ugc.aweme.share.PhotoUploadSuccessPopView$a */
    class C41920a implements Runnable {

        /* renamed from: a */
        boolean f106101a;

        public final void run() {
            if (!this.f106101a && System.currentTimeMillis() >= PhotoUploadSuccessPopView.this.f106095f) {
                PhotoUploadSuccessPopView.this.mo85940b();
            }
        }

        private C41920a() {
        }
    }

    /* renamed from: a */
    public final void mo55136a() {
        this.f106094e = false;
        mo85940b();
    }

    /* renamed from: c */
    private boolean m91864c() {
        if (this.f106096g == null || this.f106096g.getCommerceStickerInfo() == null || !this.f106096g.getCommerceStickerInfo().enable()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo85940b() {
        if (isShowing() && !this.f106094e) {
            if (this.f106091b != null && !this.f106091b.isFinishing()) {
                this.mPullUpLayout.mo54988a(0.0f, true);
                dismiss();
            }
            this.f106091b = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void onClick(View view) {
        C41302w a = C41302w.m91042a();
        Activity activity = this.f106091b;
        StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
        sb.append(this.f106096g.getAid());
        a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "upload").mo83871a());
        AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().setPublishStatus(11);
        mo85940b();
    }

    public PhotoUploadSuccessPopView(Activity activity, Aweme aweme, PhotoContext photoContext) {
        super(activity);
        this.f106096g = aweme;
        this.f106092c = LayoutInflater.from(activity).inflate(R.layout.buu, null, false);
        this.f106091b = activity;
        this.f106097h = photoContext;
        ButterKnife.bind((Object) this, this.f106092c);
        int e = C9432q.m18695e(C11010c.m22280a());
        if (m91864c()) {
            setHeight(((int) C9432q.m18687b((Context) this.f106091b, 155.5f)) + e);
        } else {
            setHeight(((int) C9432q.m18687b((Context) this.f106091b, 110.0f)) + e);
        }
        setWidth(C9432q.m18670a((Context) this.f106091b));
        setContentView(this.f106092c);
        setBackgroundDrawable(this.f106091b.getResources().getDrawable(R.drawable.dhm));
        LayoutParams layoutParams = (LayoutParams) this.mLayoutView.getLayoutParams();
        layoutParams.setMargins(layoutParams.leftMargin, e, layoutParams.rightMargin, layoutParams.bottomMargin);
        this.mLayoutView.setLayoutParams(layoutParams);
        setAnimationStyle(R.style.wt);
        setClippingEnabled(false);
        update();
        C23515d.m57677a(this.mVideoCover, Uri.fromFile(new File(this.f106097h.mPhotoLocalPath)).toString());
        this.mPullUpLayout.mo54989a((View) this.mRootLayout, false);
        this.mPullUpLayout.setPullUpListener(this);
        this.mPullUpLayout.setInternalTouchEventListener(new C26950b() {
            /* renamed from: a */
            public final void mo55002a(MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        PhotoUploadSuccessPopView.this.f106094e = true;
                        if (PhotoUploadSuccessPopView.this.f106093d != null) {
                            PhotoUploadSuccessPopView.this.f106093d.f106101a = true;
                            return;
                        }
                        break;
                    case 1:
                        PhotoUploadSuccessPopView.this.f106094e = false;
                        PhotoUploadSuccessPopView.this.f106095f = System.currentTimeMillis() + ((long) PhotoUploadSuccessPopView.this.f106090a);
                        PhotoUploadSuccessPopView.this.f106093d.f106101a = false;
                        PhotoUploadSuccessPopView.this.f106092c.postDelayed(PhotoUploadSuccessPopView.this.f106093d, (long) PhotoUploadSuccessPopView.this.f106090a);
                        break;
                    case 2:
                        PhotoUploadSuccessPopView.this.f106094e = true;
                        return;
                }
            }
        });
        new C42011a(this.f106091b, this.f106096g, this.mShareItemContainer).mo86090a(this.f106096g, this.f106097h);
        if (m91864c()) {
            C26132m commerceStickerInfo = this.f106096g.getCommerceStickerInfo();
            this.commerceView.setVisibility(0);
            this.commerceLineView.setVisibility(0);
            C23515d.m57670a(this.commerceIconView, commerceStickerInfo.getIconUrl(), (int) C9432q.m18687b((Context) this.f106091b, 23.0f), (int) C9432q.m18687b((Context) this.f106091b, 23.0f));
            this.commerceMsgView.setText(commerceStickerInfo.getLetters());
            this.commerceView.setOnClickListener(new C42238u(commerceStickerInfo));
            C26890h.m65011a("show_link", C23089d.m56640a().mo47827a("prop_id", commerceStickerInfo.getCommerceStickerId()).mo47829a("enter_from", "release").mo47829a("link_type", "web_link").f61491a);
            return;
        }
        this.commerceView.setVisibility(8);
        this.commerceLineView.setVisibility(8);
        final Aweme aweme2 = this.f106096g;
        C26131l a = CommerceSettingsApi.m62160a();
        if (!(a == null || a.f69006a == null || !NonStandardAdPostExperiment.m92639a())) {
            ViewGroup viewGroup = (ViewGroup) this.f106092c.findViewById(R.id.c3q);
            viewGroup.setVisibility(0);
            ImageView imageView = (ImageView) this.f106092c.findViewById(R.id.c3t);
            Drawable a2 = C26502cf.m64047a(this.f106092c.getResources(), R.drawable.dxy);
            if (a2 == null) {
                imageView.setImageResource(R.color.in);
            } else {
                imageView.setImageDrawable(a2);
            }
            viewGroup.findViewById(R.id.c3s).bringToFront();
            DmtTextView dmtTextView = (DmtTextView) viewGroup.findViewById(R.id.c3v);
            if (TextUtils.isEmpty(a.f69006a.f69040b)) {
                dmtTextView.setVisibility(8);
            } else {
                dmtTextView.setVisibility(0);
                dmtTextView.setText(a.f69006a.f69040b);
            }
            C26515i.m64154a((RemoteImageView) viewGroup.findViewById(R.id.c3u), a.f69006a.f69039a, (C13791d<C14045f>) new C13790c<C14045f>() {
                public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
                    C14045f fVar = (C14045f) obj;
                    HashMap hashMap = new HashMap();
                    AwemeStatus status = aweme2.getStatus();
                    if (status != null) {
                        switch (status.getPrivateStatus()) {
                            case 0:
                                hashMap.put("privacy_status", "public");
                                break;
                            case 1:
                                hashMap.put("privacy_status", "private");
                                break;
                            case 2:
                                hashMap.put("privacy_status", "friend");
                                break;
                        }
                    }
                    hashMap.put("enter_from", "release");
                    C26890h.m65011a("show_ad_sticker", (Map<String, String>) hashMap);
                }
            });
            viewGroup.setOnClickListener(new C42244v(this, aweme2, a));
        }
    }
}
