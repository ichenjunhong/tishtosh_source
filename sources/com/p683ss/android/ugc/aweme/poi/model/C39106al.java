package com.p683ss.android.ugc.aweme.poi.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.model.al */
public final class C39106al implements Serializable {
    @C17952c(mo34828a = "poi_id")

    /* renamed from: a */
    private final String f99748a;
    @C17952c(mo34828a = "question_id")

    /* renamed from: b */
    private final String f99749b;
    @C17952c(mo34828a = "text")

    /* renamed from: c */
    private final String f99750c;
    @C17952c(mo34828a = "create_time")

    /* renamed from: d */
    private final long f99751d;
    @C17952c(mo34828a = "follow_count")

    /* renamed from: e */
    private Integer f99752e;
    @C17952c(mo34828a = "status")

    /* renamed from: f */
    private final int f99753f;
    @C17952c(mo34828a = "user")

    /* renamed from: g */
    private final User f99754g;
    @C17952c(mo34828a = "answers")

    /* renamed from: h */
    private final List<C39123g> f99755h;
    @C17952c(mo34828a = "answer_total_count")

    /* renamed from: i */
    private final int f99756i;
    @C17952c(mo34828a = "is_user_follow")

    /* renamed from: j */
    private final boolean f99757j;

    public final int getAnswerAmounts() {
        return this.f99756i;
    }

    public final List<C39123g> getAnswers() {
        return this.f99755h;
    }

    public final String getContent() {
        return this.f99750c;
    }

    public final long getCreateTime() {
        return this.f99751d;
    }

    public final Integer getFollowCount() {
        return this.f99752e;
    }

    public final String getPoiId() {
        return this.f99748a;
    }

    public final String getQuestionId() {
        return this.f99749b;
    }

    public final int getStatus() {
        return this.f99753f;
    }

    public final User getUser() {
        return this.f99754g;
    }

    public final boolean isUserFollow() {
        return this.f99757j;
    }

    public final String getUserId() {
        User user = this.f99754g;
        if (user != null) {
            String uid = user.getUid();
            if (uid != null) {
                return uid;
            }
        }
        return "";
    }

    public final void setFollowCount(Integer num) {
        this.f99752e = num;
    }

    public C39106al(String str, String str2, String str3, long j, Integer num, int i, User user, List<C39123g> list, int i2, boolean z) {
        C52711k.m112240b(str, "poiId");
        C52711k.m112240b(str2, "questionId");
        C52711k.m112240b(str3, C42311c.f106865i);
        C52711k.m112240b(list, "answers");
        this.f99748a = str;
        this.f99749b = str2;
        this.f99750c = str3;
        this.f99751d = j;
        this.f99752e = num;
        this.f99753f = i;
        this.f99754g = user;
        this.f99755h = list;
        this.f99756i = i2;
        this.f99757j = z;
    }

    public /* synthetic */ C39106al(String str, String str2, String str3, long j, Integer num, int i, User user, List list, int i2, boolean z, int i3, C52707g gVar) {
        List list2;
        int i4;
        boolean z2;
        int i5 = i3;
        if ((i5 & 128) != 0) {
            list2 = new ArrayList();
        } else {
            list2 = list;
        }
        if ((i5 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        if ((i5 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        this(str, str2, str3, j, num, i, user, list2, i4, z2);
    }
}
