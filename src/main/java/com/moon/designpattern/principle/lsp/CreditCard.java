package com.moon.designpattern.principle.lsp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author Chanmoey
 * @date 2023年03月04日
 */
public class CreditCard extends CashCard{

    private Logger logger = LoggerFactory.getLogger(CreditCard.class);

    public CreditCard(String cardNo, String cardDate) {
        super(cardNo, cardDate);
    }

    boolean rule2(BigDecimal amount) {
        return amount.compareTo(new BigDecimal(1000)) <= 0;
    }

    public String loan(String orderId, BigDecimal amount) {
        boolean rule = rule2(amount);
        if (!rule) {
            logger.info("生成贷款单失败，金额超限。单号：{} 金额：{}", orderId, amount);
            return "0001";
        }
        // 模拟生成贷款单
        logger.info("生成贷款单，单号：{} 金额：{}", orderId, amount);
        // 模拟支付成功
        logger.info("贷款成功，单号：{} 金额：{}", orderId, amount);
        return super.negative(orderId, amount);

    }

    public String repayment(String orderId, BigDecimal amount) {
        // 模拟生成还款单
        logger.info("生成还款单，单号：{} 金额：{}", orderId, amount);
        // 模拟还款成功
        logger.info("还款成功，单号：{} 金额：{}", orderId, amount);
        return super.positive(orderId, amount);
    }
}
