package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34827j;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.SearchHeadListView */
public final class SearchHeadListView extends LinearLayout {

    /* renamed from: a */
    public final RecyclerView f89597a;

    /* renamed from: b */
    public final ImageView f89598b;

    /* renamed from: c */
    public final ImageView f89599c;

    /* renamed from: d */
    public final C34827j f89600d;

    /* renamed from: e */
    public BaseMemberListViewModel<?> f89601e;

    /* renamed from: f */
    private final View f89602f;

    /* renamed from: g */
    private final EditText f89603g;

    /* renamed from: h */
    private final int f89604h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.SearchHeadListView$a */
    static final class C34788a extends C52712l implements C52671b<IMContact, C52860x> {

        /* renamed from: a */
        final /* synthetic */ SearchHeadListView f89609a;

        C34788a(SearchHeadListView searchHeadListView) {
            this.f89609a = searchHeadListView;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            IMContact iMContact = (IMContact) obj;
            C52711k.m112240b(iMContact, "it");
            BaseMemberListViewModel<?> baseMemberListViewModel = this.f89609a.f89601e;
            if (baseMemberListViewModel != null) {
                baseMemberListViewModel.mo73179a(iMContact);
            }
            this.f89609a.mo72899b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.SearchHeadListView$b */
    public static final class C34789b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ SearchHeadListView f89610a;

        public C34789b(SearchHeadListView searchHeadListView) {
            this.f89610a = searchHeadListView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f89610a.f89597a.mo4814b(0);
            return C52860x.f131107a;
        }
    }

    public SearchHeadListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SearchHeadListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo72898a() {
        this.f89603g.setText("");
    }

    /* renamed from: b */
    public final void mo72899b() {
        this.f89603g.clearFocus();
        Context context = getContext();
        if (context != null) {
            C26894c.m65021a((Activity) context, this.f89603g);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.app.Activity");
    }

    public final void setListViewModel(BaseMemberListViewModel<?> baseMemberListViewModel) {
        this.f89601e = baseMemberListViewModel;
    }

    public SearchHeadListView(final Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.bgp, this);
        C52711k.m112236a((Object) inflate, "View.inflate(context, R.…t_search_head_list, this)");
        this.f89602f = inflate;
        View findViewById = this.f89602f.findViewById(R.id.anu);
        C52711k.m112236a((Object) findViewById, "mRootView.findViewById(R.id.head_list)");
        this.f89597a = (RecyclerView) findViewById;
        View findViewById2 = this.f89602f.findViewById(R.id.b3y);
        C52711k.m112236a((Object) findViewById2, "mRootView.findViewById(R.id.iv_search)");
        this.f89598b = (ImageView) findViewById2;
        View findViewById3 = this.f89602f.findViewById(R.id.cj5);
        C52711k.m112236a((Object) findViewById3, "mRootView.findViewById(R.id.search_et)");
        this.f89603g = (EditText) findViewById3;
        View findViewById4 = this.f89602f.findViewById(R.id.nh);
        C52711k.m112236a((Object) findViewById4, "mRootView.findViewById(R.id.btn_clear)");
        this.f89599c = (ImageView) findViewById4;
        this.f89600d = new C34827j((C0184k) context, new C34788a(this));
        this.f89604h = C9432q.m18670a(context) - ((int) C9432q.m18687b(context, 95.0f));
        RecyclerView recyclerView = this.f89597a;
        FixedSizeLinearLayoutManager fixedSizeLinearLayoutManager = new FixedSizeLinearLayoutManager(context, 0, true);
        fixedSizeLinearLayoutManager.f89568a = this.f89604h;
        recyclerView.setLayoutManager(fixedSizeLinearLayoutManager);
        recyclerView.setAdapter(this.f89600d);
        recyclerView.setHorizontalScrollBarEnabled(true);
        recyclerView.setScrollBarStyle(33554432);
        this.f89603g.setOnKeyListener(new OnKeyListener(this) {

            /* renamed from: a */
            final /* synthetic */ SearchHeadListView f89605a;

            {
                this.f89605a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                String str;
                boolean z;
                switch (i) {
                    case 66:
                        this.f89605a.mo72899b();
                        return true;
                    case 67:
                        C52711k.m112236a((Object) keyEvent, "event");
                        if (keyEvent.getAction() == 1) {
                            BaseMemberListViewModel<?> baseMemberListViewModel = this.f89605a.f89601e;
                            if (baseMemberListViewModel != null) {
                                str = baseMemberListViewModel.mo73185q();
                            } else {
                                str = null;
                            }
                            CharSequence charSequence = str;
                            if (charSequence == null || charSequence.length() == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                BaseMemberListViewModel<?> baseMemberListViewModel2 = this.f89605a.f89601e;
                                if (baseMemberListViewModel2 != null) {
                                    baseMemberListViewModel2.mo73186r();
                                }
                                return true;
                            }
                        }
                        return false;
                    default:
                        return false;
                }
            }
        });
        this.f89603g.setOnTouchListener(new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean z;
                Context context = context;
                if (!(context instanceof Activity)) {
                    context = null;
                }
                Activity activity = (Activity) context;
                if (activity != null) {
                    Window window = activity.getWindow();
                    if (window != null) {
                        if (motionEvent == null || motionEvent.getAction() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            window = null;
                        }
                        if (window != null) {
                            window.setSoftInputMode(48);
                        }
                    }
                }
                return false;
            }
        });
        this.f89603g.addTextChangedListener(new TextWatcher(this) {

            /* renamed from: a */
            final /* synthetic */ SearchHeadListView f89607a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C52711k.m112240b(charSequence, "s");
            }

            {
                this.f89607a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                String str;
                boolean z;
                if (editable != null) {
                    str = editable.toString();
                } else {
                    str = null;
                }
                CharSequence charSequence = str;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    BaseMemberListViewModel<?> baseMemberListViewModel = this.f89607a.f89601e;
                    if (baseMemberListViewModel != null) {
                        baseMemberListViewModel.mo73180b(0);
                    }
                    BaseMemberListViewModel<?> baseMemberListViewModel2 = this.f89607a.f89601e;
                    if (baseMemberListViewModel2 != null) {
                        baseMemberListViewModel2.mo72357a();
                    }
                } else {
                    BaseMemberListViewModel<?> baseMemberListViewModel3 = this.f89607a.f89601e;
                    if (baseMemberListViewModel3 != null) {
                        baseMemberListViewModel3.mo73180b(1);
                    }
                    BaseMemberListViewModel<?> baseMemberListViewModel4 = this.f89607a.f89601e;
                    if (baseMemberListViewModel4 != null) {
                        baseMemberListViewModel4.mo72358a(str);
                    }
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C52711k.m112240b(charSequence, "s");
                if (TextUtils.isEmpty(charSequence) || this.f89607a.f89599c.getVisibility() != 8) {
                    if (TextUtils.isEmpty(charSequence) && this.f89607a.f89599c.getVisibility() == 0) {
                        this.f89607a.f89599c.setVisibility(8);
                    }
                    return;
                }
                this.f89607a.f89599c.setVisibility(0);
            }
        });
        this.f89599c.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ SearchHeadListView f89608a;

            {
                this.f89608a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f89608a.mo72898a();
            }
        });
    }

    public /* synthetic */ SearchHeadListView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
