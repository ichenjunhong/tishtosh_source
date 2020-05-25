package com.bytedance.android.live.core.setting;

import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.support.p043v7.widget.AppCompatEditText;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3867ae;
import com.bytedance.android.live.core.p230g.C3913t;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.widget.simple.C4110a;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.setting.k */
public final class C4090k extends C3846a {

    /* renamed from: a */
    EditText f11249a;

    /* renamed from: b */
    String[] f11250b;

    /* renamed from: c */
    List<C4097p> f11251c;

    /* renamed from: d */
    List<C4097p> f11252d;

    /* renamed from: e */
    C4099r<C4097p> f11253e;

    /* renamed from: f */
    private RecyclerView f11254f;

    /* renamed from: g */
    private final Handler f11255g = new Handler();

    /* renamed from: h */
    private Runnable f11256h = new C4093l(this);

    /* renamed from: i */
    private String f11257i = null;

    /* renamed from: a */
    public final void mo9425a() {
        String obj = this.f11249a.getText().toString();
        if (!obj.equals(this.f11257i)) {
            this.f11257i = obj;
            this.f11255g.removeCallbacks(this.f11256h);
            this.f11255g.postDelayed(this.f11256h, 500);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f11250b != null) {
            bundle.putStringArray("setting_maps", this.f11250b);
        }
    }

    /* renamed from: a */
    public static String[] m10210a(C4097p pVar) {
        String[] d = C4098q.m10224d(pVar);
        if (d == null || d.length == 0) {
            return null;
        }
        String[] strArr = new String[(d.length + 1)];
        for (int i = 0; i < d.length; i++) {
            strArr[i] = d[i];
        }
        strArr[d.length] = C3922z.m9903a((int) R.string.f18);
        return strArr;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && this.f11250b == null) {
            this.f11250b = bundle.getStringArray("setting_maps");
        }
        if (this.f11250b != null) {
            this.f11251c = C4083e.m10199a(this.f11250b);
            this.f11252d = new ArrayList(this.f11251c);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        if (this.f11249a == null) {
            this.f11249a = (EditText) view.findViewWithTag("input_et");
        }
        if (this.f11254f == null) {
            this.f11254f = (RecyclerView) view.findViewWithTag("recycler_view");
        }
        this.f11253e = new C4099r<C4097p>(getContext(), this.f11252d) {
            /* renamed from: a */
            public final /* synthetic */ void mo9426a(C4110a aVar, Object obj, int i) {
                C4097p pVar = (C4097p) obj;
                String[] d = C4098q.m10224d(pVar);
                if (d == null || d.length <= 0) {
                    C4078a aVar2 = new C4078a();
                    aVar2.f11231b = pVar;
                    aVar2.f11232c = i;
                    aVar2.f11233d = new C4096o(this);
                    aVar2.show(C4090k.this.getFragmentManager(), "AbtestDialog");
                    return;
                }
                new Builder(C4090k.this.getContext()).setTitle(C4098q.m10220b(pVar)).setSingleChoiceItems(C4090k.m10210a(pVar), -1, new C4095n(this, d, pVar, i)).create().show();
            }

            /* renamed from: b */
            public final /* synthetic */ void mo9427b(C4110a aVar, Object obj, int i) {
                String str;
                C4097p pVar = (C4097p) obj;
                ((TextView) aVar.mo9446a(R.id.title)).setText(C4098q.m10216a(pVar));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append("[ ");
                int length = spannableStringBuilder.length();
                String a = C4088i.m10206a("key_ttlive_sdk_setting", pVar);
                if (C4088i.f11245a.contains(pVar.f11267a)) {
                    str = C4088i.f11245a.getAll().get(pVar.f11267a).toString();
                } else {
                    str = null;
                }
                if (C4098q.m10221b()) {
                    spannableStringBuilder.append(" debug:").append(C3913t.m9891a(pVar.f11270d));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(-65536), length, spannableStringBuilder.length(), 33);
                } else if (TextUtils.isEmpty(str) && TextUtils.isEmpty(a)) {
                    spannableStringBuilder.append(" default:").append(String.valueOf(pVar.f11269c));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(-7829368), length, spannableStringBuilder.length(), 33);
                } else if (TextUtils.equals(str, a) || TextUtils.isEmpty(str)) {
                    spannableStringBuilder.append(" server:").append(String.valueOf(a));
                } else if (!TextUtils.isEmpty(str)) {
                    spannableStringBuilder.append(" local:").append(String.valueOf(str)).append(" server:").append(String.valueOf(a));
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(-65536), length, spannableStringBuilder.length(), 33);
                }
                spannableStringBuilder.append(" ]\n").append(C4098q.m10220b(pVar)).append("\n");
                String[] d = C4098q.m10224d(pVar);
                if (d != null) {
                    for (String append : d) {
                        spannableStringBuilder.append(append).append("\n");
                    }
                }
                ((TextView) aVar.mo9446a(R.id.a4m)).setText(spannableStringBuilder);
            }
        };
        this.f11254f.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.f11254f.setAdapter(this.f11253e);
        this.f11249a.setHint("input keywords");
        this.f11249a.setBackgroundColor(-986896);
        this.f11249a.setImeOptions(3);
        this.f11249a.setOnEditorActionListener(new C4094m(this));
        this.f11249a.addTextChangedListener(new C3867ae() {
            public final void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                C4090k.this.mo9425a();
            }
        });
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (bundle != null) {
            return null;
        }
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LayoutParams(-1, -1));
        this.f11249a = new AppCompatEditText(layoutInflater.getContext());
        this.f11249a.setTag("input_et");
        this.f11249a.setLayoutParams(new LinearLayout.LayoutParams(-1, C3922z.m9899a(40.0f)));
        this.f11249a.setPadding(C3922z.m9899a(16.0f), 0, C3922z.m9899a(16.0f), 0);
        this.f11249a.setMaxLines(1);
        this.f11249a.setSingleLine();
        this.f11249a.setFocusable(true);
        this.f11249a.setFocusableInTouchMode(true);
        linearLayout.addView(this.f11249a);
        this.f11254f = new RecyclerView(layoutInflater.getContext());
        this.f11254f.setTag("recycler_view");
        this.f11254f.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(this.f11254f);
        return linearLayout;
    }
}
