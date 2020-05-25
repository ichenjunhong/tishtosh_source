package org.msgpack.unpacker;

import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.nio.ByteBuffer;
import org.msgpack.C53777a;
import org.msgpack.p2696b.C53794f;

public class MessagePackBufferUnpacker extends MessagePackUnpacker implements BufferUnpacker {
    public MessagePackBufferUnpacker(C53777a aVar) {
        this(aVar, UnReadVideoExperiment.LIKE_USER_LIST);
    }

    public MessagePackBufferUnpacker wrap(byte[] bArr) {
        return wrap(bArr, 0, bArr.length);
    }

    public MessagePackBufferUnpacker(C53777a aVar, int i) {
        super(aVar, new C53794f(i));
    }

    public MessagePackBufferUnpacker wrap(byte[] bArr, int i, int i2) {
        C53794f fVar = (C53794f) this.f133413in;
        if (fVar.f133400c >= 0) {
            ByteBuffer byteBuffer = (ByteBuffer) fVar.f133399b.getLast();
            fVar.f133399b.clear();
            byteBuffer.position(0);
            byteBuffer.limit(0);
            fVar.f133399b.addLast(byteBuffer);
            fVar.f133400c = byteBuffer.capacity();
        } else {
            fVar.f133399b.clear();
            fVar.f133400c = -1;
        }
        C53794f fVar2 = (C53794f) this.f133413in;
        if (fVar2.f133400c <= 0 || ((ByteBuffer) fVar2.f133399b.getLast()).remaining() != 0) {
            fVar2.f133399b.addLast(ByteBuffer.wrap(bArr, i, i2));
            fVar2.f133400c = -1;
        } else {
            fVar2.f133399b.add(fVar2.f133399b.size() - 1, ByteBuffer.wrap(bArr, i, i2));
        }
        return this;
    }
}
