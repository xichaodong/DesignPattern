package com.tristeza.designpattern.strategypattern.processor.impl;

import com.tristeza.designpattern.strategypattern.processor.TransferProcessor;
import org.springframework.stereotype.Component;

/**
 * @author chaodong.xi
 * @date 2020/7/28 11:01 下午
 */
@Component
public class GuangdaBankTransferProcessor implements TransferProcessor {
    @Override
    public void doTransfer() {

    }

    @Override
    public String getCode() {
        return "GUANGDA";
    }
}
