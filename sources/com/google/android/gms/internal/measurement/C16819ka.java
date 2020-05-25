package com.google.android.gms.internal.measurement;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.measurement.ka */
final class C16819ka {

    /* renamed from: a */
    static final C16823d f47232a;

    /* renamed from: b */
    static final long f47233b = ((long) m40688b(byte[].class));

    /* renamed from: c */
    private static final Logger f47234c = Logger.getLogger(C16819ka.class.getName());

    /* renamed from: d */
    private static final Unsafe f47235d = m40694c();

    /* renamed from: e */
    private static final Class<?> f47236e = C16688fp.f46930a;

    /* renamed from: f */
    private static final boolean f47237f = m40701d(Long.TYPE);

    /* renamed from: g */
    private static final boolean f47238g = m40701d(Integer.TYPE);

    /* renamed from: h */
    private static final boolean f47239h = m40705f();

    /* renamed from: i */
    private static final boolean f47240i = m40703e();

    /* renamed from: j */
    private static final long f47241j = ((long) m40688b(boolean[].class));

    /* renamed from: k */
    private static final long f47242k = ((long) m40693c(boolean[].class));

    /* renamed from: l */
    private static final long f47243l = ((long) m40688b(int[].class));

    /* renamed from: m */
    private static final long f47244m = ((long) m40693c(int[].class));

    /* renamed from: n */
    private static final long f47245n = ((long) m40688b(long[].class));

    /* renamed from: o */
    private static final long f47246o = ((long) m40693c(long[].class));

    /* renamed from: p */
    private static final long f47247p = ((long) m40688b(float[].class));

    /* renamed from: q */
    private static final long f47248q = ((long) m40693c(float[].class));

    /* renamed from: r */
    private static final long f47249r = ((long) m40688b(double[].class));

    /* renamed from: s */
    private static final long f47250s = ((long) m40693c(double[].class));

    /* renamed from: t */
    private static final long f47251t = ((long) m40688b(Object[].class));

    /* renamed from: u */
    private static final long f47252u = ((long) m40693c(Object[].class));

    /* renamed from: v */
    private static final long f47253v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public static final boolean f47254w = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);

    /* renamed from: com.google.android.gms.internal.measurement.ka$a */
    static final class C16820a extends C16823d {
        C16820a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo32400a(long j, byte b) {
            Memory.pokeByte((int) (j & -1), b);
        }

        /* renamed from: a */
        public final byte mo32399a(Object obj, long j) {
            if (C16819ka.f47254w) {
                return C16819ka.m40711k(obj, j);
            }
            return C16819ka.m40712l(obj, j);
        }

        /* renamed from: a */
        public final void mo32401a(Object obj, long j, byte b) {
            if (C16819ka.f47254w) {
                C16819ka.m40695c(obj, j, b);
            } else {
                C16819ka.m40699d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo32406b(Object obj, long j) {
            if (C16819ka.f47254w) {
                return C16819ka.m40709i(obj, j);
            }
            return C16819ka.m40710j(obj, j);
        }

        /* renamed from: a */
        public final void mo32404a(Object obj, long j, boolean z) {
            if (C16819ka.f47254w) {
                C16819ka.m40695c(obj, j, r3 ? (byte) 1 : 0);
            } else {
                C16819ka.m40699d(obj, j, r3 ? (byte) 1 : 0);
            }
        }

        /* renamed from: c */
        public final float mo32407c(Object obj, long j) {
            return Float.intBitsToFloat(mo32411e(obj, j));
        }

        /* renamed from: a */
        public final void mo32403a(Object obj, long j, float f) {
            mo32409a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo32408d(Object obj, long j) {
            return Double.longBitsToDouble(mo32412f(obj, j));
        }

        /* renamed from: a */
        public final void mo32402a(Object obj, long j, double d) {
            mo32410a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo32405a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray((int) (j2 & -1), bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.ka$b */
    static final class C16821b extends C16823d {
        C16821b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo32400a(long j, byte b) {
            Memory.pokeByte(j, b);
        }

        /* renamed from: a */
        public final byte mo32399a(Object obj, long j) {
            if (C16819ka.f47254w) {
                return C16819ka.m40711k(obj, j);
            }
            return C16819ka.m40712l(obj, j);
        }

        /* renamed from: a */
        public final void mo32401a(Object obj, long j, byte b) {
            if (C16819ka.f47254w) {
                C16819ka.m40695c(obj, j, b);
            } else {
                C16819ka.m40699d(obj, j, b);
            }
        }

        /* renamed from: b */
        public final boolean mo32406b(Object obj, long j) {
            if (C16819ka.f47254w) {
                return C16819ka.m40709i(obj, j);
            }
            return C16819ka.m40710j(obj, j);
        }

        /* renamed from: a */
        public final void mo32404a(Object obj, long j, boolean z) {
            if (C16819ka.f47254w) {
                C16819ka.m40695c(obj, j, r3 ? (byte) 1 : 0);
            } else {
                C16819ka.m40699d(obj, j, r3 ? (byte) 1 : 0);
            }
        }

        /* renamed from: c */
        public final float mo32407c(Object obj, long j) {
            return Float.intBitsToFloat(mo32411e(obj, j));
        }

        /* renamed from: a */
        public final void mo32403a(Object obj, long j, float f) {
            mo32409a(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: d */
        public final double mo32408d(Object obj, long j) {
            return Double.longBitsToDouble(mo32412f(obj, j));
        }

        /* renamed from: a */
        public final void mo32402a(Object obj, long j, double d) {
            mo32410a(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public final void mo32405a(byte[] bArr, long j, long j2, long j3) {
            Memory.pokeByteArray(j2, bArr, (int) j, (int) j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.ka$c */
    static final class C16822c extends C16823d {
        C16822c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public final void mo32400a(long j, byte b) {
            this.f47255a.putByte(j, b);
        }

        /* renamed from: a */
        public final byte mo32399a(Object obj, long j) {
            return this.f47255a.getByte(obj, j);
        }

        /* renamed from: a */
        public final void mo32401a(Object obj, long j, byte b) {
            this.f47255a.putByte(obj, j, b);
        }

        /* renamed from: b */
        public final boolean mo32406b(Object obj, long j) {
            return this.f47255a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public final void mo32404a(Object obj, long j, boolean z) {
            this.f47255a.putBoolean(obj, j, z);
        }

        /* renamed from: c */
        public final float mo32407c(Object obj, long j) {
            return this.f47255a.getFloat(obj, j);
        }

        /* renamed from: a */
        public final void mo32403a(Object obj, long j, float f) {
            this.f47255a.putFloat(obj, j, f);
        }

        /* renamed from: d */
        public final double mo32408d(Object obj, long j) {
            return this.f47255a.getDouble(obj, j);
        }

        /* renamed from: a */
        public final void mo32402a(Object obj, long j, double d) {
            this.f47255a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public final void mo32405a(byte[] bArr, long j, long j2, long j3) {
            this.f47255a.copyMemory(bArr, C16819ka.f47233b + j, null, j2, j3);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.ka$d */
    static abstract class C16823d {

        /* renamed from: a */
        Unsafe f47255a;

        C16823d(Unsafe unsafe) {
            this.f47255a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo32399a(Object obj, long j);

        /* renamed from: a */
        public abstract void mo32400a(long j, byte b);

        /* renamed from: a */
        public abstract void mo32401a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo32402a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo32403a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo32404a(Object obj, long j, boolean z);

        /* renamed from: a */
        public abstract void mo32405a(byte[] bArr, long j, long j2, long j3);

        /* renamed from: b */
        public abstract boolean mo32406b(Object obj, long j);

        /* renamed from: c */
        public abstract float mo32407c(Object obj, long j);

        /* renamed from: d */
        public abstract double mo32408d(Object obj, long j);

        /* renamed from: e */
        public final int mo32411e(Object obj, long j) {
            return this.f47255a.getInt(obj, j);
        }

        /* renamed from: a */
        public final void mo32409a(Object obj, long j, int i) {
            this.f47255a.putInt(obj, j, i);
        }

        /* renamed from: f */
        public final long mo32412f(Object obj, long j) {
            return this.f47255a.getLong(obj, j);
        }

        /* renamed from: a */
        public final void mo32410a(Object obj, long j, long j2) {
            this.f47255a.putLong(obj, j, j2);
        }
    }

    private C16819ka() {
    }

    /* renamed from: a */
    static boolean m40687a() {
        return f47240i;
    }

    /* renamed from: b */
    static boolean m40692b() {
        return f47239h;
    }

    /* renamed from: a */
    static <T> T m40676a(Class<T> cls) {
        try {
            return f47235d.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    private static int m40688b(Class<?> cls) {
        if (f47240i) {
            return f47232a.f47255a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: c */
    private static int m40693c(Class<?> cls) {
        if (f47240i) {
            return f47232a.f47255a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: a */
    static int m40674a(Object obj, long j) {
        return f47232a.mo32411e(obj, j);
    }

    /* renamed from: a */
    static void m40682a(Object obj, long j, int i) {
        f47232a.mo32409a(obj, j, i);
    }

    /* renamed from: b */
    static long m40689b(Object obj, long j) {
        return f47232a.mo32412f(obj, j);
    }

    /* renamed from: a */
    static void m40683a(Object obj, long j, long j2) {
        f47232a.mo32410a(obj, j, j2);
    }

    /* renamed from: c */
    static boolean m40697c(Object obj, long j) {
        return f47232a.mo32406b(obj, j);
    }

    /* renamed from: a */
    static void m40685a(Object obj, long j, boolean z) {
        f47232a.mo32404a(obj, j, z);
    }

    /* renamed from: d */
    static float m40698d(Object obj, long j) {
        return f47232a.mo32407c(obj, j);
    }

    /* renamed from: a */
    static void m40681a(Object obj, long j, float f) {
        f47232a.mo32403a(obj, j, f);
    }

    /* renamed from: e */
    static double m40702e(Object obj, long j) {
        return f47232a.mo32408d(obj, j);
    }

    /* renamed from: a */
    static void m40680a(Object obj, long j, double d) {
        f47232a.mo32402a(obj, j, d);
    }

    /* renamed from: f */
    static Object m40704f(Object obj, long j) {
        return f47232a.f47255a.getObject(obj, j);
    }

    /* renamed from: a */
    static void m40684a(Object obj, long j, Object obj2) {
        f47232a.f47255a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    static byte m40673a(byte[] bArr, long j) {
        return f47232a.mo32399a((Object) bArr, f47233b + j);
    }

    /* renamed from: a */
    static void m40686a(byte[] bArr, long j, byte b) {
        f47232a.mo32401a((Object) bArr, f47233b + j, b);
    }

    /* renamed from: a */
    static void m40678a(long j, byte b) {
        f47232a.mo32400a(j, b);
    }

    /* renamed from: a */
    static long m40675a(ByteBuffer byteBuffer) {
        return f47232a.mo32412f(byteBuffer, f47253v);
    }

    /* renamed from: c */
    static Unsafe m40694c() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C16824kb());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static boolean m40703e() {
        if (f47235d == null) {
            return false;
        }
        try {
            Class cls = f47235d.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (C16688fp.m39858a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            f47234c.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: f */
    private static boolean m40705f() {
        if (f47235d == null) {
            return false;
        }
        try {
            Class cls = f47235d.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (m40707g() == null) {
                return false;
            }
            if (C16688fp.m39858a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            f47234c.logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m40701d(Class<?> cls) {
        if (!C16688fp.m39858a()) {
            return false;
        }
        try {
            Class<?> cls2 = f47236e;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    private static Field m40707g() {
        if (C16688fp.m39858a()) {
            Field a = m40677a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        Field a2 = m40677a(Buffer.class, "address");
        if (a2 == null || a2.getType() != Long.TYPE) {
            return null;
        }
        return a2;
    }

    /* renamed from: a */
    private static Field m40677a(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static byte m40711k(Object obj, long j) {
        return (byte) (m40674a(obj, -4 & j) >>> ((int) (((j ^ -1) & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static byte m40712l(Object obj, long j) {
        return (byte) (m40674a(obj, -4 & j) >>> ((int) ((j & 3) << 3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m40695c(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        m40682a(obj, j2, ((255 & b) << i) | (m40674a(obj, j2) & ((NormalGiftView.ALPHA_255 << i) ^ -1)));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m40699d(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m40682a(obj, j2, ((255 & b) << i) | (m40674a(obj, j2) & ((NormalGiftView.ALPHA_255 << i) ^ -1)));
    }

    static {
        C16823d dVar = null;
        if (f47235d != null) {
            if (!C16688fp.m39858a()) {
                dVar = new C16822c(f47235d);
            } else if (f47237f) {
                dVar = new C16821b(f47235d);
            } else if (f47238g) {
                dVar = new C16820a(f47235d);
            }
        }
        f47232a = dVar;
        Field g = m40707g();
        f47253v = (g == null || f47232a == null) ? -1 : f47232a.f47255a.objectFieldOffset(g);
    }

    /* renamed from: i */
    static /* synthetic */ boolean m40709i(Object obj, long j) {
        return m40711k(obj, j) != 0;
    }

    /* renamed from: j */
    static /* synthetic */ boolean m40710j(Object obj, long j) {
        return m40712l(obj, j) != 0;
    }
}
