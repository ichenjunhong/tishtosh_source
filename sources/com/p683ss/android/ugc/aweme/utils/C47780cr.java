package com.p683ss.android.ugc.aweme.utils;

import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.utils.cr */
public final class C47780cr {

    /* renamed from: a */
    public static final C47780cr f120298a = new C47780cr();

    /* renamed from: com.ss.android.ugc.aweme.utils.cr$a */
    public static final class C47781a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f120299a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47781a.class), "spannableList", "getSpannableList()Ljava/util/List;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C47781a.class), "allText", "getAllText()Ljava/lang/StringBuilder;"))};

        /* renamed from: b */
        private final C52668f f120300b = C52732g.m112285a(C47786e.f120310a);

        /* renamed from: c */
        private final C52668f f120301c = C52732g.m112285a(C47785d.f120309a);

        /* renamed from: com.ss.android.ugc.aweme.utils.cr$a$a */
        public interface C47782a {
            /* renamed from: a */
            CharSequence mo95038a();

            /* renamed from: b */
            Integer mo95039b();
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.cr$a$b */
        public final class C47783b extends ClickableSpan implements C47782a {

            /* renamed from: a */
            private final CharSequence f120302a;

            /* renamed from: b */
            private final int f120303b;

            /* renamed from: c */
            private final C52671b<View, C52860x> f120304c;

            /* renamed from: a */
            public final CharSequence mo95038a() {
                return this.f120302a;
            }

            /* renamed from: b */
            public final Integer mo95039b() {
                return Integer.valueOf(this.f120303b);
            }

            public final void onClick(View view) {
                C52711k.m112240b(view, "view");
                C52671b<View, C52860x> bVar = this.f120304c;
                if (bVar != null) {
                    bVar.invoke(view);
                }
            }

            public final void updateDrawState(TextPaint textPaint) {
                C52711k.m112240b(textPaint, "ds");
                super.updateDrawState(textPaint);
                textPaint.setColor(mo95039b().intValue());
                textPaint.setUnderlineText(false);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.cr$a$c */
        public final class C47784c implements C47782a {

            /* renamed from: a */
            final /* synthetic */ C47781a f120305a;

            /* renamed from: b */
            private final CharSequence f120306b;

            /* renamed from: c */
            private final Integer f120307c;

            /* renamed from: d */
            private final boolean f120308d;

            /* renamed from: a */
            public final CharSequence mo95038a() {
                return this.f120306b;
            }

            /* renamed from: b */
            public final Integer mo95039b() {
                return this.f120307c;
            }

            public C47784c(C47781a aVar, CharSequence charSequence, Integer num, boolean z) {
                C52711k.m112240b(charSequence, C42311c.f106865i);
                this.f120305a = aVar;
                this.f120306b = charSequence;
                this.f120307c = num;
                this.f120308d = z;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.cr$a$d */
        static final class C47785d extends C52712l implements C52670a<StringBuilder> {

            /* renamed from: a */
            public static final C47785d f120309a = new C47785d();

            C47785d() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new StringBuilder();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.utils.cr$a$e */
        static final class C47786e extends C52712l implements C52670a<List<C47782a>> {

            /* renamed from: a */
            public static final C47786e f120310a = new C47786e();

            C47786e() {
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                return new ArrayList();
            }
        }

        /* renamed from: b */
        private final List<C47782a> m103406b() {
            return (List) this.f120300b.getValue();
        }

        /* renamed from: c */
        private final StringBuilder m103407c() {
            return (StringBuilder) this.f120301c.getValue();
        }

        /* renamed from: a */
        public final Spannable mo95036a() {
            Object obj;
            Spannable newSpannable = Factory.getInstance().newSpannable(m103407c());
            for (C47782a aVar : m103406b()) {
                int indexOf = m103407c().indexOf(aVar.mo95038a().toString());
                int length = aVar.mo95038a().length() + indexOf;
                if (aVar instanceof C47784c) {
                    if (aVar.mo95039b() != null) {
                        Integer b = aVar.mo95039b();
                        if (b == null) {
                            C52711k.m112234a();
                        }
                        obj = new ForegroundColorSpan(b.intValue());
                    } else {
                        obj = new SpannableString(aVar.mo95038a());
                    }
                    newSpannable.setSpan(obj, indexOf, length, 33);
                } else if (aVar instanceof C47783b) {
                    newSpannable.setSpan(aVar, indexOf, length, 33);
                }
            }
            C52711k.m112236a((Object) newSpannable, "spannable");
            return newSpannable;
        }

        /* renamed from: a */
        public final C47781a mo95037a(CharSequence charSequence, Integer num, boolean z) {
            if (charSequence == null) {
                return this;
            }
            charSequence.length();
            if (z) {
                m103407c().append(" ");
            }
            m103407c().append(charSequence);
            m103406b().add(new C47784c(this, charSequence, num, z));
            return this;
        }
    }

    private C47780cr() {
    }
}
