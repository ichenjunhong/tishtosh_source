package com.twitter.sdk.android.core.internal.scribe;

import com.google.gson.p1076a.C17952c;
import com.twitter.sdk.android.core.models.C52197d;
import com.twitter.sdk.android.core.models.C52203j;
import com.twitter.sdk.android.core.models.C52209m;
import com.twitter.sdk.android.core.models.C52213q;
import com.twitter.sdk.android.core.models.C52216s;
import java.io.Serializable;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.aa */
public final class C52144aa implements Serializable {
    @C17952c(mo34828a = "card_event")
    public final C52147b cardEvent;
    @C17952c(mo34828a = "description")
    public final String description;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public final Long f129799id;
    @C17952c(mo34828a = "item_type")
    public final Integer itemType;
    @C17952c(mo34828a = "media_details")
    public final C52148c mediaDetails;

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.aa$a */
    public static class C52146a {

        /* renamed from: a */
        String f129800a;

        /* renamed from: b */
        private Integer f129801b;

        /* renamed from: c */
        private Long f129802c;

        /* renamed from: d */
        private C52147b f129803d;

        /* renamed from: e */
        private C52148c f129804e;

        /* renamed from: a */
        public final C52144aa mo108858a() {
            C52144aa aaVar = new C52144aa(this.f129801b, this.f129802c, this.f129800a, this.f129803d, this.f129804e);
            return aaVar;
        }

        /* renamed from: a */
        public final C52146a mo108857a(C52148c cVar) {
            this.f129804e = cVar;
            return this;
        }

        /* renamed from: a */
        public final C52146a mo108855a(int i) {
            this.f129801b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: a */
        public final C52146a mo108856a(long j) {
            this.f129802c = Long.valueOf(j);
            return this;
        }
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.aa$b */
    public static class C52147b implements Serializable {
        @C17952c(mo34828a = "promotion_card_type")

        /* renamed from: a */
        final int f129805a;

        public final int hashCode() {
            return this.f129805a;
        }

        public C52147b(int i) {
            this.f129805a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            if (this.f129805a == ((C52147b) obj).f129805a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.twitter.sdk.android.core.internal.scribe.aa$c */
    public static class C52148c implements Serializable {
        @C17952c(mo34828a = "content_id")
        public final long contentId;
        @C17952c(mo34828a = "media_type")
        public final int mediaType;
        @C17952c(mo34828a = "publisher_id")
        public final long publisherId;

        public final int hashCode() {
            return (((((int) (this.contentId ^ (this.contentId >>> 32))) * 31) + this.mediaType) * 31) + ((int) (this.publisherId ^ (this.publisherId >>> 32)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C52148c cVar = (C52148c) obj;
            if (this.contentId == cVar.contentId && this.mediaType == cVar.mediaType && this.publisherId == cVar.publisherId) {
                return true;
            }
            return false;
        }

        public C52148c(long j, int i, long j2) {
            this.contentId = j;
            this.mediaType = i;
            this.publisherId = j2;
        }
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        if (this.itemType != null) {
            i = this.itemType.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        if (this.f129799id != null) {
            i2 = this.f129799id.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        if (this.description != null) {
            i3 = this.description.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        if (this.cardEvent != null) {
            i4 = this.cardEvent.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        if (this.mediaDetails != null) {
            i5 = this.mediaDetails.hashCode();
        }
        return i9 + i5;
    }

    public static C52144aa fromMessage(String str) {
        C52146a a = new C52146a().mo108855a(6);
        a.f129800a = str;
        return a.mo108858a();
    }

    public static C52144aa fromTweet(C52209m mVar) {
        return new C52146a().mo108855a(0).mo108856a(mVar.f129969i).mo108858a();
    }

    public static C52144aa fromUser(C52213q qVar) {
        return new C52146a().mo108855a(3).mo108856a(qVar.f130027id).mo108858a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C52144aa aaVar = (C52144aa) obj;
        if (this.itemType == null ? aaVar.itemType != null : !this.itemType.equals(aaVar.itemType)) {
            return false;
        }
        if (this.f129799id == null ? aaVar.f129799id != null : !this.f129799id.equals(aaVar.f129799id)) {
            return false;
        }
        if (this.description == null ? aaVar.description != null : !this.description.equals(aaVar.description)) {
            return false;
        }
        if (this.cardEvent == null ? aaVar.cardEvent != null : !this.cardEvent.equals(aaVar.cardEvent)) {
            return false;
        }
        if (this.mediaDetails == null ? aaVar.mediaDetails != null : !this.mediaDetails.equals(aaVar.mediaDetails)) {
            return false;
        }
        return true;
    }

    public static C52144aa fromMediaEntity(long j, C52203j jVar) {
        int i;
        C52146a a = new C52146a().mo108855a(0).mo108856a(j);
        if ("animated_gif".equals(jVar.type)) {
            i = 3;
        } else {
            i = 1;
        }
        C52148c cVar = new C52148c(j, i, jVar.f129939id);
        return a.mo108857a(cVar).mo108858a();
    }

    public static C52144aa fromTweetCard(long j, C52197d dVar) {
        C52146a a = new C52146a().mo108855a(0).mo108856a(j);
        C52148c cVar = new C52148c(j, 4, Long.valueOf(((C52216s) dVar.f129924a.mo108925a("site")).f130031a).longValue());
        return a.mo108857a(cVar).mo108858a();
    }

    private C52144aa(Integer num, Long l, String str, C52147b bVar, C52148c cVar) {
        this.itemType = num;
        this.f129799id = l;
        this.description = str;
        this.cardEvent = bVar;
        this.mediaDetails = cVar;
    }
}
