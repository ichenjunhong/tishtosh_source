package com.p683ss.android.ugc.aweme.p1361ap;

import android.content.Context;
import com.p683ss.android.medialib.FFMpegManager;
import com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45546c;
import com.p683ss.android.ugc.aweme.utils.C47700ay;
import com.p683ss.android.ugc.aweme.utils.C47804db;
import com.p683ss.android.ugc.aweme.utils.C47871f;
import com.p683ss.android.ugc.aweme.utils.C47871f.C47872a;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2640a.C52687r;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.ap.a */
public final class C22789a implements C22818f {

    /* renamed from: a */
    private boolean f61053a = true;

    /* renamed from: b */
    private String f61054b = "";

    /* renamed from: c */
    private final Context f61055c;

    /* renamed from: com.ss.android.ugc.aweme.ap.a$a */
    static final class C22790a extends C52712l implements C52686q<String, Long, Integer, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C52687r f61056a;

        C22790a(C52687r rVar) {
            this.f61056a = rVar;
            super(3);
        }

        /* renamed from: a */
        public final void mo47264a(String str, long j, int i) {
            C52711k.m112240b(str, "checkerType");
            this.f61056a.mo18305a(str, Long.valueOf(j), Integer.valueOf(i), "");
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            mo47264a((String) obj, ((Number) obj2).longValue(), ((Number) obj3).intValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.a$b */
    static final class C22791b<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ MediaModel f61057a;

        /* renamed from: b */
        final /* synthetic */ long f61058b;

        /* renamed from: c */
        final /* synthetic */ long f61059c;

        C22791b(MediaModel mediaModel, long j, long j2) {
            this.f61057a = mediaModel;
            this.f61058b = j;
            this.f61059c = j2;
        }

        public final /* synthetic */ Object call() {
            return Integer.valueOf(FFMpegManager.m46826a().mo39232a(this.f61057a.f95383b, this.f61058b, this.f61059c));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ap.a$c */
    static final class C22792c<TTaskResult, TContinuationResult> implements C0011g<Integer, Void> {

        /* renamed from: a */
        final /* synthetic */ C22789a f61060a;

        /* renamed from: b */
        final /* synthetic */ C45546c f61061b;

        /* renamed from: c */
        final /* synthetic */ MediaModel f61062c;

        /* renamed from: d */
        final /* synthetic */ C52682m f61063d;

        /* renamed from: e */
        final /* synthetic */ long f61064e;

        /* renamed from: f */
        final /* synthetic */ C22790a f61065f;

        C22792c(C22789a aVar, C45546c cVar, MediaModel mediaModel, C52682m mVar, long j, C22790a aVar2) {
            this.f61060a = aVar;
            this.f61061b = cVar;
            this.f61062c = mediaModel;
            this.f61063d = mVar;
            this.f61064e = j;
            this.f61065f = aVar2;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            C52711k.m112236a((Object) iVar, "task");
            Integer num = (Integer) iVar.mo34e();
            if (this.f61061b != null) {
                C47700ay.m103236b(this.f61061b);
            }
            if (C52711k.m112230a(num.intValue(), 0) >= 0) {
                if (C52711k.m112230a(num.intValue(), 0) > 0) {
                    this.f61062c.f95386e = (long) num.intValue();
                }
                this.f61063d.invoke(C22789a.m56147a(), Long.valueOf(System.currentTimeMillis() - this.f61064e));
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(C22789a.m56147a());
                sb.append(" ImportError:");
                sb.append(num);
                C45407ay.m98968a(sb.toString());
                C22790a aVar = this.f61065f;
                String a = C22789a.m56147a();
                long currentTimeMillis = System.currentTimeMillis() - this.f61064e;
                C52711k.m112236a((Object) num, "result");
                aVar.mo47264a(a, currentTimeMillis, num.intValue());
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m56147a() {
        return "Editor1VideoLegalChecker";
    }

    /* renamed from: a */
    public final void mo47262a(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f61054b = str;
    }

    /* renamed from: a */
    public final void mo47263a(boolean z) {
        this.f61053a = z;
    }

    public C22789a(Context context) {
        C52711k.m112240b(context, "context");
        this.f61055c = context;
    }

    /* renamed from: a */
    public final void mo47261a(MediaModel mediaModel, long j, long j2, C52682m<? super String, ? super Long, C52860x> mVar, C52687r<? super String, ? super Long, ? super Integer, ? super String, C52860x> rVar) {
        C45546c cVar;
        MediaModel mediaModel2 = mediaModel;
        C52687r<? super String, ? super Long, ? super Integer, ? super String, C52860x> rVar2 = rVar;
        C52711k.m112240b(mediaModel2, "mediaModel");
        C52711k.m112240b(mVar, "onSuccess");
        C52711k.m112240b(rVar2, "onError");
        C22790a aVar = new C22790a(rVar2);
        C47871f a = C47872a.m103566a();
        String str = mediaModel2.f95383b;
        C52711k.m112236a((Object) str, "mediaModel.filePath");
        a.mo95087a(str, C47804db.VIDEO);
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f61053a) {
            cVar = C45546c.m99207a(this.f61055c, this.f61055c.getString(R.string.cy1));
        } else {
            cVar = null;
        }
        C45546c cVar2 = cVar;
        C22791b bVar = new C22791b(mediaModel, j, j2);
        C0013i a2 = C0013i.m16a((Callable<TResult>) bVar);
        C22792c cVar3 = new C22792c(this, cVar2, mediaModel, mVar, currentTimeMillis, aVar);
        a2.mo20a((C0011g<TResult, TContinuationResult>) cVar3, C0013i.f25b);
    }
}
