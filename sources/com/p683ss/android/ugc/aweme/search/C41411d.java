package com.p683ss.android.ugc.aweme.search;

import com.p683ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.search.d */
public final class C41411d {

    /* renamed from: a */
    public static final C41411d f104974a = new C41411d();

    private C41411d() {
    }

    /* renamed from: a */
    public static void m91225a(List<TypeWords> list, Word word) {
        boolean z;
        C52711k.m112240b(word, "inputBoxWord");
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            Boolean mtForbidInsertPlaceholderWord = b.getMtForbidInsertPlaceholderWord();
            C52711k.m112236a((Object) mtForbidInsertPlaceholderWord, "SettingsReader.get().mtForbidInsertPlaceholderWord");
            z = mtForbidInsertPlaceholderWord.booleanValue();
        } catch (Exception unused) {
            z = false;
        }
        if (list != null) {
            TypeWords typeWords = (TypeWords) C52575l.m112137e(list);
            if (typeWords != null) {
                List<Word> list2 = typeWords.words;
                if (list2 != null) {
                    if (list2.contains(word)) {
                        list2.remove(word);
                    }
                    if (!z) {
                        list2.add(0, word);
                    }
                }
            }
        }
    }
}
