package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnInfoListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import com.twitter.sdk.android.tweetui.internal.VideoControlView.C52280a;

public class VideoView extends SurfaceView implements C52280a {

    /* renamed from: A */
    private GestureDetector f130194A;

    /* renamed from: a */
    public String f130195a;

    /* renamed from: b */
    public Uri f130196b;

    /* renamed from: c */
    public int f130197c;

    /* renamed from: d */
    public int f130198d;

    /* renamed from: e */
    public SurfaceHolder f130199e;

    /* renamed from: f */
    public MediaPlayer f130200f;

    /* renamed from: g */
    public int f130201g;

    /* renamed from: h */
    public int f130202h;

    /* renamed from: i */
    public int f130203i;

    /* renamed from: j */
    public int f130204j;

    /* renamed from: k */
    public VideoControlView f130205k;

    /* renamed from: l */
    public OnCompletionListener f130206l;

    /* renamed from: m */
    public OnPreparedListener f130207m;

    /* renamed from: n */
    public int f130208n;

    /* renamed from: o */
    public OnErrorListener f130209o;

    /* renamed from: p */
    public OnInfoListener f130210p;

    /* renamed from: q */
    public int f130211q;

    /* renamed from: r */
    public boolean f130212r;

    /* renamed from: s */
    OnVideoSizeChangedListener f130213s;

    /* renamed from: t */
    OnPreparedListener f130214t;

    /* renamed from: u */
    Callback f130215u;

    /* renamed from: v */
    private int f130216v;

    /* renamed from: w */
    private OnCompletionListener f130217w;

    /* renamed from: x */
    private OnInfoListener f130218x;

    /* renamed from: y */
    private OnErrorListener f130219y;

    /* renamed from: z */
    private OnBufferingUpdateListener f130220z;

    public int getBufferPercentage() {
        if (this.f130200f != null) {
            return this.f130208n;
        }
        return 0;
    }

    public int getCurrentPosition() {
        if (mo109081f()) {
            return this.f130200f.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (mo109081f()) {
            return this.f130200f.getDuration();
        }
        return -1;
    }

    /* renamed from: h */
    private void m111718h() {
        if (this.f130200f != null && this.f130205k != null) {
            this.f130205k.setMediaPlayer(this);
            this.f130205k.setEnabled(mo109081f());
        }
    }

    /* renamed from: a */
    public final void mo109071a() {
        if (mo109081f()) {
            this.f130200f.start();
            this.f130197c = 3;
        }
        this.f130198d = 3;
    }

    /* renamed from: b */
    public final void mo109073b() {
        if (mo109081f() && this.f130200f.isPlaying()) {
            this.f130200f.pause();
            this.f130197c = 4;
        }
        this.f130198d = 4;
    }

    /* renamed from: c */
    public final boolean mo109074c() {
        if (!mo109081f() || !this.f130200f.isPlaying()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final void mo109080e() {
        if (this.f130205k.mo109062c()) {
            this.f130205k.mo109059a();
        } else {
            this.f130205k.mo109061b();
        }
    }

    /* renamed from: f */
    public final boolean mo109081f() {
        if (this.f130200f == null || this.f130197c == -1 || this.f130197c == 0 || this.f130197c == 1) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private void m111717g() {
        this.f130201g = 0;
        this.f130202h = 0;
        getHolder().addCallback(this.f130215u);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setClickable(true);
        requestFocus();
        this.f130197c = 0;
        this.f130198d = 0;
    }

    /* renamed from: d */
    public final void mo109079d() {
        if (this.f130196b != null && this.f130199e != null) {
            mo109078a(false);
            try {
                this.f130200f = new MediaPlayer();
                if (this.f130216v != 0) {
                    this.f130200f.setAudioSessionId(this.f130216v);
                } else {
                    this.f130216v = this.f130200f.getAudioSessionId();
                }
                this.f130200f.setOnPreparedListener(this.f130214t);
                this.f130200f.setOnVideoSizeChangedListener(this.f130213s);
                this.f130200f.setOnCompletionListener(this.f130217w);
                this.f130200f.setOnErrorListener(this.f130219y);
                this.f130200f.setOnInfoListener(this.f130218x);
                this.f130200f.setOnBufferingUpdateListener(this.f130220z);
                this.f130208n = 0;
                this.f130200f.setLooping(this.f130212r);
                this.f130200f.setDataSource(getContext(), this.f130196b);
                this.f130200f.setDisplay(this.f130199e);
                this.f130200f.setAudioStreamType(3);
                this.f130200f.setScreenOnWhilePlaying(true);
                this.f130200f.prepareAsync();
                this.f130197c = 1;
                m111718h();
            } catch (Exception unused) {
                this.f130197c = -1;
                this.f130198d = -1;
                this.f130219y.onError(this.f130200f, 1, 0);
            }
        }
    }

    public void setOnCompletionListener(OnCompletionListener onCompletionListener) {
        this.f130206l = onCompletionListener;
    }

    public void setOnErrorListener(OnErrorListener onErrorListener) {
        this.f130209o = onErrorListener;
    }

    public void setOnInfoListener(OnInfoListener onInfoListener) {
        this.f130210p = onInfoListener;
    }

    public void setOnPreparedListener(OnPreparedListener onPreparedListener) {
        this.f130207m = onPreparedListener;
    }

    public void setMediaController(VideoControlView videoControlView) {
        if (this.f130205k != null) {
            this.f130205k.mo109059a();
        }
        this.f130205k = videoControlView;
        m111718h();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f130194A.onTouchEvent(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo109072a(int i) {
        if (mo109081f()) {
            this.f130200f.seekTo(i);
            this.f130211q = 0;
            return;
        }
        this.f130211q = i;
    }

    public VideoView(Context context) {
        super(context);
        this.f130195a = "VideoView";
        this.f130213s = new OnVideoSizeChangedListener() {
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                VideoView.this.f130201g = mediaPlayer.getVideoWidth();
                VideoView.this.f130202h = mediaPlayer.getVideoHeight();
                if (VideoView.this.f130201g != 0 && VideoView.this.f130202h != 0) {
                    VideoView.this.getHolder().setFixedSize(VideoView.this.f130201g, VideoView.this.f130202h);
                    VideoView.this.requestLayout();
                }
            }
        };
        this.f130214t = new OnPreparedListener() {
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoView.this.f130197c = 2;
                if (VideoView.this.f130207m != null) {
                    VideoView.this.f130207m.onPrepared(VideoView.this.f130200f);
                }
                if (VideoView.this.f130205k != null) {
                    VideoView.this.f130205k.setEnabled(true);
                }
                VideoView.this.f130201g = mediaPlayer.getVideoWidth();
                VideoView.this.f130202h = mediaPlayer.getVideoHeight();
                int i = VideoView.this.f130211q;
                if (i != 0) {
                    VideoView.this.mo109072a(i);
                }
                if (VideoView.this.f130201g != 0 && VideoView.this.f130202h != 0) {
                    VideoView.this.getHolder().setFixedSize(VideoView.this.f130201g, VideoView.this.f130202h);
                    if (VideoView.this.f130203i == VideoView.this.f130201g && VideoView.this.f130204j == VideoView.this.f130202h) {
                        if (VideoView.this.f130198d == 3) {
                            VideoView.this.mo109071a();
                            if (VideoView.this.f130205k != null) {
                                VideoView.this.f130205k.mo109061b();
                            }
                        } else if (!VideoView.this.mo109074c() && ((i != 0 || VideoView.this.getCurrentPosition() > 0) && VideoView.this.f130205k != null)) {
                            VideoView.this.f130205k.mo109061b();
                        }
                    }
                } else if (VideoView.this.f130198d == 3) {
                    VideoView.this.mo109071a();
                }
            }
        };
        this.f130217w = new OnCompletionListener() {
            public final void onCompletion(MediaPlayer mediaPlayer) {
                VideoView.this.f130197c = 5;
                VideoView.this.f130198d = 5;
                if (VideoView.this.f130206l != null) {
                    VideoView.this.f130206l.onCompletion(VideoView.this.f130200f);
                }
            }
        };
        this.f130218x = new OnInfoListener() {
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                if (VideoView.this.f130210p != null) {
                    VideoView.this.f130210p.onInfo(mediaPlayer, i, i2);
                }
                return true;
            }
        };
        this.f130219y = new OnErrorListener() {
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                VideoView.this.f130197c = -1;
                VideoView.this.f130198d = -1;
                if (VideoView.this.f130205k != null) {
                    VideoView.this.f130205k.mo109059a();
                }
                return (VideoView.this.f130209o == null || VideoView.this.f130209o.onError(VideoView.this.f130200f, i, i2)) ? true : true;
            }
        };
        this.f130220z = new OnBufferingUpdateListener() {
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                VideoView.this.f130208n = i;
            }
        };
        this.f130194A = new GestureDetector(getContext(), new SimpleOnGestureListener() {
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (VideoView.this.mo109081f() && VideoView.this.f130205k != null) {
                    VideoView.this.mo109080e();
                }
                return false;
            }
        });
        this.f130215u = new Callback() {
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                VideoView.this.f130199e = surfaceHolder;
                VideoView.this.mo109079d();
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                VideoView.this.f130199e = null;
                if (VideoView.this.f130205k != null) {
                    VideoView.this.f130205k.mo109059a();
                }
                VideoView.this.mo109078a(true);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                boolean z;
                VideoView.this.f130203i = i2;
                VideoView.this.f130204j = i3;
                boolean z2 = false;
                if (VideoView.this.f130198d == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (VideoView.this.f130201g == i2 && VideoView.this.f130202h == i3) {
                    z2 = true;
                }
                if (VideoView.this.f130200f != null && z && z2) {
                    if (VideoView.this.f130211q != 0) {
                        VideoView.this.mo109072a(VideoView.this.f130211q);
                    }
                    VideoView.this.mo109071a();
                    if (VideoView.this.f130205k != null) {
                        VideoView.this.f130205k.mo109061b();
                    }
                }
            }
        };
        m111717g();
    }

    /* renamed from: a */
    public final void mo109078a(boolean z) {
        if (this.f130200f != null) {
            this.f130200f.reset();
            this.f130200f.release();
            this.f130200f = null;
            this.f130197c = 0;
            if (z) {
                this.f130198d = 0;
            }
        }
    }

    public VideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 4 || i == 24 || i == 25 || i == 82 || i == 5 || i == 6) {
            z = false;
        } else {
            z = true;
        }
        if (mo109081f() && z && this.f130205k != null) {
            if (i == 79 || i == 85) {
                if (this.f130200f.isPlaying()) {
                    mo109073b();
                    this.f130205k.mo109061b();
                } else {
                    mo109071a();
                    this.f130205k.mo109059a();
                }
                return true;
            } else if (i == 126) {
                if (!this.f130200f.isPlaying()) {
                    mo109071a();
                    this.f130205k.mo109059a();
                }
                return true;
            } else if (i == 86 || i == 127) {
                if (this.f130200f.isPlaying()) {
                    mo109073b();
                    this.f130205k.mo109061b();
                }
                return true;
            } else {
                mo109080e();
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006e, code lost:
        if (r1 > r6) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f130201g
            int r0 = getDefaultSize(r0, r6)
            int r1 = r5.f130202h
            int r1 = getDefaultSize(r1, r7)
            int r2 = r5.f130201g
            if (r2 <= 0) goto L_0x0092
            int r2 = r5.f130202h
            if (r2 <= 0) goto L_0x0092
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x0051
            if (r1 != r2) goto L_0x0051
            int r0 = r5.f130201g
            int r0 = r0 * r7
            int r1 = r5.f130202h
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x003e
            int r6 = r5.f130201g
            int r6 = r6 * r7
            int r0 = r5.f130202h
            int r0 = r6 / r0
            r6 = r0
            goto L_0x0094
        L_0x003e:
            int r0 = r5.f130201g
            int r0 = r0 * r7
            int r1 = r5.f130202h
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0094
            int r7 = r5.f130202h
            int r7 = r7 * r6
            int r0 = r5.f130201g
            int r1 = r7 / r0
            goto L_0x0093
        L_0x0051:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x0063
            int r0 = r5.f130202h
            int r0 = r0 * r6
            int r2 = r5.f130201g
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0061
            if (r0 <= r7) goto L_0x0061
            goto L_0x0094
        L_0x0061:
            r7 = r0
            goto L_0x0094
        L_0x0063:
            if (r1 != r2) goto L_0x0073
            int r1 = r5.f130201g
            int r1 = r1 * r7
            int r2 = r5.f130202h
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0071
            if (r1 <= r6) goto L_0x0071
            goto L_0x0094
        L_0x0071:
            r6 = r1
            goto L_0x0094
        L_0x0073:
            int r2 = r5.f130201g
            int r4 = r5.f130202h
            if (r1 != r3) goto L_0x0083
            if (r4 <= r7) goto L_0x0083
            int r1 = r5.f130201g
            int r1 = r1 * r7
            int r2 = r5.f130202h
            int r1 = r1 / r2
            goto L_0x0085
        L_0x0083:
            r1 = r2
            r7 = r4
        L_0x0085:
            if (r0 != r3) goto L_0x0071
            if (r1 <= r6) goto L_0x0071
            int r7 = r5.f130202h
            int r7 = r7 * r6
            int r0 = r5.f130201g
            int r1 = r7 / r0
            goto L_0x0093
        L_0x0092:
            r6 = r0
        L_0x0093:
            r7 = r1
        L_0x0094:
            r5.setMeasuredDimension(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.twitter.sdk.android.tweetui.internal.VideoView.onMeasure(int, int):void");
    }

    public VideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f130195a = "VideoView";
        this.f130213s = new OnVideoSizeChangedListener() {
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                VideoView.this.f130201g = mediaPlayer.getVideoWidth();
                VideoView.this.f130202h = mediaPlayer.getVideoHeight();
                if (VideoView.this.f130201g != 0 && VideoView.this.f130202h != 0) {
                    VideoView.this.getHolder().setFixedSize(VideoView.this.f130201g, VideoView.this.f130202h);
                    VideoView.this.requestLayout();
                }
            }
        };
        this.f130214t = new OnPreparedListener() {
            public final void onPrepared(MediaPlayer mediaPlayer) {
                VideoView.this.f130197c = 2;
                if (VideoView.this.f130207m != null) {
                    VideoView.this.f130207m.onPrepared(VideoView.this.f130200f);
                }
                if (VideoView.this.f130205k != null) {
                    VideoView.this.f130205k.setEnabled(true);
                }
                VideoView.this.f130201g = mediaPlayer.getVideoWidth();
                VideoView.this.f130202h = mediaPlayer.getVideoHeight();
                int i = VideoView.this.f130211q;
                if (i != 0) {
                    VideoView.this.mo109072a(i);
                }
                if (VideoView.this.f130201g != 0 && VideoView.this.f130202h != 0) {
                    VideoView.this.getHolder().setFixedSize(VideoView.this.f130201g, VideoView.this.f130202h);
                    if (VideoView.this.f130203i == VideoView.this.f130201g && VideoView.this.f130204j == VideoView.this.f130202h) {
                        if (VideoView.this.f130198d == 3) {
                            VideoView.this.mo109071a();
                            if (VideoView.this.f130205k != null) {
                                VideoView.this.f130205k.mo109061b();
                            }
                        } else if (!VideoView.this.mo109074c() && ((i != 0 || VideoView.this.getCurrentPosition() > 0) && VideoView.this.f130205k != null)) {
                            VideoView.this.f130205k.mo109061b();
                        }
                    }
                } else if (VideoView.this.f130198d == 3) {
                    VideoView.this.mo109071a();
                }
            }
        };
        this.f130217w = new OnCompletionListener() {
            public final void onCompletion(MediaPlayer mediaPlayer) {
                VideoView.this.f130197c = 5;
                VideoView.this.f130198d = 5;
                if (VideoView.this.f130206l != null) {
                    VideoView.this.f130206l.onCompletion(VideoView.this.f130200f);
                }
            }
        };
        this.f130218x = new OnInfoListener() {
            public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                if (VideoView.this.f130210p != null) {
                    VideoView.this.f130210p.onInfo(mediaPlayer, i, i2);
                }
                return true;
            }
        };
        this.f130219y = new OnErrorListener() {
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                VideoView.this.f130197c = -1;
                VideoView.this.f130198d = -1;
                if (VideoView.this.f130205k != null) {
                    VideoView.this.f130205k.mo109059a();
                }
                return (VideoView.this.f130209o == null || VideoView.this.f130209o.onError(VideoView.this.f130200f, i, i2)) ? true : true;
            }
        };
        this.f130220z = new OnBufferingUpdateListener() {
            public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
                VideoView.this.f130208n = i;
            }
        };
        this.f130194A = new GestureDetector(getContext(), new SimpleOnGestureListener() {
            public final boolean onSingleTapUp(MotionEvent motionEvent) {
                if (VideoView.this.mo109081f() && VideoView.this.f130205k != null) {
                    VideoView.this.mo109080e();
                }
                return false;
            }
        });
        this.f130215u = new Callback() {
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                VideoView.this.f130199e = surfaceHolder;
                VideoView.this.mo109079d();
            }

            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                VideoView.this.f130199e = null;
                if (VideoView.this.f130205k != null) {
                    VideoView.this.f130205k.mo109059a();
                }
                VideoView.this.mo109078a(true);
            }

            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                boolean z;
                VideoView.this.f130203i = i2;
                VideoView.this.f130204j = i3;
                boolean z2 = false;
                if (VideoView.this.f130198d == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (VideoView.this.f130201g == i2 && VideoView.this.f130202h == i3) {
                    z2 = true;
                }
                if (VideoView.this.f130200f != null && z && z2) {
                    if (VideoView.this.f130211q != 0) {
                        VideoView.this.mo109072a(VideoView.this.f130211q);
                    }
                    VideoView.this.mo109071a();
                    if (VideoView.this.f130205k != null) {
                        VideoView.this.f130205k.mo109061b();
                    }
                }
            }
        };
        m111717g();
    }
}
