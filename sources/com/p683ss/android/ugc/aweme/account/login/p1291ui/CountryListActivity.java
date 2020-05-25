package com.p683ss.android.ugc.aweme.account.login.p1291ui;

import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.account.login.model.C21386a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21601m.C21604b;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.WaveSideBar.C21541a;
import com.p683ss.android.ugc.aweme.account.p1274g.C20975a;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.CountryListActivity */
public class CountryListActivity extends AmeSSActivity {

    /* renamed from: a */
    public RecyclerView f58372a;

    /* renamed from: b */
    public ArrayList<C21386a> f58373b = new ArrayList<>();
    @BindView(2131492911)
    ImageView back;

    /* renamed from: c */
    public ArrayList<C21386a> f58374c = new ArrayList<>();

    /* renamed from: d */
    private WaveSideBar f58375d;
    @BindView(2131493446)
    EditText etSearch;
    @BindView(2131493451)
    TextView txtSearch;

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.dg);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", true);
        super.onCreate(bundle);
        superOverridePendingTransition(R.anim.df, 0);
        ArrayList<C21386a> arrayList = new ArrayList<>(C21386a.m54007b());
        List asList = Arrays.asList(new String[]{"CN", "HK", "MO", "TW"});
        C21386a[] aVarArr = new C21386a[asList.size()];
        for (C21386a aVar : arrayList) {
            int indexOf = asList.indexOf(aVar.f58043c);
            if (indexOf >= 0) {
                int i = aVar.f58041a;
                String str = aVar.f58042b;
                String str2 = aVar.f58043c;
                String str3 = aVar.f58044d;
                C52711k.m112240b(str, "nameIndex");
                C52711k.m112240b(str2, "alpha2");
                C52711k.m112240b(str3, "code");
                C21386a aVar2 = new C21386a(i, str, str2, str3);
                String str4 = "#";
                C52711k.m112240b(str4, "<set-?>");
                aVar2.f58042b = str4;
                aVarArr[indexOf] = aVar2;
            }
        }
        arrayList.addAll(0, Arrays.asList(aVarArr));
        this.f58374c.addAll(arrayList);
        this.f58373b.addAll(arrayList);
        setContentView((int) R.layout.ay6);
        this.f58372a = (RecyclerView) findViewById(R.id.cfx);
        this.f58372a.setLayoutManager(new LinearLayoutManager(this));
        final C21601m mVar = new C21601m(this.f58373b, R.layout.aza);
        this.f58372a.setAdapter(mVar);
        mVar.f58579a = new C21604b() {
            /* renamed from: a */
            public final void mo45741a(C21386a aVar) {
                if (aVar != null) {
                    C20975a.m53340a(aVar);
                    CountryListActivity.this.onBackPressed();
                }
            }
        };
        this.f58375d = (WaveSideBar) findViewById(R.id.coc);
        this.f58375d.setOnSelectIndexItemListener(new C21541a() {
            /* renamed from: a */
            public final void mo45742a(String str) {
                for (int i = 0; i < CountryListActivity.this.f58373b.size(); i++) {
                    if (TextUtils.equals(((C21386a) CountryListActivity.this.f58373b.get(i)).f58042b, str)) {
                        ((LinearLayoutManager) CountryListActivity.this.f58372a.getLayoutManager()).mo4721a(i, 0);
                        return;
                    }
                }
            }
        });
        C26894c.m65021a(this, this.etSearch);
        this.txtSearch.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String obj = CountryListActivity.this.etSearch.getText().toString();
                CountryListActivity.this.f58373b.clear();
                Iterator it = CountryListActivity.this.f58374c.iterator();
                while (it.hasNext()) {
                    C21386a aVar = (C21386a) it.next();
                    if (CountryListActivity.this.getString(aVar.f58041a).contains(obj)) {
                        CountryListActivity.this.f58373b.add(aVar);
                    }
                }
                mVar.notifyDataSetChanged();
            }
        });
        this.back.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                CountryListActivity.this.onBackPressed();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.ui.CountryListActivity", "onCreate", false);
    }
}
