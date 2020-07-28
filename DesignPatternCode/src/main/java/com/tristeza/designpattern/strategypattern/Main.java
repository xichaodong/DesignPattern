package com.tristeza.designpattern.strategypattern;

import com.tristeza.designpattern.strategypattern.processor.TransferProcessor;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

/**
 * @author chaodong.xi
 * @date 2020/7/28 10:58 下午
 */
@SpringBootTest
public class Main {
    @Resource
    private List<TransferProcessor> processors;

    @Test
    public void Test() {
        processors.forEach(transferProcessor -> {
                    if ("ZHAOSHANG".equals(transferProcessor.getCode())) {
                        transferProcessor.doTransfer();
                    }
                }
        );
    }
}
