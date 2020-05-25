package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.text.TextUtils;
import com.C2240a;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ttve.model.VEMusicWaveBean;
import com.p683ss.android.ugc.aweme.port.p2082in.C39630m;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43203d;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.DmtBubbleTextView.C43172a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.p2425e.C48557d;
import com.p683ss.android.vesdk.VEUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Callable;
import leakcanary.internal.LeakCanaryFileProvider;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e */
public final class C43191e {

    /* renamed from: f */
    public static volatile C43191e f109215f = new C43191e();

    /* renamed from: g */
    public static final HashMap<String, C43203d> f109216g = new HashMap<>();

    /* renamed from: h */
    public static final C43193b f109217h = new C43193b(null);

    /* renamed from: a */
    public int f109218a;

    /* renamed from: b */
    public int f109219b;

    /* renamed from: c */
    public int f109220c;

    /* renamed from: d */
    public int f109221d;

    /* renamed from: e */
    public int f109222e;

    /* renamed from: i */
    private int f109223i;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e$a */
    public interface C43192a {
        /* renamed from: a */
        void mo86593a(C43203d dVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e$b */
    public static final class C43193b {

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e$b$a */
        static final class C43194a<V> implements Callable<TResult> {

            /* renamed from: a */
            final /* synthetic */ String f109224a;

            C43194a(String str) {
                this.f109224a = str;
            }

            public final /* synthetic */ Object call() {
                TextUtils.isEmpty(this.f109224a);
                C43193b bVar = C43191e.f109217h;
                String str = this.f109224a;
                if (str == null) {
                    C52711k.m112234a();
                }
                return bVar.mo87802a(str);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e$b$b */
        static final class C43195b<TTaskResult, TContinuationResult> implements C0011g<C43203d, Object> {

            /* renamed from: a */
            final /* synthetic */ C43196c f109225a;

            C43195b(C43196c cVar) {
                this.f109225a = cVar;
            }

            public final /* synthetic */ Object then(C0013i iVar) {
                if (this.f109225a != null) {
                    if (iVar == null) {
                        this.f109225a.mo87805a(null);
                    } else {
                        this.f109225a.mo87805a(iVar.mo34e());
                    }
                }
                return null;
            }
        }

        private C43193b() {
        }

        /* renamed from: a */
        public static C43191e m94753a() {
            return C43191e.f109215f;
        }

        public /* synthetic */ C43193b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static boolean m94756a(float[] fArr) {
            boolean z;
            if (fArr != null) {
                if (fArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return false;
                }
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public static void m94755a(VEMusicWaveBean vEMusicWaveBean) {
            boolean z;
            if (vEMusicWaveBean != null) {
                float[] waveBean = vEMusicWaveBean.getWaveBean();
                if (waveBean != null) {
                    C52711k.m112236a((Object) waveBean, "it");
                    if (waveBean.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        int length = waveBean.length;
                        for (int i = 0; i < length; i++) {
                            if (Float.isNaN(waveBean[i])) {
                                waveBean[i] = 0.0f;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public static C43172a m94752a(Context context) {
            C43172a aVar = new C43172a();
            if (context == null) {
                return aVar;
            }
            aVar.f109150c = (int) C9432q.m18687b(context, 16.0f);
            aVar.f109149b = (int) C9432q.m18687b(context, 6.0f);
            aVar.f109148a = (int) C9432q.m18687b(context, 10.0f);
            aVar.f109155h = -1073741824;
            aVar.f109154g = -1;
            aVar.f109152e = (int) C9432q.m18687b(context, 4.0f);
            aVar.f109153f = (int) C9432q.m18687b(context, 2.0f);
            aVar.f109156i = (int) C9432q.m18687b(context, 11.0f);
            aVar.f109151d = (int) C9432q.m18687b(context, 8.0f);
            return aVar;
        }

        /* renamed from: a */
        public static String m94754a(long j) {
            try {
                long j2 = j / 1000;
                long j3 = j2 % 60;
                long j4 = j2 / 60;
                Locale locale = Locale.CHINA;
                C52711k.m112236a((Object) locale, "Locale.CHINA");
                String a = C2240a.m6773a(locale, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j3)}, 2));
                C52711k.m112236a((Object) a, "java.lang.String.format(locale, format, *args)");
                return a;
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder("cut music duration:");
                sb.append(j);
                C45407ay.m98971b(sb.toString());
                return "00:00";
            }
        }

        /* renamed from: a */
        public final C43203d mo87802a(String str) {
            int i;
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            if (C43191e.f109216g.get(str) != null) {
                return (C43203d) C43191e.f109216g.get(str);
            }
            int b = C39630m.m88234a().mo58604b().mo80578b(str);
            if (b < 0 || b > 90000) {
                return null;
            }
            if (b > 0) {
                i = m94753a().mo87797a(b, true);
            } else {
                i = 2000;
            }
            if (i <= 0) {
                i = 2000;
            }
            C43203d a = C43191e.m94740a(VEUtils.getMusicWaveData(str, 0, i));
            C43191e.f109216g.put(str, a);
            return a;
        }

        /* renamed from: a */
        public final C43203d mo87803a(String str, boolean z, C43196c cVar) {
            if (!z) {
                C0013i.m16a((Callable<TResult>) new C43194a<TResult>(str)).mo20a((C0011g<TResult, TContinuationResult>) new C43195b<TResult,TContinuationResult>(cVar), C0013i.f25b);
                return null;
            } else if (TextUtils.isEmpty(str)) {
                return null;
            } else {
                C43193b bVar = this;
                if (str == null) {
                    C52711k.m112234a();
                }
                return bVar.mo87802a(str);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e$c */
    public interface C43196c {
        /* renamed from: a */
        void mo87805a(Object obj);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.e$d */
    public static final class C43197d implements C43196c {

        /* renamed from: a */
        final /* synthetic */ C43192a f109226a;

        C43197d(C43192a aVar) {
            this.f109226a = aVar;
        }

        /* renamed from: a */
        public final void mo87805a(Object obj) {
            boolean z;
            StringBuilder sb = new StringBuilder("OLD_DRAFT AudioWaveDataIsNull:");
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            sb.append(z);
            C45407ay.m98968a(sb.toString());
            if (this.f109226a != null) {
                if (obj == null || !(obj instanceof C43203d)) {
                    this.f109226a.mo86593a(null);
                } else {
                    this.f109226a.mo86593a((C43203d) obj);
                }
            }
        }
    }

    /* renamed from: a */
    public static final C43191e m94739a() {
        return C43193b.m94753a();
    }

    /* renamed from: a */
    public static final boolean m94744a(float[] fArr) {
        return C43193b.m94756a(fArr);
    }

    /* renamed from: b */
    public final int mo87801b(Context context) {
        C52711k.m112240b(context, "context");
        return ((C9432q.m18670a(context) - ((int) C9432q.m18687b(context, 20.0f))) + this.f109221d) / (this.f109221d + this.f109219b);
    }

    /* renamed from: a */
    public static C43203d m94740a(VEMusicWaveBean vEMusicWaveBean) {
        if (vEMusicWaveBean == null || !C43193b.m94756a(vEMusicWaveBean.getWaveBean())) {
            return null;
        }
        C43193b.m94755a(vEMusicWaveBean);
        C43203d dVar = new C43203d();
        float[] waveBean = vEMusicWaveBean.getWaveBean();
        C52711k.m112236a((Object) waveBean, "veMusicWaveBean.waveBean");
        float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
        C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        dVar.setMusicWavePointArray(copyOf);
        return dVar;
    }

    /* renamed from: b */
    public static void m94745b(C43203d dVar) {
        if (dVar != null && C43193b.m94756a(dVar.getMusicWavePointArray())) {
            int length = dVar.getMusicWavePointArray().length;
            for (int i = 0; i < length; i++) {
                if (dVar.getMusicWavePointArray()[i] < 0.1f) {
                    dVar.getMusicWavePointArray()[i] = 0.1f;
                }
            }
        }
    }

    /* renamed from: a */
    public static C43203d m94741a(C42482c cVar) {
        if (cVar == null || !C43193b.m94756a(cVar.getMusicWaveData())) {
            return null;
        }
        C43203d dVar = new C43203d();
        float[] musicWaveData = cVar.getMusicWaveData();
        C52711k.m112236a((Object) musicWaveData, "bean.musicWaveData");
        float[] copyOf = Arrays.copyOf(musicWaveData, musicWaveData.length);
        C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        dVar.setMusicWavePointArray(copyOf);
        String a = C48557d.m105031a().mo96061a(cVar.path);
        C52711k.m112236a((Object) a, "MusicProviderConfig.getI…().getFilePath(bean.path)");
        dVar.setMusicPath(a);
        return dVar;
    }

    /* renamed from: a */
    public static C43203d m94742a(C43203d dVar) {
        if (dVar == null || !C43193b.m94756a(dVar.getMusicWavePointArray())) {
            return dVar;
        }
        C43203d dVar2 = new C43203d();
        float[] musicWavePointArray = dVar.getMusicWavePointArray();
        float[] copyOf = Arrays.copyOf(musicWavePointArray, musicWavePointArray.length);
        C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        dVar2.setMusicWavePointArray(copyOf);
        dVar2.setMusicPath(dVar.getMusicPath());
        return dVar2;
    }

    /* renamed from: a */
    public final void mo87798a(Context context) {
        C52711k.m112240b(context, "context");
        this.f109218a = (int) C9432q.m18687b(context, 3.0f);
        this.f109219b = (int) C9432q.m18687b(context, 2.0f);
        this.f109220c = (int) C9432q.m18687b(context, 90.0f);
        this.f109221d = (int) C9432q.m18687b(context, 2.0f);
        this.f109223i = C9432q.m18670a(context);
    }

    /* renamed from: a */
    public final int mo87797a(int i, boolean z) {
        if (this.f109222e <= 0) {
            return 2000;
        }
        int i2 = (int) (((float) ((this.f109223i + this.f109219b) / (this.f109218a + this.f109219b))) * 1.0f * ((((float) i) * 1.0f) / ((float) this.f109222e)));
        if (z && i2 < 2000) {
            i2 = 2000;
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo87800a(String str, C43192a aVar) {
        m94743a(str, 6, aVar);
    }

    /* renamed from: a */
    public static void m94743a(String str, int i, C43192a aVar) {
        if (!TextUtils.isEmpty(str)) {
            f109217h.mo87803a(str, false, new C43197d(aVar));
        } else if (aVar != null) {
            aVar.mo86593a(null);
        }
    }

    /* renamed from: a */
    public final void mo87799a(C43203d dVar, long j, long j2) {
        if (j > 0) {
            this.f109222e = (int) j;
        }
        int a = C43193b.m94753a().mo87797a((int) j2, false);
        if (dVar != null && C43193b.m94756a(dVar.getMusicWavePointArray()) && a > 0) {
            float[] musicWavePointArray = dVar.getMusicWavePointArray();
            if (musicWavePointArray == null) {
                C52711k.m112234a();
            }
            if (musicWavePointArray.length > a) {
                VEMusicWaveBean resampleMusicWaveData = VEUtils.getResampleMusicWaveData(dVar.getMusicWavePointArray(), 0, a);
                C43193b.m94755a(resampleMusicWaveData);
                if (resampleMusicWaveData != null && C43193b.m94756a(resampleMusicWaveData.getWaveBean())) {
                    float[] waveBean = resampleMusicWaveData.getWaveBean();
                    C52711k.m112236a((Object) waveBean, "musicWaveBean.waveBean");
                    float[] copyOf = Arrays.copyOf(waveBean, waveBean.length);
                    C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
                    dVar.setMusicWavePointArray(copyOf);
                }
            }
        }
    }
}
