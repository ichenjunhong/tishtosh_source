package com.p683ss.android.ugc.aweme.favorites;

import android.app.Activity;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.view.View;
import butterknife.ButterKnife;
import com.C2240a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.activity.C23424c;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.p1382aq.C23215at;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40200a;
import com.ss.android.ugc.trill.R;
import java.util.Locale;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.favorites.FavoriteListActivity */
public class FavoriteListActivity extends AmeSSActivity {

    /* renamed from: a */
    boolean f77515a = true;

    /* renamed from: b */
    private int f77516b;

    /* renamed from: c */
    private String f77517c;

    /* renamed from: d */
    private String f77518d;

    /* renamed from: e */
    private boolean f77519e;

    /* renamed from: f */
    private boolean f77520f;

    /* renamed from: g */
    private String f77521g;

    /* renamed from: h */
    private String f77522h;

    /* renamed from: i */
    private C40200a f77523i;

    /* renamed from: j */
    private long f77524j;
    TextTitleBar mTitleBar;

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onPause() {
        String str;
        String str2;
        super.onPause();
        if (this.f77524j > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f77524j;
            if (currentTimeMillis > 0) {
                C23215at atVar = new C23215at();
                if (this.f77519e) {
                    str = "personal_homepage";
                } else {
                    str = "others_homepage";
                }
                C23215at atVar2 = (C23215at) atVar.mo48016b(str).mo48015a(String.valueOf(currentTimeMillis)).mo48100j(this.f77522h);
                if (this.f77520f) {
                    str2 = "click_my_like";
                } else {
                    str2 = "click_link";
                }
                atVar2.f61810b = str2;
                atVar2.mo48076e();
            }
            this.f77524j = -1;
        }
    }

    public void onResume() {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onResume", true);
        super.onResume();
        this.f77524j = System.currentTimeMillis();
        Locale locale = Locale.getDefault();
        String string = getString(R.string.bwj);
        Object[] objArr = new Object[1];
        if (this.f77516b < 0) {
            i = 0;
        } else {
            i = this.f77516b;
        }
        objArr[0] = Integer.valueOf(i);
        this.mTitleBar.setTitle((CharSequence) C2240a.m6773a(locale, string, objArr));
        if (this.f77523i != null && !this.f77515a) {
            this.f77523i.mo59991t();
        }
        this.f77515a = false;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onResume", false);
    }

    @C53771m
    public void onVideoEvent(C30332aw awVar) {
        if (awVar.f79228a == 13) {
            if (C23324d.m57378a().getAwemeById((String) awVar.f79229b).getUserDigg() == 1) {
                this.f77516b++;
            } else {
                this.f77516b--;
            }
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onCreate", true);
        super.onCreate(bundle);
        requestDisableOptimizeViewHierarchy();
        setContentView((int) R.layout.b8);
        C23424c.m57556a(this, 0);
        this.f77516b = getIntent().getIntExtra("favoriteCount", 0);
        this.f77517c = getIntent().getStringExtra("userId");
        this.f77518d = getIntent().getStringExtra("sec_user_id");
        this.f77519e = getIntent().getBooleanExtra("isMyProfile", false);
        this.f77520f = getIntent().getBooleanExtra("clickMyLike", false);
        this.f77521g = getIntent().getStringExtra("contentSource");
        this.f77522h = getIntent().getStringExtra("tabName");
        ButterKnife.bind((Activity) this);
        this.f77523i = C40733z.f103767a.newBasicAwemeListFragment((int) getResources().getDimension(R.dimen.mu), 1, this.f77517c, this.f77518d, this.f77519e, true);
        this.f77523i.mo82505d(true);
        C40200a aVar = this.f77523i;
        if (this.f77520f) {
            str = "click_my_like_cover";
        } else {
            str = "click_link_cover";
        }
        aVar.mo82503b(str);
        this.f77523i.mo82504c(this.f77521g);
        this.f77523i.mo82581e(this.f77522h);
        getSupportFragmentManager().mo2225a().mo2175a((int) R.id.ajf, (Fragment) this.f77523i).mo2195c();
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                FavoriteListActivity.this.onBackPressed();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.favorites.FavoriteListActivity", "onCreate", false);
    }
}
