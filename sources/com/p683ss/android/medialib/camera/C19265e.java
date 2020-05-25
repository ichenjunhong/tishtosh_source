package com.p683ss.android.medialib.camera;

import android.graphics.Point;
import android.util.Pair;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.ss.android.medialib.camera.e */
public final class C19265e {
    /* renamed from: a */
    public static int m46987a(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* renamed from: a */
    public static int[] m46991a(final int[] iArr, List<int[]> list) {
        return (int[]) Collections.min(list, new Comparator<int[]>() {
            /* renamed from: a */
            private int m46994a(int[] iArr) {
                int i;
                int i2;
                if (iArr[0] > iArr[0]) {
                    i = (iArr[0] - iArr[0]) * 2;
                } else {
                    i = (iArr[0] - iArr[0]) * 3;
                }
                if (iArr[1] > iArr[1]) {
                    i2 = (iArr[1] - iArr[1]) * 5;
                } else {
                    i2 = (iArr[1] - iArr[1]) * 1;
                }
                return i + i2;
            }

            public final /* synthetic */ int compare(Object obj, Object obj2) {
                return m46994a((int[]) obj) - m46994a((int[]) obj2);
            }
        });
    }

    /* renamed from: a */
    public static Point m46988a(List<Point> list, int i, int i2) {
        if (list == null || list.isEmpty() || i <= 0 || i2 <= 0) {
            return null;
        }
        Point point = new Point(0, 0);
        float f = Float.MAX_VALUE;
        for (Point point2 : list) {
            int i3 = point2.x;
            int i4 = point2.y;
            if (i3 == i && i4 == i2) {
                return point2;
            }
            float a = m46986a((float) i, (float) i2, (float) i3, (float) i4);
            if (a < f) {
                point.x = i3;
                point.y = i4;
                f = a;
            }
        }
        if (point.x > 0 && point.y > 0) {
            return point;
        }
        Collections.sort(list, new Comparator<Point>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                Point point = (Point) obj;
                Point point2 = (Point) obj2;
                return (point.x * point.y) - (point2.x * point2.y);
            }
        });
        return (Point) list.get(list.size() / 2);
    }

    /* renamed from: a */
    public static Point m46990a(List<Point> list, Point point, float f, float f2) {
        Point b = m46992b(list, point, f, (((float) point.y) * f) / ((float) point.x));
        if (b != null) {
            return b;
        }
        Point b2 = m46992b(list, point, f, f2);
        if (b2 != null) {
            return b2;
        }
        return m46988a(list, (int) f, (int) f2);
    }

    /* renamed from: a */
    private static float m46986a(float f, float f2, float f3, float f4) {
        float f5;
        if (f3 * f4 > f * f2) {
            f5 = 1.0f;
        } else {
            f5 = 1.2f;
        }
        return (Math.abs((f / f2) - (f3 / f4)) * 1000.0f) + ((Math.abs(f - f3) + Math.abs(f2 - f4)) * f5);
    }

    /* renamed from: b */
    private static Point m46992b(List<Point> list, Point point, float f, float f2) {
        if (list == null || list.isEmpty() || point == null || point.x <= 0 || point.y <= 0 || f <= 0.0f || f2 <= 0.0f) {
            return null;
        }
        float f3 = Float.MAX_VALUE;
        Point point2 = new Point(0, 0);
        for (Point point3 : list) {
            if (((double) Math.abs((((float) point3.x) * f2) - (((float) point3.y) * f))) <= 1.0E-5d) {
                float a = m46986a(f, f2, (float) point3.x, (float) point3.y);
                if (a < f3) {
                    point2.x = point3.x;
                    point2.y = point3.y;
                    f3 = a;
                }
            }
        }
        if (point2.x <= 0 || point2.y <= 0) {
            return null;
        }
        return point2;
    }

    /* renamed from: b */
    private static Pair<Point, Point> m46993b(List<Point> list, int i, int i2, List<Point> list2, int i3, int i4) {
        Point a = m46988a(list, i, i2);
        float f = (float) i3;
        return new Pair<>(a, m46992b(list2, a, f, (((float) a.y) * f) / ((float) a.x)));
    }

    /* renamed from: a */
    public static Point m46989a(List<Point> list, int i, int i2, List<Point> list2, int i3, int i4) {
        Pair b = m46993b(list, i, i2, list2, i3, i4);
        if (b.second == null && ((Point) b.first).x * 9 != ((Point) b.first).y * 16) {
            b = m46993b(list, i, (i * 9) / 16, list2, i3, i4);
        }
        if (b.second == null && ((Point) b.first).x * 3 != ((Point) b.first).y * 4) {
            b = m46993b(list, i, (i * 3) / 4, list2, i3, i4);
        }
        return (Point) b.first;
    }
}
