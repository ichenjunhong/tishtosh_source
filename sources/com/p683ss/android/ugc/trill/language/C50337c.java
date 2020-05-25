package com.p683ss.android.ugc.trill.language;

import android.app.Activity;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.dmt.p664ui.common.views.CommonItemView;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41684a;
import com.p683ss.android.ugc.trill.language.C50364k.C50366a;
import com.p683ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.trill.language.c */
public final class C50337c extends C1322a<C50338a> implements C0184k, C50366a {

    /* renamed from: a */
    public ArrayList<C41684a> f126232a = new ArrayList<>();

    /* renamed from: b */
    Activity f126233b;

    /* renamed from: c */
    public ContentPreferenceViewModel f126234c;

    /* renamed from: d */
    C50364k f126235d;

    /* renamed from: com.ss.android.ugc.trill.language.c$a */
    public static class C50338a extends C1352v {

        /* renamed from: a */
        CommonItemView f126236a;

        public C50338a(View view) {
            super(view);
            this.f126236a = (CommonItemView) view;
        }
    }

    /* renamed from: a */
    public final void mo98242a(Throwable th) {
    }

    public final int getItemCount() {
        if (this.f126232a != null) {
            return this.f126232a.size();
        }
        return 0;
    }

    public final C0176h getLifecycle() {
        if (this.f126233b instanceof C0184k) {
            return ((C0184k) this.f126233b).getLifecycle();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo98241a() {
        String str = "";
        for (int i = 0; i < ((ArrayList) this.f126234c.mo98275d().getValue()).size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(((C41684a) ((ArrayList) this.f126234c.mo98275d().getValue()).get(i)).getLanguageCode());
            sb.append(",");
            str = sb.toString();
        }
        SharePrefCache.inst().getUserAddLanguages().mo47776a(str);
    }

    public C50337c(Activity activity) {
        this.f126233b = activity;
        this.f126234c = (ContentPreferenceViewModel) C0214z.m440a((FragmentActivity) (AppCompatActivity) this.f126233b).mo359a(ContentPreferenceViewModel.class);
        this.f126234c.mo98275d().observe(this, new C50339d(this));
        this.f126235d = new C50364k();
        this.f126235d.f126287b = this;
        if (activity instanceof C0184k) {
            ((C0184k) activity).getLifecycle().mo324a(new ContentLanguageAdapter$1(this));
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C50338a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.rv, viewGroup, false));
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C50338a aVar = (C50338a) vVar;
        if (getItemCount() != 0) {
            C41684a aVar2 = (C41684a) this.f126232a.get(i);
            if (aVar2.getLocalName() != null) {
                aVar.f126236a.setLeftText(aVar2.getLocalName());
                aVar.f126236a.setRightIconRes(R.drawable.a2v);
                aVar.f126236a.setOnClickListener(new C50340e(this, aVar2, i));
            }
        }
    }
}
