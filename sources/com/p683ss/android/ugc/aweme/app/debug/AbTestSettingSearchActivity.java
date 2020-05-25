package com.p683ss.android.ugc.aweme.app.debug;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.p2133b.C41576h;
import com.p683ss.android.ugc.aweme.setting.p2148ui.AbStateView;
import com.p683ss.android.ugc.aweme.setting.p2148ui.AbSwitchView;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity */
public class AbTestSettingSearchActivity extends AbsABActivity {

    /* renamed from: a */
    public ArrayList<C41576h> f61435a = new ArrayList<>();

    /* renamed from: b */
    public Handler f61436b = new Handler() {
        public final void handleMessage(Message message) {
            AbTestSettingSearchActivity.this.mo47793a((String) message.obj);
        }
    };

    /* renamed from: f */
    private EditText f61437f;

    /* renamed from: r */
    private RecyclerView f61438r;

    /* renamed from: s */
    private ArrayList<C41576h> f61439s = new ArrayList<>();

    /* renamed from: t */
    private C1322a f61440t = new C1322a() {
        public final int getItemCount() {
            return AbTestSettingSearchActivity.this.f61435a.size();
        }

        public final int getItemViewType(int i) {
            if (((C41576h) AbTestSettingSearchActivity.this.f61435a.get(i)).f105295f == null) {
                return 0;
            }
            return 1;
        }

        public final C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                return new C1352v(new AbSwitchView(AbTestSettingSearchActivity.this)) {
                };
            }
            return new C1352v(new AbStateView(AbTestSettingSearchActivity.this)) {
            };
        }

        public final void onBindViewHolder(C1352v vVar, int i) {
            if (vVar.itemView instanceof AbSwitchView) {
                ((AbSwitchView) vVar.itemView).mo85563a(((C41576h) AbTestSettingSearchActivity.this.f61435a.get(i)).f105293d, AbTestSettingSearchActivity.this.f61449d);
                return;
            }
            if (vVar.itemView instanceof AbStateView) {
                ((AbStateView) vVar.itemView).mo85561a(((C41576h) AbTestSettingSearchActivity.this.f61435a.get(i)).f105293d, AbTestSettingSearchActivity.this.f61449d);
            }
        }
    };

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onCreate", false);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.debug.AbTestSettingSearchActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    private void m56605e() {
        this.f61440t.notifyDataSetChanged();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f61436b.removeCallbacksAndMessages(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo47790c() {
        this.f61439s.addAll(C41576h.f105291b);
        for (int size = this.f61439s.size() - 1; size >= 0; size--) {
            if (((C41576h) this.f61439s.get(size)).f105295f == null && ((C41576h) this.f61439s.get(size)).f105294e == null) {
                this.f61439s.remove(size);
            } else if (((C41576h) this.f61439s.get(size)).f105295f != null && !((C41576h) this.f61439s.get(size)).f105293d.getType().equals(Integer.TYPE)) {
                this.f61439s.remove(size);
            } else if (((C41576h) this.f61439s.get(size)).f105294e != null && !((C41576h) this.f61439s.get(size)).f105293d.getType().equals(Boolean.TYPE)) {
                this.f61439s.remove(size);
            }
        }
        Collections.sort(this.f61439s, new Comparator<C41576h>() {
            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return ((C41576h) obj).f105297h.compareTo(((C41576h) obj2).f105297h);
            }
        });
        this.f61435a.addAll(this.f61439s);
        this.f61438r.setAdapter(this.f61440t);
        mo47793a("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo47794d() {
        findViewById(R.id.dtb).setVisibility(8);
        this.f61438r = (RecyclerView) findViewById(R.id.cge);
        this.f61438r.setVisibility(0);
        this.f61450e = (C23074a) getIntent().getSerializableExtra("paeg_param");
        ((TextView) findViewById(R.id.title)).setText("搜索并设置AB");
        this.f61437f = (EditText) findViewById(R.id.a_0);
        this.f61437f.setVisibility(0);
        this.f61437f.setHint("搜索并设置AB(支持搜hint, key, 变量名)");
        this.f61448c = (LinearLayout) findViewById(R.id.b6t);
        this.f61448c.setVisibility(8);
        this.f61438r.setLayoutManager(new WrapLinearLayoutManager(this));
        this.f61449d = C41589c.m91432a().mo85306m();
        mo47790c();
        this.f61437f.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (keyEvent.getKeyCode() == 66) {
                    return true;
                }
                return false;
            }
        });
        this.f61437f.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                AbTestSettingSearchActivity.this.f61436b.removeCallbacksAndMessages(null);
                Message obtain = Message.obtain();
                obtain.obj = editable.toString();
                AbTestSettingSearchActivity.this.f61436b.sendMessageDelayed(obtain, 200);
            }
        });
        KeyboardUtils.m58183b(this.f61437f);
    }

    /* renamed from: a */
    public final void mo47793a(String str) {
        this.f61435a.clear();
        if (TextUtils.isEmpty(str)) {
            this.f61435a.addAll(this.f61439s);
            m56605e();
            return;
        }
        Iterator it = this.f61439s.iterator();
        while (it.hasNext()) {
            C41576h hVar = (C41576h) it.next();
            Iterator it2 = hVar.f105296g.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((String) it2.next()).contains(str.toLowerCase())) {
                        this.f61435a.add(hVar);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        m56605e();
    }
}
