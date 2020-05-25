package com.google.p1057b.p1060c;

/* renamed from: com.google.b.c.y */
final class C17724y {
    /* renamed from: a */
    static int m43537a(Object obj) {
        int i;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return m43535a(i);
    }

    /* renamed from: a */
    static int m43535a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: a */
    static int m43536a(int i, double d) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        double d2 = (double) highestOneBit;
        Double.isNaN(d2);
        if (max <= ((int) (d * d2))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }
}
