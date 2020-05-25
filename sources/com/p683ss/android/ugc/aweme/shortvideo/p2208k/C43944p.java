package com.p683ss.android.ugc.aweme.shortvideo.p2208k;

import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.p683ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.editor.EditVolumeViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.ss.android.ugc.trill.R;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.k.p */
public final class C43944p {

    /* renamed from: a */
    public View f111267a;

    /* renamed from: b */
    public TextView f111268b;

    /* renamed from: c */
    public TextView f111269c;

    /* renamed from: d */
    public int f111270d = 50;

    /* renamed from: e */
    public int f111271e = 50;

    /* renamed from: f */
    public boolean f111272f;

    /* renamed from: g */
    public C43948a f111273g;

    /* renamed from: h */
    public C43949b f111274h;

    /* renamed from: i */
    public EditVolumeViewModel f111275i;

    /* renamed from: j */
    private SeekBar f111276j;

    /* renamed from: k */
    private SeekBar f111277k;

    /* renamed from: l */
    private View f111278l;

    /* renamed from: m */
    private FragmentActivity f111279m;

    /* renamed from: n */
    private VideoPublishEditModel f111280n;

    /* renamed from: o */
    private C23441t f111281o;

    /* renamed from: p */
    private C23422a f111282p = new C43950q(this);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.p$a */
    public interface C43948a {
        /* renamed from: a */
        void mo89514a(float f, float f2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.k.p$b */
    public interface C43949b {
        /* renamed from: a */
        void mo89515a();
    }

    /* renamed from: a */
    public final void mo89499a() {
        if (!this.f111272f) {
            this.f111276j = (SeekBar) this.f111267a.findViewById(R.id.ck6);
            this.f111277k = (SeekBar) this.f111267a.findViewById(R.id.ck7);
            this.f111268b = (TextView) this.f111267a.findViewById(R.id.ddg);
            this.f111269c = (TextView) this.f111267a.findViewById(R.id.ddh);
            this.f111278l = this.f111267a.findViewById(R.id.ayy);
            this.f111275i = (EditVolumeViewModel) C48927d.m105736a(this.f111279m).mo96760a(EditVolumeViewModel.class);
            this.f111277k.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                public final void onStopTrackingTouch(SeekBar seekBar) {
                    C43944p.this.f111275i.mo97066a(seekBar.getProgress());
                }

                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    float f = (((float) C43944p.this.f111271e) * 1.0f) / 100.0f;
                    float f2 = (((float) i) * 1.0f) / 100.0f;
                    if (C43944p.this.f111273g != null) {
                        C43944p.this.f111273g.mo89514a(f, f2);
                    }
                    C43944p.this.f111270d = i;
                }
            });
            this.f111276j.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
                public final void onStartTrackingTouch(SeekBar seekBar) {
                }

                public final void onStopTrackingTouch(SeekBar seekBar) {
                }

                public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                    float f = (((float) i) * 1.0f) / 100.0f;
                    float f2 = (((float) C43944p.this.f111270d) * 1.0f) / 100.0f;
                    if (C43944p.this.f111273g != null) {
                        C43944p.this.f111273g.mo89514a(f, f2);
                    }
                    C43944p.this.f111271e = i;
                }
            });
            if (this.f111278l != null) {
                this.f111278l.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        C43944p pVar = C43944p.this;
                        if (pVar.f111274h != null) {
                            pVar.f111274h.mo89515a();
                        }
                        try {
                            C23569o.m57783b("aweme_short_video_volume_set", (String) null, new JSONObject().put("mVoiceVolume", pVar.f111271e).put("mMusicVolume", pVar.f111270d));
                        } catch (JSONException unused) {
                        }
                    }
                });
            }
            this.f111272f = true;
        }
    }

    /* renamed from: b */
    public final C43944p mo89502b() {
        if (this.f111280n == null && this.f111276j != null && (C18998a.m46169a(this.f111276j.getContext()) instanceof VEVideoPublishEditActivity)) {
            EditViewModel editViewModel = (EditViewModel) C48927d.m105736a((VEVideoPublishEditActivity) C18998a.m46169a(this.f111276j.getContext())).mo96760a(EditViewModel.class);
            if (editViewModel != null) {
                this.f111280n = editViewModel.f123232e;
            }
        }
        if (!(this.f111280n == null || this.f111280n.veAudioRecorderParam == null || this.f111276j == null)) {
            if (!this.f111280n.veAudioRecorderParam.getNeedOriginalSound()) {
                this.f111276j.setEnabled(false);
                this.f111276j.setAlpha(0.5f);
            } else if ((this.f111280n.isFastImport || this.f111280n.hasOriginalSound()) && !this.f111280n.isMuted) {
                this.f111276j.setEnabled(true);
                this.f111276j.setAlpha(1.0f);
            } else {
                this.f111276j.setEnabled(false);
                this.f111276j.setAlpha(0.5f);
            }
            if (this.f111280n.mMusicPath != null) {
                this.f111270d = (int) (this.f111280n.musicVolume * 100.0f);
            }
            this.f111276j.setProgress((int) (this.f111280n.voiceVolume * 100.0f));
        }
        return this;
    }

    /* renamed from: a */
    public final C43944p mo89498a(int i) {
        this.f111270d = i;
        if (this.f111272f) {
            this.f111277k.setProgress(this.f111270d);
        }
        return this;
    }

    /* renamed from: b */
    public final C43944p mo89503b(int i) {
        this.f111271e = i;
        if (this.f111272f) {
            this.f111276j.setProgress(this.f111271e);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo89501a(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 50;
        }
        this.f111271e = i;
    }

    /* renamed from: b */
    public final C43944p mo89504b(boolean z) {
        float f;
        if (this.f111272f) {
            this.f111276j.setEnabled(z);
            SeekBar seekBar = this.f111276j;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            seekBar.setAlpha(f);
        }
        mo89502b();
        return this;
    }

    /* renamed from: c */
    public final C43944p mo89505c(boolean z) {
        float f;
        if (this.f111272f) {
            this.f111277k.setEnabled(z);
            SeekBar seekBar = this.f111277k;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            seekBar.setAlpha(f);
        }
        return this;
    }

    /* renamed from: d */
    public final void mo89506d(boolean z) {
        if (this.f111272f) {
            if (z) {
                this.f111267a.setAlpha(0.0f);
                this.f111267a.setVisibility(0);
                this.f111267a.animate().alpha(1.0f).setDuration(200).start();
                if (this.f111281o != null) {
                    this.f111281o.mo48605a(this.f111282p);
                }
            } else {
                this.f111267a.setAlpha(1.0f);
                this.f111267a.animate().alpha(1.0f).setDuration(200).start();
                this.f111267a.setVisibility(4);
                if (this.f111281o != null) {
                    this.f111281o.mo48606b(this.f111282p);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo89500a(FragmentActivity fragmentActivity, C23441t tVar) {
        this.f111279m = fragmentActivity;
        this.f111281o = tVar;
    }
}
