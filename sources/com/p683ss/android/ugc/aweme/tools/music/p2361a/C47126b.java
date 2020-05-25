package com.p683ss.android.ugc.aweme.tools.music.p2361a;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.component.music.MusicService;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.p1482bw.p1483a.C24437f;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.tools.music.p2363c.C47164a;
import com.p683ss.android.ugc.aweme.tools.music.p2366e.C47197b;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.music.a.b */
public final class C47126b {

    /* renamed from: c */
    public static final C47126b f118979c = C47128b.f118983a;

    /* renamed from: d */
    public static final C47127a f118980d = new C47127a(null);

    /* renamed from: a */
    public C47164a f118981a;

    /* renamed from: b */
    public C24437f f118982b;

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b$a */
    public static final class C47127a {
        private C47127a() {
        }

        /* renamed from: a */
        public static C47126b m102336a() {
            return C47126b.f118979c;
        }

        public /* synthetic */ C47127a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b$b */
    static final class C47128b {

        /* renamed from: a */
        static final C47126b f118983a = new C47126b();

        /* renamed from: b */
        public static final C47128b f118984b = new C47128b();

        private C47128b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b$c */
    static final class C47129c<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ String f118985a;

        C47129c(String str) {
            this.f118985a = str;
        }

        public final /* synthetic */ Object call() {
            return MusicService.createIMusicServicebyMonsterPlugin().fetchMusicById(this.f118985a, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.music.a.b$d */
    static final class C47130d<TTaskResult, TContinuationResult> implements C0011g<Music, Object> {

        /* renamed from: a */
        final /* synthetic */ C47126b f118986a;

        C47130d(C47126b bVar) {
            this.f118986a = bVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (this.f118986a.f118981a != null) {
                C52711k.m112236a((Object) iVar, "it");
                boolean z = false;
                C42482c cVar = null;
                if (iVar.mo34e() != null) {
                    MusicModel convertToMusicModel = ((Music) iVar.mo34e()).convertToMusicModel();
                    C24437f fVar = this.f118986a.f118982b;
                    if (fVar != null) {
                        cVar = fVar.mo50201b();
                    }
                    if (cVar == null) {
                        z = true;
                    }
                    if (convertToMusicModel != null) {
                        convertToMusicModel.setMvThemeMusic(true);
                        if (z) {
                            C24437f fVar2 = this.f118986a.f118982b;
                            if (fVar2 != null) {
                                new C47197b();
                                fVar2.mo50200a(C47197b.m102454a(convertToMusicModel));
                            }
                        }
                    }
                    C47164a aVar = this.f118986a.f118981a;
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    aVar.mo94376a(convertToMusicModel, z);
                } else {
                    C47164a aVar2 = this.f118986a.f118981a;
                    if (aVar2 == null) {
                        C52711k.m112234a();
                    }
                    aVar2.mo94376a(null, false);
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final C47126b mo94394a(C24437f fVar) {
        this.f118982b = fVar;
        return this;
    }

    /* renamed from: a */
    public final C47126b mo94395a(C47164a aVar) {
        this.f118981a = aVar;
        return this;
    }

    /* renamed from: a */
    public final C47126b mo94396a(List<String> list) {
        if (C23715d.m58202a((Collection<T>) list) || list == null) {
            if (this.f118981a != null) {
                C47164a aVar = this.f118981a;
                if (aVar == null) {
                    C52711k.m112234a();
                }
                aVar.mo94376a(null, false);
            }
            return this;
        }
        String str = (String) list.get(0);
        if (TextUtils.isEmpty(str)) {
            if (this.f118981a != null) {
                C47164a aVar2 = this.f118981a;
                if (aVar2 == null) {
                    C52711k.m112234a();
                }
                aVar2.mo94376a(null, false);
            }
            return this;
        }
        C0013i.m16a((Callable<TResult>) new C47129c<TResult>(str)).mo20a((C0011g<TResult, TContinuationResult>) new C47130d<TResult,TContinuationResult>(this), C0013i.f25b);
        return this;
    }
}
