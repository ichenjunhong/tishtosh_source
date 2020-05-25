package com.p683ss.android.ugc.aweme.shortvideo.countdown;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.media.SoundPool.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import com.ss.android.ugc.trill.R;
import java.util.LinkedList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.c */
public final class C42506c implements C42535i {

    /* renamed from: a */
    public final SoundPool f107496a;

    /* renamed from: b */
    public Integer f107497b;

    /* renamed from: c */
    public final Context f107498c;

    /* renamed from: d */
    private final int f107499d;

    /* renamed from: e */
    private final int f107500e;

    /* renamed from: f */
    private final int f107501f;

    /* renamed from: g */
    private final Handler f107502g = new Handler();

    /* renamed from: h */
    private LinkedList<Integer> f107503h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.countdown.c$a */
    static final class C42507a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42506c f107504a;

        C42507a(C42506c cVar) {
            this.f107504a = cVar;
        }

        public final void run() {
            Integer num = this.f107504a.f107497b;
            if (num != null) {
                this.f107504a.f107496a.stop(num.intValue());
                this.f107504a.mo86716a();
            }
        }
    }

    /* renamed from: b */
    public final void mo86718b() {
        this.f107502g.removeCallbacksAndMessages(null);
        this.f107496a.release();
        this.f107497b = null;
        this.f107503h.clear();
    }

    /* renamed from: a */
    public final void mo86716a() {
        this.f107497b = (Integer) this.f107503h.poll();
        Integer num = this.f107497b;
        if (num != null) {
            this.f107496a.play(num.intValue(), 1.0f, 1.0f, 1, 0, 1.0f);
            this.f107502g.postDelayed(new C42507a(this), 1000);
        }
    }

    public C42506c(Context context) {
        SoundPool soundPool;
        C52711k.m112240b(context, "context");
        this.f107498c = context;
        if (VERSION.SDK_INT >= 21) {
            soundPool = new Builder().setMaxStreams(3).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
            C52711k.m112236a((Object) soundPool, "SoundPool.Builder().setM…(audioAttributes).build()");
        } else {
            soundPool = new SoundPool(3, 3, 0);
        }
        this.f107496a = soundPool;
        this.f107499d = this.f107496a.load(this.f107498c, R.raw.shot_count_down_a, 1);
        this.f107500e = this.f107496a.load(this.f107498c, R.raw.shot_count_down_b, 1);
        this.f107501f = this.f107496a.load(this.f107498c, R.raw.shot_count_down_c, 1);
        this.f107503h = new LinkedList<>();
    }

    /* renamed from: a */
    public final void mo86717a(int i) {
        if (i == 10) {
            for (int i2 = 0; i2 < 7; i2++) {
                this.f107503h.offer(Integer.valueOf(this.f107499d));
            }
        }
        this.f107503h.offer(Integer.valueOf(this.f107500e));
        this.f107503h.offer(Integer.valueOf(this.f107500e));
        this.f107503h.offer(Integer.valueOf(this.f107501f));
        mo86716a();
    }
}
