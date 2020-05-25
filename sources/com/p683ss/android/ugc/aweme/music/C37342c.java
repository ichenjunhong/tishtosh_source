package com.p683ss.android.ugc.aweme.music;

import com.p683ss.android.ugc.aweme.music.service.C37435b;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p683ss.android.ugc.p2425e.C48545a;
import java.util.concurrent.Callable;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.c */
public final class C37342c implements C37435b {

    /* renamed from: a */
    public final C37435b f95298a;

    /* renamed from: com.ss.android.ugc.aweme.music.c$a */
    static final class C37343a<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37342c f95299a;

        C37343a(C37342c cVar) {
            this.f95299a = cVar;
        }

        public final /* synthetic */ Object call() {
            this.f95299a.f95298a.mo55350a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.c$b */
    static final class C37344b<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37342c f95300a;

        /* renamed from: b */
        final /* synthetic */ C48545a f95301b;

        C37344b(C37342c cVar, C48545a aVar) {
            this.f95300a = cVar;
            this.f95301b = aVar;
        }

        public final /* synthetic */ Object call() {
            this.f95300a.f95298a.mo55352a(this.f95301b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.c$c */
    static final class C37345c<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37342c f95302a;

        /* renamed from: b */
        final /* synthetic */ int f95303b;

        C37345c(C37342c cVar, int i) {
            this.f95302a = cVar;
            this.f95303b = i;
        }

        public final /* synthetic */ Object call() {
            this.f95302a.f95298a.mo55351a(this.f95303b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.c$d */
    static final class C37346d<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37342c f95304a;

        C37346d(C37342c cVar) {
            this.f95304a = cVar;
        }

        public final /* synthetic */ Object call() {
            this.f95304a.f95298a.mo55354b();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.c$e */
    static final class C37347e<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C37342c f95305a;

        /* renamed from: b */
        final /* synthetic */ String f95306b;

        /* renamed from: c */
        final /* synthetic */ MusicWaveBean f95307c;

        C37347e(C37342c cVar, String str, MusicWaveBean musicWaveBean) {
            this.f95305a = cVar;
            this.f95306b = str;
            this.f95307c = musicWaveBean;
        }

        public final /* synthetic */ Object call() {
            this.f95305a.f95298a.mo55353a(this.f95306b, this.f95307c);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final void mo55350a() {
        C0013i.m18a((Callable<TResult>) new C37343a<TResult>(this), C0013i.f25b);
    }

    /* renamed from: b */
    public final void mo55354b() {
        C0013i.m18a((Callable<TResult>) new C37346d<TResult>(this), C0013i.f25b);
    }

    public C37342c(C37435b bVar) {
        C52711k.m112240b(bVar, "downloadListener");
        this.f95298a = bVar;
    }

    /* renamed from: a */
    public final void mo55351a(int i) {
        C0013i.m18a((Callable<TResult>) new C37345c<TResult>(this, i), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo55352a(C48545a aVar) {
        C52711k.m112240b(aVar, "error");
        C0013i.m18a((Callable<TResult>) new C37344b<TResult>(this, aVar), C0013i.f25b);
    }

    /* renamed from: a */
    public final void mo55353a(String str, MusicWaveBean musicWaveBean) {
        C52711k.m112240b(str, "musicFile");
        C0013i.m18a((Callable<TResult>) new C37347e<TResult>(this, str, musicWaveBean), C0013i.f25b);
    }
}
