package com.p683ss.android.ugc.aweme.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout.C11118a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.common.util.C18919f;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.newmedia.p1195a.C19531a;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.p1147d.C18933b;
import com.p683ss.android.p1147d.C18946h;
import com.p683ss.android.p1147d.C18957l;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.notice.repo.TutorialVideoApiManager;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.feedback.FeedbackActivity */
public class FeedbackActivity extends AmeBaseActivity implements C31284m {

    /* renamed from: A */
    private C0654k f81866A;

    /* renamed from: B */
    private C31285n f81867B;

    /* renamed from: C */
    private View f81868C;

    /* renamed from: D */
    private String f81869D;

    /* renamed from: a */
    boolean f81870a;

    /* renamed from: b */
    private boolean f81871b;

    /* renamed from: c */
    private TextView f81872c;

    /* renamed from: d */
    private boolean f81873d;

    /* renamed from: e */
    private boolean f81874e = true;

    /* renamed from: f */
    private boolean f81875f;

    /* renamed from: r */
    private View f81876r;

    /* renamed from: s */
    private SwipeOverlayFrameLayout f81877s;

    /* renamed from: t */
    private View f81878t;

    /* renamed from: u */
    private View f81879u;

    /* renamed from: v */
    private ViewGroup f81880v;

    /* renamed from: w */
    private C19531a f81881w;

    /* renamed from: x */
    private C18957l f81882x;

    /* renamed from: y */
    private C18933b f81883y;

    /* renamed from: z */
    private C18919f f81884z;

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.b43;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C11065a.m22391a((Activity) this);
    }

    public void onStop() {
        super.onStop();
        if (this.f81882x != null) {
            this.f81882x.f52246b.mo39008c();
        }
    }

    public void onBackPressed() {
        if (!isFinishing()) {
            Intent intent = null;
            if (isTaskRoot()) {
                intent = C18920g.m46046a((Context) this, getPackageName());
            }
            finish();
            if (intent != null) {
                startActivity(intent);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo64141c() {
        C26890h.m65011a("faq_result", new C23089d().mo47829a("page_type", "app").f61491a);
        C18922i iVar = new C18922i("aweme://i18n_feedback_input");
        if (!TextUtils.isEmpty(this.f81869D)) {
            iVar.mo38778a("enter_from", this.f81869D);
        }
        SmartRouter.buildRoute((Context) this, iVar.mo38774a()).withParam("use_anim", this.f81873d).open(1001);
    }

    public void onDestroy() {
        if (this.f81881w != null) {
            this.f81881w.dismiss();
            this.f81881w = null;
        }
        super.onDestroy();
        if (this.f81882x != null) {
            C18957l lVar = this.f81882x;
            lVar.f52252h = false;
            lVar.f52246b.mo39007b();
            if (lVar.f52248d != null) {
                lVar.f52248d.mo38773a();
            }
        }
        if (this.f81884z != null) {
            this.f81884z.mo38773a();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onResume", true);
        super.onResume();
        if (this.f81882x != null) {
            C18957l lVar = this.f81882x;
            lVar.f52252h = true;
            lVar.f52246b.mo39009d();
        }
        if (this.f81874e) {
            mo48543k();
        }
        this.f81876r.setVisibility(8);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onResume", false);
    }

    /* renamed from: k */
    public final void mo48543k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f81871b) {
            this.f81871b = false;
            Resources resources = getResources();
            if (this.f81871b) {
                i = R.drawable.dea;
            } else {
                i = R.drawable.de_;
            }
            boolean z = this.f81871b;
            int i6 = R.drawable.dei;
            if (z) {
                i2 = R.drawable.dej;
            } else {
                i2 = R.drawable.dei;
            }
            if (this.f81871b) {
                i3 = R.drawable.ded;
            } else {
                i3 = R.drawable.dec;
            }
            if (this.f81871b) {
                i4 = R.color.a8o;
            } else {
                i4 = R.color.a8n;
            }
            if (this.f81871b) {
                i6 = R.color.azt;
            }
            ColorStateList colorStateList = resources.getColorStateList(i6);
            this.f62459k.setBackgroundResource(i);
            this.f62462n.setTextColor(resources.getColor(i4));
            C9432q.m18678a((View) this.f81872c, i2);
            this.f81872c.setTextColor(colorStateList);
            this.f81872c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f81872c.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
            if (this.f81871b) {
                i5 = R.color.na;
            } else {
                i5 = R.color.n_;
            }
            this.f81877s.setBackgroundColor(resources.getColor(i5));
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f81868C = findViewById(R.id.csm);
        this.f81872c = (TextView) findViewById(R.id.ij);
        this.f81878t = findViewById(R.id.dvh);
        this.f81879u = findViewById(R.id.eb7);
        this.f81880v = (ViewGroup) findViewById(R.id.ll);
        if (VERSION.SDK_INT >= 19) {
            this.f81868C.getLayoutParams().height = C11065a.m22390a((Context) this);
        }
        this.f81872c.setVisibility(8);
        this.f81879u.setVisibility(0);
        this.f62461m.setVisibility(0);
        this.f81878t.setVisibility(8);
        this.f81880v.setBackgroundColor(getResources().getColor(R.color.a2j));
        this.f81872c.setOnClickListener(new C31267a(this));
        this.f62461m.setOnClickListener(new C31268b(this));
        this.f81878t.setOnClickListener(new C31269c(this));
        this.f81879u.setOnClickListener(new C31270d(this));
        this.f81876r = findViewById(R.id.bqw);
        View findViewById = findViewById(R.id.cvu);
        if (findViewById instanceof SwipeOverlayFrameLayout) {
            this.f81877s = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.f81875f && this.f81877s != null) {
            this.f81877s.setOnSwipeListener(new C11118a() {
                /* renamed from: a */
                public final boolean mo20219a() {
                    if (!FeedbackActivity.this.f81870a) {
                        return false;
                    }
                    FeedbackActivity.this.onBackPressed();
                    return true;
                }

                /* renamed from: b */
                public final boolean mo20220b() {
                    if (FeedbackActivity.this.f81870a) {
                        return false;
                    }
                    FeedbackActivity.this.onBackPressed();
                    return true;
                }
            });
        }
        Intent intent = getIntent();
        if (intent != null) {
            this.f81873d = intent.getBooleanExtra("use_anim", false);
            this.f81875f = intent.getBooleanExtra("use_swipe", false);
            this.f81870a = intent.getBooleanExtra("slide_out_left", false);
            String stringExtra = intent.getStringExtra("feedback_id");
            this.f81869D = intent.getStringExtra("enter_from");
            if (!TextUtils.isEmpty(stringExtra)) {
                C10691a.m21533a((Context) this, (int) R.string.b2_).mo19066a();
            }
        }
        this.f81874e = getResources().getBoolean(R.bool.s);
        this.f81883y = new C18933b(this);
        this.f81884z = new C18919f();
        Bundle bundle2 = new Bundle();
        this.f81867B = new C31285n();
        this.f81867B.setArguments(bundle2);
        this.f81866A = getSupportFragmentManager();
        C0679r a = this.f81866A.mo2225a();
        a.mo2176a(R.id.ajf, this.f81867B, "_my_");
        a.mo2189b();
        new C31282k();
        C18842a.m45932a(new Runnable() {
            public final void run() {
                try {
                    ((INotificationApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(TutorialVideoApiManager.f96873a).create(INotificationApi.class)).cancelFeedback().execute();
                } catch (Exception unused) {
                }
            }
        });
        SharePrefCache.inst().getIsShowUserFeedBackPoint().mo47776a(Boolean.valueOf(false));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            Fragment a = getSupportFragmentManager().mo2224a("_my_");
            if (a instanceof C31285n) {
                ((C31285n) a).f82013d = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo64140a(String str, String str2, Bitmap bitmap) {
        if (isViewValid() && !C9431p.m18664a(str)) {
            if (this.f81881w == null) {
                this.f81881w = new C19531a(this, this.f81883y, true);
                C18957l lVar = new C18957l(this, this.f81884z, this.f81883y, this.f81881w, this.f81881w);
                this.f81882x = lVar;
                this.f81881w.f53880d = this.f81882x;
            }
            if (!this.f81881w.isShowing()) {
                C19531a aVar = this.f81881w;
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(new C18946h(str, str2));
                }
                aVar.f53888l.clear();
                aVar.f53888l.addAll(arrayList);
                aVar.f53890n = 0;
                if (bitmap != null && !C9431p.m18664a(str)) {
                    aVar.f53882f.mo39015a(str, bitmap);
                }
                this.f81881w.show();
            }
        }
    }
}
