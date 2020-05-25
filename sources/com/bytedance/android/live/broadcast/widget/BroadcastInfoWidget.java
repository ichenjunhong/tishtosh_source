package com.bytedance.android.live.broadcast.widget;

import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.p197d.C3050a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.trill.R;
import com.taobao.android.dexposed.ClassUtils;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;

public class BroadcastInfoWidget extends LiveRecyclableWidget implements C3050a {

    /* renamed from: a */
    ImageView f10387a;

    /* renamed from: b */
    public TextView f10388b;

    /* renamed from: c */
    long f10389c;

    /* renamed from: d */
    View f10390d;

    /* renamed from: e */
    public final Runnable f10391e = new Runnable() {
        public final void run() {
            String str;
            if (BroadcastInfoWidget.this.isViewValid()) {
                BroadcastInfoWidget broadcastInfoWidget = BroadcastInfoWidget.this;
                long elapsedRealtime = SystemClock.elapsedRealtime() - broadcastInfoWidget.f10389c;
                if (elapsedRealtime < 0) {
                    elapsedRealtime = 0;
                }
                TextView textView = broadcastInfoWidget.f10388b;
                int i = (int) (elapsedRealtime / 1000);
                String str2 = ClassUtils.PACKAGE_SEPARATOR;
                StringBuilder sb = new StringBuilder();
                if (i <= 0) {
                    str = "";
                } else {
                    long j = (long) (i / 3600);
                    long j2 = ((long) i) - (3600 * j);
                    long j3 = j2 / 60;
                    long j4 = j2 - (60 * j3);
                    if (j < 10) {
                        sb.append("0");
                    }
                    sb.append(j);
                    sb.append(str2);
                    if (j3 < 10) {
                        sb.append("0");
                    }
                    sb.append(j3);
                    sb.append(str2);
                    if (j4 < 10) {
                        sb.append("0");
                    }
                    sb.append(j4);
                    str = sb.toString();
                }
                textView.setText(str);
                BroadcastInfoWidget.this.f10388b.postDelayed(BroadcastInfoWidget.this.f10391e, 1000);
            }
        }
    };

    /* renamed from: f */
    private Integer[] f10392f;

    /* renamed from: g */
    private Room f10393g;

    public int getLayoutId() {
        return R.layout.and;
    }

    public void onUnload() {
    }

    /* renamed from: a */
    public final void mo8316a(float f) {
        int i;
        BroadcastInfoWidget.class.getSimpleName();
        new StringBuilder("kbps:").append(f);
        Integer[] numArr = this.f10392f;
        if (this.f10393g.getStreamType() != C8710m.AUDIO) {
            int i2 = 0;
            while (true) {
                if (i2 >= numArr.length) {
                    break;
                } else if (f >= ((float) numArr[i2].intValue())) {
                    i = (numArr.length - i2) - 1;
                    break;
                } else {
                    i2++;
                }
            }
        } else if (f != 0.0f) {
            i = 4;
            C2201v.m6614b(Integer.valueOf(0)).mo6514a(C1667a.m5940a()).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6505a((C1710e<? super T>) new C3762b<Object>(this, i), C3763c.f10632a);
        }
        i = 0;
        C2201v.m6614b(Integer.valueOf(0)).mo6514a(C1667a.m5940a()).mo6513a((C1673aa<? super T, ? extends R>) getAutoUnbindTransformer()).mo6505a((C1710e<? super T>) new C3762b<Object>(this, i), C3763c.f10632a);
    }

    public void onInit(Object... objArr) {
        this.f10393g = (Room) this.dataCenter.get("data_room");
        this.f10392f = (Integer[]) LiveConfigSettingKeys.LIVE_VIDEO_PUSH_BITRATE_LEVEL.mo9431a();
        this.f10387a = (ImageView) this.contentView.findViewById(R.id.b1z);
        this.f10387a.setImageLevel(4);
        this.f10388b = (TextView) this.contentView.findViewById(R.id.bc9);
        this.f10390d = this.contentView.findViewById(R.id.c68);
    }

    public void onLoad(Object... objArr) {
        this.f10393g = (Room) this.dataCenter.get("data_room");
        if (this.f10393g.getId() != ((Long) C4525b.f12448v.mo10345a()).longValue() || ((Long) C4525b.f12449w.mo10345a()).longValue() <= 0) {
            this.f10389c = SystemClock.elapsedRealtime();
            C4525b.f12448v.mo10346a(Long.valueOf(this.f10393g.getId()));
            C4525b.f12449w.mo10346a(Long.valueOf(this.f10389c));
        } else {
            this.f10389c = ((Long) C4525b.f12449w.mo10345a()).longValue();
        }
        this.f10388b.postDelayed(this.f10391e, 1000);
    }
}
