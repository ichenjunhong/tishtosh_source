package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.View;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.adapter.C39782u;
import com.p683ss.android.ugc.aweme.profile.adapter.C39785w;
import com.p683ss.android.ugc.aweme.profile.model.UrlModelWrap;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39954ad;
import com.p683ss.android.ugc.aweme.profile.presenter.C39985s;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity */
public class ProfileCoverLibActivity extends AmeSSActivity implements C9382a, C39985s {

    /* renamed from: a */
    C39954ad f102345a;

    /* renamed from: b */
    private int f102346b;

    /* renamed from: c */
    private int f102347c;

    /* renamed from: d */
    private int f102348d;

    /* renamed from: e */
    private int f102349e;

    /* renamed from: f */
    private int f102350f;
    RecyclerView mCoverRecycleView;
    DmtStatusView mStatusView;
    TextTitleBar mTitleBar;

    /* renamed from: a */
    public final void mo54362a(boolean z) {
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public int getStatusBarColor() {
        return getResources().getColor(R.color.a8w);
    }

    public void handleMsg(Message message) {
        if (message.obj instanceof Exception) {
            C22971a.m56494a(this, (Exception) message.obj, R.string.czy);
            return;
        }
        if (message.obj instanceof User) {
            C20902b.m53242a().setCurUser((User) message.obj);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bq);
        ButterKnife.bind((Activity) this);
        this.f102346b = (int) C9432q.m18687b((Context) this, 16.0f);
        this.f102347c = (int) C9432q.m18687b((Context) this, 16.0f);
        this.f102348d = (int) C9432q.m18687b((Context) this, 16.0f);
        this.f102349e = (int) C9432q.m18687b((Context) this, 8.0f);
        this.f102350f = (int) C9432q.m18687b((Context) this, 8.0f);
        this.mTitleBar.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: b */
            public final void mo19167b(View view) {
            }

            /* renamed from: a */
            public final void mo19166a(View view) {
                ProfileCoverLibActivity.this.onBackPressed();
            }
        });
        C39782u uVar = new C39782u();
        C23543g b = C23542f.m57717b();
        HashSet hashSet = new HashSet();
        Set<String> stringSet = b.f62665a.getStringSet("default_profile_cover_url", hashSet);
        ArrayList<UrlModelWrap> arrayList = new ArrayList<>();
        for (String fromJson : stringSet) {
            arrayList.add(UrlModelWrap.fromJson(fromJson));
        }
        Collections.sort(arrayList, C40297ci.f102894a);
        ArrayList arrayList2 = new ArrayList();
        for (UrlModelWrap urlModel : arrayList) {
            arrayList2.add(urlModel.getUrlModel());
        }
        uVar.mo50303a(arrayList2);
        uVar.f101536a = new C40296ch(this);
        this.mCoverRecycleView.setLayoutManager(new WrapLinearLayoutManager(this, 1, false));
        RecyclerView recyclerView = this.mCoverRecycleView;
        C39785w wVar = new C39785w(this.f102346b, this.f102347c, this.f102348d, this.f102349e, this.f102350f);
        recyclerView.mo4798a((C1331h) wVar);
        this.mCoverRecycleView.setAdapter(uVar);
        this.mStatusView.setBuilder(C10719a.m21676a((Context) this));
        this.f102345a = new C39954ad();
        this.f102345a.mo81850a((C39985s) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.profile.ui.ProfileCoverLibActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo54360a(Exception exc, int i) {
        if (isViewValid() && this.f102345a != null) {
            this.mStatusView.setVisibility(8);
            C22971a.m56494a(this, exc, R.string.czy);
            C26890h.m65011a("replace_profile_cover_finish", new C23089d().mo47829a("enter_method", "app_album").f61491a);
        }
    }

    /* renamed from: a */
    public final void mo54359a(User user, int i) {
        if (isViewValid()) {
            C10691a.m21533a(C11010c.m22280a(), (int) R.string.czi).mo19066a();
            this.mStatusView.setVisibility(8);
            C20902b.m53242a().queryUser(new C9381g(Looper.getMainLooper(), this));
            C26890h.m65011a("replace_profile_cover_finish", new C23089d().mo47829a("enter_method", "app_album").f61491a);
        }
    }

    /* renamed from: a */
    public final void mo54361a(String str, boolean z) {
        if (isViewValid()) {
            if (this.mStatusView != null) {
                this.mStatusView.mo19209d();
            }
            if (!TextUtils.isEmpty(str)) {
                C10691a.m21545b((Context) AwemeApplication.m56199a(), str).mo19066a();
                if (z) {
                    finish();
                }
            }
        }
    }
}
