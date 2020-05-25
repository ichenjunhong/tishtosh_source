package p096cn.p097a.p098a.p099a;

import android.media.MediaFormat;
import android.media.MediaPlayer.TrackInfo;

/* renamed from: cn.a.a.a.c */
public interface C2225c {

    /* renamed from: cn.a.a.a.c$a */
    public interface C2226a {
        void onBufferingUpdate(C2225c cVar, int i);
    }

    /* renamed from: cn.a.a.a.c$b */
    public interface C2227b {
        void onCompletion(C2225c cVar);
    }

    /* renamed from: cn.a.a.a.c$c */
    public interface C2228c {
        boolean onError(C2225c cVar, int i, int i2);
    }

    /* renamed from: cn.a.a.a.c$d */
    public interface C2229d {
        boolean onInfo(C2225c cVar, int i, int i2);
    }

    /* renamed from: cn.a.a.a.c$e */
    public interface C2230e {
        void onPrepared(C2225c cVar);
    }

    /* renamed from: cn.a.a.a.c$f */
    public interface C2231f {
        void onSeekComplete(C2225c cVar);
    }

    /* renamed from: cn.a.a.a.c$g */
    public interface C2232g {
        void onVideoSizeChanged(C2225c cVar, int i, int i2);
    }

    /* renamed from: cn.a.a.a.c$h */
    public static class C2233h {

        /* renamed from: a */
        public C2224b f7076a;

        /* renamed from: b */
        public int f7077b;

        /* renamed from: c */
        public String f7078c;

        public C2233h(TrackInfo trackInfo) {
            this.f7077b = trackInfo.getTrackType();
            this.f7078c = trackInfo.getLanguage();
            C2224b bVar = null;
            if (this.f7077b == 2) {
                MediaFormat format = trackInfo.getFormat();
                if (format != null) {
                    int integer = format.getInteger("track-id");
                    int integer2 = format.getInteger("sample-rate");
                    int integer3 = format.getInteger("channel-count");
                    C2224b bVar2 = new C2224b();
                    bVar2.mo6615a("track-id", integer);
                    bVar2.mo6615a("sample-rate", integer2);
                    bVar2.mo6615a("channel-count", integer3);
                    bVar = bVar2;
                }
                this.f7076a = bVar;
            } else if (this.f7077b == 1) {
                MediaFormat format2 = trackInfo.getFormat();
                if (format2 != null) {
                    int integer4 = format2.getInteger("track-id");
                    int integer5 = format2.getInteger("width");
                    int integer6 = format2.getInteger("height");
                    int integer7 = format2.getInteger("bitrate");
                    C2224b bVar3 = new C2224b();
                    bVar3.mo6615a("track-id", integer4);
                    bVar3.mo6615a("width", integer5);
                    bVar3.mo6615a("height", integer6);
                    bVar3.mo6615a("bitrate", integer7);
                    bVar = bVar3;
                }
                this.f7076a = bVar;
            } else {
                if (this.f7077b == 4) {
                    MediaFormat format3 = trackInfo.getFormat();
                    if (format3 != null) {
                        int integer8 = format3.getInteger("track-id");
                        String string = format3.getString("language");
                        bVar = new C2224b();
                        bVar.mo6615a("track-id", integer8);
                        bVar.f7075a.put("language", string);
                    }
                    this.f7076a = bVar;
                }
            }
        }
    }
}
