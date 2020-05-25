package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35190af;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.MTSearchHead */
public final class MTSearchHead extends LinearLayout {

    /* renamed from: d */
    public static boolean f90819d;

    /* renamed from: e */
    public static final C35361a f90820e = new C35361a(null);

    /* renamed from: a */
    public final EditText f90821a;

    /* renamed from: b */
    public final ImageView f90822b;

    /* renamed from: c */
    public BaseMemberListViewModel<?> f90823c;

    /* renamed from: f */
    private final View f90824f;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.MTSearchHead$a */
    public static final class C35361a {
        private C35361a() {
        }

        /* renamed from: a */
        public static void m79985a(boolean z) {
            MTSearchHead.f90819d = z;
        }

        public /* synthetic */ C35361a(C52707g gVar) {
            this();
        }
    }

    public MTSearchHead(Context context) {
        this(context, null, 0, 6, null);
    }

    public MTSearchHead(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setListViewModel(BaseMemberListViewModel<?> baseMemberListViewModel) {
        this.f90823c = baseMemberListViewModel;
    }

    public MTSearchHead(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = View.inflate(context, R.layout.bgw, this);
        C52711k.m112236a((Object) inflate, "View.inflate(context, R.…layout_search_head, this)");
        this.f90824f = inflate;
        View findViewById = this.f90824f.findViewById(R.id.cj5);
        C52711k.m112236a((Object) findViewById, "mRootView.findViewById(R.id.search_et)");
        this.f90821a = (EditText) findViewById;
        View findViewById2 = this.f90824f.findViewById(R.id.nh);
        C52711k.m112236a((Object) findViewById2, "mRootView.findViewById(R.id.btn_clear)");
        this.f90822b = (ImageView) findViewById2;
        this.f90821a.setOnKeyListener(new OnKeyListener(this) {

            /* renamed from: a */
            final /* synthetic */ MTSearchHead f90825a;

            {
                this.f90825a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                String str;
                boolean z;
                switch (i) {
                    case 66:
                        MTSearchHead mTSearchHead = this.f90825a;
                        mTSearchHead.f90821a.clearFocus();
                        KeyboardUtils.m58184c(mTSearchHead.f90821a);
                        return true;
                    case 67:
                        C52711k.m112236a((Object) keyEvent, "event");
                        if (keyEvent.getAction() == 1) {
                            BaseMemberListViewModel<?> baseMemberListViewModel = this.f90825a.f90823c;
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
                                BaseMemberListViewModel<?> baseMemberListViewModel2 = this.f90825a.f90823c;
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
        this.f90821a.setOnTouchListener(new OnTouchListener(this) {

            /* renamed from: a */
            final /* synthetic */ MTSearchHead f90826a;

            {
                this.f90826a = r1;
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                C35361a.m79985a(true);
                C52711k.m112236a((Object) motionEvent, "event");
                if (motionEvent.getActionMasked() == 0) {
                    C35190af.m79442a();
                    C35190af.m79527j("share");
                }
                ((ShareNestedLayout) this.f90826a.getRootView().findViewById(R.id.cnh)).mo73616c();
                this.f90826a.f90821a.requestFocus();
                return false;
            }
        });
        this.f90821a.addTextChangedListener(new TextWatcher(this) {

            /* renamed from: a */
            final /* synthetic */ MTSearchHead f90827a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C52711k.m112240b(charSequence, "s");
            }

            {
                this.f90827a = r1;
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
                    BaseMemberListViewModel<?> baseMemberListViewModel = this.f90827a.f90823c;
                    if (baseMemberListViewModel != null) {
                        baseMemberListViewModel.mo73180b(0);
                    }
                    BaseMemberListViewModel<?> baseMemberListViewModel2 = this.f90827a.f90823c;
                    if (baseMemberListViewModel2 != null) {
                        baseMemberListViewModel2.mo72357a();
                    }
                } else {
                    BaseMemberListViewModel<?> baseMemberListViewModel3 = this.f90827a.f90823c;
                    if (baseMemberListViewModel3 != null) {
                        baseMemberListViewModel3.mo73180b(1);
                    }
                    BaseMemberListViewModel<?> baseMemberListViewModel4 = this.f90827a.f90823c;
                    if (baseMemberListViewModel4 != null) {
                        baseMemberListViewModel4.mo72358a(str);
                    }
                }
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                C52711k.m112240b(charSequence, "s");
                if (TextUtils.isEmpty(charSequence) || this.f90827a.f90822b.getVisibility() != 8) {
                    if (TextUtils.isEmpty(charSequence) && this.f90827a.f90822b.getVisibility() == 0) {
                        this.f90827a.f90822b.setVisibility(8);
                    }
                    return;
                }
                this.f90827a.f90822b.setVisibility(0);
            }
        });
        this.f90822b.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ MTSearchHead f90828a;

            {
                this.f90828a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f90828a.f90821a.setText("");
            }
        });
    }

    public /* synthetic */ MTSearchHead(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
