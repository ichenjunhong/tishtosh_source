package com.p683ss.android.ugc.aweme.discover.model.suggest;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.discover.model.suggest.Word */
public final class Word implements Serializable {
    @C17952c(mo34828a = "words_type")
    private String _wordType = "0";
    @C17952c(mo34828a = "id", mo34829b = {"group_id"})

    /* renamed from: id */
    private String f74690id;
    private boolean isShowed;
    @C17952c(mo34828a = "params")
    private Params params;
    @C17952c(mo34828a = "word", mo34829b = {"words_content"})
    private String word;
    @C17952c(mo34828a = "words_position")
    private int wordPosition;
    @C17952c(mo34828a = "words_source")
    private String wordSource;
    private int wordType;

    public final String getId() {
        return this.f74690id;
    }

    public final Params getParams() {
        return this.params;
    }

    public final String getWord() {
        return this.word;
    }

    public final int getWordPosition() {
        return this.wordPosition;
    }

    public final String getWordSource() {
        return this.wordSource;
    }

    public final boolean isShowed() {
        return this.isShowed;
    }

    public final int getWordType() {
        Integer c = C52830p.m112395c(this._wordType);
        if (c != null) {
            return c.intValue();
        }
        return 0;
    }

    public final int hashCode() {
        String str = this.word;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final void setId(String str) {
        this.f74690id = str;
    }

    public final void setParams(Params params2) {
        this.params = params2;
    }

    public final void setShowed(boolean z) {
        this.isShowed = z;
    }

    public final void setWord(String str) {
        this.word = str;
    }

    public final void setWordPosition(int i) {
        this.wordPosition = i;
    }

    public final void setWordSource(String str) {
        this.wordSource = str;
    }

    public final void setWordType(int i) {
        this.wordType = i;
    }

    public final boolean equals(Object obj) {
        Class cls;
        if (this == obj) {
            return true;
        }
        Class cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C52711k.m112239a((Object) cls2, (Object) cls)) {
            return false;
        }
        if (obj == null) {
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.suggest.Word");
        } else if (!C52711k.m112239a((Object) this.word, (Object) ((Word) obj).word)) {
            return false;
        } else {
            return true;
        }
    }
}
