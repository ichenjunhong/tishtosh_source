package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.friends.service.C32619f;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.an */
public final class C32730an extends C1352v {

    /* renamed from: a */
    public boolean f85259a;

    /* renamed from: b */
    public TextView f85260b;

    /* renamed from: c */
    public View f85261c;

    /* renamed from: d */
    private View f85262d;

    /* renamed from: e */
    private View f85263e;

    /* renamed from: f */
    private TextView f85264f;

    /* renamed from: g */
    private View f85265g;

    /* renamed from: h */
    private TextView f85266h;

    /* renamed from: a */
    public final void mo66321a() {
        m75611b();
    }

    /* renamed from: b */
    private void m75611b() {
        this.f85266h.setVisibility(8);
        this.f85265g.setVisibility(8);
        this.f85263e.setVisibility(4);
    }

    /* renamed from: a */
    private void m75610a(int i) {
        this.f85266h.setText(String.valueOf(i));
        this.f85266h.setVisibility(0);
        this.f85265g.setVisibility(0);
    }

    public C32730an(View view) {
        super(view);
        this.f85262d = view.findViewById(R.id.bqf);
        this.f85263e = view.findViewById(R.id.bqh);
        this.f85265g = view.findViewById(R.id.bqg);
        this.f85266h = (TextView) view.findViewById(R.id.bqe);
        this.f85264f = (TextView) view.findViewById(R.id.dkz);
        this.f85260b = (TextView) view.findViewById(R.id.en);
        this.f85261c = view.findViewById(R.id.c4y);
        this.f85260b.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                if (action != 3) {
                    switch (action) {
                        case 0:
                            view.setAlpha(0.5f);
                            break;
                        case 1:
                            break;
                    }
                }
                view.setAlpha(1.0f);
                return false;
            }
        });
    }

    /* renamed from: a */
    public final void mo66322a(boolean z, int i, int i2, boolean z2, String str) {
        int i3;
        TextView textView;
        this.f85259a = z;
        if (z2) {
            textView = this.f85264f;
            i3 = R.string.b41;
        } else {
            textView = this.f85264f;
            if (z) {
                i3 = R.string.cgj;
            } else {
                i3 = R.string.h9;
            }
        }
        textView.setText(i3);
        this.f85262d.setVisibility(8);
        this.f85263e.setVisibility(4);
        if (z) {
            m75610a(i2);
        } else {
            m75611b();
        }
        if (z2) {
            this.f85260b.setVisibility(0);
            this.f85260b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    C32619f.f84867a.startFollowingFollowerActivity(C32730an.this.f85260b.getContext(), null, C20854a.m53167g().getCurUserId(), true, false, 1, C20854a.m53167g().getCurUser());
                }
            });
        } else {
            this.f85260b.setOnClickListener(null);
            this.f85260b.setVisibility(8);
        }
        if (!C32619f.f84867a.isPrivacyReminder()) {
            this.f85261c.setVisibility(8);
            return;
        }
        if (!z2) {
            this.f85261c.setVisibility(0);
            this.f85261c.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    HashMap hashMap = new HashMap();
                    hashMap.put("enter_from", "find_friends");
                    C26890h.m65011a("click_privacy_tips", (Map<String, String>) hashMap);
                    String str = (String) SharePrefCache.inst().getPrivacyReminderH5Url().mo47782d();
                    if (str != null) {
                        Intent intent = new Intent(C32730an.this.f85261c.getContext(), CrossPlatformActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("show_load_dialog", true);
                        intent.putExtra("hide_nav_bar", false);
                        intent.putExtra("use_webview_title", true);
                        intent.putExtras(bundle);
                        intent.setData(Uri.parse(str));
                        C32730an.this.f85261c.getContext().startActivity(intent);
                    }
                }
            });
        }
    }
}
