package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.support.p030v4.app.C0636b;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.facebook.imagepipeline.common.C13950b;
import com.facebook.imagepipeline.common.C13952d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p964d.C13978j;
import com.facebook.imagepipeline.p965e.C14001h;
import com.facebook.imagepipeline.p965e.C14017k;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.facebook.p913b.C13613a;
import com.facebook.p913b.C13614b;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p683ss.android.ugc.aweme.commercialize.views.StateDmtTextView;
import com.p683ss.android.ugc.aweme.commercialize.views.StateDmtTextView.C26649a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.p1739a.C31351d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p684l.C10911b;
import com.p683ss.android.ugc.aweme.p684l.C10912c;
import com.p683ss.android.ugc.aweme.profile.C39715aa;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.share.p2150b.C41991a;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47720bh;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47933n;
import com.p683ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import com.p683ss.android.ugc.aweme.utils.ZoomAnimationUtils.ZoomInfo;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity */
public class HeaderDetailActivity extends AmeActivity implements C39978l, C39985s {

    /* renamed from: a */
    public static final String f102100a;
    @BindView(2131493045)
    View avatarDecoPanel;
    @BindView(2131493043)
    RemoteImageView avatorImage;

    /* renamed from: b */
    public Bitmap f102101b;
    @BindView(2131493072)
    View bgView;

    /* renamed from: c */
    public User f102102c;

    /* renamed from: d */
    private ZoomInfo f102103d;

    /* renamed from: e */
    private View f102104e;
    @BindView(2131495059)
    TextView editText;

    /* renamed from: f */
    private float f102105f;
    @BindView(2131493648)
    FixedRatioFrameLayout fixedRatioFrame;

    /* renamed from: g */
    private boolean f102106g = true;

    /* renamed from: h */
    private boolean f102107h = true;

    /* renamed from: i */
    private Challenge f102108i;

    /* renamed from: j */
    private String[] f102109j;

    /* renamed from: k */
    private C14229b[] f102110k;

    /* renamed from: l */
    private C39948a f102111l;

    /* renamed from: m */
    private C39954ad f102112m;
    @BindView(2131493854)
    AutoRTLImageView mBack;
    @BindView(2131493042)
    RelativeLayout mDecoActivityContainer;
    @BindView(2131493044)
    DmtTextView mDecoActivityText;
    @BindView(2131493047)
    TextView mDecoHintView;
    @BindView(2131493046)
    StateDmtTextView mDecoTextView;
    @BindView(2131493881)
    ImageView mDownloadView;
    @BindView(2131493923)
    View mMore;
    @BindView(2131494934)
    View mTitleBar;

    /* renamed from: n */
    private boolean f102113n;

    /* renamed from: o */
    private String f102114o;

    /* renamed from: p */
    private ObjectAnimator f102115p;
    @BindView(2131493933)
    ImageView progressBar;
    @BindView(2131493934)
    View progressBarBg;
    @BindView(2131494553)
    ViewGroup rootView;
    @BindView(2131495258)
    RemoteImageView userAvatar;

    /* renamed from: a */
    public final void mo54362a(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo82132c() {
        return false;
    }

    @OnClick({2131495059})
    public void editProfile() {
        mo82130b();
    }

    @OnClick({2131493854})
    public void onBackClick() {
        onBackPressed();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
        if (isViewValid() && this.f102111l != null) {
            this.f102111l.mo81848e();
            if ((exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 20022) {
                C18898c.m46009a(this, "profile_image_setting", "review_failure");
            }
            C22971a.m56494a(this, exc, R.string.cq);
        }
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
        this.f102113n = true;
        this.f102114o = str;
        if (this.f102111l != null && this.f102113n) {
            this.f102113n = false;
            this.f102111l.mo81847d();
        }
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        if (isViewValid() && this.f102112m != null && this.f102111l != null) {
            if (4 == i) {
                this.f102111l.mo81848e();
                if ((exc instanceof C23459a) && ((C23459a) exc).getErrorCode() == 20022) {
                    C18898c.m46009a(this, "profile_image_setting", "review_failure");
                }
            }
            if (i != 116) {
                C22971a.m56494a(this, exc, R.string.czy);
            }
        }
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        if (isViewValid()) {
            this.f102111l.mo81848e();
            if (!TextUtils.isEmpty(str)) {
                C10691a.m21545b(C11010c.m22280a(), str).mo19066a();
                if (z) {
                    finish();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo82130b() {
        this.f102111l.mo81843a(0);
    }

    @OnClick({2131493923})
    public void onMoreClick() {
        C40026s.f101964a.startChallengeAvatarModifyActivity(this, this.f102108i);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.ex);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f102115p != null) {
            this.f102115p.cancel();
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Environment.getExternalStorageDirectory());
        sb.append("/DCIM/Camera/");
        f102100a = sb.toString();
    }

    @OnClick({2131493881})
    public void saveBitmap() {
        this.progressBar.setVisibility(0);
        this.progressBarBg.setVisibility(0);
        this.mDownloadView.setVisibility(8);
        showLoadAnim(this.progressBar);
        C23361b.m57419a(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
            /* renamed from: a */
            public final void mo40906a(String[] strArr, int[] iArr) {
                if (iArr.length > 0) {
                    if (iArr[0] == -1) {
                        if (!C0636b.m1719a(HeaderDetailActivity.this, strArr[0])) {
                            C47700ay.m103234a(HeaderDetailActivity.this, R.string.kc, R.string.wf, null, R.string.ah4, new OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    C47720bh.m103294a(HeaderDetailActivity.this);
                                }
                            }).show();
                        }
                        HeaderDetailActivity.this.progressBar.clearAnimation();
                        HeaderDetailActivity.this.progressBar.setVisibility(8);
                        HeaderDetailActivity.this.progressBarBg.setVisibility(8);
                        HeaderDetailActivity.this.mDownloadView.setVisibility(0);
                    } else if (iArr[0] == 0) {
                        C18842a.m45932a(new Runnable() {
                            public final void run() {
                                String str;
                                if (HeaderDetailActivity.this.f102102c != null) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(HeaderDetailActivity.this.f102102c.getUid());
                                    sb.append("_avatar.png");
                                    str = sb.toString();
                                } else {
                                    str = "avatar.png";
                                }
                                HeaderDetailActivity.this.f102101b = BitmapUtils.getBitmapFromSD(HeaderDetailActivity.this.mo82128a());
                                if (BitmapUtils.saveBitmapToSD(HeaderDetailActivity.this.f102101b, HeaderDetailActivity.f102100a, str)) {
                                    HeaderDetailActivity headerDetailActivity = HeaderDetailActivity.this;
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(HeaderDetailActivity.f102100a);
                                    sb2.append(str);
                                    C41991a.m91954a(headerDetailActivity, sb2.toString());
                                    HeaderDetailActivity headerDetailActivity2 = HeaderDetailActivity.this;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(HeaderDetailActivity.f102100a);
                                    sb3.append(str);
                                    headerDetailActivity2.mo82131b(sb3.toString());
                                    HeaderDetailActivity headerDetailActivity3 = HeaderDetailActivity.this;
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append(HeaderDetailActivity.f102100a);
                                    sb4.append(str);
                                    String sb5 = sb4.toString();
                                    String str2 = Build.BRAND;
                                    if (!TextUtils.isEmpty(str2) && str2.toLowerCase().equals("vivo")) {
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append(Environment.getExternalStorageDirectory());
                                        sb6.append("/相机/");
                                        sb6.append(new File(sb5).getName());
                                        String sb7 = sb6.toString();
                                        C48016e.m103948c(sb5, sb7);
                                        StringBuilder sb8 = new StringBuilder("vivo: ");
                                        sb8.append(sb7);
                                        C32458a.m75144a(sb8.toString());
                                        headerDetailActivity3.mo82131b(sb7);
                                    }
                                    C18842a.m45934b(new Runnable() {
                                        public final void run() {
                                            C10691a.m21533a((Context) HeaderDetailActivity.this, (int) R.string.d_h).mo19066a();
                                            HeaderDetailActivity.this.progressBar.clearAnimation();
                                            HeaderDetailActivity.this.progressBar.setVisibility(8);
                                            HeaderDetailActivity.this.progressBarBg.setVisibility(8);
                                            HeaderDetailActivity.this.mDownloadView.setVisibility(0);
                                        }
                                    });
                                    return;
                                }
                                C18842a.m45934b(new Runnable() {
                                    public final void run() {
                                        C10691a.m21542b((Context) HeaderDetailActivity.this, (int) R.string.d_5).mo19066a();
                                        HeaderDetailActivity.this.progressBar.clearAnimation();
                                        HeaderDetailActivity.this.progressBar.setVisibility(8);
                                        HeaderDetailActivity.this.progressBarBg.setVisibility(8);
                                        HeaderDetailActivity.this.mDownloadView.setVisibility(0);
                                    }
                                });
                            }
                        });
                    }
                }
            }
        });
    }

    @OnClick({2131493046})
    public void onSetSameClicked() {
        if (C31357a.m73095a()) {
            C10912c e = C31357a.m73104e();
            if (e != null) {
                C10911b bVar = e.f29308i;
                if (bVar != null) {
                    String str = bVar.f29299c;
                    if (!TextUtils.isEmpty(str)) {
                        C40026s.f101964a.openFestivalPageWithSchema(this, str);
                        C26890h.m65011a("enter_activity_page", new C23089d().mo47829a("enter_from", "head").f61491a);
                        if (C31357a.m73095a()) {
                            C26890h.m65011a("xmas_photo_activity_click", new C23089d().mo47829a("enter_from", "others_homepage").mo47829a("gen", "donation").mo47829a("to_user_id", this.f102102c.getUid()).f61491a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo82128a() {
        C14229b[] bVarArr;
        boolean z;
        if (C23715d.m58203a((T[]) this.f102110k)) {
            return "";
        }
        for (C14229b bVar : this.f102110k) {
            if (bVar != null) {
                String str = "";
                if (bVar != null) {
                    if (bVar == null) {
                        z = false;
                    } else {
                        z = C14017k.m28587a().mo26210d().mo25512d(C13978j.m28504a().mo26147c(bVar, null));
                    }
                    if (z) {
                        C13613a a = C14017k.m28587a().mo26210d().mo25504a(C13978j.m28504a().mo26147c(bVar, null));
                        if (a != null) {
                            File file = ((C13614b) a).f35532a;
                            if (file != null) {
                                str = file.getAbsolutePath();
                            }
                        }
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
        }
        return "";
    }

    /* renamed from: d */
    public void mo82133d() {
        this.f102103d = (ZoomInfo) getIntent().getParcelableExtra("extra_zoom_info");
        this.f102109j = getIntent().getStringArrayExtra("uri");
        this.f102105f = getIntent().getFloatExtra("wh_ratio", 1.0f);
        this.f102102c = (User) getIntent().getSerializableExtra("share_info");
        boolean z = true;
        this.f102106g = getIntent().getBooleanExtra("enable_download_img", true);
        Intent intent = getIntent();
        String str = "enable_edit_img";
        if (this.f102102c == null || !C20854a.m53167g().isMe(this.f102102c.getUid())) {
            z = false;
        }
        this.f102107h = intent.getBooleanExtra(str, z);
        this.f102108i = (Challenge) getIntent().getSerializableExtra("challenge_info");
    }

    /* renamed from: b */
    public final void mo82131b(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
            intent.setData(Uri.fromFile(file));
            sendBroadcast(intent);
        }
    }

    /* renamed from: a */
    private static String m89054a(List<String> list) {
        C14001h c = C13771c.m27875c();
        for (String str : list) {
            if (c.mo26194c(Uri.parse(str))) {
                return str;
            }
        }
        return null;
    }

    /* renamed from: c */
    private C14229b mo82234c(String str) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Config.RGB_565);
        imageDecodeOptionsBuilder.mo26113a(false);
        C14232c a = C14232c.m29169a(Uri.parse(str)).mo26451a(new C13950b(imageDecodeOptionsBuilder));
        int[] d = m89058d(str);
        if (d != null && d[0] > 0 && d[1] > 0) {
            a.mo26453a(new C13952d(d[0], d[1]));
        }
        return a.mo26449a();
    }

    public void showLoadAnim(final View view) {
        this.f102115p = ObjectAnimator.ofFloat(view, "rotation", new float[]{0.0f, 360.0f});
        this.f102115p.setDuration(600);
        this.f102115p.setRepeatCount(-1);
        this.f102115p.setInterpolator(new LinearInterpolator());
        this.f102115p.start();
        this.f102115p.addListener(new AnimatorListener() {
            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationRepeat(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                view.setScaleX(0.0f);
                view.setScaleY(0.0f);
                view.setAlpha(0.0f);
                view.setRotation(0.0f);
                view.setVisibility(0);
            }
        });
    }

    /* renamed from: d */
    private static int[] m89058d(String str) {
        int i;
        Uri parse = Uri.parse(str);
        if (!C48016e.m103944b(parse.getPath())) {
            return null;
        }
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(parse.getPath(), options);
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (i2 > 720 || i3 > 1280) {
            int i4 = i2 >> 1;
            int i5 = i3 >> 1;
            i = 1;
            while (i4 / i > 720 && i5 / i > 1280) {
                i <<= 1;
            }
        } else {
            i = 1;
        }
        return new int[]{i2 >> i, i3 >> i};
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bob);
        ButterKnife.bind((Activity) this);
        overridePendingTransition(R.anim.ew, R.anim.ex);
        this.f102104e = findViewById(16908290);
        mo82133d();
        this.fixedRatioFrame.setWhRatio(this.f102105f);
        ((C13833a) this.userAvatar.getHierarchy()).mo25898a(C13818b.f36063c);
        mo82129a(this.userAvatar, true, this.f102109j);
        this.f102111l = new C39948a();
        this.f102111l.f101827c = this;
        this.f102111l.mo80925b(this, null);
        this.f102112m = new C39954ad();
        this.f102112m.mo81850a((C39985s) this);
        this.rootView.setBackgroundColor(-16777216);
        this.rootView.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (HeaderDetailActivity.this.mTitleBar.getVisibility() != 0) {
                    HeaderDetailActivity.this.onBackPressed();
                }
            }
        });
        if (this.f102106g) {
            this.mDownloadView.setVisibility(0);
            this.bgView.setVisibility(0);
        }
        int i = 8;
        if (C31357a.m73095a() && this.f102102c != null && !C47915gg.m103664m(this.f102102c) && this.f102108i == null && this.f102102c.isActivityUser()) {
            this.avatarDecoPanel.setVisibility(0);
            this.mDecoTextView.setOnStateChangedListener(new C26649a() {

                /* renamed from: b */
                private ViewPropertyAnimator f102119b;

                /* renamed from: c */
                private boolean f102120c = HeaderDetailActivity.this.mDecoTextView.isPressed();

                /* renamed from: a */
                public final void mo54482a() {
                    float f;
                    boolean isPressed = HeaderDetailActivity.this.mDecoTextView.isPressed();
                    if (this.f102120c != isPressed) {
                        this.f102120c = isPressed;
                        if (this.f102119b != null) {
                            this.f102119b.cancel();
                            this.f102119b = null;
                        }
                        ViewPropertyAnimator animate = HeaderDetailActivity.this.mDecoTextView.animate();
                        if (isPressed) {
                            f = 0.75f;
                        } else {
                            f = 1.0f;
                        }
                        this.f102119b = animate.alpha(f).setDuration(150);
                        this.f102119b.start();
                    }
                }
            });
            this.mDecoTextView.setVisibility(8);
            this.mDecoActivityContainer.setVisibility(0);
            this.mDecoActivityContainer.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    HeaderDetailActivity.this.onSetSameClicked();
                }
            });
            C10912c e = C31357a.m73104e();
            if (!(e == null || e.f29308i == null)) {
                this.mDecoActivityText.setText(e.f29308i.f29298b);
                this.mDecoHintView.setText(e.f29308i.f29297a);
                this.avatorImage.setImageDrawable(C31351d.m73085b());
            }
        }
        if (this.f102107h && !C47915gg.m103651b()) {
            this.editText.setVisibility(0);
        }
        if (this.f102108i != null) {
            this.mTitleBar.setVisibility(0);
            if (!C20902b.m53242a().isLogin() || this.f102108i.getDisplayCount() < 500000 || this.f102108i.isCommerce()) {
                z = false;
            }
            View view = this.mMore;
            if (z) {
                i = 0;
            }
            view.setVisibility(i);
            this.mBack.setImageDrawable(getResources().getDrawable(R.drawable.do0));
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.HeaderDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
        this.f102111l.mo81848e();
        if (avatarUri == null) {
            C10691a.m21542b((Context) this, (int) R.string.cq).mo19066a();
            return;
        }
        this.f102112m.mo81855b(avatarUri.uri);
        StringBuilder sb = new StringBuilder("file://");
        sb.append(this.f102114o);
        Uri parse = Uri.parse(sb.toString());
        C13771c.m27875c().mo26191b(parse);
        mo82129a(this.userAvatar, false, parse.toString());
    }

    /* renamed from: a */
    public static void m89055a(Activity activity, Bundle bundle) {
        if (activity != null) {
            Intent intent = new Intent(activity, C39715aa.m88417a());
            intent.putExtras(bundle);
            activity.startActivity(intent);
            activity.overridePendingTransition(0, 0);
        }
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        this.f102113n = true;
        if (i == 4) {
            if (user.getAvatarMedium() != null) {
                mo82129a(this.userAvatar, false, (String[]) user.getAvatarMedium().getUrlList().toArray(new String[user.getAvatarMedium().getUrlList().size()]));
            } else {
                C23515d.m57669a(this.userAvatar, user.getAvatarMedium());
            }
            C10691a.m21533a(C11010c.m22280a(), (int) R.string.czi).mo19066a();
        }
        if (this.f102111l != null) {
            this.f102111l.mo81848e();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!this.f102111l.mo80923a(i, i2, intent)) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82129a(RemoteImageView remoteImageView, boolean z, String... strArr) {
        String str;
        if (remoteImageView != null) {
            ArrayList arrayList = new ArrayList();
            if (!C23715d.m58203a((T[]) strArr)) {
                for (String str2 : strArr) {
                    if (!C9431p.m18664a(str2)) {
                        arrayList.add(mo82234c(str2));
                    }
                }
            }
            Object obj = null;
            if (z) {
                UrlModel a = C47933n.m103706a(this.f102102c);
                if (a != null) {
                    str = m89054a(a.getUrlList());
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    obj = mo82234c(str);
                }
                if (C23715d.m58202a((Collection<T>) arrayList)) {
                    C23515d.m57668a(remoteImageView, 2131953301);
                    return;
                }
            }
            this.f102110k = new C14229b[arrayList.size()];
            C13773e eVar = (C13773e) ((C13773e) ((C13773e) C13771c.m27870a().mo25755a((REQUEST[]) arrayList.toArray(this.f102110k))).mo25759b(remoteImageView.getController())).mo25762c(mo82132c());
            if (obj != null) {
                eVar.mo25761c(obj);
            }
            remoteImageView.setController(eVar.mo25763d());
        }
    }

    /* renamed from: a */
    public static void m89056a(Activity activity, View view, float f, User user, boolean z, boolean z2, Challenge challenge, String... strArr) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_zoom_info", ZoomAnimationUtils.m103150a(view));
        bundle.putStringArray("uri", strArr);
        bundle.putFloat("wh_ratio", f);
        bundle.putBoolean("enable_download_img", z);
        bundle.putBoolean("handle_with_video_avatar", z2);
        if (user != null) {
            bundle.putSerializable("share_info", user);
        }
        if (challenge != null) {
            bundle.putSerializable("challenge_info", challenge);
        }
        m89055a(activity, bundle);
    }
}
