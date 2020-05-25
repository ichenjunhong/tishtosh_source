package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.ttm.player.MediaPlayer;

/* renamed from: com.ss.android.ugc.aweme.utils.ct */
public final class C47788ct {

    /* renamed from: A */
    private static final int[] f120311A = {f120328p, f120325m};

    /* renamed from: B */
    private static final int[] f120312B = {f120328p, f120327o};

    /* renamed from: a */
    private static final Context f120313a;

    /* renamed from: b */
    private static final int f120314b;

    /* renamed from: c */
    private static final int f120315c = ((int) C47876fb.m103570a(f120313a, 1, 48.0f));

    /* renamed from: d */
    private static final int f120316d = ((int) C47876fb.m103570a(f120313a, 1, 52.0f));

    /* renamed from: e */
    private static final int f120317e = ((int) C47876fb.m103570a(f120313a, 1, 64.0f));

    /* renamed from: f */
    private static final int f120318f = ((int) C47876fb.m103570a(f120313a, 1, 90.0f));

    /* renamed from: g */
    private static final int f120319g = ((int) C47876fb.m103570a(f120313a, 1, 94.0f));

    /* renamed from: h */
    private static final int f120320h = ((int) C47876fb.m103570a(f120313a, 1, 120.0f));

    /* renamed from: i */
    private static final int f120321i = ((int) C47876fb.m103570a(f120313a, 1, 124.0f));

    /* renamed from: j */
    private static final int f120322j = ((int) C47876fb.m103570a(f120313a, 1, 165.0f));

    /* renamed from: k */
    private static final int f120323k = ((int) C47876fb.m103570a(f120313a, 1, 186.0f));

    /* renamed from: l */
    private static final int f120324l = ((int) C47876fb.m103570a(f120313a, 1, 180.0f));

    /* renamed from: m */
    private static final int f120325m = ((int) C47876fb.m103570a(f120313a, 1, 211.0f));

    /* renamed from: n */
    private static final int f120326n = ((int) C47876fb.m103570a(f120313a, 1, 248.0f));

    /* renamed from: o */
    private static final int f120327o = ((int) C47876fb.m103570a(f120313a, 1, 280.0f));

    /* renamed from: p */
    private static final int f120328p = ((int) C47876fb.m103570a(f120313a, 1, 375.0f));

    /* renamed from: q */
    private static final int[] f120329q = {f120314b, f120314b};

    /* renamed from: r */
    private static final int[] f120330r = {f120315c, f120315c};

    /* renamed from: s */
    private static final int[] f120331s = {f120316d, f120316d};

    /* renamed from: t */
    private static final int[] f120332t = {f120317e, f120317e};

    /* renamed from: u */
    private static final int[] f120333u = {f120319g, f120319g};

    /* renamed from: v */
    private static final int[] f120334v = {f120320h, f120320h};

    /* renamed from: w */
    private static final int[] f120335w = {f120321i, f120322j};

    /* renamed from: x */
    private static final int[] f120336x = {f120323k, f120326n};

    /* renamed from: y */
    private static final int[] f120337y = {f120328p, f120318f};

    /* renamed from: z */
    private static final int[] f120338z = {f120328p, f120324l};

    static {
        Context a = C11010c.m22280a();
        f120313a = a;
        f120314b = (int) C47876fb.m103570a(a, 1, 32.0f);
    }

    /* renamed from: a */
    public static int[] m103417a(int i) {
        switch (i) {
            case 100:
            case 300:
                return f120329q;
            case BaseNotice.HASHTAG /*101*/:
                return f120330r;
            case 102:
                return f120333u;
            case 200:
                return f120335w;
            case 201:
                return f120336x;
            case 301:
            case 500:
                return f120332t;
            case 302:
                return f120334v;
            case 303:
                return f120312B;
            case MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL /*400*/:
                return f120331s;
            case 600:
                return f120338z;
            case 601:
                return f120337y;
            case 700:
                return f120311A;
            default:
                return null;
        }
    }
}
