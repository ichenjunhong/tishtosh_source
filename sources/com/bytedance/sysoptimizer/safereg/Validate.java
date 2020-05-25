package com.bytedance.sysoptimizer.safereg;

import com.C2240a;

class Validate {
    Validate() {
    }

    static void isTrue(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(C2240a.m6772a(str, objArr));
        }
    }
}
