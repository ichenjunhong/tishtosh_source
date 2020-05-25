package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.account.login.C21354g;
import com.p683ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p683ss.android.ugc.aweme.account.login.viewmodel.C22029a;
import com.p683ss.android.ugc.aweme.account.login.viewmodel.C22029a.C22031a;
import com.p683ss.android.ugc.aweme.account.login.viewmodel.C22039c;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.p1279l.C21022f;
import com.p683ss.android.ugc.aweme.base.p1409b.C23476a;
import com.p683ss.android.ugc.aweme.base.p1409b.C23478b;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.ThirdPartyLoginView */
public class ThirdPartyLoginView extends LinearLayout {

    /* renamed from: a */
    public ViewGroup f58423a;

    /* renamed from: b */
    public View f58424b;

    /* renamed from: c */
    private LinearLayout f58425c;

    /* renamed from: d */
    private C22039c f58426d;

    /* renamed from: e */
    private String f58427e;

    /* renamed from: f */
    private String f58428f;

    /* renamed from: g */
    private Bundle f58429g;

    public void setNeedHidePlatform(String str) {
    }

    public void setBundle(Bundle bundle) {
        this.f58429g = bundle;
    }

    public void setEventType(String str) {
        this.f58427e = str;
    }

    public void setPosition(String str) {
        this.f58428f = str;
    }

    public ThirdPartyLoginView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ String mo45789a(C23476a aVar) {
        if (!aVar.mo48645b()) {
            return null;
        }
        m54220a(getContext(), (String) aVar.mo48644a(), this.f58429g, this.f58428f, this.f58427e);
        return null;
    }

    public ThirdPartyLoginView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ThirdPartyLoginView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.b19, this);
        this.f58423a = (ViewGroup) findViewById(R.id.czs);
        this.f58425c = (LinearLayout) findViewById(R.id.ave);
        this.f58424b = findViewById(R.id.bmy);
        this.f58426d = new C22039c(null, C22031a.m54768a((C23478b) new C21566af(this)), null);
        int b = (int) C9432q.m18687b(getContext(), 44.0f);
        int b2 = (int) C9432q.m18687b(getContext(), 16.0f);
        for (C22029a aVar : this.f58426d.f59533b) {
            AppCompatImageView appCompatImageView = new AppCompatImageView(this.f58425c.getContext());
            LayoutParams layoutParams = new LayoutParams(b, b);
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginEnd(b2);
            } else {
                layoutParams.setMargins(0, 0, b2, 0);
            }
            appCompatImageView.setLayoutParams(layoutParams);
            appCompatImageView.setScaleType(ScaleType.FIT_CENTER);
            appCompatImageView.setImageResource(aVar.f59521a);
            appCompatImageView.setOnClickListener(aVar.f59522b);
            this.f58425c.addView(appCompatImageView);
        }
        this.f58424b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                LayoutTransition layoutTransition = ((ViewGroup) ThirdPartyLoginView.this.f58423a.getParent()).getLayoutTransition();
                layoutTransition.enableTransitionType(4);
                layoutTransition.setDuration(4, 400);
                layoutTransition.enableTransitionType(3);
                layoutTransition.setDuration(3, 200);
                ThirdPartyLoginView.this.f58424b.setVisibility(8);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ThirdPartyLoginView.this.f58423a.getLayoutParams();
                layoutParams.gravity = 8388611;
                layoutParams.leftMargin = 0;
                layoutParams.width = C9432q.m18670a(ThirdPartyLoginView.this.getContext()) - C23728o.m58241a(80.0d);
                ThirdPartyLoginView.this.f58423a.setLayoutParams(layoutParams);
            }
        });
        this.f58423a.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (ThirdPartyLoginView.this.f58424b.getVisibility() == 0) {
                    return true;
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    public static void m54220a(Context context, String str, Bundle bundle, String str2, String str3) {
        if (!C21567ag.m54246a(context)) {
            C10691a.m21542b(context, (int) R.string.cg1).mo19066a();
            return;
        }
        C26890h.m65011a("login_submit", new C20856a().mo44776a("enter_method", str2).mo44776a("enter_from", str3).mo44776a("platform", str).mo44776a("enter_type", "click_login").mo44776a("group_id", C21021e.m53409a(bundle)).mo44776a("log_pb", C21021e.m53412b(bundle)).f56798a);
        if (str != null) {
            new C21022f().mo44994a(str2).mo44995b(str).mo44990b();
            Intent intent = new Intent(context, AuthorizeActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra("platform", str);
            intent.putExtra("enter_from", str3);
            intent.putExtra("enter_method", str2);
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, 1001);
            }
            C21354g.m53487a(str, str3, str2);
        }
    }
}
