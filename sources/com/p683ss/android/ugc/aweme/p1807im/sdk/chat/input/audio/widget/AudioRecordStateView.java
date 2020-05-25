package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget.AudioRecordStateView */
public class AudioRecordStateView extends LinearLayout {

    /* renamed from: a */
    public TextView f86850a;

    /* renamed from: b */
    public TextView f86851b;

    /* renamed from: c */
    public ImageView f86852c;

    /* renamed from: d */
    int f86853d;

    /* renamed from: e */
    public int f86854e;

    /* renamed from: f */
    public int f86855f;

    /* renamed from: g */
    public int f86856g;

    /* renamed from: h */
    int f86857h;

    /* renamed from: i */
    int f86858i;

    /* renamed from: j */
    long f86859j;

    /* renamed from: k */
    private int f86860k;

    /* renamed from: l */
    private int f86861l;

    /* renamed from: m */
    private int f86862m;

    /* renamed from: n */
    private int f86863n;

    /* renamed from: o */
    private int f86864o;

    /* renamed from: p */
    private int f86865p;

    /* renamed from: q */
    private int f86866q;

    /* renamed from: r */
    private Handler f86867r = new Handler() {
        public final void handleMessage(Message message) {
            if (1 == message.what) {
                AudioRecordStateView.this.setVisibility(4);
            }
        }
    };

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* renamed from: a */
    public void mo70959a() {
        this.f86867r.removeMessages(1);
        setVisibility(0);
    }

    /* renamed from: b */
    public void mo70962b() {
        this.f86867r.removeMessages(1);
        this.f86867r.sendEmptyMessageDelayed(1, 1500);
    }

    /* renamed from: c */
    private void m76802c() {
        if (this.f86860k != -1) {
            this.f86850a.setText(this.f86860k);
        } else {
            this.f86850a.setText("");
        }
        this.f86851b.setVisibility(4);
        if (this.f86865p != -1) {
            this.f86852c.setImageResource(this.f86865p);
            this.f86852c.setVisibility(0);
        } else {
            this.f86852c.setVisibility(4);
        }
        this.f86851b.setTextColor(getResources().getColor(this.f86866q));
        this.f86850a.setTextColor(getResources().getColor(this.f86866q));
        this.f86858i = 0;
        this.f86859j = 0;
        setVisibility(4);
    }

    public void setVolumeLevel(int i) {
        this.f86858i = i;
    }

    public AudioRecordStateView(Context context) {
        super(context);
        m76801a(context, null);
    }

    /* renamed from: a */
    public final void mo70961a(long j) {
        setSecondsRemain(j);
        this.f86851b.setVisibility(0);
        this.f86852c.setVisibility(4);
        mo70959a();
    }

    public void setSecondsRemain(long j) {
        this.f86859j = j;
        double d = (double) j;
        Double.isNaN(d);
        this.f86851b.setText(String.valueOf((int) Math.ceil(d / 1000.0d)));
    }

    /* renamed from: a */
    public final void mo70960a(int i) {
        m76802c();
        setVolumeLevel(i);
        switch (Math.min(i, 5)) {
            case 2:
                this.f86852c.setImageResource(this.f86864o);
                break;
            case 3:
                this.f86852c.setImageResource(this.f86863n);
                break;
            case 4:
                this.f86852c.setImageResource(this.f86862m);
                break;
            case 5:
                this.f86852c.setImageResource(this.f86861l);
                break;
            default:
                this.f86852c.setImageResource(this.f86865p);
                break;
        }
        mo70959a();
    }

    public AudioRecordStateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m76801a(context, attributeSet);
    }

    /* renamed from: a */
    private void m76801a(Context context, AttributeSet attributeSet) {
        inflate(context, R.layout.bh4, this);
        this.f86850a = (TextView) findViewById(R.id.dge);
        this.f86851b = (TextView) findViewById(R.id.db2);
        this.f86852c = (ImageView) findViewById(R.id.b4d);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b9, R.attr.b_, R.attr.ba, R.attr.bb, R.attr.bc, R.attr.bd, R.attr.be, R.attr.bf, R.attr.bg, R.attr.bh, R.attr.bi, R.attr.bj});
            this.f86860k = obtainStyledAttributes.getResourceId(2, -1);
            this.f86853d = obtainStyledAttributes.getResourceId(1, this.f86860k);
            this.f86854e = obtainStyledAttributes.getResourceId(6, -1);
            this.f86855f = obtainStyledAttributes.getResourceId(5, -1);
            this.f86856g = obtainStyledAttributes.getResourceId(3, -1);
            this.f86857h = obtainStyledAttributes.getResourceId(0, -1);
            this.f86861l = obtainStyledAttributes.getResourceId(11, -1);
            this.f86862m = obtainStyledAttributes.getResourceId(10, this.f86861l);
            this.f86863n = obtainStyledAttributes.getResourceId(9, this.f86862m);
            this.f86864o = obtainStyledAttributes.getResourceId(8, this.f86863n);
            this.f86865p = obtainStyledAttributes.getResourceId(7, this.f86864o);
            this.f86866q = obtainStyledAttributes.getResourceId(4, -1);
            obtainStyledAttributes.recycle();
            m76802c();
        }
    }

    public AudioRecordStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m76801a(context, attributeSet);
    }
}
