package com.p683ss.android.ugc.aweme.commercialize.loft.p1575b;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.b.a */
public final class C26006a implements Serializable {
    @C17952c(mo34828a = "activity_id")

    /* renamed from: a */
    private String f68643a;
    @C17952c(mo34828a = "status")

    /* renamed from: b */
    private int f68644b = 0;
    @C17952c(mo34828a = "activity_end_time")

    /* renamed from: c */
    private Integer f68645c = Integer.valueOf(0);
    @C17952c(mo34828a = "second_floor_guide")

    /* renamed from: d */
    private C26008c f68646d;
    @C17952c(mo34828a = "brand_package")

    /* renamed from: e */
    private C26007b f68647e;
    @C17952c(mo34828a = "aweme_list")

    /* renamed from: f */
    private List<Object> f68648f;

    public final C26007b getAnimationRes() {
        return this.f68647e;
    }

    public final Integer getEndTime() {
        return this.f68645c;
    }

    public final C26008c getGuide() {
        return this.f68646d;
    }

    public final String getId() {
        return this.f68643a;
    }

    public final int getStatus() {
        return this.f68644b;
    }

    public final List<Object> getVideoList() {
        return this.f68648f;
    }

    public final void setAnimationRes(C26007b bVar) {
        this.f68647e = bVar;
    }

    public final void setEndTime(Integer num) {
        this.f68645c = num;
    }

    public final void setGuide(C26008c cVar) {
        this.f68646d = cVar;
    }

    public final void setId(String str) {
        this.f68643a = str;
    }

    public final void setStatus(int i) {
        this.f68644b = i;
    }

    public final void setVideoList(List<Object> list) {
        this.f68648f = list;
    }
}
