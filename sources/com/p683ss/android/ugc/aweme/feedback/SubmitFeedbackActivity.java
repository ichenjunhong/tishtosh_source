package com.p683ss.android.ugc.aweme.feedback;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p523c.C9393e;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.uikit.dialog.C11104b.C11105a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.newmedia.C19547d;
import com.p683ss.android.sdk.app.C19730c;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.login.loginlog.C21378a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.p1149d.p1150a.C18964a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p2377ug.C47408a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47663ad;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity */
public class SubmitFeedbackActivity extends AmeBaseActivity implements C9382a {

    /* renamed from: A */
    protected static final ColorFilter f81906A = new ColorMatrixColorFilter(new float[]{0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});

    /* renamed from: B */
    private ImageView f81907B;

    /* renamed from: C */
    private View f81908C;

    /* renamed from: D */
    private TextView f81909D;

    /* renamed from: E */
    private WeakReference<FeedbackThread2> f81910E;

    /* renamed from: F */
    private ColorFilter f81911F;

    /* renamed from: G */
    private boolean f81912G = true;

    /* renamed from: H */
    private boolean f81913H = false;

    /* renamed from: a */
    public EditText f81914a;

    /* renamed from: b */
    EditText f81915b;

    /* renamed from: c */
    DmtStatusView f81916c;

    /* renamed from: d */
    public String f81917d;

    /* renamed from: e */
    public C9381g f81918e = new C9381g(this);

    /* renamed from: f */
    public InputMethodManager f81919f;

    /* renamed from: r */
    public String f81920r;

    /* renamed from: s */
    public String f81921s;

    /* renamed from: t */
    public String f81922t;

    /* renamed from: u */
    boolean f81923u = false;

    /* renamed from: v */
    public String f81924v;

    /* renamed from: w */
    public String f81925w;

    /* renamed from: x */
    public long f81926x;

    /* renamed from: y */
    int f81927y;

    /* renamed from: z */
    protected String f81928z = "";

    /* renamed from: a */
    public int mo46324a() {
        return R.layout.b4o;
    }

    /* renamed from: i */
    public final int mo48541i() {
        return R.color.a7k;
    }

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: j */
    public final void mo48542j() {
        mo64151d();
        super.mo48542j();
    }

    public void onPostResume() {
        super.onPostResume();
        this.f81915b.postDelayed(new Runnable() {
            public final void run() {
                if (SubmitFeedbackActivity.this.f81914a.requestFocus() && SubmitFeedbackActivity.this.f81919f != null) {
                    SubmitFeedbackActivity.this.f81919f.showSoftInput(SubmitFeedbackActivity.this.f81914a, 1);
                }
            }
        }, 200);
    }

    public void setStatusBarColor() {
        getResources().getColor(R.color.a0_);
    }

    /* renamed from: d */
    public final void mo64151d() {
        if (this.f81919f != null) {
            this.f81919f.hideSoftInputFromWindow(getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    /* renamed from: h */
    public final int mo48540h() {
        this.f81912G = getResources().getBoolean(R.bool.s);
        if (this.f81912G) {
            return 0;
        }
        return 2;
    }

    public void onBackPressed() {
        if (!isFinishing()) {
            Intent intent = null;
            if (isTaskRoot()) {
                intent = C18920g.m46046a((Context) this, getPackageName());
            }
            if (intent != null) {
                finish();
                startActivity(intent);
                return;
            }
            setResult(0);
            finish();
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f81915b != null) {
            this.f81928z = this.f81915b.getText().toString();
            Editor edit = C35807d.m80935a(this, "contact_info", 0).edit();
            edit.putString("contact_info", this.f81928z);
            C9402b.m18594a(edit);
        }
        if (this.f81910E != null) {
            FeedbackThread2 feedbackThread2 = (FeedbackThread2) this.f81910E.get();
            if (feedbackThread2 != null) {
                feedbackThread2.f81897b = true;
                if (feedbackThread2.f81896a != null) {
                    for (int i = 0; i < feedbackThread2.f81896a.length; i++) {
                        if (feedbackThread2.f81896a[i] != null) {
                            try {
                                feedbackThread2.f81896a[i].mo18243a();
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            this.f81910E.clear();
            this.f81910E = null;
        }
        this.f81923u = false;
        this.f81916c.mo19209d();
    }

    /* renamed from: b */
    public final void mo46325b() {
        super.mo46325b();
        Intent intent = getIntent();
        if (intent != null) {
            this.f81924v = intent.getStringExtra("feedback_id");
            this.f81925w = intent.getStringExtra("enter_from");
            this.f81917d = Uri.decode(intent.getStringExtra("img_url"));
            this.f81926x = intent.getLongExtra("roomId", 0);
            this.f81927y = intent.getIntExtra("from_live", 0);
        }
        if (this.f81913H) {
            this.f81925w = "rating_popup";
        }
        this.f81919f = (InputMethodManager) getSystemService("input_method");
        File a = C48016e.m103934a("feedback");
        if (a != null) {
            this.f81920r = a.getPath();
        } else {
            this.f81920r = "";
        }
        this.f81922t = "camera.data";
        this.f81921s = "upload.data";
        C26890h.m65011a("enter_feedback_edit_page", new C23089d().mo47829a("faq_id", this.f81924v).mo47829a("page_type", "app").f61491a);
        mo64150c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo64150c() {
        this.f62462n.setText(R.string.e0a);
        this.f62461m.setText(R.string.bv5);
        this.f62461m.setVisibility(0);
        this.f62461m.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                boolean z;
                String str;
                ClickInstrumentation.onClick(view);
                if (!C32800a.m75679a(SubmitFeedbackActivity.this.f62461m)) {
                    SubmitFeedbackActivity submitFeedbackActivity = SubmitFeedbackActivity.this;
                    if (!submitFeedbackActivity.f81923u) {
                        if (!C31344u.m73069a(submitFeedbackActivity)) {
                            C9432q.m18673a((Context) submitFeedbackActivity, 2131952652, (int) R.string.dnd);
                        } else {
                            String obj = submitFeedbackActivity.f81914a.getText().toString();
                            EditText editText = submitFeedbackActivity.f81914a;
                            if (C9431p.m18664a(obj) || obj.length() < 2) {
                                C9432q.m18673a((Context) submitFeedbackActivity, 2131952652, (int) R.string.brd);
                                editText.requestFocus();
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                submitFeedbackActivity.f81923u = true;
                                submitFeedbackActivity.f81916c.mo19212f();
                                if (submitFeedbackActivity.f81926x == 0 && submitFeedbackActivity.f81927y == 0) {
                                    str = "click_send_feedback";
                                } else {
                                    str = "livesdk_click_send_feedback";
                                }
                                C26890h.m65011a(str, C23089d.m56640a().mo47829a("enter_from", submitFeedbackActivity.f81925w).mo47829a("faq_id", submitFeedbackActivity.f81924v).mo47829a("uid", C20854a.m53167g().getCurUserId()).f61491a);
                                String obj2 = submitFeedbackActivity.f81915b.getText().toString();
                                if (submitFeedbackActivity.getIntent() != null) {
                                    String stringExtra = submitFeedbackActivity.getIntent().getStringExtra("username");
                                    if (!TextUtils.isEmpty(obj2)) {
                                        StringBuilder sb = new StringBuilder(" username:");
                                        sb.append(stringExtra);
                                        obj2 = obj2.concat(sb.toString());
                                    } else {
                                        StringBuilder sb2 = new StringBuilder("username:");
                                        sb2.append(stringExtra);
                                        obj2 = sb2.toString();
                                    }
                                }
                                if (!C9431p.m18664a(submitFeedbackActivity.f81917d)) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(submitFeedbackActivity.f81920r);
                                    sb3.append("/");
                                    sb3.append(submitFeedbackActivity.f81921s);
                                    if (!sb3.toString().equals(submitFeedbackActivity.f81917d)) {
                                        new C9393e(obj, obj2) {

                                            /* renamed from: a */
                                            final /* synthetic */ String f81935a;

                                            /* renamed from: b */
                                            final /* synthetic */ String f81936b;

                                            public final void run() {
                                                Bitmap rotateBitmap = BitmapUtils.rotateBitmap(BitmapUtils.getBitmapFromSD(SubmitFeedbackActivity.this.f81917d, 1000), BitmapUtils.readPictureDegree(SubmitFeedbackActivity.this.f81917d));
                                                if (rotateBitmap != null) {
                                                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                    rotateBitmap.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
                                                    BitmapUtils.saveImageData(byteArrayOutputStream.toByteArray(), SubmitFeedbackActivity.this.f81920r, SubmitFeedbackActivity.this.f81921s);
                                                    SubmitFeedbackActivity submitFeedbackActivity = SubmitFeedbackActivity.this;
                                                    StringBuilder sb = new StringBuilder();
                                                    sb.append(SubmitFeedbackActivity.this.f81920r);
                                                    sb.append("/");
                                                    sb.append(SubmitFeedbackActivity.this.f81921s);
                                                    submitFeedbackActivity.f81917d = sb.toString();
                                                }
                                                C31289r rVar = new C31289r();
                                                rVar.f82022a = this.f81935a;
                                                rVar.f82023b = this.f81936b;
                                                rVar.f82027f = SubmitFeedbackActivity.this.f81917d;
                                                rVar.f82034m = SubmitFeedbackActivity.this.f81925w;
                                                rVar.f82030i = C21378a.m53998a().mo45513b();
                                                rVar.f82031j = C20854a.m53167g().getLastUid();
                                                User curUser = C20854a.m53167g().getCurUser();
                                                if (curUser != null) {
                                                    rVar.f82032k = curUser.getSignature();
                                                }
                                                if (!TextUtils.isEmpty(SubmitFeedbackActivity.this.f81924v)) {
                                                    rVar.f82028g = SubmitFeedbackActivity.this.f81924v;
                                                }
                                                if (SubmitFeedbackActivity.this.f81926x != 0) {
                                                    rVar.f82033l = SubmitFeedbackActivity.this.f81926x;
                                                }
                                                Message obtainMessage = SubmitFeedbackActivity.this.f81918e.obtainMessage(10007);
                                                obtainMessage.obj = rVar;
                                                SubmitFeedbackActivity.this.f81918e.sendMessage(obtainMessage);
                                            }

                                            {
                                                this.f81935a = r2;
                                                this.f81936b = r3;
                                            }
                                        }.start();
                                    }
                                }
                                C31289r rVar = new C31289r();
                                rVar.f82022a = obj;
                                rVar.f82023b = obj2;
                                rVar.f82027f = submitFeedbackActivity.f81917d;
                                rVar.f82034m = submitFeedbackActivity.f81925w;
                                rVar.f82030i = C21378a.m53998a().mo45513b();
                                rVar.f82031j = C20854a.m53167g().getLastUid();
                                if (!TextUtils.isEmpty(submitFeedbackActivity.f81924v)) {
                                    rVar.f82028g = submitFeedbackActivity.f81924v;
                                }
                                User curUser = C20854a.m53167g().getCurUser();
                                if (curUser != null) {
                                    rVar.f82032k = curUser.getSignature();
                                }
                                if (submitFeedbackActivity.f81926x != 0) {
                                    rVar.f82033l = submitFeedbackActivity.f81926x;
                                }
                                submitFeedbackActivity.mo64149a(rVar);
                            }
                        }
                    }
                    C18964a.m46136a();
                }
            }
        });
        this.f81907B = (ImageView) findViewById(R.id.ar_);
        this.f81907B.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SubmitFeedbackActivity submitFeedbackActivity = SubmitFeedbackActivity.this;
                String[] stringArray = submitFeedbackActivity.getResources().getStringArray(R.array.az);
                C11105a aVar = new C11105a(submitFeedbackActivity);
                aVar.mo20142a((CharSequence[]) stringArray, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (TextUtils.isEmpty(SubmitFeedbackActivity.this.f81920r)) {
                            C10691a.m21542b((Context) SubmitFeedbackActivity.this, (int) R.string.da8).mo19066a();
                            return;
                        }
                        C26890h.m65011a("click_image_choose", C23089d.m56640a().mo47829a("enter_from", SubmitFeedbackActivity.this.f81925w).mo47829a("faq_id", SubmitFeedbackActivity.this.f81924v).mo47829a("type", "single").f61491a);
                        SubmitFeedbackActivity.this.mo64151d();
                        switch (i) {
                            case 0:
                                C23361b.m57419a(SubmitFeedbackActivity.this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C23364b() {
                                    /* renamed from: a */
                                    public final void mo40906a(String[] strArr, int[] iArr) {
                                        if (strArr.length <= 0 || iArr[0] != 0) {
                                            C31283l.m73010a(SubmitFeedbackActivity.this);
                                            return;
                                        }
                                        C26890h.m65011a("enter_image_choose", C23089d.m56640a().mo47829a("enter_from", SubmitFeedbackActivity.this.f81925w).mo47829a("faq_id", SubmitFeedbackActivity.this.f81924v).mo47829a("type", "single").f61491a);
                                        C19547d.m47841a(SubmitFeedbackActivity.this, null, BaseNotice.COMMENT_REPLY_WITH_VIDEO);
                                    }
                                });
                                return;
                            case 1:
                                C23361b.m57419a(SubmitFeedbackActivity.this, new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}, new C23364b() {
                                    /* renamed from: a */
                                    public final void mo40906a(String[] strArr, int[] iArr) {
                                        if (strArr.length > 1 && iArr[0] == 0 && iArr[1] == 0) {
                                            C26890h.m65011a("enter_image_choose", C23089d.m56640a().mo47829a("enter_from", SubmitFeedbackActivity.this.f81925w).mo47829a("faq_id", SubmitFeedbackActivity.this.f81924v).mo47829a("type", "single").f61491a);
                                            C47663ad.m103171a(SubmitFeedbackActivity.this, null, BaseNotice.CHECK_PROFILE, SubmitFeedbackActivity.this.f81920r, SubmitFeedbackActivity.this.f81922t);
                                            return;
                                        }
                                        C31283l.m73010a(SubmitFeedbackActivity.this);
                                    }
                                });
                                break;
                        }
                    }
                });
                aVar.mo20148b();
            }
        });
        this.f81914a = (EditText) findViewById(R.id.ze);
        this.f81915b = (EditText) findViewById(R.id.yu);
        this.f81908C = findViewById(R.id.zr);
        this.f81909D = (TextView) findViewById(R.id.yv);
        this.f81915b.setText(this.f81928z);
        this.f81916c = (DmtStatusView) findViewById(R.id.csv);
        this.f81916c.setBuilder(C10719a.m21676a((Context) this));
        if (!TextUtils.isEmpty(this.f81917d)) {
            Bitmap bitmapFromSD = BitmapUtils.getBitmapFromSD(this.f81917d, 50, 50);
            if (bitmapFromSD != null) {
                this.f81907B.setImageBitmap(bitmapFromSD);
                this.f81907B.setScaleType(ScaleType.FIT_XY);
                return;
            }
            this.f81917d = "";
        }
    }

    /* renamed from: k */
    public final void mo48543k() {
        super.mo48543k();
        if (this.f81912G) {
            Resources resources = getResources();
            int a = C19730c.m48228a(R.drawable.cpe, this.f62457i);
            int a2 = C19730c.m48228a(R.drawable.cow, this.f62457i);
            int a3 = C19730c.m48228a(R.drawable.cov, this.f62457i);
            int a4 = C19730c.m48228a(R.color.nb, this.f62457i);
            int a5 = C19730c.m48228a(R.color.nc, this.f62457i);
            int a6 = C19730c.m48228a(R.color.n7, this.f62457i);
            this.f81907B.setColorFilter(null);
            if (C9431p.m18664a(this.f81917d)) {
                this.f81907B.setImageResource(a);
            } else if (this.f62457i) {
                this.f81907B.setColorFilter(this.f81911F);
            }
            this.f81914a.setTextColor(resources.getColor(a4));
            this.f81915b.setTextColor(resources.getColor(a4));
            this.f81914a.setHintTextColor(resources.getColor(a5));
            this.f81915b.setHintTextColor(resources.getColor(a5));
            this.f81909D.setTextColor(resources.getColor(a6));
            C9432q.m18678a(this.f81908C, a2);
            C9432q.m18678a((View) this.f81915b, a3);
        }
    }

    @C53771m(mo112976b = true)
    public void onDouyinPraiseFeedbackEvent(C47408a aVar) {
        this.f81913H = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo64149a(C31289r rVar) {
        FeedbackThread2 feedbackThread2 = new FeedbackThread2(this.f81918e, (Context) this, rVar);
        feedbackThread2.start();
        if (this.f81910E != null) {
            this.f81910E.clear();
            this.f81910E = null;
        }
        this.f81910E = new WeakReference<>(feedbackThread2);
    }

    public void handleMsg(Message message) {
        if (isViewValid()) {
            if (message.what == 10007) {
                if (message.obj instanceof C31289r) {
                    mo64149a((C31289r) message.obj);
                }
                return;
            }
            if (message.what == 10) {
                C26890h.m65011a("feedback_succeed", C23089d.m56640a().mo47829a("faq_id", this.f81924v).mo47826a("is_app", 1).f61491a);
                this.f81914a.setText("");
                C9432q.m18673a((Context) this, 2131952872, (int) R.string.e12);
                if (TextUtils.isEmpty(this.f81924v)) {
                    setResult(-1);
                    finish();
                } else {
                    SmartRouter.buildRoute((Context) this, "aweme://feedback_record").withParam("feedback_id", this.f81924v).open();
                    finish();
                }
            } else {
                C9432q.m18690b((Context) this, 2131952652, getString(C19547d.m47836a(message.arg1)));
            }
            this.f81923u = false;
            this.f81916c.mo19209d();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1003) {
            if (i2 == 0) {
                C26890h.m65011a("cancel_image_choose", C23089d.m56640a().mo47829a("enter_from", this.f81925w).mo47829a("faq_id", this.f81924v).mo47829a("type", "single").f61491a);
            } else if (intent != null) {
                String a = C19547d.m47839a((Context) this, intent.getData());
                if (C9431p.m18664a(a)) {
                    C9432q.m18673a((Context) this, 2131952652, (int) R.string.cos);
                } else if (!new File(a).exists()) {
                    C9432q.m18673a((Context) this, 2131952652, (int) R.string.cos);
                } else {
                    this.f81917d = a;
                    Bitmap rotateBitmap = BitmapUtils.rotateBitmap(BitmapUtils.getBitmapFromSD(this.f81917d, 50, 50), BitmapUtils.readPictureDegree(this.f81917d));
                    if (rotateBitmap != null) {
                        this.f81907B.setImageBitmap(rotateBitmap);
                        this.f81907B.setScaleType(ScaleType.FIT_XY);
                    } else {
                        this.f81917d = "";
                    }
                }
            }
        } else if (i != 1002) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == 0) {
            C26890h.m65011a("cancel_image_choose", C23089d.m56640a().mo47829a("enter_from", this.f81925w).mo47829a("faq_id", this.f81924v).mo47829a("type", "single").f61491a);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f81920r);
            sb.append("/");
            sb.append(this.f81922t);
            this.f81917d = sb.toString();
            Bitmap rotateBitmap2 = BitmapUtils.rotateBitmap(BitmapUtils.getBitmapFromSD(this.f81917d, 50, 50), BitmapUtils.readPictureDegree(this.f81917d));
            if (rotateBitmap2 != null) {
                this.f81907B.setImageBitmap(rotateBitmap2);
                this.f81907B.setScaleType(ScaleType.FIT_XY);
            } else {
                this.f81917d = "";
            }
        }
    }
}
