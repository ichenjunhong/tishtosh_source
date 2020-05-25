package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import butterknife.ButterKnife;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26917n;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.discover.api.p1638a.C28064a;
import com.p683ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateData;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28101i;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28106n;
import com.p683ss.android.ugc.aweme.discover.p1644f.C28116e;
import com.p683ss.android.ugc.aweme.discover.p1659ui.SearchIntermediateView.C28452c;
import com.p683ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel;
import com.p683ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel.C28943a;
import com.p683ss.android.ugc.aweme.search.C41419f;
import com.p683ss.android.ugc.aweme.search.C41429i;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.utils.C47885fh;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.b */
public abstract class C28527b extends C23526a implements C0199s<C28064a<TypeWords>>, C28452c {

    /* renamed from: a */
    View f74968a;

    /* renamed from: b */
    EditText f74969b;

    /* renamed from: c */
    ImageButton f74970c;

    /* renamed from: d */
    TextView f74971d;

    /* renamed from: e */
    ImageView f74972e;

    /* renamed from: j */
    FrameLayout f74973j;

    /* renamed from: k */
    SearchIntermediateView f74974k;

    /* renamed from: l */
    protected SearchStateViewModel f74975l;

    /* renamed from: m */
    protected GuessWordsViewModel f74976m;

    /* renamed from: n */
    protected String f74977n;

    /* renamed from: o */
    SearchIntermediateViewModel f74978o;

    /* renamed from: p */
    protected SearchStateData f74979p;

    /* renamed from: q */
    protected Word f74980q;

    /* renamed from: r */
    private C47885fh f74981r;

    /* renamed from: s */
    private String f74982s;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo58051a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo58172a(boolean z) {
        return z ? 5 : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58052a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo58053a(View view);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo58055b(C41440e eVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo58060e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo58061f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo58062g();

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public abstract String mo58063k();

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public abstract void mo58064m();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public boolean mo58178o() {
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public boolean mo58179q() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo58200a(String str) {
        int a = C28608ca.m67854a();
        for (int i = 0; i < a; i++) {
            if (TextUtils.equals(str, mo58195a(i))) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo58203l() {
        getActivity().getWindow().setSoftInputMode(50);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public String mo58175h() {
        return C23542f.m57720e().mo48703a("place_holder", C23723j.m58219b(R.string.cpu));
    }

    /* renamed from: p */
    public final int mo58207p() {
        Integer num = (Integer) this.f74975l.searchState.getValue();
        if (num == null) {
            return mo58060e();
        }
        return num.intValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo58204n() {
        if (mo58178o()) {
            String obj = this.f74969b.getText().toString();
            if (this.f74974k.mo58102a()) {
                this.f74974k.mo58100a(obj);
                return;
            }
            this.f74974k.mo58100a(obj);
            this.f74974k.setOpenSugFromState(mo58207p());
            mo58058c(3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo58176i() {
        this.f74972e.setOnClickListener(new C28607c(this));
        this.f74970c.setOnClickListener(new C28646d(this));
        this.f74971d.setOnTouchListener(new C28515aw() {
            /* renamed from: b */
            public final void mo55272b(View view, MotionEvent motionEvent) {
                if (C28527b.this.f74969b != null) {
                    C28527b.this.mo58056b(C28527b.this.f74969b.getText().toString());
                }
            }
        });
        this.f74981r.mo95093a(this.f74969b);
        this.f74969b.setHint(mo58175h());
        this.f74969b.setFilters(new InputFilter[]{new C26917n()});
        this.f74969b.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                C28527b.this.mo58196a((CharSequence) editable.toString());
            }
        });
        this.f74969b.setOnTouchListener(new C28647e(this));
        this.f74969b.setOnEditorActionListener(new OnEditorActionListener() {
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i == 3) {
                    C28527b.this.mo58056b(C28527b.this.f74969b.getText().toString());
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo58177j() {
        SearchIntermediateView searchIntermediateView = this.f74974k;
        C52711k.m112240b(this, "fragment");
        C52711k.m112240b(this, "responder");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "fragment.activity!!");
        searchIntermediateView.f74812b = this;
        searchIntermediateView.f74816f = C41431k.f105004a.isSearchResultActivity(getActivity());
        C0654k childFragmentManager = getChildFragmentManager();
        C52711k.m112236a((Object) childFragmentManager, "fragment.childFragmentManager");
        searchIntermediateView.f74813c = childFragmentManager;
        C0209x a = C0214z.m440a(activity).mo359a(SearchIntermediateViewModel.class);
        C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…ateViewModel::class.java)");
        searchIntermediateView.f74811a = (SearchIntermediateViewModel) a;
        SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f74811a;
        if (searchIntermediateViewModel == null) {
            C52711k.m112237a("intermediateViewModel");
        }
        C0184k kVar = this;
        searchIntermediateViewModel.getIntermediateState().observe(kVar, searchIntermediateView.f74817g);
        SearchIntermediateViewModel searchIntermediateViewModel2 = searchIntermediateView.f74811a;
        if (searchIntermediateViewModel2 == null) {
            C52711k.m112237a("intermediateViewModel");
        }
        searchIntermediateViewModel2.getSearchTabIndex().observe(kVar, searchIntermediateView.f74818h);
        this.f74974k.setOnDispatchTouchEventListener(new C28648f(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo58201b(View view) {
        mo58062g();
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onMessageEvent(C28101i iVar) {
        this.f74969b.setHint(iVar.f73792a);
    }

    /* renamed from: b */
    public final void mo58111b(int i) {
        this.f74969b.setHint(mo58195a(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo58056b(String str) {
        mo58197a(str, null, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo58195a(int i) {
        String str;
        if (i == C28608ca.f75135c) {
            str = getResources().getString(R.string.dbi);
        } else if (i == C28608ca.f75134b) {
            str = getResources().getString(R.string.daa);
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return mo58175h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58202b(boolean z) {
        SearchIntermediateView searchIntermediateView = this.f74974k;
        searchIntermediateView.f74814d.mo56599a(z);
        SearchIntermediateViewModel searchIntermediateViewModel = searchIntermediateView.f74811a;
        if (searchIntermediateViewModel == null) {
            C52711k.m112237a("intermediateViewModel");
        }
        searchIntermediateViewModel.hideIntermediate();
    }

    /* renamed from: c */
    public void mo58058c(int i) {
        this.f74975l.searchState.setValue(Integer.valueOf(i));
        this.f74979p.getSearchState().setValue(Integer.valueOf(i));
        if (SearchStateViewModel.isSearchIntermediate(i)) {
            this.f74973j.setVisibility(4);
        } else {
            this.f74973j.setVisibility(0);
        }
    }

    @C53771m
    public void onSearchSugCompletionEvent(C28106n nVar) {
        if (isViewValid() && nVar != null) {
            String str = nVar.f73796a;
            if (!(str == null || str.length() == 0)) {
                this.f74969b.setText(str);
                this.f74969b.setSelection(str.length());
                this.f74969b.setCursorVisible(true);
                KeyboardUtils.m58183b(this.f74969b);
            }
        }
    }

    /* renamed from: a */
    public void mo58110a(C41440e eVar) {
        if (SearchStateViewModel.isSearchIntermediate(mo58207p()) && !TextUtils.isEmpty(eVar.getKeyword())) {
            mo58055b(eVar);
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        C28064a aVar = (C28064a) obj;
        if (aVar.f73735a) {
            TypeWords typeWords = (TypeWords) aVar.f73736b;
            if (typeWords != null && !C9376b.m18558a((Collection<T>) typeWords.words)) {
                Word word = (Word) typeWords.words.get(0);
                if (mo58179q()) {
                    this.f74969b.setHint(word.getWord());
                }
                this.f74980q = word;
                C26890h.m65011a("trending_words_show", C23089d.m56640a().mo47826a("words_position", 0).mo47829a("words_source", "search_bar_outer").mo47829a("words_content", word.getWord()).mo47829a("group_id", word.getId()).f61491a);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f74975l = (SearchStateViewModel) C0214z.m440a(getActivity()).mo359a(SearchStateViewModel.class);
        this.f74981r = new C47885fh();
        mo58052a(getArguments());
        this.f74976m = C28943a.m68264a(getActivity());
        this.f74978o = (SearchIntermediateViewModel) C0214z.m440a(getActivity()).mo359a(SearchIntermediateViewModel.class);
        this.f74979p = (SearchStateData) C0214z.m438a((Fragment) this).mo359a(SearchStateData.class);
    }

    /* renamed from: a */
    public final void mo58196a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f74970c.getVisibility() == 8) {
            this.f74970c.setVisibility(0);
        } else if (TextUtils.isEmpty(charSequence) && this.f74970c.getVisibility() == 0) {
            this.f74970c.setVisibility(8);
        }
        if (!TextUtils.equals(this.f74982s, charSequence)) {
            this.f74982s = charSequence.toString();
            if (TextUtils.isEmpty(charSequence)) {
                if (mo58207p() != 1) {
                    mo58064m();
                }
            } else if (mo58207p() != 2) {
                mo58204n();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo58058c(mo58060e());
        C26894c.m65022a(this.f74968a);
        mo58177j();
        mo58176i();
        mo58061f();
        mo58203l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo58199a(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            mo58053a(view);
        }
        return false;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo58051a(), viewGroup, false);
        this.f74968a = inflate.findViewById(R.id.aka);
        this.f74969b = (EditText) inflate.findViewById(R.id.ac_);
        this.f74970c = (ImageButton) inflate.findViewById(R.id.nh);
        this.f74971d = (TextView) inflate.findViewById(R.id.dfk);
        this.f74972e = (ImageView) inflate.findViewById(R.id.in);
        this.f74973j = (FrameLayout) inflate.findViewById(R.id.ajf);
        this.f74974k = (SearchIntermediateView) inflate.findViewById(R.id.cjd);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo58197a(String str, String str2, boolean z) {
        String str3;
        boolean z2;
        String str4;
        String trim = str.trim();
        if (!TextUtils.isEmpty(trim)) {
            if (!z) {
                str3 = "normal_search";
            } else if (C41429i.m91249i()) {
                str3 = "recom_search";
            } else {
                str3 = "default_search_keyword";
            }
            String str5 = str3;
            if (!C41429i.m91247g() || (!this.f74974k.mo58103b() && (!this.f74974k.mo58102a() || this.f74974k.getOpenSugFromState() == 2))) {
                z2 = false;
            } else {
                z2 = true;
            }
            AtomicBoolean atomicBoolean = new AtomicBoolean(z2);
            C28650h.m67913a(atomicBoolean, z);
            C28649g gVar = new C28649g(this, trim, str2, z, atomicBoolean, str5);
            C41419f fVar = C41419f.f104984a;
            String k = mo58063k();
            if (z) {
                str4 = "default_search_keyword";
            } else {
                str4 = "normal_search";
            }
            fVar.mo84097a(this, k, str4, gVar, false, trim, "general_search", Boolean.valueOf(true));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58198a(String str, String str2, boolean z, AtomicBoolean atomicBoolean, String str3) {
        C41440e enterFrom = new C41440e().setKeyword(str).setRealSearchWord(str2).setSearchFrom(mo58172a(z)).setOpenNewSearchContainer(atomicBoolean.get()).setEnterFrom(str3);
        C28116e.m66922a(0, enterFrom);
        C41431k.f105004a.tryPrefetchSearchData(enterFrom);
        mo58055b(enterFrom);
        KeyboardUtils.m58184c(this.f74969b);
        this.f74981r.mo95094a("search");
    }
}
