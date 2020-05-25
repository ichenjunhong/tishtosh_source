package com.p683ss.android.ugc.aweme.p1361ap;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.p1361ap.p1362a.C22793a;
import com.p683ss.android.ugc.aweme.services.mediachoose.IVideoLegalCheckerAndToastService;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C44153p;
import dmt.p2652av.video.C52928al;
import java.util.concurrent.TimeUnit;
import p001a.C0013i;
import p001a.C0027j;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.ap.b */
public final class C22801b implements IVideoLegalCheckerAndToastService {

    /* renamed from: b */
    public static final C22802a f61086b = new C22802a(null);

    /* renamed from: a */
    public final Context f61087a;

    /* renamed from: com.ss.android.ugc.aweme.ap.b$a */
    public static final class C22802a {
        private C22802a() {
        }

        public /* synthetic */ C22802a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.b$b */
    static final class C22803b extends C52712l implements C52682m<String, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C0027j f61088a;

        C22803b(C0027j jVar) {
            this.f61088a = jVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            ((Number) obj2).longValue();
            C52711k.m112240b(str, "checkerType");
            this.f61088a.mo44a(Boolean.valueOf(true));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.b$c */
    static final class C22804c extends C52712l implements C52687r<String, Long, Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C22801b f61089a;

        /* renamed from: b */
        final /* synthetic */ boolean f61090b;

        /* renamed from: c */
        final /* synthetic */ int f61091c;

        /* renamed from: d */
        final /* synthetic */ C52671b f61092d;

        /* renamed from: e */
        final /* synthetic */ C0027j f61093e;

        C22804c(C22801b bVar, boolean z, int i, C52671b bVar2, C0027j jVar) {
            this.f61089a = bVar;
            this.f61090b = z;
            this.f61091c = i;
            this.f61092d = bVar2;
            this.f61093e = jVar;
            super(4);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            ((Number) obj2).longValue();
            int intValue = ((Number) obj3).intValue();
            String str2 = (String) obj4;
            C52711k.m112240b(str, "checkerType");
            C52711k.m112240b(str2, "errorMsg");
            if (this.f61090b) {
                C44153p.m96803a(this.f61089a.f61087a, intValue, this.f61091c);
            }
            C52671b bVar = this.f61092d;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(intValue));
            }
            this.f61093e.mo44a(Boolean.valueOf(false));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.b$d */
    static final class C22805d extends C52712l implements C52682m<String, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52670a f61094a;

        C22805d(C52670a aVar) {
            this.f61094a = aVar;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            ((Number) obj2).longValue();
            C52711k.m112240b(str, "checkerType");
            this.f61094a.invoke();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.b$e */
    static final class C22806e extends C52712l implements C52687r<String, Long, Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C22801b f61095a;

        /* renamed from: b */
        final /* synthetic */ boolean f61096b;

        /* renamed from: c */
        final /* synthetic */ int f61097c;

        /* renamed from: d */
        final /* synthetic */ C52671b f61098d;

        C22806e(C22801b bVar, boolean z, int i, C52671b bVar2) {
            this.f61095a = bVar;
            this.f61096b = z;
            this.f61097c = i;
            this.f61098d = bVar2;
            super(4);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            ((Number) obj2).longValue();
            int intValue = ((Number) obj3).intValue();
            String str2 = (String) obj4;
            C52711k.m112240b(str, "checkerType");
            C52711k.m112240b(str2, "errorMsg");
            if (this.f61096b) {
                C44153p.m96803a(this.f61095a.f61087a, intValue, this.f61097c);
            }
            C52671b bVar = this.f61098d;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(intValue));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.b$f */
    static final class C22807f extends C52712l implements C52687r<String, Long, Integer, String, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C22801b f61099a;

        /* renamed from: b */
        final /* synthetic */ C52687r f61100b;

        /* renamed from: c */
        final /* synthetic */ int f61101c;

        /* renamed from: d */
        final /* synthetic */ int f61102d;

        /* renamed from: e */
        final /* synthetic */ C52682m f61103e;

        /* renamed from: f */
        final /* synthetic */ boolean f61104f;

        C22807f(C22801b bVar, C52687r rVar, int i, int i2, C52682m mVar, boolean z) {
            this.f61099a = bVar;
            this.f61100b = rVar;
            this.f61101c = i;
            this.f61102d = i2;
            this.f61103e = mVar;
            this.f61104f = z;
            super(4);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo18305a(Object obj, Object obj2, Object obj3, Object obj4) {
            String str = (String) obj;
            long longValue = ((Number) obj2).longValue();
            int intValue = ((Number) obj3).intValue();
            String str2 = (String) obj4;
            C52711k.m112240b(str, "checkerType");
            C52711k.m112240b(str2, "errorMsg");
            if (this.f61104f) {
                C44153p.m96803a(this.f61099a.f61087a, intValue, this.f61101c);
            }
            this.f61100b.mo18305a(str, Long.valueOf(longValue), Integer.valueOf(intValue), str2);
            return C52860x.f131107a;
        }
    }

    public C22801b(Context context) {
        C52711k.m112240b(context, "context");
        this.f61087a = context;
    }

    /* renamed from: b */
    private static String m56176b(String str) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(str);
            return mediaMetadataRetriever.extractMetadata(12);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private final MediaModel m56173a(String str) {
        int[] a = C52928al.m112612a(str);
        if (a == null) {
            return null;
        }
        MediaModel mediaModel = new MediaModel(-1);
        mediaModel.f95383b = str;
        mediaModel.f95390i = a[0];
        mediaModel.f95391j = a[1];
        mediaModel.f95386e = (long) a[3];
        mediaModel.f95388g = m56176b(str);
        return mediaModel;
    }

    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z) {
        C52711k.m112240b(str, "videoPath");
        return isVideoLengthOrTypeSupportedAndShowErrToast(str, z, null);
    }

    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(str, "videoPath");
        MediaModel a = m56173a(str);
        if (a != null) {
            return m56174a(this, a, z, 0, 0, bVar, 12, null);
        }
        return false;
    }

    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, C52670a<C52860x> aVar) {
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(aVar, "onSucess");
        MediaModel a = m56173a(str);
        if (a != null) {
            C22793a a2 = C22793a.m56152a();
            C52711k.m112236a((Object) a2, "com.ss.android.ugc.aweme…ediaChooser.getInstance()");
            int i2 = a2.f61068b;
            if (i <= 0) {
                C22793a a3 = C22793a.m56152a();
                C52711k.m112236a((Object) a3, "com.ss.android.ugc.aweme…ediaChooser.getInstance()");
                i = a3.f61069c;
            }
            new C22808c(this.f61087a).mo47261a(a, (long) i2, (long) i, new C22805d(aVar), new C22806e(this, z, i2, null));
        }
    }

    public final boolean isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, C52671b<? super Integer, C52860x> bVar) {
        C52711k.m112240b(str, "videoPath");
        MediaModel a = m56173a(str);
        if (a != null) {
            return m56174a(this, a, z, i, 0, bVar, 8, null);
        }
        return false;
    }

    /* renamed from: a */
    private final boolean m56175a(MediaModel mediaModel, boolean z, int i, long j, C52671b<? super Integer, C52860x> bVar) {
        int i2;
        C0027j jVar = new C0027j();
        C22793a a = C22793a.m56152a();
        C52711k.m112236a((Object) a, "com.ss.android.ugc.aweme…ediaChooser.getInstance()");
        int i3 = a.f61068b;
        if (i > 0) {
            i2 = i;
        } else {
            C22793a a2 = C22793a.m56152a();
            C52711k.m112236a((Object) a2, "com.ss.android.ugc.aweme…ediaChooser.getInstance()");
            i2 = a2.f61069c;
        }
        C22808c cVar = new C22808c(this.f61087a);
        long j2 = (long) i3;
        long j3 = (long) i2;
        C52682m bVar2 = new C22803b(jVar);
        C22804c cVar2 = new C22804c(this, z, i3, bVar, jVar);
        cVar.mo47261a(mediaModel, j2, j3, bVar2, cVar2);
        try {
            jVar.f77a.mo22a(j, TimeUnit.MILLISECONDS);
            C0013i<TResult> iVar = jVar.f77a;
            C52711k.m112236a((Object) iVar, "isLegalWaitTask.task");
            Boolean bool = (Boolean) iVar.mo34e();
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public final void isVideoLengthOrTypeSupportedAndShowErrToast(String str, boolean z, int i, int i2, C52682m<? super String, ? super Long, C52860x> mVar, C52687r<? super String, ? super Long, ? super Integer, ? super String, C52860x> rVar) {
        C52687r<? super String, ? super Long, ? super Integer, ? super String, C52860x> rVar2 = rVar;
        C52711k.m112240b(str, "videoPath");
        C52711k.m112240b(mVar, "onSuccess");
        C52711k.m112240b(rVar2, "onError");
        MediaModel a = m56173a(str);
        if (a == null) {
            rVar2.mo18305a("", Long.valueOf(0), Integer.valueOf(-9), "path is null");
            return;
        }
        C22808c cVar = new C22808c(this.f61087a);
        int i3 = i2;
        long j = (long) i3;
        int i4 = i;
        long j2 = (long) i4;
        C22807f fVar = new C22807f(this, rVar, i3, i4, mVar, z);
        cVar.mo47261a(a, j, j2, mVar, fVar);
    }

    /* renamed from: a */
    private static /* synthetic */ boolean m56174a(C22801b bVar, MediaModel mediaModel, boolean z, int i, long j, C52671b bVar2, int i2, Object obj) {
        int i3;
        if ((i2 & 4) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 8) != 0) {
            j = 1000;
        }
        return bVar.m56175a(mediaModel, z, i3, j, bVar2);
    }
}
