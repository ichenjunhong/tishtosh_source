package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.profile.model.AvatarUri;
import com.p683ss.android.ugc.aweme.profile.presenter.C39948a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39978l;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity */
public final class ChallengeAvatarModifyActivity extends AmeSSActivity implements C39978l {

    /* renamed from: d */
    public static final HashMap<String, Boolean> f65095d = new HashMap<>();

    /* renamed from: e */
    public static final C24607a f65096e = new C24607a(null);

    /* renamed from: a */
    public C39948a f65097a;

    /* renamed from: b */
    public Challenge f65098b;

    /* renamed from: c */
    public String f65099c = "";

    /* renamed from: f */
    private TextTitleBar f65100f;

    /* renamed from: g */
    private View f65101g;

    /* renamed from: h */
    private HashMap f65102h;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$a */
    public static final class C24607a {
        private C24607a() {
        }

        public /* synthetic */ C24607a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$b */
    public static final class C24608b implements C10713a {

        /* renamed from: a */
        final /* synthetic */ ChallengeAvatarModifyActivity f65103a;

        /* renamed from: b */
        public final void mo19167b(View view) {
        }

        C24608b(ChallengeAvatarModifyActivity challengeAvatarModifyActivity) {
            this.f65103a = challengeAvatarModifyActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            this.f65103a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$c */
    static final class C24609c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ChallengeAvatarModifyActivity f65104a;

        C24609c(ChallengeAvatarModifyActivity challengeAvatarModifyActivity) {
            this.f65104a = challengeAvatarModifyActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String str = this.f65104a.f65099c;
            C26890h.m65011a("upload_hashtag_icon", C23089d.m56640a().mo47829a("process_id", str).mo47829a("tag_id", ChallengeAvatarModifyActivity.m60056a(this.f65104a).getCid()).f61491a);
            if (!TextUtils.isEmpty(ChallengeAvatarModifyActivity.m60056a(this.f65104a).getChallengeProfileUrl())) {
                C10691a.m21542b((Context) this.f65104a, (int) R.string.bal).mo19066a();
            } else if (C52711k.m112239a((Object) (Boolean) ChallengeAvatarModifyActivity.f65095d.get(ChallengeAvatarModifyActivity.m60056a(this.f65104a).getCid()), (Object) Boolean.valueOf(true)) || !ChallengeAvatarModifyActivity.m60056a(this.f65104a).allowUploadCover()) {
                C10691a.m21542b((Context) this.f65104a, (int) R.string.bam).mo19066a();
            } else {
                C39948a aVar = this.f65104a.f65097a;
                if (aVar == null) {
                    C52711k.m112237a("mAvatarPresenter");
                }
                aVar.mo81843a(5);
            }
        }
    }

    /* renamed from: a */
    private View m60055a(int i) {
        if (this.f65102h == null) {
            this.f65102h = new HashMap();
        }
        View view = (View) this.f65102h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f65102h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public static final /* synthetic */ Challenge m60056a(ChallengeAvatarModifyActivity challengeAvatarModifyActivity) {
        Challenge challenge = challengeAvatarModifyActivity.f65098b;
        if (challenge == null) {
            C52711k.m112237a("mChallenge");
        }
        return challenge;
    }

    /* renamed from: a */
    public final void mo50430a(AvatarUri avatarUri) {
        C52711k.m112240b(avatarUri, "avatarUri");
        if (isViewValid()) {
            C39948a aVar = this.f65097a;
            if (aVar == null) {
                C52711k.m112237a("mAvatarPresenter");
            }
            aVar.mo81848e();
            Map map = f65095d;
            Challenge challenge = this.f65098b;
            if (challenge == null) {
                C52711k.m112237a("mChallenge");
            }
            String cid = challenge.getCid();
            C52711k.m112236a((Object) cid, "mChallenge.cid");
            map.put(cid, Boolean.valueOf(true));
            View view = this.f65101g;
            if (view == null) {
                C52711k.m112237a("mUploadBtn");
            }
            view.setAlpha(0.5f);
            C10691a.m21533a((Context) this, (int) R.string.bao).mo19066a();
        }
    }

    /* renamed from: a */
    public final void mo50431a(Exception exc) {
        C52711k.m112240b(exc, "e");
        if (isViewValid()) {
            C39948a aVar = this.f65097a;
            if (aVar == null) {
                C52711k.m112237a("mAvatarPresenter");
            }
            aVar.mo81848e();
            C10691a.m21542b((Context) this, (int) R.string.f7w).mo19066a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.String r0 = "com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity"
            java.lang.String r1 = "onCreate"
            r2 = 1
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r2)
            super.onCreate(r5)
            r5 = 2132215552(0x7f170700, float:2.0074977E38)
            r4.setContentView(r5)
            r5 = 2132023404(0x7f14186c, float:1.9685255E38)
            android.view.View r5 = r4.m60055a(r5)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r5 = (com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar) r5
            java.lang.String r0 = "title_bar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            r4.f65100f = r5
            r5 = 2132024201(0x7f141b89, float:1.9686871E38)
            android.view.View r5 = r4.m60055a(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r5 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r5
            java.lang.String r0 = "tv_upload_avatar"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r0)
            android.view.View r5 = (android.view.View) r5
            r4.f65101g = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "challenge_info"
            java.io.Serializable r5 = r5.getSerializableExtra(r0)
            if (r5 == 0) goto L_0x00f8
            com.ss.android.ugc.aweme.discover.model.Challenge r5 = (com.p683ss.android.ugc.aweme.discover.model.Challenge) r5
            r4.f65098b = r5
            android.content.Intent r5 = r4.getIntent()
            java.lang.String r0 = "process_id"
            java.lang.String r5 = r5.getStringExtra(r0)
            r4.f65099c = r5
            android.view.View r5 = r4.f65101g
            if (r5 != 0) goto L_0x0058
            java.lang.String r0 = "mUploadBtn"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x0058:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r0 = f65095d
            com.ss.android.ugc.aweme.discover.model.Challenge r1 = r4.f65098b
            if (r1 != 0) goto L_0x0063
            java.lang.String r3 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0063:
            java.lang.String r1 = r1.getCid()
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r4.f65098b
            if (r0 != 0) goto L_0x0081
            java.lang.String r1 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0081:
            boolean r0 = r0.allowUploadCover()
            if (r0 == 0) goto L_0x009f
            com.ss.android.ugc.aweme.discover.model.Challenge r0 = r4.f65098b
            if (r0 != 0) goto L_0x0090
            java.lang.String r1 = "mChallenge"
            p2628d.p2639f.p2641b.C52711k.m112237a(r1)
        L_0x0090:
            java.lang.String r0 = r0.getChallengeProfileUrl()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x009f
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00a1
        L_0x009f:
            r0 = 1056964608(0x3f000000, float:0.5)
        L_0x00a1:
            r5.setAlpha(r0)
            com.ss.android.ugc.aweme.profile.presenter.a r5 = new com.ss.android.ugc.aweme.profile.presenter.a
            r5.<init>()
            r4.f65097a = r5
            com.ss.android.ugc.aweme.profile.presenter.a r5 = r4.f65097a
            if (r5 != 0) goto L_0x00b4
            java.lang.String r0 = "mAvatarPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00b4:
            r0 = r4
            com.ss.android.ugc.aweme.profile.presenter.l r0 = (com.p683ss.android.ugc.aweme.profile.presenter.C39978l) r0
            r5.f101827c = r0
            com.ss.android.ugc.aweme.profile.presenter.a r5 = r4.f65097a
            if (r5 != 0) goto L_0x00c2
            java.lang.String r0 = "mAvatarPresenter"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00c2:
            r0 = r4
            android.app.Activity r0 = (android.app.Activity) r0
            r1 = 0
            r5.mo80925b(r0, r1)
            com.bytedance.ies.dmt.ui.titlebar.TextTitleBar r5 = r4.f65100f
            if (r5 != 0) goto L_0x00d2
            java.lang.String r0 = "mTitleBar"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00d2:
            com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$b r0 = new com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$b
            r0.<init>(r4)
            com.bytedance.ies.dmt.ui.titlebar.a.a r0 = (com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a) r0
            r5.setOnTitleBarClickListener(r0)
            android.view.View r5 = r4.f65101g
            if (r5 != 0) goto L_0x00e5
            java.lang.String r0 = "mUploadBtn"
            p2628d.p2639f.p2641b.C52711k.m112237a(r0)
        L_0x00e5:
            com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$c r0 = new com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity$c
            r0.<init>(r4)
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r5.setOnClickListener(r0)
            java.lang.String r5 = "com.ss.android.ugc.aweme.challenge.ui.ChallengeAvatarModifyActivity"
            java.lang.String r0 = "onCreate"
            r1 = 0
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r5, r0, r1)
            return
        L_0x00f8:
            d.u r5 = new d.u
            java.lang.String r0 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.Challenge"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeAvatarModifyActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
        C52711k.m112240b(str, "filePath");
        if (isViewValid()) {
            C19180e[] eVarArr = new C19180e[2];
            String str2 = "challenge_id";
            Challenge challenge = this.f65098b;
            if (challenge == null) {
                C52711k.m112237a("mChallenge");
            }
            eVarArr[0] = new C19180e(str2, challenge.getCid());
            eVarArr[1] = new C19180e("source", "4");
            List c = C52575l.m112101c(eVarArr);
            C39948a aVar = this.f65097a;
            if (aVar == null) {
                C52711k.m112237a("mAvatarPresenter");
            }
            aVar.mo81845a(str, c);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C39948a aVar = this.f65097a;
        if (aVar == null) {
            C52711k.m112237a("mAvatarPresenter");
        }
        aVar.mo80923a(i, i2, intent);
    }
}
