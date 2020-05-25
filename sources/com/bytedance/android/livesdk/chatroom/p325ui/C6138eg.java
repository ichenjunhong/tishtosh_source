package com.bytedance.android.livesdk.chatroom.p325ui;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.C5707aa;
import com.bytedance.android.livesdk.chatroom.model.C5709ab;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.p272ad.C4528e;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.eg */
public final class C6138eg extends Dialog {

    /* renamed from: a */
    private List<C5707aa> f16455a;

    /* renamed from: b */
    private C5707aa f16456b;

    /* renamed from: c */
    private Map<C5707aa, TextView> f16457c;

    /* renamed from: d */
    private boolean f16458d;

    /* renamed from: e */
    private C6135ef f16459e;

    /* renamed from: f */
    private C6116dr f16460f;

    /* renamed from: g */
    private TextView f16461g;

    /* renamed from: h */
    private View f16462h;

    /* renamed from: i */
    private TextView f16463i;

    /* renamed from: j */
    private CheckBox f16464j;

    /* renamed from: k */
    private LinearLayoutManager f16465k;

    /* renamed from: l */
    private OnClickListener f16466l;

    /* renamed from: m */
    private OnClickListener f16467m;

    /* renamed from: n */
    private C6136a f16468n;

    /* renamed from: a */
    private void m13297a() {
        if (this.f16455a != null && this.f16455a.size() > 0) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.cwn);
            for (C5707aa aaVar : this.f16455a) {
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.aqt, linearLayout, false);
                textView.setText(aaVar.f14997b);
                textView.setSelected(false);
                textView.setOnClickListener(new C6140ei(this, aaVar));
                this.f16457c.put(aaVar, textView);
                linearLayout.addView(textView);
            }
            mo12165a((C5707aa) this.f16455a.get(0));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12165a(C5707aa aaVar) {
        this.f16456b = aaVar;
        m13298b(aaVar);
    }

    /* renamed from: b */
    private void m13298b(C5707aa aaVar) {
        String str;
        boolean z;
        if (this.f16457c != null && this.f16457c.size() > 0) {
            for (C5707aa aaVar2 : this.f16455a) {
                TextView textView = (TextView) this.f16457c.get(aaVar2);
                if (aaVar2 == aaVar) {
                    z = true;
                } else {
                    z = false;
                }
                textView.setSelected(z);
            }
        }
        this.f16461g.setText(aaVar.f14998c.f15001a);
        if (TextUtils.isEmpty(aaVar.f14998c.f15002b)) {
            this.f16462h.setVisibility(8);
        } else {
            this.f16462h.setVisibility(0);
        }
        C6135ef efVar = this.f16459e;
        List<C5709ab> list = aaVar.f14999d;
        efVar.f16445a = list;
        efVar.f16446b = 0;
        efVar.notifyDataSetChanged();
        list.get(efVar.f16446b);
        CheckBox checkBox = this.f16464j;
        Object[] objArr = new Object[1];
        int i = aaVar.f15000e;
        StringBuilder sb = new StringBuilder();
        Context e = C3922z.m9915e();
        if (i <= 0) {
            str = "";
        } else {
            int i2 = i / 3600;
            int i3 = i - (i2 * 3600);
            int i4 = i3 / 60;
            int i5 = i3 - (i4 * 60);
            if (i2 != 0) {
                sb.append(i2);
                sb.append(e.getResources().getQuantityString(R.plurals.m, i2));
            }
            if (i4 != 0) {
                sb.append(i4);
                sb.append(e.getResources().getQuantityString(R.plurals.n, i4));
            }
            if (i5 != 0) {
                sb.append(i5);
                sb.append(e.getResources().getQuantityString(R.plurals.p, i5));
            }
            str = sb.toString();
        }
        objArr[0] = str;
        checkBox.setText(C3922z.m9905a((int) R.string.ezs, objArr));
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            dismiss();
            return;
        }
        window.requestFeature(1);
        window.setBackgroundDrawable(new BitmapDrawable());
        setContentView(R.layout.aj0);
        View findViewById = findViewById(R.id.cfg);
        if (!this.f16458d) {
            findViewById.post(new C6139eh(findViewById));
        }
        this.f16461g = (TextView) findViewById(R.id.dh_);
        this.f16462h = findViewById(R.id.nz);
        this.f16463i = (TextView) findViewById(R.id.d9_);
        this.f16464j = (CheckBox) findViewById(R.id.t1);
        View findViewById2 = findViewById(R.id.p3);
        this.f16462h.setOnClickListener(this.f16467m);
        findViewById2.setOnClickListener(this.f16466l);
        if (((Boolean) C6718b.f18329Z.mo9431a()).booleanValue()) {
            this.f16464j.setChecked(false);
            this.f16464j.setVisibility(8);
        } else {
            this.f16464j.setChecked(TTLiveSDKContext.getHostService().mo10309b().mo15489b().mo15409a(C4528e.SEND_DELAY_RED_ENVELOPE));
        }
        LayoutInflater from = LayoutInflater.from(getContext());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bc0);
        this.f16459e = new C6135ef(from, this.f16468n);
        recyclerView.setAdapter(this.f16459e);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.bbt);
        this.f16460f = new C6116dr(from, R.layout.aqr);
        recyclerView2.setAdapter(this.f16460f);
        this.f16465k = new LinearLayoutManager(getContext(), 0, false);
        recyclerView2.setLayoutManager(this.f16465k);
        m13297a();
    }
}
