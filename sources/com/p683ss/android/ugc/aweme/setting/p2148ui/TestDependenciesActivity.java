package com.p683ss.android.ugc.aweme.setting.p2148ui;

import android.os.Bundle;
import android.support.p043v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity */
public class TestDependenciesActivity extends AppCompatActivity {

    /* renamed from: a */
    EditText f105816a;

    /* renamed from: b */
    final ArrayList<String> f105817b = new ArrayList<>();

    /* renamed from: c */
    C41779a f105818c;

    /* renamed from: d */
    private ListView f105819d;

    /* renamed from: e */
    private Button f105820e;

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity$a */
    class C41779a extends BaseAdapter {

        /* renamed from: b */
        private LayoutInflater f105822b;

        /* renamed from: c */
        private ArrayList<String> f105823c;

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            if (this.f105823c == null) {
                return 0;
            }
            return this.f105823c.size();
        }

        /* renamed from: a */
        public final void mo85695a(ArrayList<String> arrayList) {
            this.f105823c = arrayList;
            notifyDataSetChanged();
        }

        public final Object getItem(int i) {
            if (this.f105823c == null) {
                return null;
            }
            return this.f105823c.get(i);
        }

        C41779a(ArrayList<String> arrayList) {
            this.f105823c = arrayList;
            this.f105822b = LayoutInflater.from(TestDependenciesActivity.this);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2;
            C41780b bVar;
            if (view == null) {
                bVar = new C41780b();
                view2 = this.f105822b.inflate(R.layout.a0y, null);
                bVar.f105824a = (TextView) view2.findViewById(R.id.d96);
                view2.setTag(bVar);
            } else {
                view2 = view;
                bVar = (C41780b) view.getTag();
            }
            bVar.f105824a.setText((CharSequence) this.f105823c.get(i));
            return view2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity$b */
    static class C41780b {

        /* renamed from: a */
        public TextView f105824a;

        C41780b() {
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.gs);
        this.f105819d = (ListView) findViewById(R.id.bbs);
        this.f105816a = (EditText) findViewById(R.id.ac9);
        this.f105820e = (Button) findViewById(R.id.p2);
        this.f105820e.setText("Search");
        this.f105820e.setOnClickListener(new C41855aj(this));
        String str = "";
        if (!TextUtils.isEmpty(str)) {
            if (str.contains(",")) {
                for (String add : str.split(",")) {
                    this.f105817b.add(add);
                }
            } else {
                this.f105817b.add(str);
            }
            this.f105818c = new C41779a(this.f105817b);
            this.f105819d.setAdapter(this.f105818c);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.ui.TestDependenciesActivity", "onCreate", false);
    }
}
