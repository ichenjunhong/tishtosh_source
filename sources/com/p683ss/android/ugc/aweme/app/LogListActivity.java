package com.p683ss.android.ugc.aweme.app;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.LogListActivity */
public class LogListActivity extends AmeBaseActivity {

    /* renamed from: a */
    public ArrayList<C23031as> f61169a = new ArrayList<>();
    TextView clearBtn;
    ListView listView;

    /* renamed from: com.ss.android.ugc.aweme.app.LogListActivity$a */
    class C22825a extends BaseAdapter {

        /* renamed from: com.ss.android.ugc.aweme.app.LogListActivity$a$a */
        class C22826a {

            /* renamed from: a */
            TextView f61173a;

            private C22826a() {
            }
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final int getCount() {
            return LogListActivity.this.f61169a.size();
        }

        private C22825a() {
        }

        public final Object getItem(int i) {
            return LogListActivity.this.f61169a.get(i);
        }

        public final View getView(int i, View view, ViewGroup viewGroup) {
            C22826a aVar;
            if (view == null) {
                C22826a aVar2 = new C22826a();
                View inflate = LayoutInflater.from(LogListActivity.this).inflate(R.layout.a19, null);
                aVar2.f61173a = (TextView) inflate.findViewById(R.id.bpp);
                inflate.setTag(aVar2);
                View view2 = inflate;
                aVar = aVar2;
                view = view2;
            } else {
                aVar = (C22826a) view.getTag();
            }
            C23031as asVar = (C23031as) LogListActivity.this.f61169a.get(i);
            if (asVar != null) {
                String str = "";
                if (asVar.f61386f != null) {
                    StringBuilder sb = new StringBuilder();
                    JSONObject jSONObject = asVar.f61386f;
                    Iterator keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        try {
                            String str2 = (String) keys.next();
                            String string = jSONObject.getString(str2);
                            StringBuilder sb2 = new StringBuilder("\n");
                            sb2.append(str2);
                            sb2.append(" = ");
                            sb2.append(string);
                            sb.append(sb2.toString());
                        } catch (Exception unused) {
                        }
                    }
                    str = sb.toString();
                }
                String str3 = "";
                if (asVar.f61387g == 1) {
                    StringBuilder sb3 = new StringBuilder("category: ");
                    sb3.append(asVar.f61381a);
                    sb3.append("\ntag: ");
                    sb3.append(asVar.f61382b);
                    sb3.append("\nlabel: ");
                    sb3.append(asVar.f61383c);
                    sb3.append("\nextValue:");
                    sb3.append(asVar.f61385e);
                    sb3.append("\nvalue: ");
                    sb3.append(asVar.f61384d);
                    sb3.append("\nextJson: ");
                    sb3.append(str);
                    str3 = sb3.toString();
                } else if (asVar.f61387g == 2) {
                    StringBuilder sb4 = new StringBuilder("eventName: ");
                    sb4.append(asVar.f61382b);
                    sb4.append("\nextra: ");
                    sb4.append(str);
                    str3 = sb4.toString();
                }
                aVar.f61173a.setText(str3);
            }
            return view;
        }
    }

    /* renamed from: a */
    public final int mo46324a() {
        return R.layout.a_j;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onCreate", true);
        super.onCreate(bundle);
        this.f61169a = C23030ar.m56548a().f61380a;
        final C22825a aVar = new C22825a();
        this.listView.setAdapter(aVar);
        this.listView.setSelection(this.f61169a.size() - 1);
        this.clearBtn.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                LogListActivity.this.f61169a.clear();
                aVar.notifyDataSetChanged();
            }
        });
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.LogListActivity", "onCreate", false);
    }
}
