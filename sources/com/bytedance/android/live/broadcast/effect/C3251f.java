package com.bytedance.android.live.broadcast.effect;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.effect.f */
public final class C3251f extends C3846a implements OnSeekBarChangeListener {

    /* renamed from: a */
    C3252a f9388a;

    /* renamed from: b */
    SeekBar f9389b;

    /* renamed from: c */
    boolean f9390c;

    /* renamed from: d */
    private SeekBar f9391d;

    /* renamed from: e */
    private SeekBar f9392e;

    /* renamed from: f */
    private SeekBar f9393f;

    /* renamed from: com.bytedance.android.live.broadcast.effect.f$a */
    public interface C3252a {
        /* renamed from: a */
        void mo8582a(float f);

        /* renamed from: b */
        void mo8583b(float f);

        /* renamed from: c */
        void mo8584c(float f);

        /* renamed from: d */
        void mo8585d(float f);
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onResume() {
        super.onResume();
        m8904a();
    }

    /* renamed from: a */
    private void m8904a() {
        this.f9389b.setProgress((int) (((Float) C4525b.f12318N.mo10345a()).floatValue() * 100.0f));
        this.f9391d.setProgress((int) (((Float) C4525b.f12319O.mo10345a()).floatValue() * 100.0f));
        this.f9392e.setProgress((int) (((Float) C4525b.f12320P.mo10345a()).floatValue() * 100.0f));
        this.f9393f.setProgress((int) (((Float) C4525b.f12321Q.mo10345a()).floatValue() * 100.0f));
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
        int id = seekBar.getId();
        if (id == R.id.dv3) {
            C4525b.f12318N.mo10346a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        } else if (id == R.id.jo) {
            C4525b.f12319O.mo10346a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        } else if (id == R.id.kr) {
            C4525b.f12320P.mo10346a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        } else if (id == R.id.ad7) {
            C4525b.f12321Q.mo10346a(Float.valueOf(((float) seekBar.getProgress()) / 100.0f));
        }
        Room currentRoom = ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom();
        if (currentRoom != null) {
            C3261l.m8930a(currentRoom.getId());
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (C8607a.f23572a) {
            i = R.layout.ak4;
        } else if (this.f9390c) {
            i = R.layout.akj;
        } else {
            i = R.layout.aki;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        this.f9391d = (SeekBar) inflate.findViewById(R.id.jo);
        this.f9392e = (SeekBar) inflate.findViewById(R.id.kr);
        this.f9393f = (SeekBar) inflate.findViewById(R.id.ad7);
        this.f9389b = (SeekBar) inflate.findViewById(R.id.dv3);
        this.f9389b.setOnSeekBarChangeListener(this);
        this.f9391d.setOnSeekBarChangeListener(this);
        this.f9392e.setOnSeekBarChangeListener(this);
        this.f9393f.setOnSeekBarChangeListener(this);
        if (C8607a.f23572a) {
            inflate.findViewById(R.id.dv2).setVisibility(8);
        }
        m8904a();
        return inflate;
    }

    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        int id = seekBar.getId();
        if (id == R.id.dv3) {
            if (this.f9388a != null) {
                this.f9388a.mo8582a(((float) i) / 100.0f);
            }
        } else if (id == R.id.jo) {
            if (this.f9388a != null) {
                this.f9388a.mo8583b(((float) i) / 100.0f);
            }
        } else if (id == R.id.kr) {
            if (this.f9388a != null) {
                this.f9388a.mo8584c(((float) i) / 100.0f);
            }
        } else if (id == R.id.ad7 && this.f9388a != null) {
            this.f9388a.mo8585d(((float) i) / 100.0f);
        }
    }
}
