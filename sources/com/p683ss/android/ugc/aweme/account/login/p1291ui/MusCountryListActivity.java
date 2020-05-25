package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.google.p1057b.p1060c.C17530ab;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.C23857bl;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21626v.C21629b;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.WaveSideBar.C21541a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity */
public class MusCountryListActivity extends AmeSSActivity {

    /* renamed from: d */
    public static C23857bl f58396d;

    /* renamed from: a */
    public RecyclerView f58397a;

    /* renamed from: b */
    public ArrayList<C21386a> f58398b = new ArrayList<>();
    @BindView(2131492911)
    ImageView back;

    /* renamed from: c */
    ArrayList<C21386a> f58399c = new ArrayList<>();

    /* renamed from: e */
    private WaveSideBar f58400e;
    @BindView(2131493446)
    EditText etSearch;
    @BindView(2131493451)
    TextView txtSearch;

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.dg);
    }

    public void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.wo).init();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onCreate", true);
        super.onCreate(bundle);
        C17530ab b = C21386a.m54007b();
        this.f58399c.addAll(b);
        this.f58398b.addAll(b);
        setContentView((int) R.layout.ay7);
        this.f58397a = (RecyclerView) findViewById(R.id.cfx);
        this.f58397a.setLayoutManager(new LinearLayoutManager(this));
        C21626v vVar = new C21626v(this.f58398b, R.layout.aza);
        this.f58397a.setAdapter(vVar);
        vVar.f58626a = new C21629b() {
            /* renamed from: a */
            public final void mo45764a(C21386a aVar) {
                if (aVar != null) {
                    C20975a.m53340a(aVar);
                    if (MusCountryListActivity.f58396d != null) {
                        MusCountryListActivity.f58396d.onChanged(aVar.f58044d, aVar.f58043c);
                    }
                    MusCountryListActivity.this.onBackPressed();
                }
            }
        };
        this.f58400e = (WaveSideBar) findViewById(R.id.coc);
        this.f58400e.setOnSelectIndexItemListener(new C21541a() {
            /* renamed from: a */
            public final void mo45742a(String str) {
                for (int i = 0; i < MusCountryListActivity.this.f58398b.size(); i++) {
                    if (TextUtils.equals(((C21386a) MusCountryListActivity.this.f58398b.get(i)).f58042b, str)) {
                        ((LinearLayoutManager) MusCountryListActivity.this.f58397a.getLayoutManager()).mo4721a(i, 0);
                        return;
                    }
                }
            }
        });
        C26894c.m65021a(this, this.etSearch);
        this.txtSearch.setOnClickListener(new C21630w(this, vVar));
        this.back.setOnClickListener(new C21631x(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.MusCountryListActivity", "onCreate", false);
    }
}
