package org.github.id.generator.baidu.consumer.service;

import javax.annotation.Resource;

import org.github.id.generator.baidu.fsg.uid.UidGenerator;
import org.springframework.stereotype.Service;

@Service
public class UidGenService {

    @Resource
    private UidGenerator uidGenerator;

    public long getUid() {
        return uidGenerator.getUID();
    }
}