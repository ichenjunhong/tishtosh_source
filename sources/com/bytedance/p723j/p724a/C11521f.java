package com.bytedance.p723j.p724a;

import com.bytedance.p723j.p724a.C11514c.C11515a;
import com.bytedance.p723j.p724a.C11514c.C11516b;
import com.bytedance.p723j.p724a.C11514c.C11517c;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.j.a.f */
public final class C11521f implements C11514c, Closeable {

    /* renamed from: a */
    private final int f30887a = 1179403647;

    /* renamed from: b */
    private final FileChannel f30888b;

    public final void close() throws IOException {
        this.f30888b.close();
    }

    /* renamed from: a */
    public final List<String> mo22270a() throws IOException {
        boolean z;
        C11516b bVar;
        ByteOrder byteOrder;
        long j;
        long j2;
        this.f30888b.position(0);
        ArrayList arrayList = new ArrayList();
        this.f30888b.position(0);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (mo22271b(allocate, 0) == 1179403647) {
            short e = m23593e(allocate, 4);
            if (m23593e(allocate, 5) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (e == 1) {
                bVar = new C11519d(z, this);
            } else if (e == 2) {
                bVar = new C11520e(z, this);
            } else {
                throw new IllegalStateException("Invalid class type!");
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            if (bVar.f30871a) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            allocate2.order(byteOrder);
            long j3 = (long) bVar.f30876f;
            if (j3 == 65535) {
                j3 = bVar.mo22268a(0).f30884a;
            }
            long j4 = 0;
            while (true) {
                if (j4 >= j3) {
                    j = j3;
                    j2 = 0;
                    break;
                }
                C11517c a = bVar.mo22267a(j4);
                j = j3;
                if (a.f30880a == 2) {
                    j2 = a.f30881b;
                    break;
                }
                j4++;
                j3 = j;
            }
            if (j2 == 0) {
                return Collections.unmodifiableList(arrayList);
            }
            ArrayList<Long> arrayList2 = new ArrayList<>();
            long j5 = 0;
            int i = 0;
            while (true) {
                C11515a a2 = bVar.mo22266a(j2, i);
                if (a2.f30869a == 1) {
                    arrayList2.add(Long.valueOf(a2.f30870b));
                } else if (a2.f30869a == 5) {
                    j5 = a2.f30870b;
                }
                i++;
                if (a2.f30869a == 0) {
                    break;
                }
            }
            if (j5 != 0) {
                long a3 = m23590a(bVar, j, j5);
                for (Long longValue : arrayList2) {
                    arrayList.add(m23592d(allocate2, longValue.longValue() + a3));
                }
                return arrayList;
            }
            throw new IllegalStateException("String table offset not found!");
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }

    public C11521f(File file) throws FileNotFoundException {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f30888b = new FileInputStream(file).getChannel();
    }

    /* renamed from: e */
    private short m23593e(ByteBuffer byteBuffer, long j) throws IOException {
        m23591a(byteBuffer, j, 1);
        return (short) (byteBuffer.get() & 255);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo22269a(ByteBuffer byteBuffer, long j) throws IOException {
        m23591a(byteBuffer, j, 8);
        return byteBuffer.getLong();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo22271b(ByteBuffer byteBuffer, long j) throws IOException {
        m23591a(byteBuffer, j, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo22272c(ByteBuffer byteBuffer, long j) throws IOException {
        m23591a(byteBuffer, j, 2);
        return byteBuffer.getShort() & 65535;
    }

    /* renamed from: d */
    private String m23592d(ByteBuffer byteBuffer, long j) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j2 = 1 + j;
            short e = m23593e(byteBuffer, j);
            if (e == 0) {
                return sb.toString();
            }
            sb.append((char) e);
            j = j2;
        }
    }

    /* renamed from: a */
    private static long m23590a(C11516b bVar, long j, long j2) throws IOException {
        for (long j3 = 0; j3 < j; j3++) {
            C11517c a = bVar.mo22267a(j3);
            if (a.f30880a == 1 && a.f30882c <= j2 && j2 <= a.f30882c + a.f30883d) {
                return (j2 - a.f30882c) + a.f30881b;
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    /* renamed from: a */
    private void m23591a(ByteBuffer byteBuffer, long j, int i) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f30888b.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
}
