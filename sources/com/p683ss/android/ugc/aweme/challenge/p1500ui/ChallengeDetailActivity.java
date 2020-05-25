package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.C36651f;
import com.p683ss.android.ugc.aweme.miniapp_api.C36918a;
import com.p683ss.android.ugc.aweme.push.C40884a;
import com.p683ss.android.ugc.aweme.utils.C47893fn;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity */
public final class ChallengeDetailActivity extends AmeSlideSSActivity implements C36651f {

    /* renamed from: c */
    public static final C24610a f65105c = new C24610a(null);

    /* renamed from: b */
    String f65106b = "";

    /* renamed from: d */
    private ChallengeDetailParam f65107d;

    /* renamed from: e */
    private final ArrayList<C23422a> f65108e = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity$a */
    public static final class C24610a {
        private C24610a() {
        }

        public /* synthetic */ C24610a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public final void mo50438a(Context context, String str, String str2, int i, boolean z) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str, "challengeId");
            C52711k.m112240b(str2, "from");
            m60065a(context, null, str, str2, i, z);
        }

        /* renamed from: a */
        public static void m60065a(Context context, String str, String str2, String str3, int i, boolean z) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(str2, "challengeId");
            C52711k.m112240b(str3, "from");
            Intent intent = new Intent(context, ChallengeDetailActivity.class);
            intent.putExtra("id", str2);
            intent.putExtra("aweme_id", str);
            intent.putExtra("extra_challenge_from", str3);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", i);
            intent.putExtra("extra_challenge_is_hashtag", z);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static final void m60063a(Context context, String str, String str2, String str3, int i, boolean z) {
        C24610a.m60065a(context, str, str2, str3, 0, true);
    }

    /* renamed from: c */
    public final int mo48563c() {
        return 0;
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        Activity activity = this;
        C40884a.m90455a(activity);
        C36918a.m83054a(activity);
    }

    public final void setStatusBarColor() {
        Activity activity = this;
        C11065a.m22394b(activity);
        C23729p.m58269c(activity);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", true);
        super.onResume();
        C47893fn.m103596a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", false);
    }

    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            ChallengeDetailParam challengeDetailParam = this.f65107d;
            if (challengeDetailParam == null) {
                C52711k.m112237a("detailParam");
            }
            String cid = challengeDetailParam.getCid();
            if (cid == null) {
                C52711k.m112234a();
            }
            j = Long.parseLong(cid);
        } catch (Exception unused) {
            j = 0;
        }
        try {
            ChallengeDetailParam challengeDetailParam2 = this.f65107d;
            if (challengeDetailParam2 == null) {
                C52711k.m112237a("detailParam");
            }
            String awemeId = challengeDetailParam2.getAwemeId();
            if (awemeId == null) {
                C52711k.m112234a();
            }
            j2 = Long.parseLong(awemeId);
        } catch (Exception unused2) {
        }
        JSONObject jSONObject = new JSONObject();
        String str = "process_id";
        try {
            ChallengeDetailParam challengeDetailParam3 = this.f65107d;
            if (challengeDetailParam3 == null) {
                C52711k.m112237a("detailParam");
            }
            jSONObject.put(str, challengeDetailParam3.getProcessId());
            jSONObject.put("challenge_id", this.f65106b);
        } catch (JSONException unused3) {
        }
        Analysis ext_json = new Analysis().setLabelName("challenge").setExt_value(j).setValue(j2).setExt_json(jSONObject);
        C52711k.m112236a((Object) ext_json, "Analysis().setLabelName(…alue(aid).setExt_json(jo)");
        return ext_json;
    }

    public final void unRegisterActivityOnKeyDownListener(C23422a aVar) {
        C52711k.m112240b(aVar, "listener");
        if (this.f65108e != null) {
            this.f65108e.remove(aVar);
        }
    }

    public final void registerActivityOnKeyDownListener(C23422a aVar) {
        C52711k.m112240b(aVar, "listener");
        if (!this.f65108e.contains(aVar)) {
            this.f65108e.add(aVar);
        }
    }

    public final void onCreate(Bundle bundle) {
        ChallengeDetailParam challengeDetailParam;
        boolean z;
        boolean z2;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bks);
        findViewById(R.id.yw).setBackgroundColor(getResources().getColor(R.color.a3i));
        View findViewById = findViewById(R.id.yw);
        C52711k.m112236a((Object) findViewById, "findViewById<View>(R.id.container)");
        findViewById.setFitsSystemWindows(false);
        Intent intent = getIntent();
        C52711k.m112236a((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            challengeDetailParam = new ChallengeDetailParam(null, null, null, null, false, 0, 0, null, 0, false, false, null, 4095, null);
        } else {
            String string = extras.getString("id");
            if (TextUtils.isEmpty(string)) {
                string = extras.getString("cid");
            }
            String str = string;
            String string2 = extras.getString("aweme_id");
            String string3 = extras.getString("extra_challenge_from");
            CharSequence charSequence = string3;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                string3 = extras.getString("enter_from");
            }
            String str2 = string3;
            String string4 = extras.getString("from_token");
            boolean z3 = extras.getBoolean("extra_challenge_is_hashtag", false);
            int i = extras.getInt("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0);
            int i2 = extras.getInt("click_reason", 0);
            String string5 = extras.getString("extra_enterprise_challenge_uid");
            int i3 = extras.getInt("show_tab_index", -1);
            String string6 = extras.getString("process_id");
            String string7 = extras.getString("is_commerce");
            if (TextUtils.equals(string7, "1") || C52830p.m112406a("true", string7, true)) {
                z2 = true;
            } else {
                z2 = false;
            }
            ChallengeDetailParam challengeDetailParam2 = new ChallengeDetailParam(str, string2, str2, string4, z3, i, i2, string5, i3, z2, false, string6);
            if (z2) {
                C26403au.m63864a(challengeDetailParam2.getCid());
            }
            challengeDetailParam = challengeDetailParam2;
        }
        this.f65107d = challengeDetailParam;
        String str3 = "show_tag_detail";
        C23089d dVar = new C23089d();
        String str4 = "enter_from";
        ChallengeDetailParam challengeDetailParam3 = this.f65107d;
        if (challengeDetailParam3 == null) {
            C52711k.m112237a("detailParam");
        }
        C23089d a = dVar.mo47829a(str4, challengeDetailParam3.getEnterFrom());
        String str5 = "tag_id";
        ChallengeDetailParam challengeDetailParam4 = this.f65107d;
        if (challengeDetailParam4 == null) {
            C52711k.m112237a("detailParam");
        }
        C26890h.m65011a(str3, a.mo47829a(str5, challengeDetailParam4.getCid()).f61491a);
        ChallengeDetailParam challengeDetailParam5 = this.f65107d;
        if (challengeDetailParam5 == null) {
            C52711k.m112237a("detailParam");
        }
        if (TextUtils.isEmpty(challengeDetailParam5.getCid())) {
            finish();
        } else {
            C0654k supportFragmentManager = getSupportFragmentManager();
            C52711k.m112236a((Object) supportFragmentManager, "supportFragmentManager");
            ChallengeDetailParam challengeDetailParam6 = this.f65107d;
            if (challengeDetailParam6 == null) {
                C52711k.m112237a("detailParam");
            }
            C52711k.m112240b(supportFragmentManager, "fm");
            C52711k.m112240b(challengeDetailParam6, "param");
            C0679r a2 = supportFragmentManager.mo2225a();
            C52711k.m112236a((Object) a2, "fm.beginTransaction()");
            Fragment a3 = supportFragmentManager.mo2224a("challenge_detail_fragment_tag");
            if (a3 == null) {
                C52711k.m112240b(challengeDetailParam6, "param");
                C24724l lVar = new C24724l();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("challenge_detail_param", challengeDetailParam6);
                lVar.setArguments(bundle2);
                a3 = lVar;
            }
            a3.setUserVisibleHint(true);
            a2.mo2192b(R.id.yw, a3, "challenge_detail_fragment_tag");
            a2.mo2189b();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", false);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        C52711k.m112240b(keyEvent, "event");
        if (!isViewValid()) {
            return false;
        }
        Iterator it = this.f65108e.iterator();
        while (it.hasNext()) {
            if (((C23422a) it.next()).onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* renamed from: a */
    public static final void m60062a(Context context, String str, String str2) {
        f65105c.mo50438a(context, str, str2, 0, false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
