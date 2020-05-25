package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.utils.C23722i;
import com.p683ss.android.ugc.aweme.discover.model.suggest.Word;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.RelatedSearchWordItem */
public class RelatedSearchWordItem implements Serializable {
    public boolean isMobShow;
    @C17952c(mo34828a = "related_img")
    private String relatedImg;
    @C17952c(mo34828a = "related_word")
    private String relatedWord;
    @C17952c(mo34828a = "word_record")
    private Word word;

    public String getRelatedImg() {
        return this.relatedImg;
    }

    public String getRelatedWord() {
        return this.relatedWord;
    }

    public Word getWord() {
        return this.word;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (this.relatedWord != null) {
            i = this.relatedWord.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + 31) * 31;
        if (this.relatedImg != null) {
            i2 = this.relatedImg.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        if (this.word != null) {
            i3 = this.word.hashCode();
        }
        return i5 + i3;
    }

    public void setRelatedImg(String str) {
        this.relatedImg = str;
    }

    public void setRelatedWord(String str) {
        this.relatedWord = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelatedSearchWordItem)) {
            return false;
        }
        RelatedSearchWordItem relatedSearchWordItem = (RelatedSearchWordItem) obj;
        if (C23722i.m58215a(this.relatedWord, relatedSearchWordItem.relatedWord) && C23722i.m58215a(this.relatedImg, relatedSearchWordItem.relatedImg)) {
            return C23722i.m58215a(this.word, relatedSearchWordItem.word);
        }
        return false;
    }
}
