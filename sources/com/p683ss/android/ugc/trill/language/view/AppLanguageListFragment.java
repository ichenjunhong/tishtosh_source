package com.p683ss.android.ugc.trill.language.view;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.i18n.language.C33123c;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33098b;
import com.p683ss.android.ugc.aweme.language.C35834e;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p683ss.android.ugc.trill.language.p2523a.C50332a;
import com.p683ss.android.ugc.trill.language.p2523a.C50332a.C50334a;
import com.p683ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.trill.language.view.AppLanguageListFragment */
public class AppLanguageListFragment extends C23526a implements C0199s<ArrayList<C33123c>>, C50334a {

    /* renamed from: a */
    public int f126290a;

    /* renamed from: b */
    private AppLanguageViewModel f126291b;

    /* renamed from: c */
    private C50332a f126292c;

    /* renamed from: d */
    private int f126293d;
    TextTitleBar mBtnFinish;
    RecyclerView mListLanguage;

    public /* synthetic */ void onChanged(Object obj) {
        ArrayList<C33123c> arrayList = (ArrayList) obj;
        if (!C9376b.m18558a((Collection<T>) arrayList)) {
            if (this.f126292c == null) {
                this.f126292c = new C50332a(getContext(), this);
                this.f126292c.f126225a = arrayList;
                this.mListLanguage.setAdapter(this.f126292c);
                return;
            }
            this.f126292c.f126225a = arrayList;
            this.f126292c.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo98235a(int i) {
        if (i != this.f126290a) {
            if (i == this.f126293d) {
                this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.d));
                this.mBtnFinish.getEndText().setEnabled(false);
            } else {
                this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.c));
                this.mBtnFinish.getEndText().setEnabled(true);
            }
            AppLanguageViewModel appLanguageViewModel = this.f126291b;
            int i2 = this.f126290a;
            C0198r<ArrayList<C33123c>> rVar = appLanguageViewModel.f126302a;
            if (!C9376b.m18558a((Collection) rVar.getValue())) {
                if (i2 >= 0) {
                    ((C33123c) ((ArrayList) rVar.getValue()).get(i2)).f85963a = false;
                }
                ((C33123c) ((ArrayList) rVar.getValue()).get(i)).f85963a = true;
                appLanguageViewModel.f126303b = i;
            }
            this.f126290a = i;
            this.f126292c.notifyDataSetChanged();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() != null) {
            this.f126291b = (AppLanguageViewModel) C0214z.m440a(getActivity()).mo359a(AppLanguageViewModel.class);
            AppLanguageViewModel appLanguageViewModel = this.f126291b;
            if (appLanguageViewModel.f126302a == null) {
                appLanguageViewModel.f126302a = new C0198r<>();
            }
            appLanguageViewModel.f126302a.observe(this, this);
            AppLanguageViewModel appLanguageViewModel2 = this.f126291b;
            int i = -1;
            String c = C33106b.m76112c(getContext());
            ArrayList arrayList = new ArrayList();
            for (C35834e eVar : I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getLocaleMap().values()) {
                if (TextUtils.equals(eVar.mo70126f(), c)) {
                    arrayList.add(new C33123c(eVar, true));
                    i = arrayList.size() - 1;
                } else {
                    arrayList.add(new C33123c(eVar, false));
                }
            }
            appLanguageViewModel2.f126302a.postValue(arrayList);
            this.f126293d = i;
            this.f126290a = this.f126293d;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mListLanguage.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.mListLanguage.mo4798a((C1331h) C23697k.m58150a(getContext()));
        this.mBtnFinish.getTitleView().setTextColor(getResources().getColor(R.color.a1l));
        this.mBtnFinish.setTitle(getText(R.string.io));
        this.mBtnFinish.getEndText().setEnabled(false);
        this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.d));
        this.mBtnFinish.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: a */
            public final void mo19166a(View view) {
                if (AppLanguageListFragment.this.getActivity() != null) {
                    AppLanguageListFragment.this.getActivity().getSupportFragmentManager().mo2235c();
                }
            }

            /* renamed from: b */
            public final void mo19167b(View view) {
                if (AppLanguageListFragment.this.mBtnFinish == null || AppLanguageListFragment.this.mBtnFinish.getEndText() == null || AppLanguageListFragment.this.mBtnFinish.getEndText().getCurrentTextColor() == AppLanguageListFragment.this.getResources().getColor(R.color.d)) {
                    AppLanguageListFragment appLanguageListFragment = AppLanguageListFragment.this;
                    if (appLanguageListFragment.getActivity() != null) {
                        appLanguageListFragment.getActivity().getSupportFragmentManager().mo2235c();
                    }
                    return;
                }
                C33098b.m76080a().mo70130a(((C35834e) I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getI18nItems().get(AppLanguageListFragment.this.f126290a)).mo70121a(), ((C35834e) I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getI18nItems().get(AppLanguageListFragment.this.f126290a)).mo70127g(), AppLanguageListFragment.this.getContext());
                AVExternalServiceImpl.getAVServiceImpl_Monster().configService().cacheConfig().clearFilterCache();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.btt, viewGroup, false);
        ButterKnife.bind(inflate);
        return inflate;
    }
}
