package com.p683ss.android.ugc.aweme.video.local;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.video.local.b */
public final class C48050b {

    /* renamed from: e */
    public static final C48051a f120755e = new C48051a(null);

    /* renamed from: a */
    public final HashMap<String, C48062f> f120756a = new HashMap<>();

    /* renamed from: b */
    public final List<String> f120757b = new ArrayList();

    /* renamed from: c */
    public long f120758c;

    /* renamed from: d */
    public final List<C48062f> f120759d = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$a */
    public static final class C48051a {
        private C48051a() {
        }

        public /* synthetic */ C48051a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$b */
    static final class C48052b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        public static final C48052b f120760a = new C48052b();

        C48052b() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$c */
    static final class C48053c<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ String f120761a;

        C48053c(String str) {
            this.f120761a = str;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(C48016e.m103947c(this.f120761a));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$d */
    static final class C48054d<TTaskResult, TContinuationResult> implements C0011g<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48050b f120762a;

        /* renamed from: b */
        final /* synthetic */ String f120763b;

        /* renamed from: c */
        final /* synthetic */ C52670a f120764c;

        /* renamed from: d */
        final /* synthetic */ String f120765d;

        C48054d(C48050b bVar, String str, C52670a aVar, String str2) {
            this.f120762a = bVar;
            this.f120763b = str;
            this.f120764c = aVar;
            this.f120765d = str2;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            this.f120762a.f120757b.remove(this.f120763b);
            this.f120764c.invoke();
            StringBuilder sb = new StringBuilder("LocalVideoCache=>delete video cache,filePath:");
            sb.append(this.f120765d);
            C45407ay.m98968a(sb.toString());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$e */
    static final class C48055e<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48050b f120766a;

        /* renamed from: b */
        final /* synthetic */ C48062f f120767b;

        C48055e(C48050b bVar, C48062f fVar) {
            this.f120766a = bVar;
            this.f120767b = fVar;
        }

        public final /* synthetic */ Object call() {
            boolean z;
            if (this.f120766a.mo95329b(this.f120767b)) {
                C48050b bVar = this.f120766a;
                String sourceId = this.f120767b.getSourceId();
                C52711k.m112236a((Object) sourceId, "model.sourceId");
                bVar.mo95322a(sourceId, this.f120767b.f120778a, C48052b.f120760a);
            } else {
                C48062f fVar = this.f120767b;
                if (TextUtils.isEmpty(this.f120767b.f120778a) || TextUtils.isEmpty(this.f120767b.getSourceId())) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    fVar = null;
                }
                if (fVar != null) {
                    File file = new File(this.f120767b.f120778a);
                    if (file.exists()) {
                        Map map = this.f120766a.f120756a;
                        String sourceId2 = this.f120767b.getSourceId();
                        C52711k.m112236a((Object) sourceId2, "model.sourceId");
                        map.put(sourceId2, this.f120767b);
                        this.f120766a.f120759d.add(this.f120767b);
                        this.f120766a.f120758c += file.length();
                        StringBuilder sb = new StringBuilder("LocalVideoCache=>add cache,fileSize:");
                        sb.append(file.length());
                        sb.append(",totalSize:");
                        sb.append(this.f120766a.f120758c);
                        sb.append(",filePath:");
                        sb.append(file.getPath());
                        C45407ay.m98968a(sb.toString());
                    }
                }
                this.f120766a.mo95324a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$f */
    static final class C48056f<T> implements Comparator<C48062f> {

        /* renamed from: a */
        public static final C48056f f120768a = new C48056f();

        C48056f() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            C48062f fVar = (C48062f) obj;
            C48062f fVar2 = (C48062f) obj2;
            C52711k.m112236a((Object) fVar, "o1");
            long createTime = fVar.getCreateTime();
            C52711k.m112236a((Object) fVar2, "o2");
            if (createTime == fVar2.getCreateTime()) {
                return 0;
            }
            if (fVar.getCreateTime() > fVar2.getCreateTime()) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$g */
    static final class C48057g extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48062f f120769a;

        /* renamed from: b */
        final /* synthetic */ C48050b f120770b;

        /* renamed from: c */
        final /* synthetic */ String f120771c;

        C48057g(C48062f fVar, C48050b bVar, String str) {
            this.f120769a = fVar;
            this.f120770b = bVar;
            this.f120771c = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f120770b.f120756a.remove(this.f120771c);
            this.f120770b.f120759d.remove(this.f120769a);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.video.local.b$h */
    static final class C48058h extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48062f f120772a;

        /* renamed from: b */
        final /* synthetic */ C48050b f120773b;

        C48058h(C48062f fVar, C48050b bVar) {
            this.f120772a = fVar;
            this.f120773b = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f120773b.f120759d.remove(this.f120772a);
            this.f120773b.f120756a.remove(this.f120772a.getSourceId());
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    private static int m104069b() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            return b.getLocalVideoCacheMaxAge().intValue() * 60 * 1000;
        } catch (C10174a unused) {
            return 259200000;
        }
    }

    /* renamed from: c */
    private static int m104070c() {
        try {
            IESSettingsProxy b = C32816h.m75716b();
            C52711k.m112236a((Object) b, "SettingsReader.get()");
            return b.getLocalVideoCacheMaxLength().intValue() * PreloadTask.BYTE_UNIT_NUMBER * PreloadTask.BYTE_UNIT_NUMBER;
        } catch (C10174a unused) {
            return 157286400;
        }
    }

    /* renamed from: a */
    public final void mo95324a() {
        if (m104070c() != 0 && this.f120758c > ((long) m104070c())) {
            mo95327a(this.f120758c - ((long) m104070c()));
        }
    }

    /* renamed from: a */
    public final C48062f mo95323a(String str) {
        C52711k.m112240b(str, "sourceId");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (C48062f) this.f120756a.get(str);
    }

    /* renamed from: b */
    public final C48062f mo95328b(String str) {
        C52711k.m112240b(str, "sourceId");
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C48062f fVar = (C48062f) this.f120756a.get(str);
        if (fVar == null) {
            return null;
        }
        C52711k.m112236a((Object) fVar, "model");
        String sourceId = fVar.getSourceId();
        C52711k.m112236a((Object) sourceId, "model.sourceId");
        this.f120758c -= mo95322a(sourceId, fVar.f120778a, new C48057g(fVar, this, str));
        return fVar;
    }

    /* renamed from: b */
    public final boolean mo95329b(C48062f fVar) {
        if (fVar == null || SystemClock.elapsedRealtime() - fVar.getCreateTime() > ((long) m104069b()) || TextUtils.isEmpty(fVar.f120778a) || !new File(fVar.f120778a).exists()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo95325a(C48062f fVar) {
        C52711k.m112240b(fVar, "model");
        if (fVar.getSourceId() != null) {
            C0013i.m18a((Callable<TResult>) new C48055e<TResult>(this, fVar), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo95326a(Collection<? extends C48062f> collection) {
        C52711k.m112240b(collection, "cacheList");
        for (C48062f a : C52575l.m112122a((Iterable<? extends T>) collection, (Comparator<? super T>) C48056f.f120768a)) {
            mo95325a(a);
        }
    }

    /* renamed from: a */
    public final boolean mo95327a(long j) {
        long j2;
        List<C48062f> arrayList = new ArrayList<>();
        long j3 = 0;
        int i = 0;
        while (j3 < j && i < this.f120759d.size()) {
            int i2 = i + 1;
            C48062f fVar = (C48062f) this.f120759d.get(i);
            File file = new File(fVar.f120778a);
            if (file.exists()) {
                j2 = file.length();
            } else {
                j2 = 0;
            }
            arrayList.add(fVar);
            j3 += j2;
            this.f120758c -= j2;
            i = i2;
        }
        for (C48062f fVar2 : arrayList) {
            String sourceId = fVar2.getSourceId();
            C52711k.m112236a((Object) sourceId, "model.sourceId");
            mo95322a(sourceId, fVar2.f120778a, new C48058h(fVar2, this));
        }
        if (this.f120758c > j) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo95322a(String str, String str2, C52670a<C52860x> aVar) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || this.f120757b.contains(str)) {
            return 0;
        }
        File file = new File(str2);
        if (!file.exists()) {
            return 0;
        }
        long length = file.length();
        this.f120757b.add(str);
        C0013i.m18a((Callable<TResult>) new C48053c<TResult>(str2), (Executor) C24076h.m58902c()).mo20a((C0011g<TResult, TContinuationResult>) new C48054d<TResult,TContinuationResult>(this, str, aVar, str2), C0013i.f25b);
        return length;
    }
}
