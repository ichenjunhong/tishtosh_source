package org.eclipse.mat.parser.index;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import org.eclipse.mat.SnapshotException;
import org.eclipse.mat.collect.ArrayIntCompressed;
import org.eclipse.mat.collect.ArrayLongCompressed;
import org.eclipse.mat.collect.HashMapIntObject;
import org.eclipse.mat.collect.IteratorInt;
import org.eclipse.mat.collect.IteratorLong;
import org.eclipse.mat.parser.index.IIndexReader.IOne2LongIndex;
import org.eclipse.mat.parser.index.IIndexReader.IOne2ManyIndex;
import org.eclipse.mat.parser.index.IIndexReader.IOne2ManyObjectsIndex;
import org.eclipse.mat.parser.index.IIndexReader.IOne2OneIndex;
import org.eclipse.mat.parser.internal.Messages;
import org.eclipse.mat.parser.p2693io.SimpleBufferedRandomAccessInputStream;

public abstract class IndexReader {

    static class InboundReader extends IntIndex1NSortedReader implements IOne2ManyObjectsIndex {
        public InboundReader(File file) throws IOException {
            super(file);
        }

        public int[] getObjectsOf(Serializable serializable) throws SnapshotException, IOException {
            int[] next;
            if (serializable == null) {
                return new int[0];
            }
            int[] iArr = (int[]) serializable;
            synchronized (this) {
                next = this.body.getNext(iArr[0], iArr[1]);
            }
            return next;
        }

        public InboundReader(File file, IOne2OneIndex iOne2OneIndex, IOne2OneIndex iOne2OneIndex2) throws IOException {
            super(file, iOne2OneIndex, iOne2OneIndex2);
        }
    }

    static class IntIndex1NReader implements IOne2ManyIndex {
        IntIndexReader body;
        IntIndexReader header;

        /* renamed from: in */
        SimpleBufferedRandomAccessInputStream f133280in;
        File indexFile;

        public int size() {
            return this.header.size();
        }

        public void delete() {
            close();
            if (this.indexFile != null) {
                this.indexFile.delete();
            }
        }

        public void unload() throws IOException {
            this.header.unload();
            this.body.unload();
        }

        /* access modifiers changed from: protected */
        public synchronized void open() {
            try {
                if (this.f133280in == null) {
                    this.f133280in = new SimpleBufferedRandomAccessInputStream(new RandomAccessFile(this.indexFile, "r"));
                    if (this.header != null) {
                        this.header.f133281in = this.f133280in;
                    }
                    if (this.body != null) {
                        this.body.f133281in = this.f133280in;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0052, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void close() {
            /*
                r3 = this;
                monitor-enter(r3)
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r0 = r3.header     // Catch:{ all -> 0x0053 }
                r0.unload()     // Catch:{ all -> 0x0053 }
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r0 = r3.body     // Catch:{ all -> 0x0053 }
                r0.unload()     // Catch:{ all -> 0x0053 }
                org.eclipse.mat.parser.io.SimpleBufferedRandomAccessInputStream r0 = r3.f133280in     // Catch:{ all -> 0x0053 }
                if (r0 == 0) goto L_0x0051
                r0 = 0
                org.eclipse.mat.parser.io.SimpleBufferedRandomAccessInputStream r1 = r3.f133280in     // Catch:{ IOException -> 0x003d, all -> 0x0029 }
                r1.close()     // Catch:{ IOException -> 0x003d, all -> 0x0029 }
                r3.f133280in = r0     // Catch:{ all -> 0x0053 }
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r3.header     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x001f
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r3.header     // Catch:{ all -> 0x0053 }
                r1.f133281in = r0     // Catch:{ all -> 0x0053 }
            L_0x001f:
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r3.body     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0051
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r3.body     // Catch:{ all -> 0x0053 }
                r1.f133281in = r0     // Catch:{ all -> 0x0053 }
                monitor-exit(r3)
                return
            L_0x0029:
                r1 = move-exception
                r3.f133280in = r0     // Catch:{ all -> 0x0053 }
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r2 = r3.header     // Catch:{ all -> 0x0053 }
                if (r2 == 0) goto L_0x0034
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r2 = r3.header     // Catch:{ all -> 0x0053 }
                r2.f133281in = r0     // Catch:{ all -> 0x0053 }
            L_0x0034:
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r2 = r3.body     // Catch:{ all -> 0x0053 }
                if (r2 == 0) goto L_0x003c
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r2 = r3.body     // Catch:{ all -> 0x0053 }
                r2.f133281in = r0     // Catch:{ all -> 0x0053 }
            L_0x003c:
                throw r1     // Catch:{ all -> 0x0053 }
            L_0x003d:
                r3.f133280in = r0     // Catch:{ all -> 0x0053 }
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r3.header     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0047
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r3.header     // Catch:{ all -> 0x0053 }
                r1.f133281in = r0     // Catch:{ all -> 0x0053 }
            L_0x0047:
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r3.body     // Catch:{ all -> 0x0053 }
                if (r1 == 0) goto L_0x0051
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r3.body     // Catch:{ all -> 0x0053 }
                r1.f133281in = r0     // Catch:{ all -> 0x0053 }
                monitor-exit(r3)
                return
            L_0x0051:
                monitor-exit(r3)
                return
            L_0x0053:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.parser.index.IndexReader.IntIndex1NReader.close():void");
        }

        public int[] get(int i) {
            int i2 = this.header.get(i);
            return this.body.getNext(i2 + 1, this.body.get(i2));
        }

        public IntIndex1NReader(File file) throws IOException {
            try {
                this.indexFile = file;
                open();
                long length = file.length();
                this.f133280in.seek(length - 8);
                long readLong = this.f133280in.readLong();
                IntIndexReader intIndexReader = new IntIndexReader(this.f133280in, readLong, (length - readLong) - 8);
                this.header = intIndexReader;
                IntIndexReader intIndexReader2 = new IntIndexReader(this.f133280in, 0, readLong);
                this.body = intIndexReader2;
                this.body.LOCK = this.header.LOCK;
            } catch (RuntimeException e) {
                close();
                throw e;
            }
        }

        public IntIndex1NReader(File file, IOne2OneIndex iOne2OneIndex, IOne2OneIndex iOne2OneIndex2) {
            this.indexFile = file;
            this.header = (IntIndexReader) iOne2OneIndex;
            this.body = (IntIndexReader) iOne2OneIndex2;
            this.body.LOCK = this.header.LOCK;
            open();
        }
    }

    public static class IntIndex1NSortedReader extends IntIndex1NReader {
        public /* bridge */ /* synthetic */ void close() {
            super.close();
        }

        public /* bridge */ /* synthetic */ void delete() {
            super.delete();
        }

        public /* bridge */ /* synthetic */ void unload() throws IOException {
            super.unload();
        }

        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        public IntIndex1NSortedReader(File file) throws IOException {
            super(file);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
            if (r6[1] < r6[0]) goto L_0x004d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int[] get(int r6) {
            /*
                r5 = this;
                int r0 = r6 + 1
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r5.header
                int r1 = r1.size()
                r2 = 2
                r3 = 0
                r4 = 1
                if (r0 >= r1) goto L_0x0039
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r5.header
                int[] r6 = r1.getNext(r6, r2)
                r1 = r6[r3]
                if (r1 != 0) goto L_0x001a
                int[] r6 = new int[r3]
                return r6
            L_0x001a:
                int r0 = r0 + r4
                r1 = r6[r4]
                r2 = r6[r3]
                if (r1 >= r2) goto L_0x0032
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r5.header
                int r1 = r1.size()
                if (r0 >= r1) goto L_0x0032
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r5.header
                int r1 = r1.get(r0)
                r6[r4] = r1
                goto L_0x001a
            L_0x0032:
                r0 = r6[r4]
                r1 = r6[r3]
                if (r0 >= r1) goto L_0x0056
                goto L_0x004d
            L_0x0039:
                int[] r0 = new int[r2]
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r1 = r5.header
                int r6 = r1.get(r6)
                r0[r3] = r6
                r0[r4] = r3
                r6 = r0[r3]
                if (r6 != 0) goto L_0x004c
                int[] r6 = new int[r3]
                return r6
            L_0x004c:
                r6 = r0
            L_0x004d:
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r0 = r5.body
                int r0 = r0.size()
                int r0 = r0 + r4
                r6[r4] = r0
            L_0x0056:
                org.eclipse.mat.parser.index.IndexReader$IntIndexReader r0 = r5.body
                r1 = r6[r3]
                int r1 = r1 - r4
                r2 = r6[r4]
                r6 = r6[r3]
                int r2 = r2 - r6
                int[] r6 = r0.getNext(r1, r2)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: org.eclipse.mat.parser.index.IndexReader.IntIndex1NSortedReader.get(int):int[]");
        }

        public IntIndex1NSortedReader(File file, IOne2OneIndex iOne2OneIndex, IOne2OneIndex iOne2OneIndex2) throws IOException {
            super(file, iOne2OneIndex, iOne2OneIndex2);
        }
    }

    public static class IntIndexReader extends IntIndex<SoftReference<ArrayIntCompressed>> implements IOne2OneIndex {
        public Object LOCK;

        /* renamed from: in */
        public SimpleBufferedRandomAccessInputStream f133281in;
        File indexFile;
        long[] pageStart;

        public /* bridge */ /* synthetic */ void unload() {
            super.unload();
        }

        public /* bridge */ /* synthetic */ IteratorInt iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        public void delete() {
            close();
            if (this.indexFile != null) {
                this.indexFile.delete();
            }
        }

        public synchronized void close() {
            unload();
            if (this.f133281in != null) {
                try {
                    this.f133281in.close();
                } catch (IOException unused) {
                } finally {
                    this.f133281in = null;
                }
            }
        }

        private synchronized void open() {
            try {
                if (this.f133281in == null) {
                    if (this.indexFile != null) {
                        this.f133281in = new SimpleBufferedRandomAccessInputStream(new RandomAccessFile(this.indexFile, "r"));
                        return;
                    }
                    throw new IOException(Messages.IndexReader_Error_IndexIsEmbedded);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public /* bridge */ /* synthetic */ int get(int i) {
            return super.get(i);
        }

        public /* bridge */ /* synthetic */ int[] getAll(int[] iArr) {
            return super.getAll(iArr);
        }

        public IntIndexReader(File file) throws IOException {
            this(new SimpleBufferedRandomAccessInputStream(new RandomAccessFile(file, "r")), 0, file.length());
            this.indexFile = file;
        }

        /* access modifiers changed from: protected */
        public ArrayIntCompressed getPage(int i) {
            ArrayIntCompressed arrayIntCompressed;
            SoftReference softReference = (SoftReference) this.pages.get(i);
            ArrayIntCompressed arrayIntCompressed2 = null;
            if (softReference == null) {
                arrayIntCompressed = null;
            } else {
                arrayIntCompressed = (ArrayIntCompressed) softReference.get();
            }
            if (arrayIntCompressed == null) {
                synchronized (this.LOCK) {
                    SoftReference softReference2 = (SoftReference) this.pages.get(i);
                    if (softReference2 != null) {
                        arrayIntCompressed2 = (ArrayIntCompressed) softReference2.get();
                    }
                    if (arrayIntCompressed2 == null) {
                        try {
                            this.f133281in.seek(this.pageStart[i]);
                            byte[] bArr = new byte[((int) (this.pageStart[i + 1] - this.pageStart[i]))];
                            if (this.f133281in.read(bArr) == bArr.length) {
                                arrayIntCompressed2 = new ArrayIntCompressed(bArr);
                                synchronized (this.pages) {
                                    this.pages.put(i, new SoftReference(arrayIntCompressed2));
                                }
                            } else {
                                throw new IOException();
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    arrayIntCompressed = arrayIntCompressed2;
                }
            }
            return arrayIntCompressed;
        }

        public /* bridge */ /* synthetic */ void set(int i, int i2) {
            super.set(i, i2);
        }

        public /* bridge */ /* synthetic */ int[] getNext(int i, int i2) {
            return super.getNext(i, i2);
        }

        public IntIndexReader(SimpleBufferedRandomAccessInputStream simpleBufferedRandomAccessInputStream, long j, long j2) throws IOException {
            int i;
            this.LOCK = new Object();
            this.f133281in = simpleBufferedRandomAccessInputStream;
            long j3 = (j + j2) - 8;
            this.f133281in.seek(j3);
            int readInt = this.f133281in.readInt();
            int readInt2 = this.f133281in.readInt();
            init(readInt2, readInt);
            int i2 = readInt2 / readInt;
            if (readInt2 % readInt > 0) {
                i = 2;
            } else {
                i = 1;
            }
            this.pageStart = new long[(i2 + i)];
            this.f133281in.seek(j3 - ((long) (this.pageStart.length * 8)));
            this.f133281in.readLongArray(this.pageStart);
        }

        public IntIndexReader(File file, Pages<SoftReference<ArrayIntCompressed>> pages, int i, int i2, long[] jArr) {
            this.LOCK = new Object();
            this.size = i;
            this.pageSize = i2;
            this.pages = pages;
            this.indexFile = file;
            this.pageStart = jArr;
            if (file != null) {
                open();
            }
        }
    }

    public static class LongIndex1NReader implements IIndexReader {
        LongIndexReader body;
        IntIndexReader header;

        /* renamed from: in */
        SimpleBufferedRandomAccessInputStream f133282in;
        File indexFile;

        public int size() {
            return this.header.size();
        }

        public void delete() {
            close();
            if (this.indexFile != null) {
                this.indexFile.delete();
            }
        }

        public void unload() {
            this.header.unload();
            this.body.unload();
        }

        public synchronized void close() {
            unload();
            if (this.f133282in != null) {
                try {
                    this.f133282in.close();
                } catch (IOException unused) {
                } finally {
                    IntIndexReader intIndexReader = this.header;
                    this.body.f133283in = null;
                    intIndexReader.f133281in = null;
                    this.f133282in = null;
                }
            }
        }

        /* access modifiers changed from: protected */
        public synchronized void open() {
            try {
                if (this.f133282in == null) {
                    this.f133282in = new SimpleBufferedRandomAccessInputStream(new RandomAccessFile(this.indexFile, "r"));
                    if (this.header != null) {
                        this.header.f133281in = this.f133282in;
                    }
                    if (this.body != null) {
                        this.body.f133283in = this.f133282in;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public long[] get(int i) {
            int i2 = this.header.get(i);
            if (i2 == 0) {
                return new long[0];
            }
            return this.body.getNext(i2, (int) this.body.get(i2 - 1));
        }

        public LongIndex1NReader(File file) throws IOException {
            this.indexFile = file;
            open();
            long length = file.length();
            this.f133282in.seek(length - 8);
            long readLong = this.f133282in.readLong();
            IntIndexReader intIndexReader = new IntIndexReader(this.f133282in, readLong, (length - readLong) - 8);
            this.header = intIndexReader;
            LongIndexReader longIndexReader = new LongIndexReader(this.f133282in, 0, readLong);
            this.body = longIndexReader;
        }
    }

    public static class LongIndexReader extends LongIndex implements IOne2LongIndex {
        Object LOCK = this.header.LOCK;

        /* renamed from: in */
        SimpleBufferedRandomAccessInputStream f133283in;
        File indexFile;
        long[] pageStart;

        public /* bridge */ /* synthetic */ void unload() {
            super.unload();
        }

        public /* bridge */ /* synthetic */ IteratorLong iterator() {
            return super.iterator();
        }

        public /* bridge */ /* synthetic */ int size() {
            return super.size();
        }

        public void delete() {
            close();
            if (this.indexFile != null) {
                this.indexFile.delete();
            }
        }

        public synchronized void close() {
            unload();
            if (this.f133283in != null) {
                try {
                    this.f133283in.close();
                } catch (IOException unused) {
                } finally {
                    this.f133283in = null;
                }
            }
        }

        private synchronized void open() throws IOException {
            if (this.f133283in == null) {
                if (this.indexFile != null) {
                    this.f133283in = new SimpleBufferedRandomAccessInputStream(new RandomAccessFile(this.indexFile, "r"));
                    return;
                }
                throw new IOException(Messages.IndexReader_Error_IndexIsEmbedded);
            }
        }

        public /* bridge */ /* synthetic */ long get(int i) {
            return super.get(i);
        }

        public /* bridge */ /* synthetic */ int reverse(long j) {
            return super.reverse(j);
        }

        public LongIndexReader(File file) throws IOException {
            this(new SimpleBufferedRandomAccessInputStream(new RandomAccessFile(file, "r")), 0, file.length());
            this.indexFile = file;
            open();
        }

        /* access modifiers changed from: protected */
        public ArrayLongCompressed getPage(int i) {
            ArrayLongCompressed arrayLongCompressed;
            SoftReference softReference = (SoftReference) this.pages.get(i);
            ArrayLongCompressed arrayLongCompressed2 = null;
            if (softReference == null) {
                arrayLongCompressed = null;
            } else {
                arrayLongCompressed = (ArrayLongCompressed) softReference.get();
            }
            if (arrayLongCompressed == null) {
                synchronized (this.LOCK) {
                    SoftReference softReference2 = (SoftReference) this.pages.get(i);
                    if (softReference2 != null) {
                        arrayLongCompressed2 = (ArrayLongCompressed) softReference2.get();
                    }
                    if (arrayLongCompressed2 == null) {
                        try {
                            this.f133283in.seek(this.pageStart[i]);
                            byte[] bArr = new byte[((int) (this.pageStart[i + 1] - this.pageStart[i]))];
                            if (this.f133283in.read(bArr) == bArr.length) {
                                arrayLongCompressed2 = new ArrayLongCompressed(bArr);
                                synchronized (this.pages) {
                                    this.pages.put(i, new SoftReference(arrayLongCompressed2));
                                }
                            } else {
                                throw new IOException();
                            }
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    arrayLongCompressed = arrayLongCompressed2;
                }
            }
            return arrayLongCompressed;
        }

        public /* bridge */ /* synthetic */ void set(int i, long j) {
            super.set(i, j);
        }

        public /* bridge */ /* synthetic */ long[] getNext(int i, int i2) {
            return super.getNext(i, i2);
        }

        protected LongIndexReader(SimpleBufferedRandomAccessInputStream simpleBufferedRandomAccessInputStream, long j, long j2) throws IOException {
            int i;
            this.LOCK = new Object();
            this.f133283in = simpleBufferedRandomAccessInputStream;
            long j3 = (j + j2) - 8;
            this.f133283in.seek(j3);
            int readInt = this.f133283in.readInt();
            int readInt2 = this.f133283in.readInt();
            init(readInt2, readInt);
            int i2 = readInt2 / readInt;
            if (readInt2 % readInt > 0) {
                i = 2;
            } else {
                i = 1;
            }
            this.pageStart = new long[(i2 + i)];
            this.f133283in.seek(j3 - ((long) (this.pageStart.length * 8)));
            this.f133283in.readLongArray(this.pageStart);
        }

        public LongIndexReader(File file, HashMapIntObject<Object> hashMapIntObject, int i, int i2, long[] jArr) throws IOException {
            this.LOCK = new Object();
            this.size = i;
            this.pageSize = i2;
            this.pages = hashMapIntObject;
            this.indexFile = file;
            this.pageStart = jArr;
            open();
        }
    }
}
