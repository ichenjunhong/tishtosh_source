package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.bytedance.android.live.base.model.user.C3012k;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.widget.FitTextView;
import com.bytedance.android.live.core.widget.LiveEditText;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.admin.p274b.C4532c;
import com.bytedance.android.livesdk.admin.p275c.C4533a;
import com.bytedance.android.livesdk.admin.p277e.C4546a;
import com.bytedance.android.livesdk.blockword.C4660a;
import com.bytedance.android.livesdk.blockword.C4660a.C4661a;
import com.bytedance.android.livesdk.blockword.C4660a.C4663c;
import com.bytedance.android.livesdk.blockword.C4660a.C4664d;
import com.bytedance.android.livesdk.blockword.C4660a.C4665e;
import com.bytedance.android.livesdk.blockword.C4660a.C4666f;
import com.bytedance.android.livesdk.blockword.p286a.C4669a;
import com.bytedance.android.livesdk.chatroom.p325ui.C6080dg.C6082b;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4602l;
import com.bytedance.android.livesdk.p279af.C4609s;
import com.bytedance.android.livesdk.p328d.C6737a;
import com.bytedance.android.livesdk.p328d.C6742f;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p422w.C8442a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.p683ss.android.ugc.aweme.tools.extract.C47041l;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C1673aa;
import p064c.p065a.p071d.C1710e;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl */
public final class C6093dl extends FrameLayout implements OnClickListener, C4546a, C4661a, C6742f {

    /* renamed from: e */
    public static final C6099b f16333e = new C6099b(null);

    /* renamed from: a */
    LengthFilter f16334a;

    /* renamed from: b */
    public boolean f16335b;

    /* renamed from: c */
    public boolean f16336c;

    /* renamed from: d */
    public final C4660a f16337d = new C4660a();

    /* renamed from: f */
    private final C6737a f16338f = new C6737a();

    /* renamed from: g */
    private final C4533a f16339g = new C4533a(this);

    /* renamed from: h */
    private C6082b f16340h;

    /* renamed from: i */
    private final TextWatcher f16341i = new C6104f(this);

    /* renamed from: j */
    private final OnEditorActionListener f16342j = new C6103e(this);

    /* renamed from: k */
    private final Room f16343k;

    /* renamed from: l */
    private final User f16344l;

    /* renamed from: m */
    private final boolean f16345m;

    /* renamed from: n */
    private final boolean f16346n;

    /* renamed from: o */
    private HashMap f16347o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$a */
    public static final class C6094a extends C1322a<C6096b> {

        /* renamed from: a */
        public final LayoutInflater f16348a = LayoutInflater.from(this.f16350c);

        /* renamed from: b */
        public C6095a f16349b;

        /* renamed from: c */
        public final Context f16350c;

        /* renamed from: d */
        public final List<C4669a> f16351d;

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$a$a */
        public interface C6095a {
            /* renamed from: a */
            void mo12134a(C4669a aVar, int i);
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$a$b */
        public static final class C6096b extends C1352v {

            /* renamed from: a */
            final View f16352a;

            /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$a$b$a */
            static final class C6097a implements OnClickListener {

                /* renamed from: a */
                final /* synthetic */ C52671b f16353a;

                C6097a(C52671b bVar) {
                    this.f16353a = bVar;
                }

                public final void onClick(View view) {
                    C52671b bVar = this.f16353a;
                    C52711k.m112236a((Object) view, "v");
                    bVar.invoke(view);
                }
            }

            public C6096b(View view) {
                C52711k.m112240b(view, "blockView");
                super(view);
                this.f16352a = view;
            }
        }

        /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$a$c */
        static final class C6098c extends C52712l implements C52671b<View, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C6094a f16354a;

            /* renamed from: b */
            final /* synthetic */ C4669a f16355b;

            C6098c(C6094a aVar, C4669a aVar2) {
                this.f16354a = aVar;
                this.f16355b = aVar2;
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                C52711k.m112240b((View) obj, "it");
                int indexOf = this.f16354a.f16351d.indexOf(this.f16355b);
                if (indexOf != -1 && indexOf < this.f16354a.f16351d.size()) {
                    C6095a aVar = this.f16354a.f16349b;
                    if (aVar != null) {
                        aVar.mo12134a(this.f16355b, indexOf);
                    }
                }
                return C52860x.f131107a;
            }
        }

        public final int getItemCount() {
            return this.f16351d.size();
        }

        public C6094a(Context context, List<C4669a> list) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(list, "blockwords");
            this.f16350c = context;
            this.f16351d = list;
        }

        public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
            C52711k.m112240b(viewGroup, "parent");
            View inflate = this.f16348a.inflate(R.layout.bwn, viewGroup, false);
            C52711k.m112236a((Object) inflate, "view");
            return new C6096b(inflate);
        }

        public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
            C6096b bVar = (C6096b) vVar;
            C52711k.m112240b(bVar, "holder");
            C4669a aVar = (C4669a) this.f16351d.get(i);
            C52711k.m112240b(aVar, "word");
            TextView textView = (TextView) bVar.f16352a.findViewById(R.id.dzg);
            C52711k.m112236a((Object) textView, "blockView.block_word_content");
            textView.setText(aVar.f12737b);
            C52671b cVar = new C6098c(this, aVar);
            C52711k.m112240b(cVar, C47041l.f118793f);
            ((LinearLayout) bVar.f16352a.findViewById(R.id.dzh)).setOnClickListener(new C6097a(cVar));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$b */
    public static final class C6099b {
        private C6099b() {
        }

        public /* synthetic */ C6099b(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$c */
    static final class C6100c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C6093dl f16356a;

        C6100c(C6093dl dlVar) {
            this.f16356a = dlVar;
        }

        public final void onClick(View view) {
            ((LiveEditText) this.f16356a.mo12125a((int) R.id.dzj)).postDelayed(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C6100c f16357a;

                {
                    this.f16357a = r1;
                }

                public final void run() {
                    this.f16357a.f16356a.mo12126a((LiveEditText) this.f16357a.f16356a.mo12125a((int) R.id.dzj), 200, 1, 5);
                    ((LiveEditText) this.f16357a.f16356a.mo12125a((int) R.id.dzj)).requestFocus();
                    C4609s.m11067a(this.f16357a.f16356a.getContext(), (LiveEditText) this.f16357a.f16356a.mo12125a((int) R.id.dzj));
                }
            }, 100);
            C8049c.m15979a().mo14202a("livesdk_stopword_set", this.f16356a.getCommonLogPara(), new Object[0]);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$d */
    public static final class C6102d implements C6095a {

        /* renamed from: a */
        final /* synthetic */ C6093dl f16358a;

        C6102d(C6093dl dlVar) {
            this.f16358a = dlVar;
        }

        /* renamed from: a */
        public final void mo12134a(C4669a aVar, int i) {
            C52711k.m112240b(aVar, "blockword");
            C4660a aVar2 = this.f16358a.f16337d;
            Integer valueOf = Integer.valueOf(i);
            C52711k.m112240b(aVar, "word");
            aVar2.f12724a.deleteBlockWord(aVar.f12736a).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C4665e<Object>(aVar2, valueOf, aVar), (C1710e<? super Throwable>) new C4666f<Object>(aVar2));
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$e */
    static final class C6103e implements OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C6093dl f16359a;

        C6103e(C6093dl dlVar) {
            this.f16359a = dlVar;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            boolean z;
            if (i == 4) {
                C52711k.m112236a((Object) textView, "v");
                if (!C6106dm.m13276a(textView.getContext())) {
                    C4575an.m10981a((int) R.string.e77);
                }
                CharSequence obj = textView.getText().toString();
                if (obj.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || C52830p.m112402a(obj)) {
                    C4575an.m10981a((int) R.string.gzw);
                } else {
                    String obj2 = textView.getText().toString();
                    if (obj2 != null) {
                        C4669a aVar = new C4669a(-1, C52830p.m112447b(obj2).toString());
                        C4660a aVar2 = this.f16359a.f16337d;
                        C52711k.m112240b(aVar, "word");
                        aVar2.f12724a.addBlockWord(aVar.f12737b).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C4663c<Object>(aVar2, aVar), (C1710e<? super Throwable>) new C4664d<Object>(aVar2));
                        textView.setText("");
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$f */
    public static final class C6104f implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C6093dl f16360a;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C52711k.m112240b(charSequence, "s");
        }

        C6104f(C6093dl dlVar) {
            this.f16360a = dlVar;
        }

        public final void afterTextChanged(Editable editable) {
            C52711k.m112240b(editable, "s");
            LiveEditText liveEditText = (LiveEditText) this.f16360a.mo12125a((int) R.id.dzj);
            C52711k.m112236a((Object) liveEditText, "block_word_edit_text");
            String valueOf = String.valueOf(liveEditText.getText());
            if (TextUtils.isEmpty(valueOf)) {
                FitTextView fitTextView = (FitTextView) this.f16360a.mo12125a((int) R.id.dzk);
                C52711k.m112236a((Object) fitTextView, "block_word_edit_text_hint");
                fitTextView.setVisibility(0);
            } else {
                FitTextView fitTextView2 = (FitTextView) this.f16360a.mo12125a((int) R.id.dzk);
                C52711k.m112236a((Object) fitTextView2, "block_word_edit_text_hint");
                fitTextView2.setVisibility(8);
            }
            int length = valueOf.length();
            if (length > 10) {
                C6093dl dlVar = this.f16360a;
                LiveEditText liveEditText2 = (LiveEditText) this.f16360a.mo12125a((int) R.id.dzj);
                C52711k.m112236a((Object) liveEditText2, "block_word_edit_text");
                EditText editText = liveEditText2;
                dlVar.f16334a = new LengthFilter(length);
                editText.setFilters((InputFilter[]) new LengthFilter[]{dlVar.f16334a});
                if (valueOf != null) {
                    String substring = valueOf.substring(0, 10);
                    C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    ((LiveEditText) this.f16360a.mo12125a((int) R.id.dzj)).setText(substring);
                    ((LiveEditText) this.f16360a.mo12125a((int) R.id.dzj)).setSelection(substring.length());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type java.lang.String");
            }
            C6093dl dlVar2 = this.f16360a;
            LiveEditText liveEditText3 = (LiveEditText) this.f16360a.mo12125a((int) R.id.dzj);
            C52711k.m112236a((Object) liveEditText3, "block_word_edit_text");
            EditText editText2 = liveEditText3;
            if (dlVar2.f16334a != null) {
                editText2.setFilters(new InputFilter[0]);
                dlVar2.f16334a = null;
            }
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.dl$g */
    static final class C6105g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C6093dl f16361a;

        /* renamed from: b */
        final /* synthetic */ EditText f16362b;

        /* renamed from: c */
        final /* synthetic */ long f16363c;

        /* renamed from: d */
        final /* synthetic */ int f16364d;

        /* renamed from: e */
        final /* synthetic */ int f16365e;

        C6105g(C6093dl dlVar, EditText editText, long j, int i, int i2) {
            this.f16361a = dlVar;
            this.f16362b = editText;
            this.f16363c = j;
            this.f16364d = i;
            this.f16365e = i2;
        }

        public final /* synthetic */ void run() {
            if (this.f16361a.f16336c && !this.f16361a.f16335b) {
                C4609s.m11067a(this.f16361a.getContext(), this.f16362b);
                this.f16361a.mo12126a(this.f16362b, this.f16363c, this.f16364d + 1, this.f16365e);
            }
        }
    }

    /* renamed from: a */
    public final View mo12125a(int i) {
        if (this.f16347o == null) {
            this.f16347o = new HashMap();
        }
        View view = (View) this.f16347o.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f16347o.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo10360a(C4532c cVar, Exception exc) {
        C52711k.m112240b(cVar, "userBean");
        C52711k.m112240b(exc, "exception");
    }

    /* renamed from: b */
    public final void mo10450b(Throwable th) {
        C52711k.m112240b(th, "throwable");
    }

    /* renamed from: c */
    public final void mo10451c(Throwable th) {
        C52711k.m112240b(th, "throwable");
    }

    public final C6082b getClickCallback() {
        return this.f16340h;
    }

    /* renamed from: a */
    public final void mo10362a(boolean z, User user) {
        C52711k.m112240b(user, "user");
        if (this.f16336c) {
            User user2 = this.f16344l;
            if (user2 == null) {
                C52711k.m112234a();
            }
            if (user2.getUserAttr() == null) {
                this.f16344l.setUserAttr(new C3012k());
            }
            C3012k userAttr = this.f16344l.getUserAttr();
            C52711k.m112236a((Object) userAttr, "mUser.userAttr");
            userAttr.f8851b = z;
            ((TextView) mo12125a((int) R.id.bk1)).setText(z ? R.string.ep0 : R.string.ep5);
            C4575an.m10981a(z ? R.string.hqx : R.string.hqv);
        }
    }

    /* renamed from: a */
    public final void mo10363a(boolean z, Exception exc) {
        C52711k.m112240b(exc, "exception");
        if (this.f16336c) {
            C4602l.m11047a(getContext(), (Throwable) exc, (int) R.string.eon);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f16336c = true;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f16336c = false;
        this.f16338f.f18413a = null;
        super.onDetachedFromWindow();
    }

    public final Map<String, String> getCommonLogPara() {
        Map<String, String> hashMap = new HashMap<>();
        String str = "anchor_id";
        Room room = this.f16343k;
        if (room == null) {
            C52711k.m112234a();
        }
        hashMap.put(str, String.valueOf(room.getOwnerUserId()));
        String idStr = this.f16343k.getIdStr();
        C52711k.m112236a((Object) idStr, "mRoom.idStr");
        hashMap.put("room_id", idStr);
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0144, code lost:
        if (r0.getId() == r10.f16344l.getId()) goto L_0x01c5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13259a() {
        /*
            r10 = this;
            android.content.Context r0 = r10.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = r10
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = 1
            r3 = 2132216023(0x7f1708d7, float:2.0075933E38)
            r0.inflate(r3, r1, r2)
            r0 = 2132017685(0x7f140215, float:1.9673655E38)
            android.view.View r0 = r10.mo12125a(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            java.lang.String r1 = "block_word_red_dot"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.bytedance.android.livesdk.ad.c<java.lang.Boolean> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12398bN
            java.lang.String r3 = "BLOCK_WORD_PANNEL_TIPS_SHOW"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.Object r1 = r1.mo10345a()
            java.lang.String r3 = "BLOCK_WORD_PANNEL_TIPS_SHOW.value"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r3 = 8
            r4 = 0
            if (r1 == 0) goto L_0x003d
            r1 = 0
            goto L_0x003f
        L_0x003d:
            r1 = 8
        L_0x003f:
            r0.setVisibility(r1)
            com.bytedance.android.livesdk.ad.c<java.lang.Boolean> r0 = com.bytedance.android.livesdk.p272ad.C4525b.f12398bN
            java.lang.String r1 = "BLOCK_WORD_PANNEL_TIPS_SHOW"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            r0.mo10346a(r1)
            android.support.v7.widget.LinearLayoutManager r0 = new android.support.v7.widget.LinearLayoutManager
            android.content.Context r1 = r10.getContext()
            r0.<init>(r1, r4, r4)
            r1 = 2132017677(0x7f14020d, float:1.967364E38)
            android.view.View r1 = r10.mo12125a(r1)
            com.bytedance.android.livesdk.chatroom.ui.dl$c r5 = new com.bytedance.android.livesdk.chatroom.ui.dl$c
            r5.<init>(r10)
            android.view.View$OnClickListener r5 = (android.view.View.OnClickListener) r5
            r1.setOnClickListener(r5)
            r1 = 2132017682(0x7f140212, float:1.967365E38)
            android.view.View r5 = r10.mo12125a(r1)
            com.bytedance.android.live.core.widget.LiveEditText r5 = (com.bytedance.android.live.core.widget.LiveEditText) r5
            android.text.TextWatcher r6 = r10.f16341i
            r5.addTextChangedListener(r6)
            android.view.View r1 = r10.mo12125a(r1)
            com.bytedance.android.live.core.widget.LiveEditText r1 = (com.bytedance.android.live.core.widget.LiveEditText) r1
            android.widget.TextView$OnEditorActionListener r5 = r10.f16342j
            r1.setOnEditorActionListener(r5)
            r1 = 2132017683(0x7f140213, float:1.9673651E38)
            android.view.View r1 = r10.mo12125a(r1)
            com.bytedance.android.live.core.widget.FitTextView r1 = (com.bytedance.android.live.core.widget.FitTextView) r1
            java.lang.String r5 = "block_word_edit_text_hint"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            android.content.Context r5 = r10.getContext()
            r6 = 2132547454(0x7f1c177e, float:2.0748155E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r7 = 10
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r2[r4] = r7
            java.lang.String r2 = r5.getString(r6, r2)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            r1 = 2132017686(0x7f140216, float:1.9673657E38)
            android.view.View r2 = r10.mo12125a(r1)
            android.support.v7.widget.RecyclerView r2 = (android.support.p043v7.widget.RecyclerView) r2
            java.lang.String r5 = "block_word_rv_view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            android.support.v7.widget.RecyclerView$i r0 = (android.support.p043v7.widget.RecyclerView.C1332i) r0
            r2.setLayoutManager(r0)
            com.bytedance.android.livesdk.chatroom.ui.dl$a r0 = new com.bytedance.android.livesdk.chatroom.ui.dl$a
            android.content.Context r2 = r10.getContext()
            java.lang.String r5 = "context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            com.bytedance.android.livesdk.blockword.a r5 = r10.f16337d
            java.util.List<com.bytedance.android.livesdk.blockword.a.a> r5 = r5.f12725b
            r0.<init>(r2, r5)
            com.bytedance.android.livesdk.chatroom.ui.dl$d r2 = new com.bytedance.android.livesdk.chatroom.ui.dl$d
            r2.<init>(r10)
            com.bytedance.android.livesdk.chatroom.ui.dl$a$a r2 = (com.bytedance.android.livesdk.chatroom.p325ui.C6093dl.C6094a.C6095a) r2
            r0.f16349b = r2
            android.view.View r1 = r10.mo12125a(r1)
            android.support.v7.widget.RecyclerView r1 = (android.support.p043v7.widget.RecyclerView) r1
            java.lang.String r2 = "block_word_rv_view"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            android.support.v7.widget.RecyclerView$a r0 = (android.support.p043v7.widget.RecyclerView.C1322a) r0
            r1.setAdapter(r0)
            android.content.Context r0 = r10.getContext()
            boolean r0 = com.bytedance.android.live.uikit.p257c.C4206c.m10426a(r0)
            if (r0 == 0) goto L_0x0113
            r0 = 2132017688(0x7f140218, float:1.9673661E38)
            android.view.View r0 = r10.mo12125a(r0)
            java.lang.String r1 = "block_word_rv_view_slider_start"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r1 = 1127481344(0x43340000, float:180.0)
            r0.setRotationY(r1)
            r0 = 2132017687(0x7f140217, float:1.967366E38)
            android.view.View r0 = r10.mo12125a(r0)
            java.lang.String r2 = "block_word_rv_view_slider_end"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            r0.setRotationY(r1)
        L_0x0113:
            r0 = 2132017918(0x7f1402fe, float:1.9674128E38)
            android.view.View r0 = r10.mo12125a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = r10
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            boolean r0 = r10.f16345m
            r2 = 3
            r5 = 2132017191(0x7f140027, float:1.9672653E38)
            if (r0 != 0) goto L_0x01c5
            com.bytedance.android.live.base.model.user.User r0 = r10.f16344l
            if (r0 == 0) goto L_0x01c5
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r10.f16343k
            if (r0 == 0) goto L_0x0148
            com.bytedance.android.live.base.model.user.User r0 = r0.getOwner()
            if (r0 == 0) goto L_0x0148
            long r6 = r0.getId()
            com.bytedance.android.live.base.model.user.User r0 = r10.f16344l
            long r8 = r0.getId()
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0148
            goto L_0x01c5
        L_0x0148:
            r0 = 2132017678(0x7f14020e, float:1.9673641E38)
            android.view.View r0 = r10.mo12125a(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            java.lang.String r6 = "block_word_container"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r6)
            r0.setVisibility(r3)
            android.view.View r0 = r10.mo12125a(r5)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeViews(r4, r2)
            r0 = 2132020984(0x7f140ef8, float:1.9680347E38)
            android.view.View r2 = r10.mo12125a(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setOnClickListener(r1)
            r2 = 2132020349(0x7f140c7d, float:1.9679059E38)
            android.view.View r2 = r10.mo12125a(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setOnClickListener(r1)
            r2 = 2132021198(0x7f140fce, float:1.968078E38)
            android.view.View r4 = r10.mo12125a(r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r4.setOnClickListener(r1)
            com.bytedance.android.live.base.model.user.User r1 = r10.f16344l
            com.bytedance.android.live.base.model.user.k r1 = r1.getUserAttr()
            if (r1 == 0) goto L_0x01b6
            android.view.View r4 = r10.mo12125a(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            boolean r5 = r1.f8851b
            if (r5 == 0) goto L_0x019c
            r5 = 2132550890(0x7f1c24ea, float:2.0755124E38)
            goto L_0x019f
        L_0x019c:
            r5 = 2132550897(0x7f1c24f1, float:2.0755138E38)
        L_0x019f:
            r4.setText(r5)
            android.view.View r2 = r10.mo12125a(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r1 = r1.f8850a
            if (r1 == 0) goto L_0x01b0
            r1 = 2132550892(0x7f1c24ec, float:2.0755128E38)
            goto L_0x01b3
        L_0x01b0:
            r1 = 2132550895(0x7f1c24ef, float:2.0755134E38)
        L_0x01b3:
            r2.setText(r1)
        L_0x01b6:
            android.view.View r0 = r10.mo12125a(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.String r1 = "manager"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setVisibility(r3)
            return
        L_0x01c5:
            android.view.View r0 = r10.mo12125a(r5)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.removeViews(r2, r3)
            r0 = 2132020986(0x7f140efa, float:1.968035E38)
            android.view.View r2 = r10.mo12125a(r0)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r2.setOnClickListener(r1)
            r2 = 2132021199(0x7f140fcf, float:1.9680783E38)
            android.view.View r2 = r10.mo12125a(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r2.setOnClickListener(r1)
            r2 = 2132020350(0x7f140c7e, float:1.967906E38)
            android.view.View r2 = r10.mo12125a(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            r2.setOnClickListener(r1)
            android.view.View r0 = r10.mo12125a(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            java.lang.String r1 = "manager_list"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r0.setVisibility(r3)
            com.bytedance.android.livesdk.blockword.a r0 = r10.f16337d
            com.bytedance.android.livesdk.blockword.BlockWordApi r1 = r0.f12724a
            c.a.v r1 = r1.getBlockWord()
            com.bytedance.android.live.core.rxutils.g r2 = com.bytedance.android.live.core.rxutils.C4064k.m10182a()
            c.a.aa r2 = (p064c.p065a.C1673aa) r2
            c.a.v r1 = r1.mo6513a(r2)
            com.bytedance.android.livesdk.blockword.a$g r2 = new com.bytedance.android.livesdk.blockword.a$g
            r2.<init>(r0)
            c.a.d.e r2 = (p064c.p065a.p071d.C1710e) r2
            com.bytedance.android.livesdk.blockword.a$h r3 = new com.bytedance.android.livesdk.blockword.a$h
            r3.<init>(r0)
            c.a.d.e r3 = (p064c.p065a.p071d.C1710e) r3
            r1.mo6505a(r2, r3)
            com.bytedance.android.livesdk.o.c r0 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r1 = "livesdk_anchor_set_page_show"
            java.util.Map r2 = r10.getCommonLogPara()
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r0.mo14202a(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6093dl.m13259a():void");
    }

    public final void setClickCallback(C6082b bVar) {
        this.f16340h = bVar;
    }

    /* renamed from: a */
    public final void mo10447a(Throwable th) {
        String str;
        C52711k.m112240b(th, "throwable");
        if (th instanceof C2949a) {
            C2949a aVar = (C2949a) th;
            switch (aVar.getErrorCode()) {
                case 80070:
                    str = "limited";
                    break;
                case 80071:
                    str = "illegal";
                    break;
                case 80072:
                    str = "lengthy";
                    break;
                case 80073:
                    str = "existed";
                    break;
                default:
                    C4575an.m10981a((int) R.string.ewu);
                    return;
            }
            C4575an.m10987a(aVar.getPrompt());
            Map commonLogPara = getCommonLogPara();
            commonLogPara.put("toast_type", str);
            C8049c.m15979a().mo14202a("livesdk_stopword_set_toast", commonLogPara, new Object[0]);
        }
    }

    /* renamed from: b */
    public final void mo12127b(boolean z) {
        this.f16335b = z;
        if (this.f16335b) {
            LinearLayout linearLayout = (LinearLayout) mo12125a((int) R.id.ac);
            C52711k.m112236a((Object) linearLayout, "action_container");
            linearLayout.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) mo12125a((int) R.id.dzl);
            C52711k.m112236a((Object) relativeLayout, "block_word_input_area");
            relativeLayout.setVisibility(0);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) mo12125a((int) R.id.ac);
        C52711k.m112236a((Object) linearLayout2, "action_container");
        linearLayout2.setVisibility(0);
        RelativeLayout relativeLayout2 = (RelativeLayout) mo12125a((int) R.id.dzl);
        C52711k.m112236a((Object) relativeLayout2, "block_word_input_area");
        relativeLayout2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo10448a(List<C4669a> list) {
        C52711k.m112240b(list, "words");
        RecyclerView recyclerView = (RecyclerView) mo12125a((int) R.id.dzn);
        C52711k.m112236a((Object) recyclerView, "block_word_rv_view");
        C1322a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void onClick(View view) {
        String str;
        long j;
        String str2;
        C52711k.m112240b(view, "v");
        int id = view.getId();
        boolean z = true;
        if (id == R.id.bk1) {
            User user = this.f16344l;
            if (user == null) {
                C52711k.m112234a();
            }
            if (user.getUserAttr() != null) {
                C3012k userAttr = this.f16344l.getUserAttr();
                C52711k.m112236a((Object) userAttr, "mUser.userAttr");
                if (userAttr.f8851b) {
                    z = false;
                }
            }
            C4533a aVar = this.f16339g;
            long id2 = this.f16344l.getId();
            long j2 = 0;
            if (this.f16343k == null || this.f16343k.getOwner() == null) {
                j = 0;
            } else {
                User owner = this.f16343k.getOwner();
                C52711k.m112236a((Object) owner, "mRoom.owner");
                j = owner.getId();
            }
            Room room = this.f16343k;
            if (room != null) {
                j2 = room.getId();
            }
            aVar.mo10356a(z, id2, j, j2);
            Map commonLogPara = getCommonLogPara();
            commonLogPara.put("user_id", String.valueOf(this.f16344l.getId()));
            String str3 = "action_type";
            if (z) {
                str2 = "set";
            } else {
                str2 = "cancel";
            }
            commonLogPara.put(str3, str2);
            C8049c.m15979a().mo14202a("livesdk_admin_click", commonLogPara, new Object[0]);
        } else if (id == R.id.b66) {
            C6082b bVar = this.f16340h;
            if (bVar != null) {
                bVar.mo12118a();
            }
            Context context = getContext();
            Room room2 = this.f16343k;
            if (room2 == null) {
                C52711k.m112234a();
            }
            long id3 = room2.getId();
            Room room3 = this.f16343k;
            if (room3 == null) {
                C52711k.m112234a();
            }
            long ownerUserId = room3.getOwnerUserId();
            User user2 = this.f16344l;
            if (user2 == null) {
                C52711k.m112234a();
            }
            C8442a aVar2 = new C8442a(context, id3, ownerUserId, user2.getId());
            aVar2.show();
            Map commonLogPara2 = getCommonLogPara();
            commonLogPara2.put("user_id", String.valueOf(this.f16344l.getId()));
            C8049c.m15979a().mo14202a("blacklist_click", commonLogPara2, new C8059j().mo14214b("relation").mo14218f("click").mo14213a("live_detail"));
        } else if (id == R.id.bp1) {
            User user3 = this.f16344l;
            if (user3 == null) {
                C52711k.m112234a();
            }
            if (user3.getUserAttr() != null) {
                C3012k userAttr2 = this.f16344l.getUserAttr();
                C52711k.m112236a((Object) userAttr2, "mUser.userAttr");
                if (userAttr2.f8850a) {
                    z = false;
                }
            }
            C6737a aVar3 = this.f16338f;
            Room room4 = this.f16343k;
            if (room4 == null) {
                C52711k.m112234a();
            }
            aVar3.mo12852a(z, room4.getId(), this.f16344l.getId(), this.f16344l.getSecUid());
            Map commonLogPara3 = getCommonLogPara();
            commonLogPara3.put("user_id", String.valueOf(this.f16344l.getId()));
            String str4 = "action_type";
            if (z) {
                str = "set";
            } else {
                str = "cancel";
            }
            commonLogPara3.put(str4, str);
            C8049c.m15979a().mo14202a("livesdk_mute_click", commonLogPara3, new Object[0]);
        } else if (id == R.id.bk3) {
            C6082b bVar2 = this.f16340h;
            if (bVar2 != null) {
                bVar2.mo12119a(0);
            }
            C8049c.m15979a().mo14202a("livesdk_anchor_admin_list_click", getCommonLogPara(), new Object[0]);
            C8068g.m16014a(getContext());
        } else if (id == R.id.bp2) {
            C6082b bVar3 = this.f16340h;
            if (bVar3 != null) {
                bVar3.mo12119a(1);
            }
            C8049c.m15979a().mo14202a("livesdk_anchor_mute_list_click", getCommonLogPara(), new Object[0]);
        } else if (id == R.id.b67) {
            C6082b bVar4 = this.f16340h;
            if (bVar4 != null) {
                bVar4.mo12119a(2);
            }
            C8049c.m15979a().mo14202a("livesdk_anchor_blacklist_click", getCommonLogPara(), new Object[0]);
        } else {
            if (id == R.id.q7) {
                C6082b bVar5 = this.f16340h;
                if (bVar5 != null) {
                    bVar5.mo12118a();
                }
                C8068g.m16014a(getContext());
            }
        }
    }

    /* renamed from: a */
    public final void mo12005a(boolean z) {
        int i;
        if (this.f16336c) {
            User user = this.f16344l;
            if (user == null) {
                C52711k.m112234a();
            }
            if (user.getUserAttr() == null) {
                this.f16344l.setUserAttr(new C3012k());
            }
            C3012k userAttr = this.f16344l.getUserAttr();
            C52711k.m112236a((Object) userAttr, "mUser.userAttr");
            userAttr.f8850a = z;
            TextView textView = (TextView) mo12125a((int) R.id.bp1);
            if (z) {
                i = R.string.ep1;
            } else {
                i = R.string.ep3;
            }
            textView.setText(i);
        }
    }

    /* renamed from: b */
    public final void mo12006b(boolean z, Exception exc) {
        C52711k.m112240b(exc, "e");
        if (this.f16336c) {
            C4602l.m11047a(getContext(), (Throwable) exc, (int) R.string.eon);
        }
    }

    /* renamed from: a */
    public final void mo10446a(C4669a aVar, int i) {
        C52711k.m112240b(aVar, "word");
        RecyclerView recyclerView = (RecyclerView) mo12125a((int) R.id.dzn);
        C52711k.m112236a((Object) recyclerView, "block_word_rv_view");
        C1322a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            adapter.notifyItemInserted(0);
            ((RecyclerView) mo12125a((int) R.id.dzn)).mo4833d(0);
        }
        Map commonLogPara = getCommonLogPara();
        commonLogPara.put("context", aVar.f12737b);
        C8049c.m15979a().mo14202a("livesdk_stopword_set_success", commonLogPara, new Object[0]);
    }

    /* renamed from: b */
    public final void mo10449b(C4669a aVar, int i) {
        C52711k.m112240b(aVar, "word");
        if (i != -1) {
            RecyclerView recyclerView = (RecyclerView) mo12125a((int) R.id.dzn);
            C52711k.m112236a((Object) recyclerView, "block_word_rv_view");
            C1322a adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.notifyItemRemoved(i);
            }
        } else {
            RecyclerView recyclerView2 = (RecyclerView) mo12125a((int) R.id.dzn);
            C52711k.m112236a((Object) recyclerView2, "block_word_rv_view");
            C1322a adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyDataSetChanged();
            }
        }
        Map commonLogPara = getCommonLogPara();
        commonLogPara.put("context", aVar.f12737b);
        C8049c.m15979a().mo14202a("livesdk_stopword_cancel", commonLogPara, new Object[0]);
    }

    /* renamed from: a */
    public final void mo12126a(EditText editText, long j, int i, int i2) {
        if (editText != null && i <= i2) {
            C6105g gVar = new C6105g(this, editText, j, i, i2);
            editText.postDelayed(gVar, j);
        }
    }

    public C6093dl(Context context, Room room, User user, boolean z, boolean z2) {
        C52711k.m112240b(context, "context");
        super(context);
        this.f16343k = room;
        this.f16344l = user;
        this.f16345m = z;
        this.f16346n = z2;
        C4660a aVar = this.f16337d;
        C4661a aVar2 = this;
        C52711k.m112240b(aVar2, "callback");
        aVar.f12726c = aVar2;
        m13259a();
    }
}
