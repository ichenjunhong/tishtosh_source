package org.msgpack.template;

import java.io.IOException;
import org.msgpack.C53788b;
import org.msgpack.C53798c;
import org.msgpack.packer.Packer;
import org.msgpack.unpacker.Unpacker;

public class MessagePackableTemplate extends AbstractTemplate<C53788b> {
    private Class<?> targetClass;

    MessagePackableTemplate(Class<?> cls) {
        this.targetClass = cls;
    }

    public void write(Packer packer, C53788b bVar, boolean z) throws IOException {
        if (bVar != null) {
            return;
        }
        if (!z) {
            packer.writeNil();
            return;
        }
        throw new C53798c("Attempted to write null");
    }

    public C53788b read(Unpacker unpacker, C53788b bVar, boolean z) throws IOException {
        if (!z && unpacker.trySkipNil()) {
            return null;
        }
        if (bVar == null) {
            try {
                bVar = (C53788b) this.targetClass.newInstance();
            } catch (InstantiationException e) {
                throw new C53798c((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new C53798c((Throwable) e2);
            }
        }
        return bVar;
    }
}
