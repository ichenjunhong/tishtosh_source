package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.android.live.broadcast.model.C3458e;
import com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel;
import com.bytedance.android.live.broadcast.preview.StartLiveViewModel;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.bytedance.android.livesdk.p279af.C4609s;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

public final class PreviewSelectTitleWidget extends LiveWidget {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f10490a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PreviewSelectTitleWidget.class), "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(PreviewSelectTitleWidget.class), "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;"))};

    /* renamed from: d */
    public static final C3696a f10491d = new C3696a(null);

    /* renamed from: b */
    public int f10492b;

    /* renamed from: c */
    public String f10493c = "";

    /* renamed from: e */
    private final C52668f f10494e = C52732g.m112285a(new C3702g(this));

    /* renamed from: f */
    private final C52668f f10495f = C52732g.m112285a(new C3697b(this));

    /* renamed from: g */
    private C0199s<Integer> f10496g = new C3703h(this);

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$a */
    public static final class C3696a {
        private C3696a() {
        }

        public /* synthetic */ C3696a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$b */
    static final class C3697b extends C52712l implements C52670a<StartLiveEventViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f10497a;

        C3697b(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f10497a = previewSelectTitleWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10497a.context;
            if (context != null) {
                return (StartLiveEventViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveEventViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$c */
    static final class C3698c<T> implements C0199s<C3458e> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f10498a;

        C3698c(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f10498a = previewSelectTitleWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            C3458e eVar = (C3458e) obj;
            if (eVar != null && !TextUtils.isEmpty(eVar.f9894c)) {
                View view = this.f10498a.contentView;
                C52711k.m112236a((Object) view, "contentView");
                LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.f13);
                C52711k.m112236a((Object) liveEditText, "contentView.ttlive_preview_title");
                liveEditText.setHint("");
                View view2 = this.f10498a.contentView;
                C52711k.m112236a((Object) view2, "contentView");
                ((LiveEditText) view2.findViewById(R.id.f13)).setText(eVar.f9894c);
                View view3 = this.f10498a.contentView;
                C52711k.m112236a((Object) view3, "contentView");
                LiveEditText liveEditText2 = (LiveEditText) view3.findViewById(R.id.f13);
                C52711k.m112236a((Object) liveEditText2, "contentView.ttlive_preview_title");
                if (!TextUtils.isEmpty(liveEditText2.getText())) {
                    View view4 = this.f10498a.contentView;
                    C52711k.m112236a((Object) view4, "contentView");
                    LiveEditText liveEditText3 = (LiveEditText) view4.findViewById(R.id.f13);
                    View view5 = this.f10498a.contentView;
                    C52711k.m112236a((Object) view5, "contentView");
                    LiveEditText liveEditText4 = (LiveEditText) view5.findViewById(R.id.f13);
                    C52711k.m112236a((Object) liveEditText4, "contentView.ttlive_preview_title");
                    Editable text = liveEditText4.getText();
                    if (text == null) {
                        C52711k.m112234a();
                    }
                    liveEditText3.setSelection(text.length());
                }
                PreviewSelectTitleWidget previewSelectTitleWidget = this.f10498a;
                String str = eVar.f9894c;
                C52711k.m112236a((Object) str, "it.mTitle");
                previewSelectTitleWidget.f10493c = str;
                this.f10498a.mo9074a().mo8879g().postValue(Integer.valueOf(0));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$d */
    static final class C3699d<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f10499a;

        C3699d(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f10499a = previewSelectTitleWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && num.intValue() == 1) {
                C0198r h = this.f10499a.mo9074a().mo8880h();
                View view = this.f10499a.contentView;
                C52711k.m112236a((Object) view, "contentView");
                LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.f13);
                C52711k.m112236a((Object) liveEditText, "contentView.ttlive_preview_title");
                h.setValue(String.valueOf(liveEditText.getText()));
            }
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$e */
    public static final class C3700e implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f10500a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C3700e(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f10500a = previewSelectTitleWidget;
        }

        public final void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(String.valueOf(editable))) {
                View view = this.f10500a.contentView;
                C52711k.m112236a((Object) view, "contentView");
                LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.f13);
                C52711k.m112236a((Object) liveEditText, "contentView.ttlive_preview_title");
                Context context = this.f10500a.context;
                C52711k.m112236a((Object) context, "context");
                liveEditText.setHint(context.getResources().getString(R.string.eb0));
                this.f10500a.mo9074a().mo8879g().postValue(Integer.valueOf(2));
            } else {
                View view2 = this.f10500a.contentView;
                C52711k.m112236a((Object) view2, "contentView");
                LiveEditText liveEditText2 = (LiveEditText) view2.findViewById(R.id.f13);
                C52711k.m112236a((Object) liveEditText2, "contentView.ttlive_preview_title");
                liveEditText2.setHint("");
                if (!C52711k.m112239a((Object) this.f10500a.f10493c, (Object) String.valueOf(editable))) {
                    this.f10500a.mo9074a().mo8879g().postValue(Integer.valueOf(1));
                }
            }
            this.f10500a.mo9074a().mo8880h().setValue(String.valueOf(editable));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$f */
    public static final class C3701f implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f10501a;

        /* renamed from: b */
        final /* synthetic */ View f10502b;

        public C3701f(PreviewSelectTitleWidget previewSelectTitleWidget, View view) {
            this.f10501a = previewSelectTitleWidget;
            this.f10502b = view;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (this.f10501a.context != null) {
                Context context = this.f10501a.context;
                View view2 = this.f10501a.contentView;
                C52711k.m112236a((Object) view2, "contentView");
                C4609s.m11068b(context, (LiveEditText) view2.findViewById(R.id.f13));
            }
            this.f10502b.setFocusable(true);
            this.f10502b.setFocusableInTouchMode(true);
            this.f10502b.requestFocus();
            return false;
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$g */
    static final class C3702g extends C52712l implements C52670a<StartLiveViewModel> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f10503a;

        C3702g(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f10503a = previewSelectTitleWidget;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Context context = this.f10503a.context;
            if (context != null) {
                return (StartLiveViewModel) C0214z.m440a((FragmentActivity) context).mo359a(StartLiveViewModel.class);
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$h */
    static final class C3703h<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ PreviewSelectTitleWidget f10504a;

        C3703h(PreviewSelectTitleWidget previewSelectTitleWidget) {
            this.f10504a = previewSelectTitleWidget;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                this.f10504a.f10492b = num.intValue();
                this.f10504a.mo9075a(this.f10504a.f10492b);
            }
        }
    }

    /* renamed from: a */
    public final StartLiveViewModel mo9074a() {
        return (StartLiveViewModel) this.f10494e.getValue();
    }

    public final int getLayoutId() {
        return R.layout.bvv;
    }

    public final void onDestroy() {
        mo9074a().mo8875c().removeObserver(this.f10496g);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate() {
        /*
            r6 = this;
            super.onCreate()
            int r0 = r6.f10492b
            if (r0 == 0) goto L_0x000d
            int r0 = r6.f10492b
            r6.mo9075a(r0)
            goto L_0x0012
        L_0x000d:
            r0 = 11
            r6.mo9075a(r0)
        L_0x0012:
            android.view.View r0 = r6.contentView
            java.lang.String r1 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r1 = 2132023580(0x7f14191c, float:1.9685612E38)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r0 = (com.bytedance.android.live.core.widget.LiveEditText) r0
            java.lang.String r2 = "contentView.ttlive_preview_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.content.Context r2 = r6.context
            java.lang.String r3 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132550329(0x7f1c22b9, float:2.0753986E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setHint(r2)
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r6.mo9074a()
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.mo8875c()
            r2 = r6
            android.arch.lifecycle.k r2 = (android.arch.lifecycle.C0184k) r2
            android.arch.lifecycle.s<java.lang.Integer> r3 = r6.f10496g
            r0.observe(r2, r3)
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r6.mo9074a()
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.mo8873a()
            com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$c r3 = new com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$c
            r3.<init>(r6)
            android.arch.lifecycle.s r3 = (android.arch.lifecycle.C0199s) r3
            r0.observe(r2, r3)
            d.f r0 = r6.f10495f
            java.lang.Object r0 = r0.getValue()
            com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel r0 = (com.bytedance.android.live.broadcast.preview.StartLiveEventViewModel) r0
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.mo8869c()
            com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$d r3 = new com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$d
            r3.<init>(r6)
            android.arch.lifecycle.s r3 = (android.arch.lifecycle.C0199s) r3
            r0.observe(r2, r3)
            java.lang.Class<com.bytedance.android.live.user.a> r0 = com.bytedance.android.live.user.C4282a.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.live.user.a r0 = (com.bytedance.android.live.user.C4282a) r0
            if (r0 == 0) goto L_0x008b
            com.bytedance.android.livesdk.user.e r0 = r0.user()
            if (r0 == 0) goto L_0x008b
            com.bytedance.android.live.base.model.user.i r0 = r0.mo14521a()
            goto L_0x008c
        L_0x008b:
            r0 = 0
        L_0x008c:
            boolean r2 = r0 instanceof com.bytedance.android.live.base.model.user.User
            if (r2 == 0) goto L_0x0171
            com.bytedance.android.live.base.model.user.User r0 = (com.bytedance.android.live.base.model.user.User) r0
            java.lang.String r0 = r0.getNickName()
            r2 = r0
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0171
            int r2 = r0.length()
            r3 = 4
            r4 = 0
            if (r2 <= r3) goto L_0x00e1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r5)
            if (r0 == 0) goto L_0x00d9
            java.lang.String r0 = r0.substring(r4, r3)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            r2.append(r0)
            android.content.Context r0 = r6.context
            java.lang.String r3 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            android.content.res.Resources r0 = r0.getResources()
            r3 = 2132550063(0x7f1c21af, float:2.0753446E38)
            java.lang.String r0 = r0.getString(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x00e1
        L_0x00d9:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)
            throw r0
        L_0x00e1:
            android.content.Context r2 = r6.context
            java.lang.String r3 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2132551289(0x7f1c2679, float:2.0755933E38)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            java.lang.String r0 = r2.getString(r3, r5)
            android.view.View r2 = r6.contentView
            java.lang.String r3 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.view.View r2 = r2.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r2 = (com.bytedance.android.live.core.widget.LiveEditText) r2
            java.lang.String r3 = "contentView.ttlive_preview_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            java.lang.String r3 = ""
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setHint(r3)
            android.view.View r2 = r6.contentView
            java.lang.String r3 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.view.View r2 = r2.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r2 = (com.bytedance.android.live.core.widget.LiveEditText) r2
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r2.setText(r3)
            android.view.View r2 = r6.contentView
            java.lang.String r3 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.view.View r2 = r2.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r2 = (com.bytedance.android.live.core.widget.LiveEditText) r2
            java.lang.String r3 = "contentView.ttlive_preview_title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.text.Editable r2 = r2.getText()
            if (r2 == 0) goto L_0x0150
            android.view.View r3 = r6.contentView
            java.lang.String r5 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r5)
            android.view.View r3 = r3.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r3 = (com.bytedance.android.live.core.widget.LiveEditText) r3
            int r2 = r2.length()
            r3.setSelection(r2)
        L_0x0150:
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r2 = r6.mo9074a()
            android.arch.lifecycle.r r2 = r2.mo8880h()
            r2.setValue(r0)
            java.lang.String r2 = "title"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            r6.f10493c = r0
            com.bytedance.android.live.broadcast.preview.StartLiveViewModel r0 = r6.mo9074a()
            com.bytedance.ies.sdk.widgets.NextLiveData r0 = r0.mo8879g()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.postValue(r2)
        L_0x0171:
            android.view.View r0 = r6.contentView
            java.lang.String r2 = "contentView"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            android.view.View r0 = r0.findViewById(r1)
            com.bytedance.android.live.core.widget.LiveEditText r0 = (com.bytedance.android.live.core.widget.LiveEditText) r0
            com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$e r1 = new com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget$e
            r1.<init>(r6)
            android.text.TextWatcher r1 = (android.text.TextWatcher) r1
            r0.addTextChangedListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.PreviewSelectTitleWidget.onCreate():void");
    }

    /* renamed from: a */
    public final void mo9075a(int i) {
        InputFilter[] inputFilterArr = {new LengthFilter(i)};
        View view = this.contentView;
        C52711k.m112236a((Object) view, "contentView");
        LiveEditText liveEditText = (LiveEditText) view.findViewById(R.id.f13);
        C52711k.m112236a((Object) liveEditText, "contentView.ttlive_preview_title");
        liveEditText.setFilters(inputFilterArr);
    }
}
