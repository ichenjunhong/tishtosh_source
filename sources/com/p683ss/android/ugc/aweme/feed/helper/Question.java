package com.p683ss.android.ugc.aweme.feed.helper;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.feed.helper.Question */
public final class Question {
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f79276id;
    @C17952c(mo34828a = "options")
    public Option[] options;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "type")
    public int type;

    public Question() {
        this(null, 0, null, null, 15, null);
    }

    public static /* synthetic */ Question copy$default(Question question, String str, int i, String str2, Option[] optionArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = question.f79276id;
        }
        if ((i2 & 2) != 0) {
            i = question.type;
        }
        if ((i2 & 4) != 0) {
            str2 = question.title;
        }
        if ((i2 & 8) != 0) {
            optionArr = question.options;
        }
        return question.copy(str, i, str2, optionArr);
    }

    public final String component1() {
        return this.f79276id;
    }

    public final int component2() {
        return this.type;
    }

    public final String component3() {
        return this.title;
    }

    public final Option[] component4() {
        return this.options;
    }

    public final Question copy(String str, int i, String str2, Option[] optionArr) {
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "title");
        return new Question(str, i, str2, optionArr);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Question) {
                Question question = (Question) obj;
                if (C52711k.m112239a((Object) this.f79276id, (Object) question.f79276id)) {
                    if (!(this.type == question.type) || !C52711k.m112239a((Object) this.title, (Object) question.title) || !C52711k.m112239a((Object) this.options, (Object) question.options)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getId() {
        return this.f79276id;
    }

    public final Option[] getOptions() {
        return this.options;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final int hashCode() {
        String str = this.f79276id;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.type)) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Option[] optionArr = this.options;
        if (optionArr != null) {
            i = Arrays.hashCode(optionArr);
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Question(id=");
        sb.append(this.f79276id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", options=");
        sb.append(Arrays.toString(this.options));
        sb.append(")");
        return sb.toString();
    }

    public final void setOptions(Option[] optionArr) {
        this.options = optionArr;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f79276id = str;
    }

    public final void setTitle(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.title = str;
    }

    public Question(String str, int i, String str2, Option[] optionArr) {
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "title");
        this.f79276id = str;
        this.type = i;
        this.title = str2;
        this.options = optionArr;
    }

    public /* synthetic */ Question(String str, int i, String str2, Option[] optionArr, int i2, C52707g gVar) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            str2 = "";
        }
        if ((i2 & 8) != 0) {
            optionArr = null;
        }
        this(str, i, str2, optionArr);
    }
}
