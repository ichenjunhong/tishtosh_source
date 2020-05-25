package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio;

import android.content.Context;
import android.media.MediaRecorder;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.widget.AudioRecordBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.widget.AudioRecordStateView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.c */
public final class C33486c implements C33511l {

    /* renamed from: a */
    public C33504g f86771a;

    /* renamed from: b */
    public C33495d f86772b;

    /* renamed from: c */
    public AudioRecordBar f86773c;

    /* renamed from: d */
    public AudioRecordStateView f86774d;

    /* renamed from: e */
    public CopyOnWriteArrayList<C33509j> f86775e;

    /* renamed from: f */
    public C33510k f86776f = new C33510k() {
        /* renamed from: c */
        public final void mo70915c() {
        }

        /* renamed from: b */
        public final void mo70914b() {
            if (C33486c.this.f86771a != null) {
                C33486c.this.f86771a.mo70942a(C33486c.this.f86773c.f86834d);
            }
        }

        /* renamed from: a */
        public final void mo70912a() {
            if (C33486c.this.f86771a != null) {
                C33486c.this.f86772b.mo70923a(false);
                C33498e eVar = C33486c.this.f86772b.f86789a;
                if (eVar == null) {
                    C52711k.m112237a("playManager");
                }
                eVar.mo70931c();
                C33486c cVar = C33486c.this;
                if (cVar.f86775e != null) {
                    Iterator it = cVar.f86775e.iterator();
                    while (it.hasNext()) {
                        ((C33509j) it.next()).mo70947a();
                    }
                }
                C33504g gVar = C33486c.this.f86771a;
                if (!gVar.f86820d) {
                    gVar.f86820d = true;
                    if (gVar.f86821e != null) {
                        gVar.f86821e.mo70912a();
                    }
                    if (gVar.f86822f == null || gVar.f86822f.isShutdown() || gVar.f86822f.isTerminated()) {
                        gVar.f86822f = C33507h.m76781a();
                    }
                    gVar.f86822f.submit(new Runnable() {
                        public final void run() {
                            try {
                                if (C33504g.this.f86817a != null) {
                                    C33504g.this.f86817a.reset();
                                }
                                C33504g gVar = C33504g.this;
                                try {
                                    if (gVar.f86817a == null) {
                                        gVar.f86817a = new MediaRecorder();
                                    }
                                    gVar.f86817a.setAudioSource(1);
                                    gVar.f86817a.setOutputFormat(2);
                                    gVar.f86817a.setAudioSamplingRate(44100);
                                    gVar.f86817a.setAudioEncoder(3);
                                    gVar.f86817a.setAudioEncodingBitRate(96000);
                                    gVar.f86817a.setOnErrorListener(gVar);
                                    File a = C33485b.m76737a().f86770a.mo70902a();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append(System.currentTimeMillis());
                                    sb.append(".m4a");
                                    gVar.f86824h = new File(a, sb.toString());
                                    if (!gVar.f86824h.getParentFile().exists()) {
                                        gVar.f86824h.getParentFile().mkdirs();
                                    }
                                    gVar.f86824h.createNewFile();
                                    gVar.f86817a.setOutputFile(gVar.f86824h.getPath());
                                    gVar.f86817a.prepare();
                                } catch (Exception unused) {
                                    gVar.mo70943b(false);
                                }
                                C33504g.this.f86823g = SystemClock.uptimeMillis();
                                C33504g.this.f86817a.start();
                                C33504g.this.f86818b.start();
                            } catch (Exception unused2) {
                            }
                        }
                    });
                }
            }
        }

        /* renamed from: a */
        public final void mo70913a(int i) {
            C33486c cVar = C33486c.this;
            if (cVar.f86775e != null) {
                Iterator it = cVar.f86775e.iterator();
                while (it.hasNext()) {
                    ((C33509j) it.next()).mo70952c();
                }
            }
        }
    };

    /* renamed from: g */
    private CountDownTimer f86777g;

    /* renamed from: h */
    private C33510k f86778h = new C33510k() {
        /* renamed from: a */
        public final void mo70912a() {
        }

        /* renamed from: b */
        public final void mo70914b() {
            if (!(C33486c.this.f86775e == null || C33486c.this.f86771a == null)) {
                C18842a.m45934b(new Runnable() {
                    public final void run() {
                        C33486c cVar = C33486c.this;
                        File file = C33486c.this.f86771a.f86824h;
                        long j = C33486c.this.f86771a.f86825i;
                        C33498e eVar = cVar.f86772b.f86789a;
                        if (eVar == null) {
                            C52711k.m112237a("playManager");
                        }
                        eVar.mo70932d();
                        if (cVar.f86775e != null) {
                            Iterator it = cVar.f86775e.iterator();
                            while (it.hasNext()) {
                                ((C33509j) it.next()).mo70949a(file, j);
                            }
                        }
                    }
                });
            }
            if (C33486c.this.f86774d != null && C33486c.this.f86771a.f86825i <= 60000) {
                C18842a.m45934b(new Runnable() {
                    public final void run() {
                        C33486c.this.f86774d.setVisibility(4);
                    }
                });
            }
        }

        /* renamed from: c */
        public final void mo70915c() {
            if (C33486c.this.f86774d != null && C33486c.this.f86771a.f86825i <= 60000) {
                C33486c.this.f86774d.post(new Runnable() {
                    public final void run() {
                        C33486c.this.f86774d.setVisibility(4);
                    }
                });
            }
            C18842a.m45934b(new Runnable() {
                public final void run() {
                    C33486c cVar = C33486c.this;
                    if (cVar.f86775e != null) {
                        Iterator it = cVar.f86775e.iterator();
                        while (it.hasNext()) {
                            ((C33509j) it.next()).mo70952c();
                        }
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo70913a(final int i) {
            if (i == -1) {
                C18842a.m45934b(new Runnable() {
                    public final void run() {
                        AudioRecordStateView audioRecordStateView = C33486c.this.f86774d;
                        if (audioRecordStateView.f86854e != -1) {
                            audioRecordStateView.f86850a.setText(audioRecordStateView.f86854e);
                        } else {
                            audioRecordStateView.f86850a.setText("");
                        }
                        audioRecordStateView.f86851b.setVisibility(4);
                        if (audioRecordStateView.f86856g != -1) {
                            audioRecordStateView.f86852c.setImageResource(audioRecordStateView.f86856g);
                            audioRecordStateView.f86852c.setVisibility(0);
                        } else {
                            audioRecordStateView.f86852c.setVisibility(4);
                        }
                        audioRecordStateView.mo70959a();
                        audioRecordStateView.mo70962b();
                        C33486c.this.f86776f.mo70913a(i);
                    }
                });
            }
        }
    };

    public C33486c() {
        C334871 r0 = new CountDownTimer(60000, 50) {
            public final void onFinish() {
                AudioRecordStateView audioRecordStateView = C33486c.this.f86774d;
                if (audioRecordStateView.f86855f != -1) {
                    audioRecordStateView.f86850a.setText(audioRecordStateView.f86855f);
                } else {
                    audioRecordStateView.f86850a.setText("");
                }
                audioRecordStateView.f86851b.setVisibility(4);
                if (audioRecordStateView.f86856g != -1) {
                    audioRecordStateView.f86852c.setImageResource(audioRecordStateView.f86856g);
                    audioRecordStateView.f86852c.setVisibility(0);
                } else {
                    audioRecordStateView.f86852c.setVisibility(4);
                }
                audioRecordStateView.mo70959a();
                audioRecordStateView.mo70962b();
                AudioRecordBar audioRecordBar = C33486c.this.f86773c;
                audioRecordBar.f86834d = false;
                audioRecordBar.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 1, audioRecordBar.f86832b, audioRecordBar.f86833c, 0));
            }

            public final void onTick(long j) {
                if (j <= 10000) {
                    if (C33486c.this.f86773c.f86834d) {
                        C33486c.this.f86774d.setSecondsRemain(j);
                    } else {
                        C33486c.this.f86774d.mo70961a(j);
                    }
                } else if (C33486c.this.f86773c.f86834d) {
                    C33486c.this.f86774d.setVolumeLevel(C33486c.this.f86771a.mo70941a(5));
                } else {
                    C33486c.this.f86774d.mo70960a(C33486c.this.f86771a.mo70941a(5));
                }
            }
        };
        this.f86777g = r0;
    }

    /* renamed from: a */
    public final void mo70903a() {
        if (this.f86771a != null) {
            this.f86771a.mo70942a(true);
        }
        if (this.f86772b != null) {
            this.f86772b.mo70923a(true);
        }
    }

    /* renamed from: c */
    public final void mo70909c() {
        if (this.f86775e != null) {
            Iterator it = this.f86775e.iterator();
            while (it.hasNext()) {
                ((C33509j) it.next()).mo70950b();
            }
        }
    }

    /* renamed from: b */
    public final void mo70907b() {
        if (this.f86771a != null) {
            this.f86771a.mo70943b(true);
        }
        if (this.f86772b != null) {
            C33495d dVar = this.f86772b;
            C33498e eVar = dVar.f86789a;
            if (eVar == null) {
                C52711k.m112237a("playManager");
            }
            eVar.mo70930b(true);
            List<C11207p> list = dVar.f86790b;
            if (list == null) {
                C52711k.m112237a("messageQueue");
            }
            list.clear();
        }
        if (this.f86775e != null) {
            this.f86775e.clear();
        }
    }

    /* renamed from: a */
    public final void mo70906a(List<C11207p> list) {
        this.f86772b.mo70922a(list);
    }

    /* renamed from: b */
    public final void mo70908b(C11207p pVar) {
        if (this.f86775e != null) {
            Iterator it = this.f86775e.iterator();
            while (it.hasNext()) {
                ((C33509j) it.next()).mo70948a(pVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo70904a(C11207p pVar) {
        if (this.f86775e != null) {
            Iterator it = this.f86775e.iterator();
            while (it.hasNext()) {
                ((C33509j) it.next()).mo70951b(pVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo70905a(AudioRecordBar audioRecordBar, AudioRecordStateView audioRecordStateView) {
        this.f86771a = new C33504g();
        this.f86771a.f86821e = this.f86778h;
        this.f86771a.f86818b = this.f86777g;
        this.f86772b = new C33495d();
        C33495d dVar = this.f86772b;
        Context context = audioRecordBar.getContext();
        C52711k.m112240b(context, "context");
        C52711k.m112240b(this, "callback");
        dVar.f86789a = new C33498e(context);
        C33498e eVar = dVar.f86789a;
        if (eVar == null) {
            C52711k.m112237a("playManager");
        }
        eVar.f86799d = dVar;
        dVar.f86790b = new ArrayList();
        dVar.f86793e = null;
        dVar.f86791c = this;
        this.f86773c = audioRecordBar;
        this.f86774d = audioRecordStateView;
        audioRecordBar.setListener(this.f86776f);
        audioRecordBar.setStateView(audioRecordStateView);
        this.f86775e = new CopyOnWriteArrayList<>();
    }
}
