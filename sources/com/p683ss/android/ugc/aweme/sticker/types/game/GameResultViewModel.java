package com.p683ss.android.ugc.aweme.sticker.types.game;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.util.Pair;

/* renamed from: com.ss.android.ugc.aweme.sticker.types.game.GameResultViewModel */
public class GameResultViewModel extends C0209x {

    /* renamed from: a */
    public boolean f117441a;

    /* renamed from: b */
    private C0198r<Pair<Boolean, Integer>> f117442b;

    /* renamed from: c */
    private C0198r<Integer> f117443c;

    /* renamed from: a */
    public final C0198r<Pair<Boolean, Integer>> mo93332a() {
        if (this.f117442b == null) {
            this.f117442b = new C0198r<>();
        }
        return this.f117442b;
    }

    /* renamed from: b */
    public final C0198r<Integer> mo93333b() {
        if (this.f117443c == null) {
            this.f117443c = new C0198r<>();
        }
        return this.f117443c;
    }
}
