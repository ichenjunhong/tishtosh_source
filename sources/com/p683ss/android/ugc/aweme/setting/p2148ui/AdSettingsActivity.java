package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageView;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12799u;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.google.gson.C18086p;
import com.google.gson.C18087q;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.AdFeSettings;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.FeAnchorAdConf;
import com.p683ss.android.ugc.aweme.net.CommonApi;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.views.C48191h;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity */
public class AdSettingsActivity extends AmeActivity {

    /* renamed from: l */
    private static final int f105601l = 2131034266;

    /* renamed from: m */
    private static final int f105602m = 2131034275;

    /* renamed from: a */
    public CommonItemView f105603a;

    /* renamed from: b */
    Aweme f105604b;

    /* renamed from: c */
    CommonApi f105605c;

    /* renamed from: d */
    public View f105606d;

    /* renamed from: e */
    public C48191h f105607e;

    /* renamed from: f */
    public DmtTextView f105608f;

    /* renamed from: g */
    public ImageView f105609g;

    /* renamed from: h */
    public boolean f105610h;

    /* renamed from: i */
    String f105611i;

    /* renamed from: j */
    String f105612j;

    /* renamed from: k */
    private TextTitleBar f105613k;

    /* renamed from: n */
    private View f105614n;

    /* renamed from: o */
    private View f105615o;

    /* renamed from: p */
    private DmtTextView f105616p;

    /* renamed from: q */
    private DmtTextView f105617q;

    /* renamed from: r */
    private String f105618r;

    /* renamed from: s */
    private C18087q f105619s = new C18087q();

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        super.overridePendingTransition(0, R.anim.by);
    }

    /* renamed from: b */
    public static boolean m91608b() {
        User currentUser = BaseUserService.getBaseUserService_Monster().getCurrentUser();
        if (currentUser == null || currentUser.getCommerceUserInfo() == null || !currentUser.getCommerceUserInfo().isAuctionAdInfluencer()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo85573a() {
        if (this.f105618r == null) {
            try {
                FeAnchorAdConf feAnchorAdConf = C32816h.m75716b().getFeAnchorAdConf();
                if (feAnchorAdConf == null) {
                    return null;
                }
                String adVideoAuthorization = feAnchorAdConf.getAdVideoAuthorization();
                if (!TextUtils.isEmpty(adVideoAuthorization)) {
                    if (this.f105604b != null) {
                        this.f105618r = adVideoAuthorization.replace("{{ITEM_ID}}", this.f105604b.getAid());
                    }
                }
                return null;
            } catch (Exception unused) {
            }
        }
        return this.f105618r;
    }

    /* renamed from: a */
    public final C18085o mo85572a(String str) throws C18086p {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return this.f105619s.mo35029a(str).mo35009m();
        } catch (Throwable th) {
            throw new C18086p(th);
        }
    }

    public void onCreate(Bundle bundle) {
        boolean z;
        boolean z2 = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", true);
        super.onCreate(bundle);
        super.overridePendingTransition(R.anim.bm, 0);
        setContentView((int) R.layout.a7);
        this.f105605c = (CommonApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(CommonApi.class);
        this.f105611i = getIntent().getStringExtra("short_url");
        this.f105604b = C31187c.m72818a();
        C31187c.m72823b(this.f105604b);
        this.f105606d = findViewById(R.id.e03);
        this.f105614n = findViewById(R.id.dy2);
        this.f105615o = findViewById(R.id.dy3);
        this.f105613k = (TextTitleBar) findViewById(R.id.d10);
        this.f105613k.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                AdSettingsActivity.this.finish();
            }
        });
        User currentUser = BaseUserService.getBaseUserService_Monster().getCurrentUser();
        if (currentUser == null || currentUser.getCommerceUserInfo() == null || currentUser.getCommerceUserInfo().getAdInfluencerType() != 1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f105606d.setVisibility(0);
            this.f105608f = (DmtTextView) findViewById(R.id.cl);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String string = getString(R.string.dgm);
            String a = C2240a.m6772a(getString(R.string.dgl), new Object[]{string});
            int indexOf = a.indexOf(string);
            spannableStringBuilder.append(a);
            spannableStringBuilder.setSpan(new ClickableSpan() {
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setUnderlineText(false);
                    textPaint.setColor(AdSettingsActivity.this.getResources().getColor(R.color.avn));
                    textPaint.setFakeBoldText(true);
                }

                public final void onClick(View view) {
                    try {
                        AdFeSettings adFeSettings = C32816h.m75716b().getAdFeSettings();
                        if (adFeSettings != null) {
                            String legalPage = adFeSettings.getLegalPage();
                            if (!TextUtils.isEmpty(legalPage)) {
                                C26540w.m64222a(view.getContext(), legalPage, AdSettingsActivity.this.getString(R.string.dgq));
                            }
                        }
                    } catch (C10174a unused) {
                    }
                }
            }, indexOf, string.length() + indexOf, 33);
            this.f105608f.setMovementMethod(LinkMovementMethod.getInstance());
            this.f105608f.setText(spannableStringBuilder);
            this.f105609g = (ImageView) findViewById(R.id.b42);
            this.f105607e = new C48191h(this);
            this.f105607e.show();
            this.f105603a = (CommonItemView) findViewById(R.id.cm);
            this.f105616p = (DmtTextView) findViewById(R.id.f21);
            String aid = this.f105604b.getAid();
            if (!TextUtils.isEmpty(aid) || this.f105605c == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(Api.f61282b);
                sb.append("/aweme/v1/commerce/item/auth/status/?item_id=");
                sb.append(aid);
                this.f105605c.doGet(sb.toString()).enqueue(new C12743e<String>() {
                    /* renamed from: a */
                    public final void mo19943a(C12690b<String> bVar, Throwable th) {
                        AdSettingsActivity.this.f105607e.dismiss();
                        if (AdSettingsActivity.m91608b()) {
                            AdSettingsActivity.this.f105606d.setVisibility(8);
                        } else {
                            AdSettingsActivity.this.finish();
                        }
                    }

                    /* renamed from: a */
                    public final void mo19942a(C12690b<String> bVar, C12799u<String> uVar) {
                        boolean z = true;
                        if (!(uVar == null || !uVar.mo23960c() || uVar.f33552b == null)) {
                            C18085o a = AdSettingsActivity.this.mo85572a((String) uVar.f33552b);
                            if (TextUtils.equals("1", AdSettingsActivity.m91606a(a, "auth_status"))) {
                                C18082l b = a.mo35022b("has_ad_plan");
                                if (b != null && b.mo34911h()) {
                                    AdSettingsActivity.this.f105610h = true;
                                }
                                AdSettingsActivity.this.f105609g.setVisibility(0);
                                AdSettingsActivity.this.f105603a.setVisibility(0);
                                AdSettingsActivity.this.f105608f.setVisibility(0);
                                AdSettingsActivity.this.f105609g.setSelected(z);
                                AdSettingsActivity.this.f105603a.setChecked(z);
                                AdSettingsActivity.this.f105607e.dismiss();
                            }
                        }
                        z = false;
                        AdSettingsActivity.this.f105609g.setVisibility(0);
                        AdSettingsActivity.this.f105603a.setVisibility(0);
                        AdSettingsActivity.this.f105608f.setVisibility(0);
                        AdSettingsActivity.this.f105609g.setSelected(z);
                        AdSettingsActivity.this.f105603a.setChecked(z);
                        AdSettingsActivity.this.f105607e.dismiss();
                    }
                });
            }
            this.f105609g.setVisibility(8);
            this.f105603a.setVisibility(8);
            this.f105608f.setVisibility(8);
            this.f105609g.setOnClickListener(new C41845a(this));
            this.f105603a.setOnClickListener(new C41872b(this));
            this.f105616p.setOnClickListener(new C41874c(this));
        } else {
            this.f105606d.setVisibility(8);
        }
        if (m91608b()) {
            this.f105614n.setVisibility(0);
            this.f105617q = (DmtTextView) findViewById(R.id.f20);
            this.f105617q.setOnClickListener(new C41875d(this));
            if (this.f105604b == null || this.f105604b.getCommerceVideoAuthInfo() == null || !this.f105604b.getCommerceVideoAuthInfo().isAuctionAdInvited()) {
                z2 = false;
            }
            if (z2) {
                this.f105615o.setVisibility(0);
                if (this.f105604b != null) {
                    this.f105612j = "aweme://webview/?url=https%3A%2F%2Fwww.tiktok.com%2Ffalcon%2Fad%2Fauction_video%3Fhide_nav_bar%3D1%26loading_bgcolor%3Dffffff%26hybrid_sdk_version%3Dbullet%26enter_from%3Dshare_panel%26item_id%3D{{ITEM_ID}}&hide_nav_bar=1&loading_bgcolor=ffffff&hybrid_sdk_version=bullet&enter_from=share_panel&item_id={{ITEM_ID}}".replace("{{ITEM_ID}}", this.f105604b.getAid());
                }
                findViewById(R.id.f4_).setOnClickListener(new C41876e(this));
            } else {
                this.f105615o.setVisibility(8);
            }
        } else {
            this.f105614n.setVisibility(8);
            this.f105615o.setVisibility(8);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.AdSettingsActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m91607a(String str, Context context) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(str, str));
    }

    /* renamed from: a */
    public static String m91606a(C18085o oVar, String str) {
        if (oVar == null || TextUtils.isEmpty(str)) {
            return null;
        }
        C18082l b = oVar.mo35022b(str);
        if (b == null) {
            return null;
        }
        return b.mo34905c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo85574a(String str, String str2, final boolean z) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f105603a.setChecked(!z);
            StringBuilder sb = new StringBuilder();
            sb.append(Api.f61282b);
            sb.append("/aweme/v1/commerce/item/auth/");
            String sb2 = sb.toString();
            HashMap hashMap = new HashMap(5);
            hashMap.put("item_id", str);
            hashMap.put("auth", str2);
            this.f105605c.doPost(sb2, hashMap).enqueue(new C12743e<String>() {
                /* renamed from: a */
                public final void mo19943a(C12690b<String> bVar, Throwable th) {
                    C10691a.m21551c(AdSettingsActivity.this.f105603a.getContext(), "Request Faild").mo19066a();
                    AdSettingsActivity.this.f105603a.setChecked(!z);
                }

                /* renamed from: a */
                public final void mo19942a(C12690b<String> bVar, C12799u<String> uVar) {
                    if (uVar != null && uVar.mo23960c() && uVar.f33552b != null) {
                        C18085o a = AdSettingsActivity.this.mo85572a((String) uVar.f33552b);
                        if (!TextUtils.isEmpty(AdSettingsActivity.m91606a(a, "status_msg"))) {
                            C10691a.m21551c(AdSettingsActivity.this.f105603a.getContext(), a.mo35022b("status_msg").mo34905c()).mo19066a();
                        }
                        String a2 = AdSettingsActivity.m91606a(a, "auth_status");
                        if (!TextUtils.isEmpty(a2)) {
                            AdSettingsActivity.this.f105603a.setChecked(TextUtils.equals("1", a2));
                        }
                    }
                }
            });
        }
    }
}
