package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.p683ss.android.ugc.aweme.shortvideo.widget.KTVView;
import com.p683ss.android.ugc.aweme.utils.C47902fv;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView */
public class MusicDragView implements OnTouchListener {

    /* renamed from: a */
    ImageView f109171a;

    /* renamed from: b */
    View f109172b;

    /* renamed from: c */
    int f109173c;
    @BindView(2131493094)
    DmtCutMusicLayout cutMusicLayout;

    /* renamed from: d */
    public int f109174d;

    /* renamed from: e */
    public int f109175e;

    /* renamed from: f */
    boolean f109176f;

    /* renamed from: g */
    C43179a f109177g;

    /* renamed from: h */
    public C43180b f109178h;

    /* renamed from: i */
    private float f109179i;

    /* renamed from: j */
    private float f109180j;
    @BindView(2131493431)
    KTVView mKTVView;
    @BindView(2131494095)
    TextView mTextViewTimeStart;
    @BindView(2131494057)
    TextView mTextViewTotalTime;
    @BindString(2132083841)
    String mTimeString;
    @BindView(2131493838)
    RelativeLayout slideContainer;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView$a */
    public interface C43179a {
        /* renamed from: c */
        void mo87775c(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.MusicDragView$b */
    public interface C43180b {
        /* renamed from: b */
        void mo87776b(int i);
    }

    @OnClick({2131493384})
    public void next() {
        if (this.f109177g != null) {
            this.f109177g.mo87775c(this.f109174d);
        }
    }

    /* renamed from: b */
    private int m94714b() {
        if (this.f109173c >= this.f109175e) {
            return (int) (((((float) this.mKTVView.getWidth()) * 1.0f) * 15000.0f) / ((float) this.f109175e));
        }
        double width = (double) this.mKTVView.getWidth();
        Double.isNaN(width);
        double d = width * 1.0d;
        double d2 = (double) this.f109173c;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f109175e;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo87771a() {
        if (this.f109173c >= this.f109175e || this.f109176f) {
            return this.mKTVView.getWidth();
        }
        double width = (double) this.mKTVView.getWidth();
        Double.isNaN(width);
        double d = width * 1.0d;
        double d2 = (double) this.f109173c;
        Double.isNaN(d2);
        double d3 = d * d2;
        double d4 = (double) this.f109175e;
        Double.isNaN(d4);
        return (int) (d3 / d4);
    }

    /* renamed from: a */
    public final void mo87772a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        ImageView imageView = this.f109171a;
        int i5 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        KTVView kTVView = this.mKTVView;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        kTVView.setVisibility(i2);
        TextView textView = this.mTextViewTimeStart;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        TextView textView2 = this.mTextViewTotalTime;
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView2.setVisibility(i4);
        DmtCutMusicLayout dmtCutMusicLayout = this.cutMusicLayout;
        if (!z) {
            i5 = 0;
        }
        dmtCutMusicLayout.setVisibility(i5);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f109179i = motionEvent.getRawX();
                this.f109180j = this.f109171a.getX();
                break;
            case 1:
                int x = (int) ((this.f109171a.getX() - this.mKTVView.getX()) + ((float) (this.f109171a.getWidth() / 2)));
                if (x < 0) {
                    x = 0;
                }
                double d = (double) x;
                Double.isNaN(d);
                double d2 = d * 1.0d;
                double width = (double) this.mKTVView.getWidth();
                Double.isNaN(width);
                double d3 = d2 / width;
                double d4 = (double) this.f109175e;
                Double.isNaN(d4);
                this.f109174d = (int) (d3 * d4);
                if (this.f109178h != null) {
                    this.f109178h.mo87776b(this.f109174d);
                    break;
                }
                break;
            case 2:
                if (!this.f109176f) {
                    float rawX = this.f109180j + (motionEvent.getRawX() - this.f109179i);
                    if (rawX < this.mKTVView.getX() - ((float) (this.f109171a.getWidth() / 2))) {
                        rawX = this.mKTVView.getX() - ((float) (this.f109171a.getWidth() / 2));
                    }
                    if ((rawX - this.mKTVView.getX()) + ((float) (this.f109171a.getWidth() / 2)) >= ((float) (this.mKTVView.getWidth() - m94714b()))) {
                        rawX = ((this.mKTVView.getX() - ((float) (this.f109171a.getWidth() / 2))) + ((float) this.mKTVView.getWidth())) - ((float) m94714b());
                    }
                    float f = 0.0f;
                    if (rawX >= 0.0f) {
                        f = rawX;
                    }
                    this.f109171a.animate().x(f).setDuration(0).start();
                    int x2 = (int) ((this.f109171a.getX() + ((float) (this.f109171a.getWidth() / 2))) - this.mKTVView.getX());
                    if (x2 < 0 || this.f109176f) {
                        x2 = 0;
                    }
                    this.mKTVView.setStart(x2);
                    this.mKTVView.setLength(mo87771a());
                    TextView textView = this.mTextViewTimeStart;
                    double x3 = (double) this.f109171a.getX();
                    Double.isNaN(x3);
                    double d5 = x3 * 1.0d;
                    double x4 = (double) this.mKTVView.getX();
                    Double.isNaN(x4);
                    double d6 = d5 - x4;
                    double width2 = (double) (this.f109171a.getWidth() / 2);
                    Double.isNaN(width2);
                    double d7 = d6 + width2;
                    double width3 = (double) this.mKTVView.getWidth();
                    Double.isNaN(width3);
                    double d8 = d7 / width3;
                    double d9 = (double) this.f109175e;
                    Double.isNaN(d9);
                    int i = (int) (d8 * d9);
                    if (i < 0) {
                        i = 0;
                    }
                    if (i > this.f109175e) {
                        i = 0;
                    }
                    textView.setText(C47902fv.m103621a(i));
                    break;
                }
                break;
        }
        return true;
    }
}
