package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PinchImageView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PreviewBoxView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.PreviewBoxView.C40414a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.SwitchModeFrameLayout;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.SwitchModeFrameLayout.C40420a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39977k;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.profile.presenter.C39990w;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity */
public class ProfileCoverCropActivity extends AmeSSActivity implements C9382a, C39977k, C39985s {

    /* renamed from: a */
    Bitmap f102325a;

    /* renamed from: b */
    public Rect f102326b;

    /* renamed from: c */
    boolean f102327c;

    /* renamed from: d */
    boolean f102328d;

    /* renamed from: e */
    public Runnable f102329e = new C40292cd(this);

    /* renamed from: f */
    public boolean f102330f = true;

    /* renamed from: g */
    int f102331g;

    /* renamed from: h */
    float f102332h = 0.0f;

    /* renamed from: i */
    private C39990w f102333i;

    /* renamed from: j */
    private C39954ad f102334j;

    /* renamed from: k */
    private int f102335k;
    DmtTextView mCancel;
    DmtTextView mConfirm;
    PinchImageView mCoverImage;
    PreviewBoxView mCoverWindow;
    SwitchModeFrameLayout mCropContainer;
    ImageView mFakeShelter;
    View mFakeShelterTop;
    DmtStatusView mStatusView;
    View mTitleBar;

    /* renamed from: a */
    public final void mo54362a(boolean z) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C11065a.m22394b(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo82255a(C0013i iVar) throws Exception {
        if (iVar.mo26b()) {
            C39990w wVar = this.f102333i;
            String str = (String) iVar.mo34e();
            wVar.f101928c = str;
            wVar.mo81909a(0, str);
        }
        return null;
    }

    public void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            C22971a.m56494a(this, (Exception) message.obj, R.string.czy);
            return;
        }
        if (message.obj instanceof User) {
            C20902b.m53242a().setCurUser((User) message.obj);
            finish();
        }
    }

    /* renamed from: a */
    public final void mo81883a(AvatarUri avatarUri) {
        if (this.f102334j == null || avatarUri == null) {
            this.mStatusView.setVisibility(8);
            C10691a.m21542b((Context) this, (int) R.string.czz).mo19066a();
            return;
        }
        this.f102334j.mo81852a(avatarUri.uri, this.f102335k);
    }

    public void onViewClicked(View view) {
        if (this.mCoverImage.getPinchMode() == 0) {
            int id = view.getId();
            if (id == R.id.d7e) {
                finish();
                return;
            }
            if (id == R.id.d8c) {
                if (this.f102335k == 2) {
                    C26890h.m65011a("replace_profile_cover_finish", new C23089d().mo47829a("enter_method", "sys_album").f61491a);
                } else if (this.f102335k == 1) {
                    C26890h.m65011a("replace_profile_cover_finish", new C23089d().mo47829a("enter_method", "camera").f61491a);
                }
                this.mStatusView.mo19212f();
                C0013i.m16a((Callable<TResult>) new C40294cf<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C40295cg<TResult,TContinuationResult>(this), C0013i.f25b);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bod);
        ButterKnife.bind((Activity) this);
        String stringExtra = getIntent().getStringExtra("cover_url");
        this.f102335k = getIntent().getIntExtra("cover_source", 0);
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
        } else {
            this.f102331g = (int) (((float) C9432q.m18688b(this)) * 0.3f);
            this.f102325a = BitmapUtils.rotateBitmap(BitmapUtils.getBitmapFromSD(stringExtra, 1080, 1080), BitmapUtils.readPictureDegree(stringExtra));
            this.mCoverImage.setImageBitmap(this.f102325a);
            this.mFakeShelter.setImageResource(R.drawable.dq5);
            this.mCoverWindow.setTopOffset(this.f102331g);
            this.mCoverWindow.f103147f = new C40414a() {
                /* renamed from: a */
                public final void mo82258a() {
                    ProfileCoverCropActivity.this.mFakeShelter.setAlpha(0.0f);
                    ProfileCoverCropActivity.this.mFakeShelterTop.setAlpha(0.0f);
                }

                /* renamed from: a */
                public final void mo82259a(float f) {
                    int i;
                    ProfileCoverCropActivity profileCoverCropActivity = ProfileCoverCropActivity.this;
                    if (profileCoverCropActivity.f102332h == 0.0f) {
                        int a = C9432q.m18670a(C11010c.m22280a());
                        if (a * 2 <= C9432q.m18688b(C11010c.m22280a())) {
                            i = C22453b.m55512d(C11010c.m22280a());
                        } else {
                            i = 0;
                        }
                        profileCoverCropActivity.f102332h = ((((float) C9432q.m18670a(C11010c.m22280a())) / 3.0f) + (((float) i) / 2.0f)) / ((float) a);
                    }
                    if (!profileCoverCropActivity.f102327c && profileCoverCropActivity.f102326b != null) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) profileCoverCropActivity.mFakeShelter.getLayoutParams();
                        int b = (int) C9432q.m18687b(profileCoverCropActivity.mCoverWindow.getContext(), 16.0f);
                        float width = (((float) profileCoverCropActivity.f102331g) + (((float) profileCoverCropActivity.f102326b.width()) * profileCoverCropActivity.f102332h)) - C9432q.m18687b((Context) profileCoverCropActivity, 16.0f);
                        Rect rect = profileCoverCropActivity.f102326b;
                        float f2 = profileCoverCropActivity.f102332h;
                        marginLayoutParams.setMargins(b, (int) width, b, 0);
                        profileCoverCropActivity.mFakeShelter.setLayoutParams(marginLayoutParams);
                        profileCoverCropActivity.mFakeShelter.requestLayout();
                        profileCoverCropActivity.f102327c = true;
                    }
                    if (!profileCoverCropActivity.f102328d && profileCoverCropActivity.f102326b != null) {
                        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) profileCoverCropActivity.mFakeShelterTop.getLayoutParams();
                        int b2 = (int) C9432q.m18687b(profileCoverCropActivity.mCoverWindow.getContext(), 16.0f);
                        marginLayoutParams2.height = (int) ((((float) profileCoverCropActivity.f102326b.height()) - (((float) profileCoverCropActivity.f102326b.width()) * profileCoverCropActivity.f102332h)) / 2.0f);
                        marginLayoutParams2.setMargins(b2, profileCoverCropActivity.f102331g, b2, 0);
                        profileCoverCropActivity.mFakeShelterTop.setLayoutParams(marginLayoutParams2);
                        profileCoverCropActivity.mFakeShelterTop.requestLayout();
                        profileCoverCropActivity.f102327c = true;
                    }
                    ProfileCoverCropActivity.this.mFakeShelter.setAlpha(f);
                    ProfileCoverCropActivity.this.mFakeShelterTop.setAlpha(f / 2.0f);
                }
            };
            this.mCropContainer.setIntercepter(new C40420a() {
                /* renamed from: a */
                public final void mo82114a(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        ProfileCoverCropActivity.this.mCoverWindow.mo82687b();
                        if (ProfileCoverCropActivity.this.f102330f) {
                            ProfileCoverCropActivity.this.mCoverWindow.removeCallbacks(ProfileCoverCropActivity.this.f102329e);
                            ProfileCoverCropActivity.this.f102330f = false;
                        }
                    } else if (motionEvent.getAction() == 1) {
                        if (ProfileCoverCropActivity.this.f102326b == null) {
                            ProfileCoverCropActivity.this.f102326b = ProfileCoverCropActivity.this.mCoverWindow.getVisibleRect();
                        }
                        ProfileCoverCropActivity.this.mCoverWindow.mo82686a();
                    }
                }
            });
            this.mCoverWindow.addOnLayoutChangeListener(new C40293ce(this));
            this.mStatusView.setBuilder(C10719a.m21676a((Context) this));
            this.mCoverWindow.postDelayed(this.f102329e, 1000);
        }
        this.f102333i = new C39990w();
        this.f102333i.f101927b = this;
        this.f102334j = new C39954ad();
        this.f102334j.mo81850a((C39985s) this);
        if (VERSION.SDK_INT >= 19) {
            ((MarginLayoutParams) this.mTitleBar.getLayoutParams()).topMargin = C11065a.m22390a((Context) this);
            this.mTitleBar.requestLayout();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverCropActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo81884a(Exception exc) {
        if (isViewValid()) {
            this.mStatusView.setVisibility(8);
            C22971a.m56494a(this, exc, R.string.czz);
            C32458a.m75148a((Throwable) exc);
        }
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        if (isViewValid()) {
            C10691a.m21533a(C11010c.m22280a(), (int) R.string.czi).mo19066a();
            this.mStatusView.setVisibility(8);
            C20902b.m53242a().queryUser(new C9381g(Looper.getMainLooper(), this));
        }
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        if (isViewValid() && this.f102334j != null) {
            this.mStatusView.setVisibility(8);
            C22971a.m56494a(this, exc, R.string.czy);
        }
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        if (isViewValid()) {
            if (this.mStatusView != null) {
                this.mStatusView.mo19209d();
            }
            if (!TextUtils.isEmpty(str)) {
                C10691a.m21545b((Context) AwemeApplication.m56199a(), str).mo19066a();
                if (z) {
                    finish();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m89243a(Context context, String str, int i) {
        Intent intent = new Intent(context, ProfileCoverCropActivity.class);
        intent.putExtra("cover_url", str);
        intent.putExtra("cover_source", i);
        context.startActivity(intent);
    }
}
