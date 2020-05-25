package com.p683ss.android.ugc.aweme.commercialize.egg;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.commercialize.C25930g;
import com.p683ss.android.ugc.aweme.commercialize.abtest.SearchEggMaxWaitTimeExperiment;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b;
import com.p683ss.android.ugc.aweme.commercialize.model.C26136q;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3 */
public final class EasterEggActivityV3 extends AmeSSActivity implements C25746b {

    /* renamed from: c */
    public static final C25739a f68066c = new C25739a(null);

    /* renamed from: a */
    public long f68067a;

    /* renamed from: b */
    public boolean f68068b;

    /* renamed from: d */
    private CommerceEggLayout f68069d;

    /* renamed from: e */
    private ImageView f68070e;

    /* renamed from: f */
    private C25930g f68071f;

    /* renamed from: g */
    private boolean f68072g;

    /* renamed from: h */
    private final Runnable f68073h = new C25740b(this);

    /* renamed from: i */
    private final Runnable f68074i = new C25742d(this);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3$a */
    public static final class C25739a {
        private C25739a() {
        }

        public /* synthetic */ C25739a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m62313a(Context context, C25930g gVar) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(gVar, "pageParams");
            Intent intent = new Intent(context, EasterEggActivityV3.class);
            intent.putExtra("pageParams", gVar);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static void m62312a(Activity activity, C25930g gVar, int i) {
            C52711k.m112240b(activity, "activity");
            C52711k.m112240b(gVar, "pageParams");
            Intent intent = new Intent(activity, EasterEggActivityV3.class);
            intent.putExtra("pageParams", gVar);
            activity.startActivityForResult(intent, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3$b */
    static final class C25740b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV3 f68075a;

        C25740b(EasterEggActivityV3 easterEggActivityV3) {
            this.f68075a = easterEggActivityV3;
        }

        public final void run() {
            if (!this.f68075a.isFinishing()) {
                Map e = this.f68075a.mo52934e();
                e.put("disappear_method", "auto_disappear");
                e.put("duration", String.valueOf(System.currentTimeMillis() - this.f68075a.f68067a));
                C26890h.m65011a("egg_ad_disappear", e);
                this.f68075a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3$c */
    static final class C25741c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV3 f68076a;

        C25741c(EasterEggActivityV3 easterEggActivityV3) {
            this.f68076a = easterEggActivityV3;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            Map e = this.f68076a.mo52934e();
            e.put("disappear_method", "click_close_button");
            e.put("duration", String.valueOf(System.currentTimeMillis() - this.f68076a.f68067a));
            C26890h.m65011a("egg_ad_disappear", e);
            this.f68076a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3$d */
    static final class C25742d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EasterEggActivityV3 f68077a;

        C25742d(EasterEggActivityV3 easterEggActivityV3) {
            this.f68077a = easterEggActivityV3;
        }

        public final void run() {
            if (!this.f68077a.isFinishing() && !this.f68077a.f68068b) {
                this.f68077a.mo52929a("overtime");
                this.f68077a.finish();
            }
        }
    }

    /* renamed from: c */
    public final boolean mo52932c() {
        return true;
    }

    /* renamed from: d */
    public final boolean mo52933d() {
        return true;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: b */
    public final void mo52930b() {
        mo52929a("load_fail");
        finish();
    }

    public final void finish() {
        setResult(BaseNotice.CHECK_PROFILE);
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onDestroy() {
        super.onDestroy();
        CommerceEggLayout commerceEggLayout = this.f68069d;
        if (commerceEggLayout == null) {
            C52711k.m112237a("mEggLayout");
        }
        commerceEggLayout.mo52923a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CommerceEggLayout commerceEggLayout = this.f68069d;
        if (commerceEggLayout == null) {
            C52711k.m112237a("mEggLayout");
        }
        commerceEggLayout.removeCallbacks(this.f68073h);
        CommerceEggLayout commerceEggLayout2 = this.f68069d;
        if (commerceEggLayout2 == null) {
            C52711k.m112237a("mEggLayout");
        }
        commerceEggLayout2.removeCallbacks(this.f68074i);
    }

    /* renamed from: a */
    public final void mo52926a() {
        if (!this.f68068b && !this.f68072g) {
            this.f68068b = true;
            C26890h.m65011a("show_egg_ad", (Map<String, String>) mo52934e());
            CommerceEggLayout commerceEggLayout = this.f68069d;
            if (commerceEggLayout == null) {
                C52711k.m112237a("mEggLayout");
            }
            commerceEggLayout.postDelayed(this.f68073h, 7000);
        }
    }

    public final void onBackPressed() {
        super.onBackPressed();
        finish();
        C26890h.onEvent(MobClick.obtain().setEventName("result_ad").setLabelName("close").setJsonObject(C23088c.m56631a().mo47824a("refer", "egg").mo47825b()));
    }

    /* renamed from: f */
    private final void m62302f() {
        C25930g gVar = this.f68071f;
        if (gVar == null) {
            C52711k.m112237a("pageParams");
        }
        C26136q easterEggInfo = gVar.getEasterEggInfo();
        C26540w.m64207a((Context) this, C26512f.m64148g(easterEggInfo), C26512f.m64146e(easterEggInfo), C26512f.m64149h(easterEggInfo));
        Map e = mo52934e();
        e.put("duration", String.valueOf(System.currentTimeMillis() - this.f68067a));
        e.put("enter_method", "click_carton");
        C26890h.m65011a("click_egg_ad", e);
        finish();
    }

    /* renamed from: e */
    public final HashMap<String, String> mo52934e() {
        HashMap<String, String> hashMap = new HashMap<>();
        Map map = hashMap;
        String str = "enter_from";
        C25930g gVar = this.f68071f;
        if (gVar == null) {
            C52711k.m112237a("pageParams");
        }
        map.put(str, gVar.getEnterFrom());
        String str2 = "search_keyword";
        C25930g gVar2 = this.f68071f;
        if (gVar2 == null) {
            C52711k.m112237a("pageParams");
        }
        map.put(str2, gVar2.getKeyWords());
        String str3 = "egg_ad_id";
        C25930g gVar3 = this.f68071f;
        if (gVar3 == null) {
            C52711k.m112237a("pageParams");
        }
        map.put(str3, C26512f.m64143c(gVar3.getEasterEggInfo()));
        return hashMap;
    }

    /* renamed from: a */
    public final void mo52929a(String str) {
        if (!this.f68072g && !this.f68068b) {
            this.f68072g = true;
            Map e = mo52934e();
            e.put("fail_type", str);
            C26890h.m65011a("show_egg_ad_fail", e);
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3", "onCreate", true);
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView((int) R.layout.axh);
        Serializable serializableExtra = getIntent().getSerializableExtra("pageParams");
        if (serializableExtra != null) {
            C25930g gVar = (C25930g) serializableExtra;
            if (gVar.getEasterEggInfo() != null) {
                this.f68071f = gVar;
            } else {
                finish();
            }
            View findViewById = findViewById(R.id.e3c);
            C52711k.m112236a((Object) findViewById, "findViewById(R.id.commmerce_egg_layout)");
            this.f68069d = (CommerceEggLayout) findViewById;
            View findViewById2 = findViewById(R.id.ue);
            C52711k.m112236a((Object) findViewById2, "findViewById(R.id.close)");
            this.f68070e = (ImageView) findViewById2;
            ImageView imageView = this.f68070e;
            if (imageView == null) {
                C52711k.m112237a("mCloseBtn");
            }
            imageView.setOnClickListener(new C25741c(this));
            ImageView imageView2 = this.f68070e;
            if (imageView2 == null) {
                C52711k.m112237a("mCloseBtn");
            }
            C47795d.m103429a(imageView2);
            C25930g gVar2 = this.f68071f;
            if (gVar2 == null) {
                C52711k.m112237a("pageParams");
            }
            C26136q easterEggInfo = gVar2.getEasterEggInfo();
            String d = C26512f.m64145d(easterEggInfo);
            C25751b bVar = null;
            if (d == null) {
                str = null;
            } else if (d != null) {
                str = C52830p.m112447b(d).toString();
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
            }
            if (easterEggInfo != null && C26512f.m64140b(easterEggInfo) && !TextUtils.isEmpty(str)) {
                C25772e eVar = new C25772e("search", "-1", "", "", easterEggInfo.getId());
                if (str == null) {
                    str = "";
                }
                String sourceType = easterEggInfo.getSourceType();
                C52711k.m112236a((Object) sourceType, "rawData.sourceType");
                C25763c cVar = new C25763c(str, sourceType);
                cVar.f68127a = false;
                cVar.f68129c = eVar;
                bVar = cVar.mo52961a();
            }
            if (bVar == null) {
                mo52930b();
            } else {
                this.f68067a = System.currentTimeMillis();
                CommerceEggLayout commerceEggLayout = this.f68069d;
                if (commerceEggLayout == null) {
                    C52711k.m112237a("mEggLayout");
                }
                commerceEggLayout.mo52925a(bVar, this, 0, false);
                ImageView imageView3 = this.f68070e;
                if (imageView3 == null) {
                    C52711k.m112237a("mCloseBtn");
                }
                imageView3.bringToFront();
                CommerceEggLayout commerceEggLayout2 = this.f68069d;
                if (commerceEggLayout2 == null) {
                    C52711k.m112237a("mEggLayout");
                }
                commerceEggLayout2.postDelayed(this.f68074i, TimeUnit.SECONDS.toMillis((long) C10181b.m20511a().mo18168a(SearchEggMaxWaitTimeExperiment.class, true, "search_egg_max_wait_to_show_time", 31744, 4)));
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.egg.EasterEggActivityV3", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.EasterEggPageParams");
    }

    /* renamed from: a */
    public final void mo52927a(View view, int i) {
        C52711k.m112240b(view, "eggView");
        m62302f();
    }

    /* renamed from: a */
    public final void mo52928a(View view, View view2) {
        C52711k.m112240b(view2, "eggLayout");
        m62302f();
    }

    /* renamed from: b */
    public final void mo52931b(View view, View view2) {
        C52711k.m112240b(view, "eggView");
        C52711k.m112240b(view2, "eggLayout");
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        view.setLayoutParams(layoutParams);
    }
}
