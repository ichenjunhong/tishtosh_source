package com.p683ss.android.ugc.aweme.miniapp.anchor.p1951b;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27788aa;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30463p;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.miniapp.anchor.MoreElementsActivity;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a.C36795a;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a.C36797c;
import com.p683ss.android.ugc.aweme.miniapp.anchor.p1952c.C36824b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.b.d */
public class C36817d<E, VH extends C1352v> extends Fragment implements C26877c<E>, C30462o {

    /* renamed from: a */
    public String f94098a;

    /* renamed from: b */
    String f94099b;

    /* renamed from: c */
    String f94100c;

    /* renamed from: d */
    public EditText f94101d;

    /* renamed from: e */
    RecyclerView f94102e;

    /* renamed from: f */
    C36795a<E, VH> f94103f;

    /* renamed from: g */
    DmtLoadingLayout f94104g;

    /* renamed from: h */
    DmtTextView f94105h;

    /* renamed from: i */
    DmtTextView f94106i;

    /* renamed from: j */
    public RecyclerView f94107j;

    /* renamed from: k */
    public C36797c f94108k;

    /* renamed from: l */
    public DmtTextView f94109l;

    /* renamed from: m */
    C36824b f94110m;

    /* renamed from: n */
    private DmtTextView f94111n;

    /* renamed from: o */
    private ImageView f94112o;

    /* renamed from: p */
    private C1332i f94113p;

    /* renamed from: q */
    private C27788aa f94114q;

    /* renamed from: r */
    private C1332i f94115r;

    /* renamed from: s */
    private C26876b f94116s;

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: c */
    public final void mo47029c(List<E> list, boolean z) {
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
        this.f94104g.setVisibility(0);
    }

    /* renamed from: e */
    public final void mo47031e() {
        this.f94114q.mo56230a(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final MoreElementsActivity mo76008k() {
        return (MoreElementsActivity) getActivity();
    }

    public final boolean aW_() {
        if (this.f94114q.f73026a != 0) {
            return true;
        }
        return false;
    }

    public final void aJ_() {
        this.f94105h.setVisibility(0);
        this.f94106i.setVisibility(0);
        this.f94104g.setVisibility(8);
        this.f94102e.setVisibility(8);
    }

    public final void aU_() {
        this.f94116s.mo44934a_(Integer.valueOf(4));
    }

    public void onDestroy() {
        if (this.f94116s != null) {
            this.f94116s.aq_();
            this.f94116s.mo46991S_();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo76003c() {
        this.f94113p = new LinearLayoutManager(getContext());
        this.f94102e.setLayoutManager(this.f94113p);
        this.f94114q = C27788aa.m66530a((C1322a<VH>) this.f94103f);
        this.f94102e.setOnFlingListener(new C30463p(this.f94102e, this));
        this.f94102e.setAdapter(this.f94114q);
    }

    /* renamed from: d */
    public final void mo76006d() {
        String string = C35807d.m80935a(getContext(), this.f94098a, 0).getString(this.f94098a, "");
        if (!string.equals("")) {
            ArrayList arrayList = new ArrayList(Arrays.asList(string.split(",")));
            this.f94108k.mo75990a(arrayList);
            if (arrayList.size() > 2) {
                this.f94109l.setVisibility(0);
            }
        }
    }

    /* renamed from: j */
    public final void mo76007j() {
        if (this.f94116s != null) {
            String trim = this.f94101d.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                this.f94100c = trim;
                this.f94116s.mo44934a_(Integer.valueOf(1), trim);
                this.f94107j.setVisibility(8);
                mo76008k().mo75984a();
                m82873a(trim);
                this.f94109l.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo76002b() {
        this.f94111n = (DmtTextView) m82872a((int) R.id.qh);
        this.f94111n.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C36817d.this.mo76008k().mo75985a(this);
            }
        });
        this.f94101d = (EditText) m82872a((int) R.id.cj3);
        this.f94101d.setImeOptions(3);
        this.f94101d.setInputType(1);
        this.f94101d.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 3 || i == 4 || (keyEvent != null && keyEvent.getKeyCode() == 66)) {
                    C36817d.this.mo76007j();
                }
                return false;
            }
        });
        this.f94101d.addTextChangedListener(new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C36817d.this.f94107j.setVisibility(0);
                C36817d dVar = C36817d.this;
                dVar.f94105h.setVisibility(8);
                dVar.f94106i.setVisibility(8);
                dVar.f94104g.setVisibility(8);
                dVar.f94102e.setVisibility(8);
                C36817d.this.mo76006d();
            }
        });
        EditText editText = this.f94101d;
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        ((InputMethodManager) getActivity().getSystemService("input_method")).showSoftInput(editText, 0);
        this.f94112o = (ImageView) m82872a((int) R.id.cj2);
        this.f94112o.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C36817d.this.f94101d.setText("");
            }
        });
        this.f94104g = (DmtLoadingLayout) m82872a((int) R.id.bhl);
        this.f94102e = (RecyclerView) m82872a((int) R.id.cab);
        this.f94105h = (DmtTextView) m82872a((int) R.id.dkv);
        this.f94106i = (DmtTextView) m82872a((int) R.id.dku);
        this.f94109l = (DmtTextView) m82872a((int) R.id.tq);
        this.f94109l.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C36817d dVar = C36817d.this;
                C35807d.m80935a(dVar.getContext(), dVar.f94098a, 0).edit().clear().apply();
                dVar.f94109l.setVisibility(0);
                C36797c cVar = C36817d.this.f94108k;
                cVar.f94056a.clear();
                cVar.notifyDataSetChanged();
                C36817d.this.f94109l.setVisibility(8);
            }
        });
        this.f94107j = (RecyclerView) m82872a((int) R.id.caa);
        mo76003c();
        this.f94115r = new LinearLayoutManager(getContext());
        this.f94107j.setLayoutManager(this.f94115r);
        this.f94108k = new C36797c(this);
        this.f94107j.setAdapter(this.f94108k);
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        this.f94114q.mo56230a(z ? 1 : 0);
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        this.f94104g.setVisibility(8);
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        this.f94114q.mo56230a(2);
    }

    /* renamed from: a */
    private <T extends View> T m82872a(int i) {
        View view = getView();
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f94099b = getArguments().getString("page_from");
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f94116s = new C26876b();
        this.f94116s.mo54799a(this.f94110m);
        this.f94116s.mo54800a(this);
        mo76002b();
        mo76006d();
    }

    /* renamed from: a */
    private void m82873a(String str) {
        if (str.length() > 0) {
            SharedPreferences a = C35807d.m80935a(getContext(), this.f94098a, 0);
            ArrayList arrayList = new ArrayList(Arrays.asList(a.getString(this.f94098a, "").split(",")));
            if (arrayList.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (str.equals(arrayList.get(i))) {
                        arrayList.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                arrayList.add(0, str);
                if (arrayList.size() > 10) {
                    arrayList.remove(10);
                }
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((String) arrayList.get(i2));
                    sb2.append(",");
                    sb.append(sb2.toString());
                }
                a.edit().putString(this.f94098a, sb.toString()).apply();
                return;
            }
            Editor edit = a.edit();
            String str2 = this.f94098a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(",");
            edit.putString(str2, sb3.toString()).apply();
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<E> list, boolean z) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            this.f94103f.mo75988a(list);
        }
        this.f94114q.mo56230a(z ? 1 : 0);
    }

    /* renamed from: a */
    public void mo47018a(List<E> list, boolean z) {
        this.f94105h.setVisibility(8);
        this.f94106i.setVisibility(8);
        this.f94104g.setVisibility(8);
        this.f94102e.setVisibility(0);
        this.f94103f.mo75988a(list);
        this.f94114q.mo56230a(z ? 1 : 0);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getActivity()).inflate(R.layout.pt, viewGroup, false);
    }
}
