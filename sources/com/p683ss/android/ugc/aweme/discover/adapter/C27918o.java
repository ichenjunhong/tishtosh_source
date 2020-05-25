package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28515aw;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28522ay.C28523a;
import com.p683ss.android.ugc.aweme.widget.flowlayout.C48393a;
import com.p683ss.android.ugc.aweme.widget.flowlayout.FlowLayout;
import com.p683ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.o */
public final class C27918o extends C27901h<Word> {

    /* renamed from: h */
    public static final List<Word> f73330h;

    /* renamed from: i */
    public static final List<Word> f73331i;

    /* renamed from: j */
    public static final C27919a f73332j = new C27919a(null);

    /* renamed from: g */
    public C28523a f73333g;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.o$a */
    public static final class C27919a {
        private C27919a() {
        }

        public /* synthetic */ C27919a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.o$b */
    public static final class C27920b extends C48393a<Word> {

        /* renamed from: a */
        final /* synthetic */ C27918o f73334a;

        /* renamed from: b */
        final /* synthetic */ List f73335b;

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.o$b$a */
        public static final class C27921a extends C28515aw {

            /* renamed from: a */
            final /* synthetic */ C27920b f73336a;

            /* renamed from: b */
            final /* synthetic */ int f73337b;

            /* renamed from: c */
            final /* synthetic */ Word f73338c;

            /* renamed from: b */
            public final void mo55272b(View view, MotionEvent motionEvent) {
                C52711k.m112240b(view, "view");
                C52711k.m112240b(motionEvent, "event");
                C26890h.m65011a("trending_words_click", C23089d.m56640a().mo47826a("words_position", this.f73337b).mo47829a("words_source", "recom_search").mo47829a("words_content", this.f73338c.getWord()).mo47829a("group_id", this.f73338c.getId()).f61491a);
                C28523a aVar = this.f73336a.f73334a.f73333g;
                if (aVar != null) {
                    aVar.handleGuessWordItemClick(this.f73338c, this.f73337b);
                }
            }

            C27921a(C27920b bVar, int i, Word word) {
                this.f73336a = bVar;
                this.f73337b = i;
                this.f73338c = word;
            }
        }

        C27920b(C27918o oVar, List list, List list2) {
            this.f73334a = oVar;
            this.f73335b = list;
            super(list2);
        }

        /* renamed from: a */
        public final /* synthetic */ View mo56339a(FlowLayout flowLayout, int i, Object obj) {
            Word word = (Word) obj;
            C52711k.m112240b(flowLayout, "parent");
            C52711k.m112240b(word, "item");
            View view = this.f73334a.itemView;
            C52711k.m112236a((Object) view, "itemView");
            View inflate = LayoutInflater.from(view.getContext()).inflate(R.layout.bs3, flowLayout, false);
            TextView textView = (TextView) inflate.findViewById(R.id.dac);
            C52711k.m112236a((Object) textView, "word");
            textView.setText(word.getWord());
            inflate.setOnTouchListener(new C27921a(this, i, word));
            C52711k.m112236a((Object) inflate, "root");
            return inflate;
        }
    }

    /* renamed from: a */
    public final void mo56310a() {
        C26890h.m65011a("trending_show", C23089d.m56640a().mo47826a("words_num", this.f73285f.size()).mo47829a("words_source", "recom_search").f61491a);
        super.mo56310a();
    }

    static {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new Word());
        List<Word> unmodifiableList = Collections.unmodifiableList(arrayList);
        C52711k.m112236a((Object) unmodifiableList, "Collections.unmodifiableList(placeholder)");
        f73330h = unmodifiableList;
        ArrayList arrayList2 = new ArrayList(8);
        for (int i = 0; i < 8; i++) {
            arrayList2.add(new Word());
        }
        List<Word> unmodifiableList2 = Collections.unmodifiableList(arrayList2);
        C52711k.m112236a((Object) unmodifiableList2, "Collections.unmodifiableList(placeholder)");
        f73331i = unmodifiableList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo56313b(List<Word> list) {
        C52711k.m112240b(list, "list");
        if (!C52711k.m112239a((Object) list, (Object) f73330h)) {
            return false;
        }
        C23729p.m58257a(this.f73281b, 0);
        C23729p.m58257a((View) this.f73282c, 8);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo56314c(List<Word> list) {
        C52711k.m112240b(list, "list");
        C23729p.m58257a((View) this.f73282c, 0);
        C23729p.m58257a(this.f73281b, 8);
        this.f73285f = list;
        TagFlowLayout tagFlowLayout = this.f73282c;
        C52711k.m112236a((Object) tagFlowLayout, "mTagGroup");
        tagFlowLayout.setAdapter(new C27920b(this, list, list));
    }

    /* renamed from: a */
    public final /* synthetic */ void mo56311a(Object obj, int i) {
        Word word = (Word) obj;
        C52711k.m112240b(word, "item");
        if (!word.isShowed()) {
            word.setShowed(true);
            C26890h.m65011a("trending_words_show", C23089d.m56640a().mo47826a("words_position", i).mo47829a("words_source", "recom_search").mo47829a("words_content", word.getWord()).mo47829a("group_id", word.getId()).f61491a);
        }
    }
}
