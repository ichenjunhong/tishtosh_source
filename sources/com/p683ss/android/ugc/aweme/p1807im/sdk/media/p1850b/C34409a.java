package com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b;

import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34415c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34415c.C34419d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34415c.C34420e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34415c.C34421f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1851c.C34415c.C34422g;
import java.io.Serializable;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.a */
public final class C34409a implements Serializable {

    /* renamed from: a */
    private boolean f88786a;

    /* renamed from: b */
    private String f88787b;

    /* renamed from: c */
    private long f88788c;

    /* renamed from: d */
    private long f88789d;

    /* renamed from: e */
    private int f88790e;

    /* renamed from: f */
    private long f88791f;

    /* renamed from: g */
    private long f88792g;

    /* renamed from: h */
    private String f88793h;

    /* renamed from: i */
    private String f88794i;

    /* renamed from: j */
    private int f88795j;

    /* renamed from: k */
    private int f88796k;

    /* renamed from: l */
    private final long f88797l;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.a$a */
    static final class C34410a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34409a f88798a;

        /* renamed from: b */
        final /* synthetic */ C52671b f88799b;

        C34410a(C34409a aVar, C52671b bVar) {
            this.f88798a = aVar;
            this.f88799b = bVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            C52671b bVar = this.f88799b;
            if (bVar != null) {
                bVar.invoke(this.f88798a);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.a$b */
    static final class C34411b extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34409a f88800a;

        /* renamed from: b */
        final /* synthetic */ C52671b f88801b;

        C34411b(C34409a aVar, C52671b bVar) {
            this.f88800a = aVar;
            this.f88801b = bVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            C52671b bVar = this.f88801b;
            if (bVar != null) {
                bVar.invoke(this.f88800a);
            }
            return C52860x.f131107a;
        }
    }

    public final long getDate() {
        return this.f88788c;
    }

    public final long getDateModify() {
        return this.f88789d;
    }

    public final long getDuration() {
        return this.f88791f;
    }

    public final String getFilePath() {
        return this.f88787b;
    }

    public final long getFileSize() {
        return this.f88792g;
    }

    public final int getHeight() {
        return this.f88796k;
    }

    public final long getId() {
        return this.f88797l;
    }

    public final String getMimeType() {
        return this.f88793h;
    }

    public final String getThumbnail() {
        return this.f88794i;
    }

    public final int getType() {
        return this.f88790e;
    }

    public final int getWidth() {
        return this.f88795j;
    }

    public final boolean isResized() {
        return this.f88786a;
    }

    public final boolean isImage() {
        if (this.f88790e == 0) {
            return true;
        }
        return false;
    }

    public final boolean isVideo() {
        if (this.f88790e == 1) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.valueOf(this.f88797l).hashCode();
    }

    public final boolean isGif() {
        if (this.f88790e == 2) {
            return true;
        }
        return false;
    }

    public final void setDate(long j) {
        this.f88788c = j;
    }

    public final void setDateModify(long j) {
        this.f88789d = j;
    }

    public final void setDuration(long j) {
        this.f88791f = j;
    }

    public final void setFilePath(String str) {
        this.f88787b = str;
    }

    public final void setFileSize(long j) {
        this.f88792g = j;
    }

    public final void setHeight(int i) {
        this.f88796k = i;
    }

    public final void setMimeType(String str) {
        this.f88793h = str;
    }

    public final void setResized(boolean z) {
        this.f88786a = z;
    }

    public final void setThumbnail(String str) {
        this.f88794i = str;
    }

    public final void setType(int i) {
        this.f88790e = i;
    }

    public final void setWidth(int i) {
        this.f88795j = i;
    }

    public C34409a(long j) {
        this.f88797l = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C34409a) && this.f88797l == ((C34409a) obj).f88797l) {
            return true;
        }
        return false;
    }

    public final void accurateSize(boolean z, C52671b<? super C34409a, C52860x> bVar) {
        if (isVideo()) {
            if (this.f88786a) {
                if (bVar != null) {
                    bVar.invoke(this);
                }
            } else if (z) {
                C34415c.m78364a(this);
                if (bVar != null) {
                    bVar.invoke(this);
                }
            } else {
                C52671b bVar2 = new C34411b(this, bVar);
                C52711k.m112240b(this, "mediaModel");
                C52711k.m112240b(bVar2, "callback");
                if (!isVideo()) {
                    bVar2.invoke(Boolean.valueOf(true));
                }
                C0013i.m16a((Callable<TResult>) new C34421f<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C34422g<TResult,TContinuationResult>(bVar2), C0013i.f25b);
            }
        } else if (isImage()) {
            if (this.f88786a) {
                if (bVar != null) {
                    bVar.invoke(this);
                }
            } else if (z) {
                C34415c.f88806a.mo72448b(this);
                if (bVar != null) {
                    bVar.invoke(this);
                }
            } else {
                C52670a aVar = new C34410a(this, bVar);
                C52711k.m112240b(this, "mediaModel");
                C52711k.m112240b(aVar, "callback");
                if (!isImage()) {
                    aVar.invoke();
                }
                C0013i.m16a((Callable<TResult>) new C34419d<TResult>(this)).mo20a((C0011g<TResult, TContinuationResult>) new C34420e<TResult,TContinuationResult>(aVar), C0013i.f25b);
            }
        } else if (bVar != null) {
            bVar.invoke(this);
        }
    }

    public static /* synthetic */ void accurateSize$default(C34409a aVar, boolean z, C52671b bVar, int i, Object obj) {
        if ((i & 2) != 0) {
            bVar = null;
        }
        aVar.accurateSize(z, bVar);
    }
}
