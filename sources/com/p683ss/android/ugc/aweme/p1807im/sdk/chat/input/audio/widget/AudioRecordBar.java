package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.widget;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.support.p043v7.app.C1160b.C1161a;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.C2240a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33510k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.audio.C33513n;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35264d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35274l;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35279p;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.audio.widget.AudioRecordBar */
public class AudioRecordBar extends DmtTextView implements OnTouchListener {

    /* renamed from: b */
    public float f86832b;

    /* renamed from: c */
    public float f86833c;

    /* renamed from: d */
    public boolean f86834d;

    /* renamed from: e */
    public boolean f86835e;

    /* renamed from: f */
    public boolean f86836f;

    /* renamed from: g */
    private int f86837g;

    /* renamed from: h */
    private int f86838h;

    /* renamed from: i */
    private int f86839i;

    /* renamed from: j */
    private int f86840j;

    /* renamed from: k */
    private int f86841k;

    /* renamed from: l */
    private int f86842l;

    /* renamed from: m */
    private int f86843m;

    /* renamed from: n */
    private float f86844n;

    /* renamed from: o */
    private boolean f86845o;

    /* renamed from: p */
    private AudioRecordStateView f86846p;

    /* renamed from: q */
    private C33510k f86847q;

    /* renamed from: r */
    private long f86848r;

    public void setListener(C33510k kVar) {
        this.f86847q = kVar;
    }

    public void setStateView(AudioRecordStateView audioRecordStateView) {
        this.f86846p = audioRecordStateView;
    }

    public AudioRecordBar(Context context) {
        super(context);
        m76800a(context, null);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        super.setOnClickListener(null);
    }

    public AudioRecordBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m76800a(context, attributeSet);
    }

    /* renamed from: a */
    private void m76800a(Context context, AttributeSet attributeSet) {
        setOnTouchListener(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b0, R.attr.b1, R.attr.b2, R.attr.b3, R.attr.b4, R.attr.b5, R.attr.b6});
            this.f86837g = obtainStyledAttributes.getResourceId(5, -1);
            this.f86838h = obtainStyledAttributes.getResourceId(6, this.f86837g);
            this.f86839i = obtainStyledAttributes.getResourceId(3, -1);
            this.f86840j = obtainStyledAttributes.getResourceId(4, this.f86839i);
            this.f86841k = obtainStyledAttributes.getResourceId(0, -1);
            this.f86842l = obtainStyledAttributes.getResourceId(1, this.f86841k);
            this.f86843m = obtainStyledAttributes.getDimensionPixelOffset(2, 50);
            obtainStyledAttributes.recycle();
            setText(this.f86837g);
            setContentDescription(getContext().getResources().getString(this.f86837g));
            setTextColor(getResources().getColor(this.f86839i));
            setBackgroundResource(this.f86841k);
            this.f86835e = C33513n.m76798a(context);
            if (C35279p.m79763a()) {
                getPaint().setFakeBoldText(true);
            }
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f86835e) {
            this.f86832b = motionEvent.getX();
            this.f86833c = motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                if (SystemClock.uptimeMillis() - this.f86848r < 1000) {
                    return true;
                }
                this.f86848r = SystemClock.uptimeMillis();
                this.f86844n = motionEvent.getY();
                if (!this.f86845o) {
                    this.f86845o = true;
                    setText(this.f86838h);
                    setContentDescription(getContext().getResources().getString(this.f86838h));
                    setTextColor(getResources().getColor(this.f86840j));
                    setBackgroundResource(this.f86842l);
                    if (this.f86846p != null) {
                        this.f86846p.mo70960a(0);
                    }
                    if (this.f86847q != null) {
                        this.f86847q.mo70912a();
                    }
                }
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                if (this.f86845o) {
                    this.f86845o = false;
                    setText(this.f86837g);
                    setContentDescription(getContext().getResources().getString(this.f86837g));
                    setTextColor(getResources().getColor(this.f86839i));
                    setBackgroundResource(this.f86841k);
                    if (this.f86847q != null) {
                        this.f86847q.mo70914b();
                    }
                }
            } else if (motionEvent.getAction() == 2 && this.f86846p != null && this.f86845o) {
                if (!this.f86834d && Math.abs(motionEvent.getY()) - this.f86844n >= ((float) this.f86843m)) {
                    this.f86834d = true;
                    if (this.f86846p != null) {
                        AudioRecordStateView audioRecordStateView = this.f86846p;
                        if (audioRecordStateView.f86853d != -1) {
                            audioRecordStateView.f86850a.setText(audioRecordStateView.f86853d);
                        } else {
                            audioRecordStateView.f86850a.setText("");
                        }
                        audioRecordStateView.f86851b.setVisibility(4);
                        if (audioRecordStateView.f86857h != -1) {
                            audioRecordStateView.f86852c.setImageResource(audioRecordStateView.f86857h);
                            audioRecordStateView.f86852c.setVisibility(0);
                        } else {
                            audioRecordStateView.f86852c.setVisibility(4);
                        }
                        audioRecordStateView.mo70959a();
                    }
                } else if (this.f86834d && Math.abs(motionEvent.getY()) - this.f86844n < ((float) this.f86843m)) {
                    AudioRecordStateView audioRecordStateView2 = this.f86846p;
                    if (audioRecordStateView2.f86859j > 0) {
                        audioRecordStateView2.mo70961a(audioRecordStateView2.f86859j);
                    } else {
                        audioRecordStateView2.mo70960a(audioRecordStateView2.f86858i);
                    }
                    this.f86834d = false;
                }
            }
            return true;
        } else if (this.f86836f) {
            return true;
        } else {
            this.f86836f = true;
            Activity activity = (Activity) view.getContext();
            String[] strArr = {"android.permission.RECORD_AUDIO"};
            C23361b.m57419a(activity, strArr, new C23364b(new C23371a<Boolean>() {
                public final /* synthetic */ void run(Object obj) {
                    Boolean bool = (Boolean) obj;
                    AudioRecordBar.this.f86835e = bool.booleanValue();
                    AudioRecordBar.this.f86836f = false;
                }
            }, activity) {

                /* renamed from: a */
                final /* synthetic */ C23371a f86829a;

                /* renamed from: b */
                final /* synthetic */ Activity f86830b;

                {
                    this.f86829a = r1;
                    this.f86830b = r2;
                }

                /* renamed from: a */
                public final void mo40906a(String[] strArr, int[] iArr) {
                    if (iArr[0] != 0) {
                        Activity activity = this.f86830b;
                        new C1161a(activity, R.style.mp).mo3758a((int) R.string.bfd).mo3770b((CharSequence) C2240a.m6772a(C11010c.m22280a().getString(R.string.bel), new Object[]{C35264d.m79723a(activity)})).mo3759a((int) R.string.bll, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(activity) {

                            /* renamed from: a */
                            final /* synthetic */ Context f86831a;

                            {
                                this.f86831a = r1;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                Context context = this.f86831a;
                                if (context != null && !C35274l.m79754a(context) && !C35274l.m79755b(context)) {
                                    C35274l.m79756c(context);
                                }
                            }
                        }).mo3769b((int) R.string.wf, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        }).mo3772b().show();
                        if (this.f86829a != null) {
                            this.f86829a.run(Boolean.valueOf(false));
                        }
                    } else if (this.f86829a != null) {
                        this.f86829a.run(Boolean.valueOf(true));
                    }
                }
            });
            return true;
        }
    }

    public AudioRecordBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m76800a(context, attributeSet);
    }
}
