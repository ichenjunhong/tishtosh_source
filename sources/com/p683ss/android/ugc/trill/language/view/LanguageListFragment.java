package com.p683ss.android.ugc.trill.language.view;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.i18n.language.C33123c;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33097a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41684a;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p683ss.android.ugc.trill.language.C50328a;
import com.p683ss.android.ugc.trill.language.C50328a.C50330a;
import com.p683ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.language.view.LanguageListFragment */
public class LanguageListFragment extends C23526a implements C0199s<ArrayList<C33123c>>, C50330a {

    /* renamed from: a */
    public ContentPreferenceViewModel f126296a;

    /* renamed from: b */
    public int f126297b;

    /* renamed from: c */
    private C50328a f126298c;

    /* renamed from: d */
    private int f126299d;
    TextTitleBar mBtnFinish;
    RecyclerView mListLanguage;

    /* renamed from: a */
    public final void mo98268a() {
        if (getActivity() != null) {
            getActivity().getSupportFragmentManager().mo2235c();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f126296a != null) {
            ContentPreferenceViewModel contentPreferenceViewModel = this.f126296a;
            if (contentPreferenceViewModel.f126306c) {
                contentPreferenceViewModel.mo98277f();
                contentPreferenceViewModel.f126306c = false;
            }
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        ArrayList<C33123c> arrayList = (ArrayList) obj;
        if (!C9376b.m18558a((Collection<T>) arrayList)) {
            if (this.f126298c == null) {
                this.f126298c = new C50328a(getContext(), this);
                this.f126298c.f126218a = arrayList;
                this.mListLanguage.setAdapter(this.f126298c);
                return;
            }
            this.f126298c.f126218a = arrayList;
            this.f126298c.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo98233a(int i) {
        if (i != this.f126297b) {
            if (i == this.f126299d) {
                this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.d));
                this.mBtnFinish.getEndText().setEnabled(false);
            } else {
                this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.c));
                this.mBtnFinish.getEndText().setEnabled(true);
            }
            ContentPreferenceViewModel contentPreferenceViewModel = this.f126296a;
            int i2 = this.f126297b;
            C0198r e = contentPreferenceViewModel.mo98276e();
            if (!C9376b.m18558a((Collection) e.getValue())) {
                if (i2 >= 0) {
                    ArrayList arrayList = (ArrayList) e.getValue();
                    if (arrayList != null) {
                        C33123c cVar = (C33123c) arrayList.get(i2);
                        if (cVar != null) {
                            cVar.f85963a = false;
                        }
                    }
                }
                ArrayList arrayList2 = (ArrayList) e.getValue();
                if (arrayList2 != null) {
                    C33123c cVar2 = (C33123c) arrayList2.get(i);
                    if (cVar2 != null) {
                        cVar2.f85963a = true;
                    }
                }
                contentPreferenceViewModel.f126305b = i;
            }
            this.f126297b = i;
            this.f126298c.notifyDataSetChanged();
        }
    }

    public void onCreate(Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        if (getActivity() != null) {
            this.f126296a = (ContentPreferenceViewModel) C0214z.m440a(getActivity()).mo359a(ContentPreferenceViewModel.class);
            this.f126296a.mo98276e().observe(this, this);
            ContentPreferenceViewModel contentPreferenceViewModel = this.f126296a;
            C52711k.m112240b(getContext(), "context");
            if (!C9376b.m18558a((Collection) contentPreferenceViewModel.mo98276e().getValue()) && contentPreferenceViewModel.f126305b >= 0) {
                int i = contentPreferenceViewModel.f126305b;
                ArrayList arrayList = (ArrayList) contentPreferenceViewModel.mo98276e().getValue();
                if (arrayList != null) {
                    num = Integer.valueOf(arrayList.size());
                } else {
                    num = null;
                }
                if (num == null) {
                    C52711k.m112234a();
                }
                if (i <= num.intValue() - 1) {
                    ArrayList arrayList2 = (ArrayList) contentPreferenceViewModel.mo98276e().getValue();
                    if (arrayList2 != null) {
                        C33123c cVar = (C33123c) arrayList2.get(contentPreferenceViewModel.f126305b);
                        if (cVar != null) {
                            cVar.f85963a = false;
                        }
                    }
                }
            }
            this.f126299d = -1;
            this.f126297b = this.f126299d;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mListLanguage.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        this.mListLanguage.mo4798a((C1331h) C23697k.m58150a(getContext()));
        this.mBtnFinish.getTitleView().setTextColor(getResources().getColor(R.color.a1l));
        this.mBtnFinish.setTitle(getText(R.string.ai9));
        this.mBtnFinish.getEndText().setEnabled(false);
        this.mBtnFinish.getEndText().setTextColor(getResources().getColor(R.color.d));
        this.mBtnFinish.setOnTitleBarClickListener(new C10713a() {
            /* renamed from: a */
            public final void mo19166a(View view) {
                if (LanguageListFragment.this.getActivity() != null) {
                    LanguageListFragment.this.getActivity().getSupportFragmentManager().mo2235c();
                }
            }

            /* renamed from: b */
            public final void mo19167b(View view) {
                C41684a aVar;
                if (LanguageListFragment.this.mBtnFinish == null || LanguageListFragment.this.mBtnFinish.getEndText() == null || LanguageListFragment.this.mBtnFinish.getEndText().getCurrentTextColor() == LanguageListFragment.this.getResources().getColor(R.color.d)) {
                    LanguageListFragment.this.mo98268a();
                    return;
                }
                if (LanguageListFragment.this.f126297b != -1) {
                    ContentPreferenceViewModel contentPreferenceViewModel = LanguageListFragment.this.f126296a;
                    C33123c cVar = (C33123c) ((ArrayList) LanguageListFragment.this.f126296a.mo98276e().getValue()).get(LanguageListFragment.this.f126297b);
                    if (cVar == null) {
                        aVar = null;
                    } else {
                        C41684a aVar2 = new C41684a();
                        if (cVar.f85964b instanceof C33097a) {
                            C33097a aVar3 = (C33097a) cVar.f85964b;
                            aVar2.setEnglishName(aVar3.mo70122b());
                            aVar2.setLanguageCode(aVar3.f85914a);
                            aVar2.setLocalName(cVar.mo70148a());
                            aVar = aVar2;
                        } else {
                            throw new IllegalStateException("请传I18nLanguageItem");
                        }
                    }
                    contentPreferenceViewModel.mo98270a(aVar);
                    LanguageListFragment.this.mo98268a();
                }
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.al, viewGroup, false);
        ButterKnife.bind(inflate);
        return inflate;
    }
}
