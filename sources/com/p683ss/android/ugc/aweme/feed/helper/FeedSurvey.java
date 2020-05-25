package com.p683ss.android.ugc.aweme.feed.helper;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.feed.helper.FeedSurvey */
public final class FeedSurvey {
    @C17952c(mo34828a = "cancel_text")
    public String cancelText;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f79272id;
    @C17952c(mo34828a = "questions")
    public Question[] questions;
    @C17952c(mo34828a = "submit_text")
    public String submitText;
    @C17952c(mo34828a = "title")
    public String title;

    public FeedSurvey() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ FeedSurvey copy$default(FeedSurvey feedSurvey, String str, String str2, String str3, String str4, Question[] questionArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = feedSurvey.f79272id;
        }
        if ((i & 2) != 0) {
            str2 = feedSurvey.title;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = feedSurvey.cancelText;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = feedSurvey.submitText;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            questionArr = feedSurvey.questions;
        }
        return feedSurvey.copy(str, str5, str6, str7, questionArr);
    }

    public final String component1() {
        return this.f79272id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.cancelText;
    }

    public final String component4() {
        return this.submitText;
    }

    public final Question[] component5() {
        return this.questions;
    }

    public final FeedSurvey copy(String str, String str2, String str3, String str4, Question[] questionArr) {
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "title");
        C52711k.m112240b(str3, "cancelText");
        C52711k.m112240b(str4, "submitText");
        FeedSurvey feedSurvey = new FeedSurvey(str, str2, str3, str4, questionArr);
        return feedSurvey;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.questions, (java.lang.Object) r3.questions) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feed.helper.FeedSurvey
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.feed.helper.FeedSurvey r3 = (com.p683ss.android.ugc.aweme.feed.helper.FeedSurvey) r3
            java.lang.String r0 = r2.f79272id
            java.lang.String r1 = r3.f79272id
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.cancelText
            java.lang.String r1 = r3.cancelText
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.submitText
            java.lang.String r1 = r3.submitText
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.feed.helper.Question[] r0 = r2.questions
            com.ss.android.ugc.aweme.feed.helper.Question[] r3 = r3.questions
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.helper.FeedSurvey.equals(java.lang.Object):boolean");
    }

    public final String getCancelText() {
        return this.cancelText;
    }

    public final String getId() {
        return this.f79272id;
    }

    public final Question[] getQuestions() {
        return this.questions;
    }

    public final String getSubmitText() {
        return this.submitText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.f79272id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cancelText;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.submitText;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Question[] questionArr = this.questions;
        if (questionArr != null) {
            i = Arrays.hashCode(questionArr);
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedSurvey(id=");
        sb.append(this.f79272id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", cancelText=");
        sb.append(this.cancelText);
        sb.append(", submitText=");
        sb.append(this.submitText);
        sb.append(", questions=");
        sb.append(Arrays.toString(this.questions));
        sb.append(")");
        return sb.toString();
    }

    public final void setQuestions(Question[] questionArr) {
        this.questions = questionArr;
    }

    public final void setCancelText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.cancelText = str;
    }

    public final void setId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f79272id = str;
    }

    public final void setSubmitText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.submitText = str;
    }

    public final void setTitle(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.title = str;
    }

    public FeedSurvey(String str, String str2, String str3, String str4, Question[] questionArr) {
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "title");
        C52711k.m112240b(str3, "cancelText");
        C52711k.m112240b(str4, "submitText");
        this.f79272id = str;
        this.title = str2;
        this.cancelText = str3;
        this.submitText = str4;
        this.questions = questionArr;
    }

    public /* synthetic */ FeedSurvey(String str, String str2, String str3, String str4, Question[] questionArr, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = "";
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = "";
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            questionArr = null;
        }
        this(str, str5, str6, str7, questionArr);
    }
}
