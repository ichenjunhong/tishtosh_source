package com.bytedance.android.livesdk.gift.effect.video.p374a;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8639a;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8641c;
import com.bytedance.android.livesdkapi.depend.live.p441a.C8642d;
import com.bytedance.android.livesdkapi.host.IHostPlugin;
import com.bytedance.android.livesdkapi.p456j.C8828a;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36020a;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36022b;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36031d;
import com.p683ss.android.ugc.aweme.live.alphaplayer.C36036e;
import com.p683ss.android.ugc.aweme.live.alphaplayer.PlayerController;
import com.p683ss.android.ugc.aweme.live.alphaplayer.p1918b.C36024b;
import com.p683ss.ttm.player.MediaPlayer;

/* renamed from: com.bytedance.android.livesdk.gift.effect.video.a.b */
public final class C7440b implements C8639a {

    /* renamed from: a */
    public C8641c f20409a;

    /* renamed from: b */
    public C8642d f20410b;

    /* renamed from: c */
    public PlayerController f20411c;

    /* renamed from: d */
    private Context f20412d;

    /* renamed from: e */
    private C0184k f20413e;

    /* renamed from: f */
    private final IHostPlugin f20414f;

    /* renamed from: g */
    private C36020a f20415g = new C36020a() {
        /* renamed from: a */
        public final void mo13789a() {
            if (C7440b.this.f20409a != null) {
                C7440b.this.f20409a.mo12555a();
            }
        }

        /* renamed from: b */
        public final void mo13791b() {
            if (C7440b.this.f20409a != null) {
                C7440b.this.f20409a.mo12557b();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b6, code lost:
            r10 = r0;
            r4 = r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bb, code lost:
            if (r2.f20409a == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bd, code lost:
            r2.f20409a.mo12556a(r4, r10, r6, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x006e  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x009d  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00a7  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo13790a(int r9, int r10, com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a r11) {
            /*
                r8 = this;
                com.bytedance.android.livesdk.gift.effect.video.a.b r0 = com.bytedance.android.livesdk.gift.effect.video.p374a.C7440b.this
                com.bytedance.android.livesdkapi.depend.live.a.c r0 = r0.f20409a
                if (r0 == 0) goto L_0x00c2
                com.bytedance.android.livesdk.gift.effect.video.a.b r0 = com.bytedance.android.livesdk.gift.effect.video.p374a.C7440b.this
                com.ss.android.ugc.aweme.live.alphaplayer.PlayerController r0 = r0.f20411c
                com.ss.android.ugc.aweme.live.alphaplayer.AlphaVideoView r0 = r0.f92315e
                int r1 = r0.getMeasuredWidth()
                int r0 = r0.getMeasuredHeight()
                com.bytedance.android.livesdk.gift.effect.video.a.b r2 = com.bytedance.android.livesdk.gift.effect.video.p374a.C7440b.this
                float r1 = (float) r1
                float r0 = (float) r0
                float r9 = (float) r9
                float r10 = (float) r10
                float r3 = r1 / r0
                float r9 = r9 / r10
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r10 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.ScaleAspectFill
                if (r11 == r10) goto L_0x0039
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r10 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.TopFill
                if (r11 == r10) goto L_0x0039
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r10 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.BottomFill
                if (r11 == r10) goto L_0x0039
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r10 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.RightFill
                if (r11 == r10) goto L_0x0039
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r10 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.LeftFill
                if (r11 != r10) goto L_0x0032
                goto L_0x0039
            L_0x0032:
                int r10 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r10 <= 0) goto L_0x0042
                float r10 = r0 * r9
                goto L_0x003f
            L_0x0039:
                int r10 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r10 > 0) goto L_0x0042
                float r10 = r0 * r9
            L_0x003f:
                r4 = r10
                r10 = r0
                goto L_0x0045
            L_0x0042:
                float r10 = r1 / r9
                r4 = r1
            L_0x0045:
                int[] r5 = com.bytedance.android.livesdk.gift.effect.video.p374a.C7440b.C74433.f20419a
                int r11 = r11.ordinal()
                r11 = r5[r11]
                r5 = 1073741824(0x40000000, float:2.0)
                r6 = 0
                switch(r11) {
                    case 1: goto L_0x00b6;
                    case 2: goto L_0x00a7;
                    case 3: goto L_0x009d;
                    case 4: goto L_0x0090;
                    case 5: goto L_0x0087;
                    case 6: goto L_0x007a;
                    case 7: goto L_0x006e;
                    case 8: goto L_0x006b;
                    case 9: goto L_0x0062;
                    case 10: goto L_0x005e;
                    case 11: goto L_0x0056;
                    default: goto L_0x0053;
                }
            L_0x0053:
                r9 = 0
                goto L_0x00b9
            L_0x0056:
                float r9 = r9 * r0
                float r10 = r1 - r9
                r4 = r9
                r6 = r10
                r10 = r0
                goto L_0x0053
            L_0x005e:
                float r1 = r0 * r9
                goto L_0x00b6
            L_0x0062:
                float r9 = r1 / r9
                float r10 = r0 - r9
                r4 = r1
                r7 = r10
                r10 = r9
                r9 = r7
                goto L_0x00b9
            L_0x006b:
                float r0 = r1 / r9
                goto L_0x00b6
            L_0x006e:
                int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x0076
                float r1 = r1 - r4
                float r9 = r1 / r5
                goto L_0x00b4
            L_0x0076:
                float r0 = r0 - r10
                float r9 = r0 / r5
                goto L_0x00b9
            L_0x007a:
                int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x0083
                float r9 = r10 - r0
                float r9 = -r9
                float r9 = r9 / r5
                goto L_0x00b9
            L_0x0083:
                float r9 = r4 - r1
                float r9 = -r9
                goto L_0x00b4
            L_0x0087:
                int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x0053
                float r9 = r10 - r0
                float r9 = -r9
                float r9 = r9 / r5
                goto L_0x00b9
            L_0x0090:
                int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x0098
                float r9 = r10 - r0
                float r9 = -r9
                goto L_0x00b9
            L_0x0098:
                float r9 = r4 - r1
                float r9 = -r9
                float r9 = r9 / r5
                goto L_0x00b4
            L_0x009d:
                int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x00a2
                goto L_0x0053
            L_0x00a2:
                float r9 = r4 - r1
                float r9 = -r9
                float r9 = r9 / r5
                goto L_0x00b4
            L_0x00a7:
                int r9 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
                if (r9 <= 0) goto L_0x00b0
                float r9 = r10 - r0
                float r9 = -r9
                float r9 = r9 / r5
                goto L_0x00b9
            L_0x00b0:
                float r9 = r4 - r1
                float r9 = -r9
                float r9 = r9 / r5
            L_0x00b4:
                r6 = r9
                goto L_0x0053
            L_0x00b6:
                r10 = r0
                r4 = r1
                goto L_0x0053
            L_0x00b9:
                com.bytedance.android.livesdkapi.depend.live.a.c r11 = r2.f20409a
                if (r11 == 0) goto L_0x00c2
                com.bytedance.android.livesdkapi.depend.live.a.c r11 = r2.f20409a
                r11.mo12556a(r4, r10, r6, r9)
            L_0x00c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.video.p374a.C7440b.C74411.mo13790a(int, int, com.ss.android.ugc.aweme.live.alphaplayer.c$a):void");
        }
    };

    /* renamed from: h */
    private C36036e f20416h = new C36036e() {
        /* renamed from: a */
        public final void mo13792a(boolean z, String str, int i, int i2, String str2) {
            if (C7440b.this.f20410b != null) {
                C7440b.this.f20410b.mo12558a(z, str, i, i2, str2);
            }
        }
    };

    /* renamed from: com.bytedance.android.livesdk.gift.effect.video.a.b$3 */
    static /* synthetic */ class C74433 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20419a = new int[C36030a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.ss.android.ugc.aweme.live.alphaplayer.c$a[] r0 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20419a = r0
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.ScaleToFill     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.ScaleAspectFill     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.TopFill     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.BottomFill     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.LeftFill     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.RightFill     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.ScaleAspectFitCenter     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.TopFit     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.BottomFit     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x007a }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.LeftFit     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f20419a     // Catch:{ NoSuchFieldError -> 0x0086 }
                com.ss.android.ugc.aweme.live.alphaplayer.c$a r1 = com.p683ss.android.ugc.aweme.live.alphaplayer.C36029c.C36030a.RightFit     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.gift.effect.video.p374a.C7440b.C74433.<clinit>():void");
        }
    }

    /* renamed from: d */
    public final void mo13787d() {
        this.f20409a = null;
    }

    /* renamed from: e */
    public final void mo13788e() {
        this.f20410b = null;
    }

    /* renamed from: a */
    public final View mo13778a() {
        if (this.f20411c != null) {
            return this.f20411c.f92315e;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo13784b() {
        if (this.f20411c != null) {
            this.f20411c.mo74759a(PlayerController.m81220a(9, (Object) null));
        }
    }

    /* renamed from: c */
    public final void mo13786c() {
        if (this.f20411c != null) {
            this.f20411c.mo74757a((C36020a) null);
            this.f20411c.f92313c = null;
            this.f20411c.mo74763b();
            this.f20411c = null;
        }
        this.f20413e = null;
        this.f20412d = null;
        this.f20409a = null;
        this.f20410b = null;
    }

    /* renamed from: a */
    public final void mo13781a(C8641c cVar) {
        this.f20409a = cVar;
    }

    /* renamed from: a */
    public final void mo13782a(C8642d dVar) {
        this.f20410b = dVar;
    }

    /* renamed from: b */
    public final void mo13785b(ViewGroup viewGroup) {
        if (this.f20411c != null) {
            PlayerController playerController = this.f20411c;
            if (viewGroup != null) {
                viewGroup.removeView(playerController.f92315e);
            }
        }
    }

    /* renamed from: a */
    public final void mo13780a(ViewGroup viewGroup) {
        if (this.f20411c != null) {
            PlayerController playerController = this.f20411c;
            if (viewGroup != null) {
                ViewGroup viewGroup2 = (ViewGroup) playerController.f92315e.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(playerController.f92315e);
                }
                if (viewGroup.indexOfChild(playerController.f92315e) == -1) {
                    viewGroup.addView(playerController.f92315e);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo13779a(C0184k kVar) {
        boolean z;
        this.f20413e = kVar;
        if (this.f20412d != null && this.f20413e != null) {
            if (this.f20411c != null) {
                this.f20411c.mo74763b();
            }
            C36022b bVar = new C36022b();
            bVar.f92337a = this.f20412d;
            bVar.f92338b = this.f20413e;
            if (((Integer) LiveSettingKeys.LIVE_GIFT_PLAYER_USE_TYPE.mo9431a()).intValue() == 0 || (((Boolean) C4525b.f12391bG.mo10345a()).booleanValue() && ((Integer) LiveSettingKeys.LIVE_GIFT_PLAYER_USE_TYPE.mo9431a()).intValue() == 1)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                try {
                    C7435a aVar = new C7435a(this.f20412d);
                    if (C8828a.Player.isInstalled()) {
                        MediaPlayer a = aVar.mo13761a();
                        if (a == null) {
                            a = aVar.mo13761a();
                            if (a == null || a.isOSPlayer()) {
                                throw new Exception("create ttplayer failure");
                            }
                        }
                        aVar.f20399a = a;
                        aVar.f20399a.setIntOption(36, 1);
                        aVar.f20399a.setOnPreparedListener(aVar.f20400b);
                        aVar.f20399a.setOnErrorListener(aVar.f20401c);
                        aVar.f20399a.setOnCompletionListener(aVar.f20402d);
                        aVar.f20399a.setOnInfoListener(aVar.f20403e);
                        this.f20411c = PlayerController.m81221a(bVar, (C36031d) aVar);
                    } else {
                        throw new IllegalStateException("ttm plugin not installed");
                    }
                } catch (Throwable th) {
                    this.f20411c = PlayerController.m81221a(bVar, (C36031d) new C36024b());
                    C3831a.m9706a(6, "LiveGiftPlay", th.getStackTrace());
                }
            } else {
                this.f20411c = PlayerController.m81221a(bVar, (C36031d) new C36024b());
            }
            this.f20411c.mo74757a(this.f20415g);
            this.f20411c.f92313c = this.f20416h;
        }
    }

    public C7440b(Context context, IHostPlugin iHostPlugin) {
        this.f20412d = context;
        this.f20414f = iHostPlugin;
    }

    /* renamed from: a */
    public final void mo13783a(String str, long j) {
        if (this.f20411c != null) {
            C36029c a = new C36029c().mo74785a(str);
            a.f92359d = j;
            PlayerController playerController = this.f20411c;
            playerController.f92311a = a.f92359d;
            if (a.f92357b) {
                playerController.f92315e.setVisibility(0);
                playerController.f92315e.bringToFront();
                playerController.mo74759a(PlayerController.m81220a(1, (Object) a));
                return;
            }
            playerController.mo74764c();
            StringBuilder sb = new StringBuilder("dataSource is invalid. ErrorInfo: ");
            sb.append(a.f92358c);
            playerController.mo74762a(false, sb.toString());
        }
    }
}
