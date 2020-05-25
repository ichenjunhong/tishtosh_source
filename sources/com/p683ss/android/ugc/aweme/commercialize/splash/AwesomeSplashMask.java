package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.google.gson.C17971f;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1582c.p1583a.C26452a;
import com.p683ss.android.ugc.aweme.crossplatform.business.p1614a.C27170a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.miniapp.utils.C36917d;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashMask */
public final class AwesomeSplashMask extends RelativeLayout implements C26245m {

    /* renamed from: a */
    public Map<String, String> f69215a = new HashMap();

    /* renamed from: b */
    public Aweme f69216b;

    /* renamed from: c */
    private int f69217c = 4;

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.ig);
        if (findViewById != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) findViewById.getLayoutParams();
            marginLayoutParams.topMargin += C23724k.m58225c();
            findViewById.setLayoutParams(marginLayoutParams);
        }
        setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (C26512f.m64070m(AwesomeSplashMask.this.f69216b)) {
                    String openUrl = AwesomeSplashMask.this.f69216b.getAwemeRawAd().getOpenUrl();
                    if (!TextUtils.isEmpty(openUrl) && TextUtils.equals(Uri.parse(openUrl).getHost(), "challenge")) {
                        C18922i iVar = new C18922i(AwesomeSplashMask.this.f69216b.getAwemeRawAd().getOpenUrl());
                        iVar.mo38778a("extra_challenge_from", "awesome_splash");
                        AwesomeSplashMask.this.f69216b.getAwemeRawAd().setOpenUrl(iVar.mo38774a());
                    }
                    Context context = view.getContext();
                    Aweme aweme = AwesomeSplashMask.this.f69216b;
                    Map<String, String> map = AwesomeSplashMask.this.f69215a;
                    if (C26512f.m64070m(aweme)) {
                        C26088l.m63322b(context, "splash_click", aweme, C26088l.m63264a(context, aweme, "raw ad splash_click", false, map));
                        C27170a.m65583a("splash_ad", null);
                        C26088l.m63286a(context, aweme, (String) null, map);
                        if (!C26512f.m64068k(aweme).getSplashInfo().isEnableSplashOpen()) {
                            C26452a.m63962a(context, aweme, null, null, C26533q.m64229a(aweme), true, 1, Boolean.valueOf(true));
                        } else if (!C26533q.m64211a(context, aweme)) {
                            IPluginService iPluginService = null;
                            if (iPluginService == null || !iPluginService.mo19934a("com.ss.android.ugc.aweme.miniapp") || !C36917d.m83053a(context, aweme)) {
                                C26452a.m63962a(context, aweme, null, null, C26533q.m64229a(aweme), true, 1, Boolean.valueOf(true));
                            }
                        }
                    }
                }
            }
        });
        findViewById(R.id.ii).setVisibility(8);
        if (C47842ed.m103485a(getContext())) {
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ih);
            LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
            if (VERSION.SDK_INT >= 17) {
                layoutParams.removeRule(11);
            }
            layoutParams.addRule(9);
            layoutParams.leftMargin = C23728o.m58241a(10.0d);
            frameLayout.setLayoutParams(layoutParams);
        }
        setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    HashMap hashMap = new HashMap();
                    if (C47842ed.m103485a(AwesomeSplashMask.this.getContext())) {
                        hashMap.put("click_x", String.valueOf(((float) C23724k.m58224b(AwesomeSplashMask.this.getContext())) - motionEvent.getRawX()));
                    } else {
                        hashMap.put("click_x", String.valueOf(motionEvent.getRawX()));
                    }
                    hashMap.put("click_y", String.valueOf(motionEvent.getRawY()));
                    AwesomeSplashMask.this.f69215a.put("ad_extra_data", new C17971f().mo34889b(hashMap));
                }
                return false;
            }
        });
    }

    public AwesomeSplashMask(Context context) {
        super(context);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f69217c == 4 || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        if (this.f69217c != 2 || super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void onEvent(C26216b bVar) {
        this.f69217c = bVar.f69221a;
        this.f69216b = bVar.f69222b;
        if (this.f69217c == 3) {
            animate().alpha(0.0f).setDuration(260).start();
            Context context = getContext();
            Aweme aweme = this.f69216b;
            if (C26512f.m64070m(aweme) && C26252s.m63614b() != 0) {
                int i = 1;
                if (!C26252s.m63617d()) {
                    i = 2;
                }
                long currentTimeMillis = System.currentTimeMillis() - C26252s.m63614b();
                C26252s.f69307b = 0;
                HashMap hashMap = new HashMap();
                hashMap.put("feedduration", String.valueOf(currentTimeMillis));
                hashMap.put("awemelaunch", String.valueOf(i));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ad_extra_data", new C17971f().mo34889b(hashMap));
                C26088l.m63322b(context, "feed_show", aweme, C26088l.m63264a(context, aweme, "awesome splash feed show", false, (Map<String, String>) hashMap2));
            }
        }
    }

    public AwesomeSplashMask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AwesomeSplashMask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
