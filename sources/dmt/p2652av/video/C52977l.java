package dmt.p2652av.video;

import com.p683ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import java.util.concurrent.atomic.AtomicInteger;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: dmt.av.video.l */
public final class C52977l {

    /* renamed from: h */
    public static final C52978a f131385h = new C52978a(null);

    /* renamed from: a */
    public AtomicInteger f131386a;

    /* renamed from: b */
    public AtomicInteger f131387b;

    /* renamed from: c */
    public AtomicInteger f131388c;

    /* renamed from: d */
    public final String f131389d;

    /* renamed from: e */
    public final boolean f131390e;

    /* renamed from: f */
    public final boolean f131391f;

    /* renamed from: g */
    public final AudioEffectParam f131392g;

    /* renamed from: dmt.av.video.l$a */
    public static final class C52978a {
        private C52978a() {
        }

        public /* synthetic */ C52978a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static C52977l m112705a(boolean z, boolean z2, AudioEffectParam audioEffectParam) {
            C52977l lVar = new C52977l("apply", z, z2, audioEffectParam, null);
            return lVar;
        }
    }

    /* renamed from: a */
    public static final C52977l m112704a(boolean z, boolean z2, AudioEffectParam audioEffectParam) {
        return C52978a.m112705a(true, z2, audioEffectParam);
    }

    private C52977l(String str, boolean z, boolean z2, AudioEffectParam audioEffectParam) {
        this.f131389d = str;
        this.f131390e = z;
        this.f131391f = z2;
        this.f131392g = audioEffectParam;
        this.f131386a = new AtomicInteger(-1);
        this.f131387b = new AtomicInteger(-1);
        this.f131388c = new AtomicInteger(-1);
    }

    public /* synthetic */ C52977l(String str, boolean z, boolean z2, AudioEffectParam audioEffectParam, C52707g gVar) {
        this(str, z, z2, audioEffectParam);
    }

    public /* synthetic */ C52977l(String str, boolean z, boolean z2, AudioEffectParam audioEffectParam, int i, C52707g gVar) {
        this(str, z, z2, null);
    }
}
