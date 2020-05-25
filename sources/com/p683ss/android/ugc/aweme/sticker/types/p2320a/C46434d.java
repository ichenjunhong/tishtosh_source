package com.p683ss.android.ugc.aweme.sticker.types.p2320a;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.a.d */
public final class C46434d {

    /* renamed from: com.ss.android.ugc.aweme.sticker.types.a.d$a */
    public static final class C46435a implements OnSeekBarChangeListener {

        /* renamed from: a */
        final /* synthetic */ C52671b f117142a;

        public final void onStartTrackingTouch(SeekBar seekBar) {
        }

        public final void onStopTrackingTouch(SeekBar seekBar) {
        }

        public C46435a(C52671b bVar) {
            this.f117142a = bVar;
        }

        public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            this.f117142a.invoke(Integer.valueOf(i));
        }
    }
}
