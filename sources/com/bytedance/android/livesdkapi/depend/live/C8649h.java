package com.bytedance.android.livesdkapi.depend.live;

import android.content.Context;
import android.view.TextureView;

/* renamed from: com.bytedance.android.livesdkapi.depend.live.h */
public interface C8649h {

    /* renamed from: com.bytedance.android.livesdkapi.depend.live.h$a */
    public static class C8651a {
        /* renamed from: a */
        public static String m17097a(Context context) {
            if (context == null) {
                return "@";
            }
            return context.toString();
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.live.h$b */
    public enum C8652b {
        UNKNOWN,
        PLAYER_PREPARED,
        COMPLETE_PLAY,
        MEDIA_ERROR,
        DISPLAYED_PLAY,
        STOP_WHEN_PLAYING_OTHER,
        STOP_WHEN_JOIN_INTERACT,
        BUFFERING_START,
        BUFFERING_END,
        INTERACT_SEI,
        VIDEO_SIZE_CHANGED,
        PLAYER_DETACHED;

        public static C8652b valueOf(int i) {
            if (i < 0 || i >= values().length) {
                return UNKNOWN;
            }
            return values()[i];
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.live.h$c */
    public interface C8653c {
        /* renamed from: a */
        void mo10922a(C8652b bVar, Object obj);
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.live.h$d */
    public static class C8654d {

        /* renamed from: a */
        public final boolean f23680a;

        /* renamed from: b */
        public final boolean f23681b;

        /* renamed from: c */
        public final int f23682c;

        /* renamed from: com.bytedance.android.livesdkapi.depend.live.h$d$a */
        public static class C8655a {

            /* renamed from: a */
            public boolean f23683a;

            /* renamed from: b */
            public boolean f23684b;

            /* renamed from: c */
            public int f23685c;

            /* renamed from: a */
            public final C8654d mo15124a() {
                return new C8654d(this);
            }

            /* renamed from: a */
            public final C8655a mo15122a(int i) {
                this.f23685c = i;
                return this;
            }

            /* renamed from: b */
            public final C8655a mo15125b(boolean z) {
                this.f23684b = z;
                return this;
            }

            /* renamed from: a */
            public final C8655a mo15123a(boolean z) {
                this.f23683a = z;
                return this;
            }
        }

        /* renamed from: a */
        public static C8655a m17099a() {
            return new C8655a();
        }

        private C8654d(C8655a aVar) {
            this.f23680a = aVar.f23683a;
            this.f23681b = aVar.f23684b;
            this.f23682c = aVar.f23685c;
        }
    }

    /* renamed from: com.bytedance.android.livesdkapi.depend.live.h$e */
    public interface C8656e extends C8653c {
        /* renamed from: a */
        void mo10921a();

        /* renamed from: b */
        void mo10923b();
    }

    /* renamed from: a */
    void mo14268a(String str, TextureView textureView, int i, C8654d dVar, C8653c cVar, String str2) throws Exception;

    /* renamed from: a */
    void mo14269a(String str, String str2, TextureView textureView, int i, C8654d dVar, C8653c cVar) throws Exception;

    /* renamed from: a */
    void mo14270a(boolean z, Context context);

    /* renamed from: c */
    void mo14272c(Context context);

    /* renamed from: d */
    void mo14273d(Context context);

    /* renamed from: d */
    void mo14274d(boolean z);

    /* renamed from: e */
    void mo14275e(Context context);

    /* renamed from: e */
    void mo14276e(String str);

    /* renamed from: f */
    void mo14278f(Context context);

    /* renamed from: g */
    void mo14279g();

    /* renamed from: h */
    int mo14280h();

    /* renamed from: i */
    boolean mo14281i();

    /* renamed from: j */
    boolean mo14282j();

    /* renamed from: k */
    String mo14283k();

    /* renamed from: l */
    String mo14284l();
}
