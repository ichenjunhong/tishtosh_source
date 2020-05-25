package com.p683ss.android.ugc.aweme.discover.viewmodel;

import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.support.p030v4.app.FragmentActivity;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23275b;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.discover.api.C28063a;
import com.p683ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p683ss.android.ugc.aweme.discover.api.p1638a.C28064a;
import com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse;
import com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel */
public final class GuessWordsViewModel extends C0209x {

    /* renamed from: d */
    public static final C28943a f75768d = new C28943a(null);

    /* renamed from: a */
    public final C23275b<C28064a<TypeWords>> f75769a = new C23275b<>();

    /* renamed from: b */
    public final C23275b<C28064a<TypeWords>> f75770b = new C23275b<>();

    /* renamed from: c */
    public final C23543g f75771c = C23542f.m57720e();

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel$a */
    public static final class C28943a {
        private C28943a() {
        }

        public /* synthetic */ C28943a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static GuessWordsViewModel m68264a(FragmentActivity fragmentActivity) {
            C52711k.m112240b(fragmentActivity, "activity");
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(GuessWordsViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…rdsViewModel::class.java)");
            return (GuessWordsViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel$b */
    public static final class C28944b<TTaskResult, TContinuationResult> implements C0011g<SuggestWordResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ GuessWordsViewModel f75772a;

        public C28944b(GuessWordsViewModel guessWordsViewModel) {
            this.f75772a = guessWordsViewModel;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x006a  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ java.lang.Object then(p001a.C0013i r6) {
            /*
                r5 = this;
                java.lang.String r0 = "it"
                p2628d.p2639f.p2641b.C52711k.m112236a(r6, r0)
                boolean r0 = r6.mo26b()
                r1 = 1
                if (r0 == 0) goto L_0x00a9
                java.lang.Object r6 = r6.mo34e()
                com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse r6 = (com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse) r6
                com.ss.android.ugc.aweme.discover.f.b r0 = com.p683ss.android.ugc.aweme.discover.p1644f.C28112b.f73810b
                r2 = 0
                com.ss.android.ugc.aweme.discover.f.b r0 = r0.mo56508a(r2)
                if (r6 == 0) goto L_0x0029
                java.lang.String r3 = r6.getRequestId()
                com.ss.android.ugc.aweme.discover.f.b r3 = r0.mo56510a(r3)
                r4 = r6
                com.ss.android.ugc.aweme.app.api.h r4 = (com.p683ss.android.ugc.aweme.app.api.C22990h) r4
                r3.mo56509a(r4)
            L_0x0029:
                r0.mo56507a()
                if (r6 == 0) goto L_0x008c
                java.util.List<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords> r6 = r6.data
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r5.f75772a
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r0 = r0.f75770b
                java.lang.Object r0 = r0.getValue()
                com.ss.android.ugc.aweme.discover.api.a.a r0 = (com.p683ss.android.ugc.aweme.discover.api.p1638a.C28064a) r0
                r3 = 0
                if (r0 == 0) goto L_0x005c
                T r0 = r0.f73736b
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r0 = (com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords) r0
                if (r0 == 0) goto L_0x005c
                java.util.List<com.ss.android.ugc.aweme.discover.model.suggest.Word> r0 = r0.words
                if (r0 == 0) goto L_0x005c
                r4 = r0
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                r1 = r1 ^ r4
                if (r1 == 0) goto L_0x0052
                goto L_0x0053
            L_0x0052:
                r0 = r3
            L_0x0053:
                if (r0 == 0) goto L_0x005c
                java.lang.Object r0 = r0.get(r2)
                com.ss.android.ugc.aweme.discover.model.suggest.Word r0 = (com.p683ss.android.ugc.aweme.discover.model.suggest.Word) r0
                goto L_0x005d
            L_0x005c:
                r0 = r3
            L_0x005d:
                if (r0 == 0) goto L_0x0062
                com.p683ss.android.ugc.aweme.search.C41411d.m91225a(r6, r0)
            L_0x0062:
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r5.f75772a
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r0 = r0.f75769a
                com.ss.android.ugc.aweme.discover.api.a.a r1 = new com.ss.android.ugc.aweme.discover.api.a.a
                if (r6 == 0) goto L_0x0071
                java.lang.Object r2 = p2628d.p2629a.C52575l.m112137e(r6)
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r2 = (com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords) r2
                goto L_0x0072
            L_0x0071:
                r2 = r3
            L_0x0072:
                r1.<init>(r2)
                r0.setValue(r1)
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r5.f75772a
                com.ss.android.ugc.aweme.base.h.g r0 = r0.f75771c
                java.lang.String r1 = "key_guess_words"
                if (r6 == 0) goto L_0x0087
                java.lang.Object r6 = p2628d.p2629a.C52575l.m112137e(r6)
                r3 = r6
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r3 = (com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords) r3
            L_0x0087:
                r0.mo48704a(r1, r3)
                goto L_0x0110
            L_0x008c:
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r6 = r5.f75772a
                com.ss.android.ugc.aweme.base.h.g r6 = r6.f75771c
                java.lang.String r0 = "key_guess_words"
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords> r1 = com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords.class
                java.lang.Object r6 = r6.mo48702a(r0, r1)
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r6 = (com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords) r6
                if (r6 == 0) goto L_0x0110
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r5.f75772a
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r0 = r0.f75769a
                com.ss.android.ugc.aweme.discover.api.a.a r1 = new com.ss.android.ugc.aweme.discover.api.a.a
                r1.<init>(r6)
                r0.setValue(r1)
                goto L_0x0110
            L_0x00a9:
                boolean r0 = r6.mo33d()
                if (r0 == 0) goto L_0x0110
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r5.f75772a
                com.ss.android.ugc.aweme.base.h.g r0 = r0.f75771c
                java.lang.String r2 = "key_guess_words"
                java.lang.Class<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords> r3 = com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords.class
                java.lang.Object r0 = r0.mo48702a(r2, r3)
                com.ss.android.ugc.aweme.discover.model.suggest.TypeWords r0 = (com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords) r0
                if (r0 == 0) goto L_0x00cc
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r2 = r5.f75772a
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r2 = r2.f75769a
                com.ss.android.ugc.aweme.discover.api.a.a r3 = new com.ss.android.ugc.aweme.discover.api.a.a
                r3.<init>(r0)
                r2.setValue(r3)
                goto L_0x00e1
            L_0x00cc:
                com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel r0 = r5.f75772a
                com.ss.android.ugc.aweme.arch.widgets.base.b<com.ss.android.ugc.aweme.discover.api.a.a<com.ss.android.ugc.aweme.discover.model.suggest.TypeWords>> r0 = r0.f75769a
                com.ss.android.ugc.aweme.discover.api.a.a r2 = new com.ss.android.ugc.aweme.discover.api.a.a
                java.lang.Exception r3 = r6.mo35f()
                java.lang.String r4 = "it.error"
                p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
                r2.<init>(r3)
                r0.setValue(r2)
            L_0x00e1:
                com.ss.android.ugc.aweme.discover.f.b r0 = com.p683ss.android.ugc.aweme.discover.p1644f.C28112b.f73810b
                com.ss.android.ugc.aweme.discover.f.b r0 = r0.mo56508a(r1)
                java.lang.Exception r1 = r6.mo35f()
                java.lang.String r1 = r1.getMessage()
                com.ss.android.ugc.aweme.discover.f.a r2 = com.p683ss.android.ugc.aweme.discover.p1644f.C28112b.f73809a
                if (r2 == 0) goto L_0x00f5
                r2.f73807g = r1
            L_0x00f5:
                java.lang.Object r6 = r6.mo34e()
                com.ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse r6 = (com.p683ss.android.ugc.aweme.discover.model.suggest.SuggestWordResponse) r6
                if (r6 == 0) goto L_0x010a
                java.lang.String r1 = r6.getRequestId()
                com.ss.android.ugc.aweme.discover.f.b r1 = r0.mo56510a(r1)
                com.ss.android.ugc.aweme.app.api.h r6 = (com.p683ss.android.ugc.aweme.app.api.C22990h) r6
                r1.mo56509a(r6)
            L_0x010a:
                r0.mo56507a()
                com.p683ss.android.ugc.aweme.discover.p1644f.C28112b.m66905b()
            L_0x0110:
                d.x r6 = p2628d.C52860x.f131107a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel.C28944b.then(a.i):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.GuessWordsViewModel$c */
    static final class C28945c<TTaskResult, TContinuationResult> implements C0011g<SuggestWordResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ GuessWordsViewModel f75773a;

        C28945c(GuessWordsViewModel guessWordsViewModel) {
            this.f75773a = guessWordsViewModel;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            Object obj;
            C52711k.m112236a((Object) iVar, "it");
            if (iVar.mo26b()) {
                SuggestWordResponse suggestWordResponse = (SuggestWordResponse) iVar.mo34e();
                if (suggestWordResponse != null) {
                    List<TypeWords> list = suggestWordResponse.data;
                    C23275b<C28064a<TypeWords>> bVar = this.f75773a.f75770b;
                    TypeWords typeWords = null;
                    if (list != null) {
                        obj = (TypeWords) C52575l.m112137e(list);
                    } else {
                        obj = null;
                    }
                    bVar.setValue(new C28064a(obj));
                    C23543g gVar = this.f75773a.f75771c;
                    String str = "key_inbox_word";
                    if (list != null) {
                        typeWords = (TypeWords) C52575l.m112137e(list);
                    }
                    gVar.mo48704a(str, (Object) typeWords);
                } else {
                    TypeWords typeWords2 = (TypeWords) this.f75773a.f75771c.mo48702a("key_inbox_word", TypeWords.class);
                    if (typeWords2 != null) {
                        this.f75773a.f75770b.setValue(new C28064a(typeWords2));
                    }
                }
            } else if (iVar.mo33d()) {
                TypeWords typeWords3 = (TypeWords) this.f75773a.f75771c.mo48702a("key_inbox_word", TypeWords.class);
                if (typeWords3 != null) {
                    this.f75773a.f75770b.setValue(new C28064a(typeWords3));
                } else {
                    C23275b<C28064a<TypeWords>> bVar2 = this.f75773a.f75770b;
                    Exception f = iVar.mo35f();
                    C52711k.m112236a((Object) f, "it.error");
                    bVar2.setValue(new C28064a(f));
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public static IRetrofit m68262a() {
        IRetrofit a = C28063a.m66839a();
        C52711k.m112236a((Object) a, "RetrofitFactory.getRetrofit()");
        return a;
    }

    /* renamed from: a */
    public final void mo58511a(C41434a aVar) {
        String str;
        String str2 = "30000";
        SuggestWordsApi suggestWordsApi = (SuggestWordsApi) m68262a().create(SuggestWordsApi.class);
        if (aVar != null) {
            str = aVar.getGidRequest();
        } else {
            str = null;
        }
        suggestWordsApi.getSuggestWords(str2, str, "").mo20a((C0011g<TResult, TContinuationResult>) new C28945c<TResult,TContinuationResult>(this), C0013i.f25b);
    }
}
