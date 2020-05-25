package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;

public final class bhf implements bii {

    /* renamed from: a */
    private final Context f42372a;

    /* renamed from: b */
    private final Uri f42373b;

    /* renamed from: c */
    private final Map<String, String> f42374c;

    /* renamed from: d */
    private final FileDescriptor f42375d;

    /* renamed from: e */
    private final long f42376e;

    /* renamed from: f */
    private final long f42377f;

    /* renamed from: g */
    private MediaExtractor f42378g;

    /* renamed from: h */
    private bij[] f42379h;

    /* renamed from: i */
    private boolean f42380i;

    /* renamed from: j */
    private int f42381j;

    /* renamed from: k */
    private int[] f42382k;

    /* renamed from: l */
    private boolean[] f42383l;

    /* renamed from: m */
    private long f42384m;

    public bhf(Context context, Uri uri, Map<String, String> map, int i) {
        blg.m36001b(blp.f42854a >= 16);
        this.f42381j = 2;
        this.f42372a = (Context) blg.m35998a(context);
        this.f42373b = (Uri) blg.m35998a(uri);
        this.f42374c = null;
        this.f42375d = null;
        this.f42376e = 0;
        this.f42377f = 0;
    }

    /* renamed from: b */
    public final boolean mo30173b(long j) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo30170a(long j) throws IOException {
        if (!this.f42380i) {
            this.f42378g = new MediaExtractor();
            if (this.f42372a != null) {
                this.f42378g.setDataSource(this.f42372a, this.f42373b, null);
            } else {
                this.f42378g.setDataSource(null, 0, 0);
            }
            this.f42382k = new int[this.f42378g.getTrackCount()];
            this.f42383l = new boolean[this.f42382k.length];
            this.f42379h = new bij[this.f42382k.length];
            for (int i = 0; i < this.f42382k.length; i++) {
                MediaFormat trackFormat = this.f42378g.getTrackFormat(i);
                this.f42379h[i] = new bij(trackFormat.getString("mime"), trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") : -1);
            }
            this.f42380i = true;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo30166a() {
        blg.m36001b(this.f42380i);
        return this.f42382k.length;
    }

    /* renamed from: a */
    public final bij mo30168a(int i) {
        blg.m36001b(this.f42380i);
        return this.f42379h[i];
    }

    /* renamed from: a */
    public final void mo30169a(int i, long j) {
        blg.m36001b(this.f42380i);
        boolean z = false;
        blg.m36001b(this.f42382k[i] == 0);
        this.f42382k[i] = 1;
        this.f42378g.selectTrack(i);
        if (j != 0) {
            z = true;
        }
        m35662a(j, z);
    }

    /* renamed from: a */
    public final int mo30167a(int i, long j, bif bif, bih bih, boolean z) {
        blg.m36001b(this.f42380i);
        blg.m36001b(this.f42382k[i] != 0);
        if (this.f42383l[i]) {
            this.f42383l[i] = false;
            return -5;
        } else if (z) {
            return -2;
        } else {
            if (this.f42382k[i] != 2) {
                bif.f42484a = new bie(this.f42378g.getTrackFormat(i));
                bis bis = null;
                if (blp.f42854a >= 18) {
                    Map psshInfo = this.f42378g.getPsshInfo();
                    if (psshInfo != null && !psshInfo.isEmpty()) {
                        bis = new bis("video/mp4");
                        bis.f42538a.putAll(psshInfo);
                    }
                }
                bif.f42485b = bis;
                this.f42382k[i] = 2;
                return -4;
            }
            int sampleTrackIndex = this.f42378g.getSampleTrackIndex();
            if (sampleTrackIndex == i) {
                if (bih.f42487b != null) {
                    int position = bih.f42487b.position();
                    bih.f42488c = this.f42378g.readSampleData(bih.f42487b, position);
                    bih.f42487b.position(position + bih.f42488c);
                } else {
                    bih.f42488c = 0;
                }
                bih.f42490e = this.f42378g.getSampleTime();
                bih.f42489d = this.f42378g.getSampleFlags() & 3;
                if (bih.mo30223a()) {
                    bgw bgw = bih.f42486a;
                    this.f42378g.getSampleCryptoInfo(bgw.f42339g);
                    bgw.f42338f = bgw.f42339g.numSubSamples;
                    bgw.f42336d = bgw.f42339g.numBytesOfClearData;
                    bgw.f42337e = bgw.f42339g.numBytesOfEncryptedData;
                    bgw.f42334b = bgw.f42339g.key;
                    bgw.f42333a = bgw.f42339g.iv;
                    bgw.f42335c = bgw.f42339g.mode;
                }
                this.f42384m = -1;
                this.f42378g.advance();
                return -3;
            } else if (sampleTrackIndex < 0) {
                return -1;
            } else {
                return -2;
            }
        }
    }

    /* renamed from: b */
    public final void mo30172b(int i) {
        blg.m36001b(this.f42380i);
        blg.m36001b(this.f42382k[i] != 0);
        this.f42378g.unselectTrack(i);
        this.f42383l[i] = false;
        this.f42382k[i] = 0;
    }

    /* renamed from: c */
    public final void mo30175c(long j) {
        blg.m36001b(this.f42380i);
        m35662a(j, false);
    }

    /* renamed from: b */
    public final long mo30171b() {
        blg.m36001b(this.f42380i);
        long cachedDuration = this.f42378g.getCachedDuration();
        if (cachedDuration == -1) {
            return -1;
        }
        long sampleTime = this.f42378g.getSampleTime();
        if (sampleTime == -1) {
            return -3;
        }
        return sampleTime + cachedDuration;
    }

    /* renamed from: c */
    public final void mo30174c() {
        blg.m36001b(this.f42381j > 0);
        int i = this.f42381j - 1;
        this.f42381j = i;
        if (i == 0 && this.f42378g != null) {
            this.f42378g.release();
            this.f42378g = null;
        }
    }

    /* renamed from: a */
    private final void m35662a(long j, boolean z) {
        if (z || this.f42384m != j) {
            this.f42384m = j;
            this.f42378g.seekTo(j, 0);
            for (int i = 0; i < this.f42382k.length; i++) {
                if (this.f42382k[i] != 0) {
                    this.f42383l[i] = true;
                }
            }
        }
    }
}
